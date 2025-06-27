package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUStorageTextureAccess {
    public static final int BINDING_NOT_USED = 0x0;
    public static final int UNDEFINED = 0x1;
    public static final int WRITE_ONLY = 0x2;
    public static final int READ_ONLY = 0x3;
    public static final int READ_WRITE = 0x4;

    public static String explain(@EnumType(WGPUStorageTextureAccess.class) int value) {
        return switch (value) {
            case WGPUStorageTextureAccess.BINDING_NOT_USED -> "BINDING_NOT_USED";
            case WGPUStorageTextureAccess.READ_ONLY -> "READ_ONLY";
            case WGPUStorageTextureAccess.READ_WRITE -> "READ_WRITE";
            case WGPUStorageTextureAccess.UNDEFINED -> "UNDEFINED";
            case WGPUStorageTextureAccess.WRITE_ONLY -> "WRITE_ONLY";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUStorageTextureAccess() {}
}
