package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class MapAsyncStatus {
    public static final int MAP_ASYNC_STATUS_SUCCESS = 0x1;
    public static final int MAP_ASYNC_STATUS_CALLBACK_CANCELLED = 0x2;
    public static final int MAP_ASYNC_STATUS_ERROR = 0x3;
    public static final int MAP_ASYNC_STATUS_ABORTED = 0x4;
    public static final int MAP_ASYNC_STATUS_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(MapAsyncStatus.class) int value) {
        return switch (value) {
            case MapAsyncStatus.MAP_ASYNC_STATUS_ABORTED -> "MAP_ASYNC_STATUS_ABORTED";
            case MapAsyncStatus.MAP_ASYNC_STATUS_CALLBACK_CANCELLED -> "MAP_ASYNC_STATUS_CALLBACK_CANCELLED";
            case MapAsyncStatus.MAP_ASYNC_STATUS_ERROR -> "MAP_ASYNC_STATUS_ERROR";
            case MapAsyncStatus.MAP_ASYNC_STATUS_FORCE32 -> "MAP_ASYNC_STATUS_FORCE32";
            case MapAsyncStatus.MAP_ASYNC_STATUS_SUCCESS -> "MAP_ASYNC_STATUS_SUCCESS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private MapAsyncStatus() {}
}
