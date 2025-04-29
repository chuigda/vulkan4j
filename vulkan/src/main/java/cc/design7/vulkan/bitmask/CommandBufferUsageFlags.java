package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferUsageFlags.html">VkCommandBufferUsageFlags</a>
public final class CommandBufferUsageFlags {
    public static final int ONE_TIME_SUBMIT = 0x1;
    public static final int RENDER_PASS_CONTINUE = 0x2;
    public static final int SIMULTANEOUS_USE = 0x4;

    public static String explain(@enumtype(CommandBufferUsageFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ONE_TIME_SUBMIT) != 0) {
            detectedFlagBits.add("VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT");
        }
        if ((flags & RENDER_PASS_CONTINUE) != 0) {
            detectedFlagBits.add("VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT");
        }
        if ((flags & SIMULTANEOUS_USE) != 0) {
            detectedFlagBits.add("VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CommandBufferUsageFlags() {}
}
