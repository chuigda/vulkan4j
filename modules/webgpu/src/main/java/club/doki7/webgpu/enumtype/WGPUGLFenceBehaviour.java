package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUGLFenceBehaviour {
    public static final int Normal = 0x0;
    public static final int AutoFinish = 0x1;
    public static final int Force32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUGLFenceBehaviour.class) int value) {
        return switch (value) {
            case WGPUGLFenceBehaviour.AutoFinish -> "AutoFinish";
            case WGPUGLFenceBehaviour.Force32 -> "Force32";
            case WGPUGLFenceBehaviour.Normal -> "Normal";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUGLFenceBehaviour() {}
}
