package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The position of camera in relation to system device.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_GetCameraPosition
///
public final class SDL_CameraPosition {
    public static final int UNKNOWN = 0x0;
    public static final int FRONT_FACING = 0x1;
    public static final int BACK_FACING = 0x2;

    public static String explain(@EnumType(SDL_CameraPosition.class) int value) {
        return switch (value) {
            case SDL_CameraPosition.BACK_FACING -> "SDL_CAMERA_POSITION_BACK_FACING";
            case SDL_CameraPosition.FRONT_FACING -> "SDL_CAMERA_POSITION_FRONT_FACING";
            case SDL_CameraPosition.UNKNOWN -> "SDL_CAMERA_POSITION_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_CameraPosition() {}
}
