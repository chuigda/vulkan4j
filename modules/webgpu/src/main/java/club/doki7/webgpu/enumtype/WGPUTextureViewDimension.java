package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUTextureViewDimension {
    public static final int UNDEFINED = 0x0;
    public static final int _1D = 0x1;
    public static final int _2D = 0x2;
    public static final int _2D_ARRAY = 0x3;
    public static final int CUBE = 0x4;
    public static final int CUBE_ARRAY = 0x5;
    public static final int _3D = 0x6;

    public static String explain(@EnumType(WGPUTextureViewDimension.class) int value) {
        return switch (value) {
            case WGPUTextureViewDimension.CUBE -> "CUBE";
            case WGPUTextureViewDimension.CUBE_ARRAY -> "CUBE_ARRAY";
            case WGPUTextureViewDimension.UNDEFINED -> "UNDEFINED";
            case WGPUTextureViewDimension._1D -> "_1D";
            case WGPUTextureViewDimension._2D -> "_2D";
            case WGPUTextureViewDimension._2D_ARRAY -> "_2D_ARRAY";
            case WGPUTextureViewDimension._3D -> "_3D";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUTextureViewDimension() {}
}
