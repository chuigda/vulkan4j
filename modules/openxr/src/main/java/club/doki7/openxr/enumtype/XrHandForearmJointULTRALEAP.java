package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandForearmJointULTRALEAP.html"><code>XrHandForearmJointULTRALEAP</code></a>
public final class XrHandForearmJointULTRALEAP {
    public static final int PALM = 0x0;
    public static final int WRIST = 0x1;
    public static final int THUMB_METACARPAL = 0x2;
    public static final int THUMB_PROXIMAL = 0x3;
    public static final int THUMB_DISTAL = 0x4;
    public static final int THUMB_TIP = 0x5;
    public static final int INDEX_METACARPAL = 0x6;
    public static final int INDEX_PROXIMAL = 0x7;
    public static final int INDEX_INTERMEDIATE = 0x8;
    public static final int INDEX_DISTAL = 0x9;
    public static final int INDEX_TIP = 0xa;
    public static final int MIDDLE_METACARPAL = 0xb;
    public static final int MIDDLE_PROXIMAL = 0xc;
    public static final int MIDDLE_INTERMEDIATE = 0xd;
    public static final int MIDDLE_DISTAL = 0xe;
    public static final int MIDDLE_TIP = 0xf;
    public static final int RING_METACARPAL = 0x10;
    public static final int RING_PROXIMAL = 0x11;
    public static final int RING_INTERMEDIATE = 0x12;
    public static final int RING_DISTAL = 0x13;
    public static final int RING_TIP = 0x14;
    public static final int LITTLE_METACARPAL = 0x15;
    public static final int LITTLE_PROXIMAL = 0x16;
    public static final int LITTLE_INTERMEDIATE = 0x17;
    public static final int LITTLE_DISTAL = 0x18;
    public static final int LITTLE_TIP = 0x19;
    public static final int ELBOW = 0x1a;

    public static String explain(@EnumType(XrHandForearmJointULTRALEAP.class) int value) {
        return switch (value) {
            case XrHandForearmJointULTRALEAP.ELBOW -> "XR_HAND_FOREARM_JOINT_ELBOW_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.INDEX_DISTAL -> "XR_HAND_FOREARM_JOINT_INDEX_DISTAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.INDEX_INTERMEDIATE -> "XR_HAND_FOREARM_JOINT_INDEX_INTERMEDIATE_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.INDEX_METACARPAL -> "XR_HAND_FOREARM_JOINT_INDEX_METACARPAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.INDEX_PROXIMAL -> "XR_HAND_FOREARM_JOINT_INDEX_PROXIMAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.INDEX_TIP -> "XR_HAND_FOREARM_JOINT_INDEX_TIP_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.LITTLE_DISTAL -> "XR_HAND_FOREARM_JOINT_LITTLE_DISTAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.LITTLE_INTERMEDIATE -> "XR_HAND_FOREARM_JOINT_LITTLE_INTERMEDIATE_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.LITTLE_METACARPAL -> "XR_HAND_FOREARM_JOINT_LITTLE_METACARPAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.LITTLE_PROXIMAL -> "XR_HAND_FOREARM_JOINT_LITTLE_PROXIMAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.LITTLE_TIP -> "XR_HAND_FOREARM_JOINT_LITTLE_TIP_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.MIDDLE_DISTAL -> "XR_HAND_FOREARM_JOINT_MIDDLE_DISTAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.MIDDLE_INTERMEDIATE -> "XR_HAND_FOREARM_JOINT_MIDDLE_INTERMEDIATE_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.MIDDLE_METACARPAL -> "XR_HAND_FOREARM_JOINT_MIDDLE_METACARPAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.MIDDLE_PROXIMAL -> "XR_HAND_FOREARM_JOINT_MIDDLE_PROXIMAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.MIDDLE_TIP -> "XR_HAND_FOREARM_JOINT_MIDDLE_TIP_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.PALM -> "XR_HAND_FOREARM_JOINT_PALM_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.RING_DISTAL -> "XR_HAND_FOREARM_JOINT_RING_DISTAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.RING_INTERMEDIATE -> "XR_HAND_FOREARM_JOINT_RING_INTERMEDIATE_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.RING_METACARPAL -> "XR_HAND_FOREARM_JOINT_RING_METACARPAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.RING_PROXIMAL -> "XR_HAND_FOREARM_JOINT_RING_PROXIMAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.RING_TIP -> "XR_HAND_FOREARM_JOINT_RING_TIP_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.THUMB_DISTAL -> "XR_HAND_FOREARM_JOINT_THUMB_DISTAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.THUMB_METACARPAL -> "XR_HAND_FOREARM_JOINT_THUMB_METACARPAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.THUMB_PROXIMAL -> "XR_HAND_FOREARM_JOINT_THUMB_PROXIMAL_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.THUMB_TIP -> "XR_HAND_FOREARM_JOINT_THUMB_TIP_ULTRALEAP";
            case XrHandForearmJointULTRALEAP.WRIST -> "XR_HAND_FOREARM_JOINT_WRIST_ULTRALEAP";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrHandForearmJointULTRALEAP() {}
}
