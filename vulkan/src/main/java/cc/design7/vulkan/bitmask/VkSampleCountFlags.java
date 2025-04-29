package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSampleCountFlags.html">VkSampleCountFlags</a>
public final class VkSampleCountFlags {
    public static final int SAMPLE_COUNT_16 = 0x10;
    public static final int SAMPLE_COUNT_1 = 0x1;
    public static final int SAMPLE_COUNT_2 = 0x2;
    public static final int SAMPLE_COUNT_32 = 0x20;
    public static final int SAMPLE_COUNT_4 = 0x4;
    public static final int SAMPLE_COUNT_64 = 0x40;
    public static final int SAMPLE_COUNT_8 = 0x8;

    public static String explain(@enumtype(VkSampleCountFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SAMPLE_COUNT_16) != 0) {
            detectedFlagBits.add("VK_SAMPLE_COUNT_16_BIT");
        }
        if ((flags & SAMPLE_COUNT_1) != 0) {
            detectedFlagBits.add("VK_SAMPLE_COUNT_1_BIT");
        }
        if ((flags & SAMPLE_COUNT_2) != 0) {
            detectedFlagBits.add("VK_SAMPLE_COUNT_2_BIT");
        }
        if ((flags & SAMPLE_COUNT_32) != 0) {
            detectedFlagBits.add("VK_SAMPLE_COUNT_32_BIT");
        }
        if ((flags & SAMPLE_COUNT_4) != 0) {
            detectedFlagBits.add("VK_SAMPLE_COUNT_4_BIT");
        }
        if ((flags & SAMPLE_COUNT_64) != 0) {
            detectedFlagBits.add("VK_SAMPLE_COUNT_64_BIT");
        }
        if ((flags & SAMPLE_COUNT_8) != 0) {
            detectedFlagBits.add("VK_SAMPLE_COUNT_8_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkSampleCountFlags() {}
}
