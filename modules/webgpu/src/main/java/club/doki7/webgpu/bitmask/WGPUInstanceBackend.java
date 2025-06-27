package club.doki7.webgpu.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class WGPUInstanceBackend {
    public static final long All = 0x0L;
    public static final long BrowserWebGPU = 0x20L;
    public static final long DX11 = 0x10L;
    public static final long DX12 = 0x8L;
    public static final long Force32 = 0x7fffffffL;
    public static final long GL = 0x2L;
    public static final long Metal = 0x4L;
    public static final long Vulkan = 0x1L;
    public static final long Secondary = (1L << 1) | (1L << 4)L;
    public static final long Primary = (1L << 0) | (1L << 2) | (1L << 3) | (1L << 5)L;

    public static String explain(@Bitmask(WGPUInstanceBackend.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & All) != 0) {
            detectedFlagBits.add("All");
        }
        if ((flags & BrowserWebGPU) != 0) {
            detectedFlagBits.add("BrowserWebGPU");
        }
        if ((flags & DX11) != 0) {
            detectedFlagBits.add("DX11");
        }
        if ((flags & DX12) != 0) {
            detectedFlagBits.add("DX12");
        }
        if ((flags & Force32) != 0) {
            detectedFlagBits.add("Force32");
        }
        if ((flags & GL) != 0) {
            detectedFlagBits.add("GL");
        }
        if ((flags & Metal) != 0) {
            detectedFlagBits.add("Metal");
        }
        if ((flags & Vulkan) != 0) {
            detectedFlagBits.add("Vulkan");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUInstanceBackend() {}
}
