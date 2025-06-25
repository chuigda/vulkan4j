package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainUsageFlags.html"><code>XrSwapchainUsageFlags</code></a>
public final class XrSwapchainUsageFlags {
    public static final long COLOR_ATTACHMENT = 0x1L;
    public static final long DEPTH_STENCIL_ATTACHMENT = 0x2L;
    public static final long MUTABLE_FORMAT = 0x40L;
    public static final long SAMPLED = 0x20L;
    public static final long TRANSFER_DST = 0x10L;
    public static final long TRANSFER_SRC = 0x8L;
    public static final long UNORDERED_ACCESS = 0x4L;

    public static String explain(@Bitmask(XrSwapchainUsageFlags.class) long flags) {
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
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSwapchainUsageFlags() {}
}
