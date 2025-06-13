package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class PopErrorScopeStatus {
    public static final int POP_ERROR_SCOPE_STATUS_SUCCESS = 0x1;
    public static final int POP_ERROR_SCOPE_STATUS_CALLBACK_CANCELLED = 0x2;
    public static final int POP_ERROR_SCOPE_STATUS_ERROR = 0x3;
    public static final int POP_ERROR_SCOPE_STATUS_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(PopErrorScopeStatus.class) int value) {
        return switch (value) {
            case PopErrorScopeStatus.POP_ERROR_SCOPE_STATUS_CALLBACK_CANCELLED -> "POP_ERROR_SCOPE_STATUS_CALLBACK_CANCELLED";
            case PopErrorScopeStatus.POP_ERROR_SCOPE_STATUS_ERROR -> "POP_ERROR_SCOPE_STATUS_ERROR";
            case PopErrorScopeStatus.POP_ERROR_SCOPE_STATUS_FORCE32 -> "POP_ERROR_SCOPE_STATUS_FORCE32";
            case PopErrorScopeStatus.POP_ERROR_SCOPE_STATUS_SUCCESS -> "POP_ERROR_SCOPE_STATUS_SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private PopErrorScopeStatus() {}
}
