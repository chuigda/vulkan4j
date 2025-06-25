package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrReferenceSpaceType.html"><code>XrReferenceSpaceType</code></a>
public final class XrReferenceSpaceType {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REFERENCE_SPACE_TYPE_VIEW.html"><code>XR_REFERENCE_SPACE_TYPE_VIEW</code></a>
    public static final int VIEW = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REFERENCE_SPACE_TYPE_LOCAL.html"><code>XR_REFERENCE_SPACE_TYPE_LOCAL</code></a>
    public static final int LOCAL = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REFERENCE_SPACE_TYPE_STAGE.html"><code>XR_REFERENCE_SPACE_TYPE_STAGE</code></a>
    public static final int STAGE = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REFERENCE_SPACE_TYPE_LOCAL_FLOOR.html"><code>XR_REFERENCE_SPACE_TYPE_LOCAL_FLOOR</code></a>
    public static final int LOCAL_FLOOR = 0x3ba14a10;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REFERENCE_SPACE_TYPE_UNBOUNDED_MSFT.html"><code>XR_REFERENCE_SPACE_TYPE_UNBOUNDED_MSFT</code></a>
    public static final int UNBOUNDED_MSFT = 0x3b9b5e70;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REFERENCE_SPACE_TYPE_COMBINED_EYE_VARJO.html"><code>XR_REFERENCE_SPACE_TYPE_COMBINED_EYE_VARJO</code></a>
    public static final int COMBINED_EYE_VARJO = 0x3b9ca2a8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REFERENCE_SPACE_TYPE_LOCALIZATION_MAP_ML.html"><code>XR_REFERENCE_SPACE_TYPE_LOCALIZATION_MAP_ML</code></a>
    public static final int LOCALIZATION_MAP_ML = 0x3b9ce8f8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REFERENCE_SPACE_TYPE_LOCAL_FLOOR_EXT.html"><code>XR_REFERENCE_SPACE_TYPE_LOCAL_FLOOR_EXT</code></a>
    public static final int LOCAL_FLOOR_EXT = LOCAL_FLOOR;

    public static String explain(@EnumType(XrReferenceSpaceType.class) int value) {
        return switch (value) {
            case XrReferenceSpaceType.COMBINED_EYE_VARJO -> "XR_REFERENCE_SPACE_TYPE_COMBINED_EYE_VARJO";
            case XrReferenceSpaceType.LOCAL -> "XR_REFERENCE_SPACE_TYPE_LOCAL";
            case XrReferenceSpaceType.LOCALIZATION_MAP_ML -> "XR_REFERENCE_SPACE_TYPE_LOCALIZATION_MAP_ML";
            case XrReferenceSpaceType.LOCAL_FLOOR -> "XR_REFERENCE_SPACE_TYPE_LOCAL_FLOOR";
            case XrReferenceSpaceType.STAGE -> "XR_REFERENCE_SPACE_TYPE_STAGE";
            case XrReferenceSpaceType.UNBOUNDED_MSFT -> "XR_REFERENCE_SPACE_TYPE_UNBOUNDED_MSFT";
            case XrReferenceSpaceType.VIEW -> "XR_REFERENCE_SPACE_TYPE_VIEW";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrReferenceSpaceType() {}
}
