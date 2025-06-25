package club.doki7.openxr.bitmask;

import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSemanticLabelsSupportFlagsFB.html"><code>XrSemanticLabelsSupportFlagsFB</code></a>
public final class XrSemanticLabelsSupportFlagsFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB.html"><code>XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB</code></a>
    public static final long ACCEPT_DESK_TO_TABLE_MIGRATION = 0x2L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_INVISIBLE_WALL_FACE_BIT_FB.html"><code>XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_INVISIBLE_WALL_FACE_BIT_FB</code></a>
    public static final long ACCEPT_INVISIBLE_WALL_FACE = 0x4L;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB.html"><code>XR_SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB</code></a>
    public static final long MULTIPLE_SEMANTIC_LABELS = 0x1L;

    public static String explain(@Bitmask(XrSemanticLabelsSupportFlagsFB.class) long flags) {
        List<String> detectedFlagBits = new ArrayList<>();
        if ((flags & ACCEPT_DESK_TO_TABLE_MIGRATION) != 0) {
            detectedFlagBits.add("XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB");
        }
        if ((flags & ACCEPT_INVISIBLE_WALL_FACE) != 0) {
            detectedFlagBits.add("XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_INVISIBLE_WALL_FACE_BIT_FB");
        }
        if ((flags & MULTIPLE_SEMANTIC_LABELS) != 0) {
            detectedFlagBits.add("XR_SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB");
        }

        if (detectedFlagBits.isEmpty()) {
            return "NONE(" + Long.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSemanticLabelsSupportFlagsFB() {}
}
