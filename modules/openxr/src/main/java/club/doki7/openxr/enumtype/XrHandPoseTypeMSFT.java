package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandPoseTypeMSFT.html"><code>XrHandPoseTypeMSFT</code></a>
public final class XrHandPoseTypeMSFT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_POSE_TYPE_TRACKED_MSFT.html"><code>XR_HAND_POSE_TYPE_TRACKED_MSFT</code></a>
    public static final int TRACKED = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT.html"><code>XR_HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT</code></a>
    public static final int REFERENCE_OPEN_PALM = 0x1;

    public static String explain(@EnumType(XrHandPoseTypeMSFT.class) int value) {
        return switch (value) {
            case XrHandPoseTypeMSFT.REFERENCE_OPEN_PALM -> "XR_HAND_POSE_TYPE_REFERENCE_OPEN_PALM_MSFT";
            case XrHandPoseTypeMSFT.TRACKED -> "XR_HAND_POSE_TYPE_TRACKED_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrHandPoseTypeMSFT() {}
}
