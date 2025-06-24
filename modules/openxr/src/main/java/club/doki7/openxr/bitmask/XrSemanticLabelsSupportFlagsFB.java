package club.doki7.openxr.bitmask;

import club.doki7.ffm.annotation.*;

import java.util.ArrayList;
import java.util.List;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSemanticLabelsSupportFlagsFB.html"><code>XrSemanticLabelsSupportFlagsFB</code></a>
public final class XrSemanticLabelsSupportFlagsFB {
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB.html"><code>XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_DESK_TO_TABLE_MIGRATION_BIT_FB</code></a>
    public static final int ACCEPT_DESK_TO_TABLE_MIGRATION = 0x1;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_INVISIBLE_WALL_FACE_BIT_FB.html"><code>XR_SEMANTIC_LABELS_SUPPORT_ACCEPT_INVISIBLE_WALL_FACE_BIT_FB</code></a>
    public static final int ACCEPT_INVISIBLE_WALL_FACE = 0x2;
    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XR_SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB.html"><code>XR_SEMANTIC_LABELS_SUPPORT_MULTIPLE_SEMANTIC_LABELS_BIT_FB</code></a>
    public static final int MULTIPLE_SEMANTIC_LABELS = 0x0;

    public static String explain(@Bitmask(XrSemanticLabelsSupportFlagsFB.class) int flags) {
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
            return "NONE(" + Integer.toBinaryString(flags) + ")";
        }
        return String.join(" | ", detectedFlagBits);
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSemanticLabelsSupportFlagsFB() {}
}
