package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageCreateFlags.html">VkImageCreateFlags</a>
public final class VkImageCreateFlags {
    public static final int IMAGE_CREATE_2D_ARRAY_COMPATIBLE = 0x20;
    public static final int IMAGE_CREATE_2D_VIEW_COMPATIBLE_EXT = 0x20000;
    public static final int IMAGE_CREATE_ALIAS = 0x400;
    public static final int IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE = 0x80;
    public static final int IMAGE_CREATE_CORNER_SAMPLED_NV = 0x2000;
    public static final int IMAGE_CREATE_CUBE_COMPATIBLE = 0x10;
    public static final int IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_EXT = 0x10000;
    public static final int IMAGE_CREATE_DISJOINT = 0x200;
    public static final int IMAGE_CREATE_EXTENDED_USAGE = 0x100;
    public static final int IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_EXT = 0x8000;
    public static final int IMAGE_CREATE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_EXT = 0x40000;
    public static final int IMAGE_CREATE_MUTABLE_FORMAT = 0x8;
    public static final int IMAGE_CREATE_PROTECTED = 0x800;
    public static final int IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_EXT = 0x1000;
    public static final int IMAGE_CREATE_SPARSE_ALIASED = 0x4;
    public static final int IMAGE_CREATE_SPARSE_BINDING = 0x1;
    public static final int IMAGE_CREATE_SPARSE_RESIDENCY = 0x2;
    public static final int IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS = 0x40;
    public static final int IMAGE_CREATE_SUBSAMPLED_EXT = 0x4000;
    public static final int IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_KHR = 0x100000;

    public static String explain(@enumtype(VkImageCreateFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & IMAGE_CREATE_2D_ARRAY_COMPATIBLE) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_2D_ARRAY_COMPATIBLE_BIT");
        }
        if ((flags & IMAGE_CREATE_2D_VIEW_COMPATIBLE_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_2D_VIEW_COMPATIBLE_BIT_EXT");
        }
        if ((flags & IMAGE_CREATE_ALIAS) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_ALIAS_BIT");
        }
        if ((flags & IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_BLOCK_TEXEL_VIEW_COMPATIBLE_BIT");
        }
        if ((flags & IMAGE_CREATE_CORNER_SAMPLED_NV) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_CORNER_SAMPLED_BIT_NV");
        }
        if ((flags & IMAGE_CREATE_CUBE_COMPATIBLE) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_CUBE_COMPATIBLE_BIT");
        }
        if ((flags & IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_DESCRIPTOR_BUFFER_CAPTURE_REPLAY_BIT_EXT");
        }
        if ((flags & IMAGE_CREATE_DISJOINT) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_DISJOINT_BIT");
        }
        if ((flags & IMAGE_CREATE_EXTENDED_USAGE) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_EXTENDED_USAGE_BIT");
        }
        if ((flags & IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_FRAGMENT_DENSITY_MAP_OFFSET_BIT_EXT");
        }
        if ((flags & IMAGE_CREATE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_BIT_EXT");
        }
        if ((flags & IMAGE_CREATE_MUTABLE_FORMAT) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_MUTABLE_FORMAT_BIT");
        }
        if ((flags & IMAGE_CREATE_PROTECTED) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_PROTECTED_BIT");
        }
        if ((flags & IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_SAMPLE_LOCATIONS_COMPATIBLE_DEPTH_BIT_EXT");
        }
        if ((flags & IMAGE_CREATE_SPARSE_ALIASED) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_SPARSE_ALIASED_BIT");
        }
        if ((flags & IMAGE_CREATE_SPARSE_BINDING) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_SPARSE_BINDING_BIT");
        }
        if ((flags & IMAGE_CREATE_SPARSE_RESIDENCY) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_SPARSE_RESIDENCY_BIT");
        }
        if ((flags & IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_SPLIT_INSTANCE_BIND_REGIONS_BIT");
        }
        if ((flags & IMAGE_CREATE_SUBSAMPLED_EXT) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_SUBSAMPLED_BIT_EXT");
        }
        if ((flags & IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_KHR) != 0) {
            detectedFlagBits.add("VK_IMAGE_CREATE_VIDEO_PROFILE_INDEPENDENT_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkImageCreateFlags() {}
}
