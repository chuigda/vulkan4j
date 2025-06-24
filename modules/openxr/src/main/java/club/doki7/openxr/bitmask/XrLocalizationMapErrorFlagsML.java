package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrLocalizationMapErrorFlagsML.html"><code>XrLocalizationMapErrorFlagsML</code></a>
public final class XrLocalizationMapErrorFlagsML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_ERROR_EXCESSIVE_MOTION_BIT_ML.html"><code>XR_LOCALIZATION_MAP_ERROR_EXCESSIVE_MOTION_BIT_ML</code></a>
    public static final int EXCESSIVE_MOTION = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_ERROR_HEADPOSE_BIT_ML.html"><code>XR_LOCALIZATION_MAP_ERROR_HEADPOSE_BIT_ML</code></a>
    public static final int HEADPOSE = 0x5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_ERROR_LOW_FEATURE_COUNT_BIT_ML.html"><code>XR_LOCALIZATION_MAP_ERROR_LOW_FEATURE_COUNT_BIT_ML</code></a>
    public static final int LOW_FEATURE_COUNT = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_ERROR_LOW_LIGHT_BIT_ML.html"><code>XR_LOCALIZATION_MAP_ERROR_LOW_LIGHT_BIT_ML</code></a>
    public static final int LOW_LIGHT = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_ERROR_OUT_OF_MAPPED_AREA_BIT_ML.html"><code>XR_LOCALIZATION_MAP_ERROR_OUT_OF_MAPPED_AREA_BIT_ML</code></a>
    public static final int OUT_OF_MAPPED_AREA = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_ERROR_UNKNOWN_BIT_ML.html"><code>XR_LOCALIZATION_MAP_ERROR_UNKNOWN_BIT_ML</code></a>
    public static final int UNKNOWN = 0x0;

    public static String explain(@Bitmask(XrLocalizationMapErrorFlagsML.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & EXCESSIVE_MOTION) != 0) {
            detectedFlagBits.add("XR_LOCALIZATION_MAP_ERROR_EXCESSIVE_MOTION_BIT_ML");
        }
        if ((flags & HEADPOSE) != 0) {
            detectedFlagBits.add("XR_LOCALIZATION_MAP_ERROR_HEADPOSE_BIT_ML");
        }
        if ((flags & LOW_FEATURE_COUNT) != 0) {
            detectedFlagBits.add("XR_LOCALIZATION_MAP_ERROR_LOW_FEATURE_COUNT_BIT_ML");
        }
        if ((flags & LOW_LIGHT) != 0) {
            detectedFlagBits.add("XR_LOCALIZATION_MAP_ERROR_LOW_LIGHT_BIT_ML");
        }
        if ((flags & OUT_OF_MAPPED_AREA) != 0) {
            detectedFlagBits.add("XR_LOCALIZATION_MAP_ERROR_OUT_OF_MAPPED_AREA_BIT_ML");
        }
        if ((flags & UNKNOWN) != 0) {
            detectedFlagBits.add("XR_LOCALIZATION_MAP_ERROR_UNKNOWN_BIT_ML");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrLocalizationMapErrorFlagsML() {}
}
