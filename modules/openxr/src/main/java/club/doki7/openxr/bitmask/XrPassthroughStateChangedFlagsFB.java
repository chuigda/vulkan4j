package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughStateChangedFlagsFB.html"><code>XrPassthroughStateChangedFlagsFB</code></a>
public final class XrPassthroughStateChangedFlagsFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_STATE_CHANGED_NON_RECOVERABLE_ERROR_BIT_FB.html"><code>XR_PASSTHROUGH_STATE_CHANGED_NON_RECOVERABLE_ERROR_BIT_FB</code></a>
    public static final long NON_RECOVERABLE_ERROR = 0x2L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_STATE_CHANGED_RECOVERABLE_ERROR_BIT_FB.html"><code>XR_PASSTHROUGH_STATE_CHANGED_RECOVERABLE_ERROR_BIT_FB</code></a>
    public static final long RECOVERABLE_ERROR = 0x4L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_STATE_CHANGED_REINIT_REQUIRED_BIT_FB.html"><code>XR_PASSTHROUGH_STATE_CHANGED_REINIT_REQUIRED_BIT_FB</code></a>
    public static final long REINIT_REQUIRED = 0x1L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_STATE_CHANGED_RESTORED_ERROR_BIT_FB.html"><code>XR_PASSTHROUGH_STATE_CHANGED_RESTORED_ERROR_BIT_FB</code></a>
    public static final long RESTORED_ERROR = 0x8L;

    public static String explain(@Bitmask(XrPassthroughStateChangedFlagsFB.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & NON_RECOVERABLE_ERROR) != 0) {
            detectedFlagBits.add("XR_PASSTHROUGH_STATE_CHANGED_NON_RECOVERABLE_ERROR_BIT_FB");
        }
        if ((flags & RECOVERABLE_ERROR) != 0) {
            detectedFlagBits.add("XR_PASSTHROUGH_STATE_CHANGED_RECOVERABLE_ERROR_BIT_FB");
        }
        if ((flags & REINIT_REQUIRED) != 0) {
            detectedFlagBits.add("XR_PASSTHROUGH_STATE_CHANGED_REINIT_REQUIRED_BIT_FB");
        }
        if ((flags & RESTORED_ERROR) != 0) {
            detectedFlagBits.add("XR_PASSTHROUGH_STATE_CHANGED_RESTORED_ERROR_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPassthroughStateChangedFlagsFB() {}
}
