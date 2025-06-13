package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class BackendType {
    public static final int BACKEND_TYPE_UNDEFINED = 0x0;
    public static final int BACKEND_TYPE_NULL = 0x1;
    public static final int BACKEND_TYPE_WEBGPU = 0x2;
    public static final int BACKEND_TYPE_D3D11 = 0x3;
    public static final int BACKEND_TYPE_D3D12 = 0x4;
    public static final int BACKEND_TYPE_METAL = 0x5;
    public static final int BACKEND_TYPE_VULKAN = 0x6;
    public static final int BACKEND_TYPE_OPENGL = 0x7;
    public static final int BACKEND_TYPE_OPENGLES = 0x8;
    public static final int BACKEND_TYPE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(BackendType.class) int value) {
        return switch (value) {
            case BackendType.BACKEND_TYPE_D3D11 -> "BACKEND_TYPE_D3D11";
            case BackendType.BACKEND_TYPE_D3D12 -> "BACKEND_TYPE_D3D12";
            case BackendType.BACKEND_TYPE_FORCE32 -> "BACKEND_TYPE_FORCE32";
            case BackendType.BACKEND_TYPE_METAL -> "BACKEND_TYPE_METAL";
            case BackendType.BACKEND_TYPE_NULL -> "BACKEND_TYPE_NULL";
            case BackendType.BACKEND_TYPE_OPENGL -> "BACKEND_TYPE_OPENGL";
            case BackendType.BACKEND_TYPE_OPENGLES -> "BACKEND_TYPE_OPENGLES";
            case BackendType.BACKEND_TYPE_UNDEFINED -> "BACKEND_TYPE_UNDEFINED";
            case BackendType.BACKEND_TYPE_VULKAN -> "BACKEND_TYPE_VULKAN";
            case BackendType.BACKEND_TYPE_WEBGPU -> "BACKEND_TYPE_WEBGPU";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private BackendType() {}
}
