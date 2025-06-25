package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPersistenceStateEXT.html"><code>XrSpatialPersistenceStateEXT</code></a>
public final class XrSpatialPersistenceStateEXT {
    public static final int LOADED = 0x1;
    public static final int NOT_FOUND = 0x2;

    public static String explain(@EnumType(XrSpatialPersistenceStateEXT.class) int value) {
        return switch (value) {
            case XrSpatialPersistenceStateEXT.LOADED -> "XR_SPATIAL_PERSISTENCE_STATE_LOADED_EXT";
            case XrSpatialPersistenceStateEXT.NOT_FOUND -> "XR_SPATIAL_PERSISTENCE_STATE_NOT_FOUND_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialPersistenceStateEXT() {}
}
