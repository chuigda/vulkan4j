package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBlendFactorFB.html"><code>XrBlendFactorFB</code></a>
public final class XrBlendFactorFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BLEND_FACTOR_ZERO_FB.html"><code>XR_BLEND_FACTOR_ZERO_FB</code></a>
    public static final int ZERO = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BLEND_FACTOR_ONE_FB.html"><code>XR_BLEND_FACTOR_ONE_FB</code></a>
    public static final int ONE = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BLEND_FACTOR_SRC_ALPHA_FB.html"><code>XR_BLEND_FACTOR_SRC_ALPHA_FB</code></a>
    public static final int SRC_ALPHA = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA_FB.html"><code>XR_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA_FB</code></a>
    public static final int ONE_MINUS_SRC_ALPHA = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BLEND_FACTOR_DST_ALPHA_FB.html"><code>XR_BLEND_FACTOR_DST_ALPHA_FB</code></a>
    public static final int DST_ALPHA = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_BLEND_FACTOR_ONE_MINUS_DST_ALPHA_FB.html"><code>XR_BLEND_FACTOR_ONE_MINUS_DST_ALPHA_FB</code></a>
    public static final int ONE_MINUS_DST_ALPHA = 0x5;

    public static String explain(@EnumType(XrBlendFactorFB.class) int value) {
        return switch (value) {
            case XrBlendFactorFB.DST_ALPHA -> "XR_BLEND_FACTOR_DST_ALPHA_FB";
            case XrBlendFactorFB.ONE -> "XR_BLEND_FACTOR_ONE_FB";
            case XrBlendFactorFB.ONE_MINUS_DST_ALPHA -> "XR_BLEND_FACTOR_ONE_MINUS_DST_ALPHA_FB";
            case XrBlendFactorFB.ONE_MINUS_SRC_ALPHA -> "XR_BLEND_FACTOR_ONE_MINUS_SRC_ALPHA_FB";
            case XrBlendFactorFB.SRC_ALPHA -> "XR_BLEND_FACTOR_SRC_ALPHA_FB";
            case XrBlendFactorFB.ZERO -> "XR_BLEND_FACTOR_ZERO_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrBlendFactorFB() {}
}
