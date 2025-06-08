package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Colorspace chroma sample location.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_ChromaLocation {
    public static final int SDL_CHROMA_LOCATION_NONE = 0x0;
    public static final int SDL_CHROMA_LOCATION_LEFT = 0x1;
    public static final int SDL_CHROMA_LOCATION_CENTER = 0x2;
    public static final int SDL_CHROMA_LOCATION_TOPLEFT = 0x3;

    public static String explain(@EnumType(SDL_ChromaLocation.class) int value) {
        return switch (value) {
            case SDL_ChromaLocation.SDL_CHROMA_LOCATION_CENTER -> "SDL_CHROMA_LOCATION_CENTER";
            case SDL_ChromaLocation.SDL_CHROMA_LOCATION_LEFT -> "SDL_CHROMA_LOCATION_LEFT";
            case SDL_ChromaLocation.SDL_CHROMA_LOCATION_NONE -> "SDL_CHROMA_LOCATION_NONE";
            case SDL_ChromaLocation.SDL_CHROMA_LOCATION_TOPLEFT -> "SDL_CHROMA_LOCATION_TOPLEFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_ChromaLocation() {}
}
