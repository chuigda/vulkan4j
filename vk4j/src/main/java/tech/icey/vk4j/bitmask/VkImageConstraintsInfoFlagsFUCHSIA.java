package tech.icey.vk4j.bitmask;

import tech.icey.panama.annotation.enumtype;

public final class VkImageConstraintsInfoFlagsFUCHSIA {
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_RARELY_FUCHSIA = 1;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_OFTEN_FUCHSIA = 2;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_RARELY_FUCHSIA = 4;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_OFTEN_FUCHSIA = 8;
    public static final int VK_IMAGE_CONSTRAINTS_INFO_PROTECTED_OPTIONAL_FUCHSIA = 16;

    public static String explain(@enumtype(VkImageConstraintsInfoFlagsFUCHSIA.class) int flags) {
        StringBuilder sb = new StringBuilder();

        if ((flags & VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_RARELY_FUCHSIA) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_RARELY_FUCHSIA");
        }

        if ((flags & VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_OFTEN_FUCHSIA) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CONSTRAINTS_INFO_CPU_READ_OFTEN_FUCHSIA");
        }

        if ((flags & VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_RARELY_FUCHSIA) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_RARELY_FUCHSIA");
        }

        if ((flags & VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_OFTEN_FUCHSIA) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CONSTRAINTS_INFO_CPU_WRITE_OFTEN_FUCHSIA");
        }

        if ((flags & VK_IMAGE_CONSTRAINTS_INFO_PROTECTED_OPTIONAL_FUCHSIA) != 0) {
            if (!sb.isEmpty()) {
                sb.append(" | ");
            }
            sb.append("VK_IMAGE_CONSTRAINTS_INFO_PROTECTED_OPTIONAL_FUCHSIA");
        }

        return sb.toString();
    }
}
