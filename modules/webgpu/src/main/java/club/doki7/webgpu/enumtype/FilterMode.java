package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class FilterMode {
    public static final int UNDEFINED = 0x0;
    public static final int NEAREST = 0x1;
    public static final int LINEAR = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(FilterMode.class) int value) {
        return switch (value) {
            case FilterMode.FORCE32 -> "FORCE32";
            case FilterMode.LINEAR -> "LINEAR";
            case FilterMode.NEAREST -> "NEAREST";
            case FilterMode.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private FilterMode() {}
}
