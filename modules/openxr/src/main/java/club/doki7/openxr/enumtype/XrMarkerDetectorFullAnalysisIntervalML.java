package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerDetectorFullAnalysisIntervalML.html"><code>XrMarkerDetectorFullAnalysisIntervalML</code></a>
public final class XrMarkerDetectorFullAnalysisIntervalML {
    public static final int MAX = 0x0;
    public static final int FAST = 0x1;
    public static final int MEDIUM = 0x2;
    public static final int SLOW = 0x3;

    public static String explain(@EnumType(XrMarkerDetectorFullAnalysisIntervalML.class) int value) {
        return switch (value) {
            case XrMarkerDetectorFullAnalysisIntervalML.FAST -> "XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_FAST_ML";
            case XrMarkerDetectorFullAnalysisIntervalML.MAX -> "XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MAX_ML";
            case XrMarkerDetectorFullAnalysisIntervalML.MEDIUM -> "XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_MEDIUM_ML";
            case XrMarkerDetectorFullAnalysisIntervalML.SLOW -> "XR_MARKER_DETECTOR_FULL_ANALYSIS_INTERVAL_SLOW_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrMarkerDetectorFullAnalysisIntervalML() {}
}
