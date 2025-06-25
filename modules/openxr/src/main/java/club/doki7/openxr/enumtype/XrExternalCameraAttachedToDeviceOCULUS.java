package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExternalCameraAttachedToDeviceOCULUS.html"><code>XrExternalCameraAttachedToDeviceOCULUS</code></a>
public final class XrExternalCameraAttachedToDeviceOCULUS {
    public static final int NONE = 0x0;
    public static final int HMD = 0x1;
    public static final int LTOUCH = 0x2;
    public static final int RTOUCH = 0x3;

    public static String explain(@EnumType(XrExternalCameraAttachedToDeviceOCULUS.class) int value) {
        return switch (value) {
            case XrExternalCameraAttachedToDeviceOCULUS.HMD -> "XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_HMD_OCULUS";
            case XrExternalCameraAttachedToDeviceOCULUS.LTOUCH -> "XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_LTOUCH_OCULUS";
            case XrExternalCameraAttachedToDeviceOCULUS.NONE -> "XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_NONE_OCULUS";
            case XrExternalCameraAttachedToDeviceOCULUS.RTOUCH -> "XR_EXTERNAL_CAMERA_ATTACHED_TO_DEVICE_RTOUCH_OCULUS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrExternalCameraAttachedToDeviceOCULUS() {}
}
