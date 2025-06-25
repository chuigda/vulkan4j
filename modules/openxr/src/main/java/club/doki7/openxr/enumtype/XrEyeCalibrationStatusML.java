package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEyeCalibrationStatusML.html"><code>XrEyeCalibrationStatusML</code></a>
public final class XrEyeCalibrationStatusML {
    public static final int UNKNOWN = 0x0;
    public static final int NONE = 0x1;
    public static final int COARSE = 0x2;
    public static final int FINE = 0x3;

    public static String explain(@EnumType(XrEyeCalibrationStatusML.class) int value) {
        return switch (value) {
            case XrEyeCalibrationStatusML.COARSE -> "XR_EYE_CALIBRATION_STATUS_COARSE_ML";
            case XrEyeCalibrationStatusML.FINE -> "XR_EYE_CALIBRATION_STATUS_FINE_ML";
            case XrEyeCalibrationStatusML.NONE -> "XR_EYE_CALIBRATION_STATUS_NONE_ML";
            case XrEyeCalibrationStatusML.UNKNOWN -> "XR_EYE_CALIBRATION_STATUS_UNKNOWN_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrEyeCalibrationStatusML() {}
}
