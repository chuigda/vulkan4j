package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerQRCodeSymbolTypeMSFT.html"><code>XrSceneMarkerQRCodeSymbolTypeMSFT</code></a>
public final class XrSceneMarkerQRCodeSymbolTypeMSFT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE_MSFT.html"><code>XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE_MSFT</code></a>
    public static final int XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE_MSFT.html"><code>XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE_MSFT</code></a>
    public static final int XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE = 0x2;

    public static String explain(@EnumType(XrSceneMarkerQRCodeSymbolTypeMSFT.class) int value) {
        return switch (value) {
            case XrSceneMarkerQRCodeSymbolTypeMSFT.XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE -> "XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_MICRO_QR_CODE_MSFT";
            case XrSceneMarkerQRCodeSymbolTypeMSFT.XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE -> "XR_SCENE_MARKER_QR_CODE_SYMBOL_TYPE_QR_CODE_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSceneMarkerQRCodeSymbolTypeMSFT() {}
}
