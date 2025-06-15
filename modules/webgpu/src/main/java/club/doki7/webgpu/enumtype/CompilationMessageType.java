package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CompilationMessageType {
    public static final int ERROR = 0x1;
    public static final int WARNING = 0x2;
    public static final int INFO = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CompilationMessageType.class) int value) {
        return switch (value) {
            case CompilationMessageType.ERROR -> "ERROR";
            case CompilationMessageType.FORCE32 -> "FORCE32";
            case CompilationMessageType.INFO -> "INFO";
            case CompilationMessageType.WARNING -> "WARNING";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CompilationMessageType() {}
}
