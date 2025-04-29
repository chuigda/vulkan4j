package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBufferUsageFlags2.html">VkBufferUsageFlags2</a>
public final class VkBufferUsageFlags2 {
    public static final long BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_KHR = 0x80000L;
    public static final long BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_KHR = 0x100000L;
    public static final long BUFFER_USAGE_2_CONDITIONAL_RENDERING_EXT = 0x200L;
    public static final long BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_AMDX = 0x2000000L;
    public static final long BUFFER_USAGE_2_INDEX_BUFFER = 0x40L;
    public static final long BUFFER_USAGE_2_INDIRECT_BUFFER = 0x100L;
    public static final long BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_EXT = 0x800000L;
    public static final long BUFFER_USAGE_2_MICROMAP_STORAGE_EXT = 0x1000000L;
    public static final long BUFFER_USAGE_2_PREPROCESS_BUFFER_EXT = 0x80000000L;
    public static final long BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_EXT = 0x4000000L;
    public static final long BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_EXT = 0x400000L;
    public static final long BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_EXT = 0x200000L;
    public static final long BUFFER_USAGE_2_SHADER_BINDING_TABLE_KHR = 0x400L;
    public static final long BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS = 0x20000L;
    public static final long BUFFER_USAGE_2_STORAGE_BUFFER = 0x20L;
    public static final long BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER = 0x8L;
    public static final long BUFFER_USAGE_2_TILE_MEMORY_QCOM = 0x8000000L;
    public static final long BUFFER_USAGE_2_TRANSFER_DST = 0x2L;
    public static final long BUFFER_USAGE_2_TRANSFER_SRC = 0x1L;
    public static final long BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_EXT = 0x800L;
    public static final long BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_EXT = 0x1000L;
    public static final long BUFFER_USAGE_2_UNIFORM_BUFFER = 0x10L;
    public static final long BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER = 0x4L;
    public static final long BUFFER_USAGE_2_VERTEX_BUFFER = 0x80L;
    public static final long BUFFER_USAGE_2_VIDEO_DECODE_DST_KHR = 0x4000L;
    public static final long BUFFER_USAGE_2_VIDEO_DECODE_SRC_KHR = 0x2000L;
    public static final long BUFFER_USAGE_2_VIDEO_ENCODE_DST_KHR = 0x8000L;
    public static final long BUFFER_USAGE_2_VIDEO_ENCODE_SRC_KHR = 0x10000L;

    public static String explain(@enumtype(VkBufferUsageFlags2.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_KHR) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_BUILD_INPUT_READ_ONLY_BIT_KHR");
        }
        if ((flags & BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_KHR) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_ACCELERATION_STRUCTURE_STORAGE_BIT_KHR");
        }
        if ((flags & BUFFER_USAGE_2_CONDITIONAL_RENDERING_EXT) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_CONDITIONAL_RENDERING_BIT_EXT");
        }
        if ((flags & BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_AMDX) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_EXECUTION_GRAPH_SCRATCH_BIT_AMDX");
        }
        if ((flags & BUFFER_USAGE_2_INDEX_BUFFER) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_INDEX_BUFFER_BIT");
        }
        if ((flags & BUFFER_USAGE_2_INDIRECT_BUFFER) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_INDIRECT_BUFFER_BIT");
        }
        if ((flags & BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_EXT) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_MICROMAP_BUILD_INPUT_READ_ONLY_BIT_EXT");
        }
        if ((flags & BUFFER_USAGE_2_MICROMAP_STORAGE_EXT) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_MICROMAP_STORAGE_BIT_EXT");
        }
        if ((flags & BUFFER_USAGE_2_PREPROCESS_BUFFER_EXT) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_PREPROCESS_BUFFER_BIT_EXT");
        }
        if ((flags & BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_EXT) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_PUSH_DESCRIPTORS_DESCRIPTOR_BUFFER_BIT_EXT");
        }
        if ((flags & BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_EXT) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_RESOURCE_DESCRIPTOR_BUFFER_BIT_EXT");
        }
        if ((flags & BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_EXT) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_SAMPLER_DESCRIPTOR_BUFFER_BIT_EXT");
        }
        if ((flags & BUFFER_USAGE_2_SHADER_BINDING_TABLE_KHR) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_SHADER_BINDING_TABLE_BIT_KHR");
        }
        if ((flags & BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_SHADER_DEVICE_ADDRESS_BIT");
        }
        if ((flags & BUFFER_USAGE_2_STORAGE_BUFFER) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_STORAGE_BUFFER_BIT");
        }
        if ((flags & BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_STORAGE_TEXEL_BUFFER_BIT");
        }
        if ((flags & BUFFER_USAGE_2_TILE_MEMORY_QCOM) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_TILE_MEMORY_QCOM");
        }
        if ((flags & BUFFER_USAGE_2_TRANSFER_DST) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_TRANSFER_DST_BIT");
        }
        if ((flags & BUFFER_USAGE_2_TRANSFER_SRC) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_TRANSFER_SRC_BIT");
        }
        if ((flags & BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_EXT) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_BUFFER_BIT_EXT");
        }
        if ((flags & BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_EXT) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_TRANSFORM_FEEDBACK_COUNTER_BUFFER_BIT_EXT");
        }
        if ((flags & BUFFER_USAGE_2_UNIFORM_BUFFER) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_UNIFORM_BUFFER_BIT");
        }
        if ((flags & BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_UNIFORM_TEXEL_BUFFER_BIT");
        }
        if ((flags & BUFFER_USAGE_2_VERTEX_BUFFER) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_VERTEX_BUFFER_BIT");
        }
        if ((flags & BUFFER_USAGE_2_VIDEO_DECODE_DST_KHR) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_VIDEO_DECODE_DST_BIT_KHR");
        }
        if ((flags & BUFFER_USAGE_2_VIDEO_DECODE_SRC_KHR) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_VIDEO_DECODE_SRC_BIT_KHR");
        }
        if ((flags & BUFFER_USAGE_2_VIDEO_ENCODE_DST_KHR) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_VIDEO_ENCODE_DST_BIT_KHR");
        }
        if ((flags & BUFFER_USAGE_2_VIDEO_ENCODE_SRC_KHR) != 0) {
            detectedFlagBits.add("VK_BUFFER_USAGE_2_VIDEO_ENCODE_SRC_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkBufferUsageFlags2() {}
}
