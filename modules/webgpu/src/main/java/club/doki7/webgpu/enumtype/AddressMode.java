package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class AddressMode {
    public static final int ADDRESS_MODE_UNDEFINED = 0x0;
    public static final int ADDRESS_MODE_CLAMP_TO_EDGE = 0x1;
    public static final int ADDRESS_MODE_REPEAT = 0x2;
    public static final int ADDRESS_MODE_MIRROR_REPEAT = 0x3;
    public static final int ADDRESS_MODE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(AddressMode.class) int value) {
        return switch (value) {
            case AddressMode.ADDRESS_MODE_CLAMP_TO_EDGE -> "ADDRESS_MODE_CLAMP_TO_EDGE";
            case AddressMode.ADDRESS_MODE_FORCE32 -> "ADDRESS_MODE_FORCE32";
            case AddressMode.ADDRESS_MODE_MIRROR_REPEAT -> "ADDRESS_MODE_MIRROR_REPEAT";
            case AddressMode.ADDRESS_MODE_REPEAT -> "ADDRESS_MODE_REPEAT";
            case AddressMode.ADDRESS_MODE_UNDEFINED -> "ADDRESS_MODE_UNDEFINED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private AddressMode() {}
}
