package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkGeometryFlagsKHR.html">VkGeometryFlagsKHR</a>
public final class GeometryFlagsKHR {
    public static final int NO_DUPLICATE_ANY_HIT_INVOCATION = 0x2;
    public static final int OPAQUE = 0x1;

    public static String explain(@enumtype(GeometryFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & NO_DUPLICATE_ANY_HIT_INVOCATION) != 0) {
            detectedFlagBits.add("VK_GEOMETRY_NO_DUPLICATE_ANY_HIT_INVOCATION_BIT_KHR");
        }
        if ((flags & OPAQUE) != 0) {
            detectedFlagBits.add("VK_GEOMETRY_OPAQUE_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private GeometryFlagsKHR() {}
}
