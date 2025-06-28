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
import club.doki7.openxr.XRConstants;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

public final class XRStatic implements XRConstants {
    public XRStatic(RawFunctionLoader loader) {
        SEGMENT$xrAcquireSwapchainImage = loader.apply("xrAcquireSwapchainImage");
        HANDLE$xrAcquireSwapchainImage = RawFunctionLoader.link(SEGMENT$xrAcquireSwapchainImage, Descriptors.DESCRIPTOR$xrAcquireSwapchainImage);
        SEGMENT$xrApplyHapticFeedback = loader.apply("xrApplyHapticFeedback");
        HANDLE$xrApplyHapticFeedback = RawFunctionLoader.link(SEGMENT$xrApplyHapticFeedback, Descriptors.DESCRIPTOR$xrApplyHapticFeedback);
        SEGMENT$xrAttachSessionActionSets = loader.apply("xrAttachSessionActionSets");
        HANDLE$xrAttachSessionActionSets = RawFunctionLoader.link(SEGMENT$xrAttachSessionActionSets, Descriptors.DESCRIPTOR$xrAttachSessionActionSets);
        SEGMENT$xrBeginFrame = loader.apply("xrBeginFrame");
        HANDLE$xrBeginFrame = RawFunctionLoader.link(SEGMENT$xrBeginFrame, Descriptors.DESCRIPTOR$xrBeginFrame);
        SEGMENT$xrBeginSession = loader.apply("xrBeginSession");
        HANDLE$xrBeginSession = RawFunctionLoader.link(SEGMENT$xrBeginSession, Descriptors.DESCRIPTOR$xrBeginSession);
        SEGMENT$xrCreateAction = loader.apply("xrCreateAction");
        HANDLE$xrCreateAction = RawFunctionLoader.link(SEGMENT$xrCreateAction, Descriptors.DESCRIPTOR$xrCreateAction);
        SEGMENT$xrCreateActionSet = loader.apply("xrCreateActionSet");
        HANDLE$xrCreateActionSet = RawFunctionLoader.link(SEGMENT$xrCreateActionSet, Descriptors.DESCRIPTOR$xrCreateActionSet);
        SEGMENT$xrCreateActionSpace = loader.apply("xrCreateActionSpace");
        HANDLE$xrCreateActionSpace = RawFunctionLoader.link(SEGMENT$xrCreateActionSpace, Descriptors.DESCRIPTOR$xrCreateActionSpace);
        SEGMENT$xrCreateInstance = loader.apply("xrCreateInstance");
        HANDLE$xrCreateInstance = RawFunctionLoader.link(SEGMENT$xrCreateInstance, Descriptors.DESCRIPTOR$xrCreateInstance);
        SEGMENT$xrCreateReferenceSpace = loader.apply("xrCreateReferenceSpace");
        HANDLE$xrCreateReferenceSpace = RawFunctionLoader.link(SEGMENT$xrCreateReferenceSpace, Descriptors.DESCRIPTOR$xrCreateReferenceSpace);
        SEGMENT$xrCreateSession = loader.apply("xrCreateSession");
        HANDLE$xrCreateSession = RawFunctionLoader.link(SEGMENT$xrCreateSession, Descriptors.DESCRIPTOR$xrCreateSession);
        SEGMENT$xrCreateSwapchain = loader.apply("xrCreateSwapchain");
        HANDLE$xrCreateSwapchain = RawFunctionLoader.link(SEGMENT$xrCreateSwapchain, Descriptors.DESCRIPTOR$xrCreateSwapchain);
        SEGMENT$xrDestroyAction = loader.apply("xrDestroyAction");
        HANDLE$xrDestroyAction = RawFunctionLoader.link(SEGMENT$xrDestroyAction, Descriptors.DESCRIPTOR$xrDestroyAction);
        SEGMENT$xrDestroyActionSet = loader.apply("xrDestroyActionSet");
        HANDLE$xrDestroyActionSet = RawFunctionLoader.link(SEGMENT$xrDestroyActionSet, Descriptors.DESCRIPTOR$xrDestroyActionSet);
        SEGMENT$xrDestroyInstance = loader.apply("xrDestroyInstance");
        HANDLE$xrDestroyInstance = RawFunctionLoader.link(SEGMENT$xrDestroyInstance, Descriptors.DESCRIPTOR$xrDestroyInstance);
        SEGMENT$xrDestroySession = loader.apply("xrDestroySession");
        HANDLE$xrDestroySession = RawFunctionLoader.link(SEGMENT$xrDestroySession, Descriptors.DESCRIPTOR$xrDestroySession);
        SEGMENT$xrDestroySpace = loader.apply("xrDestroySpace");
        HANDLE$xrDestroySpace = RawFunctionLoader.link(SEGMENT$xrDestroySpace, Descriptors.DESCRIPTOR$xrDestroySpace);
        SEGMENT$xrDestroySwapchain = loader.apply("xrDestroySwapchain");
        HANDLE$xrDestroySwapchain = RawFunctionLoader.link(SEGMENT$xrDestroySwapchain, Descriptors.DESCRIPTOR$xrDestroySwapchain);
        SEGMENT$xrEndFrame = loader.apply("xrEndFrame");
        HANDLE$xrEndFrame = RawFunctionLoader.link(SEGMENT$xrEndFrame, Descriptors.DESCRIPTOR$xrEndFrame);
        SEGMENT$xrEndSession = loader.apply("xrEndSession");
        HANDLE$xrEndSession = RawFunctionLoader.link(SEGMENT$xrEndSession, Descriptors.DESCRIPTOR$xrEndSession);
        SEGMENT$xrEnumerateApiLayerProperties = loader.apply("xrEnumerateApiLayerProperties");
        HANDLE$xrEnumerateApiLayerProperties = RawFunctionLoader.link(SEGMENT$xrEnumerateApiLayerProperties, Descriptors.DESCRIPTOR$xrEnumerateApiLayerProperties);
        SEGMENT$xrEnumerateBoundSourcesForAction = loader.apply("xrEnumerateBoundSourcesForAction");
        HANDLE$xrEnumerateBoundSourcesForAction = RawFunctionLoader.link(SEGMENT$xrEnumerateBoundSourcesForAction, Descriptors.DESCRIPTOR$xrEnumerateBoundSourcesForAction);
        SEGMENT$xrEnumerateEnvironmentBlendModes = loader.apply("xrEnumerateEnvironmentBlendModes");
        HANDLE$xrEnumerateEnvironmentBlendModes = RawFunctionLoader.link(SEGMENT$xrEnumerateEnvironmentBlendModes, Descriptors.DESCRIPTOR$xrEnumerateEnvironmentBlendModes);
        SEGMENT$xrEnumerateInstanceExtensionProperties = loader.apply("xrEnumerateInstanceExtensionProperties");
        HANDLE$xrEnumerateInstanceExtensionProperties = RawFunctionLoader.link(SEGMENT$xrEnumerateInstanceExtensionProperties, Descriptors.DESCRIPTOR$xrEnumerateInstanceExtensionProperties);
        SEGMENT$xrEnumerateReferenceSpaces = loader.apply("xrEnumerateReferenceSpaces");
        HANDLE$xrEnumerateReferenceSpaces = RawFunctionLoader.link(SEGMENT$xrEnumerateReferenceSpaces, Descriptors.DESCRIPTOR$xrEnumerateReferenceSpaces);
        SEGMENT$xrEnumerateSwapchainFormats = loader.apply("xrEnumerateSwapchainFormats");
        HANDLE$xrEnumerateSwapchainFormats = RawFunctionLoader.link(SEGMENT$xrEnumerateSwapchainFormats, Descriptors.DESCRIPTOR$xrEnumerateSwapchainFormats);
        SEGMENT$xrEnumerateSwapchainImages = loader.apply("xrEnumerateSwapchainImages");
        HANDLE$xrEnumerateSwapchainImages = RawFunctionLoader.link(SEGMENT$xrEnumerateSwapchainImages, Descriptors.DESCRIPTOR$xrEnumerateSwapchainImages);
        SEGMENT$xrEnumerateViewConfigurationViews = loader.apply("xrEnumerateViewConfigurationViews");
        HANDLE$xrEnumerateViewConfigurationViews = RawFunctionLoader.link(SEGMENT$xrEnumerateViewConfigurationViews, Descriptors.DESCRIPTOR$xrEnumerateViewConfigurationViews);
        SEGMENT$xrEnumerateViewConfigurations = loader.apply("xrEnumerateViewConfigurations");
        HANDLE$xrEnumerateViewConfigurations = RawFunctionLoader.link(SEGMENT$xrEnumerateViewConfigurations, Descriptors.DESCRIPTOR$xrEnumerateViewConfigurations);
        SEGMENT$xrGetActionStateBoolean = loader.apply("xrGetActionStateBoolean");
        HANDLE$xrGetActionStateBoolean = RawFunctionLoader.link(SEGMENT$xrGetActionStateBoolean, Descriptors.DESCRIPTOR$xrGetActionStateBoolean);
        SEGMENT$xrGetActionStateFloat = loader.apply("xrGetActionStateFloat");
        HANDLE$xrGetActionStateFloat = RawFunctionLoader.link(SEGMENT$xrGetActionStateFloat, Descriptors.DESCRIPTOR$xrGetActionStateFloat);
        SEGMENT$xrGetActionStatePose = loader.apply("xrGetActionStatePose");
        HANDLE$xrGetActionStatePose = RawFunctionLoader.link(SEGMENT$xrGetActionStatePose, Descriptors.DESCRIPTOR$xrGetActionStatePose);
        SEGMENT$xrGetActionStateVector2f = loader.apply("xrGetActionStateVector2f");
        HANDLE$xrGetActionStateVector2f = RawFunctionLoader.link(SEGMENT$xrGetActionStateVector2f, Descriptors.DESCRIPTOR$xrGetActionStateVector2f);
        SEGMENT$xrGetCurrentInteractionProfile = loader.apply("xrGetCurrentInteractionProfile");
        HANDLE$xrGetCurrentInteractionProfile = RawFunctionLoader.link(SEGMENT$xrGetCurrentInteractionProfile, Descriptors.DESCRIPTOR$xrGetCurrentInteractionProfile);
        SEGMENT$xrGetInputSourceLocalizedName = loader.apply("xrGetInputSourceLocalizedName");
        HANDLE$xrGetInputSourceLocalizedName = RawFunctionLoader.link(SEGMENT$xrGetInputSourceLocalizedName, Descriptors.DESCRIPTOR$xrGetInputSourceLocalizedName);
        SEGMENT$xrGetInstanceProcAddr = loader.apply("xrGetInstanceProcAddr");
        HANDLE$xrGetInstanceProcAddr = RawFunctionLoader.link(SEGMENT$xrGetInstanceProcAddr, Descriptors.DESCRIPTOR$xrGetInstanceProcAddr);
        SEGMENT$xrGetInstanceProperties = loader.apply("xrGetInstanceProperties");
        HANDLE$xrGetInstanceProperties = RawFunctionLoader.link(SEGMENT$xrGetInstanceProperties, Descriptors.DESCRIPTOR$xrGetInstanceProperties);
        SEGMENT$xrGetReferenceSpaceBoundsRect = loader.apply("xrGetReferenceSpaceBoundsRect");
        HANDLE$xrGetReferenceSpaceBoundsRect = RawFunctionLoader.link(SEGMENT$xrGetReferenceSpaceBoundsRect, Descriptors.DESCRIPTOR$xrGetReferenceSpaceBoundsRect);
        SEGMENT$xrGetSystem = loader.apply("xrGetSystem");
        HANDLE$xrGetSystem = RawFunctionLoader.link(SEGMENT$xrGetSystem, Descriptors.DESCRIPTOR$xrGetSystem);
        SEGMENT$xrGetSystemProperties = loader.apply("xrGetSystemProperties");
        HANDLE$xrGetSystemProperties = RawFunctionLoader.link(SEGMENT$xrGetSystemProperties, Descriptors.DESCRIPTOR$xrGetSystemProperties);
        SEGMENT$xrGetViewConfigurationProperties = loader.apply("xrGetViewConfigurationProperties");
        HANDLE$xrGetViewConfigurationProperties = RawFunctionLoader.link(SEGMENT$xrGetViewConfigurationProperties, Descriptors.DESCRIPTOR$xrGetViewConfigurationProperties);
        SEGMENT$xrLocateSpace = loader.apply("xrLocateSpace");
        HANDLE$xrLocateSpace = RawFunctionLoader.link(SEGMENT$xrLocateSpace, Descriptors.DESCRIPTOR$xrLocateSpace);
        SEGMENT$xrLocateViews = loader.apply("xrLocateViews");
        HANDLE$xrLocateViews = RawFunctionLoader.link(SEGMENT$xrLocateViews, Descriptors.DESCRIPTOR$xrLocateViews);
        SEGMENT$xrPathToString = loader.apply("xrPathToString");
        HANDLE$xrPathToString = RawFunctionLoader.link(SEGMENT$xrPathToString, Descriptors.DESCRIPTOR$xrPathToString);
        SEGMENT$xrPollEvent = loader.apply("xrPollEvent");
        HANDLE$xrPollEvent = RawFunctionLoader.link(SEGMENT$xrPollEvent, Descriptors.DESCRIPTOR$xrPollEvent);
        SEGMENT$xrReleaseSwapchainImage = loader.apply("xrReleaseSwapchainImage");
        HANDLE$xrReleaseSwapchainImage = RawFunctionLoader.link(SEGMENT$xrReleaseSwapchainImage, Descriptors.DESCRIPTOR$xrReleaseSwapchainImage);
        SEGMENT$xrRequestExitSession = loader.apply("xrRequestExitSession");
        HANDLE$xrRequestExitSession = RawFunctionLoader.link(SEGMENT$xrRequestExitSession, Descriptors.DESCRIPTOR$xrRequestExitSession);
        SEGMENT$xrResultToString = loader.apply("xrResultToString");
        HANDLE$xrResultToString = RawFunctionLoader.link(SEGMENT$xrResultToString, Descriptors.DESCRIPTOR$xrResultToString);
        SEGMENT$xrStopHapticFeedback = loader.apply("xrStopHapticFeedback");
        HANDLE$xrStopHapticFeedback = RawFunctionLoader.link(SEGMENT$xrStopHapticFeedback, Descriptors.DESCRIPTOR$xrStopHapticFeedback);
        SEGMENT$xrStringToPath = loader.apply("xrStringToPath");
        HANDLE$xrStringToPath = RawFunctionLoader.link(SEGMENT$xrStringToPath, Descriptors.DESCRIPTOR$xrStringToPath);
        SEGMENT$xrStructureTypeToString = loader.apply("xrStructureTypeToString");
        HANDLE$xrStructureTypeToString = RawFunctionLoader.link(SEGMENT$xrStructureTypeToString, Descriptors.DESCRIPTOR$xrStructureTypeToString);
        SEGMENT$xrSuggestInteractionProfileBindings = loader.apply("xrSuggestInteractionProfileBindings");
        HANDLE$xrSuggestInteractionProfileBindings = RawFunctionLoader.link(SEGMENT$xrSuggestInteractionProfileBindings, Descriptors.DESCRIPTOR$xrSuggestInteractionProfileBindings);
        SEGMENT$xrSyncActions = loader.apply("xrSyncActions");
        HANDLE$xrSyncActions = RawFunctionLoader.link(SEGMENT$xrSyncActions, Descriptors.DESCRIPTOR$xrSyncActions);
        SEGMENT$xrWaitFrame = loader.apply("xrWaitFrame");
        HANDLE$xrWaitFrame = RawFunctionLoader.link(SEGMENT$xrWaitFrame, Descriptors.DESCRIPTOR$xrWaitFrame);
        SEGMENT$xrWaitSwapchainImage = loader.apply("xrWaitSwapchainImage");
        HANDLE$xrWaitSwapchainImage = RawFunctionLoader.link(SEGMENT$xrWaitSwapchainImage, Descriptors.DESCRIPTOR$xrWaitSwapchainImage);
    }

