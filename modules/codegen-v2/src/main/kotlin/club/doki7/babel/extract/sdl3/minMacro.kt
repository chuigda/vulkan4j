@file:Suppress("FunctionName")

package club.doki7.babel.extract.sdl3

import club.doki7.babel.util.parseDecOrHex

internal val skippedMacroConstants = setOf(
    "SDL_BUTTON_LEFT",
    "SDL_BUTTON_MIDDLE",
    "SDL_BUTTON_RIGHT",
    "SDL_BUTTON_X1",
    "SDL_BUTTON_X2",
    "SDL_VERSION",
    "SDL_NO_THREAD_SAFETY_ANALYSIS",
    "SDL_BYTEORDER",
    "SDL_FLOATWORDORDER",
    "SDL_SCOPED_CAPABILITY"
)

internal fun maybeExpandConstValue(value: String): String {
    var value1 = value

    if (value1.contains("/*")) {
        value1 = value1.substringBefore("/*").trim()
    }

    if (value1.contains("//")) {
        value1 = value1.substringBefore("//").trim()
    }

    for (macro in knownMacros) {
        val macroPatternParts = macro.key.split("*")
        val macroPatternPrefix = macroPatternParts[0]
        val macroPatternSuffix = macroPatternParts.getOrNull(1) ?: ""

        if (value1.startsWith(macroPatternPrefix) && value1.endsWith(macroPatternSuffix)) {
            return macro.value(value1)
        }
    }

    if (value1.startsWith("(") && value1.endsWith(")")) {
        value1 = value1.substring(1, value1.length - 1).trim()
    }

    if (value1.contains("<<")) {
        val parts = value1.split("<<")
        assert(parts.size == 2) { "Expected two parts in shift operation: $value1" }

        val leftPart = parts[0].trim().removeSuffix("u").trim().parseDecOrHex()
        val rightPart = parts[1].trim().removeSuffix("u").trim().parseDecOrHex().toInt()

        return "0x" + (leftPart shl rightPart).toString(16)
    }

    if (value1.endsWith("u")) {
        value1 = value1.dropLast(1).trim()
    }

    return value1
}

internal val knownMacros = mapOf<String, (String) -> String>(
    "SDL_BUTTON_MASK(*)" to ::sdl_button_mask,
    "SDL_UINT64_C(*)" to ::sdl_uint64_c,
    "SDL_SINT64_C(*)" to ::sdl_sint64_c,
    "~SDL_SINT64_C(*)" to ::flip_sdl_sint64_c,
    "SDL_WINDOWPOS_CENTERED_DISPLAY(*)" to ::sdl_windowpos_centered_display,
    "SDL_WINDOWPOS_UNDEFINED_DISPLAY(*)" to ::sdl_windowpos_undefined_display
)

private fun sdl_button_mask(button: String): String =
    when (button.removePrefix("SDL_BUTTON_MASK(").removeSuffix(")").trim()) {
        "SDL_BUTTON_LEFT" -> "0x01"
        "SDL_BUTTON_MIDDLE" -> "0x02"
        "SDL_BUTTON_RIGHT" -> "0x04"
        "SDL_BUTTON_X1" -> "0x08"
        "SDL_BUTTON_X2" -> "0x10"
        else -> error("Unknown SDL button: $button")
    }

private fun sdl_uint64_c(value: String): String {
    return value.removePrefix("SDL_UINT64_C(").removeSuffix(")").trim()
}

private fun sdl_sint64_c(value: String): String {
    return value.removePrefix("SDL_SINT64_C(").removeSuffix(")").trim()
}

private fun flip_sdl_sint64_c(value: String): String {
    return "~${value.removePrefix("~SDL_SINT64_C(").removeSuffix(")").trim()}"
}

private fun sdl_windowpos_centered_display(display: String): String {
    val value = display.removePrefix("SDL_WINDOWPOS_CENTERED_DISPLAY(").removeSuffix(")").trim()
    return "WINDOWPOS_CENTERED_MASK | ($value)"
}

private fun sdl_windowpos_undefined_display(display: String): String {
    val value = display.removePrefix("SDL_WINDOWPOS_UNDEFINED_DISPLAY(").removeSuffix(")").trim()
    return "WINDOWPOS_UNDEFINED_MASK | ($value)"
}
