package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrLipExpressionHTC.html"><code>XrLipExpressionHTC</code></a>
public final class XrLipExpressionHTC {
    public static final int JAW_RIGHT = 0x0;
    public static final int JAW_LEFT = 0x1;
    public static final int JAW_FORWARD = 0x2;
    public static final int JAW_OPEN = 0x3;
    public static final int MOUTH_APE_SHAPE = 0x4;
    public static final int MOUTH_UPPER_RIGHT = 0x5;
    public static final int MOUTH_UPPER_LEFT = 0x6;
    public static final int MOUTH_LOWER_RIGHT = 0x7;
    public static final int MOUTH_LOWER_LEFT = 0x8;
    public static final int MOUTH_UPPER_OVERTURN = 0x9;
    public static final int MOUTH_LOWER_OVERTURN = 0xa;
    public static final int MOUTH_POUT = 0xb;
    public static final int MOUTH_RAISER_RIGHT = 0xc;
    public static final int MOUTH_RAISER_LEFT = 0xd;
    public static final int MOUTH_STRETCHER_RIGHT = 0xe;
    public static final int MOUTH_STRETCHER_LEFT = 0xf;
    public static final int CHEEK_PUFF_RIGHT = 0x10;
    public static final int CHEEK_PUFF_LEFT = 0x11;
    public static final int CHEEK_SUCK = 0x12;
    public static final int MOUTH_UPPER_UPRIGHT = 0x13;
    public static final int MOUTH_UPPER_UPLEFT = 0x14;
    public static final int MOUTH_LOWER_DOWNRIGHT = 0x15;
    public static final int MOUTH_LOWER_DOWNLEFT = 0x16;
    public static final int MOUTH_UPPER_INSIDE = 0x17;
    public static final int MOUTH_LOWER_INSIDE = 0x18;
    public static final int MOUTH_LOWER_OVERLAY = 0x19;
    public static final int TONGUE_LONGSTEP1 = 0x1a;
    public static final int TONGUE_LEFT = 0x1b;
    public static final int TONGUE_RIGHT = 0x1c;
    public static final int TONGUE_UP = 0x1d;
    public static final int TONGUE_DOWN = 0x1e;
    public static final int TONGUE_ROLL = 0x1f;
    public static final int TONGUE_LONGSTEP2 = 0x20;
    public static final int TONGUE_UPRIGHT_MORPH = 0x21;
    public static final int TONGUE_UPLEFT_MORPH = 0x22;
    public static final int TONGUE_DOWNRIGHT_MORPH = 0x23;
    public static final int TONGUE_DOWNLEFT_MORPH = 0x24;
    public static final int MOUTH_SMILE_RIGHT = MOUTH_RAISER_RIGHT;
    public static final int MOUTH_SMILE_LEFT = MOUTH_RAISER_LEFT;
    public static final int MOUTH_SAD_RIGHT = MOUTH_STRETCHER_RIGHT;
    public static final int MOUTH_SAD_LEFT = MOUTH_STRETCHER_LEFT;

