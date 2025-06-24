package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackingAimFlagsFB.html"><code>XrHandTrackingAimFlagsFB</code></a>
public final class XrHandTrackingAimFlagsFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_TRACKING_AIM_COMPUTED_BIT_FB.html"><code>XR_HAND_TRACKING_AIM_COMPUTED_BIT_FB</code></a>
    public static final int COMPUTED = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_TRACKING_AIM_DOMINANT_HAND_BIT_FB.html"><code>XR_HAND_TRACKING_AIM_DOMINANT_HAND_BIT_FB</code></a>
    public static final int DOMINANT_HAND = 0x7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_TRACKING_AIM_INDEX_PINCHING_BIT_FB.html"><code>XR_HAND_TRACKING_AIM_INDEX_PINCHING_BIT_FB</code></a>
    public static final int INDEX_PINCHING = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_TRACKING_AIM_LITTLE_PINCHING_BIT_FB.html"><code>XR_HAND_TRACKING_AIM_LITTLE_PINCHING_BIT_FB</code></a>
    public static final int LITTLE_PINCHING = 0x5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_TRACKING_AIM_MENU_PRESSED_BIT_FB.html"><code>XR_HAND_TRACKING_AIM_MENU_PRESSED_BIT_FB</code></a>
    public static final int MENU_PRESSED = 0x8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_TRACKING_AIM_MIDDLE_PINCHING_BIT_FB.html"><code>XR_HAND_TRACKING_AIM_MIDDLE_PINCHING_BIT_FB</code></a>
    public static final int MIDDLE_PINCHING = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_TRACKING_AIM_RING_PINCHING_BIT_FB.html"><code>XR_HAND_TRACKING_AIM_RING_PINCHING_BIT_FB</code></a>
    public static final int RING_PINCHING = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_TRACKING_AIM_SYSTEM_GESTURE_BIT_FB.html"><code>XR_HAND_TRACKING_AIM_SYSTEM_GESTURE_BIT_FB</code></a>
    public static final int SYSTEM_GESTURE = 0x6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_HAND_TRACKING_AIM_VALID_BIT_FB.html"><code>XR_HAND_TRACKING_AIM_VALID_BIT_FB</code></a>
    public static final int VALID = 0x1;

    public static String explain(@Bitmask(XrHandTrackingAimFlagsFB.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & COMPUTED) != 0) {
            detectedFlagBits.add("XR_HAND_TRACKING_AIM_COMPUTED_BIT_FB");
        }
        if ((flags & DOMINANT_HAND) != 0) {
            detectedFlagBits.add("XR_HAND_TRACKING_AIM_DOMINANT_HAND_BIT_FB");
        }
        if ((flags & INDEX_PINCHING) != 0) {
            detectedFlagBits.add("XR_HAND_TRACKING_AIM_INDEX_PINCHING_BIT_FB");
        }
        if ((flags & LITTLE_PINCHING) != 0) {
            detectedFlagBits.add("XR_HAND_TRACKING_AIM_LITTLE_PINCHING_BIT_FB");
        }
        if ((flags & MENU_PRESSED) != 0) {
            detectedFlagBits.add("XR_HAND_TRACKING_AIM_MENU_PRESSED_BIT_FB");
        }
        if ((flags & MIDDLE_PINCHING) != 0) {
            detectedFlagBits.add("XR_HAND_TRACKING_AIM_MIDDLE_PINCHING_BIT_FB");
        }
        if ((flags & RING_PINCHING) != 0) {
            detectedFlagBits.add("XR_HAND_TRACKING_AIM_RING_PINCHING_BIT_FB");
        }
        if ((flags & SYSTEM_GESTURE) != 0) {
            detectedFlagBits.add("XR_HAND_TRACKING_AIM_SYSTEM_GESTURE_BIT_FB");
        }
        if ((flags & VALID) != 0) {
            detectedFlagBits.add("XR_HAND_TRACKING_AIM_VALID_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrHandTrackingAimFlagsFB() {}
}
