package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Cursor types for SDL_CreateSystemCursor().
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_SystemCursor {
    public static final int SDL_SYSTEM_CURSOR_DEFAULT = 0x0;
    public static final int SDL_SYSTEM_CURSOR_TEXT = 0x1;
    public static final int SDL_SYSTEM_CURSOR_WAIT = 0x2;
    public static final int SDL_SYSTEM_CURSOR_CROSSHAIR = 0x3;
    public static final int SDL_SYSTEM_CURSOR_PROGRESS = 0x4;
    public static final int SDL_SYSTEM_CURSOR_NWSE_RESIZE = 0x5;
    public static final int SDL_SYSTEM_CURSOR_NESW_RESIZE = 0x6;
    public static final int SDL_SYSTEM_CURSOR_EW_RESIZE = 0x7;
    public static final int SDL_SYSTEM_CURSOR_NS_RESIZE = 0x8;
    public static final int SDL_SYSTEM_CURSOR_MOVE = 0x9;
    public static final int SDL_SYSTEM_CURSOR_NOT_ALLOWED = 0xa;
    public static final int SDL_SYSTEM_CURSOR_POINTER = 0xb;
    public static final int SDL_SYSTEM_CURSOR_NW_RESIZE = 0xc;
    public static final int SDL_SYSTEM_CURSOR_N_RESIZE = 0xd;
    public static final int SDL_SYSTEM_CURSOR_NE_RESIZE = 0xe;
    public static final int SDL_SYSTEM_CURSOR_E_RESIZE = 0xf;
    public static final int SDL_SYSTEM_CURSOR_SE_RESIZE = 0x10;
    public static final int SDL_SYSTEM_CURSOR_S_RESIZE = 0x11;
    public static final int SDL_SYSTEM_CURSOR_SW_RESIZE = 0x12;
    public static final int SDL_SYSTEM_CURSOR_W_RESIZE = 0x13;
    public static final int SDL_SYSTEM_CURSOR_COUNT = 0x14;

    public static String explain(@EnumType(SDL_SystemCursor.class) int value) {
        return switch (value) {
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_COUNT -> "SDL_SYSTEM_CURSOR_COUNT";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_CROSSHAIR -> "SDL_SYSTEM_CURSOR_CROSSHAIR";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_DEFAULT -> "SDL_SYSTEM_CURSOR_DEFAULT";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_EW_RESIZE -> "SDL_SYSTEM_CURSOR_EW_RESIZE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_E_RESIZE -> "SDL_SYSTEM_CURSOR_E_RESIZE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_MOVE -> "SDL_SYSTEM_CURSOR_MOVE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_NESW_RESIZE -> "SDL_SYSTEM_CURSOR_NESW_RESIZE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_NE_RESIZE -> "SDL_SYSTEM_CURSOR_NE_RESIZE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_NOT_ALLOWED -> "SDL_SYSTEM_CURSOR_NOT_ALLOWED";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_NS_RESIZE -> "SDL_SYSTEM_CURSOR_NS_RESIZE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_NWSE_RESIZE -> "SDL_SYSTEM_CURSOR_NWSE_RESIZE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_NW_RESIZE -> "SDL_SYSTEM_CURSOR_NW_RESIZE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_N_RESIZE -> "SDL_SYSTEM_CURSOR_N_RESIZE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_POINTER -> "SDL_SYSTEM_CURSOR_POINTER";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_PROGRESS -> "SDL_SYSTEM_CURSOR_PROGRESS";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_SE_RESIZE -> "SDL_SYSTEM_CURSOR_SE_RESIZE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_SW_RESIZE -> "SDL_SYSTEM_CURSOR_SW_RESIZE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_S_RESIZE -> "SDL_SYSTEM_CURSOR_S_RESIZE";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_TEXT -> "SDL_SYSTEM_CURSOR_TEXT";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_WAIT -> "SDL_SYSTEM_CURSOR_WAIT";
            case SDL_SystemCursor.SDL_SYSTEM_CURSOR_W_RESIZE -> "SDL_SYSTEM_CURSOR_W_RESIZE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_SystemCursor() {}
}
