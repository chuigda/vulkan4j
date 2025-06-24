package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrKeyboardTrackingFlagsFB.html"><code>XrKeyboardTrackingFlagsFB</code></a>
public final class XrKeyboardTrackingFlagsFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_KEYBOARD_TRACKING_CONNECTED_BIT_FB.html"><code>XR_KEYBOARD_TRACKING_CONNECTED_BIT_FB</code></a>
    public static final int CONNECTED = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_KEYBOARD_TRACKING_EXISTS_BIT_FB.html"><code>XR_KEYBOARD_TRACKING_EXISTS_BIT_FB</code></a>
    public static final int EXISTS = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_KEYBOARD_TRACKING_LOCAL_BIT_FB.html"><code>XR_KEYBOARD_TRACKING_LOCAL_BIT_FB</code></a>
    public static final int LOCAL = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_KEYBOARD_TRACKING_REMOTE_BIT_FB.html"><code>XR_KEYBOARD_TRACKING_REMOTE_BIT_FB</code></a>
    public static final int REMOTE = 0x2;

    public static String explain(@Bitmask(XrKeyboardTrackingFlagsFB.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & CONNECTED) != 0) {
            detectedFlagBits.add("XR_KEYBOARD_TRACKING_CONNECTED_BIT_FB");
        }
        if ((flags & EXISTS) != 0) {
            detectedFlagBits.add("XR_KEYBOARD_TRACKING_EXISTS_BIT_FB");
        }
        if ((flags & LOCAL) != 0) {
            detectedFlagBits.add("XR_KEYBOARD_TRACKING_LOCAL_BIT_FB");
        }
        if ((flags & REMOTE) != 0) {
            detectedFlagBits.add("XR_KEYBOARD_TRACKING_REMOTE_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrKeyboardTrackingFlagsFB() {}
}
