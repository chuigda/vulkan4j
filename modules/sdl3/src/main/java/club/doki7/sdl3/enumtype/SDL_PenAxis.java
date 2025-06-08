package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Pen axis indices.
///
/// These are the valid values for the `axis` field in SDL_PenAxisEvent. All
/// axes are either normalised to 0..1 or report a (positive or negative) angle
/// in degrees, with 0.0 representing the centre. Not all pens/backends support
/// all axes: unsupported axes are always zero.
///
/// To convert angles for tilt and rotation into vector representation, use
/// SDL_sinf on the XTILT, YTILT, or ROTATION component, for example:
///
/// `SDL_sinf(xtilt * SDL_PI_F / 180.0)`.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_PenAxis {
    public static final int PRESSURE = 0x0;
    public static final int XTILT = 0x1;
    public static final int YTILT = 0x2;
    public static final int DISTANCE = 0x3;
    public static final int ROTATION = 0x4;
    public static final int SLIDER = 0x5;
    public static final int TANGENTIAL_PRESSURE = 0x6;
    public static final int COUNT = 0x7;

    public static String explain(@EnumType(SDL_PenAxis.class) int value) {
        return switch (value) {
            case SDL_PenAxis.COUNT -> "SDL_PEN_AXIS_COUNT";
            case SDL_PenAxis.DISTANCE -> "SDL_PEN_AXIS_DISTANCE";
            case SDL_PenAxis.PRESSURE -> "SDL_PEN_AXIS_PRESSURE";
            case SDL_PenAxis.ROTATION -> "SDL_PEN_AXIS_ROTATION";
            case SDL_PenAxis.SLIDER -> "SDL_PEN_AXIS_SLIDER";
            case SDL_PenAxis.TANGENTIAL_PRESSURE -> "SDL_PEN_AXIS_TANGENTIAL_PRESSURE";
            case SDL_PenAxis.XTILT -> "SDL_PEN_AXIS_XTILT";
            case SDL_PenAxis.YTILT -> "SDL_PEN_AXIS_YTILT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_PenAxis() {}
}
