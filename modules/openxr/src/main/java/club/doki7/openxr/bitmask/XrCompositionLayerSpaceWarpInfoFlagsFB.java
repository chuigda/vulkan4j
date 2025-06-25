package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerSpaceWarpInfoFlagsFB.html"><code>XrCompositionLayerSpaceWarpInfoFlagsFB</code></a>
public final class XrCompositionLayerSpaceWarpInfoFlagsFB {
    public static final long FRAME_SKIP = 0x1L;

    public static String explain(@Bitmask(XrCompositionLayerSpaceWarpInfoFlagsFB.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & FRAME_SKIP) != 0) {
            detectedFlagBits.add("XR_COMPOSITION_LAYER_SPACE_WARP_INFO_FRAME_SKIP_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrCompositionLayerSpaceWarpInfoFlagsFB() {}
}
