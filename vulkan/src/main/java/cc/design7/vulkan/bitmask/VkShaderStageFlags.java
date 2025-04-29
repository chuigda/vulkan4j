package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderStageFlags.html">VkShaderStageFlags</a>
public final class VkShaderStageFlags {
    public static final int SHADER_STAGE_ALL = 0x7fffffff;
    public static final int SHADER_STAGE_ALL_GRAPHICS = 0x1f;
    public static final int SHADER_STAGE_ANY_HIT_KHR = 0x200;
    public static final int SHADER_STAGE_CALLABLE_KHR = 0x2000;
    public static final int SHADER_STAGE_CLOSEST_HIT_KHR = 0x400;
    public static final int SHADER_STAGE_CLUSTER_CULLING_HUAWEI = 0x80000;
    public static final int SHADER_STAGE_COMPUTE = 0x20;
    public static final int SHADER_STAGE_FRAGMENT = 0x10;
    public static final int SHADER_STAGE_GEOMETRY = 0x8;
    public static final int SHADER_STAGE_INTERSECTION_KHR = 0x1000;
    public static final int SHADER_STAGE_MESH_EXT = 0x80;
    public static final int SHADER_STAGE_MISS_KHR = 0x800;
    public static final int SHADER_STAGE_RAYGEN_KHR = 0x100;
    public static final int SHADER_STAGE_SUBPASS_SHADING_HUAWEI = 0x4000;
    public static final int SHADER_STAGE_TASK_EXT = 0x40;
    public static final int SHADER_STAGE_TESSELLATION_CONTROL = 0x2;
    public static final int SHADER_STAGE_TESSELLATION_EVALUATION = 0x4;
    public static final int SHADER_STAGE_VERTEX = 0x1;

    public static String explain(@enumtype(VkShaderStageFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SHADER_STAGE_ALL) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_ALL");
        }
        if ((flags & SHADER_STAGE_ALL_GRAPHICS) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_ALL_GRAPHICS");
        }
        if ((flags & SHADER_STAGE_ANY_HIT_KHR) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_ANY_HIT_BIT_KHR");
        }
        if ((flags & SHADER_STAGE_CALLABLE_KHR) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_CALLABLE_BIT_KHR");
        }
        if ((flags & SHADER_STAGE_CLOSEST_HIT_KHR) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_CLOSEST_HIT_BIT_KHR");
        }
        if ((flags & SHADER_STAGE_CLUSTER_CULLING_HUAWEI) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_CLUSTER_CULLING_BIT_HUAWEI");
        }
        if ((flags & SHADER_STAGE_COMPUTE) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_COMPUTE_BIT");
        }
        if ((flags & SHADER_STAGE_FRAGMENT) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_FRAGMENT_BIT");
        }
        if ((flags & SHADER_STAGE_GEOMETRY) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_GEOMETRY_BIT");
        }
        if ((flags & SHADER_STAGE_INTERSECTION_KHR) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_INTERSECTION_BIT_KHR");
        }
        if ((flags & SHADER_STAGE_MESH_EXT) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_MESH_BIT_EXT");
        }
        if ((flags & SHADER_STAGE_MISS_KHR) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_MISS_BIT_KHR");
        }
        if ((flags & SHADER_STAGE_RAYGEN_KHR) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_RAYGEN_BIT_KHR");
        }
        if ((flags & SHADER_STAGE_SUBPASS_SHADING_HUAWEI) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_SUBPASS_SHADING_BIT_HUAWEI");
        }
        if ((flags & SHADER_STAGE_TASK_EXT) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_TASK_BIT_EXT");
        }
        if ((flags & SHADER_STAGE_TESSELLATION_CONTROL) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_TESSELLATION_CONTROL_BIT");
        }
        if ((flags & SHADER_STAGE_TESSELLATION_EVALUATION) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_TESSELLATION_EVALUATION_BIT");
        }
        if ((flags & SHADER_STAGE_VERTEX) != 0) {
            detectedFlagBits.add("VK_SHADER_STAGE_VERTEX_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkShaderStageFlags() {}
}
