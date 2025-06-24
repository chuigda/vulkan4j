package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrResult.html"><code>XrResult</code></a>
public final class XrResult {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SUCCESS.html"><code>XR_SUCCESS</code></a>
    public static final int XR_SUCCESS = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_TIMEOUT_EXPIRED.html"><code>XR_TIMEOUT_EXPIRED</code></a>
    public static final int XR_TIMEOUT_EXPIRED = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SESSION_LOSS_PENDING.html"><code>XR_SESSION_LOSS_PENDING</code></a>
    public static final int XR_SESSION_LOSS_PENDING = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_EVENT_UNAVAILABLE.html"><code>XR_EVENT_UNAVAILABLE</code></a>
    public static final int XR_EVENT_UNAVAILABLE = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_BOUNDS_UNAVAILABLE.html"><code>XR_SPACE_BOUNDS_UNAVAILABLE</code></a>
    public static final int XR_SPACE_BOUNDS_UNAVAILABLE = 0x7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SESSION_NOT_FOCUSED.html"><code>XR_SESSION_NOT_FOCUSED</code></a>
    public static final int XR_SESSION_NOT_FOCUSED = 0x8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FRAME_DISCARDED.html"><code>XR_FRAME_DISCARDED</code></a>
    public static final int XR_FRAME_DISCARDED = 0x9;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_VALIDATION_FAILURE.html"><code>XR_ERROR_VALIDATION_FAILURE</code></a>
    public static final int XR_ERROR_VALIDATION_FAILURE = 0xffffffff;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_RUNTIME_FAILURE.html"><code>XR_ERROR_RUNTIME_FAILURE</code></a>
    public static final int XR_ERROR_RUNTIME_FAILURE = 0xfffffffe;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_OUT_OF_MEMORY.html"><code>XR_ERROR_OUT_OF_MEMORY</code></a>
    public static final int XR_ERROR_OUT_OF_MEMORY = 0xfffffffd;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_API_VERSION_UNSUPPORTED.html"><code>XR_ERROR_API_VERSION_UNSUPPORTED</code></a>
    public static final int XR_ERROR_API_VERSION_UNSUPPORTED = 0xfffffffc;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_INITIALIZATION_FAILED.html"><code>XR_ERROR_INITIALIZATION_FAILED</code></a>
    public static final int XR_ERROR_INITIALIZATION_FAILED = 0xfffffffa;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FUNCTION_UNSUPPORTED.html"><code>XR_ERROR_FUNCTION_UNSUPPORTED</code></a>
    public static final int XR_ERROR_FUNCTION_UNSUPPORTED = 0xfffffff9;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FEATURE_UNSUPPORTED.html"><code>XR_ERROR_FEATURE_UNSUPPORTED</code></a>
    public static final int XR_ERROR_FEATURE_UNSUPPORTED = 0xfffffff8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_EXTENSION_NOT_PRESENT.html"><code>XR_ERROR_EXTENSION_NOT_PRESENT</code></a>
    public static final int XR_ERROR_EXTENSION_NOT_PRESENT = 0xfffffff7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LIMIT_REACHED.html"><code>XR_ERROR_LIMIT_REACHED</code></a>
    public static final int XR_ERROR_LIMIT_REACHED = 0xfffffff6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SIZE_INSUFFICIENT.html"><code>XR_ERROR_SIZE_INSUFFICIENT</code></a>
    public static final int XR_ERROR_SIZE_INSUFFICIENT = 0xfffffff5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_HANDLE_INVALID.html"><code>XR_ERROR_HANDLE_INVALID</code></a>
    public static final int XR_ERROR_HANDLE_INVALID = 0xfffffff4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_INSTANCE_LOST.html"><code>XR_ERROR_INSTANCE_LOST</code></a>
    public static final int XR_ERROR_INSTANCE_LOST = 0xfffffff3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SESSION_RUNNING.html"><code>XR_ERROR_SESSION_RUNNING</code></a>
    public static final int XR_ERROR_SESSION_RUNNING = 0xfffffff2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SESSION_NOT_RUNNING.html"><code>XR_ERROR_SESSION_NOT_RUNNING</code></a>
    public static final int XR_ERROR_SESSION_NOT_RUNNING = 0xfffffff0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SESSION_LOST.html"><code>XR_ERROR_SESSION_LOST</code></a>
    public static final int XR_ERROR_SESSION_LOST = 0xffffffef;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SYSTEM_INVALID.html"><code>XR_ERROR_SYSTEM_INVALID</code></a>
    public static final int XR_ERROR_SYSTEM_INVALID = 0xffffffee;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PATH_INVALID.html"><code>XR_ERROR_PATH_INVALID</code></a>
    public static final int XR_ERROR_PATH_INVALID = 0xffffffed;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PATH_COUNT_EXCEEDED.html"><code>XR_ERROR_PATH_COUNT_EXCEEDED</code></a>
    public static final int XR_ERROR_PATH_COUNT_EXCEEDED = 0xffffffec;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PATH_FORMAT_INVALID.html"><code>XR_ERROR_PATH_FORMAT_INVALID</code></a>
    public static final int XR_ERROR_PATH_FORMAT_INVALID = 0xffffffeb;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PATH_UNSUPPORTED.html"><code>XR_ERROR_PATH_UNSUPPORTED</code></a>
    public static final int XR_ERROR_PATH_UNSUPPORTED = 0xffffffea;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LAYER_INVALID.html"><code>XR_ERROR_LAYER_INVALID</code></a>
    public static final int XR_ERROR_LAYER_INVALID = 0xffffffe9;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LAYER_LIMIT_EXCEEDED.html"><code>XR_ERROR_LAYER_LIMIT_EXCEEDED</code></a>
    public static final int XR_ERROR_LAYER_LIMIT_EXCEEDED = 0xffffffe8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SWAPCHAIN_RECT_INVALID.html"><code>XR_ERROR_SWAPCHAIN_RECT_INVALID</code></a>
    public static final int XR_ERROR_SWAPCHAIN_RECT_INVALID = 0xffffffe7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED.html"><code>XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED</code></a>
    public static final int XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED = 0xffffffe6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_ACTION_TYPE_MISMATCH.html"><code>XR_ERROR_ACTION_TYPE_MISMATCH</code></a>
    public static final int XR_ERROR_ACTION_TYPE_MISMATCH = 0xffffffe5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SESSION_NOT_READY.html"><code>XR_ERROR_SESSION_NOT_READY</code></a>
    public static final int XR_ERROR_SESSION_NOT_READY = 0xffffffe4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SESSION_NOT_STOPPING.html"><code>XR_ERROR_SESSION_NOT_STOPPING</code></a>
    public static final int XR_ERROR_SESSION_NOT_STOPPING = 0xffffffe3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_TIME_INVALID.html"><code>XR_ERROR_TIME_INVALID</code></a>
    public static final int XR_ERROR_TIME_INVALID = 0xffffffe2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_REFERENCE_SPACE_UNSUPPORTED.html"><code>XR_ERROR_REFERENCE_SPACE_UNSUPPORTED</code></a>
    public static final int XR_ERROR_REFERENCE_SPACE_UNSUPPORTED = 0xffffffe1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FILE_ACCESS_ERROR.html"><code>XR_ERROR_FILE_ACCESS_ERROR</code></a>
    public static final int XR_ERROR_FILE_ACCESS_ERROR = 0xffffffe0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FILE_CONTENTS_INVALID.html"><code>XR_ERROR_FILE_CONTENTS_INVALID</code></a>
    public static final int XR_ERROR_FILE_CONTENTS_INVALID = 0xffffffdf;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FORM_FACTOR_UNSUPPORTED.html"><code>XR_ERROR_FORM_FACTOR_UNSUPPORTED</code></a>
    public static final int XR_ERROR_FORM_FACTOR_UNSUPPORTED = 0xffffffde;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FORM_FACTOR_UNAVAILABLE.html"><code>XR_ERROR_FORM_FACTOR_UNAVAILABLE</code></a>
    public static final int XR_ERROR_FORM_FACTOR_UNAVAILABLE = 0xffffffdd;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_API_LAYER_NOT_PRESENT.html"><code>XR_ERROR_API_LAYER_NOT_PRESENT</code></a>
    public static final int XR_ERROR_API_LAYER_NOT_PRESENT = 0xffffffdc;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_CALL_ORDER_INVALID.html"><code>XR_ERROR_CALL_ORDER_INVALID</code></a>
    public static final int XR_ERROR_CALL_ORDER_INVALID = 0xffffffdb;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_GRAPHICS_DEVICE_INVALID.html"><code>XR_ERROR_GRAPHICS_DEVICE_INVALID</code></a>
    public static final int XR_ERROR_GRAPHICS_DEVICE_INVALID = 0xffffffda;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_POSE_INVALID.html"><code>XR_ERROR_POSE_INVALID</code></a>
    public static final int XR_ERROR_POSE_INVALID = 0xffffffd9;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_INDEX_OUT_OF_RANGE.html"><code>XR_ERROR_INDEX_OUT_OF_RANGE</code></a>
    public static final int XR_ERROR_INDEX_OUT_OF_RANGE = 0xffffffd8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED.html"><code>XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED</code></a>
    public static final int XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED = 0xffffffd7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED.html"><code>XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED</code></a>
    public static final int XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED = 0xffffffd6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_NAME_DUPLICATED.html"><code>XR_ERROR_NAME_DUPLICATED</code></a>
    public static final int XR_ERROR_NAME_DUPLICATED = 0xffffffd4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_NAME_INVALID.html"><code>XR_ERROR_NAME_INVALID</code></a>
    public static final int XR_ERROR_NAME_INVALID = 0xffffffd3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_ACTIONSET_NOT_ATTACHED.html"><code>XR_ERROR_ACTIONSET_NOT_ATTACHED</code></a>
    public static final int XR_ERROR_ACTIONSET_NOT_ATTACHED = 0xffffffd2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_ACTIONSETS_ALREADY_ATTACHED.html"><code>XR_ERROR_ACTIONSETS_ALREADY_ATTACHED</code></a>
    public static final int XR_ERROR_ACTIONSETS_ALREADY_ATTACHED = 0xffffffd1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LOCALIZED_NAME_DUPLICATED.html"><code>XR_ERROR_LOCALIZED_NAME_DUPLICATED</code></a>
    public static final int XR_ERROR_LOCALIZED_NAME_DUPLICATED = 0xffffffd0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LOCALIZED_NAME_INVALID.html"><code>XR_ERROR_LOCALIZED_NAME_INVALID</code></a>
    public static final int XR_ERROR_LOCALIZED_NAME_INVALID = 0xffffffcf;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING.html"><code>XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING</code></a>
    public static final int XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING = 0xffffffce;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_RUNTIME_UNAVAILABLE.html"><code>XR_ERROR_RUNTIME_UNAVAILABLE</code></a>
    public static final int XR_ERROR_RUNTIME_UNAVAILABLE = 0xffffffcd;

