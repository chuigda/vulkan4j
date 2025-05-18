package club.doki7.babel.codegen

import club.doki7.babel.codegen.accessor.*
import club.doki7.babel.ctype.*
import club.doki7.babel.ctype.lowerType
import club.doki7.babel.registry.ArrayType
import club.doki7.babel.registry.IdentifierType
import club.doki7.babel.registry.PointerType
import club.doki7.babel.registry.RegistryBase
import club.doki7.babel.registry.Structure
import club.doki7.babel.registry.Type
import club.doki7.babel.util.Doc
import club.doki7.babel.util.buildDoc

/**
 * @param name the name of the layout, such as "pNext"
 */
sealed class LayoutField(
    val jType: String?,
    val name: String,
    val value: String,
) {
    val layoutName: String = "LAYOUT$$name"
    val sizeName: String = "SIZE$$name"
    val offsetName: String = "OFFSET$$name"
    abstract val pathName: String

    class Typed(jType: String?, name: String, value: String, val type: CType) :
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

fun generateStructure(
    registryBase: RegistryBase,
    structure: Structure,
    isUnion: Boolean,
    codegenOptions: CodegenOptions,
): Doc = buildDoc {
    val packageName = codegenOptions.packageName
    val className = structure.name.toString()
    val originalTypeName = structure.name.original
    val layouts = mutableListOf<LayoutField>()

    lowerMemberTypes(
        registryBase,
        codegenOptions,
        structure,
        layouts,
    )

    /// region import
    +"package $packageName.datatype;"
    +""
    imports("java.lang.foreign.*")
    imports("java.lang.foreign.ValueLayout.*", true)
    +""
    imports("org.jetbrains.annotations.Nullable")
    imports("org.jetbrains.annotations.NotNull")
    imports("club.doki7.ffm.IPointer")
    imports("club.doki7.ffm.NativeLayout")
    if (layouts.any { it is LayoutField.Bitfields }) {
        imports("club.doki7.ffm.bits.BitfieldUtil")
    }
    imports("club.doki7.ffm.annotation.*")
    imports("club.doki7.ffm.ptr.*")

    if (registryBase.bitmasks.isNotEmpty()) {
        imports("$packageName.bitmask.*")
    }

    if (registryBase.opaqueHandleTypedefs.isNotEmpty()) {
        imports("$packageName.handle.*")
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
    /// endregion import

    val seeLink = codegenOptions.seeLinkProvider(structure)

    if (seeLink != null) {
        +"/// Represents a pointer to a $seeLink structure in native memory."
    } else {
        +"/// Represents a pointer to a {@code $originalTypeName} structure in native memory."
    }
    +"///"

    +"/// ## Structure"
    +"///"
    +"/// {@snippet lang=c :"
    +"/// typedef struct $originalTypeName {"
    structure.members.forEachIndexed { idx, it ->
        val fieldLink = " @link substring=\"${it.name}\" target=\"#${it.name}\""

        if (it.bits != null) {
            if (it.name.original.startsWith("reserved")) {
                +"///     ${it.type.cDisplay} ${it.name} : ${it.bits};"
            } else {
                +"///     ${it.type.cDisplay} ${it.name} : ${it.bits}; //$fieldLink"
            }
        } else {
            val maybeOptionalComment = if (it.optional) " // optional" else ""

            val cType = (layouts[idx] as LayoutField.Typed).type
            val fieldTypeSubstring = tryFindRootNonPlainType(cType)
            val fieldTypeTarget = tryFindIdentifierType(it.type)
            val maybeTypeLink = if (fieldTypeSubstring != null && fieldTypeTarget != null) {
                " @link substring=\"$fieldTypeSubstring\" target=\"${fieldTypeTarget}\""
            } else {
                ""
            }
            +"///     ${it.type.cDisplay} ${it.name};$maybeOptionalComment //$maybeTypeLink$fieldLink"
        }
    }
    +"/// } $originalTypeName;"
    +"/// }"
    +"///"

    val autoInitMembers = structure.members.filter { it.values != null && it.type is IdentifierType }
    if (autoInitMembers.isNotEmpty()) {
        +"/// ## Auto initialization"
        +"/// This structure has the following members that can be automatically initialized:"
        autoInitMembers.forEach {
            +"/// - `${it.name} = ${it.values!!.original}`"
        }
        +"///"
        +"/// The {@link $className#allocate} functions will automatically initialize these fields."
        +"/// Also, you may call {@link $className#autoInit} to initialize these fields manually for"
        +"/// non-allocated instances."
        +"///"
    }

    +"/// ## Contracts"
    +"///"
    +"/// The property {@link #segment()} should always be not-null"
    +"/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)"
    +"/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java"
    +"/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details."
    +"///"
    +"/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not"
    +"/// perform any runtime check. The constructor can be useful for automatic code generators."

    if (seeLink != null) {
        +"///"
        +"/// @see $seeLink"
    }

    +"@ValueBasedCandidate"
    +"@UnsafeConstructor"
    +"public record $className(@NotNull MemorySegment segment) implements IPointer {"

    indent {
        defun("public static", className, "allocate", "Arena arena") {
            +"$className ret = new $className(arena.allocate(LAYOUT));"
            if (autoInitMembers.isNotEmpty()) {
                if (autoInitMembers.size == 1) {
                    val it = autoInitMembers.first()
                    +"ret.${it.name}(${(it.type as IdentifierType).ident}.${it.values});"
                } else {
                    +"ret.autoInit();"
                }
            }
            +"return ret;"
        }
        +""

        defun("public static", "$className[]", "allocate", "Arena arena", "int count") {
            +"MemorySegment segment = arena.allocate(LAYOUT, count);"
            +"$className[] ret = new $className[count];"
            "for (int i = 0; i < count; i ++)" {
                +"ret[i] = new $className(segment.asSlice(i * BYTES, BYTES));"
                if (autoInitMembers.isNotEmpty()) {
                    if (autoInitMembers.size == 1) {
                        val it = autoInitMembers.first()
                        +"ret[i].${it.name}(${(it.type as IdentifierType).ident}.${it.values});"
                    } else {
                        +"ret[i].autoInit();"
                    }
                }
            }

            +"return ret;"
        }
        +""

        defun("public static", className, "clone", "Arena arena", "$className src") {
            +"$className ret = allocate(arena);"
            +"ret.segment.copyFrom(src.segment);"
            +"return ret;"
        }
        +""

        defun("public static", "$className[]", "clone", "Arena arena", "$className[] src") {
            +"$className[] ret = allocate(arena, src.length);"
            "for (int i = 0; i < src.length; i ++)" {
                +"ret[i].segment.copyFrom(src[i].segment);"
            }
            +"return ret;"
        }
        +""

        if (autoInitMembers.isNotEmpty()) {
            +"public void autoInit() {"
            indent {
                autoInitMembers.forEach {
                    +"${it.name}(${(it.type as IdentifierType).ident}.${it.values});"
                }
            }
            +"}"
            +""
        }

        layouts.forEach {
            when (it) {
                is LayoutField.Bitfields -> +generateBitfieldAccessor(it)
                is LayoutField.Typed -> +generateMemberAccessor(it)
            }
            +""
        }

        // layout of the whole structure (or union)
        val layoutType = if (isUnion) "UnionLayout" else "StructLayout"
        val layoutCtor = if (isUnion) "NativeLayout.unionLayout" else "NativeLayout.structLayout"

        if (layouts.isEmpty()) {
            +"public static final $layoutType LAYOUT = $layoutCtor();"
        } else {
            +"public static final $layoutType LAYOUT = $layoutCtor("
            indent {
                layouts.forEachIndexed { idx, layout ->
                    if (idx == layouts.size - 1) {
                        +layout.value
                    } else {
                        +"${layout.value},"
                    }
                }
            }
            +");"
        }
        defConst("long", "BYTES", "LAYOUT.byteSize()")
        +""

        // `PathElement`s
        layouts.forEach { layout ->
            defConst("PathElement", layout.pathName, "PathElement.groupElement(\"${layout.pathName}\")")
        }

        +""

        // separate layouts
        layouts.forEach { layout ->
            if (layout.jType != null) {
                defConst(layout.jType, layout.layoutName, "(${layout.jType}) LAYOUT.select(${layout.pathName})")
            }
        }

        +""

        // size
        layouts.forEach { layout ->
            if (layout is LayoutField.Typed) {
                val value = if (layout.type is CPlatformDependentIntType) {
                    if (layout.type.cType == "size_t") "NativeLayout.C_SIZE_T.byteSize()"
                    else if (layout.type.cType == "long") "NativeLayout.C_LONG.byteSize()"
                    else if (layout.type.cType == "int") "Integer.BYTES"
                    else error("Unsupported type ${layout.type.cType}")
                } else "${layout.layoutName}.byteSize()"

                defConst("long", layout.sizeName, value)
            }
        }

        +""

        // offset
        layouts.forEach { layout ->
            defConst("long", layout.offsetName, "LAYOUT.byteOffset(${layout.pathName})")
        }
    }

    +"}"
}

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

            val layoutType = if (cType is CPlatformDependentIntType) {
                null
            } else {
                cType.jLayoutType
            }

            layouts.add(LayoutField.Typed(layoutType, current.name.toString(), layout, cType))

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

private fun tryFindRootNonPlainType(cType: CType): String? = when (cType) {
    is CArrayType -> tryFindRootNonPlainType(cType.element)
    is CPointerType -> tryFindRootNonPlainType(cType.pointee)
    is CHandleType -> cType.name
    is CEnumType -> cType.name
    is CStructType -> cType.name
    is CVoidType, is CFixedIntType, is CFloatType, is CPlatformDependentIntType -> null
}

private fun tryFindIdentifierType(type: Type): String? = when (type) {
    is ArrayType -> tryFindIdentifierType(type.element)
    is PointerType -> tryFindIdentifierType(type.pointee)
    is IdentifierType -> type.ident.toString()
}
