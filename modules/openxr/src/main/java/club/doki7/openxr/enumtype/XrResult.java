package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrResult.html"><code>XrResult</code></a>
public final class XrResult {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SUCCESS.html"><code>XR_SUCCESS</code></a>
    public static final int SUCCESS = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_TIMEOUT_EXPIRED.html"><code>XR_TIMEOUT_EXPIRED</code></a>
    public static final int TIMEOUT_EXPIRED = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SESSION_LOSS_PENDING.html"><code>XR_SESSION_LOSS_PENDING</code></a>
    public static final int SESSION_LOSS_PENDING = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_EVENT_UNAVAILABLE.html"><code>XR_EVENT_UNAVAILABLE</code></a>
    public static final int EVENT_UNAVAILABLE = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SPACE_BOUNDS_UNAVAILABLE.html"><code>XR_SPACE_BOUNDS_UNAVAILABLE</code></a>
    public static final int SPACE_BOUNDS_UNAVAILABLE = 0x7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SESSION_NOT_FOCUSED.html"><code>XR_SESSION_NOT_FOCUSED</code></a>
    public static final int SESSION_NOT_FOCUSED = 0x8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FRAME_DISCARDED.html"><code>XR_FRAME_DISCARDED</code></a>
    public static final int FRAME_DISCARDED = 0x9;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_VALIDATION_FAILURE.html"><code>XR_ERROR_VALIDATION_FAILURE</code></a>
    public static final int ERROR_VALIDATION_FAILURE = 0xffffffff;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_RUNTIME_FAILURE.html"><code>XR_ERROR_RUNTIME_FAILURE</code></a>
    public static final int ERROR_RUNTIME_FAILURE = 0xfffffffe;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_OUT_OF_MEMORY.html"><code>XR_ERROR_OUT_OF_MEMORY</code></a>
    public static final int ERROR_OUT_OF_MEMORY = 0xfffffffd;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_API_VERSION_UNSUPPORTED.html"><code>XR_ERROR_API_VERSION_UNSUPPORTED</code></a>
    public static final int ERROR_API_VERSION_UNSUPPORTED = 0xfffffffc;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_INITIALIZATION_FAILED.html"><code>XR_ERROR_INITIALIZATION_FAILED</code></a>
    public static final int ERROR_INITIALIZATION_FAILED = 0xfffffffa;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FUNCTION_UNSUPPORTED.html"><code>XR_ERROR_FUNCTION_UNSUPPORTED</code></a>
    public static final int ERROR_FUNCTION_UNSUPPORTED = 0xfffffff9;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FEATURE_UNSUPPORTED.html"><code>XR_ERROR_FEATURE_UNSUPPORTED</code></a>
    public static final int ERROR_FEATURE_UNSUPPORTED = 0xfffffff8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_EXTENSION_NOT_PRESENT.html"><code>XR_ERROR_EXTENSION_NOT_PRESENT</code></a>
    public static final int ERROR_EXTENSION_NOT_PRESENT = 0xfffffff7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LIMIT_REACHED.html"><code>XR_ERROR_LIMIT_REACHED</code></a>
    public static final int ERROR_LIMIT_REACHED = 0xfffffff6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SIZE_INSUFFICIENT.html"><code>XR_ERROR_SIZE_INSUFFICIENT</code></a>
    public static final int ERROR_SIZE_INSUFFICIENT = 0xfffffff5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_HANDLE_INVALID.html"><code>XR_ERROR_HANDLE_INVALID</code></a>
    public static final int ERROR_HANDLE_INVALID = 0xfffffff4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_INSTANCE_LOST.html"><code>XR_ERROR_INSTANCE_LOST</code></a>
    public static final int ERROR_INSTANCE_LOST = 0xfffffff3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SESSION_RUNNING.html"><code>XR_ERROR_SESSION_RUNNING</code></a>
    public static final int ERROR_SESSION_RUNNING = 0xfffffff2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SESSION_NOT_RUNNING.html"><code>XR_ERROR_SESSION_NOT_RUNNING</code></a>
    public static final int ERROR_SESSION_NOT_RUNNING = 0xfffffff0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SESSION_LOST.html"><code>XR_ERROR_SESSION_LOST</code></a>
    public static final int ERROR_SESSION_LOST = 0xffffffef;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SYSTEM_INVALID.html"><code>XR_ERROR_SYSTEM_INVALID</code></a>
    public static final int ERROR_SYSTEM_INVALID = 0xffffffee;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PATH_INVALID.html"><code>XR_ERROR_PATH_INVALID</code></a>
    public static final int ERROR_PATH_INVALID = 0xffffffed;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PATH_COUNT_EXCEEDED.html"><code>XR_ERROR_PATH_COUNT_EXCEEDED</code></a>
    public static final int ERROR_PATH_COUNT_EXCEEDED = 0xffffffec;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PATH_FORMAT_INVALID.html"><code>XR_ERROR_PATH_FORMAT_INVALID</code></a>
    public static final int ERROR_PATH_FORMAT_INVALID = 0xffffffeb;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PATH_UNSUPPORTED.html"><code>XR_ERROR_PATH_UNSUPPORTED</code></a>
    public static final int ERROR_PATH_UNSUPPORTED = 0xffffffea;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LAYER_INVALID.html"><code>XR_ERROR_LAYER_INVALID</code></a>
    public static final int ERROR_LAYER_INVALID = 0xffffffe9;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LAYER_LIMIT_EXCEEDED.html"><code>XR_ERROR_LAYER_LIMIT_EXCEEDED</code></a>
    public static final int ERROR_LAYER_LIMIT_EXCEEDED = 0xffffffe8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SWAPCHAIN_RECT_INVALID.html"><code>XR_ERROR_SWAPCHAIN_RECT_INVALID</code></a>
    public static final int ERROR_SWAPCHAIN_RECT_INVALID = 0xffffffe7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED.html"><code>XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED</code></a>
    public static final int ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED = 0xffffffe6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_ACTION_TYPE_MISMATCH.html"><code>XR_ERROR_ACTION_TYPE_MISMATCH</code></a>
    public static final int ERROR_ACTION_TYPE_MISMATCH = 0xffffffe5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SESSION_NOT_READY.html"><code>XR_ERROR_SESSION_NOT_READY</code></a>
    public static final int ERROR_SESSION_NOT_READY = 0xffffffe4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SESSION_NOT_STOPPING.html"><code>XR_ERROR_SESSION_NOT_STOPPING</code></a>
    public static final int ERROR_SESSION_NOT_STOPPING = 0xffffffe3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_TIME_INVALID.html"><code>XR_ERROR_TIME_INVALID</code></a>
    public static final int ERROR_TIME_INVALID = 0xffffffe2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_REFERENCE_SPACE_UNSUPPORTED.html"><code>XR_ERROR_REFERENCE_SPACE_UNSUPPORTED</code></a>
    public static final int ERROR_REFERENCE_SPACE_UNSUPPORTED = 0xffffffe1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FILE_ACCESS_ERROR.html"><code>XR_ERROR_FILE_ACCESS_ERROR</code></a>
    public static final int ERROR_FILE_ACCESS_ERROR = 0xffffffe0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FILE_CONTENTS_INVALID.html"><code>XR_ERROR_FILE_CONTENTS_INVALID</code></a>
    public static final int ERROR_FILE_CONTENTS_INVALID = 0xffffffdf;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FORM_FACTOR_UNSUPPORTED.html"><code>XR_ERROR_FORM_FACTOR_UNSUPPORTED</code></a>
    public static final int ERROR_FORM_FACTOR_UNSUPPORTED = 0xffffffde;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FORM_FACTOR_UNAVAILABLE.html"><code>XR_ERROR_FORM_FACTOR_UNAVAILABLE</code></a>
    public static final int ERROR_FORM_FACTOR_UNAVAILABLE = 0xffffffdd;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_API_LAYER_NOT_PRESENT.html"><code>XR_ERROR_API_LAYER_NOT_PRESENT</code></a>
    public static final int ERROR_API_LAYER_NOT_PRESENT = 0xffffffdc;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_CALL_ORDER_INVALID.html"><code>XR_ERROR_CALL_ORDER_INVALID</code></a>
    public static final int ERROR_CALL_ORDER_INVALID = 0xffffffdb;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_GRAPHICS_DEVICE_INVALID.html"><code>XR_ERROR_GRAPHICS_DEVICE_INVALID</code></a>
    public static final int ERROR_GRAPHICS_DEVICE_INVALID = 0xffffffda;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_POSE_INVALID.html"><code>XR_ERROR_POSE_INVALID</code></a>
    public static final int ERROR_POSE_INVALID = 0xffffffd9;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_INDEX_OUT_OF_RANGE.html"><code>XR_ERROR_INDEX_OUT_OF_RANGE</code></a>
    public static final int ERROR_INDEX_OUT_OF_RANGE = 0xffffffd8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED.html"><code>XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED</code></a>
    public static final int ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED = 0xffffffd7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED.html"><code>XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED</code></a>
    public static final int ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED = 0xffffffd6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_NAME_DUPLICATED.html"><code>XR_ERROR_NAME_DUPLICATED</code></a>
    public static final int ERROR_NAME_DUPLICATED = 0xffffffd4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_NAME_INVALID.html"><code>XR_ERROR_NAME_INVALID</code></a>
    public static final int ERROR_NAME_INVALID = 0xffffffd3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_ACTIONSET_NOT_ATTACHED.html"><code>XR_ERROR_ACTIONSET_NOT_ATTACHED</code></a>
    public static final int ERROR_ACTIONSET_NOT_ATTACHED = 0xffffffd2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_ACTIONSETS_ALREADY_ATTACHED.html"><code>XR_ERROR_ACTIONSETS_ALREADY_ATTACHED</code></a>
    public static final int ERROR_ACTIONSETS_ALREADY_ATTACHED = 0xffffffd1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LOCALIZED_NAME_DUPLICATED.html"><code>XR_ERROR_LOCALIZED_NAME_DUPLICATED</code></a>
    public static final int ERROR_LOCALIZED_NAME_DUPLICATED = 0xffffffd0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LOCALIZED_NAME_INVALID.html"><code>XR_ERROR_LOCALIZED_NAME_INVALID</code></a>
    public static final int ERROR_LOCALIZED_NAME_INVALID = 0xffffffcf;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING.html"><code>XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING</code></a>
    public static final int ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING = 0xffffffce;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_RUNTIME_UNAVAILABLE.html"><code>XR_ERROR_RUNTIME_UNAVAILABLE</code></a>
    public static final int ERROR_RUNTIME_UNAVAILABLE = 0xffffffcd;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED.html"><code>XR_ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED</code></a>
    public static final int ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED = 0xc45a608f;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PERMISSION_INSUFFICIENT.html"><code>XR_ERROR_PERMISSION_INSUFFICIENT</code></a>
    public static final int ERROR_PERMISSION_INSUFFICIENT = 0xc45a6090;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_ANDROID_THREAD_SETTINGS_ID_INVALID_KHR.html"><code>XR_ERROR_ANDROID_THREAD_SETTINGS_ID_INVALID_KHR</code></a>
    public static final int ERROR_ANDROID_THREAD_SETTINGS_ID_INVALID_KHR = 0xc4652a48;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_ANDROID_THREAD_SETTINGS_FAILURE_KHR.html"><code>XR_ERROR_ANDROID_THREAD_SETTINGS_FAILURE_KHR</code></a>
    public static final int ERROR_ANDROID_THREAD_SETTINGS_FAILURE_KHR = 0xc4652a47;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT.html"><code>XR_ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT</code></a>
    public static final int ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT = 0xc4649da7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT.html"><code>XR_ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT</code></a>
    public static final int ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT = 0xc46466f8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT.html"><code>XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT</code></a>
    public static final int ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT = 0xc4645f28;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT.html"><code>XR_ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT</code></a>
    public static final int ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT = 0xc4643430;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT.html"><code>XR_ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT</code></a>
    public static final int ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT = 0xc463bb18;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SCENE_COMPONENT_ID_INVALID_MSFT.html"><code>XR_ERROR_SCENE_COMPONENT_ID_INVALID_MSFT</code></a>
    public static final int ERROR_SCENE_COMPONENT_ID_INVALID_MSFT = 0xc463bb17;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT.html"><code>XR_ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT</code></a>
    public static final int ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT = 0xc463bb16;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT.html"><code>XR_ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT</code></a>
    public static final int ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT = 0xc463bb15;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT.html"><code>XR_ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT</code></a>
    public static final int ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT = 0xc463bb14;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT.html"><code>XR_ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT</code></a>
    public static final int ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT = 0xc463bb13;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB.html"><code>XR_ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB</code></a>
    public static final int ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB = 0xc463ab78;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_COLOR_SPACE_UNSUPPORTED_FB.html"><code>XR_ERROR_COLOR_SPACE_UNSUPPORTED_FB</code></a>
    public static final int ERROR_COLOR_SPACE_UNSUPPORTED_FB = 0xc4639020;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB.html"><code>XR_ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB</code></a>
    public static final int ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB = 0xc4637c98;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB.html"><code>XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB</code></a>
    public static final int ERROR_SPACE_COMPONENT_NOT_ENABLED_FB = 0xc4637c97;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPACE_COMPONENT_STATUS_PENDING_FB.html"><code>XR_ERROR_SPACE_COMPONENT_STATUS_PENDING_FB</code></a>
    public static final int ERROR_SPACE_COMPONENT_STATUS_PENDING_FB = 0xc4637c96;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB.html"><code>XR_ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB</code></a>
    public static final int ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB = 0xc4637c95;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB.html"><code>XR_ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB</code></a>
    public static final int ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB = 0xc4636910;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB.html"><code>XR_ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB</code></a>
    public static final int ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB = 0xc463690f;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB.html"><code>XR_ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB</code></a>
    public static final int ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB = 0xc463690e;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_NOT_PERMITTED_PASSTHROUGH_FB.html"><code>XR_ERROR_NOT_PERMITTED_PASSTHROUGH_FB</code></a>
    public static final int ERROR_NOT_PERMITTED_PASSTHROUGH_FB = 0xc463690d;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB.html"><code>XR_ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB</code></a>
    public static final int ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB = 0xc463690c;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_UNKNOWN_PASSTHROUGH_FB.html"><code>XR_ERROR_UNKNOWN_PASSTHROUGH_FB</code></a>
    public static final int ERROR_UNKNOWN_PASSTHROUGH_FB = 0xc46368de;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_RENDER_MODEL_KEY_INVALID_FB.html"><code>XR_ERROR_RENDER_MODEL_KEY_INVALID_FB</code></a>
    public static final int ERROR_RENDER_MODEL_KEY_INVALID_FB = 0xc4636528;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_RENDER_MODEL_UNAVAILABLE_FB.html"><code>XR_RENDER_MODEL_UNAVAILABLE_FB</code></a>
    public static final int RENDER_MODEL_UNAVAILABLE_FB = 0x3b9c9aec;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_MARKER_NOT_TRACKED_VARJO.html"><code>XR_ERROR_MARKER_NOT_TRACKED_VARJO</code></a>
    public static final int ERROR_MARKER_NOT_TRACKED_VARJO = 0xc46351a0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_MARKER_ID_INVALID_VARJO.html"><code>XR_ERROR_MARKER_ID_INVALID_VARJO</code></a>
    public static final int ERROR_MARKER_ID_INVALID_VARJO = 0xc463519f;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML.html"><code>XR_ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML</code></a>
    public static final int ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML = 0xc4631af0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML.html"><code>XR_ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML</code></a>
    public static final int ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML = 0xc4631aef;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML.html"><code>XR_ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML</code></a>
    public static final int ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML = 0xc4631aee;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML.html"><code>XR_ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML</code></a>
    public static final int ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML = 0xc4631aed;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_MARKER_INVALID_ML.html"><code>XR_ERROR_MARKER_INVALID_ML</code></a>
    public static final int ERROR_MARKER_INVALID_ML = 0xc4631aec;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML.html"><code>XR_ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML</code></a>
    public static final int ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML = 0xc4631708;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML.html"><code>XR_ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML</code></a>
    public static final int ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML = 0xc4631707;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LOCALIZATION_MAP_FAIL_ML.html"><code>XR_ERROR_LOCALIZATION_MAP_FAIL_ML</code></a>
    public static final int ERROR_LOCALIZATION_MAP_FAIL_ML = 0xc4631706;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML.html"><code>XR_ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML</code></a>
    public static final int ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML = 0xc4631705;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML.html"><code>XR_ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML</code></a>
    public static final int ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML = 0xc4631704;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML.html"><code>XR_ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML</code></a>
    public static final int ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML = 0xc4631703;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML.html"><code>XR_ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML</code></a>
    public static final int ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML = 0xc4631702;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML.html"><code>XR_ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML</code></a>
    public static final int ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML = 0xc4631320;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML.html"><code>XR_ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML</code></a>
    public static final int ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML = 0xc463131f;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHORS_OUT_OF_MAP_BOUNDS_ML.html"><code>XR_ERROR_SPATIAL_ANCHORS_OUT_OF_MAP_BOUNDS_ML</code></a>
    public static final int ERROR_SPATIAL_ANCHORS_OUT_OF_MAP_BOUNDS_ML = 0xc463131e;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML.html"><code>XR_ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML</code></a>
    public static final int ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML = 0xc463131d;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHORS_ANCHOR_NOT_FOUND_ML.html"><code>XR_ERROR_SPATIAL_ANCHORS_ANCHOR_NOT_FOUND_ML</code></a>
    public static final int ERROR_SPATIAL_ANCHORS_ANCHOR_NOT_FOUND_ML = 0xc4630f38;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT.html"><code>XR_ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT</code></a>
    public static final int ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT = 0xc4630b4f;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT.html"><code>XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT</code></a>
    public static final int ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT = 0xc4630b4e;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_MARKER_DATA_NOT_STRING_MSFT.html"><code>XR_SCENE_MARKER_DATA_NOT_STRING_MSFT</code></a>
    public static final int SCENE_MARKER_DATA_NOT_STRING_MSFT = 0x3b9d0838;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPACE_MAPPING_INSUFFICIENT_FB.html"><code>XR_ERROR_SPACE_MAPPING_INSUFFICIENT_FB</code></a>
    public static final int ERROR_SPACE_MAPPING_INSUFFICIENT_FB = 0xc462a1d8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPACE_LOCALIZATION_FAILED_FB.html"><code>XR_ERROR_SPACE_LOCALIZATION_FAILED_FB</code></a>
    public static final int ERROR_SPACE_LOCALIZATION_FAILED_FB = 0xc462a1d7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPACE_NETWORK_TIMEOUT_FB.html"><code>XR_ERROR_SPACE_NETWORK_TIMEOUT_FB</code></a>
    public static final int ERROR_SPACE_NETWORK_TIMEOUT_FB = 0xc462a1d6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPACE_NETWORK_REQUEST_FAILED_FB.html"><code>XR_ERROR_SPACE_NETWORK_REQUEST_FAILED_FB</code></a>
    public static final int ERROR_SPACE_NETWORK_REQUEST_FAILED_FB = 0xc462a1d5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB.html"><code>XR_ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB</code></a>
    public static final int ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB = 0xc462a1d4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META.html"><code>XR_ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META</code></a>
    public static final int ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META = 0xc46126f0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ENVIRONMENT_DEPTH_NOT_AVAILABLE_META.html"><code>XR_ENVIRONMENT_DEPTH_NOT_AVAILABLE_META</code></a>
    public static final int ENVIRONMENT_DEPTH_NOT_AVAILABLE_META = 0x3b9f3ab8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_RENDER_MODEL_ID_INVALID_EXT.html"><code>XR_ERROR_RENDER_MODEL_ID_INVALID_EXT</code></a>
    public static final int ERROR_RENDER_MODEL_ID_INVALID_EXT = 0xc460a220;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_RENDER_MODEL_ASSET_UNAVAILABLE_EXT.html"><code>XR_ERROR_RENDER_MODEL_ASSET_UNAVAILABLE_EXT</code></a>
    public static final int ERROR_RENDER_MODEL_ASSET_UNAVAILABLE_EXT = 0xc460a21f;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_RENDER_MODEL_GLTF_EXTENSION_REQUIRED_EXT.html"><code>XR_ERROR_RENDER_MODEL_GLTF_EXTENSION_REQUIRED_EXT</code></a>
    public static final int ERROR_RENDER_MODEL_GLTF_EXTENSION_REQUIRED_EXT = 0xc460a21e;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_NOT_INTERACTION_RENDER_MODEL_EXT.html"><code>XR_ERROR_NOT_INTERACTION_RENDER_MODEL_EXT</code></a>
    public static final int ERROR_NOT_INTERACTION_RENDER_MODEL_EXT = 0xc4609e38;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_HINT_ALREADY_SET_QCOM.html"><code>XR_ERROR_HINT_ALREADY_SET_QCOM</code></a>
    public static final int ERROR_HINT_ALREADY_SET_QCOM = 0xc4608ab0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_NOT_AN_ANCHOR_HTC.html"><code>XR_ERROR_NOT_AN_ANCHOR_HTC</code></a>
    public static final int ERROR_NOT_AN_ANCHOR_HTC = 0xc46057e8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ENTITY_ID_INVALID_BD.html"><code>XR_ERROR_SPATIAL_ENTITY_ID_INVALID_BD</code></a>
    public static final int ERROR_SPATIAL_ENTITY_ID_INVALID_BD = 0xc45f4678;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_SENSING_SERVICE_UNAVAILABLE_BD.html"><code>XR_ERROR_SPATIAL_SENSING_SERVICE_UNAVAILABLE_BD</code></a>
    public static final int ERROR_SPATIAL_SENSING_SERVICE_UNAVAILABLE_BD = 0xc45f4677;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_ANCHOR_NOT_SUPPORTED_FOR_ENTITY_BD.html"><code>XR_ERROR_ANCHOR_NOT_SUPPORTED_FOR_ENTITY_BD</code></a>
    public static final int ERROR_ANCHOR_NOT_SUPPORTED_FOR_ENTITY_BD = 0xc45f4676;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHOR_NOT_FOUND_BD.html"><code>XR_ERROR_SPATIAL_ANCHOR_NOT_FOUND_BD</code></a>
    public static final int ERROR_SPATIAL_ANCHOR_NOT_FOUND_BD = 0xc45f4290;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_TIMEOUT_BD.html"><code>XR_ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_TIMEOUT_BD</code></a>
    public static final int ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_TIMEOUT_BD = 0xc45f3ea8;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHOR_SHARING_AUTHENTICATION_FAILURE_BD.html"><code>XR_ERROR_SPATIAL_ANCHOR_SHARING_AUTHENTICATION_FAILURE_BD</code></a>
    public static final int ERROR_SPATIAL_ANCHOR_SHARING_AUTHENTICATION_FAILURE_BD = 0xc45f3ea7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_FAILURE_BD.html"><code>XR_ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_FAILURE_BD</code></a>
    public static final int ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_FAILURE_BD = 0xc45f3ea6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHOR_SHARING_LOCALIZATION_FAIL_BD.html"><code>XR_ERROR_SPATIAL_ANCHOR_SHARING_LOCALIZATION_FAIL_BD</code></a>
    public static final int ERROR_SPATIAL_ANCHOR_SHARING_LOCALIZATION_FAIL_BD = 0xc45f3ea5;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ANCHOR_SHARING_MAP_INSUFFICIENT_BD.html"><code>XR_ERROR_SPATIAL_ANCHOR_SHARING_MAP_INSUFFICIENT_BD</code></a>
    public static final int ERROR_SPATIAL_ANCHOR_SHARING_MAP_INSUFFICIENT_BD = 0xc45f3ea4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SCENE_CAPTURE_FAILURE_BD.html"><code>XR_ERROR_SCENE_CAPTURE_FAILURE_BD</code></a>
    public static final int ERROR_SCENE_CAPTURE_FAILURE_BD = 0xc45f3ac0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPACE_NOT_LOCATABLE_EXT.html"><code>XR_ERROR_SPACE_NOT_LOCATABLE_EXT</code></a>
    public static final int ERROR_SPACE_NOT_LOCATABLE_EXT = 0xc45eaa38;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT.html"><code>XR_ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT</code></a>
    public static final int ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT = 0xc45eaa37;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FUTURE_PENDING_EXT.html"><code>XR_ERROR_FUTURE_PENDING_EXT</code></a>
    public static final int ERROR_FUTURE_PENDING_EXT = 0xc45e0df7;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FUTURE_INVALID_EXT.html"><code>XR_ERROR_FUTURE_INVALID_EXT</code></a>
    public static final int ERROR_FUTURE_INVALID_EXT = 0xc45e0df6;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML.html"><code>XR_ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML</code></a>
    public static final int ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML = 0xc45dfe58;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML.html"><code>XR_ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML</code></a>
    public static final int ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML = 0xc45dfe57;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML.html"><code>XR_ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML</code></a>
    public static final int ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML = 0xc45dfa70;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML.html"><code>XR_ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML</code></a>
    public static final int ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML = 0xc45dfa6f;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML.html"><code>XR_ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML</code></a>
    public static final int ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML = 0x3ba224d0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META.html"><code>XR_ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META</code></a>
    public static final int ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META = 0xc45c7f87;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META.html"><code>XR_ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META</code></a>
    public static final int ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META = 0xc45c7f86;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META.html"><code>XR_COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META</code></a>
    public static final int COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META = 0x3ba3807b;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META.html"><code>XR_COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META</code></a>
    public static final int COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META = 0x3ba3807c;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPACE_GROUP_NOT_FOUND_META.html"><code>XR_ERROR_SPACE_GROUP_NOT_FOUND_META</code></a>
    public static final int ERROR_SPACE_GROUP_NOT_FOUND_META = 0xc45c7b9e;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED_KHR.html"><code>XR_ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED_KHR</code></a>
    public static final int ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED_KHR = ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_PERMISSION_INSUFFICIENT_KHR.html"><code>XR_ERROR_PERMISSION_INSUFFICIENT_KHR</code></a>
    public static final int ERROR_PERMISSION_INSUFFICIENT_KHR = ERROR_PERMISSION_INSUFFICIENT;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_CAPABILITY_UNSUPPORTED_EXT.html"><code>XR_ERROR_SPATIAL_CAPABILITY_UNSUPPORTED_EXT</code></a>
    public static final int ERROR_SPATIAL_CAPABILITY_UNSUPPORTED_EXT = 0xc459eb5f;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_ENTITY_ID_INVALID_EXT.html"><code>XR_ERROR_SPATIAL_ENTITY_ID_INVALID_EXT</code></a>
    public static final int ERROR_SPATIAL_ENTITY_ID_INVALID_EXT = 0xc459eb5e;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_BUFFER_ID_INVALID_EXT.html"><code>XR_ERROR_SPATIAL_BUFFER_ID_INVALID_EXT</code></a>
    public static final int ERROR_SPATIAL_BUFFER_ID_INVALID_EXT = 0xc459eb5d;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_COMPONENT_UNSUPPORTED_FOR_CAPABILITY_EXT.html"><code>XR_ERROR_SPATIAL_COMPONENT_UNSUPPORTED_FOR_CAPABILITY_EXT</code></a>
    public static final int ERROR_SPATIAL_COMPONENT_UNSUPPORTED_FOR_CAPABILITY_EXT = 0xc459eb5c;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_CAPABILITY_CONFIGURATION_INVALID_EXT.html"><code>XR_ERROR_SPATIAL_CAPABILITY_CONFIGURATION_INVALID_EXT</code></a>
    public static final int ERROR_SPATIAL_CAPABILITY_CONFIGURATION_INVALID_EXT = 0xc459eb5b;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_COMPONENT_NOT_ENABLED_EXT.html"><code>XR_ERROR_SPATIAL_COMPONENT_NOT_ENABLED_EXT</code></a>
    public static final int ERROR_SPATIAL_COMPONENT_NOT_ENABLED_EXT = 0xc459eb5a;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_PERSISTENCE_SCOPE_UNSUPPORTED_EXT.html"><code>XR_ERROR_SPATIAL_PERSISTENCE_SCOPE_UNSUPPORTED_EXT</code></a>
    public static final int ERROR_SPATIAL_PERSISTENCE_SCOPE_UNSUPPORTED_EXT = 0xc4599187;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_ERROR_SPATIAL_PERSISTENCE_SCOPE_INCOMPATIBLE_EXT.html"><code>XR_ERROR_SPATIAL_PERSISTENCE_SCOPE_INCOMPATIBLE_EXT</code></a>
    public static final int ERROR_SPATIAL_PERSISTENCE_SCOPE_INCOMPATIBLE_EXT = 0xc4594b37;

