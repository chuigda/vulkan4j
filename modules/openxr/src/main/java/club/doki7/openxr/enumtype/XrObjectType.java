package club.doki7.openxr.enumtype;

import club.doki7.ffm.annotation.*;

/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrObjectType.html"><code>XrObjectType</code></a>
public final class XrObjectType {
    public static final int UNKNOWN = 0x0;
    public static final int INSTANCE = 0x1;
    public static final int SESSION = 0x2;
    public static final int SWAPCHAIN = 0x3;
    public static final int SPACE = 0x4;
    public static final int ACTION_SET = 0x5;
    public static final int ACTION = 0x6;
    public static final int DEBUG_UTILS_MESSENGER_EXT = 0x3b9b1438;
    public static final int SPATIAL_ANCHOR_MSFT = 0x3b9b6258;
    public static final int SPATIAL_GRAPH_NODE_BINDING_MSFT = 0x3b9b8968;
    public static final int HAND_TRACKER_EXT = 0x3b9b9138;
    public static final int BODY_TRACKER_FB = 0x3b9bf2e0;
    public static final int SCENE_OBSERVER_MSFT = 0x3b9c44e8;
    public static final int SCENE_MSFT = 0x3b9c44e9;
    public static final int FACIAL_TRACKER_HTC = 0x3b9c6040;
    public static final int FOVEATION_PROFILE_FB = 0x3b9c8750;
    public static final int TRIANGLE_MESH_FB = 0x3b9c9308;
    public static final int PASSTHROUGH_FB = 0x3b9c96f0;
    public static final int PASSTHROUGH_LAYER_FB = 0x3b9c96f2;
    public static final int GEOMETRY_INSTANCE_FB = 0x3b9c96f4;
    public static final int MARKER_DETECTOR_ML = 0x3b9ce510;
    public static final int EXPORTED_LOCALIZATION_MAP_ML = 0x3b9ce8f8;
    public static final int SPATIAL_ANCHORS_STORAGE_ML = 0x3b9cf0c8;
    public static final int SPATIAL_ANCHOR_STORE_CONNECTION_MSFT = 0x3b9cf4b0;
    public static final int FACE_TRACKER_FB = 0x3b9ddb28;
    public static final int EYE_TRACKER_FB = 0x3b9ddf10;
    public static final int VIRTUAL_KEYBOARD_META = 0x3b9e2178;
    public static final int SPACE_USER_FB = 0x3b9e7768;
    public static final int PASSTHROUGH_COLOR_LUT_META = 0x3b9ed910;
    public static final int FACE_TRACKER2_FB = 0x3b9f2b24;
    public static final int ENVIRONMENT_DEPTH_PROVIDER_META = 0x3b9f3ab8;
    public static final int ENVIRONMENT_DEPTH_SWAPCHAIN_META = 0x3b9f3ab9;
    public static final int RENDER_MODEL_EXT = 0x3b9f5de0;
    public static final int RENDER_MODEL_ASSET_EXT = 0x3b9f5de1;
    public static final int PASSTHROUGH_HTC = 0x3b9fa048;
    public static final int BODY_TRACKER_HTC = 0x3b9fac00;
    public static final int BODY_TRACKER_BD = 0x3ba0a9e8;
    public static final int SENSE_DATA_PROVIDER_BD = 0x3ba0b988;
    public static final int SENSE_DATA_SNAPSHOT_BD = 0x3ba0b989;
    public static final int ANCHOR_BD = 0x3ba0b98a;
    public static final int PLANE_DETECTOR_EXT = 0x3ba155c8;
    public static final int WORLD_MESH_DETECTOR_ML = 0x3ba20590;
    public static final int FACIAL_EXPRESSION_CLIENT_ML = 0x3ba224d0;
    public static final int SPATIAL_ENTITY_EXT = 0x3ba614a0;
    public static final int SPATIAL_CONTEXT_EXT = 0x3ba614a1;
    public static final int SPATIAL_SNAPSHOT_EXT = 0x3ba614a2;
    public static final int SPATIAL_PERSISTENCE_CONTEXT_EXT = 0x3ba66e78;

