package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUGles3MinorVersion {
    public static final int Automatic = 0x0;
    public static final int Version0 = 0x1;
    public static final int Version1 = 0x2;
    public static final int Version2 = 0x3;
    public static final int Force32 = 0x7fffffff;

    public static String explain(@EnumType(WGPUGles3MinorVersion.class) int value) {
        return switch (value) {
            case WGPUGles3MinorVersion.Automatic -> "Automatic";
            case WGPUGles3MinorVersion.Force32 -> "Force32";
            case WGPUGles3MinorVersion.Version0 -> "Version0";
            case WGPUGles3MinorVersion.Version1 -> "Version1";
            case WGPUGles3MinorVersion.Version2 -> "Version2";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUGles3MinorVersion() {}
}
