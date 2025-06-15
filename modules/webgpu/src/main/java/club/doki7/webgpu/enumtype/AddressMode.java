package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class AddressMode {
    public static final int UNDEFINED = 0x0;
    public static final int CLAMP_TO_EDGE = 0x1;
    public static final int REPEAT = 0x2;
    public static final int MIRROR_REPEAT = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(AddressMode.class) int value) {
        return switch (value) {
            case AddressMode.CLAMP_TO_EDGE -> "CLAMP_TO_EDGE";
            case AddressMode.FORCE32 -> "FORCE32";
            case AddressMode.MIRROR_REPEAT -> "MIRROR_REPEAT";
            case AddressMode.REPEAT -> "REPEAT";
            case AddressMode.UNDEFINED -> "UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private AddressMode() {}
}
