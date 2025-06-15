package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class QueueWorkDoneStatus {
    public static final int SUCCESS = 0x1;
    public static final int CALLBACK_CANCELLED = 0x2;
    public static final int ERROR = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(QueueWorkDoneStatus.class) int value) {
        return switch (value) {
            case QueueWorkDoneStatus.CALLBACK_CANCELLED -> "CALLBACK_CANCELLED";
            case QueueWorkDoneStatus.ERROR -> "ERROR";
            case QueueWorkDoneStatus.FORCE32 -> "FORCE32";
            case QueueWorkDoneStatus.SUCCESS -> "SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private QueueWorkDoneStatus() {}
}
