package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUTextureViewDimension {
    public static final int UNDEFINED = 0x0;
    public static final int 1D = 0x1;
    public static final int 2D = 0x2;
    public static final int 2D_ARRAY = 0x3;
    public static final int CUBE = 0x4;
    public static final int CUBE_ARRAY = 0x5;
    public static final int 3D = 0x6;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUTextureViewDimension.class) int value) {
        return switch (value) {
            case WGPUTextureViewDimension.1D -> "1D";
            case WGPUTextureViewDimension.2D -> "2D";
            case WGPUTextureViewDimension.2D_ARRAY -> "2D_ARRAY";
            case WGPUTextureViewDimension.3D -> "3D";
            case WGPUTextureViewDimension.CUBE -> "CUBE";
            case WGPUTextureViewDimension.CUBE_ARRAY -> "CUBE_ARRAY";
            case WGPUTextureViewDimension.FORCE32 -> "FORCE32";
            case WGPUTextureViewDimension.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUTextureViewDimension() {}
}
