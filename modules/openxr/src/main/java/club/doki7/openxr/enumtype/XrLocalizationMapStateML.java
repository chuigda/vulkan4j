package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrLocalizationMapStateML.html"><code>XrLocalizationMapStateML</code></a>
public final class XrLocalizationMapStateML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_STATE_NOT_LOCALIZED_ML.html"><code>XR_LOCALIZATION_MAP_STATE_NOT_LOCALIZED_ML</code></a>
    public static final int NOT_LOCALIZED = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_STATE_LOCALIZED_ML.html"><code>XR_LOCALIZATION_MAP_STATE_LOCALIZED_ML</code></a>
    public static final int LOCALIZED = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_STATE_LOCALIZATION_PENDING_ML.html"><code>XR_LOCALIZATION_MAP_STATE_LOCALIZATION_PENDING_ML</code></a>
    public static final int LOCALIZATION_PENDING = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOCALIZATION_MAP_STATE_LOCALIZATION_SLEEPING_BEFORE_RETRY_ML.html"><code>XR_LOCALIZATION_MAP_STATE_LOCALIZATION_SLEEPING_BEFORE_RETRY_ML</code></a>
    public static final int LOCALIZATION_SLEEPING_BEFORE_RETRY = 0x3;

    public static String explain(@EnumType(XrLocalizationMapStateML.class) int value) {
        return switch (value) {
            case XrLocalizationMapStateML.LOCALIZATION_PENDING -> "XR_LOCALIZATION_MAP_STATE_LOCALIZATION_PENDING_ML";
            case XrLocalizationMapStateML.LOCALIZATION_SLEEPING_BEFORE_RETRY -> "XR_LOCALIZATION_MAP_STATE_LOCALIZATION_SLEEPING_BEFORE_RETRY_ML";
            case XrLocalizationMapStateML.LOCALIZED -> "XR_LOCALIZATION_MAP_STATE_LOCALIZED_ML";
            case XrLocalizationMapStateML.NOT_LOCALIZED -> "XR_LOCALIZATION_MAP_STATE_NOT_LOCALIZED_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrLocalizationMapStateML() {}
}
