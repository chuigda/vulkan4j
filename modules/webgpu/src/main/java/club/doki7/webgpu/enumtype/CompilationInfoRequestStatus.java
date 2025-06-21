package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CompilationInfoRequestStatus {
    public static final int SUCCESS = 0x1;
    public static final int CALLBACK_CANCELLED = 0x2;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CompilationInfoRequestStatus.class) int value) {
        return switch (value) {
            case CompilationInfoRequestStatus.CALLBACK_CANCELLED -> "CALLBACK_CANCELLED";
            case CompilationInfoRequestStatus.FORCE32 -> "FORCE32";
            case CompilationInfoRequestStatus.SUCCESS -> "SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CompilationInfoRequestStatus() {}
}
