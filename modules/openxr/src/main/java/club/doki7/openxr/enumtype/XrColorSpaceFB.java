package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrColorSpaceFB.html"><code>XrColorSpaceFB</code></a>
public final class XrColorSpaceFB {
    public static final int UNMANAGED = 0x0;
    public static final int REC2020 = 0x1;
    public static final int REC709 = 0x2;
    public static final int RIFT_CV1 = 0x3;
    public static final int RIFT_S = 0x4;
    public static final int QUEST = 0x5;
    public static final int P3 = 0x6;
    public static final int ADOBE_RGB = 0x7;

    public static String explain(@EnumType(XrColorSpaceFB.class) int value) {
        return switch (value) {
            case XrColorSpaceFB.ADOBE_RGB -> "XR_COLOR_SPACE_ADOBE_RGB_FB";
            case XrColorSpaceFB.P3 -> "XR_COLOR_SPACE_P3_FB";
            case XrColorSpaceFB.QUEST -> "XR_COLOR_SPACE_QUEST_FB";
            case XrColorSpaceFB.REC2020 -> "XR_COLOR_SPACE_REC2020_FB";
            case XrColorSpaceFB.REC709 -> "XR_COLOR_SPACE_REC709_FB";
            case XrColorSpaceFB.RIFT_CV1 -> "XR_COLOR_SPACE_RIFT_CV1_FB";
            case XrColorSpaceFB.RIFT_S -> "XR_COLOR_SPACE_RIFT_S_FB";
            case XrColorSpaceFB.UNMANAGED -> "XR_COLOR_SPACE_UNMANAGED_FB";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrColorSpaceFB() {}
}
