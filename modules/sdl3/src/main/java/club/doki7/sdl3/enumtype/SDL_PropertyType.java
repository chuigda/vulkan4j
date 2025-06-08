package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// SDL property type
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_PropertyType {
    public static final int SDL_PROPERTY_TYPE_INVALID = 0x0;
    public static final int SDL_PROPERTY_TYPE_POINTER = 0x1;
    public static final int SDL_PROPERTY_TYPE_STRING = 0x2;
    public static final int SDL_PROPERTY_TYPE_NUMBER = 0x3;
    public static final int SDL_PROPERTY_TYPE_FLOAT = 0x4;
    public static final int SDL_PROPERTY_TYPE_BOOLEAN = 0x5;

    public static String explain(@EnumType(SDL_PropertyType.class) int value) {
        return switch (value) {
            case SDL_PropertyType.SDL_PROPERTY_TYPE_BOOLEAN -> "SDL_PROPERTY_TYPE_BOOLEAN";
            case SDL_PropertyType.SDL_PROPERTY_TYPE_FLOAT -> "SDL_PROPERTY_TYPE_FLOAT";
            case SDL_PropertyType.SDL_PROPERTY_TYPE_INVALID -> "SDL_PROPERTY_TYPE_INVALID";
            case SDL_PropertyType.SDL_PROPERTY_TYPE_NUMBER -> "SDL_PROPERTY_TYPE_NUMBER";
            case SDL_PropertyType.SDL_PROPERTY_TYPE_POINTER -> "SDL_PROPERTY_TYPE_POINTER";
            case SDL_PropertyType.SDL_PROPERTY_TYPE_STRING -> "SDL_PROPERTY_TYPE_STRING";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_PropertyType() {}
}
