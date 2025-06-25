package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorFlagsEXT.html"><code>XrPlaneDetectorFlagsEXT</code></a>
public final class XrPlaneDetectorFlagsEXT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT.html"><code>XR_PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT</code></a>
    public static final long ENABLE_CONTOUR = 0x1L;

    public static String explain(@Bitmask(XrPlaneDetectorFlagsEXT.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ENABLE_CONTOUR) != 0) {
            detectedFlagBits.add("XR_PLANE_DETECTOR_ENABLE_CONTOUR_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPlaneDetectorFlagsEXT() {}
}
