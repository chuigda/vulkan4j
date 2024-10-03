package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkSamplerCreateFlags {
    public static final int VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT = 1;
    public static final int VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT = 2;
    public static final int VK_SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT = 8;
    public static final int VK_SAMPLER_CREATE_NON_SEAMLESS_CUBE_MAP_BIT_EXT = 4;
    public static final int VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM = 16;

    public static String explain(@enumtype(VkSamplerCreateFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT");
        }

        if ((flags & VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT");
        }

        if ((flags & VK_SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT");
        }

        if ((flags & VK_SAMPLER_CREATE_NON_SEAMLESS_CUBE_MAP_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLER_CREATE_NON_SEAMLESS_CUBE_MAP_BIT_EXT");
        }

        if ((flags & VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM");
        }

        return sb.toString();
    }
}
