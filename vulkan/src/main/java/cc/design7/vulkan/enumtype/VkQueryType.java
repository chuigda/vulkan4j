package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryType.html">VkQueryType</a>
public final class VkQueryType {
    public static final int OCCLUSION = 0;
    public static final int PIPELINE_STATISTICS = 1;
    public static final int TIMESTAMP = 2;
    public static final int RESULT_STATUS_ONLY_KHR = 1000023000;
    public static final int TRANSFORM_FEEDBACK_STREAM_EXT = 1000028004;
    public static final int PERFORMANCE_QUERY_KHR = 1000116000;
    public static final int ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR = 1000150000;
    public static final int ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR = 1000150001;
    public static final int ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV = 1000165000;
    public static final int PERFORMANCE_QUERY_INTEL = 1000210000;
    public static final int VIDEO_ENCODE_FEEDBACK_KHR = 1000299000;
    public static final int MESH_PRIMITIVES_GENERATED_EXT = 1000328000;
    public static final int PRIMITIVES_GENERATED_EXT = 1000382000;
    public static final int ACCELERATION_STRUCTURE_SERIALIZATION_BOTTOM_LEVEL_POINTERS_KHR = 1000386000;
    public static final int ACCELERATION_STRUCTURE_SIZE_KHR = 1000386001;
    public static final int MICROMAP_SERIALIZATION_SIZE_EXT = 1000396000;
    public static final int MICROMAP_COMPACTED_SIZE_EXT = 1000396001;

    public static String explain(@enumtype(VkQueryType.class) int value) {
        return switch (value) {
            case VkQueryType.ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR -> "VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_KHR";
            case VkQueryType.ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV -> "VK_QUERY_TYPE_ACCELERATION_STRUCTURE_COMPACTED_SIZE_NV";
            case VkQueryType.ACCELERATION_STRUCTURE_SERIALIZATION_BOTTOM_LEVEL_POINTERS_KHR -> "VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_BOTTOM_LEVEL_POINTERS_KHR";
            case VkQueryType.ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR -> "VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SERIALIZATION_SIZE_KHR";
            case VkQueryType.ACCELERATION_STRUCTURE_SIZE_KHR -> "VK_QUERY_TYPE_ACCELERATION_STRUCTURE_SIZE_KHR";
            case VkQueryType.MESH_PRIMITIVES_GENERATED_EXT -> "VK_QUERY_TYPE_MESH_PRIMITIVES_GENERATED_EXT";
            case VkQueryType.MICROMAP_COMPACTED_SIZE_EXT -> "VK_QUERY_TYPE_MICROMAP_COMPACTED_SIZE_EXT";
            case VkQueryType.MICROMAP_SERIALIZATION_SIZE_EXT -> "VK_QUERY_TYPE_MICROMAP_SERIALIZATION_SIZE_EXT";
            case VkQueryType.OCCLUSION -> "VK_QUERY_TYPE_OCCLUSION";
            case VkQueryType.PERFORMANCE_QUERY_INTEL -> "VK_QUERY_TYPE_PERFORMANCE_QUERY_INTEL";
            case VkQueryType.PERFORMANCE_QUERY_KHR -> "VK_QUERY_TYPE_PERFORMANCE_QUERY_KHR";
            case VkQueryType.PIPELINE_STATISTICS -> "VK_QUERY_TYPE_PIPELINE_STATISTICS";
            case VkQueryType.PRIMITIVES_GENERATED_EXT -> "VK_QUERY_TYPE_PRIMITIVES_GENERATED_EXT";
            case VkQueryType.RESULT_STATUS_ONLY_KHR -> "VK_QUERY_TYPE_RESULT_STATUS_ONLY_KHR";
            case VkQueryType.TIMESTAMP -> "VK_QUERY_TYPE_TIMESTAMP";
            case VkQueryType.TRANSFORM_FEEDBACK_STREAM_EXT -> "VK_QUERY_TYPE_TRANSFORM_FEEDBACK_STREAM_EXT";
            case VkQueryType.VIDEO_ENCODE_FEEDBACK_KHR -> "VK_QUERY_TYPE_VIDEO_ENCODE_FEEDBACK_KHR";
            default -> "Unknown VkQueryType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkQueryType() {}
}
