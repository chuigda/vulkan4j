package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CompilationMessageType {
    public static final int COMPILATION_MESSAGE_TYPE_ERROR = 0x1;
    public static final int COMPILATION_MESSAGE_TYPE_WARNING = 0x2;
    public static final int COMPILATION_MESSAGE_TYPE_INFO = 0x3;
    public static final int COMPILATION_MESSAGE_TYPE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CompilationMessageType.class) int value) {
        return switch (value) {
            case CompilationMessageType.COMPILATION_MESSAGE_TYPE_ERROR -> "COMPILATION_MESSAGE_TYPE_ERROR";
            case CompilationMessageType.COMPILATION_MESSAGE_TYPE_FORCE32 -> "COMPILATION_MESSAGE_TYPE_FORCE32";
            case CompilationMessageType.COMPILATION_MESSAGE_TYPE_INFO -> "COMPILATION_MESSAGE_TYPE_INFO";
            case CompilationMessageType.COMPILATION_MESSAGE_TYPE_WARNING -> "COMPILATION_MESSAGE_TYPE_WARNING";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CompilationMessageType() {}
}
