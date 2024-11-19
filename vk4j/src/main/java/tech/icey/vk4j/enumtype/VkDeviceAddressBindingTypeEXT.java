package tech.icey.vk4j.enumtype;

import tech.icey.panama.annotation.enumtype;

public final class VkDeviceAddressBindingTypeEXT {
    public static final int VK_DEVICE_ADDRESS_BINDING_TYPE_BIND_EXT = 0;
    public static final int VK_DEVICE_ADDRESS_BINDING_TYPE_UNBIND_EXT = 1;

    public static String explain(@enumtype(VkDeviceAddressBindingTypeEXT.class) int value) {
        return switch (value) {
            case VK_DEVICE_ADDRESS_BINDING_TYPE_BIND_EXT -> "VK_DEVICE_ADDRESS_BINDING_TYPE_BIND_EXT";
            case VK_DEVICE_ADDRESS_BINDING_TYPE_UNBIND_EXT -> "VK_DEVICE_ADDRESS_BINDING_TYPE_UNBIND_EXT";
            default -> "Unknown";
        };
    }
}
