package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainCreateFoveationFlagsFB.html"><code>XrSwapchainCreateFoveationFlagsFB</code></a>
public final class XrSwapchainCreateFoveationFlagsFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SWAPCHAIN_CREATE_FOVEATION_FRAGMENT_DENSITY_MAP_BIT_FB.html"><code>XR_SWAPCHAIN_CREATE_FOVEATION_FRAGMENT_DENSITY_MAP_BIT_FB</code></a>
    public static final long FRAGMENT_DENSITY_MAP = 0x2L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SWAPCHAIN_CREATE_FOVEATION_SCALED_BIN_BIT_FB.html"><code>XR_SWAPCHAIN_CREATE_FOVEATION_SCALED_BIN_BIT_FB</code></a>
    public static final long SCALED_BIN = 0x1L;

    public static String explain(@Bitmask(XrSwapchainCreateFoveationFlagsFB.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & FRAGMENT_DENSITY_MAP) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_CREATE_FOVEATION_FRAGMENT_DENSITY_MAP_BIT_FB");
        }
        if ((flags & SCALED_BIN) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_CREATE_FOVEATION_SCALED_BIN_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSwapchainCreateFoveationFlagsFB() {}
}
