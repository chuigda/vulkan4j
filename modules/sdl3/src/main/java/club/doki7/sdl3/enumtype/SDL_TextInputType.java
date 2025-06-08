package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Text input type.
///
/// These are the valid values for SDL_PROP_TEXTINPUT_TYPE_NUMBER. Not every
/// value is valid on every platform, but where a value isn't supported, a
/// reasonable fallback will be used.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_StartTextInputWithProperties
///
public final class SDL_TextInputType {
    public static final int SDL_TEXTINPUT_TYPE_TEXT = 0x0;
    public static final int SDL_TEXTINPUT_TYPE_TEXT_NAME = 0x1;
    public static final int SDL_TEXTINPUT_TYPE_TEXT_EMAIL = 0x2;
    public static final int SDL_TEXTINPUT_TYPE_TEXT_USERNAME = 0x3;
    public static final int SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_HIDDEN = 0x4;
    public static final int SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_VISIBLE = 0x5;
    public static final int SDL_TEXTINPUT_TYPE_NUMBER = 0x6;
    public static final int SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_HIDDEN = 0x7;
    public static final int SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_VISIBLE = 0x8;

    public static String explain(@EnumType(SDL_TextInputType.class) int value) {
        return switch (value) {
            case SDL_TextInputType.SDL_TEXTINPUT_TYPE_NUMBER -> "SDL_TEXTINPUT_TYPE_NUMBER";
            case SDL_TextInputType.SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_HIDDEN -> "SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_HIDDEN";
            case SDL_TextInputType.SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_VISIBLE -> "SDL_TEXTINPUT_TYPE_NUMBER_PASSWORD_VISIBLE";
            case SDL_TextInputType.SDL_TEXTINPUT_TYPE_TEXT -> "SDL_TEXTINPUT_TYPE_TEXT";
            case SDL_TextInputType.SDL_TEXTINPUT_TYPE_TEXT_EMAIL -> "SDL_TEXTINPUT_TYPE_TEXT_EMAIL";
            case SDL_TextInputType.SDL_TEXTINPUT_TYPE_TEXT_NAME -> "SDL_TEXTINPUT_TYPE_TEXT_NAME";
            case SDL_TextInputType.SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_HIDDEN -> "SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_HIDDEN";
            case SDL_TextInputType.SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_VISIBLE -> "SDL_TEXTINPUT_TYPE_TEXT_PASSWORD_VISIBLE";
            case SDL_TextInputType.SDL_TEXTINPUT_TYPE_TEXT_USERNAME -> "SDL_TEXTINPUT_TYPE_TEXT_USERNAME";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_TextInputType() {}
}
