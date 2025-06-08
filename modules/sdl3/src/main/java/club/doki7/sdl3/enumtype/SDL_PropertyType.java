package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// SDL property type
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_PropertyType {
    public static final int INVALID = 0x0;
    public static final int POINTER = 0x1;
    public static final int STRING = 0x2;
    public static final int NUMBER = 0x3;
    public static final int FLOAT = 0x4;
    public static final int BOOLEAN = 0x5;

    public static String explain(@EnumType(SDL_PropertyType.class) int value) {
        return switch (value) {
            case SDL_PropertyType.BOOLEAN -> "SDL_PROPERTY_TYPE_BOOLEAN";
            case SDL_PropertyType.FLOAT -> "SDL_PROPERTY_TYPE_FLOAT";
            case SDL_PropertyType.INVALID -> "SDL_PROPERTY_TYPE_INVALID";
            case SDL_PropertyType.NUMBER -> "SDL_PROPERTY_TYPE_NUMBER";
            case SDL_PropertyType.POINTER -> "SDL_PROPERTY_TYPE_POINTER";
            case SDL_PropertyType.STRING -> "SDL_PROPERTY_TYPE_STRING";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_PropertyType() {}
}
