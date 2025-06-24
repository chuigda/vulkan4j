package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerFlags.html"><code>XrCompositionLayerFlags</code></a>
public final class XrCompositionLayerFlags {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT.html"><code>XR_COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT</code></a>
    public static final int BLEND_TEXTURE_SOURCE_ALPHA = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COMPOSITION_LAYER_CORRECT_CHROMATIC_ABERRATION_BIT.html"><code>XR_COMPOSITION_LAYER_CORRECT_CHROMATIC_ABERRATION_BIT</code></a>
    public static final int CORRECT_CHROMATIC_ABERRATION = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT.html"><code>XR_COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT</code></a>
    public static final int UNPREMULTIPLIED_ALPHA = 0x2;

    public static String explain(@Bitmask(XrCompositionLayerFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & BLEND_TEXTURE_SOURCE_ALPHA) != 0) {
            detectedFlagBits.add("XR_COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT");
        }
        if ((flags & CORRECT_CHROMATIC_ABERRATION) != 0) {
            detectedFlagBits.add("XR_COMPOSITION_LAYER_CORRECT_CHROMATIC_ABERRATION_BIT");
        }
        if ((flags & UNPREMULTIPLIED_ALPHA) != 0) {
            detectedFlagBits.add("XR_COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrCompositionLayerFlags() {}
}
