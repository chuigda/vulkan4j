package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkMemoryDecompressionMethodFlagsNV {
    public static final long VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV = 1L;

    public static String explain(@enumtype(VkMemoryDecompressionMethodFlagsNV.class) long flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_MEMORY_DECOMPRESSION_METHOD_GDEFLATE_1_0_BIT_NV");
        }

        return sb.toString();
    }
}
