package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerFlags.html"><code>XrCompositionLayerFlags</code></a>
public final class XrCompositionLayerFlags {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT.html"><code>XR_COMPOSITION_LAYER_BLEND_TEXTURE_SOURCE_ALPHA_BIT</code></a>
    public static final long BLEND_TEXTURE_SOURCE_ALPHA = 0x2L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COMPOSITION_LAYER_CORRECT_CHROMATIC_ABERRATION_BIT.html"><code>XR_COMPOSITION_LAYER_CORRECT_CHROMATIC_ABERRATION_BIT</code></a>
    public static final long CORRECT_CHROMATIC_ABERRATION = 0x1L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT.html"><code>XR_COMPOSITION_LAYER_UNPREMULTIPLIED_ALPHA_BIT</code></a>
    public static final long UNPREMULTIPLIED_ALPHA = 0x4L;

    public static String explain(@Bitmask(XrCompositionLayerFlags.class) long flags) {
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
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrCompositionLayerFlags() {}
}
