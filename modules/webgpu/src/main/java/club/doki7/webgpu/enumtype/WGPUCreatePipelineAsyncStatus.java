package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUCreatePipelineAsyncStatus {
    public static final int SUCCESS = 0x1;
    public static final int INSTANCE_DROPPED = 0x2;
    public static final int VALIDATION_ERROR = 0x3;
    public static final int INTERNAL_ERROR = 0x4;
    public static final int UNKNOWN = 0x5;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUCreatePipelineAsyncStatus.class) int value) {
        return switch (value) {
            case WGPUCreatePipelineAsyncStatus.FORCE32 -> "FORCE32";
            case WGPUCreatePipelineAsyncStatus.INSTANCE_DROPPED -> "INSTANCE_DROPPED";
            case WGPUCreatePipelineAsyncStatus.INTERNAL_ERROR -> "INTERNAL_ERROR";
            case WGPUCreatePipelineAsyncStatus.SUCCESS -> "SUCCESS";
            case WGPUCreatePipelineAsyncStatus.UNKNOWN -> "UNKNOWN";
            case WGPUCreatePipelineAsyncStatus.VALIDATION_ERROR -> "VALIDATION_ERROR";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUCreatePipelineAsyncStatus() {}
}
