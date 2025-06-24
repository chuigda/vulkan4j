package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrInputSourceLocalizedNameFlags.html"><code>XrInputSourceLocalizedNameFlags</code></a>
public final class XrInputSourceLocalizedNameFlags {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_INPUT_SOURCE_LOCALIZED_NAME_COMPONENT_BIT.html"><code>XR_INPUT_SOURCE_LOCALIZED_NAME_COMPONENT_BIT</code></a>
    public static final int COMPONENT = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_INPUT_SOURCE_LOCALIZED_NAME_INTERACTION_PROFILE_BIT.html"><code>XR_INPUT_SOURCE_LOCALIZED_NAME_INTERACTION_PROFILE_BIT</code></a>
    public static final int INTERACTION_PROFILE = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_INPUT_SOURCE_LOCALIZED_NAME_USER_PATH_BIT.html"><code>XR_INPUT_SOURCE_LOCALIZED_NAME_USER_PATH_BIT</code></a>
    public static final int USER_PATH = 0x0;

    public static String explain(@Bitmask(XrInputSourceLocalizedNameFlags.class) int flags) {
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
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrInputSourceLocalizedNameFlags() {}
}
