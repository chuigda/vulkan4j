package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrAndroidSurfaceSwapchainFlagsFB.html"><code>XrAndroidSurfaceSwapchainFlagsFB</code></a>
public final class XrAndroidSurfaceSwapchainFlagsFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ANDROID_SURFACE_SWAPCHAIN_SYNCHRONOUS_BIT_FB.html"><code>XR_ANDROID_SURFACE_SWAPCHAIN_SYNCHRONOUS_BIT_FB</code></a>
    public static final int SYNCHRONOUS = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ANDROID_SURFACE_SWAPCHAIN_USE_TIMESTAMPS_BIT_FB.html"><code>XR_ANDROID_SURFACE_SWAPCHAIN_USE_TIMESTAMPS_BIT_FB</code></a>
    public static final int USE_TIMESTAMPS = 0x1;

    public static String explain(@Bitmask(XrAndroidSurfaceSwapchainFlagsFB.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SYNCHRONOUS) != 0) {
            detectedFlagBits.add("XR_ANDROID_SURFACE_SWAPCHAIN_SYNCHRONOUS_BIT_FB");
        }
        if ((flags & USE_TIMESTAMPS) != 0) {
            detectedFlagBits.add("XR_ANDROID_SURFACE_SWAPCHAIN_USE_TIMESTAMPS_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrAndroidSurfaceSwapchainFlagsFB() {}
}
