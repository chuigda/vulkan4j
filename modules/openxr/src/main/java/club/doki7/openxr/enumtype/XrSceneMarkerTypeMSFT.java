package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerTypeMSFT.html"><code>XrSceneMarkerTypeMSFT</code></a>
public final class XrSceneMarkerTypeMSFT {
    public static final int QR_CODE = 0x1;

    public static String explain(@EnumType(XrSceneMarkerTypeMSFT.class) int value) {
        return switch (value) {
            case XrSceneMarkerTypeMSFT.QR_CODE -> "XR_SCENE_MARKER_TYPE_QR_CODE_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSceneMarkerTypeMSFT() {}
}
