package cc.design7.babel.extract.vulkan

import cc.design7.babel.registry.*
import cc.design7.babel.util.Either
import java.io.File
import java.math.BigInteger

private const val extendingAddedEntitiesFile = "codegen-v2/output/vulkan-extending-added-entities.csv"

internal fun Registry<VulkanRegistryExt>.extendEntities() {
    val addedEntities = HashMap<Entity, Identifier>()

    for (version in ext.versions.values) {
        for (requireValue in version.require.values) {
            extendBitmask(requireValue, bitmasks, addedEntities)
            extendEnum(requireValue, enumerations, addedEntities)
        }
    }

    for (extension in ext.extensions.values) {
        for (requireValue in extension.require.values) {
            extendBitmask(requireValue, bitmasks, addedEntities)
            extendEnum(requireValue, enumerations, addedEntities, extension.number)
            extendExtensionNameConstants(requireValue, constants, addedEntities)
        }
    }

    log.info(" - 扩展完成，添加了 ${addedEntities.size} 个项目，完整列表可参见 $extendingAddedEntitiesFile")
    File(extendingAddedEntitiesFile).writeText(buildString {
        appendLine("name,addedTo")
        for ((key, value) in addedEntities) {
            appendLine("${key.name},$value")
        }
    })
}

private fun extendBitmask(
    requireValue: RequireValue,
    bitmasks: Map<Identifier, Bitmask>,
    addedEntities: MutableMap<Entity, Identifier>,
) {
    val bitmask = bitmasks[requireValue.extends]
    val bitpos = requireValue.bitpos
    if (bitmask != null && bitpos != null) {
        val value = BigInteger.ONE.shiftLeft(bitpos.toInt())
        val bitflag = Bitflag(name = requireValue.name, value = value)
        if (addedEntities.putIfAbsent(bitflag, bitmask.name) != null) {
            bitmask.bitflags.add(bitflag)
        }
    }
}

private fun extendEnum(
    requireValue: RequireValue,
    enums: Map<Identifier, Enumeration>,
    addedEntities: MutableMap<Entity, Identifier>,
    extNumber: Long? = null,
) {
    val enum = enums[requireValue.extends]
    val value = getVariantValue(requireValue, extNumber)
    if (enum != null && value != null) {
        val variant = EnumVariant(name = requireValue.name, value = value)
        if (addedEntities.putIfAbsent(variant, enum.name) != null) {
            enum.variants.add(variant)
        }
    }
}

private fun getVariantValue(requireValue: RequireValue, extNumber: Long?): Either<BigInteger, List<String>>? {
    if (requireValue.value != null) {
        return Either.Right(listOf(requireValue.value))
    }

    // https://www.khronos.org/registry/vulkan/specs/1.2/styleguide.html#_assigning_extension_token_values
    val number = requireValue.extNumber ?: extNumber ?: return null
    val offset = requireValue.offset ?: return null
    val value = 1_000_000_000L + (1_000 * (number - 1)) + offset
    return Either.Left((if (requireValue.negative) -value else value).toBigInteger())
}

private fun extendExtensionNameConstants(
    requireValue: RequireValue,
    constants: MutableMap<Identifier, Constant>,
    addedEntities: MutableMap<Entity, Identifier>
) {
    if (requireValue.extends != null || requireValue.value == null) {
        return
    }

    val originalName = requireValue.name.original
    val value = requireValue.value

    if (originalName.endsWith("_EXTENSION_NAME") && addedEntities.putIfAbsent(requireValue, "Constants".intern()) != null) {
        constants.putEntityIfAbsent(Constant(
            requireValue.name,
            IdentifierType("CONSTANTS_JavaString"),
            value
        ))
    }
}
