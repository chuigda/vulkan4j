package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_GPUTextureUsageFlags {
    public static final int SDL_GPU_TEXTUREUSAGE_COLOR_TARGET = 0x2;
    public static final int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_READ = 0x10;
    public static final int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_SIMULTANEOUS_READ_WRITE = 0x40;
    public static final int SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_WRITE = 0x20;
    public static final int SDL_GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET = 0x4;
    public static final int SDL_GPU_TEXTUREUSAGE_GRAPHICS_STORAGE_READ = 0x8;
    public static final int SDL_GPU_TEXTUREUSAGE_SAMPLER = 0x1;

    public static String explain(@EnumType(SDL_GPUTextureUsageFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SDL_GPU_TEXTUREUSAGE_COLOR_TARGET) != 0) {
            detectedFlagBits.add("SDL_GPU_TEXTUREUSAGE_COLOR_TARGET");
        }
        if ((flags & SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_READ) != 0) {
            detectedFlagBits.add("SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_READ");
        }
        if ((flags & SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_SIMULTANEOUS_READ_WRITE) != 0) {
            detectedFlagBits.add("SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_SIMULTANEOUS_READ_WRITE");
        }
        if ((flags & SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_WRITE) != 0) {
            detectedFlagBits.add("SDL_GPU_TEXTUREUSAGE_COMPUTE_STORAGE_WRITE");
        }
        if ((flags & SDL_GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET) != 0) {
            detectedFlagBits.add("SDL_GPU_TEXTUREUSAGE_DEPTH_STENCIL_TARGET");
        }
        if ((flags & SDL_GPU_TEXTUREUSAGE_GRAPHICS_STORAGE_READ) != 0) {
            detectedFlagBits.add("SDL_GPU_TEXTUREUSAGE_GRAPHICS_STORAGE_READ");
        }
        if ((flags & SDL_GPU_TEXTUREUSAGE_SAMPLER) != 0) {
            detectedFlagBits.add("SDL_GPU_TEXTUREUSAGE_SAMPLER");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUTextureUsageFlags() {}
}
