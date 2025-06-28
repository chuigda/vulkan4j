package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUDxcMaxShaderModel {
    public static final int V6_0 = 0x0;
    public static final int V6_1 = 0x1;
    public static final int V6_2 = 0x2;
    public static final int V6_3 = 0x3;
    public static final int V6_4 = 0x4;
    public static final int V6_5 = 0x5;
    public static final int V6_6 = 0x6;
    public static final int V6_7 = 0x7;
    public static final int Force32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUDxcMaxShaderModel.class) int value) {
        return switch (value) {
            case WGPUDxcMaxShaderModel.Force32 -> "Force32";
            case WGPUDxcMaxShaderModel.V6_0 -> "V6_0";
            case WGPUDxcMaxShaderModel.V6_1 -> "V6_1";
            case WGPUDxcMaxShaderModel.V6_2 -> "V6_2";
            case WGPUDxcMaxShaderModel.V6_3 -> "V6_3";
            case WGPUDxcMaxShaderModel.V6_4 -> "V6_4";
            case WGPUDxcMaxShaderModel.V6_5 -> "V6_5";
            case WGPUDxcMaxShaderModel.V6_6 -> "V6_6";
            case WGPUDxcMaxShaderModel.V6_7 -> "V6_7";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUDxcMaxShaderModel() {}
}
