package tech.icey.vk4j;

import tech.icey.vk4j.annotations.unsigned;

public final class Version {
    public static @unsigned int vkMakeAPIVersion(
            @unsigned int variant,
            @unsigned int major,
            @unsigned int minor,
            @unsigned int patch
    ) {
        return (variant << 29) | (major << 22) | (minor << 12) | patch;
    }

    /// @deprecated Use {@link #vkMakeAPIVersion(int, int, int, int)} instead
    @Deprecated
    public static @unsigned int vkMakeVersion(
            @unsigned int major,
            @unsigned int minor,
            @unsigned int patch
    ) {
        return vkMakeAPIVersion(0, major, minor, patch);
    }

    public static final @unsigned int VK_API_VERSION_1_0 = vkMakeAPIVersion(0, 1, 0, 0);
    public static final @unsigned int VK_API_VERSION_1_1 = vkMakeAPIVersion(0, 1, 1, 0);
    public static final @unsigned int VK_API_VERSION_1_2 = vkMakeAPIVersion(0, 1, 2, 0);
    public static final @unsigned int VK_API_VERSION_1_3 = vkMakeAPIVersion(0, 1, 3, 0);

    public record Decoded(@unsigned int variant, @unsigned int major, @unsigned int minor, @unsigned int patch) {
        @Override
        public String toString() {
            return Integer.toUnsignedString(major) + "." + Integer.toUnsignedString(minor) + "." + Integer.toUnsignedString(patch);
        }
    }

    public static Decoded decode(@unsigned int version) {
        return new Decoded(
                (version >> 29) & 0x7,
                (version >> 22) & 0x7F,
                (version >> 12) & 0x3FF,
                version & 0xFFF
        );
    }
}
