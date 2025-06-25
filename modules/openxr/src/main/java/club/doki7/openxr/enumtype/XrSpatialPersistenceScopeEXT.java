package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPersistenceScopeEXT.html"><code>XrSpatialPersistenceScopeEXT</code></a>
public final class XrSpatialPersistenceScopeEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_PERSISTENCE_SCOPE_SYSTEM_MANAGED_EXT.html"><code>XR_SPATIAL_PERSISTENCE_SCOPE_SYSTEM_MANAGED_EXT</code></a>
    public static final int SYSTEM_MANAGED = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_PERSISTENCE_SCOPE_LOCAL_ANCHORS_EXT.html"><code>XR_SPATIAL_PERSISTENCE_SCOPE_LOCAL_ANCHORS_EXT</code></a>
    public static final int LOCAL_ANCHORS = 0x3ba6b4c8;

    public static String explain(@EnumType(XrSpatialPersistenceScopeEXT.class) int value) {
        return switch (value) {
            case XrSpatialPersistenceScopeEXT.LOCAL_ANCHORS -> "XR_SPATIAL_PERSISTENCE_SCOPE_LOCAL_ANCHORS_EXT";
            case XrSpatialPersistenceScopeEXT.SYSTEM_MANAGED -> "XR_SPATIAL_PERSISTENCE_SCOPE_SYSTEM_MANAGED_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialPersistenceScopeEXT() {}
}
