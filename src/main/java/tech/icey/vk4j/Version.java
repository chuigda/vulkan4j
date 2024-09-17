package tech.icey.vk4j;

public final class Version {
    public static int vkMakeAPIVersion(int variant, int major, int minor, int patch) {
        return (variant << 29) | (major << 22) | (minor << 12) | patch;
    }

    /// @deprecated Use {@link #vkMakeAPIVersion(int, int, int, int)} instead
    @Deprecated
    public static int vkMakeVersion(int major, int minor, int patch) {
        return vkMakeAPIVersion(0, major, minor, patch);
    }

    public static final int VK_API_VERSION_1_0 = vkMakeAPIVersion(0, 1, 0, 0);
    public static final int VK_API_VERSION_1_1 = vkMakeAPIVersion(0, 1, 1, 0);
    public static final int VK_API_VERSION_1_2 = vkMakeAPIVersion(0, 1, 2, 0);
    public static final int VK_API_VERSION_1_3 = vkMakeAPIVersion(0, 1, 3, 0);
}
