package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.util.Function2;

public final class InstanceCommands {
    public static final FunctionDescriptor DESCRIPTOR$vkDestroyInstance = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkEnumeratePhysicalDevices = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceQueueFamilyProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkQueueFamilyProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceMemoryProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceMemoryProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceFeatures = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceFeatures.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceFormatProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkFormatProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceImageFormatProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkImageFormatProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateDevice = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDeviceCreateInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkEnumerateDeviceLayerProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkLayerProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkEnumerateDeviceExtensionProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkExtensionProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSparseImageFormatProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkSparseImageFormatProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateAndroidSurfaceKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAndroidSurfaceCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceDisplayPropertiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayPropertiesKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceDisplayPlanePropertiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayPlanePropertiesKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDisplayPlaneSupportedDisplaysKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDisplayModePropertiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayModePropertiesKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateDisplayModeKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayModeCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDisplayPlaneCapabilitiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayPlaneCapabilitiesKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateDisplayPlaneSurfaceKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDisplaySurfaceCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroySurfaceKHR = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSurfaceSupportKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSurfaceCapabilitiesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSurfaceCapabilitiesKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSurfaceFormatsKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkSurfaceFormatKHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSurfacePresentModesKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateViSurfaceNN = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkViSurfaceCreateInfoNN.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateWaylandSurfaceKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkWaylandSurfaceCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceWaylandPresentationSupportKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateWin32SurfaceKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkWin32SurfaceCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceWin32PresentationSupportKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateXlibSurfaceKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkXlibSurfaceCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceXlibPresentationSupportKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            NativeLayout.C_LONG
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateXcbSurfaceKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkXcbSurfaceCreateInfoKHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceXcbPresentationSupportKHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateDirectFBSurfaceEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDirectFBSurfaceCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceDirectFBPresentationSupportEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateImagePipeSurfaceFUCHSIA = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkImagePipeSurfaceCreateInfoFUCHSIA.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateStreamDescriptorSurfaceGGP = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkStreamDescriptorSurfaceCreateInfoGGP.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateScreenSurfaceQNX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkScreenSurfaceCreateInfoQNX.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceScreenPresentationSupportQNX = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateDebugReportCallbackEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugReportCallbackCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyDebugReportCallbackEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDebugReportMessageEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_LONG,
            NativeLayout.C_SIZE_T,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceExternalImageFormatPropertiesNV = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkExternalImageFormatPropertiesNV.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceFeatures2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceFeatures2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceProperties2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceProperties2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceFormatProperties2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkFormatProperties2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceImageFormatProperties2 = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceImageFormatInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkImageFormatProperties2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceQueueFamilyProperties2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkQueueFamilyProperties2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceMemoryProperties2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceMemoryProperties2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSparseImageFormatProperties2 = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceSparseImageFormatInfo2.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkSparseImageFormatProperties2.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceExternalBufferProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceExternalBufferInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkExternalBufferProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceExternalSemaphoreProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceExternalSemaphoreInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkExternalSemaphoreProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceExternalFenceProperties = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceExternalFenceInfo.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkExternalFenceProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkReleaseDisplayEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAcquireXlibDisplayEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetRandROutputDisplayEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS),
            NativeLayout.C_LONG,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSurfaceCapabilities2EXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkSurfaceCapabilities2EXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkEnumeratePhysicalDeviceGroups = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceGroupProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateIOSSurfaceMVK = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkIOSSurfaceCreateInfoMVK.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateMacOSSurfaceMVK = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMacOSSurfaceCreateInfoMVK.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateMetalSurfaceEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkMetalSurfaceCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSurfaceCapabilities2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceSurfaceInfo2KHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkSurfaceCapabilities2KHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceSurfaceFormats2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceSurfaceInfo2KHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkSurfaceFormat2KHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceDisplayProperties2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayProperties2KHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceDisplayPlaneProperties2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayPlaneProperties2KHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDisplayModeProperties2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayModeProperties2KHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDisplayPlaneCapabilities2KHR = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayPlaneInfo2KHR.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkDisplayPlaneCapabilities2KHR.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSetDebugUtilsObjectNameEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsObjectNameInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSetDebugUtilsObjectTagEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsObjectTagInfoEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkQueueBeginDebugUtilsLabelEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsLabelEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkQueueEndDebugUtilsLabelEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkQueueInsertDebugUtilsLabelEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsLabelEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdBeginDebugUtilsLabelEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsLabelEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdEndDebugUtilsLabelEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCmdInsertDebugUtilsLabelEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsLabelEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateDebugUtilsMessengerEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsMessengerCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkDestroyDebugUtilsMessengerEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkSubmitDebugUtilsMessageEXT = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsMessengerCallbackDataEXT.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkCreateHeadlessSurfaceEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(VkHeadlessSurfaceCreateInfoEXT.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT),
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetPhysicalDeviceToolProperties = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT),
            ValueLayout.ADDRESS.withTargetLayout(VkPhysicalDeviceToolProperties.LAYOUT)
    );

    public static final FunctionDescriptor DESCRIPTOR$vkAcquireDrmDisplayEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS
    );

    public static final FunctionDescriptor DESCRIPTOR$vkGetDrmDisplayEXT = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS)
    );

    public final @nullable MethodHandle HANDLE$vkDestroyInstance;
    public final @nullable MethodHandle HANDLE$vkEnumeratePhysicalDevices;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceProperties;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceQueueFamilyProperties;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceMemoryProperties;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceFeatures;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceFormatProperties;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceImageFormatProperties;
    public final @nullable MethodHandle HANDLE$vkCreateDevice;
    public final @nullable MethodHandle HANDLE$vkEnumerateDeviceLayerProperties;
    public final @nullable MethodHandle HANDLE$vkEnumerateDeviceExtensionProperties;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties;
    public final @nullable MethodHandle HANDLE$vkCreateAndroidSurfaceKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceDisplayPropertiesKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
    public final @nullable MethodHandle HANDLE$vkGetDisplayPlaneSupportedDisplaysKHR;
    public final @nullable MethodHandle HANDLE$vkGetDisplayModePropertiesKHR;
    public final @nullable MethodHandle HANDLE$vkCreateDisplayModeKHR;
    public final @nullable MethodHandle HANDLE$vkGetDisplayPlaneCapabilitiesKHR;
    public final @nullable MethodHandle HANDLE$vkCreateDisplayPlaneSurfaceKHR;
    public final @nullable MethodHandle HANDLE$vkDestroySurfaceKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceSupportKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceCapabilitiesKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceFormatsKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfacePresentModesKHR;
    public final @nullable MethodHandle HANDLE$vkCreateViSurfaceNN;
    public final @nullable MethodHandle HANDLE$vkCreateWaylandSurfaceKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceWaylandPresentationSupportKHR;
    public final @nullable MethodHandle HANDLE$vkCreateWin32SurfaceKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceWin32PresentationSupportKHR;
    public final @nullable MethodHandle HANDLE$vkCreateXlibSurfaceKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceXlibPresentationSupportKHR;
    public final @nullable MethodHandle HANDLE$vkCreateXcbSurfaceKHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceXcbPresentationSupportKHR;
    public final @nullable MethodHandle HANDLE$vkCreateDirectFBSurfaceEXT;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceDirectFBPresentationSupportEXT;
    public final @nullable MethodHandle HANDLE$vkCreateImagePipeSurfaceFUCHSIA;
    public final @nullable MethodHandle HANDLE$vkCreateStreamDescriptorSurfaceGGP;
    public final @nullable MethodHandle HANDLE$vkCreateScreenSurfaceQNX;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceScreenPresentationSupportQNX;
    public final @nullable MethodHandle HANDLE$vkCreateDebugReportCallbackEXT;
    public final @nullable MethodHandle HANDLE$vkDestroyDebugReportCallbackEXT;
    public final @nullable MethodHandle HANDLE$vkDebugReportMessageEXT;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceExternalImageFormatPropertiesNV;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceFeatures2;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceProperties2;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceFormatProperties2;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceImageFormatProperties2;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceQueueFamilyProperties2;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceMemoryProperties2;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties2;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceExternalBufferProperties;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceExternalSemaphoreProperties;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceExternalFenceProperties;
    public final @nullable MethodHandle HANDLE$vkReleaseDisplayEXT;
    public final @nullable MethodHandle HANDLE$vkAcquireXlibDisplayEXT;
    public final @nullable MethodHandle HANDLE$vkGetRandROutputDisplayEXT;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2EXT;
    public final @nullable MethodHandle HANDLE$vkEnumeratePhysicalDeviceGroups;
    public final @nullable MethodHandle HANDLE$vkCreateIOSSurfaceMVK;
    public final @nullable MethodHandle HANDLE$vkCreateMacOSSurfaceMVK;
    public final @nullable MethodHandle HANDLE$vkCreateMetalSurfaceEXT;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2KHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceFormats2KHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceDisplayProperties2KHR;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
    public final @nullable MethodHandle HANDLE$vkGetDisplayModeProperties2KHR;
    public final @nullable MethodHandle HANDLE$vkGetDisplayPlaneCapabilities2KHR;
    public final @nullable MethodHandle HANDLE$vkSetDebugUtilsObjectNameEXT;
    public final @nullable MethodHandle HANDLE$vkSetDebugUtilsObjectTagEXT;
    public final @nullable MethodHandle HANDLE$vkQueueBeginDebugUtilsLabelEXT;
    public final @nullable MethodHandle HANDLE$vkQueueEndDebugUtilsLabelEXT;
    public final @nullable MethodHandle HANDLE$vkQueueInsertDebugUtilsLabelEXT;
    public final @nullable MethodHandle HANDLE$vkCmdBeginDebugUtilsLabelEXT;
    public final @nullable MethodHandle HANDLE$vkCmdEndDebugUtilsLabelEXT;
    public final @nullable MethodHandle HANDLE$vkCmdInsertDebugUtilsLabelEXT;
    public final @nullable MethodHandle HANDLE$vkCreateDebugUtilsMessengerEXT;
    public final @nullable MethodHandle HANDLE$vkDestroyDebugUtilsMessengerEXT;
    public final @nullable MethodHandle HANDLE$vkSubmitDebugUtilsMessageEXT;
    public final @nullable MethodHandle HANDLE$vkCreateHeadlessSurfaceEXT;
    public final @nullable MethodHandle HANDLE$vkGetPhysicalDeviceToolProperties;
    public final @nullable MethodHandle HANDLE$vkAcquireDrmDisplayEXT;
    public final @nullable MethodHandle HANDLE$vkGetDrmDisplayEXT;

    public InstanceCommands(Function2<String, FunctionDescriptor, MethodHandle> loader) {
        HANDLE$vkDestroyInstance = loader.apply("vkDestroyInstance", DESCRIPTOR$vkDestroyInstance);
        HANDLE$vkEnumeratePhysicalDevices = loader.apply("vkEnumeratePhysicalDevices", DESCRIPTOR$vkEnumeratePhysicalDevices);
        HANDLE$vkGetPhysicalDeviceProperties = loader.apply("vkGetPhysicalDeviceProperties", DESCRIPTOR$vkGetPhysicalDeviceProperties);
        HANDLE$vkGetPhysicalDeviceQueueFamilyProperties = loader.apply("vkGetPhysicalDeviceQueueFamilyProperties", DESCRIPTOR$vkGetPhysicalDeviceQueueFamilyProperties);
        HANDLE$vkGetPhysicalDeviceMemoryProperties = loader.apply("vkGetPhysicalDeviceMemoryProperties", DESCRIPTOR$vkGetPhysicalDeviceMemoryProperties);
        HANDLE$vkGetPhysicalDeviceFeatures = loader.apply("vkGetPhysicalDeviceFeatures", DESCRIPTOR$vkGetPhysicalDeviceFeatures);
        HANDLE$vkGetPhysicalDeviceFormatProperties = loader.apply("vkGetPhysicalDeviceFormatProperties", DESCRIPTOR$vkGetPhysicalDeviceFormatProperties);
        HANDLE$vkGetPhysicalDeviceImageFormatProperties = loader.apply("vkGetPhysicalDeviceImageFormatProperties", DESCRIPTOR$vkGetPhysicalDeviceImageFormatProperties);
        HANDLE$vkCreateDevice = loader.apply("vkCreateDevice", DESCRIPTOR$vkCreateDevice);
        HANDLE$vkEnumerateDeviceLayerProperties = loader.apply("vkEnumerateDeviceLayerProperties", DESCRIPTOR$vkEnumerateDeviceLayerProperties);
        HANDLE$vkEnumerateDeviceExtensionProperties = loader.apply("vkEnumerateDeviceExtensionProperties", DESCRIPTOR$vkEnumerateDeviceExtensionProperties);
        HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties = loader.apply("vkGetPhysicalDeviceSparseImageFormatProperties", DESCRIPTOR$vkGetPhysicalDeviceSparseImageFormatProperties);
        HANDLE$vkCreateAndroidSurfaceKHR = loader.apply("vkCreateAndroidSurfaceKHR", DESCRIPTOR$vkCreateAndroidSurfaceKHR);
        HANDLE$vkGetPhysicalDeviceDisplayPropertiesKHR = loader.apply("vkGetPhysicalDeviceDisplayPropertiesKHR", DESCRIPTOR$vkGetPhysicalDeviceDisplayPropertiesKHR);
        HANDLE$vkGetPhysicalDeviceDisplayPlanePropertiesKHR = loader.apply("vkGetPhysicalDeviceDisplayPlanePropertiesKHR", DESCRIPTOR$vkGetPhysicalDeviceDisplayPlanePropertiesKHR);
        HANDLE$vkGetDisplayPlaneSupportedDisplaysKHR = loader.apply("vkGetDisplayPlaneSupportedDisplaysKHR", DESCRIPTOR$vkGetDisplayPlaneSupportedDisplaysKHR);
        HANDLE$vkGetDisplayModePropertiesKHR = loader.apply("vkGetDisplayModePropertiesKHR", DESCRIPTOR$vkGetDisplayModePropertiesKHR);
        HANDLE$vkCreateDisplayModeKHR = loader.apply("vkCreateDisplayModeKHR", DESCRIPTOR$vkCreateDisplayModeKHR);
        HANDLE$vkGetDisplayPlaneCapabilitiesKHR = loader.apply("vkGetDisplayPlaneCapabilitiesKHR", DESCRIPTOR$vkGetDisplayPlaneCapabilitiesKHR);
        HANDLE$vkCreateDisplayPlaneSurfaceKHR = loader.apply("vkCreateDisplayPlaneSurfaceKHR", DESCRIPTOR$vkCreateDisplayPlaneSurfaceKHR);
        HANDLE$vkDestroySurfaceKHR = loader.apply("vkDestroySurfaceKHR", DESCRIPTOR$vkDestroySurfaceKHR);
        HANDLE$vkGetPhysicalDeviceSurfaceSupportKHR = loader.apply("vkGetPhysicalDeviceSurfaceSupportKHR", DESCRIPTOR$vkGetPhysicalDeviceSurfaceSupportKHR);
        HANDLE$vkGetPhysicalDeviceSurfaceCapabilitiesKHR = loader.apply("vkGetPhysicalDeviceSurfaceCapabilitiesKHR", DESCRIPTOR$vkGetPhysicalDeviceSurfaceCapabilitiesKHR);
        HANDLE$vkGetPhysicalDeviceSurfaceFormatsKHR = loader.apply("vkGetPhysicalDeviceSurfaceFormatsKHR", DESCRIPTOR$vkGetPhysicalDeviceSurfaceFormatsKHR);
        HANDLE$vkGetPhysicalDeviceSurfacePresentModesKHR = loader.apply("vkGetPhysicalDeviceSurfacePresentModesKHR", DESCRIPTOR$vkGetPhysicalDeviceSurfacePresentModesKHR);
        HANDLE$vkCreateViSurfaceNN = loader.apply("vkCreateViSurfaceNN", DESCRIPTOR$vkCreateViSurfaceNN);
        HANDLE$vkCreateWaylandSurfaceKHR = loader.apply("vkCreateWaylandSurfaceKHR", DESCRIPTOR$vkCreateWaylandSurfaceKHR);
        HANDLE$vkGetPhysicalDeviceWaylandPresentationSupportKHR = loader.apply("vkGetPhysicalDeviceWaylandPresentationSupportKHR", DESCRIPTOR$vkGetPhysicalDeviceWaylandPresentationSupportKHR);
        HANDLE$vkCreateWin32SurfaceKHR = loader.apply("vkCreateWin32SurfaceKHR", DESCRIPTOR$vkCreateWin32SurfaceKHR);
        HANDLE$vkGetPhysicalDeviceWin32PresentationSupportKHR = loader.apply("vkGetPhysicalDeviceWin32PresentationSupportKHR", DESCRIPTOR$vkGetPhysicalDeviceWin32PresentationSupportKHR);
        HANDLE$vkCreateXlibSurfaceKHR = loader.apply("vkCreateXlibSurfaceKHR", DESCRIPTOR$vkCreateXlibSurfaceKHR);
        HANDLE$vkGetPhysicalDeviceXlibPresentationSupportKHR = loader.apply("vkGetPhysicalDeviceXlibPresentationSupportKHR", DESCRIPTOR$vkGetPhysicalDeviceXlibPresentationSupportKHR);
        HANDLE$vkCreateXcbSurfaceKHR = loader.apply("vkCreateXcbSurfaceKHR", DESCRIPTOR$vkCreateXcbSurfaceKHR);
        HANDLE$vkGetPhysicalDeviceXcbPresentationSupportKHR = loader.apply("vkGetPhysicalDeviceXcbPresentationSupportKHR", DESCRIPTOR$vkGetPhysicalDeviceXcbPresentationSupportKHR);
        HANDLE$vkCreateDirectFBSurfaceEXT = loader.apply("vkCreateDirectFBSurfaceEXT", DESCRIPTOR$vkCreateDirectFBSurfaceEXT);
        HANDLE$vkGetPhysicalDeviceDirectFBPresentationSupportEXT = loader.apply("vkGetPhysicalDeviceDirectFBPresentationSupportEXT", DESCRIPTOR$vkGetPhysicalDeviceDirectFBPresentationSupportEXT);
        HANDLE$vkCreateImagePipeSurfaceFUCHSIA = loader.apply("vkCreateImagePipeSurfaceFUCHSIA", DESCRIPTOR$vkCreateImagePipeSurfaceFUCHSIA);
        HANDLE$vkCreateStreamDescriptorSurfaceGGP = loader.apply("vkCreateStreamDescriptorSurfaceGGP", DESCRIPTOR$vkCreateStreamDescriptorSurfaceGGP);
        HANDLE$vkCreateScreenSurfaceQNX = loader.apply("vkCreateScreenSurfaceQNX", DESCRIPTOR$vkCreateScreenSurfaceQNX);
        HANDLE$vkGetPhysicalDeviceScreenPresentationSupportQNX = loader.apply("vkGetPhysicalDeviceScreenPresentationSupportQNX", DESCRIPTOR$vkGetPhysicalDeviceScreenPresentationSupportQNX);
        HANDLE$vkCreateDebugReportCallbackEXT = loader.apply("vkCreateDebugReportCallbackEXT", DESCRIPTOR$vkCreateDebugReportCallbackEXT);
        HANDLE$vkDestroyDebugReportCallbackEXT = loader.apply("vkDestroyDebugReportCallbackEXT", DESCRIPTOR$vkDestroyDebugReportCallbackEXT);
        HANDLE$vkDebugReportMessageEXT = loader.apply("vkDebugReportMessageEXT", DESCRIPTOR$vkDebugReportMessageEXT);
        HANDLE$vkGetPhysicalDeviceExternalImageFormatPropertiesNV = loader.apply("vkGetPhysicalDeviceExternalImageFormatPropertiesNV", DESCRIPTOR$vkGetPhysicalDeviceExternalImageFormatPropertiesNV);
        HANDLE$vkGetPhysicalDeviceFeatures2 = loader.apply("vkGetPhysicalDeviceFeatures2", DESCRIPTOR$vkGetPhysicalDeviceFeatures2);
        HANDLE$vkGetPhysicalDeviceProperties2 = loader.apply("vkGetPhysicalDeviceProperties2", DESCRIPTOR$vkGetPhysicalDeviceProperties2);
        HANDLE$vkGetPhysicalDeviceFormatProperties2 = loader.apply("vkGetPhysicalDeviceFormatProperties2", DESCRIPTOR$vkGetPhysicalDeviceFormatProperties2);
        HANDLE$vkGetPhysicalDeviceImageFormatProperties2 = loader.apply("vkGetPhysicalDeviceImageFormatProperties2", DESCRIPTOR$vkGetPhysicalDeviceImageFormatProperties2);
        HANDLE$vkGetPhysicalDeviceQueueFamilyProperties2 = loader.apply("vkGetPhysicalDeviceQueueFamilyProperties2", DESCRIPTOR$vkGetPhysicalDeviceQueueFamilyProperties2);
        HANDLE$vkGetPhysicalDeviceMemoryProperties2 = loader.apply("vkGetPhysicalDeviceMemoryProperties2", DESCRIPTOR$vkGetPhysicalDeviceMemoryProperties2);
        HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties2 = loader.apply("vkGetPhysicalDeviceSparseImageFormatProperties2", DESCRIPTOR$vkGetPhysicalDeviceSparseImageFormatProperties2);
        HANDLE$vkGetPhysicalDeviceExternalBufferProperties = loader.apply("vkGetPhysicalDeviceExternalBufferProperties", DESCRIPTOR$vkGetPhysicalDeviceExternalBufferProperties);
        HANDLE$vkGetPhysicalDeviceExternalSemaphoreProperties = loader.apply("vkGetPhysicalDeviceExternalSemaphoreProperties", DESCRIPTOR$vkGetPhysicalDeviceExternalSemaphoreProperties);
        HANDLE$vkGetPhysicalDeviceExternalFenceProperties = loader.apply("vkGetPhysicalDeviceExternalFenceProperties", DESCRIPTOR$vkGetPhysicalDeviceExternalFenceProperties);
        HANDLE$vkReleaseDisplayEXT = loader.apply("vkReleaseDisplayEXT", DESCRIPTOR$vkReleaseDisplayEXT);
        HANDLE$vkAcquireXlibDisplayEXT = loader.apply("vkAcquireXlibDisplayEXT", DESCRIPTOR$vkAcquireXlibDisplayEXT);
        HANDLE$vkGetRandROutputDisplayEXT = loader.apply("vkGetRandROutputDisplayEXT", DESCRIPTOR$vkGetRandROutputDisplayEXT);
        HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2EXT = loader.apply("vkGetPhysicalDeviceSurfaceCapabilities2EXT", DESCRIPTOR$vkGetPhysicalDeviceSurfaceCapabilities2EXT);
        HANDLE$vkEnumeratePhysicalDeviceGroups = loader.apply("vkEnumeratePhysicalDeviceGroups", DESCRIPTOR$vkEnumeratePhysicalDeviceGroups);
        HANDLE$vkCreateIOSSurfaceMVK = loader.apply("vkCreateIOSSurfaceMVK", DESCRIPTOR$vkCreateIOSSurfaceMVK);
        HANDLE$vkCreateMacOSSurfaceMVK = loader.apply("vkCreateMacOSSurfaceMVK", DESCRIPTOR$vkCreateMacOSSurfaceMVK);
        HANDLE$vkCreateMetalSurfaceEXT = loader.apply("vkCreateMetalSurfaceEXT", DESCRIPTOR$vkCreateMetalSurfaceEXT);
        HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2KHR = loader.apply("vkGetPhysicalDeviceSurfaceCapabilities2KHR", DESCRIPTOR$vkGetPhysicalDeviceSurfaceCapabilities2KHR);
        HANDLE$vkGetPhysicalDeviceSurfaceFormats2KHR = loader.apply("vkGetPhysicalDeviceSurfaceFormats2KHR", DESCRIPTOR$vkGetPhysicalDeviceSurfaceFormats2KHR);
        HANDLE$vkGetPhysicalDeviceDisplayProperties2KHR = loader.apply("vkGetPhysicalDeviceDisplayProperties2KHR", DESCRIPTOR$vkGetPhysicalDeviceDisplayProperties2KHR);
        HANDLE$vkGetPhysicalDeviceDisplayPlaneProperties2KHR = loader.apply("vkGetPhysicalDeviceDisplayPlaneProperties2KHR", DESCRIPTOR$vkGetPhysicalDeviceDisplayPlaneProperties2KHR);
        HANDLE$vkGetDisplayModeProperties2KHR = loader.apply("vkGetDisplayModeProperties2KHR", DESCRIPTOR$vkGetDisplayModeProperties2KHR);
        HANDLE$vkGetDisplayPlaneCapabilities2KHR = loader.apply("vkGetDisplayPlaneCapabilities2KHR", DESCRIPTOR$vkGetDisplayPlaneCapabilities2KHR);
        HANDLE$vkSetDebugUtilsObjectNameEXT = loader.apply("vkSetDebugUtilsObjectNameEXT", DESCRIPTOR$vkSetDebugUtilsObjectNameEXT);
        HANDLE$vkSetDebugUtilsObjectTagEXT = loader.apply("vkSetDebugUtilsObjectTagEXT", DESCRIPTOR$vkSetDebugUtilsObjectTagEXT);
        HANDLE$vkQueueBeginDebugUtilsLabelEXT = loader.apply("vkQueueBeginDebugUtilsLabelEXT", DESCRIPTOR$vkQueueBeginDebugUtilsLabelEXT);
        HANDLE$vkQueueEndDebugUtilsLabelEXT = loader.apply("vkQueueEndDebugUtilsLabelEXT", DESCRIPTOR$vkQueueEndDebugUtilsLabelEXT);
        HANDLE$vkQueueInsertDebugUtilsLabelEXT = loader.apply("vkQueueInsertDebugUtilsLabelEXT", DESCRIPTOR$vkQueueInsertDebugUtilsLabelEXT);
        HANDLE$vkCmdBeginDebugUtilsLabelEXT = loader.apply("vkCmdBeginDebugUtilsLabelEXT", DESCRIPTOR$vkCmdBeginDebugUtilsLabelEXT);
        HANDLE$vkCmdEndDebugUtilsLabelEXT = loader.apply("vkCmdEndDebugUtilsLabelEXT", DESCRIPTOR$vkCmdEndDebugUtilsLabelEXT);
        HANDLE$vkCmdInsertDebugUtilsLabelEXT = loader.apply("vkCmdInsertDebugUtilsLabelEXT", DESCRIPTOR$vkCmdInsertDebugUtilsLabelEXT);
        HANDLE$vkCreateDebugUtilsMessengerEXT = loader.apply("vkCreateDebugUtilsMessengerEXT", DESCRIPTOR$vkCreateDebugUtilsMessengerEXT);
        HANDLE$vkDestroyDebugUtilsMessengerEXT = loader.apply("vkDestroyDebugUtilsMessengerEXT", DESCRIPTOR$vkDestroyDebugUtilsMessengerEXT);
        HANDLE$vkSubmitDebugUtilsMessageEXT = loader.apply("vkSubmitDebugUtilsMessageEXT", DESCRIPTOR$vkSubmitDebugUtilsMessageEXT);
        HANDLE$vkCreateHeadlessSurfaceEXT = loader.apply("vkCreateHeadlessSurfaceEXT", DESCRIPTOR$vkCreateHeadlessSurfaceEXT);
        HANDLE$vkGetPhysicalDeviceToolProperties = loader.apply("vkGetPhysicalDeviceToolProperties", DESCRIPTOR$vkGetPhysicalDeviceToolProperties);
        HANDLE$vkAcquireDrmDisplayEXT = loader.apply("vkAcquireDrmDisplayEXT", DESCRIPTOR$vkAcquireDrmDisplayEXT);
        HANDLE$vkGetDrmDisplayEXT = loader.apply("vkGetDrmDisplayEXT", DESCRIPTOR$vkGetDrmDisplayEXT);
    }

    public void vkDestroyInstance(
            @nullable VkInstance instance,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyInstance.invoke(
                    instance != null ? instance.handle() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumeratePhysicalDevices(
            VkInstance instance,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPhysicalDeviceCount,
            @nullable @pointer(target=VkPhysicalDevice.class) VkPhysicalDevice pPhysicalDevices
    ) {
        try {
            // TODO: temporarily modified for benchmarking and profiling purpose
            MemorySegment s = pPhysicalDevices != null ? pPhysicalDevices.segment() : MemorySegment.NULL;
            return (int) HANDLE$vkEnumeratePhysicalDevices.invokeExact(instance.handle(), pPhysicalDeviceCount.segment(), s);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceProperties.class) VkPhysicalDeviceProperties pProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceProperties.invoke(
                    physicalDevice.handle(),
                    pProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceQueueFamilyProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pQueueFamilyPropertyCount,
            @nullable @pointer(target=VkQueueFamilyProperties.class) VkQueueFamilyProperties pQueueFamilyProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceQueueFamilyProperties.invoke(
                    physicalDevice.handle(),
                    pQueueFamilyPropertyCount.segment(),
                    pQueueFamilyProperties != null ? pQueueFamilyProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceMemoryProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceMemoryProperties.class) VkPhysicalDeviceMemoryProperties pMemoryProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceMemoryProperties.invoke(
                    physicalDevice.handle(),
                    pMemoryProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceFeatures(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceFeatures.class) VkPhysicalDeviceFeatures pFeatures
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceFeatures.invoke(
                    physicalDevice.handle(),
                    pFeatures.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceFormatProperties(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkFormat.class) int format,
            @pointer(target=VkFormatProperties.class) VkFormatProperties pFormatProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceFormatProperties.invoke(
                    physicalDevice.handle(),
                    format,
                    pFormatProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceImageFormatProperties(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkFormat.class) int format,
            @enumtype(VkImageType.class) int type,
            @enumtype(VkImageTiling.class) int tiling,
            @enumtype(VkImageUsageFlags.class) int usage,
            @enumtype(VkImageCreateFlags.class) int flags,
            @pointer(target=VkImageFormatProperties.class) VkImageFormatProperties pImageFormatProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceImageFormatProperties.invoke(
                    physicalDevice.handle(),
                    format,
                    type,
                    tiling,
                    usage,
                    flags,
                    pImageFormatProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDevice(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkDeviceCreateInfo.class) VkDeviceCreateInfo pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDevice.class) VkDevice pDevice
    ) {
        try {
            return (int) HANDLE$vkCreateDevice.invoke(
                    physicalDevice.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pDevice.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumerateDeviceLayerProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @nullable @pointer(target=VkLayerProperties.class) VkLayerProperties pProperties
    ) {
        try {
            return (int) HANDLE$vkEnumerateDeviceLayerProperties.invoke(
                    physicalDevice.handle(),
                    pPropertyCount.segment(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumerateDeviceExtensionProperties(
            VkPhysicalDevice physicalDevice,
            @nullable @pointer(target=BytePtr.class) BytePtr pLayerName,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @nullable @pointer(target=VkExtensionProperties.class) VkExtensionProperties pProperties
    ) {
        try {
            return (int) HANDLE$vkEnumerateDeviceExtensionProperties.invoke(
                    physicalDevice.handle(),
                    pLayerName != null ? pLayerName.segment() : MemorySegment.NULL,
                    pPropertyCount.segment(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceSparseImageFormatProperties(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkFormat.class) int format,
            @enumtype(VkImageType.class) int type,
            @enumtype(VkSampleCountFlags.class) int samples,
            @enumtype(VkImageUsageFlags.class) int usage,
            @enumtype(VkImageTiling.class) int tiling,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @nullable @pointer(target=VkSparseImageFormatProperties.class) VkSparseImageFormatProperties pProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties.invoke(
                    physicalDevice.handle(),
                    format,
                    type,
                    samples,
                    usage,
                    tiling,
                    pPropertyCount.segment(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateAndroidSurfaceKHR(
            VkInstance instance,
            @pointer(target=VkAndroidSurfaceCreateInfoKHR.class) VkAndroidSurfaceCreateInfoKHR pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateAndroidSurfaceKHR.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayPropertiesKHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @nullable @pointer(target=VkDisplayPropertiesKHR.class) VkDisplayPropertiesKHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayPropertiesKHR.invoke(
                    physicalDevice.handle(),
                    pPropertyCount.segment(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @nullable @pointer(target=VkDisplayPlanePropertiesKHR.class) VkDisplayPlanePropertiesKHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayPlanePropertiesKHR.invoke(
                    physicalDevice.handle(),
                    pPropertyCount.segment(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDisplayPlaneSupportedDisplaysKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int planeIndex,
            @pointer(target=IntPtr.class) @unsigned IntPtr pDisplayCount,
            @nullable @pointer(target=VkDisplayKHR.class) VkDisplayKHR pDisplays
    ) {
        try {
            return (int) HANDLE$vkGetDisplayPlaneSupportedDisplaysKHR.invoke(
                    physicalDevice.handle(),
                    planeIndex,
                    pDisplayCount.segment(),
                    pDisplays != null ? pDisplays.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDisplayModePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @nullable @pointer(target=VkDisplayModePropertiesKHR.class) VkDisplayModePropertiesKHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetDisplayModePropertiesKHR.invoke(
                    physicalDevice.handle(),
                    display.handle(),
                    pPropertyCount.segment(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDisplayModeKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            @pointer(target=VkDisplayModeCreateInfoKHR.class) VkDisplayModeCreateInfoKHR pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDisplayModeKHR.class) VkDisplayModeKHR pMode
    ) {
        try {
            return (int) HANDLE$vkCreateDisplayModeKHR.invoke(
                    physicalDevice.handle(),
                    display.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pMode.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDisplayPlaneCapabilitiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayModeKHR mode,
            @unsigned int planeIndex,
            @pointer(target=VkDisplayPlaneCapabilitiesKHR.class) VkDisplayPlaneCapabilitiesKHR pCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetDisplayPlaneCapabilitiesKHR.invoke(
                    physicalDevice.handle(),
                    mode.handle(),
                    planeIndex,
                    pCapabilities.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDisplayPlaneSurfaceKHR(
            VkInstance instance,
            @pointer(target=VkDisplaySurfaceCreateInfoKHR.class) VkDisplaySurfaceCreateInfoKHR pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateDisplayPlaneSurfaceKHR.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroySurfaceKHR(
            VkInstance instance,
            @nullable VkSurfaceKHR surface,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySurfaceKHR.invoke(
                    instance.handle(),
                    surface != null ? surface.handle() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceSupportKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            VkSurfaceKHR surface,
            @pointer(target=IntPtr.class) @unsigned IntPtr pSupported
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceSupportKHR.invoke(
                    physicalDevice.handle(),
                    queueFamilyIndex,
                    surface.handle(),
                    pSupported.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            @pointer(target=VkSurfaceCapabilitiesKHR.class) VkSurfaceCapabilitiesKHR pSurfaceCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceCapabilitiesKHR.invoke(
                    physicalDevice.handle(),
                    surface.handle(),
                    pSurfaceCapabilities.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceFormatsKHR(
            VkPhysicalDevice physicalDevice,
            @nullable VkSurfaceKHR surface,
            @pointer(target=IntPtr.class) @unsigned IntPtr pSurfaceFormatCount,
            @nullable @pointer(target=VkSurfaceFormatKHR.class) VkSurfaceFormatKHR pSurfaceFormats
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceFormatsKHR.invoke(
                    physicalDevice.handle(),
                    surface != null ? surface.handle() : MemorySegment.NULL,
                    pSurfaceFormatCount.segment(),
                    pSurfaceFormats != null ? pSurfaceFormats.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfacePresentModesKHR(
            VkPhysicalDevice physicalDevice,
            @nullable VkSurfaceKHR surface,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPresentModeCount,
            @pointer(comment="enum VkPresentModeKHR*") MemorySegment pPresentModes
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfacePresentModesKHR.invoke(
                    physicalDevice.handle(),
                    surface != null ? surface.handle() : MemorySegment.NULL,
                    pPresentModeCount.segment(),
                    pPresentModes
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateViSurfaceNN(
            VkInstance instance,
            @pointer(target=VkViSurfaceCreateInfoNN.class) VkViSurfaceCreateInfoNN pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateViSurfaceNN.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateWaylandSurfaceKHR(
            VkInstance instance,
            @pointer(target=VkWaylandSurfaceCreateInfoKHR.class) VkWaylandSurfaceCreateInfoKHR pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateWaylandSurfaceKHR.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceWaylandPresentationSupportKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @pointer(comment="void*") MemorySegment display
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceWaylandPresentationSupportKHR.invoke(
                    physicalDevice.handle(),
                    queueFamilyIndex,
                    display
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateWin32SurfaceKHR(
            VkInstance instance,
            @pointer(target=VkWin32SurfaceCreateInfoKHR.class) VkWin32SurfaceCreateInfoKHR pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateWin32SurfaceKHR.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceWin32PresentationSupportKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceWin32PresentationSupportKHR.invoke(
                    physicalDevice.handle(),
                    queueFamilyIndex
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateXlibSurfaceKHR(
            VkInstance instance,
            @pointer(target=VkXlibSurfaceCreateInfoKHR.class) VkXlibSurfaceCreateInfoKHR pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateXlibSurfaceKHR.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceXlibPresentationSupportKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @pointer(comment="void **") MemorySegment dpy,
            long visualID
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceXlibPresentationSupportKHR.invoke(
                    physicalDevice.handle(),
                    queueFamilyIndex,
                    dpy,
                    visualID
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateXcbSurfaceKHR(
            VkInstance instance,
            @pointer(target=VkXcbSurfaceCreateInfoKHR.class) VkXcbSurfaceCreateInfoKHR pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateXcbSurfaceKHR.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceXcbPresentationSupportKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @pointer(comment="void*") MemorySegment connection,
            @unsigned int visual_id
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceXcbPresentationSupportKHR.invoke(
                    physicalDevice.handle(),
                    queueFamilyIndex,
                    connection,
                    visual_id
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDirectFBSurfaceEXT(
            VkInstance instance,
            @pointer(target=VkDirectFBSurfaceCreateInfoEXT.class) VkDirectFBSurfaceCreateInfoEXT pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateDirectFBSurfaceEXT.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceDirectFBPresentationSupportEXT(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @pointer(comment="void*") MemorySegment dfb
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDirectFBPresentationSupportEXT.invoke(
                    physicalDevice.handle(),
                    queueFamilyIndex,
                    dfb
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateImagePipeSurfaceFUCHSIA(
            VkInstance instance,
            @pointer(target=VkImagePipeSurfaceCreateInfoFUCHSIA.class) VkImagePipeSurfaceCreateInfoFUCHSIA pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateImagePipeSurfaceFUCHSIA.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateStreamDescriptorSurfaceGGP(
            VkInstance instance,
            @pointer(target=VkStreamDescriptorSurfaceCreateInfoGGP.class) VkStreamDescriptorSurfaceCreateInfoGGP pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateStreamDescriptorSurfaceGGP.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateScreenSurfaceQNX(
            VkInstance instance,
            @pointer(target=VkScreenSurfaceCreateInfoQNX.class) VkScreenSurfaceCreateInfoQNX pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateScreenSurfaceQNX.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceScreenPresentationSupportQNX(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @pointer(comment="void*") MemorySegment window
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceScreenPresentationSupportQNX.invoke(
                    physicalDevice.handle(),
                    queueFamilyIndex,
                    window
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDebugReportCallbackEXT(
            VkInstance instance,
            @pointer(target=VkDebugReportCallbackCreateInfoEXT.class) VkDebugReportCallbackCreateInfoEXT pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDebugReportCallbackEXT.class) VkDebugReportCallbackEXT pCallback
    ) {
        try {
            return (int) HANDLE$vkCreateDebugReportCallbackEXT.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pCallback.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyDebugReportCallbackEXT(
            VkInstance instance,
            @nullable VkDebugReportCallbackEXT callback,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDebugReportCallbackEXT.invoke(
                    instance.handle(),
                    callback != null ? callback.handle() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDebugReportMessageEXT(
            VkInstance instance,
            @enumtype(VkDebugReportFlagsEXT.class) int flags,
            @enumtype(VkDebugReportObjectTypeEXT.class) int objectType,
            @unsigned long object,
            @unsigned long location,
            int messageCode,
            @pointer(target=BytePtr.class) BytePtr pLayerPrefix,
            @pointer(target=BytePtr.class) BytePtr pMessage
    ) {
        try {
            HANDLE$vkDebugReportMessageEXT.invoke(
                    instance.handle(),
                    flags,
                    objectType,
                    object,
                    location,
                    messageCode,
                    pLayerPrefix.segment(),
                    pMessage.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceExternalImageFormatPropertiesNV(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkFormat.class) int format,
            @enumtype(VkImageType.class) int type,
            @enumtype(VkImageTiling.class) int tiling,
            @enumtype(VkImageUsageFlags.class) int usage,
            @enumtype(VkImageCreateFlags.class) int flags,
            @enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int externalHandleType,
            @pointer(target=VkExternalImageFormatPropertiesNV.class) VkExternalImageFormatPropertiesNV pExternalImageFormatProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceExternalImageFormatPropertiesNV.invoke(
                    physicalDevice.handle(),
                    format,
                    type,
                    tiling,
                    usage,
                    flags,
                    externalHandleType,
                    pExternalImageFormatProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceFeatures2(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceFeatures2.class) VkPhysicalDeviceFeatures2 pFeatures
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceFeatures2.invoke(
                    physicalDevice.handle(),
                    pFeatures.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceProperties2(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceProperties2.class) VkPhysicalDeviceProperties2 pProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceProperties2.invoke(
                    physicalDevice.handle(),
                    pProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceFormatProperties2(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkFormat.class) int format,
            @pointer(target=VkFormatProperties2.class) VkFormatProperties2 pFormatProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceFormatProperties2.invoke(
                    physicalDevice.handle(),
                    format,
                    pFormatProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceImageFormatProperties2(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceImageFormatInfo2.class) VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo,
            @pointer(target=VkImageFormatProperties2.class) VkImageFormatProperties2 pImageFormatProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceImageFormatProperties2.invoke(
                    physicalDevice.handle(),
                    pImageFormatInfo.segment(),
                    pImageFormatProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceQueueFamilyProperties2(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pQueueFamilyPropertyCount,
            @nullable @pointer(target=VkQueueFamilyProperties2.class) VkQueueFamilyProperties2 pQueueFamilyProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceQueueFamilyProperties2.invoke(
                    physicalDevice.handle(),
                    pQueueFamilyPropertyCount.segment(),
                    pQueueFamilyProperties != null ? pQueueFamilyProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceMemoryProperties2(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceMemoryProperties2.class) VkPhysicalDeviceMemoryProperties2 pMemoryProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceMemoryProperties2.invoke(
                    physicalDevice.handle(),
                    pMemoryProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceSparseImageFormatProperties2(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceSparseImageFormatInfo2.class) VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @nullable @pointer(target=VkSparseImageFormatProperties2.class) VkSparseImageFormatProperties2 pProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties2.invoke(
                    physicalDevice.handle(),
                    pFormatInfo.segment(),
                    pPropertyCount.segment(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceExternalBufferProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceExternalBufferInfo.class) VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo,
            @pointer(target=VkExternalBufferProperties.class) VkExternalBufferProperties pExternalBufferProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceExternalBufferProperties.invoke(
                    physicalDevice.handle(),
                    pExternalBufferInfo.segment(),
                    pExternalBufferProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceExternalSemaphoreProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceExternalSemaphoreInfo.class) VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo,
            @pointer(target=VkExternalSemaphoreProperties.class) VkExternalSemaphoreProperties pExternalSemaphoreProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceExternalSemaphoreProperties.invoke(
                    physicalDevice.handle(),
                    pExternalSemaphoreInfo.segment(),
                    pExternalSemaphoreProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceExternalFenceProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceExternalFenceInfo.class) VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo,
            @pointer(target=VkExternalFenceProperties.class) VkExternalFenceProperties pExternalFenceProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceExternalFenceProperties.invoke(
                    physicalDevice.handle(),
                    pExternalFenceInfo.segment(),
                    pExternalFenceProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkReleaseDisplayEXT(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display
    ) {
        try {
            return (int) HANDLE$vkReleaseDisplayEXT.invoke(
                    physicalDevice.handle(),
                    display.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAcquireXlibDisplayEXT(
            VkPhysicalDevice physicalDevice,
            @pointer(comment="void **") MemorySegment dpy,
            VkDisplayKHR display
    ) {
        try {
            return (int) HANDLE$vkAcquireXlibDisplayEXT.invoke(
                    physicalDevice.handle(),
                    dpy,
                    display.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetRandROutputDisplayEXT(
            VkPhysicalDevice physicalDevice,
            @pointer(comment="void **") MemorySegment dpy,
            long rrOutput,
            @pointer(target=VkDisplayKHR.class) VkDisplayKHR pDisplay
    ) {
        try {
            return (int) HANDLE$vkGetRandROutputDisplayEXT.invoke(
                    physicalDevice.handle(),
                    dpy,
                    rrOutput,
                    pDisplay.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceCapabilities2EXT(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            @pointer(target=VkSurfaceCapabilities2EXT.class) VkSurfaceCapabilities2EXT pSurfaceCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2EXT.invoke(
                    physicalDevice.handle(),
                    surface.handle(),
                    pSurfaceCapabilities.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumeratePhysicalDeviceGroups(
            VkInstance instance,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPhysicalDeviceGroupCount,
            @nullable @pointer(target=VkPhysicalDeviceGroupProperties.class) VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties
    ) {
        try {
            return (int) HANDLE$vkEnumeratePhysicalDeviceGroups.invoke(
                    instance.handle(),
                    pPhysicalDeviceGroupCount.segment(),
                    pPhysicalDeviceGroupProperties != null ? pPhysicalDeviceGroupProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateIOSSurfaceMVK(
            VkInstance instance,
            @pointer(target=VkIOSSurfaceCreateInfoMVK.class) VkIOSSurfaceCreateInfoMVK pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateIOSSurfaceMVK.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateMacOSSurfaceMVK(
            VkInstance instance,
            @pointer(target=VkMacOSSurfaceCreateInfoMVK.class) VkMacOSSurfaceCreateInfoMVK pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateMacOSSurfaceMVK.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateMetalSurfaceEXT(
            VkInstance instance,
            @pointer(target=VkMetalSurfaceCreateInfoEXT.class) VkMetalSurfaceCreateInfoEXT pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateMetalSurfaceEXT.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceCapabilities2KHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceSurfaceInfo2KHR.class) VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo,
            @pointer(target=VkSurfaceCapabilities2KHR.class) VkSurfaceCapabilities2KHR pSurfaceCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2KHR.invoke(
                    physicalDevice.handle(),
                    pSurfaceInfo.segment(),
                    pSurfaceCapabilities.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceFormats2KHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceSurfaceInfo2KHR.class) VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo,
            @pointer(target=IntPtr.class) @unsigned IntPtr pSurfaceFormatCount,
            @nullable @pointer(target=VkSurfaceFormat2KHR.class) VkSurfaceFormat2KHR pSurfaceFormats
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceFormats2KHR.invoke(
                    physicalDevice.handle(),
                    pSurfaceInfo.segment(),
                    pSurfaceFormatCount.segment(),
                    pSurfaceFormats != null ? pSurfaceFormats.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayProperties2KHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @nullable @pointer(target=VkDisplayProperties2KHR.class) VkDisplayProperties2KHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayProperties2KHR.invoke(
                    physicalDevice.handle(),
                    pPropertyCount.segment(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @nullable @pointer(target=VkDisplayPlaneProperties2KHR.class) VkDisplayPlaneProperties2KHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayPlaneProperties2KHR.invoke(
                    physicalDevice.handle(),
                    pPropertyCount.segment(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDisplayModeProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            @pointer(target=IntPtr.class) @unsigned IntPtr pPropertyCount,
            @nullable @pointer(target=VkDisplayModeProperties2KHR.class) VkDisplayModeProperties2KHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetDisplayModeProperties2KHR.invoke(
                    physicalDevice.handle(),
                    display.handle(),
                    pPropertyCount.segment(),
                    pProperties != null ? pProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDisplayPlaneCapabilities2KHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkDisplayPlaneInfo2KHR.class) VkDisplayPlaneInfo2KHR pDisplayPlaneInfo,
            @pointer(target=VkDisplayPlaneCapabilities2KHR.class) VkDisplayPlaneCapabilities2KHR pCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetDisplayPlaneCapabilities2KHR.invoke(
                    physicalDevice.handle(),
                    pDisplayPlaneInfo.segment(),
                    pCapabilities.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkSetDebugUtilsObjectNameEXT(
            VkDevice device,
            @pointer(target=VkDebugUtilsObjectNameInfoEXT.class) VkDebugUtilsObjectNameInfoEXT pNameInfo
    ) {
        try {
            return (int) HANDLE$vkSetDebugUtilsObjectNameEXT.invoke(
                    device.handle(),
                    pNameInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkSetDebugUtilsObjectTagEXT(
            VkDevice device,
            @pointer(target=VkDebugUtilsObjectTagInfoEXT.class) VkDebugUtilsObjectTagInfoEXT pTagInfo
    ) {
        try {
            return (int) HANDLE$vkSetDebugUtilsObjectTagEXT.invoke(
                    device.handle(),
                    pTagInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkQueueBeginDebugUtilsLabelEXT(
            VkQueue queue,
            @pointer(target=VkDebugUtilsLabelEXT.class) VkDebugUtilsLabelEXT pLabelInfo
    ) {
        try {
            HANDLE$vkQueueBeginDebugUtilsLabelEXT.invoke(
                    queue.handle(),
                    pLabelInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkQueueEndDebugUtilsLabelEXT(
            VkQueue queue
    ) {
        try {
            HANDLE$vkQueueEndDebugUtilsLabelEXT.invoke(
                    queue.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkQueueInsertDebugUtilsLabelEXT(
            VkQueue queue,
            @pointer(target=VkDebugUtilsLabelEXT.class) VkDebugUtilsLabelEXT pLabelInfo
    ) {
        try {
            HANDLE$vkQueueInsertDebugUtilsLabelEXT.invoke(
                    queue.handle(),
                    pLabelInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBeginDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDebugUtilsLabelEXT.class) VkDebugUtilsLabelEXT pLabelInfo
    ) {
        try {
            HANDLE$vkCmdBeginDebugUtilsLabelEXT.invoke(
                    commandBuffer.handle(),
                    pLabelInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdEndDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdEndDebugUtilsLabelEXT.invoke(
                    commandBuffer.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdInsertDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDebugUtilsLabelEXT.class) VkDebugUtilsLabelEXT pLabelInfo
    ) {
        try {
            HANDLE$vkCmdInsertDebugUtilsLabelEXT.invoke(
                    commandBuffer.handle(),
                    pLabelInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDebugUtilsMessengerEXT(
            VkInstance instance,
            @pointer(target=VkDebugUtilsMessengerCreateInfoEXT.class) VkDebugUtilsMessengerCreateInfoEXT pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDebugUtilsMessengerEXT.class) VkDebugUtilsMessengerEXT pMessenger
    ) {
        try {
            return (int) HANDLE$vkCreateDebugUtilsMessengerEXT.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pMessenger.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyDebugUtilsMessengerEXT(
            VkInstance instance,
            @nullable VkDebugUtilsMessengerEXT messenger,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDebugUtilsMessengerEXT.invoke(
                    instance.handle(),
                    messenger != null ? messenger.handle() : MemorySegment.NULL,
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkSubmitDebugUtilsMessageEXT(
            VkInstance instance,
            @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity,
            @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int messageTypes,
            @pointer(target=VkDebugUtilsMessengerCallbackDataEXT.class) VkDebugUtilsMessengerCallbackDataEXT pCallbackData
    ) {
        try {
            HANDLE$vkSubmitDebugUtilsMessageEXT.invoke(
                    instance.handle(),
                    messageSeverity,
                    messageTypes,
                    pCallbackData.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateHeadlessSurfaceEXT(
            VkInstance instance,
            @pointer(target=VkHeadlessSurfaceCreateInfoEXT.class) VkHeadlessSurfaceCreateInfoEXT pCreateInfo,
            @nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateHeadlessSurfaceEXT.invoke(
                    instance.handle(),
                    pCreateInfo.segment(),
                    pAllocator != null ? pAllocator.segment() : MemorySegment.NULL,
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceToolProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=IntPtr.class) @unsigned IntPtr pToolCount,
            @nullable @pointer(target=VkPhysicalDeviceToolProperties.class) VkPhysicalDeviceToolProperties pToolProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceToolProperties.invoke(
                    physicalDevice.handle(),
                    pToolCount.segment(),
                    pToolProperties != null ? pToolProperties.segment() : MemorySegment.NULL
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAcquireDrmDisplayEXT(
            VkPhysicalDevice physicalDevice,
            int drmFd,
            VkDisplayKHR display
    ) {
        try {
            return (int) HANDLE$vkAcquireDrmDisplayEXT.invoke(
                    physicalDevice.handle(),
                    drmFd,
                    display.handle()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDrmDisplayEXT(
            VkPhysicalDevice physicalDevice,
            int drmFd,
            @unsigned int connectorId,
            @pointer(target=VkDisplayKHR.class) VkDisplayKHR display
    ) {
        try {
            return (int) HANDLE$vkGetDrmDisplayEXT.invoke(
                    physicalDevice.handle(),
                    drmFd,
                    connectorId,
                    display.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}
