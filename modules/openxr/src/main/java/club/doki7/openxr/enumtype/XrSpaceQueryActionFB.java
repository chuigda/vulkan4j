package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpaceQueryActionFB.html"><code>XrSpaceQueryActionFB</code></a>
public final class XrSpaceQueryActionFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_QUERY_ACTION_LOAD_FB.html"><code>XR_SPACE_QUERY_ACTION_LOAD_FB</code></a>
    public static final int LOAD = 0x0;

    public static String explain(@EnumType(XrSpaceQueryActionFB.class) int value) {
        return switch (value) {
            case XrSpaceQueryActionFB.LOAD -> "XR_SPACE_QUERY_ACTION_LOAD_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpaceQueryActionFB() {}
}
