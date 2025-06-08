package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

///  \cond
///
public final class SDL_DUMMY_ENUM {
    public static final int DUMMY_ENUM_VALUE = 0x0;

    public static String explain(@EnumType(SDL_DUMMY_ENUM.class) int value) {
        return switch (value) {
            case SDL_DUMMY_ENUM.DUMMY_ENUM_VALUE -> "DUMMY_ENUM_VALUE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_DUMMY_ENUM() {}
}
