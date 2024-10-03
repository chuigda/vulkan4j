package codegen

import Member
import Registry
import Structure
import appendLn
import codegen.accessor.*

fun generateStructure(
    registry: Registry,
    packageName: String,
    structure: Structure,
    importExtra: List<String> = emptyList(),
    docLinkGenerator: ((String) -> String)? = null
): String {
    val (layout, memberTypesLowered) = generateLayout(registry, structure)
    val verbatim = structure.verbatim.joinToString("\n") { "///     $it" }

    return buildString {
        appendLn("""
            package $packageName.datatype;
    
            import java.lang.foreign.*;
            import static java.lang.foreign.ValueLayout.*;
    
            import tech.icey.panama.IPointer;
            import tech.icey.panama.NativeLayout;
            import tech.icey.panama.annotation.*;
            import tech.icey.panama.buffer.*;
        """.trimIndent())

        if (registry.structs.isNotEmpty()) {
            appendLn("import $packageName.datatype.*;")
        }

        if (registry.handles.isNotEmpty()) {
            appendLn("import $packageName.handle.*;")
        }

        if (registry.constants.isNotEmpty()) {
            appendLn("import static $packageName.${registry.constantClassName}.*;")
        }

        for (extra in importExtra) {
            appendLn("import $extra;")
        }

        appendLn()

        if (verbatim.isNotEmpty()) {
            appendLn("/// @snippet lang=c :")
            appendLn("/// typedef ${if (structure.isUnion) "union" else "struct"} ${structure.name} {")
            append(verbatim)
            appendLn("/// } ${structure.name};")
        }

        if (verbatim.isNotEmpty() && docLinkGenerator != null) {
            appendLn("///")
        }

        if (docLinkGenerator != null) {
            appendLn("/// @see ${docLinkGenerator(structure.name)}")
        }

        appendLn("public record ${structure.name}(MemorySegment segment) implements IPointer {")
        for (i in structure.members.indices) {
            val current = structure.members[i]
            if (structure.members[i].bits == 24) {
                val next = structure.members[i + 1]
                appendLn(indent(generateBitfieldAccessor(current, next), 1))
                appendLn()
            }
            else if (structure.members[i].bits == 8) {
                continue
            }
            else {
                val currentType = memberTypesLowered[i]!!
                appendLn(indent(generateMemberAccessor(current, currentType), 1))
                appendLn()
            }
        }

        appendLn(indent("""
            public static ${structure.name} allocate(Arena arena) {
                return new ${structure.name}(arena.allocate(LAYOUT));
            }
            
            public static ${structure.name}[] allocate(Arena arena, int count) {
                MemorySegment segment = arena.allocate(LAYOUT, count);
                ${structure.name}[] ret = new ${structure.name}[count];
                for (int i = 0; i < count; i++) {
                    array[i] = new ${structure.name}(segment.asSlice(i * SIZE, SIZE));
                }
                return ret;
            }

            public static ${structure.name} clone(Arena arena, ${structure.name} src) {
                ${structure.name} ret = allocate(arena);
                ret.segment.copyFrom(src.segment);
                return ret;
            }
            
            public static ${structure.name}[] clone(Arena arena, ${structure.name}[] src) {
                ${structure.name}[] ret = allocate(arena, src.length);
                for (int i = 0; i < src.length; i++) {
                    ret[i].segment.copyFrom(src[i].segment);
                }
                return ret;
            }
        """.trimIndent(), 1))
        appendLn()

        appendLn(indent("public static final MemoryLayout LAYOUT = ${layout};", 1))
        appendLn(indent("public static final long SIZE = LAYOUT.byteSize();", 1))
        appendLn()

        for (i in structure.members.indices) {
            val current = structure.members[i]
            if (structure.members[i].bits == 24) {
                val next = structure.members[i + 1]
                val bitfieldName = "${current.name}_${next.name}"
                appendLn(indent("""public static final PathElement PATH$$bitfieldName = PathElement.groupElement("bitfield$$bitfieldName");""", 1))
            }
            else if (structure.members[i].bits == 8) {
                continue
            }
            else {
                appendLn(indent("""public static final PathElement PATH$${current.name} = PathElement.groupElement("${current.name}");""", 1))
            }
        }
        appendLn()

        for (i in structure.members.indices) {
            val current = structure.members[i]
            if (structure.members[i].bits == 24) {
                val next = structure.members[i + 1]
                val bitfieldName = "${current.name}_${next.name}"
                appendLn(indent("""public static final OfInt LAYOUT$$bitfieldName = (OfInt) LAYOUT.select(PATH$$bitfieldName);""", 1))
            }
            else if (structure.members[i].bits == 8) {
                continue
            }
            else {
                val cType = memberTypesLowered[i]!!
                if (cType is CPlatformDependentIntType) {
                    continue
                }

                appendLn(indent("""public static final ${cType.jLayoutType} LAYOUT${current.name} = (${cType.jLayoutType}) LAYOUT.select(PATH$${current.name});""", 1))
            }
        }
        appendLn()

        for (i in structure.members.indices) {
            val current = structure.members[i]
            if (structure.members[i].bits == 24) {
                val next = structure.members[i + 1]
                val bitfieldName = "${current.name}_${next.name}"
                appendLn(indent("""public static final long OFFSET$$bitfieldName = LAYOUT.byteOffset(PATH$$bitfieldName);""", 1))
            }
            else if (structure.members[i].bits == 8) {
                continue
            }
            else {
                appendLn(indent("""public static final long OFFSET$${current.name} = LAYOUT.byteOffset(PATH$${current.name});""", 1))
            }
        }
        appendLn()

        for (i in structure.members.indices) {
            val current = structure.members[i]
            if (current.bits != null) {
                continue
            }

            appendLn(indent("""public static final SIZE$${current.name} = LAYOUT$${current.name}.byteSize();""", 1))
        }

        appendLn("}")
        appendLn()
    }
}

