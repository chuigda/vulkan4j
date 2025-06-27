package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUQueryType {
    public static final int OCCLUSION = 0x1;
    public static final int TIMESTAMP = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUQueryType.class) int value) {
        return switch (value) {
            case WGPUQueryType.FORCE32 -> "FORCE32";
            case WGPUQueryType.OCCLUSION -> "OCCLUSION";
            case WGPUQueryType.TIMESTAMP -> "TIMESTAMP";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUQueryType() {}
}
