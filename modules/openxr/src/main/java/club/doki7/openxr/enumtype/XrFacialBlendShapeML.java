package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFacialBlendShapeML.html"><code>XrFacialBlendShapeML</code></a>
public final class XrFacialBlendShapeML {
    public static final int BROW_LOWERER_L = 0x0;
    public static final int BROW_LOWERER_R = 0x1;
    public static final int CHEEK_RAISER_L = 0x2;
    public static final int CHEEK_RAISER_R = 0x3;
    public static final int CHIN_RAISER = 0x4;
    public static final int DIMPLER_L = 0x5;
    public static final int DIMPLER_R = 0x6;
    public static final int EYES_CLOSED_L = 0x7;
    public static final int EYES_CLOSED_R = 0x8;
    public static final int INNER_BROW_RAISER_L = 0x9;
    public static final int INNER_BROW_RAISER_R = 0xa;
    public static final int JAW_DROP = 0xb;
    public static final int LID_TIGHTENER_L = 0xc;
    public static final int LID_TIGHTENER_R = 0xd;
    public static final int LIP_CORNER_DEPRESSOR_L = 0xe;
    public static final int LIP_CORNER_DEPRESSOR_R = 0xf;
    public static final int LIP_CORNER_PULLER_L = 0x10;
    public static final int LIP_CORNER_PULLER_R = 0x11;
    public static final int LIP_FUNNELER_LB = 0x12;
    public static final int LIP_FUNNELER_LT = 0x13;
    public static final int LIP_FUNNELER_RB = 0x14;
    public static final int LIP_FUNNELER_RT = 0x15;
    public static final int LIP_PRESSOR_L = 0x16;
    public static final int LIP_PRESSOR_R = 0x17;
    public static final int LIP_PUCKER_L = 0x18;
    public static final int LIP_PUCKER_R = 0x19;
    public static final int LIP_STRETCHER_L = 0x1a;
    public static final int LIP_STRETCHER_R = 0x1b;
    public static final int LIP_SUCK_LB = 0x1c;
    public static final int LIP_SUCK_LT = 0x1d;
    public static final int LIP_SUCK_RB = 0x1e;
    public static final int LIP_SUCK_RT = 0x1f;
    public static final int LIP_TIGHTENER_L = 0x20;
    public static final int LIP_TIGHTENER_R = 0x21;
    public static final int LIPS_TOWARD = 0x22;
    public static final int LOWER_LIP_DEPRESSOR_L = 0x23;
    public static final int LOWER_LIP_DEPRESSOR_R = 0x24;
    public static final int NOSE_WRINKLER_L = 0x25;
    public static final int NOSE_WRINKLER_R = 0x26;
    public static final int OUTER_BROW_RAISER_L = 0x27;
    public static final int OUTER_BROW_RAISER_R = 0x28;
    public static final int UPPER_LID_RAISER_L = 0x29;
    public static final int UPPER_LID_RAISER_R = 0x2a;
    public static final int UPPER_LIP_RAISER_L = 0x2b;
    public static final int UPPER_LIP_RAISER_R = 0x2c;
    public static final int TONGUE_OUT = 0x2d;

