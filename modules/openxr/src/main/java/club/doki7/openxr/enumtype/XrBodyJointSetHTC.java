package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointSetHTC.html"><code>XrBodyJointSetHTC</code></a>
public final class XrBodyJointSetHTC {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BODY_JOINT_SET_FULL_HTC.html"><code>XR_BODY_JOINT_SET_FULL_HTC</code></a>
    public static final int FULL = 0x0;

    public static String explain(@EnumType(XrBodyJointSetHTC.class) int value) {
        return switch (value) {
            case XrBodyJointSetHTC.FULL -> "XR_BODY_JOINT_SET_FULL_HTC";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrBodyJointSetHTC() {}
}
