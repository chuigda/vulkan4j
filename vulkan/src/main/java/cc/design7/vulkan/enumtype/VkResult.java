package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkResult.html">VkResult</a>
public final class VkResult {
    public static final int VK_SUCCESS = 0;
    public static final int VK_NOT_READY = 1;
    public static final int VK_TIMEOUT = 2;
    public static final int VK_EVENT_SET = 3;
    public static final int VK_EVENT_RESET = 4;
    public static final int VK_INCOMPLETE = 5;
    public static final int VK_ERROR_OUT_OF_HOST_MEMORY = -1;
    public static final int VK_ERROR_OUT_OF_DEVICE_MEMORY = -2;
    public static final int VK_ERROR_INITIALIZATION_FAILED = -3;
    public static final int VK_ERROR_DEVICE_LOST = -4;
    public static final int VK_ERROR_MEMORY_MAP_FAILED = -5;
    public static final int VK_ERROR_LAYER_NOT_PRESENT = -6;
    public static final int VK_ERROR_EXTENSION_NOT_PRESENT = -7;
    public static final int VK_ERROR_FEATURE_NOT_PRESENT = -8;
    public static final int VK_ERROR_INCOMPATIBLE_DRIVER = -9;
    public static final int VK_ERROR_TOO_MANY_OBJECTS = -10;
    public static final int VK_ERROR_FORMAT_NOT_SUPPORTED = -11;
    public static final int VK_ERROR_FRAGMENTED_POOL = -12;
    public static final int VK_ERROR_UNKNOWN = -13;
    public static final int VK_ERROR_OUT_OF_POOL_MEMORY = -1000069000;
    public static final int VK_ERROR_INVALID_EXTERNAL_HANDLE = -1000072003;
    public static final int VK_ERROR_FRAGMENTATION = -1000161000;
    public static final int VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS = -1000257000;
    public static final int VK_PIPELINE_COMPILE_REQUIRED = 1000297000;
    public static final int VK_ERROR_NOT_PERMITTED = -1000174001;
    public static final int VK_ERROR_SURFACE_LOST_KHR = -1000000000;
    public static final int VK_ERROR_NATIVE_WINDOW_IN_USE_KHR = -1000000001;
    public static final int VK_SUBOPTIMAL_KHR = 1000001003;
    public static final int VK_ERROR_OUT_OF_DATE_KHR = -1000001004;
    public static final int VK_ERROR_INCOMPATIBLE_DISPLAY_KHR = -1000003001;
    public static final int VK_ERROR_VALIDATION_FAILED_EXT = -1000011001;
    public static final int VK_ERROR_INVALID_SHADER_NV = -1000012000;
    public static final int VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR = -1000023000;
    public static final int VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR = -1000023001;
    public static final int VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR = -1000023002;
    public static final int VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR = -1000023003;
    public static final int VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR = -1000023004;
    public static final int VK_ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR = -1000023005;
    public static final int VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT = -1000158000;
    public static final int VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT = -1000255000;
    public static final int VK_THREAD_IDLE_KHR = 1000268000;
    public static final int VK_THREAD_DONE_KHR = 1000268001;
    public static final int VK_OPERATION_DEFERRED_KHR = 1000268002;
    public static final int VK_OPERATION_NOT_DEFERRED_KHR = 1000268003;
    public static final int VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR = -1000299000;
    public static final int VK_ERROR_COMPRESSION_EXHAUSTED_EXT = -1000338000;
    public static final int VK_INCOMPATIBLE_SHADER_BINARY_EXT = 1000482000;
    public static final int VK_PIPELINE_BINARY_MISSING_KHR = 1000483000;
    public static final int VK_ERROR_NOT_ENOUGH_SPACE_KHR = -1000483000;

