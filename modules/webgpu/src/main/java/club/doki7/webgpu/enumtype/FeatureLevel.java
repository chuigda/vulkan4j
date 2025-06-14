package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class FeatureLevel {
    public static final int UNDEFINED = 0x0;
    public static final int COMPATIBILITY = 0x1;
    public static final int CORE = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(FeatureLevel.class) int value) {
        return switch (value) {
            case FeatureLevel.COMPATIBILITY -> "COMPATIBILITY";
            case FeatureLevel.CORE -> "CORE";
            case FeatureLevel.FORCE32 -> "FORCE32";
            case FeatureLevel.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private FeatureLevel() {}
}
