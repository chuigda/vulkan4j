package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerSettingsFlagsFB.html"><code>XrCompositionLayerSettingsFlagsFB</code></a>
public final class XrCompositionLayerSettingsFlagsFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB.html"><code>XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB</code></a>
    public static final int NORMAL_SHARPENING = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB.html"><code>XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB</code></a>
    public static final int NORMAL_SUPER_SAMPLING = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB.html"><code>XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB</code></a>
    public static final int QUALITY_SHARPENING = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB.html"><code>XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB</code></a>
    public static final int QUALITY_SUPER_SAMPLING = 0x1;

    public static String explain(@Bitmask(XrCompositionLayerSettingsFlagsFB.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & NORMAL_SHARPENING) != 0) {
            detectedFlagBits.add("XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SHARPENING_BIT_FB");
        }
        if ((flags & NORMAL_SUPER_SAMPLING) != 0) {
            detectedFlagBits.add("XR_COMPOSITION_LAYER_SETTINGS_NORMAL_SUPER_SAMPLING_BIT_FB");
        }
        if ((flags & QUALITY_SHARPENING) != 0) {
            detectedFlagBits.add("XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SHARPENING_BIT_FB");
        }
        if ((flags & QUALITY_SUPER_SAMPLING) != 0) {
            detectedFlagBits.add("XR_COMPOSITION_LAYER_SETTINGS_QUALITY_SUPER_SAMPLING_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrCompositionLayerSettingsFlagsFB() {}
}
