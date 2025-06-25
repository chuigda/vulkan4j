package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandJointsMotionRangeEXT.html"><code>XrHandJointsMotionRangeEXT</code></a>
public final class XrHandJointsMotionRangeEXT {
    public static final int UNOBSTRUCTED = 0x1;
    public static final int CONFORMING_TO_CONTROLLER = 0x2;

    public static String explain(@EnumType(XrHandJointsMotionRangeEXT.class) int value) {
        return switch (value) {
            case XrHandJointsMotionRangeEXT.CONFORMING_TO_CONTROLLER -> "XR_HAND_JOINTS_MOTION_RANGE_CONFORMING_TO_CONTROLLER_EXT";
            case XrHandJointsMotionRangeEXT.UNOBSTRUCTED -> "XR_HAND_JOINTS_MOTION_RANGE_UNOBSTRUCTED_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrHandJointsMotionRangeEXT() {}
}
