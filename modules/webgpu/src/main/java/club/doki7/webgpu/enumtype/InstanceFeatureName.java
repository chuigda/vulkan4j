package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class InstanceFeatureName {
    public static final int INSTANCE_FEATURE_NAME_TIMED_WAIT_ANY_ENABLE = 0x1;
    public static final int INSTANCE_FEATURE_NAME_SHADER_SOURCE_SPIRV = 0x2;
    public static final int INSTANCE_FEATURE_NAME_MULTIPLE_DEVICES_PER_ADAPTER = 0x3;
    public static final int INSTANCE_FEATURE_NAME_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(InstanceFeatureName.class) int value) {
        return switch (value) {
            case InstanceFeatureName.INSTANCE_FEATURE_NAME_FORCE32 -> "INSTANCE_FEATURE_NAME_FORCE32";
            case InstanceFeatureName.INSTANCE_FEATURE_NAME_MULTIPLE_DEVICES_PER_ADAPTER -> "INSTANCE_FEATURE_NAME_MULTIPLE_DEVICES_PER_ADAPTER";
            case InstanceFeatureName.INSTANCE_FEATURE_NAME_SHADER_SOURCE_SPIRV -> "INSTANCE_FEATURE_NAME_SHADER_SOURCE_SPIRV";
            case InstanceFeatureName.INSTANCE_FEATURE_NAME_TIMED_WAIT_ANY_ENABLE -> "INSTANCE_FEATURE_NAME_TIMED_WAIT_ANY_ENABLE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private InstanceFeatureName() {}
}
