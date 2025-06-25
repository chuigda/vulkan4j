package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSwapchainCreateFlags.html"><code>XrSwapchainCreateFlags</code></a>
public final class XrSwapchainCreateFlags {
    public static final long PROTECTED_CONTENT = 0x1L;
    public static final long STATIC_IMAGE = 0x2L;

    public static String explain(@Bitmask(XrSwapchainCreateFlags.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PROTECTED_CONTENT) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_CREATE_PROTECTED_CONTENT_BIT");
        }
        if ((flags & STATIC_IMAGE) != 0) {
            detectedFlagBits.add("XR_SWAPCHAIN_CREATE_STATIC_IMAGE_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSwapchainCreateFlags() {}
}
