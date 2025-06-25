package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSenseDataProviderTypeBD.html"><code>XrSenseDataProviderTypeBD</code></a>
public final class XrSenseDataProviderTypeBD {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SENSE_DATA_PROVIDER_TYPE_ANCHOR_BD.html"><code>XR_SENSE_DATA_PROVIDER_TYPE_ANCHOR_BD</code></a>
    public static final int ANCHOR = 0x3ba0bd70;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SENSE_DATA_PROVIDER_TYPE_SCENE_BD.html"><code>XR_SENSE_DATA_PROVIDER_TYPE_SCENE_BD</code></a>
    public static final int SCENE = 0x3ba0c540;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SENSE_DATA_PROVIDER_TYPE_MESH_BD.html"><code>XR_SENSE_DATA_PROVIDER_TYPE_MESH_BD</code></a>
    public static final int MESH = 0x3ba0c928;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SENSE_DATA_PROVIDER_TYPE_PLANE_BD.html"><code>XR_SENSE_DATA_PROVIDER_TYPE_PLANE_BD</code></a>
    public static final int PLANE = 0x3ba0d4e0;

    public static String explain(@EnumType(XrSenseDataProviderTypeBD.class) int value) {
        return switch (value) {
            case XrSenseDataProviderTypeBD.ANCHOR -> "XR_SENSE_DATA_PROVIDER_TYPE_ANCHOR_BD";
            case XrSenseDataProviderTypeBD.MESH -> "XR_SENSE_DATA_PROVIDER_TYPE_MESH_BD";
            case XrSenseDataProviderTypeBD.PLANE -> "XR_SENSE_DATA_PROVIDER_TYPE_PLANE_BD";
            case XrSenseDataProviderTypeBD.SCENE -> "XR_SENSE_DATA_PROVIDER_TYPE_SCENE_BD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSenseDataProviderTypeBD() {}
}
