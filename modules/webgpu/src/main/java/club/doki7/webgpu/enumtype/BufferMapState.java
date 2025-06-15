package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class BufferMapState {
    public static final int UNMAPPED = 0x1;
    public static final int PENDING = 0x2;
    public static final int MAPPED = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(BufferMapState.class) int value) {
        return switch (value) {
            case BufferMapState.FORCE32 -> "FORCE32";
            case BufferMapState.MAPPED -> "MAPPED";
            case BufferMapState.PENDING -> "PENDING";
            case BufferMapState.UNMAPPED -> "UNMAPPED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private BufferMapState() {}
}
