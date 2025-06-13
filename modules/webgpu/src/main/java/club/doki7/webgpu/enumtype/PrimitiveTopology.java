package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class PrimitiveTopology {
    public static final int PRIMITIVE_TOPOLOGY_UNDEFINED = 0x0;
    public static final int PRIMITIVE_TOPOLOGY_POINT_LIST = 0x1;
    public static final int PRIMITIVE_TOPOLOGY_LINE_LIST = 0x2;
    public static final int PRIMITIVE_TOPOLOGY_LINE_STRIP = 0x3;
    public static final int PRIMITIVE_TOPOLOGY_TRIANGLE_LIST = 0x4;
    public static final int PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP = 0x5;
    public static final int PRIMITIVE_TOPOLOGY_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(PrimitiveTopology.class) int value) {
        return switch (value) {
            case PrimitiveTopology.PRIMITIVE_TOPOLOGY_FORCE32 -> "PRIMITIVE_TOPOLOGY_FORCE32";
            case PrimitiveTopology.PRIMITIVE_TOPOLOGY_LINE_LIST -> "PRIMITIVE_TOPOLOGY_LINE_LIST";
            case PrimitiveTopology.PRIMITIVE_TOPOLOGY_LINE_STRIP -> "PRIMITIVE_TOPOLOGY_LINE_STRIP";
            case PrimitiveTopology.PRIMITIVE_TOPOLOGY_POINT_LIST -> "PRIMITIVE_TOPOLOGY_POINT_LIST";
            case PrimitiveTopology.PRIMITIVE_TOPOLOGY_TRIANGLE_LIST -> "PRIMITIVE_TOPOLOGY_TRIANGLE_LIST";
            case PrimitiveTopology.PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP -> "PRIMITIVE_TOPOLOGY_TRIANGLE_STRIP";
            case PrimitiveTopology.PRIMITIVE_TOPOLOGY_UNDEFINED -> "PRIMITIVE_TOPOLOGY_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private PrimitiveTopology() {}
}
