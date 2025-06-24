package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFacialExpressionBlendShapePropertiesFlagsML.html"><code>XrFacialExpressionBlendShapePropertiesFlagsML</code></a>
public final class XrFacialExpressionBlendShapePropertiesFlagsML {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_TRACKED_BIT_ML.html"><code>XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_TRACKED_BIT_ML</code></a>
    public static final int TRACKED = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_VALID_BIT_ML.html"><code>XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_VALID_BIT_ML</code></a>
    public static final int VALID = 0x0;

    public static String explain(@Bitmask(XrFacialExpressionBlendShapePropertiesFlagsML.class) int flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & TRACKED) != 0) {
            detectedFlagBits.add("XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_TRACKED_BIT_ML");
        }
        if ((flags & VALID) != 0) {
            detectedFlagBits.add("XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_VALID_BIT_ML");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFacialExpressionBlendShapePropertiesFlagsML() {}
}
