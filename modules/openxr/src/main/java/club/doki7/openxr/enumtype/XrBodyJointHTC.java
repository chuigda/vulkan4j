package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointHTC.html"><code>XrBodyJointHTC</code></a>
public final class XrBodyJointHTC {
    public static final int PELVIS = 0x0;
    public static final int LEFT_HIP = 0x1;
    public static final int LEFT_KNEE = 0x2;
    public static final int LEFT_ANKLE = 0x3;
    public static final int LEFT_FEET = 0x4;
    public static final int RIGHT_HIP = 0x5;
    public static final int RIGHT_KNEE = 0x6;
    public static final int RIGHT_ANKLE = 0x7;
    public static final int RIGHT_FEET = 0x8;
    public static final int WAIST = 0x9;
    public static final int SPINE_LOWER = 0xa;
    public static final int SPINE_MIDDLE = 0xb;
    public static final int SPINE_HIGH = 0xc;
    public static final int CHEST = 0xd;
    public static final int NECK = 0xe;
    public static final int HEAD = 0xf;
    public static final int LEFT_CLAVICLE = 0x10;
    public static final int LEFT_SCAPULA = 0x11;
    public static final int LEFT_ARM = 0x12;
    public static final int LEFT_ELBOW = 0x13;
    public static final int LEFT_WRIST = 0x14;
    public static final int RIGHT_CLAVICLE = 0x15;
    public static final int RIGHT_SCAPULA = 0x16;
    public static final int RIGHT_ARM = 0x17;
    public static final int RIGHT_ELBOW = 0x18;
    public static final int RIGHT_WRIST = 0x19;

    public static String explain(@EnumType(XrBodyJointHTC.class) int value) {
        return switch (value) {
            case XrBodyJointHTC.CHEST -> "XR_BODY_JOINT_CHEST_HTC";
            case XrBodyJointHTC.HEAD -> "XR_BODY_JOINT_HEAD_HTC";
            case XrBodyJointHTC.LEFT_ANKLE -> "XR_BODY_JOINT_LEFT_ANKLE_HTC";
            case XrBodyJointHTC.LEFT_ARM -> "XR_BODY_JOINT_LEFT_ARM_HTC";
            case XrBodyJointHTC.LEFT_CLAVICLE -> "XR_BODY_JOINT_LEFT_CLAVICLE_HTC";
            case XrBodyJointHTC.LEFT_ELBOW -> "XR_BODY_JOINT_LEFT_ELBOW_HTC";
            case XrBodyJointHTC.LEFT_FEET -> "XR_BODY_JOINT_LEFT_FEET_HTC";
            case XrBodyJointHTC.LEFT_HIP -> "XR_BODY_JOINT_LEFT_HIP_HTC";
            case XrBodyJointHTC.LEFT_KNEE -> "XR_BODY_JOINT_LEFT_KNEE_HTC";
            case XrBodyJointHTC.LEFT_SCAPULA -> "XR_BODY_JOINT_LEFT_SCAPULA_HTC";
            case XrBodyJointHTC.LEFT_WRIST -> "XR_BODY_JOINT_LEFT_WRIST_HTC";
            case XrBodyJointHTC.NECK -> "XR_BODY_JOINT_NECK_HTC";
            case XrBodyJointHTC.PELVIS -> "XR_BODY_JOINT_PELVIS_HTC";
            case XrBodyJointHTC.RIGHT_ANKLE -> "XR_BODY_JOINT_RIGHT_ANKLE_HTC";
            case XrBodyJointHTC.RIGHT_ARM -> "XR_BODY_JOINT_RIGHT_ARM_HTC";
            case XrBodyJointHTC.RIGHT_CLAVICLE -> "XR_BODY_JOINT_RIGHT_CLAVICLE_HTC";
            case XrBodyJointHTC.RIGHT_ELBOW -> "XR_BODY_JOINT_RIGHT_ELBOW_HTC";
            case XrBodyJointHTC.RIGHT_FEET -> "XR_BODY_JOINT_RIGHT_FEET_HTC";
            case XrBodyJointHTC.RIGHT_HIP -> "XR_BODY_JOINT_RIGHT_HIP_HTC";
            case XrBodyJointHTC.RIGHT_KNEE -> "XR_BODY_JOINT_RIGHT_KNEE_HTC";
            case XrBodyJointHTC.RIGHT_SCAPULA -> "XR_BODY_JOINT_RIGHT_SCAPULA_HTC";
            case XrBodyJointHTC.RIGHT_WRIST -> "XR_BODY_JOINT_RIGHT_WRIST_HTC";
            case XrBodyJointHTC.SPINE_HIGH -> "XR_BODY_JOINT_SPINE_HIGH_HTC";
            case XrBodyJointHTC.SPINE_LOWER -> "XR_BODY_JOINT_SPINE_LOWER_HTC";
            case XrBodyJointHTC.SPINE_MIDDLE -> "XR_BODY_JOINT_SPINE_MIDDLE_HTC";
            case XrBodyJointHTC.WAIST -> "XR_BODY_JOINT_WAIST_HTC";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrBodyJointHTC() {}
}
