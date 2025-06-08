package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// An enumeration of indices inside the colors array of
/// SDL_MessageBoxColorScheme.
///
public final class SDL_MessageBoxColorType {
    public static final int SDL_MESSAGEBOX_COLOR_BACKGROUND = 0x0;
    public static final int SDL_MESSAGEBOX_COLOR_TEXT = 0x1;
    public static final int SDL_MESSAGEBOX_COLOR_BUTTON_BORDER = 0x2;
    public static final int SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND = 0x3;
    public static final int SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED = 0x4;
    public static final int MESSAGEBOX_COLOR_COUNT = 0x5;

    public static String explain(@EnumType(SDL_MessageBoxColorType.class) int value) {
        return switch (value) {
            case SDL_MessageBoxColorType.SDL_MESSAGEBOX_COLOR_BACKGROUND -> "SDL_MESSAGEBOX_COLOR_BACKGROUND";
            case SDL_MessageBoxColorType.SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND -> "SDL_MESSAGEBOX_COLOR_BUTTON_BACKGROUND";
            case SDL_MessageBoxColorType.SDL_MESSAGEBOX_COLOR_BUTTON_BORDER -> "SDL_MESSAGEBOX_COLOR_BUTTON_BORDER";
            case SDL_MessageBoxColorType.SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED -> "SDL_MESSAGEBOX_COLOR_BUTTON_SELECTED";
            case SDL_MessageBoxColorType.MESSAGEBOX_COLOR_COUNT -> "SDL_MESSAGEBOX_COLOR_COUNT";
            case SDL_MessageBoxColorType.SDL_MESSAGEBOX_COLOR_TEXT -> "SDL_MESSAGEBOX_COLOR_TEXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_MessageBoxColorType() {}
}
