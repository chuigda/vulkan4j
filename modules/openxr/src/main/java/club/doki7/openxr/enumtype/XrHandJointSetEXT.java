package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandJointSetEXT.html"><code>XrHandJointSetEXT</code></a>
public final class XrHandJointSetEXT {
    public static final int DEFAULT = 0x0;
    public static final int HAND_WITH_FOREARM_ULTRALEAP = 0x3b9d1008;

    public static String explain(@EnumType(XrHandJointSetEXT.class) int value) {
        return switch (value) {
            case XrHandJointSetEXT.DEFAULT -> "XR_HAND_JOINT_SET_DEFAULT_EXT";
            case XrHandJointSetEXT.HAND_WITH_FOREARM_ULTRALEAP -> "XR_HAND_JOINT_SET_HAND_WITH_FOREARM_ULTRALEAP";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrHandJointSetEXT() {}
}
