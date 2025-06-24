package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrTriangleMeshFlagsFB.html"><code>XrTriangleMeshFlagsFB</code></a>
public final class XrTriangleMeshFlagsFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_TRIANGLE_MESH_MUTABLE_BIT_FB.html"><code>XR_TRIANGLE_MESH_MUTABLE_BIT_FB</code></a>
    public static final int MUTABLE = 0x0;

    public static String explain(@Bitmask(XrTriangleMeshFlagsFB.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & MUTABLE) != 0) {
            detectedFlagBits.add("XR_TRIANGLE_MESH_MUTABLE_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrTriangleMeshFlagsFB() {}
}
