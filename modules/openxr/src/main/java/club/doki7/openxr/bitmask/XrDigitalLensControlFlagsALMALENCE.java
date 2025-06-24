package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrDigitalLensControlFlagsALMALENCE.html"><code>XrDigitalLensControlFlagsALMALENCE</code></a>
public final class XrDigitalLensControlFlagsALMALENCE {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_DIGITAL_LENS_CONTROL_PROCESSING_DISABLE_BIT_ALMALENCE.html"><code>XR_DIGITAL_LENS_CONTROL_PROCESSING_DISABLE_BIT_ALMALENCE</code></a>
    public static final int PROCESSING_DISABLE = 0x0;

    public static String explain(@Bitmask(XrDigitalLensControlFlagsALMALENCE.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PROCESSING_DISABLE) != 0) {
            detectedFlagBits.add("XR_DIGITAL_LENS_CONTROL_PROCESSING_DISABLE_BIT_ALMALENCE");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrDigitalLensControlFlagsALMALENCE() {}
}
