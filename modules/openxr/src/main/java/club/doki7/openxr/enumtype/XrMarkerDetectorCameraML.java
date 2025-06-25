package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerDetectorCameraML.html"><code>XrMarkerDetectorCameraML</code></a>
public final class XrMarkerDetectorCameraML {
    public static final int RGB_CAMERA = 0x0;
    public static final int WORLD_CAMERAS = 0x1;

    public static String explain(@EnumType(XrMarkerDetectorCameraML.class) int value) {
        return switch (value) {
            case XrMarkerDetectorCameraML.RGB_CAMERA -> "XR_MARKER_DETECTOR_CAMERA_RGB_CAMERA_ML";
            case XrMarkerDetectorCameraML.WORLD_CAMERAS -> "XR_MARKER_DETECTOR_CAMERA_WORLD_CAMERAS_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrMarkerDetectorCameraML() {}
}
