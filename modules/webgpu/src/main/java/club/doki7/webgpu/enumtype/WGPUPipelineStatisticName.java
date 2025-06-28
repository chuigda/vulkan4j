package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUPipelineStatisticName {
    public static final int VertexShaderInvocations = 0x0;
    public static final int ClipperInvocations = 0x1;
    public static final int ClipperPrimitivesOut = 0x2;
    public static final int FragmentShaderInvocations = 0x3;
    public static final int ComputeShaderInvocations = 0x4;
    public static final int Force32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUPipelineStatisticName.class) int value) {
        return switch (value) {
            case WGPUPipelineStatisticName.ClipperInvocations -> "ClipperInvocations";
            case WGPUPipelineStatisticName.ClipperPrimitivesOut -> "ClipperPrimitivesOut";
            case WGPUPipelineStatisticName.ComputeShaderInvocations -> "ComputeShaderInvocations";
            case WGPUPipelineStatisticName.Force32 -> "Force32";
            case WGPUPipelineStatisticName.FragmentShaderInvocations -> "FragmentShaderInvocations";
            case WGPUPipelineStatisticName.VertexShaderInvocations -> "VertexShaderInvocations";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUPipelineStatisticName() {}
}
