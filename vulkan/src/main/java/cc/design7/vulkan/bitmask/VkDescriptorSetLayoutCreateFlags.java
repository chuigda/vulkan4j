package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorSetLayoutCreateFlags.html">VkDescriptorSetLayoutCreateFlags</a>
public final class VkDescriptorSetLayoutCreateFlags {
    public static final int DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_EXT = 0x10;
    public static final int DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_EXT = 0x20;
    public static final int DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_EXT = 0x4;
    public static final int DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_NV = 0x80;
    public static final int DESCRIPTOR_SET_LAYOUT_CREATE_PER_STAGE_NV = 0x40;
    public static final int DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR = 0x1;
    public static final int DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL = 0x2;

    public static String explain(@enumtype(VkDescriptorSetLayoutCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_EXT) != 0) {
            detectedFlagBits.add("VK_DESCRIPTOR_SET_LAYOUT_CREATE_DESCRIPTOR_BUFFER_BIT_EXT");
        }
        if ((flags & DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_EXT) != 0) {
            detectedFlagBits.add("VK_DESCRIPTOR_SET_LAYOUT_CREATE_EMBEDDED_IMMUTABLE_SAMPLERS_BIT_EXT");
        }
        if ((flags & DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_EXT) != 0) {
            detectedFlagBits.add("VK_DESCRIPTOR_SET_LAYOUT_CREATE_HOST_ONLY_POOL_BIT_EXT");
        }
        if ((flags & DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_NV) != 0) {
            detectedFlagBits.add("VK_DESCRIPTOR_SET_LAYOUT_CREATE_INDIRECT_BINDABLE_BIT_NV");
        }
        if ((flags & DESCRIPTOR_SET_LAYOUT_CREATE_PER_STAGE_NV) != 0) {
            detectedFlagBits.add("VK_DESCRIPTOR_SET_LAYOUT_CREATE_PER_STAGE_BIT_NV");
        }
        if ((flags & DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR) != 0) {
            detectedFlagBits.add("VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT");
        }
        if ((flags & DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL) != 0) {
            detectedFlagBits.add("VK_DESCRIPTOR_SET_LAYOUT_CREATE_UPDATE_AFTER_BIND_POOL_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDescriptorSetLayoutCreateFlags() {}
}
