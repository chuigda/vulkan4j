package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFormFactor.html"><code>XrFormFactor</code></a>
public final class XrFormFactor {
    public static final int HEAD_MOUNTED_DISPLAY = 0x1;
    public static final int HANDHELD_DISPLAY = 0x2;

    public static String explain(@EnumType(XrFormFactor.class) int value) {
        return switch (value) {
            case XrFormFactor.HANDHELD_DISPLAY -> "XR_FORM_FACTOR_HANDHELD_DISPLAY";
            case XrFormFactor.HEAD_MOUNTED_DISPLAY -> "XR_FORM_FACTOR_HEAD_MOUNTED_DISPLAY";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFormFactor() {}
}
