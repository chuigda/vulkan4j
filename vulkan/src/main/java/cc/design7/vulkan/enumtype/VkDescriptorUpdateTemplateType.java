package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorUpdateTemplateType.html">VkDescriptorUpdateTemplateType</a>
public final class VkDescriptorUpdateTemplateType {
    public static final int DESCRIPTOR_SET = 0;
    public static final int PUSH_DESCRIPTORS = [1];

    public static String explain(@enumtype(VkDescriptorUpdateTemplateType.class) int value) {
        return switch (value) {
            case VkDescriptorUpdateTemplateType.DESCRIPTOR_SET -> "VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_DESCRIPTOR_SET";
            case VkDescriptorUpdateTemplateType.PUSH_DESCRIPTORS -> "VK_DESCRIPTOR_UPDATE_TEMPLATE_TYPE_PUSH_DESCRIPTORS";
            default -> "Unknown VkDescriptorUpdateTemplateType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkDescriptorUpdateTemplateType() {}
}
