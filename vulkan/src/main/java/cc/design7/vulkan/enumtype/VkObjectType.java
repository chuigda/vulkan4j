package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkObjectType.html">VkObjectType</a>
public final class VkObjectType {
    public static final int UNKNOWN = 0x0;
    public static final int INSTANCE = 0x1;
    public static final int PHYSICAL_DEVICE = 0x2;
    public static final int DEVICE = 0x3;
    public static final int QUEUE = 0x4;
    public static final int SEMAPHORE = 0x5;
    public static final int COMMAND_BUFFER = 0x6;
    public static final int FENCE = 0x7;
    public static final int DEVICE_MEMORY = 0x8;
    public static final int BUFFER = 0x9;
    public static final int IMAGE = 0xa;
    public static final int EVENT = 0xb;
    public static final int QUERY_POOL = 0xc;
    public static final int BUFFER_VIEW = 0xd;
    public static final int IMAGE_VIEW = 0xe;
    public static final int SHADER_MODULE = 0xf;
    public static final int PIPELINE_CACHE = 0x10;
    public static final int PIPELINE_LAYOUT = 0x11;
    public static final int RENDER_PASS = 0x12;
    public static final int PIPELINE = 0x13;
    public static final int DESCRIPTOR_SET_LAYOUT = 0x14;
    public static final int SAMPLER = 0x15;
    public static final int DESCRIPTOR_POOL = 0x16;
    public static final int DESCRIPTOR_SET = 0x17;
    public static final int FRAMEBUFFER = 0x18;
    public static final int COMMAND_POOL = 0x19;
    public static final int SAMPLER_YCBCR_CONVERSION = 0x3b9d2b60;
    public static final int DESCRIPTOR_UPDATE_TEMPLATE = 0x3b9c1608;
    public static final int PRIVATE_DATA_SLOT = 0x3b9f4a58;
    public static final int SURFACE_KHR = 0x3b9aca00;
    public static final int SWAPCHAIN_KHR = 0x3b9acde8;
    public static final int DISPLAY_KHR = 0x3b9ad1d0;
    public static final int DISPLAY_MODE_KHR = 0x3b9ad1d1;
    public static final int DEBUG_REPORT_CALLBACK_EXT = 0x3b9af4f8;
    public static final int VIDEO_SESSION_KHR = 0x3b9b23d8;
    public static final int VIDEO_SESSION_PARAMETERS_KHR = 0x3b9b23d9;
    public static final int CU_MODULE_NVX = 0x3b9b3b48;
    public static final int CU_FUNCTION_NVX = 0x3b9b3b49;
    public static final int DEBUG_UTILS_MESSENGER_EXT = 0x3b9cbe00;
    public static final int ACCELERATION_STRUCTURE_KHR = 0x3b9d13f0;
    public static final int VALIDATION_CACHE_EXT = 0x3b9d3b00;
    public static final int ACCELERATION_STRUCTURE_NV = 0x3b9d4e88;
    public static final int PERFORMANCE_CONFIGURATION_INTEL = 0x3b9dfe50;
    public static final int DEFERRED_OPERATION_KHR = 0x3b9ee0e0;
    public static final int INDIRECT_COMMANDS_LAYOUT_NV = 0x3b9f0408;
    public static final int CUDA_MODULE_NV = 0x3b9f7938;
    public static final int CUDA_FUNCTION_NV = 0x3b9f7939;
    public static final int BUFFER_COLLECTION_FUCHSIA = 0x3ba05fb0;
    public static final int MICROMAP_EXT = 0x3ba0d4e0;
    public static final int OPTICAL_FLOW_SESSION_NV = 0x3ba1de80;
    public static final int SHADER_EXT = 0x3ba224d0;
    public static final int PIPELINE_BINARY_KHR = 0x3ba228b8;
    public static final int SEMAPHORE_SCI_SYNC_POOL_NV = 0x3ba24028;
    public static final int EXTERNAL_COMPUTE_QUEUE_NV = 0x3ba345e0;
    public static final int INDIRECT_COMMANDS_LAYOUT_EXT = 0x3ba38460;
    public static final int INDIRECT_EXECUTION_SET_EXT = 0x3ba38461;

