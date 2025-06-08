package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// An enum that describes the type of a touch device.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_TouchDeviceType {
    public static final int INVALID = 0xffffffff;
    public static final int DIRECT = 0x1;
    public static final int INDIRECT_ABSOLUTE = 0x2;
    public static final int INDIRECT_RELATIVE = 0x3;

    public static String explain(@EnumType(SDL_TouchDeviceType.class) int value) {
        return switch (value) {
            case SDL_TouchDeviceType.DIRECT -> "SDL_TOUCH_DEVICE_DIRECT";
            case SDL_TouchDeviceType.INDIRECT_ABSOLUTE -> "SDL_TOUCH_DEVICE_INDIRECT_ABSOLUTE";
            case SDL_TouchDeviceType.INDIRECT_RELATIVE -> "SDL_TOUCH_DEVICE_INDIRECT_RELATIVE";
            case SDL_TouchDeviceType.INVALID -> "SDL_TOUCH_DEVICE_INVALID";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_TouchDeviceType() {}
}
