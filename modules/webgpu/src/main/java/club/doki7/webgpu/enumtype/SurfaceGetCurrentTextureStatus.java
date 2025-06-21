package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class SurfaceGetCurrentTextureStatus {
    public static final int SUCCESS_OPTIMAL = 0x1;
    public static final int SUCCESS_SUBOPTIMAL = 0x2;
    public static final int TIMEOUT = 0x3;
    public static final int OUTDATED = 0x4;
    public static final int LOST = 0x5;
    public static final int ERROR = 0x6;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(SurfaceGetCurrentTextureStatus.class) int value) {
        return switch (value) {
            case SurfaceGetCurrentTextureStatus.ERROR -> "ERROR";
            case SurfaceGetCurrentTextureStatus.FORCE32 -> "FORCE32";
            case SurfaceGetCurrentTextureStatus.LOST -> "LOST";
            case SurfaceGetCurrentTextureStatus.OUTDATED -> "OUTDATED";
            case SurfaceGetCurrentTextureStatus.SUCCESS_OPTIMAL -> "SUCCESS_OPTIMAL";
            case SurfaceGetCurrentTextureStatus.SUCCESS_SUBOPTIMAL -> "SUCCESS_SUBOPTIMAL";
            case SurfaceGetCurrentTextureStatus.TIMEOUT -> "TIMEOUT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SurfaceGetCurrentTextureStatus() {}
}
