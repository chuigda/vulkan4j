package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughFormHTC.html"><code>XrPassthroughFormHTC</code></a>
public final class XrPassthroughFormHTC {
    public static final int PLANAR = 0x0;
    public static final int PROJECTED = 0x1;

    public static String explain(@EnumType(XrPassthroughFormHTC.class) int value) {
        return switch (value) {
            case XrPassthroughFormHTC.PLANAR -> "XR_PASSTHROUGH_FORM_PLANAR_HTC";
            case XrPassthroughFormHTC.PROJECTED -> "XR_PASSTHROUGH_FORM_PROJECTED_HTC";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPassthroughFormHTC() {}
}
