package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDebugReportObjectTypeEXT.html">VkDebugReportObjectTypeEXT</a>
public final class VkDebugReportObjectTypeEXT {
    public static final int UNKNOWN = 0;
    public static final int INSTANCE = 1;
    public static final int PHYSICAL_DEVICE = 2;
    public static final int DEVICE = 3;
    public static final int QUEUE = 4;
    public static final int SEMAPHORE = 5;
    public static final int COMMAND_BUFFER = 6;
    public static final int FENCE = 7;
    public static final int DEVICE_MEMORY = 8;
    public static final int BUFFER = 9;
    public static final int IMAGE = 10;
    public static final int EVENT = 11;
    public static final int QUERY_POOL = 12;
    public static final int BUFFER_VIEW = 13;
    public static final int IMAGE_VIEW = 14;
    public static final int SHADER_MODULE = 15;
    public static final int PIPELINE_CACHE = 16;
    public static final int PIPELINE_LAYOUT = 17;
    public static final int RENDER_PASS = 18;
    public static final int PIPELINE = 19;
    public static final int DESCRIPTOR_SET_LAYOUT = 20;
    public static final int SAMPLER = 21;
    public static final int DESCRIPTOR_POOL = 22;
    public static final int DESCRIPTOR_SET = 23;
    public static final int FRAMEBUFFER = 24;
    public static final int COMMAND_POOL = 25;
    public static final int SURFACE_KHR = 26;
    public static final int SWAPCHAIN_KHR = 27;
    public static final int DEBUG_REPORT_CALLBACK_EXT = 28;
    public static final int DISPLAY_KHR = 29;
    public static final int DISPLAY_MODE_KHR = 30;
    public static final int VALIDATION_CACHE_EXT = 33;
    public static final int SAMPLER_YCBCR_CONVERSION = 1000156000;
    public static final int DESCRIPTOR_UPDATE_TEMPLATE = 1000085000;
    public static final int CU_MODULE_NVX = 1000029000;
    public static final int CU_FUNCTION_NVX = 1000029001;
    public static final int ACCELERATION_STRUCTURE_KHR = 1000150000;
    public static final int ACCELERATION_STRUCTURE_NV = 1000165000;
    public static final int CUDA_MODULE_NV = 1000307000;
    public static final int CUDA_FUNCTION_NV = 1000307001;
    public static final int BUFFER_COLLECTION_FUCHSIA = 1000366000;

    public static String explain(@enumtype(VkDebugReportObjectTypeEXT.class) int value) {
        return switch (value) {
            case VkDebugReportObjectTypeEXT.ACCELERATION_STRUCTURE_KHR -> "VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR_EXT";
            case VkDebugReportObjectTypeEXT.ACCELERATION_STRUCTURE_NV -> "VK_DEBUG_REPORT_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV_EXT";
            case VkDebugReportObjectTypeEXT.BUFFER_COLLECTION_FUCHSIA -> "VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_COLLECTION_FUCHSIA_EXT";
            case VkDebugReportObjectTypeEXT.BUFFER -> "VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT";
            case VkDebugReportObjectTypeEXT.BUFFER_VIEW -> "VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT";
            case VkDebugReportObjectTypeEXT.COMMAND_BUFFER -> "VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT";
            case VkDebugReportObjectTypeEXT.COMMAND_POOL -> "VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT";
            case VkDebugReportObjectTypeEXT.CUDA_FUNCTION_NV -> "VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_FUNCTION_NV_EXT";
            case VkDebugReportObjectTypeEXT.CUDA_MODULE_NV -> "VK_DEBUG_REPORT_OBJECT_TYPE_CUDA_MODULE_NV_EXT";
            case VkDebugReportObjectTypeEXT.CU_FUNCTION_NVX -> "VK_DEBUG_REPORT_OBJECT_TYPE_CU_FUNCTION_NVX_EXT";
            case VkDebugReportObjectTypeEXT.CU_MODULE_NVX -> "VK_DEBUG_REPORT_OBJECT_TYPE_CU_MODULE_NVX_EXT";
            case VkDebugReportObjectTypeEXT.DEBUG_REPORT_CALLBACK_EXT -> "VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT_EXT";
            case VkDebugReportObjectTypeEXT.DESCRIPTOR_POOL -> "VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT";
            case VkDebugReportObjectTypeEXT.DESCRIPTOR_SET -> "VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT";
            case VkDebugReportObjectTypeEXT.DESCRIPTOR_SET_LAYOUT -> "VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT";
            case VkDebugReportObjectTypeEXT.DESCRIPTOR_UPDATE_TEMPLATE -> "VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE_EXT";
            case VkDebugReportObjectTypeEXT.DEVICE -> "VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT";
            case VkDebugReportObjectTypeEXT.DEVICE_MEMORY -> "VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT";
            case VkDebugReportObjectTypeEXT.DISPLAY_KHR -> "VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_KHR_EXT";
            case VkDebugReportObjectTypeEXT.DISPLAY_MODE_KHR -> "VK_DEBUG_REPORT_OBJECT_TYPE_DISPLAY_MODE_KHR_EXT";
            case VkDebugReportObjectTypeEXT.EVENT -> "VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT";
            case VkDebugReportObjectTypeEXT.FENCE -> "VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT";
            case VkDebugReportObjectTypeEXT.FRAMEBUFFER -> "VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT";
            case VkDebugReportObjectTypeEXT.IMAGE -> "VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT";
            case VkDebugReportObjectTypeEXT.IMAGE_VIEW -> "VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT";
            case VkDebugReportObjectTypeEXT.INSTANCE -> "VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT";
            case VkDebugReportObjectTypeEXT.PHYSICAL_DEVICE -> "VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT";
            case VkDebugReportObjectTypeEXT.PIPELINE_CACHE -> "VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT";
            case VkDebugReportObjectTypeEXT.PIPELINE -> "VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT";
            case VkDebugReportObjectTypeEXT.PIPELINE_LAYOUT -> "VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT";
            case VkDebugReportObjectTypeEXT.QUERY_POOL -> "VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT";
            case VkDebugReportObjectTypeEXT.QUEUE -> "VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT";
            case VkDebugReportObjectTypeEXT.RENDER_PASS -> "VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT";
            case VkDebugReportObjectTypeEXT.SAMPLER -> "VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT";
            case VkDebugReportObjectTypeEXT.SAMPLER_YCBCR_CONVERSION -> "VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION_EXT";
            case VkDebugReportObjectTypeEXT.SEMAPHORE -> "VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT";
            case VkDebugReportObjectTypeEXT.SHADER_MODULE -> "VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT";
            case VkDebugReportObjectTypeEXT.SURFACE_KHR -> "VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT";
            case VkDebugReportObjectTypeEXT.SWAPCHAIN_KHR -> "VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT";
            case VkDebugReportObjectTypeEXT.UNKNOWN -> "VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT";
            case VkDebugReportObjectTypeEXT.VALIDATION_CACHE_EXT -> "VK_DEBUG_REPORT_OBJECT_TYPE_VALIDATION_CACHE_EXT_EXT";
            default -> "Unknown VkDebugReportObjectTypeEXT: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkDebugReportObjectTypeEXT() {}
}
