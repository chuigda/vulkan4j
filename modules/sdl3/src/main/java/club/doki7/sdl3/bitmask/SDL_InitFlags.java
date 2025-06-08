package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_InitFlags {
    public static final int AUDIO = 0x10;
    public static final int CAMERA = 0x10000;
    public static final int EVENTS = 0x4000;
    public static final int GAMEPAD = 0x2000;
    public static final int HAPTIC = 0x1000;
    public static final int JOYSTICK = 0x200;
    public static final int SENSOR = 0x8000;
    public static final int VIDEO = 0x20;

    public static String explain(@EnumType(SDL_InitFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & AUDIO) != 0) {
            detectedFlagBits.add("SDL_INIT_AUDIO");
        }
        if ((flags & CAMERA) != 0) {
            detectedFlagBits.add("SDL_INIT_CAMERA");
        }
        if ((flags & EVENTS) != 0) {
            detectedFlagBits.add("SDL_INIT_EVENTS");
        }
        if ((flags & GAMEPAD) != 0) {
            detectedFlagBits.add("SDL_INIT_GAMEPAD");
        }
        if ((flags & HAPTIC) != 0) {
            detectedFlagBits.add("SDL_INIT_HAPTIC");
        }
        if ((flags & JOYSTICK) != 0) {
            detectedFlagBits.add("SDL_INIT_JOYSTICK");
        }
        if ((flags & SENSOR) != 0) {
            detectedFlagBits.add("SDL_INIT_SENSOR");
        }
        if ((flags & VIDEO) != 0) {
            detectedFlagBits.add("SDL_INIT_VIDEO");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_InitFlags() {}
}
