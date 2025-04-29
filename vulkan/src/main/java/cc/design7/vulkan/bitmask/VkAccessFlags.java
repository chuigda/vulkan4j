package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAccessFlags.html">VkAccessFlags</a>
public final class VkAccessFlags {
    public static final int ACCESS_ACCELERATION_STRUCTURE_READ_KHR = 0x200000;
    public static final int ACCESS_ACCELERATION_STRUCTURE_WRITE_KHR = 0x400000;
    public static final int ACCESS_COLOR_ATTACHMENT_READ = 0x80;
    public static final int ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_EXT = 0x80000;
    public static final int ACCESS_COLOR_ATTACHMENT_WRITE = 0x100;
    public static final int ACCESS_COMMAND_PREPROCESS_READ_EXT = 0x20000;
    public static final int ACCESS_COMMAND_PREPROCESS_WRITE_EXT = 0x40000;
    public static final int ACCESS_CONDITIONAL_RENDERING_READ_EXT = 0x100000;
    public static final int ACCESS_DEPTH_STENCIL_ATTACHMENT_READ = 0x200;
    public static final int ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE = 0x400;
    public static final int ACCESS_FRAGMENT_DENSITY_MAP_READ_EXT = 0x1000000;
    public static final int ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_KHR = 0x800000;
    public static final int ACCESS_HOST_READ = 0x2000;
    public static final int ACCESS_HOST_WRITE = 0x4000;
    public static final int ACCESS_INDEX_READ = 0x2;
    public static final int ACCESS_INDIRECT_COMMAND_READ = 0x1;
    public static final int ACCESS_INPUT_ATTACHMENT_READ = 0x10;
    public static final int ACCESS_MEMORY_READ = 0x8000;
    public static final int ACCESS_MEMORY_WRITE = 0x10000;
    public static final int ACCESS_SHADER_READ = 0x20;
    public static final int ACCESS_SHADER_WRITE = 0x40;
    public static final int ACCESS_TRANSFER_READ = 0x800;
    public static final int ACCESS_TRANSFER_WRITE = 0x1000;
    public static final int ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_EXT = 0x4000000;
    public static final int ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_EXT = 0x8000000;
    public static final int ACCESS_TRANSFORM_FEEDBACK_WRITE_EXT = 0x2000000;
    public static final int ACCESS_UNIFORM_READ = 0x8;
    public static final int ACCESS_VERTEX_ATTRIBUTE_READ = 0x4;

