package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkExportMetalObjectTypeFlagsEXT {
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT = 1;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT = 2;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT = 4;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT = 8;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT = 16;
    public static final int VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT = 32;

    public static String explain(@enumtype(VkExportMetalObjectTypeFlagsEXT.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT");
        }

        if ((flags & VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT");
        }

        if ((flags & VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT");
        }

        if ((flags & VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT");
        }

        if ((flags & VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT");
        }

        if ((flags & VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT");
        }

        return sb.toString();
    }
}
