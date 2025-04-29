package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDriverId.html">VkDriverId</a>
public final class VkDriverId {
    public static final int AMD_PROPRIETARY = 1;
    public static final int AMD_OPEN_SOURCE = 2;
    public static final int MESA_RADV = 3;
    public static final int NVIDIA_PROPRIETARY = 4;
    public static final int INTEL_PROPRIETARY_WINDOWS = 5;
    public static final int INTEL_OPEN_SOURCE_MESA = 6;
    public static final int IMAGINATION_PROPRIETARY = 7;
    public static final int QUALCOMM_PROPRIETARY = 8;
    public static final int ARM_PROPRIETARY = 9;
    public static final int GOOGLE_SWIFTSHADER = 10;
    public static final int GGP_PROPRIETARY = 11;
    public static final int BROADCOM_PROPRIETARY = 12;
    public static final int MESA_LLVMPIPE = 13;
    public static final int MOLTENVK = 14;
    public static final int COREAVI_PROPRIETARY = 15;
    public static final int JUICE_PROPRIETARY = 16;
    public static final int VERISILICON_PROPRIETARY = 17;
    public static final int MESA_TURNIP = 18;
    public static final int MESA_V3DV = 19;
    public static final int MESA_PANVK = 20;
    public static final int SAMSUNG_PROPRIETARY = 21;
    public static final int MESA_VENUS = 22;
    public static final int MESA_DOZEN = 23;
    public static final int MESA_NVK = 24;
    public static final int IMAGINATION_OPEN_SOURCE_MESA = 25;
    public static final int MESA_HONEYKRISP = 26;
    public static final int VULKAN_SC_EMULATION_ON_VULKAN = 27;

    public static String explain(@enumtype(VkDriverId.class) int value) {
        return switch (value) {
            case VkDriverId.AMD_OPEN_SOURCE -> "VK_DRIVER_ID_AMD_OPEN_SOURCE";
            case VkDriverId.AMD_PROPRIETARY -> "VK_DRIVER_ID_AMD_PROPRIETARY";
            case VkDriverId.ARM_PROPRIETARY -> "VK_DRIVER_ID_ARM_PROPRIETARY";
            case VkDriverId.BROADCOM_PROPRIETARY -> "VK_DRIVER_ID_BROADCOM_PROPRIETARY";
            case VkDriverId.COREAVI_PROPRIETARY -> "VK_DRIVER_ID_COREAVI_PROPRIETARY";
            case VkDriverId.GGP_PROPRIETARY -> "VK_DRIVER_ID_GGP_PROPRIETARY";
            case VkDriverId.GOOGLE_SWIFTSHADER -> "VK_DRIVER_ID_GOOGLE_SWIFTSHADER";
            case VkDriverId.IMAGINATION_OPEN_SOURCE_MESA -> "VK_DRIVER_ID_IMAGINATION_OPEN_SOURCE_MESA";
            case VkDriverId.IMAGINATION_PROPRIETARY -> "VK_DRIVER_ID_IMAGINATION_PROPRIETARY";
            case VkDriverId.INTEL_OPEN_SOURCE_MESA -> "VK_DRIVER_ID_INTEL_OPEN_SOURCE_MESA";
            case VkDriverId.INTEL_PROPRIETARY_WINDOWS -> "VK_DRIVER_ID_INTEL_PROPRIETARY_WINDOWS";
            case VkDriverId.JUICE_PROPRIETARY -> "VK_DRIVER_ID_JUICE_PROPRIETARY";
            case VkDriverId.MESA_DOZEN -> "VK_DRIVER_ID_MESA_DOZEN";
            case VkDriverId.MESA_HONEYKRISP -> "VK_DRIVER_ID_MESA_HONEYKRISP";
            case VkDriverId.MESA_LLVMPIPE -> "VK_DRIVER_ID_MESA_LLVMPIPE";
            case VkDriverId.MESA_NVK -> "VK_DRIVER_ID_MESA_NVK";
            case VkDriverId.MESA_PANVK -> "VK_DRIVER_ID_MESA_PANVK";
            case VkDriverId.MESA_RADV -> "VK_DRIVER_ID_MESA_RADV";
            case VkDriverId.MESA_TURNIP -> "VK_DRIVER_ID_MESA_TURNIP";
            case VkDriverId.MESA_V3DV -> "VK_DRIVER_ID_MESA_V3DV";
            case VkDriverId.MESA_VENUS -> "VK_DRIVER_ID_MESA_VENUS";
            case VkDriverId.MOLTENVK -> "VK_DRIVER_ID_MOLTENVK";
            case VkDriverId.NVIDIA_PROPRIETARY -> "VK_DRIVER_ID_NVIDIA_PROPRIETARY";
            case VkDriverId.QUALCOMM_PROPRIETARY -> "VK_DRIVER_ID_QUALCOMM_PROPRIETARY";
            case VkDriverId.SAMSUNG_PROPRIETARY -> "VK_DRIVER_ID_SAMSUNG_PROPRIETARY";
            case VkDriverId.VERISILICON_PROPRIETARY -> "VK_DRIVER_ID_VERISILICON_PROPRIETARY";
            case VkDriverId.VULKAN_SC_EMULATION_ON_VULKAN -> "VK_DRIVER_ID_VULKAN_SC_EMULATION_ON_VULKAN";
            default -> "Unknown VkDriverId: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private VkDriverId() {}
}
