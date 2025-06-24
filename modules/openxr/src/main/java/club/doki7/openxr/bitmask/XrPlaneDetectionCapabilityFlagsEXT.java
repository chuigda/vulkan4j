package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectionCapabilityFlagsEXT.html"><code>XrPlaneDetectionCapabilityFlagsEXT</code></a>
public final class XrPlaneDetectionCapabilityFlagsEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_CAPABILITY_ORIENTATION_BIT_EXT.html"><code>XR_PLANE_DETECTION_CAPABILITY_ORIENTATION_BIT_EXT</code></a>
    public static final int ORIENTATION = 0x6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_CAPABILITY_PLANE_DETECTION_BIT_EXT.html"><code>XR_PLANE_DETECTION_CAPABILITY_PLANE_DETECTION_BIT_EXT</code></a>
    public static final int PLANE_DETECTION = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_CAPABILITY_PLANE_HOLES_BIT_EXT.html"><code>XR_PLANE_DETECTION_CAPABILITY_PLANE_HOLES_BIT_EXT</code></a>
    public static final int PLANE_HOLES = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_CEILING_BIT_EXT.html"><code>XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_CEILING_BIT_EXT</code></a>
    public static final int SEMANTIC_CEILING = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_FLOOR_BIT_EXT.html"><code>XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_FLOOR_BIT_EXT</code></a>
    public static final int SEMANTIC_FLOOR = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_PLATFORM_BIT_EXT.html"><code>XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_PLATFORM_BIT_EXT</code></a>
    public static final int SEMANTIC_PLATFORM = 0x5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_WALL_BIT_EXT.html"><code>XR_PLANE_DETECTION_CAPABILITY_SEMANTIC_WALL_BIT_EXT</code></a>
    public static final int SEMANTIC_WALL = 0x4;

    public static String explain(@Bitmask(XrPlaneDetectionCapabilityFlagsEXT.class) int flags) {
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
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPlaneDetectionCapabilityFlagsEXT() {}
}
