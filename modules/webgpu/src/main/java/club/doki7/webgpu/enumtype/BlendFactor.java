package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class BlendFactor {
    public static final int BLEND_FACTOR_UNDEFINED = 0x0;
    public static final int BLEND_FACTOR_ZERO = 0x1;
    public static final int BLEND_FACTOR_ONE = 0x2;
    public static final int BLEND_FACTOR_SRC = 0x3;
    public static final int BLEND_FACTOR_ONE_MINUS_SRC = 0x4;
    public static final int BLEND_FACTOR_SRC_ALPHA = 0x5;
    public static final int BLEND_FACTOR_ONE_MINUS_SRC_ALPHA = 0x6;
    public static final int BLEND_FACTOR_DST = 0x7;
    public static final int BLEND_FACTOR_ONE_MINUS_DST = 0x8;
    public static final int BLEND_FACTOR_DST_ALPHA = 0x9;
    public static final int BLEND_FACTOR_ONE_MINUS_DST_ALPHA = 0xa;
    public static final int BLEND_FACTOR_SRC_ALPHA_SATURATED = 0xb;
    public static final int BLEND_FACTOR_CONSTANT = 0xc;
    public static final int BLEND_FACTOR_ONE_MINUS_CONSTANT = 0xd;
    public static final int BLEND_FACTOR_SRC1 = 0xe;
    public static final int BLEND_FACTOR_ONE_MINUS_SRC1 = 0xf;
    public static final int BLEND_FACTOR_SRC1_ALPHA = 0x10;
    public static final int BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA = 0x11;
    public static final int BLEND_FACTOR_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(BlendFactor.class) int value) {
        return switch (value) {
            case BlendFactor.BLEND_FACTOR_CONSTANT -> "BLEND_FACTOR_CONSTANT";
            case BlendFactor.BLEND_FACTOR_DST -> "BLEND_FACTOR_DST";
            case BlendFactor.BLEND_FACTOR_DST_ALPHA -> "BLEND_FACTOR_DST_ALPHA";
            case BlendFactor.BLEND_FACTOR_FORCE32 -> "BLEND_FACTOR_FORCE32";
            case BlendFactor.BLEND_FACTOR_ONE -> "BLEND_FACTOR_ONE";
            case BlendFactor.BLEND_FACTOR_ONE_MINUS_CONSTANT -> "BLEND_FACTOR_ONE_MINUS_CONSTANT";
            case BlendFactor.BLEND_FACTOR_ONE_MINUS_DST -> "BLEND_FACTOR_ONE_MINUS_DST";
            case BlendFactor.BLEND_FACTOR_ONE_MINUS_DST_ALPHA -> "BLEND_FACTOR_ONE_MINUS_DST_ALPHA";
            case BlendFactor.BLEND_FACTOR_ONE_MINUS_SRC -> "BLEND_FACTOR_ONE_MINUS_SRC";
            case BlendFactor.BLEND_FACTOR_ONE_MINUS_SRC1 -> "BLEND_FACTOR_ONE_MINUS_SRC1";
            case BlendFactor.BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA -> "BLEND_FACTOR_ONE_MINUS_SRC1_ALPHA";
            case BlendFactor.BLEND_FACTOR_ONE_MINUS_SRC_ALPHA -> "BLEND_FACTOR_ONE_MINUS_SRC_ALPHA";
            case BlendFactor.BLEND_FACTOR_SRC -> "BLEND_FACTOR_SRC";
            case BlendFactor.BLEND_FACTOR_SRC1 -> "BLEND_FACTOR_SRC1";
            case BlendFactor.BLEND_FACTOR_SRC1_ALPHA -> "BLEND_FACTOR_SRC1_ALPHA";
            case BlendFactor.BLEND_FACTOR_SRC_ALPHA -> "BLEND_FACTOR_SRC_ALPHA";
            case BlendFactor.BLEND_FACTOR_SRC_ALPHA_SATURATED -> "BLEND_FACTOR_SRC_ALPHA_SATURATED";
            case BlendFactor.BLEND_FACTOR_UNDEFINED -> "BLEND_FACTOR_UNDEFINED";
            case BlendFactor.BLEND_FACTOR_ZERO -> "BLEND_FACTOR_ZERO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private BlendFactor() {}
}