    public static String explain(@EnumType(XrResult.class) int value) {
        return switch (value) {
            case XrResult.XR_ERROR_ACTIONSETS_ALREADY_ATTACHED -> "XR_ERROR_ACTIONSETS_ALREADY_ATTACHED";
            case XrResult.XR_ERROR_ACTIONSET_NOT_ATTACHED -> "XR_ERROR_ACTIONSET_NOT_ATTACHED";
            case XrResult.XR_ERROR_ACTION_TYPE_MISMATCH -> "XR_ERROR_ACTION_TYPE_MISMATCH";
            case XrResult.XR_ERROR_API_LAYER_NOT_PRESENT -> "XR_ERROR_API_LAYER_NOT_PRESENT";
            case XrResult.XR_ERROR_API_VERSION_UNSUPPORTED -> "XR_ERROR_API_VERSION_UNSUPPORTED";
            case XrResult.XR_ERROR_CALL_ORDER_INVALID -> "XR_ERROR_CALL_ORDER_INVALID";
            case XrResult.XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED -> "XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED";
            case XrResult.XR_ERROR_EXTENSION_NOT_PRESENT -> "XR_ERROR_EXTENSION_NOT_PRESENT";
            case XrResult.XR_ERROR_FEATURE_UNSUPPORTED -> "XR_ERROR_FEATURE_UNSUPPORTED";
            case XrResult.XR_ERROR_FILE_ACCESS_ERROR -> "XR_ERROR_FILE_ACCESS_ERROR";
            case XrResult.XR_ERROR_FILE_CONTENTS_INVALID -> "XR_ERROR_FILE_CONTENTS_INVALID";
            case XrResult.XR_ERROR_FORM_FACTOR_UNAVAILABLE -> "XR_ERROR_FORM_FACTOR_UNAVAILABLE";
            case XrResult.XR_ERROR_FORM_FACTOR_UNSUPPORTED -> "XR_ERROR_FORM_FACTOR_UNSUPPORTED";
            case XrResult.XR_ERROR_FUNCTION_UNSUPPORTED -> "XR_ERROR_FUNCTION_UNSUPPORTED";
            case XrResult.XR_ERROR_GRAPHICS_DEVICE_INVALID -> "XR_ERROR_GRAPHICS_DEVICE_INVALID";
            case XrResult.XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING -> "XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING";
            case XrResult.XR_ERROR_HANDLE_INVALID -> "XR_ERROR_HANDLE_INVALID";
            case XrResult.XR_ERROR_INDEX_OUT_OF_RANGE -> "XR_ERROR_INDEX_OUT_OF_RANGE";
            case XrResult.XR_ERROR_INITIALIZATION_FAILED -> "XR_ERROR_INITIALIZATION_FAILED";
            case XrResult.XR_ERROR_INSTANCE_LOST -> "XR_ERROR_INSTANCE_LOST";
            case XrResult.XR_ERROR_LAYER_INVALID -> "XR_ERROR_LAYER_INVALID";
            case XrResult.XR_ERROR_LAYER_LIMIT_EXCEEDED -> "XR_ERROR_LAYER_LIMIT_EXCEEDED";
            case XrResult.XR_ERROR_LIMIT_REACHED -> "XR_ERROR_LIMIT_REACHED";
            case XrResult.XR_ERROR_LOCALIZED_NAME_DUPLICATED -> "XR_ERROR_LOCALIZED_NAME_DUPLICATED";
            case XrResult.XR_ERROR_LOCALIZED_NAME_INVALID -> "XR_ERROR_LOCALIZED_NAME_INVALID";
            case XrResult.XR_ERROR_NAME_DUPLICATED -> "XR_ERROR_NAME_DUPLICATED";
            case XrResult.XR_ERROR_NAME_INVALID -> "XR_ERROR_NAME_INVALID";
            case XrResult.XR_ERROR_OUT_OF_MEMORY -> "XR_ERROR_OUT_OF_MEMORY";
            case XrResult.XR_ERROR_PATH_COUNT_EXCEEDED -> "XR_ERROR_PATH_COUNT_EXCEEDED";
            case XrResult.XR_ERROR_PATH_FORMAT_INVALID -> "XR_ERROR_PATH_FORMAT_INVALID";
            case XrResult.XR_ERROR_PATH_INVALID -> "XR_ERROR_PATH_INVALID";
            case XrResult.XR_ERROR_PATH_UNSUPPORTED -> "XR_ERROR_PATH_UNSUPPORTED";
            case XrResult.XR_ERROR_POSE_INVALID -> "XR_ERROR_POSE_INVALID";
            case XrResult.XR_ERROR_REFERENCE_SPACE_UNSUPPORTED -> "XR_ERROR_REFERENCE_SPACE_UNSUPPORTED";
            case XrResult.XR_ERROR_RUNTIME_FAILURE -> "XR_ERROR_RUNTIME_FAILURE";
            case XrResult.XR_ERROR_RUNTIME_UNAVAILABLE -> "XR_ERROR_RUNTIME_UNAVAILABLE";
            case XrResult.XR_ERROR_SESSION_LOST -> "XR_ERROR_SESSION_LOST";
            case XrResult.XR_ERROR_SESSION_NOT_READY -> "XR_ERROR_SESSION_NOT_READY";
            case XrResult.XR_ERROR_SESSION_NOT_RUNNING -> "XR_ERROR_SESSION_NOT_RUNNING";
            case XrResult.XR_ERROR_SESSION_NOT_STOPPING -> "XR_ERROR_SESSION_NOT_STOPPING";
            case XrResult.XR_ERROR_SESSION_RUNNING -> "XR_ERROR_SESSION_RUNNING";
            case XrResult.XR_ERROR_SIZE_INSUFFICIENT -> "XR_ERROR_SIZE_INSUFFICIENT";
            case XrResult.XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED -> "XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED";
            case XrResult.XR_ERROR_SWAPCHAIN_RECT_INVALID -> "XR_ERROR_SWAPCHAIN_RECT_INVALID";
            case XrResult.XR_ERROR_SYSTEM_INVALID -> "XR_ERROR_SYSTEM_INVALID";
            case XrResult.XR_ERROR_TIME_INVALID -> "XR_ERROR_TIME_INVALID";
            case XrResult.XR_ERROR_VALIDATION_FAILURE -> "XR_ERROR_VALIDATION_FAILURE";
            case XrResult.XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED -> "XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED";
            case XrResult.XR_EVENT_UNAVAILABLE -> "XR_EVENT_UNAVAILABLE";
            case XrResult.XR_FRAME_DISCARDED -> "XR_FRAME_DISCARDED";
            case XrResult.XR_SESSION_LOSS_PENDING -> "XR_SESSION_LOSS_PENDING";
            case XrResult.XR_SESSION_NOT_FOCUSED -> "XR_SESSION_NOT_FOCUSED";
            case XrResult.XR_SPACE_BOUNDS_UNAVAILABLE -> "XR_SPACE_BOUNDS_UNAVAILABLE";
            case XrResult.XR_SUCCESS -> "XR_SUCCESS";
            case XrResult.XR_TIMEOUT_EXPIRED -> "XR_TIMEOUT_EXPIRED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrResult() {}
}
