package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class FrontFace {
    public static final int FRONT_FACE_UNDEFINED = 0x0;
    public static final int FRONT_FACE_CCW = 0x1;
    public static final int FRONT_FACE_CW = 0x2;
    public static final int FRONT_FACE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(FrontFace.class) int value) {
        return switch (value) {
            case FrontFace.FRONT_FACE_CCW -> "FRONT_FACE_CCW";
            case FrontFace.FRONT_FACE_CW -> "FRONT_FACE_CW";
            case FrontFace.FRONT_FACE_FORCE32 -> "FRONT_FACE_FORCE32";
            case FrontFace.FRONT_FACE_UNDEFINED -> "FRONT_FACE_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private FrontFace() {}
}
