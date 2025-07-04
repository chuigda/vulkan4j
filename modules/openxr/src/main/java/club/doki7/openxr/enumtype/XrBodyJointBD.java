package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointBD.html"><code>XrBodyJointBD</code></a>
public final class XrBodyJointBD {
    public static final int PELVIS = 0x0;
    public static final int LEFT_HIP = 0x1;
    public static final int RIGHT_HIP = 0x2;
    public static final int SPINE1 = 0x3;
    public static final int LEFT_KNEE = 0x4;
    public static final int RIGHT_KNEE = 0x5;
    public static final int SPINE2 = 0x6;
    public static final int LEFT_ANKLE = 0x7;
    public static final int RIGHT_ANKLE = 0x8;
    public static final int SPINE3 = 0x9;
    public static final int LEFT_FOOT = 0xa;
    public static final int RIGHT_FOOT = 0xb;
    public static final int NECK = 0xc;
    public static final int LEFT_COLLAR = 0xd;
    public static final int RIGHT_COLLAR = 0xe;
    public static final int HEAD = 0xf;
    public static final int LEFT_SHOULDER = 0x10;
    public static final int RIGHT_SHOULDER = 0x11;
    public static final int LEFT_ELBOW = 0x12;
    public static final int RIGHT_ELBOW = 0x13;
    public static final int LEFT_WRIST = 0x14;
    public static final int RIGHT_WRIST = 0x15;
    public static final int LEFT_HAND = 0x16;
    public static final int RIGHT_HAND = 0x17;

    public static String explain(@EnumType(XrBodyJointBD.class) int value) {
        return switch (value) {
            case XrBodyJointBD.HEAD -> "XR_BODY_JOINT_HEAD_BD";
            case XrBodyJointBD.LEFT_ANKLE -> "XR_BODY_JOINT_LEFT_ANKLE_BD";
            case XrBodyJointBD.LEFT_COLLAR -> "XR_BODY_JOINT_LEFT_COLLAR_BD";
            case XrBodyJointBD.LEFT_ELBOW -> "XR_BODY_JOINT_LEFT_ELBOW_BD";
            case XrBodyJointBD.LEFT_FOOT -> "XR_BODY_JOINT_LEFT_FOOT_BD";
            case XrBodyJointBD.LEFT_HAND -> "XR_BODY_JOINT_LEFT_HAND_BD";
            case XrBodyJointBD.LEFT_HIP -> "XR_BODY_JOINT_LEFT_HIP_BD";
            case XrBodyJointBD.LEFT_KNEE -> "XR_BODY_JOINT_LEFT_KNEE_BD";
            case XrBodyJointBD.LEFT_SHOULDER -> "XR_BODY_JOINT_LEFT_SHOULDER_BD";
            case XrBodyJointBD.LEFT_WRIST -> "XR_BODY_JOINT_LEFT_WRIST_BD";
            case XrBodyJointBD.NECK -> "XR_BODY_JOINT_NECK_BD";
            case XrBodyJointBD.PELVIS -> "XR_BODY_JOINT_PELVIS_BD";
            case XrBodyJointBD.RIGHT_ANKLE -> "XR_BODY_JOINT_RIGHT_ANKLE_BD";
            case XrBodyJointBD.RIGHT_COLLAR -> "XR_BODY_JOINT_RIGHT_COLLAR_BD";
            case XrBodyJointBD.RIGHT_ELBOW -> "XR_BODY_JOINT_RIGHT_ELBOW_BD";
            case XrBodyJointBD.RIGHT_FOOT -> "XR_BODY_JOINT_RIGHT_FOOT_BD";
            case XrBodyJointBD.RIGHT_HAND -> "XR_BODY_JOINT_RIGHT_HAND_BD";
            case XrBodyJointBD.RIGHT_HIP -> "XR_BODY_JOINT_RIGHT_HIP_BD";
            case XrBodyJointBD.RIGHT_KNEE -> "XR_BODY_JOINT_RIGHT_KNEE_BD";
            case XrBodyJointBD.RIGHT_SHOULDER -> "XR_BODY_JOINT_RIGHT_SHOULDER_BD";
            case XrBodyJointBD.RIGHT_WRIST -> "XR_BODY_JOINT_RIGHT_WRIST_BD";
            case XrBodyJointBD.SPINE1 -> "XR_BODY_JOINT_SPINE1_BD";
            case XrBodyJointBD.SPINE2 -> "XR_BODY_JOINT_SPINE2_BD";
            case XrBodyJointBD.SPINE3 -> "XR_BODY_JOINT_SPINE3_BD";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrBodyJointBD() {}
}
