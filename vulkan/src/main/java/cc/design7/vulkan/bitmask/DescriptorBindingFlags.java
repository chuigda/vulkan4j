package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorBindingFlags.html">VkDescriptorBindingFlags</a>
public final class DescriptorBindingFlags {
    public static final int PARTIALLY_BOUND = 0x4;
    public static final int UPDATE_AFTER_BIND = 0x1;
    public static final int UPDATE_UNUSED_WHILE_PENDING = 0x2;
    public static final int VARIABLE_DESCRIPTOR_COUNT = 0x8;
    
    public static String explain(@enumtype(DescriptorBindingFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PARTIALLY_BOUND) != 0) {
            detectedFlagBits.add("VK_DESCRIPTOR_BINDING_PARTIALLY_BOUND_BIT");
        }
        if ((flags & UPDATE_AFTER_BIND) != 0) {
            detectedFlagBits.add("VK_DESCRIPTOR_BINDING_UPDATE_AFTER_BIND_BIT");
        }
        if ((flags & UPDATE_UNUSED_WHILE_PENDING) != 0) {
            detectedFlagBits.add("VK_DESCRIPTOR_BINDING_UPDATE_UNUSED_WHILE_PENDING_BIT");
        }
        if ((flags & VARIABLE_DESCRIPTOR_COUNT) != 0) {
            detectedFlagBits.add("VK_DESCRIPTOR_BINDING_VARIABLE_DESCRIPTOR_COUNT_BIT");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private DescriptorBindingFlags() {}
}
