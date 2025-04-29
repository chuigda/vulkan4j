package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDescriptorType.html">VkDescriptorType</a>
public final class VkDescriptorType {
    public static final int SAMPLER = 0;
    public static final int COMBINED_IMAGE_SAMPLER = 1;
    public static final int SAMPLED_IMAGE = 2;
    public static final int STORAGE_IMAGE = 3;
    public static final int UNIFORM_TEXEL_BUFFER = 4;
    public static final int STORAGE_TEXEL_BUFFER = 5;
    public static final int UNIFORM_BUFFER = 6;
    public static final int STORAGE_BUFFER = 7;
    public static final int UNIFORM_BUFFER_DYNAMIC = 8;
    public static final int STORAGE_BUFFER_DYNAMIC = 9;
    public static final int INPUT_ATTACHMENT = 10;
    public static final int INLINE_UNIFORM_BLOCK = 1000138000;
    public static final int ACCELERATION_STRUCTURE_KHR = 1000150000;
    public static final int ACCELERATION_STRUCTURE_NV = 1000165000;
    public static final int SAMPLE_WEIGHT_IMAGE_QCOM = 1000440000;
    public static final int BLOCK_MATCH_IMAGE_QCOM = 1000440001;
    public static final int MUTABLE_EXT = 1000351000;
    public static final int PARTITIONED_ACCELERATION_STRUCTURE_NV = 1000570000;

    public static String explain(@enumtype(VkDescriptorType.class) int value) {
        return switch (value) {
            case VkDescriptorType.ACCELERATION_STRUCTURE_KHR -> "VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_KHR";
            case VkDescriptorType.ACCELERATION_STRUCTURE_NV -> "VK_DESCRIPTOR_TYPE_ACCELERATION_STRUCTURE_NV";
            case VkDescriptorType.BLOCK_MATCH_IMAGE_QCOM -> "VK_DESCRIPTOR_TYPE_BLOCK_MATCH_IMAGE_QCOM";
            case VkDescriptorType.COMBINED_IMAGE_SAMPLER -> "VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER";
            case VkDescriptorType.INLINE_UNIFORM_BLOCK -> "VK_DESCRIPTOR_TYPE_INLINE_UNIFORM_BLOCK";
            case VkDescriptorType.INPUT_ATTACHMENT -> "VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT";
            case VkDescriptorType.MUTABLE_EXT -> "VK_DESCRIPTOR_TYPE_MUTABLE_EXT";
            case VkDescriptorType.PARTITIONED_ACCELERATION_STRUCTURE_NV -> "VK_DESCRIPTOR_TYPE_PARTITIONED_ACCELERATION_STRUCTURE_NV";
            case VkDescriptorType.SAMPLED_IMAGE -> "VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE";
            case VkDescriptorType.SAMPLER -> "VK_DESCRIPTOR_TYPE_SAMPLER";
            case VkDescriptorType.SAMPLE_WEIGHT_IMAGE_QCOM -> "VK_DESCRIPTOR_TYPE_SAMPLE_WEIGHT_IMAGE_QCOM";
            case VkDescriptorType.STORAGE_BUFFER -> "VK_DESCRIPTOR_TYPE_STORAGE_BUFFER";
            case VkDescriptorType.STORAGE_BUFFER_DYNAMIC -> "VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC";
            case VkDescriptorType.STORAGE_IMAGE -> "VK_DESCRIPTOR_TYPE_STORAGE_IMAGE";
            case VkDescriptorType.STORAGE_TEXEL_BUFFER -> "VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER";
            case VkDescriptorType.UNIFORM_BUFFER -> "VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER";
            case VkDescriptorType.UNIFORM_BUFFER_DYNAMIC -> "VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC";
            case VkDescriptorType.UNIFORM_TEXEL_BUFFER -> "VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER";
            default -> "Unknown VkDescriptorType: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkDescriptorType() {}
}
