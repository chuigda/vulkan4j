package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceStorageLocationFB.html"><code>XrSpaceStorageLocationFB</code></a>
public final class XrSpaceStorageLocationFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_STORAGE_LOCATION_INVALID_FB.html"><code>XR_SPACE_STORAGE_LOCATION_INVALID_FB</code></a>
    public static final int INVALID = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_STORAGE_LOCATION_LOCAL_FB.html"><code>XR_SPACE_STORAGE_LOCATION_LOCAL_FB</code></a>
    public static final int LOCAL = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_STORAGE_LOCATION_CLOUD_FB.html"><code>XR_SPACE_STORAGE_LOCATION_CLOUD_FB</code></a>
    public static final int CLOUD = 0x2;

    public static String explain(@EnumType(XrSpaceStorageLocationFB.class) int value) {
        return switch (value) {
            case XrSpaceStorageLocationFB.CLOUD -> "XR_SPACE_STORAGE_LOCATION_CLOUD_FB";
            case XrSpaceStorageLocationFB.INVALID -> "XR_SPACE_STORAGE_LOCATION_INVALID_FB";
            case XrSpaceStorageLocationFB.LOCAL -> "XR_SPACE_STORAGE_LOCATION_LOCAL_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpaceStorageLocationFB() {}
}
