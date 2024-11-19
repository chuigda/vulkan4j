package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkDeviceMemoryReportEventTypeEXT {
    public static final int VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT = 0;
    public static final int VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT = 1;
    public static final int VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT = 2;
    public static final int VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT = 3;
    public static final int VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT = 4;

    public static String explain(@enumtype(VkDeviceMemoryReportEventTypeEXT.class) int value) {
        return switch (value) {
            case VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT -> "VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATE_EXT";
            case VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT -> "VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_FREE_EXT";
            case VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT -> "VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_IMPORT_EXT";
            case VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT -> "VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_UNIMPORT_EXT";
            case VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT -> "VK_DEVICE_MEMORY_REPORT_EVENT_TYPE_ALLOCATION_FAILED_EXT";
            default -> "Unknown";
        };
    }
}
