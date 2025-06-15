package club.doki7.webgpu.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class MapMode {
    public static final long NONE = 0x0L;
    public static final long READ = 0x1L;
    public static final long WRITE = 0x2L;

    public static String explain(@EnumType(MapMode.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & NONE) != 0) {
            detectedFlagBits.add("NONE");
        }
        if ((flags & READ) != 0) {
            detectedFlagBits.add("READ");
        }
        if ((flags & WRITE) != 0) {
            detectedFlagBits.add("WRITE");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private MapMode() {}
}
