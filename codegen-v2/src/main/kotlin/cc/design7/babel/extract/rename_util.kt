package cc.design7.babel.extract

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
