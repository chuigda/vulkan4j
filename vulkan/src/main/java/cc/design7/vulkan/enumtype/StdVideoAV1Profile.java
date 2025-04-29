package cc.design7.vulkan.enumtype;

import cc.design7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/StdVideoAV1Profile.html">StdVideoAV1Profile</a>
public final class StdVideoAV1Profile {
    public static final int STD_VIDEO_AV1_PROFILE_MAIN = 0;
    public static final int STD_VIDEO_AV1_PROFILE_HIGH = 1;
    public static final int STD_VIDEO_AV1_PROFILE_PROFESSIONAL = 2;
    public static final int STD_VIDEO_AV1_PROFILE_INVALID = 2147483647;

    public static String explain(@enumtype(StdVideoAV1Profile.class) int value) {
        return switch (value) {
            case StdVideoAV1Profile.STD_VIDEO_AV1_PROFILE_HIGH -> "STD_VIDEO_AV1_PROFILE_HIGH";
            case StdVideoAV1Profile.STD_VIDEO_AV1_PROFILE_INVALID -> "STD_VIDEO_AV1_PROFILE_INVALID";
            case StdVideoAV1Profile.STD_VIDEO_AV1_PROFILE_MAIN -> "STD_VIDEO_AV1_PROFILE_MAIN";
            case StdVideoAV1Profile.STD_VIDEO_AV1_PROFILE_PROFESSIONAL -> "STD_VIDEO_AV1_PROFILE_PROFESSIONAL";
            default -> "Unknown StdVideoAV1Profile: " + value;
        };
    }
    /// Constructing this class is nonsense so the constructor is made private.
    private StdVideoAV1Profile() {}
}
