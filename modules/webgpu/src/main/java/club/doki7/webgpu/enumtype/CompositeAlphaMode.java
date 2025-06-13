package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CompositeAlphaMode {
    public static final int COMPOSITE_ALPHA_MODE_AUTO = 0x0;
    public static final int COMPOSITE_ALPHA_MODE_OPAQUE = 0x1;
    public static final int COMPOSITE_ALPHA_MODE_PREMULTIPLIED = 0x2;
    public static final int COMPOSITE_ALPHA_MODE_UNPREMULTIPLIED = 0x3;
    public static final int COMPOSITE_ALPHA_MODE_INHERIT = 0x4;
    public static final int COMPOSITE_ALPHA_MODE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CompositeAlphaMode.class) int value) {
        return switch (value) {
            case CompositeAlphaMode.COMPOSITE_ALPHA_MODE_AUTO -> "COMPOSITE_ALPHA_MODE_AUTO";
            case CompositeAlphaMode.COMPOSITE_ALPHA_MODE_FORCE32 -> "COMPOSITE_ALPHA_MODE_FORCE32";
            case CompositeAlphaMode.COMPOSITE_ALPHA_MODE_INHERIT -> "COMPOSITE_ALPHA_MODE_INHERIT";
            case CompositeAlphaMode.COMPOSITE_ALPHA_MODE_OPAQUE -> "COMPOSITE_ALPHA_MODE_OPAQUE";
            case CompositeAlphaMode.COMPOSITE_ALPHA_MODE_PREMULTIPLIED -> "COMPOSITE_ALPHA_MODE_PREMULTIPLIED";
            case CompositeAlphaMode.COMPOSITE_ALPHA_MODE_UNPREMULTIPLIED -> "COMPOSITE_ALPHA_MODE_UNPREMULTIPLIED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CompositeAlphaMode() {}
}
