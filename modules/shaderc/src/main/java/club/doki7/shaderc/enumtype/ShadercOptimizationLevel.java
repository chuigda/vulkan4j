package club.doki7.shaderc.enumtype;

import club.doki7.ffm.annotation.*;

public final class ShadercOptimizationLevel {
    public static final int ZERO = 0x0;
    public static final int SIZE = 0x1;
    public static final int PERFORMANCE = 0x2;

    public static String explain(@EnumType(ShadercOptimizationLevel.class) int value) {
        return switch (value) {
            case ShadercOptimizationLevel.PERFORMANCE -> "shaderc_optimization_level_performance";
            case ShadercOptimizationLevel.SIZE -> "shaderc_optimization_level_size";
            case ShadercOptimizationLevel.ZERO -> "shaderc_optimization_level_zero";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private ShadercOptimizationLevel() {}
}
