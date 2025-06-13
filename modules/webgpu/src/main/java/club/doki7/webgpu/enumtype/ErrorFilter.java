package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class ErrorFilter {
    public static final int ERROR_FILTER_VALIDATION = 0x1;
    public static final int ERROR_FILTER_OUT_OF_MEMORY = 0x2;
    public static final int ERROR_FILTER_INTERNAL = 0x3;
    public static final int ERROR_FILTER_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(ErrorFilter.class) int value) {
        return switch (value) {
            case ErrorFilter.ERROR_FILTER_FORCE32 -> "ERROR_FILTER_FORCE32";
            case ErrorFilter.ERROR_FILTER_INTERNAL -> "ERROR_FILTER_INTERNAL";
            case ErrorFilter.ERROR_FILTER_OUT_OF_MEMORY -> "ERROR_FILTER_OUT_OF_MEMORY";
            case ErrorFilter.ERROR_FILTER_VALIDATION -> "ERROR_FILTER_VALIDATION";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ErrorFilter() {}
}
