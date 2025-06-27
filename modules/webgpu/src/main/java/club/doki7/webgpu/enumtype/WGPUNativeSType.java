package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUNativeSType {
    public static final int WGPUSType_DeviceExtras = 0x30001;
    public static final int WGPUSType_NativeLimits = 0x30002;
    public static final int WGPUSType_PipelineLayoutExtras = 0x30003;
    public static final int WGPUSType_ShaderSourceGLSL = 0x30004;
    public static final int WGPUSType_InstanceExtras = 0x30006;
    public static final int WGPUSType_BindGroupEntryExtras = 0x30007;
    public static final int WGPUSType_BindGroupLayoutEntryExtras = 0x30008;
    public static final int WGPUSType_QuerySetDescriptorExtras = 0x30009;
    public static final int WGPUSType_SurfaceConfigurationExtras = 0x3000a;
    public static final int Force32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUNativeSType.class) int value) {
        return switch (value) {
            case WGPUNativeSType.Force32 -> "Force32";
            case WGPUNativeSType.WGPUSType_BindGroupEntryExtras -> "WGPUSType_BindGroupEntryExtras";
            case WGPUNativeSType.WGPUSType_BindGroupLayoutEntryExtras -> "WGPUSType_BindGroupLayoutEntryExtras";
            case WGPUNativeSType.WGPUSType_DeviceExtras -> "WGPUSType_DeviceExtras";
            case WGPUNativeSType.WGPUSType_InstanceExtras -> "WGPUSType_InstanceExtras";
            case WGPUNativeSType.WGPUSType_NativeLimits -> "WGPUSType_NativeLimits";
            case WGPUNativeSType.WGPUSType_PipelineLayoutExtras -> "WGPUSType_PipelineLayoutExtras";
            case WGPUNativeSType.WGPUSType_QuerySetDescriptorExtras -> "WGPUSType_QuerySetDescriptorExtras";
            case WGPUNativeSType.WGPUSType_ShaderSourceGLSL -> "WGPUSType_ShaderSourceGLSL";
            case WGPUNativeSType.WGPUSType_SurfaceConfigurationExtras -> "WGPUSType_SurfaceConfigurationExtras";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUNativeSType() {}
}
