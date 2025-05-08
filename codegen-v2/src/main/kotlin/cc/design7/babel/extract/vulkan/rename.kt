package cc.design7.babel.extract.vulkan

import cc.design7.babel.extract.ensureLowerCamelCase
import cc.design7.babel.extract.toSnakeCase
import cc.design7.babel.registry.Entity
import cc.design7.babel.registry.Registry
import java.io.File

private const val renamedEntitiesFile = "codegen-v2/output/vulkan-renamed-entities.csv"

internal fun Registry<VulkanRegistryExt>.renameEntities() {
    val renamed = mutableMapOf<String, String>()

    fun putEntityIfNameReplaced(entity: Entity) {
        if (entity.name.original != entity.name.value) {
            renamed.putIfAbsent(entity.name.original, entity.name.value)
        }
    }

    commands.forEach { it.value.rename(::renameCommand); putEntityIfNameReplaced(it.value) }
    constants.forEach { it.value.rename(::renameConstant); putEntityIfNameReplaced(it.value) }

    for (enum in enumerations.values) {
        putEntityIfNameReplaced(enum)
        for (value in enum.variants) {
            value.rename { renameVariantOrBitflag(this, enum.name.value) }
            putEntityIfNameReplaced(value)
        }
    }

    for (bitmask in bitmasks.values) {
        putEntityIfNameReplaced(bitmask)
        for (bitflag in bitmask.bitflags) {
            bitflag.rename { renameVariantOrBitflag(this, bitmask.name.value, true) }
            putEntityIfNameReplaced(bitflag)
        }
    }

    log.info(" - 重命名完成，重命名了 ${renamed.size} 个项目，完整列表可参见 $renamedEntitiesFile")
    File(renamedEntitiesFile).writeText(buildString {
        appendLine("original,new")
        for ((original, renamed) in renamed) {
            appendLine("$original,$renamed")
        }
    })
}

private fun renameCommand(name: String) = name.removePrefix("vk").ensureLowerCamelCase()

private fun renameConstant(name: String) = if (name.startsWith("VK_")) {
    name.removePrefix("VK_")
} else if (name.startsWith("STD_VIDEO_")) {
    name.removePrefix("STD_VIDEO_")
} else {
    name
}

// Copied from https://github.com/KyleMayes/vulkanalia/blob/master/generator/src/main/kotlin/com/kylemayes/generator/registry/Rename.kt
private fun renameVariantOrBitflag(
    name: String,
    parent: String,
    bitflag: Boolean = false,
): String {
    // Find the extension author suffix in the parent name, if any.
    // E.g., `EXT` in `DebugReportObjectTypeEXT`.
    val extension =
        parent
            .reversed()
            .takeWhile { it.isUpperCase() }
            .reversed()

    // Determine the prefix to strip from the value name (parent name).
    // E.g., `DEBUG_REPORT_OBJECT_TYPE_` for `DebugReportObjectTypeEXT` (variant).
    // E.g., `DEBUG_REPORT_` for `DebugReportFlagsEXT` (bitflag).
    var prefix =
        parent
            .substring(0, parent.length - extension.length)
            .toSnakeCase()
            .uppercase()
    if (bitflag) prefix = prefix.replace(Regex("FLAGS(\\d*)"), "$1")
    if (!prefix.endsWith('_')) prefix = "${prefix}_"

    // Determine the suffix to strip from the value name (parent extension author).
    // E.g., `_EXT` for `DebugReportObjectTypeEXT`
    val suffix = "_$extension".trimEnd('_')

    val renamed =
        name
            .removePrefix(prefix)
            .removeSuffix(suffix)
            // Some value names start with digits after the prefixes have been
            // stripped which would make them invalid identifiers.
            .replace(Regex("^([0-9])"), "_$1")
            // Some value names include lowercase characters that need to be
            // capitalized (e.g., `VK_FORMAT_ASTC_4x4_SFLOAT_BLOCK_EXT`).
            .uppercase()

    // Remove `BIT` component from bitflag name even when followed by extension author.
    return if (bitflag) {
        renamed.replace(Regex("_BIT(_[A-Z]+)?$"), "$1")
    } else {
        renamed
    }
}
