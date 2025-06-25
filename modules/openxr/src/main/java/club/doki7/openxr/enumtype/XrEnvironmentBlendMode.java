package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEnvironmentBlendMode.html"><code>XrEnvironmentBlendMode</code></a>
public final class XrEnvironmentBlendMode {
    public static final int OPAQUE = 0x1;
    public static final int ADDITIVE = 0x2;
    public static final int ALPHA_BLEND = 0x3;

    public static String explain(@EnumType(XrEnvironmentBlendMode.class) int value) {
        return switch (value) {
            case XrEnvironmentBlendMode.ADDITIVE -> "XR_ENVIRONMENT_BLEND_MODE_ADDITIVE";
            case XrEnvironmentBlendMode.ALPHA_BLEND -> "XR_ENVIRONMENT_BLEND_MODE_ALPHA_BLEND";
            case XrEnvironmentBlendMode.OPAQUE -> "XR_ENVIRONMENT_BLEND_MODE_OPAQUE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrEnvironmentBlendMode() {}
}
