package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceMemoryReportEventTypeEXT.html">VkDeviceMemoryReportEventTypeEXT</a>
public final class VkDeviceMemoryReportEventTypeEXT {
    public static final int ALLOCATE = 0;
    public static final int FREE = 1;
    public static final int IMPORT = 2;
    public static final int UNIMPORT = 3;
    public static final int ALLOCATION_FAILED = 4;

    public static String explain(@enumtype(VkDeviceMemoryReportEventTypeEXT.class) int value) {
        return switch (value) {
            case VkDeviceMemoryReportEventTypeEXT.ALLOCATE -> "VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT";
            case VkDeviceMemoryReportEventTypeEXT.ALLOCATION_FAILED -> "VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT";
            case VkDeviceMemoryReportEventTypeEXT.FREE -> "VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT";
            case VkDeviceMemoryReportEventTypeEXT.IMPORT -> "VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT";
            case VkDeviceMemoryReportEventTypeEXT.UNIMPORT -> "VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT";
            default -> "Unknown VkDeviceMemoryReportEventTypeEXT: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkDeviceMemoryReportEventTypeEXT() {}
}
