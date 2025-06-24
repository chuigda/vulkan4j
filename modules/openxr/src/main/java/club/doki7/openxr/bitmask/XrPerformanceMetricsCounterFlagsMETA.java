package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPerformanceMetricsCounterFlagsMETA.html"><code>XrPerformanceMetricsCounterFlagsMETA</code></a>
public final class XrPerformanceMetricsCounterFlagsMETA {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PERFORMANCE_METRICS_COUNTER_ANY_VALUE_VALID_BIT_META.html"><code>XR_PERFORMANCE_METRICS_COUNTER_ANY_VALUE_VALID_BIT_META</code></a>
    public static final int ANY_VALUE_VALID = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META.html"><code>XR_PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META</code></a>
    public static final int FLOAT_VALUE_VALID = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META.html"><code>XR_PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META</code></a>
    public static final int UINT_VALUE_VALID = 0x1;

    public static String explain(@Bitmask(XrPerformanceMetricsCounterFlagsMETA.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ANY_VALUE_VALID) != 0) {
            detectedFlagBits.add("XR_PERFORMANCE_METRICS_COUNTER_ANY_VALUE_VALID_BIT_META");
        }
        if ((flags & FLOAT_VALUE_VALID) != 0) {
            detectedFlagBits.add("XR_PERFORMANCE_METRICS_COUNTER_FLOAT_VALUE_VALID_BIT_META");
        }
        if ((flags & UINT_VALUE_VALID) != 0) {
            detectedFlagBits.add("XR_PERFORMANCE_METRICS_COUNTER_UINT_VALUE_VALID_BIT_META");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPerformanceMetricsCounterFlagsMETA() {}
}
