package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrLoaderInterfaceStructs.html"><code>XrLoaderInterfaceStructs</code></a>
public final class XrLoaderInterfaceStructs {
    public static final int XR_LOADER_INTERFACE_STRUCT_UNINTIALIZED = 0x0;
    public static final int XR_LOADER_INTERFACE_STRUCT_LOADER_INFO = 0x1;
    public static final int XR_LOADER_INTERFACE_STRUCT_API_LAYER_REQUEST = 0x2;
    public static final int XR_LOADER_INTERFACE_STRUCT_RUNTIME_REQUEST = 0x3;
    public static final int XR_LOADER_INTERFACE_STRUCT_API_LAYER_CREATE_INFO = 0x4;
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
