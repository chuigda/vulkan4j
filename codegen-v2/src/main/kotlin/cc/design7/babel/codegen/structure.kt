package cc.design7.babel.codegen

import cc.design7.babel.codegen.accessor.*
import cc.design7.babel.ctype.*
import cc.design7.babel.ctype.lowerType
import cc.design7.babel.registry.RegistryBase
import cc.design7.babel.registry.Structure
import cc.design7.babel.util.Doc
import cc.design7.babel.util.DocList
import cc.design7.babel.util.buildDoc
import org.intellij.lang.annotations.Language

/**
 * @param name the name of the layout, such as "pNext"
 */
sealed class LayoutField(
    val jType: String,
    val name: String,
    val value: String,
) {
    val layoutName: String = "LAYOUT$$name"
    val sizeName: String = "SIZE$$name"
    val offsetName: String = "OFFSET$$name"
    abstract val pathName: String

    class Typed(jType: String, name: String, value: String, val type: CType) :
        LayoutField(jType, name, value) {
        override val pathName: String = "PATH$$name"
        val rawName = "${name}Raw"
    }

    /**
     * The [name] is guaranteed to be `[bitfields.first().bitfieldName]_[bitfields.last().bitfieldName]`
     */
    class Bitfields(jType: String, name: String, value: String, val bitfields: List<Bitfield>, val length: Int) :
        LayoutField(jType, name, value) {
        val bitfieldName: String = "bitfield$$name"
        override val pathName: String = "PATH$$bitfieldName"
    }

    data class Bitfield(val bitfieldName: String, val offset: Int) {
        val bitfieldOffsetName: String = "OFFSET$$bitfieldName"
    }
}

private fun DocList.imports(@Language("Java", prefix = "import ", suffix = ";") path: String, static: Boolean = false) {
    +"import ${if (static) "static " else ""}$path;"
}

private fun DocList.constant(type: String, name: String, value: String) {
    +"public static final $type $name = $value;"
}

fun generateStructure(
    registryBase: RegistryBase,
    structure: Structure,
    isUnion: Boolean,
    codegenOptions: CodegenOptions,
): Doc = buildDoc {
    val packageName = codegenOptions.packageName
    val className = structure.name.toString()
    val layouts = mutableListOf<LayoutField>()

    lowerMemberTypes(
        registryBase,
        codegenOptions,
        structure,
        layouts,
    )

    /// region import
    +"package ${codegenOptions.packageName}.datatype;"
    +""
    imports("java.lang.foreign.*")
    imports("java.lang.foreign.ValueLayout.*", true)
    +""
    imports("org.jetbrains.annotations.Nullable")
    imports("org.jetbrains.annotations.NotNull")
    imports("cc.design7.ffm.IPointer")
    imports("cc.design7.ffm.NativeLayout")
    if (layouts.any { it is LayoutField.Bitfields }) {
        imports("cc.design7.ffm.bits.BitfieldUtil")
    }
    imports("cc.design7.ffm.annotation.*")
    imports("cc.design7.ffm.ptr.*")

    if (registryBase.bitmasks.isNotEmpty()) {
        imports("$packageName.bitmask.*")
    }

    if (registryBase.structures.isNotEmpty()) {
        imports("$packageName.datatype.*")
    }

    if (registryBase.enumerations.isNotEmpty()) {
        imports("$packageName.enumtype.*")
    }

    if (registryBase.constants.isNotEmpty()) {
        imports("$packageName.${codegenOptions.constantClassName}.*", true)
    }

    for (extra in codegenOptions.extraImport) {
        imports(extra)
    }

    +""

    // TODO: generate document
    val seeLink = codegenOptions.seeLinkProvider(structure)
    if (seeLink != null) {
        +"/// @see $seeLink"
    }
    +"@ValueBasedCandidate"
    +"public record $className(@NotNull MemorySegment segment) implements IPointer {"

    indent {
        // layouts
        layouts.forEach { layout ->
            constant(layout.jType, layout.layoutName, layout.value)
        }

        +""

        constant("MemoryLayout", "LAYOUT", generateStructureLayout(layouts, isUnion))
        constant("long", "SIZE", "LAYOUT.byteSize()")

        +""

        fn("public static", className, "allocate", "Arena arena") {
            +"return new $className(arena.allocate(LAYOUT));"
        }

        +""

        fn("public static", "$className[]", "allocate", "Arena arena", "int count") {
            +"MemorySegment segment = arena.allocate(LAYOUT, count);"
            +"$className[] ret = new $className[count];"
            "for (int i = 0; i < count; i ++)" {
                +"ret[i] = new $className(segment.asSlice(i * SIZE, SIZE));"
            }

            +"return ret;"
        }

        +""

        fn("public static", className, "clone", "Arena arena", "$className src") {
            +"$className ret = allocate(arena);"
            +"ret.segment.copyFrom(src.segment);"
            +"return ret;"
        }

        +""

        fn("public static", "$className[]", "clone", "Arena arena", "$className[] src") {
            +"$className[] ret = allocate(arena, src.length);"
            "for (int i = 0; i < src.length; i ++)" {
                +"ret[i].segment.copyFrom(src[i].segment);"
            }
            +"return ret;"
        }

        +""

        // PathElement
        layouts.forEach { layout ->
            constant("PathElement", layout.pathName, "PathElement.groupElement(\"${layout.pathName}\")")
        }

        +""

        // size
        layouts.forEach { layout ->
            if (layout is LayoutField.Typed) {
                val value = if (layout.type is CPlatformDependentIntType) {
                    if (layout.type.cType == "size_t") "NativeLayout.C_SIZE_T.byteSize()"
                    else "NativeLayout.C_INT.byteSize()"
                } else "${layout.layoutName}.byteSize()"

                constant("long", layout.sizeName, value)
            }
        }

        +""

        // offset
        layouts.forEach { layout ->
            constant("long", layout.offsetName, "LAYOUT.byteOffset(${layout.pathName})")

//            if (layout is LayoutField.Bitfields) {
//                layout.bitfields.forEach { bitfield ->
//                    constant("long", bitfield.bitfieldOffsetName, bitfield.offset.toString())
//                }
//            }
        }

        +""

        layouts.forEach {
            when (it) {
                is LayoutField.Bitfields -> +generateBitfieldAccessor(it)
                is LayoutField.Typed -> +generateMemberAccessor(it)
            }

            +""
        }
    }

    +"}"
    /// endregion import
}

