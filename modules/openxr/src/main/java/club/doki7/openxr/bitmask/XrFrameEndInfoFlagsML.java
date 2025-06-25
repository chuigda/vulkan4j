package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameEndInfoFlagsML.html"><code>XrFrameEndInfoFlagsML</code></a>
public final class XrFrameEndInfoFlagsML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FRAME_END_INFO_PROTECTED_BIT_ML.html"><code>XR_FRAME_END_INFO_PROTECTED_BIT_ML</code></a>
    public static final long PROTECTED = 0x1L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FRAME_END_INFO_VIGNETTE_BIT_ML.html"><code>XR_FRAME_END_INFO_VIGNETTE_BIT_ML</code></a>
    public static final long VIGNETTE = 0x2L;

    public static String explain(@Bitmask(XrFrameEndInfoFlagsML.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PROTECTED) != 0) {
            detectedFlagBits.add("XR_FRAME_END_INFO_PROTECTED_BIT_ML");
        }
        if ((flags & VIGNETTE) != 0) {
            detectedFlagBits.add("XR_FRAME_END_INFO_VIGNETTE_BIT_ML");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFrameEndInfoFlagsML() {}
}
