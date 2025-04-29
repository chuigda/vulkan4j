package cc.design7.vulkan.bitmask;

import cc.design7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDeviceAddressBindingFlagsEXT.html">VkDeviceAddressBindingFlagsEXT</a>
public final class DeviceAddressBindingFlagsEXT {
    public static final int INTERNAL_OBJECT = 0x1;
    
    public static String explain(@enumtype(DeviceAddressBindingFlagsEXT.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & INTERNAL_OBJECT) != 0) {
            detectedFlagBits.add("VK_DEVICE_ADDRESS_BINDING_INTERNAL_OBJECT_BIT_EXT");
        }
        
        if (detectedFlagBits.isEmpty()) {
            return "NONE";
        }
        return String.join(" | ", detectedFlagBits);
    }
    
    /// Constructing this class is nonsense so the constructor is made private.
    private DeviceAddressBindingFlagsEXT() {}
}
