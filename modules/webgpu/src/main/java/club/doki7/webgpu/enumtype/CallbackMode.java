package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class CallbackMode {
    public static final int CALLBACK_MODE_WAIT_ANY_ONLY = 0x1;
    public static final int CALLBACK_MODE_ALLOW_PROCESS_EVENTS = 0x2;
    public static final int CALLBACK_MODE_ALLOW_SPONTANEOUS = 0x3;
    public static final int CALLBACK_MODE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(CallbackMode.class) int value) {
        return switch (value) {
            case CallbackMode.CALLBACK_MODE_ALLOW_PROCESS_EVENTS -> "CALLBACK_MODE_ALLOW_PROCESS_EVENTS";
            case CallbackMode.CALLBACK_MODE_ALLOW_SPONTANEOUS -> "CALLBACK_MODE_ALLOW_SPONTANEOUS";
            case CallbackMode.CALLBACK_MODE_FORCE32 -> "CALLBACK_MODE_FORCE32";
            case CallbackMode.CALLBACK_MODE_WAIT_ANY_ONLY -> "CALLBACK_MODE_WAIT_ANY_ONLY";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private CallbackMode() {}
}
