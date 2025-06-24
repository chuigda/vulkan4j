package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughLayerPurposeFB.html"><code>XrPassthroughLayerPurposeFB</code></a>
public final class XrPassthroughLayerPurposeFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_LAYER_PURPOSE_RECONSTRUCTION_FB.html"><code>XR_PASSTHROUGH_LAYER_PURPOSE_RECONSTRUCTION_FB</code></a>
    public static final int RECONSTRUCTION = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_LAYER_PURPOSE_PROJECTED_FB.html"><code>XR_PASSTHROUGH_LAYER_PURPOSE_PROJECTED_FB</code></a>
    public static final int PROJECTED = 0x1;

    public static String explain(@EnumType(XrPassthroughLayerPurposeFB.class) int value) {
        return switch (value) {
            case XrPassthroughLayerPurposeFB.PROJECTED -> "XR_PASSTHROUGH_LAYER_PURPOSE_PROJECTED_FB";
            case XrPassthroughLayerPurposeFB.RECONSTRUCTION -> "XR_PASSTHROUGH_LAYER_PURPOSE_RECONSTRUCTION_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPassthroughLayerPurposeFB() {}
}
