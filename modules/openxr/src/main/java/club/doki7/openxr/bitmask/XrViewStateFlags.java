package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViewStateFlags.html"><code>XrViewStateFlags</code></a>
public final class XrViewStateFlags {
    public static final long ORIENTATION_TRACKED = 0x4L;
    public static final long ORIENTATION_VALID = 0x1L;
    public static final long POSITION_TRACKED = 0x8L;
    public static final long POSITION_VALID = 0x2L;

    public static String explain(@Bitmask(XrViewStateFlags.class) long flags) {
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
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrViewStateFlags() {}
}