    public static String explain(@enumtype(VkObjectType.class) int value) {
        return switch (value) {
            case VkObjectType.ACCELERATION_STRUCTURE_KHR -> "VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_KHR";
            case VkObjectType.ACCELERATION_STRUCTURE_NV -> "VK_OBJECT_TYPE_ACCELERATION_STRUCTURE_NV";
            case VkObjectType.BUFFER -> "VK_OBJECT_TYPE_BUFFER";
            case VkObjectType.BUFFER_COLLECTION_FUCHSIA -> "VK_OBJECT_TYPE_BUFFER_COLLECTION_FUCHSIA";
            case VkObjectType.BUFFER_VIEW -> "VK_OBJECT_TYPE_BUFFER_VIEW";
            case VkObjectType.COMMAND_BUFFER -> "VK_OBJECT_TYPE_COMMAND_BUFFER";
            case VkObjectType.COMMAND_POOL -> "VK_OBJECT_TYPE_COMMAND_POOL";
            case VkObjectType.CUDA_FUNCTION_NV -> "VK_OBJECT_TYPE_CUDA_FUNCTION_NV";
            case VkObjectType.CUDA_MODULE_NV -> "VK_OBJECT_TYPE_CUDA_MODULE_NV";
            case VkObjectType.CU_FUNCTION_NVX -> "VK_OBJECT_TYPE_CU_FUNCTION_NVX";
            case VkObjectType.CU_MODULE_NVX -> "VK_OBJECT_TYPE_CU_MODULE_NVX";
            case VkObjectType.DEBUG_REPORT_CALLBACK_EXT -> "VK_OBJECT_TYPE_DEBUG_REPORT_CALLBACK_EXT";
            case VkObjectType.DEBUG_UTILS_MESSENGER_EXT -> "VK_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT";
            case VkObjectType.DEFERRED_OPERATION_KHR -> "VK_OBJECT_TYPE_DEFERRED_OPERATION_KHR";
            case VkObjectType.DESCRIPTOR_POOL -> "VK_OBJECT_TYPE_DESCRIPTOR_POOL";
            case VkObjectType.DESCRIPTOR_SET -> "VK_OBJECT_TYPE_DESCRIPTOR_SET";
            case VkObjectType.DESCRIPTOR_SET_LAYOUT -> "VK_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT";
            case VkObjectType.DESCRIPTOR_UPDATE_TEMPLATE -> "VK_OBJECT_TYPE_DESCRIPTOR_UPDATE_TEMPLATE";
            case VkObjectType.DEVICE -> "VK_OBJECT_TYPE_DEVICE";
            case VkObjectType.DEVICE_MEMORY -> "VK_OBJECT_TYPE_DEVICE_MEMORY";
            case VkObjectType.DISPLAY_KHR -> "VK_OBJECT_TYPE_DISPLAY_KHR";
            case VkObjectType.DISPLAY_MODE_KHR -> "VK_OBJECT_TYPE_DISPLAY_MODE_KHR";
            case VkObjectType.EVENT -> "VK_OBJECT_TYPE_EVENT";
            case VkObjectType.EXTERNAL_COMPUTE_QUEUE_NV -> "VK_OBJECT_TYPE_EXTERNAL_COMPUTE_QUEUE_NV";
            case VkObjectType.FENCE -> "VK_OBJECT_TYPE_FENCE";
            case VkObjectType.FRAMEBUFFER -> "VK_OBJECT_TYPE_FRAMEBUFFER";
            case VkObjectType.IMAGE -> "VK_OBJECT_TYPE_IMAGE";
            case VkObjectType.IMAGE_VIEW -> "VK_OBJECT_TYPE_IMAGE_VIEW";
            case VkObjectType.INDIRECT_COMMANDS_LAYOUT_EXT -> "VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_EXT";
            case VkObjectType.INDIRECT_COMMANDS_LAYOUT_NV -> "VK_OBJECT_TYPE_INDIRECT_COMMANDS_LAYOUT_NV";
            case VkObjectType.INDIRECT_EXECUTION_SET_EXT -> "VK_OBJECT_TYPE_INDIRECT_EXECUTION_SET_EXT";
            case VkObjectType.INSTANCE -> "VK_OBJECT_TYPE_INSTANCE";
            case VkObjectType.MICROMAP_EXT -> "VK_OBJECT_TYPE_MICROMAP_EXT";
            case VkObjectType.OPTICAL_FLOW_SESSION_NV -> "VK_OBJECT_TYPE_OPTICAL_FLOW_SESSION_NV";
            case VkObjectType.PERFORMANCE_CONFIGURATION_INTEL -> "VK_OBJECT_TYPE_PERFORMANCE_CONFIGURATION_INTEL";
            case VkObjectType.PHYSICAL_DEVICE -> "VK_OBJECT_TYPE_PHYSICAL_DEVICE";
            case VkObjectType.PIPELINE -> "VK_OBJECT_TYPE_PIPELINE";
            case VkObjectType.PIPELINE_BINARY_KHR -> "VK_OBJECT_TYPE_PIPELINE_BINARY_KHR";
            case VkObjectType.PIPELINE_CACHE -> "VK_OBJECT_TYPE_PIPELINE_CACHE";
            case VkObjectType.PIPELINE_LAYOUT -> "VK_OBJECT_TYPE_PIPELINE_LAYOUT";
            case VkObjectType.PRIVATE_DATA_SLOT -> "VK_OBJECT_TYPE_PRIVATE_DATA_SLOT";
            case VkObjectType.QUERY_POOL -> "VK_OBJECT_TYPE_QUERY_POOL";
            case VkObjectType.QUEUE -> "VK_OBJECT_TYPE_QUEUE";
            case VkObjectType.RENDER_PASS -> "VK_OBJECT_TYPE_RENDER_PASS";
            case VkObjectType.SAMPLER -> "VK_OBJECT_TYPE_SAMPLER";
            case VkObjectType.SAMPLER_YCBCR_CONVERSION -> "VK_OBJECT_TYPE_SAMPLER_YCBCR_CONVERSION";
            case VkObjectType.SEMAPHORE -> "VK_OBJECT_TYPE_SEMAPHORE";
            case VkObjectType.SEMAPHORE_SCI_SYNC_POOL_NV -> "VK_OBJECT_TYPE_SEMAPHORE_SCI_SYNC_POOL_NV";
            case VkObjectType.SHADER_EXT -> "VK_OBJECT_TYPE_SHADER_EXT";
            case VkObjectType.SHADER_MODULE -> "VK_OBJECT_TYPE_SHADER_MODULE";
            case VkObjectType.SURFACE_KHR -> "VK_OBJECT_TYPE_SURFACE_KHR";
            case VkObjectType.SWAPCHAIN_KHR -> "VK_OBJECT_TYPE_SWAPCHAIN_KHR";
            case VkObjectType.UNKNOWN -> "VK_OBJECT_TYPE_UNKNOWN";
            case VkObjectType.VALIDATION_CACHE_EXT -> "VK_OBJECT_TYPE_VALIDATION_CACHE_EXT";
            case VkObjectType.VIDEO_SESSION_KHR -> "VK_OBJECT_TYPE_VIDEO_SESSION_KHR";
            case VkObjectType.VIDEO_SESSION_PARAMETERS_KHR -> "VK_OBJECT_TYPE_VIDEO_SESSION_PARAMETERS_KHR";
            default -> "Unknown VkObjectType: " + value;
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkObjectType() {}
}
