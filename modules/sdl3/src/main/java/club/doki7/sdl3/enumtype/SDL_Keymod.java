package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Valid key modifiers (possibly OR'd together).
///
/// \since This datatype is available since SDL 3.2.0.
///
public final class SDL_Keymod {
    public static final int SDL_KMOD_NONE = 0x0;
    public static final int SDL_KMOD_LSHIFT = 0x1;
    public static final int SDL_KMOD_RSHIFT = 0x2;
    public static final int SDL_KMOD_LEVEL5 = 0x4;
    public static final int SDL_KMOD_LCTRL = 0x40;
    public static final int SDL_KMOD_RCTRL = 0x80;
    public static final int SDL_KMOD_LALT = 0x100;
    public static final int SDL_KMOD_RALT = 0x200;
    public static final int SDL_KMOD_LGUI = 0x400;
    public static final int SDL_KMOD_RGUI = 0x800;
    public static final int SDL_KMOD_NUM = 0x1000;
    public static final int SDL_KMOD_CAPS = 0x2000;
    public static final int SDL_KMOD_MODE = 0x4000;
    public static final int SDL_KMOD_SCROLL = 0x8000;
    public static final int SDL_KMOD_CTRL = SDL_KMOD_LCTRL | SDL_KMOD_RCTRL;
    public static final int SDL_KMOD_SHIFT = SDL_KMOD_LSHIFT | SDL_KMOD_RSHIFT;
    public static final int SDL_KMOD_ALT = SDL_KMOD_LALT | SDL_KMOD_RALT;
    public static final int SDL_KMOD_GUI = SDL_KMOD_LGUI | SDL_KMOD_RGUI;

    public static String explain(@EnumType(SDL_Keymod.class) int value) {
        return switch (value) {
            case SDL_Keymod.SDL_KMOD_CAPS -> "SDL_KMOD_CAPS";
            case SDL_Keymod.SDL_KMOD_LALT -> "SDL_KMOD_LALT";
            case SDL_Keymod.SDL_KMOD_LCTRL -> "SDL_KMOD_LCTRL";
            case SDL_Keymod.SDL_KMOD_LEVEL5 -> "SDL_KMOD_LEVEL5";
            case SDL_Keymod.SDL_KMOD_LGUI -> "SDL_KMOD_LGUI";
            case SDL_Keymod.SDL_KMOD_LSHIFT -> "SDL_KMOD_LSHIFT";
            case SDL_Keymod.SDL_KMOD_MODE -> "SDL_KMOD_MODE";
            case SDL_Keymod.SDL_KMOD_NONE -> "SDL_KMOD_NONE";
            case SDL_Keymod.SDL_KMOD_NUM -> "SDL_KMOD_NUM";
            case SDL_Keymod.SDL_KMOD_RALT -> "SDL_KMOD_RALT";
            case SDL_Keymod.SDL_KMOD_RCTRL -> "SDL_KMOD_RCTRL";
            case SDL_Keymod.SDL_KMOD_RGUI -> "SDL_KMOD_RGUI";
            case SDL_Keymod.SDL_KMOD_RSHIFT -> "SDL_KMOD_RSHIFT";
            case SDL_Keymod.SDL_KMOD_SCROLL -> "SDL_KMOD_SCROLL";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_Keymod() {}
}
