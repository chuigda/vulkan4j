package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Cursor types for SDL_CreateSystemCursor().
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_SystemCursor {
    public static final int DEFAULT = 0x0;
    public static final int TEXT = 0x1;
    public static final int WAIT = 0x2;
    public static final int CROSSHAIR = 0x3;
    public static final int PROGRESS = 0x4;
    public static final int NWSE_RESIZE = 0x5;
    public static final int NESW_RESIZE = 0x6;
    public static final int EW_RESIZE = 0x7;
    public static final int NS_RESIZE = 0x8;
    public static final int MOVE = 0x9;
    public static final int NOT_ALLOWED = 0xa;
    public static final int POINTER = 0xb;
    public static final int NW_RESIZE = 0xc;
    public static final int N_RESIZE = 0xd;
    public static final int NE_RESIZE = 0xe;
    public static final int E_RESIZE = 0xf;
    public static final int SE_RESIZE = 0x10;
    public static final int S_RESIZE = 0x11;
    public static final int SW_RESIZE = 0x12;
    public static final int W_RESIZE = 0x13;
    public static final int COUNT = 0x14;

    public static String explain(@EnumType(SDL_SystemCursor.class) int value) {
        return switch (value) {
            case SDL_SystemCursor.COUNT -> "SDL_SYSTEM_CURSOR_COUNT";
            case SDL_SystemCursor.CROSSHAIR -> "SDL_SYSTEM_CURSOR_CROSSHAIR";
            case SDL_SystemCursor.DEFAULT -> "SDL_SYSTEM_CURSOR_DEFAULT";
            case SDL_SystemCursor.EW_RESIZE -> "SDL_SYSTEM_CURSOR_EW_RESIZE";
            case SDL_SystemCursor.E_RESIZE -> "SDL_SYSTEM_CURSOR_E_RESIZE";
            case SDL_SystemCursor.MOVE -> "SDL_SYSTEM_CURSOR_MOVE";
            case SDL_SystemCursor.NESW_RESIZE -> "SDL_SYSTEM_CURSOR_NESW_RESIZE";
            case SDL_SystemCursor.NE_RESIZE -> "SDL_SYSTEM_CURSOR_NE_RESIZE";
            case SDL_SystemCursor.NOT_ALLOWED -> "SDL_SYSTEM_CURSOR_NOT_ALLOWED";
            case SDL_SystemCursor.NS_RESIZE -> "SDL_SYSTEM_CURSOR_NS_RESIZE";
            case SDL_SystemCursor.NWSE_RESIZE -> "SDL_SYSTEM_CURSOR_NWSE_RESIZE";
            case SDL_SystemCursor.NW_RESIZE -> "SDL_SYSTEM_CURSOR_NW_RESIZE";
            case SDL_SystemCursor.N_RESIZE -> "SDL_SYSTEM_CURSOR_N_RESIZE";
            case SDL_SystemCursor.POINTER -> "SDL_SYSTEM_CURSOR_POINTER";
            case SDL_SystemCursor.PROGRESS -> "SDL_SYSTEM_CURSOR_PROGRESS";
            case SDL_SystemCursor.SE_RESIZE -> "SDL_SYSTEM_CURSOR_SE_RESIZE";
            case SDL_SystemCursor.SW_RESIZE -> "SDL_SYSTEM_CURSOR_SW_RESIZE";
            case SDL_SystemCursor.S_RESIZE -> "SDL_SYSTEM_CURSOR_S_RESIZE";
            case SDL_SystemCursor.TEXT -> "SDL_SYSTEM_CURSOR_TEXT";
            case SDL_SystemCursor.WAIT -> "SDL_SYSTEM_CURSOR_WAIT";
            case SDL_SystemCursor.W_RESIZE -> "SDL_SYSTEM_CURSOR_W_RESIZE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_SystemCursor() {}
}
