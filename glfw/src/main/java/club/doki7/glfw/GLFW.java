package club.doki7.glfw;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

import org.jetbrains.annotations.Nullable;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.glfw.datatype.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

public final class GLFW {
    public GLFW(RawFunctionLoader loader) {
        SEGMENT$glfwCreateCursor = loader.apply("glfwCreateCursor");
        HANDLE$glfwCreateCursor = RawFunctionLoader.link(SEGMENT$glfwCreateCursor, Descriptors.DESCRIPTOR$glfwCreateCursor);
        SEGMENT$glfwCreateStandardCursor = loader.apply("glfwCreateStandardCursor");
        HANDLE$glfwCreateStandardCursor = RawFunctionLoader.link(SEGMENT$glfwCreateStandardCursor, Descriptors.DESCRIPTOR$glfwCreateStandardCursor);
        SEGMENT$glfwCreateWindow = loader.apply("glfwCreateWindow");
        HANDLE$glfwCreateWindow = RawFunctionLoader.link(SEGMENT$glfwCreateWindow, Descriptors.DESCRIPTOR$glfwCreateWindow);
        SEGMENT$glfwCreateWindowSurface = loader.apply("glfwCreateWindowSurface");
        HANDLE$glfwCreateWindowSurface = RawFunctionLoader.link(SEGMENT$glfwCreateWindowSurface, Descriptors.DESCRIPTOR$glfwCreateWindowSurface);
        SEGMENT$glfwDefaultWindowHints = loader.apply("glfwDefaultWindowHints");
        HANDLE$glfwDefaultWindowHints = RawFunctionLoader.link(SEGMENT$glfwDefaultWindowHints, Descriptors.DESCRIPTOR$glfwDefaultWindowHints);
        SEGMENT$glfwDestroyCursor = loader.apply("glfwDestroyCursor");
        HANDLE$glfwDestroyCursor = RawFunctionLoader.link(SEGMENT$glfwDestroyCursor, Descriptors.DESCRIPTOR$glfwDestroyCursor);
        SEGMENT$glfwDestroyWindow = loader.apply("glfwDestroyWindow");
        HANDLE$glfwDestroyWindow = RawFunctionLoader.link(SEGMENT$glfwDestroyWindow, Descriptors.DESCRIPTOR$glfwDestroyWindow);
        SEGMENT$glfwExtensionSupported = loader.apply("glfwExtensionSupported");
        HANDLE$glfwExtensionSupported = RawFunctionLoader.link(SEGMENT$glfwExtensionSupported, Descriptors.DESCRIPTOR$glfwExtensionSupported);
        SEGMENT$glfwFocusWindow = loader.apply("glfwFocusWindow");
        HANDLE$glfwFocusWindow = RawFunctionLoader.link(SEGMENT$glfwFocusWindow, Descriptors.DESCRIPTOR$glfwFocusWindow);
        SEGMENT$glfwGetClipboardString = loader.apply("glfwGetClipboardString");
        HANDLE$glfwGetClipboardString = RawFunctionLoader.link(SEGMENT$glfwGetClipboardString, Descriptors.DESCRIPTOR$glfwGetClipboardString);
        SEGMENT$glfwGetCocoaMonitor = loader.apply("glfwGetCocoaMonitor");
        HANDLE$glfwGetCocoaMonitor = RawFunctionLoader.link(SEGMENT$glfwGetCocoaMonitor, Descriptors.DESCRIPTOR$glfwGetCocoaMonitor);
        SEGMENT$glfwGetCocoaView = loader.apply("glfwGetCocoaView");
        HANDLE$glfwGetCocoaView = RawFunctionLoader.link(SEGMENT$glfwGetCocoaView, Descriptors.DESCRIPTOR$glfwGetCocoaView);
        SEGMENT$glfwGetCocoaWindow = loader.apply("glfwGetCocoaWindow");
        HANDLE$glfwGetCocoaWindow = RawFunctionLoader.link(SEGMENT$glfwGetCocoaWindow, Descriptors.DESCRIPTOR$glfwGetCocoaWindow);
        SEGMENT$glfwGetCurrentContext = loader.apply("glfwGetCurrentContext");
        HANDLE$glfwGetCurrentContext = RawFunctionLoader.link(SEGMENT$glfwGetCurrentContext, Descriptors.DESCRIPTOR$glfwGetCurrentContext);
        SEGMENT$glfwGetCursorPos = loader.apply("glfwGetCursorPos");
        HANDLE$glfwGetCursorPos = RawFunctionLoader.link(SEGMENT$glfwGetCursorPos, Descriptors.DESCRIPTOR$glfwGetCursorPos);
        SEGMENT$glfwGetEGLContext = loader.apply("glfwGetEGLContext");
        HANDLE$glfwGetEGLContext = RawFunctionLoader.link(SEGMENT$glfwGetEGLContext, Descriptors.DESCRIPTOR$glfwGetEGLContext);
        SEGMENT$glfwGetEGLDisplay = loader.apply("glfwGetEGLDisplay");
        HANDLE$glfwGetEGLDisplay = RawFunctionLoader.link(SEGMENT$glfwGetEGLDisplay, Descriptors.DESCRIPTOR$glfwGetEGLDisplay);
        SEGMENT$glfwGetEGLSurface = loader.apply("glfwGetEGLSurface");
        HANDLE$glfwGetEGLSurface = RawFunctionLoader.link(SEGMENT$glfwGetEGLSurface, Descriptors.DESCRIPTOR$glfwGetEGLSurface);
        SEGMENT$glfwGetError = loader.apply("glfwGetError");
        HANDLE$glfwGetError = RawFunctionLoader.link(SEGMENT$glfwGetError, Descriptors.DESCRIPTOR$glfwGetError);
        SEGMENT$glfwGetFramebufferSize = loader.apply("glfwGetFramebufferSize");
        HANDLE$glfwGetFramebufferSize = RawFunctionLoader.link(SEGMENT$glfwGetFramebufferSize, Descriptors.DESCRIPTOR$glfwGetFramebufferSize);
        SEGMENT$glfwGetGLXContext = loader.apply("glfwGetGLXContext");
        HANDLE$glfwGetGLXContext = RawFunctionLoader.link(SEGMENT$glfwGetGLXContext, Descriptors.DESCRIPTOR$glfwGetGLXContext);
        SEGMENT$glfwGetGLXWindow = loader.apply("glfwGetGLXWindow");
        HANDLE$glfwGetGLXWindow = RawFunctionLoader.link(SEGMENT$glfwGetGLXWindow, Descriptors.DESCRIPTOR$glfwGetGLXWindow);
        SEGMENT$glfwGetGamepadName = loader.apply("glfwGetGamepadName");
        HANDLE$glfwGetGamepadName = RawFunctionLoader.link(SEGMENT$glfwGetGamepadName, Descriptors.DESCRIPTOR$glfwGetGamepadName);
        SEGMENT$glfwGetGamepadState = loader.apply("glfwGetGamepadState");
        HANDLE$glfwGetGamepadState = RawFunctionLoader.link(SEGMENT$glfwGetGamepadState, Descriptors.DESCRIPTOR$glfwGetGamepadState);
        SEGMENT$glfwGetGammaRamp = loader.apply("glfwGetGammaRamp");
        HANDLE$glfwGetGammaRamp = RawFunctionLoader.link(SEGMENT$glfwGetGammaRamp, Descriptors.DESCRIPTOR$glfwGetGammaRamp);
        SEGMENT$glfwGetInputMode = loader.apply("glfwGetInputMode");
        HANDLE$glfwGetInputMode = RawFunctionLoader.link(SEGMENT$glfwGetInputMode, Descriptors.DESCRIPTOR$glfwGetInputMode);
        SEGMENT$glfwGetInstanceProcAddress = loader.apply("glfwGetInstanceProcAddress");
        HANDLE$glfwGetInstanceProcAddress = RawFunctionLoader.link(SEGMENT$glfwGetInstanceProcAddress, Descriptors.DESCRIPTOR$glfwGetInstanceProcAddress);
        SEGMENT$glfwGetJoystickAxes = loader.apply("glfwGetJoystickAxes");
        HANDLE$glfwGetJoystickAxes = RawFunctionLoader.link(SEGMENT$glfwGetJoystickAxes, Descriptors.DESCRIPTOR$glfwGetJoystickAxes);
        SEGMENT$glfwGetJoystickButtons = loader.apply("glfwGetJoystickButtons");
        HANDLE$glfwGetJoystickButtons = RawFunctionLoader.link(SEGMENT$glfwGetJoystickButtons, Descriptors.DESCRIPTOR$glfwGetJoystickButtons);
        SEGMENT$glfwGetJoystickGUID = loader.apply("glfwGetJoystickGUID");
        HANDLE$glfwGetJoystickGUID = RawFunctionLoader.link(SEGMENT$glfwGetJoystickGUID, Descriptors.DESCRIPTOR$glfwGetJoystickGUID);
        SEGMENT$glfwGetJoystickHats = loader.apply("glfwGetJoystickHats");
        HANDLE$glfwGetJoystickHats = RawFunctionLoader.link(SEGMENT$glfwGetJoystickHats, Descriptors.DESCRIPTOR$glfwGetJoystickHats);
        SEGMENT$glfwGetJoystickName = loader.apply("glfwGetJoystickName");
        HANDLE$glfwGetJoystickName = RawFunctionLoader.link(SEGMENT$glfwGetJoystickName, Descriptors.DESCRIPTOR$glfwGetJoystickName);
        SEGMENT$glfwGetJoystickUserPointer = loader.apply("glfwGetJoystickUserPointer");
        HANDLE$glfwGetJoystickUserPointer = RawFunctionLoader.link(SEGMENT$glfwGetJoystickUserPointer, Descriptors.DESCRIPTOR$glfwGetJoystickUserPointer);
        SEGMENT$glfwGetKey = loader.apply("glfwGetKey");
        HANDLE$glfwGetKey = RawFunctionLoader.link(SEGMENT$glfwGetKey, Descriptors.DESCRIPTOR$glfwGetKey);
        SEGMENT$glfwGetKeyName = loader.apply("glfwGetKeyName");
        HANDLE$glfwGetKeyName = RawFunctionLoader.link(SEGMENT$glfwGetKeyName, Descriptors.DESCRIPTOR$glfwGetKeyName);
        SEGMENT$glfwGetKeyScancode = loader.apply("glfwGetKeyScancode");
        HANDLE$glfwGetKeyScancode = RawFunctionLoader.link(SEGMENT$glfwGetKeyScancode, Descriptors.DESCRIPTOR$glfwGetKeyScancode);
        SEGMENT$glfwGetMonitorContentScale = loader.apply("glfwGetMonitorContentScale");
        HANDLE$glfwGetMonitorContentScale = RawFunctionLoader.link(SEGMENT$glfwGetMonitorContentScale, Descriptors.DESCRIPTOR$glfwGetMonitorContentScale);
        SEGMENT$glfwGetMonitorName = loader.apply("glfwGetMonitorName");
        HANDLE$glfwGetMonitorName = RawFunctionLoader.link(SEGMENT$glfwGetMonitorName, Descriptors.DESCRIPTOR$glfwGetMonitorName);
        SEGMENT$glfwGetMonitorPhysicalSize = loader.apply("glfwGetMonitorPhysicalSize");
        HANDLE$glfwGetMonitorPhysicalSize = RawFunctionLoader.link(SEGMENT$glfwGetMonitorPhysicalSize, Descriptors.DESCRIPTOR$glfwGetMonitorPhysicalSize);
        SEGMENT$glfwGetMonitorPos = loader.apply("glfwGetMonitorPos");
        HANDLE$glfwGetMonitorPos = RawFunctionLoader.link(SEGMENT$glfwGetMonitorPos, Descriptors.DESCRIPTOR$glfwGetMonitorPos);
        SEGMENT$glfwGetMonitorUserPointer = loader.apply("glfwGetMonitorUserPointer");
        HANDLE$glfwGetMonitorUserPointer = RawFunctionLoader.link(SEGMENT$glfwGetMonitorUserPointer, Descriptors.DESCRIPTOR$glfwGetMonitorUserPointer);
        SEGMENT$glfwGetMonitorWorkarea = loader.apply("glfwGetMonitorWorkarea");
        HANDLE$glfwGetMonitorWorkarea = RawFunctionLoader.link(SEGMENT$glfwGetMonitorWorkarea, Descriptors.DESCRIPTOR$glfwGetMonitorWorkarea);
        SEGMENT$glfwGetMonitors = loader.apply("glfwGetMonitors");
        HANDLE$glfwGetMonitors = RawFunctionLoader.link(SEGMENT$glfwGetMonitors, Descriptors.DESCRIPTOR$glfwGetMonitors);
        SEGMENT$glfwGetMouseButton = loader.apply("glfwGetMouseButton");
        HANDLE$glfwGetMouseButton = RawFunctionLoader.link(SEGMENT$glfwGetMouseButton, Descriptors.DESCRIPTOR$glfwGetMouseButton);
        SEGMENT$glfwGetNSGLContext = loader.apply("glfwGetNSGLContext");
        HANDLE$glfwGetNSGLContext = RawFunctionLoader.link(SEGMENT$glfwGetNSGLContext, Descriptors.DESCRIPTOR$glfwGetNSGLContext);
        SEGMENT$glfwGetOSMesaColorBuffer = loader.apply("glfwGetOSMesaColorBuffer");
        HANDLE$glfwGetOSMesaColorBuffer = RawFunctionLoader.link(SEGMENT$glfwGetOSMesaColorBuffer, Descriptors.DESCRIPTOR$glfwGetOSMesaColorBuffer);
        SEGMENT$glfwGetOSMesaContext = loader.apply("glfwGetOSMesaContext");
        HANDLE$glfwGetOSMesaContext = RawFunctionLoader.link(SEGMENT$glfwGetOSMesaContext, Descriptors.DESCRIPTOR$glfwGetOSMesaContext);
        SEGMENT$glfwGetOSMesaDepthBuffer = loader.apply("glfwGetOSMesaDepthBuffer");
        HANDLE$glfwGetOSMesaDepthBuffer = RawFunctionLoader.link(SEGMENT$glfwGetOSMesaDepthBuffer, Descriptors.DESCRIPTOR$glfwGetOSMesaDepthBuffer);
        SEGMENT$glfwGetPhysicalDevicePresentationSupport = loader.apply("glfwGetPhysicalDevicePresentationSupport");
        HANDLE$glfwGetPhysicalDevicePresentationSupport = RawFunctionLoader.link(SEGMENT$glfwGetPhysicalDevicePresentationSupport, Descriptors.DESCRIPTOR$glfwGetPhysicalDevicePresentationSupport);
        SEGMENT$glfwGetPlatform = loader.apply("glfwGetPlatform");
        HANDLE$glfwGetPlatform = RawFunctionLoader.link(SEGMENT$glfwGetPlatform, Descriptors.DESCRIPTOR$glfwGetPlatform);
        SEGMENT$glfwGetPrimaryMonitor = loader.apply("glfwGetPrimaryMonitor");
        HANDLE$glfwGetPrimaryMonitor = RawFunctionLoader.link(SEGMENT$glfwGetPrimaryMonitor, Descriptors.DESCRIPTOR$glfwGetPrimaryMonitor);
        SEGMENT$glfwGetProcAddress = loader.apply("glfwGetProcAddress");
        HANDLE$glfwGetProcAddress = RawFunctionLoader.link(SEGMENT$glfwGetProcAddress, Descriptors.DESCRIPTOR$glfwGetProcAddress);
        SEGMENT$glfwGetRequiredInstanceExtensions = loader.apply("glfwGetRequiredInstanceExtensions");
        HANDLE$glfwGetRequiredInstanceExtensions = RawFunctionLoader.link(SEGMENT$glfwGetRequiredInstanceExtensions, Descriptors.DESCRIPTOR$glfwGetRequiredInstanceExtensions);
        SEGMENT$glfwGetTime = loader.apply("glfwGetTime");
        HANDLE$glfwGetTime = RawFunctionLoader.link(SEGMENT$glfwGetTime, Descriptors.DESCRIPTOR$glfwGetTime);
        SEGMENT$glfwGetTimerFrequency = loader.apply("glfwGetTimerFrequency");
        HANDLE$glfwGetTimerFrequency = RawFunctionLoader.link(SEGMENT$glfwGetTimerFrequency, Descriptors.DESCRIPTOR$glfwGetTimerFrequency);
        SEGMENT$glfwGetTimerValue = loader.apply("glfwGetTimerValue");
        HANDLE$glfwGetTimerValue = RawFunctionLoader.link(SEGMENT$glfwGetTimerValue, Descriptors.DESCRIPTOR$glfwGetTimerValue);
        SEGMENT$glfwGetVersion = loader.apply("glfwGetVersion");
        HANDLE$glfwGetVersion = RawFunctionLoader.link(SEGMENT$glfwGetVersion, Descriptors.DESCRIPTOR$glfwGetVersion);
        SEGMENT$glfwGetVersionString = loader.apply("glfwGetVersionString");
        HANDLE$glfwGetVersionString = RawFunctionLoader.link(SEGMENT$glfwGetVersionString, Descriptors.DESCRIPTOR$glfwGetVersionString);
        SEGMENT$glfwGetVideoMode = loader.apply("glfwGetVideoMode");
        HANDLE$glfwGetVideoMode = RawFunctionLoader.link(SEGMENT$glfwGetVideoMode, Descriptors.DESCRIPTOR$glfwGetVideoMode);
        SEGMENT$glfwGetVideoModes = loader.apply("glfwGetVideoModes");
        HANDLE$glfwGetVideoModes = RawFunctionLoader.link(SEGMENT$glfwGetVideoModes, Descriptors.DESCRIPTOR$glfwGetVideoModes);
        SEGMENT$glfwGetWGLContext = loader.apply("glfwGetWGLContext");
        HANDLE$glfwGetWGLContext = RawFunctionLoader.link(SEGMENT$glfwGetWGLContext, Descriptors.DESCRIPTOR$glfwGetWGLContext);
        SEGMENT$glfwGetWaylandDisplay = loader.apply("glfwGetWaylandDisplay");
        HANDLE$glfwGetWaylandDisplay = RawFunctionLoader.link(SEGMENT$glfwGetWaylandDisplay, Descriptors.DESCRIPTOR$glfwGetWaylandDisplay);
        SEGMENT$glfwGetWaylandMonitor = loader.apply("glfwGetWaylandMonitor");
        HANDLE$glfwGetWaylandMonitor = RawFunctionLoader.link(SEGMENT$glfwGetWaylandMonitor, Descriptors.DESCRIPTOR$glfwGetWaylandMonitor);
        SEGMENT$glfwGetWaylandWindow = loader.apply("glfwGetWaylandWindow");
        HANDLE$glfwGetWaylandWindow = RawFunctionLoader.link(SEGMENT$glfwGetWaylandWindow, Descriptors.DESCRIPTOR$glfwGetWaylandWindow);
        SEGMENT$glfwGetWin32Adapter = loader.apply("glfwGetWin32Adapter");
        HANDLE$glfwGetWin32Adapter = RawFunctionLoader.link(SEGMENT$glfwGetWin32Adapter, Descriptors.DESCRIPTOR$glfwGetWin32Adapter);
        SEGMENT$glfwGetWin32Monitor = loader.apply("glfwGetWin32Monitor");
        HANDLE$glfwGetWin32Monitor = RawFunctionLoader.link(SEGMENT$glfwGetWin32Monitor, Descriptors.DESCRIPTOR$glfwGetWin32Monitor);
        SEGMENT$glfwGetWin32Window = loader.apply("glfwGetWin32Window");
        HANDLE$glfwGetWin32Window = RawFunctionLoader.link(SEGMENT$glfwGetWin32Window, Descriptors.DESCRIPTOR$glfwGetWin32Window);
        SEGMENT$glfwGetWindowAttrib = loader.apply("glfwGetWindowAttrib");
        HANDLE$glfwGetWindowAttrib = RawFunctionLoader.link(SEGMENT$glfwGetWindowAttrib, Descriptors.DESCRIPTOR$glfwGetWindowAttrib);
        SEGMENT$glfwGetWindowContentScale = loader.apply("glfwGetWindowContentScale");
        HANDLE$glfwGetWindowContentScale = RawFunctionLoader.link(SEGMENT$glfwGetWindowContentScale, Descriptors.DESCRIPTOR$glfwGetWindowContentScale);
        SEGMENT$glfwGetWindowFrameSize = loader.apply("glfwGetWindowFrameSize");
        HANDLE$glfwGetWindowFrameSize = RawFunctionLoader.link(SEGMENT$glfwGetWindowFrameSize, Descriptors.DESCRIPTOR$glfwGetWindowFrameSize);
        SEGMENT$glfwGetWindowMonitor = loader.apply("glfwGetWindowMonitor");
        HANDLE$glfwGetWindowMonitor = RawFunctionLoader.link(SEGMENT$glfwGetWindowMonitor, Descriptors.DESCRIPTOR$glfwGetWindowMonitor);
        SEGMENT$glfwGetWindowOpacity = loader.apply("glfwGetWindowOpacity");
        HANDLE$glfwGetWindowOpacity = RawFunctionLoader.link(SEGMENT$glfwGetWindowOpacity, Descriptors.DESCRIPTOR$glfwGetWindowOpacity);
        SEGMENT$glfwGetWindowPos = loader.apply("glfwGetWindowPos");
        HANDLE$glfwGetWindowPos = RawFunctionLoader.link(SEGMENT$glfwGetWindowPos, Descriptors.DESCRIPTOR$glfwGetWindowPos);
        SEGMENT$glfwGetWindowSize = loader.apply("glfwGetWindowSize");
        HANDLE$glfwGetWindowSize = RawFunctionLoader.link(SEGMENT$glfwGetWindowSize, Descriptors.DESCRIPTOR$glfwGetWindowSize);
        SEGMENT$glfwGetWindowTitle = loader.apply("glfwGetWindowTitle");
        HANDLE$glfwGetWindowTitle = RawFunctionLoader.link(SEGMENT$glfwGetWindowTitle, Descriptors.DESCRIPTOR$glfwGetWindowTitle);
        SEGMENT$glfwGetWindowUserPointer = loader.apply("glfwGetWindowUserPointer");
        HANDLE$glfwGetWindowUserPointer = RawFunctionLoader.link(SEGMENT$glfwGetWindowUserPointer, Descriptors.DESCRIPTOR$glfwGetWindowUserPointer);
        SEGMENT$glfwGetX11Adapter = loader.apply("glfwGetX11Adapter");
        HANDLE$glfwGetX11Adapter = RawFunctionLoader.link(SEGMENT$glfwGetX11Adapter, Descriptors.DESCRIPTOR$glfwGetX11Adapter);
        SEGMENT$glfwGetX11Display = loader.apply("glfwGetX11Display");
        HANDLE$glfwGetX11Display = RawFunctionLoader.link(SEGMENT$glfwGetX11Display, Descriptors.DESCRIPTOR$glfwGetX11Display);
        SEGMENT$glfwGetX11Monitor = loader.apply("glfwGetX11Monitor");
        HANDLE$glfwGetX11Monitor = RawFunctionLoader.link(SEGMENT$glfwGetX11Monitor, Descriptors.DESCRIPTOR$glfwGetX11Monitor);
        SEGMENT$glfwGetX11SelectionString = loader.apply("glfwGetX11SelectionString");
        HANDLE$glfwGetX11SelectionString = RawFunctionLoader.link(SEGMENT$glfwGetX11SelectionString, Descriptors.DESCRIPTOR$glfwGetX11SelectionString);
        SEGMENT$glfwGetX11Window = loader.apply("glfwGetX11Window");
        HANDLE$glfwGetX11Window = RawFunctionLoader.link(SEGMENT$glfwGetX11Window, Descriptors.DESCRIPTOR$glfwGetX11Window);
        SEGMENT$glfwHideWindow = loader.apply("glfwHideWindow");
        HANDLE$glfwHideWindow = RawFunctionLoader.link(SEGMENT$glfwHideWindow, Descriptors.DESCRIPTOR$glfwHideWindow);
        SEGMENT$glfwIconifyWindow = loader.apply("glfwIconifyWindow");
        HANDLE$glfwIconifyWindow = RawFunctionLoader.link(SEGMENT$glfwIconifyWindow, Descriptors.DESCRIPTOR$glfwIconifyWindow);
        SEGMENT$glfwInit = loader.apply("glfwInit");
        HANDLE$glfwInit = RawFunctionLoader.link(SEGMENT$glfwInit, Descriptors.DESCRIPTOR$glfwInit);
        SEGMENT$glfwInitAllocator = loader.apply("glfwInitAllocator");
        HANDLE$glfwInitAllocator = RawFunctionLoader.link(SEGMENT$glfwInitAllocator, Descriptors.DESCRIPTOR$glfwInitAllocator);
        SEGMENT$glfwInitHint = loader.apply("glfwInitHint");
        HANDLE$glfwInitHint = RawFunctionLoader.link(SEGMENT$glfwInitHint, Descriptors.DESCRIPTOR$glfwInitHint);
        SEGMENT$glfwInitVulkanLoader = loader.apply("glfwInitVulkanLoader");
        HANDLE$glfwInitVulkanLoader = RawFunctionLoader.link(SEGMENT$glfwInitVulkanLoader, Descriptors.DESCRIPTOR$glfwInitVulkanLoader);
        SEGMENT$glfwJoystickIsGamepad = loader.apply("glfwJoystickIsGamepad");
        HANDLE$glfwJoystickIsGamepad = RawFunctionLoader.link(SEGMENT$glfwJoystickIsGamepad, Descriptors.DESCRIPTOR$glfwJoystickIsGamepad);
        SEGMENT$glfwJoystickPresent = loader.apply("glfwJoystickPresent");
        HANDLE$glfwJoystickPresent = RawFunctionLoader.link(SEGMENT$glfwJoystickPresent, Descriptors.DESCRIPTOR$glfwJoystickPresent);
        SEGMENT$glfwMakeContextCurrent = loader.apply("glfwMakeContextCurrent");
        HANDLE$glfwMakeContextCurrent = RawFunctionLoader.link(SEGMENT$glfwMakeContextCurrent, Descriptors.DESCRIPTOR$glfwMakeContextCurrent);
        SEGMENT$glfwMaximizeWindow = loader.apply("glfwMaximizeWindow");
        HANDLE$glfwMaximizeWindow = RawFunctionLoader.link(SEGMENT$glfwMaximizeWindow, Descriptors.DESCRIPTOR$glfwMaximizeWindow);
        SEGMENT$glfwPlatformSupported = loader.apply("glfwPlatformSupported");
        HANDLE$glfwPlatformSupported = RawFunctionLoader.link(SEGMENT$glfwPlatformSupported, Descriptors.DESCRIPTOR$glfwPlatformSupported);
        SEGMENT$glfwPollEvents = loader.apply("glfwPollEvents");
        HANDLE$glfwPollEvents = RawFunctionLoader.link(SEGMENT$glfwPollEvents, Descriptors.DESCRIPTOR$glfwPollEvents);
        SEGMENT$glfwPostEmptyEvent = loader.apply("glfwPostEmptyEvent");
        HANDLE$glfwPostEmptyEvent = RawFunctionLoader.link(SEGMENT$glfwPostEmptyEvent, Descriptors.DESCRIPTOR$glfwPostEmptyEvent);
        SEGMENT$glfwRawMouseMotionSupported = loader.apply("glfwRawMouseMotionSupported");
        HANDLE$glfwRawMouseMotionSupported = RawFunctionLoader.link(SEGMENT$glfwRawMouseMotionSupported, Descriptors.DESCRIPTOR$glfwRawMouseMotionSupported);
        SEGMENT$glfwRequestWindowAttention = loader.apply("glfwRequestWindowAttention");
        HANDLE$glfwRequestWindowAttention = RawFunctionLoader.link(SEGMENT$glfwRequestWindowAttention, Descriptors.DESCRIPTOR$glfwRequestWindowAttention);
        SEGMENT$glfwRestoreWindow = loader.apply("glfwRestoreWindow");
        HANDLE$glfwRestoreWindow = RawFunctionLoader.link(SEGMENT$glfwRestoreWindow, Descriptors.DESCRIPTOR$glfwRestoreWindow);
        SEGMENT$glfwSetCharCallback = loader.apply("glfwSetCharCallback");
        HANDLE$glfwSetCharCallback = RawFunctionLoader.link(SEGMENT$glfwSetCharCallback, Descriptors.DESCRIPTOR$glfwSetCharCallback);
        SEGMENT$glfwSetCharModsCallback = loader.apply("glfwSetCharModsCallback");
        HANDLE$glfwSetCharModsCallback = RawFunctionLoader.link(SEGMENT$glfwSetCharModsCallback, Descriptors.DESCRIPTOR$glfwSetCharModsCallback);
        SEGMENT$glfwSetClipboardString = loader.apply("glfwSetClipboardString");
        HANDLE$glfwSetClipboardString = RawFunctionLoader.link(SEGMENT$glfwSetClipboardString, Descriptors.DESCRIPTOR$glfwSetClipboardString);
        SEGMENT$glfwSetCursor = loader.apply("glfwSetCursor");
        HANDLE$glfwSetCursor = RawFunctionLoader.link(SEGMENT$glfwSetCursor, Descriptors.DESCRIPTOR$glfwSetCursor);
        SEGMENT$glfwSetCursorEnterCallback = loader.apply("glfwSetCursorEnterCallback");
        HANDLE$glfwSetCursorEnterCallback = RawFunctionLoader.link(SEGMENT$glfwSetCursorEnterCallback, Descriptors.DESCRIPTOR$glfwSetCursorEnterCallback);
        SEGMENT$glfwSetCursorPos = loader.apply("glfwSetCursorPos");
        HANDLE$glfwSetCursorPos = RawFunctionLoader.link(SEGMENT$glfwSetCursorPos, Descriptors.DESCRIPTOR$glfwSetCursorPos);
        SEGMENT$glfwSetCursorPosCallback = loader.apply("glfwSetCursorPosCallback");
        HANDLE$glfwSetCursorPosCallback = RawFunctionLoader.link(SEGMENT$glfwSetCursorPosCallback, Descriptors.DESCRIPTOR$glfwSetCursorPosCallback);
        SEGMENT$glfwSetDropCallback = loader.apply("glfwSetDropCallback");
        HANDLE$glfwSetDropCallback = RawFunctionLoader.link(SEGMENT$glfwSetDropCallback, Descriptors.DESCRIPTOR$glfwSetDropCallback);
        SEGMENT$glfwSetErrorCallback = loader.apply("glfwSetErrorCallback");
        HANDLE$glfwSetErrorCallback = RawFunctionLoader.link(SEGMENT$glfwSetErrorCallback, Descriptors.DESCRIPTOR$glfwSetErrorCallback);
        SEGMENT$glfwSetFramebufferSizeCallback = loader.apply("glfwSetFramebufferSizeCallback");
        HANDLE$glfwSetFramebufferSizeCallback = RawFunctionLoader.link(SEGMENT$glfwSetFramebufferSizeCallback, Descriptors.DESCRIPTOR$glfwSetFramebufferSizeCallback);
        SEGMENT$glfwSetGamma = loader.apply("glfwSetGamma");
        HANDLE$glfwSetGamma = RawFunctionLoader.link(SEGMENT$glfwSetGamma, Descriptors.DESCRIPTOR$glfwSetGamma);
        SEGMENT$glfwSetGammaRamp = loader.apply("glfwSetGammaRamp");
        HANDLE$glfwSetGammaRamp = RawFunctionLoader.link(SEGMENT$glfwSetGammaRamp, Descriptors.DESCRIPTOR$glfwSetGammaRamp);
        SEGMENT$glfwSetInputMode = loader.apply("glfwSetInputMode");
        HANDLE$glfwSetInputMode = RawFunctionLoader.link(SEGMENT$glfwSetInputMode, Descriptors.DESCRIPTOR$glfwSetInputMode);
        SEGMENT$glfwSetJoystickCallback = loader.apply("glfwSetJoystickCallback");
        HANDLE$glfwSetJoystickCallback = RawFunctionLoader.link(SEGMENT$glfwSetJoystickCallback, Descriptors.DESCRIPTOR$glfwSetJoystickCallback);
        SEGMENT$glfwSetJoystickUserPointer = loader.apply("glfwSetJoystickUserPointer");
        HANDLE$glfwSetJoystickUserPointer = RawFunctionLoader.link(SEGMENT$glfwSetJoystickUserPointer, Descriptors.DESCRIPTOR$glfwSetJoystickUserPointer);
        SEGMENT$glfwSetKeyCallback = loader.apply("glfwSetKeyCallback");
        HANDLE$glfwSetKeyCallback = RawFunctionLoader.link(SEGMENT$glfwSetKeyCallback, Descriptors.DESCRIPTOR$glfwSetKeyCallback);
        SEGMENT$glfwSetMonitorCallback = loader.apply("glfwSetMonitorCallback");
        HANDLE$glfwSetMonitorCallback = RawFunctionLoader.link(SEGMENT$glfwSetMonitorCallback, Descriptors.DESCRIPTOR$glfwSetMonitorCallback);
        SEGMENT$glfwSetMonitorUserPointer = loader.apply("glfwSetMonitorUserPointer");
        HANDLE$glfwSetMonitorUserPointer = RawFunctionLoader.link(SEGMENT$glfwSetMonitorUserPointer, Descriptors.DESCRIPTOR$glfwSetMonitorUserPointer);
        SEGMENT$glfwSetMouseButtonCallback = loader.apply("glfwSetMouseButtonCallback");
        HANDLE$glfwSetMouseButtonCallback = RawFunctionLoader.link(SEGMENT$glfwSetMouseButtonCallback, Descriptors.DESCRIPTOR$glfwSetMouseButtonCallback);
        SEGMENT$glfwSetScrollCallback = loader.apply("glfwSetScrollCallback");
        HANDLE$glfwSetScrollCallback = RawFunctionLoader.link(SEGMENT$glfwSetScrollCallback, Descriptors.DESCRIPTOR$glfwSetScrollCallback);
        SEGMENT$glfwSetTime = loader.apply("glfwSetTime");
        HANDLE$glfwSetTime = RawFunctionLoader.link(SEGMENT$glfwSetTime, Descriptors.DESCRIPTOR$glfwSetTime);
        SEGMENT$glfwSetWindowAspectRatio = loader.apply("glfwSetWindowAspectRatio");
        HANDLE$glfwSetWindowAspectRatio = RawFunctionLoader.link(SEGMENT$glfwSetWindowAspectRatio, Descriptors.DESCRIPTOR$glfwSetWindowAspectRatio);
        SEGMENT$glfwSetWindowAttrib = loader.apply("glfwSetWindowAttrib");
        HANDLE$glfwSetWindowAttrib = RawFunctionLoader.link(SEGMENT$glfwSetWindowAttrib, Descriptors.DESCRIPTOR$glfwSetWindowAttrib);
        SEGMENT$glfwSetWindowCloseCallback = loader.apply("glfwSetWindowCloseCallback");
        HANDLE$glfwSetWindowCloseCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowCloseCallback, Descriptors.DESCRIPTOR$glfwSetWindowCloseCallback);
        SEGMENT$glfwSetWindowContentScaleCallback = loader.apply("glfwSetWindowContentScaleCallback");
        HANDLE$glfwSetWindowContentScaleCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowContentScaleCallback, Descriptors.DESCRIPTOR$glfwSetWindowContentScaleCallback);
        SEGMENT$glfwSetWindowFocusCallback = loader.apply("glfwSetWindowFocusCallback");
        HANDLE$glfwSetWindowFocusCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowFocusCallback, Descriptors.DESCRIPTOR$glfwSetWindowFocusCallback);
        SEGMENT$glfwSetWindowIcon = loader.apply("glfwSetWindowIcon");
        HANDLE$glfwSetWindowIcon = RawFunctionLoader.link(SEGMENT$glfwSetWindowIcon, Descriptors.DESCRIPTOR$glfwSetWindowIcon);
        SEGMENT$glfwSetWindowIconifyCallback = loader.apply("glfwSetWindowIconifyCallback");
        HANDLE$glfwSetWindowIconifyCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowIconifyCallback, Descriptors.DESCRIPTOR$glfwSetWindowIconifyCallback);
        SEGMENT$glfwSetWindowMaximizeCallback = loader.apply("glfwSetWindowMaximizeCallback");
        HANDLE$glfwSetWindowMaximizeCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowMaximizeCallback, Descriptors.DESCRIPTOR$glfwSetWindowMaximizeCallback);
        SEGMENT$glfwSetWindowMonitor = loader.apply("glfwSetWindowMonitor");
        HANDLE$glfwSetWindowMonitor = RawFunctionLoader.link(SEGMENT$glfwSetWindowMonitor, Descriptors.DESCRIPTOR$glfwSetWindowMonitor);
        SEGMENT$glfwSetWindowOpacity = loader.apply("glfwSetWindowOpacity");
        HANDLE$glfwSetWindowOpacity = RawFunctionLoader.link(SEGMENT$glfwSetWindowOpacity, Descriptors.DESCRIPTOR$glfwSetWindowOpacity);
        SEGMENT$glfwSetWindowPos = loader.apply("glfwSetWindowPos");
        HANDLE$glfwSetWindowPos = RawFunctionLoader.link(SEGMENT$glfwSetWindowPos, Descriptors.DESCRIPTOR$glfwSetWindowPos);
        SEGMENT$glfwSetWindowPosCallback = loader.apply("glfwSetWindowPosCallback");
        HANDLE$glfwSetWindowPosCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowPosCallback, Descriptors.DESCRIPTOR$glfwSetWindowPosCallback);
        SEGMENT$glfwSetWindowRefreshCallback = loader.apply("glfwSetWindowRefreshCallback");
        HANDLE$glfwSetWindowRefreshCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowRefreshCallback, Descriptors.DESCRIPTOR$glfwSetWindowRefreshCallback);
        SEGMENT$glfwSetWindowShouldClose = loader.apply("glfwSetWindowShouldClose");
        HANDLE$glfwSetWindowShouldClose = RawFunctionLoader.link(SEGMENT$glfwSetWindowShouldClose, Descriptors.DESCRIPTOR$glfwSetWindowShouldClose);
        SEGMENT$glfwSetWindowSize = loader.apply("glfwSetWindowSize");
        HANDLE$glfwSetWindowSize = RawFunctionLoader.link(SEGMENT$glfwSetWindowSize, Descriptors.DESCRIPTOR$glfwSetWindowSize);
        SEGMENT$glfwSetWindowSizeCallback = loader.apply("glfwSetWindowSizeCallback");
        HANDLE$glfwSetWindowSizeCallback = RawFunctionLoader.link(SEGMENT$glfwSetWindowSizeCallback, Descriptors.DESCRIPTOR$glfwSetWindowSizeCallback);
        SEGMENT$glfwSetWindowSizeLimits = loader.apply("glfwSetWindowSizeLimits");
        HANDLE$glfwSetWindowSizeLimits = RawFunctionLoader.link(SEGMENT$glfwSetWindowSizeLimits, Descriptors.DESCRIPTOR$glfwSetWindowSizeLimits);
        SEGMENT$glfwSetWindowTitle = loader.apply("glfwSetWindowTitle");
        HANDLE$glfwSetWindowTitle = RawFunctionLoader.link(SEGMENT$glfwSetWindowTitle, Descriptors.DESCRIPTOR$glfwSetWindowTitle);
        SEGMENT$glfwSetWindowUserPointer = loader.apply("glfwSetWindowUserPointer");
        HANDLE$glfwSetWindowUserPointer = RawFunctionLoader.link(SEGMENT$glfwSetWindowUserPointer, Descriptors.DESCRIPTOR$glfwSetWindowUserPointer);
        SEGMENT$glfwSetX11SelectionString = loader.apply("glfwSetX11SelectionString");
        HANDLE$glfwSetX11SelectionString = RawFunctionLoader.link(SEGMENT$glfwSetX11SelectionString, Descriptors.DESCRIPTOR$glfwSetX11SelectionString);
        SEGMENT$glfwShowWindow = loader.apply("glfwShowWindow");
        HANDLE$glfwShowWindow = RawFunctionLoader.link(SEGMENT$glfwShowWindow, Descriptors.DESCRIPTOR$glfwShowWindow);
        SEGMENT$glfwSwapBuffers = loader.apply("glfwSwapBuffers");
        HANDLE$glfwSwapBuffers = RawFunctionLoader.link(SEGMENT$glfwSwapBuffers, Descriptors.DESCRIPTOR$glfwSwapBuffers);
        SEGMENT$glfwSwapInterval = loader.apply("glfwSwapInterval");
        HANDLE$glfwSwapInterval = RawFunctionLoader.link(SEGMENT$glfwSwapInterval, Descriptors.DESCRIPTOR$glfwSwapInterval);
        SEGMENT$glfwTerminate = loader.apply("glfwTerminate");
        HANDLE$glfwTerminate = RawFunctionLoader.link(SEGMENT$glfwTerminate, Descriptors.DESCRIPTOR$glfwTerminate);
        SEGMENT$glfwUpdateGamepadMappings = loader.apply("glfwUpdateGamepadMappings");
        HANDLE$glfwUpdateGamepadMappings = RawFunctionLoader.link(SEGMENT$glfwUpdateGamepadMappings, Descriptors.DESCRIPTOR$glfwUpdateGamepadMappings);
        SEGMENT$glfwVulkanSupported = loader.apply("glfwVulkanSupported");
        HANDLE$glfwVulkanSupported = RawFunctionLoader.link(SEGMENT$glfwVulkanSupported, Descriptors.DESCRIPTOR$glfwVulkanSupported);
        SEGMENT$glfwWaitEvents = loader.apply("glfwWaitEvents");
        HANDLE$glfwWaitEvents = RawFunctionLoader.link(SEGMENT$glfwWaitEvents, Descriptors.DESCRIPTOR$glfwWaitEvents);
        SEGMENT$glfwWaitEventsTimeout = loader.apply("glfwWaitEventsTimeout");
        HANDLE$glfwWaitEventsTimeout = RawFunctionLoader.link(SEGMENT$glfwWaitEventsTimeout, Descriptors.DESCRIPTOR$glfwWaitEventsTimeout);
        SEGMENT$glfwWindowHint = loader.apply("glfwWindowHint");
        HANDLE$glfwWindowHint = RawFunctionLoader.link(SEGMENT$glfwWindowHint, Descriptors.DESCRIPTOR$glfwWindowHint);
        SEGMENT$glfwWindowHintString = loader.apply("glfwWindowHintString");
        HANDLE$glfwWindowHintString = RawFunctionLoader.link(SEGMENT$glfwWindowHintString, Descriptors.DESCRIPTOR$glfwWindowHintString);
        SEGMENT$glfwWindowShouldClose = loader.apply("glfwWindowShouldClose");
        HANDLE$glfwWindowShouldClose = RawFunctionLoader.link(SEGMENT$glfwWindowShouldClose, Descriptors.DESCRIPTOR$glfwWindowShouldClose);
    }

    // region command wrappers

    public @Pointer(comment="GLFWcursor*") MemorySegment createCursor(
        @Pointer IGLFWimage image,
        int xhot,
        int yhot
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwCreateCursor);
        try {
            return (MemorySegment) hFunction.invokeExact(
                image.segment(),
                xhot,
                yhot
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWcursor*") MemorySegment createStandardCursor(
        int shape
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwCreateStandardCursor);
        try {
            return (MemorySegment) hFunction.invokeExact(
                shape
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWwindow*") MemorySegment createWindow(
        int width,
        int height,
        BytePtr title,
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor,
        @Pointer(comment="GLFWwindow*") MemorySegment share
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwCreateWindow);
        try {
            return (MemorySegment) hFunction.invokeExact(
                width,
                height,
                title.segment(),
                monitor,
                share
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @EnumType(VkResult.class) int createWindowSurface(
        VkInstance instance,
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer IVkAllocationCallbacks allocator,
        @Pointer VkSurfaceKHR.Ptr surface
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwCreateWindowSurface);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                window,
                allocator.segment(),
                surface.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void defaultWindowHints() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwDefaultWindowHints);
        try {
            hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void destroyCursor(
        @Pointer(comment="GLFWcursor*") MemorySegment cursor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwDestroyCursor);
        try {
            hFunction.invokeExact(
                cursor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void destroyWindow(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwDestroyWindow);
        try {
            hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int extensionSupported(
        BytePtr extension
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwExtensionSupported);
        try {
            return (int) hFunction.invokeExact(
                extension.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void focusWindow(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwFocusWindow);
        try {
            hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getClipboardString(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetClipboardString);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                window
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("CGDirectDisplayID") @Unsigned int getCocoaMonitor(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetCocoaMonitor);
        try {
            return (int) hFunction.invokeExact(
                monitor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="id") MemorySegment getCocoaView(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetCocoaView);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="id") MemorySegment getCocoaWindow(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetCocoaWindow);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWwindow*") MemorySegment getCurrentContext() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetCurrentContext);
        try {
            return (MemorySegment) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getCursorPos(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        DoublePtr xpos,
        DoublePtr ypos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetCursorPos);
        try {
            hFunction.invokeExact(
                window,
                xpos.segment(),
                ypos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="EGLContext") MemorySegment getEGLContext(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetEGLContext);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="EGLDisplay") MemorySegment getEGLDisplay() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetEGLDisplay);
        try {
            return (MemorySegment) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="EGLSurface") MemorySegment getEGLSurface(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetEGLSurface);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getError(
        PointerPtr description
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetError);
        try {
            return (int) hFunction.invokeExact(
                description.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getFramebufferSize(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        IntPtr width,
        IntPtr height
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetFramebufferSize);
        try {
            hFunction.invokeExact(
                window,
                width.segment(),
                height.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLXContext") MemorySegment getGLXContext(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetGLXContext);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("GLXWindow") long getGLXWindow(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetGLXWindow);
        try {
            return (long) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getGamepadName(
        int jid
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetGamepadName);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                jid
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getGamepadState(
        int jid,
        @Pointer IGLFWgamepadstate state
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetGamepadState);
        try {
            return (int) hFunction.invokeExact(
                jid,
                state.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer IGLFWgammaramp getGammaRamp(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetGammaRamp);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                monitor
            );
            return s.address() == 0 ? null : new GLFWgammaramp(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getInputMode(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int mode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetInputMode);
        try {
            return (int) hFunction.invokeExact(
                window,
                mode
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWvkproc") MemorySegment getInstanceProcAddress(
        VkInstance instance,
        BytePtr procname
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetInstanceProcAddress);
        try {
            return (MemorySegment) hFunction.invokeExact(
                instance.segment(),
                procname.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public FloatPtr getJoystickAxes(
        int jid,
        IntPtr count
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetJoystickAxes);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                jid,
                count.segment()
            );
            return s.address() == 0 ? null : new FloatPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getJoystickButtons(
        int jid,
        IntPtr count
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetJoystickButtons);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                jid,
                count.segment()
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getJoystickGUID(
        int jid
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetJoystickGUID);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                jid
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getJoystickHats(
        int jid,
        IntPtr count
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetJoystickHats);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                jid,
                count.segment()
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getJoystickName(
        int jid
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetJoystickName);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                jid
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="void*") MemorySegment getJoystickUserPointer(
        int jid
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetJoystickUserPointer);
        try {
            return (MemorySegment) hFunction.invokeExact(
                jid
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getKey(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int key
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetKey);
        try {
            return (int) hFunction.invokeExact(
                window,
                key
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getKeyName(
        int key,
        int scancode
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetKeyName);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                key,
                scancode
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getKeyScancode(
        int key
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetKeyScancode);
        try {
            return (int) hFunction.invokeExact(
                key
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getMonitorContentScale(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor,
        FloatPtr xscale,
        FloatPtr yscale
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetMonitorContentScale);
        try {
            hFunction.invokeExact(
                monitor,
                xscale.segment(),
                yscale.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getMonitorName(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetMonitorName);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                monitor
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getMonitorPhysicalSize(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor,
        IntPtr widthMM,
        IntPtr heightMM
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetMonitorPhysicalSize);
        try {
            hFunction.invokeExact(
                monitor,
                widthMM.segment(),
                heightMM.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getMonitorPos(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor,
        IntPtr xpos,
        IntPtr ypos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetMonitorPos);
        try {
            hFunction.invokeExact(
                monitor,
                xpos.segment(),
                ypos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="void*") MemorySegment getMonitorUserPointer(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetMonitorUserPointer);
        try {
            return (MemorySegment) hFunction.invokeExact(
                monitor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getMonitorWorkarea(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor,
        IntPtr xpos,
        IntPtr ypos,
        IntPtr width,
        IntPtr height
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetMonitorWorkarea);
        try {
            hFunction.invokeExact(
                monitor,
                xpos.segment(),
                ypos.segment(),
                width.segment(),
                height.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public PointerPtr getMonitors(
        IntPtr count
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetMonitors);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                count.segment()
            );
            return s.address() == 0 ? null : new PointerPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getMouseButton(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int button
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetMouseButton);
        try {
            return (int) hFunction.invokeExact(
                window,
                button
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="id") MemorySegment getNSGLContext(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetNSGLContext);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getOSMesaColorBuffer(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        IntPtr width,
        IntPtr height,
        IntPtr format,
        PointerPtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetOSMesaColorBuffer);
        try {
            return (int) hFunction.invokeExact(
                window,
                width.segment(),
                height.segment(),
                format.segment(),
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="OSMesaContext") MemorySegment getOSMesaContext(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetOSMesaContext);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getOSMesaDepthBuffer(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        IntPtr width,
        IntPtr height,
        IntPtr bytesPerValue,
        PointerPtr buffer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetOSMesaDepthBuffer);
        try {
            return (int) hFunction.invokeExact(
                window,
                width.segment(),
                height.segment(),
                bytesPerValue.segment(),
                buffer.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getPhysicalDevicePresentationSupport(
        VkInstance instance,
        VkPhysicalDevice device,
        @Unsigned int queuefamily
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetPhysicalDevicePresentationSupport);
        try {
            return (int) hFunction.invokeExact(
                instance.segment(),
                device.segment(),
                queuefamily
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getPlatform() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetPlatform);
        try {
            return (int) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWmonitor*") MemorySegment getPrimaryMonitor() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetPrimaryMonitor);
        try {
            return (MemorySegment) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWglproc") MemorySegment getProcAddress(
        BytePtr procname
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetProcAddress);
        try {
            return (MemorySegment) hFunction.invokeExact(
                procname.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public PointerPtr getRequiredInstanceExtensions(
        @Unsigned IntPtr count
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetRequiredInstanceExtensions);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                count.segment()
            );
            return s.address() == 0 ? null : new PointerPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public double getTime() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetTime);
        try {
            return (double) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Unsigned long getTimerFrequency() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetTimerFrequency);
        try {
            return (long) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Unsigned long getTimerValue() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetTimerValue);
        try {
            return (long) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getVersion(
        IntPtr major,
        IntPtr minor,
        IntPtr rev
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetVersion);
        try {
            hFunction.invokeExact(
                major.segment(),
                minor.segment(),
                rev.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getVersionString() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetVersionString);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer IGLFWvidmode getVideoMode(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetVideoMode);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                monitor
            );
            return s.address() == 0 ? null : new GLFWvidmode(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer IGLFWvidmode getVideoModes(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor,
        IntPtr count
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetVideoModes);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                monitor,
                count.segment()
            );
            return s.address() == 0 ? null : new GLFWvidmode(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="HGLRC") MemorySegment getWGLContext(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWGLContext);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public PointerPtr getWaylandDisplay() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWaylandDisplay);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
            );
            return s.address() == 0 ? null : new PointerPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="void*") MemorySegment getWaylandMonitor(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWaylandMonitor);
        try {
            return (MemorySegment) hFunction.invokeExact(
                monitor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public PointerPtr getWaylandWindow(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWaylandWindow);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                window
            );
            return s.address() == 0 ? null : new PointerPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getWin32Adapter(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWin32Adapter);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                monitor
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getWin32Monitor(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWin32Monitor);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                monitor
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="HWND") MemorySegment getWin32Window(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWin32Window);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int getWindowAttrib(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int attrib
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWindowAttrib);
        try {
            return (int) hFunction.invokeExact(
                window,
                attrib
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getWindowContentScale(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        FloatPtr xscale,
        FloatPtr yscale
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWindowContentScale);
        try {
            hFunction.invokeExact(
                window,
                xscale.segment(),
                yscale.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getWindowFrameSize(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        IntPtr left,
        IntPtr top,
        IntPtr right,
        IntPtr bottom
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWindowFrameSize);
        try {
            hFunction.invokeExact(
                window,
                left.segment(),
                top.segment(),
                right.segment(),
                bottom.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWmonitor*") MemorySegment getWindowMonitor(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWindowMonitor);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public float getWindowOpacity(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWindowOpacity);
        try {
            return (float) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getWindowPos(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        IntPtr xpos,
        IntPtr ypos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWindowPos);
        try {
            hFunction.invokeExact(
                window,
                xpos.segment(),
                ypos.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void getWindowSize(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        IntPtr width,
        IntPtr height
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWindowSize);
        try {
            hFunction.invokeExact(
                window,
                width.segment(),
                height.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getWindowTitle(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWindowTitle);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
                window
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="void*") MemorySegment getWindowUserPointer(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetWindowUserPointer);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("RRCrtc") long getX11Adapter(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetX11Adapter);
        try {
            return (long) hFunction.invokeExact(
                monitor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public PointerPtr getX11Display() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetX11Display);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
            );
            return s.address() == 0 ? null : new PointerPtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("RROutput") long getX11Monitor(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetX11Monitor);
        try {
            return (long) hFunction.invokeExact(
                monitor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public BytePtr getX11SelectionString() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetX11SelectionString);
        try {
            MemorySegment s = (MemorySegment) hFunction.invokeExact(
            );
            return s.address() == 0 ? null : new BytePtr(s);
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @NativeType("Window") long getX11Window(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwGetX11Window);
        try {
            return (long) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void hideWindow(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwHideWindow);
        try {
            hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void iconifyWindow(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwIconifyWindow);
        try {
            hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int init() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwInit);
        try {
            return (int) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void initAllocator(
        @Pointer IGLFWallocator allocator
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwInitAllocator);
        try {
            hFunction.invokeExact(
                allocator.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void initHint(
        int hint,
        int value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwInitHint);
        try {
            hFunction.invokeExact(
                hint,
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void initVulkanLoader(
        @Pointer(comment="PFN_vkGetInstanceProcAddr") MemorySegment loader
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwInitVulkanLoader);
        try {
            hFunction.invokeExact(
                loader
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int joystickIsGamepad(
        int jid
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwJoystickIsGamepad);
        try {
            return (int) hFunction.invokeExact(
                jid
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int joystickPresent(
        int jid
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwJoystickPresent);
        try {
            return (int) hFunction.invokeExact(
                jid
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void makeContextCurrent(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwMakeContextCurrent);
        try {
            hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void maximizeWindow(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwMaximizeWindow);
        try {
            hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int platformSupported(
        int platform
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwPlatformSupported);
        try {
            return (int) hFunction.invokeExact(
                platform
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void pollEvents() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwPollEvents);
        try {
            hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void postEmptyEvent() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwPostEmptyEvent);
        try {
            hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int rawMouseMotionSupported() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwRawMouseMotionSupported);
        try {
            return (int) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void requestWindowAttention(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwRequestWindowAttention);
        try {
            hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void restoreWindow(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwRestoreWindow);
        try {
            hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWcharfun") MemorySegment setCharCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWcharfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetCharCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWcharmodsfun") MemorySegment setCharModsCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWcharmodsfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetCharModsCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setClipboardString(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        BytePtr string
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetClipboardString);
        try {
            hFunction.invokeExact(
                window,
                string.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setCursor(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWcursor*") MemorySegment cursor
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetCursor);
        try {
            hFunction.invokeExact(
                window,
                cursor
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWcursorenterfun") MemorySegment setCursorEnterCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWcursorenterfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetCursorEnterCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setCursorPos(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        double xpos,
        double ypos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetCursorPos);
        try {
            hFunction.invokeExact(
                window,
                xpos,
                ypos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWcursorposfun") MemorySegment setCursorPosCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWcursorposfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetCursorPosCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWdropfun") MemorySegment setDropCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWdropfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetDropCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWerrorfun") MemorySegment setErrorCallback(
        @Pointer(comment="GLFWerrorfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetErrorCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWframebuffersizefun") MemorySegment setFramebufferSizeCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWframebuffersizefun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetFramebufferSizeCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setGamma(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor,
        float gamma
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetGamma);
        try {
            hFunction.invokeExact(
                monitor,
                gamma
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setGammaRamp(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor,
        @Pointer IGLFWgammaramp ramp
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetGammaRamp);
        try {
            hFunction.invokeExact(
                monitor,
                ramp.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setInputMode(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int mode,
        int value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetInputMode);
        try {
            hFunction.invokeExact(
                window,
                mode,
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWjoystickfun") MemorySegment setJoystickCallback(
        @Pointer(comment="GLFWjoystickfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetJoystickCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setJoystickUserPointer(
        int jid,
        @Pointer(comment="void*") MemorySegment pointer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetJoystickUserPointer);
        try {
            hFunction.invokeExact(
                jid,
                pointer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWkeyfun") MemorySegment setKeyCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWkeyfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetKeyCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWmonitorfun") MemorySegment setMonitorCallback(
        @Pointer(comment="GLFWmonitorfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetMonitorCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setMonitorUserPointer(
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor,
        @Pointer(comment="void*") MemorySegment pointer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetMonitorUserPointer);
        try {
            hFunction.invokeExact(
                monitor,
                pointer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWmousebuttonfun") MemorySegment setMouseButtonCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWmousebuttonfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetMouseButtonCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWscrollfun") MemorySegment setScrollCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWscrollfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetScrollCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setTime(
        double time
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetTime);
        try {
            hFunction.invokeExact(
                time
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setWindowAspectRatio(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int numer,
        int denom
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowAspectRatio);
        try {
            hFunction.invokeExact(
                window,
                numer,
                denom
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setWindowAttrib(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int attrib,
        int value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowAttrib);
        try {
            hFunction.invokeExact(
                window,
                attrib,
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWwindowclosefun") MemorySegment setWindowCloseCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWwindowclosefun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowCloseCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWwindowcontentscalefun") MemorySegment setWindowContentScaleCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWwindowcontentscalefun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowContentScaleCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWwindowfocusfun") MemorySegment setWindowFocusCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWwindowfocusfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowFocusCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setWindowIcon(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int count,
        @Pointer IGLFWimage images
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowIcon);
        try {
            hFunction.invokeExact(
                window,
                count,
                images.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWwindowiconifyfun") MemorySegment setWindowIconifyCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWwindowiconifyfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowIconifyCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWwindowmaximizefun") MemorySegment setWindowMaximizeCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWwindowmaximizefun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowMaximizeCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setWindowMonitor(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWmonitor*") MemorySegment monitor,
        int xpos,
        int ypos,
        int width,
        int height,
        int refreshRate
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowMonitor);
        try {
            hFunction.invokeExact(
                window,
                monitor,
                xpos,
                ypos,
                width,
                height,
                refreshRate
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setWindowOpacity(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        float opacity
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowOpacity);
        try {
            hFunction.invokeExact(
                window,
                opacity
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setWindowPos(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int xpos,
        int ypos
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowPos);
        try {
            hFunction.invokeExact(
                window,
                xpos,
                ypos
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWwindowposfun") MemorySegment setWindowPosCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWwindowposfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowPosCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWwindowrefreshfun") MemorySegment setWindowRefreshCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWwindowrefreshfun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowRefreshCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setWindowShouldClose(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowShouldClose);
        try {
            hFunction.invokeExact(
                window,
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setWindowSize(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int width,
        int height
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowSize);
        try {
            hFunction.invokeExact(
                window,
                width,
                height
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public @Pointer(comment="GLFWwindowsizefun") MemorySegment setWindowSizeCallback(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="GLFWwindowsizefun") MemorySegment callback
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowSizeCallback);
        try {
            return (MemorySegment) hFunction.invokeExact(
                window,
                callback
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setWindowSizeLimits(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        int minwidth,
        int minheight,
        int maxwidth,
        int maxheight
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowSizeLimits);
        try {
            hFunction.invokeExact(
                window,
                minwidth,
                minheight,
                maxwidth,
                maxheight
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setWindowTitle(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        BytePtr title
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowTitle);
        try {
            hFunction.invokeExact(
                window,
                title.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setWindowUserPointer(
        @Pointer(comment="GLFWwindow*") MemorySegment window,
        @Pointer(comment="void*") MemorySegment pointer
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetWindowUserPointer);
        try {
            hFunction.invokeExact(
                window,
                pointer
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void setX11SelectionString(
        BytePtr string
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSetX11SelectionString);
        try {
            hFunction.invokeExact(
                string.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void showWindow(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwShowWindow);
        try {
            hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void swapBuffers(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSwapBuffers);
        try {
            hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void swapInterval(
        int interval
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwSwapInterval);
        try {
            hFunction.invokeExact(
                interval
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void terminate() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwTerminate);
        try {
            hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int updateGamepadMappings(
        BytePtr string
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwUpdateGamepadMappings);
        try {
            return (int) hFunction.invokeExact(
                string.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int vulkanSupported() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwVulkanSupported);
        try {
            return (int) hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void waitEvents() {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwWaitEvents);
        try {
            hFunction.invokeExact(
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void waitEventsTimeout(
        double timeout
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwWaitEventsTimeout);
        try {
            hFunction.invokeExact(
                timeout
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void windowHint(
        int hint,
        int value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwWindowHint);
        try {
            hFunction.invokeExact(
                hint,
                value
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public void windowHintString(
        int hint,
        BytePtr value
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwWindowHintString);
        try {
            hFunction.invokeExact(
                hint,
                value.segment()
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }

    public int windowShouldClose(
        @Pointer(comment="GLFWwindow*") MemorySegment window
    ) {
        MethodHandle hFunction = Objects.requireNonNull(HANDLE$glfwWindowShouldClose);
        try {
            return (int) hFunction.invokeExact(
                window
            );
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
    // endregion

    // region segments and handles
    public final @Nullable MemorySegment SEGMENT$glfwCreateCursor;
    public final @Nullable MemorySegment SEGMENT$glfwCreateStandardCursor;
    public final @Nullable MemorySegment SEGMENT$glfwCreateWindow;
    public final @Nullable MemorySegment SEGMENT$glfwCreateWindowSurface;
    public final @Nullable MemorySegment SEGMENT$glfwDefaultWindowHints;
    public final @Nullable MemorySegment SEGMENT$glfwDestroyCursor;
    public final @Nullable MemorySegment SEGMENT$glfwDestroyWindow;
    public final @Nullable MemorySegment SEGMENT$glfwExtensionSupported;
    public final @Nullable MemorySegment SEGMENT$glfwFocusWindow;
    public final @Nullable MemorySegment SEGMENT$glfwGetClipboardString;
    public final @Nullable MemorySegment SEGMENT$glfwGetCocoaMonitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetCocoaView;
    public final @Nullable MemorySegment SEGMENT$glfwGetCocoaWindow;
    public final @Nullable MemorySegment SEGMENT$glfwGetCurrentContext;
    public final @Nullable MemorySegment SEGMENT$glfwGetCursorPos;
    public final @Nullable MemorySegment SEGMENT$glfwGetEGLContext;
    public final @Nullable MemorySegment SEGMENT$glfwGetEGLDisplay;
    public final @Nullable MemorySegment SEGMENT$glfwGetEGLSurface;
    public final @Nullable MemorySegment SEGMENT$glfwGetError;
    public final @Nullable MemorySegment SEGMENT$glfwGetFramebufferSize;
    public final @Nullable MemorySegment SEGMENT$glfwGetGLXContext;
    public final @Nullable MemorySegment SEGMENT$glfwGetGLXWindow;
    public final @Nullable MemorySegment SEGMENT$glfwGetGamepadName;
    public final @Nullable MemorySegment SEGMENT$glfwGetGamepadState;
    public final @Nullable MemorySegment SEGMENT$glfwGetGammaRamp;
    public final @Nullable MemorySegment SEGMENT$glfwGetInputMode;
    public final @Nullable MemorySegment SEGMENT$glfwGetInstanceProcAddress;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickAxes;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickButtons;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickGUID;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickHats;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickName;
    public final @Nullable MemorySegment SEGMENT$glfwGetJoystickUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwGetKey;
    public final @Nullable MemorySegment SEGMENT$glfwGetKeyName;
    public final @Nullable MemorySegment SEGMENT$glfwGetKeyScancode;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorContentScale;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorName;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorPhysicalSize;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorPos;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitorWorkarea;
    public final @Nullable MemorySegment SEGMENT$glfwGetMonitors;
    public final @Nullable MemorySegment SEGMENT$glfwGetMouseButton;
    public final @Nullable MemorySegment SEGMENT$glfwGetNSGLContext;
    public final @Nullable MemorySegment SEGMENT$glfwGetOSMesaColorBuffer;
    public final @Nullable MemorySegment SEGMENT$glfwGetOSMesaContext;
    public final @Nullable MemorySegment SEGMENT$glfwGetOSMesaDepthBuffer;
    public final @Nullable MemorySegment SEGMENT$glfwGetPhysicalDevicePresentationSupport;
    public final @Nullable MemorySegment SEGMENT$glfwGetPlatform;
    public final @Nullable MemorySegment SEGMENT$glfwGetPrimaryMonitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetProcAddress;
    public final @Nullable MemorySegment SEGMENT$glfwGetRequiredInstanceExtensions;
    public final @Nullable MemorySegment SEGMENT$glfwGetTime;
    public final @Nullable MemorySegment SEGMENT$glfwGetTimerFrequency;
    public final @Nullable MemorySegment SEGMENT$glfwGetTimerValue;
    public final @Nullable MemorySegment SEGMENT$glfwGetVersion;
    public final @Nullable MemorySegment SEGMENT$glfwGetVersionString;
    public final @Nullable MemorySegment SEGMENT$glfwGetVideoMode;
    public final @Nullable MemorySegment SEGMENT$glfwGetVideoModes;
    public final @Nullable MemorySegment SEGMENT$glfwGetWGLContext;
    public final @Nullable MemorySegment SEGMENT$glfwGetWaylandDisplay;
    public final @Nullable MemorySegment SEGMENT$glfwGetWaylandMonitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetWaylandWindow;
    public final @Nullable MemorySegment SEGMENT$glfwGetWin32Adapter;
    public final @Nullable MemorySegment SEGMENT$glfwGetWin32Monitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetWin32Window;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowAttrib;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowContentScale;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowFrameSize;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowMonitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowOpacity;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowPos;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowSize;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowTitle;
    public final @Nullable MemorySegment SEGMENT$glfwGetWindowUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwGetX11Adapter;
    public final @Nullable MemorySegment SEGMENT$glfwGetX11Display;
    public final @Nullable MemorySegment SEGMENT$glfwGetX11Monitor;
    public final @Nullable MemorySegment SEGMENT$glfwGetX11SelectionString;
    public final @Nullable MemorySegment SEGMENT$glfwGetX11Window;
    public final @Nullable MemorySegment SEGMENT$glfwHideWindow;
    public final @Nullable MemorySegment SEGMENT$glfwIconifyWindow;
    public final @Nullable MemorySegment SEGMENT$glfwInit;
    public final @Nullable MemorySegment SEGMENT$glfwInitAllocator;
    public final @Nullable MemorySegment SEGMENT$glfwInitHint;
    public final @Nullable MemorySegment SEGMENT$glfwInitVulkanLoader;
    public final @Nullable MemorySegment SEGMENT$glfwJoystickIsGamepad;
    public final @Nullable MemorySegment SEGMENT$glfwJoystickPresent;
    public final @Nullable MemorySegment SEGMENT$glfwMakeContextCurrent;
    public final @Nullable MemorySegment SEGMENT$glfwMaximizeWindow;
    public final @Nullable MemorySegment SEGMENT$glfwPlatformSupported;
    public final @Nullable MemorySegment SEGMENT$glfwPollEvents;
    public final @Nullable MemorySegment SEGMENT$glfwPostEmptyEvent;
    public final @Nullable MemorySegment SEGMENT$glfwRawMouseMotionSupported;
    public final @Nullable MemorySegment SEGMENT$glfwRequestWindowAttention;
    public final @Nullable MemorySegment SEGMENT$glfwRestoreWindow;
    public final @Nullable MemorySegment SEGMENT$glfwSetCharCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetCharModsCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetClipboardString;
    public final @Nullable MemorySegment SEGMENT$glfwSetCursor;
    public final @Nullable MemorySegment SEGMENT$glfwSetCursorEnterCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetCursorPos;
    public final @Nullable MemorySegment SEGMENT$glfwSetCursorPosCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetDropCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetErrorCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetFramebufferSizeCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetGamma;
    public final @Nullable MemorySegment SEGMENT$glfwSetGammaRamp;
    public final @Nullable MemorySegment SEGMENT$glfwSetInputMode;
    public final @Nullable MemorySegment SEGMENT$glfwSetJoystickCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetJoystickUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwSetKeyCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetMonitorCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetMonitorUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwSetMouseButtonCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetScrollCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetTime;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowAspectRatio;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowAttrib;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowCloseCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowContentScaleCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowFocusCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowIcon;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowIconifyCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowMaximizeCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowMonitor;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowOpacity;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowPos;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowPosCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowRefreshCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowShouldClose;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowSize;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowSizeCallback;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowSizeLimits;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowTitle;
    public final @Nullable MemorySegment SEGMENT$glfwSetWindowUserPointer;
    public final @Nullable MemorySegment SEGMENT$glfwSetX11SelectionString;
    public final @Nullable MemorySegment SEGMENT$glfwShowWindow;
    public final @Nullable MemorySegment SEGMENT$glfwSwapBuffers;
    public final @Nullable MemorySegment SEGMENT$glfwSwapInterval;
    public final @Nullable MemorySegment SEGMENT$glfwTerminate;
    public final @Nullable MemorySegment SEGMENT$glfwUpdateGamepadMappings;
    public final @Nullable MemorySegment SEGMENT$glfwVulkanSupported;
    public final @Nullable MemorySegment SEGMENT$glfwWaitEvents;
    public final @Nullable MemorySegment SEGMENT$glfwWaitEventsTimeout;
    public final @Nullable MemorySegment SEGMENT$glfwWindowHint;
    public final @Nullable MemorySegment SEGMENT$glfwWindowHintString;
    public final @Nullable MemorySegment SEGMENT$glfwWindowShouldClose;
    public final @Nullable MethodHandle HANDLE$glfwCreateCursor;
    public final @Nullable MethodHandle HANDLE$glfwCreateStandardCursor;
    public final @Nullable MethodHandle HANDLE$glfwCreateWindow;
    public final @Nullable MethodHandle HANDLE$glfwCreateWindowSurface;
    public final @Nullable MethodHandle HANDLE$glfwDefaultWindowHints;
    public final @Nullable MethodHandle HANDLE$glfwDestroyCursor;
    public final @Nullable MethodHandle HANDLE$glfwDestroyWindow;
    public final @Nullable MethodHandle HANDLE$glfwExtensionSupported;
    public final @Nullable MethodHandle HANDLE$glfwFocusWindow;
    public final @Nullable MethodHandle HANDLE$glfwGetClipboardString;
    public final @Nullable MethodHandle HANDLE$glfwGetCocoaMonitor;
    public final @Nullable MethodHandle HANDLE$glfwGetCocoaView;
    public final @Nullable MethodHandle HANDLE$glfwGetCocoaWindow;
    public final @Nullable MethodHandle HANDLE$glfwGetCurrentContext;
    public final @Nullable MethodHandle HANDLE$glfwGetCursorPos;
    public final @Nullable MethodHandle HANDLE$glfwGetEGLContext;
    public final @Nullable MethodHandle HANDLE$glfwGetEGLDisplay;
    public final @Nullable MethodHandle HANDLE$glfwGetEGLSurface;
    public final @Nullable MethodHandle HANDLE$glfwGetError;
    public final @Nullable MethodHandle HANDLE$glfwGetFramebufferSize;
    public final @Nullable MethodHandle HANDLE$glfwGetGLXContext;
    public final @Nullable MethodHandle HANDLE$glfwGetGLXWindow;
    public final @Nullable MethodHandle HANDLE$glfwGetGamepadName;
    public final @Nullable MethodHandle HANDLE$glfwGetGamepadState;
    public final @Nullable MethodHandle HANDLE$glfwGetGammaRamp;
    public final @Nullable MethodHandle HANDLE$glfwGetInputMode;
    public final @Nullable MethodHandle HANDLE$glfwGetInstanceProcAddress;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickAxes;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickButtons;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickGUID;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickHats;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickName;
    public final @Nullable MethodHandle HANDLE$glfwGetJoystickUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwGetKey;
    public final @Nullable MethodHandle HANDLE$glfwGetKeyName;
    public final @Nullable MethodHandle HANDLE$glfwGetKeyScancode;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorContentScale;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorName;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorPhysicalSize;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorPos;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitorWorkarea;
    public final @Nullable MethodHandle HANDLE$glfwGetMonitors;
    public final @Nullable MethodHandle HANDLE$glfwGetMouseButton;
    public final @Nullable MethodHandle HANDLE$glfwGetNSGLContext;
    public final @Nullable MethodHandle HANDLE$glfwGetOSMesaColorBuffer;
    public final @Nullable MethodHandle HANDLE$glfwGetOSMesaContext;
    public final @Nullable MethodHandle HANDLE$glfwGetOSMesaDepthBuffer;
    public final @Nullable MethodHandle HANDLE$glfwGetPhysicalDevicePresentationSupport;
    public final @Nullable MethodHandle HANDLE$glfwGetPlatform;
    public final @Nullable MethodHandle HANDLE$glfwGetPrimaryMonitor;
    public final @Nullable MethodHandle HANDLE$glfwGetProcAddress;
    public final @Nullable MethodHandle HANDLE$glfwGetRequiredInstanceExtensions;
    public final @Nullable MethodHandle HANDLE$glfwGetTime;
    public final @Nullable MethodHandle HANDLE$glfwGetTimerFrequency;
    public final @Nullable MethodHandle HANDLE$glfwGetTimerValue;
    public final @Nullable MethodHandle HANDLE$glfwGetVersion;
    public final @Nullable MethodHandle HANDLE$glfwGetVersionString;
    public final @Nullable MethodHandle HANDLE$glfwGetVideoMode;
    public final @Nullable MethodHandle HANDLE$glfwGetVideoModes;
    public final @Nullable MethodHandle HANDLE$glfwGetWGLContext;
    public final @Nullable MethodHandle HANDLE$glfwGetWaylandDisplay;
    public final @Nullable MethodHandle HANDLE$glfwGetWaylandMonitor;
    public final @Nullable MethodHandle HANDLE$glfwGetWaylandWindow;
    public final @Nullable MethodHandle HANDLE$glfwGetWin32Adapter;
    public final @Nullable MethodHandle HANDLE$glfwGetWin32Monitor;
    public final @Nullable MethodHandle HANDLE$glfwGetWin32Window;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowAttrib;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowContentScale;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowFrameSize;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowMonitor;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowOpacity;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowPos;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowSize;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowTitle;
    public final @Nullable MethodHandle HANDLE$glfwGetWindowUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwGetX11Adapter;
    public final @Nullable MethodHandle HANDLE$glfwGetX11Display;
    public final @Nullable MethodHandle HANDLE$glfwGetX11Monitor;
    public final @Nullable MethodHandle HANDLE$glfwGetX11SelectionString;
    public final @Nullable MethodHandle HANDLE$glfwGetX11Window;
    public final @Nullable MethodHandle HANDLE$glfwHideWindow;
    public final @Nullable MethodHandle HANDLE$glfwIconifyWindow;
    public final @Nullable MethodHandle HANDLE$glfwInit;
    public final @Nullable MethodHandle HANDLE$glfwInitAllocator;
    public final @Nullable MethodHandle HANDLE$glfwInitHint;
    public final @Nullable MethodHandle HANDLE$glfwInitVulkanLoader;
    public final @Nullable MethodHandle HANDLE$glfwJoystickIsGamepad;
    public final @Nullable MethodHandle HANDLE$glfwJoystickPresent;
    public final @Nullable MethodHandle HANDLE$glfwMakeContextCurrent;
    public final @Nullable MethodHandle HANDLE$glfwMaximizeWindow;
    public final @Nullable MethodHandle HANDLE$glfwPlatformSupported;
    public final @Nullable MethodHandle HANDLE$glfwPollEvents;
    public final @Nullable MethodHandle HANDLE$glfwPostEmptyEvent;
    public final @Nullable MethodHandle HANDLE$glfwRawMouseMotionSupported;
    public final @Nullable MethodHandle HANDLE$glfwRequestWindowAttention;
    public final @Nullable MethodHandle HANDLE$glfwRestoreWindow;
    public final @Nullable MethodHandle HANDLE$glfwSetCharCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetCharModsCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetClipboardString;
    public final @Nullable MethodHandle HANDLE$glfwSetCursor;
    public final @Nullable MethodHandle HANDLE$glfwSetCursorEnterCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetCursorPos;
    public final @Nullable MethodHandle HANDLE$glfwSetCursorPosCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetDropCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetErrorCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetFramebufferSizeCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetGamma;
    public final @Nullable MethodHandle HANDLE$glfwSetGammaRamp;
    public final @Nullable MethodHandle HANDLE$glfwSetInputMode;
    public final @Nullable MethodHandle HANDLE$glfwSetJoystickCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetJoystickUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwSetKeyCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetMonitorCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetMonitorUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwSetMouseButtonCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetScrollCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetTime;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowAspectRatio;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowAttrib;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowCloseCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowContentScaleCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowFocusCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowIcon;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowIconifyCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowMaximizeCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowMonitor;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowOpacity;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowPos;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowPosCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowRefreshCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowShouldClose;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowSize;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowSizeCallback;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowSizeLimits;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowTitle;
    public final @Nullable MethodHandle HANDLE$glfwSetWindowUserPointer;
    public final @Nullable MethodHandle HANDLE$glfwSetX11SelectionString;
    public final @Nullable MethodHandle HANDLE$glfwShowWindow;
    public final @Nullable MethodHandle HANDLE$glfwSwapBuffers;
    public final @Nullable MethodHandle HANDLE$glfwSwapInterval;
    public final @Nullable MethodHandle HANDLE$glfwTerminate;
    public final @Nullable MethodHandle HANDLE$glfwUpdateGamepadMappings;
    public final @Nullable MethodHandle HANDLE$glfwVulkanSupported;
    public final @Nullable MethodHandle HANDLE$glfwWaitEvents;
    public final @Nullable MethodHandle HANDLE$glfwWaitEventsTimeout;
    public final @Nullable MethodHandle HANDLE$glfwWindowHint;
    public final @Nullable MethodHandle HANDLE$glfwWindowHintString;
    public final @Nullable MethodHandle HANDLE$glfwWindowShouldClose;
    // endregion

    public static final class Descriptors {
        public static final FunctionDescriptor DESCRIPTOR$glfwCreateCursor = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(GLFWimage.LAYOUT),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwCreateStandardCursor = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwCreateWindow = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwCreateWindowSurface = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwDefaultWindowHints = FunctionDescriptor.ofVoid(
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwDestroyCursor = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwDestroyWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwExtensionSupported = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwFocusWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetClipboardString = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetCocoaMonitor = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetCocoaView = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetCocoaWindow = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetCurrentContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetCursorPos = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_DOUBLE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetEGLContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetEGLDisplay = FunctionDescriptor.of(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetEGLSurface = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetError = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE))
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetFramebufferSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetGLXContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetGLXWindow = FunctionDescriptor.of(
            NativeLayout.C_LONG,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetGamepadName = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetGamepadState = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(GLFWgamepadstate.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetGammaRamp = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(GLFWgammaramp.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetInputMode = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetInstanceProcAddress = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickAxes = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickButtons = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickGUID = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickHats = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickName = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetJoystickUserPointer = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetKey = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetKeyName = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetKeyScancode = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorContentScale = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorName = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorPhysicalSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorPos = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorUserPointer = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitorWorkarea = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetMonitors = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetMouseButton = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetNSGLContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetOSMesaColorBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetOSMesaContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetOSMesaDepthBuffer = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetPhysicalDevicePresentationSupport = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetPlatform = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetPrimaryMonitor = FunctionDescriptor.of(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetProcAddress = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetRequiredInstanceExtensions = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetTime = FunctionDescriptor.of(
            ValueLayout.JAVA_DOUBLE
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetTimerFrequency = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetTimerValue = FunctionDescriptor.of(
            ValueLayout.JAVA_LONG
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetVersion = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetVersionString = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetVideoMode = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(GLFWvidmode.LAYOUT),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetVideoModes = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(GLFWvidmode.LAYOUT),
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWGLContext = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWaylandDisplay = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWaylandMonitor = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWaylandWindow = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWin32Adapter = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWin32Monitor = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWin32Window = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowAttrib = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowContentScale = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowFrameSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowMonitor = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowOpacity = FunctionDescriptor.of(
            ValueLayout.JAVA_FLOAT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowPos = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowTitle = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetWindowUserPointer = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetX11Adapter = FunctionDescriptor.of(
            NativeLayout.C_LONG,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetX11Display = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetX11Monitor = FunctionDescriptor.of(
            NativeLayout.C_LONG,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetX11SelectionString = FunctionDescriptor.of(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwGetX11Window = FunctionDescriptor.of(
            NativeLayout.C_LONG,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwHideWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwIconifyWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwInit = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwInitAllocator = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(GLFWallocator.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwInitHint = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwInitVulkanLoader = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwJoystickIsGamepad = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwJoystickPresent = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwMakeContextCurrent = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwMaximizeWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwPlatformSupported = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwPollEvents = FunctionDescriptor.ofVoid(
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwPostEmptyEvent = FunctionDescriptor.ofVoid(
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwRawMouseMotionSupported = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwRequestWindowAttention = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwRestoreWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetCharCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetCharModsCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetClipboardString = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetCursor = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetCursorEnterCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetCursorPos = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_DOUBLE,
            ValueLayout.JAVA_DOUBLE
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetCursorPosCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetDropCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetErrorCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetFramebufferSizeCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetGamma = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetGammaRamp = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(GLFWgammaramp.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetInputMode = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetJoystickCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetJoystickUserPointer = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetKeyCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetMonitorCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetMonitorUserPointer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetMouseButtonCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetScrollCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetTime = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_DOUBLE
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowAspectRatio = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowAttrib = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowCloseCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowContentScaleCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowFocusCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowIcon = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(GLFWimage.LAYOUT)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowIconifyCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowMaximizeCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowMonitor = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowOpacity = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_FLOAT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowPos = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowPosCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowRefreshCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowShouldClose = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowSize = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowSizeCallback = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowSizeLimits = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowTitle = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetWindowUserPointer = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSetX11SelectionString = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwShowWindow = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSwapBuffers = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwSwapInterval = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwTerminate = FunctionDescriptor.ofVoid(
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwUpdateGamepadMappings = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwVulkanSupported = FunctionDescriptor.of(
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwWaitEvents = FunctionDescriptor.ofVoid(
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwWaitEventsTimeout = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_DOUBLE
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwWindowHint = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwWindowHintString = FunctionDescriptor.ofVoid(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
        );

        public static final FunctionDescriptor DESCRIPTOR$glfwWindowShouldClose = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
        );

        /// Constructing this class is nonsense so the constructor is made private.
        private Descriptors() {}
    }
}