    public static String explain(@EnumType(XrResult.class) int value) {
        return switch (value) {
            case XrResult.COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META -> "XR_COLOCATION_DISCOVERY_ALREADY_ADVERTISING_META";
            case XrResult.COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META -> "XR_COLOCATION_DISCOVERY_ALREADY_DISCOVERING_META";
            case XrResult.ENVIRONMENT_DEPTH_NOT_AVAILABLE_META -> "XR_ENVIRONMENT_DEPTH_NOT_AVAILABLE_META";
            case XrResult.ERROR_ACTIONSETS_ALREADY_ATTACHED -> "XR_ERROR_ACTIONSETS_ALREADY_ATTACHED";
            case XrResult.ERROR_ACTIONSET_NOT_ATTACHED -> "XR_ERROR_ACTIONSET_NOT_ATTACHED";
            case XrResult.ERROR_ACTION_TYPE_MISMATCH -> "XR_ERROR_ACTION_TYPE_MISMATCH";
            case XrResult.ERROR_ANCHOR_NOT_SUPPORTED_FOR_ENTITY_BD -> "XR_ERROR_ANCHOR_NOT_SUPPORTED_FOR_ENTITY_BD";
            case XrResult.ERROR_ANDROID_THREAD_SETTINGS_FAILURE_KHR -> "XR_ERROR_ANDROID_THREAD_SETTINGS_FAILURE_KHR";
            case XrResult.ERROR_ANDROID_THREAD_SETTINGS_ID_INVALID_KHR -> "XR_ERROR_ANDROID_THREAD_SETTINGS_ID_INVALID_KHR";
            case XrResult.ERROR_API_LAYER_NOT_PRESENT -> "XR_ERROR_API_LAYER_NOT_PRESENT";
            case XrResult.ERROR_API_VERSION_UNSUPPORTED -> "XR_ERROR_API_VERSION_UNSUPPORTED";
            case XrResult.ERROR_CALL_ORDER_INVALID -> "XR_ERROR_CALL_ORDER_INVALID";
            case XrResult.ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META -> "XR_ERROR_COLOCATION_DISCOVERY_NETWORK_FAILED_META";
            case XrResult.ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META -> "XR_ERROR_COLOCATION_DISCOVERY_NO_DISCOVERY_METHOD_META";
            case XrResult.ERROR_COLOR_SPACE_UNSUPPORTED_FB -> "XR_ERROR_COLOR_SPACE_UNSUPPORTED_FB";
            case XrResult.ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT -> "XR_ERROR_COMPUTE_NEW_SCENE_NOT_COMPLETED_MSFT";
            case XrResult.ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT -> "XR_ERROR_CONTROLLER_MODEL_KEY_INVALID_MSFT";
            case XrResult.ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT -> "XR_ERROR_CREATE_SPATIAL_ANCHOR_FAILED_MSFT";
            case XrResult.ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB -> "XR_ERROR_DISPLAY_REFRESH_RATE_UNSUPPORTED_FB";
            case XrResult.ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED -> "XR_ERROR_ENVIRONMENT_BLEND_MODE_UNSUPPORTED";
            case XrResult.ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED -> "XR_ERROR_EXTENSION_DEPENDENCY_NOT_ENABLED";
            case XrResult.ERROR_EXTENSION_NOT_PRESENT -> "XR_ERROR_EXTENSION_NOT_PRESENT";
            case XrResult.ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML -> "XR_ERROR_FACIAL_EXPRESSION_PERMISSION_DENIED_ML";
            case XrResult.ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB -> "XR_ERROR_FEATURE_ALREADY_CREATED_PASSTHROUGH_FB";
            case XrResult.ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB -> "XR_ERROR_FEATURE_REQUIRED_PASSTHROUGH_FB";
            case XrResult.ERROR_FEATURE_UNSUPPORTED -> "XR_ERROR_FEATURE_UNSUPPORTED";
            case XrResult.ERROR_FILE_ACCESS_ERROR -> "XR_ERROR_FILE_ACCESS_ERROR";
            case XrResult.ERROR_FILE_CONTENTS_INVALID -> "XR_ERROR_FILE_CONTENTS_INVALID";
            case XrResult.ERROR_FORM_FACTOR_UNAVAILABLE -> "XR_ERROR_FORM_FACTOR_UNAVAILABLE";
            case XrResult.ERROR_FORM_FACTOR_UNSUPPORTED -> "XR_ERROR_FORM_FACTOR_UNSUPPORTED";
            case XrResult.ERROR_FUNCTION_UNSUPPORTED -> "XR_ERROR_FUNCTION_UNSUPPORTED";
            case XrResult.ERROR_FUTURE_INVALID_EXT -> "XR_ERROR_FUTURE_INVALID_EXT";
            case XrResult.ERROR_FUTURE_PENDING_EXT -> "XR_ERROR_FUTURE_PENDING_EXT";
            case XrResult.ERROR_GRAPHICS_DEVICE_INVALID -> "XR_ERROR_GRAPHICS_DEVICE_INVALID";
            case XrResult.ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING -> "XR_ERROR_GRAPHICS_REQUIREMENTS_CALL_MISSING";
            case XrResult.ERROR_HANDLE_INVALID -> "XR_ERROR_HANDLE_INVALID";
            case XrResult.ERROR_HINT_ALREADY_SET_QCOM -> "XR_ERROR_HINT_ALREADY_SET_QCOM";
            case XrResult.ERROR_INDEX_OUT_OF_RANGE -> "XR_ERROR_INDEX_OUT_OF_RANGE";
            case XrResult.ERROR_INITIALIZATION_FAILED -> "XR_ERROR_INITIALIZATION_FAILED";
            case XrResult.ERROR_INSTANCE_LOST -> "XR_ERROR_INSTANCE_LOST";
            case XrResult.ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB -> "XR_ERROR_INSUFFICIENT_RESOURCES_PASSTHROUGH_FB";
            case XrResult.ERROR_LAYER_INVALID -> "XR_ERROR_LAYER_INVALID";
            case XrResult.ERROR_LAYER_LIMIT_EXCEEDED -> "XR_ERROR_LAYER_LIMIT_EXCEEDED";
            case XrResult.ERROR_LIMIT_REACHED -> "XR_ERROR_LIMIT_REACHED";
            case XrResult.ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML -> "XR_ERROR_LOCALIZATION_MAP_ALREADY_EXISTS_ML";
            case XrResult.ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML -> "XR_ERROR_LOCALIZATION_MAP_CANNOT_EXPORT_CLOUD_MAP_ML";
            case XrResult.ERROR_LOCALIZATION_MAP_FAIL_ML -> "XR_ERROR_LOCALIZATION_MAP_FAIL_ML";
            case XrResult.ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML -> "XR_ERROR_LOCALIZATION_MAP_IMPORT_EXPORT_PERMISSION_DENIED_ML";
            case XrResult.ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML -> "XR_ERROR_LOCALIZATION_MAP_INCOMPATIBLE_ML";
            case XrResult.ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML -> "XR_ERROR_LOCALIZATION_MAP_PERMISSION_DENIED_ML";
            case XrResult.ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML -> "XR_ERROR_LOCALIZATION_MAP_UNAVAILABLE_ML";
            case XrResult.ERROR_LOCALIZED_NAME_DUPLICATED -> "XR_ERROR_LOCALIZED_NAME_DUPLICATED";
            case XrResult.ERROR_LOCALIZED_NAME_INVALID -> "XR_ERROR_LOCALIZED_NAME_INVALID";
            case XrResult.ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML -> "XR_ERROR_MARKER_DETECTOR_INVALID_CREATE_INFO_ML";
            case XrResult.ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML -> "XR_ERROR_MARKER_DETECTOR_INVALID_DATA_QUERY_ML";
            case XrResult.ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML -> "XR_ERROR_MARKER_DETECTOR_LOCATE_FAILED_ML";
            case XrResult.ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML -> "XR_ERROR_MARKER_DETECTOR_PERMISSION_DENIED_ML";
            case XrResult.ERROR_MARKER_ID_INVALID_VARJO -> "XR_ERROR_MARKER_ID_INVALID_VARJO";
            case XrResult.ERROR_MARKER_INVALID_ML -> "XR_ERROR_MARKER_INVALID_ML";
            case XrResult.ERROR_MARKER_NOT_TRACKED_VARJO -> "XR_ERROR_MARKER_NOT_TRACKED_VARJO";
            case XrResult.ERROR_NAME_DUPLICATED -> "XR_ERROR_NAME_DUPLICATED";
            case XrResult.ERROR_NAME_INVALID -> "XR_ERROR_NAME_INVALID";
            case XrResult.ERROR_NOT_AN_ANCHOR_HTC -> "XR_ERROR_NOT_AN_ANCHOR_HTC";
            case XrResult.ERROR_NOT_INTERACTION_RENDER_MODEL_EXT -> "XR_ERROR_NOT_INTERACTION_RENDER_MODEL_EXT";
            case XrResult.ERROR_NOT_PERMITTED_PASSTHROUGH_FB -> "XR_ERROR_NOT_PERMITTED_PASSTHROUGH_FB";
            case XrResult.ERROR_OUT_OF_MEMORY -> "XR_ERROR_OUT_OF_MEMORY";
            case XrResult.ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META -> "XR_ERROR_PASSTHROUGH_COLOR_LUT_BUFFER_SIZE_MISMATCH_META";
            case XrResult.ERROR_PATH_COUNT_EXCEEDED -> "XR_ERROR_PATH_COUNT_EXCEEDED";
            case XrResult.ERROR_PATH_FORMAT_INVALID -> "XR_ERROR_PATH_FORMAT_INVALID";
            case XrResult.ERROR_PATH_INVALID -> "XR_ERROR_PATH_INVALID";
            case XrResult.ERROR_PATH_UNSUPPORTED -> "XR_ERROR_PATH_UNSUPPORTED";
            case XrResult.ERROR_PERMISSION_INSUFFICIENT -> "XR_ERROR_PERMISSION_INSUFFICIENT";
            case XrResult.ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT -> "XR_ERROR_PLANE_DETECTION_PERMISSION_DENIED_EXT";
            case XrResult.ERROR_POSE_INVALID -> "XR_ERROR_POSE_INVALID";
            case XrResult.ERROR_REFERENCE_SPACE_UNSUPPORTED -> "XR_ERROR_REFERENCE_SPACE_UNSUPPORTED";
            case XrResult.ERROR_RENDER_MODEL_ASSET_UNAVAILABLE_EXT -> "XR_ERROR_RENDER_MODEL_ASSET_UNAVAILABLE_EXT";
            case XrResult.ERROR_RENDER_MODEL_GLTF_EXTENSION_REQUIRED_EXT -> "XR_ERROR_RENDER_MODEL_GLTF_EXTENSION_REQUIRED_EXT";
            case XrResult.ERROR_RENDER_MODEL_ID_INVALID_EXT -> "XR_ERROR_RENDER_MODEL_ID_INVALID_EXT";
            case XrResult.ERROR_RENDER_MODEL_KEY_INVALID_FB -> "XR_ERROR_RENDER_MODEL_KEY_INVALID_FB";
            case XrResult.ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT -> "XR_ERROR_REPROJECTION_MODE_UNSUPPORTED_MSFT";
            case XrResult.ERROR_RUNTIME_FAILURE -> "XR_ERROR_RUNTIME_FAILURE";
            case XrResult.ERROR_RUNTIME_UNAVAILABLE -> "XR_ERROR_RUNTIME_UNAVAILABLE";
            case XrResult.ERROR_SCENE_CAPTURE_FAILURE_BD -> "XR_ERROR_SCENE_CAPTURE_FAILURE_BD";
            case XrResult.ERROR_SCENE_COMPONENT_ID_INVALID_MSFT -> "XR_ERROR_SCENE_COMPONENT_ID_INVALID_MSFT";
            case XrResult.ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT -> "XR_ERROR_SCENE_COMPONENT_TYPE_MISMATCH_MSFT";
            case XrResult.ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT -> "XR_ERROR_SCENE_COMPUTE_CONSISTENCY_MISMATCH_MSFT";
            case XrResult.ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT -> "XR_ERROR_SCENE_COMPUTE_FEATURE_INCOMPATIBLE_MSFT";
            case XrResult.ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT -> "XR_ERROR_SCENE_MESH_BUFFER_ID_INVALID_MSFT";
            case XrResult.ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT -> "XR_ERROR_SECONDARY_VIEW_CONFIGURATION_TYPE_NOT_ENABLED_MSFT";
            case XrResult.ERROR_SESSION_LOST -> "XR_ERROR_SESSION_LOST";
            case XrResult.ERROR_SESSION_NOT_READY -> "XR_ERROR_SESSION_NOT_READY";
            case XrResult.ERROR_SESSION_NOT_RUNNING -> "XR_ERROR_SESSION_NOT_RUNNING";
            case XrResult.ERROR_SESSION_NOT_STOPPING -> "XR_ERROR_SESSION_NOT_STOPPING";
            case XrResult.ERROR_SESSION_RUNNING -> "XR_ERROR_SESSION_RUNNING";
            case XrResult.ERROR_SIZE_INSUFFICIENT -> "XR_ERROR_SIZE_INSUFFICIENT";
            case XrResult.ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB -> "XR_ERROR_SPACE_CLOUD_STORAGE_DISABLED_FB";
            case XrResult.ERROR_SPACE_COMPONENT_NOT_ENABLED_FB -> "XR_ERROR_SPACE_COMPONENT_NOT_ENABLED_FB";
            case XrResult.ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB -> "XR_ERROR_SPACE_COMPONENT_NOT_SUPPORTED_FB";
            case XrResult.ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB -> "XR_ERROR_SPACE_COMPONENT_STATUS_ALREADY_SET_FB";
            case XrResult.ERROR_SPACE_COMPONENT_STATUS_PENDING_FB -> "XR_ERROR_SPACE_COMPONENT_STATUS_PENDING_FB";
            case XrResult.ERROR_SPACE_GROUP_NOT_FOUND_META -> "XR_ERROR_SPACE_GROUP_NOT_FOUND_META";
            case XrResult.ERROR_SPACE_LOCALIZATION_FAILED_FB -> "XR_ERROR_SPACE_LOCALIZATION_FAILED_FB";
            case XrResult.ERROR_SPACE_MAPPING_INSUFFICIENT_FB -> "XR_ERROR_SPACE_MAPPING_INSUFFICIENT_FB";
            case XrResult.ERROR_SPACE_NETWORK_REQUEST_FAILED_FB -> "XR_ERROR_SPACE_NETWORK_REQUEST_FAILED_FB";
            case XrResult.ERROR_SPACE_NETWORK_TIMEOUT_FB -> "XR_ERROR_SPACE_NETWORK_TIMEOUT_FB";
            case XrResult.ERROR_SPACE_NOT_LOCATABLE_EXT -> "XR_ERROR_SPACE_NOT_LOCATABLE_EXT";
            case XrResult.ERROR_SPATIAL_ANCHORS_ANCHOR_NOT_FOUND_ML -> "XR_ERROR_SPATIAL_ANCHORS_ANCHOR_NOT_FOUND_ML";
            case XrResult.ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML -> "XR_ERROR_SPATIAL_ANCHORS_NOT_LOCALIZED_ML";
            case XrResult.ERROR_SPATIAL_ANCHORS_OUT_OF_MAP_BOUNDS_ML -> "XR_ERROR_SPATIAL_ANCHORS_OUT_OF_MAP_BOUNDS_ML";
            case XrResult.ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML -> "XR_ERROR_SPATIAL_ANCHORS_PERMISSION_DENIED_ML";
            case XrResult.ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML -> "XR_ERROR_SPATIAL_ANCHORS_SPACE_NOT_LOCATABLE_ML";
            case XrResult.ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT -> "XR_ERROR_SPATIAL_ANCHOR_NAME_INVALID_MSFT";
            case XrResult.ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT -> "XR_ERROR_SPATIAL_ANCHOR_NAME_NOT_FOUND_MSFT";
            case XrResult.ERROR_SPATIAL_ANCHOR_NOT_FOUND_BD -> "XR_ERROR_SPATIAL_ANCHOR_NOT_FOUND_BD";
            case XrResult.ERROR_SPATIAL_ANCHOR_SHARING_AUTHENTICATION_FAILURE_BD -> "XR_ERROR_SPATIAL_ANCHOR_SHARING_AUTHENTICATION_FAILURE_BD";
            case XrResult.ERROR_SPATIAL_ANCHOR_SHARING_LOCALIZATION_FAIL_BD -> "XR_ERROR_SPATIAL_ANCHOR_SHARING_LOCALIZATION_FAIL_BD";
            case XrResult.ERROR_SPATIAL_ANCHOR_SHARING_MAP_INSUFFICIENT_BD -> "XR_ERROR_SPATIAL_ANCHOR_SHARING_MAP_INSUFFICIENT_BD";
            case XrResult.ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_FAILURE_BD -> "XR_ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_FAILURE_BD";
            case XrResult.ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_TIMEOUT_BD -> "XR_ERROR_SPATIAL_ANCHOR_SHARING_NETWORK_TIMEOUT_BD";
            case XrResult.ERROR_SPATIAL_BUFFER_ID_INVALID_EXT -> "XR_ERROR_SPATIAL_BUFFER_ID_INVALID_EXT";
            case XrResult.ERROR_SPATIAL_CAPABILITY_CONFIGURATION_INVALID_EXT -> "XR_ERROR_SPATIAL_CAPABILITY_CONFIGURATION_INVALID_EXT";
            case XrResult.ERROR_SPATIAL_CAPABILITY_UNSUPPORTED_EXT -> "XR_ERROR_SPATIAL_CAPABILITY_UNSUPPORTED_EXT";
            case XrResult.ERROR_SPATIAL_COMPONENT_NOT_ENABLED_EXT -> "XR_ERROR_SPATIAL_COMPONENT_NOT_ENABLED_EXT";
            case XrResult.ERROR_SPATIAL_COMPONENT_UNSUPPORTED_FOR_CAPABILITY_EXT -> "XR_ERROR_SPATIAL_COMPONENT_UNSUPPORTED_FOR_CAPABILITY_EXT";
            case XrResult.ERROR_SPATIAL_ENTITY_ID_INVALID_BD -> "XR_ERROR_SPATIAL_ENTITY_ID_INVALID_BD";
            case XrResult.ERROR_SPATIAL_ENTITY_ID_INVALID_EXT -> "XR_ERROR_SPATIAL_ENTITY_ID_INVALID_EXT";
            case XrResult.ERROR_SPATIAL_PERSISTENCE_SCOPE_INCOMPATIBLE_EXT -> "XR_ERROR_SPATIAL_PERSISTENCE_SCOPE_INCOMPATIBLE_EXT";
            case XrResult.ERROR_SPATIAL_PERSISTENCE_SCOPE_UNSUPPORTED_EXT -> "XR_ERROR_SPATIAL_PERSISTENCE_SCOPE_UNSUPPORTED_EXT";
            case XrResult.ERROR_SPATIAL_SENSING_SERVICE_UNAVAILABLE_BD -> "XR_ERROR_SPATIAL_SENSING_SERVICE_UNAVAILABLE_BD";
            case XrResult.ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED -> "XR_ERROR_SWAPCHAIN_FORMAT_UNSUPPORTED";
            case XrResult.ERROR_SWAPCHAIN_RECT_INVALID -> "XR_ERROR_SWAPCHAIN_RECT_INVALID";
            case XrResult.ERROR_SYSTEM_INVALID -> "XR_ERROR_SYSTEM_INVALID";
            case XrResult.ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML -> "XR_ERROR_SYSTEM_NOTIFICATION_INCOMPATIBLE_SKU_ML";
            case XrResult.ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML -> "XR_ERROR_SYSTEM_NOTIFICATION_PERMISSION_DENIED_ML";
            case XrResult.ERROR_TIME_INVALID -> "XR_ERROR_TIME_INVALID";
            case XrResult.ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB -> "XR_ERROR_UNEXPECTED_STATE_PASSTHROUGH_FB";
            case XrResult.ERROR_UNKNOWN_PASSTHROUGH_FB -> "XR_ERROR_UNKNOWN_PASSTHROUGH_FB";
            case XrResult.ERROR_VALIDATION_FAILURE -> "XR_ERROR_VALIDATION_FAILURE";
            case XrResult.ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED -> "XR_ERROR_VIEW_CONFIGURATION_TYPE_UNSUPPORTED";
            case XrResult.ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML -> "XR_ERROR_WORLD_MESH_DETECTOR_PERMISSION_DENIED_ML";
            case XrResult.ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML -> "XR_ERROR_WORLD_MESH_DETECTOR_SPACE_NOT_LOCATABLE_ML";
            case XrResult.EVENT_UNAVAILABLE -> "XR_EVENT_UNAVAILABLE";
            case XrResult.FRAME_DISCARDED -> "XR_FRAME_DISCARDED";
            case XrResult.RENDER_MODEL_UNAVAILABLE_FB -> "XR_RENDER_MODEL_UNAVAILABLE_FB";
            case XrResult.SCENE_MARKER_DATA_NOT_STRING_MSFT -> "XR_SCENE_MARKER_DATA_NOT_STRING_MSFT";
            case XrResult.SESSION_LOSS_PENDING -> "XR_SESSION_LOSS_PENDING";
            case XrResult.SESSION_NOT_FOCUSED -> "XR_SESSION_NOT_FOCUSED";
            case XrResult.SPACE_BOUNDS_UNAVAILABLE -> "XR_SPACE_BOUNDS_UNAVAILABLE";
            case XrResult.SUCCESS -> "XR_SUCCESS";
            case XrResult.TIMEOUT_EXPIRED -> "XR_TIMEOUT_EXPIRED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrResult() {}
}