    // region command wrappers

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
    public final @Nullable MemorySegment SEGMENT$xrAcquireSwapchainImage;
    public final @Nullable MemorySegment SEGMENT$xrApplyHapticFeedback;
    public final @Nullable MemorySegment SEGMENT$xrAttachSessionActionSets;
    public final @Nullable MemorySegment SEGMENT$xrBeginFrame;
    public final @Nullable MemorySegment SEGMENT$xrBeginSession;
    public final @Nullable MemorySegment SEGMENT$xrCreateAction;
    public final @Nullable MemorySegment SEGMENT$xrCreateActionSet;
    public final @Nullable MemorySegment SEGMENT$xrCreateActionSpace;
    public final @Nullable MemorySegment SEGMENT$xrCreateInstance;
    public final @Nullable MemorySegment SEGMENT$xrCreateReferenceSpace;
    public final @Nullable MemorySegment SEGMENT$xrCreateSession;
    public final @Nullable MemorySegment SEGMENT$xrCreateSwapchain;
    public final @Nullable MemorySegment SEGMENT$xrDestroyAction;
    public final @Nullable MemorySegment SEGMENT$xrDestroyActionSet;
    public final @Nullable MemorySegment SEGMENT$xrDestroyInstance;
    public final @Nullable MemorySegment SEGMENT$xrDestroySession;
    public final @Nullable MemorySegment SEGMENT$xrDestroySpace;
    public final @Nullable MemorySegment SEGMENT$xrDestroySwapchain;
    public final @Nullable MemorySegment SEGMENT$xrEndFrame;
    public final @Nullable MemorySegment SEGMENT$xrEndSession;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateApiLayerProperties;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateBoundSourcesForAction;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateEnvironmentBlendModes;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateInstanceExtensionProperties;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateReferenceSpaces;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateSwapchainFormats;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateSwapchainImages;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateViewConfigurationViews;
    public final @Nullable MemorySegment SEGMENT$xrEnumerateViewConfigurations;
    public final @Nullable MemorySegment SEGMENT$xrGetActionStateBoolean;
    public final @Nullable MemorySegment SEGMENT$xrGetActionStateFloat;
    public final @Nullable MemorySegment SEGMENT$xrGetActionStatePose;
    public final @Nullable MemorySegment SEGMENT$xrGetActionStateVector2f;
    public final @Nullable MemorySegment SEGMENT$xrGetCurrentInteractionProfile;
    public final @Nullable MemorySegment SEGMENT$xrGetInputSourceLocalizedName;
    public final @Nullable MemorySegment SEGMENT$xrGetInstanceProcAddr;
    public final @Nullable MemorySegment SEGMENT$xrGetInstanceProperties;
    public final @Nullable MemorySegment SEGMENT$xrGetReferenceSpaceBoundsRect;
    public final @Nullable MemorySegment SEGMENT$xrGetSystem;
    public final @Nullable MemorySegment SEGMENT$xrGetSystemProperties;
    public final @Nullable MemorySegment SEGMENT$xrGetViewConfigurationProperties;
    public final @Nullable MemorySegment SEGMENT$xrLocateSpace;
    public final @Nullable MemorySegment SEGMENT$xrLocateViews;
    public final @Nullable MemorySegment SEGMENT$xrPathToString;
    public final @Nullable MemorySegment SEGMENT$xrPollEvent;
    public final @Nullable MemorySegment SEGMENT$xrReleaseSwapchainImage;
    public final @Nullable MemorySegment SEGMENT$xrRequestExitSession;
    public final @Nullable MemorySegment SEGMENT$xrResultToString;
    public final @Nullable MemorySegment SEGMENT$xrStopHapticFeedback;
    public final @Nullable MemorySegment SEGMENT$xrStringToPath;
    public final @Nullable MemorySegment SEGMENT$xrStructureTypeToString;
    public final @Nullable MemorySegment SEGMENT$xrSuggestInteractionProfileBindings;
    public final @Nullable MemorySegment SEGMENT$xrSyncActions;
    public final @Nullable MemorySegment SEGMENT$xrWaitFrame;
    public final @Nullable MemorySegment SEGMENT$xrWaitSwapchainImage;
    public final @Nullable MethodHandle HANDLE$xrAcquireSwapchainImage;
    public final @Nullable MethodHandle HANDLE$xrApplyHapticFeedback;
    public final @Nullable MethodHandle HANDLE$xrAttachSessionActionSets;
    public final @Nullable MethodHandle HANDLE$xrBeginFrame;
    public final @Nullable MethodHandle HANDLE$xrBeginSession;
    public final @Nullable MethodHandle HANDLE$xrCreateAction;
    public final @Nullable MethodHandle HANDLE$xrCreateActionSet;
    public final @Nullable MethodHandle HANDLE$xrCreateActionSpace;
    public final @Nullable MethodHandle HANDLE$xrCreateInstance;
    public final @Nullable MethodHandle HANDLE$xrCreateReferenceSpace;
    public final @Nullable MethodHandle HANDLE$xrCreateSession;
    public final @Nullable MethodHandle HANDLE$xrCreateSwapchain;
    public final @Nullable MethodHandle HANDLE$xrDestroyAction;
    public final @Nullable MethodHandle HANDLE$xrDestroyActionSet;
    public final @Nullable MethodHandle HANDLE$xrDestroyInstance;
    public final @Nullable MethodHandle HANDLE$xrDestroySession;
    public final @Nullable MethodHandle HANDLE$xrDestroySpace;
    public final @Nullable MethodHandle HANDLE$xrDestroySwapchain;
    public final @Nullable MethodHandle HANDLE$xrEndFrame;
    public final @Nullable MethodHandle HANDLE$xrEndSession;
    public final @Nullable MethodHandle HANDLE$xrEnumerateApiLayerProperties;
    public final @Nullable MethodHandle HANDLE$xrEnumerateBoundSourcesForAction;
    public final @Nullable MethodHandle HANDLE$xrEnumerateEnvironmentBlendModes;
    public final @Nullable MethodHandle HANDLE$xrEnumerateInstanceExtensionProperties;
    public final @Nullable MethodHandle HANDLE$xrEnumerateReferenceSpaces;
    public final @Nullable MethodHandle HANDLE$xrEnumerateSwapchainFormats;
    public final @Nullable MethodHandle HANDLE$xrEnumerateSwapchainImages;
    public final @Nullable MethodHandle HANDLE$xrEnumerateViewConfigurationViews;
    public final @Nullable MethodHandle HANDLE$xrEnumerateViewConfigurations;
    public final @Nullable MethodHandle HANDLE$xrGetActionStateBoolean;
    public final @Nullable MethodHandle HANDLE$xrGetActionStateFloat;
    public final @Nullable MethodHandle HANDLE$xrGetActionStatePose;
    public final @Nullable MethodHandle HANDLE$xrGetActionStateVector2f;
    public final @Nullable MethodHandle HANDLE$xrGetCurrentInteractionProfile;
    public final @Nullable MethodHandle HANDLE$xrGetInputSourceLocalizedName;
    public final @Nullable MethodHandle HANDLE$xrGetInstanceProcAddr;
    public final @Nullable MethodHandle HANDLE$xrGetInstanceProperties;
    public final @Nullable MethodHandle HANDLE$xrGetReferenceSpaceBoundsRect;
    public final @Nullable MethodHandle HANDLE$xrGetSystem;
    public final @Nullable MethodHandle HANDLE$xrGetSystemProperties;
    public final @Nullable MethodHandle HANDLE$xrGetViewConfigurationProperties;
    public final @Nullable MethodHandle HANDLE$xrLocateSpace;
    public final @Nullable MethodHandle HANDLE$xrLocateViews;
    public final @Nullable MethodHandle HANDLE$xrPathToString;
    public final @Nullable MethodHandle HANDLE$xrPollEvent;
    public final @Nullable MethodHandle HANDLE$xrReleaseSwapchainImage;
    public final @Nullable MethodHandle HANDLE$xrRequestExitSession;
    public final @Nullable MethodHandle HANDLE$xrResultToString;
    public final @Nullable MethodHandle HANDLE$xrStopHapticFeedback;
    public final @Nullable MethodHandle HANDLE$xrStringToPath;
    public final @Nullable MethodHandle HANDLE$xrStructureTypeToString;
    public final @Nullable MethodHandle HANDLE$xrSuggestInteractionProfileBindings;
    public final @Nullable MethodHandle HANDLE$xrSyncActions;
    public final @Nullable MethodHandle HANDLE$xrWaitFrame;
    public final @Nullable MethodHandle HANDLE$xrWaitSwapchainImage;
    // endregion

