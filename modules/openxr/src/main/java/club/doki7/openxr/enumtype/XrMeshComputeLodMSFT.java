package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMeshComputeLodMSFT.html"><code>XrMeshComputeLodMSFT</code></a>
public final class XrMeshComputeLodMSFT {
    public static final int COARSE = 0x1;
    public static final int MEDIUM = 0x2;
    public static final int FINE = 0x3;
    public static final int UNLIMITED = 0x4;

    public static String explain(@EnumType(XrMeshComputeLodMSFT.class) int value) {
        return switch (value) {
            case XrMeshComputeLodMSFT.COARSE -> "XR_MESH_COMPUTE_LOD_COARSE_MSFT";
            case XrMeshComputeLodMSFT.FINE -> "XR_MESH_COMPUTE_LOD_FINE_MSFT";
            case XrMeshComputeLodMSFT.MEDIUM -> "XR_MESH_COMPUTE_LOD_MEDIUM_MSFT";
            case XrMeshComputeLodMSFT.UNLIMITED -> "XR_MESH_COMPUTE_LOD_UNLIMITED_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrMeshComputeLodMSFT() {}
}
