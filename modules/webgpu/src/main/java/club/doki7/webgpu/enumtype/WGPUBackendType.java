package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUBackendType {
    public static final int UNDEFINED = 0x0;
    public static final int NULL = 0x1;
    public static final int WEBGPU = 0x2;
    public static final int D3D11 = 0x3;
    public static final int D3D12 = 0x4;
    public static final int METAL = 0x5;
    public static final int VULKAN = 0x6;
    public static final int OPENGL = 0x7;
    public static final int OPENGLES = 0x8;

    public static String explain(@EnumType(WGPUBackendType.class) int value) {
        return switch (value) {
            case WGPUBackendType.D3D11 -> "D3D11";
            case WGPUBackendType.D3D12 -> "D3D12";
            case WGPUBackendType.METAL -> "METAL";
            case WGPUBackendType.NULL -> "NULL";
            case WGPUBackendType.OPENGL -> "OPENGL";
            case WGPUBackendType.OPENGLES -> "OPENGLES";
            case WGPUBackendType.UNDEFINED -> "UNDEFINED";
            case WGPUBackendType.VULKAN -> "VULKAN";
            case WGPUBackendType.WEBGPU -> "WEBGPU";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUBackendType() {}
}
