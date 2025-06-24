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

    public static String explain(@EnumType(XrReferenceSpaceType.class) int value) {
        return switch (value) {
            case XrReferenceSpaceType.LOCAL -> "XR_REFERENCE_SPACE_TYPE_LOCAL";
            case XrReferenceSpaceType.STAGE -> "XR_REFERENCE_SPACE_TYPE_STAGE";
            case XrReferenceSpaceType.VIEW -> "XR_REFERENCE_SPACE_TYPE_VIEW";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrReferenceSpaceType() {}
}
