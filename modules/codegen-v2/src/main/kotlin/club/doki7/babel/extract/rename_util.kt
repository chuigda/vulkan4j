package club.doki7.babel.extract

internal fun String.ensureLowerCamelCase(): String {
    val firstChar = this[0]
    if (this.length >= 2) {
        val secondChar = this[1]
        if (firstChar.isUpperCase() && secondChar.isUpperCase()) {
            return this
        }
    }

    return firstChar.lowercaseChar() + this.substring(1)
}

internal fun String.toSnakeCase(): String {
    val result = StringBuilder()
    for (i in indices) {
        val c = this[i]
        if (c.isUpperCase()) {
            if (i > 0 && this[i - 1].isLowerCase()) {
                result.append('_')
            }
            result.append(c.lowercaseChar())
        } else {
            result.append(c)
        }
    }
    return result.toString()
}

internal fun renameVariantOrBitflag(
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