    public static String explain(@EnumType(XrObjectType.class) int value) {
        return switch (value) {
            case XrObjectType.ACTION -> "XR_OBJECT_TYPE_ACTION";
            case XrObjectType.ACTION_SET -> "XR_OBJECT_TYPE_ACTION_SET";
            case XrObjectType.ANCHOR_BD -> "XR_OBJECT_TYPE_ANCHOR_BD";
            case XrObjectType.BODY_TRACKER_BD -> "XR_OBJECT_TYPE_BODY_TRACKER_BD";
            case XrObjectType.BODY_TRACKER_FB -> "XR_OBJECT_TYPE_BODY_TRACKER_FB";
            case XrObjectType.BODY_TRACKER_HTC -> "XR_OBJECT_TYPE_BODY_TRACKER_HTC";
            case XrObjectType.DEBUG_UTILS_MESSENGER_EXT -> "XR_OBJECT_TYPE_DEBUG_UTILS_MESSENGER_EXT";
            case XrObjectType.ENVIRONMENT_DEPTH_PROVIDER_META -> "XR_OBJECT_TYPE_ENVIRONMENT_DEPTH_PROVIDER_META";
            case XrObjectType.ENVIRONMENT_DEPTH_SWAPCHAIN_META -> "XR_OBJECT_TYPE_ENVIRONMENT_DEPTH_SWAPCHAIN_META";
            case XrObjectType.EXPORTED_LOCALIZATION_MAP_ML -> "XR_OBJECT_TYPE_EXPORTED_LOCALIZATION_MAP_ML";
            case XrObjectType.EYE_TRACKER_FB -> "XR_OBJECT_TYPE_EYE_TRACKER_FB";
            case XrObjectType.FACE_TRACKER2_FB -> "XR_OBJECT_TYPE_FACE_TRACKER2_FB";
            case XrObjectType.FACE_TRACKER_FB -> "XR_OBJECT_TYPE_FACE_TRACKER_FB";
            case XrObjectType.FACIAL_EXPRESSION_CLIENT_ML -> "XR_OBJECT_TYPE_FACIAL_EXPRESSION_CLIENT_ML";
            case XrObjectType.FACIAL_TRACKER_HTC -> "XR_OBJECT_TYPE_FACIAL_TRACKER_HTC";
            case XrObjectType.FOVEATION_PROFILE_FB -> "XR_OBJECT_TYPE_FOVEATION_PROFILE_FB";
            case XrObjectType.GEOMETRY_INSTANCE_FB -> "XR_OBJECT_TYPE_GEOMETRY_INSTANCE_FB";
            case XrObjectType.HAND_TRACKER_EXT -> "XR_OBJECT_TYPE_HAND_TRACKER_EXT";
            case XrObjectType.INSTANCE -> "XR_OBJECT_TYPE_INSTANCE";
            case XrObjectType.MARKER_DETECTOR_ML -> "XR_OBJECT_TYPE_MARKER_DETECTOR_ML";
            case XrObjectType.PASSTHROUGH_COLOR_LUT_META -> "XR_OBJECT_TYPE_PASSTHROUGH_COLOR_LUT_META";
            case XrObjectType.PASSTHROUGH_FB -> "XR_OBJECT_TYPE_PASSTHROUGH_FB";
            case XrObjectType.PASSTHROUGH_HTC -> "XR_OBJECT_TYPE_PASSTHROUGH_HTC";
            case XrObjectType.PASSTHROUGH_LAYER_FB -> "XR_OBJECT_TYPE_PASSTHROUGH_LAYER_FB";
            case XrObjectType.PLANE_DETECTOR_EXT -> "XR_OBJECT_TYPE_PLANE_DETECTOR_EXT";
            case XrObjectType.RENDER_MODEL_ASSET_EXT -> "XR_OBJECT_TYPE_RENDER_MODEL_ASSET_EXT";
            case XrObjectType.RENDER_MODEL_EXT -> "XR_OBJECT_TYPE_RENDER_MODEL_EXT";
            case XrObjectType.SCENE_MSFT -> "XR_OBJECT_TYPE_SCENE_MSFT";
            case XrObjectType.SCENE_OBSERVER_MSFT -> "XR_OBJECT_TYPE_SCENE_OBSERVER_MSFT";
            case XrObjectType.SENSE_DATA_PROVIDER_BD -> "XR_OBJECT_TYPE_SENSE_DATA_PROVIDER_BD";
            case XrObjectType.SENSE_DATA_SNAPSHOT_BD -> "XR_OBJECT_TYPE_SENSE_DATA_SNAPSHOT_BD";
            case XrObjectType.SESSION -> "XR_OBJECT_TYPE_SESSION";
            case XrObjectType.SPACE -> "XR_OBJECT_TYPE_SPACE";
            case XrObjectType.SPACE_USER_FB -> "XR_OBJECT_TYPE_SPACE_USER_FB";
            case XrObjectType.SPATIAL_ANCHORS_STORAGE_ML -> "XR_OBJECT_TYPE_SPATIAL_ANCHORS_STORAGE_ML";
            case XrObjectType.SPATIAL_ANCHOR_MSFT -> "XR_OBJECT_TYPE_SPATIAL_ANCHOR_MSFT";
            case XrObjectType.SPATIAL_ANCHOR_STORE_CONNECTION_MSFT -> "XR_OBJECT_TYPE_SPATIAL_ANCHOR_STORE_CONNECTION_MSFT";
            case XrObjectType.SPATIAL_CONTEXT_EXT -> "XR_OBJECT_TYPE_SPATIAL_CONTEXT_EXT";
            case XrObjectType.SPATIAL_ENTITY_EXT -> "XR_OBJECT_TYPE_SPATIAL_ENTITY_EXT";
            case XrObjectType.SPATIAL_GRAPH_NODE_BINDING_MSFT -> "XR_OBJECT_TYPE_SPATIAL_GRAPH_NODE_BINDING_MSFT";
            case XrObjectType.SPATIAL_PERSISTENCE_CONTEXT_EXT -> "XR_OBJECT_TYPE_SPATIAL_PERSISTENCE_CONTEXT_EXT";
            case XrObjectType.SPATIAL_SNAPSHOT_EXT -> "XR_OBJECT_TYPE_SPATIAL_SNAPSHOT_EXT";
            case XrObjectType.SWAPCHAIN -> "XR_OBJECT_TYPE_SWAPCHAIN";
            case XrObjectType.TRIANGLE_MESH_FB -> "XR_OBJECT_TYPE_TRIANGLE_MESH_FB";
            case XrObjectType.UNKNOWN -> "XR_OBJECT_TYPE_UNKNOWN";
            case XrObjectType.VIRTUAL_KEYBOARD_META -> "XR_OBJECT_TYPE_VIRTUAL_KEYBOARD_META";
            case XrObjectType.WORLD_MESH_DETECTOR_ML -> "XR_OBJECT_TYPE_WORLD_MESH_DETECTOR_ML";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private XrObjectType() {}
}