    public static String explain(@EnumType(XrLipExpressionHTC.class) int value) {
        return switch (value) {
            case XrLipExpressionHTC.CHEEK_PUFF_LEFT -> "XR_LIP_EXPRESSION_CHEEK_PUFF_LEFT_HTC";
            case XrLipExpressionHTC.CHEEK_PUFF_RIGHT -> "XR_LIP_EXPRESSION_CHEEK_PUFF_RIGHT_HTC";
            case XrLipExpressionHTC.CHEEK_SUCK -> "XR_LIP_EXPRESSION_CHEEK_SUCK_HTC";
            case XrLipExpressionHTC.JAW_FORWARD -> "XR_LIP_EXPRESSION_JAW_FORWARD_HTC";
            case XrLipExpressionHTC.JAW_LEFT -> "XR_LIP_EXPRESSION_JAW_LEFT_HTC";
            case XrLipExpressionHTC.JAW_OPEN -> "XR_LIP_EXPRESSION_JAW_OPEN_HTC";
            case XrLipExpressionHTC.JAW_RIGHT -> "XR_LIP_EXPRESSION_JAW_RIGHT_HTC";
            case XrLipExpressionHTC.MOUTH_APE_SHAPE -> "XR_LIP_EXPRESSION_MOUTH_APE_SHAPE_HTC";
            case XrLipExpressionHTC.MOUTH_LOWER_DOWNLEFT -> "XR_LIP_EXPRESSION_MOUTH_LOWER_DOWNLEFT_HTC";
            case XrLipExpressionHTC.MOUTH_LOWER_DOWNRIGHT -> "XR_LIP_EXPRESSION_MOUTH_LOWER_DOWNRIGHT_HTC";
            case XrLipExpressionHTC.MOUTH_LOWER_INSIDE -> "XR_LIP_EXPRESSION_MOUTH_LOWER_INSIDE_HTC";
            case XrLipExpressionHTC.MOUTH_LOWER_LEFT -> "XR_LIP_EXPRESSION_MOUTH_LOWER_LEFT_HTC";
            case XrLipExpressionHTC.MOUTH_LOWER_OVERLAY -> "XR_LIP_EXPRESSION_MOUTH_LOWER_OVERLAY_HTC";
            case XrLipExpressionHTC.MOUTH_LOWER_OVERTURN -> "XR_LIP_EXPRESSION_MOUTH_LOWER_OVERTURN_HTC";
            case XrLipExpressionHTC.MOUTH_LOWER_RIGHT -> "XR_LIP_EXPRESSION_MOUTH_LOWER_RIGHT_HTC";
            case XrLipExpressionHTC.MOUTH_POUT -> "XR_LIP_EXPRESSION_MOUTH_POUT_HTC";
            case XrLipExpressionHTC.MOUTH_RAISER_LEFT -> "XR_LIP_EXPRESSION_MOUTH_RAISER_LEFT_HTC";
            case XrLipExpressionHTC.MOUTH_RAISER_RIGHT -> "XR_LIP_EXPRESSION_MOUTH_RAISER_RIGHT_HTC";
            case XrLipExpressionHTC.MOUTH_STRETCHER_LEFT -> "XR_LIP_EXPRESSION_MOUTH_STRETCHER_LEFT_HTC";
            case XrLipExpressionHTC.MOUTH_STRETCHER_RIGHT -> "XR_LIP_EXPRESSION_MOUTH_STRETCHER_RIGHT_HTC";
            case XrLipExpressionHTC.MOUTH_UPPER_INSIDE -> "XR_LIP_EXPRESSION_MOUTH_UPPER_INSIDE_HTC";
            case XrLipExpressionHTC.MOUTH_UPPER_LEFT -> "XR_LIP_EXPRESSION_MOUTH_UPPER_LEFT_HTC";
            case XrLipExpressionHTC.MOUTH_UPPER_OVERTURN -> "XR_LIP_EXPRESSION_MOUTH_UPPER_OVERTURN_HTC";
            case XrLipExpressionHTC.MOUTH_UPPER_RIGHT -> "XR_LIP_EXPRESSION_MOUTH_UPPER_RIGHT_HTC";
            case XrLipExpressionHTC.MOUTH_UPPER_UPLEFT -> "XR_LIP_EXPRESSION_MOUTH_UPPER_UPLEFT_HTC";
            case XrLipExpressionHTC.MOUTH_UPPER_UPRIGHT -> "XR_LIP_EXPRESSION_MOUTH_UPPER_UPRIGHT_HTC";
            case XrLipExpressionHTC.TONGUE_DOWNLEFT_MORPH -> "XR_LIP_EXPRESSION_TONGUE_DOWNLEFT_MORPH_HTC";
            case XrLipExpressionHTC.TONGUE_DOWNRIGHT_MORPH -> "XR_LIP_EXPRESSION_TONGUE_DOWNRIGHT_MORPH_HTC";
            case XrLipExpressionHTC.TONGUE_DOWN -> "XR_LIP_EXPRESSION_TONGUE_DOWN_HTC";
            case XrLipExpressionHTC.TONGUE_LEFT -> "XR_LIP_EXPRESSION_TONGUE_LEFT_HTC";
            case XrLipExpressionHTC.TONGUE_LONGSTEP1 -> "XR_LIP_EXPRESSION_TONGUE_LONGSTEP1_HTC";
            case XrLipExpressionHTC.TONGUE_LONGSTEP2 -> "XR_LIP_EXPRESSION_TONGUE_LONGSTEP2_HTC";
            case XrLipExpressionHTC.TONGUE_RIGHT -> "XR_LIP_EXPRESSION_TONGUE_RIGHT_HTC";
            case XrLipExpressionHTC.TONGUE_ROLL -> "XR_LIP_EXPRESSION_TONGUE_ROLL_HTC";
            case XrLipExpressionHTC.TONGUE_UPLEFT_MORPH -> "XR_LIP_EXPRESSION_TONGUE_UPLEFT_MORPH_HTC";
            case XrLipExpressionHTC.TONGUE_UPRIGHT_MORPH -> "XR_LIP_EXPRESSION_TONGUE_UPRIGHT_MORPH_HTC";
            case XrLipExpressionHTC.TONGUE_UP -> "XR_LIP_EXPRESSION_TONGUE_UP_HTC";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrLipExpressionHTC() {}
}
