package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSemanticLabelBD.html"><code>XrSemanticLabelBD</code></a>
public final class XrSemanticLabelBD {
    public static final int UNKNOWN = 0x0;
    public static final int FLOOR = 0x1;
    public static final int CEILING = 0x2;
    public static final int WALL = 0x3;
    public static final int DOOR = 0x4;
    public static final int WINDOW = 0x5;
    public static final int OPENING = 0x6;
    public static final int TABLE = 0x7;
    public static final int SOFA = 0x8;
    public static final int CHAIR = 0x9;
    public static final int HUMAN = 0xa;
    public static final int BEAM = 0xb;
    public static final int COLUMN = 0xc;
    public static final int CURTAIN = 0xd;
    public static final int CABINET = 0xe;
    public static final int BED = 0xf;
    public static final int PLANT = 0x10;
    public static final int SCREEN = 0x11;
    public static final int VIRTUAL_WALL = 0x12;
    public static final int REFRIGERATOR = 0x13;
    public static final int WASHING_MACHINE = 0x14;
    public static final int AIR_CONDITIONER = 0x15;
    public static final int LAMP = 0x16;
    public static final int WALL_ART = 0x17;
    public static final int STAIRWAY = 0x18;

    public static String explain(@EnumType(XrSemanticLabelBD.class) int value) {
        return switch (value) {
            case XrSemanticLabelBD.AIR_CONDITIONER -> "XR_SEMANTIC_LABEL_AIR_CONDITIONER_BD";
            case XrSemanticLabelBD.BEAM -> "XR_SEMANTIC_LABEL_BEAM_BD";
            case XrSemanticLabelBD.BED -> "XR_SEMANTIC_LABEL_BED_BD";
            case XrSemanticLabelBD.CABINET -> "XR_SEMANTIC_LABEL_CABINET_BD";
            case XrSemanticLabelBD.CEILING -> "XR_SEMANTIC_LABEL_CEILING_BD";
            case XrSemanticLabelBD.CHAIR -> "XR_SEMANTIC_LABEL_CHAIR_BD";
            case XrSemanticLabelBD.COLUMN -> "XR_SEMANTIC_LABEL_COLUMN_BD";
            case XrSemanticLabelBD.CURTAIN -> "XR_SEMANTIC_LABEL_CURTAIN_BD";
            case XrSemanticLabelBD.DOOR -> "XR_SEMANTIC_LABEL_DOOR_BD";
            case XrSemanticLabelBD.FLOOR -> "XR_SEMANTIC_LABEL_FLOOR_BD";
            case XrSemanticLabelBD.HUMAN -> "XR_SEMANTIC_LABEL_HUMAN_BD";
            case XrSemanticLabelBD.LAMP -> "XR_SEMANTIC_LABEL_LAMP_BD";
            case XrSemanticLabelBD.OPENING -> "XR_SEMANTIC_LABEL_OPENING_BD";
            case XrSemanticLabelBD.PLANT -> "XR_SEMANTIC_LABEL_PLANT_BD";
            case XrSemanticLabelBD.REFRIGERATOR -> "XR_SEMANTIC_LABEL_REFRIGERATOR_BD";
            case XrSemanticLabelBD.SCREEN -> "XR_SEMANTIC_LABEL_SCREEN_BD";
            case XrSemanticLabelBD.SOFA -> "XR_SEMANTIC_LABEL_SOFA_BD";
            case XrSemanticLabelBD.STAIRWAY -> "XR_SEMANTIC_LABEL_STAIRWAY_BD";
            case XrSemanticLabelBD.TABLE -> "XR_SEMANTIC_LABEL_TABLE_BD";
            case XrSemanticLabelBD.UNKNOWN -> "XR_SEMANTIC_LABEL_UNKNOWN_BD";
            case XrSemanticLabelBD.VIRTUAL_WALL -> "XR_SEMANTIC_LABEL_VIRTUAL_WALL_BD";
            case XrSemanticLabelBD.WALL_ART -> "XR_SEMANTIC_LABEL_WALL_ART_BD";
            case XrSemanticLabelBD.WALL -> "XR_SEMANTIC_LABEL_WALL_BD";
            case XrSemanticLabelBD.WASHING_MACHINE -> "XR_SEMANTIC_LABEL_WASHING_MACHINE_BD";
            case XrSemanticLabelBD.WINDOW -> "XR_SEMANTIC_LABEL_WINDOW_BD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrSemanticLabelBD() {}
}
