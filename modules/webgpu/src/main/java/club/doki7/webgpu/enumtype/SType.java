package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class SType {
    public static final int S_TYPE_SHADER_SOURCE_SPIRV = 0x1;
    public static final int S_TYPE_SHADER_SOURCE_WGSL = 0x2;
    public static final int S_TYPE_RENDER_PASS_MAX_DRAW_COUNT = 0x3;
    public static final int S_TYPE_SURFACE_SOURCE_METAL_LAYER = 0x4;
    public static final int S_TYPE_SURFACE_SOURCE_WINDOWS_HWND = 0x5;
    public static final int S_TYPE_SURFACE_SOURCE_XLIB_WINDOW = 0x6;
    public static final int S_TYPE_SURFACE_SOURCE_WAYLAND_SURFACE = 0x7;
    public static final int S_TYPE_SURFACE_SOURCE_ANDROID_NATIVE_WINDOW = 0x8;
    public static final int S_TYPE_SURFACE_SOURCE_XCB_WINDOW = 0x9;
    public static final int S_TYPE_SURFACE_COLOR_MANAGEMENT = 0xa;
    public static final int S_TYPE_REQUEST_ADAPTER_WEBXR_OPTIONS = 0xb;
    public static final int S_TYPE_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(SType.class) int value) {
        return switch (value) {
            case SType.S_TYPE_FORCE32 -> "S_TYPE_FORCE32";
            case SType.S_TYPE_RENDER_PASS_MAX_DRAW_COUNT -> "S_TYPE_RENDER_PASS_MAX_DRAW_COUNT";
            case SType.S_TYPE_REQUEST_ADAPTER_WEBXR_OPTIONS -> "S_TYPE_REQUEST_ADAPTER_WEBXR_OPTIONS";
            case SType.S_TYPE_SHADER_SOURCE_SPIRV -> "S_TYPE_SHADER_SOURCE_SPIRV";
            case SType.S_TYPE_SHADER_SOURCE_WGSL -> "S_TYPE_SHADER_SOURCE_WGSL";
            case SType.S_TYPE_SURFACE_COLOR_MANAGEMENT -> "S_TYPE_SURFACE_COLOR_MANAGEMENT";
            case SType.S_TYPE_SURFACE_SOURCE_ANDROID_NATIVE_WINDOW -> "S_TYPE_SURFACE_SOURCE_ANDROID_NATIVE_WINDOW";
            case SType.S_TYPE_SURFACE_SOURCE_METAL_LAYER -> "S_TYPE_SURFACE_SOURCE_METAL_LAYER";
            case SType.S_TYPE_SURFACE_SOURCE_WAYLAND_SURFACE -> "S_TYPE_SURFACE_SOURCE_WAYLAND_SURFACE";
            case SType.S_TYPE_SURFACE_SOURCE_WINDOWS_HWND -> "S_TYPE_SURFACE_SOURCE_WINDOWS_HWND";
            case SType.S_TYPE_SURFACE_SOURCE_XCB_WINDOW -> "S_TYPE_SURFACE_SOURCE_XCB_WINDOW";
            case SType.S_TYPE_SURFACE_SOURCE_XLIB_WINDOW -> "S_TYPE_SURFACE_SOURCE_XLIB_WINDOW";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SType() {}
}
