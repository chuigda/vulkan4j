package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneComputeStateMSFT.html"><code>XrSceneComputeStateMSFT</code></a>
public final class XrSceneComputeStateMSFT {
    public static final int NONE = 0x0;
    public static final int UPDATING = 0x1;
    public static final int COMPLETED = 0x2;
    public static final int COMPLETED_WITH_ERROR = 0x3;

    public static String explain(@EnumType(XrSceneComputeStateMSFT.class) int value) {
        return switch (value) {
            case XrSceneComputeStateMSFT.COMPLETED -> "XR_SCENE_COMPUTE_STATE_COMPLETED_MSFT";
            case XrSceneComputeStateMSFT.COMPLETED_WITH_ERROR -> "XR_SCENE_COMPUTE_STATE_COMPLETED_WITH_ERROR_MSFT";
            case XrSceneComputeStateMSFT.NONE -> "XR_SCENE_COMPUTE_STATE_NONE_MSFT";
            case XrSceneComputeStateMSFT.UPDATING -> "XR_SCENE_COMPUTE_STATE_UPDATING_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSceneComputeStateMSFT() {}
}
