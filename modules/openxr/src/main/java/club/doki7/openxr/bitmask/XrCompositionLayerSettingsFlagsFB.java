package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerSettingsFlagsFB.html"><code>XrCompositionLayerSettingsFlagsFB</code></a>
public final class XrCompositionLayerSettingsFlagsFB {
    public static final long NORMAL_SHARPENING = 0x4L;
    public static final long NORMAL_SUPER_SAMPLING = 0x1L;
    public static final long QUALITY_SHARPENING = 0x8L;
    public static final long QUALITY_SUPER_SAMPLING = 0x2L;

    public static String explain(@Bitmask(XrCompositionLayerSettingsFlagsFB.class) long flags) {
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
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrCompositionLayerSettingsFlagsFB() {}
}
