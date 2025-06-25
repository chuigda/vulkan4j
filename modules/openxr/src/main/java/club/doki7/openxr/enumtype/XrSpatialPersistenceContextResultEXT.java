package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPersistenceContextResultEXT.html"><code>XrSpatialPersistenceContextResultEXT</code></a>
public final class XrSpatialPersistenceContextResultEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_SUCCESS_EXT.html"><code>XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_SUCCESS_EXT</code></a>
    public static final int SUCCESS = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_ENTITY_NOT_TRACKING_EXT.html"><code>XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_ENTITY_NOT_TRACKING_EXT</code></a>
    public static final int ENTITY_NOT_TRACKING = 0xc4594b37;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_PERSIST_UUID_NOT_FOUND_EXT.html"><code>XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_PERSIST_UUID_NOT_FOUND_EXT</code></a>
    public static final int PERSIST_UUID_NOT_FOUND = 0xc4594b36;

    public static String explain(@EnumType(XrSpatialPersistenceContextResultEXT.class) int value) {
        return switch (value) {
            case XrSpatialPersistenceContextResultEXT.ENTITY_NOT_TRACKING -> "XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_ENTITY_NOT_TRACKING_EXT";
            case XrSpatialPersistenceContextResultEXT.PERSIST_UUID_NOT_FOUND -> "XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_PERSIST_UUID_NOT_FOUND_EXT";
            case XrSpatialPersistenceContextResultEXT.SUCCESS -> "XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_SUCCESS_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialPersistenceContextResultEXT() {}
}
