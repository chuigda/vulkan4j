package club.doki7.webgpu.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

public final class BufferUsage {
    public static final long COPY_DST = 0x8L;
    public static final long COPY_SRC = 0x4L;
    public static final long INDEX = 0x10L;
    public static final long INDIRECT = 0x100L;
    public static final long MAP_READ = 0x1L;
    public static final long MAP_WRITE = 0x2L;
    public static final long NONE = 0x0L;
    public static final long QUERY_RESOLVE = 0x200L;
    public static final long STORAGE = 0x80L;
    public static final long UNIFORM = 0x40L;
    public static final long VERTEX = 0x20L;

    public static String explain(@EnumType(BufferUsage.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & COPY_DST) != 0) {
            detectedFlagBits.add("COPY_DST");
        }
        if ((flags & COPY_SRC) != 0) {
            detectedFlagBits.add("COPY_SRC");
        }
        if ((flags & INDEX) != 0) {
            detectedFlagBits.add("INDEX");
        }
        if ((flags & INDIRECT) != 0) {
            detectedFlagBits.add("INDIRECT");
        }
        if ((flags & MAP_READ) != 0) {
            detectedFlagBits.add("MAP_READ");
        }
        if ((flags & MAP_WRITE) != 0) {
            detectedFlagBits.add("MAP_WRITE");
        }
        if ((flags & NONE) != 0) {
            detectedFlagBits.add("NONE");
        }
        if ((flags & QUERY_RESOLVE) != 0) {
            detectedFlagBits.add("QUERY_RESOLVE");
        }
        if ((flags & STORAGE) != 0) {
            detectedFlagBits.add("STORAGE");
        }
        if ((flags & UNIFORM) != 0) {
            detectedFlagBits.add("UNIFORM");
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
    private BufferUsage() {}
}
