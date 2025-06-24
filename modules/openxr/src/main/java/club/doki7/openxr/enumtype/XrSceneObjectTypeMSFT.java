package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneObjectTypeMSFT.html"><code>XrSceneObjectTypeMSFT</code></a>
public final class XrSceneObjectTypeMSFT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_OBJECT_TYPE_UNCATEGORIZED_MSFT.html"><code>XR_SCENE_OBJECT_TYPE_UNCATEGORIZED_MSFT</code></a>
    public static final int UNCATEGORIZED = 0xffffffff;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_OBJECT_TYPE_BACKGROUND_MSFT.html"><code>XR_SCENE_OBJECT_TYPE_BACKGROUND_MSFT</code></a>
    public static final int BACKGROUND = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_OBJECT_TYPE_WALL_MSFT.html"><code>XR_SCENE_OBJECT_TYPE_WALL_MSFT</code></a>
    public static final int WALL = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_OBJECT_TYPE_FLOOR_MSFT.html"><code>XR_SCENE_OBJECT_TYPE_FLOOR_MSFT</code></a>
    public static final int FLOOR = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_OBJECT_TYPE_CEILING_MSFT.html"><code>XR_SCENE_OBJECT_TYPE_CEILING_MSFT</code></a>
    public static final int CEILING = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_OBJECT_TYPE_PLATFORM_MSFT.html"><code>XR_SCENE_OBJECT_TYPE_PLATFORM_MSFT</code></a>
    public static final int PLATFORM = 0x5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_OBJECT_TYPE_INFERRED_MSFT.html"><code>XR_SCENE_OBJECT_TYPE_INFERRED_MSFT</code></a>
    public static final int INFERRED = 0x6;

    public static String explain(@EnumType(XrSceneObjectTypeMSFT.class) int value) {
        return switch (value) {
            case XrSceneObjectTypeMSFT.BACKGROUND -> "XR_SCENE_OBJECT_TYPE_BACKGROUND_MSFT";
            case XrSceneObjectTypeMSFT.CEILING -> "XR_SCENE_OBJECT_TYPE_CEILING_MSFT";
            case XrSceneObjectTypeMSFT.FLOOR -> "XR_SCENE_OBJECT_TYPE_FLOOR_MSFT";
            case XrSceneObjectTypeMSFT.INFERRED -> "XR_SCENE_OBJECT_TYPE_INFERRED_MSFT";
            case XrSceneObjectTypeMSFT.PLATFORM -> "XR_SCENE_OBJECT_TYPE_PLATFORM_MSFT";
            case XrSceneObjectTypeMSFT.UNCATEGORIZED -> "XR_SCENE_OBJECT_TYPE_UNCATEGORIZED_MSFT";
            case XrSceneObjectTypeMSFT.WALL -> "XR_SCENE_OBJECT_TYPE_WALL_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSceneObjectTypeMSFT() {}
}
