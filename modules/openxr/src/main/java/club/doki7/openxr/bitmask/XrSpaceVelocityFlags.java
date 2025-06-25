package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceVelocityFlags.html"><code>XrSpaceVelocityFlags</code></a>
public final class XrSpaceVelocityFlags {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_VELOCITY_ANGULAR_VALID_BIT.html"><code>XR_SPACE_VELOCITY_ANGULAR_VALID_BIT</code></a>
    public static final long ANGULAR_VALID = 0x2L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_VELOCITY_LINEAR_VALID_BIT.html"><code>XR_SPACE_VELOCITY_LINEAR_VALID_BIT</code></a>
    public static final long LINEAR_VALID = 0x1L;

    public static String explain(@Bitmask(XrSpaceVelocityFlags.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ANGULAR_VALID) != 0) {
            detectedFlagBits.add("XR_SPACE_VELOCITY_ANGULAR_VALID_BIT");
        }
        if ((flags & LINEAR_VALID) != 0) {
            detectedFlagBits.add("XR_SPACE_VELOCITY_LINEAR_VALID_BIT");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpaceVelocityFlags() {}
}
