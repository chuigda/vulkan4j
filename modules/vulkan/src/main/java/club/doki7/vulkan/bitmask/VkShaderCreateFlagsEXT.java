package club.doki7.vulkan.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkShaderCreateFlagsEXT.html"><code>VkShaderCreateFlagsEXT</code></a>
public final class VkShaderCreateFlagsEXT {
    public static final int ALLOW_VARYING_SUBGROUP_SIZE = 0x2;
    public static final int DISPATCH_BASE = 0x10;
    public static final int FRAGMENT_DENSITY_MAP_ATTACHMENT = 0x40;
    public static final int FRAGMENT_SHADING_RATE_ATTACHMENT = 0x20;
    public static final int INDIRECT_BINDABLE = 0x80;
    public static final int LINK_STAGE = 0x1;
    public static final int NO_TASK_SHADER = 0x8;
    public static final int REQUIRE_FULL_SUBGROUPS = 0x4;

    public static String explain(@EnumType(VkShaderCreateFlagsEXT.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ALLOW_VARYING_SUBGROUP_SIZE) != 0) {
            detectedFlagBits.add("VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT");
        }
        if ((flags & DISPATCH_BASE) != 0) {
            detectedFlagBits.add("VK_SHADER_CREATE_DISPATCH_BASE_BIT_EXT");
        }
        if ((flags & FRAGMENT_DENSITY_MAP_ATTACHMENT) != 0) {
            detectedFlagBits.add("VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT");
        }
        if ((flags & FRAGMENT_SHADING_RATE_ATTACHMENT) != 0) {
            detectedFlagBits.add("VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT");
        }
        if ((flags & INDIRECT_BINDABLE) != 0) {
            detectedFlagBits.add("VK_SHADER_CREATE_INDIRECT_BINDABLE_BIT_EXT");
        }
        if ((flags & LINK_STAGE) != 0) {
            detectedFlagBits.add("VK_SHADER_CREATE_LINK_STAGE_BIT_EXT");
        }
        if ((flags & NO_TASK_SHADER) != 0) {
            detectedFlagBits.add("VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT");
        }
        if ((flags & REQUIRE_FULL_SUBGROUPS) != 0) {
            detectedFlagBits.add("VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkShaderCreateFlagsEXT() {}
}
