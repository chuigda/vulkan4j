package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class ErrorType {
    public static final int NO_ERROR = 0x1;
    public static final int VALIDATION = 0x2;
    public static final int OUT_OF_MEMORY = 0x3;
    public static final int INTERNAL = 0x4;
    public static final int UNKNOWN = 0x5;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(ErrorType.class) int value) {
        return switch (value) {
            case ErrorType.FORCE32 -> "FORCE32";
            case ErrorType.INTERNAL -> "INTERNAL";
            case ErrorType.NO_ERROR -> "NO_ERROR";
            case ErrorType.OUT_OF_MEMORY -> "OUT_OF_MEMORY";
            case ErrorType.UNKNOWN -> "UNKNOWN";
            case ErrorType.VALIDATION -> "VALIDATION";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ErrorType() {}
}
