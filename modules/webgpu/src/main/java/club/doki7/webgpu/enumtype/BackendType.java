package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class BackendType {
    public static final int UNDEFINED = 0x0;
    public static final int NULL = 0x1;
    public static final int WEBGPU = 0x2;
    public static final int D3D11 = 0x3;
    public static final int D3D12 = 0x4;
    public static final int METAL = 0x5;
    public static final int VULKAN = 0x6;
    public static final int OPENGL = 0x7;
    public static final int OPENGLES = 0x8;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(BackendType.class) int value) {
        return switch (value) {
            case BackendType.D3D11 -> "D3D11";
            case BackendType.D3D12 -> "D3D12";
            case BackendType.FORCE32 -> "FORCE32";
            case BackendType.METAL -> "METAL";
            case BackendType.NULL -> "NULL";
            case BackendType.OPENGL -> "OPENGL";
            case BackendType.OPENGLES -> "OPENGLES";
            case BackendType.UNDEFINED -> "UNDEFINED";
            case BackendType.VULKAN -> "VULKAN";
            case BackendType.WEBGPU -> "WEBGPU";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private BackendType() {}
}
