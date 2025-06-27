package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUPrimitiveTopology {
    public static final int UNDEFINED = 0x0;
    public static final int POINT_LIST = 0x1;
    public static final int LINE_LIST = 0x2;
    public static final int LINE_STRIP = 0x3;
    public static final int TRIANGLE_LIST = 0x4;
    public static final int TRIANGLE_STRIP = 0x5;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUPrimitiveTopology.class) int value) {
        return switch (value) {
            case WGPUPrimitiveTopology.FORCE32 -> "FORCE32";
            case WGPUPrimitiveTopology.LINE_LIST -> "LINE_LIST";
            case WGPUPrimitiveTopology.LINE_STRIP -> "LINE_STRIP";
            case WGPUPrimitiveTopology.POINT_LIST -> "POINT_LIST";
            case WGPUPrimitiveTopology.TRIANGLE_LIST -> "TRIANGLE_LIST";
            case WGPUPrimitiveTopology.TRIANGLE_STRIP -> "TRIANGLE_STRIP";
            case WGPUPrimitiveTopology.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUPrimitiveTopology() {}
}
