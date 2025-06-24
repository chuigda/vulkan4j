package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGlobalDimmerFrameEndInfoFlagsML.html"><code>XrGlobalDimmerFrameEndInfoFlagsML</code></a>
public final class XrGlobalDimmerFrameEndInfoFlagsML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_GLOBAL_DIMMER_FRAME_END_INFO_ENABLED_BIT_ML.html"><code>XR_GLOBAL_DIMMER_FRAME_END_INFO_ENABLED_BIT_ML</code></a>
    public static final int ENABLED = 0x0;

    public static String explain(@Bitmask(XrGlobalDimmerFrameEndInfoFlagsML.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ENABLED) != 0) {
            detectedFlagBits.add("XR_GLOBAL_DIMMER_FRAME_END_INFO_ENABLED_BIT_ML");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrGlobalDimmerFrameEndInfoFlagsML() {}
}
