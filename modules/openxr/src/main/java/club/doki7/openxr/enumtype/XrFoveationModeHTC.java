package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationModeHTC.html"><code>XrFoveationModeHTC</code></a>
public final class XrFoveationModeHTC {
    public static final int DISABLE = 0x0;
    public static final int FIXED = 0x1;
    public static final int DYNAMIC = 0x2;
    public static final int CUSTOM = 0x3;

    public static String explain(@EnumType(XrFoveationModeHTC.class) int value) {
        return switch (value) {
            case XrFoveationModeHTC.CUSTOM -> "XR_FOVEATION_MODE_CUSTOM_HTC";
            case XrFoveationModeHTC.DISABLE -> "XR_FOVEATION_MODE_DISABLE_HTC";
            case XrFoveationModeHTC.DYNAMIC -> "XR_FOVEATION_MODE_DYNAMIC_HTC";
            case XrFoveationModeHTC.FIXED -> "XR_FOVEATION_MODE_FIXED_HTC";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFoveationModeHTC() {}
}
