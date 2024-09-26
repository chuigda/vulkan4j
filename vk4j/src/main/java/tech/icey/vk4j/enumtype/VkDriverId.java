package tech.icey.vk4j.enumtype;

import tech.icey.vk4j.annotation.enumtype;

public final class VkDriverId {
    public static final int VK_DRIVER_ID_AMD_PROPRIETARY = 1;
    public static final int VK_DRIVER_ID_AMD_OPEN_SOURCE = 2;
    public static final int VK_DRIVER_ID_MESA_RADV = 3;
    public static final int VK_DRIVER_ID_NVIDIA_PROPRIETARY = 4;
    public static final int VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS = 5;
    public static final int VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA = 6;
    public static final int VK_DRIVER_ID_IMAGINATION_PROPRIETARY = 7;
    public static final int VK_DRIVER_ID_QUALCOMM_PROPRIETARY = 8;
    public static final int VK_DRIVER_ID_ARM_PROPRIETARY = 9;
    public static final int VK_DRIVER_ID_GOOGLE_SWIFTSHADER = 10;
    public static final int VK_DRIVER_ID_GGP_PROPRIETARY = 11;
    public static final int VK_DRIVER_ID_BROADCOM_PROPRIETARY = 12;
    public static final int VK_DRIVER_ID_MESA_LLVMPIPE = 13;
    public static final int VK_DRIVER_ID_MOLTENVK = 14;
    public static final int VK_DRIVER_ID_COREAVI_PROPRIETARY = 15;
    public static final int VK_DRIVER_ID_JUICE_PROPRIETARY = 16;
    public static final int VK_DRIVER_ID_VERISILICON_PROPRIETARY = 17;
    public static final int VK_DRIVER_ID_MESA_TURNIP = 18;
    public static final int VK_DRIVER_ID_MESA_V3DV = 19;
    public static final int VK_DRIVER_ID_MESA_PANVK = 20;
    public static final int VK_DRIVER_ID_SAMSUNG_PROPRIETARY = 21;
    public static final int VK_DRIVER_ID_MESA_VENUS = 22;
    public static final int VK_DRIVER_ID_MESA_DOZEN = 23;
    public static final int VK_DRIVER_ID_MESA_NVK = 24;
    public static final int VK_DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA = 25;
    public static final int VK_DRIVER_ID_MESA_HONEYKRISP = 26;
    public static final int VK_DRIVER_ID_RESERVED_27 = 27;

    public static String explain(@enumtype(VkDriverId.class) int value) {
        return switch (value) {
            case VK_DRIVER_ID_AMD_PROPRIETARY -> "VK_DRIVER_ID_AMD_PROPRIETARY";
            case VK_DRIVER_ID_AMD_OPEN_SOURCE -> "VK_DRIVER_ID_AMD_OPEN_SOURCE";
            case VK_DRIVER_ID_MESA_RADV -> "VK_DRIVER_ID_MESA_RADV";
            case VK_DRIVER_ID_NVIDIA_PROPRIETARY -> "VK_DRIVER_ID_NVIDIA_PROPRIETARY";
            case VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS -> "VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS";
            case VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA -> "VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA";
            case VK_DRIVER_ID_IMAGINATION_PROPRIETARY -> "VK_DRIVER_ID_IMAGINATION_PROPRIETARY";
            case VK_DRIVER_ID_QUALCOMM_PROPRIETARY -> "VK_DRIVER_ID_QUALCOMM_PROPRIETARY";
            case VK_DRIVER_ID_ARM_PROPRIETARY -> "VK_DRIVER_ID_ARM_PROPRIETARY";
            case VK_DRIVER_ID_GOOGLE_SWIFTSHADER -> "VK_DRIVER_ID_GOOGLE_SWIFTSHADER";
            case VK_DRIVER_ID_GGP_PROPRIETARY -> "VK_DRIVER_ID_GGP_PROPRIETARY";
            case VK_DRIVER_ID_BROADCOM_PROPRIETARY -> "VK_DRIVER_ID_BROADCOM_PROPRIETARY";
            case VK_DRIVER_ID_MESA_LLVMPIPE -> "VK_DRIVER_ID_MESA_LLVMPIPE";
            case VK_DRIVER_ID_MOLTENVK -> "VK_DRIVER_ID_MOLTENVK";
            case VK_DRIVER_ID_COREAVI_PROPRIETARY -> "VK_DRIVER_ID_COREAVI_PROPRIETARY";
            case VK_DRIVER_ID_JUICE_PROPRIETARY -> "VK_DRIVER_ID_JUICE_PROPRIETARY";
            case VK_DRIVER_ID_VERISILICON_PROPRIETARY -> "VK_DRIVER_ID_VERISILICON_PROPRIETARY";
            case VK_DRIVER_ID_MESA_TURNIP -> "VK_DRIVER_ID_MESA_TURNIP";
            case VK_DRIVER_ID_MESA_V3DV -> "VK_DRIVER_ID_MESA_V3DV";
            case VK_DRIVER_ID_MESA_PANVK -> "VK_DRIVER_ID_MESA_PANVK";
            case VK_DRIVER_ID_SAMSUNG_PROPRIETARY -> "VK_DRIVER_ID_SAMSUNG_PROPRIETARY";
            case VK_DRIVER_ID_MESA_VENUS -> "VK_DRIVER_ID_MESA_VENUS";
            case VK_DRIVER_ID_MESA_DOZEN -> "VK_DRIVER_ID_MESA_DOZEN";
            case VK_DRIVER_ID_MESA_NVK -> "VK_DRIVER_ID_MESA_NVK";
            case VK_DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA -> "VK_DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA";
            case VK_DRIVER_ID_MESA_HONEYKRISP -> "VK_DRIVER_ID_MESA_HONEYKRISP";
            case VK_DRIVER_ID_RESERVED_27 -> "VK_DRIVER_ID_RESERVED_27";
            default -> "Unknown";
        };
    }
}
