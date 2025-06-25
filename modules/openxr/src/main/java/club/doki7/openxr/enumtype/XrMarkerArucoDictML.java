package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerArucoDictML.html"><code>XrMarkerArucoDictML</code></a>
public final class XrMarkerArucoDictML {
    public static final int _4X4_50 = 0x0;
    public static final int _4X4_100 = 0x1;
    public static final int _4X4_250 = 0x2;
    public static final int _4X4_1000 = 0x3;
    public static final int _5X5_50 = 0x4;
    public static final int _5X5_100 = 0x5;
    public static final int _5X5_250 = 0x6;
    public static final int _5X5_1000 = 0x7;
    public static final int _6X6_50 = 0x8;
    public static final int _6X6_100 = 0x9;
    public static final int _6X6_250 = 0xa;
    public static final int _6X6_1000 = 0xb;
    public static final int _7X7_50 = 0xc;
    public static final int _7X7_100 = 0xd;
    public static final int _7X7_250 = 0xe;
    public static final int _7X7_1000 = 0xf;

    public static String explain(@EnumType(XrMarkerArucoDictML.class) int value) {
        return switch (value) {
            case XrMarkerArucoDictML._4X4_1000 -> "XR_MARKER_ARUCO_DICT_4X4_1000_ML";
            case XrMarkerArucoDictML._4X4_100 -> "XR_MARKER_ARUCO_DICT_4X4_100_ML";
            case XrMarkerArucoDictML._4X4_250 -> "XR_MARKER_ARUCO_DICT_4X4_250_ML";
            case XrMarkerArucoDictML._4X4_50 -> "XR_MARKER_ARUCO_DICT_4X4_50_ML";
            case XrMarkerArucoDictML._5X5_1000 -> "XR_MARKER_ARUCO_DICT_5X5_1000_ML";
            case XrMarkerArucoDictML._5X5_100 -> "XR_MARKER_ARUCO_DICT_5X5_100_ML";
            case XrMarkerArucoDictML._5X5_250 -> "XR_MARKER_ARUCO_DICT_5X5_250_ML";
            case XrMarkerArucoDictML._5X5_50 -> "XR_MARKER_ARUCO_DICT_5X5_50_ML";
            case XrMarkerArucoDictML._6X6_1000 -> "XR_MARKER_ARUCO_DICT_6X6_1000_ML";
            case XrMarkerArucoDictML._6X6_100 -> "XR_MARKER_ARUCO_DICT_6X6_100_ML";
            case XrMarkerArucoDictML._6X6_250 -> "XR_MARKER_ARUCO_DICT_6X6_250_ML";
            case XrMarkerArucoDictML._6X6_50 -> "XR_MARKER_ARUCO_DICT_6X6_50_ML";
            case XrMarkerArucoDictML._7X7_1000 -> "XR_MARKER_ARUCO_DICT_7X7_1000_ML";
            case XrMarkerArucoDictML._7X7_100 -> "XR_MARKER_ARUCO_DICT_7X7_100_ML";
            case XrMarkerArucoDictML._7X7_250 -> "XR_MARKER_ARUCO_DICT_7X7_250_ML";
            case XrMarkerArucoDictML._7X7_50 -> "XR_MARKER_ARUCO_DICT_7X7_50_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrMarkerArucoDictML() {}
}
