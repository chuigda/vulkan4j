package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Valid key modifiers (possibly OR'd together).
///
/// \since This datatype is available since SDL 3.2.0.
///
public final class SDL_Keymod {
    public static final int NONE = 0x0;
    public static final int LSHIFT = 0x1;
    public static final int RSHIFT = 0x2;
    public static final int LEVEL5 = 0x4;
    public static final int LCTRL = 0x40;
    public static final int RCTRL = 0x80;
    public static final int LALT = 0x100;
    public static final int RALT = 0x200;
    public static final int LGUI = 0x400;
    public static final int RGUI = 0x800;
    public static final int NUM = 0x1000;
    public static final int CAPS = 0x2000;
    public static final int MODE = 0x4000;
    public static final int SCROLL = 0x8000;
    public static final int CTRL = LCTRL | RCTRL;
    public static final int SHIFT = LSHIFT | RSHIFT;
    public static final int ALT = LALT | RALT;
    public static final int GUI = LGUI | RGUI;

    public static String explain(@EnumType(SDL_Keymod.class) int value) {
        return switch (value) {
            case SDL_Keymod.CAPS -> "SDL_KMOD_CAPS";
            case SDL_Keymod.LALT -> "SDL_KMOD_LALT";
            case SDL_Keymod.LCTRL -> "SDL_KMOD_LCTRL";
            case SDL_Keymod.LEVEL5 -> "SDL_KMOD_LEVEL5";
            case SDL_Keymod.LGUI -> "SDL_KMOD_LGUI";
            case SDL_Keymod.LSHIFT -> "SDL_KMOD_LSHIFT";
            case SDL_Keymod.MODE -> "SDL_KMOD_MODE";
            case SDL_Keymod.NONE -> "SDL_KMOD_NONE";
            case SDL_Keymod.NUM -> "SDL_KMOD_NUM";
            case SDL_Keymod.RALT -> "SDL_KMOD_RALT";
            case SDL_Keymod.RCTRL -> "SDL_KMOD_RCTRL";
            case SDL_Keymod.RGUI -> "SDL_KMOD_RGUI";
            case SDL_Keymod.RSHIFT -> "SDL_KMOD_RSHIFT";
            case SDL_Keymod.SCROLL -> "SDL_KMOD_SCROLL";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_Keymod() {}
}
