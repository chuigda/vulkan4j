package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialGraphNodeTypeMSFT.html"><code>XrSpatialGraphNodeTypeMSFT</code></a>
public final class XrSpatialGraphNodeTypeMSFT {
    public static final int STATIC = 0x1;
    public static final int DYNAMIC = 0x2;

    public static String explain(@EnumType(XrSpatialGraphNodeTypeMSFT.class) int value) {
        return switch (value) {
            case XrSpatialGraphNodeTypeMSFT.DYNAMIC -> "XR_SPATIAL_GRAPH_NODE_TYPE_DYNAMIC_MSFT";
            case XrSpatialGraphNodeTypeMSFT.STATIC -> "XR_SPATIAL_GRAPH_NODE_TYPE_STATIC_MSFT";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSpatialGraphNodeTypeMSFT() {}
}
