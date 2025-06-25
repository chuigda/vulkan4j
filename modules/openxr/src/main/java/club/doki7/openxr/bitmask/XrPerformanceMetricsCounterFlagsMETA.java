package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPerformanceMetricsCounterFlagsMETA.html"><code>XrPerformanceMetricsCounterFlagsMETA</code></a>
public final class XrPerformanceMetricsCounterFlagsMETA {
    public static final long ANY_VALUE_VALID = 0x1L;
    public static final long FLOAT_VALUE_VALID = 0x4L;
    public static final long UINT_VALUE_VALID = 0x2L;

    public static String explain(@Bitmask(XrPerformanceMetricsCounterFlagsMETA.class) long flags) {
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
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPerformanceMetricsCounterFlagsMETA() {}
}
