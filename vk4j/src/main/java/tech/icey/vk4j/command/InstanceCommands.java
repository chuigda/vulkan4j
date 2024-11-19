package tech.icey.vk4j.command;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.RawFunctionLoader;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.handle.*;

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

    public final @Nullable MemorySegment SEGMENT$vkDestroyInstance;
    public final @Nullable MemorySegment SEGMENT$vkEnumeratePhysicalDevices;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceProperties;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceQueueFamilyProperties;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceMemoryProperties;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceFeatures;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceFormatProperties;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceImageFormatProperties;
    public final @Nullable MemorySegment SEGMENT$vkCreateDevice;
    public final @Nullable MemorySegment SEGMENT$vkEnumerateDeviceLayerProperties;
    public final @Nullable MemorySegment SEGMENT$vkEnumerateDeviceExtensionProperties;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSparseImageFormatProperties;
    public final @Nullable MemorySegment SEGMENT$vkCreateAndroidSurfaceKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceDisplayPropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDisplayPlaneSupportedDisplaysKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDisplayModePropertiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateDisplayModeKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDisplayPlaneCapabilitiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateDisplayPlaneSurfaceKHR;
    public final @Nullable MemorySegment SEGMENT$vkDestroySurfaceKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSurfaceSupportKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSurfaceCapabilitiesKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSurfaceFormatsKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSurfacePresentModesKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateViSurfaceNN;
    public final @Nullable MemorySegment SEGMENT$vkCreateWaylandSurfaceKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceWaylandPresentationSupportKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateWin32SurfaceKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceWin32PresentationSupportKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateXlibSurfaceKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceXlibPresentationSupportKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateXcbSurfaceKHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceXcbPresentationSupportKHR;
    public final @Nullable MemorySegment SEGMENT$vkCreateDirectFBSurfaceEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceDirectFBPresentationSupportEXT;
    public final @Nullable MemorySegment SEGMENT$vkCreateImagePipeSurfaceFUCHSIA;
    public final @Nullable MemorySegment SEGMENT$vkCreateStreamDescriptorSurfaceGGP;
    public final @Nullable MemorySegment SEGMENT$vkCreateScreenSurfaceQNX;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceScreenPresentationSupportQNX;
    public final @Nullable MemorySegment SEGMENT$vkCreateDebugReportCallbackEXT;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDebugReportCallbackEXT;
    public final @Nullable MemorySegment SEGMENT$vkDebugReportMessageEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceExternalImageFormatPropertiesNV;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceFeatures2;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceProperties2;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceFormatProperties2;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceImageFormatProperties2;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceQueueFamilyProperties2;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceMemoryProperties2;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSparseImageFormatProperties2;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceExternalBufferProperties;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceExternalSemaphoreProperties;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceExternalFenceProperties;
    public final @Nullable MemorySegment SEGMENT$vkReleaseDisplayEXT;
    public final @Nullable MemorySegment SEGMENT$vkAcquireXlibDisplayEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetRandROutputDisplayEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSurfaceCapabilities2EXT;
    public final @Nullable MemorySegment SEGMENT$vkEnumeratePhysicalDeviceGroups;
    public final @Nullable MemorySegment SEGMENT$vkCreateIOSSurfaceMVK;
    public final @Nullable MemorySegment SEGMENT$vkCreateMacOSSurfaceMVK;
    public final @Nullable MemorySegment SEGMENT$vkCreateMetalSurfaceEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSurfaceCapabilities2KHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceSurfaceFormats2KHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceDisplayProperties2KHR;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDisplayModeProperties2KHR;
    public final @Nullable MemorySegment SEGMENT$vkGetDisplayPlaneCapabilities2KHR;
    public final @Nullable MemorySegment SEGMENT$vkSetDebugUtilsObjectNameEXT;
    public final @Nullable MemorySegment SEGMENT$vkSetDebugUtilsObjectTagEXT;
    public final @Nullable MemorySegment SEGMENT$vkQueueBeginDebugUtilsLabelEXT;
    public final @Nullable MemorySegment SEGMENT$vkQueueEndDebugUtilsLabelEXT;
    public final @Nullable MemorySegment SEGMENT$vkQueueInsertDebugUtilsLabelEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdBeginDebugUtilsLabelEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdEndDebugUtilsLabelEXT;
    public final @Nullable MemorySegment SEGMENT$vkCmdInsertDebugUtilsLabelEXT;
    public final @Nullable MemorySegment SEGMENT$vkCreateDebugUtilsMessengerEXT;
    public final @Nullable MemorySegment SEGMENT$vkDestroyDebugUtilsMessengerEXT;
    public final @Nullable MemorySegment SEGMENT$vkSubmitDebugUtilsMessageEXT;
    public final @Nullable MemorySegment SEGMENT$vkCreateHeadlessSurfaceEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetPhysicalDeviceToolProperties;
    public final @Nullable MemorySegment SEGMENT$vkAcquireDrmDisplayEXT;
    public final @Nullable MemorySegment SEGMENT$vkGetDrmDisplayEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyInstance;
    public final @Nullable MethodHandle HANDLE$vkEnumeratePhysicalDevices;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceProperties;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceQueueFamilyProperties;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceMemoryProperties;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceFeatures;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceFormatProperties;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceImageFormatProperties;
    public final @Nullable MethodHandle HANDLE$vkCreateDevice;
    public final @Nullable MethodHandle HANDLE$vkEnumerateDeviceLayerProperties;
    public final @Nullable MethodHandle HANDLE$vkEnumerateDeviceExtensionProperties;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties;
    public final @Nullable MethodHandle HANDLE$vkCreateAndroidSurfaceKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceDisplayPropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceDisplayPlanePropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDisplayPlaneSupportedDisplaysKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDisplayModePropertiesKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateDisplayModeKHR;
    public final @Nullable MethodHandle HANDLE$vkGetDisplayPlaneCapabilitiesKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateDisplayPlaneSurfaceKHR;
    public final @Nullable MethodHandle HANDLE$vkDestroySurfaceKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceSupportKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceCapabilitiesKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceFormatsKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfacePresentModesKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateViSurfaceNN;
    public final @Nullable MethodHandle HANDLE$vkCreateWaylandSurfaceKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceWaylandPresentationSupportKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateWin32SurfaceKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceWin32PresentationSupportKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateXlibSurfaceKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceXlibPresentationSupportKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateXcbSurfaceKHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceXcbPresentationSupportKHR;
    public final @Nullable MethodHandle HANDLE$vkCreateDirectFBSurfaceEXT;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceDirectFBPresentationSupportEXT;
    public final @Nullable MethodHandle HANDLE$vkCreateImagePipeSurfaceFUCHSIA;
    public final @Nullable MethodHandle HANDLE$vkCreateStreamDescriptorSurfaceGGP;
    public final @Nullable MethodHandle HANDLE$vkCreateScreenSurfaceQNX;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceScreenPresentationSupportQNX;
    public final @Nullable MethodHandle HANDLE$vkCreateDebugReportCallbackEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyDebugReportCallbackEXT;
    public final @Nullable MethodHandle HANDLE$vkDebugReportMessageEXT;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceExternalImageFormatPropertiesNV;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceFeatures2;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceProperties2;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceFormatProperties2;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceImageFormatProperties2;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceQueueFamilyProperties2;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceMemoryProperties2;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties2;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceExternalBufferProperties;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceExternalSemaphoreProperties;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceExternalFenceProperties;
    public final @Nullable MethodHandle HANDLE$vkReleaseDisplayEXT;
    public final @Nullable MethodHandle HANDLE$vkAcquireXlibDisplayEXT;
    public final @Nullable MethodHandle HANDLE$vkGetRandROutputDisplayEXT;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2EXT;
    public final @Nullable MethodHandle HANDLE$vkEnumeratePhysicalDeviceGroups;
    public final @Nullable MethodHandle HANDLE$vkCreateIOSSurfaceMVK;
    public final @Nullable MethodHandle HANDLE$vkCreateMacOSSurfaceMVK;
    public final @Nullable MethodHandle HANDLE$vkCreateMetalSurfaceEXT;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2KHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceSurfaceFormats2KHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceDisplayProperties2KHR;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceDisplayPlaneProperties2KHR;
    public final @Nullable MethodHandle HANDLE$vkGetDisplayModeProperties2KHR;
    public final @Nullable MethodHandle HANDLE$vkGetDisplayPlaneCapabilities2KHR;
    public final @Nullable MethodHandle HANDLE$vkSetDebugUtilsObjectNameEXT;
    public final @Nullable MethodHandle HANDLE$vkSetDebugUtilsObjectTagEXT;
    public final @Nullable MethodHandle HANDLE$vkQueueBeginDebugUtilsLabelEXT;
    public final @Nullable MethodHandle HANDLE$vkQueueEndDebugUtilsLabelEXT;
    public final @Nullable MethodHandle HANDLE$vkQueueInsertDebugUtilsLabelEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdBeginDebugUtilsLabelEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdEndDebugUtilsLabelEXT;
    public final @Nullable MethodHandle HANDLE$vkCmdInsertDebugUtilsLabelEXT;
    public final @Nullable MethodHandle HANDLE$vkCreateDebugUtilsMessengerEXT;
    public final @Nullable MethodHandle HANDLE$vkDestroyDebugUtilsMessengerEXT;
    public final @Nullable MethodHandle HANDLE$vkSubmitDebugUtilsMessageEXT;
    public final @Nullable MethodHandle HANDLE$vkCreateHeadlessSurfaceEXT;
    public final @Nullable MethodHandle HANDLE$vkGetPhysicalDeviceToolProperties;
    public final @Nullable MethodHandle HANDLE$vkAcquireDrmDisplayEXT;
    public final @Nullable MethodHandle HANDLE$vkGetDrmDisplayEXT;

    public InstanceCommands(RawFunctionLoader loader) {
        SEGMENT$vkDestroyInstance = loader.apply("vkDestroyInstance");
        HANDLE$vkDestroyInstance = RawFunctionLoader.link(SEGMENT$vkDestroyInstance, DESCRIPTOR$vkDestroyInstance);
        SEGMENT$vkEnumeratePhysicalDevices = loader.apply("vkEnumeratePhysicalDevices");
        HANDLE$vkEnumeratePhysicalDevices = RawFunctionLoader.link(SEGMENT$vkEnumeratePhysicalDevices, DESCRIPTOR$vkEnumeratePhysicalDevices);
        SEGMENT$vkGetPhysicalDeviceProperties = loader.apply("vkGetPhysicalDeviceProperties");
        HANDLE$vkGetPhysicalDeviceProperties = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceProperties, DESCRIPTOR$vkGetPhysicalDeviceProperties);
        SEGMENT$vkGetPhysicalDeviceQueueFamilyProperties = loader.apply("vkGetPhysicalDeviceQueueFamilyProperties");
        HANDLE$vkGetPhysicalDeviceQueueFamilyProperties = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceQueueFamilyProperties, DESCRIPTOR$vkGetPhysicalDeviceQueueFamilyProperties);
        SEGMENT$vkGetPhysicalDeviceMemoryProperties = loader.apply("vkGetPhysicalDeviceMemoryProperties");
        HANDLE$vkGetPhysicalDeviceMemoryProperties = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceMemoryProperties, DESCRIPTOR$vkGetPhysicalDeviceMemoryProperties);
        SEGMENT$vkGetPhysicalDeviceFeatures = loader.apply("vkGetPhysicalDeviceFeatures");
        HANDLE$vkGetPhysicalDeviceFeatures = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceFeatures, DESCRIPTOR$vkGetPhysicalDeviceFeatures);
        SEGMENT$vkGetPhysicalDeviceFormatProperties = loader.apply("vkGetPhysicalDeviceFormatProperties");
        HANDLE$vkGetPhysicalDeviceFormatProperties = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceFormatProperties, DESCRIPTOR$vkGetPhysicalDeviceFormatProperties);
        SEGMENT$vkGetPhysicalDeviceImageFormatProperties = loader.apply("vkGetPhysicalDeviceImageFormatProperties");
        HANDLE$vkGetPhysicalDeviceImageFormatProperties = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceImageFormatProperties, DESCRIPTOR$vkGetPhysicalDeviceImageFormatProperties);
        SEGMENT$vkCreateDevice = loader.apply("vkCreateDevice");
        HANDLE$vkCreateDevice = RawFunctionLoader.link(SEGMENT$vkCreateDevice, DESCRIPTOR$vkCreateDevice);
        SEGMENT$vkEnumerateDeviceLayerProperties = loader.apply("vkEnumerateDeviceLayerProperties");
        HANDLE$vkEnumerateDeviceLayerProperties = RawFunctionLoader.link(SEGMENT$vkEnumerateDeviceLayerProperties, DESCRIPTOR$vkEnumerateDeviceLayerProperties);
        SEGMENT$vkEnumerateDeviceExtensionProperties = loader.apply("vkEnumerateDeviceExtensionProperties");
        HANDLE$vkEnumerateDeviceExtensionProperties = RawFunctionLoader.link(SEGMENT$vkEnumerateDeviceExtensionProperties, DESCRIPTOR$vkEnumerateDeviceExtensionProperties);
        SEGMENT$vkGetPhysicalDeviceSparseImageFormatProperties = loader.apply("vkGetPhysicalDeviceSparseImageFormatProperties");
        HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSparseImageFormatProperties, DESCRIPTOR$vkGetPhysicalDeviceSparseImageFormatProperties);
        SEGMENT$vkCreateAndroidSurfaceKHR = loader.apply("vkCreateAndroidSurfaceKHR");
        HANDLE$vkCreateAndroidSurfaceKHR = RawFunctionLoader.link(SEGMENT$vkCreateAndroidSurfaceKHR, DESCRIPTOR$vkCreateAndroidSurfaceKHR);
        SEGMENT$vkGetPhysicalDeviceDisplayPropertiesKHR = loader.apply("vkGetPhysicalDeviceDisplayPropertiesKHR");
        HANDLE$vkGetPhysicalDeviceDisplayPropertiesKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceDisplayPropertiesKHR, DESCRIPTOR$vkGetPhysicalDeviceDisplayPropertiesKHR);
        SEGMENT$vkGetPhysicalDeviceDisplayPlanePropertiesKHR = loader.apply("vkGetPhysicalDeviceDisplayPlanePropertiesKHR");
        HANDLE$vkGetPhysicalDeviceDisplayPlanePropertiesKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceDisplayPlanePropertiesKHR, DESCRIPTOR$vkGetPhysicalDeviceDisplayPlanePropertiesKHR);
        SEGMENT$vkGetDisplayPlaneSupportedDisplaysKHR = loader.apply("vkGetDisplayPlaneSupportedDisplaysKHR");
        HANDLE$vkGetDisplayPlaneSupportedDisplaysKHR = RawFunctionLoader.link(SEGMENT$vkGetDisplayPlaneSupportedDisplaysKHR, DESCRIPTOR$vkGetDisplayPlaneSupportedDisplaysKHR);
        SEGMENT$vkGetDisplayModePropertiesKHR = loader.apply("vkGetDisplayModePropertiesKHR");
        HANDLE$vkGetDisplayModePropertiesKHR = RawFunctionLoader.link(SEGMENT$vkGetDisplayModePropertiesKHR, DESCRIPTOR$vkGetDisplayModePropertiesKHR);
        SEGMENT$vkCreateDisplayModeKHR = loader.apply("vkCreateDisplayModeKHR");
        HANDLE$vkCreateDisplayModeKHR = RawFunctionLoader.link(SEGMENT$vkCreateDisplayModeKHR, DESCRIPTOR$vkCreateDisplayModeKHR);
        SEGMENT$vkGetDisplayPlaneCapabilitiesKHR = loader.apply("vkGetDisplayPlaneCapabilitiesKHR");
        HANDLE$vkGetDisplayPlaneCapabilitiesKHR = RawFunctionLoader.link(SEGMENT$vkGetDisplayPlaneCapabilitiesKHR, DESCRIPTOR$vkGetDisplayPlaneCapabilitiesKHR);
        SEGMENT$vkCreateDisplayPlaneSurfaceKHR = loader.apply("vkCreateDisplayPlaneSurfaceKHR");
        HANDLE$vkCreateDisplayPlaneSurfaceKHR = RawFunctionLoader.link(SEGMENT$vkCreateDisplayPlaneSurfaceKHR, DESCRIPTOR$vkCreateDisplayPlaneSurfaceKHR);
        SEGMENT$vkDestroySurfaceKHR = loader.apply("vkDestroySurfaceKHR");
        HANDLE$vkDestroySurfaceKHR = RawFunctionLoader.link(SEGMENT$vkDestroySurfaceKHR, DESCRIPTOR$vkDestroySurfaceKHR);
        SEGMENT$vkGetPhysicalDeviceSurfaceSupportKHR = loader.apply("vkGetPhysicalDeviceSurfaceSupportKHR");
        HANDLE$vkGetPhysicalDeviceSurfaceSupportKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSurfaceSupportKHR, DESCRIPTOR$vkGetPhysicalDeviceSurfaceSupportKHR);
        SEGMENT$vkGetPhysicalDeviceSurfaceCapabilitiesKHR = loader.apply("vkGetPhysicalDeviceSurfaceCapabilitiesKHR");
        HANDLE$vkGetPhysicalDeviceSurfaceCapabilitiesKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSurfaceCapabilitiesKHR, DESCRIPTOR$vkGetPhysicalDeviceSurfaceCapabilitiesKHR);
        SEGMENT$vkGetPhysicalDeviceSurfaceFormatsKHR = loader.apply("vkGetPhysicalDeviceSurfaceFormatsKHR");
        HANDLE$vkGetPhysicalDeviceSurfaceFormatsKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSurfaceFormatsKHR, DESCRIPTOR$vkGetPhysicalDeviceSurfaceFormatsKHR);
        SEGMENT$vkGetPhysicalDeviceSurfacePresentModesKHR = loader.apply("vkGetPhysicalDeviceSurfacePresentModesKHR");
        HANDLE$vkGetPhysicalDeviceSurfacePresentModesKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSurfacePresentModesKHR, DESCRIPTOR$vkGetPhysicalDeviceSurfacePresentModesKHR);
        SEGMENT$vkCreateViSurfaceNN = loader.apply("vkCreateViSurfaceNN");
        HANDLE$vkCreateViSurfaceNN = RawFunctionLoader.link(SEGMENT$vkCreateViSurfaceNN, DESCRIPTOR$vkCreateViSurfaceNN);
        SEGMENT$vkCreateWaylandSurfaceKHR = loader.apply("vkCreateWaylandSurfaceKHR");
        HANDLE$vkCreateWaylandSurfaceKHR = RawFunctionLoader.link(SEGMENT$vkCreateWaylandSurfaceKHR, DESCRIPTOR$vkCreateWaylandSurfaceKHR);
        SEGMENT$vkGetPhysicalDeviceWaylandPresentationSupportKHR = loader.apply("vkGetPhysicalDeviceWaylandPresentationSupportKHR");
        HANDLE$vkGetPhysicalDeviceWaylandPresentationSupportKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceWaylandPresentationSupportKHR, DESCRIPTOR$vkGetPhysicalDeviceWaylandPresentationSupportKHR);
        SEGMENT$vkCreateWin32SurfaceKHR = loader.apply("vkCreateWin32SurfaceKHR");
        HANDLE$vkCreateWin32SurfaceKHR = RawFunctionLoader.link(SEGMENT$vkCreateWin32SurfaceKHR, DESCRIPTOR$vkCreateWin32SurfaceKHR);
        SEGMENT$vkGetPhysicalDeviceWin32PresentationSupportKHR = loader.apply("vkGetPhysicalDeviceWin32PresentationSupportKHR");
        HANDLE$vkGetPhysicalDeviceWin32PresentationSupportKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceWin32PresentationSupportKHR, DESCRIPTOR$vkGetPhysicalDeviceWin32PresentationSupportKHR);
        SEGMENT$vkCreateXlibSurfaceKHR = loader.apply("vkCreateXlibSurfaceKHR");
        HANDLE$vkCreateXlibSurfaceKHR = RawFunctionLoader.link(SEGMENT$vkCreateXlibSurfaceKHR, DESCRIPTOR$vkCreateXlibSurfaceKHR);
        SEGMENT$vkGetPhysicalDeviceXlibPresentationSupportKHR = loader.apply("vkGetPhysicalDeviceXlibPresentationSupportKHR");
        HANDLE$vkGetPhysicalDeviceXlibPresentationSupportKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceXlibPresentationSupportKHR, DESCRIPTOR$vkGetPhysicalDeviceXlibPresentationSupportKHR);
        SEGMENT$vkCreateXcbSurfaceKHR = loader.apply("vkCreateXcbSurfaceKHR");
        HANDLE$vkCreateXcbSurfaceKHR = RawFunctionLoader.link(SEGMENT$vkCreateXcbSurfaceKHR, DESCRIPTOR$vkCreateXcbSurfaceKHR);
        SEGMENT$vkGetPhysicalDeviceXcbPresentationSupportKHR = loader.apply("vkGetPhysicalDeviceXcbPresentationSupportKHR");
        HANDLE$vkGetPhysicalDeviceXcbPresentationSupportKHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceXcbPresentationSupportKHR, DESCRIPTOR$vkGetPhysicalDeviceXcbPresentationSupportKHR);
        SEGMENT$vkCreateDirectFBSurfaceEXT = loader.apply("vkCreateDirectFBSurfaceEXT");
        HANDLE$vkCreateDirectFBSurfaceEXT = RawFunctionLoader.link(SEGMENT$vkCreateDirectFBSurfaceEXT, DESCRIPTOR$vkCreateDirectFBSurfaceEXT);
        SEGMENT$vkGetPhysicalDeviceDirectFBPresentationSupportEXT = loader.apply("vkGetPhysicalDeviceDirectFBPresentationSupportEXT");
        HANDLE$vkGetPhysicalDeviceDirectFBPresentationSupportEXT = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceDirectFBPresentationSupportEXT, DESCRIPTOR$vkGetPhysicalDeviceDirectFBPresentationSupportEXT);
        SEGMENT$vkCreateImagePipeSurfaceFUCHSIA = loader.apply("vkCreateImagePipeSurfaceFUCHSIA");
        HANDLE$vkCreateImagePipeSurfaceFUCHSIA = RawFunctionLoader.link(SEGMENT$vkCreateImagePipeSurfaceFUCHSIA, DESCRIPTOR$vkCreateImagePipeSurfaceFUCHSIA);
        SEGMENT$vkCreateStreamDescriptorSurfaceGGP = loader.apply("vkCreateStreamDescriptorSurfaceGGP");
        HANDLE$vkCreateStreamDescriptorSurfaceGGP = RawFunctionLoader.link(SEGMENT$vkCreateStreamDescriptorSurfaceGGP, DESCRIPTOR$vkCreateStreamDescriptorSurfaceGGP);
        SEGMENT$vkCreateScreenSurfaceQNX = loader.apply("vkCreateScreenSurfaceQNX");
        HANDLE$vkCreateScreenSurfaceQNX = RawFunctionLoader.link(SEGMENT$vkCreateScreenSurfaceQNX, DESCRIPTOR$vkCreateScreenSurfaceQNX);
        SEGMENT$vkGetPhysicalDeviceScreenPresentationSupportQNX = loader.apply("vkGetPhysicalDeviceScreenPresentationSupportQNX");
        HANDLE$vkGetPhysicalDeviceScreenPresentationSupportQNX = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceScreenPresentationSupportQNX, DESCRIPTOR$vkGetPhysicalDeviceScreenPresentationSupportQNX);
        SEGMENT$vkCreateDebugReportCallbackEXT = loader.apply("vkCreateDebugReportCallbackEXT");
        HANDLE$vkCreateDebugReportCallbackEXT = RawFunctionLoader.link(SEGMENT$vkCreateDebugReportCallbackEXT, DESCRIPTOR$vkCreateDebugReportCallbackEXT);
        SEGMENT$vkDestroyDebugReportCallbackEXT = loader.apply("vkDestroyDebugReportCallbackEXT");
        HANDLE$vkDestroyDebugReportCallbackEXT = RawFunctionLoader.link(SEGMENT$vkDestroyDebugReportCallbackEXT, DESCRIPTOR$vkDestroyDebugReportCallbackEXT);
        SEGMENT$vkDebugReportMessageEXT = loader.apply("vkDebugReportMessageEXT");
        HANDLE$vkDebugReportMessageEXT = RawFunctionLoader.link(SEGMENT$vkDebugReportMessageEXT, DESCRIPTOR$vkDebugReportMessageEXT);
        SEGMENT$vkGetPhysicalDeviceExternalImageFormatPropertiesNV = loader.apply("vkGetPhysicalDeviceExternalImageFormatPropertiesNV");
        HANDLE$vkGetPhysicalDeviceExternalImageFormatPropertiesNV = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceExternalImageFormatPropertiesNV, DESCRIPTOR$vkGetPhysicalDeviceExternalImageFormatPropertiesNV);
        SEGMENT$vkGetPhysicalDeviceFeatures2 = loader.apply("vkGetPhysicalDeviceFeatures2");
        HANDLE$vkGetPhysicalDeviceFeatures2 = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceFeatures2, DESCRIPTOR$vkGetPhysicalDeviceFeatures2);
        SEGMENT$vkGetPhysicalDeviceProperties2 = loader.apply("vkGetPhysicalDeviceProperties2");
        HANDLE$vkGetPhysicalDeviceProperties2 = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceProperties2, DESCRIPTOR$vkGetPhysicalDeviceProperties2);
        SEGMENT$vkGetPhysicalDeviceFormatProperties2 = loader.apply("vkGetPhysicalDeviceFormatProperties2");
        HANDLE$vkGetPhysicalDeviceFormatProperties2 = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceFormatProperties2, DESCRIPTOR$vkGetPhysicalDeviceFormatProperties2);
        SEGMENT$vkGetPhysicalDeviceImageFormatProperties2 = loader.apply("vkGetPhysicalDeviceImageFormatProperties2");
        HANDLE$vkGetPhysicalDeviceImageFormatProperties2 = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceImageFormatProperties2, DESCRIPTOR$vkGetPhysicalDeviceImageFormatProperties2);
        SEGMENT$vkGetPhysicalDeviceQueueFamilyProperties2 = loader.apply("vkGetPhysicalDeviceQueueFamilyProperties2");
        HANDLE$vkGetPhysicalDeviceQueueFamilyProperties2 = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceQueueFamilyProperties2, DESCRIPTOR$vkGetPhysicalDeviceQueueFamilyProperties2);
        SEGMENT$vkGetPhysicalDeviceMemoryProperties2 = loader.apply("vkGetPhysicalDeviceMemoryProperties2");
        HANDLE$vkGetPhysicalDeviceMemoryProperties2 = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceMemoryProperties2, DESCRIPTOR$vkGetPhysicalDeviceMemoryProperties2);
        SEGMENT$vkGetPhysicalDeviceSparseImageFormatProperties2 = loader.apply("vkGetPhysicalDeviceSparseImageFormatProperties2");
        HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties2 = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSparseImageFormatProperties2, DESCRIPTOR$vkGetPhysicalDeviceSparseImageFormatProperties2);
        SEGMENT$vkGetPhysicalDeviceExternalBufferProperties = loader.apply("vkGetPhysicalDeviceExternalBufferProperties");
        HANDLE$vkGetPhysicalDeviceExternalBufferProperties = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceExternalBufferProperties, DESCRIPTOR$vkGetPhysicalDeviceExternalBufferProperties);
        SEGMENT$vkGetPhysicalDeviceExternalSemaphoreProperties = loader.apply("vkGetPhysicalDeviceExternalSemaphoreProperties");
        HANDLE$vkGetPhysicalDeviceExternalSemaphoreProperties = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceExternalSemaphoreProperties, DESCRIPTOR$vkGetPhysicalDeviceExternalSemaphoreProperties);
        SEGMENT$vkGetPhysicalDeviceExternalFenceProperties = loader.apply("vkGetPhysicalDeviceExternalFenceProperties");
        HANDLE$vkGetPhysicalDeviceExternalFenceProperties = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceExternalFenceProperties, DESCRIPTOR$vkGetPhysicalDeviceExternalFenceProperties);
        SEGMENT$vkReleaseDisplayEXT = loader.apply("vkReleaseDisplayEXT");
        HANDLE$vkReleaseDisplayEXT = RawFunctionLoader.link(SEGMENT$vkReleaseDisplayEXT, DESCRIPTOR$vkReleaseDisplayEXT);
        SEGMENT$vkAcquireXlibDisplayEXT = loader.apply("vkAcquireXlibDisplayEXT");
        HANDLE$vkAcquireXlibDisplayEXT = RawFunctionLoader.link(SEGMENT$vkAcquireXlibDisplayEXT, DESCRIPTOR$vkAcquireXlibDisplayEXT);
        SEGMENT$vkGetRandROutputDisplayEXT = loader.apply("vkGetRandROutputDisplayEXT");
        HANDLE$vkGetRandROutputDisplayEXT = RawFunctionLoader.link(SEGMENT$vkGetRandROutputDisplayEXT, DESCRIPTOR$vkGetRandROutputDisplayEXT);
        SEGMENT$vkGetPhysicalDeviceSurfaceCapabilities2EXT = loader.apply("vkGetPhysicalDeviceSurfaceCapabilities2EXT");
        HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2EXT = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSurfaceCapabilities2EXT, DESCRIPTOR$vkGetPhysicalDeviceSurfaceCapabilities2EXT);
        SEGMENT$vkEnumeratePhysicalDeviceGroups = loader.apply("vkEnumeratePhysicalDeviceGroups");
        HANDLE$vkEnumeratePhysicalDeviceGroups = RawFunctionLoader.link(SEGMENT$vkEnumeratePhysicalDeviceGroups, DESCRIPTOR$vkEnumeratePhysicalDeviceGroups);
        SEGMENT$vkCreateIOSSurfaceMVK = loader.apply("vkCreateIOSSurfaceMVK");
        HANDLE$vkCreateIOSSurfaceMVK = RawFunctionLoader.link(SEGMENT$vkCreateIOSSurfaceMVK, DESCRIPTOR$vkCreateIOSSurfaceMVK);
        SEGMENT$vkCreateMacOSSurfaceMVK = loader.apply("vkCreateMacOSSurfaceMVK");
        HANDLE$vkCreateMacOSSurfaceMVK = RawFunctionLoader.link(SEGMENT$vkCreateMacOSSurfaceMVK, DESCRIPTOR$vkCreateMacOSSurfaceMVK);
        SEGMENT$vkCreateMetalSurfaceEXT = loader.apply("vkCreateMetalSurfaceEXT");
        HANDLE$vkCreateMetalSurfaceEXT = RawFunctionLoader.link(SEGMENT$vkCreateMetalSurfaceEXT, DESCRIPTOR$vkCreateMetalSurfaceEXT);
        SEGMENT$vkGetPhysicalDeviceSurfaceCapabilities2KHR = loader.apply("vkGetPhysicalDeviceSurfaceCapabilities2KHR");
        HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2KHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSurfaceCapabilities2KHR, DESCRIPTOR$vkGetPhysicalDeviceSurfaceCapabilities2KHR);
        SEGMENT$vkGetPhysicalDeviceSurfaceFormats2KHR = loader.apply("vkGetPhysicalDeviceSurfaceFormats2KHR");
        HANDLE$vkGetPhysicalDeviceSurfaceFormats2KHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceSurfaceFormats2KHR, DESCRIPTOR$vkGetPhysicalDeviceSurfaceFormats2KHR);
        SEGMENT$vkGetPhysicalDeviceDisplayProperties2KHR = loader.apply("vkGetPhysicalDeviceDisplayProperties2KHR");
        HANDLE$vkGetPhysicalDeviceDisplayProperties2KHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceDisplayProperties2KHR, DESCRIPTOR$vkGetPhysicalDeviceDisplayProperties2KHR);
        SEGMENT$vkGetPhysicalDeviceDisplayPlaneProperties2KHR = loader.apply("vkGetPhysicalDeviceDisplayPlaneProperties2KHR");
        HANDLE$vkGetPhysicalDeviceDisplayPlaneProperties2KHR = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceDisplayPlaneProperties2KHR, DESCRIPTOR$vkGetPhysicalDeviceDisplayPlaneProperties2KHR);
        SEGMENT$vkGetDisplayModeProperties2KHR = loader.apply("vkGetDisplayModeProperties2KHR");
        HANDLE$vkGetDisplayModeProperties2KHR = RawFunctionLoader.link(SEGMENT$vkGetDisplayModeProperties2KHR, DESCRIPTOR$vkGetDisplayModeProperties2KHR);
        SEGMENT$vkGetDisplayPlaneCapabilities2KHR = loader.apply("vkGetDisplayPlaneCapabilities2KHR");
        HANDLE$vkGetDisplayPlaneCapabilities2KHR = RawFunctionLoader.link(SEGMENT$vkGetDisplayPlaneCapabilities2KHR, DESCRIPTOR$vkGetDisplayPlaneCapabilities2KHR);
        SEGMENT$vkSetDebugUtilsObjectNameEXT = loader.apply("vkSetDebugUtilsObjectNameEXT");
        HANDLE$vkSetDebugUtilsObjectNameEXT = RawFunctionLoader.link(SEGMENT$vkSetDebugUtilsObjectNameEXT, DESCRIPTOR$vkSetDebugUtilsObjectNameEXT);
        SEGMENT$vkSetDebugUtilsObjectTagEXT = loader.apply("vkSetDebugUtilsObjectTagEXT");
        HANDLE$vkSetDebugUtilsObjectTagEXT = RawFunctionLoader.link(SEGMENT$vkSetDebugUtilsObjectTagEXT, DESCRIPTOR$vkSetDebugUtilsObjectTagEXT);
        SEGMENT$vkQueueBeginDebugUtilsLabelEXT = loader.apply("vkQueueBeginDebugUtilsLabelEXT");
        HANDLE$vkQueueBeginDebugUtilsLabelEXT = RawFunctionLoader.link(SEGMENT$vkQueueBeginDebugUtilsLabelEXT, DESCRIPTOR$vkQueueBeginDebugUtilsLabelEXT);
        SEGMENT$vkQueueEndDebugUtilsLabelEXT = loader.apply("vkQueueEndDebugUtilsLabelEXT");
        HANDLE$vkQueueEndDebugUtilsLabelEXT = RawFunctionLoader.link(SEGMENT$vkQueueEndDebugUtilsLabelEXT, DESCRIPTOR$vkQueueEndDebugUtilsLabelEXT);
        SEGMENT$vkQueueInsertDebugUtilsLabelEXT = loader.apply("vkQueueInsertDebugUtilsLabelEXT");
        HANDLE$vkQueueInsertDebugUtilsLabelEXT = RawFunctionLoader.link(SEGMENT$vkQueueInsertDebugUtilsLabelEXT, DESCRIPTOR$vkQueueInsertDebugUtilsLabelEXT);
        SEGMENT$vkCmdBeginDebugUtilsLabelEXT = loader.apply("vkCmdBeginDebugUtilsLabelEXT");
        HANDLE$vkCmdBeginDebugUtilsLabelEXT = RawFunctionLoader.link(SEGMENT$vkCmdBeginDebugUtilsLabelEXT, DESCRIPTOR$vkCmdBeginDebugUtilsLabelEXT);
        SEGMENT$vkCmdEndDebugUtilsLabelEXT = loader.apply("vkCmdEndDebugUtilsLabelEXT");
        HANDLE$vkCmdEndDebugUtilsLabelEXT = RawFunctionLoader.link(SEGMENT$vkCmdEndDebugUtilsLabelEXT, DESCRIPTOR$vkCmdEndDebugUtilsLabelEXT);
        SEGMENT$vkCmdInsertDebugUtilsLabelEXT = loader.apply("vkCmdInsertDebugUtilsLabelEXT");
        HANDLE$vkCmdInsertDebugUtilsLabelEXT = RawFunctionLoader.link(SEGMENT$vkCmdInsertDebugUtilsLabelEXT, DESCRIPTOR$vkCmdInsertDebugUtilsLabelEXT);
        SEGMENT$vkCreateDebugUtilsMessengerEXT = loader.apply("vkCreateDebugUtilsMessengerEXT");
        HANDLE$vkCreateDebugUtilsMessengerEXT = RawFunctionLoader.link(SEGMENT$vkCreateDebugUtilsMessengerEXT, DESCRIPTOR$vkCreateDebugUtilsMessengerEXT);
        SEGMENT$vkDestroyDebugUtilsMessengerEXT = loader.apply("vkDestroyDebugUtilsMessengerEXT");
        HANDLE$vkDestroyDebugUtilsMessengerEXT = RawFunctionLoader.link(SEGMENT$vkDestroyDebugUtilsMessengerEXT, DESCRIPTOR$vkDestroyDebugUtilsMessengerEXT);
        SEGMENT$vkSubmitDebugUtilsMessageEXT = loader.apply("vkSubmitDebugUtilsMessageEXT");
        HANDLE$vkSubmitDebugUtilsMessageEXT = RawFunctionLoader.link(SEGMENT$vkSubmitDebugUtilsMessageEXT, DESCRIPTOR$vkSubmitDebugUtilsMessageEXT);
        SEGMENT$vkCreateHeadlessSurfaceEXT = loader.apply("vkCreateHeadlessSurfaceEXT");
        HANDLE$vkCreateHeadlessSurfaceEXT = RawFunctionLoader.link(SEGMENT$vkCreateHeadlessSurfaceEXT, DESCRIPTOR$vkCreateHeadlessSurfaceEXT);
        SEGMENT$vkGetPhysicalDeviceToolProperties = loader.apply("vkGetPhysicalDeviceToolProperties");
        HANDLE$vkGetPhysicalDeviceToolProperties = RawFunctionLoader.link(SEGMENT$vkGetPhysicalDeviceToolProperties, DESCRIPTOR$vkGetPhysicalDeviceToolProperties);
        SEGMENT$vkAcquireDrmDisplayEXT = loader.apply("vkAcquireDrmDisplayEXT");
        HANDLE$vkAcquireDrmDisplayEXT = RawFunctionLoader.link(SEGMENT$vkAcquireDrmDisplayEXT, DESCRIPTOR$vkAcquireDrmDisplayEXT);
        SEGMENT$vkGetDrmDisplayEXT = loader.apply("vkGetDrmDisplayEXT");
        HANDLE$vkGetDrmDisplayEXT = RawFunctionLoader.link(SEGMENT$vkGetDrmDisplayEXT, DESCRIPTOR$vkGetDrmDisplayEXT);
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyInstance.html">vkDestroyInstance</a>
    public void vkDestroyInstance(
            @Nullable VkInstance instance,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyInstance.invokeExact(
                    (MemorySegment) (instance != null ? instance.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkEnumeratePhysicalDevices.html">vkEnumeratePhysicalDevices</a>
    public @enumtype(VkResult.class) int vkEnumeratePhysicalDevices(
            VkInstance instance,
            @unsigned IntBuffer pPhysicalDeviceCount,
            @Nullable @pointer(target=VkPhysicalDevice.class) VkPhysicalDevice.Buffer pPhysicalDevices
    ) {
        try {
            return (int) HANDLE$vkEnumeratePhysicalDevices.invokeExact(
                    instance.segment(),
                    pPhysicalDeviceCount.segment(),
                    (MemorySegment) (pPhysicalDevices != null ? pPhysicalDevices.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceProperties.html">vkGetPhysicalDeviceProperties</a>
    public void vkGetPhysicalDeviceProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceProperties.class) VkPhysicalDeviceProperties pProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceProperties.invokeExact(
                    physicalDevice.segment(),
                    pProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceQueueFamilyProperties.html">vkGetPhysicalDeviceQueueFamilyProperties</a>
    public void vkGetPhysicalDeviceQueueFamilyProperties(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pQueueFamilyPropertyCount,
            @Nullable @pointer(target=VkQueueFamilyProperties.class) VkQueueFamilyProperties pQueueFamilyProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceQueueFamilyProperties.invokeExact(
                    physicalDevice.segment(),
                    pQueueFamilyPropertyCount.segment(),
                    (MemorySegment) (pQueueFamilyProperties != null ? pQueueFamilyProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceMemoryProperties.html">vkGetPhysicalDeviceMemoryProperties</a>
    public void vkGetPhysicalDeviceMemoryProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceMemoryProperties.class) VkPhysicalDeviceMemoryProperties pMemoryProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceMemoryProperties.invokeExact(
                    physicalDevice.segment(),
                    pMemoryProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceFeatures.html">vkGetPhysicalDeviceFeatures</a>
    public void vkGetPhysicalDeviceFeatures(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceFeatures.class) VkPhysicalDeviceFeatures pFeatures
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceFeatures.invokeExact(
                    physicalDevice.segment(),
                    pFeatures.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceFormatProperties.html">vkGetPhysicalDeviceFormatProperties</a>
    public void vkGetPhysicalDeviceFormatProperties(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkFormat.class) int format,
            @pointer(target=VkFormatProperties.class) VkFormatProperties pFormatProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceFormatProperties.invokeExact(
                    physicalDevice.segment(),
                    format,
                    pFormatProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceImageFormatProperties.html">vkGetPhysicalDeviceImageFormatProperties</a>
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
            return (int) HANDLE$vkGetPhysicalDeviceImageFormatProperties.invokeExact(
                    physicalDevice.segment(),
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

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateDevice.html">vkCreateDevice</a>
    public @enumtype(VkResult.class) int vkCreateDevice(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkDeviceCreateInfo.class) VkDeviceCreateInfo pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDevice.class) VkDevice.Buffer pDevice
    ) {
        try {
            return (int) HANDLE$vkCreateDevice.invokeExact(
                    physicalDevice.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pDevice.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkEnumerateDeviceLayerProperties.html">vkEnumerateDeviceLayerProperties</a>
    public @enumtype(VkResult.class) int vkEnumerateDeviceLayerProperties(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkLayerProperties.class) VkLayerProperties pProperties
    ) {
        try {
            return (int) HANDLE$vkEnumerateDeviceLayerProperties.invokeExact(
                    physicalDevice.segment(),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkEnumerateDeviceExtensionProperties.html">vkEnumerateDeviceExtensionProperties</a>
    public @enumtype(VkResult.class) int vkEnumerateDeviceExtensionProperties(
            VkPhysicalDevice physicalDevice,
            @Nullable ByteBuffer pLayerName,
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkExtensionProperties.class) VkExtensionProperties pProperties
    ) {
        try {
            return (int) HANDLE$vkEnumerateDeviceExtensionProperties.invokeExact(
                    physicalDevice.segment(),
                    (MemorySegment) (pLayerName != null ? pLayerName.segment() : MemorySegment.NULL),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSparseImageFormatProperties.html">vkGetPhysicalDeviceSparseImageFormatProperties</a>
    public void vkGetPhysicalDeviceSparseImageFormatProperties(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkFormat.class) int format,
            @enumtype(VkImageType.class) int type,
            @enumtype(VkSampleCountFlags.class) int samples,
            @enumtype(VkImageUsageFlags.class) int usage,
            @enumtype(VkImageTiling.class) int tiling,
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkSparseImageFormatProperties.class) VkSparseImageFormatProperties pProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties.invokeExact(
                    physicalDevice.segment(),
                    format,
                    type,
                    samples,
                    usage,
                    tiling,
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateAndroidSurfaceKHR.html">vkCreateAndroidSurfaceKHR</a>
    public @enumtype(VkResult.class) int vkCreateAndroidSurfaceKHR(
            VkInstance instance,
            @pointer(target=VkAndroidSurfaceCreateInfoKHR.class) VkAndroidSurfaceCreateInfoKHR pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateAndroidSurfaceKHR.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceDisplayPropertiesKHR.html">vkGetPhysicalDeviceDisplayPropertiesKHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayPropertiesKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkDisplayPropertiesKHR.class) VkDisplayPropertiesKHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayPropertiesKHR.invokeExact(
                    physicalDevice.segment(),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceDisplayPlanePropertiesKHR.html">vkGetPhysicalDeviceDisplayPlanePropertiesKHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayPlanePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkDisplayPlanePropertiesKHR.class) VkDisplayPlanePropertiesKHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayPlanePropertiesKHR.invokeExact(
                    physicalDevice.segment(),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDisplayPlaneSupportedDisplaysKHR.html">vkGetDisplayPlaneSupportedDisplaysKHR</a>
    public @enumtype(VkResult.class) int vkGetDisplayPlaneSupportedDisplaysKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int planeIndex,
            @unsigned IntBuffer pDisplayCount,
            @Nullable @pointer(target=VkDisplayKHR.class) VkDisplayKHR.Buffer pDisplays
    ) {
        try {
            return (int) HANDLE$vkGetDisplayPlaneSupportedDisplaysKHR.invokeExact(
                    physicalDevice.segment(),
                    planeIndex,
                    pDisplayCount.segment(),
                    (MemorySegment) (pDisplays != null ? pDisplays.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDisplayModePropertiesKHR.html">vkGetDisplayModePropertiesKHR</a>
    public @enumtype(VkResult.class) int vkGetDisplayModePropertiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkDisplayModePropertiesKHR.class) VkDisplayModePropertiesKHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetDisplayModePropertiesKHR.invokeExact(
                    physicalDevice.segment(),
                    display.segment(),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateDisplayModeKHR.html">vkCreateDisplayModeKHR</a>
    public @enumtype(VkResult.class) int vkCreateDisplayModeKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            @pointer(target=VkDisplayModeCreateInfoKHR.class) VkDisplayModeCreateInfoKHR pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDisplayModeKHR.class) VkDisplayModeKHR.Buffer pMode
    ) {
        try {
            return (int) HANDLE$vkCreateDisplayModeKHR.invokeExact(
                    physicalDevice.segment(),
                    display.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pMode.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDisplayPlaneCapabilitiesKHR.html">vkGetDisplayPlaneCapabilitiesKHR</a>
    public @enumtype(VkResult.class) int vkGetDisplayPlaneCapabilitiesKHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayModeKHR mode,
            @unsigned int planeIndex,
            @pointer(target=VkDisplayPlaneCapabilitiesKHR.class) VkDisplayPlaneCapabilitiesKHR pCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetDisplayPlaneCapabilitiesKHR.invokeExact(
                    physicalDevice.segment(),
                    mode.segment(),
                    planeIndex,
                    pCapabilities.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateDisplayPlaneSurfaceKHR.html">vkCreateDisplayPlaneSurfaceKHR</a>
    public @enumtype(VkResult.class) int vkCreateDisplayPlaneSurfaceKHR(
            VkInstance instance,
            @pointer(target=VkDisplaySurfaceCreateInfoKHR.class) VkDisplaySurfaceCreateInfoKHR pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateDisplayPlaneSurfaceKHR.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroySurfaceKHR.html">vkDestroySurfaceKHR</a>
    public void vkDestroySurfaceKHR(
            VkInstance instance,
            @Nullable VkSurfaceKHR surface,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroySurfaceKHR.invokeExact(
                    instance.segment(),
                    (MemorySegment) (surface != null ? surface.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSurfaceSupportKHR.html">vkGetPhysicalDeviceSurfaceSupportKHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceSupportKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            VkSurfaceKHR surface,
            @unsigned IntBuffer pSupported
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceSupportKHR.invokeExact(
                    physicalDevice.segment(),
                    queueFamilyIndex,
                    surface.segment(),
                    pSupported.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSurfaceCapabilitiesKHR.html">vkGetPhysicalDeviceSurfaceCapabilitiesKHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            @pointer(target=VkSurfaceCapabilitiesKHR.class) VkSurfaceCapabilitiesKHR pSurfaceCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceCapabilitiesKHR.invokeExact(
                    physicalDevice.segment(),
                    surface.segment(),
                    pSurfaceCapabilities.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSurfaceFormatsKHR.html">vkGetPhysicalDeviceSurfaceFormatsKHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceFormatsKHR(
            VkPhysicalDevice physicalDevice,
            @Nullable VkSurfaceKHR surface,
            @unsigned IntBuffer pSurfaceFormatCount,
            @Nullable @pointer(target=VkSurfaceFormatKHR.class) VkSurfaceFormatKHR pSurfaceFormats
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceFormatsKHR.invokeExact(
                    physicalDevice.segment(),
                    (MemorySegment) (surface != null ? surface.segment() : MemorySegment.NULL),
                    pSurfaceFormatCount.segment(),
                    (MemorySegment) (pSurfaceFormats != null ? pSurfaceFormats.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSurfacePresentModesKHR.html">vkGetPhysicalDeviceSurfacePresentModesKHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfacePresentModesKHR(
            VkPhysicalDevice physicalDevice,
            @Nullable VkSurfaceKHR surface,
            @unsigned IntBuffer pPresentModeCount,
            @Nullable @enumtype(VkPresentModeKHR.class) IntBuffer pPresentModes
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfacePresentModesKHR.invokeExact(
                    physicalDevice.segment(),
                    (MemorySegment) (surface != null ? surface.segment() : MemorySegment.NULL),
                    pPresentModeCount.segment(),
                    (MemorySegment) (pPresentModes != null ? pPresentModes.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateViSurfaceNN.html">vkCreateViSurfaceNN</a>
    public @enumtype(VkResult.class) int vkCreateViSurfaceNN(
            VkInstance instance,
            @pointer(target=VkViSurfaceCreateInfoNN.class) VkViSurfaceCreateInfoNN pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateViSurfaceNN.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateWaylandSurfaceKHR.html">vkCreateWaylandSurfaceKHR</a>
    public @enumtype(VkResult.class) int vkCreateWaylandSurfaceKHR(
            VkInstance instance,
            @pointer(target=VkWaylandSurfaceCreateInfoKHR.class) VkWaylandSurfaceCreateInfoKHR pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateWaylandSurfaceKHR.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceWaylandPresentationSupportKHR.html">vkGetPhysicalDeviceWaylandPresentationSupportKHR</a>
    public @unsigned int vkGetPhysicalDeviceWaylandPresentationSupportKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @pointer(comment="void*") MemorySegment display
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceWaylandPresentationSupportKHR.invokeExact(
                    physicalDevice.segment(),
                    queueFamilyIndex,
                    display
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateWin32SurfaceKHR.html">vkCreateWin32SurfaceKHR</a>
    public @enumtype(VkResult.class) int vkCreateWin32SurfaceKHR(
            VkInstance instance,
            @pointer(target=VkWin32SurfaceCreateInfoKHR.class) VkWin32SurfaceCreateInfoKHR pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateWin32SurfaceKHR.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceWin32PresentationSupportKHR.html">vkGetPhysicalDeviceWin32PresentationSupportKHR</a>
    public @unsigned int vkGetPhysicalDeviceWin32PresentationSupportKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceWin32PresentationSupportKHR.invokeExact(
                    physicalDevice.segment(),
                    queueFamilyIndex
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateXlibSurfaceKHR.html">vkCreateXlibSurfaceKHR</a>
    public @enumtype(VkResult.class) int vkCreateXlibSurfaceKHR(
            VkInstance instance,
            @pointer(target=VkXlibSurfaceCreateInfoKHR.class) VkXlibSurfaceCreateInfoKHR pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateXlibSurfaceKHR.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceXlibPresentationSupportKHR.html">vkGetPhysicalDeviceXlibPresentationSupportKHR</a>
    public @unsigned int vkGetPhysicalDeviceXlibPresentationSupportKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @pointer(comment="void **") MemorySegment dpy,
            long visualID
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceXlibPresentationSupportKHR.invokeExact(
                    physicalDevice.segment(),
                    queueFamilyIndex,
                    dpy,
                    visualID
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateXcbSurfaceKHR.html">vkCreateXcbSurfaceKHR</a>
    public @enumtype(VkResult.class) int vkCreateXcbSurfaceKHR(
            VkInstance instance,
            @pointer(target=VkXcbSurfaceCreateInfoKHR.class) VkXcbSurfaceCreateInfoKHR pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateXcbSurfaceKHR.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceXcbPresentationSupportKHR.html">vkGetPhysicalDeviceXcbPresentationSupportKHR</a>
    public @unsigned int vkGetPhysicalDeviceXcbPresentationSupportKHR(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @pointer(comment="void*") MemorySegment connection,
            @unsigned int visual_id
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceXcbPresentationSupportKHR.invokeExact(
                    physicalDevice.segment(),
                    queueFamilyIndex,
                    connection,
                    visual_id
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateDirectFBSurfaceEXT.html">vkCreateDirectFBSurfaceEXT</a>
    public @enumtype(VkResult.class) int vkCreateDirectFBSurfaceEXT(
            VkInstance instance,
            @pointer(target=VkDirectFBSurfaceCreateInfoEXT.class) VkDirectFBSurfaceCreateInfoEXT pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateDirectFBSurfaceEXT.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceDirectFBPresentationSupportEXT.html">vkGetPhysicalDeviceDirectFBPresentationSupportEXT</a>
    public @unsigned int vkGetPhysicalDeviceDirectFBPresentationSupportEXT(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @pointer(comment="void*") MemorySegment dfb
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDirectFBPresentationSupportEXT.invokeExact(
                    physicalDevice.segment(),
                    queueFamilyIndex,
                    dfb
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateImagePipeSurfaceFUCHSIA.html">vkCreateImagePipeSurfaceFUCHSIA</a>
    public @enumtype(VkResult.class) int vkCreateImagePipeSurfaceFUCHSIA(
            VkInstance instance,
            @pointer(target=VkImagePipeSurfaceCreateInfoFUCHSIA.class) VkImagePipeSurfaceCreateInfoFUCHSIA pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateImagePipeSurfaceFUCHSIA.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateStreamDescriptorSurfaceGGP.html">vkCreateStreamDescriptorSurfaceGGP</a>
    public @enumtype(VkResult.class) int vkCreateStreamDescriptorSurfaceGGP(
            VkInstance instance,
            @pointer(target=VkStreamDescriptorSurfaceCreateInfoGGP.class) VkStreamDescriptorSurfaceCreateInfoGGP pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateStreamDescriptorSurfaceGGP.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateScreenSurfaceQNX.html">vkCreateScreenSurfaceQNX</a>
    public @enumtype(VkResult.class) int vkCreateScreenSurfaceQNX(
            VkInstance instance,
            @pointer(target=VkScreenSurfaceCreateInfoQNX.class) VkScreenSurfaceCreateInfoQNX pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateScreenSurfaceQNX.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceScreenPresentationSupportQNX.html">vkGetPhysicalDeviceScreenPresentationSupportQNX</a>
    public @unsigned int vkGetPhysicalDeviceScreenPresentationSupportQNX(
            VkPhysicalDevice physicalDevice,
            @unsigned int queueFamilyIndex,
            @pointer(comment="void*") MemorySegment window
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceScreenPresentationSupportQNX.invokeExact(
                    physicalDevice.segment(),
                    queueFamilyIndex,
                    window
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateDebugReportCallbackEXT.html">vkCreateDebugReportCallbackEXT</a>
    public @enumtype(VkResult.class) int vkCreateDebugReportCallbackEXT(
            VkInstance instance,
            @pointer(target=VkDebugReportCallbackCreateInfoEXT.class) VkDebugReportCallbackCreateInfoEXT pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDebugReportCallbackEXT.class) VkDebugReportCallbackEXT.Buffer pCallback
    ) {
        try {
            return (int) HANDLE$vkCreateDebugReportCallbackEXT.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pCallback.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyDebugReportCallbackEXT.html">vkDestroyDebugReportCallbackEXT</a>
    public void vkDestroyDebugReportCallbackEXT(
            VkInstance instance,
            @Nullable VkDebugReportCallbackEXT callback,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDebugReportCallbackEXT.invokeExact(
                    instance.segment(),
                    (MemorySegment) (callback != null ? callback.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDebugReportMessageEXT.html">vkDebugReportMessageEXT</a>
    public void vkDebugReportMessageEXT(
            VkInstance instance,
            @enumtype(VkDebugReportFlagsEXT.class) int flags,
            @enumtype(VkDebugReportObjectTypeEXT.class) int objectType,
            @unsigned long object,
            @unsigned long location,
            int messageCode,
            ByteBuffer pLayerPrefix,
            ByteBuffer pMessage
    ) {
        try {
            HANDLE$vkDebugReportMessageEXT.invokeExact(
                    instance.segment(),
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

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceExternalImageFormatPropertiesNV.html">vkGetPhysicalDeviceExternalImageFormatPropertiesNV</a>
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
            return (int) HANDLE$vkGetPhysicalDeviceExternalImageFormatPropertiesNV.invokeExact(
                    physicalDevice.segment(),
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

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceFeatures2.html">vkGetPhysicalDeviceFeatures2</a>
    public void vkGetPhysicalDeviceFeatures2(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceFeatures2.class) VkPhysicalDeviceFeatures2 pFeatures
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceFeatures2.invokeExact(
                    physicalDevice.segment(),
                    pFeatures.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceProperties2.html">vkGetPhysicalDeviceProperties2</a>
    public void vkGetPhysicalDeviceProperties2(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceProperties2.class) VkPhysicalDeviceProperties2 pProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceProperties2.invokeExact(
                    physicalDevice.segment(),
                    pProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceFormatProperties2.html">vkGetPhysicalDeviceFormatProperties2</a>
    public void vkGetPhysicalDeviceFormatProperties2(
            VkPhysicalDevice physicalDevice,
            @enumtype(VkFormat.class) int format,
            @pointer(target=VkFormatProperties2.class) VkFormatProperties2 pFormatProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceFormatProperties2.invokeExact(
                    physicalDevice.segment(),
                    format,
                    pFormatProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceImageFormatProperties2.html">vkGetPhysicalDeviceImageFormatProperties2</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceImageFormatProperties2(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceImageFormatInfo2.class) VkPhysicalDeviceImageFormatInfo2 pImageFormatInfo,
            @pointer(target=VkImageFormatProperties2.class) VkImageFormatProperties2 pImageFormatProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceImageFormatProperties2.invokeExact(
                    physicalDevice.segment(),
                    pImageFormatInfo.segment(),
                    pImageFormatProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceQueueFamilyProperties2.html">vkGetPhysicalDeviceQueueFamilyProperties2</a>
    public void vkGetPhysicalDeviceQueueFamilyProperties2(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pQueueFamilyPropertyCount,
            @Nullable @pointer(target=VkQueueFamilyProperties2.class) VkQueueFamilyProperties2 pQueueFamilyProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceQueueFamilyProperties2.invokeExact(
                    physicalDevice.segment(),
                    pQueueFamilyPropertyCount.segment(),
                    (MemorySegment) (pQueueFamilyProperties != null ? pQueueFamilyProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceMemoryProperties2.html">vkGetPhysicalDeviceMemoryProperties2</a>
    public void vkGetPhysicalDeviceMemoryProperties2(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceMemoryProperties2.class) VkPhysicalDeviceMemoryProperties2 pMemoryProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceMemoryProperties2.invokeExact(
                    physicalDevice.segment(),
                    pMemoryProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSparseImageFormatProperties2.html">vkGetPhysicalDeviceSparseImageFormatProperties2</a>
    public void vkGetPhysicalDeviceSparseImageFormatProperties2(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceSparseImageFormatInfo2.class) VkPhysicalDeviceSparseImageFormatInfo2 pFormatInfo,
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkSparseImageFormatProperties2.class) VkSparseImageFormatProperties2 pProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceSparseImageFormatProperties2.invokeExact(
                    physicalDevice.segment(),
                    pFormatInfo.segment(),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceExternalBufferProperties.html">vkGetPhysicalDeviceExternalBufferProperties</a>
    public void vkGetPhysicalDeviceExternalBufferProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceExternalBufferInfo.class) VkPhysicalDeviceExternalBufferInfo pExternalBufferInfo,
            @pointer(target=VkExternalBufferProperties.class) VkExternalBufferProperties pExternalBufferProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceExternalBufferProperties.invokeExact(
                    physicalDevice.segment(),
                    pExternalBufferInfo.segment(),
                    pExternalBufferProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceExternalSemaphoreProperties.html">vkGetPhysicalDeviceExternalSemaphoreProperties</a>
    public void vkGetPhysicalDeviceExternalSemaphoreProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceExternalSemaphoreInfo.class) VkPhysicalDeviceExternalSemaphoreInfo pExternalSemaphoreInfo,
            @pointer(target=VkExternalSemaphoreProperties.class) VkExternalSemaphoreProperties pExternalSemaphoreProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceExternalSemaphoreProperties.invokeExact(
                    physicalDevice.segment(),
                    pExternalSemaphoreInfo.segment(),
                    pExternalSemaphoreProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceExternalFenceProperties.html">vkGetPhysicalDeviceExternalFenceProperties</a>
    public void vkGetPhysicalDeviceExternalFenceProperties(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceExternalFenceInfo.class) VkPhysicalDeviceExternalFenceInfo pExternalFenceInfo,
            @pointer(target=VkExternalFenceProperties.class) VkExternalFenceProperties pExternalFenceProperties
    ) {
        try {
            HANDLE$vkGetPhysicalDeviceExternalFenceProperties.invokeExact(
                    physicalDevice.segment(),
                    pExternalFenceInfo.segment(),
                    pExternalFenceProperties.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkReleaseDisplayEXT.html">vkReleaseDisplayEXT</a>
    public @enumtype(VkResult.class) int vkReleaseDisplayEXT(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display
    ) {
        try {
            return (int) HANDLE$vkReleaseDisplayEXT.invokeExact(
                    physicalDevice.segment(),
                    display.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAcquireXlibDisplayEXT.html">vkAcquireXlibDisplayEXT</a>
    public @enumtype(VkResult.class) int vkAcquireXlibDisplayEXT(
            VkPhysicalDevice physicalDevice,
            @pointer(comment="void **") MemorySegment dpy,
            VkDisplayKHR display
    ) {
        try {
            return (int) HANDLE$vkAcquireXlibDisplayEXT.invokeExact(
                    physicalDevice.segment(),
                    dpy,
                    display.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetRandROutputDisplayEXT.html">vkGetRandROutputDisplayEXT</a>
    public @enumtype(VkResult.class) int vkGetRandROutputDisplayEXT(
            VkPhysicalDevice physicalDevice,
            @pointer(comment="void **") MemorySegment dpy,
            long rrOutput,
            @pointer(target=VkDisplayKHR.class) VkDisplayKHR.Buffer pDisplay
    ) {
        try {
            return (int) HANDLE$vkGetRandROutputDisplayEXT.invokeExact(
                    physicalDevice.segment(),
                    dpy,
                    rrOutput,
                    pDisplay.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSurfaceCapabilities2EXT.html">vkGetPhysicalDeviceSurfaceCapabilities2EXT</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceCapabilities2EXT(
            VkPhysicalDevice physicalDevice,
            VkSurfaceKHR surface,
            @pointer(target=VkSurfaceCapabilities2EXT.class) VkSurfaceCapabilities2EXT pSurfaceCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2EXT.invokeExact(
                    physicalDevice.segment(),
                    surface.segment(),
                    pSurfaceCapabilities.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkEnumeratePhysicalDeviceGroups.html">vkEnumeratePhysicalDeviceGroups</a>
    public @enumtype(VkResult.class) int vkEnumeratePhysicalDeviceGroups(
            VkInstance instance,
            @unsigned IntBuffer pPhysicalDeviceGroupCount,
            @Nullable @pointer(target=VkPhysicalDeviceGroupProperties.class) VkPhysicalDeviceGroupProperties pPhysicalDeviceGroupProperties
    ) {
        try {
            return (int) HANDLE$vkEnumeratePhysicalDeviceGroups.invokeExact(
                    instance.segment(),
                    pPhysicalDeviceGroupCount.segment(),
                    (MemorySegment) (pPhysicalDeviceGroupProperties != null ? pPhysicalDeviceGroupProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateIOSSurfaceMVK.html">vkCreateIOSSurfaceMVK</a>
    public @enumtype(VkResult.class) int vkCreateIOSSurfaceMVK(
            VkInstance instance,
            @pointer(target=VkIOSSurfaceCreateInfoMVK.class) VkIOSSurfaceCreateInfoMVK pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateIOSSurfaceMVK.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateMacOSSurfaceMVK.html">vkCreateMacOSSurfaceMVK</a>
    public @enumtype(VkResult.class) int vkCreateMacOSSurfaceMVK(
            VkInstance instance,
            @pointer(target=VkMacOSSurfaceCreateInfoMVK.class) VkMacOSSurfaceCreateInfoMVK pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateMacOSSurfaceMVK.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateMetalSurfaceEXT.html">vkCreateMetalSurfaceEXT</a>
    public @enumtype(VkResult.class) int vkCreateMetalSurfaceEXT(
            VkInstance instance,
            @pointer(target=VkMetalSurfaceCreateInfoEXT.class) VkMetalSurfaceCreateInfoEXT pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateMetalSurfaceEXT.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSurfaceCapabilities2KHR.html">vkGetPhysicalDeviceSurfaceCapabilities2KHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceCapabilities2KHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceSurfaceInfo2KHR.class) VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo,
            @pointer(target=VkSurfaceCapabilities2KHR.class) VkSurfaceCapabilities2KHR pSurfaceCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceCapabilities2KHR.invokeExact(
                    physicalDevice.segment(),
                    pSurfaceInfo.segment(),
                    pSurfaceCapabilities.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceSurfaceFormats2KHR.html">vkGetPhysicalDeviceSurfaceFormats2KHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceSurfaceFormats2KHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkPhysicalDeviceSurfaceInfo2KHR.class) VkPhysicalDeviceSurfaceInfo2KHR pSurfaceInfo,
            @unsigned IntBuffer pSurfaceFormatCount,
            @Nullable @pointer(target=VkSurfaceFormat2KHR.class) VkSurfaceFormat2KHR pSurfaceFormats
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceSurfaceFormats2KHR.invokeExact(
                    physicalDevice.segment(),
                    pSurfaceInfo.segment(),
                    pSurfaceFormatCount.segment(),
                    (MemorySegment) (pSurfaceFormats != null ? pSurfaceFormats.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceDisplayProperties2KHR.html">vkGetPhysicalDeviceDisplayProperties2KHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayProperties2KHR(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkDisplayProperties2KHR.class) VkDisplayProperties2KHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayProperties2KHR.invokeExact(
                    physicalDevice.segment(),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceDisplayPlaneProperties2KHR.html">vkGetPhysicalDeviceDisplayPlaneProperties2KHR</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceDisplayPlaneProperties2KHR(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkDisplayPlaneProperties2KHR.class) VkDisplayPlaneProperties2KHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceDisplayPlaneProperties2KHR.invokeExact(
                    physicalDevice.segment(),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDisplayModeProperties2KHR.html">vkGetDisplayModeProperties2KHR</a>
    public @enumtype(VkResult.class) int vkGetDisplayModeProperties2KHR(
            VkPhysicalDevice physicalDevice,
            VkDisplayKHR display,
            @unsigned IntBuffer pPropertyCount,
            @Nullable @pointer(target=VkDisplayModeProperties2KHR.class) VkDisplayModeProperties2KHR pProperties
    ) {
        try {
            return (int) HANDLE$vkGetDisplayModeProperties2KHR.invokeExact(
                    physicalDevice.segment(),
                    display.segment(),
                    pPropertyCount.segment(),
                    (MemorySegment) (pProperties != null ? pProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDisplayPlaneCapabilities2KHR.html">vkGetDisplayPlaneCapabilities2KHR</a>
    public @enumtype(VkResult.class) int vkGetDisplayPlaneCapabilities2KHR(
            VkPhysicalDevice physicalDevice,
            @pointer(target=VkDisplayPlaneInfo2KHR.class) VkDisplayPlaneInfo2KHR pDisplayPlaneInfo,
            @pointer(target=VkDisplayPlaneCapabilities2KHR.class) VkDisplayPlaneCapabilities2KHR pCapabilities
    ) {
        try {
            return (int) HANDLE$vkGetDisplayPlaneCapabilities2KHR.invokeExact(
                    physicalDevice.segment(),
                    pDisplayPlaneInfo.segment(),
                    pCapabilities.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSetDebugUtilsObjectNameEXT.html">vkSetDebugUtilsObjectNameEXT</a>
    public @enumtype(VkResult.class) int vkSetDebugUtilsObjectNameEXT(
            VkDevice device,
            @pointer(target=VkDebugUtilsObjectNameInfoEXT.class) VkDebugUtilsObjectNameInfoEXT pNameInfo
    ) {
        try {
            return (int) HANDLE$vkSetDebugUtilsObjectNameEXT.invokeExact(
                    device.segment(),
                    pNameInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSetDebugUtilsObjectTagEXT.html">vkSetDebugUtilsObjectTagEXT</a>
    public @enumtype(VkResult.class) int vkSetDebugUtilsObjectTagEXT(
            VkDevice device,
            @pointer(target=VkDebugUtilsObjectTagInfoEXT.class) VkDebugUtilsObjectTagInfoEXT pTagInfo
    ) {
        try {
            return (int) HANDLE$vkSetDebugUtilsObjectTagEXT.invokeExact(
                    device.segment(),
                    pTagInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkQueueBeginDebugUtilsLabelEXT.html">vkQueueBeginDebugUtilsLabelEXT</a>
    public void vkQueueBeginDebugUtilsLabelEXT(
            VkQueue queue,
            @pointer(target=VkDebugUtilsLabelEXT.class) VkDebugUtilsLabelEXT pLabelInfo
    ) {
        try {
            HANDLE$vkQueueBeginDebugUtilsLabelEXT.invokeExact(
                    queue.segment(),
                    pLabelInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkQueueEndDebugUtilsLabelEXT.html">vkQueueEndDebugUtilsLabelEXT</a>
    public void vkQueueEndDebugUtilsLabelEXT(
            VkQueue queue
    ) {
        try {
            HANDLE$vkQueueEndDebugUtilsLabelEXT.invokeExact(
                    queue.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkQueueInsertDebugUtilsLabelEXT.html">vkQueueInsertDebugUtilsLabelEXT</a>
    public void vkQueueInsertDebugUtilsLabelEXT(
            VkQueue queue,
            @pointer(target=VkDebugUtilsLabelEXT.class) VkDebugUtilsLabelEXT pLabelInfo
    ) {
        try {
            HANDLE$vkQueueInsertDebugUtilsLabelEXT.invokeExact(
                    queue.segment(),
                    pLabelInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdBeginDebugUtilsLabelEXT.html">vkCmdBeginDebugUtilsLabelEXT</a>
    public void vkCmdBeginDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDebugUtilsLabelEXT.class) VkDebugUtilsLabelEXT pLabelInfo
    ) {
        try {
            HANDLE$vkCmdBeginDebugUtilsLabelEXT.invokeExact(
                    commandBuffer.segment(),
                    pLabelInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdEndDebugUtilsLabelEXT.html">vkCmdEndDebugUtilsLabelEXT</a>
    public void vkCmdEndDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer
    ) {
        try {
            HANDLE$vkCmdEndDebugUtilsLabelEXT.invokeExact(
                    commandBuffer.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCmdInsertDebugUtilsLabelEXT.html">vkCmdInsertDebugUtilsLabelEXT</a>
    public void vkCmdInsertDebugUtilsLabelEXT(
            VkCommandBuffer commandBuffer,
            @pointer(target=VkDebugUtilsLabelEXT.class) VkDebugUtilsLabelEXT pLabelInfo
    ) {
        try {
            HANDLE$vkCmdInsertDebugUtilsLabelEXT.invokeExact(
                    commandBuffer.segment(),
                    pLabelInfo.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateDebugUtilsMessengerEXT.html">vkCreateDebugUtilsMessengerEXT</a>
    public @enumtype(VkResult.class) int vkCreateDebugUtilsMessengerEXT(
            VkInstance instance,
            @pointer(target=VkDebugUtilsMessengerCreateInfoEXT.class) VkDebugUtilsMessengerCreateInfoEXT pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkDebugUtilsMessengerEXT.class) VkDebugUtilsMessengerEXT.Buffer pMessenger
    ) {
        try {
            return (int) HANDLE$vkCreateDebugUtilsMessengerEXT.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pMessenger.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkDestroyDebugUtilsMessengerEXT.html">vkDestroyDebugUtilsMessengerEXT</a>
    public void vkDestroyDebugUtilsMessengerEXT(
            VkInstance instance,
            @Nullable VkDebugUtilsMessengerEXT messenger,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator
    ) {
        try {
            HANDLE$vkDestroyDebugUtilsMessengerEXT.invokeExact(
                    instance.segment(),
                    (MemorySegment) (messenger != null ? messenger.segment() : MemorySegment.NULL),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkSubmitDebugUtilsMessageEXT.html">vkSubmitDebugUtilsMessageEXT</a>
    public void vkSubmitDebugUtilsMessageEXT(
            VkInstance instance,
            @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity,
            @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int messageTypes,
            @pointer(target=VkDebugUtilsMessengerCallbackDataEXT.class) VkDebugUtilsMessengerCallbackDataEXT pCallbackData
    ) {
        try {
            HANDLE$vkSubmitDebugUtilsMessageEXT.invokeExact(
                    instance.segment(),
                    messageSeverity,
                    messageTypes,
                    pCallbackData.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkCreateHeadlessSurfaceEXT.html">vkCreateHeadlessSurfaceEXT</a>
    public @enumtype(VkResult.class) int vkCreateHeadlessSurfaceEXT(
            VkInstance instance,
            @pointer(target=VkHeadlessSurfaceCreateInfoEXT.class) VkHeadlessSurfaceCreateInfoEXT pCreateInfo,
            @Nullable @pointer(target=VkAllocationCallbacks.class) VkAllocationCallbacks pAllocator,
            @pointer(target=VkSurfaceKHR.class) VkSurfaceKHR.Buffer pSurface
    ) {
        try {
            return (int) HANDLE$vkCreateHeadlessSurfaceEXT.invokeExact(
                    instance.segment(),
                    pCreateInfo.segment(),
                    (MemorySegment) (pAllocator != null ? pAllocator.segment() : MemorySegment.NULL),
                    pSurface.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetPhysicalDeviceToolProperties.html">vkGetPhysicalDeviceToolProperties</a>
    public @enumtype(VkResult.class) int vkGetPhysicalDeviceToolProperties(
            VkPhysicalDevice physicalDevice,
            @unsigned IntBuffer pToolCount,
            @Nullable @pointer(target=VkPhysicalDeviceToolProperties.class) VkPhysicalDeviceToolProperties pToolProperties
    ) {
        try {
            return (int) HANDLE$vkGetPhysicalDeviceToolProperties.invokeExact(
                    physicalDevice.segment(),
                    pToolCount.segment(),
                    (MemorySegment) (pToolProperties != null ? pToolProperties.segment() : MemorySegment.NULL)
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkAcquireDrmDisplayEXT.html">vkAcquireDrmDisplayEXT</a>
    public @enumtype(VkResult.class) int vkAcquireDrmDisplayEXT(
            VkPhysicalDevice physicalDevice,
            int drmFd,
            VkDisplayKHR display
    ) {
        try {
            return (int) HANDLE$vkAcquireDrmDisplayEXT.invokeExact(
                    physicalDevice.segment(),
                    drmFd,
                    display.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    /// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/vkGetDrmDisplayEXT.html">vkGetDrmDisplayEXT</a>
    public @enumtype(VkResult.class) int vkGetDrmDisplayEXT(
            VkPhysicalDevice physicalDevice,
            int drmFd,
            @unsigned int connectorId,
            @pointer(target=VkDisplayKHR.class) VkDisplayKHR.Buffer display
    ) {
        try {
            return (int) HANDLE$vkGetDrmDisplayEXT.invokeExact(
                    physicalDevice.segment(),
                    drmFd,
                    connectorId,
                    display.segment()
            );
        } catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }
}
