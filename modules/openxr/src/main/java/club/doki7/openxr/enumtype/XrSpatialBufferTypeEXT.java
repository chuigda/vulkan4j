package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialBufferTypeEXT.html"><code>XrSpatialBufferTypeEXT</code></a>
public final class XrSpatialBufferTypeEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_BUFFER_TYPE_UNKNOWN_EXT.html"><code>XR_SPATIAL_BUFFER_TYPE_UNKNOWN_EXT</code></a>
    public static final int UNKNOWN = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_BUFFER_TYPE_STRING_EXT.html"><code>XR_SPATIAL_BUFFER_TYPE_STRING_EXT</code></a>
    public static final int STRING = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_BUFFER_TYPE_UINT8_EXT.html"><code>XR_SPATIAL_BUFFER_TYPE_UINT8_EXT</code></a>
    public static final int UINT8 = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_BUFFER_TYPE_UINT16_EXT.html"><code>XR_SPATIAL_BUFFER_TYPE_UINT16_EXT</code></a>
    public static final int UINT16 = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_BUFFER_TYPE_UINT32_EXT.html"><code>XR_SPATIAL_BUFFER_TYPE_UINT32_EXT</code></a>
    public static final int UINT32 = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_BUFFER_TYPE_FLOAT_EXT.html"><code>XR_SPATIAL_BUFFER_TYPE_FLOAT_EXT</code></a>
    public static final int FLOAT = 0x5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_BUFFER_TYPE_VECTOR2F_EXT.html"><code>XR_SPATIAL_BUFFER_TYPE_VECTOR2F_EXT</code></a>
    public static final int VECTOR2F = 0x6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_BUFFER_TYPE_VECTOR3F_EXT.html"><code>XR_SPATIAL_BUFFER_TYPE_VECTOR3F_EXT</code></a>
    public static final int VECTOR3F = 0x7;

    public static String explain(@EnumType(XrSpatialBufferTypeEXT.class) int value) {
        return switch (value) {
            case XrSpatialBufferTypeEXT.FLOAT -> "XR_SPATIAL_BUFFER_TYPE_FLOAT_EXT";
            case XrSpatialBufferTypeEXT.STRING -> "XR_SPATIAL_BUFFER_TYPE_STRING_EXT";
            case XrSpatialBufferTypeEXT.UINT16 -> "XR_SPATIAL_BUFFER_TYPE_UINT16_EXT";
            case XrSpatialBufferTypeEXT.UINT32 -> "XR_SPATIAL_BUFFER_TYPE_UINT32_EXT";
            case XrSpatialBufferTypeEXT.UINT8 -> "XR_SPATIAL_BUFFER_TYPE_UINT8_EXT";
            case XrSpatialBufferTypeEXT.UNKNOWN -> "XR_SPATIAL_BUFFER_TYPE_UNKNOWN_EXT";
            case XrSpatialBufferTypeEXT.VECTOR2F -> "XR_SPATIAL_BUFFER_TYPE_VECTOR2F_EXT";
            case XrSpatialBufferTypeEXT.VECTOR3F -> "XR_SPATIAL_BUFFER_TYPE_VECTOR3F_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialBufferTypeEXT() {}
}
