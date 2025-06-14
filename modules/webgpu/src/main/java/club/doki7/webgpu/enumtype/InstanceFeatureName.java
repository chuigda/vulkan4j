package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class InstanceFeatureName {
    public static final int TIMED_WAIT_ANY_ENABLE = 0x1;
    public static final int SHADER_SOURCE_SPIRV = 0x2;
    public static final int MULTIPLE_DEVICES_PER_ADAPTER = 0x3;
    public static final int FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(InstanceFeatureName.class) int value) {
        return switch (value) {
            case InstanceFeatureName.FORCE32 -> "FORCE32";
            case InstanceFeatureName.MULTIPLE_DEVICES_PER_ADAPTER -> "MULTIPLE_DEVICES_PER_ADAPTER";
            case InstanceFeatureName.SHADER_SOURCE_SPIRV -> "SHADER_SOURCE_SPIRV";
            case InstanceFeatureName.TIMED_WAIT_ANY_ENABLE -> "TIMED_WAIT_ANY_ENABLE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private InstanceFeatureName() {}
}
