package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUDx12Compiler {
    public static final int Undefined = 0x0;
    public static final int Fxc = 0x1;
    public static final int Dxc = 0x2;
    public static final int Force32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUDx12Compiler.class) int value) {
        return switch (value) {
            case WGPUDx12Compiler.Dxc -> "Dxc";
            case WGPUDx12Compiler.Force32 -> "Force32";
            case WGPUDx12Compiler.Fxc -> "Fxc";
            case WGPUDx12Compiler.Undefined -> "Undefined";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUDx12Compiler() {}
}
