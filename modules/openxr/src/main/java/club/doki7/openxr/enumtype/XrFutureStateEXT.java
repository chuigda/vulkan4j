package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFutureStateEXT.html"><code>XrFutureStateEXT</code></a>
public final class XrFutureStateEXT {
    public static final int PENDING = 0x1;
    public static final int READY = 0x2;

    public static String explain(@EnumType(XrFutureStateEXT.class) int value) {
        return switch (value) {
            case XrFutureStateEXT.PENDING -> "XR_FUTURE_STATE_PENDING_EXT";
            case XrFutureStateEXT.READY -> "XR_FUTURE_STATE_READY_EXT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFutureStateEXT() {}
}
