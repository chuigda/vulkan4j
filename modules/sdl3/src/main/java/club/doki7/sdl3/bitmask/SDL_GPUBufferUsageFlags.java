package club.doki7.sdl3.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class SDL_GPUBufferUsageFlags {
    public static final int SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_READ = 0x10;
    public static final int SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_WRITE = 0x20;
    public static final int SDL_GPU_BUFFERUSAGE_GRAPHICS_STORAGE_READ = 0x8;
    public static final int SDL_GPU_BUFFERUSAGE_INDEX = 0x2;
    public static final int SDL_GPU_BUFFERUSAGE_INDIRECT = 0x4;
    public static final int SDL_GPU_BUFFERUSAGE_VERTEX = 0x1;

    public static String explain(@EnumType(SDL_GPUBufferUsageFlags.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_READ) != 0) {
            detectedFlagBits.add("SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_READ");
        }
        if ((flags & SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_WRITE) != 0) {
            detectedFlagBits.add("SDL_GPU_BUFFERUSAGE_COMPUTE_STORAGE_WRITE");
        }
        if ((flags & SDL_GPU_BUFFERUSAGE_GRAPHICS_STORAGE_READ) != 0) {
            detectedFlagBits.add("SDL_GPU_BUFFERUSAGE_GRAPHICS_STORAGE_READ");
        }
        if ((flags & SDL_GPU_BUFFERUSAGE_INDEX) != 0) {
            detectedFlagBits.add("SDL_GPU_BUFFERUSAGE_INDEX");
        }
        if ((flags & SDL_GPU_BUFFERUSAGE_INDIRECT) != 0) {
            detectedFlagBits.add("SDL_GPU_BUFFERUSAGE_INDIRECT");
        }
        if ((flags & SDL_GPU_BUFFERUSAGE_VERTEX) != 0) {
            detectedFlagBits.add("SDL_GPU_BUFFERUSAGE_VERTEX");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUBufferUsageFlags() {}
}
