package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class FeatureLevel {
    public static final int FEATURE_LEVEL_UNDEFINED = 0x0;
    public static final int FEATURE_LEVEL_COMPATIBILITY = 0x1;
    public static final int FEATURE_LEVEL_CORE = 0x2;
    public static final int FEATURE_LEVEL_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(FeatureLevel.class) int value) {
        return switch (value) {
            case FeatureLevel.FEATURE_LEVEL_COMPATIBILITY -> "FEATURE_LEVEL_COMPATIBILITY";
            case FeatureLevel.FEATURE_LEVEL_CORE -> "FEATURE_LEVEL_CORE";
            case FeatureLevel.FEATURE_LEVEL_FORCE32 -> "FEATURE_LEVEL_FORCE32";
            case FeatureLevel.FEATURE_LEVEL_UNDEFINED -> "FEATURE_LEVEL_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private FeatureLevel() {}
}
