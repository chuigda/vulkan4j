package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkSparseImageFormatFlags {
    public static final int VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT = 1;
    public static final int VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT = 2;
    public static final int VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT = 4;

    public static String explain(@enumtype(VkSparseImageFormatFlags.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SPARSE_IMAGE_FORMAT_SINGLE_MIPTAIL_BIT");
        }

        if ((flags & VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SPARSE_IMAGE_FORMAT_ALIGNED_MIP_SIZE_BIT");
        }

        if ((flags & VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_SPARSE_IMAGE_FORMAT_NONSTANDARD_BLOCK_SIZE_BIT");
        }

        return sb.toString();
    }
}
