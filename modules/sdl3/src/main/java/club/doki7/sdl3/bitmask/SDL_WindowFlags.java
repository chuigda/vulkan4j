package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_WindowFlags {
    public static final long SDL_WINDOW_ALWAYS_ON_TOP = 0x10000L;
    public static final long SDL_WINDOW_BORDERLESS = 0x10L;
    public static final long SDL_WINDOW_EXTERNAL = 0x800L;
    public static final long SDL_WINDOW_FULLSCREEN = 0x1L;
    public static final long SDL_WINDOW_HIDDEN = 0x8L;
    public static final long SDL_WINDOW_HIGH_PIXEL_DENSITY = 0x2000L;
    public static final long SDL_WINDOW_INPUT_FOCUS = 0x200L;
    public static final long SDL_WINDOW_KEYBOARD_GRABBED = 0x100000L;
    public static final long SDL_WINDOW_MAXIMIZED = 0x80L;
    public static final long SDL_WINDOW_METAL = 0x20000000L;
    public static final long SDL_WINDOW_MINIMIZED = 0x40L;
    public static final long SDL_WINDOW_MODAL = 0x1000L;
    public static final long SDL_WINDOW_MOUSE_CAPTURE = 0x4000L;
    public static final long SDL_WINDOW_MOUSE_FOCUS = 0x400L;
    public static final long SDL_WINDOW_MOUSE_GRABBED = 0x100L;
    public static final long SDL_WINDOW_MOUSE_RELATIVE_MODE = 0x8000L;
    public static final long SDL_WINDOW_NOT_FOCUSABLE = 0x80000000L;
    public static final long SDL_WINDOW_OCCLUDED = 0x4L;
    public static final long SDL_WINDOW_OPENGL = 0x2L;
    public static final long SDL_WINDOW_POPUP_MENU = 0x80000L;
    public static final long SDL_WINDOW_RESIZABLE = 0x20L;
    public static final long SDL_WINDOW_SURFACE_VSYNC_ADAPTIVE = 0xffffffffffffffffL;
    public static final long SDL_WINDOW_SURFACE_VSYNC_DISABLED = 0x0L;
    public static final long SDL_WINDOW_TOOLTIP = 0x40000L;
    public static final long SDL_WINDOW_TRANSPARENT = 0x40000000L;
    public static final long SDL_WINDOW_UTILITY = 0x20000L;
    public static final long SDL_WINDOW_VULKAN = 0x10000000L;

    public static String explain(@EnumType(SDL_WindowFlags.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SDL_WINDOW_ALWAYS_ON_TOP) != 0) {
            detectedFlagBits.add("SDL_WINDOW_ALWAYS_ON_TOP");
        }
        if ((flags & SDL_WINDOW_BORDERLESS) != 0) {
            detectedFlagBits.add("SDL_WINDOW_BORDERLESS");
        }
        if ((flags & SDL_WINDOW_EXTERNAL) != 0) {
            detectedFlagBits.add("SDL_WINDOW_EXTERNAL");
        }
        if ((flags & SDL_WINDOW_FULLSCREEN) != 0) {
            detectedFlagBits.add("SDL_WINDOW_FULLSCREEN");
        }
        if ((flags & SDL_WINDOW_HIDDEN) != 0) {
            detectedFlagBits.add("SDL_WINDOW_HIDDEN");
        }
        if ((flags & SDL_WINDOW_HIGH_PIXEL_DENSITY) != 0) {
            detectedFlagBits.add("SDL_WINDOW_HIGH_PIXEL_DENSITY");
        }
        if ((flags & SDL_WINDOW_INPUT_FOCUS) != 0) {
            detectedFlagBits.add("SDL_WINDOW_INPUT_FOCUS");
        }
        if ((flags & SDL_WINDOW_KEYBOARD_GRABBED) != 0) {
            detectedFlagBits.add("SDL_WINDOW_KEYBOARD_GRABBED");
        }
        if ((flags & SDL_WINDOW_MAXIMIZED) != 0) {
            detectedFlagBits.add("SDL_WINDOW_MAXIMIZED");
        }
        if ((flags & SDL_WINDOW_METAL) != 0) {
            detectedFlagBits.add("SDL_WINDOW_METAL");
        }
        if ((flags & SDL_WINDOW_MINIMIZED) != 0) {
            detectedFlagBits.add("SDL_WINDOW_MINIMIZED");
        }
        if ((flags & SDL_WINDOW_MODAL) != 0) {
            detectedFlagBits.add("SDL_WINDOW_MODAL");
        }
        if ((flags & SDL_WINDOW_MOUSE_CAPTURE) != 0) {
            detectedFlagBits.add("SDL_WINDOW_MOUSE_CAPTURE");
        }
        if ((flags & SDL_WINDOW_MOUSE_FOCUS) != 0) {
            detectedFlagBits.add("SDL_WINDOW_MOUSE_FOCUS");
        }
        if ((flags & SDL_WINDOW_MOUSE_GRABBED) != 0) {
            detectedFlagBits.add("SDL_WINDOW_MOUSE_GRABBED");
        }
        if ((flags & SDL_WINDOW_MOUSE_RELATIVE_MODE) != 0) {
            detectedFlagBits.add("SDL_WINDOW_MOUSE_RELATIVE_MODE");
        }
        if ((flags & SDL_WINDOW_NOT_FOCUSABLE) != 0) {
            detectedFlagBits.add("SDL_WINDOW_NOT_FOCUSABLE");
        }
        if ((flags & SDL_WINDOW_OCCLUDED) != 0) {
            detectedFlagBits.add("SDL_WINDOW_OCCLUDED");
        }
        if ((flags & SDL_WINDOW_OPENGL) != 0) {
            detectedFlagBits.add("SDL_WINDOW_OPENGL");
        }
        if ((flags & SDL_WINDOW_POPUP_MENU) != 0) {
            detectedFlagBits.add("SDL_WINDOW_POPUP_MENU");
        }
        if ((flags & SDL_WINDOW_RESIZABLE) != 0) {
            detectedFlagBits.add("SDL_WINDOW_RESIZABLE");
        }
        if ((flags & SDL_WINDOW_SURFACE_VSYNC_ADAPTIVE) != 0) {
            detectedFlagBits.add("SDL_WINDOW_SURFACE_VSYNC_ADAPTIVE");
        }
        if ((flags & SDL_WINDOW_SURFACE_VSYNC_DISABLED) != 0) {
            detectedFlagBits.add("SDL_WINDOW_SURFACE_VSYNC_DISABLED");
        }
        if ((flags & SDL_WINDOW_TOOLTIP) != 0) {
            detectedFlagBits.add("SDL_WINDOW_TOOLTIP");
        }
        if ((flags & SDL_WINDOW_TRANSPARENT) != 0) {
            detectedFlagBits.add("SDL_WINDOW_TRANSPARENT");
        }
        if ((flags & SDL_WINDOW_UTILITY) != 0) {
            detectedFlagBits.add("SDL_WINDOW_UTILITY");
        }
        if ((flags & SDL_WINDOW_VULKAN) != 0) {
            detectedFlagBits.add("SDL_WINDOW_VULKAN");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_WindowFlags() {}
}
