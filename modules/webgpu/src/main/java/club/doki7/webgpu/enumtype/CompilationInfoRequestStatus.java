package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CompilationInfoRequestStatus {
    public static final int COMPILATION_INFO_REQUEST_STATUS_SUCCESS = 0x1;
    public static final int COMPILATION_INFO_REQUEST_STATUS_CALLBACK_CANCELLED = 0x2;
    public static final int COMPILATION_INFO_REQUEST_STATUS_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CompilationInfoRequestStatus.class) int value) {
        return switch (value) {
            case CompilationInfoRequestStatus.COMPILATION_INFO_REQUEST_STATUS_CALLBACK_CANCELLED -> "COMPILATION_INFO_REQUEST_STATUS_CALLBACK_CANCELLED";
            case CompilationInfoRequestStatus.COMPILATION_INFO_REQUEST_STATUS_FORCE32 -> "COMPILATION_INFO_REQUEST_STATUS_FORCE32";
            case CompilationInfoRequestStatus.COMPILATION_INFO_REQUEST_STATUS_SUCCESS -> "COMPILATION_INFO_REQUEST_STATUS_SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CompilationInfoRequestStatus() {}
}
