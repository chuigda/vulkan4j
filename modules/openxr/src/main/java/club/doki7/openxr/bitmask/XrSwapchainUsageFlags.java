package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainUsageFlags.html"><code>XrSwapchainUsageFlags</code></a>
public final class XrSwapchainUsageFlags {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT.html"><code>XR_SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT</code></a>
    public static final int COLOR_ATTACHMENT = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT.html"><code>XR_SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT</code></a>
    public static final int DEPTH_STENCIL_ATTACHMENT = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT.html"><code>XR_SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT</code></a>
    public static final int MUTABLE_FORMAT = 0x6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SWAPCHAIN_USAGE_SAMPLED_BIT.html"><code>XR_SWAPCHAIN_USAGE_SAMPLED_BIT</code></a>
    public static final int SAMPLED = 0x5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SWAPCHAIN_USAGE_TRANSFER_DST_BIT.html"><code>XR_SWAPCHAIN_USAGE_TRANSFER_DST_BIT</code></a>
    public static final int TRANSFER_DST = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SWAPCHAIN_USAGE_TRANSFER_SRC_BIT.html"><code>XR_SWAPCHAIN_USAGE_TRANSFER_SRC_BIT</code></a>
    public static final int TRANSFER_SRC = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SWAPCHAIN_USAGE_UNORDERED_ACCESS_BIT.html"><code>XR_SWAPCHAIN_USAGE_UNORDERED_ACCESS_BIT</code></a>
    public static final int UNORDERED_ACCESS = 0x2;

    public static String explain(@Bitmask(XrSwapchainUsageFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & COLOR_ATTACHMENT) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_USAGE_COLOR_ATTACHMENT_BIT");
        }
        if ((flags & DEPTH_STENCIL_ATTACHMENT) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_USAGE_DEPTH_STENCIL_ATTACHMENT_BIT");
        }
        if ((flags & MUTABLE_FORMAT) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_USAGE_MUTABLE_FORMAT_BIT");
        }
        if ((flags & SAMPLED) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_USAGE_SAMPLED_BIT");
        }
        if ((flags & TRANSFER_DST) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_USAGE_TRANSFER_DST_BIT");
        }
        if ((flags & TRANSFER_SRC) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_USAGE_TRANSFER_SRC_BIT");
        }
        if ((flags & UNORDERED_ACCESS) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_USAGE_UNORDERED_ACCESS_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSwapchainUsageFlags() {}
}
