package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceGroupPresentModeFlagsKHR.html">VkDeviceGroupPresentModeFlagsKHR</a>
public final class VkDeviceGroupPresentModeFlagsKHR {
    public static final int DEVICE_GROUP_PRESENT_MODE_LOCAL = 0x1;
    public static final int DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE = 0x8;
    public static final int DEVICE_GROUP_PRESENT_MODE_REMOTE = 0x2;
    public static final int DEVICE_GROUP_PRESENT_MODE_SUM = 0x4;

    public static String explain(@enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & DEVICE_GROUP_PRESENT_MODE_LOCAL) != 0) {
            detectedFlagBits.add("VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_BIT_KHR");
        }
        if ((flags & DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE) != 0) {
            detectedFlagBits.add("VK_DEVICE_GROUP_PRESENT_MODE_LOCAL_MULTI_DEVICE_BIT_KHR");
        }
        if ((flags & DEVICE_GROUP_PRESENT_MODE_REMOTE) != 0) {
            detectedFlagBits.add("VK_DEVICE_GROUP_PRESENT_MODE_REMOTE_BIT_KHR");
        }
        if ((flags & DEVICE_GROUP_PRESENT_MODE_SUM) != 0) {
            detectedFlagBits.add("VK_DEVICE_GROUP_PRESENT_MODE_SUM_BIT_KHR");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VkDeviceGroupPresentModeFlagsKHR() {}
}
