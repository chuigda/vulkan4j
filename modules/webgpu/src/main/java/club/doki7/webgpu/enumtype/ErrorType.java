package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class ErrorType {
    public static final int ERROR_TYPE_NO_ERROR = 0x1;
    public static final int ERROR_TYPE_VALIDATION = 0x2;
    public static final int ERROR_TYPE_OUT_OF_MEMORY = 0x3;
    public static final int ERROR_TYPE_INTERNAL = 0x4;
    public static final int ERROR_TYPE_UNKNOWN = 0x5;
    public static final int ERROR_TYPE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(ErrorType.class) int value) {
        return switch (value) {
            case ErrorType.ERROR_TYPE_FORCE32 -> "ERROR_TYPE_FORCE32";
            case ErrorType.ERROR_TYPE_INTERNAL -> "ERROR_TYPE_INTERNAL";
            case ErrorType.ERROR_TYPE_NO_ERROR -> "ERROR_TYPE_NO_ERROR";
            case ErrorType.ERROR_TYPE_OUT_OF_MEMORY -> "ERROR_TYPE_OUT_OF_MEMORY";
            case ErrorType.ERROR_TYPE_UNKNOWN -> "ERROR_TYPE_UNKNOWN";
            case ErrorType.ERROR_TYPE_VALIDATION -> "ERROR_TYPE_VALIDATION";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ErrorType() {}
}
