package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUCompositeAlphaMode {
    public static final int AUTO = 0x0;
    public static final int OPAQUE = 0x1;
    public static final int PREMULTIPLIED = 0x2;
    public static final int UNPREMULTIPLIED = 0x3;
    public static final int INHERIT = 0x4;

    public static String explain(@EnumType(WGPUCompositeAlphaMode.class) int value) {
        return switch (value) {
            case WGPUCompositeAlphaMode.AUTO -> "AUTO";
            case WGPUCompositeAlphaMode.INHERIT -> "INHERIT";
            case WGPUCompositeAlphaMode.OPAQUE -> "OPAQUE";
            case WGPUCompositeAlphaMode.PREMULTIPLIED -> "PREMULTIPLIED";
            case WGPUCompositeAlphaMode.UNPREMULTIPLIED -> "UNPREMULTIPLIED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUCompositeAlphaMode() {}
}
