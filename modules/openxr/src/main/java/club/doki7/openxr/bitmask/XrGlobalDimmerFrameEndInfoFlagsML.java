package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrGlobalDimmerFrameEndInfoFlagsML.html"><code>XrGlobalDimmerFrameEndInfoFlagsML</code></a>
public final class XrGlobalDimmerFrameEndInfoFlagsML {
    public static final long ENABLED = 0x1L;

    public static String explain(@Bitmask(XrGlobalDimmerFrameEndInfoFlagsML.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ENABLED) != 0) {
            detectedFlagBits.add("XR_GLOBAL_DIMMER_FRAME_END_INFO_ENABLED_BIT_ML");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrGlobalDimmerFrameEndInfoFlagsML() {}
}
