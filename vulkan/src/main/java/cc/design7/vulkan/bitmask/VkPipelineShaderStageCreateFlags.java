package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineShaderStageCreateFlags.html">VkPipelineShaderStageCreateFlags</a>
public final class VkPipelineShaderStageCreateFlags {
    public static final int ALLOW_VARYING_SUBGROUP_SIZE = 0x1;
    public static final int REQUIRE_FULL_SUBGROUPS = 0x2;

    public static String explain(@enumtype(VkPipelineShaderStageCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ALLOW_VARYING_SUBGROUP_SIZE) != 0) {
            detectedFlagBits.add("VK_PIPELINE_SHADER_STAGE_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT");
        }
        if ((flags & REQUIRE_FULL_SUBGROUPS) != 0) {
            detectedFlagBits.add("VK_PIPELINE_SHADER_STAGE_CREATE_REQUIRE_FULL_SUBGROUPS_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkPipelineShaderStageCreateFlags() {}
}
