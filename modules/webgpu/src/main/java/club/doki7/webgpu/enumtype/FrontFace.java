package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class FrontFace {
    public static final int UNDEFINED = 0x0;
    public static final int CCW = 0x1;
    public static final int CW = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(FrontFace.class) int value) {
        return switch (value) {
            case FrontFace.CCW -> "CCW";
            case FrontFace.CW -> "CW";
            case FrontFace.FORCE32 -> "FORCE32";
            case FrontFace.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private FrontFace() {}
}
