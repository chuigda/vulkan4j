package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class AdapterType {
    public static final int ADAPTER_TYPE_DISCRETE_GPU = 0x1;
    public static final int ADAPTER_TYPE_INTEGRATED_GPU = 0x2;
    public static final int ADAPTER_TYPE_CPU = 0x3;
    public static final int ADAPTER_TYPE_UNKNOWN = 0x4;
    public static final int ADAPTER_TYPE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(AdapterType.class) int value) {
        return switch (value) {
            case AdapterType.ADAPTER_TYPE_CPU -> "ADAPTER_TYPE_CPU";
            case AdapterType.ADAPTER_TYPE_DISCRETE_GPU -> "ADAPTER_TYPE_DISCRETE_GPU";
            case AdapterType.ADAPTER_TYPE_FORCE32 -> "ADAPTER_TYPE_FORCE32";
            case AdapterType.ADAPTER_TYPE_INTEGRATED_GPU -> "ADAPTER_TYPE_INTEGRATED_GPU";
            case AdapterType.ADAPTER_TYPE_UNKNOWN -> "ADAPTER_TYPE_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private AdapterType() {}
}
