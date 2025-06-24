package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPersistenceLocationBD.html"><code>XrPersistenceLocationBD</code></a>
public final class XrPersistenceLocationBD {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PERSISTENCE_LOCATION_LOCAL_BD.html"><code>XR_PERSISTENCE_LOCATION_LOCAL_BD</code></a>
    public static final int LOCAL = 0x0;

    public static String explain(@EnumType(XrPersistenceLocationBD.class) int value) {
        return switch (value) {
            case XrPersistenceLocationBD.LOCAL -> "XR_PERSISTENCE_LOCATION_LOCAL_BD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPersistenceLocationBD() {}
}
