package club.doki7.webgpu.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class WGPUShaderStage {
    public static final long COMPUTE = 0x4L;
    public static final long FRAGMENT = 0x2L;
    public static final long NONE = 0x0L;
    public static final long VERTEX = 0x1L;

    public static String explain(@Bitmask(WGPUShaderStage.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & COMPUTE) != 0) {
            detectedFlagBits.add("COMPUTE");
        }
        if ((flags & FRAGMENT) != 0) {
            detectedFlagBits.add("FRAGMENT");
        }
        if ((flags & NONE) != 0) {
            detectedFlagBits.add("NONE");
        }
        if ((flags & VERTEX) != 0) {
            detectedFlagBits.add("VERTEX");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUShaderStage() {}
}
