package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPersistenceContextResultEXT.html"><code>XrSpatialPersistenceContextResultEXT</code></a>
public final class XrSpatialPersistenceContextResultEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_SUCCESS_EXT.html"><code>XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_SUCCESS_EXT</code></a>
    public static final int SUCCESS = 0x0;

    public static String explain(@EnumType(XrSpatialPersistenceContextResultEXT.class) int value) {
        return switch (value) {
            case XrSpatialPersistenceContextResultEXT.SUCCESS -> "XR_SPATIAL_PERSISTENCE_CONTEXT_RESULT_SUCCESS_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialPersistenceContextResultEXT() {}
}