    public static String explain(@enumtype(VkResult.class) int value) {
        return switch (value) {
            case VkResult.VK_ERROR_COMPRESSION_EXHAUSTED_EXT -> "VK_ERROR_COMPRESSION_EXHAUSTED_EXT";
            case VkResult.VK_ERROR_DEVICE_LOST -> "VK_ERROR_DEVICE_LOST";
            case VkResult.VK_ERROR_EXTENSION_NOT_PRESENT -> "VK_ERROR_EXTENSION_NOT_PRESENT";
            case VkResult.VK_ERROR_FEATURE_NOT_PRESENT -> "VK_ERROR_FEATURE_NOT_PRESENT";
            case VkResult.VK_ERROR_FORMAT_NOT_SUPPORTED -> "VK_ERROR_FORMAT_NOT_SUPPORTED";
            case VkResult.VK_ERROR_FRAGMENTATION -> "VK_ERROR_FRAGMENTATION";
            case VkResult.VK_ERROR_FRAGMENTED_POOL -> "VK_ERROR_FRAGMENTED_POOL";
            case VkResult.VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT -> "VK_ERROR_FULL_SCREEN_EXCLUSIVE_MODE_LOST_EXT";
            case VkResult.VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR -> "VK_ERROR_IMAGE_USAGE_NOT_SUPPORTED_KHR";
            case VkResult.VK_ERROR_INCOMPATIBLE_DISPLAY_KHR -> "VK_ERROR_INCOMPATIBLE_DISPLAY_KHR";
            case VkResult.VK_ERROR_INCOMPATIBLE_DRIVER -> "VK_ERROR_INCOMPATIBLE_DRIVER";
            case VkResult.VK_ERROR_INITIALIZATION_FAILED -> "VK_ERROR_INITIALIZATION_FAILED";
            case VkResult.VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT -> "VK_ERROR_INVALID_DRM_FORMAT_MODIFIER_PLANE_LAYOUT_EXT";
            case VkResult.VK_ERROR_INVALID_EXTERNAL_HANDLE -> "VK_ERROR_INVALID_EXTERNAL_HANDLE";
            case VkResult.VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS -> "VK_ERROR_INVALID_OPAQUE_CAPTURE_ADDRESS";
            case VkResult.VK_ERROR_INVALID_SHADER_NV -> "VK_ERROR_INVALID_SHADER_NV";
            case VkResult.VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR -> "VK_ERROR_INVALID_VIDEO_STD_PARAMETERS_KHR";
            case VkResult.VK_ERROR_LAYER_NOT_PRESENT -> "VK_ERROR_LAYER_NOT_PRESENT";
            case VkResult.VK_ERROR_MEMORY_MAP_FAILED -> "VK_ERROR_MEMORY_MAP_FAILED";
            case VkResult.VK_ERROR_NATIVE_WINDOW_IN_USE_KHR -> "VK_ERROR_NATIVE_WINDOW_IN_USE_KHR";
            case VkResult.VK_ERROR_NOT_ENOUGH_SPACE_KHR -> "VK_ERROR_NOT_ENOUGH_SPACE_KHR";
            case VkResult.VK_ERROR_NOT_PERMITTED -> "VK_ERROR_NOT_PERMITTED";
            case VkResult.VK_ERROR_OUT_OF_DATE_KHR -> "VK_ERROR_OUT_OF_DATE_KHR";
            case VkResult.VK_ERROR_OUT_OF_DEVICE_MEMORY -> "VK_ERROR_OUT_OF_DEVICE_MEMORY";
            case VkResult.VK_ERROR_OUT_OF_HOST_MEMORY -> "VK_ERROR_OUT_OF_HOST_MEMORY";
            case VkResult.VK_ERROR_OUT_OF_POOL_MEMORY -> "VK_ERROR_OUT_OF_POOL_MEMORY";
            case VkResult.VK_ERROR_SURFACE_LOST_KHR -> "VK_ERROR_SURFACE_LOST_KHR";
            case VkResult.VK_ERROR_TOO_MANY_OBJECTS -> "VK_ERROR_TOO_MANY_OBJECTS";
            case VkResult.VK_ERROR_UNKNOWN -> "VK_ERROR_UNKNOWN";
            case VkResult.VK_ERROR_VALIDATION_FAILED_EXT -> "VK_ERROR_VALIDATION_FAILED_EXT";
            case VkResult.VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR -> "VK_ERROR_VIDEO_PICTURE_LAYOUT_NOT_SUPPORTED_KHR";
            case VkResult.VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR -> "VK_ERROR_VIDEO_PROFILE_CODEC_NOT_SUPPORTED_KHR";
            case VkResult.VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR -> "VK_ERROR_VIDEO_PROFILE_FORMAT_NOT_SUPPORTED_KHR";
            case VkResult.VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR -> "VK_ERROR_VIDEO_PROFILE_OPERATION_NOT_SUPPORTED_KHR";
            case VkResult.VK_ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR -> "VK_ERROR_VIDEO_STD_VERSION_NOT_SUPPORTED_KHR";
            case VkResult.VK_EVENT_RESET -> "VK_EVENT_RESET";
            case VkResult.VK_EVENT_SET -> "VK_EVENT_SET";
            case VkResult.VK_INCOMPATIBLE_SHADER_BINARY_EXT -> "VK_INCOMPATIBLE_SHADER_BINARY_EXT";
            case VkResult.VK_INCOMPLETE -> "VK_INCOMPLETE";
            case VkResult.VK_NOT_READY -> "VK_NOT_READY";
            case VkResult.VK_OPERATION_DEFERRED_KHR -> "VK_OPERATION_DEFERRED_KHR";
            case VkResult.VK_OPERATION_NOT_DEFERRED_KHR -> "VK_OPERATION_NOT_DEFERRED_KHR";
            case VkResult.VK_PIPELINE_BINARY_MISSING_KHR -> "VK_PIPELINE_BINARY_MISSING_KHR";
            case VkResult.VK_PIPELINE_COMPILE_REQUIRED -> "VK_PIPELINE_COMPILE_REQUIRED";
            case VkResult.VK_SUBOPTIMAL_KHR -> "VK_SUBOPTIMAL_KHR";
            case VkResult.VK_SUCCESS -> "VK_SUCCESS";
            case VkResult.VK_THREAD_DONE_KHR -> "VK_THREAD_DONE_KHR";
            case VkResult.VK_THREAD_IDLE_KHR -> "VK_THREAD_IDLE_KHR";
            case VkResult.VK_TIMEOUT -> "VK_TIMEOUT";
            default -> "Unknown VkResult: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkResult() {}
}
