package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// How the logical size is mapped to the output.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_RendererLogicalPresentation {
    public static final int SDL_LOGICAL_PRESENTATION_DISABLED = 0x0;
    public static final int SDL_LOGICAL_PRESENTATION_STRETCH = 0x1;
    public static final int SDL_LOGICAL_PRESENTATION_LETTERBOX = 0x2;
    public static final int SDL_LOGICAL_PRESENTATION_OVERSCAN = 0x3;
    public static final int SDL_LOGICAL_PRESENTATION_INTEGER_SCALE = 0x4;

    public static String explain(@EnumType(SDL_RendererLogicalPresentation.class) int value) {
        return switch (value) {
            case SDL_RendererLogicalPresentation.SDL_LOGICAL_PRESENTATION_DISABLED -> "SDL_LOGICAL_PRESENTATION_DISABLED";
            case SDL_RendererLogicalPresentation.SDL_LOGICAL_PRESENTATION_INTEGER_SCALE -> "SDL_LOGICAL_PRESENTATION_INTEGER_SCALE";
            case SDL_RendererLogicalPresentation.SDL_LOGICAL_PRESENTATION_LETTERBOX -> "SDL_LOGICAL_PRESENTATION_LETTERBOX";
            case SDL_RendererLogicalPresentation.SDL_LOGICAL_PRESENTATION_OVERSCAN -> "SDL_LOGICAL_PRESENTATION_OVERSCAN";
            case SDL_RendererLogicalPresentation.SDL_LOGICAL_PRESENTATION_STRETCH -> "SDL_LOGICAL_PRESENTATION_STRETCH";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_RendererLogicalPresentation() {}
}
