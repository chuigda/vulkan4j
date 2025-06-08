package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_InitFlags {
    public static final int SDL_INIT_AUDIO = 0x10;
    public static final int SDL_INIT_CAMERA = 0x10000;
    public static final int SDL_INIT_EVENTS = 0x4000;
    public static final int SDL_INIT_GAMEPAD = 0x2000;
    public static final int SDL_INIT_HAPTIC = 0x1000;
    public static final int SDL_INIT_JOYSTICK = 0x200;
    public static final int SDL_INIT_SENSOR = 0x8000;
    public static final int SDL_INIT_VIDEO = 0x20;

    public static String explain(@EnumType(SDL_InitFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SDL_INIT_AUDIO) != 0) {
            detectedFlagBits.add("SDL_INIT_AUDIO");
        }
        if ((flags & SDL_INIT_CAMERA) != 0) {
            detectedFlagBits.add("SDL_INIT_CAMERA");
        }
        if ((flags & SDL_INIT_EVENTS) != 0) {
            detectedFlagBits.add("SDL_INIT_EVENTS");
        }
        if ((flags & SDL_INIT_GAMEPAD) != 0) {
            detectedFlagBits.add("SDL_INIT_GAMEPAD");
        }
        if ((flags & SDL_INIT_HAPTIC) != 0) {
            detectedFlagBits.add("SDL_INIT_HAPTIC");
        }
        if ((flags & SDL_INIT_JOYSTICK) != 0) {
            detectedFlagBits.add("SDL_INIT_JOYSTICK");
        }
        if ((flags & SDL_INIT_SENSOR) != 0) {
            detectedFlagBits.add("SDL_INIT_SENSOR");
        }
        if ((flags & SDL_INIT_VIDEO) != 0) {
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
