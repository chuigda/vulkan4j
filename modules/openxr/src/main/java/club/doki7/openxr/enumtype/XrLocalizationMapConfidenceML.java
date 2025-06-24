package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrLocalizationMapConfidenceML.html"><code>XrLocalizationMapConfidenceML</code></a>
public final class XrLocalizationMapConfidenceML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_CONFIDENCE_POOR_ML.html"><code>XR_LOCALIZATION_MAP_CONFIDENCE_POOR_ML</code></a>
    public static final int POOR = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_CONFIDENCE_FAIR_ML.html"><code>XR_LOCALIZATION_MAP_CONFIDENCE_FAIR_ML</code></a>
    public static final int FAIR = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_CONFIDENCE_GOOD_ML.html"><code>XR_LOCALIZATION_MAP_CONFIDENCE_GOOD_ML</code></a>
    public static final int GOOD = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_CONFIDENCE_EXCELLENT_ML.html"><code>XR_LOCALIZATION_MAP_CONFIDENCE_EXCELLENT_ML</code></a>
    public static final int EXCELLENT = 0x3;

    public static String explain(@EnumType(XrLocalizationMapConfidenceML.class) int value) {
        return switch (value) {
            case XrLocalizationMapConfidenceML.EXCELLENT -> "XR_LOCALIZATION_MAP_CONFIDENCE_EXCELLENT_ML";
            case XrLocalizationMapConfidenceML.FAIR -> "XR_LOCALIZATION_MAP_CONFIDENCE_FAIR_ML";
            case XrLocalizationMapConfidenceML.GOOD -> "XR_LOCALIZATION_MAP_CONFIDENCE_GOOD_ML";
            case XrLocalizationMapConfidenceML.POOR -> "XR_LOCALIZATION_MAP_CONFIDENCE_POOR_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrLocalizationMapConfidenceML() {}
}
