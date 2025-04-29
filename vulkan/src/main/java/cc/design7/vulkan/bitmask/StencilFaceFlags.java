package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkStencilFaceFlags.html">VkStencilFaceFlags</a>
public final class StencilFaceFlags {
    public static final int BACK = 0x2;
    public static final int FRONT_AND_BACK = 0x3;
    public static final int FRONT = 0x1;
    
    public static String explain(@enumtype(StencilFaceFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & BACK) != 0) {
            detectedFlagBits.add("VK_STENCIL_FACE_BACK_BIT");
        }
        if ((flags & FRONT_AND_BACK) != 0) {
            detectedFlagBits.add("VK_STENCIL_FACE_FRONT_AND_BACK");
        }
        if ((flags & FRONT) != 0) {
            detectedFlagBits.add("VK_STENCIL_FACE_FRONT_BIT");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private StencilFaceFlags() {}
}
