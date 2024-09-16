package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.handle.*;
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

    public void vkDestroyInstance(VkInstance instance, MemorySegment pAllocator) {
        try {
            HANDLE$vkDestroyInstance.invokeExact(instance, pAllocator);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumeratePhysicalDevices(VkInstance instance, MemorySegment pPhysicalDeviceCount, MemorySegment pPhysicalDevices) {
        try {
            return (int) HANDLE$vkEnumeratePhysicalDevices.invokeExact(instance, pPhysicalDeviceCount, pPhysicalDevices);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceProperties(VkPhysicalDevice physicalDevice, MemorySegment pProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceProperties.invokeExact(physicalDevice, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceQueueFamilyProperties(VkPhysicalDevice physicalDevice, MemorySegment pQueueFamilyPropertyCount, MemorySegment pQueueFamilyProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceQueueFamilyProperties.invokeExact(physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceMemoryProperties(VkPhysicalDevice physicalDevice, MemorySegment pMemoryProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceMemoryProperties.invokeExact(physicalDevice, pMemoryProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceFeatures(VkPhysicalDevice physicalDevice, MemorySegment pFeatures) {
        try {
            HANDLE$vkGetPhysicalDeviceFeatures.invokeExact(physicalDevice, pFeatures);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceFormatProperties(VkPhysicalDevice physicalDevice, @enumtype(VkFormat.class) int format, MemorySegment pFormatProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceFormatProperties.invokeExact(physicalDevice, format, pFormatProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceImageFormatProperties(VkPhysicalDevice physicalDevice, @enumtype(VkFormat.class) int format, @enumtype(VkImageType.class) int type, @enumtype(VkImageTiling.class) int tiling, @enumtype(VkImageUsageFlags.class) int usage, @enumtype(VkImageCreateFlags.class) int flags, MemorySegment pImageFormatProperties) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceImageFormatProperties.invokeExact(physicalDevice, format, type, tiling, usage, flags, pImageFormatProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDevice(VkPhysicalDevice physicalDevice, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pDevice) {
        try {
            return (int) HANDLE$vkCreateDevice.invokeExact(physicalDevice, pCreateInfo, pAllocator, pDevice);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumerateDeviceLayerProperties(VkPhysicalDevice physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        try {
            return (int) HANDLE$vkEnumerateDeviceLayerProperties.invokeExact(physicalDevice, pPropertyCount, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumerateDeviceExtensionProperties(VkPhysicalDevice physicalDevice, MemorySegment pLayerName, MemorySegment pPropertyCount, MemorySegment pProperties) {
        try {
            return (int) HANDLE$vkEnumerateDeviceExtensionProperties.invokeExact(physicalDevice, pLayerName, pPropertyCount, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceSparseImageFormatProperties(VkPhysicalDevice physicalDevice, @enumtype(VkFormat.class) int format, @enumtype(VkImageType.class) int type, @enumtype(VkSampleCountFlags.class) int samples, @enumtype(VkImageUsageFlags.class) int usage, @enumtype(VkImageTiling.class) int tiling, MemorySegment pPropertyCount, MemorySegment pProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties.invokeExact(physicalDevice, format, type, samples, usage, tiling, pPropertyCount, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateAndroidSurfaceKHR(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateAndroidSurfaceKHR.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayPropertiesKHR(VkPhysicalDevice physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayPropertiesKHR.invokeExact(physicalDevice, pPropertyCount, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(VkPhysicalDevice physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayPlanePropertiesKHR.invokeExact(physicalDevice, pPropertyCount, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDisplayPlaneSupportedDisplaysKHR(VkPhysicalDevice physicalDevice, @unsigned int planeIndex, MemorySegment pDisplayCount, MemorySegment pDisplays) {
        try {
            return (int) HANDLE$vkGetDisplayPlaneSupportedDisplaysKHR.invokeExact(physicalDevice, planeIndex, pDisplayCount, pDisplays);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDisplayModePropertiesKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, MemorySegment pPropertyCount, MemorySegment pProperties) {
        try {
            return (int) HANDLE$vkGetDisplayModePropertiesKHR.invokeExact(physicalDevice, display, pPropertyCount, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDisplayModeKHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pMode) {
        try {
            return (int) HANDLE$vkCreateDisplayModeKHR.invokeExact(physicalDevice, display, pCreateInfo, pAllocator, pMode);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDisplayPlaneCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkDisplayModeKHR mode, @unsigned int planeIndex, MemorySegment pCapabilities) {
        try {
            return (int) HANDLE$vkGetDisplayPlaneCapabilitiesKHR.invokeExact(physicalDevice, mode, planeIndex, pCapabilities);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDisplayPlaneSurfaceKHR(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateDisplayPlaneSurfaceKHR.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroySurfaceKHR(VkInstance instance, VkSurfaceKHR surface, MemorySegment pAllocator) {
        try {
            HANDLE$vkDestroySurfaceKHR.invokeExact(instance, surface, pAllocator);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceSupportKHR(VkPhysicalDevice physicalDevice, @unsigned int queueFamilyIndex, VkSurfaceKHR surface, MemorySegment pSupported) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceSupportKHR.invokeExact(physicalDevice, queueFamilyIndex, surface, pSupported);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, MemorySegment pSurfaceCapabilities) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceCapabilitiesKHR.invokeExact(physicalDevice, surface, pSurfaceCapabilities);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceFormatsKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, MemorySegment pSurfaceFormatCount, MemorySegment pSurfaceFormats) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceFormatsKHR.invokeExact(physicalDevice, surface, pSurfaceFormatCount, pSurfaceFormats);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfacePresentModesKHR(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, MemorySegment pPresentModeCount, MemorySegment pPresentModes) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfacePresentModesKHR.invokeExact(physicalDevice, surface, pPresentModeCount, pPresentModes);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateViSurfaceNN(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateViSurfaceNN.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateWaylandSurfaceKHR(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateWaylandSurfaceKHR.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceWaylandPresentationSupportKHR(VkPhysicalDevice physicalDevice, @unsigned int queueFamilyIndex, @pointer(comment="void*") MemorySegment display) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceWaylandPresentationSupportKHR.invokeExact(physicalDevice, queueFamilyIndex, display);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateWin32SurfaceKHR(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateWin32SurfaceKHR.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceWin32PresentationSupportKHR(VkPhysicalDevice physicalDevice, @unsigned int queueFamilyIndex) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceWin32PresentationSupportKHR.invokeExact(physicalDevice, queueFamilyIndex);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateXlibSurfaceKHR(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateXlibSurfaceKHR.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceXlibPresentationSupportKHR(VkPhysicalDevice physicalDevice, @unsigned int queueFamilyIndex, MemorySegment dpy, long visualID) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceXlibPresentationSupportKHR.invokeExact(physicalDevice, queueFamilyIndex, dpy, visualID);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateXcbSurfaceKHR(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateXcbSurfaceKHR.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceXcbPresentationSupportKHR(VkPhysicalDevice physicalDevice, @unsigned int queueFamilyIndex, @pointer(comment="void*") MemorySegment connection, @unsigned int visual_id) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceXcbPresentationSupportKHR.invokeExact(physicalDevice, queueFamilyIndex, connection, visual_id);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDirectFBSurfaceEXT(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateDirectFBSurfaceEXT.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceDirectFBPresentationSupportEXT(VkPhysicalDevice physicalDevice, @unsigned int queueFamilyIndex, @pointer(comment="void*") MemorySegment dfb) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDirectFBPresentationSupportEXT.invokeExact(physicalDevice, queueFamilyIndex, dfb);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateImagePipeSurfaceFUCHSIA(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateImagePipeSurfaceFUCHSIA.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateStreamDescriptorSurfaceGGP(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateStreamDescriptorSurfaceGGP.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateScreenSurfaceQNX(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateScreenSurfaceQNX.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @unsigned int vkGetPhysicalDeviceScreenPresentationSupportQNX(VkPhysicalDevice physicalDevice, @unsigned int queueFamilyIndex, @pointer(comment="void*") MemorySegment window) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceScreenPresentationSupportQNX.invokeExact(physicalDevice, queueFamilyIndex, window);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDebugReportCallbackEXT(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pCallback) {
        try {
            return (int) HANDLE$vkCreateDebugReportCallbackEXT.invokeExact(instance, pCreateInfo, pAllocator, pCallback);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyDebugReportCallbackEXT(VkInstance instance, VkDebugReportCallbackEXT callback, MemorySegment pAllocator) {
        try {
            HANDLE$vkDestroyDebugReportCallbackEXT.invokeExact(instance, callback, pAllocator);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDebugReportMessageEXT(VkInstance instance, @enumtype(VkDebugReportFlagsEXT.class) int flags, @enumtype(VkDebugReportObjectTypeEXT.class) int objectType, @unsigned long object, @unsigned long location, int messageCode, MemorySegment pLayerPrefix, MemorySegment pMessage) {
        try {
            HANDLE$vkDebugReportMessageEXT.invokeExact(instance, flags, objectType, object, location, messageCode, pLayerPrefix, pMessage);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceExternalImageFormatPropertiesNV(VkPhysicalDevice physicalDevice, @enumtype(VkFormat.class) int format, @enumtype(VkImageType.class) int type, @enumtype(VkImageTiling.class) int tiling, @enumtype(VkImageUsageFlags.class) int usage, @enumtype(VkImageCreateFlags.class) int flags, @enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int externalHandleType, MemorySegment pExternalImageFormatProperties) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceExternalImageFormatPropertiesNV.invokeExact(physicalDevice, format, type, tiling, usage, flags, externalHandleType, pExternalImageFormatProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceFeatures2(VkPhysicalDevice physicalDevice, MemorySegment pFeatures) {
        try {
            HANDLE$vkGetPhysicalDeviceFeatures2.invokeExact(physicalDevice, pFeatures);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceProperties2(VkPhysicalDevice physicalDevice, MemorySegment pProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceProperties2.invokeExact(physicalDevice, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceFormatProperties2(VkPhysicalDevice physicalDevice, @enumtype(VkFormat.class) int format, MemorySegment pFormatProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceFormatProperties2.invokeExact(physicalDevice, format, pFormatProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceImageFormatProperties2(VkPhysicalDevice physicalDevice, MemorySegment pImageFormatInfo, MemorySegment pImageFormatProperties) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceImageFormatProperties2.invokeExact(physicalDevice, pImageFormatInfo, pImageFormatProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceQueueFamilyProperties2(VkPhysicalDevice physicalDevice, MemorySegment pQueueFamilyPropertyCount, MemorySegment pQueueFamilyProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceQueueFamilyProperties2.invokeExact(physicalDevice, pQueueFamilyPropertyCount, pQueueFamilyProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceMemoryProperties2(VkPhysicalDevice physicalDevice, MemorySegment pMemoryProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceMemoryProperties2.invokeExact(physicalDevice, pMemoryProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceSparseImageFormatProperties2(VkPhysicalDevice physicalDevice, MemorySegment pFormatInfo, MemorySegment pPropertyCount, MemorySegment pProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties2.invokeExact(physicalDevice, pFormatInfo, pPropertyCount, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceExternalBufferProperties(VkPhysicalDevice physicalDevice, MemorySegment pExternalBufferInfo, MemorySegment pExternalBufferProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceExternalBufferProperties.invokeExact(physicalDevice, pExternalBufferInfo, pExternalBufferProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceExternalSemaphoreProperties(VkPhysicalDevice physicalDevice, MemorySegment pExternalSemaphoreInfo, MemorySegment pExternalSemaphoreProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceExternalSemaphoreProperties.invokeExact(physicalDevice, pExternalSemaphoreInfo, pExternalSemaphoreProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkGetPhysicalDeviceExternalFenceProperties(VkPhysicalDevice physicalDevice, MemorySegment pExternalFenceInfo, MemorySegment pExternalFenceProperties) {
        try {
            HANDLE$vkGetPhysicalDeviceExternalFenceProperties.invokeExact(physicalDevice, pExternalFenceInfo, pExternalFenceProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkReleaseDisplayEXT(VkPhysicalDevice physicalDevice, VkDisplayKHR display) {
        try {
            return (int) HANDLE$vkReleaseDisplayEXT.invokeExact(physicalDevice, display);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAcquireXlibDisplayEXT(VkPhysicalDevice physicalDevice, MemorySegment dpy, VkDisplayKHR display) {
        try {
            return (int) HANDLE$vkAcquireXlibDisplayEXT.invokeExact(physicalDevice, dpy, display);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetRandROutputDisplayEXT(VkPhysicalDevice physicalDevice, MemorySegment dpy, long rrOutput, MemorySegment pDisplay) {
        try {
            return (int) HANDLE$vkGetRandROutputDisplayEXT.invokeExact(physicalDevice, dpy, rrOutput, pDisplay);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceCapabilities2EXT(VkPhysicalDevice physicalDevice, VkSurfaceKHR surface, MemorySegment pSurfaceCapabilities) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2EXT.invokeExact(physicalDevice, surface, pSurfaceCapabilities);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkEnumeratePhysicalDeviceGroups(VkInstance instance, MemorySegment pPhysicalDeviceGroupCount, MemorySegment pPhysicalDeviceGroupProperties) {
        try {
            return (int) HANDLE$vkEnumeratePhysicalDeviceGroups.invokeExact(instance, pPhysicalDeviceGroupCount, pPhysicalDeviceGroupProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateIOSSurfaceMVK(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateIOSSurfaceMVK.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateMacOSSurfaceMVK(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateMacOSSurfaceMVK.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateMetalSurfaceEXT(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateMetalSurfaceEXT.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceCapabilities2KHR(VkPhysicalDevice physicalDevice, MemorySegment pSurfaceInfo, MemorySegment pSurfaceCapabilities) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2KHR.invokeExact(physicalDevice, pSurfaceInfo, pSurfaceCapabilities);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceFormats2KHR(VkPhysicalDevice physicalDevice, MemorySegment pSurfaceInfo, MemorySegment pSurfaceFormatCount, MemorySegment pSurfaceFormats) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceFormats2KHR.invokeExact(physicalDevice, pSurfaceInfo, pSurfaceFormatCount, pSurfaceFormats);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayProperties2KHR(VkPhysicalDevice physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayProperties2KHR.invokeExact(physicalDevice, pPropertyCount, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(VkPhysicalDevice physicalDevice, MemorySegment pPropertyCount, MemorySegment pProperties) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayPlaneProperties2KHR.invokeExact(physicalDevice, pPropertyCount, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDisplayModeProperties2KHR(VkPhysicalDevice physicalDevice, VkDisplayKHR display, MemorySegment pPropertyCount, MemorySegment pProperties) {
        try {
            return (int) HANDLE$vkGetDisplayModeProperties2KHR.invokeExact(physicalDevice, display, pPropertyCount, pProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDisplayPlaneCapabilities2KHR(VkPhysicalDevice physicalDevice, MemorySegment pDisplayPlaneInfo, MemorySegment pCapabilities) {
        try {
            return (int) HANDLE$vkGetDisplayPlaneCapabilities2KHR.invokeExact(physicalDevice, pDisplayPlaneInfo, pCapabilities);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkSetDebugUtilsObjectNameEXT(VkDevice device, MemorySegment pNameInfo) {
        try {
            return (int) HANDLE$vkSetDebugUtilsObjectNameEXT.invokeExact(device, pNameInfo);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkSetDebugUtilsObjectTagEXT(VkDevice device, MemorySegment pTagInfo) {
        try {
            return (int) HANDLE$vkSetDebugUtilsObjectTagEXT.invokeExact(device, pTagInfo);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkQueueBeginDebugUtilsLabelEXT(VkQueue queue, MemorySegment pLabelInfo) {
        try {
            HANDLE$vkQueueBeginDebugUtilsLabelEXT.invokeExact(queue, pLabelInfo);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkQueueEndDebugUtilsLabelEXT(VkQueue queue) {
        try {
            HANDLE$vkQueueEndDebugUtilsLabelEXT.invokeExact(queue);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkQueueInsertDebugUtilsLabelEXT(VkQueue queue, MemorySegment pLabelInfo) {
        try {
            HANDLE$vkQueueInsertDebugUtilsLabelEXT.invokeExact(queue, pLabelInfo);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdBeginDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, MemorySegment pLabelInfo) {
        try {
            HANDLE$vkCmdBeginDebugUtilsLabelEXT.invokeExact(commandBuffer, pLabelInfo);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdEndDebugUtilsLabelEXT(VkCommandBuffer commandBuffer) {
        try {
            HANDLE$vkCmdEndDebugUtilsLabelEXT.invokeExact(commandBuffer);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkCmdInsertDebugUtilsLabelEXT(VkCommandBuffer commandBuffer, MemorySegment pLabelInfo) {
        try {
            HANDLE$vkCmdInsertDebugUtilsLabelEXT.invokeExact(commandBuffer, pLabelInfo);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateDebugUtilsMessengerEXT(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pMessenger) {
        try {
            return (int) HANDLE$vkCreateDebugUtilsMessengerEXT.invokeExact(instance, pCreateInfo, pAllocator, pMessenger);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkDestroyDebugUtilsMessengerEXT(VkInstance instance, VkDebugUtilsMessengerEXT messenger, MemorySegment pAllocator) {
        try {
            HANDLE$vkDestroyDebugUtilsMessengerEXT.invokeExact(instance, messenger, pAllocator);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public void vkSubmitDebugUtilsMessageEXT(VkInstance instance, @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity, @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int messageTypes, MemorySegment pCallbackData) {
        try {
            HANDLE$vkSubmitDebugUtilsMessageEXT.invokeExact(instance, messageSeverity, messageTypes, pCallbackData);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkCreateHeadlessSurfaceEXT(VkInstance instance, MemorySegment pCreateInfo, MemorySegment pAllocator, MemorySegment pSurface) {
        try {
            return (int) HANDLE$vkCreateHeadlessSurfaceEXT.invokeExact(instance, pCreateInfo, pAllocator, pSurface);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetPhysicalDeviceToolProperties(VkPhysicalDevice physicalDevice, MemorySegment pToolCount, MemorySegment pToolProperties) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceToolProperties.invokeExact(physicalDevice, pToolCount, pToolProperties);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkAcquireDrmDisplayEXT(VkPhysicalDevice physicalDevice, int drmFd, VkDisplayKHR display) {
        try {
            return (int) HANDLE$vkAcquireDrmDisplayEXT.invokeExact(physicalDevice, drmFd, display);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    public @enumtype(VkResult.class) int vkGetDrmDisplayEXT(VkPhysicalDevice physicalDevice, int drmFd, @unsigned int connectorId, MemorySegment display) {
        try {
            return (int) HANDLE$vkGetDrmDisplayEXT.invokeExact(physicalDevice, drmFd, connectorId, display);
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}