// '1' means all
private fun generateStructureLayout(layouts: List<LayoutField>, isUnion: Boolean): String {
    return buildString {
        val ctor = if (isUnion) "NativeLayout.unionLayout" else "NativeLayout.structLayout"
        append(ctor)
        layouts.joinTo(this, prefix = "(", postfix = ")") { it.layoutName }
    }
}

private fun lowerMemberTypes(
    registry: RegistryBase,
    codegenOptions: CodegenOptions,
    structure: Structure,
    layouts: MutableList<LayoutField>,
) {
    var i = 0
    while (i < structure.members.size) {
        val current = structure.members[i]
        val cType = lowerType(registry, codegenOptions.refRegistries, current.type)
        if (current.bits != null) {
            val storageUnitBits = (cType as CFixedSizeType).byteSize * 8
            var storageUnitBegin = i
            var alreadyStoredBits: Int = current.bits
            i += 1

            var storageUnitCounter = 0

            while (true) {
                if (i >= structure.members.size) {
                    break
                }

                val field = structure.members[i]
                if (field.bits == null) {
                    break
                }

                if (field.type != current.type) {
                    val fieldTypeLowered = lowerType(
                        registry,
                        codegenOptions.refRegistries,
                        field.type
                    )

                    if ((fieldTypeLowered as CFixedSizeType).byteSize != cType.byteSize) {
                        // Quit the loop, summarize the last storage unit. The new bitfield
                        // would be handled in the next iteration of the outer loop
                        break
                    }
                }

                if (field.bits > storageUnitBits) {
                    error("Field ${field.name} exceeds storage unit size ($storageUnitBits)")
                }

                if (alreadyStoredBits + field.bits > storageUnitBits) {
                    // summarize previous bit fields
                    val storageUnitEnd = i - 1
                    summarizeBitfieldStorageUnit(
                        structure,
                        cType,
                        storageUnitBegin,
                        storageUnitEnd,
                        layouts
                    )

                    // begin a new storage unit
                    storageUnitBegin = i
                    alreadyStoredBits = 0
                    storageUnitCounter += 1
                }

                alreadyStoredBits += field.bits
                i += 1
            }

            // summarize the last storage unit
            val storageUnitEnd = i - 1
            summarizeBitfieldStorageUnit(
                structure,
                cType,
                storageUnitBegin,
                storageUnitEnd,
                layouts
            )
        } else {
            val layout = "${cType.jLayout}.withName(\"${current.name}\")"

            val layoutTypes = if (cType is CPlatformDependentIntType) {
                // A layout field is still required to be generated, because it will be used in the
                // structure's layout calculation. We won't be using it for accessing the field,
                // of course
                "ValueLayout"
            } else {
                cType.jLayoutType
            }

            layouts.add(LayoutField.Typed(layoutTypes, current.name.toString(), layout, cType))

            i += 1
        }
    }
}

private fun summarizeBitfieldStorageUnit(
    structure: Structure,
    storageUnitType: CType,
    storageUnitBegin: Int,
    storageUnitEnd: Int,
    layouts: MutableList<LayoutField>,
) {
    val storageUnitBeginMemberName = structure.members[storageUnitBegin].name.value
    val storageUnitEndMemberName = structure.members[storageUnitEnd].name.value

    val storageUnitName = "${storageUnitBeginMemberName}_${storageUnitEndMemberName}"
    val layout = "${storageUnitType.jLayout}.withName(\"bitfield$$storageUnitName\")"

    val bitfields = mutableListOf<LayoutField.Bitfield>()
    var bitfieldOffset = 0
    for (i in storageUnitBegin..storageUnitEnd) {
        // Let's hack this shit in 10 minutes, not introducing something else for bitfield offset
        val member = structure.members[i]
        bitfields.add(LayoutField.Bitfield(member.name.toString(), bitfieldOffset))
        bitfieldOffset += member.bits!!
    }

    layouts.add(
        LayoutField.Bitfields(
            storageUnitType.jLayoutType, storageUnitName, layout,
            bitfields, bitfieldOffset
        )
    )
}

private fun generateMemberAccessor(layout: LayoutField.Typed): Doc {
    return when (val cType = layout.type) {
        is CArrayType -> generateArrayAccessor(cType, layout)
        is CHandleType -> generateHandleAccessor(cType, layout)
        is CNonRefType -> generateNonRefAccessor(cType, layout)
        is CPointerType -> generatePtrAccessor(cType, layout)
        is CStructType -> generateStructureTypeAccessor(cType, layout)
        is CVoidType -> throw Exception("void type not allowed in struct")
    }
}
