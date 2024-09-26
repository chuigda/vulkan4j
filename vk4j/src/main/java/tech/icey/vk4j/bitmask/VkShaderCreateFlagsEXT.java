package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkShaderCreateFlagsEXT {
    public static final int VK_SHADER_CREATE_LINK_STAGE_BIT_EXT = 1;
    public static final int VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT = 2;
    public static final int VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT = 4;
    public static final int VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT = 8;
    public static final int VK_SHADER_CREATE_DISPATCH_BASE_BIT_EXT = 16;
    public static final int VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT = 32;
    public static final int VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT = 64;

    public static String explain(@enumtype(VkShaderCreateFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SHADER_CREATE_LINK_STAGE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_CREATE_LINK_STAGE_BIT_EXT");
        }

        if ((flags & VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_CREATE_ALLOW_VARYING_SUBGROUP_SIZE_BIT_EXT");
        }

        if ((flags & VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_CREATE_REQUIRE_FULL_SUBGROUPS_BIT_EXT");
        }

        if ((flags & VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_CREATE_NO_TASK_SHADER_BIT_EXT");
        }

        if ((flags & VK_SHADER_CREATE_DISPATCH_BASE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_CREATE_DISPATCH_BASE_BIT_EXT");
        }

        if ((flags & VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_CREATE_FRAGMENT_SHADING_RATE_ATTACHMENT_BIT_EXT");
        }

        if ((flags & VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SHADER_CREATE_FRAGMENT_DENSITY_MAP_ATTACHMENT_BIT_EXT");
        }

        return sb.toString();
    }
}
