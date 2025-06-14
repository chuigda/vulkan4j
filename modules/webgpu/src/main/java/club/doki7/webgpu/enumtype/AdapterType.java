package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class AdapterType {
    public static final int DISCRETE_GPU = 0x1;
    public static final int INTEGRATED_GPU = 0x2;
    public static final int CPU = 0x3;
    public static final int UNKNOWN = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(AdapterType.class) int value) {
        return switch (value) {
            case AdapterType.CPU -> "CPU";
            case AdapterType.DISCRETE_GPU -> "DISCRETE_GPU";
            case AdapterType.FORCE32 -> "FORCE32";
            case AdapterType.INTEGRATED_GPU -> "INTEGRATED_GPU";
            case AdapterType.UNKNOWN -> "UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private AdapterType() {}
}
