package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class VertexStepMode {
    public static final int UNDEFINED = 0x0;
    public static final int VERTEX = 0x1;
    public static final int INSTANCE = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(VertexStepMode.class) int value) {
        return switch (value) {
            case VertexStepMode.FORCE32 -> "FORCE32";
            case VertexStepMode.INSTANCE -> "INSTANCE";
            case VertexStepMode.UNDEFINED -> "UNDEFINED";
            case VertexStepMode.VERTEX -> "VERTEX";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VertexStepMode() {}
}
