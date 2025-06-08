package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Auto capitalization type.
///
/// These are the valid values for SDL_PROP_TEXTINPUT_CAPITALIZATION_NUMBER.
/// Not every value is valid on every platform, but where a value isn't
/// supported, a reasonable fallback will be used.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_StartTextInputWithProperties
///
public final class SDL_Capitalization {
    public static final int SDL_CAPITALIZE_NONE = 0x0;
    public static final int SDL_CAPITALIZE_SENTENCES = 0x1;
    public static final int SDL_CAPITALIZE_WORDS = 0x2;
    public static final int SDL_CAPITALIZE_LETTERS = 0x3;

    public static String explain(@EnumType(SDL_Capitalization.class) int value) {
        return switch (value) {
            case SDL_Capitalization.SDL_CAPITALIZE_LETTERS -> "SDL_CAPITALIZE_LETTERS";
            case SDL_Capitalization.SDL_CAPITALIZE_NONE -> "SDL_CAPITALIZE_NONE";
            case SDL_Capitalization.SDL_CAPITALIZE_SENTENCES -> "SDL_CAPITALIZE_SENTENCES";
            case SDL_Capitalization.SDL_CAPITALIZE_WORDS -> "SDL_CAPITALIZE_WORDS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_Capitalization() {}
}
