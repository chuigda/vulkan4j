package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardInputStateFlagsMETA.html"><code>XrVirtualKeyboardInputStateFlagsMETA</code></a>
public final class XrVirtualKeyboardInputStateFlagsMETA {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_VIRTUAL_KEYBOARD_INPUT_STATE_PRESSED_BIT_META.html"><code>XR_VIRTUAL_KEYBOARD_INPUT_STATE_PRESSED_BIT_META</code></a>
    public static final long PRESSED = 0x1L;

    public static String explain(@Bitmask(XrVirtualKeyboardInputStateFlagsMETA.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & PRESSED) != 0) {
            detectedFlagBits.add("XR_VIRTUAL_KEYBOARD_INPUT_STATE_PRESSED_BIT_META");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrVirtualKeyboardInputStateFlagsMETA() {}
}
