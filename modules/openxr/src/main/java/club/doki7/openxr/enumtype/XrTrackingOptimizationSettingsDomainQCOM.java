package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrTrackingOptimizationSettingsDomainQCOM.html"><code>XrTrackingOptimizationSettingsDomainQCOM</code></a>
public final class XrTrackingOptimizationSettingsDomainQCOM {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_TRACKING_OPTIMIZATION_SETTINGS_DOMAIN_ALL_QCOM.html"><code>XR_TRACKING_OPTIMIZATION_SETTINGS_DOMAIN_ALL_QCOM</code></a>
    public static final int ALL = 0x1;

    public static String explain(@EnumType(XrTrackingOptimizationSettingsDomainQCOM.class) int value) {
        return switch (value) {
            case XrTrackingOptimizationSettingsDomainQCOM.ALL -> "XR_TRACKING_OPTIMIZATION_SETTINGS_DOMAIN_ALL_QCOM";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrTrackingOptimizationSettingsDomainQCOM() {}
}
