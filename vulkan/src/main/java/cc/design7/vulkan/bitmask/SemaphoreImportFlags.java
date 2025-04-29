package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSemaphoreImportFlags.html">VkSemaphoreImportFlags</a>
public final class SemaphoreImportFlags {
    public static final int TEMPORARY = 0x1;
    
    public static String explain(@enumtype(SemaphoreImportFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & TEMPORARY) != 0) {
            detectedFlagBits.add("VK_SEMAPHORE_IMPORT_TEMPORARY_BIT");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private SemaphoreImportFlags() {}
}
