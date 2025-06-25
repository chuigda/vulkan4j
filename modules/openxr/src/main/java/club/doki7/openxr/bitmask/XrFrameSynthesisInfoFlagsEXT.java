package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameSynthesisInfoFlagsEXT.html"><code>XrFrameSynthesisInfoFlagsEXT</code></a>
public final class XrFrameSynthesisInfoFlagsEXT {
    public static final long REQUEST_RELAXED_FRAME_INTERVAL = 0x2L;
    public static final long USE_2D_MOTION_VECTOR = 0x1L;

    public static String explain(@Bitmask(XrFrameSynthesisInfoFlagsEXT.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & REQUEST_RELAXED_FRAME_INTERVAL) != 0) {
            detectedFlagBits.add("XR_FRAME_SYNTHESIS_INFO_REQUEST_RELAXED_FRAME_INTERVAL_BIT_EXT");
        }
        if ((flags & USE_2D_MOTION_VECTOR) != 0) {
            detectedFlagBits.add("XR_FRAME_SYNTHESIS_INFO_USE_2D_MOTION_VECTOR_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFrameSynthesisInfoFlagsEXT() {}
}