    public static String explain(@EnumType(XrFacialBlendShapeML.class) int value) {
        return switch (value) {
            case XrFacialBlendShapeML.BROW_LOWERER_L -> "XR_FACIAL_BLEND_SHAPE_BROW_LOWERER_L_ML";
            case XrFacialBlendShapeML.BROW_LOWERER_R -> "XR_FACIAL_BLEND_SHAPE_BROW_LOWERER_R_ML";
            case XrFacialBlendShapeML.CHEEK_RAISER_L -> "XR_FACIAL_BLEND_SHAPE_CHEEK_RAISER_L_ML";
            case XrFacialBlendShapeML.CHEEK_RAISER_R -> "XR_FACIAL_BLEND_SHAPE_CHEEK_RAISER_R_ML";
            case XrFacialBlendShapeML.CHIN_RAISER -> "XR_FACIAL_BLEND_SHAPE_CHIN_RAISER_ML";
            case XrFacialBlendShapeML.DIMPLER_L -> "XR_FACIAL_BLEND_SHAPE_DIMPLER_L_ML";
            case XrFacialBlendShapeML.DIMPLER_R -> "XR_FACIAL_BLEND_SHAPE_DIMPLER_R_ML";
            case XrFacialBlendShapeML.EYES_CLOSED_L -> "XR_FACIAL_BLEND_SHAPE_EYES_CLOSED_L_ML";
            case XrFacialBlendShapeML.EYES_CLOSED_R -> "XR_FACIAL_BLEND_SHAPE_EYES_CLOSED_R_ML";
            case XrFacialBlendShapeML.INNER_BROW_RAISER_L -> "XR_FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_L_ML";
            case XrFacialBlendShapeML.INNER_BROW_RAISER_R -> "XR_FACIAL_BLEND_SHAPE_INNER_BROW_RAISER_R_ML";
            case XrFacialBlendShapeML.JAW_DROP -> "XR_FACIAL_BLEND_SHAPE_JAW_DROP_ML";
            case XrFacialBlendShapeML.LID_TIGHTENER_L -> "XR_FACIAL_BLEND_SHAPE_LID_TIGHTENER_L_ML";
            case XrFacialBlendShapeML.LID_TIGHTENER_R -> "XR_FACIAL_BLEND_SHAPE_LID_TIGHTENER_R_ML";
            case XrFacialBlendShapeML.LIPS_TOWARD -> "XR_FACIAL_BLEND_SHAPE_LIPS_TOWARD_ML";
            case XrFacialBlendShapeML.LIP_CORNER_DEPRESSOR_L -> "XR_FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_L_ML";
            case XrFacialBlendShapeML.LIP_CORNER_DEPRESSOR_R -> "XR_FACIAL_BLEND_SHAPE_LIP_CORNER_DEPRESSOR_R_ML";
            case XrFacialBlendShapeML.LIP_CORNER_PULLER_L -> "XR_FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_L_ML";
            case XrFacialBlendShapeML.LIP_CORNER_PULLER_R -> "XR_FACIAL_BLEND_SHAPE_LIP_CORNER_PULLER_R_ML";
            case XrFacialBlendShapeML.LIP_FUNNELER_LB -> "XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_LB_ML";
            case XrFacialBlendShapeML.LIP_FUNNELER_LT -> "XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_LT_ML";
            case XrFacialBlendShapeML.LIP_FUNNELER_RB -> "XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_RB_ML";
            case XrFacialBlendShapeML.LIP_FUNNELER_RT -> "XR_FACIAL_BLEND_SHAPE_LIP_FUNNELER_RT_ML";
            case XrFacialBlendShapeML.LIP_PRESSOR_L -> "XR_FACIAL_BLEND_SHAPE_LIP_PRESSOR_L_ML";
            case XrFacialBlendShapeML.LIP_PRESSOR_R -> "XR_FACIAL_BLEND_SHAPE_LIP_PRESSOR_R_ML";
            case XrFacialBlendShapeML.LIP_PUCKER_L -> "XR_FACIAL_BLEND_SHAPE_LIP_PUCKER_L_ML";
            case XrFacialBlendShapeML.LIP_PUCKER_R -> "XR_FACIAL_BLEND_SHAPE_LIP_PUCKER_R_ML";
            case XrFacialBlendShapeML.LIP_STRETCHER_L -> "XR_FACIAL_BLEND_SHAPE_LIP_STRETCHER_L_ML";
            case XrFacialBlendShapeML.LIP_STRETCHER_R -> "XR_FACIAL_BLEND_SHAPE_LIP_STRETCHER_R_ML";
            case XrFacialBlendShapeML.LIP_SUCK_LB -> "XR_FACIAL_BLEND_SHAPE_LIP_SUCK_LB_ML";
            case XrFacialBlendShapeML.LIP_SUCK_LT -> "XR_FACIAL_BLEND_SHAPE_LIP_SUCK_LT_ML";
            case XrFacialBlendShapeML.LIP_SUCK_RB -> "XR_FACIAL_BLEND_SHAPE_LIP_SUCK_RB_ML";
            case XrFacialBlendShapeML.LIP_SUCK_RT -> "XR_FACIAL_BLEND_SHAPE_LIP_SUCK_RT_ML";
            case XrFacialBlendShapeML.LIP_TIGHTENER_L -> "XR_FACIAL_BLEND_SHAPE_LIP_TIGHTENER_L_ML";
            case XrFacialBlendShapeML.LIP_TIGHTENER_R -> "XR_FACIAL_BLEND_SHAPE_LIP_TIGHTENER_R_ML";
            case XrFacialBlendShapeML.LOWER_LIP_DEPRESSOR_L -> "XR_FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_L_ML";
            case XrFacialBlendShapeML.LOWER_LIP_DEPRESSOR_R -> "XR_FACIAL_BLEND_SHAPE_LOWER_LIP_DEPRESSOR_R_ML";
            case XrFacialBlendShapeML.NOSE_WRINKLER_L -> "XR_FACIAL_BLEND_SHAPE_NOSE_WRINKLER_L_ML";
            case XrFacialBlendShapeML.NOSE_WRINKLER_R -> "XR_FACIAL_BLEND_SHAPE_NOSE_WRINKLER_R_ML";
            case XrFacialBlendShapeML.OUTER_BROW_RAISER_L -> "XR_FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_L_ML";
            case XrFacialBlendShapeML.OUTER_BROW_RAISER_R -> "XR_FACIAL_BLEND_SHAPE_OUTER_BROW_RAISER_R_ML";
            case XrFacialBlendShapeML.TONGUE_OUT -> "XR_FACIAL_BLEND_SHAPE_TONGUE_OUT_ML";
            case XrFacialBlendShapeML.UPPER_LID_RAISER_L -> "XR_FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_L_ML";
            case XrFacialBlendShapeML.UPPER_LID_RAISER_R -> "XR_FACIAL_BLEND_SHAPE_UPPER_LID_RAISER_R_ML";
            case XrFacialBlendShapeML.UPPER_LIP_RAISER_L -> "XR_FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_L_ML";
            case XrFacialBlendShapeML.UPPER_LIP_RAISER_R -> "XR_FACIAL_BLEND_SHAPE_UPPER_LIP_RAISER_R_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrFacialBlendShapeML() {}
}