    public static final class Descriptors {
        public static final FunctionDescriptor DESCRIPTOR$xrAcquireSwapchainImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainImageAcquireInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
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

        public static final FunctionDescriptor DESCRIPTOR$xrBeginSession = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSessionBeginInfo.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$xrCreateInstance = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrInstanceCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateReferenceSpace = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrReferenceSpaceCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSession = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSessionCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrCreateSwapchain = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyAction = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyActionSet = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrDestroyInstance = FunctionDescriptor.of(
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

        public static final FunctionDescriptor DESCRIPTOR$xrDestroySwapchain = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
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

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateEnvironmentBlendModes = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateInstanceExtensionProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(XrExtensionProperties.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrEnumerateReferenceSpaces = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
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

        public static final FunctionDescriptor DESCRIPTOR$xrGetCurrentInteractionProfile = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrInteractionProfileState.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$xrGetReferenceSpaceBoundsRect = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(XrExtent2Df.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$xrLocateSpace = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.ADDRESS.withTargetLayout(XrSpaceLocation.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$xrPathToString = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_LONG,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrPollEvent = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrEventDataBuffer.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrReleaseSwapchainImage = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrSwapchainImageReleaseInfo.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrRequestExitSession = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$xrResultToString = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            MemoryLayout.sequenceLayout(MAX_RESULT_STRING_SIZE, ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrStopHapticFeedback = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrHapticActionInfo.LAYOUT)
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

        public static final FunctionDescriptor DESCRIPTOR$xrSuggestInteractionProfileBindings = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrInteractionProfileSuggestedBinding.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$xrSyncActions = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(XrActionsSyncInfo.LAYOUT)
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
