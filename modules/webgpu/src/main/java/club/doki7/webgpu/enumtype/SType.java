package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class SType {
    public static final int SHADER_SOURCE_SPIRV = 0x1;
    public static final int SHADER_SOURCE_WGSL = 0x2;
    public static final int RENDER_PASS_MAX_DRAW_COUNT = 0x3;
    public static final int SURFACE_SOURCE_METAL_LAYER = 0x4;
    public static final int SURFACE_SOURCE_WINDOWS_HWND = 0x5;
    public static final int SURFACE_SOURCE_XLIB_WINDOW = 0x6;
    public static final int SURFACE_SOURCE_WAYLAND_SURFACE = 0x7;
    public static final int SURFACE_SOURCE_ANDROID_NATIVE_WINDOW = 0x8;
    public static final int SURFACE_SOURCE_XCB_WINDOW = 0x9;
    public static final int SURFACE_COLOR_MANAGEMENT = 0xa;
    public static final int REQUEST_ADAPTER_WEBXR_OPTIONS = 0xb;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(SType.class) int value) {
        return switch (value) {
            case SType.FORCE32 -> "FORCE32";
            case SType.RENDER_PASS_MAX_DRAW_COUNT -> "RENDER_PASS_MAX_DRAW_COUNT";
            case SType.REQUEST_ADAPTER_WEBXR_OPTIONS -> "REQUEST_ADAPTER_WEBXR_OPTIONS";
            case SType.SHADER_SOURCE_SPIRV -> "SHADER_SOURCE_SPIRV";
            case SType.SHADER_SOURCE_WGSL -> "SHADER_SOURCE_WGSL";
            case SType.SURFACE_COLOR_MANAGEMENT -> "SURFACE_COLOR_MANAGEMENT";
            case SType.SURFACE_SOURCE_ANDROID_NATIVE_WINDOW -> "SURFACE_SOURCE_ANDROID_NATIVE_WINDOW";
            case SType.SURFACE_SOURCE_METAL_LAYER -> "SURFACE_SOURCE_METAL_LAYER";
            case SType.SURFACE_SOURCE_WAYLAND_SURFACE -> "SURFACE_SOURCE_WAYLAND_SURFACE";
            case SType.SURFACE_SOURCE_WINDOWS_HWND -> "SURFACE_SOURCE_WINDOWS_HWND";
            case SType.SURFACE_SOURCE_XCB_WINDOW -> "SURFACE_SOURCE_XCB_WINDOW";
            case SType.SURFACE_SOURCE_XLIB_WINDOW -> "SURFACE_SOURCE_XLIB_WINDOW";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SType() {}
}
