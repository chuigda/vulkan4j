package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViewStateFlags.html"><code>XrViewStateFlags</code></a>
public final class XrViewStateFlags {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIEW_STATE_ORIENTATION_TRACKED_BIT.html"><code>XR_VIEW_STATE_ORIENTATION_TRACKED_BIT</code></a>
    public static final int ORIENTATION_TRACKED = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIEW_STATE_ORIENTATION_VALID_BIT.html"><code>XR_VIEW_STATE_ORIENTATION_VALID_BIT</code></a>
    public static final int ORIENTATION_VALID = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIEW_STATE_POSITION_TRACKED_BIT.html"><code>XR_VIEW_STATE_POSITION_TRACKED_BIT</code></a>
    public static final int POSITION_TRACKED = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIEW_STATE_POSITION_VALID_BIT.html"><code>XR_VIEW_STATE_POSITION_VALID_BIT</code></a>
    public static final int POSITION_VALID = 0x1;

    public static String explain(@Bitmask(XrViewStateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ORIENTATION_TRACKED) != 0) {
            detectedFlagBits.add("XR_VIEW_STATE_ORIENTATION_TRACKED_BIT");
        }
        if ((flags & ORIENTATION_VALID) != 0) {
            detectedFlagBits.add("XR_VIEW_STATE_ORIENTATION_VALID_BIT");
        }
        if ((flags & POSITION_TRACKED) != 0) {
            detectedFlagBits.add("XR_VIEW_STATE_POSITION_TRACKED_BIT");
        }
        if ((flags & POSITION_VALID) != 0) {
            detectedFlagBits.add("XR_VIEW_STATE_POSITION_VALID_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrViewStateFlags() {}
}
