package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkPipelineCreationFeedbackFlags {
    public static final int VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT = 1;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT = 2;
    public static final int VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT = 4;

    public static String explain(@enumtype(VkPipelineCreationFeedbackFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATION_FEEDBACK_VALID_BIT");
        }

        if ((flags & VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATION_FEEDBACK_APPLICATION_PIPELINE_CACHE_HIT_BIT");
        }

        if ((flags & VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_PIPELINE_CREATION_FEEDBACK_BASE_PIPELINE_ACCELERATION_BIT");
        }

        return sb.toString();
    }
}
