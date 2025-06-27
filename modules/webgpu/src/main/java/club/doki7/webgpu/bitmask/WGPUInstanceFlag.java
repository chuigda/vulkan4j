package club.doki7.webgpu.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class WGPUInstanceFlag {
    public static final long Debug = 0x1L;
    public static final long Default = 0x0L;
    public static final long DiscardHalLabels = 0x4L;
    public static final long Force32 = 0x7fffffffL;
    public static final long Validation = 0x2L;

    public static String explain(@Bitmask(WGPUInstanceFlag.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & Debug) != 0) {
            detectedFlagBits.add("Debug");
        }
        if ((flags & Default) != 0) {
            detectedFlagBits.add("Default");
        }
        if ((flags & DiscardHalLabels) != 0) {
            detectedFlagBits.add("DiscardHalLabels");
        }
        if ((flags & Force32) != 0) {
            detectedFlagBits.add("Force32");
        }
        if ((flags & Validation) != 0) {
            detectedFlagBits.add("Validation");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUInstanceFlag() {}
}
