package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class StorageTextureAccess {
    public static final int BINDING_NOT_USED = 0x0;
    public static final int UNDEFINED = 0x1;
    public static final int WRITE_ONLY = 0x2;
    public static final int READ_ONLY = 0x3;
    public static final int READ_WRITE = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(StorageTextureAccess.class) int value) {
        return switch (value) {
            case StorageTextureAccess.BINDING_NOT_USED -> "BINDING_NOT_USED";
            case StorageTextureAccess.FORCE32 -> "FORCE32";
            case StorageTextureAccess.READ_ONLY -> "READ_ONLY";
            case StorageTextureAccess.READ_WRITE -> "READ_WRITE";
            case StorageTextureAccess.UNDEFINED -> "UNDEFINED";
            case StorageTextureAccess.WRITE_ONLY -> "WRITE_ONLY";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private StorageTextureAccess() {}
}
