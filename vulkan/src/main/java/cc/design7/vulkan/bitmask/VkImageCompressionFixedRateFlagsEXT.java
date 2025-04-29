package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageCompressionFixedRateFlagsEXT.html">VkImageCompressionFixedRateFlagsEXT</a>
public final class VkImageCompressionFixedRateFlagsEXT {
    public static final int IMAGE_COMPRESSION_FIXED_RATE_10BPC = 0x200;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_11BPC = 0x400;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_12BPC = 0x800;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_13BPC = 0x1000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_14BPC = 0x2000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_15BPC = 0x4000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_16BPC = 0x8000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_17BPC = 0x10000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_18BPC = 0x20000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_19BPC = 0x40000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_1BPC = 0x1;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_20BPC = 0x80000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_21BPC = 0x100000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_22BPC = 0x200000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_23BPC = 0x400000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_24BPC = 0x800000;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_2BPC = 0x2;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_3BPC = 0x4;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_4BPC = 0x8;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_5BPC = 0x10;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_6BPC = 0x20;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_7BPC = 0x40;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_8BPC = 0x80;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_9BPC = 0x100;
    public static final int IMAGE_COMPRESSION_FIXED_RATE_NONE = 0x0;

    public static String explain(@enumtype(VkImageCompressionFixedRateFlagsEXT.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_10BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_10BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_11BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_11BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_12BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_12BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_13BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_13BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_14BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_14BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_15BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_15BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_16BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_16BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_17BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_17BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_18BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_18BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_19BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_19BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_1BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_1BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_20BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_20BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_21BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_21BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_22BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_22BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_23BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_23BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_24BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_24BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_2BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_2BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_3BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_3BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_4BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_4BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_5BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_5BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_6BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_6BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_7BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_7BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_8BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_8BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_9BPC) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_9BPC_BIT_EXT");
        }
        if ((flags & IMAGE_COMPRESSION_FIXED_RATE_NONE) != 0) {
            detectedFlagBits.add("VK_IMAGE_COMPRESSION_FIXED_RATE_NONE_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkImageCompressionFixedRateFlagsEXT() {}
}