private fun generateLayout(registry: Registry, structure: Structure): Pair<String, List<CType?>> {
    val memberTypesLowered = mutableListOf<CType?>()
    val fieldLayouts = mutableListOf<String>()

    var i = 0
    while (i < structure.members.size) {
        val current = structure.members[i]
        if (current.bits != null) {
            val next = structure.members[i + 1]
            if (next.bits == null || current.bits != 24 || next.bits != 8) {
                throw Exception("bitfields must have the 24:8 pattern")
            }

            fieldLayouts.add("""ValueLayout.JAVA_INT.withName("bitfield$${current.name}_${next.name}")""")
            memberTypesLowered.add(null)
            memberTypesLowered.add(null)
            i += 2
        }
        else {
            val cType = lowerType(registry, current.type)
            memberTypesLowered.add(cType)
            fieldLayouts.add("""${cType.jLayout}.withName("${current.name}")""")
            i += 1
        }
    }

    val layoutCtor = if (structure.isUnion) "NativeLayout.unionLayout" else "NativeLayout.structLayout"

    return Pair(
        buildString {
            appendLn("$layoutCtor(")
            for (idx in fieldLayouts.indices) {
                append("    ${fieldLayouts[idx]}")
                if (idx != fieldLayouts.size - 1) {
                    appendLn(",")
                }
                else {
                    appendLn()
                }
            }
            append(")")
        },
        memberTypesLowered
    )
}

private fun generateMemberAccessor(member: Member, cType: CType): String = when(cType) {
    is CArrayType -> generateArrayAccessor(cType, member)
    is CHandleType -> generateHandleAccessor(cType, member)
    is CNonRefType -> generateNonRefAccessor(cType, member)
    is CPointerType -> generatePtrAccessor(cType, member)
    is CStructType -> generateStructureTypeAccessor(cType, member)
    is CVoidType -> throw Exception("void type not allowed in struct")
}
