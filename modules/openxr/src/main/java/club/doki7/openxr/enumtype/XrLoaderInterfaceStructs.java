package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrLoaderInterfaceStructs.html"><code>XrLoaderInterfaceStructs</code></a>
public final class XrLoaderInterfaceStructs {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOADER_INTERFACE_STRUCT_UNINTIALIZED.html"><code>XR_LOADER_INTERFACE_STRUCT_UNINTIALIZED</code></a>
    public static final int XR_LOADER_INTERFACE_STRUCT_UNINTIALIZED = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOADER_INTERFACE_STRUCT_LOADER_INFO.html"><code>XR_LOADER_INTERFACE_STRUCT_LOADER_INFO</code></a>
    public static final int XR_LOADER_INTERFACE_STRUCT_LOADER_INFO = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOADER_INTERFACE_STRUCT_API_LAYER_REQUEST.html"><code>XR_LOADER_INTERFACE_STRUCT_API_LAYER_REQUEST</code></a>
    public static final int XR_LOADER_INTERFACE_STRUCT_API_LAYER_REQUEST = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOADER_INTERFACE_STRUCT_RUNTIME_REQUEST.html"><code>XR_LOADER_INTERFACE_STRUCT_RUNTIME_REQUEST</code></a>
    public static final int XR_LOADER_INTERFACE_STRUCT_RUNTIME_REQUEST = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOADER_INTERFACE_STRUCT_API_LAYER_CREATE_INFO.html"><code>XR_LOADER_INTERFACE_STRUCT_API_LAYER_CREATE_INFO</code></a>
    public static final int XR_LOADER_INTERFACE_STRUCT_API_LAYER_CREATE_INFO = 0x4;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_LOADER_INTERFACE_STRUCT_API_LAYER_NEXT_INFO.html"><code>XR_LOADER_INTERFACE_STRUCT_API_LAYER_NEXT_INFO</code></a>
    public static final int XR_LOADER_INTERFACE_STRUCT_API_LAYER_NEXT_INFO = 0x5;

    public static String explain(@EnumType(XrLoaderInterfaceStructs.class) int value) {
        return switch (value) {
            case XrLoaderInterfaceStructs.XR_LOADER_INTERFACE_STRUCT_API_LAYER_CREATE_INFO -> "XR_LOADER_INTERFACE_STRUCT_API_LAYER_CREATE_INFO";
            case XrLoaderInterfaceStructs.XR_LOADER_INTERFACE_STRUCT_API_LAYER_NEXT_INFO -> "XR_LOADER_INTERFACE_STRUCT_API_LAYER_NEXT_INFO";
            case XrLoaderInterfaceStructs.XR_LOADER_INTERFACE_STRUCT_API_LAYER_REQUEST -> "XR_LOADER_INTERFACE_STRUCT_API_LAYER_REQUEST";
            case XrLoaderInterfaceStructs.XR_LOADER_INTERFACE_STRUCT_LOADER_INFO -> "XR_LOADER_INTERFACE_STRUCT_LOADER_INFO";
            case XrLoaderInterfaceStructs.XR_LOADER_INTERFACE_STRUCT_RUNTIME_REQUEST -> "XR_LOADER_INTERFACE_STRUCT_RUNTIME_REQUEST";
            case XrLoaderInterfaceStructs.XR_LOADER_INTERFACE_STRUCT_UNINTIALIZED -> "XR_LOADER_INTERFACE_STRUCT_UNINTIALIZED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrLoaderInterfaceStructs() {}
}
