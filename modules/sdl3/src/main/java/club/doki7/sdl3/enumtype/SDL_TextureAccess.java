package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The access pattern allowed for a texture.
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_TextureAccess {
    public static final int STATIC = 0x0;
    public static final int STREAMING = 0x1;
    public static final int TARGET = 0x2;

    public static String explain(@EnumType(SDL_TextureAccess.class) int value) {
        return switch (value) {
            case SDL_TextureAccess.STATIC -> "SDL_TEXTUREACCESS_STATIC";
            case SDL_TextureAccess.STREAMING -> "SDL_TEXTUREACCESS_STREAMING";
            case SDL_TextureAccess.TARGET -> "SDL_TEXTUREACCESS_TARGET";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_TextureAccess() {}
}
