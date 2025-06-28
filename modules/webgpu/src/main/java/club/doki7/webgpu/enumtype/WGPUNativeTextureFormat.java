package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUNativeTextureFormat {
    public static final int R16Unorm = 0x30001;
    public static final int R16Snorm = 0x30002;
    public static final int Rg16Unorm = 0x30003;
    public static final int Rg16Snorm = 0x30004;
    public static final int Rgba16Unorm = 0x30005;
    public static final int Rgba16Snorm = 0x30006;
    public static final int NV12 = 0x30007;

    public static String explain(@EnumType(WGPUNativeTextureFormat.class) int value) {
        return switch (value) {
            case WGPUNativeTextureFormat.NV12 -> "NV12";
            case WGPUNativeTextureFormat.R16Snorm -> "R16Snorm";
            case WGPUNativeTextureFormat.R16Unorm -> "R16Unorm";
            case WGPUNativeTextureFormat.Rg16Snorm -> "Rg16Snorm";
            case WGPUNativeTextureFormat.Rg16Unorm -> "Rg16Unorm";
            case WGPUNativeTextureFormat.Rgba16Snorm -> "Rgba16Snorm";
            case WGPUNativeTextureFormat.Rgba16Unorm -> "Rgba16Unorm";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUNativeTextureFormat() {}
}
