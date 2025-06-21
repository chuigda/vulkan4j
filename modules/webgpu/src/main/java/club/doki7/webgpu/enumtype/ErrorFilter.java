package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class ErrorFilter {
    public static final int VALIDATION = 0x1;
    public static final int OUT_OF_MEMORY = 0x2;
    public static final int INTERNAL = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(ErrorFilter.class) int value) {
        return switch (value) {
            case ErrorFilter.FORCE32 -> "FORCE32";
            case ErrorFilter.INTERNAL -> "INTERNAL";
            case ErrorFilter.OUT_OF_MEMORY -> "OUT_OF_MEMORY";
            case ErrorFilter.VALIDATION -> "VALIDATION";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ErrorFilter() {}
}
