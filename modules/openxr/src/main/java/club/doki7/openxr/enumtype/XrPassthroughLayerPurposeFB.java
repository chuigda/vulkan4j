package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughLayerPurposeFB.html"><code>XrPassthroughLayerPurposeFB</code></a>
public final class XrPassthroughLayerPurposeFB {
    public static final int RECONSTRUCTION = 0x0;
    public static final int PROJECTED = 0x1;
    public static final int TRACKED_KEYBOARD_HANDS = 0x3b9de2f9;
    public static final int TRACKED_KEYBOARD_MASKED_HANDS = 0x3b9de2fa;

    public static String explain(@EnumType(XrPassthroughLayerPurposeFB.class) int value) {
        return switch (value) {
            case XrPassthroughLayerPurposeFB.PROJECTED -> "XR_PASSTHROUGH_LAYER_PURPOSE_PROJECTED_FB";
            case XrPassthroughLayerPurposeFB.RECONSTRUCTION -> "XR_PASSTHROUGH_LAYER_PURPOSE_RECONSTRUCTION_FB";
            case XrPassthroughLayerPurposeFB.TRACKED_KEYBOARD_HANDS -> "XR_PASSTHROUGH_LAYER_PURPOSE_TRACKED_KEYBOARD_HANDS_FB";
            case XrPassthroughLayerPurposeFB.TRACKED_KEYBOARD_MASKED_HANDS -> "XR_PASSTHROUGH_LAYER_PURPOSE_TRACKED_KEYBOARD_MASKED_HANDS_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPassthroughLayerPurposeFB() {}
}
