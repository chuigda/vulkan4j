package cc.design7.babel.codegen

import cc.design7.babel.codegen.accessor.*
import cc.design7.babel.ctype.*
import cc.design7.babel.ctype.lowerType
import cc.design7.babel.extract.vulkan.extractVulkanRegistry
import cc.design7.babel.registry.Member
import cc.design7.babel.registry.RegistryBase
import cc.design7.babel.registry.Structure
import cc.design7.babel.util.Doc
import cc.design7.babel.util.DocList
import cc.design7.babel.util.DocText
import cc.design7.babel.util.buildDoc
import cc.design7.babel.util.render
import org.intellij.lang.annotations.Language

fun main() {
    val registry = extractVulkanRegistry()
    val structure = registry.structures.values.first()
    val option = CodegenOptions("foo.bar", mutableListOf(), "constants", mutableListOf())

    println(render(generateStructure(registry, structure, option)))
}

data class LayoutField(
    val type: String,
    val name: String,
    val value: String,
    val members: List<Member>
) {
    sealed interface Member {
        data class Typed(val type: CType, val layoutName: String) : Member
        data class Bitfield(val layoutName: String, val offset: Int) : Member
    }

    constructor(
        type: String,
        name: String,
        value: String,
        memberType: CType,
        memberName: String
    ) : this(type, name, value, listOf(LayoutField.Member.Typed(memberType, memberName)))
}

private fun DocList.imports(@Language("Java", prefix = "import ", suffix = ";") path: String, static: Boolean = false) {
    +"import ${if (static) "static " else ""}$path;"
}

fun generateStructure(
    registryBase: RegistryBase,
    structure: Structure,
    codegenOptions: CodegenOptions
): Doc = buildDoc {
    val packageName = codegenOptions.packageName
    val className = structure.name
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
    imports("tech.icey.panama.IPointer")
    imports("tech.icey.panama.NativeLayout")
    imports("tech.icey.panama.annotation.*")
    imports("tech.icey.panama.buffer.*")

    if (registryBase.bitmasks.isNotEmpty()) {
        imports("$packageName.bitmask.*")
    }

    if (registryBase.structures.isNotEmpty()) {
        imports("$packageName.datatype.*;")
    }

    if (registryBase.enumerations.isNotEmpty()) {
        imports("$packageName.enumtype.*;")
    }

    if (registryBase.constants.isNotEmpty()) {
        imports("$packageName.${codegenOptions.constantClassName}.*;", true)
    }

    for (extra in codegenOptions.extraImport) {
        imports(extra)
    }

    +""

    // TODO: generate document
    +"public record $className(MemorySegment segment) implements IPointer {"

    indent {
        structure.members.forEachIndexed { i, current ->
//            val bits = current.bits
//            if (bits == 24) {
//                val next = structure.members[i + 1]
//                +DocIndent(generateBitfieldAccessor(current, next))
//            } else if (bits == 8) {
//                return@forEachIndexed
//            } else {
//                val currentType = memberTypesLowered[i]!!
//                +DocIndent(generateMemberAccessor(current, currentType))
//            }
        }


    }

    +"}"
    /// endregion import

    +"/// dummy, not implemented yet"
}

private fun lowerMemberTypes(
    registry: RegistryBase,
    codegenOptions: CodegenOptions,
    structure: Structure,
    layouts: MutableList<LayoutField>
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
            val layoutName = "LAYOUT$${current.name}"
            val layout = "${cType.jLayout}.withName(\"${current.name}\")"

            val layoutTypes = if (cType is CPlatformDependentIntType) {
                // A layout field is still required to be generated, because it will be used in the
                // structure's layout calculation. We won't be using it for accessing the field,
                // of course
                "ValueLayout"
            } else {
                cType.jLayoutType
            }

            layouts.add(LayoutField(layoutTypes, layoutName, layout, cType, layoutName))

            i += 1
        }
    }
}

private fun summarizeBitfieldStorageUnit(
    structure: Structure,
    storageUnitType: CType,
    storageUnitBegin: Int,
    storageUnitEnd: Int,
    layouts: MutableList<LayoutField>
) {
    val storageUnitBeginMemberName = structure.members[storageUnitBegin].name.value
    val storageUnitEndMemberName = structure.members[storageUnitEnd].name.value

    val storageUnitName = "${storageUnitBeginMemberName}_${storageUnitEndMemberName}"
    val layoutName = "LAYOUT$$storageUnitName"
    val layout = "${storageUnitType.jLayout}.withName(\"bitfield$$storageUnitName\")"

    val members = mutableListOf<LayoutField.Member>()
    var bitfieldOffset = 0
    for (i in storageUnitBegin..storageUnitEnd) {
        // Let's hack this shit in 10 minutes, not introducing something else for bitfield offset
        members.add(LayoutField.Member.Bitfield(layoutName, bitfieldOffset))
        bitfieldOffset += structure.members[i].bits!!
    }

    layouts.add(LayoutField(storageUnitType.jLayoutType, layoutName, layout, members))
}

private fun generateMemberAccessor(member: Member, cType: CType): Doc {
    val accessor = when (cType) {
        is CArrayType -> generateArrayAccessor(cType, member)
        is CHandleType -> generateHandleAccessor(cType, member)
        is CNonRefType -> generateNonRefAccessor(cType, member)
        is CPointerType -> generatePtrAccessor(cType, member)
        is CStructType -> generateStructureTypeAccessor(cType, member)
        is CVoidType -> throw Exception("void type not allowed in struct")
    }

    return DocText(accessor)
}