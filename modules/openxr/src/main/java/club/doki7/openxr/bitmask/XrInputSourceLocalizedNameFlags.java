package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInputSourceLocalizedNameFlags.html"><code>XrInputSourceLocalizedNameFlags</code></a>
public final class XrInputSourceLocalizedNameFlags {
    public static final long COMPONENT = 0x4L;
    public static final long INTERACTION_PROFILE = 0x2L;
    public static final long USER_PATH = 0x1L;

    public static String explain(@Bitmask(XrInputSourceLocalizedNameFlags.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & COMPONENT) != 0) {
            detectedFlagBits.add("XR_INPUT_SOURCE_LOCALIZED_NAME_COMPONENT_BIT");
        }
        if ((flags & INTERACTION_PROFILE) != 0) {
            detectedFlagBits.add("XR_INPUT_SOURCE_LOCALIZED_NAME_INTERACTION_PROFILE_BIT");
        }
        if ((flags & USER_PATH) != 0) {
            detectedFlagBits.add("XR_INPUT_SOURCE_LOCALIZED_NAME_USER_PATH_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrInputSourceLocalizedNameFlags() {}
}
