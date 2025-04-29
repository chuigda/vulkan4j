package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerCreateFlags.html">VkSamplerCreateFlags</a>
public final class VkSamplerCreateFlags {
    public static final int SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_EXT = 0x8;
    public static final int SAMPLER_CREATE_IMAGE_PROCESSING_QCOM = 0x10;
    public static final int SAMPLER_CREATE_NON_SEAMLESS_CUBE_MAP_EXT = 0x4;
    public static final int SAMPLER_CREATE_SUBSAMPLED_EXT = 0x1;
    public static final int SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_EXT = 0x2;

    public static String explain(@enumtype(VkSamplerCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_EXT) != 0) {
            detectedFlagBits.add("VK_SAMPLER_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT");
        }
        if ((flags & SAMPLER_CREATE_IMAGE_PROCESSING_QCOM) != 0) {
            detectedFlagBits.add("VK_SAMPLER_CREATE_IMAGE_PROCESSING_BIT_QCOM");
        }
        if ((flags & SAMPLER_CREATE_NON_SEAMLESS_CUBE_MAP_EXT) != 0) {
            detectedFlagBits.add("VK_SAMPLER_CREATE_NON_SEAMLESS_CUBE_MAP_BIT_EXT");
        }
        if ((flags & SAMPLER_CREATE_SUBSAMPLED_EXT) != 0) {
            detectedFlagBits.add("VK_SAMPLER_CREATE_SUBSAMPLED_BIT_EXT");
        }
        if ((flags & SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_EXT) != 0) {
            detectedFlagBits.add("VK_SAMPLER_CREATE_SUBSAMPLED_COARSE_RECONSTRUCTION_BIT_EXT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkSamplerCreateFlags() {}
}
