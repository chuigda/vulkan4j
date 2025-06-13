package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class BufferBindingType {
    public static final int BUFFER_BINDING_TYPE_BINDING_NOT_USED = 0x0;
    public static final int BUFFER_BINDING_TYPE_UNDEFINED = 0x1;
    public static final int BUFFER_BINDING_TYPE_UNIFORM = 0x2;
    public static final int BUFFER_BINDING_TYPE_STORAGE = 0x3;
    public static final int BUFFER_BINDING_TYPE_READ_ONLY_STORAGE = 0x4;
    public static final int BUFFER_BINDING_TYPE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(BufferBindingType.class) int value) {
        return switch (value) {
            case BufferBindingType.BUFFER_BINDING_TYPE_BINDING_NOT_USED -> "BUFFER_BINDING_TYPE_BINDING_NOT_USED";
            case BufferBindingType.BUFFER_BINDING_TYPE_FORCE32 -> "BUFFER_BINDING_TYPE_FORCE32";
            case BufferBindingType.BUFFER_BINDING_TYPE_READ_ONLY_STORAGE -> "BUFFER_BINDING_TYPE_READ_ONLY_STORAGE";
            case BufferBindingType.BUFFER_BINDING_TYPE_STORAGE -> "BUFFER_BINDING_TYPE_STORAGE";
            case BufferBindingType.BUFFER_BINDING_TYPE_UNDEFINED -> "BUFFER_BINDING_TYPE_UNDEFINED";
            case BufferBindingType.BUFFER_BINDING_TYPE_UNIFORM -> "BUFFER_BINDING_TYPE_UNIFORM";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private BufferBindingType() {}
}
