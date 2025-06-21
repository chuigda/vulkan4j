package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class BlendFactor {
    public static final int UNDEFINED = 0x0;
    public static final int ZERO = 0x1;
    public static final int ONE = 0x2;
    public static final int SRC = 0x3;
    public static final int ONE_MINUS_SRC = 0x4;
    public static final int SRC_ALPHA = 0x5;
    public static final int ONE_MINUS_SRC_ALPHA = 0x6;
    public static final int DST = 0x7;
    public static final int ONE_MINUS_DST = 0x8;
    public static final int DST_ALPHA = 0x9;
    public static final int ONE_MINUS_DST_ALPHA = 0xa;
    public static final int SRC_ALPHA_SATURATED = 0xb;
    public static final int CONSTANT = 0xc;
    public static final int ONE_MINUS_CONSTANT = 0xd;
    public static final int SRC1 = 0xe;
    public static final int ONE_MINUS_SRC1 = 0xf;
    public static final int SRC1_ALPHA = 0x10;
    public static final int ONE_MINUS_SRC1_ALPHA = 0x11;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(BlendFactor.class) int value) {
        return switch (value) {
            case BlendFactor.CONSTANT -> "CONSTANT";
            case BlendFactor.DST -> "DST";
            case BlendFactor.DST_ALPHA -> "DST_ALPHA";
            case BlendFactor.FORCE32 -> "FORCE32";
            case BlendFactor.ONE -> "ONE";
            case BlendFactor.ONE_MINUS_CONSTANT -> "ONE_MINUS_CONSTANT";
            case BlendFactor.ONE_MINUS_DST -> "ONE_MINUS_DST";
            case BlendFactor.ONE_MINUS_DST_ALPHA -> "ONE_MINUS_DST_ALPHA";
            case BlendFactor.ONE_MINUS_SRC -> "ONE_MINUS_SRC";
            case BlendFactor.ONE_MINUS_SRC1 -> "ONE_MINUS_SRC1";
            case BlendFactor.ONE_MINUS_SRC1_ALPHA -> "ONE_MINUS_SRC1_ALPHA";
            case BlendFactor.ONE_MINUS_SRC_ALPHA -> "ONE_MINUS_SRC_ALPHA";
            case BlendFactor.SRC -> "SRC";
            case BlendFactor.SRC1 -> "SRC1";
            case BlendFactor.SRC1_ALPHA -> "SRC1_ALPHA";
            case BlendFactor.SRC_ALPHA -> "SRC_ALPHA";
            case BlendFactor.SRC_ALPHA_SATURATED -> "SRC_ALPHA_SATURATED";
            case BlendFactor.UNDEFINED -> "UNDEFINED";
            case BlendFactor.ZERO -> "ZERO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private BlendFactor() {}
}
