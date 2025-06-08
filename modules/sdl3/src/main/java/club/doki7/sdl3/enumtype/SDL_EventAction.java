package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The type of action to request from SDL_PeepEvents().
///
/// Since: This enum is available since SDL 3.2.0.
///
public final class SDL_EventAction {
    public static final int ADDEVENT = 0x0;
    public static final int PEEKEVENT = 0x1;
    public static final int GETEVENT = 0x2;

    public static String explain(@EnumType(SDL_EventAction.class) int value) {
        return switch (value) {
            case SDL_EventAction.ADDEVENT -> "SDL_ADDEVENT";
            case SDL_EventAction.GETEVENT -> "SDL_GETEVENT";
            case SDL_EventAction.PEEKEVENT -> "SDL_PEEKEVENT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_EventAction() {}
}
