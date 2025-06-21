package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class BufferBindingType {
    public static final int BINDING_NOT_USED = 0x0;
    public static final int UNDEFINED = 0x1;
    public static final int UNIFORM = 0x2;
    public static final int STORAGE = 0x3;
    public static final int READ_ONLY_STORAGE = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(BufferBindingType.class) int value) {
        return switch (value) {
            case BufferBindingType.BINDING_NOT_USED -> "BINDING_NOT_USED";
            case BufferBindingType.FORCE32 -> "FORCE32";
            case BufferBindingType.READ_ONLY_STORAGE -> "READ_ONLY_STORAGE";
            case BufferBindingType.STORAGE -> "STORAGE";
            case BufferBindingType.UNDEFINED -> "UNDEFINED";
            case BufferBindingType.UNIFORM -> "UNIFORM";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private BufferBindingType() {}
}
