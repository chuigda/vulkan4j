package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class IndexFormat {
    public static final int UNDEFINED = 0x0;
    public static final int UINT16 = 0x1;
    public static final int UINT32 = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(IndexFormat.class) int value) {
        return switch (value) {
            case IndexFormat.FORCE32 -> "FORCE32";
            case IndexFormat.UINT16 -> "UINT16";
            case IndexFormat.UINT32 -> "UINT32";
            case IndexFormat.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private IndexFormat() {}
}
