package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPassthroughStateChangedFlagsFB.html"><code>XrPassthroughStateChangedFlagsFB</code></a>
public final class XrPassthroughStateChangedFlagsFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_STATE_CHANGED_NON_RECOVERABLE_ERROR_BIT_FB.html"><code>XR_PASSTHROUGH_STATE_CHANGED_NON_RECOVERABLE_ERROR_BIT_FB</code></a>
    public static final int NON_RECOVERABLE_ERROR = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_STATE_CHANGED_RECOVERABLE_ERROR_BIT_FB.html"><code>XR_PASSTHROUGH_STATE_CHANGED_RECOVERABLE_ERROR_BIT_FB</code></a>
    public static final int RECOVERABLE_ERROR = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_STATE_CHANGED_REINIT_REQUIRED_BIT_FB.html"><code>XR_PASSTHROUGH_STATE_CHANGED_REINIT_REQUIRED_BIT_FB</code></a>
    public static final int REINIT_REQUIRED = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_PASSTHROUGH_STATE_CHANGED_RESTORED_ERROR_BIT_FB.html"><code>XR_PASSTHROUGH_STATE_CHANGED_RESTORED_ERROR_BIT_FB</code></a>
    public static final int RESTORED_ERROR = 0x3;

    public static String explain(@Bitmask(XrPassthroughStateChangedFlagsFB.class) int flags) {
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
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrPassthroughStateChangedFlagsFB() {}
}
