package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpacePersistenceModeFB.html"><code>XrSpacePersistenceModeFB</code></a>
public final class XrSpacePersistenceModeFB {
    public static final int INVALID = 0x0;
    public static final int INDEFINITE = 0x1;

    public static String explain(@EnumType(XrSpacePersistenceModeFB.class) int value) {
        return switch (value) {
            case XrSpacePersistenceModeFB.INDEFINITE -> "XR_SPACE_PERSISTENCE_MODE_INDEFINITE_FB";
            case XrSpacePersistenceModeFB.INVALID -> "XR_SPACE_PERSISTENCE_MODE_INVALID_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpacePersistenceModeFB() {}
}
