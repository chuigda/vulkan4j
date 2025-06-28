package club.doki7.webgpu.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class WGPUColorWriteMask {
    public static final long ALPHA = 0x8L;
    public static final long BLUE = 0x4L;
    public static final long GREEN = 0x2L;
    public static final long NONE = 0x0L;
    public static final long RED = 0x1L;
    public static final long ALL = RED | GREEN | BLUE | ALPHA;

    public static String explain(@Bitmask(WGPUColorWriteMask.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ALPHA) != 0) {
            detectedFlagBits.add("ALPHA");
        }
        if ((flags & BLUE) != 0) {
            detectedFlagBits.add("BLUE");
        }
        if ((flags & GREEN) != 0) {
            detectedFlagBits.add("GREEN");
        }
        if ((flags & NONE) != 0) {
            detectedFlagBits.add("NONE");
        }
        if ((flags & RED) != 0) {
            detectedFlagBits.add("RED");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUColorWriteMask() {}
}
