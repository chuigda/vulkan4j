package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViewConfigurationType.html"><code>XrViewConfigurationType</code></a>
public final class XrViewConfigurationType {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIEW_CONFIGURATION_TYPE_PRIMARY_MONO.html"><code>XR_VIEW_CONFIGURATION_TYPE_PRIMARY_MONO</code></a>
    public static final int PRIMARY_MONO = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO.html"><code>XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO</code></a>
    public static final int PRIMARY_STEREO = 0x2;

    public static String explain(@EnumType(XrViewConfigurationType.class) int value) {
        return switch (value) {
            case XrViewConfigurationType.PRIMARY_MONO -> "XR_VIEW_CONFIGURATION_TYPE_PRIMARY_MONO";
            case XrViewConfigurationType.PRIMARY_STEREO -> "XR_VIEW_CONFIGURATION_TYPE_PRIMARY_STEREO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrViewConfigurationType() {}
}
