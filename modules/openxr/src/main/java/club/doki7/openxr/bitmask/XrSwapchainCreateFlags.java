package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainCreateFlags.html"><code>XrSwapchainCreateFlags</code></a>
public final class XrSwapchainCreateFlags {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SWAPCHAIN_CREATE_PROTECTED_CONTENT_BIT.html"><code>XR_SWAPCHAIN_CREATE_PROTECTED_CONTENT_BIT</code></a>
    public static final int PROTECTED_CONTENT = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SWAPCHAIN_CREATE_STATIC_IMAGE_BIT.html"><code>XR_SWAPCHAIN_CREATE_STATIC_IMAGE_BIT</code></a>
    public static final int STATIC_IMAGE = 0x1;

    public static String explain(@Bitmask(XrSwapchainCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PROTECTED_CONTENT) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_CREATE_PROTECTED_CONTENT_BIT");
        }
        if ((flags & STATIC_IMAGE) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_CREATE_STATIC_IMAGE_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSwapchainCreateFlags() {}
}
