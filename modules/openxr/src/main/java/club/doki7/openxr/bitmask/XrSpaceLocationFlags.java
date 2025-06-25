package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceLocationFlags.html"><code>XrSpaceLocationFlags</code></a>
public final class XrSpaceLocationFlags {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_LOCATION_ORIENTATION_TRACKED_BIT.html"><code>XR_SPACE_LOCATION_ORIENTATION_TRACKED_BIT</code></a>
    public static final long ORIENTATION_TRACKED = 0x4L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_LOCATION_ORIENTATION_VALID_BIT.html"><code>XR_SPACE_LOCATION_ORIENTATION_VALID_BIT</code></a>
    public static final long ORIENTATION_VALID = 0x1L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_LOCATION_POSITION_TRACKED_BIT.html"><code>XR_SPACE_LOCATION_POSITION_TRACKED_BIT</code></a>
    public static final long POSITION_TRACKED = 0x8L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_LOCATION_POSITION_VALID_BIT.html"><code>XR_SPACE_LOCATION_POSITION_VALID_BIT</code></a>
    public static final long POSITION_VALID = 0x2L;

    public static String explain(@Bitmask(XrSpaceLocationFlags.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ORIENTATION_TRACKED) != 0) {
            detectedFlagBits.add("XR_SPACE_LOCATION_ORIENTATION_TRACKED_BIT");
        }
        if ((flags & ORIENTATION_VALID) != 0) {
            detectedFlagBits.add("XR_SPACE_LOCATION_ORIENTATION_VALID_BIT");
        }
        if ((flags & POSITION_TRACKED) != 0) {
            detectedFlagBits.add("XR_SPACE_LOCATION_POSITION_TRACKED_BIT");
        }
        if ((flags & POSITION_VALID) != 0) {
            detectedFlagBits.add("XR_SPACE_LOCATION_POSITION_VALID_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpaceLocationFlags() {}
}
