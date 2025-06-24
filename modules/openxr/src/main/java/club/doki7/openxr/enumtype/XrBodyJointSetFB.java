package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointSetFB.html"><code>XrBodyJointSetFB</code></a>
public final class XrBodyJointSetFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BODY_JOINT_SET_DEFAULT_FB.html"><code>XR_BODY_JOINT_SET_DEFAULT_FB</code></a>
    public static final int DEFAULT = 0x0;

    public static String explain(@EnumType(XrBodyJointSetFB.class) int value) {
        return switch (value) {
            case XrBodyJointSetFB.DEFAULT -> "XR_BODY_JOINT_SET_DEFAULT_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrBodyJointSetFB() {}
}
