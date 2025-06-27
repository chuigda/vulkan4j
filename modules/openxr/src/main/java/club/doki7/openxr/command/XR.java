package club.doki7.openxr.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.datatype.*;
import club.doki7.openxr.enumtype.*;
import club.doki7.openxr.handle.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

public final class XR {
    public XR(RawFunctionLoader loader) {
        SEGMENT$xrAcquireEnvironmentDepthImageMETA = loader.apply("xrAcquireEnvironmentDepthImageMETA");
        HANDLE$xrAcquireEnvironmentDepthImageMETA = RawFunctionLoader.link(SEGMENT$xrAcquireEnvironmentDepthImageMETA, Descriptors.DESCRIPTOR$xrAcquireEnvironmentDepthImageMETA);
        SEGMENT$xrAcquireSwapchainImage = loader.apply("xrAcquireSwapchainImage");
        HANDLE$xrAcquireSwapchainImage = RawFunctionLoader.link(SEGMENT$xrAcquireSwapchainImage, Descriptors.DESCRIPTOR$xrAcquireSwapchainImage);
        SEGMENT$xrAllocateWorldMeshBufferML = loader.apply("xrAllocateWorldMeshBufferML");
        HANDLE$xrAllocateWorldMeshBufferML = RawFunctionLoader.link(SEGMENT$xrAllocateWorldMeshBufferML, Descriptors.DESCRIPTOR$xrAllocateWorldMeshBufferML);
        SEGMENT$xrApplyForceFeedbackCurlMNDX = loader.apply("xrApplyForceFeedbackCurlMNDX");
        HANDLE$xrApplyForceFeedbackCurlMNDX = RawFunctionLoader.link(SEGMENT$xrApplyForceFeedbackCurlMNDX, Descriptors.DESCRIPTOR$xrApplyForceFeedbackCurlMNDX);
        SEGMENT$xrApplyFoveationHTC = loader.apply("xrApplyFoveationHTC");
        HANDLE$xrApplyFoveationHTC = RawFunctionLoader.link(SEGMENT$xrApplyFoveationHTC, Descriptors.DESCRIPTOR$xrApplyFoveationHTC);
        SEGMENT$xrApplyHapticFeedback = loader.apply("xrApplyHapticFeedback");
        HANDLE$xrApplyHapticFeedback = RawFunctionLoader.link(SEGMENT$xrApplyHapticFeedback, Descriptors.DESCRIPTOR$xrApplyHapticFeedback);
        SEGMENT$xrAttachSessionActionSets = loader.apply("xrAttachSessionActionSets");
        HANDLE$xrAttachSessionActionSets = RawFunctionLoader.link(SEGMENT$xrAttachSessionActionSets, Descriptors.DESCRIPTOR$xrAttachSessionActionSets);
        SEGMENT$xrBeginFrame = loader.apply("xrBeginFrame");
        HANDLE$xrBeginFrame = RawFunctionLoader.link(SEGMENT$xrBeginFrame, Descriptors.DESCRIPTOR$xrBeginFrame);
        SEGMENT$xrBeginPlaneDetectionEXT = loader.apply("xrBeginPlaneDetectionEXT");
        HANDLE$xrBeginPlaneDetectionEXT = RawFunctionLoader.link(SEGMENT$xrBeginPlaneDetectionEXT, Descriptors.DESCRIPTOR$xrBeginPlaneDetectionEXT);
        SEGMENT$xrBeginSession = loader.apply("xrBeginSession");
        HANDLE$xrBeginSession = RawFunctionLoader.link(SEGMENT$xrBeginSession, Descriptors.DESCRIPTOR$xrBeginSession);
        SEGMENT$xrCancelFutureEXT = loader.apply("xrCancelFutureEXT");
        HANDLE$xrCancelFutureEXT = RawFunctionLoader.link(SEGMENT$xrCancelFutureEXT, Descriptors.DESCRIPTOR$xrCancelFutureEXT);
        SEGMENT$xrCaptureSceneAsyncBD = loader.apply("xrCaptureSceneAsyncBD");
        HANDLE$xrCaptureSceneAsyncBD = RawFunctionLoader.link(SEGMENT$xrCaptureSceneAsyncBD, Descriptors.DESCRIPTOR$xrCaptureSceneAsyncBD);
        SEGMENT$xrCaptureSceneCompleteBD = loader.apply("xrCaptureSceneCompleteBD");
        HANDLE$xrCaptureSceneCompleteBD = RawFunctionLoader.link(SEGMENT$xrCaptureSceneCompleteBD, Descriptors.DESCRIPTOR$xrCaptureSceneCompleteBD);
        SEGMENT$xrChangeVirtualKeyboardTextContextMETA = loader.apply("xrChangeVirtualKeyboardTextContextMETA");
        HANDLE$xrChangeVirtualKeyboardTextContextMETA = RawFunctionLoader.link(SEGMENT$xrChangeVirtualKeyboardTextContextMETA, Descriptors.DESCRIPTOR$xrChangeVirtualKeyboardTextContextMETA);
        SEGMENT$xrClearSpatialAnchorStoreMSFT = loader.apply("xrClearSpatialAnchorStoreMSFT");
        HANDLE$xrClearSpatialAnchorStoreMSFT = RawFunctionLoader.link(SEGMENT$xrClearSpatialAnchorStoreMSFT, Descriptors.DESCRIPTOR$xrClearSpatialAnchorStoreMSFT);
        SEGMENT$xrComputeNewSceneMSFT = loader.apply("xrComputeNewSceneMSFT");
        HANDLE$xrComputeNewSceneMSFT = RawFunctionLoader.link(SEGMENT$xrComputeNewSceneMSFT, Descriptors.DESCRIPTOR$xrComputeNewSceneMSFT);
        SEGMENT$xrConvertTimeToTimespecTimeKHR = loader.apply("xrConvertTimeToTimespecTimeKHR");
        HANDLE$xrConvertTimeToTimespecTimeKHR = RawFunctionLoader.link(SEGMENT$xrConvertTimeToTimespecTimeKHR, Descriptors.DESCRIPTOR$xrConvertTimeToTimespecTimeKHR);
        SEGMENT$xrConvertTimeToWin32PerformanceCounterKHR = loader.apply("xrConvertTimeToWin32PerformanceCounterKHR");
        HANDLE$xrConvertTimeToWin32PerformanceCounterKHR = RawFunctionLoader.link(SEGMENT$xrConvertTimeToWin32PerformanceCounterKHR, Descriptors.DESCRIPTOR$xrConvertTimeToWin32PerformanceCounterKHR);
        SEGMENT$xrConvertTimespecTimeToTimeKHR = loader.apply("xrConvertTimespecTimeToTimeKHR");
        HANDLE$xrConvertTimespecTimeToTimeKHR = RawFunctionLoader.link(SEGMENT$xrConvertTimespecTimeToTimeKHR, Descriptors.DESCRIPTOR$xrConvertTimespecTimeToTimeKHR);
        SEGMENT$xrConvertWin32PerformanceCounterToTimeKHR = loader.apply("xrConvertWin32PerformanceCounterToTimeKHR");
        HANDLE$xrConvertWin32PerformanceCounterToTimeKHR = RawFunctionLoader.link(SEGMENT$xrConvertWin32PerformanceCounterToTimeKHR, Descriptors.DESCRIPTOR$xrConvertWin32PerformanceCounterToTimeKHR);
        SEGMENT$xrCreateAction = loader.apply("xrCreateAction");
        HANDLE$xrCreateAction = RawFunctionLoader.link(SEGMENT$xrCreateAction, Descriptors.DESCRIPTOR$xrCreateAction);
        SEGMENT$xrCreateActionSet = loader.apply("xrCreateActionSet");
        HANDLE$xrCreateActionSet = RawFunctionLoader.link(SEGMENT$xrCreateActionSet, Descriptors.DESCRIPTOR$xrCreateActionSet);
        SEGMENT$xrCreateActionSpace = loader.apply("xrCreateActionSpace");
        HANDLE$xrCreateActionSpace = RawFunctionLoader.link(SEGMENT$xrCreateActionSpace, Descriptors.DESCRIPTOR$xrCreateActionSpace);
        SEGMENT$xrCreateAnchorSpaceBD = loader.apply("xrCreateAnchorSpaceBD");
        HANDLE$xrCreateAnchorSpaceBD = RawFunctionLoader.link(SEGMENT$xrCreateAnchorSpaceBD, Descriptors.DESCRIPTOR$xrCreateAnchorSpaceBD);
        SEGMENT$xrCreateApiLayerInstance = loader.apply("xrCreateApiLayerInstance");
        HANDLE$xrCreateApiLayerInstance = RawFunctionLoader.link(SEGMENT$xrCreateApiLayerInstance, Descriptors.DESCRIPTOR$xrCreateApiLayerInstance);
        SEGMENT$xrCreateBodyTrackerBD = loader.apply("xrCreateBodyTrackerBD");
        HANDLE$xrCreateBodyTrackerBD = RawFunctionLoader.link(SEGMENT$xrCreateBodyTrackerBD, Descriptors.DESCRIPTOR$xrCreateBodyTrackerBD);
        SEGMENT$xrCreateBodyTrackerFB = loader.apply("xrCreateBodyTrackerFB");
        HANDLE$xrCreateBodyTrackerFB = RawFunctionLoader.link(SEGMENT$xrCreateBodyTrackerFB, Descriptors.DESCRIPTOR$xrCreateBodyTrackerFB);
        SEGMENT$xrCreateBodyTrackerHTC = loader.apply("xrCreateBodyTrackerHTC");
        HANDLE$xrCreateBodyTrackerHTC = RawFunctionLoader.link(SEGMENT$xrCreateBodyTrackerHTC, Descriptors.DESCRIPTOR$xrCreateBodyTrackerHTC);
        SEGMENT$xrCreateDebugUtilsMessengerEXT = loader.apply("xrCreateDebugUtilsMessengerEXT");
        HANDLE$xrCreateDebugUtilsMessengerEXT = RawFunctionLoader.link(SEGMENT$xrCreateDebugUtilsMessengerEXT, Descriptors.DESCRIPTOR$xrCreateDebugUtilsMessengerEXT);
        SEGMENT$xrCreateEnvironmentDepthProviderMETA = loader.apply("xrCreateEnvironmentDepthProviderMETA");
        HANDLE$xrCreateEnvironmentDepthProviderMETA = RawFunctionLoader.link(SEGMENT$xrCreateEnvironmentDepthProviderMETA, Descriptors.DESCRIPTOR$xrCreateEnvironmentDepthProviderMETA);
        SEGMENT$xrCreateEnvironmentDepthSwapchainMETA = loader.apply("xrCreateEnvironmentDepthSwapchainMETA");
        HANDLE$xrCreateEnvironmentDepthSwapchainMETA = RawFunctionLoader.link(SEGMENT$xrCreateEnvironmentDepthSwapchainMETA, Descriptors.DESCRIPTOR$xrCreateEnvironmentDepthSwapchainMETA);
        SEGMENT$xrCreateExportedLocalizationMapML = loader.apply("xrCreateExportedLocalizationMapML");
        HANDLE$xrCreateExportedLocalizationMapML = RawFunctionLoader.link(SEGMENT$xrCreateExportedLocalizationMapML, Descriptors.DESCRIPTOR$xrCreateExportedLocalizationMapML);
        SEGMENT$xrCreateEyeTrackerFB = loader.apply("xrCreateEyeTrackerFB");
        HANDLE$xrCreateEyeTrackerFB = RawFunctionLoader.link(SEGMENT$xrCreateEyeTrackerFB, Descriptors.DESCRIPTOR$xrCreateEyeTrackerFB);
        SEGMENT$xrCreateFaceTracker2FB = loader.apply("xrCreateFaceTracker2FB");
        HANDLE$xrCreateFaceTracker2FB = RawFunctionLoader.link(SEGMENT$xrCreateFaceTracker2FB, Descriptors.DESCRIPTOR$xrCreateFaceTracker2FB);
        SEGMENT$xrCreateFaceTrackerFB = loader.apply("xrCreateFaceTrackerFB");
        HANDLE$xrCreateFaceTrackerFB = RawFunctionLoader.link(SEGMENT$xrCreateFaceTrackerFB, Descriptors.DESCRIPTOR$xrCreateFaceTrackerFB);
        SEGMENT$xrCreateFacialExpressionClientML = loader.apply("xrCreateFacialExpressionClientML");
        HANDLE$xrCreateFacialExpressionClientML = RawFunctionLoader.link(SEGMENT$xrCreateFacialExpressionClientML, Descriptors.DESCRIPTOR$xrCreateFacialExpressionClientML);
        SEGMENT$xrCreateFacialTrackerHTC = loader.apply("xrCreateFacialTrackerHTC");
        HANDLE$xrCreateFacialTrackerHTC = RawFunctionLoader.link(SEGMENT$xrCreateFacialTrackerHTC, Descriptors.DESCRIPTOR$xrCreateFacialTrackerHTC);
        SEGMENT$xrCreateFoveationProfileFB = loader.apply("xrCreateFoveationProfileFB");
        HANDLE$xrCreateFoveationProfileFB = RawFunctionLoader.link(SEGMENT$xrCreateFoveationProfileFB, Descriptors.DESCRIPTOR$xrCreateFoveationProfileFB);
        SEGMENT$xrCreateGeometryInstanceFB = loader.apply("xrCreateGeometryInstanceFB");
        HANDLE$xrCreateGeometryInstanceFB = RawFunctionLoader.link(SEGMENT$xrCreateGeometryInstanceFB, Descriptors.DESCRIPTOR$xrCreateGeometryInstanceFB);
        SEGMENT$xrCreateHandMeshSpaceMSFT = loader.apply("xrCreateHandMeshSpaceMSFT");
        HANDLE$xrCreateHandMeshSpaceMSFT = RawFunctionLoader.link(SEGMENT$xrCreateHandMeshSpaceMSFT, Descriptors.DESCRIPTOR$xrCreateHandMeshSpaceMSFT);
        SEGMENT$xrCreateHandTrackerEXT = loader.apply("xrCreateHandTrackerEXT");
        HANDLE$xrCreateHandTrackerEXT = RawFunctionLoader.link(SEGMENT$xrCreateHandTrackerEXT, Descriptors.DESCRIPTOR$xrCreateHandTrackerEXT);
        SEGMENT$xrCreateInstance = loader.apply("xrCreateInstance");
        HANDLE$xrCreateInstance = RawFunctionLoader.link(SEGMENT$xrCreateInstance, Descriptors.DESCRIPTOR$xrCreateInstance);
        SEGMENT$xrCreateKeyboardSpaceFB = loader.apply("xrCreateKeyboardSpaceFB");
        HANDLE$xrCreateKeyboardSpaceFB = RawFunctionLoader.link(SEGMENT$xrCreateKeyboardSpaceFB, Descriptors.DESCRIPTOR$xrCreateKeyboardSpaceFB);
        SEGMENT$xrCreateMarkerDetectorML = loader.apply("xrCreateMarkerDetectorML");
        HANDLE$xrCreateMarkerDetectorML = RawFunctionLoader.link(SEGMENT$xrCreateMarkerDetectorML, Descriptors.DESCRIPTOR$xrCreateMarkerDetectorML);
        SEGMENT$xrCreateMarkerSpaceML = loader.apply("xrCreateMarkerSpaceML");
        HANDLE$xrCreateMarkerSpaceML = RawFunctionLoader.link(SEGMENT$xrCreateMarkerSpaceML, Descriptors.DESCRIPTOR$xrCreateMarkerSpaceML);
        SEGMENT$xrCreateMarkerSpaceVARJO = loader.apply("xrCreateMarkerSpaceVARJO");
        HANDLE$xrCreateMarkerSpaceVARJO = RawFunctionLoader.link(SEGMENT$xrCreateMarkerSpaceVARJO, Descriptors.DESCRIPTOR$xrCreateMarkerSpaceVARJO);
        SEGMENT$xrCreatePassthroughColorLutMETA = loader.apply("xrCreatePassthroughColorLutMETA");
        HANDLE$xrCreatePassthroughColorLutMETA = RawFunctionLoader.link(SEGMENT$xrCreatePassthroughColorLutMETA, Descriptors.DESCRIPTOR$xrCreatePassthroughColorLutMETA);
        SEGMENT$xrCreatePassthroughFB = loader.apply("xrCreatePassthroughFB");
        HANDLE$xrCreatePassthroughFB = RawFunctionLoader.link(SEGMENT$xrCreatePassthroughFB, Descriptors.DESCRIPTOR$xrCreatePassthroughFB);
        SEGMENT$xrCreatePassthroughHTC = loader.apply("xrCreatePassthroughHTC");
        HANDLE$xrCreatePassthroughHTC = RawFunctionLoader.link(SEGMENT$xrCreatePassthroughHTC, Descriptors.DESCRIPTOR$xrCreatePassthroughHTC);
        SEGMENT$xrCreatePassthroughLayerFB = loader.apply("xrCreatePassthroughLayerFB");
        HANDLE$xrCreatePassthroughLayerFB = RawFunctionLoader.link(SEGMENT$xrCreatePassthroughLayerFB, Descriptors.DESCRIPTOR$xrCreatePassthroughLayerFB);
        SEGMENT$xrCreatePlaneDetectorEXT = loader.apply("xrCreatePlaneDetectorEXT");
        HANDLE$xrCreatePlaneDetectorEXT = RawFunctionLoader.link(SEGMENT$xrCreatePlaneDetectorEXT, Descriptors.DESCRIPTOR$xrCreatePlaneDetectorEXT);
        SEGMENT$xrCreateReferenceSpace = loader.apply("xrCreateReferenceSpace");
        HANDLE$xrCreateReferenceSpace = RawFunctionLoader.link(SEGMENT$xrCreateReferenceSpace, Descriptors.DESCRIPTOR$xrCreateReferenceSpace);
        SEGMENT$xrCreateRenderModelAssetEXT = loader.apply("xrCreateRenderModelAssetEXT");
        HANDLE$xrCreateRenderModelAssetEXT = RawFunctionLoader.link(SEGMENT$xrCreateRenderModelAssetEXT, Descriptors.DESCRIPTOR$xrCreateRenderModelAssetEXT);
        SEGMENT$xrCreateRenderModelEXT = loader.apply("xrCreateRenderModelEXT");
        HANDLE$xrCreateRenderModelEXT = RawFunctionLoader.link(SEGMENT$xrCreateRenderModelEXT, Descriptors.DESCRIPTOR$xrCreateRenderModelEXT);
        SEGMENT$xrCreateRenderModelSpaceEXT = loader.apply("xrCreateRenderModelSpaceEXT");
        HANDLE$xrCreateRenderModelSpaceEXT = RawFunctionLoader.link(SEGMENT$xrCreateRenderModelSpaceEXT, Descriptors.DESCRIPTOR$xrCreateRenderModelSpaceEXT);
        SEGMENT$xrCreateSceneMSFT = loader.apply("xrCreateSceneMSFT");
        HANDLE$xrCreateSceneMSFT = RawFunctionLoader.link(SEGMENT$xrCreateSceneMSFT, Descriptors.DESCRIPTOR$xrCreateSceneMSFT);
        SEGMENT$xrCreateSceneObserverMSFT = loader.apply("xrCreateSceneObserverMSFT");
        HANDLE$xrCreateSceneObserverMSFT = RawFunctionLoader.link(SEGMENT$xrCreateSceneObserverMSFT, Descriptors.DESCRIPTOR$xrCreateSceneObserverMSFT);
        SEGMENT$xrCreateSenseDataProviderBD = loader.apply("xrCreateSenseDataProviderBD");
        HANDLE$xrCreateSenseDataProviderBD = RawFunctionLoader.link(SEGMENT$xrCreateSenseDataProviderBD, Descriptors.DESCRIPTOR$xrCreateSenseDataProviderBD);
        SEGMENT$xrCreateSession = loader.apply("xrCreateSession");
        HANDLE$xrCreateSession = RawFunctionLoader.link(SEGMENT$xrCreateSession, Descriptors.DESCRIPTOR$xrCreateSession);
        SEGMENT$xrCreateSpaceFromCoordinateFrameUIDML = loader.apply("xrCreateSpaceFromCoordinateFrameUIDML");
        HANDLE$xrCreateSpaceFromCoordinateFrameUIDML = RawFunctionLoader.link(SEGMENT$xrCreateSpaceFromCoordinateFrameUIDML, Descriptors.DESCRIPTOR$xrCreateSpaceFromCoordinateFrameUIDML);
        SEGMENT$xrCreateSpaceUserFB = loader.apply("xrCreateSpaceUserFB");
        HANDLE$xrCreateSpaceUserFB = RawFunctionLoader.link(SEGMENT$xrCreateSpaceUserFB, Descriptors.DESCRIPTOR$xrCreateSpaceUserFB);
        SEGMENT$xrCreateSpatialAnchorAsyncBD = loader.apply("xrCreateSpatialAnchorAsyncBD");
        HANDLE$xrCreateSpatialAnchorAsyncBD = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorAsyncBD, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorAsyncBD);
        SEGMENT$xrCreateSpatialAnchorCompleteBD = loader.apply("xrCreateSpatialAnchorCompleteBD");
        HANDLE$xrCreateSpatialAnchorCompleteBD = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorCompleteBD, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorCompleteBD);
        SEGMENT$xrCreateSpatialAnchorEXT = loader.apply("xrCreateSpatialAnchorEXT");
        HANDLE$xrCreateSpatialAnchorEXT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorEXT, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorEXT);
        SEGMENT$xrCreateSpatialAnchorFB = loader.apply("xrCreateSpatialAnchorFB");
        HANDLE$xrCreateSpatialAnchorFB = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorFB, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorFB);
        SEGMENT$xrCreateSpatialAnchorFromPerceptionAnchorMSFT = loader.apply("xrCreateSpatialAnchorFromPerceptionAnchorMSFT");
        HANDLE$xrCreateSpatialAnchorFromPerceptionAnchorMSFT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorFromPerceptionAnchorMSFT, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorFromPerceptionAnchorMSFT);
        SEGMENT$xrCreateSpatialAnchorFromPersistedNameMSFT = loader.apply("xrCreateSpatialAnchorFromPersistedNameMSFT");
        HANDLE$xrCreateSpatialAnchorFromPersistedNameMSFT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorFromPersistedNameMSFT, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorFromPersistedNameMSFT);
        SEGMENT$xrCreateSpatialAnchorHTC = loader.apply("xrCreateSpatialAnchorHTC");
        HANDLE$xrCreateSpatialAnchorHTC = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorHTC, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorHTC);
        SEGMENT$xrCreateSpatialAnchorMSFT = loader.apply("xrCreateSpatialAnchorMSFT");
        HANDLE$xrCreateSpatialAnchorMSFT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorMSFT, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorMSFT);
        SEGMENT$xrCreateSpatialAnchorSpaceMSFT = loader.apply("xrCreateSpatialAnchorSpaceMSFT");
        HANDLE$xrCreateSpatialAnchorSpaceMSFT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorSpaceMSFT, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorSpaceMSFT);
        SEGMENT$xrCreateSpatialAnchorStoreConnectionMSFT = loader.apply("xrCreateSpatialAnchorStoreConnectionMSFT");
        HANDLE$xrCreateSpatialAnchorStoreConnectionMSFT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorStoreConnectionMSFT, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorStoreConnectionMSFT);
        SEGMENT$xrCreateSpatialAnchorsAsyncML = loader.apply("xrCreateSpatialAnchorsAsyncML");
        HANDLE$xrCreateSpatialAnchorsAsyncML = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorsAsyncML, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorsAsyncML);
        SEGMENT$xrCreateSpatialAnchorsCompleteML = loader.apply("xrCreateSpatialAnchorsCompleteML");
        HANDLE$xrCreateSpatialAnchorsCompleteML = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorsCompleteML, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorsCompleteML);
        SEGMENT$xrCreateSpatialAnchorsStorageML = loader.apply("xrCreateSpatialAnchorsStorageML");
        HANDLE$xrCreateSpatialAnchorsStorageML = RawFunctionLoader.link(SEGMENT$xrCreateSpatialAnchorsStorageML, Descriptors.DESCRIPTOR$xrCreateSpatialAnchorsStorageML);
        SEGMENT$xrCreateSpatialContextAsyncEXT = loader.apply("xrCreateSpatialContextAsyncEXT");
        HANDLE$xrCreateSpatialContextAsyncEXT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialContextAsyncEXT, Descriptors.DESCRIPTOR$xrCreateSpatialContextAsyncEXT);
        SEGMENT$xrCreateSpatialContextCompleteEXT = loader.apply("xrCreateSpatialContextCompleteEXT");
        HANDLE$xrCreateSpatialContextCompleteEXT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialContextCompleteEXT, Descriptors.DESCRIPTOR$xrCreateSpatialContextCompleteEXT);
        SEGMENT$xrCreateSpatialDiscoverySnapshotAsyncEXT = loader.apply("xrCreateSpatialDiscoverySnapshotAsyncEXT");
        HANDLE$xrCreateSpatialDiscoverySnapshotAsyncEXT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialDiscoverySnapshotAsyncEXT, Descriptors.DESCRIPTOR$xrCreateSpatialDiscoverySnapshotAsyncEXT);
        SEGMENT$xrCreateSpatialDiscoverySnapshotCompleteEXT = loader.apply("xrCreateSpatialDiscoverySnapshotCompleteEXT");
        HANDLE$xrCreateSpatialDiscoverySnapshotCompleteEXT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialDiscoverySnapshotCompleteEXT, Descriptors.DESCRIPTOR$xrCreateSpatialDiscoverySnapshotCompleteEXT);
        SEGMENT$xrCreateSpatialEntityAnchorBD = loader.apply("xrCreateSpatialEntityAnchorBD");
        HANDLE$xrCreateSpatialEntityAnchorBD = RawFunctionLoader.link(SEGMENT$xrCreateSpatialEntityAnchorBD, Descriptors.DESCRIPTOR$xrCreateSpatialEntityAnchorBD);
        SEGMENT$xrCreateSpatialEntityFromIdEXT = loader.apply("xrCreateSpatialEntityFromIdEXT");
        HANDLE$xrCreateSpatialEntityFromIdEXT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialEntityFromIdEXT, Descriptors.DESCRIPTOR$xrCreateSpatialEntityFromIdEXT);
        SEGMENT$xrCreateSpatialGraphNodeSpaceMSFT = loader.apply("xrCreateSpatialGraphNodeSpaceMSFT");
        HANDLE$xrCreateSpatialGraphNodeSpaceMSFT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialGraphNodeSpaceMSFT, Descriptors.DESCRIPTOR$xrCreateSpatialGraphNodeSpaceMSFT);
        SEGMENT$xrCreateSpatialPersistenceContextAsyncEXT = loader.apply("xrCreateSpatialPersistenceContextAsyncEXT");
        HANDLE$xrCreateSpatialPersistenceContextAsyncEXT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialPersistenceContextAsyncEXT, Descriptors.DESCRIPTOR$xrCreateSpatialPersistenceContextAsyncEXT);
        SEGMENT$xrCreateSpatialPersistenceContextCompleteEXT = loader.apply("xrCreateSpatialPersistenceContextCompleteEXT");
        HANDLE$xrCreateSpatialPersistenceContextCompleteEXT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialPersistenceContextCompleteEXT, Descriptors.DESCRIPTOR$xrCreateSpatialPersistenceContextCompleteEXT);
        SEGMENT$xrCreateSpatialUpdateSnapshotEXT = loader.apply("xrCreateSpatialUpdateSnapshotEXT");
        HANDLE$xrCreateSpatialUpdateSnapshotEXT = RawFunctionLoader.link(SEGMENT$xrCreateSpatialUpdateSnapshotEXT, Descriptors.DESCRIPTOR$xrCreateSpatialUpdateSnapshotEXT);
        SEGMENT$xrCreateSwapchain = loader.apply("xrCreateSwapchain");
        HANDLE$xrCreateSwapchain = RawFunctionLoader.link(SEGMENT$xrCreateSwapchain, Descriptors.DESCRIPTOR$xrCreateSwapchain);
        SEGMENT$xrCreateSwapchainAndroidSurfaceKHR = loader.apply("xrCreateSwapchainAndroidSurfaceKHR");
        HANDLE$xrCreateSwapchainAndroidSurfaceKHR = RawFunctionLoader.link(SEGMENT$xrCreateSwapchainAndroidSurfaceKHR, Descriptors.DESCRIPTOR$xrCreateSwapchainAndroidSurfaceKHR);
        SEGMENT$xrCreateTriangleMeshFB = loader.apply("xrCreateTriangleMeshFB");
        HANDLE$xrCreateTriangleMeshFB = RawFunctionLoader.link(SEGMENT$xrCreateTriangleMeshFB, Descriptors.DESCRIPTOR$xrCreateTriangleMeshFB);
        SEGMENT$xrCreateVirtualKeyboardMETA = loader.apply("xrCreateVirtualKeyboardMETA");
        HANDLE$xrCreateVirtualKeyboardMETA = RawFunctionLoader.link(SEGMENT$xrCreateVirtualKeyboardMETA, Descriptors.DESCRIPTOR$xrCreateVirtualKeyboardMETA);
        SEGMENT$xrCreateVirtualKeyboardSpaceMETA = loader.apply("xrCreateVirtualKeyboardSpaceMETA");
        HANDLE$xrCreateVirtualKeyboardSpaceMETA = RawFunctionLoader.link(SEGMENT$xrCreateVirtualKeyboardSpaceMETA, Descriptors.DESCRIPTOR$xrCreateVirtualKeyboardSpaceMETA);
        SEGMENT$xrCreateVulkanDeviceKHR = loader.apply("xrCreateVulkanDeviceKHR");
        HANDLE$xrCreateVulkanDeviceKHR = RawFunctionLoader.link(SEGMENT$xrCreateVulkanDeviceKHR, Descriptors.DESCRIPTOR$xrCreateVulkanDeviceKHR);
        SEGMENT$xrCreateVulkanInstanceKHR = loader.apply("xrCreateVulkanInstanceKHR");
        HANDLE$xrCreateVulkanInstanceKHR = RawFunctionLoader.link(SEGMENT$xrCreateVulkanInstanceKHR, Descriptors.DESCRIPTOR$xrCreateVulkanInstanceKHR);
        SEGMENT$xrCreateWorldMeshDetectorML = loader.apply("xrCreateWorldMeshDetectorML");
        HANDLE$xrCreateWorldMeshDetectorML = RawFunctionLoader.link(SEGMENT$xrCreateWorldMeshDetectorML, Descriptors.DESCRIPTOR$xrCreateWorldMeshDetectorML);
        SEGMENT$xrDeleteSpatialAnchorsAsyncML = loader.apply("xrDeleteSpatialAnchorsAsyncML");
        HANDLE$xrDeleteSpatialAnchorsAsyncML = RawFunctionLoader.link(SEGMENT$xrDeleteSpatialAnchorsAsyncML, Descriptors.DESCRIPTOR$xrDeleteSpatialAnchorsAsyncML);
        SEGMENT$xrDeleteSpatialAnchorsCompleteML = loader.apply("xrDeleteSpatialAnchorsCompleteML");
        HANDLE$xrDeleteSpatialAnchorsCompleteML = RawFunctionLoader.link(SEGMENT$xrDeleteSpatialAnchorsCompleteML, Descriptors.DESCRIPTOR$xrDeleteSpatialAnchorsCompleteML);
        SEGMENT$xrDeserializeSceneMSFT = loader.apply("xrDeserializeSceneMSFT");
        HANDLE$xrDeserializeSceneMSFT = RawFunctionLoader.link(SEGMENT$xrDeserializeSceneMSFT, Descriptors.DESCRIPTOR$xrDeserializeSceneMSFT);
        SEGMENT$xrDestroyAction = loader.apply("xrDestroyAction");
        HANDLE$xrDestroyAction = RawFunctionLoader.link(SEGMENT$xrDestroyAction, Descriptors.DESCRIPTOR$xrDestroyAction);
        SEGMENT$xrDestroyActionSet = loader.apply("xrDestroyActionSet");
        HANDLE$xrDestroyActionSet = RawFunctionLoader.link(SEGMENT$xrDestroyActionSet, Descriptors.DESCRIPTOR$xrDestroyActionSet);
        SEGMENT$xrDestroyAnchorBD = loader.apply("xrDestroyAnchorBD");
        HANDLE$xrDestroyAnchorBD = RawFunctionLoader.link(SEGMENT$xrDestroyAnchorBD, Descriptors.DESCRIPTOR$xrDestroyAnchorBD);
        SEGMENT$xrDestroyBodyTrackerBD = loader.apply("xrDestroyBodyTrackerBD");
        HANDLE$xrDestroyBodyTrackerBD = RawFunctionLoader.link(SEGMENT$xrDestroyBodyTrackerBD, Descriptors.DESCRIPTOR$xrDestroyBodyTrackerBD);
        SEGMENT$xrDestroyBodyTrackerFB = loader.apply("xrDestroyBodyTrackerFB");
        HANDLE$xrDestroyBodyTrackerFB = RawFunctionLoader.link(SEGMENT$xrDestroyBodyTrackerFB, Descriptors.DESCRIPTOR$xrDestroyBodyTrackerFB);
        SEGMENT$xrDestroyBodyTrackerHTC = loader.apply("xrDestroyBodyTrackerHTC");
        HANDLE$xrDestroyBodyTrackerHTC = RawFunctionLoader.link(SEGMENT$xrDestroyBodyTrackerHTC, Descriptors.DESCRIPTOR$xrDestroyBodyTrackerHTC);
        SEGMENT$xrDestroyDebugUtilsMessengerEXT = loader.apply("xrDestroyDebugUtilsMessengerEXT");
        HANDLE$xrDestroyDebugUtilsMessengerEXT = RawFunctionLoader.link(SEGMENT$xrDestroyDebugUtilsMessengerEXT, Descriptors.DESCRIPTOR$xrDestroyDebugUtilsMessengerEXT);
        SEGMENT$xrDestroyEnvironmentDepthProviderMETA = loader.apply("xrDestroyEnvironmentDepthProviderMETA");
        HANDLE$xrDestroyEnvironmentDepthProviderMETA = RawFunctionLoader.link(SEGMENT$xrDestroyEnvironmentDepthProviderMETA, Descriptors.DESCRIPTOR$xrDestroyEnvironmentDepthProviderMETA);
        SEGMENT$xrDestroyEnvironmentDepthSwapchainMETA = loader.apply("xrDestroyEnvironmentDepthSwapchainMETA");
        HANDLE$xrDestroyEnvironmentDepthSwapchainMETA = RawFunctionLoader.link(SEGMENT$xrDestroyEnvironmentDepthSwapchainMETA, Descriptors.DESCRIPTOR$xrDestroyEnvironmentDepthSwapchainMETA);
        SEGMENT$xrDestroyExportedLocalizationMapML = loader.apply("xrDestroyExportedLocalizationMapML");
        HANDLE$xrDestroyExportedLocalizationMapML = RawFunctionLoader.link(SEGMENT$xrDestroyExportedLocalizationMapML, Descriptors.DESCRIPTOR$xrDestroyExportedLocalizationMapML);
        SEGMENT$xrDestroyEyeTrackerFB = loader.apply("xrDestroyEyeTrackerFB");
        HANDLE$xrDestroyEyeTrackerFB = RawFunctionLoader.link(SEGMENT$xrDestroyEyeTrackerFB, Descriptors.DESCRIPTOR$xrDestroyEyeTrackerFB);
        SEGMENT$xrDestroyFaceTracker2FB = loader.apply("xrDestroyFaceTracker2FB");
        HANDLE$xrDestroyFaceTracker2FB = RawFunctionLoader.link(SEGMENT$xrDestroyFaceTracker2FB, Descriptors.DESCRIPTOR$xrDestroyFaceTracker2FB);
        SEGMENT$xrDestroyFaceTrackerFB = loader.apply("xrDestroyFaceTrackerFB");
        HANDLE$xrDestroyFaceTrackerFB = RawFunctionLoader.link(SEGMENT$xrDestroyFaceTrackerFB, Descriptors.DESCRIPTOR$xrDestroyFaceTrackerFB);
        SEGMENT$xrDestroyFacialExpressionClientML = loader.apply("xrDestroyFacialExpressionClientML");
        HANDLE$xrDestroyFacialExpressionClientML = RawFunctionLoader.link(SEGMENT$xrDestroyFacialExpressionClientML, Descriptors.DESCRIPTOR$xrDestroyFacialExpressionClientML);
        SEGMENT$xrDestroyFacialTrackerHTC = loader.apply("xrDestroyFacialTrackerHTC");
        HANDLE$xrDestroyFacialTrackerHTC = RawFunctionLoader.link(SEGMENT$xrDestroyFacialTrackerHTC, Descriptors.DESCRIPTOR$xrDestroyFacialTrackerHTC);
        SEGMENT$xrDestroyFoveationProfileFB = loader.apply("xrDestroyFoveationProfileFB");
        HANDLE$xrDestroyFoveationProfileFB = RawFunctionLoader.link(SEGMENT$xrDestroyFoveationProfileFB, Descriptors.DESCRIPTOR$xrDestroyFoveationProfileFB);
        SEGMENT$xrDestroyGeometryInstanceFB = loader.apply("xrDestroyGeometryInstanceFB");
        HANDLE$xrDestroyGeometryInstanceFB = RawFunctionLoader.link(SEGMENT$xrDestroyGeometryInstanceFB, Descriptors.DESCRIPTOR$xrDestroyGeometryInstanceFB);
        SEGMENT$xrDestroyHandTrackerEXT = loader.apply("xrDestroyHandTrackerEXT");
        HANDLE$xrDestroyHandTrackerEXT = RawFunctionLoader.link(SEGMENT$xrDestroyHandTrackerEXT, Descriptors.DESCRIPTOR$xrDestroyHandTrackerEXT);
        SEGMENT$xrDestroyInstance = loader.apply("xrDestroyInstance");
        HANDLE$xrDestroyInstance = RawFunctionLoader.link(SEGMENT$xrDestroyInstance, Descriptors.DESCRIPTOR$xrDestroyInstance);
        SEGMENT$xrDestroyMarkerDetectorML = loader.apply("xrDestroyMarkerDetectorML");
        HANDLE$xrDestroyMarkerDetectorML = RawFunctionLoader.link(SEGMENT$xrDestroyMarkerDetectorML, Descriptors.DESCRIPTOR$xrDestroyMarkerDetectorML);
        SEGMENT$xrDestroyPassthroughColorLutMETA = loader.apply("xrDestroyPassthroughColorLutMETA");
        HANDLE$xrDestroyPassthroughColorLutMETA = RawFunctionLoader.link(SEGMENT$xrDestroyPassthroughColorLutMETA, Descriptors.DESCRIPTOR$xrDestroyPassthroughColorLutMETA);
        SEGMENT$xrDestroyPassthroughFB = loader.apply("xrDestroyPassthroughFB");
        HANDLE$xrDestroyPassthroughFB = RawFunctionLoader.link(SEGMENT$xrDestroyPassthroughFB, Descriptors.DESCRIPTOR$xrDestroyPassthroughFB);
        SEGMENT$xrDestroyPassthroughHTC = loader.apply("xrDestroyPassthroughHTC");
        HANDLE$xrDestroyPassthroughHTC = RawFunctionLoader.link(SEGMENT$xrDestroyPassthroughHTC, Descriptors.DESCRIPTOR$xrDestroyPassthroughHTC);
        SEGMENT$xrDestroyPassthroughLayerFB = loader.apply("xrDestroyPassthroughLayerFB");
        HANDLE$xrDestroyPassthroughLayerFB = RawFunctionLoader.link(SEGMENT$xrDestroyPassthroughLayerFB, Descriptors.DESCRIPTOR$xrDestroyPassthroughLayerFB);
        SEGMENT$xrDestroyPlaneDetectorEXT = loader.apply("xrDestroyPlaneDetectorEXT");
        HANDLE$xrDestroyPlaneDetectorEXT = RawFunctionLoader.link(SEGMENT$xrDestroyPlaneDetectorEXT, Descriptors.DESCRIPTOR$xrDestroyPlaneDetectorEXT);
        SEGMENT$xrDestroyRenderModelAssetEXT = loader.apply("xrDestroyRenderModelAssetEXT");
        HANDLE$xrDestroyRenderModelAssetEXT = RawFunctionLoader.link(SEGMENT$xrDestroyRenderModelAssetEXT, Descriptors.DESCRIPTOR$xrDestroyRenderModelAssetEXT);
        SEGMENT$xrDestroyRenderModelEXT = loader.apply("xrDestroyRenderModelEXT");
        HANDLE$xrDestroyRenderModelEXT = RawFunctionLoader.link(SEGMENT$xrDestroyRenderModelEXT, Descriptors.DESCRIPTOR$xrDestroyRenderModelEXT);
        SEGMENT$xrDestroySceneMSFT = loader.apply("xrDestroySceneMSFT");
        HANDLE$xrDestroySceneMSFT = RawFunctionLoader.link(SEGMENT$xrDestroySceneMSFT, Descriptors.DESCRIPTOR$xrDestroySceneMSFT);
        SEGMENT$xrDestroySceneObserverMSFT = loader.apply("xrDestroySceneObserverMSFT");
        HANDLE$xrDestroySceneObserverMSFT = RawFunctionLoader.link(SEGMENT$xrDestroySceneObserverMSFT, Descriptors.DESCRIPTOR$xrDestroySceneObserverMSFT);
        SEGMENT$xrDestroySenseDataProviderBD = loader.apply("xrDestroySenseDataProviderBD");
        HANDLE$xrDestroySenseDataProviderBD = RawFunctionLoader.link(SEGMENT$xrDestroySenseDataProviderBD, Descriptors.DESCRIPTOR$xrDestroySenseDataProviderBD);
        SEGMENT$xrDestroySenseDataSnapshotBD = loader.apply("xrDestroySenseDataSnapshotBD");
        HANDLE$xrDestroySenseDataSnapshotBD = RawFunctionLoader.link(SEGMENT$xrDestroySenseDataSnapshotBD, Descriptors.DESCRIPTOR$xrDestroySenseDataSnapshotBD);
        SEGMENT$xrDestroySession = loader.apply("xrDestroySession");
        HANDLE$xrDestroySession = RawFunctionLoader.link(SEGMENT$xrDestroySession, Descriptors.DESCRIPTOR$xrDestroySession);
        SEGMENT$xrDestroySpace = loader.apply("xrDestroySpace");
        HANDLE$xrDestroySpace = RawFunctionLoader.link(SEGMENT$xrDestroySpace, Descriptors.DESCRIPTOR$xrDestroySpace);
        SEGMENT$xrDestroySpaceUserFB = loader.apply("xrDestroySpaceUserFB");
        HANDLE$xrDestroySpaceUserFB = RawFunctionLoader.link(SEGMENT$xrDestroySpaceUserFB, Descriptors.DESCRIPTOR$xrDestroySpaceUserFB);
        SEGMENT$xrDestroySpatialAnchorMSFT = loader.apply("xrDestroySpatialAnchorMSFT");
        HANDLE$xrDestroySpatialAnchorMSFT = RawFunctionLoader.link(SEGMENT$xrDestroySpatialAnchorMSFT, Descriptors.DESCRIPTOR$xrDestroySpatialAnchorMSFT);
        SEGMENT$xrDestroySpatialAnchorStoreConnectionMSFT = loader.apply("xrDestroySpatialAnchorStoreConnectionMSFT");
        HANDLE$xrDestroySpatialAnchorStoreConnectionMSFT = RawFunctionLoader.link(SEGMENT$xrDestroySpatialAnchorStoreConnectionMSFT, Descriptors.DESCRIPTOR$xrDestroySpatialAnchorStoreConnectionMSFT);
        SEGMENT$xrDestroySpatialAnchorsStorageML = loader.apply("xrDestroySpatialAnchorsStorageML");
        HANDLE$xrDestroySpatialAnchorsStorageML = RawFunctionLoader.link(SEGMENT$xrDestroySpatialAnchorsStorageML, Descriptors.DESCRIPTOR$xrDestroySpatialAnchorsStorageML);
        SEGMENT$xrDestroySpatialContextEXT = loader.apply("xrDestroySpatialContextEXT");
        HANDLE$xrDestroySpatialContextEXT = RawFunctionLoader.link(SEGMENT$xrDestroySpatialContextEXT, Descriptors.DESCRIPTOR$xrDestroySpatialContextEXT);
        SEGMENT$xrDestroySpatialEntityEXT = loader.apply("xrDestroySpatialEntityEXT");
        HANDLE$xrDestroySpatialEntityEXT = RawFunctionLoader.link(SEGMENT$xrDestroySpatialEntityEXT, Descriptors.DESCRIPTOR$xrDestroySpatialEntityEXT);
        SEGMENT$xrDestroySpatialGraphNodeBindingMSFT = loader.apply("xrDestroySpatialGraphNodeBindingMSFT");
        HANDLE$xrDestroySpatialGraphNodeBindingMSFT = RawFunctionLoader.link(SEGMENT$xrDestroySpatialGraphNodeBindingMSFT, Descriptors.DESCRIPTOR$xrDestroySpatialGraphNodeBindingMSFT);
        SEGMENT$xrDestroySpatialPersistenceContextEXT = loader.apply("xrDestroySpatialPersistenceContextEXT");
        HANDLE$xrDestroySpatialPersistenceContextEXT = RawFunctionLoader.link(SEGMENT$xrDestroySpatialPersistenceContextEXT, Descriptors.DESCRIPTOR$xrDestroySpatialPersistenceContextEXT);
        SEGMENT$xrDestroySpatialSnapshotEXT = loader.apply("xrDestroySpatialSnapshotEXT");
        HANDLE$xrDestroySpatialSnapshotEXT = RawFunctionLoader.link(SEGMENT$xrDestroySpatialSnapshotEXT, Descriptors.DESCRIPTOR$xrDestroySpatialSnapshotEXT);
        SEGMENT$xrDestroySwapchain = loader.apply("xrDestroySwapchain");
        HANDLE$xrDestroySwapchain = RawFunctionLoader.link(SEGMENT$xrDestroySwapchain, Descriptors.DESCRIPTOR$xrDestroySwapchain);
        SEGMENT$xrDestroyTriangleMeshFB = loader.apply("xrDestroyTriangleMeshFB");
        HANDLE$xrDestroyTriangleMeshFB = RawFunctionLoader.link(SEGMENT$xrDestroyTriangleMeshFB, Descriptors.DESCRIPTOR$xrDestroyTriangleMeshFB);
        SEGMENT$xrDestroyVirtualKeyboardMETA = loader.apply("xrDestroyVirtualKeyboardMETA");
        HANDLE$xrDestroyVirtualKeyboardMETA = RawFunctionLoader.link(SEGMENT$xrDestroyVirtualKeyboardMETA, Descriptors.DESCRIPTOR$xrDestroyVirtualKeyboardMETA);
        SEGMENT$xrDestroyWorldMeshDetectorML = loader.apply("xrDestroyWorldMeshDetectorML");
        HANDLE$xrDestroyWorldMeshDetectorML = RawFunctionLoader.link(SEGMENT$xrDestroyWorldMeshDetectorML, Descriptors.DESCRIPTOR$xrDestroyWorldMeshDetectorML);
        SEGMENT$xrDownloadSharedSpatialAnchorAsyncBD = loader.apply("xrDownloadSharedSpatialAnchorAsyncBD");
        HANDLE$xrDownloadSharedSpatialAnchorAsyncBD = RawFunctionLoader.link(SEGMENT$xrDownloadSharedSpatialAnchorAsyncBD, Descriptors.DESCRIPTOR$xrDownloadSharedSpatialAnchorAsyncBD);
        SEGMENT$xrDownloadSharedSpatialAnchorCompleteBD = loader.apply("xrDownloadSharedSpatialAnchorCompleteBD");
        HANDLE$xrDownloadSharedSpatialAnchorCompleteBD = RawFunctionLoader.link(SEGMENT$xrDownloadSharedSpatialAnchorCompleteBD, Descriptors.DESCRIPTOR$xrDownloadSharedSpatialAnchorCompleteBD);
        SEGMENT$xrEnableLocalizationEventsML = loader.apply("xrEnableLocalizationEventsML");
        HANDLE$xrEnableLocalizationEventsML = RawFunctionLoader.link(SEGMENT$xrEnableLocalizationEventsML, Descriptors.DESCRIPTOR$xrEnableLocalizationEventsML);
        SEGMENT$xrEnableUserCalibrationEventsML = loader.apply("xrEnableUserCalibrationEventsML");
        HANDLE$xrEnableUserCalibrationEventsML = RawFunctionLoader.link(SEGMENT$xrEnableUserCalibrationEventsML, Descriptors.DESCRIPTOR$xrEnableUserCalibrationEventsML);
        SEGMENT$xrEndFrame = loader.apply("xrEndFrame");
        HANDLE$xrEndFrame = RawFunctionLoader.link(SEGMENT$xrEndFrame, Descriptors.DESCRIPTOR$xrEndFrame);
        SEGMENT$xrEndSession = loader.apply("xrEndSession");
        HANDLE$xrEndSession = RawFunctionLoader.link(SEGMENT$xrEndSession, Descriptors.DESCRIPTOR$xrEndSession);
        SEGMENT$xrEnumerateApiLayerProperties = loader.apply("xrEnumerateApiLayerProperties");
        HANDLE$xrEnumerateApiLayerProperties = RawFunctionLoader.link(SEGMENT$xrEnumerateApiLayerProperties, Descriptors.DESCRIPTOR$xrEnumerateApiLayerProperties);
        SEGMENT$xrEnumerateBoundSourcesForAction = loader.apply("xrEnumerateBoundSourcesForAction");
        HANDLE$xrEnumerateBoundSourcesForAction = RawFunctionLoader.link(SEGMENT$xrEnumerateBoundSourcesForAction, Descriptors.DESCRIPTOR$xrEnumerateBoundSourcesForAction);
        SEGMENT$xrEnumerateColorSpacesFB = loader.apply("xrEnumerateColorSpacesFB");
        HANDLE$xrEnumerateColorSpacesFB = RawFunctionLoader.link(SEGMENT$xrEnumerateColorSpacesFB, Descriptors.DESCRIPTOR$xrEnumerateColorSpacesFB);
        SEGMENT$xrEnumerateDisplayRefreshRatesFB = loader.apply("xrEnumerateDisplayRefreshRatesFB");
        HANDLE$xrEnumerateDisplayRefreshRatesFB = RawFunctionLoader.link(SEGMENT$xrEnumerateDisplayRefreshRatesFB, Descriptors.DESCRIPTOR$xrEnumerateDisplayRefreshRatesFB);
        SEGMENT$xrEnumerateEnvironmentBlendModes = loader.apply("xrEnumerateEnvironmentBlendModes");
        HANDLE$xrEnumerateEnvironmentBlendModes = RawFunctionLoader.link(SEGMENT$xrEnumerateEnvironmentBlendModes, Descriptors.DESCRIPTOR$xrEnumerateEnvironmentBlendModes);
        SEGMENT$xrEnumerateEnvironmentDepthSwapchainImagesMETA = loader.apply("xrEnumerateEnvironmentDepthSwapchainImagesMETA");
        HANDLE$xrEnumerateEnvironmentDepthSwapchainImagesMETA = RawFunctionLoader.link(SEGMENT$xrEnumerateEnvironmentDepthSwapchainImagesMETA, Descriptors.DESCRIPTOR$xrEnumerateEnvironmentDepthSwapchainImagesMETA);
        SEGMENT$xrEnumerateExternalCamerasOCULUS = loader.apply("xrEnumerateExternalCamerasOCULUS");
        HANDLE$xrEnumerateExternalCamerasOCULUS = RawFunctionLoader.link(SEGMENT$xrEnumerateExternalCamerasOCULUS, Descriptors.DESCRIPTOR$xrEnumerateExternalCamerasOCULUS);
        SEGMENT$xrEnumerateInstanceExtensionProperties = loader.apply("xrEnumerateInstanceExtensionProperties");
        HANDLE$xrEnumerateInstanceExtensionProperties = RawFunctionLoader.link(SEGMENT$xrEnumerateInstanceExtensionProperties, Descriptors.DESCRIPTOR$xrEnumerateInstanceExtensionProperties);
        SEGMENT$xrEnumerateInteractionRenderModelIdsEXT = loader.apply("xrEnumerateInteractionRenderModelIdsEXT");
        HANDLE$xrEnumerateInteractionRenderModelIdsEXT = RawFunctionLoader.link(SEGMENT$xrEnumerateInteractionRenderModelIdsEXT, Descriptors.DESCRIPTOR$xrEnumerateInteractionRenderModelIdsEXT);
        SEGMENT$xrEnumeratePerformanceMetricsCounterPathsMETA = loader.apply("xrEnumeratePerformanceMetricsCounterPathsMETA");
        HANDLE$xrEnumeratePerformanceMetricsCounterPathsMETA = RawFunctionLoader.link(SEGMENT$xrEnumeratePerformanceMetricsCounterPathsMETA, Descriptors.DESCRIPTOR$xrEnumeratePerformanceMetricsCounterPathsMETA);
        SEGMENT$xrEnumeratePersistedSpatialAnchorNamesMSFT = loader.apply("xrEnumeratePersistedSpatialAnchorNamesMSFT");
        HANDLE$xrEnumeratePersistedSpatialAnchorNamesMSFT = RawFunctionLoader.link(SEGMENT$xrEnumeratePersistedSpatialAnchorNamesMSFT, Descriptors.DESCRIPTOR$xrEnumeratePersistedSpatialAnchorNamesMSFT);
        SEGMENT$xrEnumerateReferenceSpaces = loader.apply("xrEnumerateReferenceSpaces");
        HANDLE$xrEnumerateReferenceSpaces = RawFunctionLoader.link(SEGMENT$xrEnumerateReferenceSpaces, Descriptors.DESCRIPTOR$xrEnumerateReferenceSpaces);
        SEGMENT$xrEnumerateRenderModelPathsFB = loader.apply("xrEnumerateRenderModelPathsFB");
        HANDLE$xrEnumerateRenderModelPathsFB = RawFunctionLoader.link(SEGMENT$xrEnumerateRenderModelPathsFB, Descriptors.DESCRIPTOR$xrEnumerateRenderModelPathsFB);
        SEGMENT$xrEnumerateRenderModelSubactionPathsEXT = loader.apply("xrEnumerateRenderModelSubactionPathsEXT");
        HANDLE$xrEnumerateRenderModelSubactionPathsEXT = RawFunctionLoader.link(SEGMENT$xrEnumerateRenderModelSubactionPathsEXT, Descriptors.DESCRIPTOR$xrEnumerateRenderModelSubactionPathsEXT);
        SEGMENT$xrEnumerateReprojectionModesMSFT = loader.apply("xrEnumerateReprojectionModesMSFT");
        HANDLE$xrEnumerateReprojectionModesMSFT = RawFunctionLoader.link(SEGMENT$xrEnumerateReprojectionModesMSFT, Descriptors.DESCRIPTOR$xrEnumerateReprojectionModesMSFT);
        SEGMENT$xrEnumerateSceneComputeFeaturesMSFT = loader.apply("xrEnumerateSceneComputeFeaturesMSFT");
        HANDLE$xrEnumerateSceneComputeFeaturesMSFT = RawFunctionLoader.link(SEGMENT$xrEnumerateSceneComputeFeaturesMSFT, Descriptors.DESCRIPTOR$xrEnumerateSceneComputeFeaturesMSFT);
        SEGMENT$xrEnumerateSpaceSupportedComponentsFB = loader.apply("xrEnumerateSpaceSupportedComponentsFB");
        HANDLE$xrEnumerateSpaceSupportedComponentsFB = RawFunctionLoader.link(SEGMENT$xrEnumerateSpaceSupportedComponentsFB, Descriptors.DESCRIPTOR$xrEnumerateSpaceSupportedComponentsFB);
        SEGMENT$xrEnumerateSpatialCapabilitiesEXT = loader.apply("xrEnumerateSpatialCapabilitiesEXT");
        HANDLE$xrEnumerateSpatialCapabilitiesEXT = RawFunctionLoader.link(SEGMENT$xrEnumerateSpatialCapabilitiesEXT, Descriptors.DESCRIPTOR$xrEnumerateSpatialCapabilitiesEXT);
        SEGMENT$xrEnumerateSpatialCapabilityComponentTypesEXT = loader.apply("xrEnumerateSpatialCapabilityComponentTypesEXT");
        HANDLE$xrEnumerateSpatialCapabilityComponentTypesEXT = RawFunctionLoader.link(SEGMENT$xrEnumerateSpatialCapabilityComponentTypesEXT, Descriptors.DESCRIPTOR$xrEnumerateSpatialCapabilityComponentTypesEXT);
        SEGMENT$xrEnumerateSpatialCapabilityFeaturesEXT = loader.apply("xrEnumerateSpatialCapabilityFeaturesEXT");
        HANDLE$xrEnumerateSpatialCapabilityFeaturesEXT = RawFunctionLoader.link(SEGMENT$xrEnumerateSpatialCapabilityFeaturesEXT, Descriptors.DESCRIPTOR$xrEnumerateSpatialCapabilityFeaturesEXT);
        SEGMENT$xrEnumerateSpatialEntityComponentTypesBD = loader.apply("xrEnumerateSpatialEntityComponentTypesBD");
        HANDLE$xrEnumerateSpatialEntityComponentTypesBD = RawFunctionLoader.link(SEGMENT$xrEnumerateSpatialEntityComponentTypesBD, Descriptors.DESCRIPTOR$xrEnumerateSpatialEntityComponentTypesBD);
        SEGMENT$xrEnumerateSpatialPersistenceScopesEXT = loader.apply("xrEnumerateSpatialPersistenceScopesEXT");
        HANDLE$xrEnumerateSpatialPersistenceScopesEXT = RawFunctionLoader.link(SEGMENT$xrEnumerateSpatialPersistenceScopesEXT, Descriptors.DESCRIPTOR$xrEnumerateSpatialPersistenceScopesEXT);
        SEGMENT$xrEnumerateSwapchainFormats = loader.apply("xrEnumerateSwapchainFormats");
        HANDLE$xrEnumerateSwapchainFormats = RawFunctionLoader.link(SEGMENT$xrEnumerateSwapchainFormats, Descriptors.DESCRIPTOR$xrEnumerateSwapchainFormats);
        SEGMENT$xrEnumerateSwapchainImages = loader.apply("xrEnumerateSwapchainImages");
        HANDLE$xrEnumerateSwapchainImages = RawFunctionLoader.link(SEGMENT$xrEnumerateSwapchainImages, Descriptors.DESCRIPTOR$xrEnumerateSwapchainImages);
        SEGMENT$xrEnumerateViewConfigurationViews = loader.apply("xrEnumerateViewConfigurationViews");
        HANDLE$xrEnumerateViewConfigurationViews = RawFunctionLoader.link(SEGMENT$xrEnumerateViewConfigurationViews, Descriptors.DESCRIPTOR$xrEnumerateViewConfigurationViews);
        SEGMENT$xrEnumerateViewConfigurations = loader.apply("xrEnumerateViewConfigurations");
        HANDLE$xrEnumerateViewConfigurations = RawFunctionLoader.link(SEGMENT$xrEnumerateViewConfigurations, Descriptors.DESCRIPTOR$xrEnumerateViewConfigurations);
        SEGMENT$xrEnumerateViveTrackerPathsHTCX = loader.apply("xrEnumerateViveTrackerPathsHTCX");
        HANDLE$xrEnumerateViveTrackerPathsHTCX = RawFunctionLoader.link(SEGMENT$xrEnumerateViveTrackerPathsHTCX, Descriptors.DESCRIPTOR$xrEnumerateViveTrackerPathsHTCX);
        SEGMENT$xrEraseSpaceFB = loader.apply("xrEraseSpaceFB");
        HANDLE$xrEraseSpaceFB = RawFunctionLoader.link(SEGMENT$xrEraseSpaceFB, Descriptors.DESCRIPTOR$xrEraseSpaceFB);
        SEGMENT$xrFreeWorldMeshBufferML = loader.apply("xrFreeWorldMeshBufferML");
        HANDLE$xrFreeWorldMeshBufferML = RawFunctionLoader.link(SEGMENT$xrFreeWorldMeshBufferML, Descriptors.DESCRIPTOR$xrFreeWorldMeshBufferML);
        SEGMENT$xrGeometryInstanceSetTransformFB = loader.apply("xrGeometryInstanceSetTransformFB");
        HANDLE$xrGeometryInstanceSetTransformFB = RawFunctionLoader.link(SEGMENT$xrGeometryInstanceSetTransformFB, Descriptors.DESCRIPTOR$xrGeometryInstanceSetTransformFB);
        SEGMENT$xrGetActionStateBoolean = loader.apply("xrGetActionStateBoolean");
        HANDLE$xrGetActionStateBoolean = RawFunctionLoader.link(SEGMENT$xrGetActionStateBoolean, Descriptors.DESCRIPTOR$xrGetActionStateBoolean);
        SEGMENT$xrGetActionStateFloat = loader.apply("xrGetActionStateFloat");
        HANDLE$xrGetActionStateFloat = RawFunctionLoader.link(SEGMENT$xrGetActionStateFloat, Descriptors.DESCRIPTOR$xrGetActionStateFloat);
        SEGMENT$xrGetActionStatePose = loader.apply("xrGetActionStatePose");
        HANDLE$xrGetActionStatePose = RawFunctionLoader.link(SEGMENT$xrGetActionStatePose, Descriptors.DESCRIPTOR$xrGetActionStatePose);
        SEGMENT$xrGetActionStateVector2f = loader.apply("xrGetActionStateVector2f");
        HANDLE$xrGetActionStateVector2f = RawFunctionLoader.link(SEGMENT$xrGetActionStateVector2f, Descriptors.DESCRIPTOR$xrGetActionStateVector2f);
        SEGMENT$xrGetAnchorUuidBD = loader.apply("xrGetAnchorUuidBD");
        HANDLE$xrGetAnchorUuidBD = RawFunctionLoader.link(SEGMENT$xrGetAnchorUuidBD, Descriptors.DESCRIPTOR$xrGetAnchorUuidBD);
        SEGMENT$xrGetAudioInputDeviceGuidOculus = loader.apply("xrGetAudioInputDeviceGuidOculus");
        HANDLE$xrGetAudioInputDeviceGuidOculus = RawFunctionLoader.link(SEGMENT$xrGetAudioInputDeviceGuidOculus, Descriptors.DESCRIPTOR$xrGetAudioInputDeviceGuidOculus);
        SEGMENT$xrGetAudioOutputDeviceGuidOculus = loader.apply("xrGetAudioOutputDeviceGuidOculus");
        HANDLE$xrGetAudioOutputDeviceGuidOculus = RawFunctionLoader.link(SEGMENT$xrGetAudioOutputDeviceGuidOculus, Descriptors.DESCRIPTOR$xrGetAudioOutputDeviceGuidOculus);
        SEGMENT$xrGetBodySkeletonFB = loader.apply("xrGetBodySkeletonFB");
        HANDLE$xrGetBodySkeletonFB = RawFunctionLoader.link(SEGMENT$xrGetBodySkeletonFB, Descriptors.DESCRIPTOR$xrGetBodySkeletonFB);
        SEGMENT$xrGetBodySkeletonHTC = loader.apply("xrGetBodySkeletonHTC");
        HANDLE$xrGetBodySkeletonHTC = RawFunctionLoader.link(SEGMENT$xrGetBodySkeletonHTC, Descriptors.DESCRIPTOR$xrGetBodySkeletonHTC);
        SEGMENT$xrGetControllerModelKeyMSFT = loader.apply("xrGetControllerModelKeyMSFT");
        HANDLE$xrGetControllerModelKeyMSFT = RawFunctionLoader.link(SEGMENT$xrGetControllerModelKeyMSFT, Descriptors.DESCRIPTOR$xrGetControllerModelKeyMSFT);
        SEGMENT$xrGetControllerModelPropertiesMSFT = loader.apply("xrGetControllerModelPropertiesMSFT");
        HANDLE$xrGetControllerModelPropertiesMSFT = RawFunctionLoader.link(SEGMENT$xrGetControllerModelPropertiesMSFT, Descriptors.DESCRIPTOR$xrGetControllerModelPropertiesMSFT);
        SEGMENT$xrGetControllerModelStateMSFT = loader.apply("xrGetControllerModelStateMSFT");
        HANDLE$xrGetControllerModelStateMSFT = RawFunctionLoader.link(SEGMENT$xrGetControllerModelStateMSFT, Descriptors.DESCRIPTOR$xrGetControllerModelStateMSFT);
        SEGMENT$xrGetCurrentInteractionProfile = loader.apply("xrGetCurrentInteractionProfile");
        HANDLE$xrGetCurrentInteractionProfile = RawFunctionLoader.link(SEGMENT$xrGetCurrentInteractionProfile, Descriptors.DESCRIPTOR$xrGetCurrentInteractionProfile);
        SEGMENT$xrGetD3D11GraphicsRequirementsKHR = loader.apply("xrGetD3D11GraphicsRequirementsKHR");
        HANDLE$xrGetD3D11GraphicsRequirementsKHR = RawFunctionLoader.link(SEGMENT$xrGetD3D11GraphicsRequirementsKHR, Descriptors.DESCRIPTOR$xrGetD3D11GraphicsRequirementsKHR);
        SEGMENT$xrGetD3D12GraphicsRequirementsKHR = loader.apply("xrGetD3D12GraphicsRequirementsKHR");
        HANDLE$xrGetD3D12GraphicsRequirementsKHR = RawFunctionLoader.link(SEGMENT$xrGetD3D12GraphicsRequirementsKHR, Descriptors.DESCRIPTOR$xrGetD3D12GraphicsRequirementsKHR);
        SEGMENT$xrGetDeviceSampleRateFB = loader.apply("xrGetDeviceSampleRateFB");
        HANDLE$xrGetDeviceSampleRateFB = RawFunctionLoader.link(SEGMENT$xrGetDeviceSampleRateFB, Descriptors.DESCRIPTOR$xrGetDeviceSampleRateFB);
        SEGMENT$xrGetDisplayRefreshRateFB = loader.apply("xrGetDisplayRefreshRateFB");
        HANDLE$xrGetDisplayRefreshRateFB = RawFunctionLoader.link(SEGMENT$xrGetDisplayRefreshRateFB, Descriptors.DESCRIPTOR$xrGetDisplayRefreshRateFB);
        SEGMENT$xrGetEnvironmentDepthSwapchainStateMETA = loader.apply("xrGetEnvironmentDepthSwapchainStateMETA");
        HANDLE$xrGetEnvironmentDepthSwapchainStateMETA = RawFunctionLoader.link(SEGMENT$xrGetEnvironmentDepthSwapchainStateMETA, Descriptors.DESCRIPTOR$xrGetEnvironmentDepthSwapchainStateMETA);
        SEGMENT$xrGetExportedLocalizationMapDataML = loader.apply("xrGetExportedLocalizationMapDataML");
        HANDLE$xrGetExportedLocalizationMapDataML = RawFunctionLoader.link(SEGMENT$xrGetExportedLocalizationMapDataML, Descriptors.DESCRIPTOR$xrGetExportedLocalizationMapDataML);
        SEGMENT$xrGetEyeGazesFB = loader.apply("xrGetEyeGazesFB");
        HANDLE$xrGetEyeGazesFB = RawFunctionLoader.link(SEGMENT$xrGetEyeGazesFB, Descriptors.DESCRIPTOR$xrGetEyeGazesFB);
        SEGMENT$xrGetFaceExpressionWeights2FB = loader.apply("xrGetFaceExpressionWeights2FB");
        HANDLE$xrGetFaceExpressionWeights2FB = RawFunctionLoader.link(SEGMENT$xrGetFaceExpressionWeights2FB, Descriptors.DESCRIPTOR$xrGetFaceExpressionWeights2FB);
        SEGMENT$xrGetFaceExpressionWeightsFB = loader.apply("xrGetFaceExpressionWeightsFB");
        HANDLE$xrGetFaceExpressionWeightsFB = RawFunctionLoader.link(SEGMENT$xrGetFaceExpressionWeightsFB, Descriptors.DESCRIPTOR$xrGetFaceExpressionWeightsFB);
        SEGMENT$xrGetFacialExpressionBlendShapePropertiesML = loader.apply("xrGetFacialExpressionBlendShapePropertiesML");
        HANDLE$xrGetFacialExpressionBlendShapePropertiesML = RawFunctionLoader.link(SEGMENT$xrGetFacialExpressionBlendShapePropertiesML, Descriptors.DESCRIPTOR$xrGetFacialExpressionBlendShapePropertiesML);
        SEGMENT$xrGetFacialExpressionsHTC = loader.apply("xrGetFacialExpressionsHTC");
        HANDLE$xrGetFacialExpressionsHTC = RawFunctionLoader.link(SEGMENT$xrGetFacialExpressionsHTC, Descriptors.DESCRIPTOR$xrGetFacialExpressionsHTC);
        SEGMENT$xrGetFoveationEyeTrackedStateMETA = loader.apply("xrGetFoveationEyeTrackedStateMETA");
        HANDLE$xrGetFoveationEyeTrackedStateMETA = RawFunctionLoader.link(SEGMENT$xrGetFoveationEyeTrackedStateMETA, Descriptors.DESCRIPTOR$xrGetFoveationEyeTrackedStateMETA);
        SEGMENT$xrGetHandMeshFB = loader.apply("xrGetHandMeshFB");
        HANDLE$xrGetHandMeshFB = RawFunctionLoader.link(SEGMENT$xrGetHandMeshFB, Descriptors.DESCRIPTOR$xrGetHandMeshFB);
        SEGMENT$xrGetInputSourceLocalizedName = loader.apply("xrGetInputSourceLocalizedName");
        HANDLE$xrGetInputSourceLocalizedName = RawFunctionLoader.link(SEGMENT$xrGetInputSourceLocalizedName, Descriptors.DESCRIPTOR$xrGetInputSourceLocalizedName);
        SEGMENT$xrGetInstanceProcAddr = loader.apply("xrGetInstanceProcAddr");
        HANDLE$xrGetInstanceProcAddr = RawFunctionLoader.link(SEGMENT$xrGetInstanceProcAddr, Descriptors.DESCRIPTOR$xrGetInstanceProcAddr);
        SEGMENT$xrGetInstanceProperties = loader.apply("xrGetInstanceProperties");
        HANDLE$xrGetInstanceProperties = RawFunctionLoader.link(SEGMENT$xrGetInstanceProperties, Descriptors.DESCRIPTOR$xrGetInstanceProperties);
        SEGMENT$xrGetMarkerDetectorStateML = loader.apply("xrGetMarkerDetectorStateML");
        HANDLE$xrGetMarkerDetectorStateML = RawFunctionLoader.link(SEGMENT$xrGetMarkerDetectorStateML, Descriptors.DESCRIPTOR$xrGetMarkerDetectorStateML);
        SEGMENT$xrGetMarkerLengthML = loader.apply("xrGetMarkerLengthML");
        HANDLE$xrGetMarkerLengthML = RawFunctionLoader.link(SEGMENT$xrGetMarkerLengthML, Descriptors.DESCRIPTOR$xrGetMarkerLengthML);
        SEGMENT$xrGetMarkerNumberML = loader.apply("xrGetMarkerNumberML");
        HANDLE$xrGetMarkerNumberML = RawFunctionLoader.link(SEGMENT$xrGetMarkerNumberML, Descriptors.DESCRIPTOR$xrGetMarkerNumberML);
        SEGMENT$xrGetMarkerReprojectionErrorML = loader.apply("xrGetMarkerReprojectionErrorML");
        HANDLE$xrGetMarkerReprojectionErrorML = RawFunctionLoader.link(SEGMENT$xrGetMarkerReprojectionErrorML, Descriptors.DESCRIPTOR$xrGetMarkerReprojectionErrorML);
        SEGMENT$xrGetMarkerSizeVARJO = loader.apply("xrGetMarkerSizeVARJO");
        HANDLE$xrGetMarkerSizeVARJO = RawFunctionLoader.link(SEGMENT$xrGetMarkerSizeVARJO, Descriptors.DESCRIPTOR$xrGetMarkerSizeVARJO);
        SEGMENT$xrGetMarkerStringML = loader.apply("xrGetMarkerStringML");
        HANDLE$xrGetMarkerStringML = RawFunctionLoader.link(SEGMENT$xrGetMarkerStringML, Descriptors.DESCRIPTOR$xrGetMarkerStringML);
        SEGMENT$xrGetMarkersML = loader.apply("xrGetMarkersML");
        HANDLE$xrGetMarkersML = RawFunctionLoader.link(SEGMENT$xrGetMarkersML, Descriptors.DESCRIPTOR$xrGetMarkersML);
        SEGMENT$xrGetMetalGraphicsRequirementsKHR = loader.apply("xrGetMetalGraphicsRequirementsKHR");
        HANDLE$xrGetMetalGraphicsRequirementsKHR = RawFunctionLoader.link(SEGMENT$xrGetMetalGraphicsRequirementsKHR, Descriptors.DESCRIPTOR$xrGetMetalGraphicsRequirementsKHR);
        SEGMENT$xrGetOpenGLESGraphicsRequirementsKHR = loader.apply("xrGetOpenGLESGraphicsRequirementsKHR");
        HANDLE$xrGetOpenGLESGraphicsRequirementsKHR = RawFunctionLoader.link(SEGMENT$xrGetOpenGLESGraphicsRequirementsKHR, Descriptors.DESCRIPTOR$xrGetOpenGLESGraphicsRequirementsKHR);
        SEGMENT$xrGetOpenGLGraphicsRequirementsKHR = loader.apply("xrGetOpenGLGraphicsRequirementsKHR");
        HANDLE$xrGetOpenGLGraphicsRequirementsKHR = RawFunctionLoader.link(SEGMENT$xrGetOpenGLGraphicsRequirementsKHR, Descriptors.DESCRIPTOR$xrGetOpenGLGraphicsRequirementsKHR);
        SEGMENT$xrGetPassthroughPreferencesMETA = loader.apply("xrGetPassthroughPreferencesMETA");
        HANDLE$xrGetPassthroughPreferencesMETA = RawFunctionLoader.link(SEGMENT$xrGetPassthroughPreferencesMETA, Descriptors.DESCRIPTOR$xrGetPassthroughPreferencesMETA);
        SEGMENT$xrGetPerformanceMetricsStateMETA = loader.apply("xrGetPerformanceMetricsStateMETA");
        HANDLE$xrGetPerformanceMetricsStateMETA = RawFunctionLoader.link(SEGMENT$xrGetPerformanceMetricsStateMETA, Descriptors.DESCRIPTOR$xrGetPerformanceMetricsStateMETA);
        SEGMENT$xrGetPlaneDetectionStateEXT = loader.apply("xrGetPlaneDetectionStateEXT");
        HANDLE$xrGetPlaneDetectionStateEXT = RawFunctionLoader.link(SEGMENT$xrGetPlaneDetectionStateEXT, Descriptors.DESCRIPTOR$xrGetPlaneDetectionStateEXT);
        SEGMENT$xrGetPlaneDetectionsEXT = loader.apply("xrGetPlaneDetectionsEXT");
        HANDLE$xrGetPlaneDetectionsEXT = RawFunctionLoader.link(SEGMENT$xrGetPlaneDetectionsEXT, Descriptors.DESCRIPTOR$xrGetPlaneDetectionsEXT);
        SEGMENT$xrGetPlanePolygonBufferEXT = loader.apply("xrGetPlanePolygonBufferEXT");
        HANDLE$xrGetPlanePolygonBufferEXT = RawFunctionLoader.link(SEGMENT$xrGetPlanePolygonBufferEXT, Descriptors.DESCRIPTOR$xrGetPlanePolygonBufferEXT);
        SEGMENT$xrGetQueriedSenseDataBD = loader.apply("xrGetQueriedSenseDataBD");
        HANDLE$xrGetQueriedSenseDataBD = RawFunctionLoader.link(SEGMENT$xrGetQueriedSenseDataBD, Descriptors.DESCRIPTOR$xrGetQueriedSenseDataBD);
        SEGMENT$xrGetRecommendedLayerResolutionMETA = loader.apply("xrGetRecommendedLayerResolutionMETA");
        HANDLE$xrGetRecommendedLayerResolutionMETA = RawFunctionLoader.link(SEGMENT$xrGetRecommendedLayerResolutionMETA, Descriptors.DESCRIPTOR$xrGetRecommendedLayerResolutionMETA);
        SEGMENT$xrGetReferenceSpaceBoundsRect = loader.apply("xrGetReferenceSpaceBoundsRect");
        HANDLE$xrGetReferenceSpaceBoundsRect = RawFunctionLoader.link(SEGMENT$xrGetReferenceSpaceBoundsRect, Descriptors.DESCRIPTOR$xrGetReferenceSpaceBoundsRect);
        SEGMENT$xrGetRenderModelAssetDataEXT = loader.apply("xrGetRenderModelAssetDataEXT");
        HANDLE$xrGetRenderModelAssetDataEXT = RawFunctionLoader.link(SEGMENT$xrGetRenderModelAssetDataEXT, Descriptors.DESCRIPTOR$xrGetRenderModelAssetDataEXT);
        SEGMENT$xrGetRenderModelAssetPropertiesEXT = loader.apply("xrGetRenderModelAssetPropertiesEXT");
        HANDLE$xrGetRenderModelAssetPropertiesEXT = RawFunctionLoader.link(SEGMENT$xrGetRenderModelAssetPropertiesEXT, Descriptors.DESCRIPTOR$xrGetRenderModelAssetPropertiesEXT);
        SEGMENT$xrGetRenderModelPoseTopLevelUserPathEXT = loader.apply("xrGetRenderModelPoseTopLevelUserPathEXT");
        HANDLE$xrGetRenderModelPoseTopLevelUserPathEXT = RawFunctionLoader.link(SEGMENT$xrGetRenderModelPoseTopLevelUserPathEXT, Descriptors.DESCRIPTOR$xrGetRenderModelPoseTopLevelUserPathEXT);
        SEGMENT$xrGetRenderModelPropertiesEXT = loader.apply("xrGetRenderModelPropertiesEXT");
        HANDLE$xrGetRenderModelPropertiesEXT = RawFunctionLoader.link(SEGMENT$xrGetRenderModelPropertiesEXT, Descriptors.DESCRIPTOR$xrGetRenderModelPropertiesEXT);
        SEGMENT$xrGetRenderModelPropertiesFB = loader.apply("xrGetRenderModelPropertiesFB");
        HANDLE$xrGetRenderModelPropertiesFB = RawFunctionLoader.link(SEGMENT$xrGetRenderModelPropertiesFB, Descriptors.DESCRIPTOR$xrGetRenderModelPropertiesFB);
        SEGMENT$xrGetRenderModelStateEXT = loader.apply("xrGetRenderModelStateEXT");
        HANDLE$xrGetRenderModelStateEXT = RawFunctionLoader.link(SEGMENT$xrGetRenderModelStateEXT, Descriptors.DESCRIPTOR$xrGetRenderModelStateEXT);
        SEGMENT$xrGetSceneComponentsMSFT = loader.apply("xrGetSceneComponentsMSFT");
        HANDLE$xrGetSceneComponentsMSFT = RawFunctionLoader.link(SEGMENT$xrGetSceneComponentsMSFT, Descriptors.DESCRIPTOR$xrGetSceneComponentsMSFT);
        SEGMENT$xrGetSceneComputeStateMSFT = loader.apply("xrGetSceneComputeStateMSFT");
        HANDLE$xrGetSceneComputeStateMSFT = RawFunctionLoader.link(SEGMENT$xrGetSceneComputeStateMSFT, Descriptors.DESCRIPTOR$xrGetSceneComputeStateMSFT);
        SEGMENT$xrGetSceneMarkerDecodedStringMSFT = loader.apply("xrGetSceneMarkerDecodedStringMSFT");
        HANDLE$xrGetSceneMarkerDecodedStringMSFT = RawFunctionLoader.link(SEGMENT$xrGetSceneMarkerDecodedStringMSFT, Descriptors.DESCRIPTOR$xrGetSceneMarkerDecodedStringMSFT);
        SEGMENT$xrGetSceneMarkerRawDataMSFT = loader.apply("xrGetSceneMarkerRawDataMSFT");
        HANDLE$xrGetSceneMarkerRawDataMSFT = RawFunctionLoader.link(SEGMENT$xrGetSceneMarkerRawDataMSFT, Descriptors.DESCRIPTOR$xrGetSceneMarkerRawDataMSFT);
        SEGMENT$xrGetSceneMeshBuffersMSFT = loader.apply("xrGetSceneMeshBuffersMSFT");
        HANDLE$xrGetSceneMeshBuffersMSFT = RawFunctionLoader.link(SEGMENT$xrGetSceneMeshBuffersMSFT, Descriptors.DESCRIPTOR$xrGetSceneMeshBuffersMSFT);
        SEGMENT$xrGetSenseDataProviderStateBD = loader.apply("xrGetSenseDataProviderStateBD");
        HANDLE$xrGetSenseDataProviderStateBD = RawFunctionLoader.link(SEGMENT$xrGetSenseDataProviderStateBD, Descriptors.DESCRIPTOR$xrGetSenseDataProviderStateBD);
        SEGMENT$xrGetSerializedSceneFragmentDataMSFT = loader.apply("xrGetSerializedSceneFragmentDataMSFT");
        HANDLE$xrGetSerializedSceneFragmentDataMSFT = RawFunctionLoader.link(SEGMENT$xrGetSerializedSceneFragmentDataMSFT, Descriptors.DESCRIPTOR$xrGetSerializedSceneFragmentDataMSFT);
        SEGMENT$xrGetSpaceBoundary2DFB = loader.apply("xrGetSpaceBoundary2DFB");
        HANDLE$xrGetSpaceBoundary2DFB = RawFunctionLoader.link(SEGMENT$xrGetSpaceBoundary2DFB, Descriptors.DESCRIPTOR$xrGetSpaceBoundary2DFB);
        SEGMENT$xrGetSpaceBoundingBox2DFB = loader.apply("xrGetSpaceBoundingBox2DFB");
        HANDLE$xrGetSpaceBoundingBox2DFB = RawFunctionLoader.link(SEGMENT$xrGetSpaceBoundingBox2DFB, Descriptors.DESCRIPTOR$xrGetSpaceBoundingBox2DFB);
        SEGMENT$xrGetSpaceBoundingBox3DFB = loader.apply("xrGetSpaceBoundingBox3DFB");
        HANDLE$xrGetSpaceBoundingBox3DFB = RawFunctionLoader.link(SEGMENT$xrGetSpaceBoundingBox3DFB, Descriptors.DESCRIPTOR$xrGetSpaceBoundingBox3DFB);
        SEGMENT$xrGetSpaceComponentStatusFB = loader.apply("xrGetSpaceComponentStatusFB");
        HANDLE$xrGetSpaceComponentStatusFB = RawFunctionLoader.link(SEGMENT$xrGetSpaceComponentStatusFB, Descriptors.DESCRIPTOR$xrGetSpaceComponentStatusFB);
        SEGMENT$xrGetSpaceContainerFB = loader.apply("xrGetSpaceContainerFB");
        HANDLE$xrGetSpaceContainerFB = RawFunctionLoader.link(SEGMENT$xrGetSpaceContainerFB, Descriptors.DESCRIPTOR$xrGetSpaceContainerFB);
        SEGMENT$xrGetSpaceRoomLayoutFB = loader.apply("xrGetSpaceRoomLayoutFB");
        HANDLE$xrGetSpaceRoomLayoutFB = RawFunctionLoader.link(SEGMENT$xrGetSpaceRoomLayoutFB, Descriptors.DESCRIPTOR$xrGetSpaceRoomLayoutFB);
        SEGMENT$xrGetSpaceSemanticLabelsFB = loader.apply("xrGetSpaceSemanticLabelsFB");
        HANDLE$xrGetSpaceSemanticLabelsFB = RawFunctionLoader.link(SEGMENT$xrGetSpaceSemanticLabelsFB, Descriptors.DESCRIPTOR$xrGetSpaceSemanticLabelsFB);
        SEGMENT$xrGetSpaceTriangleMeshMETA = loader.apply("xrGetSpaceTriangleMeshMETA");
        HANDLE$xrGetSpaceTriangleMeshMETA = RawFunctionLoader.link(SEGMENT$xrGetSpaceTriangleMeshMETA, Descriptors.DESCRIPTOR$xrGetSpaceTriangleMeshMETA);
        SEGMENT$xrGetSpaceUserIdFB = loader.apply("xrGetSpaceUserIdFB");
        HANDLE$xrGetSpaceUserIdFB = RawFunctionLoader.link(SEGMENT$xrGetSpaceUserIdFB, Descriptors.DESCRIPTOR$xrGetSpaceUserIdFB);
        SEGMENT$xrGetSpaceUuidFB = loader.apply("xrGetSpaceUuidFB");
        HANDLE$xrGetSpaceUuidFB = RawFunctionLoader.link(SEGMENT$xrGetSpaceUuidFB, Descriptors.DESCRIPTOR$xrGetSpaceUuidFB);
        SEGMENT$xrGetSpatialAnchorNameHTC = loader.apply("xrGetSpatialAnchorNameHTC");
        HANDLE$xrGetSpatialAnchorNameHTC = RawFunctionLoader.link(SEGMENT$xrGetSpatialAnchorNameHTC, Descriptors.DESCRIPTOR$xrGetSpatialAnchorNameHTC);
        SEGMENT$xrGetSpatialAnchorStateML = loader.apply("xrGetSpatialAnchorStateML");
        HANDLE$xrGetSpatialAnchorStateML = RawFunctionLoader.link(SEGMENT$xrGetSpatialAnchorStateML, Descriptors.DESCRIPTOR$xrGetSpatialAnchorStateML);
        SEGMENT$xrGetSpatialBufferFloatEXT = loader.apply("xrGetSpatialBufferFloatEXT");
        HANDLE$xrGetSpatialBufferFloatEXT = RawFunctionLoader.link(SEGMENT$xrGetSpatialBufferFloatEXT, Descriptors.DESCRIPTOR$xrGetSpatialBufferFloatEXT);
        SEGMENT$xrGetSpatialBufferStringEXT = loader.apply("xrGetSpatialBufferStringEXT");
        HANDLE$xrGetSpatialBufferStringEXT = RawFunctionLoader.link(SEGMENT$xrGetSpatialBufferStringEXT, Descriptors.DESCRIPTOR$xrGetSpatialBufferStringEXT);
        SEGMENT$xrGetSpatialBufferUint16EXT = loader.apply("xrGetSpatialBufferUint16EXT");
        HANDLE$xrGetSpatialBufferUint16EXT = RawFunctionLoader.link(SEGMENT$xrGetSpatialBufferUint16EXT, Descriptors.DESCRIPTOR$xrGetSpatialBufferUint16EXT);
        SEGMENT$xrGetSpatialBufferUint32EXT = loader.apply("xrGetSpatialBufferUint32EXT");
        HANDLE$xrGetSpatialBufferUint32EXT = RawFunctionLoader.link(SEGMENT$xrGetSpatialBufferUint32EXT, Descriptors.DESCRIPTOR$xrGetSpatialBufferUint32EXT);
        SEGMENT$xrGetSpatialBufferUint8EXT = loader.apply("xrGetSpatialBufferUint8EXT");
        HANDLE$xrGetSpatialBufferUint8EXT = RawFunctionLoader.link(SEGMENT$xrGetSpatialBufferUint8EXT, Descriptors.DESCRIPTOR$xrGetSpatialBufferUint8EXT);
        SEGMENT$xrGetSpatialBufferVector2fEXT = loader.apply("xrGetSpatialBufferVector2fEXT");
        HANDLE$xrGetSpatialBufferVector2fEXT = RawFunctionLoader.link(SEGMENT$xrGetSpatialBufferVector2fEXT, Descriptors.DESCRIPTOR$xrGetSpatialBufferVector2fEXT);
        SEGMENT$xrGetSpatialBufferVector3fEXT = loader.apply("xrGetSpatialBufferVector3fEXT");
        HANDLE$xrGetSpatialBufferVector3fEXT = RawFunctionLoader.link(SEGMENT$xrGetSpatialBufferVector3fEXT, Descriptors.DESCRIPTOR$xrGetSpatialBufferVector3fEXT);
        SEGMENT$xrGetSpatialEntityComponentDataBD = loader.apply("xrGetSpatialEntityComponentDataBD");
        HANDLE$xrGetSpatialEntityComponentDataBD = RawFunctionLoader.link(SEGMENT$xrGetSpatialEntityComponentDataBD, Descriptors.DESCRIPTOR$xrGetSpatialEntityComponentDataBD);
        SEGMENT$xrGetSpatialEntityUuidBD = loader.apply("xrGetSpatialEntityUuidBD");
        HANDLE$xrGetSpatialEntityUuidBD = RawFunctionLoader.link(SEGMENT$xrGetSpatialEntityUuidBD, Descriptors.DESCRIPTOR$xrGetSpatialEntityUuidBD);
        SEGMENT$xrGetSpatialGraphNodeBindingPropertiesMSFT = loader.apply("xrGetSpatialGraphNodeBindingPropertiesMSFT");
        HANDLE$xrGetSpatialGraphNodeBindingPropertiesMSFT = RawFunctionLoader.link(SEGMENT$xrGetSpatialGraphNodeBindingPropertiesMSFT, Descriptors.DESCRIPTOR$xrGetSpatialGraphNodeBindingPropertiesMSFT);
        SEGMENT$xrGetSwapchainStateFB = loader.apply("xrGetSwapchainStateFB");
        HANDLE$xrGetSwapchainStateFB = RawFunctionLoader.link(SEGMENT$xrGetSwapchainStateFB, Descriptors.DESCRIPTOR$xrGetSwapchainStateFB);
        SEGMENT$xrGetSystem = loader.apply("xrGetSystem");
        HANDLE$xrGetSystem = RawFunctionLoader.link(SEGMENT$xrGetSystem, Descriptors.DESCRIPTOR$xrGetSystem);
        SEGMENT$xrGetSystemProperties = loader.apply("xrGetSystemProperties");
        HANDLE$xrGetSystemProperties = RawFunctionLoader.link(SEGMENT$xrGetSystemProperties, Descriptors.DESCRIPTOR$xrGetSystemProperties);
        SEGMENT$xrGetViewConfigurationProperties = loader.apply("xrGetViewConfigurationProperties");
        HANDLE$xrGetViewConfigurationProperties = RawFunctionLoader.link(SEGMENT$xrGetViewConfigurationProperties, Descriptors.DESCRIPTOR$xrGetViewConfigurationProperties);
        SEGMENT$xrGetVirtualKeyboardDirtyTexturesMETA = loader.apply("xrGetVirtualKeyboardDirtyTexturesMETA");
        HANDLE$xrGetVirtualKeyboardDirtyTexturesMETA = RawFunctionLoader.link(SEGMENT$xrGetVirtualKeyboardDirtyTexturesMETA, Descriptors.DESCRIPTOR$xrGetVirtualKeyboardDirtyTexturesMETA);
        SEGMENT$xrGetVirtualKeyboardModelAnimationStatesMETA = loader.apply("xrGetVirtualKeyboardModelAnimationStatesMETA");
        HANDLE$xrGetVirtualKeyboardModelAnimationStatesMETA = RawFunctionLoader.link(SEGMENT$xrGetVirtualKeyboardModelAnimationStatesMETA, Descriptors.DESCRIPTOR$xrGetVirtualKeyboardModelAnimationStatesMETA);
        SEGMENT$xrGetVirtualKeyboardScaleMETA = loader.apply("xrGetVirtualKeyboardScaleMETA");
        HANDLE$xrGetVirtualKeyboardScaleMETA = RawFunctionLoader.link(SEGMENT$xrGetVirtualKeyboardScaleMETA, Descriptors.DESCRIPTOR$xrGetVirtualKeyboardScaleMETA);
        SEGMENT$xrGetVirtualKeyboardTextureDataMETA = loader.apply("xrGetVirtualKeyboardTextureDataMETA");
        HANDLE$xrGetVirtualKeyboardTextureDataMETA = RawFunctionLoader.link(SEGMENT$xrGetVirtualKeyboardTextureDataMETA, Descriptors.DESCRIPTOR$xrGetVirtualKeyboardTextureDataMETA);
        SEGMENT$xrGetVisibilityMaskKHR = loader.apply("xrGetVisibilityMaskKHR");
        HANDLE$xrGetVisibilityMaskKHR = RawFunctionLoader.link(SEGMENT$xrGetVisibilityMaskKHR, Descriptors.DESCRIPTOR$xrGetVisibilityMaskKHR);
        SEGMENT$xrGetVulkanDeviceExtensionsKHR = loader.apply("xrGetVulkanDeviceExtensionsKHR");
        HANDLE$xrGetVulkanDeviceExtensionsKHR = RawFunctionLoader.link(SEGMENT$xrGetVulkanDeviceExtensionsKHR, Descriptors.DESCRIPTOR$xrGetVulkanDeviceExtensionsKHR);
        SEGMENT$xrGetVulkanGraphicsDevice2KHR = loader.apply("xrGetVulkanGraphicsDevice2KHR");
        HANDLE$xrGetVulkanGraphicsDevice2KHR = RawFunctionLoader.link(SEGMENT$xrGetVulkanGraphicsDevice2KHR, Descriptors.DESCRIPTOR$xrGetVulkanGraphicsDevice2KHR);
        SEGMENT$xrGetVulkanGraphicsDeviceKHR = loader.apply("xrGetVulkanGraphicsDeviceKHR");
        HANDLE$xrGetVulkanGraphicsDeviceKHR = RawFunctionLoader.link(SEGMENT$xrGetVulkanGraphicsDeviceKHR, Descriptors.DESCRIPTOR$xrGetVulkanGraphicsDeviceKHR);
        SEGMENT$xrGetVulkanGraphicsRequirements2KHR = loader.apply("xrGetVulkanGraphicsRequirements2KHR");
        HANDLE$xrGetVulkanGraphicsRequirements2KHR = RawFunctionLoader.link(SEGMENT$xrGetVulkanGraphicsRequirements2KHR, Descriptors.DESCRIPTOR$xrGetVulkanGraphicsRequirementsKHR);
        SEGMENT$xrGetVulkanGraphicsRequirementsKHR = loader.apply("xrGetVulkanGraphicsRequirementsKHR");
        HANDLE$xrGetVulkanGraphicsRequirementsKHR = RawFunctionLoader.link(SEGMENT$xrGetVulkanGraphicsRequirementsKHR, Descriptors.DESCRIPTOR$xrGetVulkanGraphicsRequirementsKHR);
        SEGMENT$xrGetVulkanInstanceExtensionsKHR = loader.apply("xrGetVulkanInstanceExtensionsKHR");
        HANDLE$xrGetVulkanInstanceExtensionsKHR = RawFunctionLoader.link(SEGMENT$xrGetVulkanInstanceExtensionsKHR, Descriptors.DESCRIPTOR$xrGetVulkanInstanceExtensionsKHR);
        SEGMENT$xrGetWorldMeshBufferRecommendSizeML = loader.apply("xrGetWorldMeshBufferRecommendSizeML");
        HANDLE$xrGetWorldMeshBufferRecommendSizeML = RawFunctionLoader.link(SEGMENT$xrGetWorldMeshBufferRecommendSizeML, Descriptors.DESCRIPTOR$xrGetWorldMeshBufferRecommendSizeML);
        SEGMENT$xrImportLocalizationMapML = loader.apply("xrImportLocalizationMapML");
        HANDLE$xrImportLocalizationMapML = RawFunctionLoader.link(SEGMENT$xrImportLocalizationMapML, Descriptors.DESCRIPTOR$xrImportLocalizationMapML);
        SEGMENT$xrInitializeLoaderKHR = loader.apply("xrInitializeLoaderKHR");
        HANDLE$xrInitializeLoaderKHR = RawFunctionLoader.link(SEGMENT$xrInitializeLoaderKHR, Descriptors.DESCRIPTOR$xrInitializeLoaderKHR);
        SEGMENT$xrLoadControllerModelMSFT = loader.apply("xrLoadControllerModelMSFT");
        HANDLE$xrLoadControllerModelMSFT = RawFunctionLoader.link(SEGMENT$xrLoadControllerModelMSFT, Descriptors.DESCRIPTOR$xrLoadControllerModelMSFT);
        SEGMENT$xrLoadRenderModelFB = loader.apply("xrLoadRenderModelFB");
        HANDLE$xrLoadRenderModelFB = RawFunctionLoader.link(SEGMENT$xrLoadRenderModelFB, Descriptors.DESCRIPTOR$xrLoadRenderModelFB);
        SEGMENT$xrLocateBodyJointsBD = loader.apply("xrLocateBodyJointsBD");
        HANDLE$xrLocateBodyJointsBD = RawFunctionLoader.link(SEGMENT$xrLocateBodyJointsBD, Descriptors.DESCRIPTOR$xrLocateBodyJointsBD);
        SEGMENT$xrLocateBodyJointsFB = loader.apply("xrLocateBodyJointsFB");
        HANDLE$xrLocateBodyJointsFB = RawFunctionLoader.link(SEGMENT$xrLocateBodyJointsFB, Descriptors.DESCRIPTOR$xrLocateBodyJointsFB);
        SEGMENT$xrLocateBodyJointsHTC = loader.apply("xrLocateBodyJointsHTC");
        HANDLE$xrLocateBodyJointsHTC = RawFunctionLoader.link(SEGMENT$xrLocateBodyJointsHTC, Descriptors.DESCRIPTOR$xrLocateBodyJointsHTC);
        SEGMENT$xrLocateHandJointsEXT = loader.apply("xrLocateHandJointsEXT");
        HANDLE$xrLocateHandJointsEXT = RawFunctionLoader.link(SEGMENT$xrLocateHandJointsEXT, Descriptors.DESCRIPTOR$xrLocateHandJointsEXT);
        SEGMENT$xrLocateSceneComponentsMSFT = loader.apply("xrLocateSceneComponentsMSFT");
        HANDLE$xrLocateSceneComponentsMSFT = RawFunctionLoader.link(SEGMENT$xrLocateSceneComponentsMSFT, Descriptors.DESCRIPTOR$xrLocateSceneComponentsMSFT);
        SEGMENT$xrLocateSpace = loader.apply("xrLocateSpace");
        HANDLE$xrLocateSpace = RawFunctionLoader.link(SEGMENT$xrLocateSpace, Descriptors.DESCRIPTOR$xrLocateSpace);
        SEGMENT$xrLocateSpaces = loader.apply("xrLocateSpaces");
        HANDLE$xrLocateSpaces = RawFunctionLoader.link(SEGMENT$xrLocateSpaces, Descriptors.DESCRIPTOR$xrLocateSpaces);
        SEGMENT$xrLocateSpacesKHR = loader.apply("xrLocateSpacesKHR");
        HANDLE$xrLocateSpacesKHR = RawFunctionLoader.link(SEGMENT$xrLocateSpacesKHR, Descriptors.DESCRIPTOR$xrLocateSpaces);
        SEGMENT$xrLocateViews = loader.apply("xrLocateViews");
        HANDLE$xrLocateViews = RawFunctionLoader.link(SEGMENT$xrLocateViews, Descriptors.DESCRIPTOR$xrLocateViews);
        SEGMENT$xrNegotiateLoaderApiLayerInterface = loader.apply("xrNegotiateLoaderApiLayerInterface");
        HANDLE$xrNegotiateLoaderApiLayerInterface = RawFunctionLoader.link(SEGMENT$xrNegotiateLoaderApiLayerInterface, Descriptors.DESCRIPTOR$xrNegotiateLoaderApiLayerInterface);
        SEGMENT$xrNegotiateLoaderRuntimeInterface = loader.apply("xrNegotiateLoaderRuntimeInterface");
        HANDLE$xrNegotiateLoaderRuntimeInterface = RawFunctionLoader.link(SEGMENT$xrNegotiateLoaderRuntimeInterface, Descriptors.DESCRIPTOR$xrNegotiateLoaderRuntimeInterface);
        SEGMENT$xrPassthroughLayerPauseFB = loader.apply("xrPassthroughLayerPauseFB");
        HANDLE$xrPassthroughLayerPauseFB = RawFunctionLoader.link(SEGMENT$xrPassthroughLayerPauseFB, Descriptors.DESCRIPTOR$xrPassthroughLayerPauseFB);
        SEGMENT$xrPassthroughLayerResumeFB = loader.apply("xrPassthroughLayerResumeFB");
        HANDLE$xrPassthroughLayerResumeFB = RawFunctionLoader.link(SEGMENT$xrPassthroughLayerResumeFB, Descriptors.DESCRIPTOR$xrPassthroughLayerResumeFB);
        SEGMENT$xrPassthroughLayerSetKeyboardHandsIntensityFB = loader.apply("xrPassthroughLayerSetKeyboardHandsIntensityFB");
        HANDLE$xrPassthroughLayerSetKeyboardHandsIntensityFB = RawFunctionLoader.link(SEGMENT$xrPassthroughLayerSetKeyboardHandsIntensityFB, Descriptors.DESCRIPTOR$xrPassthroughLayerSetKeyboardHandsIntensityFB);
        SEGMENT$xrPassthroughLayerSetStyleFB = loader.apply("xrPassthroughLayerSetStyleFB");
        HANDLE$xrPassthroughLayerSetStyleFB = RawFunctionLoader.link(SEGMENT$xrPassthroughLayerSetStyleFB, Descriptors.DESCRIPTOR$xrPassthroughLayerSetStyleFB);
        SEGMENT$xrPassthroughPauseFB = loader.apply("xrPassthroughPauseFB");
        HANDLE$xrPassthroughPauseFB = RawFunctionLoader.link(SEGMENT$xrPassthroughPauseFB, Descriptors.DESCRIPTOR$xrPassthroughPauseFB);
        SEGMENT$xrPassthroughStartFB = loader.apply("xrPassthroughStartFB");
        HANDLE$xrPassthroughStartFB = RawFunctionLoader.link(SEGMENT$xrPassthroughStartFB, Descriptors.DESCRIPTOR$xrPassthroughStartFB);
        SEGMENT$xrPathToString = loader.apply("xrPathToString");
        HANDLE$xrPathToString = RawFunctionLoader.link(SEGMENT$xrPathToString, Descriptors.DESCRIPTOR$xrPathToString);
        SEGMENT$xrPauseSimultaneousHandsAndControllersTrackingMETA = loader.apply("xrPauseSimultaneousHandsAndControllersTrackingMETA");
        HANDLE$xrPauseSimultaneousHandsAndControllersTrackingMETA = RawFunctionLoader.link(SEGMENT$xrPauseSimultaneousHandsAndControllersTrackingMETA, Descriptors.DESCRIPTOR$xrPauseSimultaneousHandsAndControllersTrackingMETA);
        SEGMENT$xrPerfSettingsSetPerformanceLevelEXT = loader.apply("xrPerfSettingsSetPerformanceLevelEXT");
        HANDLE$xrPerfSettingsSetPerformanceLevelEXT = RawFunctionLoader.link(SEGMENT$xrPerfSettingsSetPerformanceLevelEXT, Descriptors.DESCRIPTOR$xrPerfSettingsSetPerformanceLevelEXT);
        SEGMENT$xrPersistSpatialAnchorAsyncBD = loader.apply("xrPersistSpatialAnchorAsyncBD");
        HANDLE$xrPersistSpatialAnchorAsyncBD = RawFunctionLoader.link(SEGMENT$xrPersistSpatialAnchorAsyncBD, Descriptors.DESCRIPTOR$xrPersistSpatialAnchorAsyncBD);
        SEGMENT$xrPersistSpatialAnchorCompleteBD = loader.apply("xrPersistSpatialAnchorCompleteBD");
        HANDLE$xrPersistSpatialAnchorCompleteBD = RawFunctionLoader.link(SEGMENT$xrPersistSpatialAnchorCompleteBD, Descriptors.DESCRIPTOR$xrPersistSpatialAnchorCompleteBD);
        SEGMENT$xrPersistSpatialAnchorMSFT = loader.apply("xrPersistSpatialAnchorMSFT");
        HANDLE$xrPersistSpatialAnchorMSFT = RawFunctionLoader.link(SEGMENT$xrPersistSpatialAnchorMSFT, Descriptors.DESCRIPTOR$xrPersistSpatialAnchorMSFT);
        SEGMENT$xrPersistSpatialEntityAsyncEXT = loader.apply("xrPersistSpatialEntityAsyncEXT");
        HANDLE$xrPersistSpatialEntityAsyncEXT = RawFunctionLoader.link(SEGMENT$xrPersistSpatialEntityAsyncEXT, Descriptors.DESCRIPTOR$xrPersistSpatialEntityAsyncEXT);
        SEGMENT$xrPersistSpatialEntityCompleteEXT = loader.apply("xrPersistSpatialEntityCompleteEXT");
        HANDLE$xrPersistSpatialEntityCompleteEXT = RawFunctionLoader.link(SEGMENT$xrPersistSpatialEntityCompleteEXT, Descriptors.DESCRIPTOR$xrPersistSpatialEntityCompleteEXT);
        SEGMENT$xrPollEvent = loader.apply("xrPollEvent");
        HANDLE$xrPollEvent = RawFunctionLoader.link(SEGMENT$xrPollEvent, Descriptors.DESCRIPTOR$xrPollEvent);
        SEGMENT$xrPollFutureEXT = loader.apply("xrPollFutureEXT");
        HANDLE$xrPollFutureEXT = RawFunctionLoader.link(SEGMENT$xrPollFutureEXT, Descriptors.DESCRIPTOR$xrPollFutureEXT);
        SEGMENT$xrPublishSpatialAnchorsAsyncML = loader.apply("xrPublishSpatialAnchorsAsyncML");
        HANDLE$xrPublishSpatialAnchorsAsyncML = RawFunctionLoader.link(SEGMENT$xrPublishSpatialAnchorsAsyncML, Descriptors.DESCRIPTOR$xrPublishSpatialAnchorsAsyncML);
        SEGMENT$xrPublishSpatialAnchorsCompleteML = loader.apply("xrPublishSpatialAnchorsCompleteML");
        HANDLE$xrPublishSpatialAnchorsCompleteML = RawFunctionLoader.link(SEGMENT$xrPublishSpatialAnchorsCompleteML, Descriptors.DESCRIPTOR$xrPublishSpatialAnchorsCompleteML);
        SEGMENT$xrQueryLocalizationMapsML = loader.apply("xrQueryLocalizationMapsML");
        HANDLE$xrQueryLocalizationMapsML = RawFunctionLoader.link(SEGMENT$xrQueryLocalizationMapsML, Descriptors.DESCRIPTOR$xrQueryLocalizationMapsML);
        SEGMENT$xrQueryPerformanceMetricsCounterMETA = loader.apply("xrQueryPerformanceMetricsCounterMETA");
        HANDLE$xrQueryPerformanceMetricsCounterMETA = RawFunctionLoader.link(SEGMENT$xrQueryPerformanceMetricsCounterMETA, Descriptors.DESCRIPTOR$xrQueryPerformanceMetricsCounterMETA);
        SEGMENT$xrQuerySenseDataAsyncBD = loader.apply("xrQuerySenseDataAsyncBD");
        HANDLE$xrQuerySenseDataAsyncBD = RawFunctionLoader.link(SEGMENT$xrQuerySenseDataAsyncBD, Descriptors.DESCRIPTOR$xrQuerySenseDataAsyncBD);
        SEGMENT$xrQuerySenseDataCompleteBD = loader.apply("xrQuerySenseDataCompleteBD");
        HANDLE$xrQuerySenseDataCompleteBD = RawFunctionLoader.link(SEGMENT$xrQuerySenseDataCompleteBD, Descriptors.DESCRIPTOR$xrQuerySenseDataCompleteBD);
        SEGMENT$xrQuerySpacesFB = loader.apply("xrQuerySpacesFB");
        HANDLE$xrQuerySpacesFB = RawFunctionLoader.link(SEGMENT$xrQuerySpacesFB, Descriptors.DESCRIPTOR$xrQuerySpacesFB);
        SEGMENT$xrQuerySpatialAnchorsAsyncML = loader.apply("xrQuerySpatialAnchorsAsyncML");
        HANDLE$xrQuerySpatialAnchorsAsyncML = RawFunctionLoader.link(SEGMENT$xrQuerySpatialAnchorsAsyncML, Descriptors.DESCRIPTOR$xrQuerySpatialAnchorsAsyncML);
        SEGMENT$xrQuerySpatialAnchorsCompleteML = loader.apply("xrQuerySpatialAnchorsCompleteML");
        HANDLE$xrQuerySpatialAnchorsCompleteML = RawFunctionLoader.link(SEGMENT$xrQuerySpatialAnchorsCompleteML, Descriptors.DESCRIPTOR$xrQuerySpatialAnchorsCompleteML);
        SEGMENT$xrQuerySpatialComponentDataEXT = loader.apply("xrQuerySpatialComponentDataEXT");
        HANDLE$xrQuerySpatialComponentDataEXT = RawFunctionLoader.link(SEGMENT$xrQuerySpatialComponentDataEXT, Descriptors.DESCRIPTOR$xrQuerySpatialComponentDataEXT);
        SEGMENT$xrQuerySystemTrackedKeyboardFB = loader.apply("xrQuerySystemTrackedKeyboardFB");
        HANDLE$xrQuerySystemTrackedKeyboardFB = RawFunctionLoader.link(SEGMENT$xrQuerySystemTrackedKeyboardFB, Descriptors.DESCRIPTOR$xrQuerySystemTrackedKeyboardFB);
        SEGMENT$xrReleaseSwapchainImage = loader.apply("xrReleaseSwapchainImage");
        HANDLE$xrReleaseSwapchainImage = RawFunctionLoader.link(SEGMENT$xrReleaseSwapchainImage, Descriptors.DESCRIPTOR$xrReleaseSwapchainImage);
        SEGMENT$xrRequestDisplayRefreshRateFB = loader.apply("xrRequestDisplayRefreshRateFB");
        HANDLE$xrRequestDisplayRefreshRateFB = RawFunctionLoader.link(SEGMENT$xrRequestDisplayRefreshRateFB, Descriptors.DESCRIPTOR$xrRequestDisplayRefreshRateFB);
        SEGMENT$xrRequestExitSession = loader.apply("xrRequestExitSession");
        HANDLE$xrRequestExitSession = RawFunctionLoader.link(SEGMENT$xrRequestExitSession, Descriptors.DESCRIPTOR$xrRequestExitSession);
        SEGMENT$xrRequestMapLocalizationML = loader.apply("xrRequestMapLocalizationML");
        HANDLE$xrRequestMapLocalizationML = RawFunctionLoader.link(SEGMENT$xrRequestMapLocalizationML, Descriptors.DESCRIPTOR$xrRequestMapLocalizationML);
        SEGMENT$xrRequestSceneCaptureFB = loader.apply("xrRequestSceneCaptureFB");
        HANDLE$xrRequestSceneCaptureFB = RawFunctionLoader.link(SEGMENT$xrRequestSceneCaptureFB, Descriptors.DESCRIPTOR$xrRequestSceneCaptureFB);
        SEGMENT$xrRequestWorldMeshAsyncML = loader.apply("xrRequestWorldMeshAsyncML");
        HANDLE$xrRequestWorldMeshAsyncML = RawFunctionLoader.link(SEGMENT$xrRequestWorldMeshAsyncML, Descriptors.DESCRIPTOR$xrRequestWorldMeshAsyncML);
        SEGMENT$xrRequestWorldMeshCompleteML = loader.apply("xrRequestWorldMeshCompleteML");
        HANDLE$xrRequestWorldMeshCompleteML = RawFunctionLoader.link(SEGMENT$xrRequestWorldMeshCompleteML, Descriptors.DESCRIPTOR$xrRequestWorldMeshCompleteML);
        SEGMENT$xrRequestWorldMeshStateAsyncML = loader.apply("xrRequestWorldMeshStateAsyncML");
        HANDLE$xrRequestWorldMeshStateAsyncML = RawFunctionLoader.link(SEGMENT$xrRequestWorldMeshStateAsyncML, Descriptors.DESCRIPTOR$xrRequestWorldMeshStateAsyncML);
        SEGMENT$xrRequestWorldMeshStateCompleteML = loader.apply("xrRequestWorldMeshStateCompleteML");
        HANDLE$xrRequestWorldMeshStateCompleteML = RawFunctionLoader.link(SEGMENT$xrRequestWorldMeshStateCompleteML, Descriptors.DESCRIPTOR$xrRequestWorldMeshStateCompleteML);
        SEGMENT$xrResultToString = loader.apply("xrResultToString");
        HANDLE$xrResultToString = RawFunctionLoader.link(SEGMENT$xrResultToString, Descriptors.DESCRIPTOR$xrResultToString);
        SEGMENT$xrResumeSimultaneousHandsAndControllersTrackingMETA = loader.apply("xrResumeSimultaneousHandsAndControllersTrackingMETA");
        HANDLE$xrResumeSimultaneousHandsAndControllersTrackingMETA = RawFunctionLoader.link(SEGMENT$xrResumeSimultaneousHandsAndControllersTrackingMETA, Descriptors.DESCRIPTOR$xrResumeSimultaneousHandsAndControllersTrackingMETA);
        SEGMENT$xrRetrieveSpaceQueryResultsFB = loader.apply("xrRetrieveSpaceQueryResultsFB");
        HANDLE$xrRetrieveSpaceQueryResultsFB = RawFunctionLoader.link(SEGMENT$xrRetrieveSpaceQueryResultsFB, Descriptors.DESCRIPTOR$xrRetrieveSpaceQueryResultsFB);
        SEGMENT$xrSaveSpaceFB = loader.apply("xrSaveSpaceFB");
        HANDLE$xrSaveSpaceFB = RawFunctionLoader.link(SEGMENT$xrSaveSpaceFB, Descriptors.DESCRIPTOR$xrSaveSpaceFB);
        SEGMENT$xrSaveSpaceListFB = loader.apply("xrSaveSpaceListFB");
        HANDLE$xrSaveSpaceListFB = RawFunctionLoader.link(SEGMENT$xrSaveSpaceListFB, Descriptors.DESCRIPTOR$xrSaveSpaceListFB);
        SEGMENT$xrSendVirtualKeyboardInputMETA = loader.apply("xrSendVirtualKeyboardInputMETA");
        HANDLE$xrSendVirtualKeyboardInputMETA = RawFunctionLoader.link(SEGMENT$xrSendVirtualKeyboardInputMETA, Descriptors.DESCRIPTOR$xrSendVirtualKeyboardInputMETA);
        SEGMENT$xrSessionBeginDebugUtilsLabelRegionEXT = loader.apply("xrSessionBeginDebugUtilsLabelRegionEXT");
        HANDLE$xrSessionBeginDebugUtilsLabelRegionEXT = RawFunctionLoader.link(SEGMENT$xrSessionBeginDebugUtilsLabelRegionEXT, Descriptors.DESCRIPTOR$xrSessionBeginDebugUtilsLabelRegionEXT);
        SEGMENT$xrSessionEndDebugUtilsLabelRegionEXT = loader.apply("xrSessionEndDebugUtilsLabelRegionEXT");
        HANDLE$xrSessionEndDebugUtilsLabelRegionEXT = RawFunctionLoader.link(SEGMENT$xrSessionEndDebugUtilsLabelRegionEXT, Descriptors.DESCRIPTOR$xrSessionEndDebugUtilsLabelRegionEXT);
        SEGMENT$xrSessionInsertDebugUtilsLabelEXT = loader.apply("xrSessionInsertDebugUtilsLabelEXT");
        HANDLE$xrSessionInsertDebugUtilsLabelEXT = RawFunctionLoader.link(SEGMENT$xrSessionInsertDebugUtilsLabelEXT, Descriptors.DESCRIPTOR$xrSessionInsertDebugUtilsLabelEXT);
        SEGMENT$xrSetAndroidApplicationThreadKHR = loader.apply("xrSetAndroidApplicationThreadKHR");
        HANDLE$xrSetAndroidApplicationThreadKHR = RawFunctionLoader.link(SEGMENT$xrSetAndroidApplicationThreadKHR, Descriptors.DESCRIPTOR$xrSetAndroidApplicationThreadKHR);
        SEGMENT$xrSetColorSpaceFB = loader.apply("xrSetColorSpaceFB");
        HANDLE$xrSetColorSpaceFB = RawFunctionLoader.link(SEGMENT$xrSetColorSpaceFB, Descriptors.DESCRIPTOR$xrSetColorSpaceFB);
        SEGMENT$xrSetDebugUtilsObjectNameEXT = loader.apply("xrSetDebugUtilsObjectNameEXT");
        HANDLE$xrSetDebugUtilsObjectNameEXT = RawFunctionLoader.link(SEGMENT$xrSetDebugUtilsObjectNameEXT, Descriptors.DESCRIPTOR$xrSetDebugUtilsObjectNameEXT);
        SEGMENT$xrSetDigitalLensControlALMALENCE = loader.apply("xrSetDigitalLensControlALMALENCE");
        HANDLE$xrSetDigitalLensControlALMALENCE = RawFunctionLoader.link(SEGMENT$xrSetDigitalLensControlALMALENCE, Descriptors.DESCRIPTOR$xrSetDigitalLensControlALMALENCE);
        SEGMENT$xrSetEnvironmentDepthEstimationVARJO = loader.apply("xrSetEnvironmentDepthEstimationVARJO");
        HANDLE$xrSetEnvironmentDepthEstimationVARJO = RawFunctionLoader.link(SEGMENT$xrSetEnvironmentDepthEstimationVARJO, Descriptors.DESCRIPTOR$xrSetEnvironmentDepthEstimationVARJO);
        SEGMENT$xrSetEnvironmentDepthHandRemovalMETA = loader.apply("xrSetEnvironmentDepthHandRemovalMETA");
        HANDLE$xrSetEnvironmentDepthHandRemovalMETA = RawFunctionLoader.link(SEGMENT$xrSetEnvironmentDepthHandRemovalMETA, Descriptors.DESCRIPTOR$xrSetEnvironmentDepthHandRemovalMETA);
        SEGMENT$xrSetInputDeviceActiveEXT = loader.apply("xrSetInputDeviceActiveEXT");
        HANDLE$xrSetInputDeviceActiveEXT = RawFunctionLoader.link(SEGMENT$xrSetInputDeviceActiveEXT, Descriptors.DESCRIPTOR$xrSetInputDeviceActiveEXT);
        SEGMENT$xrSetInputDeviceLocationEXT = loader.apply("xrSetInputDeviceLocationEXT");
        HANDLE$xrSetInputDeviceLocationEXT = RawFunctionLoader.link(SEGMENT$xrSetInputDeviceLocationEXT, Descriptors.DESCRIPTOR$xrSetInputDeviceLocationEXT);
        SEGMENT$xrSetInputDeviceStateBoolEXT = loader.apply("xrSetInputDeviceStateBoolEXT");
        HANDLE$xrSetInputDeviceStateBoolEXT = RawFunctionLoader.link(SEGMENT$xrSetInputDeviceStateBoolEXT, Descriptors.DESCRIPTOR$xrSetInputDeviceStateBoolEXT);
        SEGMENT$xrSetInputDeviceStateFloatEXT = loader.apply("xrSetInputDeviceStateFloatEXT");
        HANDLE$xrSetInputDeviceStateFloatEXT = RawFunctionLoader.link(SEGMENT$xrSetInputDeviceStateFloatEXT, Descriptors.DESCRIPTOR$xrSetInputDeviceStateFloatEXT);
        SEGMENT$xrSetInputDeviceStateVector2fEXT = loader.apply("xrSetInputDeviceStateVector2fEXT");
        HANDLE$xrSetInputDeviceStateVector2fEXT = RawFunctionLoader.link(SEGMENT$xrSetInputDeviceStateVector2fEXT, Descriptors.DESCRIPTOR$xrSetInputDeviceStateVector2fEXT);
        SEGMENT$xrSetMarkerTrackingPredictionVARJO = loader.apply("xrSetMarkerTrackingPredictionVARJO");
        HANDLE$xrSetMarkerTrackingPredictionVARJO = RawFunctionLoader.link(SEGMENT$xrSetMarkerTrackingPredictionVARJO, Descriptors.DESCRIPTOR$xrSetMarkerTrackingPredictionVARJO);
        SEGMENT$xrSetMarkerTrackingTimeoutVARJO = loader.apply("xrSetMarkerTrackingTimeoutVARJO");
        HANDLE$xrSetMarkerTrackingTimeoutVARJO = RawFunctionLoader.link(SEGMENT$xrSetMarkerTrackingTimeoutVARJO, Descriptors.DESCRIPTOR$xrSetMarkerTrackingTimeoutVARJO);
        SEGMENT$xrSetMarkerTrackingVARJO = loader.apply("xrSetMarkerTrackingVARJO");
        HANDLE$xrSetMarkerTrackingVARJO = RawFunctionLoader.link(SEGMENT$xrSetMarkerTrackingVARJO, Descriptors.DESCRIPTOR$xrSetMarkerTrackingVARJO);
        SEGMENT$xrSetPerformanceMetricsStateMETA = loader.apply("xrSetPerformanceMetricsStateMETA");
        HANDLE$xrSetPerformanceMetricsStateMETA = RawFunctionLoader.link(SEGMENT$xrSetPerformanceMetricsStateMETA, Descriptors.DESCRIPTOR$xrSetPerformanceMetricsStateMETA);
        SEGMENT$xrSetSpaceComponentStatusFB = loader.apply("xrSetSpaceComponentStatusFB");
        HANDLE$xrSetSpaceComponentStatusFB = RawFunctionLoader.link(SEGMENT$xrSetSpaceComponentStatusFB, Descriptors.DESCRIPTOR$xrSetSpaceComponentStatusFB);
        SEGMENT$xrSetSystemNotificationsML = loader.apply("xrSetSystemNotificationsML");
        HANDLE$xrSetSystemNotificationsML = RawFunctionLoader.link(SEGMENT$xrSetSystemNotificationsML, Descriptors.DESCRIPTOR$xrSetSystemNotificationsML);
        SEGMENT$xrSetTrackingOptimizationSettingsHintQCOM = loader.apply("xrSetTrackingOptimizationSettingsHintQCOM");
        HANDLE$xrSetTrackingOptimizationSettingsHintQCOM = RawFunctionLoader.link(SEGMENT$xrSetTrackingOptimizationSettingsHintQCOM, Descriptors.DESCRIPTOR$xrSetTrackingOptimizationSettingsHintQCOM);
        SEGMENT$xrSetViewOffsetVARJO = loader.apply("xrSetViewOffsetVARJO");
        HANDLE$xrSetViewOffsetVARJO = RawFunctionLoader.link(SEGMENT$xrSetViewOffsetVARJO, Descriptors.DESCRIPTOR$xrSetViewOffsetVARJO);
        SEGMENT$xrSetVirtualKeyboardModelVisibilityMETA = loader.apply("xrSetVirtualKeyboardModelVisibilityMETA");
        HANDLE$xrSetVirtualKeyboardModelVisibilityMETA = RawFunctionLoader.link(SEGMENT$xrSetVirtualKeyboardModelVisibilityMETA, Descriptors.DESCRIPTOR$xrSetVirtualKeyboardModelVisibilityMETA);
        SEGMENT$xrShareSpacesFB = loader.apply("xrShareSpacesFB");
        HANDLE$xrShareSpacesFB = RawFunctionLoader.link(SEGMENT$xrShareSpacesFB, Descriptors.DESCRIPTOR$xrShareSpacesFB);
        SEGMENT$xrShareSpacesMETA = loader.apply("xrShareSpacesMETA");
        HANDLE$xrShareSpacesMETA = RawFunctionLoader.link(SEGMENT$xrShareSpacesMETA, Descriptors.DESCRIPTOR$xrShareSpacesMETA);
        SEGMENT$xrShareSpatialAnchorAsyncBD = loader.apply("xrShareSpatialAnchorAsyncBD");
        HANDLE$xrShareSpatialAnchorAsyncBD = RawFunctionLoader.link(SEGMENT$xrShareSpatialAnchorAsyncBD, Descriptors.DESCRIPTOR$xrShareSpatialAnchorAsyncBD);
        SEGMENT$xrShareSpatialAnchorCompleteBD = loader.apply("xrShareSpatialAnchorCompleteBD");
        HANDLE$xrShareSpatialAnchorCompleteBD = RawFunctionLoader.link(SEGMENT$xrShareSpatialAnchorCompleteBD, Descriptors.DESCRIPTOR$xrShareSpatialAnchorCompleteBD);
        SEGMENT$xrSnapshotMarkerDetectorML = loader.apply("xrSnapshotMarkerDetectorML");
        HANDLE$xrSnapshotMarkerDetectorML = RawFunctionLoader.link(SEGMENT$xrSnapshotMarkerDetectorML, Descriptors.DESCRIPTOR$xrSnapshotMarkerDetectorML);
        SEGMENT$xrStartColocationAdvertisementMETA = loader.apply("xrStartColocationAdvertisementMETA");
        HANDLE$xrStartColocationAdvertisementMETA = RawFunctionLoader.link(SEGMENT$xrStartColocationAdvertisementMETA, Descriptors.DESCRIPTOR$xrStartColocationAdvertisementMETA);
        SEGMENT$xrStartColocationDiscoveryMETA = loader.apply("xrStartColocationDiscoveryMETA");
        HANDLE$xrStartColocationDiscoveryMETA = RawFunctionLoader.link(SEGMENT$xrStartColocationDiscoveryMETA, Descriptors.DESCRIPTOR$xrStartColocationDiscoveryMETA);
        SEGMENT$xrStartEnvironmentDepthProviderMETA = loader.apply("xrStartEnvironmentDepthProviderMETA");
        HANDLE$xrStartEnvironmentDepthProviderMETA = RawFunctionLoader.link(SEGMENT$xrStartEnvironmentDepthProviderMETA, Descriptors.DESCRIPTOR$xrStartEnvironmentDepthProviderMETA);
        SEGMENT$xrStartSenseDataProviderAsyncBD = loader.apply("xrStartSenseDataProviderAsyncBD");
        HANDLE$xrStartSenseDataProviderAsyncBD = RawFunctionLoader.link(SEGMENT$xrStartSenseDataProviderAsyncBD, Descriptors.DESCRIPTOR$xrStartSenseDataProviderAsyncBD);
        SEGMENT$xrStartSenseDataProviderCompleteBD = loader.apply("xrStartSenseDataProviderCompleteBD");
        HANDLE$xrStartSenseDataProviderCompleteBD = RawFunctionLoader.link(SEGMENT$xrStartSenseDataProviderCompleteBD, Descriptors.DESCRIPTOR$xrStartSenseDataProviderCompleteBD);
        SEGMENT$xrStopColocationAdvertisementMETA = loader.apply("xrStopColocationAdvertisementMETA");
        HANDLE$xrStopColocationAdvertisementMETA = RawFunctionLoader.link(SEGMENT$xrStopColocationAdvertisementMETA, Descriptors.DESCRIPTOR$xrStopColocationAdvertisementMETA);
        SEGMENT$xrStopColocationDiscoveryMETA = loader.apply("xrStopColocationDiscoveryMETA");
        HANDLE$xrStopColocationDiscoveryMETA = RawFunctionLoader.link(SEGMENT$xrStopColocationDiscoveryMETA, Descriptors.DESCRIPTOR$xrStopColocationDiscoveryMETA);
        SEGMENT$xrStopEnvironmentDepthProviderMETA = loader.apply("xrStopEnvironmentDepthProviderMETA");
        HANDLE$xrStopEnvironmentDepthProviderMETA = RawFunctionLoader.link(SEGMENT$xrStopEnvironmentDepthProviderMETA, Descriptors.DESCRIPTOR$xrStopEnvironmentDepthProviderMETA);
        SEGMENT$xrStopHapticFeedback = loader.apply("xrStopHapticFeedback");
        HANDLE$xrStopHapticFeedback = RawFunctionLoader.link(SEGMENT$xrStopHapticFeedback, Descriptors.DESCRIPTOR$xrStopHapticFeedback);
        SEGMENT$xrStopSenseDataProviderBD = loader.apply("xrStopSenseDataProviderBD");
        HANDLE$xrStopSenseDataProviderBD = RawFunctionLoader.link(SEGMENT$xrStopSenseDataProviderBD, Descriptors.DESCRIPTOR$xrStopSenseDataProviderBD);
        SEGMENT$xrStringToPath = loader.apply("xrStringToPath");
        HANDLE$xrStringToPath = RawFunctionLoader.link(SEGMENT$xrStringToPath, Descriptors.DESCRIPTOR$xrStringToPath);
        SEGMENT$xrStructureTypeToString = loader.apply("xrStructureTypeToString");
        HANDLE$xrStructureTypeToString = RawFunctionLoader.link(SEGMENT$xrStructureTypeToString, Descriptors.DESCRIPTOR$xrStructureTypeToString);
        SEGMENT$xrStructureTypeToString2KHR = loader.apply("xrStructureTypeToString2KHR");
        HANDLE$xrStructureTypeToString2KHR = RawFunctionLoader.link(SEGMENT$xrStructureTypeToString2KHR, Descriptors.DESCRIPTOR$xrStructureTypeToString2KHR);
        SEGMENT$xrSubmitDebugUtilsMessageEXT = loader.apply("xrSubmitDebugUtilsMessageEXT");
        HANDLE$xrSubmitDebugUtilsMessageEXT = RawFunctionLoader.link(SEGMENT$xrSubmitDebugUtilsMessageEXT, Descriptors.DESCRIPTOR$xrSubmitDebugUtilsMessageEXT);
        SEGMENT$xrSuggestInteractionProfileBindings = loader.apply("xrSuggestInteractionProfileBindings");
        HANDLE$xrSuggestInteractionProfileBindings = RawFunctionLoader.link(SEGMENT$xrSuggestInteractionProfileBindings, Descriptors.DESCRIPTOR$xrSuggestInteractionProfileBindings);
        SEGMENT$xrSuggestVirtualKeyboardLocationMETA = loader.apply("xrSuggestVirtualKeyboardLocationMETA");
        HANDLE$xrSuggestVirtualKeyboardLocationMETA = RawFunctionLoader.link(SEGMENT$xrSuggestVirtualKeyboardLocationMETA, Descriptors.DESCRIPTOR$xrSuggestVirtualKeyboardLocationMETA);
        SEGMENT$xrSyncActions = loader.apply("xrSyncActions");
        HANDLE$xrSyncActions = RawFunctionLoader.link(SEGMENT$xrSyncActions, Descriptors.DESCRIPTOR$xrSyncActions);
        SEGMENT$xrThermalGetTemperatureTrendEXT = loader.apply("xrThermalGetTemperatureTrendEXT");
        HANDLE$xrThermalGetTemperatureTrendEXT = RawFunctionLoader.link(SEGMENT$xrThermalGetTemperatureTrendEXT, Descriptors.DESCRIPTOR$xrThermalGetTemperatureTrendEXT);
        SEGMENT$xrTriangleMeshBeginUpdateFB = loader.apply("xrTriangleMeshBeginUpdateFB");
        HANDLE$xrTriangleMeshBeginUpdateFB = RawFunctionLoader.link(SEGMENT$xrTriangleMeshBeginUpdateFB, Descriptors.DESCRIPTOR$xrTriangleMeshBeginUpdateFB);
        SEGMENT$xrTriangleMeshBeginVertexBufferUpdateFB = loader.apply("xrTriangleMeshBeginVertexBufferUpdateFB");
        HANDLE$xrTriangleMeshBeginVertexBufferUpdateFB = RawFunctionLoader.link(SEGMENT$xrTriangleMeshBeginVertexBufferUpdateFB, Descriptors.DESCRIPTOR$xrTriangleMeshBeginVertexBufferUpdateFB);
        SEGMENT$xrTriangleMeshEndUpdateFB = loader.apply("xrTriangleMeshEndUpdateFB");
        HANDLE$xrTriangleMeshEndUpdateFB = RawFunctionLoader.link(SEGMENT$xrTriangleMeshEndUpdateFB, Descriptors.DESCRIPTOR$xrTriangleMeshEndUpdateFB);
        SEGMENT$xrTriangleMeshEndVertexBufferUpdateFB = loader.apply("xrTriangleMeshEndVertexBufferUpdateFB");
        HANDLE$xrTriangleMeshEndVertexBufferUpdateFB = RawFunctionLoader.link(SEGMENT$xrTriangleMeshEndVertexBufferUpdateFB, Descriptors.DESCRIPTOR$xrTriangleMeshEndVertexBufferUpdateFB);
        SEGMENT$xrTriangleMeshGetIndexBufferFB = loader.apply("xrTriangleMeshGetIndexBufferFB");
        HANDLE$xrTriangleMeshGetIndexBufferFB = RawFunctionLoader.link(SEGMENT$xrTriangleMeshGetIndexBufferFB, Descriptors.DESCRIPTOR$xrTriangleMeshGetIndexBufferFB);
        SEGMENT$xrTriangleMeshGetVertexBufferFB = loader.apply("xrTriangleMeshGetVertexBufferFB");
        HANDLE$xrTriangleMeshGetVertexBufferFB = RawFunctionLoader.link(SEGMENT$xrTriangleMeshGetVertexBufferFB, Descriptors.DESCRIPTOR$xrTriangleMeshGetVertexBufferFB);
        SEGMENT$xrTryCreateSpatialGraphStaticNodeBindingMSFT = loader.apply("xrTryCreateSpatialGraphStaticNodeBindingMSFT");
        HANDLE$xrTryCreateSpatialGraphStaticNodeBindingMSFT = RawFunctionLoader.link(SEGMENT$xrTryCreateSpatialGraphStaticNodeBindingMSFT, Descriptors.DESCRIPTOR$xrTryCreateSpatialGraphStaticNodeBindingMSFT);
        SEGMENT$xrTryGetPerceptionAnchorFromSpatialAnchorMSFT = loader.apply("xrTryGetPerceptionAnchorFromSpatialAnchorMSFT");
        HANDLE$xrTryGetPerceptionAnchorFromSpatialAnchorMSFT = RawFunctionLoader.link(SEGMENT$xrTryGetPerceptionAnchorFromSpatialAnchorMSFT, Descriptors.DESCRIPTOR$xrTryGetPerceptionAnchorFromSpatialAnchorMSFT);
        SEGMENT$xrUnpersistSpatialAnchorAsyncBD = loader.apply("xrUnpersistSpatialAnchorAsyncBD");
        HANDLE$xrUnpersistSpatialAnchorAsyncBD = RawFunctionLoader.link(SEGMENT$xrUnpersistSpatialAnchorAsyncBD, Descriptors.DESCRIPTOR$xrUnpersistSpatialAnchorAsyncBD);
        SEGMENT$xrUnpersistSpatialAnchorCompleteBD = loader.apply("xrUnpersistSpatialAnchorCompleteBD");
        HANDLE$xrUnpersistSpatialAnchorCompleteBD = RawFunctionLoader.link(SEGMENT$xrUnpersistSpatialAnchorCompleteBD, Descriptors.DESCRIPTOR$xrUnpersistSpatialAnchorCompleteBD);
        SEGMENT$xrUnpersistSpatialAnchorMSFT = loader.apply("xrUnpersistSpatialAnchorMSFT");
        HANDLE$xrUnpersistSpatialAnchorMSFT = RawFunctionLoader.link(SEGMENT$xrUnpersistSpatialAnchorMSFT, Descriptors.DESCRIPTOR$xrUnpersistSpatialAnchorMSFT);
        SEGMENT$xrUnpersistSpatialEntityAsyncEXT = loader.apply("xrUnpersistSpatialEntityAsyncEXT");
        HANDLE$xrUnpersistSpatialEntityAsyncEXT = RawFunctionLoader.link(SEGMENT$xrUnpersistSpatialEntityAsyncEXT, Descriptors.DESCRIPTOR$xrUnpersistSpatialEntityAsyncEXT);
        SEGMENT$xrUnpersistSpatialEntityCompleteEXT = loader.apply("xrUnpersistSpatialEntityCompleteEXT");
        HANDLE$xrUnpersistSpatialEntityCompleteEXT = RawFunctionLoader.link(SEGMENT$xrUnpersistSpatialEntityCompleteEXT, Descriptors.DESCRIPTOR$xrUnpersistSpatialEntityCompleteEXT);
        SEGMENT$xrUpdateHandMeshMSFT = loader.apply("xrUpdateHandMeshMSFT");
        HANDLE$xrUpdateHandMeshMSFT = RawFunctionLoader.link(SEGMENT$xrUpdateHandMeshMSFT, Descriptors.DESCRIPTOR$xrUpdateHandMeshMSFT);
        SEGMENT$xrUpdatePassthroughColorLutMETA = loader.apply("xrUpdatePassthroughColorLutMETA");
        HANDLE$xrUpdatePassthroughColorLutMETA = RawFunctionLoader.link(SEGMENT$xrUpdatePassthroughColorLutMETA, Descriptors.DESCRIPTOR$xrUpdatePassthroughColorLutMETA);
        SEGMENT$xrUpdateSpatialAnchorsExpirationAsyncML = loader.apply("xrUpdateSpatialAnchorsExpirationAsyncML");
        HANDLE$xrUpdateSpatialAnchorsExpirationAsyncML = RawFunctionLoader.link(SEGMENT$xrUpdateSpatialAnchorsExpirationAsyncML, Descriptors.DESCRIPTOR$xrUpdateSpatialAnchorsExpirationAsyncML);
        SEGMENT$xrUpdateSpatialAnchorsExpirationCompleteML = loader.apply("xrUpdateSpatialAnchorsExpirationCompleteML");
        HANDLE$xrUpdateSpatialAnchorsExpirationCompleteML = RawFunctionLoader.link(SEGMENT$xrUpdateSpatialAnchorsExpirationCompleteML, Descriptors.DESCRIPTOR$xrUpdateSpatialAnchorsExpirationCompleteML);
        SEGMENT$xrUpdateSwapchainFB = loader.apply("xrUpdateSwapchainFB");
        HANDLE$xrUpdateSwapchainFB = RawFunctionLoader.link(SEGMENT$xrUpdateSwapchainFB, Descriptors.DESCRIPTOR$xrUpdateSwapchainFB);
        SEGMENT$xrWaitFrame = loader.apply("xrWaitFrame");
        HANDLE$xrWaitFrame = RawFunctionLoader.link(SEGMENT$xrWaitFrame, Descriptors.DESCRIPTOR$xrWaitFrame);
        SEGMENT$xrWaitSwapchainImage = loader.apply("xrWaitSwapchainImage");
        HANDLE$xrWaitSwapchainImage = RawFunctionLoader.link(SEGMENT$xrWaitSwapchainImage, Descriptors.DESCRIPTOR$xrWaitSwapchainImage);
    }

    // region command wrappers

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrAcquireEnvironmentDepthImageMETA.html"><code>xrAcquireEnvironmentDepthImageMETA</code></a>
    public @EnumType(XrResult.class) int acquireEnvironmentDepthImageMETA(
        XrEnvironmentDepthProviderMETA environmentDepthProvider,
        @Pointer XrEnvironmentDepthImageAcquireInfoMETA acquireInfo,
        @Pointer XrEnvironmentDepthImageMETA environmentDepthImage
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrAcquireEnvironmentDepthImageMETA);
        try {
            return (int) hFunction.invokeExact(
                environmentDepthProvider.segment(),
                acquireInfo.segment(),
                environmentDepthImage.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrAcquireSwapchainImage.html"><code>xrAcquireSwapchainImage</code></a>
    public @EnumType(XrResult.class) int acquireSwapchainImage(
        XrSwapchain swapchain,
        @Nullable @Pointer XrSwapchainImageAcquireInfo acquireInfo,
        @Unsigned IntPtr index
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrAcquireSwapchainImage);
        try {
            return (int) hFunction.invokeExact(
                swapchain.segment(),
                (MemorySegment) (acquireInfo != null ? acquireInfo.segment() : MemorySegment.NULL),
                index.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrAllocateWorldMeshBufferML.html"><code>xrAllocateWorldMeshBufferML</code></a>
    public @EnumType(XrResult.class) int allocateWorldMeshBufferML(
        XrWorldMeshDetectorML detector,
        @Pointer XrWorldMeshBufferSizeML size,
        @Pointer XrWorldMeshBufferML buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrAllocateWorldMeshBufferML);
        try {
            return (int) hFunction.invokeExact(
                detector.segment(),
                size.segment(),
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrApplyForceFeedbackCurlMNDX.html"><code>xrApplyForceFeedbackCurlMNDX</code></a>
    public @EnumType(XrResult.class) int applyForceFeedbackCurlMNDX(
        XrHandTrackerEXT handTracker,
        @Pointer XrForceFeedbackCurlApplyLocationsMNDX locations
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrApplyForceFeedbackCurlMNDX);
        try {
            return (int) hFunction.invokeExact(
                handTracker.segment(),
                locations.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrApplyFoveationHTC.html"><code>xrApplyFoveationHTC</code></a>
    public @EnumType(XrResult.class) int applyFoveationHTC(
        XrSession session,
        @Pointer XrFoveationApplyInfoHTC applyInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrApplyFoveationHTC);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                applyInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrApplyHapticFeedback.html"><code>xrApplyHapticFeedback</code></a>
    public @EnumType(XrResult.class) int applyHapticFeedback(
        XrSession session,
        @Pointer XrHapticActionInfo hapticActionInfo,
        @Pointer XrHapticBaseHeader hapticFeedback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrApplyHapticFeedback);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                hapticActionInfo.segment(),
                hapticFeedback.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrAttachSessionActionSets.html"><code>xrAttachSessionActionSets</code></a>
    public @EnumType(XrResult.class) int attachSessionActionSets(
        XrSession session,
        @Pointer XrSessionActionSetsAttachInfo attachInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrAttachSessionActionSets);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                attachInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrBeginFrame.html"><code>xrBeginFrame</code></a>
    public @EnumType(XrResult.class) int beginFrame(
        XrSession session,
        @Nullable @Pointer XrFrameBeginInfo frameBeginInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrBeginFrame);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                (MemorySegment) (frameBeginInfo != null ? frameBeginInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrBeginPlaneDetectionEXT.html"><code>xrBeginPlaneDetectionEXT</code></a>
    public @EnumType(XrResult.class) int beginPlaneDetectionEXT(
        XrPlaneDetectorEXT planeDetector,
        @Pointer XrPlaneDetectorBeginInfoEXT beginInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrBeginPlaneDetectionEXT);
        try {
            return (int) hFunction.invokeExact(
                planeDetector.segment(),
                beginInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrBeginSession.html"><code>xrBeginSession</code></a>
    public @EnumType(XrResult.class) int beginSession(
        XrSession session,
        @Pointer XrSessionBeginInfo beginInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrBeginSession);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                beginInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCancelFutureEXT.html"><code>xrCancelFutureEXT</code></a>
    public @EnumType(XrResult.class) int cancelFutureEXT(
        XrInstance instance,
        @Pointer XrFutureCancelInfoEXT cancelInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCancelFutureEXT);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                cancelInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCaptureSceneAsyncBD.html"><code>xrCaptureSceneAsyncBD</code></a>
    public @EnumType(XrResult.class) int captureSceneAsyncBD(
        XrSenseDataProviderBD provider,
        @Pointer XrSceneCaptureInfoBD info,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCaptureSceneAsyncBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                info.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCaptureSceneCompleteBD.html"><code>xrCaptureSceneCompleteBD</code></a>
    public @EnumType(XrResult.class) int captureSceneCompleteBD(
        XrSenseDataProviderBD provider,
        XrFutureEXT future,
        @Pointer XrFutureCompletionEXT completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCaptureSceneCompleteBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrChangeVirtualKeyboardTextContextMETA.html"><code>xrChangeVirtualKeyboardTextContextMETA</code></a>
    public @EnumType(XrResult.class) int changeVirtualKeyboardTextContextMETA(
        XrVirtualKeyboardMETA keyboard,
        @Pointer XrVirtualKeyboardTextContextChangeInfoMETA changeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrChangeVirtualKeyboardTextContextMETA);
        try {
            return (int) hFunction.invokeExact(
                keyboard.segment(),
                changeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrClearSpatialAnchorStoreMSFT.html"><code>xrClearSpatialAnchorStoreMSFT</code></a>
    public @EnumType(XrResult.class) int clearSpatialAnchorStoreMSFT(
        XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrClearSpatialAnchorStoreMSFT);
        try {
            return (int) hFunction.invokeExact(
                spatialAnchorStore.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrComputeNewSceneMSFT.html"><code>xrComputeNewSceneMSFT</code></a>
    public @EnumType(XrResult.class) int computeNewSceneMSFT(
        XrSceneObserverMSFT sceneObserver,
        @Pointer XrNewSceneComputeInfoMSFT computeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrComputeNewSceneMSFT);
        try {
            return (int) hFunction.invokeExact(
                sceneObserver.segment(),
                computeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrConvertTimeToTimespecTimeKHR.html"><code>xrConvertTimeToTimespecTimeKHR</code></a>
    public @EnumType(XrResult.class) int convertTimeToTimespecTimeKHR(
        XrInstance instance,
        @NativeType("XrTime") long time,
        @Pointer(comment="void*") @NotNull MemorySegment timespecTime
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrConvertTimeToTimespecTimeKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                time,
                timespecTime
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrConvertTimeToWin32PerformanceCounterKHR.html"><code>xrConvertTimeToWin32PerformanceCounterKHR</code></a>
    public @EnumType(XrResult.class) int convertTimeToWin32PerformanceCounterKHR(
        XrInstance instance,
        @NativeType("XrTime") long time,
        @Pointer(comment="void*") @NotNull MemorySegment performanceCounter
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrConvertTimeToWin32PerformanceCounterKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                time,
                performanceCounter
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrConvertTimespecTimeToTimeKHR.html"><code>xrConvertTimespecTimeToTimeKHR</code></a>
    public @EnumType(XrResult.class) int convertTimespecTimeToTimeKHR(
        XrInstance instance,
        @Pointer(comment="void*") @NotNull MemorySegment timespecTime,
        @Pointer(comment="XrTime") LongPtr time
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrConvertTimespecTimeToTimeKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                timespecTime,
                time.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrConvertWin32PerformanceCounterToTimeKHR.html"><code>xrConvertWin32PerformanceCounterToTimeKHR</code></a>
    public @EnumType(XrResult.class) int convertWin32PerformanceCounterToTimeKHR(
        XrInstance instance,
        @Pointer(comment="void*") @NotNull MemorySegment performanceCounter,
        @Pointer(comment="XrTime") LongPtr time
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrConvertWin32PerformanceCounterToTimeKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                performanceCounter,
                time.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateAction.html"><code>xrCreateAction</code></a>
    public @EnumType(XrResult.class) int createAction(
        XrActionSet actionSet,
        @Pointer XrActionCreateInfo createInfo,
        @Pointer XrAction.Ptr action
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateAction);
        try {
            return (int) hFunction.invokeExact(
                actionSet.segment(),
                createInfo.segment(),
                action.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateActionSet.html"><code>xrCreateActionSet</code></a>
    public @EnumType(XrResult.class) int createActionSet(
        XrInstance instance,
        @Pointer XrActionSetCreateInfo createInfo,
        @Pointer XrActionSet.Ptr actionSet
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateActionSet);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                createInfo.segment(),
                actionSet.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateActionSpace.html"><code>xrCreateActionSpace</code></a>
    public @EnumType(XrResult.class) int createActionSpace(
        XrSession session,
        @Pointer XrActionSpaceCreateInfo createInfo,
        @Pointer XrSpace.Ptr space
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateActionSpace);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                space.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateAnchorSpaceBD.html"><code>xrCreateAnchorSpaceBD</code></a>
    public @EnumType(XrResult.class) int createAnchorSpaceBD(
        XrSession session,
        @Pointer XrAnchorSpaceCreateInfoBD createInfo,
        @Pointer XrSpace.Ptr space
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateAnchorSpaceBD);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                space.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateApiLayerInstance.html"><code>xrCreateApiLayerInstance</code></a>
    public @EnumType(XrResult.class) int createApiLayerInstance(
        @Pointer XrInstanceCreateInfo info,
        @Pointer XrApiLayerCreateInfo layerInfo,
        @Pointer XrInstance.Ptr instance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateApiLayerInstance);
        try {
            return (int) hFunction.invokeExact(
                info.segment(),
                layerInfo.segment(),
                instance.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateBodyTrackerBD.html"><code>xrCreateBodyTrackerBD</code></a>
    public @EnumType(XrResult.class) int createBodyTrackerBD(
        XrSession session,
        @Pointer XrBodyTrackerCreateInfoBD createInfo,
        @Pointer XrBodyTrackerBD.Ptr bodyTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateBodyTrackerBD);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                bodyTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateBodyTrackerFB.html"><code>xrCreateBodyTrackerFB</code></a>
    public @EnumType(XrResult.class) int createBodyTrackerFB(
        XrSession session,
        @Pointer XrBodyTrackerCreateInfoFB createInfo,
        @Pointer XrBodyTrackerFB.Ptr bodyTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateBodyTrackerFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                bodyTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateBodyTrackerHTC.html"><code>xrCreateBodyTrackerHTC</code></a>
    public @EnumType(XrResult.class) int createBodyTrackerHTC(
        XrSession session,
        @Pointer XrBodyTrackerCreateInfoHTC createInfo,
        @Pointer XrBodyTrackerHTC.Ptr bodyTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateBodyTrackerHTC);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                bodyTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateDebugUtilsMessengerEXT.html"><code>xrCreateDebugUtilsMessengerEXT</code></a>
    public @EnumType(XrResult.class) int createDebugUtilsMessengerEXT(
        XrInstance instance,
        @Pointer XrDebugUtilsMessengerCreateInfoEXT createInfo,
        @Pointer XrDebugUtilsMessengerEXT.Ptr messenger
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateDebugUtilsMessengerEXT);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                createInfo.segment(),
                messenger.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateEnvironmentDepthProviderMETA.html"><code>xrCreateEnvironmentDepthProviderMETA</code></a>
    public @EnumType(XrResult.class) int createEnvironmentDepthProviderMETA(
        XrSession session,
        @Pointer XrEnvironmentDepthProviderCreateInfoMETA createInfo,
        @Pointer XrEnvironmentDepthProviderMETA.Ptr environmentDepthProvider
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateEnvironmentDepthProviderMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                environmentDepthProvider.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateEnvironmentDepthSwapchainMETA.html"><code>xrCreateEnvironmentDepthSwapchainMETA</code></a>
    public @EnumType(XrResult.class) int createEnvironmentDepthSwapchainMETA(
        XrEnvironmentDepthProviderMETA environmentDepthProvider,
        @Pointer XrEnvironmentDepthSwapchainCreateInfoMETA createInfo,
        @Pointer XrEnvironmentDepthSwapchainMETA.Ptr swapchain
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateEnvironmentDepthSwapchainMETA);
        try {
            return (int) hFunction.invokeExact(
                environmentDepthProvider.segment(),
                createInfo.segment(),
                swapchain.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateExportedLocalizationMapML.html"><code>xrCreateExportedLocalizationMapML</code></a>
    public @EnumType(XrResult.class) int createExportedLocalizationMapML(
        XrSession session,
        @Pointer XrUuidEXT mapUuid,
        @Pointer XrExportedLocalizationMapML.Ptr map
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateExportedLocalizationMapML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                mapUuid.segment(),
                map.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateEyeTrackerFB.html"><code>xrCreateEyeTrackerFB</code></a>
    public @EnumType(XrResult.class) int createEyeTrackerFB(
        XrSession session,
        @Pointer XrEyeTrackerCreateInfoFB createInfo,
        @Pointer XrEyeTrackerFB.Ptr eyeTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateEyeTrackerFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                eyeTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateFaceTracker2FB.html"><code>xrCreateFaceTracker2FB</code></a>
    public @EnumType(XrResult.class) int createFaceTracker2FB(
        XrSession session,
        @Pointer XrFaceTrackerCreateInfo2FB createInfo,
        @Pointer XrFaceTracker2FB.Ptr faceTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateFaceTracker2FB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                faceTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateFaceTrackerFB.html"><code>xrCreateFaceTrackerFB</code></a>
    public @EnumType(XrResult.class) int createFaceTrackerFB(
        XrSession session,
        @Pointer XrFaceTrackerCreateInfoFB createInfo,
        @Pointer XrFaceTrackerFB.Ptr faceTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateFaceTrackerFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                faceTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateFacialExpressionClientML.html"><code>xrCreateFacialExpressionClientML</code></a>
    public @EnumType(XrResult.class) int createFacialExpressionClientML(
        XrSession session,
        @Pointer XrFacialExpressionClientCreateInfoML createInfo,
        @Pointer XrFacialExpressionClientML.Ptr facialExpressionClient
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateFacialExpressionClientML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                facialExpressionClient.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateFacialTrackerHTC.html"><code>xrCreateFacialTrackerHTC</code></a>
    public @EnumType(XrResult.class) int createFacialTrackerHTC(
        XrSession session,
        @Pointer XrFacialTrackerCreateInfoHTC createInfo,
        @Pointer XrFacialTrackerHTC.Ptr facialTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateFacialTrackerHTC);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                facialTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateFoveationProfileFB.html"><code>xrCreateFoveationProfileFB</code></a>
    public @EnumType(XrResult.class) int createFoveationProfileFB(
        XrSession session,
        @Pointer XrFoveationProfileCreateInfoFB createInfo,
        @Pointer XrFoveationProfileFB.Ptr profile
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateFoveationProfileFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                profile.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateGeometryInstanceFB.html"><code>xrCreateGeometryInstanceFB</code></a>
    public @EnumType(XrResult.class) int createGeometryInstanceFB(
        XrSession session,
        @Pointer XrGeometryInstanceCreateInfoFB createInfo,
        @Pointer XrGeometryInstanceFB.Ptr outGeometryInstance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateGeometryInstanceFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                outGeometryInstance.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateHandMeshSpaceMSFT.html"><code>xrCreateHandMeshSpaceMSFT</code></a>
    public @EnumType(XrResult.class) int createHandMeshSpaceMSFT(
        XrHandTrackerEXT handTracker,
        @Pointer XrHandMeshSpaceCreateInfoMSFT createInfo,
        @Pointer XrSpace.Ptr space
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateHandMeshSpaceMSFT);
        try {
            return (int) hFunction.invokeExact(
                handTracker.segment(),
                createInfo.segment(),
                space.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateHandTrackerEXT.html"><code>xrCreateHandTrackerEXT</code></a>
    public @EnumType(XrResult.class) int createHandTrackerEXT(
        XrSession session,
        @Pointer XrHandTrackerCreateInfoEXT createInfo,
        @Pointer XrHandTrackerEXT.Ptr handTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateHandTrackerEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                handTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateInstance.html"><code>xrCreateInstance</code></a>
    public @EnumType(XrResult.class) int createInstance(
        @Pointer XrInstanceCreateInfo createInfo,
        @Pointer XrInstance.Ptr instance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateInstance);
        try {
            return (int) hFunction.invokeExact(
                createInfo.segment(),
                instance.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateKeyboardSpaceFB.html"><code>xrCreateKeyboardSpaceFB</code></a>
    public @EnumType(XrResult.class) int createKeyboardSpaceFB(
        XrSession session,
        @Pointer XrKeyboardSpaceCreateInfoFB createInfo,
        @Pointer XrSpace.Ptr keyboardSpace
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateKeyboardSpaceFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                keyboardSpace.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateMarkerDetectorML.html"><code>xrCreateMarkerDetectorML</code></a>
    public @EnumType(XrResult.class) int createMarkerDetectorML(
        XrSession session,
        @Pointer XrMarkerDetectorCreateInfoML createInfo,
        @Pointer XrMarkerDetectorML.Ptr markerDetector
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateMarkerDetectorML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                markerDetector.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateMarkerSpaceML.html"><code>xrCreateMarkerSpaceML</code></a>
    public @EnumType(XrResult.class) int createMarkerSpaceML(
        XrSession session,
        @Pointer XrMarkerSpaceCreateInfoML createInfo,
        @Pointer XrSpace.Ptr space
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateMarkerSpaceML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                space.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateMarkerSpaceVARJO.html"><code>xrCreateMarkerSpaceVARJO</code></a>
    public @EnumType(XrResult.class) int createMarkerSpaceVARJO(
        XrSession session,
        @Pointer XrMarkerSpaceCreateInfoVARJO createInfo,
        @Pointer XrSpace.Ptr space
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateMarkerSpaceVARJO);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                space.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreatePassthroughColorLutMETA.html"><code>xrCreatePassthroughColorLutMETA</code></a>
    public @EnumType(XrResult.class) int createPassthroughColorLutMETA(
        XrPassthroughFB passthrough,
        @Pointer XrPassthroughColorLutCreateInfoMETA createInfo,
        @Pointer XrPassthroughColorLutMETA.Ptr colorLut
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreatePassthroughColorLutMETA);
        try {
            return (int) hFunction.invokeExact(
                passthrough.segment(),
                createInfo.segment(),
                colorLut.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreatePassthroughFB.html"><code>xrCreatePassthroughFB</code></a>
    public @EnumType(XrResult.class) int createPassthroughFB(
        XrSession session,
        @Pointer XrPassthroughCreateInfoFB createInfo,
        @Pointer XrPassthroughFB.Ptr outPassthrough
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreatePassthroughFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                outPassthrough.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreatePassthroughHTC.html"><code>xrCreatePassthroughHTC</code></a>
    public @EnumType(XrResult.class) int createPassthroughHTC(
        XrSession session,
        @Pointer XrPassthroughCreateInfoHTC createInfo,
        @Pointer XrPassthroughHTC.Ptr passthrough
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreatePassthroughHTC);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                passthrough.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreatePassthroughLayerFB.html"><code>xrCreatePassthroughLayerFB</code></a>
    public @EnumType(XrResult.class) int createPassthroughLayerFB(
        XrSession session,
        @Pointer XrPassthroughLayerCreateInfoFB createInfo,
        @Pointer XrPassthroughLayerFB.Ptr outLayer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreatePassthroughLayerFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                outLayer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreatePlaneDetectorEXT.html"><code>xrCreatePlaneDetectorEXT</code></a>
    public @EnumType(XrResult.class) int createPlaneDetectorEXT(
        XrSession session,
        @Pointer XrPlaneDetectorCreateInfoEXT createInfo,
        @Pointer XrPlaneDetectorEXT.Ptr planeDetector
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreatePlaneDetectorEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                planeDetector.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateReferenceSpace.html"><code>xrCreateReferenceSpace</code></a>
    public @EnumType(XrResult.class) int createReferenceSpace(
        XrSession session,
        @Pointer XrReferenceSpaceCreateInfo createInfo,
        @Pointer XrSpace.Ptr space
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateReferenceSpace);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                space.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateRenderModelAssetEXT.html"><code>xrCreateRenderModelAssetEXT</code></a>
    public @EnumType(XrResult.class) int createRenderModelAssetEXT(
        XrSession session,
        @Pointer XrRenderModelAssetCreateInfoEXT createInfo,
        @Pointer XrRenderModelAssetEXT.Ptr asset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateRenderModelAssetEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                asset.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateRenderModelEXT.html"><code>xrCreateRenderModelEXT</code></a>
    public @EnumType(XrResult.class) int createRenderModelEXT(
        XrSession session,
        @Pointer XrRenderModelCreateInfoEXT createInfo,
        @Pointer XrRenderModelEXT.Ptr renderModel
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateRenderModelEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                renderModel.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateRenderModelSpaceEXT.html"><code>xrCreateRenderModelSpaceEXT</code></a>
    public @EnumType(XrResult.class) int createRenderModelSpaceEXT(
        XrSession session,
        @Pointer XrRenderModelSpaceCreateInfoEXT createInfo,
        @Pointer XrSpace.Ptr space
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateRenderModelSpaceEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                space.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSceneMSFT.html"><code>xrCreateSceneMSFT</code></a>
    public @EnumType(XrResult.class) int createSceneMSFT(
        XrSceneObserverMSFT sceneObserver,
        @Nullable @Pointer XrSceneCreateInfoMSFT createInfo,
        @Pointer XrSceneMSFT.Ptr scene
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSceneMSFT);
        try {
            return (int) hFunction.invokeExact(
                sceneObserver.segment(),
                (MemorySegment) (createInfo != null ? createInfo.segment() : MemorySegment.NULL),
                scene.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSceneObserverMSFT.html"><code>xrCreateSceneObserverMSFT</code></a>
    public @EnumType(XrResult.class) int createSceneObserverMSFT(
        XrSession session,
        @Nullable @Pointer XrSceneObserverCreateInfoMSFT createInfo,
        @Pointer XrSceneObserverMSFT.Ptr sceneObserver
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSceneObserverMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                (MemorySegment) (createInfo != null ? createInfo.segment() : MemorySegment.NULL),
                sceneObserver.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSenseDataProviderBD.html"><code>xrCreateSenseDataProviderBD</code></a>
    public @EnumType(XrResult.class) int createSenseDataProviderBD(
        XrSession session,
        @Pointer XrSenseDataProviderCreateInfoBD createInfo,
        @Pointer XrSenseDataProviderBD.Ptr provider
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSenseDataProviderBD);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                provider.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSession.html"><code>xrCreateSession</code></a>
    public @EnumType(XrResult.class) int createSession(
        XrInstance instance,
        @Pointer XrSessionCreateInfo createInfo,
        @Pointer XrSession.Ptr session
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSession);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                createInfo.segment(),
                session.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpaceFromCoordinateFrameUIDML.html"><code>xrCreateSpaceFromCoordinateFrameUIDML</code></a>
    public @EnumType(XrResult.class) int createSpaceFromCoordinateFrameUIDML(
        XrSession session,
        @Pointer XrCoordinateSpaceCreateInfoML createInfo,
        @Pointer XrSpace.Ptr space
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpaceFromCoordinateFrameUIDML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                space.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpaceUserFB.html"><code>xrCreateSpaceUserFB</code></a>
    public @EnumType(XrResult.class) int createSpaceUserFB(
        XrSession session,
        @Pointer XrSpaceUserCreateInfoFB info,
        @Pointer XrSpaceUserFB.Ptr user
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpaceUserFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                user.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorAsyncBD.html"><code>xrCreateSpatialAnchorAsyncBD</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorAsyncBD(
        XrSenseDataProviderBD provider,
        @Pointer XrSpatialAnchorCreateInfoBD info,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorAsyncBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                info.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorCompleteBD.html"><code>xrCreateSpatialAnchorCompleteBD</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorCompleteBD(
        XrSenseDataProviderBD provider,
        XrFutureEXT future,
        @Pointer XrSpatialAnchorCreateCompletionBD completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorCompleteBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorEXT.html"><code>xrCreateSpatialAnchorEXT</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorEXT(
        XrSpatialContextEXT spatialContext,
        @Pointer XrSpatialAnchorCreateInfoEXT createInfo,
        @Pointer(comment="XrSpatialEntityIdEXT") @Unsigned LongPtr anchorEntityId,
        @Pointer XrSpatialEntityEXT.Ptr anchorEntity
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorEXT);
        try {
            return (int) hFunction.invokeExact(
                spatialContext.segment(),
                createInfo.segment(),
                anchorEntityId.segment(),
                anchorEntity.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorFB.html"><code>xrCreateSpatialAnchorFB</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorFB(
        XrSession session,
        @Pointer XrSpatialAnchorCreateInfoFB info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr requestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                requestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorFromPerceptionAnchorMSFT.html"><code>xrCreateSpatialAnchorFromPerceptionAnchorMSFT</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorFromPerceptionAnchorMSFT(
        XrSession session,
        PointerPtr perceptionAnchor,
        @Pointer XrSpatialAnchorMSFT.Ptr anchor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorFromPerceptionAnchorMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                perceptionAnchor.segment(),
                anchor.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorFromPersistedNameMSFT.html"><code>xrCreateSpatialAnchorFromPersistedNameMSFT</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorFromPersistedNameMSFT(
        XrSession session,
        @Pointer XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT spatialAnchorCreateInfo,
        @Pointer XrSpatialAnchorMSFT.Ptr spatialAnchor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorFromPersistedNameMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                spatialAnchorCreateInfo.segment(),
                spatialAnchor.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorHTC.html"><code>xrCreateSpatialAnchorHTC</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorHTC(
        XrSession session,
        @Pointer XrSpatialAnchorCreateInfoHTC createInfo,
        @Pointer XrSpace.Ptr anchor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorHTC);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                anchor.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorMSFT.html"><code>xrCreateSpatialAnchorMSFT</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorMSFT(
        XrSession session,
        @Pointer XrSpatialAnchorCreateInfoMSFT createInfo,
        @Pointer XrSpatialAnchorMSFT.Ptr anchor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                anchor.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorSpaceMSFT.html"><code>xrCreateSpatialAnchorSpaceMSFT</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorSpaceMSFT(
        XrSession session,
        @Pointer XrSpatialAnchorSpaceCreateInfoMSFT createInfo,
        @Pointer XrSpace.Ptr space
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorSpaceMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                space.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorStoreConnectionMSFT.html"><code>xrCreateSpatialAnchorStoreConnectionMSFT</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorStoreConnectionMSFT(
        XrSession session,
        @Pointer XrSpatialAnchorStoreConnectionMSFT.Ptr spatialAnchorStore
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorStoreConnectionMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                spatialAnchorStore.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorsAsyncML.html"><code>xrCreateSpatialAnchorsAsyncML</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorsAsyncML(
        XrSession session,
        @Pointer XrSpatialAnchorsCreateInfoBaseHeaderML createInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorsAsyncML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorsCompleteML.html"><code>xrCreateSpatialAnchorsCompleteML</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorsCompleteML(
        XrSession session,
        XrFutureEXT future,
        @Pointer XrCreateSpatialAnchorsCompletionML completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorsCompleteML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialAnchorsStorageML.html"><code>xrCreateSpatialAnchorsStorageML</code></a>
    public @EnumType(XrResult.class) int createSpatialAnchorsStorageML(
        XrSession session,
        @Pointer XrSpatialAnchorsCreateStorageInfoML createInfo,
        @Pointer XrSpatialAnchorsStorageML.Ptr storage
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialAnchorsStorageML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                storage.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialContextAsyncEXT.html"><code>xrCreateSpatialContextAsyncEXT</code></a>
    public @EnumType(XrResult.class) int createSpatialContextAsyncEXT(
        XrSession session,
        @Pointer XrSpatialContextCreateInfoEXT createInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialContextAsyncEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialContextCompleteEXT.html"><code>xrCreateSpatialContextCompleteEXT</code></a>
    public @EnumType(XrResult.class) int createSpatialContextCompleteEXT(
        XrSession session,
        XrFutureEXT future,
        @Pointer XrCreateSpatialContextCompletionEXT completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialContextCompleteEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialDiscoverySnapshotAsyncEXT.html"><code>xrCreateSpatialDiscoverySnapshotAsyncEXT</code></a>
    public @EnumType(XrResult.class) int createSpatialDiscoverySnapshotAsyncEXT(
        XrSpatialContextEXT spatialContext,
        @Pointer XrSpatialDiscoverySnapshotCreateInfoEXT createInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialDiscoverySnapshotAsyncEXT);
        try {
            return (int) hFunction.invokeExact(
                spatialContext.segment(),
                createInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialDiscoverySnapshotCompleteEXT.html"><code>xrCreateSpatialDiscoverySnapshotCompleteEXT</code></a>
    public @EnumType(XrResult.class) int createSpatialDiscoverySnapshotCompleteEXT(
        XrSpatialContextEXT spatialContext,
        @Pointer XrCreateSpatialDiscoverySnapshotCompletionInfoEXT createSnapshotCompletionInfo,
        @Pointer XrCreateSpatialDiscoverySnapshotCompletionEXT completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialDiscoverySnapshotCompleteEXT);
        try {
            return (int) hFunction.invokeExact(
                spatialContext.segment(),
                createSnapshotCompletionInfo.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialEntityAnchorBD.html"><code>xrCreateSpatialEntityAnchorBD</code></a>
    public @EnumType(XrResult.class) int createSpatialEntityAnchorBD(
        XrSenseDataProviderBD provider,
        @Pointer XrSpatialEntityAnchorCreateInfoBD createInfo,
        @Pointer XrAnchorBD.Ptr anchor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialEntityAnchorBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                createInfo.segment(),
                anchor.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialEntityFromIdEXT.html"><code>xrCreateSpatialEntityFromIdEXT</code></a>
    public @EnumType(XrResult.class) int createSpatialEntityFromIdEXT(
        XrSpatialContextEXT spatialContext,
        @Pointer XrSpatialEntityFromIdCreateInfoEXT createInfo,
        @Pointer XrSpatialEntityEXT.Ptr spatialEntity
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialEntityFromIdEXT);
        try {
            return (int) hFunction.invokeExact(
                spatialContext.segment(),
                createInfo.segment(),
                spatialEntity.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialGraphNodeSpaceMSFT.html"><code>xrCreateSpatialGraphNodeSpaceMSFT</code></a>
    public @EnumType(XrResult.class) int createSpatialGraphNodeSpaceMSFT(
        XrSession session,
        @Pointer XrSpatialGraphNodeSpaceCreateInfoMSFT createInfo,
        @Pointer XrSpace.Ptr space
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialGraphNodeSpaceMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                space.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialPersistenceContextAsyncEXT.html"><code>xrCreateSpatialPersistenceContextAsyncEXT</code></a>
    public @EnumType(XrResult.class) int createSpatialPersistenceContextAsyncEXT(
        XrSession session,
        @Pointer XrSpatialPersistenceContextCreateInfoEXT createInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialPersistenceContextAsyncEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialPersistenceContextCompleteEXT.html"><code>xrCreateSpatialPersistenceContextCompleteEXT</code></a>
    public @EnumType(XrResult.class) int createSpatialPersistenceContextCompleteEXT(
        XrSession session,
        XrFutureEXT future,
        @Pointer XrCreateSpatialPersistenceContextCompletionEXT completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialPersistenceContextCompleteEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSpatialUpdateSnapshotEXT.html"><code>xrCreateSpatialUpdateSnapshotEXT</code></a>
    public @EnumType(XrResult.class) int createSpatialUpdateSnapshotEXT(
        XrSpatialContextEXT spatialContext,
        @Pointer XrSpatialUpdateSnapshotCreateInfoEXT createInfo,
        @Pointer XrSpatialSnapshotEXT.Ptr snapshot
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSpatialUpdateSnapshotEXT);
        try {
            return (int) hFunction.invokeExact(
                spatialContext.segment(),
                createInfo.segment(),
                snapshot.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSwapchain.html"><code>xrCreateSwapchain</code></a>
    public @EnumType(XrResult.class) int createSwapchain(
        XrSession session,
        @Pointer XrSwapchainCreateInfo createInfo,
        @Pointer XrSwapchain.Ptr swapchain
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSwapchain);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                swapchain.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateSwapchainAndroidSurfaceKHR.html"><code>xrCreateSwapchainAndroidSurfaceKHR</code></a>
    public @EnumType(XrResult.class) int createSwapchainAndroidSurfaceKHR(
        XrSession session,
        @Pointer XrSwapchainCreateInfo info,
        @Pointer XrSwapchain.Ptr swapchain,
        PointerPtr surface
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateSwapchainAndroidSurfaceKHR);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                swapchain.segment(),
                surface.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateTriangleMeshFB.html"><code>xrCreateTriangleMeshFB</code></a>
    public @EnumType(XrResult.class) int createTriangleMeshFB(
        XrSession session,
        @Pointer XrTriangleMeshCreateInfoFB createInfo,
        @Pointer XrTriangleMeshFB.Ptr outTriangleMesh
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateTriangleMeshFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                outTriangleMesh.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateVirtualKeyboardMETA.html"><code>xrCreateVirtualKeyboardMETA</code></a>
    public @EnumType(XrResult.class) int createVirtualKeyboardMETA(
        XrSession session,
        @Pointer XrVirtualKeyboardCreateInfoMETA createInfo,
        @Pointer XrVirtualKeyboardMETA.Ptr keyboard
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateVirtualKeyboardMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                keyboard.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateVirtualKeyboardSpaceMETA.html"><code>xrCreateVirtualKeyboardSpaceMETA</code></a>
    public @EnumType(XrResult.class) int createVirtualKeyboardSpaceMETA(
        XrSession session,
        XrVirtualKeyboardMETA keyboard,
        @Pointer XrVirtualKeyboardSpaceCreateInfoMETA createInfo,
        @Pointer XrSpace.Ptr keyboardSpace
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateVirtualKeyboardSpaceMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                keyboard.segment(),
                createInfo.segment(),
                keyboardSpace.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateVulkanDeviceKHR.html"><code>xrCreateVulkanDeviceKHR</code></a>
    public @EnumType(XrResult.class) int createVulkanDeviceKHR(
        XrInstance instance,
        @Pointer XrVulkanDeviceCreateInfoKHR createInfo,
        @Pointer VkDevice.Ptr vulkanDevice,
        @EnumType(VkResult.class) IntPtr vulkanResult
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateVulkanDeviceKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                createInfo.segment(),
                vulkanDevice.segment(),
                vulkanResult.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateVulkanInstanceKHR.html"><code>xrCreateVulkanInstanceKHR</code></a>
    public @EnumType(XrResult.class) int createVulkanInstanceKHR(
        XrInstance instance,
        @Pointer XrVulkanInstanceCreateInfoKHR createInfo,
        @Pointer VkInstance.Ptr vulkanInstance,
        @EnumType(VkResult.class) IntPtr vulkanResult
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateVulkanInstanceKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                createInfo.segment(),
                vulkanInstance.segment(),
                vulkanResult.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrCreateWorldMeshDetectorML.html"><code>xrCreateWorldMeshDetectorML</code></a>
    public @EnumType(XrResult.class) int createWorldMeshDetectorML(
        XrSession session,
        @Pointer XrWorldMeshDetectorCreateInfoML createInfo,
        @Pointer XrWorldMeshDetectorML.Ptr detector
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrCreateWorldMeshDetectorML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                detector.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDeleteSpatialAnchorsAsyncML.html"><code>xrDeleteSpatialAnchorsAsyncML</code></a>
    public @EnumType(XrResult.class) int deleteSpatialAnchorsAsyncML(
        XrSpatialAnchorsStorageML storage,
        @Pointer XrSpatialAnchorsDeleteInfoML deleteInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDeleteSpatialAnchorsAsyncML);
        try {
            return (int) hFunction.invokeExact(
                storage.segment(),
                deleteInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDeleteSpatialAnchorsCompleteML.html"><code>xrDeleteSpatialAnchorsCompleteML</code></a>
    public @EnumType(XrResult.class) int deleteSpatialAnchorsCompleteML(
        XrSpatialAnchorsStorageML storage,
        XrFutureEXT future,
        @Pointer XrSpatialAnchorsDeleteCompletionML completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDeleteSpatialAnchorsCompleteML);
        try {
            return (int) hFunction.invokeExact(
                storage.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDeserializeSceneMSFT.html"><code>xrDeserializeSceneMSFT</code></a>
    public @EnumType(XrResult.class) int deserializeSceneMSFT(
        XrSceneObserverMSFT sceneObserver,
        @Pointer XrSceneDeserializeInfoMSFT deserializeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDeserializeSceneMSFT);
        try {
            return (int) hFunction.invokeExact(
                sceneObserver.segment(),
                deserializeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyAction.html"><code>xrDestroyAction</code></a>
    public @EnumType(XrResult.class) int destroyAction(
        XrAction action
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyAction);
        try {
            return (int) hFunction.invokeExact(
                action.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyActionSet.html"><code>xrDestroyActionSet</code></a>
    public @EnumType(XrResult.class) int destroyActionSet(
        XrActionSet actionSet
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyActionSet);
        try {
            return (int) hFunction.invokeExact(
                actionSet.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyAnchorBD.html"><code>xrDestroyAnchorBD</code></a>
    public @EnumType(XrResult.class) int destroyAnchorBD(
        XrAnchorBD anchor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyAnchorBD);
        try {
            return (int) hFunction.invokeExact(
                anchor.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyBodyTrackerBD.html"><code>xrDestroyBodyTrackerBD</code></a>
    public @EnumType(XrResult.class) int destroyBodyTrackerBD(
        XrBodyTrackerBD bodyTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyBodyTrackerBD);
        try {
            return (int) hFunction.invokeExact(
                bodyTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyBodyTrackerFB.html"><code>xrDestroyBodyTrackerFB</code></a>
    public @EnumType(XrResult.class) int destroyBodyTrackerFB(
        XrBodyTrackerFB bodyTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyBodyTrackerFB);
        try {
            return (int) hFunction.invokeExact(
                bodyTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyBodyTrackerHTC.html"><code>xrDestroyBodyTrackerHTC</code></a>
    public @EnumType(XrResult.class) int destroyBodyTrackerHTC(
        XrBodyTrackerHTC bodyTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyBodyTrackerHTC);
        try {
            return (int) hFunction.invokeExact(
                bodyTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyDebugUtilsMessengerEXT.html"><code>xrDestroyDebugUtilsMessengerEXT</code></a>
    public @EnumType(XrResult.class) int destroyDebugUtilsMessengerEXT(
        XrDebugUtilsMessengerEXT messenger
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyDebugUtilsMessengerEXT);
        try {
            return (int) hFunction.invokeExact(
                messenger.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyEnvironmentDepthProviderMETA.html"><code>xrDestroyEnvironmentDepthProviderMETA</code></a>
    public @EnumType(XrResult.class) int destroyEnvironmentDepthProviderMETA(
        XrEnvironmentDepthProviderMETA environmentDepthProvider
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyEnvironmentDepthProviderMETA);
        try {
            return (int) hFunction.invokeExact(
                environmentDepthProvider.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyEnvironmentDepthSwapchainMETA.html"><code>xrDestroyEnvironmentDepthSwapchainMETA</code></a>
    public @EnumType(XrResult.class) int destroyEnvironmentDepthSwapchainMETA(
        XrEnvironmentDepthSwapchainMETA swapchain
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyEnvironmentDepthSwapchainMETA);
        try {
            return (int) hFunction.invokeExact(
                swapchain.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyExportedLocalizationMapML.html"><code>xrDestroyExportedLocalizationMapML</code></a>
    public @EnumType(XrResult.class) int destroyExportedLocalizationMapML(
        XrExportedLocalizationMapML map
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyExportedLocalizationMapML);
        try {
            return (int) hFunction.invokeExact(
                map.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyEyeTrackerFB.html"><code>xrDestroyEyeTrackerFB</code></a>
    public @EnumType(XrResult.class) int destroyEyeTrackerFB(
        XrEyeTrackerFB eyeTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyEyeTrackerFB);
        try {
            return (int) hFunction.invokeExact(
                eyeTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyFaceTracker2FB.html"><code>xrDestroyFaceTracker2FB</code></a>
    public @EnumType(XrResult.class) int destroyFaceTracker2FB(
        XrFaceTracker2FB faceTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyFaceTracker2FB);
        try {
            return (int) hFunction.invokeExact(
                faceTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyFaceTrackerFB.html"><code>xrDestroyFaceTrackerFB</code></a>
    public @EnumType(XrResult.class) int destroyFaceTrackerFB(
        XrFaceTrackerFB faceTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyFaceTrackerFB);
        try {
            return (int) hFunction.invokeExact(
                faceTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyFacialExpressionClientML.html"><code>xrDestroyFacialExpressionClientML</code></a>
    public @EnumType(XrResult.class) int destroyFacialExpressionClientML(
        XrFacialExpressionClientML facialExpressionClient
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyFacialExpressionClientML);
        try {
            return (int) hFunction.invokeExact(
                facialExpressionClient.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyFacialTrackerHTC.html"><code>xrDestroyFacialTrackerHTC</code></a>
    public @EnumType(XrResult.class) int destroyFacialTrackerHTC(
        XrFacialTrackerHTC facialTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyFacialTrackerHTC);
        try {
            return (int) hFunction.invokeExact(
                facialTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyFoveationProfileFB.html"><code>xrDestroyFoveationProfileFB</code></a>
    public @EnumType(XrResult.class) int destroyFoveationProfileFB(
        XrFoveationProfileFB profile
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyFoveationProfileFB);
        try {
            return (int) hFunction.invokeExact(
                profile.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyGeometryInstanceFB.html"><code>xrDestroyGeometryInstanceFB</code></a>
    public @EnumType(XrResult.class) int destroyGeometryInstanceFB(
        XrGeometryInstanceFB instance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyGeometryInstanceFB);
        try {
            return (int) hFunction.invokeExact(
                instance.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyHandTrackerEXT.html"><code>xrDestroyHandTrackerEXT</code></a>
    public @EnumType(XrResult.class) int destroyHandTrackerEXT(
        XrHandTrackerEXT handTracker
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyHandTrackerEXT);
        try {
            return (int) hFunction.invokeExact(
                handTracker.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyInstance.html"><code>xrDestroyInstance</code></a>
    public @EnumType(XrResult.class) int destroyInstance(
        XrInstance instance
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyInstance);
        try {
            return (int) hFunction.invokeExact(
                instance.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyMarkerDetectorML.html"><code>xrDestroyMarkerDetectorML</code></a>
    public @EnumType(XrResult.class) int destroyMarkerDetectorML(
        XrMarkerDetectorML markerDetector
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyMarkerDetectorML);
        try {
            return (int) hFunction.invokeExact(
                markerDetector.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyPassthroughColorLutMETA.html"><code>xrDestroyPassthroughColorLutMETA</code></a>
    public @EnumType(XrResult.class) int destroyPassthroughColorLutMETA(
        XrPassthroughColorLutMETA colorLut
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyPassthroughColorLutMETA);
        try {
            return (int) hFunction.invokeExact(
                colorLut.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyPassthroughFB.html"><code>xrDestroyPassthroughFB</code></a>
    public @EnumType(XrResult.class) int destroyPassthroughFB(
        XrPassthroughFB passthrough
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyPassthroughFB);
        try {
            return (int) hFunction.invokeExact(
                passthrough.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyPassthroughHTC.html"><code>xrDestroyPassthroughHTC</code></a>
    public @EnumType(XrResult.class) int destroyPassthroughHTC(
        XrPassthroughHTC passthrough
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyPassthroughHTC);
        try {
            return (int) hFunction.invokeExact(
                passthrough.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyPassthroughLayerFB.html"><code>xrDestroyPassthroughLayerFB</code></a>
    public @EnumType(XrResult.class) int destroyPassthroughLayerFB(
        XrPassthroughLayerFB layer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyPassthroughLayerFB);
        try {
            return (int) hFunction.invokeExact(
                layer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyPlaneDetectorEXT.html"><code>xrDestroyPlaneDetectorEXT</code></a>
    public @EnumType(XrResult.class) int destroyPlaneDetectorEXT(
        XrPlaneDetectorEXT planeDetector
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyPlaneDetectorEXT);
        try {
            return (int) hFunction.invokeExact(
                planeDetector.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyRenderModelAssetEXT.html"><code>xrDestroyRenderModelAssetEXT</code></a>
    public @EnumType(XrResult.class) int destroyRenderModelAssetEXT(
        XrRenderModelAssetEXT asset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyRenderModelAssetEXT);
        try {
            return (int) hFunction.invokeExact(
                asset.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyRenderModelEXT.html"><code>xrDestroyRenderModelEXT</code></a>
    public @EnumType(XrResult.class) int destroyRenderModelEXT(
        XrRenderModelEXT renderModel
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyRenderModelEXT);
        try {
            return (int) hFunction.invokeExact(
                renderModel.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySceneMSFT.html"><code>xrDestroySceneMSFT</code></a>
    public @EnumType(XrResult.class) int destroySceneMSFT(
        XrSceneMSFT scene
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySceneMSFT);
        try {
            return (int) hFunction.invokeExact(
                scene.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySceneObserverMSFT.html"><code>xrDestroySceneObserverMSFT</code></a>
    public @EnumType(XrResult.class) int destroySceneObserverMSFT(
        XrSceneObserverMSFT sceneObserver
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySceneObserverMSFT);
        try {
            return (int) hFunction.invokeExact(
                sceneObserver.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySenseDataProviderBD.html"><code>xrDestroySenseDataProviderBD</code></a>
    public @EnumType(XrResult.class) int destroySenseDataProviderBD(
        XrSenseDataProviderBD provider
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySenseDataProviderBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySenseDataSnapshotBD.html"><code>xrDestroySenseDataSnapshotBD</code></a>
    public @EnumType(XrResult.class) int destroySenseDataSnapshotBD(
        XrSenseDataSnapshotBD snapshot
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySenseDataSnapshotBD);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySession.html"><code>xrDestroySession</code></a>
    public @EnumType(XrResult.class) int destroySession(
        XrSession session
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySession);
        try {
            return (int) hFunction.invokeExact(
                session.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySpace.html"><code>xrDestroySpace</code></a>
    public @EnumType(XrResult.class) int destroySpace(
        XrSpace space
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySpace);
        try {
            return (int) hFunction.invokeExact(
                space.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySpaceUserFB.html"><code>xrDestroySpaceUserFB</code></a>
    public @EnumType(XrResult.class) int destroySpaceUserFB(
        XrSpaceUserFB user
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySpaceUserFB);
        try {
            return (int) hFunction.invokeExact(
                user.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySpatialAnchorMSFT.html"><code>xrDestroySpatialAnchorMSFT</code></a>
    public @EnumType(XrResult.class) int destroySpatialAnchorMSFT(
        XrSpatialAnchorMSFT anchor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySpatialAnchorMSFT);
        try {
            return (int) hFunction.invokeExact(
                anchor.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySpatialAnchorStoreConnectionMSFT.html"><code>xrDestroySpatialAnchorStoreConnectionMSFT</code></a>
    public @EnumType(XrResult.class) int destroySpatialAnchorStoreConnectionMSFT(
        XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySpatialAnchorStoreConnectionMSFT);
        try {
            return (int) hFunction.invokeExact(
                spatialAnchorStore.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySpatialAnchorsStorageML.html"><code>xrDestroySpatialAnchorsStorageML</code></a>
    public @EnumType(XrResult.class) int destroySpatialAnchorsStorageML(
        XrSpatialAnchorsStorageML storage
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySpatialAnchorsStorageML);
        try {
            return (int) hFunction.invokeExact(
                storage.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySpatialContextEXT.html"><code>xrDestroySpatialContextEXT</code></a>
    public @EnumType(XrResult.class) int destroySpatialContextEXT(
        XrSpatialContextEXT spatialContext
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySpatialContextEXT);
        try {
            return (int) hFunction.invokeExact(
                spatialContext.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySpatialEntityEXT.html"><code>xrDestroySpatialEntityEXT</code></a>
    public @EnumType(XrResult.class) int destroySpatialEntityEXT(
        XrSpatialEntityEXT spatialEntity
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySpatialEntityEXT);
        try {
            return (int) hFunction.invokeExact(
                spatialEntity.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySpatialGraphNodeBindingMSFT.html"><code>xrDestroySpatialGraphNodeBindingMSFT</code></a>
    public @EnumType(XrResult.class) int destroySpatialGraphNodeBindingMSFT(
        XrSpatialGraphNodeBindingMSFT nodeBinding
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySpatialGraphNodeBindingMSFT);
        try {
            return (int) hFunction.invokeExact(
                nodeBinding.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySpatialPersistenceContextEXT.html"><code>xrDestroySpatialPersistenceContextEXT</code></a>
    public @EnumType(XrResult.class) int destroySpatialPersistenceContextEXT(
        XrSpatialPersistenceContextEXT persistenceContext
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySpatialPersistenceContextEXT);
        try {
            return (int) hFunction.invokeExact(
                persistenceContext.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySpatialSnapshotEXT.html"><code>xrDestroySpatialSnapshotEXT</code></a>
    public @EnumType(XrResult.class) int destroySpatialSnapshotEXT(
        XrSpatialSnapshotEXT snapshot
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySpatialSnapshotEXT);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroySwapchain.html"><code>xrDestroySwapchain</code></a>
    public @EnumType(XrResult.class) int destroySwapchain(
        XrSwapchain swapchain
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroySwapchain);
        try {
            return (int) hFunction.invokeExact(
                swapchain.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyTriangleMeshFB.html"><code>xrDestroyTriangleMeshFB</code></a>
    public @EnumType(XrResult.class) int destroyTriangleMeshFB(
        XrTriangleMeshFB mesh
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyTriangleMeshFB);
        try {
            return (int) hFunction.invokeExact(
                mesh.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyVirtualKeyboardMETA.html"><code>xrDestroyVirtualKeyboardMETA</code></a>
    public @EnumType(XrResult.class) int destroyVirtualKeyboardMETA(
        XrVirtualKeyboardMETA keyboard
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyVirtualKeyboardMETA);
        try {
            return (int) hFunction.invokeExact(
                keyboard.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDestroyWorldMeshDetectorML.html"><code>xrDestroyWorldMeshDetectorML</code></a>
    public @EnumType(XrResult.class) int destroyWorldMeshDetectorML(
        XrWorldMeshDetectorML detector
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDestroyWorldMeshDetectorML);
        try {
            return (int) hFunction.invokeExact(
                detector.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDownloadSharedSpatialAnchorAsyncBD.html"><code>xrDownloadSharedSpatialAnchorAsyncBD</code></a>
    public @EnumType(XrResult.class) int downloadSharedSpatialAnchorAsyncBD(
        XrSenseDataProviderBD provider,
        @Pointer XrSharedSpatialAnchorDownloadInfoBD info,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDownloadSharedSpatialAnchorAsyncBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                info.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrDownloadSharedSpatialAnchorCompleteBD.html"><code>xrDownloadSharedSpatialAnchorCompleteBD</code></a>
    public @EnumType(XrResult.class) int downloadSharedSpatialAnchorCompleteBD(
        XrSenseDataProviderBD provider,
        XrFutureEXT future,
        @Pointer XrFutureCompletionEXT completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrDownloadSharedSpatialAnchorCompleteBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnableLocalizationEventsML.html"><code>xrEnableLocalizationEventsML</code></a>
    public @EnumType(XrResult.class) int enableLocalizationEventsML(
        XrSession session,
        @Pointer XrLocalizationEnableEventsInfoML info
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnableLocalizationEventsML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnableUserCalibrationEventsML.html"><code>xrEnableUserCalibrationEventsML</code></a>
    public @EnumType(XrResult.class) int enableUserCalibrationEventsML(
        XrInstance instance,
        @Pointer XrUserCalibrationEnableEventsInfoML enableInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnableUserCalibrationEventsML);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                enableInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEndFrame.html"><code>xrEndFrame</code></a>
    public @EnumType(XrResult.class) int endFrame(
        XrSession session,
        @Pointer XrFrameEndInfo frameEndInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEndFrame);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                frameEndInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEndSession.html"><code>xrEndSession</code></a>
    public @EnumType(XrResult.class) int endSession(
        XrSession session
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEndSession);
        try {
            return (int) hFunction.invokeExact(
                session.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateApiLayerProperties.html"><code>xrEnumerateApiLayerProperties</code></a>
    public @EnumType(XrResult.class) int enumerateApiLayerProperties(
        @Unsigned int propertyCapacityInput,
        @Unsigned IntPtr propertyCountOutput,
        @Nullable @Pointer IXrApiLayerProperties properties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateApiLayerProperties);
        try {
            return (int) hFunction.invokeExact(
                propertyCapacityInput,
                propertyCountOutput.segment(),
                (MemorySegment) (properties != null ? properties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateBoundSourcesForAction.html"><code>xrEnumerateBoundSourcesForAction</code></a>
    public @EnumType(XrResult.class) int enumerateBoundSourcesForAction(
        XrSession session,
        @Pointer XrBoundSourcesForActionEnumerateInfo enumerateInfo,
        @Unsigned int sourceCapacityInput,
        @Unsigned IntPtr sourceCountOutput,
        @Nullable @Pointer(comment="XrPath") @Unsigned LongPtr sources
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateBoundSourcesForAction);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                enumerateInfo.segment(),
                sourceCapacityInput,
                sourceCountOutput.segment(),
                (MemorySegment) (sources != null ? sources.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateColorSpacesFB.html"><code>xrEnumerateColorSpacesFB</code></a>
    public @EnumType(XrResult.class) int enumerateColorSpacesFB(
        XrSession session,
        @Unsigned int colorSpaceCapacityInput,
        @Unsigned IntPtr colorSpaceCountOutput,
        @Nullable @EnumType(XrColorSpaceFB.class) IntPtr colorSpaces
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateColorSpacesFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                colorSpaceCapacityInput,
                colorSpaceCountOutput.segment(),
                (MemorySegment) (colorSpaces != null ? colorSpaces.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateDisplayRefreshRatesFB.html"><code>xrEnumerateDisplayRefreshRatesFB</code></a>
    public @EnumType(XrResult.class) int enumerateDisplayRefreshRatesFB(
        XrSession session,
        @Unsigned int displayRefreshRateCapacityInput,
        @Unsigned IntPtr displayRefreshRateCountOutput,
        @Nullable FloatPtr displayRefreshRates
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateDisplayRefreshRatesFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                displayRefreshRateCapacityInput,
                displayRefreshRateCountOutput.segment(),
                (MemorySegment) (displayRefreshRates != null ? displayRefreshRates.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateEnvironmentBlendModes.html"><code>xrEnumerateEnvironmentBlendModes</code></a>
    public @EnumType(XrResult.class) int enumerateEnvironmentBlendModes(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @EnumType(XrViewConfigurationType.class) int viewConfigurationType,
        @Unsigned int environmentBlendModeCapacityInput,
        @Unsigned IntPtr environmentBlendModeCountOutput,
        @Nullable @EnumType(XrEnvironmentBlendMode.class) IntPtr environmentBlendModes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateEnvironmentBlendModes);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                viewConfigurationType,
                environmentBlendModeCapacityInput,
                environmentBlendModeCountOutput.segment(),
                (MemorySegment) (environmentBlendModes != null ? environmentBlendModes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateEnvironmentDepthSwapchainImagesMETA.html"><code>xrEnumerateEnvironmentDepthSwapchainImagesMETA</code></a>
    public @EnumType(XrResult.class) int enumerateEnvironmentDepthSwapchainImagesMETA(
        XrEnvironmentDepthSwapchainMETA swapchain,
        @Unsigned int imageCapacityInput,
        @Unsigned IntPtr imageCountOutput,
        @Nullable @Pointer IXrSwapchainImageBaseHeader images
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateEnvironmentDepthSwapchainImagesMETA);
        try {
            return (int) hFunction.invokeExact(
                swapchain.segment(),
                imageCapacityInput,
                imageCountOutput.segment(),
                (MemorySegment) (images != null ? images.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateExternalCamerasOCULUS.html"><code>xrEnumerateExternalCamerasOCULUS</code></a>
    public @EnumType(XrResult.class) int enumerateExternalCamerasOCULUS(
        XrSession session,
        @Unsigned int cameraCapacityInput,
        @Unsigned IntPtr cameraCountOutput,
        @Nullable @Pointer IXrExternalCameraOCULUS cameras
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateExternalCamerasOCULUS);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                cameraCapacityInput,
                cameraCountOutput.segment(),
                (MemorySegment) (cameras != null ? cameras.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateInstanceExtensionProperties.html"><code>xrEnumerateInstanceExtensionProperties</code></a>
    public @EnumType(XrResult.class) int enumerateInstanceExtensionProperties(
        @Nullable BytePtr layerName,
        @Unsigned int propertyCapacityInput,
        @Unsigned IntPtr propertyCountOutput,
        @Nullable @Pointer IXrExtensionProperties properties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateInstanceExtensionProperties);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (layerName != null ? layerName.segment() : MemorySegment.NULL),
                propertyCapacityInput,
                propertyCountOutput.segment(),
                (MemorySegment) (properties != null ? properties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateInteractionRenderModelIdsEXT.html"><code>xrEnumerateInteractionRenderModelIdsEXT</code></a>
    public @EnumType(XrResult.class) int enumerateInteractionRenderModelIdsEXT(
        XrSession session,
        @Pointer XrInteractionRenderModelIdsEnumerateInfoEXT getInfo,
        @Unsigned int renderModelIdCapacityInput,
        @Unsigned IntPtr renderModelIdCountOutput,
        @Nullable @Pointer(comment="XrRenderModelIdEXT") @Unsigned LongPtr renderModelIds
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateInteractionRenderModelIdsEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                getInfo.segment(),
                renderModelIdCapacityInput,
                renderModelIdCountOutput.segment(),
                (MemorySegment) (renderModelIds != null ? renderModelIds.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumeratePerformanceMetricsCounterPathsMETA.html"><code>xrEnumeratePerformanceMetricsCounterPathsMETA</code></a>
    public @EnumType(XrResult.class) int enumeratePerformanceMetricsCounterPathsMETA(
        XrInstance instance,
        @Unsigned int counterPathCapacityInput,
        @Unsigned IntPtr counterPathCountOutput,
        @Nullable @Pointer(comment="XrPath") @Unsigned LongPtr counterPaths
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumeratePerformanceMetricsCounterPathsMETA);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                counterPathCapacityInput,
                counterPathCountOutput.segment(),
                (MemorySegment) (counterPaths != null ? counterPaths.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumeratePersistedSpatialAnchorNamesMSFT.html"><code>xrEnumeratePersistedSpatialAnchorNamesMSFT</code></a>
    public @EnumType(XrResult.class) int enumeratePersistedSpatialAnchorNamesMSFT(
        XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore,
        @Unsigned int spatialAnchorNameCapacityInput,
        @Unsigned IntPtr spatialAnchorNameCountOutput,
        @Nullable @Pointer IXrSpatialAnchorPersistenceNameMSFT spatialAnchorNames
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumeratePersistedSpatialAnchorNamesMSFT);
        try {
            return (int) hFunction.invokeExact(
                spatialAnchorStore.segment(),
                spatialAnchorNameCapacityInput,
                spatialAnchorNameCountOutput.segment(),
                (MemorySegment) (spatialAnchorNames != null ? spatialAnchorNames.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateReferenceSpaces.html"><code>xrEnumerateReferenceSpaces</code></a>
    public @EnumType(XrResult.class) int enumerateReferenceSpaces(
        XrSession session,
        @Unsigned int spaceCapacityInput,
        @Unsigned IntPtr spaceCountOutput,
        @Nullable @EnumType(XrReferenceSpaceType.class) IntPtr spaces
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateReferenceSpaces);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                spaceCapacityInput,
                spaceCountOutput.segment(),
                (MemorySegment) (spaces != null ? spaces.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateRenderModelPathsFB.html"><code>xrEnumerateRenderModelPathsFB</code></a>
    public @EnumType(XrResult.class) int enumerateRenderModelPathsFB(
        XrSession session,
        @Unsigned int pathCapacityInput,
        @Unsigned IntPtr pathCountOutput,
        @Nullable @Pointer IXrRenderModelPathInfoFB paths
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateRenderModelPathsFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                pathCapacityInput,
                pathCountOutput.segment(),
                (MemorySegment) (paths != null ? paths.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateRenderModelSubactionPathsEXT.html"><code>xrEnumerateRenderModelSubactionPathsEXT</code></a>
    public @EnumType(XrResult.class) int enumerateRenderModelSubactionPathsEXT(
        XrRenderModelEXT renderModel,
        @Nullable @Pointer XrInteractionRenderModelSubactionPathInfoEXT info,
        @Unsigned int pathCapacityInput,
        @Unsigned IntPtr pathCountOutput,
        @Nullable @Pointer(comment="XrPath") @Unsigned LongPtr paths
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateRenderModelSubactionPathsEXT);
        try {
            return (int) hFunction.invokeExact(
                renderModel.segment(),
                (MemorySegment) (info != null ? info.segment() : MemorySegment.NULL),
                pathCapacityInput,
                pathCountOutput.segment(),
                (MemorySegment) (paths != null ? paths.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateReprojectionModesMSFT.html"><code>xrEnumerateReprojectionModesMSFT</code></a>
    public @EnumType(XrResult.class) int enumerateReprojectionModesMSFT(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @EnumType(XrViewConfigurationType.class) int viewConfigurationType,
        @Unsigned int modeCapacityInput,
        @Unsigned IntPtr modeCountOutput,
        @Nullable @EnumType(XrReprojectionModeMSFT.class) IntPtr modes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateReprojectionModesMSFT);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                viewConfigurationType,
                modeCapacityInput,
                modeCountOutput.segment(),
                (MemorySegment) (modes != null ? modes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateSceneComputeFeaturesMSFT.html"><code>xrEnumerateSceneComputeFeaturesMSFT</code></a>
    public @EnumType(XrResult.class) int enumerateSceneComputeFeaturesMSFT(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Unsigned int featureCapacityInput,
        @Unsigned IntPtr featureCountOutput,
        @Nullable @EnumType(XrSceneComputeFeatureMSFT.class) IntPtr features
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateSceneComputeFeaturesMSFT);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                featureCapacityInput,
                featureCountOutput.segment(),
                (MemorySegment) (features != null ? features.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateSpaceSupportedComponentsFB.html"><code>xrEnumerateSpaceSupportedComponentsFB</code></a>
    public @EnumType(XrResult.class) int enumerateSpaceSupportedComponentsFB(
        XrSpace space,
        @Unsigned int componentTypeCapacityInput,
        @Unsigned IntPtr componentTypeCountOutput,
        @Nullable @EnumType(XrSpaceComponentTypeFB.class) IntPtr componentTypes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateSpaceSupportedComponentsFB);
        try {
            return (int) hFunction.invokeExact(
                space.segment(),
                componentTypeCapacityInput,
                componentTypeCountOutput.segment(),
                (MemorySegment) (componentTypes != null ? componentTypes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateSpatialCapabilitiesEXT.html"><code>xrEnumerateSpatialCapabilitiesEXT</code></a>
    public @EnumType(XrResult.class) int enumerateSpatialCapabilitiesEXT(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Unsigned int capabilityCapacityInput,
        @Unsigned IntPtr capabilityCountOutput,
        @Nullable @EnumType(XrSpatialCapabilityEXT.class) IntPtr capabilities
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateSpatialCapabilitiesEXT);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                capabilityCapacityInput,
                capabilityCountOutput.segment(),
                (MemorySegment) (capabilities != null ? capabilities.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateSpatialCapabilityComponentTypesEXT.html"><code>xrEnumerateSpatialCapabilityComponentTypesEXT</code></a>
    public @EnumType(XrResult.class) int enumerateSpatialCapabilityComponentTypesEXT(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @EnumType(XrSpatialCapabilityEXT.class) int capability,
        @Pointer XrSpatialCapabilityComponentTypesEXT capabilityComponents
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateSpatialCapabilityComponentTypesEXT);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                capability,
                capabilityComponents.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateSpatialCapabilityFeaturesEXT.html"><code>xrEnumerateSpatialCapabilityFeaturesEXT</code></a>
    public @EnumType(XrResult.class) int enumerateSpatialCapabilityFeaturesEXT(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @EnumType(XrSpatialCapabilityEXT.class) int capability,
        @Unsigned int capabilityFeatureCapacityInput,
        @Unsigned IntPtr capabilityFeatureCountOutput,
        @Nullable @EnumType(XrSpatialCapabilityFeatureEXT.class) IntPtr capabilityFeatures
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateSpatialCapabilityFeaturesEXT);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                capability,
                capabilityFeatureCapacityInput,
                capabilityFeatureCountOutput.segment(),
                (MemorySegment) (capabilityFeatures != null ? capabilityFeatures.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateSpatialEntityComponentTypesBD.html"><code>xrEnumerateSpatialEntityComponentTypesBD</code></a>
    public @EnumType(XrResult.class) int enumerateSpatialEntityComponentTypesBD(
        XrSenseDataSnapshotBD snapshot,
        @NativeType("XrSpatialEntityIdBD") @Unsigned long entityId,
        @Unsigned int componentTypeCapacityInput,
        @Unsigned IntPtr componentTypeCountOutput,
        @Nullable @EnumType(XrSpatialEntityComponentTypeBD.class) IntPtr componentTypes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateSpatialEntityComponentTypesBD);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                entityId,
                componentTypeCapacityInput,
                componentTypeCountOutput.segment(),
                (MemorySegment) (componentTypes != null ? componentTypes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateSpatialPersistenceScopesEXT.html"><code>xrEnumerateSpatialPersistenceScopesEXT</code></a>
    public @EnumType(XrResult.class) int enumerateSpatialPersistenceScopesEXT(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Unsigned int persistenceScopeCapacityInput,
        @Unsigned IntPtr persistenceScopeCountOutput,
        @Nullable @EnumType(XrSpatialPersistenceScopeEXT.class) IntPtr persistenceScopes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateSpatialPersistenceScopesEXT);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                persistenceScopeCapacityInput,
                persistenceScopeCountOutput.segment(),
                (MemorySegment) (persistenceScopes != null ? persistenceScopes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateSwapchainFormats.html"><code>xrEnumerateSwapchainFormats</code></a>
    public @EnumType(XrResult.class) int enumerateSwapchainFormats(
        XrSession session,
        @Unsigned int formatCapacityInput,
        @Unsigned IntPtr formatCountOutput,
        @Nullable LongPtr formats
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateSwapchainFormats);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                formatCapacityInput,
                formatCountOutput.segment(),
                (MemorySegment) (formats != null ? formats.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateSwapchainImages.html"><code>xrEnumerateSwapchainImages</code></a>
    public @EnumType(XrResult.class) int enumerateSwapchainImages(
        XrSwapchain swapchain,
        @Unsigned int imageCapacityInput,
        @Unsigned IntPtr imageCountOutput,
        @Nullable @Pointer IXrSwapchainImageBaseHeader images
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateSwapchainImages);
        try {
            return (int) hFunction.invokeExact(
                swapchain.segment(),
                imageCapacityInput,
                imageCountOutput.segment(),
                (MemorySegment) (images != null ? images.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateViewConfigurationViews.html"><code>xrEnumerateViewConfigurationViews</code></a>
    public @EnumType(XrResult.class) int enumerateViewConfigurationViews(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @EnumType(XrViewConfigurationType.class) int viewConfigurationType,
        @Unsigned int viewCapacityInput,
        @Unsigned IntPtr viewCountOutput,
        @Nullable @Pointer IXrViewConfigurationView views
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateViewConfigurationViews);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                viewConfigurationType,
                viewCapacityInput,
                viewCountOutput.segment(),
                (MemorySegment) (views != null ? views.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateViewConfigurations.html"><code>xrEnumerateViewConfigurations</code></a>
    public @EnumType(XrResult.class) int enumerateViewConfigurations(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Unsigned int viewConfigurationTypeCapacityInput,
        @Unsigned IntPtr viewConfigurationTypeCountOutput,
        @Nullable @EnumType(XrViewConfigurationType.class) IntPtr viewConfigurationTypes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateViewConfigurations);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                viewConfigurationTypeCapacityInput,
                viewConfigurationTypeCountOutput.segment(),
                (MemorySegment) (viewConfigurationTypes != null ? viewConfigurationTypes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEnumerateViveTrackerPathsHTCX.html"><code>xrEnumerateViveTrackerPathsHTCX</code></a>
    public @EnumType(XrResult.class) int enumerateViveTrackerPathsHTCX(
        XrInstance instance,
        @Unsigned int pathCapacityInput,
        @Unsigned IntPtr pathCountOutput,
        @Nullable @Pointer IXrViveTrackerPathsHTCX paths
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEnumerateViveTrackerPathsHTCX);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                pathCapacityInput,
                pathCountOutput.segment(),
                (MemorySegment) (paths != null ? paths.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrEraseSpaceFB.html"><code>xrEraseSpaceFB</code></a>
    public @EnumType(XrResult.class) int eraseSpaceFB(
        XrSession session,
        @Pointer XrSpaceEraseInfoFB info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr requestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrEraseSpaceFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                requestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrFreeWorldMeshBufferML.html"><code>xrFreeWorldMeshBufferML</code></a>
    public @EnumType(XrResult.class) int freeWorldMeshBufferML(
        XrWorldMeshDetectorML detector,
        @Pointer XrWorldMeshBufferML buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrFreeWorldMeshBufferML);
        try {
            return (int) hFunction.invokeExact(
                detector.segment(),
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGeometryInstanceSetTransformFB.html"><code>xrGeometryInstanceSetTransformFB</code></a>
    public @EnumType(XrResult.class) int geometryInstanceSetTransformFB(
        XrGeometryInstanceFB instance,
        @Pointer XrGeometryInstanceTransformFB transformation
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGeometryInstanceSetTransformFB);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                transformation.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetActionStateBoolean.html"><code>xrGetActionStateBoolean</code></a>
    public @EnumType(XrResult.class) int getActionStateBoolean(
        XrSession session,
        @Pointer XrActionStateGetInfo getInfo,
        @Pointer XrActionStateBoolean state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetActionStateBoolean);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                getInfo.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetActionStateFloat.html"><code>xrGetActionStateFloat</code></a>
    public @EnumType(XrResult.class) int getActionStateFloat(
        XrSession session,
        @Pointer XrActionStateGetInfo getInfo,
        @Pointer XrActionStateFloat state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetActionStateFloat);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                getInfo.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetActionStatePose.html"><code>xrGetActionStatePose</code></a>
    public @EnumType(XrResult.class) int getActionStatePose(
        XrSession session,
        @Pointer XrActionStateGetInfo getInfo,
        @Pointer XrActionStatePose state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetActionStatePose);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                getInfo.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetActionStateVector2f.html"><code>xrGetActionStateVector2f</code></a>
    public @EnumType(XrResult.class) int getActionStateVector2f(
        XrSession session,
        @Pointer XrActionStateGetInfo getInfo,
        @Pointer XrActionStateVector2f state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetActionStateVector2f);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                getInfo.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetAnchorUuidBD.html"><code>xrGetAnchorUuidBD</code></a>
    public @EnumType(XrResult.class) int getAnchorUuidBD(
        XrAnchorBD anchor,
        @Pointer XrUuidEXT uuid
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetAnchorUuidBD);
        try {
            return (int) hFunction.invokeExact(
                anchor.segment(),
                uuid.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetAudioInputDeviceGuidOculus.html"><code>xrGetAudioInputDeviceGuidOculus</code></a>
    public @EnumType(XrResult.class) int getAudioInputDeviceGuidOculus(
            XrInstance instance,
            WCharPtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetAudioInputDeviceGuidOculus);
        try {
            return (int) hFunction.invokeExact(
                    instance.segment(),
                    buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetAudioOutputDeviceGuidOculus.html"><code>xrGetAudioOutputDeviceGuidOculus</code></a>
    public @EnumType(XrResult.class) int getAudioOutputDeviceGuidOculus(
            XrInstance instance,
            WCharPtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetAudioOutputDeviceGuidOculus);
        try {
            return (int) hFunction.invokeExact(
                    instance.segment(),
                    buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetBodySkeletonFB.html"><code>xrGetBodySkeletonFB</code></a>
    public @EnumType(XrResult.class) int getBodySkeletonFB(
        XrBodyTrackerFB bodyTracker,
        @Pointer XrBodySkeletonFB skeleton
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetBodySkeletonFB);
        try {
            return (int) hFunction.invokeExact(
                bodyTracker.segment(),
                skeleton.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetBodySkeletonHTC.html"><code>xrGetBodySkeletonHTC</code></a>
    public @EnumType(XrResult.class) int getBodySkeletonHTC(
        XrBodyTrackerHTC bodyTracker,
        XrSpace baseSpace,
        @Unsigned int skeletonGenerationId,
        @Pointer XrBodySkeletonHTC skeleton
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetBodySkeletonHTC);
        try {
            return (int) hFunction.invokeExact(
                bodyTracker.segment(),
                baseSpace.segment(),
                skeletonGenerationId,
                skeleton.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetControllerModelKeyMSFT.html"><code>xrGetControllerModelKeyMSFT</code></a>
    public @EnumType(XrResult.class) int getControllerModelKeyMSFT(
        XrSession session,
        @NativeType("XrPath") @Unsigned long topLevelUserPath,
        @Pointer XrControllerModelKeyStateMSFT controllerModelKeyState
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetControllerModelKeyMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                topLevelUserPath,
                controllerModelKeyState.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetControllerModelPropertiesMSFT.html"><code>xrGetControllerModelPropertiesMSFT</code></a>
    public @EnumType(XrResult.class) int getControllerModelPropertiesMSFT(
        XrSession session,
        @NativeType("XrControllerModelKeyMSFT") @Unsigned long modelKey,
        @Pointer XrControllerModelPropertiesMSFT properties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetControllerModelPropertiesMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                modelKey,
                properties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetControllerModelStateMSFT.html"><code>xrGetControllerModelStateMSFT</code></a>
    public @EnumType(XrResult.class) int getControllerModelStateMSFT(
        XrSession session,
        @NativeType("XrControllerModelKeyMSFT") @Unsigned long modelKey,
        @Pointer XrControllerModelStateMSFT state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetControllerModelStateMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                modelKey,
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetCurrentInteractionProfile.html"><code>xrGetCurrentInteractionProfile</code></a>
    public @EnumType(XrResult.class) int getCurrentInteractionProfile(
        XrSession session,
        @NativeType("XrPath") @Unsigned long topLevelUserPath,
        @Pointer XrInteractionProfileState interactionProfile
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetCurrentInteractionProfile);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                topLevelUserPath,
                interactionProfile.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetD3D11GraphicsRequirementsKHR.html"><code>xrGetD3D11GraphicsRequirementsKHR</code></a>
    public @EnumType(XrResult.class) int getD3D11GraphicsRequirementsKHR(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Pointer XrGraphicsRequirementsD3D11KHR graphicsRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetD3D11GraphicsRequirementsKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                graphicsRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetD3D12GraphicsRequirementsKHR.html"><code>xrGetD3D12GraphicsRequirementsKHR</code></a>
    public @EnumType(XrResult.class) int getD3D12GraphicsRequirementsKHR(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Pointer XrGraphicsRequirementsD3D12KHR graphicsRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetD3D12GraphicsRequirementsKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                graphicsRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetDeviceSampleRateFB.html"><code>xrGetDeviceSampleRateFB</code></a>
    public @EnumType(XrResult.class) int getDeviceSampleRateFB(
        XrSession session,
        @Pointer XrHapticActionInfo hapticActionInfo,
        @Pointer XrDevicePcmSampleRateGetInfoFB deviceSampleRate
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetDeviceSampleRateFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                hapticActionInfo.segment(),
                deviceSampleRate.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetDisplayRefreshRateFB.html"><code>xrGetDisplayRefreshRateFB</code></a>
    public @EnumType(XrResult.class) int getDisplayRefreshRateFB(
        XrSession session,
        FloatPtr displayRefreshRate
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetDisplayRefreshRateFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                displayRefreshRate.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetEnvironmentDepthSwapchainStateMETA.html"><code>xrGetEnvironmentDepthSwapchainStateMETA</code></a>
    public @EnumType(XrResult.class) int getEnvironmentDepthSwapchainStateMETA(
        XrEnvironmentDepthSwapchainMETA swapchain,
        @Pointer XrEnvironmentDepthSwapchainStateMETA state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetEnvironmentDepthSwapchainStateMETA);
        try {
            return (int) hFunction.invokeExact(
                swapchain.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetExportedLocalizationMapDataML.html"><code>xrGetExportedLocalizationMapDataML</code></a>
    public @EnumType(XrResult.class) int getExportedLocalizationMapDataML(
        XrExportedLocalizationMapML map,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetExportedLocalizationMapDataML);
        try {
            return (int) hFunction.invokeExact(
                map.segment(),
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetEyeGazesFB.html"><code>xrGetEyeGazesFB</code></a>
    public @EnumType(XrResult.class) int getEyeGazesFB(
        XrEyeTrackerFB eyeTracker,
        @Pointer XrEyeGazesInfoFB gazeInfo,
        @Pointer XrEyeGazesFB eyeGazes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetEyeGazesFB);
        try {
            return (int) hFunction.invokeExact(
                eyeTracker.segment(),
                gazeInfo.segment(),
                eyeGazes.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetFaceExpressionWeights2FB.html"><code>xrGetFaceExpressionWeights2FB</code></a>
    public @EnumType(XrResult.class) int getFaceExpressionWeights2FB(
        XrFaceTracker2FB faceTracker,
        @Pointer XrFaceExpressionInfo2FB expressionInfo,
        @Pointer XrFaceExpressionWeights2FB expressionWeights
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetFaceExpressionWeights2FB);
        try {
            return (int) hFunction.invokeExact(
                faceTracker.segment(),
                expressionInfo.segment(),
                expressionWeights.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetFaceExpressionWeightsFB.html"><code>xrGetFaceExpressionWeightsFB</code></a>
    public @EnumType(XrResult.class) int getFaceExpressionWeightsFB(
        XrFaceTrackerFB faceTracker,
        @Pointer XrFaceExpressionInfoFB expressionInfo,
        @Pointer XrFaceExpressionWeightsFB expressionWeights
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetFaceExpressionWeightsFB);
        try {
            return (int) hFunction.invokeExact(
                faceTracker.segment(),
                expressionInfo.segment(),
                expressionWeights.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetFacialExpressionBlendShapePropertiesML.html"><code>xrGetFacialExpressionBlendShapePropertiesML</code></a>
    public @EnumType(XrResult.class) int getFacialExpressionBlendShapePropertiesML(
        XrFacialExpressionClientML facialExpressionClient,
        @Pointer XrFacialExpressionBlendShapeGetInfoML blendShapeGetInfo,
        @Unsigned int blendShapeCount,
        @Pointer IXrFacialExpressionBlendShapePropertiesML blendShapes
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetFacialExpressionBlendShapePropertiesML);
        try {
            return (int) hFunction.invokeExact(
                facialExpressionClient.segment(),
                blendShapeGetInfo.segment(),
                blendShapeCount,
                blendShapes.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetFacialExpressionsHTC.html"><code>xrGetFacialExpressionsHTC</code></a>
    public @EnumType(XrResult.class) int getFacialExpressionsHTC(
        XrFacialTrackerHTC facialTracker,
        @Pointer XrFacialExpressionsHTC facialExpressions
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetFacialExpressionsHTC);
        try {
            return (int) hFunction.invokeExact(
                facialTracker.segment(),
                facialExpressions.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetFoveationEyeTrackedStateMETA.html"><code>xrGetFoveationEyeTrackedStateMETA</code></a>
    public @EnumType(XrResult.class) int getFoveationEyeTrackedStateMETA(
        XrSession session,
        @Pointer XrFoveationEyeTrackedStateMETA foveationState
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetFoveationEyeTrackedStateMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                foveationState.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetHandMeshFB.html"><code>xrGetHandMeshFB</code></a>
    public @EnumType(XrResult.class) int getHandMeshFB(
        XrHandTrackerEXT handTracker,
        @Pointer XrHandTrackingMeshFB mesh
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetHandMeshFB);
        try {
            return (int) hFunction.invokeExact(
                handTracker.segment(),
                mesh.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetInputSourceLocalizedName.html"><code>xrGetInputSourceLocalizedName</code></a>
    public @EnumType(XrResult.class) int getInputSourceLocalizedName(
        XrSession session,
        @Pointer XrInputSourceLocalizedNameGetInfo getInfo,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetInputSourceLocalizedName);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                getInfo.segment(),
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetInstanceProcAddr.html"><code>xrGetInstanceProcAddr</code></a>
    public @EnumType(XrResult.class) int getInstanceProcAddr(
        @Nullable XrInstance instance,
        BytePtr name,
        PointerPtr function
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetInstanceProcAddr);
        try {
            return (int) hFunction.invokeExact(
                (MemorySegment) (instance != null ? instance.segment() : MemorySegment.NULL),
                name.segment(),
                function.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetInstanceProperties.html"><code>xrGetInstanceProperties</code></a>
    public @EnumType(XrResult.class) int getInstanceProperties(
        XrInstance instance,
        @Pointer XrInstanceProperties instanceProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetInstanceProperties);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                instanceProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetMarkerDetectorStateML.html"><code>xrGetMarkerDetectorStateML</code></a>
    public @EnumType(XrResult.class) int getMarkerDetectorStateML(
        XrMarkerDetectorML markerDetector,
        @Pointer XrMarkerDetectorStateML state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetMarkerDetectorStateML);
        try {
            return (int) hFunction.invokeExact(
                markerDetector.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetMarkerLengthML.html"><code>xrGetMarkerLengthML</code></a>
    public @EnumType(XrResult.class) int getMarkerLengthML(
        XrMarkerDetectorML markerDetector,
        @NativeType("XrMarkerML") @Unsigned long marker,
        FloatPtr meters
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetMarkerLengthML);
        try {
            return (int) hFunction.invokeExact(
                markerDetector.segment(),
                marker,
                meters.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetMarkerNumberML.html"><code>xrGetMarkerNumberML</code></a>
    public @EnumType(XrResult.class) int getMarkerNumberML(
        XrMarkerDetectorML markerDetector,
        @NativeType("XrMarkerML") @Unsigned long marker,
        @Unsigned LongPtr number
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetMarkerNumberML);
        try {
            return (int) hFunction.invokeExact(
                markerDetector.segment(),
                marker,
                number.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetMarkerReprojectionErrorML.html"><code>xrGetMarkerReprojectionErrorML</code></a>
    public @EnumType(XrResult.class) int getMarkerReprojectionErrorML(
        XrMarkerDetectorML markerDetector,
        @NativeType("XrMarkerML") @Unsigned long marker,
        FloatPtr reprojectionErrorMeters
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetMarkerReprojectionErrorML);
        try {
            return (int) hFunction.invokeExact(
                markerDetector.segment(),
                marker,
                reprojectionErrorMeters.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetMarkerSizeVARJO.html"><code>xrGetMarkerSizeVARJO</code></a>
    public @EnumType(XrResult.class) int getMarkerSizeVARJO(
        XrSession session,
        @Unsigned long markerId,
        @Pointer XrExtent2Df size
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetMarkerSizeVARJO);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                markerId,
                size.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetMarkerStringML.html"><code>xrGetMarkerStringML</code></a>
    public @EnumType(XrResult.class) int getMarkerStringML(
        XrMarkerDetectorML markerDetector,
        @NativeType("XrMarkerML") @Unsigned long marker,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetMarkerStringML);
        try {
            return (int) hFunction.invokeExact(
                markerDetector.segment(),
                marker,
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetMarkersML.html"><code>xrGetMarkersML</code></a>
    public @EnumType(XrResult.class) int getMarkersML(
        XrMarkerDetectorML markerDetector,
        @Unsigned int markerCapacityInput,
        @Unsigned IntPtr markerCountOutput,
        @Nullable @Pointer(comment="XrMarkerML") @Unsigned LongPtr markers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetMarkersML);
        try {
            return (int) hFunction.invokeExact(
                markerDetector.segment(),
                markerCapacityInput,
                markerCountOutput.segment(),
                (MemorySegment) (markers != null ? markers.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetMetalGraphicsRequirementsKHR.html"><code>xrGetMetalGraphicsRequirementsKHR</code></a>
    public @EnumType(XrResult.class) int getMetalGraphicsRequirementsKHR(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Pointer XrGraphicsRequirementsMetalKHR graphicsRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetMetalGraphicsRequirementsKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                graphicsRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetOpenGLESGraphicsRequirementsKHR.html"><code>xrGetOpenGLESGraphicsRequirementsKHR</code></a>
    public @EnumType(XrResult.class) int getOpenGLESGraphicsRequirementsKHR(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Pointer XrGraphicsRequirementsOpenGLESKHR graphicsRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetOpenGLESGraphicsRequirementsKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                graphicsRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetOpenGLGraphicsRequirementsKHR.html"><code>xrGetOpenGLGraphicsRequirementsKHR</code></a>
    public @EnumType(XrResult.class) int getOpenGLGraphicsRequirementsKHR(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Pointer XrGraphicsRequirementsOpenGLKHR graphicsRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetOpenGLGraphicsRequirementsKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                graphicsRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetPassthroughPreferencesMETA.html"><code>xrGetPassthroughPreferencesMETA</code></a>
    public @EnumType(XrResult.class) int getPassthroughPreferencesMETA(
        XrSession session,
        @Pointer XrPassthroughPreferencesMETA preferences
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetPassthroughPreferencesMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                preferences.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetPerformanceMetricsStateMETA.html"><code>xrGetPerformanceMetricsStateMETA</code></a>
    public @EnumType(XrResult.class) int getPerformanceMetricsStateMETA(
        XrSession session,
        @Pointer XrPerformanceMetricsStateMETA state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetPerformanceMetricsStateMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetPlaneDetectionStateEXT.html"><code>xrGetPlaneDetectionStateEXT</code></a>
    public @EnumType(XrResult.class) int getPlaneDetectionStateEXT(
        XrPlaneDetectorEXT planeDetector,
        @EnumType(XrPlaneDetectionStateEXT.class) IntPtr state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetPlaneDetectionStateEXT);
        try {
            return (int) hFunction.invokeExact(
                planeDetector.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetPlaneDetectionsEXT.html"><code>xrGetPlaneDetectionsEXT</code></a>
    public @EnumType(XrResult.class) int getPlaneDetectionsEXT(
        XrPlaneDetectorEXT planeDetector,
        @Pointer XrPlaneDetectorGetInfoEXT info,
        @Pointer XrPlaneDetectorLocationsEXT locations
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetPlaneDetectionsEXT);
        try {
            return (int) hFunction.invokeExact(
                planeDetector.segment(),
                info.segment(),
                locations.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetPlanePolygonBufferEXT.html"><code>xrGetPlanePolygonBufferEXT</code></a>
    public @EnumType(XrResult.class) int getPlanePolygonBufferEXT(
        XrPlaneDetectorEXT planeDetector,
        @Unsigned long planeId,
        @Unsigned int polygonBufferIndex,
        @Pointer XrPlaneDetectorPolygonBufferEXT polygonBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetPlanePolygonBufferEXT);
        try {
            return (int) hFunction.invokeExact(
                planeDetector.segment(),
                planeId,
                polygonBufferIndex,
                polygonBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetQueriedSenseDataBD.html"><code>xrGetQueriedSenseDataBD</code></a>
    public @EnumType(XrResult.class) int getQueriedSenseDataBD(
        XrSenseDataSnapshotBD snapshot,
        @Pointer XrQueriedSenseDataGetInfoBD getInfo,
        @Pointer XrQueriedSenseDataBD queriedSenseData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetQueriedSenseDataBD);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                getInfo.segment(),
                queriedSenseData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetRecommendedLayerResolutionMETA.html"><code>xrGetRecommendedLayerResolutionMETA</code></a>
    public @EnumType(XrResult.class) int getRecommendedLayerResolutionMETA(
        XrSession session,
        @Pointer XrRecommendedLayerResolutionGetInfoMETA info,
        @Pointer XrRecommendedLayerResolutionMETA resolution
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetRecommendedLayerResolutionMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                resolution.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetReferenceSpaceBoundsRect.html"><code>xrGetReferenceSpaceBoundsRect</code></a>
    public @EnumType(XrResult.class) int getReferenceSpaceBoundsRect(
        XrSession session,
        @EnumType(XrReferenceSpaceType.class) int referenceSpaceType,
        @Pointer XrExtent2Df bounds
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetReferenceSpaceBoundsRect);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                referenceSpaceType,
                bounds.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetRenderModelAssetDataEXT.html"><code>xrGetRenderModelAssetDataEXT</code></a>
    public @EnumType(XrResult.class) int getRenderModelAssetDataEXT(
        XrRenderModelAssetEXT asset,
        @Nullable @Pointer XrRenderModelAssetDataGetInfoEXT getInfo,
        @Pointer XrRenderModelAssetDataEXT buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetRenderModelAssetDataEXT);
        try {
            return (int) hFunction.invokeExact(
                asset.segment(),
                (MemorySegment) (getInfo != null ? getInfo.segment() : MemorySegment.NULL),
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetRenderModelAssetPropertiesEXT.html"><code>xrGetRenderModelAssetPropertiesEXT</code></a>
    public @EnumType(XrResult.class) int getRenderModelAssetPropertiesEXT(
        XrRenderModelAssetEXT asset,
        @Nullable @Pointer XrRenderModelAssetPropertiesGetInfoEXT getInfo,
        @Pointer XrRenderModelAssetPropertiesEXT properties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetRenderModelAssetPropertiesEXT);
        try {
            return (int) hFunction.invokeExact(
                asset.segment(),
                (MemorySegment) (getInfo != null ? getInfo.segment() : MemorySegment.NULL),
                properties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetRenderModelPoseTopLevelUserPathEXT.html"><code>xrGetRenderModelPoseTopLevelUserPathEXT</code></a>
    public @EnumType(XrResult.class) int getRenderModelPoseTopLevelUserPathEXT(
        XrRenderModelEXT renderModel,
        @Pointer XrInteractionRenderModelTopLevelUserPathGetInfoEXT info,
        @Pointer(comment="XrPath") @Unsigned LongPtr topLevelUserPath
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetRenderModelPoseTopLevelUserPathEXT);
        try {
            return (int) hFunction.invokeExact(
                renderModel.segment(),
                info.segment(),
                topLevelUserPath.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetRenderModelPropertiesEXT.html"><code>xrGetRenderModelPropertiesEXT</code></a>
    public @EnumType(XrResult.class) int getRenderModelPropertiesEXT(
        XrRenderModelEXT renderModel,
        @Nullable @Pointer XrRenderModelPropertiesGetInfoEXT getInfo,
        @Pointer XrRenderModelPropertiesEXT properties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetRenderModelPropertiesEXT);
        try {
            return (int) hFunction.invokeExact(
                renderModel.segment(),
                (MemorySegment) (getInfo != null ? getInfo.segment() : MemorySegment.NULL),
                properties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetRenderModelPropertiesFB.html"><code>xrGetRenderModelPropertiesFB</code></a>
    public @EnumType(XrResult.class) int getRenderModelPropertiesFB(
        XrSession session,
        @NativeType("XrPath") @Unsigned long path,
        @Pointer XrRenderModelPropertiesFB properties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetRenderModelPropertiesFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                path,
                properties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetRenderModelStateEXT.html"><code>xrGetRenderModelStateEXT</code></a>
    public @EnumType(XrResult.class) int getRenderModelStateEXT(
        XrRenderModelEXT renderModel,
        @Pointer XrRenderModelStateGetInfoEXT getInfo,
        @Pointer XrRenderModelStateEXT state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetRenderModelStateEXT);
        try {
            return (int) hFunction.invokeExact(
                renderModel.segment(),
                getInfo.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSceneComponentsMSFT.html"><code>xrGetSceneComponentsMSFT</code></a>
    public @EnumType(XrResult.class) int getSceneComponentsMSFT(
        XrSceneMSFT scene,
        @Pointer XrSceneComponentsGetInfoMSFT getInfo,
        @Pointer XrSceneComponentsMSFT components
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSceneComponentsMSFT);
        try {
            return (int) hFunction.invokeExact(
                scene.segment(),
                getInfo.segment(),
                components.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSceneComputeStateMSFT.html"><code>xrGetSceneComputeStateMSFT</code></a>
    public @EnumType(XrResult.class) int getSceneComputeStateMSFT(
        XrSceneObserverMSFT sceneObserver,
        @EnumType(XrSceneComputeStateMSFT.class) IntPtr state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSceneComputeStateMSFT);
        try {
            return (int) hFunction.invokeExact(
                sceneObserver.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSceneMarkerDecodedStringMSFT.html"><code>xrGetSceneMarkerDecodedStringMSFT</code></a>
    public @EnumType(XrResult.class) int getSceneMarkerDecodedStringMSFT(
        XrSceneMSFT scene,
        @Pointer XrUuidMSFT markerId,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSceneMarkerDecodedStringMSFT);
        try {
            return (int) hFunction.invokeExact(
                scene.segment(),
                markerId.segment(),
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSceneMarkerRawDataMSFT.html"><code>xrGetSceneMarkerRawDataMSFT</code></a>
    public @EnumType(XrResult.class) int getSceneMarkerRawDataMSFT(
        XrSceneMSFT scene,
        @Pointer XrUuidMSFT markerId,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable @Unsigned BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSceneMarkerRawDataMSFT);
        try {
            return (int) hFunction.invokeExact(
                scene.segment(),
                markerId.segment(),
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSceneMeshBuffersMSFT.html"><code>xrGetSceneMeshBuffersMSFT</code></a>
    public @EnumType(XrResult.class) int getSceneMeshBuffersMSFT(
        XrSceneMSFT scene,
        @Pointer XrSceneMeshBuffersGetInfoMSFT getInfo,
        @Pointer XrSceneMeshBuffersMSFT buffers
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSceneMeshBuffersMSFT);
        try {
            return (int) hFunction.invokeExact(
                scene.segment(),
                getInfo.segment(),
                buffers.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSenseDataProviderStateBD.html"><code>xrGetSenseDataProviderStateBD</code></a>
    public @EnumType(XrResult.class) int getSenseDataProviderStateBD(
        XrSenseDataProviderBD provider,
        @EnumType(XrSenseDataProviderStateBD.class) IntPtr state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSenseDataProviderStateBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSerializedSceneFragmentDataMSFT.html"><code>xrGetSerializedSceneFragmentDataMSFT</code></a>
    public @EnumType(XrResult.class) int getSerializedSceneFragmentDataMSFT(
        XrSceneMSFT scene,
        @Pointer XrSerializedSceneFragmentDataGetInfoMSFT getInfo,
        @Unsigned int countInput,
        @Unsigned IntPtr readOutput,
        @Nullable @Unsigned BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSerializedSceneFragmentDataMSFT);
        try {
            return (int) hFunction.invokeExact(
                scene.segment(),
                getInfo.segment(),
                countInput,
                readOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpaceBoundary2DFB.html"><code>xrGetSpaceBoundary2DFB</code></a>
    public @EnumType(XrResult.class) int getSpaceBoundary2DFB(
        XrSession session,
        XrSpace space,
        @Pointer XrBoundary2DFB boundary2DOutput
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpaceBoundary2DFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                space.segment(),
                boundary2DOutput.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpaceBoundingBox2DFB.html"><code>xrGetSpaceBoundingBox2DFB</code></a>
    public @EnumType(XrResult.class) int getSpaceBoundingBox2DFB(
        XrSession session,
        XrSpace space,
        @Pointer XrRect2Df boundingBox2DOutput
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpaceBoundingBox2DFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                space.segment(),
                boundingBox2DOutput.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpaceBoundingBox3DFB.html"><code>xrGetSpaceBoundingBox3DFB</code></a>
    public @EnumType(XrResult.class) int getSpaceBoundingBox3DFB(
        XrSession session,
        XrSpace space,
        @Pointer XrRect3DfFB boundingBox3DOutput
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpaceBoundingBox3DFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                space.segment(),
                boundingBox3DOutput.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpaceComponentStatusFB.html"><code>xrGetSpaceComponentStatusFB</code></a>
    public @EnumType(XrResult.class) int getSpaceComponentStatusFB(
        XrSpace space,
        @EnumType(XrSpaceComponentTypeFB.class) int componentType,
        @Pointer XrSpaceComponentStatusFB status
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpaceComponentStatusFB);
        try {
            return (int) hFunction.invokeExact(
                space.segment(),
                componentType,
                status.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpaceContainerFB.html"><code>xrGetSpaceContainerFB</code></a>
    public @EnumType(XrResult.class) int getSpaceContainerFB(
        XrSession session,
        XrSpace space,
        @Pointer XrSpaceContainerFB spaceContainerOutput
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpaceContainerFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                space.segment(),
                spaceContainerOutput.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpaceRoomLayoutFB.html"><code>xrGetSpaceRoomLayoutFB</code></a>
    public @EnumType(XrResult.class) int getSpaceRoomLayoutFB(
        XrSession session,
        XrSpace space,
        @Pointer XrRoomLayoutFB roomLayoutOutput
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpaceRoomLayoutFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                space.segment(),
                roomLayoutOutput.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpaceSemanticLabelsFB.html"><code>xrGetSpaceSemanticLabelsFB</code></a>
    public @EnumType(XrResult.class) int getSpaceSemanticLabelsFB(
        XrSession session,
        XrSpace space,
        @Pointer XrSemanticLabelsFB semanticLabelsOutput
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpaceSemanticLabelsFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                space.segment(),
                semanticLabelsOutput.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpaceTriangleMeshMETA.html"><code>xrGetSpaceTriangleMeshMETA</code></a>
    public @EnumType(XrResult.class) int getSpaceTriangleMeshMETA(
        XrSpace space,
        @Pointer XrSpaceTriangleMeshGetInfoMETA getInfo,
        @Pointer XrSpaceTriangleMeshMETA triangleMeshOutput
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpaceTriangleMeshMETA);
        try {
            return (int) hFunction.invokeExact(
                space.segment(),
                getInfo.segment(),
                triangleMeshOutput.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpaceUserIdFB.html"><code>xrGetSpaceUserIdFB</code></a>
    public @EnumType(XrResult.class) int getSpaceUserIdFB(
        XrSpaceUserFB user,
        @Pointer(comment="XrSpaceUserIdFB") @Unsigned LongPtr userId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpaceUserIdFB);
        try {
            return (int) hFunction.invokeExact(
                user.segment(),
                userId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpaceUuidFB.html"><code>xrGetSpaceUuidFB</code></a>
    public @EnumType(XrResult.class) int getSpaceUuidFB(
        XrSpace space,
        @Pointer XrUuidEXT uuid
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpaceUuidFB);
        try {
            return (int) hFunction.invokeExact(
                space.segment(),
                uuid.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialAnchorNameHTC.html"><code>xrGetSpatialAnchorNameHTC</code></a>
    public @EnumType(XrResult.class) int getSpatialAnchorNameHTC(
        XrSpace anchor,
        @Pointer XrSpatialAnchorNameHTC name
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialAnchorNameHTC);
        try {
            return (int) hFunction.invokeExact(
                anchor.segment(),
                name.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialAnchorStateML.html"><code>xrGetSpatialAnchorStateML</code></a>
    public @EnumType(XrResult.class) int getSpatialAnchorStateML(
        XrSpace anchor,
        @Pointer XrSpatialAnchorStateML state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialAnchorStateML);
        try {
            return (int) hFunction.invokeExact(
                anchor.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialBufferFloatEXT.html"><code>xrGetSpatialBufferFloatEXT</code></a>
    public @EnumType(XrResult.class) int getSpatialBufferFloatEXT(
        XrSpatialSnapshotEXT snapshot,
        @Pointer XrSpatialBufferGetInfoEXT info,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable FloatPtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialBufferFloatEXT);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                info.segment(),
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialBufferStringEXT.html"><code>xrGetSpatialBufferStringEXT</code></a>
    public @EnumType(XrResult.class) int getSpatialBufferStringEXT(
        XrSpatialSnapshotEXT snapshot,
        @Pointer XrSpatialBufferGetInfoEXT info,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialBufferStringEXT);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                info.segment(),
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialBufferUint16EXT.html"><code>xrGetSpatialBufferUint16EXT</code></a>
    public @EnumType(XrResult.class) int getSpatialBufferUint16EXT(
        XrSpatialSnapshotEXT snapshot,
        @Pointer XrSpatialBufferGetInfoEXT info,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable @Unsigned ShortPtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialBufferUint16EXT);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                info.segment(),
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialBufferUint32EXT.html"><code>xrGetSpatialBufferUint32EXT</code></a>
    public @EnumType(XrResult.class) int getSpatialBufferUint32EXT(
        XrSpatialSnapshotEXT snapshot,
        @Pointer XrSpatialBufferGetInfoEXT info,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable @Unsigned IntPtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialBufferUint32EXT);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                info.segment(),
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialBufferUint8EXT.html"><code>xrGetSpatialBufferUint8EXT</code></a>
    public @EnumType(XrResult.class) int getSpatialBufferUint8EXT(
        XrSpatialSnapshotEXT snapshot,
        @Pointer XrSpatialBufferGetInfoEXT info,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable @Unsigned BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialBufferUint8EXT);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                info.segment(),
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialBufferVector2fEXT.html"><code>xrGetSpatialBufferVector2fEXT</code></a>
    public @EnumType(XrResult.class) int getSpatialBufferVector2fEXT(
        XrSpatialSnapshotEXT snapshot,
        @Pointer XrSpatialBufferGetInfoEXT info,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable @Pointer IXrVector2f buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialBufferVector2fEXT);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                info.segment(),
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialBufferVector3fEXT.html"><code>xrGetSpatialBufferVector3fEXT</code></a>
    public @EnumType(XrResult.class) int getSpatialBufferVector3fEXT(
        XrSpatialSnapshotEXT snapshot,
        @Pointer XrSpatialBufferGetInfoEXT info,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable @Pointer IXrVector3f buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialBufferVector3fEXT);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                info.segment(),
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialEntityComponentDataBD.html"><code>xrGetSpatialEntityComponentDataBD</code></a>
    public @EnumType(XrResult.class) int getSpatialEntityComponentDataBD(
        XrSenseDataSnapshotBD snapshot,
        @Pointer XrSpatialEntityComponentGetInfoBD getInfo,
        @Pointer XrSpatialEntityComponentDataBaseHeaderBD componentData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialEntityComponentDataBD);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                getInfo.segment(),
                componentData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialEntityUuidBD.html"><code>xrGetSpatialEntityUuidBD</code></a>
    public @EnumType(XrResult.class) int getSpatialEntityUuidBD(
        XrSenseDataSnapshotBD snapshot,
        @NativeType("XrSpatialEntityIdBD") @Unsigned long entityId,
        @Pointer XrUuidEXT uuid
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialEntityUuidBD);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                entityId,
                uuid.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSpatialGraphNodeBindingPropertiesMSFT.html"><code>xrGetSpatialGraphNodeBindingPropertiesMSFT</code></a>
    public @EnumType(XrResult.class) int getSpatialGraphNodeBindingPropertiesMSFT(
        XrSpatialGraphNodeBindingMSFT nodeBinding,
        @Nullable @Pointer XrSpatialGraphNodeBindingPropertiesGetInfoMSFT getInfo,
        @Pointer XrSpatialGraphNodeBindingPropertiesMSFT properties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSpatialGraphNodeBindingPropertiesMSFT);
        try {
            return (int) hFunction.invokeExact(
                nodeBinding.segment(),
                (MemorySegment) (getInfo != null ? getInfo.segment() : MemorySegment.NULL),
                properties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSwapchainStateFB.html"><code>xrGetSwapchainStateFB</code></a>
    public @EnumType(XrResult.class) int getSwapchainStateFB(
        XrSwapchain swapchain,
        @Pointer XrSwapchainStateBaseHeaderFB state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSwapchainStateFB);
        try {
            return (int) hFunction.invokeExact(
                swapchain.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSystem.html"><code>xrGetSystem</code></a>
    public @EnumType(XrResult.class) int getSystem(
        XrInstance instance,
        @Pointer XrSystemGetInfo getInfo,
        @Pointer(comment="XrSystemId") @Unsigned LongPtr systemId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSystem);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                getInfo.segment(),
                systemId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetSystemProperties.html"><code>xrGetSystemProperties</code></a>
    public @EnumType(XrResult.class) int getSystemProperties(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Pointer XrSystemProperties properties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetSystemProperties);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                properties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetViewConfigurationProperties.html"><code>xrGetViewConfigurationProperties</code></a>
    public @EnumType(XrResult.class) int getViewConfigurationProperties(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @EnumType(XrViewConfigurationType.class) int viewConfigurationType,
        @Pointer XrViewConfigurationProperties configurationProperties
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetViewConfigurationProperties);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                viewConfigurationType,
                configurationProperties.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetVirtualKeyboardDirtyTexturesMETA.html"><code>xrGetVirtualKeyboardDirtyTexturesMETA</code></a>
    public @EnumType(XrResult.class) int getVirtualKeyboardDirtyTexturesMETA(
        XrVirtualKeyboardMETA keyboard,
        @Unsigned int textureIdCapacityInput,
        @Unsigned IntPtr textureIdCountOutput,
        @Nullable @Unsigned LongPtr textureIds
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetVirtualKeyboardDirtyTexturesMETA);
        try {
            return (int) hFunction.invokeExact(
                keyboard.segment(),
                textureIdCapacityInput,
                textureIdCountOutput.segment(),
                (MemorySegment) (textureIds != null ? textureIds.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetVirtualKeyboardModelAnimationStatesMETA.html"><code>xrGetVirtualKeyboardModelAnimationStatesMETA</code></a>
    public @EnumType(XrResult.class) int getVirtualKeyboardModelAnimationStatesMETA(
        XrVirtualKeyboardMETA keyboard,
        @Pointer XrVirtualKeyboardModelAnimationStatesMETA animationStates
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetVirtualKeyboardModelAnimationStatesMETA);
        try {
            return (int) hFunction.invokeExact(
                keyboard.segment(),
                animationStates.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetVirtualKeyboardScaleMETA.html"><code>xrGetVirtualKeyboardScaleMETA</code></a>
    public @EnumType(XrResult.class) int getVirtualKeyboardScaleMETA(
        XrVirtualKeyboardMETA keyboard,
        FloatPtr scale
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetVirtualKeyboardScaleMETA);
        try {
            return (int) hFunction.invokeExact(
                keyboard.segment(),
                scale.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetVirtualKeyboardTextureDataMETA.html"><code>xrGetVirtualKeyboardTextureDataMETA</code></a>
    public @EnumType(XrResult.class) int getVirtualKeyboardTextureDataMETA(
        XrVirtualKeyboardMETA keyboard,
        @Unsigned long textureId,
        @Pointer XrVirtualKeyboardTextureDataMETA textureData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetVirtualKeyboardTextureDataMETA);
        try {
            return (int) hFunction.invokeExact(
                keyboard.segment(),
                textureId,
                textureData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetVisibilityMaskKHR.html"><code>xrGetVisibilityMaskKHR</code></a>
    public @EnumType(XrResult.class) int getVisibilityMaskKHR(
        XrSession session,
        @EnumType(XrViewConfigurationType.class) int viewConfigurationType,
        @Unsigned int viewIndex,
        @EnumType(XrVisibilityMaskTypeKHR.class) int visibilityMaskType,
        @Pointer XrVisibilityMaskKHR visibilityMask
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetVisibilityMaskKHR);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                viewConfigurationType,
                viewIndex,
                visibilityMaskType,
                visibilityMask.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetVulkanDeviceExtensionsKHR.html"><code>xrGetVulkanDeviceExtensionsKHR</code></a>
    public @EnumType(XrResult.class) int getVulkanDeviceExtensionsKHR(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetVulkanDeviceExtensionsKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetVulkanGraphicsDevice2KHR.html"><code>xrGetVulkanGraphicsDevice2KHR</code></a>
    public @EnumType(XrResult.class) int getVulkanGraphicsDevice2KHR(
        XrInstance instance,
        @Pointer XrVulkanGraphicsDeviceGetInfoKHR getInfo,
        @Pointer VkPhysicalDevice.Ptr vulkanPhysicalDevice
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetVulkanGraphicsDevice2KHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                getInfo.segment(),
                vulkanPhysicalDevice.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetVulkanGraphicsDeviceKHR.html"><code>xrGetVulkanGraphicsDeviceKHR</code></a>
    public @EnumType(XrResult.class) int getVulkanGraphicsDeviceKHR(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        VkInstance vkInstance,
        @Pointer VkPhysicalDevice.Ptr vkPhysicalDevice
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetVulkanGraphicsDeviceKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                vkInstance.segment(),
                vkPhysicalDevice.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetVulkanGraphicsRequirements2KHR.html"><code>xrGetVulkanGraphicsRequirements2KHR</code></a>
    public @EnumType(XrResult.class) int getVulkanGraphicsRequirements2KHR(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Pointer XrGraphicsRequirementsVulkanKHR graphicsRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetVulkanGraphicsRequirements2KHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                graphicsRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetVulkanGraphicsRequirementsKHR.html"><code>xrGetVulkanGraphicsRequirementsKHR</code></a>
    public @EnumType(XrResult.class) int getVulkanGraphicsRequirementsKHR(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Pointer XrGraphicsRequirementsVulkanKHR graphicsRequirements
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetVulkanGraphicsRequirementsKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                graphicsRequirements.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetVulkanInstanceExtensionsKHR.html"><code>xrGetVulkanInstanceExtensionsKHR</code></a>
    public @EnumType(XrResult.class) int getVulkanInstanceExtensionsKHR(
        XrInstance instance,
        @NativeType("XrSystemId") @Unsigned long systemId,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetVulkanInstanceExtensionsKHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                systemId,
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrGetWorldMeshBufferRecommendSizeML.html"><code>xrGetWorldMeshBufferRecommendSizeML</code></a>
    public @EnumType(XrResult.class) int getWorldMeshBufferRecommendSizeML(
        XrWorldMeshDetectorML detector,
        @Pointer XrWorldMeshBufferRecommendedSizeInfoML sizeInfo,
        @Pointer XrWorldMeshBufferSizeML size
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrGetWorldMeshBufferRecommendSizeML);
        try {
            return (int) hFunction.invokeExact(
                detector.segment(),
                sizeInfo.segment(),
                size.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrImportLocalizationMapML.html"><code>xrImportLocalizationMapML</code></a>
    public @EnumType(XrResult.class) int importLocalizationMapML(
        XrSession session,
        @Pointer XrLocalizationMapImportInfoML importInfo,
        @Nullable @Pointer XrUuidEXT mapUuid
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrImportLocalizationMapML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                importInfo.segment(),
                (MemorySegment) (mapUuid != null ? mapUuid.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrInitializeLoaderKHR.html"><code>xrInitializeLoaderKHR</code></a>
    public @EnumType(XrResult.class) int initializeLoaderKHR(
        @Pointer XrLoaderInitInfoBaseHeaderKHR loaderInitInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrInitializeLoaderKHR);
        try {
            return (int) hFunction.invokeExact(
                loaderInitInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrLoadControllerModelMSFT.html"><code>xrLoadControllerModelMSFT</code></a>
    public @EnumType(XrResult.class) int loadControllerModelMSFT(
        XrSession session,
        @NativeType("XrControllerModelKeyMSFT") @Unsigned long modelKey,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable @Unsigned BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrLoadControllerModelMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                modelKey,
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrLoadRenderModelFB.html"><code>xrLoadRenderModelFB</code></a>
    public @EnumType(XrResult.class) int loadRenderModelFB(
        XrSession session,
        @Pointer XrRenderModelLoadInfoFB info,
        @Pointer XrRenderModelBufferFB buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrLoadRenderModelFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrLocateBodyJointsBD.html"><code>xrLocateBodyJointsBD</code></a>
    public @EnumType(XrResult.class) int locateBodyJointsBD(
        XrBodyTrackerBD bodyTracker,
        @Pointer XrBodyJointsLocateInfoBD locateInfo,
        @Pointer XrBodyJointLocationsBD locations
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrLocateBodyJointsBD);
        try {
            return (int) hFunction.invokeExact(
                bodyTracker.segment(),
                locateInfo.segment(),
                locations.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrLocateBodyJointsFB.html"><code>xrLocateBodyJointsFB</code></a>
    public @EnumType(XrResult.class) int locateBodyJointsFB(
        XrBodyTrackerFB bodyTracker,
        @Pointer XrBodyJointsLocateInfoFB locateInfo,
        @Pointer XrBodyJointLocationsFB locations
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrLocateBodyJointsFB);
        try {
            return (int) hFunction.invokeExact(
                bodyTracker.segment(),
                locateInfo.segment(),
                locations.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrLocateBodyJointsHTC.html"><code>xrLocateBodyJointsHTC</code></a>
    public @EnumType(XrResult.class) int locateBodyJointsHTC(
        XrBodyTrackerHTC bodyTracker,
        @Pointer XrBodyJointsLocateInfoHTC locateInfo,
        @Pointer XrBodyJointLocationsHTC locations
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrLocateBodyJointsHTC);
        try {
            return (int) hFunction.invokeExact(
                bodyTracker.segment(),
                locateInfo.segment(),
                locations.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrLocateHandJointsEXT.html"><code>xrLocateHandJointsEXT</code></a>
    public @EnumType(XrResult.class) int locateHandJointsEXT(
        XrHandTrackerEXT handTracker,
        @Pointer XrHandJointsLocateInfoEXT locateInfo,
        @Pointer XrHandJointLocationsEXT locations
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrLocateHandJointsEXT);
        try {
            return (int) hFunction.invokeExact(
                handTracker.segment(),
                locateInfo.segment(),
                locations.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrLocateSceneComponentsMSFT.html"><code>xrLocateSceneComponentsMSFT</code></a>
    public @EnumType(XrResult.class) int locateSceneComponentsMSFT(
        XrSceneMSFT scene,
        @Pointer XrSceneComponentsLocateInfoMSFT locateInfo,
        @Pointer XrSceneComponentLocationsMSFT locations
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrLocateSceneComponentsMSFT);
        try {
            return (int) hFunction.invokeExact(
                scene.segment(),
                locateInfo.segment(),
                locations.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrLocateSpace.html"><code>xrLocateSpace</code></a>
    public @EnumType(XrResult.class) int locateSpace(
        XrSpace space,
        XrSpace baseSpace,
        @NativeType("XrTime") long time,
        @Pointer XrSpaceLocation location
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrLocateSpace);
        try {
            return (int) hFunction.invokeExact(
                space.segment(),
                baseSpace.segment(),
                time,
                location.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrLocateSpaces.html"><code>xrLocateSpaces</code></a>
    public @EnumType(XrResult.class) int locateSpaces(
        XrSession session,
        @Pointer XrSpacesLocateInfo locateInfo,
        @Pointer XrSpaceLocations spaceLocations
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrLocateSpaces);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                locateInfo.segment(),
                spaceLocations.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrLocateSpacesKHR.html"><code>xrLocateSpacesKHR</code></a>
    public @EnumType(XrResult.class) int locateSpacesKHR(
        XrSession session,
        @Pointer XrSpacesLocateInfo locateInfo,
        @Pointer XrSpaceLocations spaceLocations
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrLocateSpacesKHR);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                locateInfo.segment(),
                spaceLocations.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrLocateViews.html"><code>xrLocateViews</code></a>
    public @EnumType(XrResult.class) int locateViews(
        XrSession session,
        @Pointer XrViewLocateInfo viewLocateInfo,
        @Pointer XrViewState viewState,
        @Unsigned int viewCapacityInput,
        @Unsigned IntPtr viewCountOutput,
        @Nullable @Pointer IXrView views
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrLocateViews);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                viewLocateInfo.segment(),
                viewState.segment(),
                viewCapacityInput,
                viewCountOutput.segment(),
                (MemorySegment) (views != null ? views.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrNegotiateLoaderApiLayerInterface.html"><code>xrNegotiateLoaderApiLayerInterface</code></a>
    public @EnumType(XrResult.class) int negotiateLoaderApiLayerInterface(
        @Pointer XrNegotiateLoaderInfo loaderInfo,
        BytePtr layerName,
        @Pointer XrNegotiateApiLayerRequest apiLayerRequest
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrNegotiateLoaderApiLayerInterface);
        try {
            return (int) hFunction.invokeExact(
                loaderInfo.segment(),
                layerName.segment(),
                apiLayerRequest.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrNegotiateLoaderRuntimeInterface.html"><code>xrNegotiateLoaderRuntimeInterface</code></a>
    public @EnumType(XrResult.class) int negotiateLoaderRuntimeInterface(
        @Pointer XrNegotiateLoaderInfo loaderInfo,
        @Pointer XrNegotiateRuntimeRequest runtimeRequest
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrNegotiateLoaderRuntimeInterface);
        try {
            return (int) hFunction.invokeExact(
                loaderInfo.segment(),
                runtimeRequest.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPassthroughLayerPauseFB.html"><code>xrPassthroughLayerPauseFB</code></a>
    public @EnumType(XrResult.class) int passthroughLayerPauseFB(
        XrPassthroughLayerFB layer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPassthroughLayerPauseFB);
        try {
            return (int) hFunction.invokeExact(
                layer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPassthroughLayerResumeFB.html"><code>xrPassthroughLayerResumeFB</code></a>
    public @EnumType(XrResult.class) int passthroughLayerResumeFB(
        XrPassthroughLayerFB layer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPassthroughLayerResumeFB);
        try {
            return (int) hFunction.invokeExact(
                layer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPassthroughLayerSetKeyboardHandsIntensityFB.html"><code>xrPassthroughLayerSetKeyboardHandsIntensityFB</code></a>
    public @EnumType(XrResult.class) int passthroughLayerSetKeyboardHandsIntensityFB(
        XrPassthroughLayerFB layer,
        @Pointer XrPassthroughKeyboardHandsIntensityFB intensity
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPassthroughLayerSetKeyboardHandsIntensityFB);
        try {
            return (int) hFunction.invokeExact(
                layer.segment(),
                intensity.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPassthroughLayerSetStyleFB.html"><code>xrPassthroughLayerSetStyleFB</code></a>
    public @EnumType(XrResult.class) int passthroughLayerSetStyleFB(
        XrPassthroughLayerFB layer,
        @Pointer XrPassthroughStyleFB style
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPassthroughLayerSetStyleFB);
        try {
            return (int) hFunction.invokeExact(
                layer.segment(),
                style.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPassthroughPauseFB.html"><code>xrPassthroughPauseFB</code></a>
    public @EnumType(XrResult.class) int passthroughPauseFB(
        XrPassthroughFB passthrough
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPassthroughPauseFB);
        try {
            return (int) hFunction.invokeExact(
                passthrough.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPassthroughStartFB.html"><code>xrPassthroughStartFB</code></a>
    public @EnumType(XrResult.class) int passthroughStartFB(
        XrPassthroughFB passthrough
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPassthroughStartFB);
        try {
            return (int) hFunction.invokeExact(
                passthrough.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPathToString.html"><code>xrPathToString</code></a>
    public @EnumType(XrResult.class) int pathToString(
        XrInstance instance,
        @NativeType("XrPath") @Unsigned long path,
        @Unsigned int bufferCapacityInput,
        @Unsigned IntPtr bufferCountOutput,
        @Nullable BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPathToString);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                path,
                bufferCapacityInput,
                bufferCountOutput.segment(),
                (MemorySegment) (buffer != null ? buffer.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPauseSimultaneousHandsAndControllersTrackingMETA.html"><code>xrPauseSimultaneousHandsAndControllersTrackingMETA</code></a>
    public @EnumType(XrResult.class) int pauseSimultaneousHandsAndControllersTrackingMETA(
        XrSession session,
        @Pointer XrSimultaneousHandsAndControllersTrackingPauseInfoMETA pauseInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPauseSimultaneousHandsAndControllersTrackingMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                pauseInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPerfSettingsSetPerformanceLevelEXT.html"><code>xrPerfSettingsSetPerformanceLevelEXT</code></a>
    public @EnumType(XrResult.class) int perfSettingsSetPerformanceLevelEXT(
        XrSession session,
        @EnumType(XrPerfSettingsDomainEXT.class) int domain,
        @EnumType(XrPerfSettingsLevelEXT.class) int level
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPerfSettingsSetPerformanceLevelEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                domain,
                level
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPersistSpatialAnchorAsyncBD.html"><code>xrPersistSpatialAnchorAsyncBD</code></a>
    public @EnumType(XrResult.class) int persistSpatialAnchorAsyncBD(
        XrSenseDataProviderBD provider,
        @Pointer XrSpatialAnchorPersistInfoBD info,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPersistSpatialAnchorAsyncBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                info.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPersistSpatialAnchorCompleteBD.html"><code>xrPersistSpatialAnchorCompleteBD</code></a>
    public @EnumType(XrResult.class) int persistSpatialAnchorCompleteBD(
        XrSenseDataProviderBD provider,
        XrFutureEXT future,
        @Pointer XrFutureCompletionEXT completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPersistSpatialAnchorCompleteBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPersistSpatialAnchorMSFT.html"><code>xrPersistSpatialAnchorMSFT</code></a>
    public @EnumType(XrResult.class) int persistSpatialAnchorMSFT(
        XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore,
        @Pointer XrSpatialAnchorPersistenceInfoMSFT spatialAnchorPersistenceInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPersistSpatialAnchorMSFT);
        try {
            return (int) hFunction.invokeExact(
                spatialAnchorStore.segment(),
                spatialAnchorPersistenceInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPersistSpatialEntityAsyncEXT.html"><code>xrPersistSpatialEntityAsyncEXT</code></a>
    public @EnumType(XrResult.class) int persistSpatialEntityAsyncEXT(
        XrSpatialPersistenceContextEXT persistenceContext,
        @Pointer XrSpatialEntityPersistInfoEXT persistInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPersistSpatialEntityAsyncEXT);
        try {
            return (int) hFunction.invokeExact(
                persistenceContext.segment(),
                persistInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPersistSpatialEntityCompleteEXT.html"><code>xrPersistSpatialEntityCompleteEXT</code></a>
    public @EnumType(XrResult.class) int persistSpatialEntityCompleteEXT(
        XrSpatialPersistenceContextEXT persistenceContext,
        XrFutureEXT future,
        @Pointer XrPersistSpatialEntityCompletionEXT completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPersistSpatialEntityCompleteEXT);
        try {
            return (int) hFunction.invokeExact(
                persistenceContext.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPollEvent.html"><code>xrPollEvent</code></a>
    public @EnumType(XrResult.class) int pollEvent(
        XrInstance instance,
        @Pointer XrEventDataBuffer eventData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPollEvent);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                eventData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPollFutureEXT.html"><code>xrPollFutureEXT</code></a>
    public @EnumType(XrResult.class) int pollFutureEXT(
        XrInstance instance,
        @Pointer XrFuturePollInfoEXT pollInfo,
        @Pointer XrFuturePollResultEXT pollResult
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPollFutureEXT);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                pollInfo.segment(),
                pollResult.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPublishSpatialAnchorsAsyncML.html"><code>xrPublishSpatialAnchorsAsyncML</code></a>
    public @EnumType(XrResult.class) int publishSpatialAnchorsAsyncML(
        XrSpatialAnchorsStorageML storage,
        @Pointer XrSpatialAnchorsPublishInfoML publishInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPublishSpatialAnchorsAsyncML);
        try {
            return (int) hFunction.invokeExact(
                storage.segment(),
                publishInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrPublishSpatialAnchorsCompleteML.html"><code>xrPublishSpatialAnchorsCompleteML</code></a>
    public @EnumType(XrResult.class) int publishSpatialAnchorsCompleteML(
        XrSpatialAnchorsStorageML storage,
        XrFutureEXT future,
        @Pointer XrSpatialAnchorsPublishCompletionML completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrPublishSpatialAnchorsCompleteML);
        try {
            return (int) hFunction.invokeExact(
                storage.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrQueryLocalizationMapsML.html"><code>xrQueryLocalizationMapsML</code></a>
    public @EnumType(XrResult.class) int queryLocalizationMapsML(
        XrSession session,
        @Nullable @Pointer XrLocalizationMapQueryInfoBaseHeaderML queryInfo,
        @Unsigned int mapCapacityInput,
        @Unsigned IntPtr mapCountOutput,
        @Nullable @Pointer IXrLocalizationMapML maps
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrQueryLocalizationMapsML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                (MemorySegment) (queryInfo != null ? queryInfo.segment() : MemorySegment.NULL),
                mapCapacityInput,
                mapCountOutput.segment(),
                (MemorySegment) (maps != null ? maps.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrQueryPerformanceMetricsCounterMETA.html"><code>xrQueryPerformanceMetricsCounterMETA</code></a>
    public @EnumType(XrResult.class) int queryPerformanceMetricsCounterMETA(
        XrSession session,
        @NativeType("XrPath") @Unsigned long counterPath,
        @Pointer XrPerformanceMetricsCounterMETA counter
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrQueryPerformanceMetricsCounterMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                counterPath,
                counter.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrQuerySenseDataAsyncBD.html"><code>xrQuerySenseDataAsyncBD</code></a>
    public @EnumType(XrResult.class) int querySenseDataAsyncBD(
        XrSenseDataProviderBD provider,
        @Pointer XrSenseDataQueryInfoBD queryInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrQuerySenseDataAsyncBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                queryInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrQuerySenseDataCompleteBD.html"><code>xrQuerySenseDataCompleteBD</code></a>
    public @EnumType(XrResult.class) int querySenseDataCompleteBD(
        XrSenseDataProviderBD provider,
        XrFutureEXT future,
        @Pointer XrSenseDataQueryCompletionBD completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrQuerySenseDataCompleteBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrQuerySpacesFB.html"><code>xrQuerySpacesFB</code></a>
    public @EnumType(XrResult.class) int querySpacesFB(
        XrSession session,
        @Pointer XrSpaceQueryInfoBaseHeaderFB info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr requestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrQuerySpacesFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                requestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrQuerySpatialAnchorsAsyncML.html"><code>xrQuerySpatialAnchorsAsyncML</code></a>
    public @EnumType(XrResult.class) int querySpatialAnchorsAsyncML(
        XrSpatialAnchorsStorageML storage,
        @Pointer XrSpatialAnchorsQueryInfoBaseHeaderML queryInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrQuerySpatialAnchorsAsyncML);
        try {
            return (int) hFunction.invokeExact(
                storage.segment(),
                queryInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrQuerySpatialAnchorsCompleteML.html"><code>xrQuerySpatialAnchorsCompleteML</code></a>
    public @EnumType(XrResult.class) int querySpatialAnchorsCompleteML(
        XrSpatialAnchorsStorageML storage,
        XrFutureEXT future,
        @Pointer XrSpatialAnchorsQueryCompletionML completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrQuerySpatialAnchorsCompleteML);
        try {
            return (int) hFunction.invokeExact(
                storage.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrQuerySpatialComponentDataEXT.html"><code>xrQuerySpatialComponentDataEXT</code></a>
    public @EnumType(XrResult.class) int querySpatialComponentDataEXT(
        XrSpatialSnapshotEXT snapshot,
        @Pointer XrSpatialComponentDataQueryConditionEXT queryCondition,
        @Pointer XrSpatialComponentDataQueryResultEXT queryResult
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrQuerySpatialComponentDataEXT);
        try {
            return (int) hFunction.invokeExact(
                snapshot.segment(),
                queryCondition.segment(),
                queryResult.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrQuerySystemTrackedKeyboardFB.html"><code>xrQuerySystemTrackedKeyboardFB</code></a>
    public @EnumType(XrResult.class) int querySystemTrackedKeyboardFB(
        XrSession session,
        @Pointer XrKeyboardTrackingQueryFB queryInfo,
        @Pointer XrKeyboardTrackingDescriptionFB keyboard
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrQuerySystemTrackedKeyboardFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                queryInfo.segment(),
                keyboard.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrReleaseSwapchainImage.html"><code>xrReleaseSwapchainImage</code></a>
    public @EnumType(XrResult.class) int releaseSwapchainImage(
        XrSwapchain swapchain,
        @Nullable @Pointer XrSwapchainImageReleaseInfo releaseInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrReleaseSwapchainImage);
        try {
            return (int) hFunction.invokeExact(
                swapchain.segment(),
                (MemorySegment) (releaseInfo != null ? releaseInfo.segment() : MemorySegment.NULL)
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrRequestDisplayRefreshRateFB.html"><code>xrRequestDisplayRefreshRateFB</code></a>
    public @EnumType(XrResult.class) int requestDisplayRefreshRateFB(
        XrSession session,
        float displayRefreshRate
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrRequestDisplayRefreshRateFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                displayRefreshRate
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrRequestExitSession.html"><code>xrRequestExitSession</code></a>
    public @EnumType(XrResult.class) int requestExitSession(
        XrSession session
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrRequestExitSession);
        try {
            return (int) hFunction.invokeExact(
                session.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrRequestMapLocalizationML.html"><code>xrRequestMapLocalizationML</code></a>
    public @EnumType(XrResult.class) int requestMapLocalizationML(
        XrSession session,
        @Pointer XrMapLocalizationRequestInfoML requestInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrRequestMapLocalizationML);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                requestInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrRequestSceneCaptureFB.html"><code>xrRequestSceneCaptureFB</code></a>
    public @EnumType(XrResult.class) int requestSceneCaptureFB(
        XrSession session,
        @Pointer XrSceneCaptureRequestInfoFB info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr requestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrRequestSceneCaptureFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                requestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrRequestWorldMeshAsyncML.html"><code>xrRequestWorldMeshAsyncML</code></a>
    public @EnumType(XrResult.class) int requestWorldMeshAsyncML(
        XrWorldMeshDetectorML detector,
        @Pointer XrWorldMeshGetInfoML getInfo,
        @Pointer XrWorldMeshBufferML buffer,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrRequestWorldMeshAsyncML);
        try {
            return (int) hFunction.invokeExact(
                detector.segment(),
                getInfo.segment(),
                buffer.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrRequestWorldMeshCompleteML.html"><code>xrRequestWorldMeshCompleteML</code></a>
    public @EnumType(XrResult.class) int requestWorldMeshCompleteML(
        XrWorldMeshDetectorML detector,
        @Pointer XrWorldMeshRequestCompletionInfoML completionInfo,
        XrFutureEXT future,
        @Pointer XrWorldMeshRequestCompletionML completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrRequestWorldMeshCompleteML);
        try {
            return (int) hFunction.invokeExact(
                detector.segment(),
                completionInfo.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrRequestWorldMeshStateAsyncML.html"><code>xrRequestWorldMeshStateAsyncML</code></a>
    public @EnumType(XrResult.class) int requestWorldMeshStateAsyncML(
        XrWorldMeshDetectorML detector,
        @Pointer XrWorldMeshStateRequestInfoML stateRequest,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrRequestWorldMeshStateAsyncML);
        try {
            return (int) hFunction.invokeExact(
                detector.segment(),
                stateRequest.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrRequestWorldMeshStateCompleteML.html"><code>xrRequestWorldMeshStateCompleteML</code></a>
    public @EnumType(XrResult.class) int requestWorldMeshStateCompleteML(
        XrWorldMeshDetectorML detector,
        XrFutureEXT future,
        @Pointer XrWorldMeshStateRequestCompletionML completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrRequestWorldMeshStateCompleteML);
        try {
            return (int) hFunction.invokeExact(
                detector.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrResultToString.html"><code>xrResultToString</code></a>
    public @EnumType(XrResult.class) int resultToString(
        XrInstance instance,
        @EnumType(XrResult.class) int value,
        BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrResultToString);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                value,
                    buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrResumeSimultaneousHandsAndControllersTrackingMETA.html"><code>xrResumeSimultaneousHandsAndControllersTrackingMETA</code></a>
    public @EnumType(XrResult.class) int resumeSimultaneousHandsAndControllersTrackingMETA(
        XrSession session,
        @Pointer XrSimultaneousHandsAndControllersTrackingResumeInfoMETA resumeInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrResumeSimultaneousHandsAndControllersTrackingMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                resumeInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrRetrieveSpaceQueryResultsFB.html"><code>xrRetrieveSpaceQueryResultsFB</code></a>
    public @EnumType(XrResult.class) int retrieveSpaceQueryResultsFB(
        XrSession session,
        @NativeType("XrAsyncRequestIdFB") @Unsigned long requestId,
        @Pointer XrSpaceQueryResultsFB results
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrRetrieveSpaceQueryResultsFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                requestId,
                results.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSaveSpaceFB.html"><code>xrSaveSpaceFB</code></a>
    public @EnumType(XrResult.class) int saveSpaceFB(
        XrSession session,
        @Pointer XrSpaceSaveInfoFB info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr requestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSaveSpaceFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                requestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSaveSpaceListFB.html"><code>xrSaveSpaceListFB</code></a>
    public @EnumType(XrResult.class) int saveSpaceListFB(
        XrSession session,
        @Pointer XrSpaceListSaveInfoFB info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr requestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSaveSpaceListFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                requestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSendVirtualKeyboardInputMETA.html"><code>xrSendVirtualKeyboardInputMETA</code></a>
    public @EnumType(XrResult.class) int sendVirtualKeyboardInputMETA(
        XrVirtualKeyboardMETA keyboard,
        @Pointer XrVirtualKeyboardInputInfoMETA info,
        @Pointer XrPosef interactorRootPose
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSendVirtualKeyboardInputMETA);
        try {
            return (int) hFunction.invokeExact(
                keyboard.segment(),
                info.segment(),
                interactorRootPose.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSessionBeginDebugUtilsLabelRegionEXT.html"><code>xrSessionBeginDebugUtilsLabelRegionEXT</code></a>
    public @EnumType(XrResult.class) int sessionBeginDebugUtilsLabelRegionEXT(
        XrSession session,
        @Pointer XrDebugUtilsLabelEXT labelInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSessionBeginDebugUtilsLabelRegionEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                labelInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSessionEndDebugUtilsLabelRegionEXT.html"><code>xrSessionEndDebugUtilsLabelRegionEXT</code></a>
    public @EnumType(XrResult.class) int sessionEndDebugUtilsLabelRegionEXT(
        XrSession session
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSessionEndDebugUtilsLabelRegionEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSessionInsertDebugUtilsLabelEXT.html"><code>xrSessionInsertDebugUtilsLabelEXT</code></a>
    public @EnumType(XrResult.class) int sessionInsertDebugUtilsLabelEXT(
        XrSession session,
        @Pointer XrDebugUtilsLabelEXT labelInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSessionInsertDebugUtilsLabelEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                labelInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetAndroidApplicationThreadKHR.html"><code>xrSetAndroidApplicationThreadKHR</code></a>
    public @EnumType(XrResult.class) int setAndroidApplicationThreadKHR(
        XrSession session,
        @EnumType(XrAndroidThreadTypeKHR.class) int threadType,
        @Unsigned int threadId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetAndroidApplicationThreadKHR);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                threadType,
                threadId
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetColorSpaceFB.html"><code>xrSetColorSpaceFB</code></a>
    public @EnumType(XrResult.class) int setColorSpaceFB(
        XrSession session,
        @EnumType(XrColorSpaceFB.class) int colorSpace
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetColorSpaceFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                colorSpace
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetDebugUtilsObjectNameEXT.html"><code>xrSetDebugUtilsObjectNameEXT</code></a>
    public @EnumType(XrResult.class) int setDebugUtilsObjectNameEXT(
        XrInstance instance,
        @Pointer XrDebugUtilsObjectNameInfoEXT nameInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetDebugUtilsObjectNameEXT);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                nameInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetDigitalLensControlALMALENCE.html"><code>xrSetDigitalLensControlALMALENCE</code></a>
    public @EnumType(XrResult.class) int setDigitalLensControlALMALENCE(
        XrSession session,
        @Pointer XrDigitalLensControlALMALENCE digitalLensControl
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetDigitalLensControlALMALENCE);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                digitalLensControl.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetEnvironmentDepthEstimationVARJO.html"><code>xrSetEnvironmentDepthEstimationVARJO</code></a>
    public @EnumType(XrResult.class) int setEnvironmentDepthEstimationVARJO(
        XrSession session,
        @NativeType("XrBool32") @Unsigned int enabled
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetEnvironmentDepthEstimationVARJO);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                enabled
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetEnvironmentDepthHandRemovalMETA.html"><code>xrSetEnvironmentDepthHandRemovalMETA</code></a>
    public @EnumType(XrResult.class) int setEnvironmentDepthHandRemovalMETA(
        XrEnvironmentDepthProviderMETA environmentDepthProvider,
        @Pointer XrEnvironmentDepthHandRemovalSetInfoMETA setInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetEnvironmentDepthHandRemovalMETA);
        try {
            return (int) hFunction.invokeExact(
                environmentDepthProvider.segment(),
                setInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetInputDeviceActiveEXT.html"><code>xrSetInputDeviceActiveEXT</code></a>
    public @EnumType(XrResult.class) int setInputDeviceActiveEXT(
        XrSession session,
        @NativeType("XrPath") @Unsigned long interactionProfile,
        @NativeType("XrPath") @Unsigned long topLevelPath,
        @NativeType("XrBool32") @Unsigned int isActive
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetInputDeviceActiveEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                interactionProfile,
                topLevelPath,
                isActive
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetInputDeviceLocationEXT.html"><code>xrSetInputDeviceLocationEXT</code></a>
    public @EnumType(XrResult.class) int setInputDeviceLocationEXT(
        XrSession session,
        @NativeType("XrPath") @Unsigned long topLevelPath,
        @NativeType("XrPath") @Unsigned long inputSourcePath,
        XrSpace space,
        XrPosef pose
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetInputDeviceLocationEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                topLevelPath,
                inputSourcePath,
                space.segment(),
                pose.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetInputDeviceStateBoolEXT.html"><code>xrSetInputDeviceStateBoolEXT</code></a>
    public @EnumType(XrResult.class) int setInputDeviceStateBoolEXT(
        XrSession session,
        @NativeType("XrPath") @Unsigned long topLevelPath,
        @NativeType("XrPath") @Unsigned long inputSourcePath,
        @NativeType("XrBool32") @Unsigned int state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetInputDeviceStateBoolEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                topLevelPath,
                inputSourcePath,
                state
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetInputDeviceStateFloatEXT.html"><code>xrSetInputDeviceStateFloatEXT</code></a>
    public @EnumType(XrResult.class) int setInputDeviceStateFloatEXT(
        XrSession session,
        @NativeType("XrPath") @Unsigned long topLevelPath,
        @NativeType("XrPath") @Unsigned long inputSourcePath,
        float state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetInputDeviceStateFloatEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                topLevelPath,
                inputSourcePath,
                state
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetInputDeviceStateVector2fEXT.html"><code>xrSetInputDeviceStateVector2fEXT</code></a>
    public @EnumType(XrResult.class) int setInputDeviceStateVector2fEXT(
        XrSession session,
        @NativeType("XrPath") @Unsigned long topLevelPath,
        @NativeType("XrPath") @Unsigned long inputSourcePath,
        XrVector2f state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetInputDeviceStateVector2fEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                topLevelPath,
                inputSourcePath,
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetMarkerTrackingPredictionVARJO.html"><code>xrSetMarkerTrackingPredictionVARJO</code></a>
    public @EnumType(XrResult.class) int setMarkerTrackingPredictionVARJO(
        XrSession session,
        @Unsigned long markerId,
        @NativeType("XrBool32") @Unsigned int enable
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetMarkerTrackingPredictionVARJO);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                markerId,
                enable
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetMarkerTrackingTimeoutVARJO.html"><code>xrSetMarkerTrackingTimeoutVARJO</code></a>
    public @EnumType(XrResult.class) int setMarkerTrackingTimeoutVARJO(
        XrSession session,
        @Unsigned long markerId,
        @NativeType("XrDuration") long timeout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetMarkerTrackingTimeoutVARJO);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                markerId,
                timeout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetMarkerTrackingVARJO.html"><code>xrSetMarkerTrackingVARJO</code></a>
    public @EnumType(XrResult.class) int setMarkerTrackingVARJO(
        XrSession session,
        @NativeType("XrBool32") @Unsigned int enabled
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetMarkerTrackingVARJO);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                enabled
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetPerformanceMetricsStateMETA.html"><code>xrSetPerformanceMetricsStateMETA</code></a>
    public @EnumType(XrResult.class) int setPerformanceMetricsStateMETA(
        XrSession session,
        @Pointer XrPerformanceMetricsStateMETA state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetPerformanceMetricsStateMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetSpaceComponentStatusFB.html"><code>xrSetSpaceComponentStatusFB</code></a>
    public @EnumType(XrResult.class) int setSpaceComponentStatusFB(
        XrSpace space,
        @Pointer XrSpaceComponentStatusSetInfoFB info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr requestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetSpaceComponentStatusFB);
        try {
            return (int) hFunction.invokeExact(
                space.segment(),
                info.segment(),
                requestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetSystemNotificationsML.html"><code>xrSetSystemNotificationsML</code></a>
    public @EnumType(XrResult.class) int setSystemNotificationsML(
        XrInstance instance,
        @Pointer XrSystemNotificationsSetInfoML info
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetSystemNotificationsML);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                info.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetTrackingOptimizationSettingsHintQCOM.html"><code>xrSetTrackingOptimizationSettingsHintQCOM</code></a>
    public @EnumType(XrResult.class) int setTrackingOptimizationSettingsHintQCOM(
        XrSession session,
        @EnumType(XrTrackingOptimizationSettingsDomainQCOM.class) int domain,
        @EnumType(XrTrackingOptimizationSettingsHintQCOM.class) int hint
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetTrackingOptimizationSettingsHintQCOM);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                domain,
                hint
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetViewOffsetVARJO.html"><code>xrSetViewOffsetVARJO</code></a>
    public @EnumType(XrResult.class) int setViewOffsetVARJO(
        XrSession session,
        float offset
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetViewOffsetVARJO);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                offset
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSetVirtualKeyboardModelVisibilityMETA.html"><code>xrSetVirtualKeyboardModelVisibilityMETA</code></a>
    public @EnumType(XrResult.class) int setVirtualKeyboardModelVisibilityMETA(
        XrVirtualKeyboardMETA keyboard,
        @Pointer XrVirtualKeyboardModelVisibilitySetInfoMETA modelVisibility
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSetVirtualKeyboardModelVisibilityMETA);
        try {
            return (int) hFunction.invokeExact(
                keyboard.segment(),
                modelVisibility.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrShareSpacesFB.html"><code>xrShareSpacesFB</code></a>
    public @EnumType(XrResult.class) int shareSpacesFB(
        XrSession session,
        @Pointer XrSpaceShareInfoFB info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr requestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrShareSpacesFB);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                requestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrShareSpacesMETA.html"><code>xrShareSpacesMETA</code></a>
    public @EnumType(XrResult.class) int shareSpacesMETA(
        XrSession session,
        @Pointer XrShareSpacesInfoMETA info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr requestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrShareSpacesMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                requestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrShareSpatialAnchorAsyncBD.html"><code>xrShareSpatialAnchorAsyncBD</code></a>
    public @EnumType(XrResult.class) int shareSpatialAnchorAsyncBD(
        XrSenseDataProviderBD provider,
        @Pointer XrSpatialAnchorShareInfoBD info,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrShareSpatialAnchorAsyncBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                info.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrShareSpatialAnchorCompleteBD.html"><code>xrShareSpatialAnchorCompleteBD</code></a>
    public @EnumType(XrResult.class) int shareSpatialAnchorCompleteBD(
        XrSenseDataProviderBD provider,
        XrFutureEXT future,
        @Pointer XrFutureCompletionEXT completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrShareSpatialAnchorCompleteBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSnapshotMarkerDetectorML.html"><code>xrSnapshotMarkerDetectorML</code></a>
    public @EnumType(XrResult.class) int snapshotMarkerDetectorML(
        XrMarkerDetectorML markerDetector,
        @Pointer XrMarkerDetectorSnapshotInfoML snapshotInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSnapshotMarkerDetectorML);
        try {
            return (int) hFunction.invokeExact(
                markerDetector.segment(),
                snapshotInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStartColocationAdvertisementMETA.html"><code>xrStartColocationAdvertisementMETA</code></a>
    public @EnumType(XrResult.class) int startColocationAdvertisementMETA(
        XrSession session,
        @Pointer XrColocationAdvertisementStartInfoMETA info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr advertisementRequestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStartColocationAdvertisementMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                advertisementRequestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStartColocationDiscoveryMETA.html"><code>xrStartColocationDiscoveryMETA</code></a>
    public @EnumType(XrResult.class) int startColocationDiscoveryMETA(
        XrSession session,
        @Pointer XrColocationDiscoveryStartInfoMETA info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr discoveryRequestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStartColocationDiscoveryMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                discoveryRequestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStartEnvironmentDepthProviderMETA.html"><code>xrStartEnvironmentDepthProviderMETA</code></a>
    public @EnumType(XrResult.class) int startEnvironmentDepthProviderMETA(
        XrEnvironmentDepthProviderMETA environmentDepthProvider
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStartEnvironmentDepthProviderMETA);
        try {
            return (int) hFunction.invokeExact(
                environmentDepthProvider.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStartSenseDataProviderAsyncBD.html"><code>xrStartSenseDataProviderAsyncBD</code></a>
    public @EnumType(XrResult.class) int startSenseDataProviderAsyncBD(
        XrSenseDataProviderBD provider,
        @Pointer XrSenseDataProviderStartInfoBD startInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStartSenseDataProviderAsyncBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                startInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStartSenseDataProviderCompleteBD.html"><code>xrStartSenseDataProviderCompleteBD</code></a>
    public @EnumType(XrResult.class) int startSenseDataProviderCompleteBD(
        XrSession session,
        XrFutureEXT future,
        @Pointer XrFutureCompletionEXT completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStartSenseDataProviderCompleteBD);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStopColocationAdvertisementMETA.html"><code>xrStopColocationAdvertisementMETA</code></a>
    public @EnumType(XrResult.class) int stopColocationAdvertisementMETA(
        XrSession session,
        @Pointer XrColocationAdvertisementStopInfoMETA info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr requestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStopColocationAdvertisementMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                requestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStopColocationDiscoveryMETA.html"><code>xrStopColocationDiscoveryMETA</code></a>
    public @EnumType(XrResult.class) int stopColocationDiscoveryMETA(
        XrSession session,
        @Pointer XrColocationDiscoveryStopInfoMETA info,
        @Pointer(comment="XrAsyncRequestIdFB") @Unsigned LongPtr requestId
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStopColocationDiscoveryMETA);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                info.segment(),
                requestId.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStopEnvironmentDepthProviderMETA.html"><code>xrStopEnvironmentDepthProviderMETA</code></a>
    public @EnumType(XrResult.class) int stopEnvironmentDepthProviderMETA(
        XrEnvironmentDepthProviderMETA environmentDepthProvider
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStopEnvironmentDepthProviderMETA);
        try {
            return (int) hFunction.invokeExact(
                environmentDepthProvider.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStopHapticFeedback.html"><code>xrStopHapticFeedback</code></a>
    public @EnumType(XrResult.class) int stopHapticFeedback(
        XrSession session,
        @Pointer XrHapticActionInfo hapticActionInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStopHapticFeedback);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                hapticActionInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStopSenseDataProviderBD.html"><code>xrStopSenseDataProviderBD</code></a>
    public @EnumType(XrResult.class) int stopSenseDataProviderBD(
        XrSenseDataProviderBD provider
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStopSenseDataProviderBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStringToPath.html"><code>xrStringToPath</code></a>
    public @EnumType(XrResult.class) int stringToPath(
        XrInstance instance,
        BytePtr pathString,
        @Pointer(comment="XrPath") @Unsigned LongPtr path
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStringToPath);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                pathString.segment(),
                path.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStructureTypeToString.html"><code>xrStructureTypeToString</code></a>
    public @EnumType(XrResult.class) int structureTypeToString(
        XrInstance instance,
        @EnumType(XrStructureType.class) int value,
        BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStructureTypeToString);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                value,
                    buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrStructureTypeToString2KHR.html"><code>xrStructureTypeToString2KHR</code></a>
    public @EnumType(XrResult.class) int structureTypeToString2KHR(
        XrInstance instance,
        @EnumType(XrStructureType.class) int value,
        BytePtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrStructureTypeToString2KHR);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                value,
                    buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSubmitDebugUtilsMessageEXT.html"><code>xrSubmitDebugUtilsMessageEXT</code></a>
    public @EnumType(XrResult.class) int submitDebugUtilsMessageEXT(
        XrInstance instance,
        @Bitmask(XrDebugUtilsMessageSeverityFlagsEXT.class) long messageSeverity,
        @Bitmask(XrDebugUtilsMessageTypeFlagsEXT.class) long messageTypes,
        @Pointer XrDebugUtilsMessengerCallbackDataEXT callbackData
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSubmitDebugUtilsMessageEXT);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                messageSeverity,
                messageTypes,
                callbackData.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSuggestInteractionProfileBindings.html"><code>xrSuggestInteractionProfileBindings</code></a>
    public @EnumType(XrResult.class) int suggestInteractionProfileBindings(
        XrInstance instance,
        @Pointer XrInteractionProfileSuggestedBinding suggestedBindings
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSuggestInteractionProfileBindings);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                suggestedBindings.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSuggestVirtualKeyboardLocationMETA.html"><code>xrSuggestVirtualKeyboardLocationMETA</code></a>
    public @EnumType(XrResult.class) int suggestVirtualKeyboardLocationMETA(
        XrVirtualKeyboardMETA keyboard,
        @Pointer XrVirtualKeyboardLocationInfoMETA locationInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSuggestVirtualKeyboardLocationMETA);
        try {
            return (int) hFunction.invokeExact(
                keyboard.segment(),
                locationInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrSyncActions.html"><code>xrSyncActions</code></a>
    public @EnumType(XrResult.class) int syncActions(
        XrSession session,
        @Pointer XrActionsSyncInfo syncInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrSyncActions);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                syncInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrThermalGetTemperatureTrendEXT.html"><code>xrThermalGetTemperatureTrendEXT</code></a>
    public @EnumType(XrResult.class) int thermalGetTemperatureTrendEXT(
        XrSession session,
        @EnumType(XrPerfSettingsDomainEXT.class) int domain,
        @EnumType(XrPerfSettingsNotificationLevelEXT.class) IntPtr notificationLevel,
        FloatPtr tempHeadroom,
        FloatPtr tempSlope
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrThermalGetTemperatureTrendEXT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                domain,
                notificationLevel.segment(),
                tempHeadroom.segment(),
                tempSlope.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrTriangleMeshBeginUpdateFB.html"><code>xrTriangleMeshBeginUpdateFB</code></a>
    public @EnumType(XrResult.class) int triangleMeshBeginUpdateFB(
        XrTriangleMeshFB mesh
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrTriangleMeshBeginUpdateFB);
        try {
            return (int) hFunction.invokeExact(
                mesh.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrTriangleMeshBeginVertexBufferUpdateFB.html"><code>xrTriangleMeshBeginVertexBufferUpdateFB</code></a>
    public @EnumType(XrResult.class) int triangleMeshBeginVertexBufferUpdateFB(
        XrTriangleMeshFB mesh,
        @Unsigned IntPtr outVertexCount
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrTriangleMeshBeginVertexBufferUpdateFB);
        try {
            return (int) hFunction.invokeExact(
                mesh.segment(),
                outVertexCount.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrTriangleMeshEndUpdateFB.html"><code>xrTriangleMeshEndUpdateFB</code></a>
    public @EnumType(XrResult.class) int triangleMeshEndUpdateFB(
        XrTriangleMeshFB mesh,
        @Unsigned int vertexCount,
        @Unsigned int triangleCount
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrTriangleMeshEndUpdateFB);
        try {
            return (int) hFunction.invokeExact(
                mesh.segment(),
                vertexCount,
                triangleCount
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrTriangleMeshEndVertexBufferUpdateFB.html"><code>xrTriangleMeshEndVertexBufferUpdateFB</code></a>
    public @EnumType(XrResult.class) int triangleMeshEndVertexBufferUpdateFB(
        XrTriangleMeshFB mesh
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrTriangleMeshEndVertexBufferUpdateFB);
        try {
            return (int) hFunction.invokeExact(
                mesh.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrTriangleMeshGetIndexBufferFB.html"><code>xrTriangleMeshGetIndexBufferFB</code></a>
    public @EnumType(XrResult.class) int triangleMeshGetIndexBufferFB(
        XrTriangleMeshFB mesh,
        PointerPtr outIndexBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrTriangleMeshGetIndexBufferFB);
        try {
            return (int) hFunction.invokeExact(
                mesh.segment(),
                outIndexBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrTriangleMeshGetVertexBufferFB.html"><code>xrTriangleMeshGetVertexBufferFB</code></a>
    public @EnumType(XrResult.class) int triangleMeshGetVertexBufferFB(
        XrTriangleMeshFB mesh,
        PointerPtr outVertexBuffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrTriangleMeshGetVertexBufferFB);
        try {
            return (int) hFunction.invokeExact(
                mesh.segment(),
                outVertexBuffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrTryCreateSpatialGraphStaticNodeBindingMSFT.html"><code>xrTryCreateSpatialGraphStaticNodeBindingMSFT</code></a>
    public @EnumType(XrResult.class) int tryCreateSpatialGraphStaticNodeBindingMSFT(
        XrSession session,
        @Pointer XrSpatialGraphStaticNodeBindingCreateInfoMSFT createInfo,
        @Pointer XrSpatialGraphNodeBindingMSFT.Ptr nodeBinding
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrTryCreateSpatialGraphStaticNodeBindingMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                createInfo.segment(),
                nodeBinding.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrTryGetPerceptionAnchorFromSpatialAnchorMSFT.html"><code>xrTryGetPerceptionAnchorFromSpatialAnchorMSFT</code></a>
    public @EnumType(XrResult.class) int tryGetPerceptionAnchorFromSpatialAnchorMSFT(
        XrSession session,
        XrSpatialAnchorMSFT anchor,
        PointerPtr perceptionAnchor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrTryGetPerceptionAnchorFromSpatialAnchorMSFT);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                anchor.segment(),
                perceptionAnchor.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrUnpersistSpatialAnchorAsyncBD.html"><code>xrUnpersistSpatialAnchorAsyncBD</code></a>
    public @EnumType(XrResult.class) int unpersistSpatialAnchorAsyncBD(
        XrSenseDataProviderBD provider,
        @Pointer XrSpatialAnchorUnpersistInfoBD info,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrUnpersistSpatialAnchorAsyncBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                info.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrUnpersistSpatialAnchorCompleteBD.html"><code>xrUnpersistSpatialAnchorCompleteBD</code></a>
    public @EnumType(XrResult.class) int unpersistSpatialAnchorCompleteBD(
        XrSenseDataProviderBD provider,
        XrFutureEXT future,
        @Pointer XrFutureCompletionEXT completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrUnpersistSpatialAnchorCompleteBD);
        try {
            return (int) hFunction.invokeExact(
                provider.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrUnpersistSpatialAnchorMSFT.html"><code>xrUnpersistSpatialAnchorMSFT</code></a>
    public @EnumType(XrResult.class) int unpersistSpatialAnchorMSFT(
        XrSpatialAnchorStoreConnectionMSFT spatialAnchorStore,
        @Pointer XrSpatialAnchorPersistenceNameMSFT spatialAnchorPersistenceName
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrUnpersistSpatialAnchorMSFT);
        try {
            return (int) hFunction.invokeExact(
                spatialAnchorStore.segment(),
                spatialAnchorPersistenceName.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrUnpersistSpatialEntityAsyncEXT.html"><code>xrUnpersistSpatialEntityAsyncEXT</code></a>
    public @EnumType(XrResult.class) int unpersistSpatialEntityAsyncEXT(
        XrSpatialPersistenceContextEXT persistenceContext,
        @Pointer XrSpatialEntityUnpersistInfoEXT unpersistInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrUnpersistSpatialEntityAsyncEXT);
        try {
            return (int) hFunction.invokeExact(
                persistenceContext.segment(),
                unpersistInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrUnpersistSpatialEntityCompleteEXT.html"><code>xrUnpersistSpatialEntityCompleteEXT</code></a>
    public @EnumType(XrResult.class) int unpersistSpatialEntityCompleteEXT(
        XrSpatialPersistenceContextEXT persistenceContext,
        XrFutureEXT future,
        @Pointer XrUnpersistSpatialEntityCompletionEXT completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrUnpersistSpatialEntityCompleteEXT);
        try {
            return (int) hFunction.invokeExact(
                persistenceContext.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrUpdateHandMeshMSFT.html"><code>xrUpdateHandMeshMSFT</code></a>
    public @EnumType(XrResult.class) int updateHandMeshMSFT(
        XrHandTrackerEXT handTracker,
        @Pointer XrHandMeshUpdateInfoMSFT updateInfo,
        @Pointer XrHandMeshMSFT handMesh
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrUpdateHandMeshMSFT);
        try {
            return (int) hFunction.invokeExact(
                handTracker.segment(),
                updateInfo.segment(),
                handMesh.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrUpdatePassthroughColorLutMETA.html"><code>xrUpdatePassthroughColorLutMETA</code></a>
    public @EnumType(XrResult.class) int updatePassthroughColorLutMETA(
        XrPassthroughColorLutMETA colorLut,
        @Pointer XrPassthroughColorLutUpdateInfoMETA updateInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrUpdatePassthroughColorLutMETA);
        try {
            return (int) hFunction.invokeExact(
                colorLut.segment(),
                updateInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrUpdateSpatialAnchorsExpirationAsyncML.html"><code>xrUpdateSpatialAnchorsExpirationAsyncML</code></a>
    public @EnumType(XrResult.class) int updateSpatialAnchorsExpirationAsyncML(
        XrSpatialAnchorsStorageML storage,
        @Pointer XrSpatialAnchorsUpdateExpirationInfoML updateInfo,
        @Pointer XrFutureEXT.Ptr future
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrUpdateSpatialAnchorsExpirationAsyncML);
        try {
            return (int) hFunction.invokeExact(
                storage.segment(),
                updateInfo.segment(),
                future.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrUpdateSpatialAnchorsExpirationCompleteML.html"><code>xrUpdateSpatialAnchorsExpirationCompleteML</code></a>
    public @EnumType(XrResult.class) int updateSpatialAnchorsExpirationCompleteML(
        XrSpatialAnchorsStorageML storage,
        XrFutureEXT future,
        @Pointer XrSpatialAnchorsUpdateExpirationCompletionML completion
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrUpdateSpatialAnchorsExpirationCompleteML);
        try {
            return (int) hFunction.invokeExact(
                storage.segment(),
                future.segment(),
                completion.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrUpdateSwapchainFB.html"><code>xrUpdateSwapchainFB</code></a>
    public @EnumType(XrResult.class) int updateSwapchainFB(
        XrSwapchain swapchain,
        @Pointer XrSwapchainStateBaseHeaderFB state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrUpdateSwapchainFB);
        try {
            return (int) hFunction.invokeExact(
                swapchain.segment(),
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrWaitFrame.html"><code>xrWaitFrame</code></a>
    public @EnumType(XrResult.class) int waitFrame(
        XrSession session,
        @Nullable @Pointer XrFrameWaitInfo frameWaitInfo,
        @Pointer XrFrameState frameState
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrWaitFrame);
        try {
            return (int) hFunction.invokeExact(
                session.segment(),
                (MemorySegment) (frameWaitInfo != null ? frameWaitInfo.segment() : MemorySegment.NULL),
                frameState.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    /// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/xrWaitSwapchainImage.html"><code>xrWaitSwapchainImage</code></a>
    public @EnumType(XrResult.class) int waitSwapchainImage(
        XrSwapchain swapchain,
        @Pointer XrSwapchainImageWaitInfo waitInfo
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$xrWaitSwapchainImage);
        try {
            return (int) hFunction.invokeExact(
                swapchain.segment(),
                waitInfo.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    // endregion

    // region segments and handles
    public final @Nullable MemorySegment SEGMENT$xrAcquireEnvironmentDepthImageMETA;
    public final @Nullable MemorySegment SEGMENT$xrAcquireSwapchainImage;
    public final @Nullable MemorySegment SEGMENT$xrAllocateWorldMeshBufferML;
    public final @Nullable MemorySegment SEGMENT$xrApplyForceFeedbackCurlMNDX;
    public final @Nullable MemorySegment SEGMENT$xrApplyFoveationHTC;
    public final @Nullable MemorySegment SEGMENT$xrApplyHapticFeedback;
    public final @Nullable MemorySegment SEGMENT$xrAttachSessionActionSets;
    public final @Nullable MemorySegment SEGMENT$xrBeginFrame;
    public final @Nullable MemorySegment SEGMENT$xrBeginPlaneDetectionEXT;
    public final @Nullable MemorySegment SEGMENT$xrBeginSession;
    public final @Nullable MemorySegment SEGMENT$xrCancelFutureEXT;
    public final @Nullable MemorySegment SEGMENT$xrCaptureSceneAsyncBD;
    public final @Nullable MemorySegment SEGMENT$xrCaptureSceneCompleteBD;
    public final @Nullable MemorySegment SEGMENT$xrChangeVirtualKeyboardTextContextMETA;
    public final @Nullable MemorySegment SEGMENT$xrClearSpatialAnchorStoreMSFT;
    public final @Nullable MemorySegment SEGMENT$xrComputeNewSceneMSFT;
    public final @Nullable MemorySegment SEGMENT$xrConvertTimeToTimespecTimeKHR;
    public final @Nullable MemorySegment SEGMENT$xrConvertTimeToWin32PerformanceCounterKHR;
    public final @Nullable MemorySegment SEGMENT$xrConvertTimespecTimeToTimeKHR;
    public final @Nullable MemorySegment SEGMENT$xrConvertWin32PerformanceCounterToTimeKHR;
    public final @Nullable MemorySegment SEGMENT$xrCreateAction;
    public final @Nullable MemorySegment SEGMENT$xrCreateActionSet;
    public final @Nullable MemorySegment SEGMENT$xrCreateActionSpace;
    public final @Nullable MemorySegment SEGMENT$xrCreateAnchorSpaceBD;
    public final @Nullable MemorySegment SEGMENT$xrCreateApiLayerInstance;
    public final @Nullable MemorySegment SEGMENT$xrCreateBodyTrackerBD;
    public final @Nullable MemorySegment SEGMENT$xrCreateBodyTrackerFB;
    public final @Nullable MemorySegment SEGMENT$xrCreateBodyTrackerHTC;
    public final @Nullable MemorySegment SEGMENT$xrCreateDebugUtilsMessengerEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateEnvironmentDepthProviderMETA;
    public final @Nullable MemorySegment SEGMENT$xrCreateEnvironmentDepthSwapchainMETA;
    public final @Nullable MemorySegment SEGMENT$xrCreateExportedLocalizationMapML;
    public final @Nullable MemorySegment SEGMENT$xrCreateEyeTrackerFB;
    public final @Nullable MemorySegment SEGMENT$xrCreateFaceTracker2FB;
    public final @Nullable MemorySegment SEGMENT$xrCreateFaceTrackerFB;
    public final @Nullable MemorySegment SEGMENT$xrCreateFacialExpressionClientML;
    public final @Nullable MemorySegment SEGMENT$xrCreateFacialTrackerHTC;
    public final @Nullable MemorySegment SEGMENT$xrCreateFoveationProfileFB;
    public final @Nullable MemorySegment SEGMENT$xrCreateGeometryInstanceFB;
    public final @Nullable MemorySegment SEGMENT$xrCreateHandMeshSpaceMSFT;
    public final @Nullable MemorySegment SEGMENT$xrCreateHandTrackerEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateInstance;
    public final @Nullable MemorySegment SEGMENT$xrCreateKeyboardSpaceFB;
    public final @Nullable MemorySegment SEGMENT$xrCreateMarkerDetectorML;
    public final @Nullable MemorySegment SEGMENT$xrCreateMarkerSpaceML;
    public final @Nullable MemorySegment SEGMENT$xrCreateMarkerSpaceVARJO;
    public final @Nullable MemorySegment SEGMENT$xrCreatePassthroughColorLutMETA;
    public final @Nullable MemorySegment SEGMENT$xrCreatePassthroughFB;
    public final @Nullable MemorySegment SEGMENT$xrCreatePassthroughHTC;
    public final @Nullable MemorySegment SEGMENT$xrCreatePassthroughLayerFB;
    public final @Nullable MemorySegment SEGMENT$xrCreatePlaneDetectorEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateReferenceSpace;
    public final @Nullable MemorySegment SEGMENT$xrCreateRenderModelAssetEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateRenderModelEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateRenderModelSpaceEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSceneMSFT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSceneObserverMSFT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSenseDataProviderBD;
    public final @Nullable MemorySegment SEGMENT$xrCreateSession;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpaceFromCoordinateFrameUIDML;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpaceUserFB;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorAsyncBD;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorCompleteBD;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorFB;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorFromPerceptionAnchorMSFT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorFromPersistedNameMSFT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorHTC;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorMSFT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorSpaceMSFT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorStoreConnectionMSFT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorsAsyncML;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorsCompleteML;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialAnchorsStorageML;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialContextAsyncEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialContextCompleteEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialDiscoverySnapshotAsyncEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialDiscoverySnapshotCompleteEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialEntityAnchorBD;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialEntityFromIdEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialGraphNodeSpaceMSFT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialPersistenceContextAsyncEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialPersistenceContextCompleteEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSpatialUpdateSnapshotEXT;
    public final @Nullable MemorySegment SEGMENT$xrCreateSwapchain;
    public final @Nullable MemorySegment SEGMENT$xrCreateSwapchainAndroidSurfaceKHR;
    public final @Nullable MemorySegment SEGMENT$xrCreateTriangleMeshFB;
    public final @Nullable MemorySegment SEGMENT$xrCreateVirtualKeyboardMETA;
    public final @Nullable MemorySegment SEGMENT$xrCreateVirtualKeyboardSpaceMETA;
    public final @Nullable MemorySegment SEGMENT$xrCreateVulkanDeviceKHR;
    public final @Nullable MemorySegment SEGMENT$xrCreateVulkanInstanceKHR;
    public final @Nullable MemorySegment SEGMENT$xrCreateWorldMeshDetectorML;
    public final @Nullable MemorySegment SEGMENT$xrDeleteSpatialAnchorsAsyncML;
    public final @Nullable MemorySegment SEGMENT$xrDeleteSpatialAnchorsCompleteML;
    public final @Nullable MemorySegment SEGMENT$xrDeserializeSceneMSFT;
    public final @Nullable MemorySegment SEGMENT$xrDestroyAction;
    public final @Nullable MemorySegment SEGMENT$xrDestroyActionSet;
    public final @Nullable MemorySegment SEGMENT$xrDestroyAnchorBD;
    public final @Nullable MemorySegment SEGMENT$xrDestroyBodyTrackerBD;
    public final @Nullable MemorySegment SEGMENT$xrDestroyBodyTrackerFB;
    public final @Nullable MemorySegment SEGMENT$xrDestroyBodyTrackerHTC;
    public final @Nullable MemorySegment SEGMENT$xrDestroyDebugUtilsMessengerEXT;
    public final @Nullable MemorySegment SEGMENT$xrDestroyEnvironmentDepthProviderMETA;
    public final @Nullable MemorySegment SEGMENT$xrDestroyEnvironmentDepthSwapchainMETA;
    public final @Nullable MemorySegment SEGMENT$xrDestroyExportedLocalizationMapML;
    public final @Nullable MemorySegment SEGMENT$xrDestroyEyeTrackerFB;
    public final @Nullable MemorySegment SEGMENT$xrDestroyFaceTracker2FB;
    public final @Nullable MemorySegment SEGMENT$xrDestroyFaceTrackerFB;
    public final @Nullable MemorySegment SEGMENT$xrDestroyFacialExpressionClientML;
    public final @Nullable MemorySegment SEGMENT$xrDestroyFacialTrackerHTC;
    public final @Nullable MemorySegment SEGMENT$xrDestroyFoveationProfileFB;
    public final @Nullable MemorySegment SEGMENT$xrDestroyGeometryInstanceFB;
    public final @Nullable MemorySegment SEGMENT$xrDestroyHandTrackerEXT;
    public final @Nullable MemorySegment SEGMENT$xrDestroyInstance;
    public final @Nullable MemorySegment SEGMENT$xrDestroyMarkerDetectorML;
    public final @Nullable MemorySegment SEGMENT$xrDestroyPassthroughColorLutMETA;
    public final @Nullable MemorySegment SEGMENT$xrDestroyPassthroughFB;
    public final @Nullable MemorySegment SEGMENT$xrDestroyPassthroughHTC;
    public final @Nullable MemorySegment SEGMENT$xrDestroyPassthroughLayerFB;
    public final @Nullable MemorySegment SEGMENT$xrDestroyPlaneDetectorEXT;
    public final @Nullable MemorySegment SEGMENT$xrDestroyRenderModelAssetEXT;
    public final @Nullable MemorySegment SEGMENT$xrDestroyRenderModelEXT;
    public final @Nullable MemorySegment SEGMENT$xrDestroySceneMSFT;
    public final @Nullable MemorySegment SEGMENT$xrDestroySceneObserverMSFT;
    public final @Nullable MemorySegment SEGMENT$xrDestroySenseDataProviderBD;
    public final @Nullable MemorySegment SEGMENT$xrDestroySenseDataSnapshotBD;
    public final @Nullable MemorySegment SEGMENT$xrDestroySession;
    public final @Nullable MemorySegment SEGMENT$xrDestroySpace;
    public final @Nullable MemorySegment SEGMENT$xrDestroySpaceUserFB;
    public final @Nullable MemorySegment SEGMENT$xrDestroySpatialAnchorMSFT;
    public final @Nullable MemorySegment SEGMENT$xrDestroySpatialAnchorStoreConnectionMSFT;
    public final @Nullable MemorySegment SEGMENT$xrDestroySpatialAnchorsStorageML;
    public final @Nullable MemorySegment SEGMENT$xrDestroySpatialContextEXT;
    public final @Nullable MemorySegment SEGMENT$xrDestroySpatialEntityEXT;
    public final @Nullable MemorySegment SEGMENT$xrDestroySpatialGraphNodeBindingMSFT;
    public final @Nullable MemorySegment SEGMENT$xrDestroySpatialPersistenceContextEXT;
    public final @Nullable MemorySegment SEGMENT$xrDestroySpatialSnapshotEXT;
    public final @Nullable MemorySegment SEGMENT$xrDestroySwapchain;
    public final @Nullable MemorySegment SEGMENT$xrDestroyTriangleMeshFB;
    public final @Nullable MemorySegment SEGMENT$xrDestroyVirtualKeyboardMETA;
    public final @Nullable MemorySegment SEGMENT$xrDestroyWorldMeshDetectorML;
    public final @Nullable MemorySegment SEGMENT$xrDownloadSharedSpatialAnchorAsyncBD;
    public final @Nullable MemorySegment SEGMENT$xrDownloadSharedSpatialAnchorCompleteBD;
    public final @Nullable MemorySegment SEGMENT$xrEnableLocalizationEventsML;
    public final @Nullable MemorySegment SEGMENT$xrEnableUserCalibrationEventsML;
    public final @Nullable MemorySegment SEGMENT$xrEndFrame;
    public final @Nullable MemorySegment SEGMENT$xrEndSession;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateApiLayerProperties;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateBoundSourcesForAction;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateColorSpacesFB;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateDisplayRefreshRatesFB;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateEnvironmentBlendModes;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateEnvironmentDepthSwapchainImagesMETA;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateExternalCamerasOCULUS;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateInstanceExtensionProperties;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateInteractionRenderModelIdsEXT;
    public final @Nullable MemorySegment SEGMENT$xrEnumeratePerformanceMetricsCounterPathsMETA;
    public final @Nullable MemorySegment SEGMENT$xrEnumeratePersistedSpatialAnchorNamesMSFT;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateReferenceSpaces;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateRenderModelPathsFB;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateRenderModelSubactionPathsEXT;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateReprojectionModesMSFT;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateSceneComputeFeaturesMSFT;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateSpaceSupportedComponentsFB;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateSpatialCapabilitiesEXT;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateSpatialCapabilityComponentTypesEXT;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateSpatialCapabilityFeaturesEXT;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateSpatialEntityComponentTypesBD;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateSpatialPersistenceScopesEXT;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateSwapchainFormats;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateSwapchainImages;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateViewConfigurationViews;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateViewConfigurations;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateViveTrackerPathsHTCX;
    public final @Nullable MemorySegment SEGMENT$xrEraseSpaceFB;
    public final @Nullable MemorySegment SEGMENT$xrFreeWorldMeshBufferML;
    public final @Nullable MemorySegment SEGMENT$xrGeometryInstanceSetTransformFB;
    public final @Nullable MemorySegment SEGMENT$xrGetActionStateBoolean;
    public final @Nullable MemorySegment SEGMENT$xrGetActionStateFloat;
    public final @Nullable MemorySegment SEGMENT$xrGetActionStatePose;
    public final @Nullable MemorySegment SEGMENT$xrGetActionStateVector2f;
    public final @Nullable MemorySegment SEGMENT$xrGetAnchorUuidBD;
    public final @Nullable MemorySegment SEGMENT$xrGetAudioInputDeviceGuidOculus;
    public final @Nullable MemorySegment SEGMENT$xrGetAudioOutputDeviceGuidOculus;
    public final @Nullable MemorySegment SEGMENT$xrGetBodySkeletonFB;
    public final @Nullable MemorySegment SEGMENT$xrGetBodySkeletonHTC;
    public final @Nullable MemorySegment SEGMENT$xrGetControllerModelKeyMSFT;
    public final @Nullable MemorySegment SEGMENT$xrGetControllerModelPropertiesMSFT;
    public final @Nullable MemorySegment SEGMENT$xrGetControllerModelStateMSFT;
    public final @Nullable MemorySegment SEGMENT$xrGetCurrentInteractionProfile;
    public final @Nullable MemorySegment SEGMENT$xrGetD3D11GraphicsRequirementsKHR;
    public final @Nullable MemorySegment SEGMENT$xrGetD3D12GraphicsRequirementsKHR;
    public final @Nullable MemorySegment SEGMENT$xrGetDeviceSampleRateFB;
    public final @Nullable MemorySegment SEGMENT$xrGetDisplayRefreshRateFB;
    public final @Nullable MemorySegment SEGMENT$xrGetEnvironmentDepthSwapchainStateMETA;
    public final @Nullable MemorySegment SEGMENT$xrGetExportedLocalizationMapDataML;
    public final @Nullable MemorySegment SEGMENT$xrGetEyeGazesFB;
    public final @Nullable MemorySegment SEGMENT$xrGetFaceExpressionWeights2FB;
    public final @Nullable MemorySegment SEGMENT$xrGetFaceExpressionWeightsFB;
    public final @Nullable MemorySegment SEGMENT$xrGetFacialExpressionBlendShapePropertiesML;
    public final @Nullable MemorySegment SEGMENT$xrGetFacialExpressionsHTC;
    public final @Nullable MemorySegment SEGMENT$xrGetFoveationEyeTrackedStateMETA;
    public final @Nullable MemorySegment SEGMENT$xrGetHandMeshFB;
    public final @Nullable MemorySegment SEGMENT$xrGetInputSourceLocalizedName;
    public final @Nullable MemorySegment SEGMENT$xrGetInstanceProcAddr;
    public final @Nullable MemorySegment SEGMENT$xrGetInstanceProperties;
    public final @Nullable MemorySegment SEGMENT$xrGetMarkerDetectorStateML;
    public final @Nullable MemorySegment SEGMENT$xrGetMarkerLengthML;
    public final @Nullable MemorySegment SEGMENT$xrGetMarkerNumberML;
    public final @Nullable MemorySegment SEGMENT$xrGetMarkerReprojectionErrorML;
    public final @Nullable MemorySegment SEGMENT$xrGetMarkerSizeVARJO;
    public final @Nullable MemorySegment SEGMENT$xrGetMarkerStringML;
    public final @Nullable MemorySegment SEGMENT$xrGetMarkersML;
    public final @Nullable MemorySegment SEGMENT$xrGetMetalGraphicsRequirementsKHR;
    public final @Nullable MemorySegment SEGMENT$xrGetOpenGLESGraphicsRequirementsKHR;
    public final @Nullable MemorySegment SEGMENT$xrGetOpenGLGraphicsRequirementsKHR;
    public final @Nullable MemorySegment SEGMENT$xrGetPassthroughPreferencesMETA;
    public final @Nullable MemorySegment SEGMENT$xrGetPerformanceMetricsStateMETA;
    public final @Nullable MemorySegment SEGMENT$xrGetPlaneDetectionStateEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetPlaneDetectionsEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetPlanePolygonBufferEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetQueriedSenseDataBD;
    public final @Nullable MemorySegment SEGMENT$xrGetRecommendedLayerResolutionMETA;
    public final @Nullable MemorySegment SEGMENT$xrGetReferenceSpaceBoundsRect;
    public final @Nullable MemorySegment SEGMENT$xrGetRenderModelAssetDataEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetRenderModelAssetPropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetRenderModelPoseTopLevelUserPathEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetRenderModelPropertiesEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetRenderModelPropertiesFB;
    public final @Nullable MemorySegment SEGMENT$xrGetRenderModelStateEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetSceneComponentsMSFT;
    public final @Nullable MemorySegment SEGMENT$xrGetSceneComputeStateMSFT;
    public final @Nullable MemorySegment SEGMENT$xrGetSceneMarkerDecodedStringMSFT;
    public final @Nullable MemorySegment SEGMENT$xrGetSceneMarkerRawDataMSFT;
    public final @Nullable MemorySegment SEGMENT$xrGetSceneMeshBuffersMSFT;
    public final @Nullable MemorySegment SEGMENT$xrGetSenseDataProviderStateBD;
    public final @Nullable MemorySegment SEGMENT$xrGetSerializedSceneFragmentDataMSFT;
    public final @Nullable MemorySegment SEGMENT$xrGetSpaceBoundary2DFB;
    public final @Nullable MemorySegment SEGMENT$xrGetSpaceBoundingBox2DFB;
    public final @Nullable MemorySegment SEGMENT$xrGetSpaceBoundingBox3DFB;
    public final @Nullable MemorySegment SEGMENT$xrGetSpaceComponentStatusFB;
    public final @Nullable MemorySegment SEGMENT$xrGetSpaceContainerFB;
    public final @Nullable MemorySegment SEGMENT$xrGetSpaceRoomLayoutFB;
    public final @Nullable MemorySegment SEGMENT$xrGetSpaceSemanticLabelsFB;
    public final @Nullable MemorySegment SEGMENT$xrGetSpaceTriangleMeshMETA;
    public final @Nullable MemorySegment SEGMENT$xrGetSpaceUserIdFB;
    public final @Nullable MemorySegment SEGMENT$xrGetSpaceUuidFB;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialAnchorNameHTC;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialAnchorStateML;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialBufferFloatEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialBufferStringEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialBufferUint16EXT;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialBufferUint32EXT;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialBufferUint8EXT;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialBufferVector2fEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialBufferVector3fEXT;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialEntityComponentDataBD;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialEntityUuidBD;
    public final @Nullable MemorySegment SEGMENT$xrGetSpatialGraphNodeBindingPropertiesMSFT;
    public final @Nullable MemorySegment SEGMENT$xrGetSwapchainStateFB;
    public final @Nullable MemorySegment SEGMENT$xrGetSystem;
    public final @Nullable MemorySegment SEGMENT$xrGetSystemProperties;
    public final @Nullable MemorySegment SEGMENT$xrGetViewConfigurationProperties;
    public final @Nullable MemorySegment SEGMENT$xrGetVirtualKeyboardDirtyTexturesMETA;
    public final @Nullable MemorySegment SEGMENT$xrGetVirtualKeyboardModelAnimationStatesMETA;
    public final @Nullable MemorySegment SEGMENT$xrGetVirtualKeyboardScaleMETA;
    public final @Nullable MemorySegment SEGMENT$xrGetVirtualKeyboardTextureDataMETA;
    public final @Nullable MemorySegment SEGMENT$xrGetVisibilityMaskKHR;
    public final @Nullable MemorySegment SEGMENT$xrGetVulkanDeviceExtensionsKHR;
    public final @Nullable MemorySegment SEGMENT$xrGetVulkanGraphicsDevice2KHR;
    public final @Nullable MemorySegment SEGMENT$xrGetVulkanGraphicsDeviceKHR;
    public final @Nullable MemorySegment SEGMENT$xrGetVulkanGraphicsRequirements2KHR;
    public final @Nullable MemorySegment SEGMENT$xrGetVulkanGraphicsRequirementsKHR;
    public final @Nullable MemorySegment SEGMENT$xrGetVulkanInstanceExtensionsKHR;
    public final @Nullable MemorySegment SEGMENT$xrGetWorldMeshBufferRecommendSizeML;
    public final @Nullable MemorySegment SEGMENT$xrImportLocalizationMapML;
    public final @Nullable MemorySegment SEGMENT$xrInitializeLoaderKHR;
    public final @Nullable MemorySegment SEGMENT$xrLoadControllerModelMSFT;
    public final @Nullable MemorySegment SEGMENT$xrLoadRenderModelFB;
    public final @Nullable MemorySegment SEGMENT$xrLocateBodyJointsBD;
    public final @Nullable MemorySegment SEGMENT$xrLocateBodyJointsFB;
    public final @Nullable MemorySegment SEGMENT$xrLocateBodyJointsHTC;
    public final @Nullable MemorySegment SEGMENT$xrLocateHandJointsEXT;
    public final @Nullable MemorySegment SEGMENT$xrLocateSceneComponentsMSFT;
    public final @Nullable MemorySegment SEGMENT$xrLocateSpace;
    public final @Nullable MemorySegment SEGMENT$xrLocateSpaces;
    public final @Nullable MemorySegment SEGMENT$xrLocateSpacesKHR;
    public final @Nullable MemorySegment SEGMENT$xrLocateViews;
    public final @Nullable MemorySegment SEGMENT$xrNegotiateLoaderApiLayerInterface;
    public final @Nullable MemorySegment SEGMENT$xrNegotiateLoaderRuntimeInterface;
    public final @Nullable MemorySegment SEGMENT$xrPassthroughLayerPauseFB;
    public final @Nullable MemorySegment SEGMENT$xrPassthroughLayerResumeFB;
    public final @Nullable MemorySegment SEGMENT$xrPassthroughLayerSetKeyboardHandsIntensityFB;
    public final @Nullable MemorySegment SEGMENT$xrPassthroughLayerSetStyleFB;
    public final @Nullable MemorySegment SEGMENT$xrPassthroughPauseFB;
    public final @Nullable MemorySegment SEGMENT$xrPassthroughStartFB;
    public final @Nullable MemorySegment SEGMENT$xrPathToString;
    public final @Nullable MemorySegment SEGMENT$xrPauseSimultaneousHandsAndControllersTrackingMETA;
    public final @Nullable MemorySegment SEGMENT$xrPerfSettingsSetPerformanceLevelEXT;
    public final @Nullable MemorySegment SEGMENT$xrPersistSpatialAnchorAsyncBD;
    public final @Nullable MemorySegment SEGMENT$xrPersistSpatialAnchorCompleteBD;
    public final @Nullable MemorySegment SEGMENT$xrPersistSpatialAnchorMSFT;
    public final @Nullable MemorySegment SEGMENT$xrPersistSpatialEntityAsyncEXT;
    public final @Nullable MemorySegment SEGMENT$xrPersistSpatialEntityCompleteEXT;
    public final @Nullable MemorySegment SEGMENT$xrPollEvent;
    public final @Nullable MemorySegment SEGMENT$xrPollFutureEXT;
    public final @Nullable MemorySegment SEGMENT$xrPublishSpatialAnchorsAsyncML;
    public final @Nullable MemorySegment SEGMENT$xrPublishSpatialAnchorsCompleteML;
    public final @Nullable MemorySegment SEGMENT$xrQueryLocalizationMapsML;
    public final @Nullable MemorySegment SEGMENT$xrQueryPerformanceMetricsCounterMETA;
    public final @Nullable MemorySegment SEGMENT$xrQuerySenseDataAsyncBD;
    public final @Nullable MemorySegment SEGMENT$xrQuerySenseDataCompleteBD;
    public final @Nullable MemorySegment SEGMENT$xrQuerySpacesFB;
    public final @Nullable MemorySegment SEGMENT$xrQuerySpatialAnchorsAsyncML;
    public final @Nullable MemorySegment SEGMENT$xrQuerySpatialAnchorsCompleteML;
    public final @Nullable MemorySegment SEGMENT$xrQuerySpatialComponentDataEXT;
    public final @Nullable MemorySegment SEGMENT$xrQuerySystemTrackedKeyboardFB;
    public final @Nullable MemorySegment SEGMENT$xrReleaseSwapchainImage;
    public final @Nullable MemorySegment SEGMENT$xrRequestDisplayRefreshRateFB;
    public final @Nullable MemorySegment SEGMENT$xrRequestExitSession;
    public final @Nullable MemorySegment SEGMENT$xrRequestMapLocalizationML;
    public final @Nullable MemorySegment SEGMENT$xrRequestSceneCaptureFB;
    public final @Nullable MemorySegment SEGMENT$xrRequestWorldMeshAsyncML;
    public final @Nullable MemorySegment SEGMENT$xrRequestWorldMeshCompleteML;
    public final @Nullable MemorySegment SEGMENT$xrRequestWorldMeshStateAsyncML;
    public final @Nullable MemorySegment SEGMENT$xrRequestWorldMeshStateCompleteML;
    public final @Nullable MemorySegment SEGMENT$xrResultToString;
    public final @Nullable MemorySegment SEGMENT$xrResumeSimultaneousHandsAndControllersTrackingMETA;
    public final @Nullable MemorySegment SEGMENT$xrRetrieveSpaceQueryResultsFB;
    public final @Nullable MemorySegment SEGMENT$xrSaveSpaceFB;
    public final @Nullable MemorySegment SEGMENT$xrSaveSpaceListFB;
    public final @Nullable MemorySegment SEGMENT$xrSendVirtualKeyboardInputMETA;
    public final @Nullable MemorySegment SEGMENT$xrSessionBeginDebugUtilsLabelRegionEXT;
    public final @Nullable MemorySegment SEGMENT$xrSessionEndDebugUtilsLabelRegionEXT;
    public final @Nullable MemorySegment SEGMENT$xrSessionInsertDebugUtilsLabelEXT;
    public final @Nullable MemorySegment SEGMENT$xrSetAndroidApplicationThreadKHR;
    public final @Nullable MemorySegment SEGMENT$xrSetColorSpaceFB;
    public final @Nullable MemorySegment SEGMENT$xrSetDebugUtilsObjectNameEXT;
    public final @Nullable MemorySegment SEGMENT$xrSetDigitalLensControlALMALENCE;
    public final @Nullable MemorySegment SEGMENT$xrSetEnvironmentDepthEstimationVARJO;
    public final @Nullable MemorySegment SEGMENT$xrSetEnvironmentDepthHandRemovalMETA;
    public final @Nullable MemorySegment SEGMENT$xrSetInputDeviceActiveEXT;
    public final @Nullable MemorySegment SEGMENT$xrSetInputDeviceLocationEXT;
    public final @Nullable MemorySegment SEGMENT$xrSetInputDeviceStateBoolEXT;
    public final @Nullable MemorySegment SEGMENT$xrSetInputDeviceStateFloatEXT;
    public final @Nullable MemorySegment SEGMENT$xrSetInputDeviceStateVector2fEXT;
    public final @Nullable MemorySegment SEGMENT$xrSetMarkerTrackingPredictionVARJO;
    public final @Nullable MemorySegment SEGMENT$xrSetMarkerTrackingTimeoutVARJO;
    public final @Nullable MemorySegment SEGMENT$xrSetMarkerTrackingVARJO;
    public final @Nullable MemorySegment SEGMENT$xrSetPerformanceMetricsStateMETA;
    public final @Nullable MemorySegment SEGMENT$xrSetSpaceComponentStatusFB;
    public final @Nullable MemorySegment SEGMENT$xrSetSystemNotificationsML;
    public final @Nullable MemorySegment SEGMENT$xrSetTrackingOptimizationSettingsHintQCOM;
    public final @Nullable MemorySegment SEGMENT$xrSetViewOffsetVARJO;
    public final @Nullable MemorySegment SEGMENT$xrSetVirtualKeyboardModelVisibilityMETA;
    public final @Nullable MemorySegment SEGMENT$xrShareSpacesFB;
    public final @Nullable MemorySegment SEGMENT$xrShareSpacesMETA;
    public final @Nullable MemorySegment SEGMENT$xrShareSpatialAnchorAsyncBD;
    public final @Nullable MemorySegment SEGMENT$xrShareSpatialAnchorCompleteBD;
    public final @Nullable MemorySegment SEGMENT$xrSnapshotMarkerDetectorML;
    public final @Nullable MemorySegment SEGMENT$xrStartColocationAdvertisementMETA;
    public final @Nullable MemorySegment SEGMENT$xrStartColocationDiscoveryMETA;
    public final @Nullable MemorySegment SEGMENT$xrStartEnvironmentDepthProviderMETA;
    public final @Nullable MemorySegment SEGMENT$xrStartSenseDataProviderAsyncBD;
    public final @Nullable MemorySegment SEGMENT$xrStartSenseDataProviderCompleteBD;
    public final @Nullable MemorySegment SEGMENT$xrStopColocationAdvertisementMETA;
    public final @Nullable MemorySegment SEGMENT$xrStopColocationDiscoveryMETA;
    public final @Nullable MemorySegment SEGMENT$xrStopEnvironmentDepthProviderMETA;
    public final @Nullable MemorySegment SEGMENT$xrStopHapticFeedback;
    public final @Nullable MemorySegment SEGMENT$xrStopSenseDataProviderBD;
    public final @Nullable MemorySegment SEGMENT$xrStringToPath;
    public final @Nullable MemorySegment SEGMENT$xrStructureTypeToString;
    public final @Nullable MemorySegment SEGMENT$xrStructureTypeToString2KHR;
    public final @Nullable MemorySegment SEGMENT$xrSubmitDebugUtilsMessageEXT;
    public final @Nullable MemorySegment SEGMENT$xrSuggestInteractionProfileBindings;
    public final @Nullable MemorySegment SEGMENT$xrSuggestVirtualKeyboardLocationMETA;
    public final @Nullable MemorySegment SEGMENT$xrSyncActions;
    public final @Nullable MemorySegment SEGMENT$xrThermalGetTemperatureTrendEXT;
    public final @Nullable MemorySegment SEGMENT$xrTriangleMeshBeginUpdateFB;
    public final @Nullable MemorySegment SEGMENT$xrTriangleMeshBeginVertexBufferUpdateFB;
    public final @Nullable MemorySegment SEGMENT$xrTriangleMeshEndUpdateFB;
    public final @Nullable MemorySegment SEGMENT$xrTriangleMeshEndVertexBufferUpdateFB;
    public final @Nullable MemorySegment SEGMENT$xrTriangleMeshGetIndexBufferFB;
    public final @Nullable MemorySegment SEGMENT$xrTriangleMeshGetVertexBufferFB;
    public final @Nullable MemorySegment SEGMENT$xrTryCreateSpatialGraphStaticNodeBindingMSFT;
    public final @Nullable MemorySegment SEGMENT$xrTryGetPerceptionAnchorFromSpatialAnchorMSFT;
    public final @Nullable MemorySegment SEGMENT$xrUnpersistSpatialAnchorAsyncBD;
    public final @Nullable MemorySegment SEGMENT$xrUnpersistSpatialAnchorCompleteBD;
    public final @Nullable MemorySegment SEGMENT$xrUnpersistSpatialAnchorMSFT;
    public final @Nullable MemorySegment SEGMENT$xrUnpersistSpatialEntityAsyncEXT;
    public final @Nullable MemorySegment SEGMENT$xrUnpersistSpatialEntityCompleteEXT;
    public final @Nullable MemorySegment SEGMENT$xrUpdateHandMeshMSFT;
    public final @Nullable MemorySegment SEGMENT$xrUpdatePassthroughColorLutMETA;
    public final @Nullable MemorySegment SEGMENT$xrUpdateSpatialAnchorsExpirationAsyncML;
    public final @Nullable MemorySegment SEGMENT$xrUpdateSpatialAnchorsExpirationCompleteML;
    public final @Nullable MemorySegment SEGMENT$xrUpdateSwapchainFB;
    public final @Nullable MemorySegment SEGMENT$xrWaitFrame;
    public final @Nullable MemorySegment SEGMENT$xrWaitSwapchainImage;
    public final @Nullable MethodHandle HANDLE$xrAcquireEnvironmentDepthImageMETA;
    public final @Nullable MethodHandle HANDLE$xrAcquireSwapchainImage;
    public final @Nullable MethodHandle HANDLE$xrAllocateWorldMeshBufferML;
    public final @Nullable MethodHandle HANDLE$xrApplyForceFeedbackCurlMNDX;
    public final @Nullable MethodHandle HANDLE$xrApplyFoveationHTC;
    public final @Nullable MethodHandle HANDLE$xrApplyHapticFeedback;
    public final @Nullable MethodHandle HANDLE$xrAttachSessionActionSets;
    public final @Nullable MethodHandle HANDLE$xrBeginFrame;
    public final @Nullable MethodHandle HANDLE$xrBeginPlaneDetectionEXT;
    public final @Nullable MethodHandle HANDLE$xrBeginSession;
    public final @Nullable MethodHandle HANDLE$xrCancelFutureEXT;
    public final @Nullable MethodHandle HANDLE$xrCaptureSceneAsyncBD;
    public final @Nullable MethodHandle HANDLE$xrCaptureSceneCompleteBD;
    public final @Nullable MethodHandle HANDLE$xrChangeVirtualKeyboardTextContextMETA;
    public final @Nullable MethodHandle HANDLE$xrClearSpatialAnchorStoreMSFT;
    public final @Nullable MethodHandle HANDLE$xrComputeNewSceneMSFT;
    public final @Nullable MethodHandle HANDLE$xrConvertTimeToTimespecTimeKHR;
    public final @Nullable MethodHandle HANDLE$xrConvertTimeToWin32PerformanceCounterKHR;
    public final @Nullable MethodHandle HANDLE$xrConvertTimespecTimeToTimeKHR;
    public final @Nullable MethodHandle HANDLE$xrConvertWin32PerformanceCounterToTimeKHR;
    public final @Nullable MethodHandle HANDLE$xrCreateAction;
    public final @Nullable MethodHandle HANDLE$xrCreateActionSet;
    public final @Nullable MethodHandle HANDLE$xrCreateActionSpace;
    public final @Nullable MethodHandle HANDLE$xrCreateAnchorSpaceBD;
    public final @Nullable MethodHandle HANDLE$xrCreateApiLayerInstance;
    public final @Nullable MethodHandle HANDLE$xrCreateBodyTrackerBD;
    public final @Nullable MethodHandle HANDLE$xrCreateBodyTrackerFB;
    public final @Nullable MethodHandle HANDLE$xrCreateBodyTrackerHTC;
    public final @Nullable MethodHandle HANDLE$xrCreateDebugUtilsMessengerEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateEnvironmentDepthProviderMETA;
    public final @Nullable MethodHandle HANDLE$xrCreateEnvironmentDepthSwapchainMETA;
    public final @Nullable MethodHandle HANDLE$xrCreateExportedLocalizationMapML;
    public final @Nullable MethodHandle HANDLE$xrCreateEyeTrackerFB;
    public final @Nullable MethodHandle HANDLE$xrCreateFaceTracker2FB;
    public final @Nullable MethodHandle HANDLE$xrCreateFaceTrackerFB;
    public final @Nullable MethodHandle HANDLE$xrCreateFacialExpressionClientML;
    public final @Nullable MethodHandle HANDLE$xrCreateFacialTrackerHTC;
    public final @Nullable MethodHandle HANDLE$xrCreateFoveationProfileFB;
    public final @Nullable MethodHandle HANDLE$xrCreateGeometryInstanceFB;
    public final @Nullable MethodHandle HANDLE$xrCreateHandMeshSpaceMSFT;
    public final @Nullable MethodHandle HANDLE$xrCreateHandTrackerEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateInstance;
    public final @Nullable MethodHandle HANDLE$xrCreateKeyboardSpaceFB;
    public final @Nullable MethodHandle HANDLE$xrCreateMarkerDetectorML;
    public final @Nullable MethodHandle HANDLE$xrCreateMarkerSpaceML;
    public final @Nullable MethodHandle HANDLE$xrCreateMarkerSpaceVARJO;
    public final @Nullable MethodHandle HANDLE$xrCreatePassthroughColorLutMETA;
    public final @Nullable MethodHandle HANDLE$xrCreatePassthroughFB;
    public final @Nullable MethodHandle HANDLE$xrCreatePassthroughHTC;
    public final @Nullable MethodHandle HANDLE$xrCreatePassthroughLayerFB;
    public final @Nullable MethodHandle HANDLE$xrCreatePlaneDetectorEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateReferenceSpace;
    public final @Nullable MethodHandle HANDLE$xrCreateRenderModelAssetEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateRenderModelEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateRenderModelSpaceEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateSceneMSFT;
    public final @Nullable MethodHandle HANDLE$xrCreateSceneObserverMSFT;
    public final @Nullable MethodHandle HANDLE$xrCreateSenseDataProviderBD;
    public final @Nullable MethodHandle HANDLE$xrCreateSession;
    public final @Nullable MethodHandle HANDLE$xrCreateSpaceFromCoordinateFrameUIDML;
    public final @Nullable MethodHandle HANDLE$xrCreateSpaceUserFB;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorAsyncBD;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorCompleteBD;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorFB;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorFromPerceptionAnchorMSFT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorFromPersistedNameMSFT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorHTC;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorMSFT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorSpaceMSFT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorStoreConnectionMSFT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorsAsyncML;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorsCompleteML;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialAnchorsStorageML;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialContextAsyncEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialContextCompleteEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialDiscoverySnapshotAsyncEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialDiscoverySnapshotCompleteEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialEntityAnchorBD;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialEntityFromIdEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialGraphNodeSpaceMSFT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialPersistenceContextAsyncEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialPersistenceContextCompleteEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateSpatialUpdateSnapshotEXT;
    public final @Nullable MethodHandle HANDLE$xrCreateSwapchain;
    public final @Nullable MethodHandle HANDLE$xrCreateSwapchainAndroidSurfaceKHR;
    public final @Nullable MethodHandle HANDLE$xrCreateTriangleMeshFB;
    public final @Nullable MethodHandle HANDLE$xrCreateVirtualKeyboardMETA;
    public final @Nullable MethodHandle HANDLE$xrCreateVirtualKeyboardSpaceMETA;
    public final @Nullable MethodHandle HANDLE$xrCreateVulkanDeviceKHR;
    public final @Nullable MethodHandle HANDLE$xrCreateVulkanInstanceKHR;
    public final @Nullable MethodHandle HANDLE$xrCreateWorldMeshDetectorML;
    public final @Nullable MethodHandle HANDLE$xrDeleteSpatialAnchorsAsyncML;
    public final @Nullable MethodHandle HANDLE$xrDeleteSpatialAnchorsCompleteML;
    public final @Nullable MethodHandle HANDLE$xrDeserializeSceneMSFT;
    public final @Nullable MethodHandle HANDLE$xrDestroyAction;
    public final @Nullable MethodHandle HANDLE$xrDestroyActionSet;
    public final @Nullable MethodHandle HANDLE$xrDestroyAnchorBD;
    public final @Nullable MethodHandle HANDLE$xrDestroyBodyTrackerBD;
    public final @Nullable MethodHandle HANDLE$xrDestroyBodyTrackerFB;
    public final @Nullable MethodHandle HANDLE$xrDestroyBodyTrackerHTC;
    public final @Nullable MethodHandle HANDLE$xrDestroyDebugUtilsMessengerEXT;
    public final @Nullable MethodHandle HANDLE$xrDestroyEnvironmentDepthProviderMETA;
    public final @Nullable MethodHandle HANDLE$xrDestroyEnvironmentDepthSwapchainMETA;
    public final @Nullable MethodHandle HANDLE$xrDestroyExportedLocalizationMapML;
    public final @Nullable MethodHandle HANDLE$xrDestroyEyeTrackerFB;
    public final @Nullable MethodHandle HANDLE$xrDestroyFaceTracker2FB;
    public final @Nullable MethodHandle HANDLE$xrDestroyFaceTrackerFB;
    public final @Nullable MethodHandle HANDLE$xrDestroyFacialExpressionClientML;
    public final @Nullable MethodHandle HANDLE$xrDestroyFacialTrackerHTC;
    public final @Nullable MethodHandle HANDLE$xrDestroyFoveationProfileFB;
    public final @Nullable MethodHandle HANDLE$xrDestroyGeometryInstanceFB;
    public final @Nullable MethodHandle HANDLE$xrDestroyHandTrackerEXT;
    public final @Nullable MethodHandle HANDLE$xrDestroyInstance;
    public final @Nullable MethodHandle HANDLE$xrDestroyMarkerDetectorML;
    public final @Nullable MethodHandle HANDLE$xrDestroyPassthroughColorLutMETA;
    public final @Nullable MethodHandle HANDLE$xrDestroyPassthroughFB;
    public final @Nullable MethodHandle HANDLE$xrDestroyPassthroughHTC;
    public final @Nullable MethodHandle HANDLE$xrDestroyPassthroughLayerFB;
    public final @Nullable MethodHandle HANDLE$xrDestroyPlaneDetectorEXT;
    public final @Nullable MethodHandle HANDLE$xrDestroyRenderModelAssetEXT;
    public final @Nullable MethodHandle HANDLE$xrDestroyRenderModelEXT;
    public final @Nullable MethodHandle HANDLE$xrDestroySceneMSFT;
    public final @Nullable MethodHandle HANDLE$xrDestroySceneObserverMSFT;
    public final @Nullable MethodHandle HANDLE$xrDestroySenseDataProviderBD;
    public final @Nullable MethodHandle HANDLE$xrDestroySenseDataSnapshotBD;
    public final @Nullable MethodHandle HANDLE$xrDestroySession;
    public final @Nullable MethodHandle HANDLE$xrDestroySpace;
    public final @Nullable MethodHandle HANDLE$xrDestroySpaceUserFB;
    public final @Nullable MethodHandle HANDLE$xrDestroySpatialAnchorMSFT;
    public final @Nullable MethodHandle HANDLE$xrDestroySpatialAnchorStoreConnectionMSFT;
    public final @Nullable MethodHandle HANDLE$xrDestroySpatialAnchorsStorageML;
    public final @Nullable MethodHandle HANDLE$xrDestroySpatialContextEXT;
    public final @Nullable MethodHandle HANDLE$xrDestroySpatialEntityEXT;
    public final @Nullable MethodHandle HANDLE$xrDestroySpatialGraphNodeBindingMSFT;
    public final @Nullable MethodHandle HANDLE$xrDestroySpatialPersistenceContextEXT;
    public final @Nullable MethodHandle HANDLE$xrDestroySpatialSnapshotEXT;
    public final @Nullable MethodHandle HANDLE$xrDestroySwapchain;
    public final @Nullable MethodHandle HANDLE$xrDestroyTriangleMeshFB;
    public final @Nullable MethodHandle HANDLE$xrDestroyVirtualKeyboardMETA;
    public final @Nullable MethodHandle HANDLE$xrDestroyWorldMeshDetectorML;
    public final @Nullable MethodHandle HANDLE$xrDownloadSharedSpatialAnchorAsyncBD;
    public final @Nullable MethodHandle HANDLE$xrDownloadSharedSpatialAnchorCompleteBD;
    public final @Nullable MethodHandle HANDLE$xrEnableLocalizationEventsML;
    public final @Nullable MethodHandle HANDLE$xrEnableUserCalibrationEventsML;
    public final @Nullable MethodHandle HANDLE$xrEndFrame;
    public final @Nullable MethodHandle HANDLE$xrEndSession;
    public final @Nullable MethodHandle HANDLE$xrEnumerateApiLayerProperties;
    public final @Nullable MethodHandle HANDLE$xrEnumerateBoundSourcesForAction;
    public final @Nullable MethodHandle HANDLE$xrEnumerateColorSpacesFB;
    public final @Nullable MethodHandle HANDLE$xrEnumerateDisplayRefreshRatesFB;
    public final @Nullable MethodHandle HANDLE$xrEnumerateEnvironmentBlendModes;
    public final @Nullable MethodHandle HANDLE$xrEnumerateEnvironmentDepthSwapchainImagesMETA;
    public final @Nullable MethodHandle HANDLE$xrEnumerateExternalCamerasOCULUS;
    public final @Nullable MethodHandle HANDLE$xrEnumerateInstanceExtensionProperties;
    public final @Nullable MethodHandle HANDLE$xrEnumerateInteractionRenderModelIdsEXT;
    public final @Nullable MethodHandle HANDLE$xrEnumeratePerformanceMetricsCounterPathsMETA;
    public final @Nullable MethodHandle HANDLE$xrEnumeratePersistedSpatialAnchorNamesMSFT;
    public final @Nullable MethodHandle HANDLE$xrEnumerateReferenceSpaces;
    public final @Nullable MethodHandle HANDLE$xrEnumerateRenderModelPathsFB;
    public final @Nullable MethodHandle HANDLE$xrEnumerateRenderModelSubactionPathsEXT;
    public final @Nullable MethodHandle HANDLE$xrEnumerateReprojectionModesMSFT;
    public final @Nullable MethodHandle HANDLE$xrEnumerateSceneComputeFeaturesMSFT;
    public final @Nullable MethodHandle HANDLE$xrEnumerateSpaceSupportedComponentsFB;
    public final @Nullable MethodHandle HANDLE$xrEnumerateSpatialCapabilitiesEXT;
    public final @Nullable MethodHandle HANDLE$xrEnumerateSpatialCapabilityComponentTypesEXT;
    public final @Nullable MethodHandle HANDLE$xrEnumerateSpatialCapabilityFeaturesEXT;
    public final @Nullable MethodHandle HANDLE$xrEnumerateSpatialEntityComponentTypesBD;
    public final @Nullable MethodHandle HANDLE$xrEnumerateSpatialPersistenceScopesEXT;
    public final @Nullable MethodHandle HANDLE$xrEnumerateSwapchainFormats;
    public final @Nullable MethodHandle HANDLE$xrEnumerateSwapchainImages;
    public final @Nullable MethodHandle HANDLE$xrEnumerateViewConfigurationViews;
    public final @Nullable MethodHandle HANDLE$xrEnumerateViewConfigurations;
    public final @Nullable MethodHandle HANDLE$xrEnumerateViveTrackerPathsHTCX;
    public final @Nullable MethodHandle HANDLE$xrEraseSpaceFB;
    public final @Nullable MethodHandle HANDLE$xrFreeWorldMeshBufferML;
    public final @Nullable MethodHandle HANDLE$xrGeometryInstanceSetTransformFB;
    public final @Nullable MethodHandle HANDLE$xrGetActionStateBoolean;
    public final @Nullable MethodHandle HANDLE$xrGetActionStateFloat;
    public final @Nullable MethodHandle HANDLE$xrGetActionStatePose;
    public final @Nullable MethodHandle HANDLE$xrGetActionStateVector2f;
    public final @Nullable MethodHandle HANDLE$xrGetAnchorUuidBD;
    public final @Nullable MethodHandle HANDLE$xrGetAudioInputDeviceGuidOculus;
    public final @Nullable MethodHandle HANDLE$xrGetAudioOutputDeviceGuidOculus;
    public final @Nullable MethodHandle HANDLE$xrGetBodySkeletonFB;
    public final @Nullable MethodHandle HANDLE$xrGetBodySkeletonHTC;
    public final @Nullable MethodHandle HANDLE$xrGetControllerModelKeyMSFT;
    public final @Nullable MethodHandle HANDLE$xrGetControllerModelPropertiesMSFT;
    public final @Nullable MethodHandle HANDLE$xrGetControllerModelStateMSFT;
    public final @Nullable MethodHandle HANDLE$xrGetCurrentInteractionProfile;
    public final @Nullable MethodHandle HANDLE$xrGetD3D11GraphicsRequirementsKHR;
    public final @Nullable MethodHandle HANDLE$xrGetD3D12GraphicsRequirementsKHR;
    public final @Nullable MethodHandle HANDLE$xrGetDeviceSampleRateFB;
    public final @Nullable MethodHandle HANDLE$xrGetDisplayRefreshRateFB;
    public final @Nullable MethodHandle HANDLE$xrGetEnvironmentDepthSwapchainStateMETA;
    public final @Nullable MethodHandle HANDLE$xrGetExportedLocalizationMapDataML;
    public final @Nullable MethodHandle HANDLE$xrGetEyeGazesFB;
    public final @Nullable MethodHandle HANDLE$xrGetFaceExpressionWeights2FB;
    public final @Nullable MethodHandle HANDLE$xrGetFaceExpressionWeightsFB;
    public final @Nullable MethodHandle HANDLE$xrGetFacialExpressionBlendShapePropertiesML;
    public final @Nullable MethodHandle HANDLE$xrGetFacialExpressionsHTC;
    public final @Nullable MethodHandle HANDLE$xrGetFoveationEyeTrackedStateMETA;
    public final @Nullable MethodHandle HANDLE$xrGetHandMeshFB;
    public final @Nullable MethodHandle HANDLE$xrGetInputSourceLocalizedName;
    public final @Nullable MethodHandle HANDLE$xrGetInstanceProcAddr;
    public final @Nullable MethodHandle HANDLE$xrGetInstanceProperties;
    public final @Nullable MethodHandle HANDLE$xrGetMarkerDetectorStateML;
    public final @Nullable MethodHandle HANDLE$xrGetMarkerLengthML;
    public final @Nullable MethodHandle HANDLE$xrGetMarkerNumberML;
    public final @Nullable MethodHandle HANDLE$xrGetMarkerReprojectionErrorML;
    public final @Nullable MethodHandle HANDLE$xrGetMarkerSizeVARJO;
    public final @Nullable MethodHandle HANDLE$xrGetMarkerStringML;
    public final @Nullable MethodHandle HANDLE$xrGetMarkersML;
    public final @Nullable MethodHandle HANDLE$xrGetMetalGraphicsRequirementsKHR;
    public final @Nullable MethodHandle HANDLE$xrGetOpenGLESGraphicsRequirementsKHR;
    public final @Nullable MethodHandle HANDLE$xrGetOpenGLGraphicsRequirementsKHR;
    public final @Nullable MethodHandle HANDLE$xrGetPassthroughPreferencesMETA;
    public final @Nullable MethodHandle HANDLE$xrGetPerformanceMetricsStateMETA;
    public final @Nullable MethodHandle HANDLE$xrGetPlaneDetectionStateEXT;
    public final @Nullable MethodHandle HANDLE$xrGetPlaneDetectionsEXT;
    public final @Nullable MethodHandle HANDLE$xrGetPlanePolygonBufferEXT;
    public final @Nullable MethodHandle HANDLE$xrGetQueriedSenseDataBD;
    public final @Nullable MethodHandle HANDLE$xrGetRecommendedLayerResolutionMETA;
    public final @Nullable MethodHandle HANDLE$xrGetReferenceSpaceBoundsRect;
    public final @Nullable MethodHandle HANDLE$xrGetRenderModelAssetDataEXT;
    public final @Nullable MethodHandle HANDLE$xrGetRenderModelAssetPropertiesEXT;
    public final @Nullable MethodHandle HANDLE$xrGetRenderModelPoseTopLevelUserPathEXT;
    public final @Nullable MethodHandle HANDLE$xrGetRenderModelPropertiesEXT;
    public final @Nullable MethodHandle HANDLE$xrGetRenderModelPropertiesFB;
    public final @Nullable MethodHandle HANDLE$xrGetRenderModelStateEXT;
    public final @Nullable MethodHandle HANDLE$xrGetSceneComponentsMSFT;
    public final @Nullable MethodHandle HANDLE$xrGetSceneComputeStateMSFT;
    public final @Nullable MethodHandle HANDLE$xrGetSceneMarkerDecodedStringMSFT;
    public final @Nullable MethodHandle HANDLE$xrGetSceneMarkerRawDataMSFT;
    public final @Nullable MethodHandle HANDLE$xrGetSceneMeshBuffersMSFT;
    public final @Nullable MethodHandle HANDLE$xrGetSenseDataProviderStateBD;
    public final @Nullable MethodHandle HANDLE$xrGetSerializedSceneFragmentDataMSFT;
    public final @Nullable MethodHandle HANDLE$xrGetSpaceBoundary2DFB;
    public final @Nullable MethodHandle HANDLE$xrGetSpaceBoundingBox2DFB;
    public final @Nullable MethodHandle HANDLE$xrGetSpaceBoundingBox3DFB;
    public final @Nullable MethodHandle HANDLE$xrGetSpaceComponentStatusFB;
    public final @Nullable MethodHandle HANDLE$xrGetSpaceContainerFB;
    public final @Nullable MethodHandle HANDLE$xrGetSpaceRoomLayoutFB;
    public final @Nullable MethodHandle HANDLE$xrGetSpaceSemanticLabelsFB;
    public final @Nullable MethodHandle HANDLE$xrGetSpaceTriangleMeshMETA;
    public final @Nullable MethodHandle HANDLE$xrGetSpaceUserIdFB;
    public final @Nullable MethodHandle HANDLE$xrGetSpaceUuidFB;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialAnchorNameHTC;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialAnchorStateML;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialBufferFloatEXT;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialBufferStringEXT;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialBufferUint16EXT;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialBufferUint32EXT;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialBufferUint8EXT;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialBufferVector2fEXT;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialBufferVector3fEXT;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialEntityComponentDataBD;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialEntityUuidBD;
    public final @Nullable MethodHandle HANDLE$xrGetSpatialGraphNodeBindingPropertiesMSFT;
    public final @Nullable MethodHandle HANDLE$xrGetSwapchainStateFB;
    public final @Nullable MethodHandle HANDLE$xrGetSystem;
    public final @Nullable MethodHandle HANDLE$xrGetSystemProperties;
    public final @Nullable MethodHandle HANDLE$xrGetViewConfigurationProperties;
    public final @Nullable MethodHandle HANDLE$xrGetVirtualKeyboardDirtyTexturesMETA;
    public final @Nullable MethodHandle HANDLE$xrGetVirtualKeyboardModelAnimationStatesMETA;
    public final @Nullable MethodHandle HANDLE$xrGetVirtualKeyboardScaleMETA;
    public final @Nullable MethodHandle HANDLE$xrGetVirtualKeyboardTextureDataMETA;
    public final @Nullable MethodHandle HANDLE$xrGetVisibilityMaskKHR;
    public final @Nullable MethodHandle HANDLE$xrGetVulkanDeviceExtensionsKHR;
    public final @Nullable MethodHandle HANDLE$xrGetVulkanGraphicsDevice2KHR;
    public final @Nullable MethodHandle HANDLE$xrGetVulkanGraphicsDeviceKHR;
    public final @Nullable MethodHandle HANDLE$xrGetVulkanGraphicsRequirements2KHR;
    public final @Nullable MethodHandle HANDLE$xrGetVulkanGraphicsRequirementsKHR;
    public final @Nullable MethodHandle HANDLE$xrGetVulkanInstanceExtensionsKHR;
    public final @Nullable MethodHandle HANDLE$xrGetWorldMeshBufferRecommendSizeML;
    public final @Nullable MethodHandle HANDLE$xrImportLocalizationMapML;
    public final @Nullable MethodHandle HANDLE$xrInitializeLoaderKHR;
    public final @Nullable MethodHandle HANDLE$xrLoadControllerModelMSFT;
    public final @Nullable MethodHandle HANDLE$xrLoadRenderModelFB;
    public final @Nullable MethodHandle HANDLE$xrLocateBodyJointsBD;
    public final @Nullable MethodHandle HANDLE$xrLocateBodyJointsFB;
    public final @Nullable MethodHandle HANDLE$xrLocateBodyJointsHTC;
    public final @Nullable MethodHandle HANDLE$xrLocateHandJointsEXT;
    public final @Nullable MethodHandle HANDLE$xrLocateSceneComponentsMSFT;
    public final @Nullable MethodHandle HANDLE$xrLocateSpace;
    public final @Nullable MethodHandle HANDLE$xrLocateSpaces;
    public final @Nullable MethodHandle HANDLE$xrLocateSpacesKHR;
    public final @Nullable MethodHandle HANDLE$xrLocateViews;
    public final @Nullable MethodHandle HANDLE$xrNegotiateLoaderApiLayerInterface;
    public final @Nullable MethodHandle HANDLE$xrNegotiateLoaderRuntimeInterface;
    public final @Nullable MethodHandle HANDLE$xrPassthroughLayerPauseFB;
    public final @Nullable MethodHandle HANDLE$xrPassthroughLayerResumeFB;
    public final @Nullable MethodHandle HANDLE$xrPassthroughLayerSetKeyboardHandsIntensityFB;
    public final @Nullable MethodHandle HANDLE$xrPassthroughLayerSetStyleFB;
    public final @Nullable MethodHandle HANDLE$xrPassthroughPauseFB;
    public final @Nullable MethodHandle HANDLE$xrPassthroughStartFB;
    public final @Nullable MethodHandle HANDLE$xrPathToString;
    public final @Nullable MethodHandle HANDLE$xrPauseSimultaneousHandsAndControllersTrackingMETA;
    public final @Nullable MethodHandle HANDLE$xrPerfSettingsSetPerformanceLevelEXT;
    public final @Nullable MethodHandle HANDLE$xrPersistSpatialAnchorAsyncBD;
    public final @Nullable MethodHandle HANDLE$xrPersistSpatialAnchorCompleteBD;
    public final @Nullable MethodHandle HANDLE$xrPersistSpatialAnchorMSFT;
    public final @Nullable MethodHandle HANDLE$xrPersistSpatialEntityAsyncEXT;
    public final @Nullable MethodHandle HANDLE$xrPersistSpatialEntityCompleteEXT;
    public final @Nullable MethodHandle HANDLE$xrPollEvent;
    public final @Nullable MethodHandle HANDLE$xrPollFutureEXT;
    public final @Nullable MethodHandle HANDLE$xrPublishSpatialAnchorsAsyncML;
    public final @Nullable MethodHandle HANDLE$xrPublishSpatialAnchorsCompleteML;
    public final @Nullable MethodHandle HANDLE$xrQueryLocalizationMapsML;
    public final @Nullable MethodHandle HANDLE$xrQueryPerformanceMetricsCounterMETA;
    public final @Nullable MethodHandle HANDLE$xrQuerySenseDataAsyncBD;
    public final @Nullable MethodHandle HANDLE$xrQuerySenseDataCompleteBD;
    public final @Nullable MethodHandle HANDLE$xrQuerySpacesFB;
    public final @Nullable MethodHandle HANDLE$xrQuerySpatialAnchorsAsyncML;
    public final @Nullable MethodHandle HANDLE$xrQuerySpatialAnchorsCompleteML;
    public final @Nullable MethodHandle HANDLE$xrQuerySpatialComponentDataEXT;
    public final @Nullable MethodHandle HANDLE$xrQuerySystemTrackedKeyboardFB;
    public final @Nullable MethodHandle HANDLE$xrReleaseSwapchainImage;
    public final @Nullable MethodHandle HANDLE$xrRequestDisplayRefreshRateFB;
    public final @Nullable MethodHandle HANDLE$xrRequestExitSession;
    public final @Nullable MethodHandle HANDLE$xrRequestMapLocalizationML;
    public final @Nullable MethodHandle HANDLE$xrRequestSceneCaptureFB;
    public final @Nullable MethodHandle HANDLE$xrRequestWorldMeshAsyncML;
    public final @Nullable MethodHandle HANDLE$xrRequestWorldMeshCompleteML;
    public final @Nullable MethodHandle HANDLE$xrRequestWorldMeshStateAsyncML;
    public final @Nullable MethodHandle HANDLE$xrRequestWorldMeshStateCompleteML;
    public final @Nullable MethodHandle HANDLE$xrResultToString;
    public final @Nullable MethodHandle HANDLE$xrResumeSimultaneousHandsAndControllersTrackingMETA;
    public final @Nullable MethodHandle HANDLE$xrRetrieveSpaceQueryResultsFB;
    public final @Nullable MethodHandle HANDLE$xrSaveSpaceFB;
    public final @Nullable MethodHandle HANDLE$xrSaveSpaceListFB;
    public final @Nullable MethodHandle HANDLE$xrSendVirtualKeyboardInputMETA;
    public final @Nullable MethodHandle HANDLE$xrSessionBeginDebugUtilsLabelRegionEXT;
    public final @Nullable MethodHandle HANDLE$xrSessionEndDebugUtilsLabelRegionEXT;
    public final @Nullable MethodHandle HANDLE$xrSessionInsertDebugUtilsLabelEXT;
    public final @Nullable MethodHandle HANDLE$xrSetAndroidApplicationThreadKHR;
    public final @Nullable MethodHandle HANDLE$xrSetColorSpaceFB;
    public final @Nullable MethodHandle HANDLE$xrSetDebugUtilsObjectNameEXT;
    public final @Nullable MethodHandle HANDLE$xrSetDigitalLensControlALMALENCE;
    public final @Nullable MethodHandle HANDLE$xrSetEnvironmentDepthEstimationVARJO;
    public final @Nullable MethodHandle HANDLE$xrSetEnvironmentDepthHandRemovalMETA;
    public final @Nullable MethodHandle HANDLE$xrSetInputDeviceActiveEXT;
    public final @Nullable MethodHandle HANDLE$xrSetInputDeviceLocationEXT;
    public final @Nullable MethodHandle HANDLE$xrSetInputDeviceStateBoolEXT;
    public final @Nullable MethodHandle HANDLE$xrSetInputDeviceStateFloatEXT;
    public final @Nullable MethodHandle HANDLE$xrSetInputDeviceStateVector2fEXT;
    public final @Nullable MethodHandle HANDLE$xrSetMarkerTrackingPredictionVARJO;
    public final @Nullable MethodHandle HANDLE$xrSetMarkerTrackingTimeoutVARJO;
    public final @Nullable MethodHandle HANDLE$xrSetMarkerTrackingVARJO;
    public final @Nullable MethodHandle HANDLE$xrSetPerformanceMetricsStateMETA;
    public final @Nullable MethodHandle HANDLE$xrSetSpaceComponentStatusFB;
    public final @Nullable MethodHandle HANDLE$xrSetSystemNotificationsML;
    public final @Nullable MethodHandle HANDLE$xrSetTrackingOptimizationSettingsHintQCOM;
    public final @Nullable MethodHandle HANDLE$xrSetViewOffsetVARJO;
    public final @Nullable MethodHandle HANDLE$xrSetVirtualKeyboardModelVisibilityMETA;
    public final @Nullable MethodHandle HANDLE$xrShareSpacesFB;
    public final @Nullable MethodHandle HANDLE$xrShareSpacesMETA;
    public final @Nullable MethodHandle HANDLE$xrShareSpatialAnchorAsyncBD;
    public final @Nullable MethodHandle HANDLE$xrShareSpatialAnchorCompleteBD;
    public final @Nullable MethodHandle HANDLE$xrSnapshotMarkerDetectorML;
    public final @Nullable MethodHandle HANDLE$xrStartColocationAdvertisementMETA;
    public final @Nullable MethodHandle HANDLE$xrStartColocationDiscoveryMETA;
    public final @Nullable MethodHandle HANDLE$xrStartEnvironmentDepthProviderMETA;
    public final @Nullable MethodHandle HANDLE$xrStartSenseDataProviderAsyncBD;
    public final @Nullable MethodHandle HANDLE$xrStartSenseDataProviderCompleteBD;
    public final @Nullable MethodHandle HANDLE$xrStopColocationAdvertisementMETA;
    public final @Nullable MethodHandle HANDLE$xrStopColocationDiscoveryMETA;
    public final @Nullable MethodHandle HANDLE$xrStopEnvironmentDepthProviderMETA;
    public final @Nullable MethodHandle HANDLE$xrStopHapticFeedback;
    public final @Nullable MethodHandle HANDLE$xrStopSenseDataProviderBD;
    public final @Nullable MethodHandle HANDLE$xrStringToPath;
    public final @Nullable MethodHandle HANDLE$xrStructureTypeToString;
    public final @Nullable MethodHandle HANDLE$xrStructureTypeToString2KHR;
    public final @Nullable MethodHandle HANDLE$xrSubmitDebugUtilsMessageEXT;
    public final @Nullable MethodHandle HANDLE$xrSuggestInteractionProfileBindings;
    public final @Nullable MethodHandle HANDLE$xrSuggestVirtualKeyboardLocationMETA;
    public final @Nullable MethodHandle HANDLE$xrSyncActions;
    public final @Nullable MethodHandle HANDLE$xrThermalGetTemperatureTrendEXT;
    public final @Nullable MethodHandle HANDLE$xrTriangleMeshBeginUpdateFB;
    public final @Nullable MethodHandle HANDLE$xrTriangleMeshBeginVertexBufferUpdateFB;
    public final @Nullable MethodHandle HANDLE$xrTriangleMeshEndUpdateFB;
    public final @Nullable MethodHandle HANDLE$xrTriangleMeshEndVertexBufferUpdateFB;
    public final @Nullable MethodHandle HANDLE$xrTriangleMeshGetIndexBufferFB;
    public final @Nullable MethodHandle HANDLE$xrTriangleMeshGetVertexBufferFB;
    public final @Nullable MethodHandle HANDLE$xrTryCreateSpatialGraphStaticNodeBindingMSFT;
    public final @Nullable MethodHandle HANDLE$xrTryGetPerceptionAnchorFromSpatialAnchorMSFT;
    public final @Nullable MethodHandle HANDLE$xrUnpersistSpatialAnchorAsyncBD;
    public final @Nullable MethodHandle HANDLE$xrUnpersistSpatialAnchorCompleteBD;
    public final @Nullable MethodHandle HANDLE$xrUnpersistSpatialAnchorMSFT;
    public final @Nullable MethodHandle HANDLE$xrUnpersistSpatialEntityAsyncEXT;
    public final @Nullable MethodHandle HANDLE$xrUnpersistSpatialEntityCompleteEXT;
    public final @Nullable MethodHandle HANDLE$xrUpdateHandMeshMSFT;
    public final @Nullable MethodHandle HANDLE$xrUpdatePassthroughColorLutMETA;
    public final @Nullable MethodHandle HANDLE$xrUpdateSpatialAnchorsExpirationAsyncML;
    public final @Nullable MethodHandle HANDLE$xrUpdateSpatialAnchorsExpirationCompleteML;
    public final @Nullable MethodHandle HANDLE$xrUpdateSwapchainFB;
    public final @Nullable MethodHandle HANDLE$xrWaitFrame;
    public final @Nullable MethodHandle HANDLE$xrWaitSwapchainImage;
    // endregion

    public static final class Descriptors {
        public static final FunctionDescriptor DESCRIPTOR$xrAcquireEnvironmentDepthImageMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrEnvironmentDepthImageAcquireInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrEnvironmentDepthImageMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrAcquireSwapchainImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainImageAcquireInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrAllocateWorldMeshBufferML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshBufferSizeML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshBufferML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrApplyForceFeedbackCurlMNDX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrForceFeedbackCurlApplyLocationsMNDX.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrApplyFoveationHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFoveationApplyInfoHTC.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrApplyHapticFeedback = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrHapticActionInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrHapticBaseHeader.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrAttachSessionActionSets = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSessionActionSetsAttachInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrBeginFrame = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFrameBeginInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrBeginPlaneDetectionEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPlaneDetectorBeginInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrBeginSession = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSessionBeginInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCancelFutureEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFutureCancelInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCaptureSceneAsyncBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSceneCaptureInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCaptureSceneCompleteBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFutureCompletionEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrChangeVirtualKeyboardTextContextMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrVirtualKeyboardTextContextChangeInfoMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrClearSpatialAnchorStoreMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrComputeNewSceneMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrNewSceneComputeInfoMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrConvertTimeToTimespecTimeKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrConvertTimeToWin32PerformanceCounterKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrConvertTimespecTimeToTimeKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrConvertWin32PerformanceCounterToTimeKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateAction = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrActionCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateActionSet = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrActionSetCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateActionSpace = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrActionSpaceCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateAnchorSpaceBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrAnchorSpaceCreateInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateApiLayerInstance = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrInstanceCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrApiLayerCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateBodyTrackerBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrBodyTrackerCreateInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateBodyTrackerFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrBodyTrackerCreateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateBodyTrackerHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrBodyTrackerCreateInfoHTC.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateDebugUtilsMessengerEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrDebugUtilsMessengerCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateEnvironmentDepthProviderMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrEnvironmentDepthProviderCreateInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateEnvironmentDepthSwapchainMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrEnvironmentDepthSwapchainCreateInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateExportedLocalizationMapML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrUuidEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateEyeTrackerFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrEyeTrackerCreateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateFaceTracker2FB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFaceTrackerCreateInfo2FB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateFaceTrackerFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFaceTrackerCreateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateFacialExpressionClientML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFacialExpressionClientCreateInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateFacialTrackerHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFacialTrackerCreateInfoHTC.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateFoveationProfileFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFoveationProfileCreateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateGeometryInstanceFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrGeometryInstanceCreateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateHandMeshSpaceMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrHandMeshSpaceCreateInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateHandTrackerEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrHandTrackerCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateInstance = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrInstanceCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateKeyboardSpaceFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrKeyboardSpaceCreateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateMarkerDetectorML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrMarkerDetectorCreateInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateMarkerSpaceML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrMarkerSpaceCreateInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateMarkerSpaceVARJO = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrMarkerSpaceCreateInfoVARJO.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreatePassthroughColorLutMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPassthroughColorLutCreateInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreatePassthroughFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPassthroughCreateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreatePassthroughHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPassthroughCreateInfoHTC.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreatePassthroughLayerFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPassthroughLayerCreateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreatePlaneDetectorEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPlaneDetectorCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateReferenceSpace = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrReferenceSpaceCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateRenderModelAssetEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelAssetCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateRenderModelEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateRenderModelSpaceEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelSpaceCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSceneMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSceneCreateInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSceneObserverMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSceneObserverCreateInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSenseDataProviderBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSenseDataProviderCreateInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSession = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSessionCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpaceFromCoordinateFrameUIDML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrCoordinateSpaceCreateInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpaceUserFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceUserCreateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorAsyncBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorCreateInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorCompleteBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorCreateCompletionBD.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorCreateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorFromPerceptionAnchorMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorFromPersistedNameMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorFromPersistedAnchorCreateInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorCreateInfoHTC.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorCreateInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorSpaceMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorSpaceCreateInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorStoreConnectionMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorsAsyncML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorsCreateInfoBaseHeaderML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorsCompleteML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrCreateSpatialAnchorsCompletionML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialAnchorsStorageML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorsCreateStorageInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialContextAsyncEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialContextCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialContextCompleteEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrCreateSpatialContextCompletionEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialDiscoverySnapshotAsyncEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialDiscoverySnapshotCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialDiscoverySnapshotCompleteEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrCreateSpatialDiscoverySnapshotCompletionInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrCreateSpatialDiscoverySnapshotCompletionEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialEntityAnchorBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialEntityAnchorCreateInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialEntityFromIdEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialEntityFromIdCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialGraphNodeSpaceMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialGraphNodeSpaceCreateInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialPersistenceContextAsyncEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialPersistenceContextCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialPersistenceContextCompleteEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrCreateSpatialPersistenceContextCompletionEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSpatialUpdateSnapshotEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialUpdateSnapshotCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSwapchain = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSwapchainAndroidSurfaceKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateTriangleMeshFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrTriangleMeshCreateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateVirtualKeyboardMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrVirtualKeyboardCreateInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateVirtualKeyboardSpaceMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrVirtualKeyboardSpaceCreateInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateVulkanDeviceKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrVulkanDeviceCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateVulkanInstanceKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrVulkanInstanceCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateWorldMeshDetectorML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshDetectorCreateInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDeleteSpatialAnchorsAsyncML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorsDeleteInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDeleteSpatialAnchorsCompleteML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorsDeleteCompletionML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDeserializeSceneMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSceneDeserializeInfoMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyAction = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyActionSet = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyAnchorBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyBodyTrackerBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyBodyTrackerFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyBodyTrackerHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyDebugUtilsMessengerEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyEnvironmentDepthProviderMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyEnvironmentDepthSwapchainMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyExportedLocalizationMapML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyEyeTrackerFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyFaceTracker2FB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyFaceTrackerFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyFacialExpressionClientML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyFacialTrackerHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyFoveationProfileFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyGeometryInstanceFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyHandTrackerEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyInstance = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyMarkerDetectorML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyPassthroughColorLutMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyPassthroughFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyPassthroughHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyPassthroughLayerFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyPlaneDetectorEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyRenderModelAssetEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyRenderModelEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySceneMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySceneObserverMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySenseDataProviderBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySenseDataSnapshotBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySession = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySpace = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySpaceUserFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySpatialAnchorMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySpatialAnchorStoreConnectionMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySpatialAnchorsStorageML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySpatialContextEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySpatialEntityEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySpatialGraphNodeBindingMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySpatialPersistenceContextEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySpatialSnapshotEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySwapchain = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyTriangleMeshFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyVirtualKeyboardMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyWorldMeshDetectorML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDownloadSharedSpatialAnchorAsyncBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSharedSpatialAnchorDownloadInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDownloadSharedSpatialAnchorCompleteBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFutureCompletionEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnableLocalizationEventsML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrLocalizationEnableEventsInfoML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnableUserCalibrationEventsML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrUserCalibrationEnableEventsInfoML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEndFrame = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFrameEndInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEndSession = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateApiLayerProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrApiLayerProperties.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateBoundSourcesForAction = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrBoundSourcesForActionEnumerateInfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateColorSpacesFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateDisplayRefreshRatesFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateEnvironmentBlendModes = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateEnvironmentDepthSwapchainImagesMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainImageBaseHeader.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateExternalCamerasOCULUS = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrExternalCameraOCULUS.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateInstanceExtensionProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrExtensionProperties.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateInteractionRenderModelIdsEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrInteractionRenderModelIdsEnumerateInfoEXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumeratePerformanceMetricsCounterPathsMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumeratePersistedSpatialAnchorNamesMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorPersistenceNameMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateReferenceSpaces = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateRenderModelPathsFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelPathInfoFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateRenderModelSubactionPathsEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrInteractionRenderModelSubactionPathInfoEXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateReprojectionModesMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateSceneComputeFeaturesMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateSpaceSupportedComponentsFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateSpatialCapabilitiesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateSpatialCapabilityComponentTypesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialCapabilityComponentTypesEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateSpatialCapabilityFeaturesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateSpatialEntityComponentTypesBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateSpatialPersistenceScopesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateSwapchainFormats = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateSwapchainImages = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainImageBaseHeader.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateViewConfigurationViews = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrViewConfigurationView.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateViewConfigurations = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateViveTrackerPathsHTCX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrViveTrackerPathsHTCX.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEraseSpaceFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceEraseInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrFreeWorldMeshBufferML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshBufferML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGeometryInstanceSetTransformFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrGeometryInstanceTransformFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetActionStateBoolean = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrActionStateGetInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrActionStateBoolean.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetActionStateFloat = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrActionStateGetInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrActionStateFloat.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetActionStatePose = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrActionStateGetInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrActionStatePose.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetActionStateVector2f = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrActionStateGetInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrActionStateVector2f.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetAnchorUuidBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrUuidEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetAudioInputDeviceGuidOculus = FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS,
                MemoryLayout.sequenceLayout(MAX_AUDIO_DEVICE_STR_SIZE_OCULUS, NativeLayout.WCHAR_T)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetAudioOutputDeviceGuidOculus = FunctionDescriptor.of(
                ValueLayout.JAVA_INT,
                ValueLayout.ADDRESS,
                MemoryLayout.sequenceLayout(MAX_AUDIO_DEVICE_STR_SIZE_OCULUS, NativeLayout.WCHAR_T)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetBodySkeletonFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrBodySkeletonFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetBodySkeletonHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrBodySkeletonHTC.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetControllerModelKeyMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrControllerModelKeyStateMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetControllerModelPropertiesMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrControllerModelPropertiesMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetControllerModelStateMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrControllerModelStateMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetCurrentInteractionProfile = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrInteractionProfileState.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetD3D11GraphicsRequirementsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrGraphicsRequirementsD3D11KHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetD3D12GraphicsRequirementsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrGraphicsRequirementsD3D12KHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetDeviceSampleRateFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrHapticActionInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrDevicePcmSampleRateGetInfoFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetDisplayRefreshRateFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetEnvironmentDepthSwapchainStateMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrEnvironmentDepthSwapchainStateMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetExportedLocalizationMapDataML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetEyeGazesFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrEyeGazesInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrEyeGazesFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetFaceExpressionWeights2FB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFaceExpressionInfo2FB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrFaceExpressionWeights2FB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetFaceExpressionWeightsFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFaceExpressionInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrFaceExpressionWeightsFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetFacialExpressionBlendShapePropertiesML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFacialExpressionBlendShapeGetInfoML.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrFacialExpressionBlendShapePropertiesML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetFacialExpressionsHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFacialExpressionsHTC.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetFoveationEyeTrackedStateMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFoveationEyeTrackedStateMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetHandMeshFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrHandTrackingMeshFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetInputSourceLocalizedName = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrInputSourceLocalizedNameGetInfo.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetInstanceProcAddr = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetInstanceProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrInstanceProperties.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetMarkerDetectorStateML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrMarkerDetectorStateML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetMarkerLengthML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetMarkerNumberML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetMarkerReprojectionErrorML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetMarkerSizeVARJO = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrExtent2Df.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetMarkerStringML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetMarkersML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetMetalGraphicsRequirementsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrGraphicsRequirementsMetalKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetOpenGLESGraphicsRequirementsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrGraphicsRequirementsOpenGLESKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetOpenGLGraphicsRequirementsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrGraphicsRequirementsOpenGLKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetPassthroughPreferencesMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPassthroughPreferencesMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetPerformanceMetricsStateMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPerformanceMetricsStateMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetPlaneDetectionStateEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetPlaneDetectionsEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPlaneDetectorGetInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrPlaneDetectorLocationsEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetPlanePolygonBufferEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrPlaneDetectorPolygonBufferEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetQueriedSenseDataBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrQueriedSenseDataGetInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrQueriedSenseDataBD.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetRecommendedLayerResolutionMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRecommendedLayerResolutionGetInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrRecommendedLayerResolutionMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetReferenceSpaceBoundsRect = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrExtent2Df.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetRenderModelAssetDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelAssetDataGetInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelAssetDataEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetRenderModelAssetPropertiesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelAssetPropertiesGetInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelAssetPropertiesEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetRenderModelPoseTopLevelUserPathEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrInteractionRenderModelTopLevelUserPathGetInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetRenderModelPropertiesEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelPropertiesGetInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelPropertiesEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetRenderModelPropertiesFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelPropertiesFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetRenderModelStateEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelStateGetInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelStateEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSceneComponentsMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSceneComponentsGetInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrSceneComponentsMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSceneComputeStateMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSceneMarkerDecodedStringMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrUuidMSFT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSceneMarkerRawDataMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrUuidMSFT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSceneMeshBuffersMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSceneMeshBuffersGetInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrSceneMeshBuffersMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSenseDataProviderStateBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSerializedSceneFragmentDataMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSerializedSceneFragmentDataGetInfoMSFT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpaceBoundary2DFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrBoundary2DFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpaceBoundingBox2DFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRect2Df.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpaceBoundingBox3DFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRect3DfFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpaceComponentStatusFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceComponentStatusFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpaceContainerFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceContainerFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpaceRoomLayoutFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRoomLayoutFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpaceSemanticLabelsFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSemanticLabelsFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpaceTriangleMeshMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceTriangleMeshGetInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceTriangleMeshMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpaceUserIdFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpaceUuidFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrUuidEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialAnchorNameHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorNameHTC.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialAnchorStateML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorStateML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialBufferFloatEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialBufferGetInfoEXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialBufferStringEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialBufferGetInfoEXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialBufferUint16EXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialBufferGetInfoEXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialBufferUint32EXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialBufferGetInfoEXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialBufferUint8EXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialBufferGetInfoEXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialBufferVector2fEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialBufferGetInfoEXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrVector2f.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialBufferVector3fEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialBufferGetInfoEXT.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrVector3f.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialEntityComponentDataBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialEntityComponentGetInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialEntityComponentDataBaseHeaderBD.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialEntityUuidBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrUuidEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSpatialGraphNodeBindingPropertiesMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialGraphNodeBindingPropertiesGetInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialGraphNodeBindingPropertiesMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSwapchainStateFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainStateBaseHeaderFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSystem = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSystemGetInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetSystemProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrSystemProperties.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetViewConfigurationProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrViewConfigurationProperties.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetVirtualKeyboardDirtyTexturesMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetVirtualKeyboardModelAnimationStatesMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrVirtualKeyboardModelAnimationStatesMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetVirtualKeyboardScaleMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetVirtualKeyboardTextureDataMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrVirtualKeyboardTextureDataMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetVisibilityMaskKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrVisibilityMaskKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetVulkanDeviceExtensionsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetVulkanGraphicsDevice2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrVulkanGraphicsDeviceGetInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetVulkanGraphicsDeviceKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetVulkanGraphicsRequirementsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrGraphicsRequirementsVulkanKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetVulkanInstanceExtensionsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrGetWorldMeshBufferRecommendSizeML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshBufferRecommendedSizeInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshBufferSizeML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrImportLocalizationMapML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrLocalizationMapImportInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrUuidEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrInitializeLoaderKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrLoaderInitInfoBaseHeaderKHR.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrLoadControllerModelMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrLoadRenderModelFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelLoadInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrRenderModelBufferFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrLocateBodyJointsBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrBodyJointsLocateInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrBodyJointLocationsBD.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrLocateBodyJointsFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrBodyJointsLocateInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrBodyJointLocationsFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrLocateBodyJointsHTC = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrBodyJointsLocateInfoHTC.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrBodyJointLocationsHTC.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrLocateHandJointsEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrHandJointsLocateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrHandJointLocationsEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrLocateSceneComponentsMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSceneComponentsLocateInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrSceneComponentLocationsMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrLocateSpace = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceLocation.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrLocateSpaces = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpacesLocateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceLocations.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrLocateViews = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrViewLocateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrViewState.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrView.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrNegotiateLoaderApiLayerInterface = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrNegotiateLoaderInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(XrNegotiateApiLayerRequest.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrNegotiateLoaderRuntimeInterface = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrNegotiateLoaderInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrNegotiateRuntimeRequest.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPassthroughLayerPauseFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPassthroughLayerResumeFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPassthroughLayerSetKeyboardHandsIntensityFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPassthroughKeyboardHandsIntensityFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPassthroughLayerSetStyleFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPassthroughStyleFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPassthroughPauseFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPassthroughStartFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPathToString = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPauseSimultaneousHandsAndControllersTrackingMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSimultaneousHandsAndControllersTrackingPauseInfoMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPerfSettingsSetPerformanceLevelEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPersistSpatialAnchorAsyncBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorPersistInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPersistSpatialAnchorCompleteBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFutureCompletionEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPersistSpatialAnchorMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorPersistenceInfoMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPersistSpatialEntityAsyncEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialEntityPersistInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPersistSpatialEntityCompleteEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPersistSpatialEntityCompletionEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPollEvent = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrEventDataBuffer.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPollFutureEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFuturePollInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrFuturePollResultEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPublishSpatialAnchorsAsyncML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorsPublishInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPublishSpatialAnchorsCompleteML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorsPublishCompletionML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrQueryLocalizationMapsML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrLocalizationMapQueryInfoBaseHeaderML.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrLocalizationMapML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrQueryPerformanceMetricsCounterMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrPerformanceMetricsCounterMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrQuerySenseDataAsyncBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSenseDataQueryInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrQuerySenseDataCompleteBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSenseDataQueryCompletionBD.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrQuerySpacesFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceQueryInfoBaseHeaderFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrQuerySpatialAnchorsAsyncML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorsQueryInfoBaseHeaderML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrQuerySpatialAnchorsCompleteML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorsQueryCompletionML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrQuerySpatialComponentDataEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialComponentDataQueryConditionEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialComponentDataQueryResultEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrQuerySystemTrackedKeyboardFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrKeyboardTrackingQueryFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrKeyboardTrackingDescriptionFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrReleaseSwapchainImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainImageReleaseInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrRequestDisplayRefreshRateFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrRequestExitSession = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrRequestMapLocalizationML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrMapLocalizationRequestInfoML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrRequestSceneCaptureFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSceneCaptureRequestInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrRequestWorldMeshAsyncML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshGetInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshBufferML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrRequestWorldMeshCompleteML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshRequestCompletionInfoML.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshRequestCompletionML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrRequestWorldMeshStateAsyncML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshStateRequestInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrRequestWorldMeshStateCompleteML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshStateRequestCompletionML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrResultToString = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
                MemoryLayout.sequenceLayout(MAX_RESULT_STRING_SIZE, ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrResumeSimultaneousHandsAndControllersTrackingMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSimultaneousHandsAndControllersTrackingResumeInfoMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrRetrieveSpaceQueryResultsFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceQueryResultsFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSaveSpaceFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceSaveInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSaveSpaceListFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceListSaveInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSendVirtualKeyboardInputMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrVirtualKeyboardInputInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrPosef.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSessionBeginDebugUtilsLabelRegionEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrDebugUtilsLabelEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSessionEndDebugUtilsLabelRegionEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSessionInsertDebugUtilsLabelEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrDebugUtilsLabelEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetAndroidApplicationThreadKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetColorSpaceFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetDebugUtilsObjectNameEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrDebugUtilsObjectNameInfoEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetDigitalLensControlALMALENCE = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrDigitalLensControlALMALENCE.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetEnvironmentDepthEstimationVARJO = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetEnvironmentDepthHandRemovalMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrEnvironmentDepthHandRemovalSetInfoMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetInputDeviceActiveEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetInputDeviceLocationEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS,
            XrPosef.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetInputDeviceStateBoolEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetInputDeviceStateFloatEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetInputDeviceStateVector2fEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            XrVector2f.LAYOUT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetMarkerTrackingPredictionVARJO = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetMarkerTrackingTimeoutVARJO = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetMarkerTrackingVARJO = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetPerformanceMetricsStateMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPerformanceMetricsStateMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetSpaceComponentStatusFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceComponentStatusSetInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetSystemNotificationsML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSystemNotificationsSetInfoML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetTrackingOptimizationSettingsHintQCOM = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetViewOffsetVARJO = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSetVirtualKeyboardModelVisibilityMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrVirtualKeyboardModelVisibilitySetInfoMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrShareSpacesFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceShareInfoFB.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrShareSpacesMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrShareSpacesInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrShareSpatialAnchorAsyncBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorShareInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrShareSpatialAnchorCompleteBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFutureCompletionEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSnapshotMarkerDetectorML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrMarkerDetectorSnapshotInfoML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStartColocationAdvertisementMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrColocationAdvertisementStartInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStartColocationDiscoveryMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrColocationDiscoveryStartInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStartEnvironmentDepthProviderMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStartSenseDataProviderAsyncBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSenseDataProviderStartInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStartSenseDataProviderCompleteBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFutureCompletionEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStopColocationAdvertisementMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrColocationAdvertisementStopInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStopColocationDiscoveryMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrColocationDiscoveryStopInfoMETA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStopEnvironmentDepthProviderMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStopHapticFeedback = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrHapticActionInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStopSenseDataProviderBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStringToPath = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStructureTypeToString = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
                MemoryLayout.sequenceLayout(MAX_STRUCTURE_NAME_SIZE, ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStructureTypeToString2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
                MemoryLayout.sequenceLayout(MAX_STRUCTURE_NAME_SIZE_EXTENDED_KHR, ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSubmitDebugUtilsMessageEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrDebugUtilsMessengerCallbackDataEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSuggestInteractionProfileBindings = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrInteractionProfileSuggestedBinding.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSuggestVirtualKeyboardLocationMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrVirtualKeyboardLocationInfoMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSyncActions = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrActionsSyncInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrThermalGetTemperatureTrendEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrTriangleMeshBeginUpdateFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrTriangleMeshBeginVertexBufferUpdateFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrTriangleMeshEndUpdateFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$xrTriangleMeshEndVertexBufferUpdateFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrTriangleMeshGetIndexBufferFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT))
        );

        public static final FunctionDescriptor DESCRIPTOR$xrTriangleMeshGetVertexBufferFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(XrVector3f.LAYOUT))
        );

        public static final FunctionDescriptor DESCRIPTOR$xrTryCreateSpatialGraphStaticNodeBindingMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialGraphStaticNodeBindingCreateInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrTryGetPerceptionAnchorFromSpatialAnchorMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS))
        );

        public static final FunctionDescriptor DESCRIPTOR$xrUnpersistSpatialAnchorAsyncBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorUnpersistInfoBD.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrUnpersistSpatialAnchorCompleteBD = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFutureCompletionEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrUnpersistSpatialAnchorMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorPersistenceNameMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrUnpersistSpatialEntityAsyncEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialEntityUnpersistInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrUnpersistSpatialEntityCompleteEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrUnpersistSpatialEntityCompletionEXT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrUpdateHandMeshMSFT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrHandMeshUpdateInfoMSFT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrHandMeshMSFT.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrUpdatePassthroughColorLutMETA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrPassthroughColorLutUpdateInfoMETA.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrUpdateSpatialAnchorsExpirationAsyncML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorsUpdateExpirationInfoML.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrUpdateSpatialAnchorsExpirationCompleteML = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorsUpdateExpirationCompletionML.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrUpdateSwapchainFB = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainStateBaseHeaderFB.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrWaitFrame = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrFrameWaitInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(XrFrameState.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrWaitSwapchainImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainImageWaitInfo.LAYOUT)
        );

        /// Constructing this class is nonsense so the constructor is made private.
        private Descriptors() {}
    }
}
