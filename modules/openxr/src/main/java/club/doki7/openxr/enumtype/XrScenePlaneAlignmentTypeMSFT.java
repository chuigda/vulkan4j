package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrScenePlaneAlignmentTypeMSFT.html"><code>XrScenePlaneAlignmentTypeMSFT</code></a>
public final class XrScenePlaneAlignmentTypeMSFT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_PLANE_ALIGNMENT_TYPE_NON_ORTHOGONAL_MSFT.html"><code>XR_SCENE_PLANE_ALIGNMENT_TYPE_NON_ORTHOGONAL_MSFT</code></a>
    public static final int NON_ORTHOGONAL = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_PLANE_ALIGNMENT_TYPE_HORIZONTAL_MSFT.html"><code>XR_SCENE_PLANE_ALIGNMENT_TYPE_HORIZONTAL_MSFT</code></a>
    public static final int HORIZONTAL = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_PLANE_ALIGNMENT_TYPE_VERTICAL_MSFT.html"><code>XR_SCENE_PLANE_ALIGNMENT_TYPE_VERTICAL_MSFT</code></a>
    public static final int VERTICAL = 0x2;

    public static String explain(@EnumType(XrScenePlaneAlignmentTypeMSFT.class) int value) {
        return switch (value) {
            case XrScenePlaneAlignmentTypeMSFT.HORIZONTAL -> "XR_SCENE_PLANE_ALIGNMENT_TYPE_HORIZONTAL_MSFT";
            case XrScenePlaneAlignmentTypeMSFT.NON_ORTHOGONAL -> "XR_SCENE_PLANE_ALIGNMENT_TYPE_NON_ORTHOGONAL_MSFT";
            case XrScenePlaneAlignmentTypeMSFT.VERTICAL -> "XR_SCENE_PLANE_ALIGNMENT_TYPE_VERTICAL_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrScenePlaneAlignmentTypeMSFT() {}
}
