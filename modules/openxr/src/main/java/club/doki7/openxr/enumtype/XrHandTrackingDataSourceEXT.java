package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackingDataSourceEXT.html"><code>XrHandTrackingDataSourceEXT</code></a>
public final class XrHandTrackingDataSourceEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_TRACKING_DATA_SOURCE_UNOBSTRUCTED_EXT.html"><code>XR_HAND_TRACKING_DATA_SOURCE_UNOBSTRUCTED_EXT</code></a>
    public static final int UNOBSTRUCTED = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT.html"><code>XR_HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT</code></a>
    public static final int CONTROLLER = 0x2;

    public static String explain(@EnumType(XrHandTrackingDataSourceEXT.class) int value) {
        return switch (value) {
            case XrHandTrackingDataSourceEXT.CONTROLLER -> "XR_HAND_TRACKING_DATA_SOURCE_CONTROLLER_EXT";
            case XrHandTrackingDataSourceEXT.UNOBSTRUCTED -> "XR_HAND_TRACKING_DATA_SOURCE_UNOBSTRUCTED_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrHandTrackingDataSourceEXT() {}
}
