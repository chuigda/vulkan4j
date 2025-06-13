package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class QueueWorkDoneStatus {
    public static final int QUEUE_WORK_DONE_STATUS_SUCCESS = 0x1;
    public static final int QUEUE_WORK_DONE_STATUS_CALLBACK_CANCELLED = 0x2;
    public static final int QUEUE_WORK_DONE_STATUS_ERROR = 0x3;
    public static final int QUEUE_WORK_DONE_STATUS_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(QueueWorkDoneStatus.class) int value) {
        return switch (value) {
            case QueueWorkDoneStatus.QUEUE_WORK_DONE_STATUS_CALLBACK_CANCELLED -> "QUEUE_WORK_DONE_STATUS_CALLBACK_CANCELLED";
            case QueueWorkDoneStatus.QUEUE_WORK_DONE_STATUS_ERROR -> "QUEUE_WORK_DONE_STATUS_ERROR";
            case QueueWorkDoneStatus.QUEUE_WORK_DONE_STATUS_FORCE32 -> "QUEUE_WORK_DONE_STATUS_FORCE32";
            case QueueWorkDoneStatus.QUEUE_WORK_DONE_STATUS_SUCCESS -> "QUEUE_WORK_DONE_STATUS_SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private QueueWorkDoneStatus() {}
}
