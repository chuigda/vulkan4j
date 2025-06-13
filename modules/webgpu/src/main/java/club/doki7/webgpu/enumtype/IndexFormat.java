package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class IndexFormat {
    public static final int INDEX_FORMAT_UNDEFINED = 0x0;
    public static final int INDEX_FORMAT_UINT16 = 0x1;
    public static final int INDEX_FORMAT_UINT32 = 0x2;
    public static final int INDEX_FORMAT_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(IndexFormat.class) int value) {
        return switch (value) {
            case IndexFormat.INDEX_FORMAT_FORCE32 -> "INDEX_FORMAT_FORCE32";
            case IndexFormat.INDEX_FORMAT_UINT16 -> "INDEX_FORMAT_UINT16";
            case IndexFormat.INDEX_FORMAT_UINT32 -> "INDEX_FORMAT_UINT32";
            case IndexFormat.INDEX_FORMAT_UNDEFINED -> "INDEX_FORMAT_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private IndexFormat() {}
}
