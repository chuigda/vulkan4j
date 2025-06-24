package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrOverlayMainSessionFlagsEXTX.html"><code>XrOverlayMainSessionFlagsEXTX</code></a>
public final class XrOverlayMainSessionFlagsEXTX {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_OVERLAY_MAIN_SESSION_ENABLED_COMPOSITION_LAYER_INFO_DEPTH_BIT_EXTX.html"><code>XR_OVERLAY_MAIN_SESSION_ENABLED_COMPOSITION_LAYER_INFO_DEPTH_BIT_EXTX</code></a>
    public static final int ENABLED_COMPOSITION_LAYER_INFO_DEPTH = 0x0;

    public static String explain(@Bitmask(XrOverlayMainSessionFlagsEXTX.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ENABLED_COMPOSITION_LAYER_INFO_DEPTH) != 0) {
            detectedFlagBits.add("XR_OVERLAY_MAIN_SESSION_ENABLED_COMPOSITION_LAYER_INFO_DEPTH_BIT_EXTX");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrOverlayMainSessionFlagsEXTX() {}
}
