package club.doki7.openxr;

import club.doki7.ffm.annotation.Unsigned;

/// Utility class for encoding/decoding OpenXR API versions
public record XRVersion(
        @Unsigned short major,
        @Unsigned short minor,
        @Unsigned int patch
) {
    public static final XRVersion XR_CURRENT_API_VERSION = new XRVersion((short) 1, (short) 1, 49);
    public static final XRVersion XR_API_VERSION_1_0 = new XRVersion((short) 1, (short) 0, XR_CURRENT_API_VERSION.patch());
    public static final XRVersion XR_API_VERSION_1_1 = new XRVersion((short) 1, (short) 1, XR_CURRENT_API_VERSION.patch());

    public static XRVersion decode(@Unsigned long version) {
        var major = (short) ((version >> 48) & 0xFFFF);
        var minor = (short) ((version >> 32) & 0xFFFF);
        var patch = (int) (version & 0xFFFFFFFFL);

        return new XRVersion(major, minor, patch);
    }

    /// <pre>
    /// #define <name>XR_MAKE_VERSION</name>(major, minor, patch) \
    ///     ((((major) &amp; 0xffffULL) &lt;&lt; 48) | (((minor) &amp; 0xffffULL) &lt;&lt; 32) | ((patch) &amp; 0xffffffffULL))
    /// </pre>
    public @Unsigned long encode() {
        return (((long) major) << 48) | ((long) minor) << 32 | patch;
    }
}
