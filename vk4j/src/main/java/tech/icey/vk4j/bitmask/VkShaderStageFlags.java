package tech.icey.vk4j.bitmask;

public final class VkShaderStageFlags {
    public static final int VK_SHADER_STAGE_VERTEX_BIT = 1;
    public static final int VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT = 2;
    public static final int VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT = 4;
    public static final int VK_SHADER_STAGE_GEOMETRY_BIT = 8;
    public static final int VK_SHADER_STAGE_FRAGMENT_BIT = 16;
    public static final int VK_SHADER_STAGE_COMPUTE_BIT = 32;
    public static final int VK_SHADER_STAGE_ALL_GRAPHICS = 31;
    public static final int VK_SHADER_STAGE_ALL = 2147483647;
    public static final int VK_SHADER_STAGE_RAYGEN_BIT_KHR = 256;
    public static final int VK_SHADER_STAGE_ANY_HIT_BIT_KHR = 512;
    public static final int VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR = 1024;
    public static final int VK_SHADER_STAGE_MISS_BIT_KHR = 2048;
    public static final int VK_SHADER_STAGE_INTERSECTION_BIT_KHR = 4096;
    public static final int VK_SHADER_STAGE_CALLABLE_BIT_KHR = 8192;
    public static final int VK_SHADER_STAGE_TASK_BIT_EXT = 64;
    public static final int VK_SHADER_STAGE_MESH_BIT_EXT = 128;
    public static final int VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI = 16384;
    public static final int VK_SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI = 524288;
}
