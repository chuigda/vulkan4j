package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUVertexStepMode {
    public static final int VERTEX_BUFFER_NOT_USED = 0x0;
    public static final int UNDEFINED = 0x1;
    public static final int VERTEX = 0x2;
    public static final int INSTANCE = 0x3;

    public static String explain(@EnumType(WGPUVertexStepMode.class) int value) {
        return switch (value) {
            case WGPUVertexStepMode.INSTANCE -> "INSTANCE";
            case WGPUVertexStepMode.UNDEFINED -> "UNDEFINED";
            case WGPUVertexStepMode.VERTEX -> "VERTEX";
            case WGPUVertexStepMode.VERTEX_BUFFER_NOT_USED -> "VERTEX_BUFFER_NOT_USED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUVertexStepMode() {}
}
