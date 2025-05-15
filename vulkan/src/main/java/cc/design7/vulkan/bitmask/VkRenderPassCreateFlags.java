package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassCreateFlags.html"><code>VkRenderPassCreateFlags</code></a>
public final class VkRenderPassCreateFlags {
    public static final int TRANSFORM_QCOM = 0x2;

    public static String explain(@enumtype(VkRenderPassCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & TRANSFORM_QCOM) != 0) {
            detectedFlagBits.add("VK_RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkRenderPassCreateFlags() {}
}
