package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceTrackingDataSource2FB.html"><code>XrFaceTrackingDataSource2FB</code></a>
public final class XrFaceTrackingDataSource2FB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FACE_TRACKING_DATA_SOURCE2_VISUAL_FB.html"><code>XR_FACE_TRACKING_DATA_SOURCE2_VISUAL_FB</code></a>
    public static final int VISUAL = 0x0;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FACE_TRACKING_DATA_SOURCE2_AUDIO_FB.html"><code>XR_FACE_TRACKING_DATA_SOURCE2_AUDIO_FB</code></a>
    public static final int AUDIO = 0x1;

    public static String explain(@EnumType(XrFaceTrackingDataSource2FB.class) int value) {
        return switch (value) {
            case XrFaceTrackingDataSource2FB.AUDIO -> "XR_FACE_TRACKING_DATA_SOURCE2_AUDIO_FB";
            case XrFaceTrackingDataSource2FB.VISUAL -> "XR_FACE_TRACKING_DATA_SOURCE2_VISUAL_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFaceTrackingDataSource2FB() {}
}
