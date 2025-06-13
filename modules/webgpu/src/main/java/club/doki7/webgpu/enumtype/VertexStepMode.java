package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class VertexStepMode {
    public static final int VERTEX_STEP_MODE_UNDEFINED = 0x0;
    public static final int VERTEX_STEP_MODE_VERTEX = 0x1;
    public static final int VERTEX_STEP_MODE_INSTANCE = 0x2;
    public static final int VERTEX_STEP_MODE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(VertexStepMode.class) int value) {
        return switch (value) {
            case VertexStepMode.VERTEX_STEP_MODE_FORCE32 -> "VERTEX_STEP_MODE_FORCE32";
            case VertexStepMode.VERTEX_STEP_MODE_INSTANCE -> "VERTEX_STEP_MODE_INSTANCE";
            case VertexStepMode.VERTEX_STEP_MODE_UNDEFINED -> "VERTEX_STEP_MODE_UNDEFINED";
            case VertexStepMode.VERTEX_STEP_MODE_VERTEX -> "VERTEX_STEP_MODE_VERTEX";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VertexStepMode() {}
}
