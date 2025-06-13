package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class SurfaceGetCurrentTextureStatus {
    public static final int SURFACE_GET_CURRENT_TEXTURE_STATUS_SUCCESS_OPTIMAL = 0x1;
    public static final int SURFACE_GET_CURRENT_TEXTURE_STATUS_SUCCESS_SUBOPTIMAL = 0x2;
    public static final int SURFACE_GET_CURRENT_TEXTURE_STATUS_TIMEOUT = 0x3;
    public static final int SURFACE_GET_CURRENT_TEXTURE_STATUS_OUTDATED = 0x4;
    public static final int SURFACE_GET_CURRENT_TEXTURE_STATUS_LOST = 0x5;
    public static final int SURFACE_GET_CURRENT_TEXTURE_STATUS_ERROR = 0x6;
    public static final int SURFACE_GET_CURRENT_TEXTURE_STATUS_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(SurfaceGetCurrentTextureStatus.class) int value) {
        return switch (value) {
            case SurfaceGetCurrentTextureStatus.SURFACE_GET_CURRENT_TEXTURE_STATUS_ERROR -> "SURFACE_GET_CURRENT_TEXTURE_STATUS_ERROR";
            case SurfaceGetCurrentTextureStatus.SURFACE_GET_CURRENT_TEXTURE_STATUS_FORCE32 -> "SURFACE_GET_CURRENT_TEXTURE_STATUS_FORCE32";
            case SurfaceGetCurrentTextureStatus.SURFACE_GET_CURRENT_TEXTURE_STATUS_LOST -> "SURFACE_GET_CURRENT_TEXTURE_STATUS_LOST";
            case SurfaceGetCurrentTextureStatus.SURFACE_GET_CURRENT_TEXTURE_STATUS_OUTDATED -> "SURFACE_GET_CURRENT_TEXTURE_STATUS_OUTDATED";
            case SurfaceGetCurrentTextureStatus.SURFACE_GET_CURRENT_TEXTURE_STATUS_SUCCESS_OPTIMAL -> "SURFACE_GET_CURRENT_TEXTURE_STATUS_SUCCESS_OPTIMAL";
            case SurfaceGetCurrentTextureStatus.SURFACE_GET_CURRENT_TEXTURE_STATUS_SUCCESS_SUBOPTIMAL -> "SURFACE_GET_CURRENT_TEXTURE_STATUS_SUCCESS_SUBOPTIMAL";
            case SurfaceGetCurrentTextureStatus.SURFACE_GET_CURRENT_TEXTURE_STATUS_TIMEOUT -> "SURFACE_GET_CURRENT_TEXTURE_STATUS_TIMEOUT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SurfaceGetCurrentTextureStatus() {}
}
