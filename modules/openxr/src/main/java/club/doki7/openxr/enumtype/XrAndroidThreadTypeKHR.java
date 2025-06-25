package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrAndroidThreadTypeKHR.html"><code>XrAndroidThreadTypeKHR</code></a>
public final class XrAndroidThreadTypeKHR {
    public static final int APPLICATION_MAIN = 0x1;
    public static final int APPLICATION_WORKER = 0x2;
    public static final int RENDERER_MAIN = 0x3;
    public static final int RENDERER_WORKER = 0x4;

    public static String explain(@EnumType(XrAndroidThreadTypeKHR.class) int value) {
        return switch (value) {
            case XrAndroidThreadTypeKHR.APPLICATION_MAIN -> "XR_ANDROID_THREAD_TYPE_APPLICATION_MAIN_KHR";
            case XrAndroidThreadTypeKHR.APPLICATION_WORKER -> "XR_ANDROID_THREAD_TYPE_APPLICATION_WORKER_KHR";
            case XrAndroidThreadTypeKHR.RENDERER_MAIN -> "XR_ANDROID_THREAD_TYPE_RENDERER_MAIN_KHR";
            case XrAndroidThreadTypeKHR.RENDERER_WORKER -> "XR_ANDROID_THREAD_TYPE_RENDERER_WORKER_KHR";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrAndroidThreadTypeKHR() {}
}
