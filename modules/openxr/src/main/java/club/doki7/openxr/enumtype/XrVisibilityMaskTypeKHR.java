package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVisibilityMaskTypeKHR.html"><code>XrVisibilityMaskTypeKHR</code></a>
public final class XrVisibilityMaskTypeKHR {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR.html"><code>XR_VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR</code></a>
    public static final int HIDDEN_TRIANGLE_MESH = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR.html"><code>XR_VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR</code></a>
    public static final int VISIBLE_TRIANGLE_MESH = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VISIBILITY_MASK_TYPE_LINE_LOOP_KHR.html"><code>XR_VISIBILITY_MASK_TYPE_LINE_LOOP_KHR</code></a>
    public static final int LINE_LOOP = 0x3;

    public static String explain(@EnumType(XrVisibilityMaskTypeKHR.class) int value) {
        return switch (value) {
            case XrVisibilityMaskTypeKHR.HIDDEN_TRIANGLE_MESH -> "XR_VISIBILITY_MASK_TYPE_HIDDEN_TRIANGLE_MESH_KHR";
            case XrVisibilityMaskTypeKHR.LINE_LOOP -> "XR_VISIBILITY_MASK_TYPE_LINE_LOOP_KHR";
            case XrVisibilityMaskTypeKHR.VISIBLE_TRIANGLE_MESH -> "XR_VISIBILITY_MASK_TYPE_VISIBLE_TRIANGLE_MESH_KHR";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrVisibilityMaskTypeKHR() {}
}
