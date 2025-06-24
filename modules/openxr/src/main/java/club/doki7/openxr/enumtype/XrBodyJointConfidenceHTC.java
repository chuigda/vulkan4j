package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointConfidenceHTC.html"><code>XrBodyJointConfidenceHTC</code></a>
public final class XrBodyJointConfidenceHTC {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BODY_JOINT_CONFIDENCE_NONE_HTC.html"><code>XR_BODY_JOINT_CONFIDENCE_NONE_HTC</code></a>
    public static final int NONE = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BODY_JOINT_CONFIDENCE_LOW_HTC.html"><code>XR_BODY_JOINT_CONFIDENCE_LOW_HTC</code></a>
    public static final int LOW = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BODY_JOINT_CONFIDENCE_HIGH_HTC.html"><code>XR_BODY_JOINT_CONFIDENCE_HIGH_HTC</code></a>
    public static final int HIGH = 0x2;

    public static String explain(@EnumType(XrBodyJointConfidenceHTC.class) int value) {
        return switch (value) {
            case XrBodyJointConfidenceHTC.HIGH -> "XR_BODY_JOINT_CONFIDENCE_HIGH_HTC";
            case XrBodyJointConfidenceHTC.LOW -> "XR_BODY_JOINT_CONFIDENCE_LOW_HTC";
            case XrBodyJointConfidenceHTC.NONE -> "XR_BODY_JOINT_CONFIDENCE_NONE_HTC";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrBodyJointConfidenceHTC() {}
}
