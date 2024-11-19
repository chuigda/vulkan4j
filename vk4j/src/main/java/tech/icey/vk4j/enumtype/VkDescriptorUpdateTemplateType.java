package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkDescriptorUpdateTemplateType {
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET = 0;
    public static final int VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR = 1;

    public static String explain(@enumtype(VkDescriptorUpdateTemplateType.class) int value) {
        return switch (value) {
            case VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET -> "VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET";
            case VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR -> "VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS_KHR";
            default -> "Unknown";
        };
    }
}
