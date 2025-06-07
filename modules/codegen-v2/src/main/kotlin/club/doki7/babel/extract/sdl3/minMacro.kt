@file:Suppress("FunctionName")

package club.doki7.babel.extract.sdl3

internal val skippedMacros = setOf<String>(
    "SDL_BUTTON_LEFT",
    "SDL_BUTTON_MIDDLE",
    "SDL_BUTTON_RIGHT",
    "SDL_BUTTON_X1",
    "SDL_BUTTON_X2",
    "SDL_VERSION_ATLEAST",
)

internal val knownMacros = mapOf<String, (String) -> String>(
    "SDL_BUTTON_MASK" to ::sdl_button_mask
)

private fun sdl_button_mask(button: String): String =
    when (button.removePrefix("SDL_BUTTON_MASK").removeSuffix(")").trim()) {
        "SDL_BUTTON_LEFT" -> "1 << 0"
        "SDL_BUTTON_MIDDLE" -> "1 << 1"
        "SDL_BUTTON_RIGHT" -> "1 << 2"
        "SDL_BUTTON_X1" -> "1 << 3"
        "SDL_BUTTON_X2" -> "1 << 4"
        else -> error("Unknown SDL button: $button")
    }
