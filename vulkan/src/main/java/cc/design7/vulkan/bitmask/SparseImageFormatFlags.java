package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSparseImageFormatFlags.html">VkSparseImageFormatFlags</a>
public final class SparseImageFormatFlags {
    public static final int ALIGNED_MIP_SIZE = 0x2;
    public static final int NONSTANDARD_BLOCK_SIZE = 0x4;
    public static final int SINGLE_MIPTAIL = 0x1;

    public static String explain(@enumtype(SparseImageFormatFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ALIGNED_MIP_SIZE) != 0) {
            detectedFlagBits.add("VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT");
        }
        if ((flags & NONSTANDARD_BLOCK_SIZE) != 0) {
            detectedFlagBits.add("VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT");
        }
        if ((flags & SINGLE_MIPTAIL) != 0) {
            detectedFlagBits.add("VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SparseImageFormatFlags() {}
}
