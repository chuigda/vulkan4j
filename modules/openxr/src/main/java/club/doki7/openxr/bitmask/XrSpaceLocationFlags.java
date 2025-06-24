package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceLocationFlags.html"><code>XrSpaceLocationFlags</code></a>
public final class XrSpaceLocationFlags {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_LOCATION_ORIENTATION_TRACKED_BIT.html"><code>XR_SPACE_LOCATION_ORIENTATION_TRACKED_BIT</code></a>
    public static final int ORIENTATION_TRACKED = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_LOCATION_ORIENTATION_VALID_BIT.html"><code>XR_SPACE_LOCATION_ORIENTATION_VALID_BIT</code></a>
    public static final int ORIENTATION_VALID = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_LOCATION_POSITION_TRACKED_BIT.html"><code>XR_SPACE_LOCATION_POSITION_TRACKED_BIT</code></a>
    public static final int POSITION_TRACKED = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_LOCATION_POSITION_VALID_BIT.html"><code>XR_SPACE_LOCATION_POSITION_VALID_BIT</code></a>
    public static final int POSITION_VALID = 0x1;

    public static String explain(@Bitmask(XrSpaceLocationFlags.class) int flags) {
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
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpaceLocationFlags() {}
}
