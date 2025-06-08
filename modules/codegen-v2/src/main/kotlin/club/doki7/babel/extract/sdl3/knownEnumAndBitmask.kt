package club.doki7.babel.extract.sdl3

// These two lists are manually maintained to track SDL3 bitmask and enum types: Some SDL3 bitmask
// and enum types are not defined as `typedef enum`, but rather as `typedef int` + `#define`. There's
// no universal way to detect these types, so we maintain a list of known types here.

internal val knownBitmaskTypes = mapOf(
    // SDL_filesystem.h
    "SDL_GlobFlags" to "SDL_GLOB_",

    // SDL_gpu.h
    "SDL_GPUTextureUsageFlags" to "SDL_GPU_TEXTUREUSAGE_",
    "SDL_GPUBufferUsageFlags" to "SDL_GPU_BUFFERUSAGE_",
    "SDL_GPUColorComponentFlags" to "SDL_GPU_COLORCOMPONENT_",

    // SDL_init.h
    "SDL_InitFlags" to "SDL_INIT_",

    // SDL_messagebox.h
    "SDL_MessageBoxFlags" to "SDL_MESSAGEBOX_",
    "SDL_MessageBoxButtonFlags" to "SDL_MESSAGEBOX_BUTTON_",

    // SDL_mouse.h
    // Note tha we are not going to use `SDL_BUTTON_LEFT` but to use `SDL_BUTTON_LMASK` instead, so
    // we also match the postfix `MASK` here.
    "SDL_MouseButtonFlags" to "SDL_BUTTON_*MASK",

    // SDL_pen.h
    "SDL_PenInputFlags" to "SDL_PEN_INPUT_",

    // SDL_surface.h
    "SDL_SurfaceFlags" to "SDL_SURFACE_",

    // SDL_tray.h
    "SDL_TrayEntryFlags" to "SDL_TRAYENTRY_",

    // SDL_video.h
    "SDL_WindowFlags" to "SDL_WINDOW_",
    "SDL_GLContextReleaseFlag" to "SDL_GL_CONTEXT_RELEASE_",
    "SDL_GLContextResetNotification" to "SDL_GL_CONTEXT_RESET_",
    "SDL_GLContextFlag" to "SDL_GL_CONTEXT_"
)

internal val bitmaskExplicitBelongship = mapOf(
    // if we use the mapping above, this fucking constant will be mapped to
    // `SDL_GLContextResetNotification` type, but it should belong to `SDL_GLContextFlag`
    "SDL_GL_CONTEXT_RESET_ISOLATION_FLAG" to "SDL_GLContextFlag",

    // These two constants need to have higher priority so they are not wrongly mapped to
    // `SDL_MessageBoxFlags` type.
    "SDL_MESSAGEBOX_BUTTON_RETURNKEY_DEFAULT" to "SDL_MessageBoxButtonFlags",
    "SDL_MESSAGEBOX_BUTTON_ESCAPEKEY_DEFAULT" to "SDL_MessageBoxButtonFlags"
)

internal val knownEnumTypes = mapOf(
    // SDL_blendmode.h
    "SDL_BlendMode" to "SDL_BLENDMODE_",

    // SDL_gpu.h
    "SDL_GPUShaderFormat" to "SDL_GPU_SHADERFORMAT_",

    // SDL_keycode.h
    "SDL_Keycode" to "SDLK_",
    "SDL_Keymod" to "SDL_KMOD_",

    // SDL_video.h
    "SDL_GLProfile" to "SDL_GL_CONTEXT_PROFILE_"
)

internal fun tryFindKnownBitmaskType(constantName: String): String? {
    if (constantName in bitmaskExplicitBelongship) {
        return bitmaskExplicitBelongship[constantName]
    }

    for ((type, prefixSuffix) in knownBitmaskTypes) {
        val parts = prefixSuffix.split('*')
        val prefix = parts[0]
        val suffix = if (parts.size > 1) parts[1] else ""
        if (constantName.startsWith(prefix) && constantName.endsWith(suffix)) {
            return type
        }
    }
    return null
}

internal fun tryFindKnownEnumType(constantName: String): String? {
    for ((type, prefix) in knownEnumTypes) {
        if (constantName.startsWith(prefix)) {
            return type
        }
    }
    return null
}
