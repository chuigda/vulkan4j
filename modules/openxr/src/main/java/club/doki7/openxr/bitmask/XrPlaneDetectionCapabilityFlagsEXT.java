package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectionCapabilityFlagsEXT.html"><code>XrPlaneDetectionCapabilityFlagsEXT</code></a>
public final class XrPlaneDetectionCapabilityFlagsEXT {
    public static final long ORIENTATION = 0x40L;
    public static final long PLANE_DETECTION = 0x1L;
    public static final long PLANE_HOLES = 0x2L;
    public static final long SEMANTIC_CEILING = 0x4L;
    public static final long SEMANTIC_FLOOR = 0x8L;
    public static final long SEMANTIC_PLATFORM = 0x20L;
    public static final long SEMANTIC_WALL = 0x10L;

    public static String explain(@Bitmask(XrPlaneDetectionCapabilityFlagsEXT.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ORIENTATION) != 0) {
            detectedFlagBits.add("XR_PLANE_DETECTION_CAPABILITY_ORIENTATION_BIT_EXT");
        }
        if ((flags & PLANE_DETECTION) != 0) {
            detectedFlagBits.add("XR_PLANE_DETECTION_CAPABILITY_PLANE_DETECTION_BIT_EXT");
        }
        if ((flags & PLANE_HOLES) != 0) {
            detectedFlagBits.add("XR_PLANE_DETECTION_CAPABILITY_PLANE_HOLES_BIT_EXT");
        }
        if ((flags & SEMANTIC_CEILING) != 0) {
            detectedFlagBits.add("XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_CEILING_BIT_EXT");
        }
        if ((flags & SEMANTIC_FLOOR) != 0) {
            detectedFlagBits.add("XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_FLOOR_BIT_EXT");
        }
        if ((flags & SEMANTIC_PLATFORM) != 0) {
            detectedFlagBits.add("XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_PLATFORM_BIT_EXT");
        }
        if ((flags & SEMANTIC_WALL) != 0) {
            detectedFlagBits.add("XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_WALL_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPlaneDetectionCapabilityFlagsEXT() {}
}
