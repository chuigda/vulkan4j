package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrLocalizationMapTypeML.html"><code>XrLocalizationMapTypeML</code></a>
public final class XrLocalizationMapTypeML {
    public static final int ON_DEVICE = 0x0;
    public static final int CLOUD = 0x1;

    public static String explain(@EnumType(XrLocalizationMapTypeML.class) int value) {
        return switch (value) {
            case XrLocalizationMapTypeML.CLOUD -> "XR_LOCALIZATION_MAP_TYPE_CLOUD_ML";
            case XrLocalizationMapTypeML.ON_DEVICE -> "XR_LOCALIZATION_MAP_TYPE_ON_DEVICE_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrLocalizationMapTypeML() {}
}
