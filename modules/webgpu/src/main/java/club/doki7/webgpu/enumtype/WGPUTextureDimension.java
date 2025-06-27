package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUTextureDimension {
    public static final int UNDEFINED = 0x0;
    public static final int 1D = 0x1;
    public static final int 2D = 0x2;
    public static final int 3D = 0x3;

    public static String explain(@EnumType(WGPUTextureDimension.class) int value) {
        return switch (value) {
            case WGPUTextureDimension.1D -> "1D";
            case WGPUTextureDimension.2D -> "2D";
            case WGPUTextureDimension.3D -> "3D";
            case WGPUTextureDimension.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUTextureDimension() {}
}
