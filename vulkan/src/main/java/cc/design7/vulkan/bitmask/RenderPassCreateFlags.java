package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassCreateFlags.html">VkRenderPassCreateFlags</a>
public final class RenderPassCreateFlags {
    public static final int TRANSFORM_QCOM = 0x2;

    public static String explain(@enumtype(RenderPassCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & TRANSFORM_QCOM) != 0) {
            detectedFlagBits.add("VK_RENDER_PASS_CREATE_TRANSFORM_BIT_QCOM");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private RenderPassCreateFlags() {}
}
