import tech.icey.glfwmini.LibGLFW;
import tech.icey.vk4j.Constants;
import tech.icey.vk4j.Create;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.Version;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.command.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;

import java.io.IOException;
import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;

public class Application implements AutoCloseable {
    public boolean initVulkan() {
        if (!initGLFW()) return false;
        if (!createInstance()) return false;
        if (!pickPhysicalDevice()) return false;
        if (!createWindow()) return false;
        if (!findQueueFamilies()) return false;
        if (!createDevice()) return false;
        if (!createSwapchain()) return false;
        if (!createImageViews()) return false;
        if (!createGraphicsPipeline()) return false;
        if (!createFramebuffers()) return false;
        if (!createCommandPool()) return false;
        if (!createCommandBuffer()) return false;

        return createSyncObjects();
    }

    public void mainLoop() {
        while (!libGLFW.glfwWindowShouldClose(glfwWindow)) {
            libGLFW.glfwPollEvents();
            if (!drawFrame()) break;
        }

        deviceCommands.vkDeviceWaitIdle(device);
    }

    public void cleanup() {
        if (debugMessenger != null) {
            instanceCommands.vkDestroyDebugUtilsMessengerEXT(instance, debugMessenger, null);
        }
        deviceCommands.vkDestroySemaphore(device, imageAvailableSemaphores, null);
        deviceCommands.vkDestroySemaphore(device, renderFinishedSemaphores, null);
        deviceCommands.vkDestroyFence(device, inFlightFences, null);
        deviceCommands.vkDestroyCommandPool(device, commandPool, null);
        for (var framebuffer : swapchainFramebuffers) {
            deviceCommands.vkDestroyFramebuffer(device, framebuffer, null);
        }
        deviceCommands.vkDestroyPipeline(device, graphicsPipeline, null);
        deviceCommands.vkDestroyPipelineLayout(device, pipelineLayout, null);
        deviceCommands.vkDestroyRenderPass(device, renderPass, null);
        for (var imageView : swapchainImageViews) {
            deviceCommands.vkDestroyImageView(device, imageView, null);
        }
        deviceCommands.vkDestroySwapchainKHR(device, swapchain, null);
        deviceCommands.vkDestroyDevice(device, null);
        instanceCommands.vkDestroySurfaceKHR(instance, surface, null);
        instanceCommands.vkDestroyInstance(instance, null);
        libGLFW.glfwDestroyWindow(glfwWindow);
        libGLFW.glfwTerminate();
    }

    @Override
    public void close() {
        arena.close();
    }

    private boolean initGLFW() {
        try {
            libGLFW = new LibGLFW(Loader::loadFunction);
        } catch (Exception e) {
            UICommons.showErrorMessage("初始化 GLFW 失败：" + e);
            return false;
        }

        if (libGLFW.glfwInit() == 0) {
            UICommons.showErrorMessage("初始化 GLFW 失败");
            return false;
        }

        if (libGLFW.glfwVulkanSupported() == 0) {
            UICommons.showErrorMessage("当前系统上的 GLFW 安装不支持 Vulkan");
            return false;
        }

        return true;
    }

    private boolean checkValidationLayerSupport() {
        try (Arena localArena = Arena.ofConfined()) {
            var pLayerCount = IntPtr.allocate(localArena);
            var result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, null);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 实例层属性失败：" + result);
                return false;
            }

