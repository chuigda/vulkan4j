package tech.icey.vk4j.bitmask;

import tech.icey.vk4j.annotation.enumtype;

public final class VkDeviceAddressBindingFlagsEXT {
    public static final int VK_DEVICE_ADDRESS_BINDING_INTERNAL_OBJECT_BIT_EXT = 1;

    public static String explain(@enumtype(VkDeviceAddressBindingFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_DEVICE_ADDRESS_BINDING_INTERNAL_OBJECT_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_DEVICE_ADDRESS_BINDING_INTERNAL_OBJECT_BIT_EXT");
        }

        return sb.toString();
    }
}
