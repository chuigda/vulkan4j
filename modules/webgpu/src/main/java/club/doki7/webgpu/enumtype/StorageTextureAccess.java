package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class StorageTextureAccess {
    public static final int STORAGE_TEXTURE_ACCESS_BINDING_NOT_USED = 0x0;
    public static final int STORAGE_TEXTURE_ACCESS_UNDEFINED = 0x1;
    public static final int STORAGE_TEXTURE_ACCESS_WRITE_ONLY = 0x2;
    public static final int STORAGE_TEXTURE_ACCESS_READ_ONLY = 0x3;
    public static final int STORAGE_TEXTURE_ACCESS_READ_WRITE = 0x4;
    public static final int STORAGE_TEXTURE_ACCESS_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(StorageTextureAccess.class) int value) {
        return switch (value) {
            case StorageTextureAccess.STORAGE_TEXTURE_ACCESS_BINDING_NOT_USED -> "STORAGE_TEXTURE_ACCESS_BINDING_NOT_USED";
            case StorageTextureAccess.STORAGE_TEXTURE_ACCESS_FORCE32 -> "STORAGE_TEXTURE_ACCESS_FORCE32";
            case StorageTextureAccess.STORAGE_TEXTURE_ACCESS_READ_ONLY -> "STORAGE_TEXTURE_ACCESS_READ_ONLY";
            case StorageTextureAccess.STORAGE_TEXTURE_ACCESS_READ_WRITE -> "STORAGE_TEXTURE_ACCESS_READ_WRITE";
            case StorageTextureAccess.STORAGE_TEXTURE_ACCESS_UNDEFINED -> "STORAGE_TEXTURE_ACCESS_UNDEFINED";
            case StorageTextureAccess.STORAGE_TEXTURE_ACCESS_WRITE_ONLY -> "STORAGE_TEXTURE_ACCESS_WRITE_ONLY";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private StorageTextureAccess() {}
}
