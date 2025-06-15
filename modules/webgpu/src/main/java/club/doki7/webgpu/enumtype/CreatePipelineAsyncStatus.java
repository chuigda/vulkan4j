package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CreatePipelineAsyncStatus {
    public static final int SUCCESS = 0x1;
    public static final int CALLBACK_CANCELLED = 0x2;
    public static final int VALIDATION_ERROR = 0x3;
    public static final int INTERNAL_ERROR = 0x4;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CreatePipelineAsyncStatus.class) int value) {
        return switch (value) {
            case CreatePipelineAsyncStatus.CALLBACK_CANCELLED -> "CALLBACK_CANCELLED";
            case CreatePipelineAsyncStatus.FORCE32 -> "FORCE32";
            case CreatePipelineAsyncStatus.INTERNAL_ERROR -> "INTERNAL_ERROR";
            case CreatePipelineAsyncStatus.SUCCESS -> "SUCCESS";
            case CreatePipelineAsyncStatus.VALIDATION_ERROR -> "VALIDATION_ERROR";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CreatePipelineAsyncStatus() {}
}
