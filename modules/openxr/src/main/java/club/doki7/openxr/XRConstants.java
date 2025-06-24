package club.doki7.openxr;

import club.doki7.ffm.annotation.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

public interface XRConstants {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FALSE.html"><code>XR_FALSE</code></a>
    @Unsigned int FALSE = 0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_ACTION_NAME_SIZE.html"><code>XR_MAX_ACTION_NAME_SIZE</code></a>
    @Unsigned int MAX_ACTION_NAME_SIZE = 64;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_ACTION_SET_NAME_SIZE.html"><code>XR_MAX_ACTION_SET_NAME_SIZE</code></a>
    @Unsigned int MAX_ACTION_SET_NAME_SIZE = 64;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_API_LAYER_DESCRIPTION_SIZE.html"><code>XR_MAX_API_LAYER_DESCRIPTION_SIZE</code></a>
    @Unsigned int MAX_API_LAYER_DESCRIPTION_SIZE = 256;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_API_LAYER_NAME_SIZE.html"><code>XR_MAX_API_LAYER_NAME_SIZE</code></a>
    @Unsigned int MAX_API_LAYER_NAME_SIZE = 256;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_APPLICATION_NAME_SIZE.html"><code>XR_MAX_APPLICATION_NAME_SIZE</code></a>
    @Unsigned int MAX_APPLICATION_NAME_SIZE = 128;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_ENGINE_NAME_SIZE.html"><code>XR_MAX_ENGINE_NAME_SIZE</code></a>
    @Unsigned int MAX_ENGINE_NAME_SIZE = 128;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_EXTENSION_NAME_SIZE.html"><code>XR_MAX_EXTENSION_NAME_SIZE</code></a>
    @Unsigned int MAX_EXTENSION_NAME_SIZE = 128;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_GRAPHICS_APIS_SUPPORTED.html"><code>XR_MAX_GRAPHICS_APIS_SUPPORTED</code></a>
    @Unsigned int MAX_GRAPHICS_APIS_SUPPORTED = 32;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_LOCALIZED_ACTION_NAME_SIZE.html"><code>XR_MAX_LOCALIZED_ACTION_NAME_SIZE</code></a>
    @Unsigned int MAX_LOCALIZED_ACTION_NAME_SIZE = 128;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE.html"><code>XR_MAX_LOCALIZED_ACTION_SET_NAME_SIZE</code></a>
    @Unsigned int MAX_LOCALIZED_ACTION_SET_NAME_SIZE = 128;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_PATH_LENGTH.html"><code>XR_MAX_PATH_LENGTH</code></a>
    @Unsigned int MAX_PATH_LENGTH = 256;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_RESULT_STRING_SIZE.html"><code>XR_MAX_RESULT_STRING_SIZE</code></a>
    @Unsigned int MAX_RESULT_STRING_SIZE = 64;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_RUNTIME_NAME_SIZE.html"><code>XR_MAX_RUNTIME_NAME_SIZE</code></a>
    @Unsigned int MAX_RUNTIME_NAME_SIZE = 128;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_STRUCTURE_NAME_SIZE.html"><code>XR_MAX_STRUCTURE_NAME_SIZE</code></a>
    @Unsigned int MAX_STRUCTURE_NAME_SIZE = 64;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_MAX_SYSTEM_NAME_SIZE.html"><code>XR_MAX_SYSTEM_NAME_SIZE</code></a>
    @Unsigned int MAX_SYSTEM_NAME_SIZE = 256;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_TRUE.html"><code>XR_TRUE</code></a>
    @Unsigned int TRUE = 1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_UUID_SIZE.html"><code>XR_UUID_SIZE</code></a>
    @Unsigned int UUID_SIZE = 16;
}
