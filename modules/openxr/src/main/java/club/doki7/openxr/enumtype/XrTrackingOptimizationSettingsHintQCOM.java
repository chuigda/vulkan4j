package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrTrackingOptimizationSettingsHintQCOM.html"><code>XrTrackingOptimizationSettingsHintQCOM</code></a>
public final class XrTrackingOptimizationSettingsHintQCOM {
    public static final int NONE = 0x0;
    public static final int LONG_RANGE_PRIORIZATION = 0x1;
    public static final int CLOSE_RANGE_PRIORIZATION = 0x2;
    public static final int LOW_POWER_PRIORIZATION = 0x3;
    public static final int HIGH_POWER_PRIORIZATION = 0x4;

    public static String explain(@EnumType(XrTrackingOptimizationSettingsHintQCOM.class) int value) {
        return switch (value) {
            case XrTrackingOptimizationSettingsHintQCOM.CLOSE_RANGE_PRIORIZATION -> "XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_CLOSE_RANGE_PRIORIZATION_QCOM";
            case XrTrackingOptimizationSettingsHintQCOM.HIGH_POWER_PRIORIZATION -> "XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_HIGH_POWER_PRIORIZATION_QCOM";
            case XrTrackingOptimizationSettingsHintQCOM.LONG_RANGE_PRIORIZATION -> "XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_LONG_RANGE_PRIORIZATION_QCOM";
            case XrTrackingOptimizationSettingsHintQCOM.LOW_POWER_PRIORIZATION -> "XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_LOW_POWER_PRIORIZATION_QCOM";
            case XrTrackingOptimizationSettingsHintQCOM.NONE -> "XR_TRACKING_OPTIMIZATION_SETTINGS_HINT_NONE_QCOM";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrTrackingOptimizationSettingsHintQCOM() {}
}
