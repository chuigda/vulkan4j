package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrReprojectionModeMSFT.html"><code>XrReprojectionModeMSFT</code></a>
public final class XrReprojectionModeMSFT {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REPROJECTION_MODE_DEPTH_MSFT.html"><code>XR_REPROJECTION_MODE_DEPTH_MSFT</code></a>
    public static final int DEPTH = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT.html"><code>XR_REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT</code></a>
    public static final int PLANAR_FROM_DEPTH = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REPROJECTION_MODE_PLANAR_MANUAL_MSFT.html"><code>XR_REPROJECTION_MODE_PLANAR_MANUAL_MSFT</code></a>
    public static final int PLANAR_MANUAL = 0x3;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_REPROJECTION_MODE_ORIENTATION_ONLY_MSFT.html"><code>XR_REPROJECTION_MODE_ORIENTATION_ONLY_MSFT</code></a>
    public static final int ORIENTATION_ONLY = 0x4;

    public static String explain(@EnumType(XrReprojectionModeMSFT.class) int value) {
        return switch (value) {
            case XrReprojectionModeMSFT.DEPTH -> "XR_REPROJECTION_MODE_DEPTH_MSFT";
            case XrReprojectionModeMSFT.ORIENTATION_ONLY -> "XR_REPROJECTION_MODE_ORIENTATION_ONLY_MSFT";
            case XrReprojectionModeMSFT.PLANAR_FROM_DEPTH -> "XR_REPROJECTION_MODE_PLANAR_FROM_DEPTH_MSFT";
            case XrReprojectionModeMSFT.PLANAR_MANUAL -> "XR_REPROJECTION_MODE_PLANAR_MANUAL_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrReprojectionModeMSFT() {}
}
