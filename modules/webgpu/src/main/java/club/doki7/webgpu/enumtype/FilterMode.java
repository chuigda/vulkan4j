package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class FilterMode {
    public static final int FILTER_MODE_UNDEFINED = 0x0;
    public static final int FILTER_MODE_NEAREST = 0x1;
    public static final int FILTER_MODE_LINEAR = 0x2;
    public static final int FILTER_MODE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(FilterMode.class) int value) {
        return switch (value) {
            case FilterMode.FILTER_MODE_FORCE32 -> "FILTER_MODE_FORCE32";
            case FilterMode.FILTER_MODE_LINEAR -> "FILTER_MODE_LINEAR";
            case FilterMode.FILTER_MODE_NEAREST -> "FILTER_MODE_NEAREST";
            case FilterMode.FILTER_MODE_UNDEFINED -> "FILTER_MODE_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private FilterMode() {}
}
