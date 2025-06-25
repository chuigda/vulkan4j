package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFacialExpressionBlendShapePropertiesFlagsML.html"><code>XrFacialExpressionBlendShapePropertiesFlagsML</code></a>
public final class XrFacialExpressionBlendShapePropertiesFlagsML {
    public static final long TRACKED = 0x2L;
    public static final long VALID = 0x1L;

    public static String explain(@Bitmask(XrFacialExpressionBlendShapePropertiesFlagsML.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & TRACKED) != 0) {
            detectedFlagBits.add("XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_TRACKED_BIT_ML");
        }
        if ((flags & VALID) != 0) {
            detectedFlagBits.add("XR_FACIAL_EXPRESSION_BLEND_SHAPE_PROPERTIES_VALID_BIT_ML");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFacialExpressionBlendShapePropertiesFlagsML() {}
}
