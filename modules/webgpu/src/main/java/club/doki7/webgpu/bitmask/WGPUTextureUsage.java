package club.doki7.webgpu.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class WGPUTextureUsage {
    public static final long COPY_DST = 0x2L;
    public static final long COPY_SRC = 0x1L;
    public static final long NONE = 0x0L;
    public static final long RENDER_ATTACHMENT = 0x10L;
    public static final long STORAGE_BINDING = 0x8L;
    public static final long TEXTURE_BINDING = 0x4L;

    public static String explain(@Bitmask(WGPUTextureUsage.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & COPY_DST) != 0) {
            detectedFlagBits.add("COPY_DST");
        }
        if ((flags & COPY_SRC) != 0) {
            detectedFlagBits.add("COPY_SRC");
        }
        if ((flags & NONE) != 0) {
            detectedFlagBits.add("NONE");
        }
        if ((flags & RENDER_ATTACHMENT) != 0) {
            detectedFlagBits.add("RENDER_ATTACHMENT");
        }
        if ((flags & STORAGE_BINDING) != 0) {
            detectedFlagBits.add("STORAGE_BINDING");
        }
        if ((flags & TEXTURE_BINDING) != 0) {
            detectedFlagBits.add("TEXTURE_BINDING");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUTextureUsage() {}
}
