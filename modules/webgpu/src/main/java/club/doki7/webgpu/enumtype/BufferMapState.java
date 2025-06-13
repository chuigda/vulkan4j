package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class BufferMapState {
    public static final int BUFFER_MAP_STATE_UNMAPPED = 0x1;
    public static final int BUFFER_MAP_STATE_PENDING = 0x2;
    public static final int BUFFER_MAP_STATE_MAPPED = 0x3;
    public static final int BUFFER_MAP_STATE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(BufferMapState.class) int value) {
        return switch (value) {
            case BufferMapState.BUFFER_MAP_STATE_FORCE32 -> "BUFFER_MAP_STATE_FORCE32";
            case BufferMapState.BUFFER_MAP_STATE_MAPPED -> "BUFFER_MAP_STATE_MAPPED";
            case BufferMapState.BUFFER_MAP_STATE_PENDING -> "BUFFER_MAP_STATE_PENDING";
            case BufferMapState.BUFFER_MAP_STATE_UNMAPPED -> "BUFFER_MAP_STATE_UNMAPPED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private BufferMapState() {}
}
