package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkTileShadingRenderPassFlagsQCOM.html">VkTileShadingRenderPassFlagsQCOM</a>
public final class VkTileShadingRenderPassFlagsQCOM {
    public static final int TILE_SHADING_RENDER_PASS_ENABLE = 0x1;
    public static final int TILE_SHADING_RENDER_PASS_PER_TILE_EXECUTION = 0x2;

    public static String explain(@enumtype(VkTileShadingRenderPassFlagsQCOM.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & TILE_SHADING_RENDER_PASS_ENABLE) != 0) {
            detectedFlagBits.add("VK_TILE_SHADING_RENDER_PASS_ENABLE_BIT_QCOM");
        }
        if ((flags & TILE_SHADING_RENDER_PASS_PER_TILE_EXECUTION) != 0) {
            detectedFlagBits.add("VK_TILE_SHADING_RENDER_PASS_PER_TILE_EXECUTION_BIT_QCOM");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkTileShadingRenderPassFlagsQCOM() {}
}
