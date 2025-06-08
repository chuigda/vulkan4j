package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The access pattern allowed for a texture.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_TextureAccess {
    public static final int SDL_TEXTUREACCESS_STATIC = 0x0;
    public static final int SDL_TEXTUREACCESS_STREAMING = 0x1;
    public static final int SDL_TEXTUREACCESS_TARGET = 0x2;

    public static String explain(@EnumType(SDL_TextureAccess.class) int value) {
        return switch (value) {
            case SDL_TextureAccess.SDL_TEXTUREACCESS_STATIC -> "SDL_TEXTUREACCESS_STATIC";
            case SDL_TextureAccess.SDL_TEXTUREACCESS_STREAMING -> "SDL_TEXTUREACCESS_STREAMING";
            case SDL_TextureAccess.SDL_TEXTUREACCESS_TARGET -> "SDL_TEXTUREACCESS_TARGET";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_TextureAccess() {}
}
