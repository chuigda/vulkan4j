package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUTextureDimension {
    public static final int UNDEFINED = 0x0;
    public static final int _1D = 0x1;
    public static final int _2D = 0x2;
    public static final int _3D = 0x3;

    public static String explain(@EnumType(WGPUTextureDimension.class) int value) {
        return switch (value) {
            case WGPUTextureDimension.UNDEFINED -> "UNDEFINED";
            case WGPUTextureDimension._1D -> "_1D";
            case WGPUTextureDimension._2D -> "_2D";
            case WGPUTextureDimension._3D -> "_3D";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUTextureDimension() {}
}
