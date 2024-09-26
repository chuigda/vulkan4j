package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkDescriptorBindingFlags {
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT = 1;
    public static final int VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT = 2;
    public static final int VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT = 4;
    public static final int VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT = 8;

    public static String explain(@enumtype(VkDescriptorBindingFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT");
        }

        if ((flags & VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT");
        }

        if ((flags & VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT");
        }

        if ((flags & VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT");
        }

        return sb.toString();
    }
}
