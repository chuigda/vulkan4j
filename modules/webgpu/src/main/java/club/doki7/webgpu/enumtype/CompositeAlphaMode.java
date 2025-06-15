package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CompositeAlphaMode {
    public static final int AUTO = 0x0;
    public static final int OPAQUE = 0x1;
    public static final int PREMULTIPLIED = 0x2;
    public static final int UNPREMULTIPLIED = 0x3;
    public static final int INHERIT = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CompositeAlphaMode.class) int value) {
        return switch (value) {
            case CompositeAlphaMode.AUTO -> "AUTO";
            case CompositeAlphaMode.FORCE32 -> "FORCE32";
            case CompositeAlphaMode.INHERIT -> "INHERIT";
            case CompositeAlphaMode.OPAQUE -> "OPAQUE";
            case CompositeAlphaMode.PREMULTIPLIED -> "PREMULTIPLIED";
            case CompositeAlphaMode.UNPREMULTIPLIED -> "UNPREMULTIPLIED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CompositeAlphaMode() {}
}
