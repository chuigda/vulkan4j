package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMetalObjectTypeFlagsEXT.html">VkExportMetalObjectTypeFlagsEXT</a>
public final class ExportMetalObjectTypeFlagsEXT {
    public static final int METAL_BUFFER = 0x4;
    public static final int METAL_COMMAND_QUEUE = 0x2;
    public static final int METAL_DEVICE = 0x1;
    public static final int METAL_IOSURFACE = 0x10;
    public static final int METAL_SHARED_EVENT = 0x20;
    public static final int METAL_TEXTURE = 0x8;
    
    public static String explain(@enumtype(ExportMetalObjectTypeFlagsEXT.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & METAL_BUFFER) != 0) {
            detectedFlagBits.add("VK_EXPORT_METAL_OBJECT_TYPE_METAL_BUFFER_BIT_EXT");
        }
        if ((flags & METAL_COMMAND_QUEUE) != 0) {
            detectedFlagBits.add("VK_EXPORT_METAL_OBJECT_TYPE_METAL_COMMAND_QUEUE_BIT_EXT");
        }
        if ((flags & METAL_DEVICE) != 0) {
            detectedFlagBits.add("VK_EXPORT_METAL_OBJECT_TYPE_METAL_DEVICE_BIT_EXT");
        }
        if ((flags & METAL_IOSURFACE) != 0) {
            detectedFlagBits.add("VK_EXPORT_METAL_OBJECT_TYPE_METAL_IOSURFACE_BIT_EXT");
        }
        if ((flags & METAL_SHARED_EVENT) != 0) {
            detectedFlagBits.add("VK_EXPORT_METAL_OBJECT_TYPE_METAL_SHARED_EVENT_BIT_EXT");
        }
        if ((flags & METAL_TEXTURE) != 0) {
            detectedFlagBits.add("VK_EXPORT_METAL_OBJECT_TYPE_METAL_TEXTURE_BIT_EXT");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private ExportMetalObjectTypeFlagsEXT() {}
}
