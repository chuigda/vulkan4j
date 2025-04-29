package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceCounterUnitKHR.html">VkPerformanceCounterUnitKHR</a>
public final class VkPerformanceCounterUnitKHR {
    public static final int GENERIC = 0;
    public static final int PERCENTAGE = 1;
    public static final int NANOSECONDS = 2;
    public static final int BYTES = 3;
    public static final int BYTES_PER_SECOND = 4;
    public static final int KELVIN = 5;
    public static final int WATTS = 6;
    public static final int VOLTS = 7;
    public static final int AMPS = 8;
    public static final int HERTZ = 9;
    public static final int CYCLES = 10;

    public static String explain(@enumtype(VkPerformanceCounterUnitKHR.class) int value) {
        return switch (value) {
            case VkPerformanceCounterUnitKHR.AMPS -> "VK_PERFORMANCE_COUNTER_UNIT_AMPS_KHR";
            case VkPerformanceCounterUnitKHR.BYTES -> "VK_PERFORMANCE_COUNTER_UNIT_BYTES_KHR";
            case VkPerformanceCounterUnitKHR.BYTES_PER_SECOND -> "VK_PERFORMANCE_COUNTER_UNIT_BYTES_PER_SECOND_KHR";
            case VkPerformanceCounterUnitKHR.CYCLES -> "VK_PERFORMANCE_COUNTER_UNIT_CYCLES_KHR";
            case VkPerformanceCounterUnitKHR.GENERIC -> "VK_PERFORMANCE_COUNTER_UNIT_GENERIC_KHR";
            case VkPerformanceCounterUnitKHR.HERTZ -> "VK_PERFORMANCE_COUNTER_UNIT_HERTZ_KHR";
            case VkPerformanceCounterUnitKHR.KELVIN -> "VK_PERFORMANCE_COUNTER_UNIT_KELVIN_KHR";
            case VkPerformanceCounterUnitKHR.NANOSECONDS -> "VK_PERFORMANCE_COUNTER_UNIT_NANOSECONDS_KHR";
            case VkPerformanceCounterUnitKHR.PERCENTAGE -> "VK_PERFORMANCE_COUNTER_UNIT_PERCENTAGE_KHR";
            case VkPerformanceCounterUnitKHR.VOLTS -> "VK_PERFORMANCE_COUNTER_UNIT_VOLTS_KHR";
            case VkPerformanceCounterUnitKHR.WATTS -> "VK_PERFORMANCE_COUNTER_UNIT_WATTS_KHR";
            default -> "Unknown VkPerformanceCounterUnitKHR: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkPerformanceCounterUnitKHR() {}
}
