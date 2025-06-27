package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUPopErrorScopeStatus {
    public static final int SUCCESS = 0x1;
    public static final int INSTANCE_DROPPED = 0x2;
    public static final int EMPTY_STACK = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUPopErrorScopeStatus.class) int value) {
        return switch (value) {
            case WGPUPopErrorScopeStatus.EMPTY_STACK -> "EMPTY_STACK";
            case WGPUPopErrorScopeStatus.FORCE32 -> "FORCE32";
            case WGPUPopErrorScopeStatus.INSTANCE_DROPPED -> "INSTANCE_DROPPED";
            case WGPUPopErrorScopeStatus.SUCCESS -> "SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUPopErrorScopeStatus() {}
}
