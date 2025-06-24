package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrObjectType.html"><code>XrObjectType</code></a>
public final class XrObjectType {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_OBJECT_TYPE_UNKNOWN.html"><code>XR_OBJECT_TYPE_UNKNOWN</code></a>
    public static final int UNKNOWN = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_OBJECT_TYPE_INSTANCE.html"><code>XR_OBJECT_TYPE_INSTANCE</code></a>
    public static final int INSTANCE = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_OBJECT_TYPE_SESSION.html"><code>XR_OBJECT_TYPE_SESSION</code></a>
    public static final int SESSION = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_OBJECT_TYPE_SWAPCHAIN.html"><code>XR_OBJECT_TYPE_SWAPCHAIN</code></a>
    public static final int SWAPCHAIN = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_OBJECT_TYPE_SPACE.html"><code>XR_OBJECT_TYPE_SPACE</code></a>
    public static final int SPACE = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_OBJECT_TYPE_ACTION_SET.html"><code>XR_OBJECT_TYPE_ACTION_SET</code></a>
    public static final int ACTION_SET = 0x5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_OBJECT_TYPE_ACTION.html"><code>XR_OBJECT_TYPE_ACTION</code></a>
    public static final int ACTION = 0x6;

    public static String explain(@EnumType(XrObjectType.class) int value) {
        return switch (value) {
            case XrObjectType.ACTION -> "XR_OBJECT_TYPE_ACTION";
            case XrObjectType.ACTION_SET -> "XR_OBJECT_TYPE_ACTION_SET";
            case XrObjectType.INSTANCE -> "XR_OBJECT_TYPE_INSTANCE";
            case XrObjectType.SESSION -> "XR_OBJECT_TYPE_SESSION";
            case XrObjectType.SPACE -> "XR_OBJECT_TYPE_SPACE";
            case XrObjectType.SWAPCHAIN -> "XR_OBJECT_TYPE_SWAPCHAIN";
            case XrObjectType.UNKNOWN -> "XR_OBJECT_TYPE_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrObjectType() {}
}
