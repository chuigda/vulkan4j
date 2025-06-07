package club.doki7.babel.extract.sdl3

internal val knownTroublesomeStructures = setOf(
    // Complicated nested structure, no need fix
    "SDL_GamepadBinding",

    // Fucking anonymously-typed function pointer member, need fix
    "SDL_IOStreamInterface",
    "SDL_VirtualJoystickDesc",
    "SDL_StorageInterface",

    // Fucking Comma, need fix
    "SDL_MessageBoxColor",
    "SDL_Rect"
)
