package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComputeConsistencyMSFT.html"><code>XrSceneComputeConsistencyMSFT</code></a>
public final class XrSceneComputeConsistencyMSFT {
    public static final int SNAPSHOT_COMPLETE = 0x1;
    public static final int SNAPSHOT_INCOMPLETE_FAST = 0x2;
    public static final int OCCLUSION_OPTIMIZED = 0x3;

    public static String explain(@EnumType(XrSceneComputeConsistencyMSFT.class) int value) {
        return switch (value) {
            case XrSceneComputeConsistencyMSFT.OCCLUSION_OPTIMIZED -> "XR_SCENE_COMPUTE_CONSISTENCY_OCCLUSION_OPTIMIZED_MSFT";
            case XrSceneComputeConsistencyMSFT.SNAPSHOT_COMPLETE -> "XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_COMPLETE_MSFT";
            case XrSceneComputeConsistencyMSFT.SNAPSHOT_INCOMPLETE_FAST -> "XR_SCENE_COMPUTE_CONSISTENCY_SNAPSHOT_INCOMPLETE_FAST_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSceneComputeConsistencyMSFT() {}
}
