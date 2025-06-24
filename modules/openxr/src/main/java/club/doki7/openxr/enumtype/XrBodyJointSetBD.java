package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointSetBD.html"><code>XrBodyJointSetBD</code></a>
public final class XrBodyJointSetBD {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BODY_JOINT_SET_BODY_WITHOUT_ARM_BD.html"><code>XR_BODY_JOINT_SET_BODY_WITHOUT_ARM_BD</code></a>
    public static final int BODY_WITHOUT_ARM = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BODY_JOINT_SET_FULL_BODY_JOINTS_BD.html"><code>XR_BODY_JOINT_SET_FULL_BODY_JOINTS_BD</code></a>
    public static final int FULL_BODY_JOINTS = 0x2;

    public static String explain(@EnumType(XrBodyJointSetBD.class) int value) {
        return switch (value) {
            case XrBodyJointSetBD.BODY_WITHOUT_ARM -> "XR_BODY_JOINT_SET_BODY_WITHOUT_ARM_BD";
            case XrBodyJointSetBD.FULL_BODY_JOINTS -> "XR_BODY_JOINT_SET_FULL_BODY_JOINTS_BD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrBodyJointSetBD() {}
}