            var layerCount = pLayerCount.read();
            var layerProperties = Create.createArray(VkLayerProperties.FACTORY, localArena, layerCount).first;
            result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, layerProperties[0]);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 实例层属性失败：" + result);
                return false;
            }

            for (var layerProperty : layerProperties) {
                if (layerProperty.layerName().readUtf8().equals(validationLayerName)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean createInstance() {
        boolean hasValidationLayer = checkValidationLayerSupport();

        try (Arena localArena = Arena.ofConfined()) {
            var pRequiredExtensionCount = IntPtr.allocate(localArena);
            var requiredExtensions = libGLFW.glfwGetRequiredInstanceExtensions(pRequiredExtensionCount);
            var requiredExtensionCount = pRequiredExtensionCount.read();

            var applicationInfo = Create.create(VkApplicationInfo.FACTORY, localArena);
            applicationInfo.pApplicationName(ByteArray.allocateUtf8(localArena, "VkCube4j"));
            applicationInfo.applicationVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            applicationInfo.pEngineName(ByteArray.allocateUtf8(localArena, "Soloviev D-30"));
            applicationInfo.engineVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            applicationInfo.apiVersion(Version.VK_API_VERSION_1_3);

            var instanceCreateInfo = Create.create(VkInstanceCreateInfo.FACTORY, localArena);
            instanceCreateInfo.pApplicationInfo(applicationInfo);

            if (hasValidationLayer) {
                instanceCreateInfo.enabledLayerCount(1);

                MemorySegment ppEnabledLayerNames = localArena.allocate(ValueLayout.ADDRESS);
                ppEnabledLayerNames.set(ValueLayout.ADDRESS, 0, validationLayerNameByteArray.segment());
                instanceCreateInfo.ppEnabledLayerNames(ppEnabledLayerNames);

                MemorySegment ppEnabledExtensionNames =
                        localArena.allocate(ValueLayout.ADDRESS, requiredExtensionCount + 1);
                requiredExtensions =
                        requiredExtensions.reinterpret(ValueLayout.ADDRESS.byteSize() * requiredExtensionCount);
                for (int i = 0; i < requiredExtensionCount; i++) {
                    ppEnabledExtensionNames.set(
                            ValueLayout.ADDRESS,
                            i * ValueLayout.ADDRESS.byteSize(),
                            requiredExtensions.get(ValueLayout.ADDRESS, i * ValueLayout.ADDRESS.byteSize())
                    );
                }
                ppEnabledExtensionNames.set(
                        ValueLayout.ADDRESS,
                        requiredExtensionCount * ValueLayout.ADDRESS.byteSize(),
                        validationExtensionNameByteArray.segment()
                );

                instanceCreateInfo.enabledExtensionCount(requiredExtensionCount + 1);
                instanceCreateInfo.ppEnabledExtensionNames(ppEnabledExtensionNames);

                var messengerCreateInfo = Create.create(VkDebugUtilsMessengerCreateInfoEXT.FACTORY, localArena);
                populateDebugMessengerCreateInfo(messengerCreateInfo);
                instanceCreateInfo.pNext(messengerCreateInfo.segment());
            }
            else {
                instanceCreateInfo.enabledLayerCount(0);

                instanceCreateInfo.enabledExtensionCount(requiredExtensionCount);
                instanceCreateInfo.ppEnabledExtensionNames(requiredExtensions);
            }

            instance = Create.create(VkInstance.FACTORY, arena);
            var result = entryCommands.vkCreateInstance(instanceCreateInfo, null, instance);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 实例失败：" + result);
                return false;
            }

            instanceCommands = new InstanceCommands(this::loadInstanceCommand);

            if (hasValidationLayer) {
                var messengerCreateInfo = Create.create(VkDebugUtilsMessengerCreateInfoEXT.FACTORY, localArena);
                populateDebugMessengerCreateInfo(messengerCreateInfo);
                debugMessenger = Create.create(VkDebugUtilsMessengerEXT.FACTORY, arena);
                result = instanceCommands.vkCreateDebugUtilsMessengerEXT(instance, messengerCreateInfo, null, debugMessenger);
                if (result != VkResult.VK_SUCCESS) {
                    UICommons.showErrorMessage("创建 Vulkan 调试信使失败：" + result);
                    return false;
                }
            }
            else {
                debugMessenger = null;
            }
            return true;
        }
    }

    private void populateDebugMessengerCreateInfo(VkDebugUtilsMessengerCreateInfoEXT createInfo) {
        createInfo.messageSeverity(
                VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT |
                        VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT |
                        VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT
        );
        createInfo.messageType(
                VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |
                        VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT |
                        VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT
        );
        createInfo.pfnUserCallback(segment$debugCallback);
    }

    private boolean pickPhysicalDevice() {
        try (Arena localArena = Arena.ofConfined()) {
            var pDeviceCount = IntPtr.allocate(localArena);
            var result = instanceCommands.vkEnumeratePhysicalDevices(instance, pDeviceCount, null);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 物理设备失败：" + result);
                return false;
            }

            var deviceCount = pDeviceCount.read();
            if (deviceCount == 0) {
                UICommons.showErrorMessage("未找到 Vulkan 物理设备");
                return false;
            }

            var physicalDevices = Create.createArray(VkPhysicalDevice.FACTORY, arena, deviceCount).first;
            result = instanceCommands.vkEnumeratePhysicalDevices(instance, pDeviceCount, physicalDevices[0]);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 物理设备失败：" + result);
                return false;
            }

            var deviceInfoList = new ArrayList<DeviceInfoDialog.DeviceInfo>();
            if (!populateDeviceInfoList(physicalDevices, localArena, deviceInfoList)) return false;

            var deviceInfoDialog = new DeviceInfoDialog(deviceInfoList);
            deviceInfoDialog.setVisible(true);
            if (deviceInfoDialog.selectedDeviceId == null) {
                return false;
            }

            if (!deviceInfoList.get(deviceInfoDialog.selectedDeviceId).details().contains(swapchainExtensionName)) {
                UICommons.showErrorMessage("所选 Vulkan 物理设备不支持 " + swapchainExtensionName + " 交换链扩展");
                return false;
            }

            physicalDevice = physicalDevices[deviceInfoDialog.selectedDeviceId];

            var pDeviceExtensionCount = IntPtr.allocate(localArena);
            result = instanceCommands.vkEnumerateDeviceExtensionProperties(
                    physicalDevice,
                    null,
                    pDeviceExtensionCount,
                    null
            );
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 设备扩展属性失败：" + result);
                return false;
            }

            return true;
        }
    }

    private boolean populateDeviceInfoList(
            VkPhysicalDevice[] physicalDevices,
            Arena localArena,
            ArrayList<DeviceInfoDialog.DeviceInfo> deviceInfoList
    ) {
        for (var physicalDevice : physicalDevices) {
            var properties = Create.create(VkPhysicalDeviceProperties.FACTORY, localArena);
            instanceCommands.vkGetPhysicalDeviceProperties(physicalDevice, properties);

            var deviceName = properties.deviceName().readUtf8();
            var deviceType = switch (properties.deviceType()) {
                case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_OTHER -> "其他";
                case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_INTEGRATED_GPU -> "集成 GPU";
                case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_DISCRETE_GPU -> "独立 GPU";
                case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_VIRTUAL_GPU -> "虚拟 GPU";
                case VkPhysicalDeviceType.VK_PHYSICAL_DEVICE_TYPE_CPU -> "CPU";
                default -> "未知";
            };
            var deviceId = Integer.toUnsignedString(properties.deviceID());
            var vendorId = Integer.toUnsignedString(properties.vendorID());
            var driverVersion = Version.decode(properties.driverVersion());

            IntPtr pNumDeviceExtensions = IntPtr.allocate(localArena);
            int result = instanceCommands.vkEnumerateDeviceExtensionProperties(
                    physicalDevice,
                    null,
                    pNumDeviceExtensions,
                    null
            );
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 设备扩展属性失败：" + result);
                return false;
            }

            var numDeviceExtensions = pNumDeviceExtensions.read();
            var extensionProperties = Create.createArray(
                    VkExtensionProperties.FACTORY,
                    localArena,
                    numDeviceExtensions
            ).first;
            result = instanceCommands.vkEnumerateDeviceExtensionProperties(
                    physicalDevice,
                    null,
                    pNumDeviceExtensions,
                    extensionProperties[0]
            );
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 设备扩展属性失败：" + result);
                return false;
            }

            var extensionNames = new StringBuilder();
            for (int j = 0; j < numDeviceExtensions; j++) {
                extensionNames.append(extensionProperties[j].extensionNameRaw().getString(0));
                if (j != numDeviceExtensions - 1) {
                    extensionNames.append(" ");
                }
            }

            deviceInfoList.add(new DeviceInfoDialog.DeviceInfo(
                    deviceName,
                    "设备 ID: " + deviceId + "\n" +
                            "供应商 ID: " + vendorId + "\n" +
                            "设备类型: " + deviceType + "\n" +
                            "驱动版本: " + driverVersion + "\n" +
                            "设备扩展: " + extensionNames
            ));
        }

        if (deviceInfoList.isEmpty()) {
            UICommons.showErrorMessage("未找到 Vulkan 物理设备");
            return false;
        }

        return true;
    }

    private boolean createWindow() {
        libGLFW.glfwWindowHint(LibGLFW.GLFW_CLIENT_API, LibGLFW.GLFW_NO_API);
        libGLFW.glfwWindowHint(LibGLFW.GLFW_RESIZABLE, LibGLFW.GLFW_FALSE);

        glfwWindow = libGLFW.glfwCreateWindow(800, 600, "VkCube4j", MemorySegment.NULL, MemorySegment.NULL);
        if (glfwWindow == null) {
            UICommons.showErrorMessage("创建 GLFW 窗口失败");
            return false;
        }

        surface = Create.create(VkSurfaceKHR.FACTORY, arena);
        int result = libGLFW.glfwCreateWindowSurface(instance, glfwWindow, null, surface);
        if (result != VkResult.VK_SUCCESS) {
            UICommons.showErrorMessage("创建 Vulkan 表面失败：" + result);
            return false;
        }

        return true;
    }

    private boolean findQueueFamilies() {
        Integer graphicsQueueFamilyIndex = null;
        Integer presentationQueueFamilyIndex = null;

        try (Arena localArena = Arena.ofConfined()) {
            IntPtr pQueueFamilyCount = IntPtr.allocate(localArena);
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pQueueFamilyCount, null);

            int queueFamilyCount = pQueueFamilyCount.read();
            var queueFamilyProperties = Create.createArray(
                    VkQueueFamilyProperties.FACTORY,
                    localArena,
                    queueFamilyCount
            ).first;
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(
                    physicalDevice,
                    pQueueFamilyCount,
                    queueFamilyProperties[0]
            );

            for (int i = 0; i < queueFamilyCount; i++) {
                if ((queueFamilyProperties[i].queueFlags() & VkQueueFlags.VK_QUEUE_GRAPHICS_BIT) != 0) {
                    graphicsQueueFamilyIndex = i;
                }

                IntPtr pSupported = IntPtr.allocate(localArena);
                int result = instanceCommands.vkGetPhysicalDeviceSurfaceSupportKHR(
                        physicalDevice,
                        i,
                        surface,
                        pSupported
                );
                if (result != VkResult.VK_SUCCESS) {
                    UICommons.showErrorMessage("检查物理设备表面支持失败：" + result);
                    return false;
                }

                if (pSupported.read() == Constants.VK_TRUE) {
                    presentationQueueFamilyIndex = i;
                }

                if (graphicsQueueFamilyIndex != null && presentationQueueFamilyIndex != null) {
                    break;
                }
            }

            if (graphicsQueueFamilyIndex == null || presentationQueueFamilyIndex == null) {
                UICommons.showErrorMessage("未找到支持图形和呈现的队列族");
                return false;
            }

            this.graphicsQueueFamilyIndex = graphicsQueueFamilyIndex;
            this.presentationQueueFamilyIndex = presentationQueueFamilyIndex;
            return true;
        }
    }

    private boolean createDevice() {
        try (Arena localArena = Arena.ofConfined()) {
            var physicalDeviceFeatures = Create.create(VkPhysicalDeviceFeatures.FACTORY, localArena);

            var deviceCreateInfo = Create.create(VkDeviceCreateInfo.FACTORY, localArena);
            deviceCreateInfo.pEnabledFeatures(physicalDeviceFeatures);
            if (graphicsQueueFamilyIndex == presentationQueueFamilyIndex) {
                var graphicsQueueCreateInfo = Create.create(VkDeviceQueueCreateInfo.FACTORY, localArena);
                graphicsQueueCreateInfo.queueFamilyIndex(graphicsQueueFamilyIndex);
                graphicsQueueCreateInfo.queueCount(1);
                var pQueuePriorities = FloatPtr.allocate(localArena);
                pQueuePriorities.write(1.0f);
                graphicsQueueCreateInfo.pQueuePriorities(pQueuePriorities);

                deviceCreateInfo.queueCreateInfoCount(1);
                deviceCreateInfo.pQueueCreateInfos(graphicsQueueCreateInfo);
            }
            else {
                var queueCreateInfos = Create.createArray(VkDeviceQueueCreateInfo.FACTORY, localArena, 2).first;

                queueCreateInfos[0].queueFamilyIndex(graphicsQueueFamilyIndex);
                queueCreateInfos[0].queueCount(1);
                var pGraphicsQueuePriorities = FloatPtr.allocate(localArena);
                pGraphicsQueuePriorities.write(1.0f);
                queueCreateInfos[0].pQueuePriorities(pGraphicsQueuePriorities);

                queueCreateInfos[1].queueFamilyIndex(presentationQueueFamilyIndex);
                queueCreateInfos[1].queueCount(1);
                var pPresentationQueuePriorities = FloatPtr.allocate(localArena);
                pPresentationQueuePriorities.write(1.0f);
                queueCreateInfos[1].pQueuePriorities(pPresentationQueuePriorities);

                deviceCreateInfo.queueCreateInfoCount(2);
                deviceCreateInfo.pQueueCreateInfos(queueCreateInfos[0]);
            }
            deviceCreateInfo.enabledExtensionCount(1);
            MemorySegment ppEnabledExtensionNames = localArena.allocate(ValueLayout.ADDRESS);
            ppEnabledExtensionNames.set(ValueLayout.ADDRESS, 0, swapchainExtensionNameByteArray.segment());
            deviceCreateInfo.ppEnabledExtensionNames(ppEnabledExtensionNames);

            device = Create.create(VkDevice.FACTORY, arena);
            var result = instanceCommands.vkCreateDevice(physicalDevice, deviceCreateInfo, null, device);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 设备失败：" + result);
                return false;
            }

            deviceCommands = new DeviceCommands(this::loadDeviceCommand, this::loadInstanceCommand);

            graphicsQueue = Create.create(VkQueue.FACTORY, arena);
            deviceCommands.vkGetDeviceQueue(device, graphicsQueueFamilyIndex, 0, graphicsQueue);

            presentationQueue = Create.create(VkQueue.FACTORY, arena);
            deviceCommands.vkGetDeviceQueue(device, presentationQueueFamilyIndex, 0, presentationQueue);

            var pDeviceExtensionCount = IntPtr.allocate(localArena);
            result = instanceCommands.vkEnumerateDeviceExtensionProperties(
                    physicalDevice,
                    null,
                    pDeviceExtensionCount,
                    null
            );
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 设备扩展属性失败：" + result);
                return false;
            }

            return true;
        }
    }

    private boolean createSwapchain() {
        try (Arena localArena = Arena.ofConfined()) {
            var surfaceCapabilities = Create.create(VkSurfaceCapabilitiesKHR.FACTORY, localArena);
            var result = instanceCommands.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
                    physicalDevice,
                    surface,
                    surfaceCapabilities
            );
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 表面能力失败：" + result);
                return false;
            }

            var pSurfaceFormatCount = IntPtr.allocate(localArena);
            result = instanceCommands.vkGetPhysicalDeviceSurfaceFormatsKHR(
                    physicalDevice,
                    surface,
                    pSurfaceFormatCount,
                    null
            );
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 表面格式失败：" + result);
                return false;
            }
            var surfaceFormatCount = pSurfaceFormatCount.read();
            var surfaceFormats = Create.createArray(VkSurfaceFormatKHR.FACTORY, localArena, surfaceFormatCount).first;
            result = instanceCommands.vkGetPhysicalDeviceSurfaceFormatsKHR(
                    physicalDevice,
                    surface,
                    pSurfaceFormatCount,
                    surfaceFormats[0]
            );
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 表面格式失败：" + result);
                return false;
            }

            var surfaceFormat = surfaceFormats[0];
            for (var format : surfaceFormats) {
                if (format.format() == VkFormat.VK_FORMAT_B8G8R8A8_SRGB &&
                    format.colorSpace() == VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR) {
                    surfaceFormat = format;
                    break;
                }
            }
            swapchainImageFormat = surfaceFormat.format();

            swapExtent = Create.create(VkExtent2D.FACTORY, arena);
            if (surfaceCapabilities.currentExtent().width() != 0xFFFFFFFF) {
                swapExtent.width(surfaceCapabilities.currentExtent().width());
                swapExtent.height(surfaceCapabilities.currentExtent().height());
            }
            else {
                IntArray wh = IntArray.allocate(localArena, 2);
                libGLFW.glfwGetWindowSize(glfwWindow, wh);

                swapExtent.width(wh.get(0));
                swapExtent.height(wh.get(1));

                swapExtent.width(Math.clamp(
                        swapExtent.width(),
                        surfaceCapabilities.minImageExtent().width(),
                        surfaceCapabilities.maxImageExtent().width()
                ));
                swapExtent.height(Math.clamp(
                        swapExtent.height(),
                        surfaceCapabilities.minImageExtent().height(),
                        surfaceCapabilities.maxImageExtent().height()
                ));
            }

            var imageCount = surfaceCapabilities.minImageCount() + 1;
            if (surfaceCapabilities.maxImageCount() > 0 && imageCount > surfaceCapabilities.maxImageCount()) {
                imageCount = surfaceCapabilities.maxImageCount();
            }

            var swapchainCreateInfo = Create.create(VkSwapchainCreateInfoKHR.FACTORY, localArena);
            swapchainCreateInfo.surface(surface);
            swapchainCreateInfo.minImageCount(imageCount);
            swapchainCreateInfo.imageFormat(surfaceFormat.format());
            swapchainCreateInfo.imageColorSpace(surfaceFormat.colorSpace());
            swapchainCreateInfo.imageExtent(swapExtent);
            swapchainCreateInfo.imageArrayLayers(1);
            swapchainCreateInfo.imageUsage(VkImageUsageFlags.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT);

            if (graphicsQueueFamilyIndex != presentationQueueFamilyIndex) {
                swapchainCreateInfo.imageSharingMode(VkSharingMode.VK_SHARING_MODE_CONCURRENT);
                swapchainCreateInfo.queueFamilyIndexCount(2);
                IntArray queueFamilyIndices = IntArray.allocate(localArena, 2);
                queueFamilyIndices.set(0, graphicsQueueFamilyIndex);
                queueFamilyIndices.set(1, presentationQueueFamilyIndex);
                swapchainCreateInfo.pQueueFamilyIndices(queueFamilyIndices);
            }
            else {
                swapchainCreateInfo.imageSharingMode(VkSharingMode.VK_SHARING_MODE_EXCLUSIVE);
            }

            swapchainCreateInfo.preTransform(surfaceCapabilities.currentTransform());
            swapchainCreateInfo.compositeAlpha(VkCompositeAlphaFlagsKHR.VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR);
            swapchainCreateInfo.presentMode(VkPresentModeKHR.VK_PRESENT_MODE_FIFO_KHR);
            swapchainCreateInfo.clipped(Constants.VK_TRUE);

            swapchain = Create.create(VkSwapchainKHR.FACTORY, arena);
            result = deviceCommands.vkCreateSwapchainKHR(device, swapchainCreateInfo, null, swapchain);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 交换链失败：" + result);
                return false;
            }

            var pSwapchainImageCount = IntPtr.allocate(localArena);
            result = deviceCommands.vkGetSwapchainImagesKHR(device, swapchain, pSwapchainImageCount, null);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 交换链图像失败：" + result);
                return false;
            }

            int swapchainImageCount = pSwapchainImageCount.read();
            swapchainImages = Create.createArray(VkImage.FACTORY, arena, swapchainImageCount).first;
            result = deviceCommands.vkGetSwapchainImagesKHR(device, swapchain, pSwapchainImageCount, swapchainImages[0]);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 交换链图像失败：" + result);
                return false;
            }

            return true;
        }
    }

    private boolean createImageViews() {
        swapchainImageViews = Create.createArray(VkImageView.FACTORY, arena, swapchainImages.length).first;
        try (Arena localArena = Arena.ofConfined()) {
            for (int i = 0; i < swapchainImages.length; i++) {
                var createInfo = Create.create(VkImageViewCreateInfo.FACTORY, localArena);
                createInfo.image(swapchainImages[i]);
                createInfo.viewType(VkImageViewType.VK_IMAGE_VIEW_TYPE_2D);
                createInfo.format(swapchainImageFormat);
                createInfo.components().r(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
                createInfo.components().g(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
                createInfo.components().b(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
                createInfo.components().a(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
                createInfo.subresourceRange().aspectMask(VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT);
                createInfo.subresourceRange().baseMipLevel(0);
                createInfo.subresourceRange().levelCount(1);
                createInfo.subresourceRange().baseArrayLayer(0);
                createInfo.subresourceRange().layerCount(1);

                swapchainImageViews[i] = Create.create(VkImageView.FACTORY, arena);
                var result = deviceCommands.vkCreateImageView(device, createInfo, null, swapchainImageViews[i]);
                if (result != VkResult.VK_SUCCESS) {
                    UICommons.showErrorMessage("创建 Vulkan 图像视图失败：" + result);
                    return false;
                }
            }

            return true;
        }
    }

    private boolean createGraphicsPipeline() {
        try (Arena localArena = Arena.ofConfined()) {
            var shaderModules = createShaderModules(localArena);
            if (shaderModules == null) {
                return false;
            }

            var shaderStageInfos = Create.createArray(VkPipelineShaderStageCreateInfo.FACTORY, localArena, 2).first;
            shaderStageInfos[0].stage(VkShaderStageFlags.VK_SHADER_STAGE_VERTEX_BIT);
            shaderStageInfos[0].module(shaderModules[0]);
            shaderStageInfos[0].pName(ByteArray.allocateUtf8(localArena, "main"));
            shaderStageInfos[1].stage(VkShaderStageFlags.VK_SHADER_STAGE_FRAGMENT_BIT);
            shaderStageInfos[1].module(shaderModules[1]);
            shaderStageInfos[1].pName(ByteArray.allocateUtf8(localArena, "main"));

            @enumtype(VkDynamicState.class) IntArray dynamicStates = IntArray.allocate(localArena, 2);
            dynamicStates.set(0, VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT);
            dynamicStates.set(1, VkDynamicState.VK_DYNAMIC_STATE_SCISSOR);
            var dynamicStateInfo = Create.create(VkPipelineDynamicStateCreateInfo.FACTORY, localArena);
            dynamicStateInfo.dynamicStateCount(2);
            dynamicStateInfo.pDynamicStates(dynamicStates);

            var vertexInputInfo = Create.create(VkPipelineVertexInputStateCreateInfo.FACTORY, localArena);
            var inputAssemblyInfo = Create.create(VkPipelineInputAssemblyStateCreateInfo.FACTORY, localArena);
            inputAssemblyInfo.topology(VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST);
            inputAssemblyInfo.primitiveRestartEnable(Constants.VK_FALSE);

            var viewport = Create.create(VkViewport.FACTORY, localArena);
            viewport.x(0.0f);
            viewport.y(0.0f);
            viewport.width(swapExtent.width());
            viewport.height(swapExtent.height());
            viewport.minDepth(0.0f);
            viewport.maxDepth(1.0f);

            var scissor = Create.create(VkRect2D.FACTORY, localArena);
            scissor.extent(swapExtent);

            var viewportStateInfo = Create.create(VkPipelineViewportStateCreateInfo.FACTORY, localArena);
            viewportStateInfo.viewportCount(1);
            viewportStateInfo.pViewports(viewport);
            viewportStateInfo.scissorCount(1);
            viewportStateInfo.pScissors(scissor);

            var rasterizationInfo = Create.create(VkPipelineRasterizationStateCreateInfo.FACTORY, localArena);
            rasterizationInfo.polygonMode(VkPolygonMode.VK_POLYGON_MODE_FILL);
            rasterizationInfo.lineWidth(1.0f);
            rasterizationInfo.cullMode(VkCullModeFlags.VK_CULL_MODE_BACK_BIT);
            rasterizationInfo.frontFace(VkFrontFace.VK_FRONT_FACE_CLOCKWISE);
            rasterizationInfo.depthBiasClamp(0.0f);
            rasterizationInfo.depthBiasSlopeFactor(0.0f);

            var multisampleInfo = Create.create(VkPipelineMultisampleStateCreateInfo.FACTORY, localArena);
            multisampleInfo.rasterizationSamples(VkSampleCountFlags.VK_SAMPLE_COUNT_1_BIT);
            multisampleInfo.minSampleShading(1.0f);

            var pipelineColorBlendAttachmentState = Create.create(VkPipelineColorBlendAttachmentState.FACTORY, localArena);
            pipelineColorBlendAttachmentState.colorWriteMask(
                    VkColorComponentFlags.VK_COLOR_COMPONENT_R_BIT |
                    VkColorComponentFlags.VK_COLOR_COMPONENT_G_BIT |
                    VkColorComponentFlags.VK_COLOR_COMPONENT_B_BIT |
                    VkColorComponentFlags.VK_COLOR_COMPONENT_A_BIT
            );
            pipelineColorBlendAttachmentState.srcColorBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_ONE);
            pipelineColorBlendAttachmentState.dstColorBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_ZERO);
            pipelineColorBlendAttachmentState.colorBlendOp(VkBlendOp.VK_BLEND_OP_ADD);
            pipelineColorBlendAttachmentState.srcAlphaBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_ONE);
            pipelineColorBlendAttachmentState.dstAlphaBlendFactor(VkBlendFactor.VK_BLEND_FACTOR_ZERO);
            pipelineColorBlendAttachmentState.alphaBlendOp(VkBlendOp.VK_BLEND_OP_ADD);

            var pipelineColorBlendStateInfo = Create.create(VkPipelineColorBlendStateCreateInfo.FACTORY, localArena);
            pipelineColorBlendStateInfo.logicOp(VkLogicOp.VK_LOGIC_OP_COPY);
            pipelineColorBlendStateInfo.attachmentCount(1);
            pipelineColorBlendStateInfo.pAttachments(pipelineColorBlendAttachmentState);
            pipelineColorBlendStateInfo.blendConstants().set(0, 0.0f);
            pipelineColorBlendStateInfo.blendConstants().set(1, 0.0f);
            pipelineColorBlendStateInfo.blendConstants().set(2, 0.0f);
            pipelineColorBlendStateInfo.blendConstants().set(3, 0.0f);

            var pipelineLayoutCreateInfo = Create.create(VkPipelineLayoutCreateInfo.FACTORY, localArena);
            pipelineLayout = Create.create(VkPipelineLayout.FACTORY, arena);
            if (deviceCommands.vkCreatePipelineLayout(device, pipelineLayoutCreateInfo, null, pipelineLayout) != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 管线布局失败");
                return false;
            }

            var colorAttachmentDescription = Create.create(VkAttachmentDescription.FACTORY, localArena);
            colorAttachmentDescription.format(swapchainImageFormat);
            colorAttachmentDescription.samples(VkSampleCountFlags.VK_SAMPLE_COUNT_1_BIT);
            colorAttachmentDescription.loadOp(VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_CLEAR);
            colorAttachmentDescription.storeOp(VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_STORE);
            colorAttachmentDescription.stencilLoadOp(VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_DONT_CARE);
            colorAttachmentDescription.stencilStoreOp(VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_DONT_CARE);
            colorAttachmentDescription.initialLayout(VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED);
            colorAttachmentDescription.finalLayout(VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR);

            var colorAttachmentReference = Create.create(VkAttachmentReference.FACTORY, localArena);
            colorAttachmentReference.attachment(0);
            colorAttachmentReference.layout(VkImageLayout.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);

            var subpassDescription = Create.create(VkSubpassDescription.FACTORY, localArena);
            subpassDescription.pipelineBindPoint(VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS);
            subpassDescription.colorAttachmentCount(1);
            subpassDescription.pColorAttachments(colorAttachmentReference);

            var subpassDependency = Create.create(VkSubpassDependency.FACTORY, localArena);
            subpassDependency.srcSubpass(Constants.VK_SUBPASS_EXTERNAL);
            subpassDependency.dstSubpass(0);
            subpassDependency.srcStageMask(VkPipelineStageFlags.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);
            subpassDependency.srcAccessMask(0);
            subpassDependency.dstStageMask(VkPipelineStageFlags.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);
            subpassDependency.dstAccessMask(
                    VkAccessFlags.VK_ACCESS_COLOR_ATTACHMENT_READ_BIT |
                    VkAccessFlags.VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT
            );

            var renderPassCreateInfo = Create.create(VkRenderPassCreateInfo.FACTORY, localArena);
            renderPassCreateInfo.attachmentCount(1);
            renderPassCreateInfo.pAttachments(colorAttachmentDescription);
            renderPassCreateInfo.subpassCount(1);
            renderPassCreateInfo.pSubpasses(subpassDescription);
            renderPassCreateInfo.dependencyCount(1);
            renderPassCreateInfo.pDependencies(subpassDependency);

            renderPass = Create.create(VkRenderPass.FACTORY, arena);
            var result = deviceCommands.vkCreateRenderPass(device, renderPassCreateInfo, null, renderPass);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 渲染通道失败：" + result);
                return false;
            }

            var graphicsPipelineCreateInfo = Create.create(VkGraphicsPipelineCreateInfo.FACTORY, localArena);
            graphicsPipelineCreateInfo.stageCount(2);
            graphicsPipelineCreateInfo.pStages(shaderStageInfos[0]);
            graphicsPipelineCreateInfo.pVertexInputState(vertexInputInfo);
            graphicsPipelineCreateInfo.pInputAssemblyState(inputAssemblyInfo);
            graphicsPipelineCreateInfo.pViewportState(viewportStateInfo);
            graphicsPipelineCreateInfo.pRasterizationState(rasterizationInfo);
            graphicsPipelineCreateInfo.pMultisampleState(multisampleInfo);
            graphicsPipelineCreateInfo.pColorBlendState(pipelineColorBlendStateInfo);
            graphicsPipelineCreateInfo.pDynamicState(dynamicStateInfo);
            graphicsPipelineCreateInfo.layout(pipelineLayout);
            graphicsPipelineCreateInfo.renderPass(renderPass);
            graphicsPipelineCreateInfo.subpass(0);

            graphicsPipeline = Create.create(VkPipeline.FACTORY, arena);
            result = deviceCommands.vkCreateGraphicsPipelines(
                    device,
                    null,
                    1,
                    graphicsPipelineCreateInfo,
                    null,
                    graphicsPipeline
            );
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 图形管线失败：" + result);
                return false;
            }

            deviceCommands.vkDestroyShaderModule(device, shaderModules[0], null);
            deviceCommands.vkDestroyShaderModule(device, shaderModules[1], null);
            return true;
        }
    }

    private VkShaderModule[] createShaderModules(Arena localArena) {
        try {
            MemorySegment vertexShaderCode = ShaderUtil.readShaderCode("vert.spv", localArena);
            MemorySegment fragmentShaderCode = ShaderUtil.readShaderCode("frag.spv", localArena);

            var createInfos = Create.createArray(VkShaderModuleCreateInfo.FACTORY, localArena, 2).first;
            createInfos[0].codeSize(vertexShaderCode.byteSize());
            createInfos[0].pCodeRaw(vertexShaderCode);
            createInfos[1].codeSize(fragmentShaderCode.byteSize());
            createInfos[1].pCodeRaw(fragmentShaderCode);

            var shaderModules = Create.createArray(VkShaderModule.FACTORY, arena, 2).first;
            for (int i = 0; i < 2; i++) {
                var result = deviceCommands.vkCreateShaderModule(device, createInfos[i], null, shaderModules[i]);
                if (result != VkResult.VK_SUCCESS) {
                    UICommons.showErrorMessage("创建 Vulkan 着色器模块失败：" + result);
                    return null;
                }
            }

            return shaderModules;
        } catch (IOException e) {
            UICommons.showErrorMessage("读取着色器代码失败：" + e);
            return null;
        }
    }

    private boolean createFramebuffers() {
        swapchainFramebuffers = Create.createArray(VkFramebuffer.FACTORY, arena, swapchainImageViews.length).first;
        try (Arena localArena = Arena.ofConfined()) {
            for (int i = 0; i < swapchainImageViews.length; i++) {
                var framebufferCreateInfo = Create.create(VkFramebufferCreateInfo.FACTORY, localArena);
                framebufferCreateInfo.renderPass(renderPass);
                framebufferCreateInfo.attachmentCount(1);
                framebufferCreateInfo.pAttachments(swapchainImageViews[i]);
                framebufferCreateInfo.width(swapExtent.width());
                framebufferCreateInfo.height(swapExtent.height());
                framebufferCreateInfo.layers(1);

                swapchainFramebuffers[i] = Create.create(VkFramebuffer.FACTORY, arena);
                var result = deviceCommands.vkCreateFramebuffer(device, framebufferCreateInfo, null, swapchainFramebuffers[i]);
                if (result != VkResult.VK_SUCCESS) {
                    UICommons.showErrorMessage("创建 Vulkan 帧缓冲失败：" + result);
                    return false;
                }
            }

            return true;
        }
    }

    private boolean createCommandPool() {
        try (Arena localArena = Arena.ofConfined()) {
            var poolCreateInfo = Create.create(VkCommandPoolCreateInfo.FACTORY, localArena);
            poolCreateInfo.queueFamilyIndex(graphicsQueueFamilyIndex);
            poolCreateInfo.flags(VkCommandPoolCreateFlags.VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT);
            poolCreateInfo.queueFamilyIndex(graphicsQueueFamilyIndex);

            commandPool = Create.create(VkCommandPool.FACTORY, arena);
            var result = deviceCommands.vkCreateCommandPool(device, poolCreateInfo, null, commandPool);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 命令池失败：" + result);
                return false;
            }

            return true;
        }
    }

    private boolean createCommandBuffer() {
        try (Arena localArena = Arena.ofConfined()) {
            var allocateInfo = Create.create(VkCommandBufferAllocateInfo.FACTORY, localArena);
            allocateInfo.commandPool(commandPool);
            allocateInfo.level(VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_PRIMARY);
            allocateInfo.commandBufferCount(1);

            commandBuffer = Create.create(VkCommandBuffer.FACTORY, arena);
            var result = deviceCommands.vkAllocateCommandBuffers(device, allocateInfo, commandBuffer);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("分配 Vulkan 命令缓冲区失败：" + result);
                return false;
            }

            return true;
        }
    }

    private boolean createSyncObjects() {
        imageAvailableSemaphores = Create.create(VkSemaphore.FACTORY, arena);
        renderFinishedSemaphores = Create.create(VkSemaphore.FACTORY, arena);
        inFlightFences = Create.create(VkFence.FACTORY, arena);

        try (Arena localArena = Arena.ofConfined()) {
            var semaphoreCreateInfo = Create.create(VkSemaphoreCreateInfo.FACTORY, localArena);
            var fenceCreateInfo = Create.create(VkFenceCreateInfo.FACTORY, localArena);
            fenceCreateInfo.flags(VkFenceCreateFlags.VK_FENCE_CREATE_SIGNALED_BIT);

            if (deviceCommands.vkCreateSemaphore(device, semaphoreCreateInfo, null, imageAvailableSemaphores) != VkResult.VK_SUCCESS ||
                deviceCommands.vkCreateSemaphore(device, semaphoreCreateInfo, null, renderFinishedSemaphores) != VkResult.VK_SUCCESS ||
                deviceCommands.vkCreateFence(device, fenceCreateInfo, null, inFlightFences) != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 同步对象失败");
                return false;
            }

            return true;
        }
    }

    private boolean drawFrame() {
        deviceCommands.vkWaitForFences(device, 1, inFlightFences, Constants.VK_TRUE, 0xFFFFFFFF_FFFFFFFFL);
        deviceCommands.vkResetFences(device, 1, inFlightFences);
        try (Arena localArena = Arena.ofConfined()) {
            @unsigned var pImageIndex = IntPtr.allocate(localArena);
            deviceCommands.vkAcquireNextImageKHR(
                    device,
                    swapchain,
                    0xFFFFFFFF_FFFFFFFFL,
                    imageAvailableSemaphores,
                    null,
                    pImageIndex
            );

            deviceCommands.vkResetCommandBuffer(commandBuffer, 0);
            if (!recordCommandBuffer(pImageIndex.read())) {
                return false;
            }

            var submitInfo = Create.create(VkSubmitInfo.FACTORY, localArena);
            submitInfo.waitSemaphoreCount(1);
            submitInfo.pWaitSemaphores(imageAvailableSemaphores);
            var submitInfoWaitStages = IntPtr.allocate(localArena);
            submitInfoWaitStages.write(VkPipelineStageFlags.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);
            submitInfo.pWaitDstStageMask(submitInfoWaitStages);
            submitInfo.commandBufferCount(1);
            submitInfo.pCommandBuffers(commandBuffer);
            submitInfo.signalSemaphoreCount(1);
            submitInfo.pSignalSemaphores(renderFinishedSemaphores);

            if (deviceCommands.vkQueueSubmit(graphicsQueue, 1, submitInfo, inFlightFences) != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("提交 Vulkan 命令缓冲区失败");
                return false;
            }

            var presentInfo = Create.create(VkPresentInfoKHR.FACTORY, localArena);
            presentInfo.waitSemaphoreCount(1);
            presentInfo.pWaitSemaphores(renderFinishedSemaphores);
            presentInfo.swapchainCount(1);
            presentInfo.pSwapchains(swapchain);
            presentInfo.pImageIndices(pImageIndex);

            if (deviceCommands.vkQueuePresentKHR(presentationQueue, presentInfo) != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("提交 Vulkan 命令缓冲区失败");
                return false;
            }
        }
        return true;
    }

    private boolean recordCommandBuffer(@unsigned int imageIndex) {
        try (Arena localArena = Arena.ofConfined()) {
            var beginInfo = Create.create(VkCommandBufferBeginInfo.FACTORY, localArena);
            beginInfo.flags(VkCommandBufferUsageFlags.VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT);

            var renderPassBeginInfo = Create.create(VkRenderPassBeginInfo.FACTORY, localArena);
            renderPassBeginInfo.renderPass(renderPass);
            renderPassBeginInfo.framebuffer(swapchainFramebuffers[imageIndex]);
            renderPassBeginInfo.renderArea().extent(swapExtent);

            var clearValue = Create.create(VkClearValue.FACTORY, localArena);
            clearValue.color().float32().set(0, 0.0f);
            clearValue.color().float32().set(1, 0.0f);
            clearValue.color().float32().set(2, 0.0f);
            clearValue.color().float32().set(3, 1.0f);

            renderPassBeginInfo.clearValueCount(1);
            renderPassBeginInfo.pClearValues(clearValue);

            var viewport = Create.create(VkViewport.FACTORY, localArena);
            viewport.x(0.0f);
            viewport.y(0.0f);
            viewport.width(swapExtent.width());
            viewport.height(swapExtent.height());
            viewport.minDepth(0.0f);
            viewport.maxDepth(1.0f);

            var scissor = Create.create(VkRect2D.FACTORY, localArena);
            scissor.extent(swapExtent);

            var result = deviceCommands.vkBeginCommandBuffer(commandBuffer, beginInfo);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("开始 Vulkan 命令缓冲区失败：" + result);
                return false;
            }

            deviceCommands.vkCmdBeginRenderPass(commandBuffer, renderPassBeginInfo, VkSubpassContents.VK_SUBPASS_CONTENTS_INLINE);
            deviceCommands.vkCmdBindPipeline(commandBuffer, VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS, graphicsPipeline);
            deviceCommands.vkCmdSetViewport(commandBuffer, 0, 1, viewport);
            deviceCommands.vkCmdSetScissor(commandBuffer, 0, 1, scissor);
            deviceCommands.vkCmdDraw(commandBuffer, 3, 1, 0, 0);
            deviceCommands.vkCmdEndRenderPass(commandBuffer);

            result = deviceCommands.vkEndCommandBuffer(commandBuffer);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("结束 Vulkan 命令缓冲区失败：" + result);
                return false;
            }

            return true;
        }
    }

    private MethodHandle loadInstanceCommand(String name, FunctionDescriptor descriptor) {
        try (Arena localArena = Arena.ofConfined()) {
            var nameSegment = ByteArray.allocateUtf8(localArena, name);
            MemorySegment segment = staticCommands.vkGetInstanceProcAddr(instance, nameSegment);
            if (segment.address() == 0) {
                return null;
            }

            return Linker.nativeLinker().downcallHandle(segment, descriptor);
        }
    }

    private MethodHandle loadDeviceCommand(String name, FunctionDescriptor descriptor) {
        try (Arena localArena = Arena.ofConfined()) {
            var nameSegment = ByteArray.allocateUtf8(localArena, name);
            MemorySegment segment = staticCommands.vkGetDeviceProcAddr(device, nameSegment);
            if (segment.address() == 0) {
                return null;
            }

            return Linker.nativeLinker().downcallHandle(segment, descriptor);
        }
    }

    private static /*VkBool32*/ int debugCallback(
            @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity,
            @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int messageType,
            @pointer(target=VkDebugUtilsMessengerCallbackDataEXT.class) MemorySegment pCallbackData,
            @pointer(comment="void*") MemorySegment pUserData
    ) {
        pCallbackData = pCallbackData.reinterpret(VkDebugUtilsMessengerCallbackDataEXT.LAYOUT.byteSize());

        String severity = switch (messageSeverity) {
            case VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT -> "verbose";
            case VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT -> "info";
            case VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT -> "warn";
            case VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT -> "error";
            default -> "(unknown level)";
        };

        String message = new VkDebugUtilsMessengerCallbackDataEXT(pCallbackData).pMessage().readUtf8();
        System.err.println("[" + severity + "] " + message);

        return Constants.VK_FALSE;
    }

    private final Arena arena = Arena.ofConfined();
    private final String validationLayerName = "VK_LAYER_KHRONOS_validation";
    private final ByteArray validationLayerNameByteArray = ByteArray.allocateUtf8(arena, validationLayerName);
    private final String validationExtensionName = "VK_EXT_debug_utils";
    private final ByteArray validationExtensionNameByteArray = ByteArray.allocateUtf8(arena, validationExtensionName);
    private final String swapchainExtensionName = "VK_KHR_swapchain";
    private final ByteArray swapchainExtensionNameByteArray = ByteArray.allocateUtf8(arena, swapchainExtensionName);
    private final MemorySegment segment$debugCallback = Linker.nativeLinker().upcallStub(
            handle$debugCallback,
            descriptor$debugCallback,
            arena
    );

    private LibGLFW libGLFW;
    private VkInstance instance;
    private VkDebugUtilsMessengerEXT debugMessenger;
    private InstanceCommands instanceCommands;
    private VkPhysicalDevice physicalDevice;
    private MemorySegment glfwWindow;
    private VkSurfaceKHR surface;
    private int graphicsQueueFamilyIndex;
    private int presentationQueueFamilyIndex;
    private VkDevice device;
    private DeviceCommands deviceCommands;
    private VkQueue graphicsQueue;
    private VkQueue presentationQueue;
    private VkSwapchainKHR swapchain;
    private @enumtype(VkFormat.class) int swapchainImageFormat;
    private VkExtent2D swapExtent;
    private VkImage[] swapchainImages;
    private VkImageView[] swapchainImageViews;
    private VkPipelineLayout pipelineLayout;
    private VkRenderPass renderPass;
    private VkPipeline graphicsPipeline;
    private VkFramebuffer[] swapchainFramebuffers;
    private VkCommandPool commandPool;
    private VkCommandBuffer commandBuffer;
    private VkSemaphore imageAvailableSemaphores;
    private VkSemaphore renderFinishedSemaphores;
    private VkFence inFlightFences;

    private static final StaticCommands staticCommands = new StaticCommands(Loader::loadFunctionOrNull);
    private static final EntryCommands entryCommands = new EntryCommands(Loader::loadFunctionOrNull);

    private static final FunctionDescriptor descriptor$debugCallback = FunctionDescriptor.of(
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.JAVA_INT,
            ValueLayout.ADDRESS.withTargetLayout(VkDebugUtilsMessengerCallbackDataEXT.LAYOUT),
            ValueLayout.ADDRESS
    );
    private static final MethodHandle handle$debugCallback;

    static {
        MethodHandle temp;

        try {
            temp = MethodHandles.lookup()
                    .findStatic(Application.class, "debugCallback", descriptor$debugCallback.toMethodType());
        } catch (Exception e) {
            temp = null;
            UICommons.showErrorMessage("加载 debugCallback 失败：" + e);
            System.exit(-1);
        }

        handle$debugCallback = temp;
    }
}
