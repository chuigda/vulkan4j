package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrAndroidSurfaceSwapchainFlagsFB.html"><code>XrAndroidSurfaceSwapchainFlagsFB</code></a>
public final class XrAndroidSurfaceSwapchainFlagsFB {
    public static final long SYNCHRONOUS = 0x1L;
    public static final long USE_TIMESTAMPS = 0x2L;

    public static String explain(@Bitmask(XrAndroidSurfaceSwapchainFlagsFB.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SYNCHRONOUS) != 0) {
            detectedFlagBits.add("XR_ANDROID_SURFACE_SWAPCHAIN_SYNCHRONOUS_BIT_FB");
        }
        if ((flags & USE_TIMESTAMPS) != 0) {
            detectedFlagBits.add("XR_ANDROID_SURFACE_SWAPCHAIN_USE_TIMESTAMPS_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrAndroidSurfaceSwapchainFlagsFB() {}
}
