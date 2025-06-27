package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUSurfaceGetCurrentTextureStatus {
    public static final int SUCCESS_OPTIMAL = 0x1;
    public static final int SUCCESS_SUBOPTIMAL = 0x2;
    public static final int TIMEOUT = 0x3;
    public static final int OUTDATED = 0x4;
    public static final int LOST = 0x5;
    public static final int OUT_OF_MEMORY = 0x6;
    public static final int DEVICE_LOST = 0x7;
    public static final int ERROR = 0x8;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUSurfaceGetCurrentTextureStatus.class) int value) {
        return switch (value) {
            case WGPUSurfaceGetCurrentTextureStatus.DEVICE_LOST -> "DEVICE_LOST";
            case WGPUSurfaceGetCurrentTextureStatus.ERROR -> "ERROR";
            case WGPUSurfaceGetCurrentTextureStatus.FORCE32 -> "FORCE32";
            case WGPUSurfaceGetCurrentTextureStatus.LOST -> "LOST";
            case WGPUSurfaceGetCurrentTextureStatus.OUTDATED -> "OUTDATED";
            case WGPUSurfaceGetCurrentTextureStatus.OUT_OF_MEMORY -> "OUT_OF_MEMORY";
            case WGPUSurfaceGetCurrentTextureStatus.SUCCESS_OPTIMAL -> "SUCCESS_OPTIMAL";
            case WGPUSurfaceGetCurrentTextureStatus.SUCCESS_SUBOPTIMAL -> "SUCCESS_SUBOPTIMAL";
            case WGPUSurfaceGetCurrentTextureStatus.TIMEOUT -> "TIMEOUT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUSurfaceGetCurrentTextureStatus() {}
}
