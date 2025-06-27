package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUNativeQueryType {
    public static final int PipelineStatistics = 0x30000;
    public static final int Force32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUNativeQueryType.class) int value) {
        return switch (value) {
            case WGPUNativeQueryType.Force32 -> "Force32";
            case WGPUNativeQueryType.PipelineStatistics -> "PipelineStatistics";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUNativeQueryType() {}
}
