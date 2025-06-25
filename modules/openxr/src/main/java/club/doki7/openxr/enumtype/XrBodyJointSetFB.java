package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointSetFB.html"><code>XrBodyJointSetFB</code></a>
public final class XrBodyJointSetFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BODY_JOINT_SET_DEFAULT_FB.html"><code>XR_BODY_JOINT_SET_DEFAULT_FB</code></a>
    public static final int DEFAULT = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BODY_JOINT_SET_FULL_BODY_META.html"><code>XR_BODY_JOINT_SET_FULL_BODY_META</code></a>
    public static final int FULL_BODY_META = 0x3b9ef850;

    public static String explain(@EnumType(XrBodyJointSetFB.class) int value) {
        return switch (value) {
            case XrBodyJointSetFB.DEFAULT -> "XR_BODY_JOINT_SET_DEFAULT_FB";
            case XrBodyJointSetFB.FULL_BODY_META -> "XR_BODY_JOINT_SET_FULL_BODY_META";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrBodyJointSetFB() {}
}
