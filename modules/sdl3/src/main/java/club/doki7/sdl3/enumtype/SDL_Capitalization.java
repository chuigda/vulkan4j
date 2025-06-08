package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Auto capitalization type.
///
/// These are the valid values for SDL_PROP_TEXTINPUT_CAPITALIZATION_NUMBER.
/// Not every value is valid on every platform, but where a value isn't
/// supported, a reasonable fallback will be used.
///
/// Since: This enum is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_StartTextInputWithProperties`
///
public final class SDL_Capitalization {
    public static final int NONE = 0x0;
    public static final int SENTENCES = 0x1;
    public static final int WORDS = 0x2;
    public static final int LETTERS = 0x3;

    public static String explain(@EnumType(SDL_Capitalization.class) int value) {
        return switch (value) {
            case SDL_Capitalization.LETTERS -> "SDL_CAPITALIZE_LETTERS";
            case SDL_Capitalization.NONE -> "SDL_CAPITALIZE_NONE";
            case SDL_Capitalization.SENTENCES -> "SDL_CAPITALIZE_SENTENCES";
            case SDL_Capitalization.WORDS -> "SDL_CAPITALIZE_WORDS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_Capitalization() {}
}
