package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CreatePipelineAsyncStatus {
    public static final int CREATE_PIPELINE_ASYNC_STATUS_SUCCESS = 0x1;
    public static final int CREATE_PIPELINE_ASYNC_STATUS_CALLBACK_CANCELLED = 0x2;
    public static final int CREATE_PIPELINE_ASYNC_STATUS_VALIDATION_ERROR = 0x3;
    public static final int CREATE_PIPELINE_ASYNC_STATUS_INTERNAL_ERROR = 0x4;
    public static final int CREATE_PIPELINE_ASYNC_STATUS_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CreatePipelineAsyncStatus.class) int value) {
        return switch (value) {
            case CreatePipelineAsyncStatus.CREATE_PIPELINE_ASYNC_STATUS_CALLBACK_CANCELLED -> "CREATE_PIPELINE_ASYNC_STATUS_CALLBACK_CANCELLED";
            case CreatePipelineAsyncStatus.CREATE_PIPELINE_ASYNC_STATUS_FORCE32 -> "CREATE_PIPELINE_ASYNC_STATUS_FORCE32";
            case CreatePipelineAsyncStatus.CREATE_PIPELINE_ASYNC_STATUS_INTERNAL_ERROR -> "CREATE_PIPELINE_ASYNC_STATUS_INTERNAL_ERROR";
            case CreatePipelineAsyncStatus.CREATE_PIPELINE_ASYNC_STATUS_SUCCESS -> "CREATE_PIPELINE_ASYNC_STATUS_SUCCESS";
            case CreatePipelineAsyncStatus.CREATE_PIPELINE_ASYNC_STATUS_VALIDATION_ERROR -> "CREATE_PIPELINE_ASYNC_STATUS_VALIDATION_ERROR";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CreatePipelineAsyncStatus() {}
}
