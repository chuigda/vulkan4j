package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CullMode {
    public static final int CULL_MODE_UNDEFINED = 0x0;
    public static final int CULL_MODE_NONE = 0x1;
    public static final int CULL_MODE_FRONT = 0x2;
    public static final int CULL_MODE_BACK = 0x3;
    public static final int CULL_MODE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CullMode.class) int value) {
        return switch (value) {
            case CullMode.CULL_MODE_BACK -> "CULL_MODE_BACK";
            case CullMode.CULL_MODE_FORCE32 -> "CULL_MODE_FORCE32";
            case CullMode.CULL_MODE_FRONT -> "CULL_MODE_FRONT";
            case CullMode.CULL_MODE_NONE -> "CULL_MODE_NONE";
            case CullMode.CULL_MODE_UNDEFINED -> "CULL_MODE_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CullMode() {}
}