    public static String explain(@enumtype(VkAccessFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ACCESS_ACCELERATION_STRUCTURE_READ_KHR) != 0) {
            detectedFlagBits.add("VK_ACCESS_ACCELERATION_STRUCTURE_READ_BIT_KHR");
        }
        if ((flags & ACCESS_ACCELERATION_STRUCTURE_WRITE_KHR) != 0) {
            detectedFlagBits.add("VK_ACCESS_ACCELERATION_STRUCTURE_WRITE_BIT_KHR");
        }
        if ((flags & ACCESS_COLOR_ATTACHMENT_READ) != 0) {
            detectedFlagBits.add("VK_ACCESS_COLOR_ATTACHMENT_READ_BIT");
        }
        if ((flags & ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_EXT) != 0) {
            detectedFlagBits.add("VK_ACCESS_COLOR_ATTACHMENT_READ_NONCOHERENT_BIT_EXT");
        }
        if ((flags & ACCESS_COLOR_ATTACHMENT_WRITE) != 0) {
            detectedFlagBits.add("VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT");
        }
        if ((flags & ACCESS_COMMAND_PREPROCESS_READ_EXT) != 0) {
            detectedFlagBits.add("VK_ACCESS_COMMAND_PREPROCESS_READ_BIT_EXT");
        }
        if ((flags & ACCESS_COMMAND_PREPROCESS_WRITE_EXT) != 0) {
            detectedFlagBits.add("VK_ACCESS_COMMAND_PREPROCESS_WRITE_BIT_EXT");
        }
        if ((flags & ACCESS_CONDITIONAL_RENDERING_READ_EXT) != 0) {
            detectedFlagBits.add("VK_ACCESS_CONDITIONAL_RENDERING_READ_BIT_EXT");
        }
        if ((flags & ACCESS_DEPTH_STENCIL_ATTACHMENT_READ) != 0) {
            detectedFlagBits.add("VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_READ_BIT");
        }
        if ((flags & ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE) != 0) {
            detectedFlagBits.add("VK_ACCESS_DEPTH_STENCIL_ATTACHMENT_WRITE_BIT");
        }
        if ((flags & ACCESS_FRAGMENT_DENSITY_MAP_READ_EXT) != 0) {
            detectedFlagBits.add("VK_ACCESS_FRAGMENT_DENSITY_MAP_READ_BIT_EXT");
        }
        if ((flags & ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_KHR) != 0) {
            detectedFlagBits.add("VK_ACCESS_FRAGMENT_SHADING_RATE_ATTACHMENT_READ_BIT_KHR");
        }
        if ((flags & ACCESS_HOST_READ) != 0) {
            detectedFlagBits.add("VK_ACCESS_HOST_READ_BIT");
        }
        if ((flags & ACCESS_HOST_WRITE) != 0) {
            detectedFlagBits.add("VK_ACCESS_HOST_WRITE_BIT");
        }
        if ((flags & ACCESS_INDEX_READ) != 0) {
            detectedFlagBits.add("VK_ACCESS_INDEX_READ_BIT");
        }
        if ((flags & ACCESS_INDIRECT_COMMAND_READ) != 0) {
            detectedFlagBits.add("VK_ACCESS_INDIRECT_COMMAND_READ_BIT");
        }
        if ((flags & ACCESS_INPUT_ATTACHMENT_READ) != 0) {
            detectedFlagBits.add("VK_ACCESS_INPUT_ATTACHMENT_READ_BIT");
        }
        if ((flags & ACCESS_MEMORY_READ) != 0) {
            detectedFlagBits.add("VK_ACCESS_MEMORY_READ_BIT");
        }
        if ((flags & ACCESS_MEMORY_WRITE) != 0) {
            detectedFlagBits.add("VK_ACCESS_MEMORY_WRITE_BIT");
        }
        if ((flags & ACCESS_SHADER_READ) != 0) {
            detectedFlagBits.add("VK_ACCESS_SHADER_READ_BIT");
        }
        if ((flags & ACCESS_SHADER_WRITE) != 0) {
            detectedFlagBits.add("VK_ACCESS_SHADER_WRITE_BIT");
        }
        if ((flags & ACCESS_TRANSFER_READ) != 0) {
            detectedFlagBits.add("VK_ACCESS_TRANSFER_READ_BIT");
        }
        if ((flags & ACCESS_TRANSFER_WRITE) != 0) {
            detectedFlagBits.add("VK_ACCESS_TRANSFER_WRITE_BIT");
        }
        if ((flags & ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_EXT) != 0) {
            detectedFlagBits.add("VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_READ_BIT_EXT");
        }
        if ((flags & ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_EXT) != 0) {
            detectedFlagBits.add("VK_ACCESS_TRANSFORM_FEEDBACK_COUNTER_WRITE_BIT_EXT");
        }
        if ((flags & ACCESS_TRANSFORM_FEEDBACK_WRITE_EXT) != 0) {
            detectedFlagBits.add("VK_ACCESS_TRANSFORM_FEEDBACK_WRITE_BIT_EXT");
        }
        if ((flags & ACCESS_UNIFORM_READ) != 0) {
            detectedFlagBits.add("VK_ACCESS_UNIFORM_READ_BIT");
        }
        if ((flags & ACCESS_VERTEX_ATTRIBUTE_READ) != 0) {
            detectedFlagBits.add("VK_ACCESS_VERTEX_ATTRIBUTE_READ_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkAccessFlags() {}
}
