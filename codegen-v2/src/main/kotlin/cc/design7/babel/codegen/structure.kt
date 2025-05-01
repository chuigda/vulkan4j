package cc.design7.babel.codegen

import cc.design7.babel.ctype.CFixedSizeType
import cc.design7.babel.ctype.CPlatformDependentIntType
import cc.design7.babel.ctype.CType
import cc.design7.babel.ctype.lowerType
import cc.design7.babel.registry.RegistryBase
import cc.design7.babel.registry.Structure
import cc.design7.babel.util.buildDoc

fun generateStructure(
    registryBase: RegistryBase,
    structure: Structure,
    codegenOptions: CodegenOptions
) = buildDoc {
    val layoutTypes = mutableListOf<String>()
    val layoutNames = mutableListOf<String>()
    val layouts = mutableListOf<String>()
    val memberTypesLowered = mutableListOf<CType?>()
    val memberLayoutNames = mutableListOf<String>()

    lowerMemberTypes(
        registryBase,
        codegenOptions,
        structure,
        layoutTypes,
        layoutNames,
        layouts,
        memberTypesLowered,
        memberLayoutNames
    )

    +"/// dummy, not implemented yet"
}

private fun lowerMemberTypes(
    registry: RegistryBase,
    codegenOptions: CodegenOptions,
    structure: Structure,
    layoutTypes: MutableList<String>,
    layoutNames: MutableList<String>,
    layouts: MutableList<String>,
    memberTypesLowered: MutableList<CType?>,
    memberLayoutNames: MutableList<String>
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
                        layoutTypes,
                        layoutNames,
                        layouts,
                        memberTypesLowered,
                        memberLayoutNames
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
                layoutTypes,
                layoutNames,
                layouts,
                memberTypesLowered,
                memberLayoutNames
            )
        } else {
            val cType = lowerType(registry, codegenOptions.refRegistries, current.type)
            val layoutName = "LAYOUT$${current.name}"
            val layout = "${cType.jLayout}.withName(\"${current.name}\")"

            layoutTypes.add(if (cType is CPlatformDependentIntType) {
                // A layout field is still required to be generated, because it will be used in the
                // structure's layout calculation. We won't be using it for accessing the field,
                // of course
                "ValueLayout"
            } else {
                cType.jLayoutType
            })
            layoutNames.add(layoutName)
            layouts.add(layout)
            memberTypesLowered.add(cType)
            memberLayoutNames.add(layoutName)

            i += 1
        }
    }
}

private fun summarizeBitfieldStorageUnit(
    structure: Structure,
    storageUnitType: CType,
    storageUnitBegin: Int,
    storageUnitEnd: Int,
    layoutType: MutableList<String>,
    layoutNames: MutableList<String>,
    layouts: MutableList<String>,
    memberTypesLowered: MutableList<CType?>,
    memberLayoutNames: MutableList<String>,
) {
    val storageUnitBeginMemberName = structure.members[storageUnitBegin].name.value
    val storageUnitEndMemberName = structure.members[storageUnitEnd].name.value

    val storageUnitName = "${storageUnitBeginMemberName}_${storageUnitEndMemberName}"
    val layoutName = "LAYOUT$$storageUnitName"
    val layout = "${storageUnitType.jLayout}.withName(\"bitfield$$storageUnitName\")"

    layoutType.add(storageUnitType.jLayoutType)
    layoutNames.add(layoutName)
    layouts.add(layout)

    var bitfieldOffset = 0
    for (i in storageUnitBegin..storageUnitEnd) {
        memberTypesLowered.add(null)
        memberLayoutNames.add("${layoutName}:${bitfieldOffset}")

        // let's hack this shit in 10 minutes
        bitfieldOffset += structure.members[i].bits!!
    }
}
