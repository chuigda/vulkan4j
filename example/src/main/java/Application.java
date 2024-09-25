import tech.icey.glfwmini.LibGLFW;
import tech.icey.vk4j.Constants;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.Version;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.command.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;

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
        deviceCommands.vkDestroyFence(device, pInFlightFences.read(), null);
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
            var pLayerCount = IntBuffer.allocate(localArena);
            var result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, null);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 实例层属性失败：" + result);
                return false;
            }

            var layerCount = pLayerCount.read();
            var layerProperties = VkLayerProperties.allocate(localArena, layerCount);
            result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, layerProperties[0]);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 实例层属性失败：" + result);
                return false;
            }

            for (var layerProperty : layerProperties) {
                if (layerProperty.layerName().readString().equals(validationLayerName)) {
                    return true;
                }
            }
        }

        return false;
    }

    private boolean createInstance() {
        boolean hasValidationLayer = checkValidationLayerSupport();

        try (Arena localArena = Arena.ofConfined()) {
            var pRequiredExtensionCount = IntBuffer.allocate(localArena);
            var requiredExtensions = libGLFW.glfwGetRequiredInstanceExtensions(pRequiredExtensionCount);
            var requiredExtensionCount = pRequiredExtensionCount.read();

            var applicationInfo = VkApplicationInfo.allocate(localArena);
            applicationInfo.pApplicationName(ByteBuffer.allocateString(localArena, "VkCube4j"));
            applicationInfo.applicationVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            applicationInfo.pEngineName(ByteBuffer.allocateString(localArena, "Soloviev D-30"));
            applicationInfo.engineVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            applicationInfo.apiVersion(Version.VK_API_VERSION_1_3);

            var instanceCreateInfo = VkInstanceCreateInfo.allocate(localArena);
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

                var messengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(localArena);
                populateDebugMessengerCreateInfo(messengerCreateInfo);
                instanceCreateInfo.pNext(messengerCreateInfo.segment());
            }
            else {
                instanceCreateInfo.enabledLayerCount(0);

                instanceCreateInfo.enabledExtensionCount(requiredExtensionCount);
                instanceCreateInfo.ppEnabledExtensionNames(requiredExtensions);
            }

            var pInstance = VkInstance.Buffer.allocate(localArena);
            var result = entryCommands.vkCreateInstance(instanceCreateInfo, null, pInstance);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 实例失败：" + result);
                return false;
            }

            instance = pInstance.read();
            instanceCommands = new InstanceCommands(this::loadInstanceCommand);

            if (hasValidationLayer) {
                var messengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(localArena);
                populateDebugMessengerCreateInfo(messengerCreateInfo);
                var pDebugMessenger = VkDebugUtilsMessengerEXT.Buffer.allocate(localArena);
                result = instanceCommands.vkCreateDebugUtilsMessengerEXT(instance, messengerCreateInfo, null, pDebugMessenger);
                if (result != VkResult.VK_SUCCESS) {
                    UICommons.showErrorMessage("创建 Vulkan 调试信使失败：" + result);
                    return false;
                }

                debugMessenger = pDebugMessenger.read();
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
            var pDeviceCount = IntBuffer.allocate(localArena);
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

            var pPhysicalDevices = VkPhysicalDevice.Buffer.allocate(localArena, deviceCount);
            result = instanceCommands.vkEnumeratePhysicalDevices(instance, pDeviceCount, pPhysicalDevices);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 物理设备失败：" + result);
                return false;
            }

            var physicalDevices = pPhysicalDevices.readAll();
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

            var pDeviceExtensionCount = IntBuffer.allocate(localArena);
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
            var properties = VkPhysicalDeviceProperties.allocate(localArena);
            instanceCommands.vkGetPhysicalDeviceProperties(physicalDevice, properties);

            var deviceName = properties.deviceName().readString();
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

            IntBuffer pNumDeviceExtensions = IntBuffer.allocate(localArena);
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
            var extensionProperties = VkExtensionProperties.allocate(localArena, numDeviceExtensions);
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
        libGLFW.glfwWindowHint(LibGLFW.GLFW_TRANSPARENT_FRAMEBUFFER, 1);

        glfwWindow = libGLFW.glfwCreateWindow(800, 600, "VkCube4j", MemorySegment.NULL, MemorySegment.NULL);
        if (glfwWindow == null) {
            UICommons.showErrorMessage("创建 GLFW 窗口失败");
            return false;
        }

        try (Arena localArena = Arena.ofConfined()) {
            var pSurface = VkSurfaceKHR.Buffer.allocate(localArena);
            int result = libGLFW.glfwCreateWindowSurface(instance, glfwWindow, null, pSurface);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 表面失败：" + result);
                return false;
            }

            surface = pSurface.read();
        }

        return true;
    }

    private boolean findQueueFamilies() {
        Integer graphicsQueueFamilyIndex = null;
        Integer presentationQueueFamilyIndex = null;

        try (Arena localArena = Arena.ofConfined()) {
            IntBuffer pQueueFamilyCount = IntBuffer.allocate(localArena);
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pQueueFamilyCount, null);

            int queueFamilyCount = pQueueFamilyCount.read();
            var queueFamilyProperties = VkQueueFamilyProperties.allocate(localArena, queueFamilyCount);
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(
                    physicalDevice,
                    pQueueFamilyCount,
                    queueFamilyProperties[0]
            );

            for (int i = 0; i < queueFamilyCount; i++) {
                if ((queueFamilyProperties[i].queueFlags() & VkQueueFlags.VK_QUEUE_GRAPHICS_BIT) != 0) {
                    graphicsQueueFamilyIndex = i;
                }

                IntBuffer pSupported = IntBuffer.allocate(localArena);
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
            var physicalDeviceFeatures = VkPhysicalDeviceFeatures.allocate(localArena);

            var deviceCreateInfo = VkDeviceCreateInfo.allocate(localArena);
            deviceCreateInfo.pEnabledFeatures(physicalDeviceFeatures);
            if (graphicsQueueFamilyIndex == presentationQueueFamilyIndex) {
                var graphicsQueueCreateInfo = VkDeviceQueueCreateInfo.allocate(localArena);
                graphicsQueueCreateInfo.queueFamilyIndex(graphicsQueueFamilyIndex);
                graphicsQueueCreateInfo.queueCount(1);
                var pQueuePriorities = FloatBuffer.allocate(localArena);
                pQueuePriorities.write(1.0f);
                graphicsQueueCreateInfo.pQueuePriorities(pQueuePriorities);

                deviceCreateInfo.queueCreateInfoCount(1);
                deviceCreateInfo.pQueueCreateInfos(graphicsQueueCreateInfo);
            }
            else {
                var queueCreateInfos = VkDeviceQueueCreateInfo.allocate(localArena, 2);
                queueCreateInfos[0].queueFamilyIndex(graphicsQueueFamilyIndex);
                queueCreateInfos[0].queueCount(1);
                var pGraphicsQueuePriorities = FloatBuffer.allocate(localArena);
                pGraphicsQueuePriorities.write(1.0f);
                queueCreateInfos[0].pQueuePriorities(pGraphicsQueuePriorities);

                queueCreateInfos[1].queueFamilyIndex(presentationQueueFamilyIndex);
                queueCreateInfos[1].queueCount(1);
                var pPresentationQueuePriorities = FloatBuffer.allocate(localArena);
                pPresentationQueuePriorities.write(1.0f);
                queueCreateInfos[1].pQueuePriorities(pPresentationQueuePriorities);

                deviceCreateInfo.queueCreateInfoCount(2);
                deviceCreateInfo.pQueueCreateInfos(queueCreateInfos[0]);
            }
            deviceCreateInfo.enabledExtensionCount(1);
            MemorySegment ppEnabledExtensionNames = localArena.allocate(ValueLayout.ADDRESS);
            ppEnabledExtensionNames.set(ValueLayout.ADDRESS, 0, swapchainExtensionNameByteArray.segment());
            deviceCreateInfo.ppEnabledExtensionNames(ppEnabledExtensionNames);

            var pDevice = VkDevice.Buffer.allocate(localArena);
            var result = instanceCommands.vkCreateDevice(physicalDevice, deviceCreateInfo, null, pDevice);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 设备失败：" + result);
                return false;
            }

            device = pDevice.read();
            deviceCommands = new DeviceCommands(this::loadDeviceCommand, this::loadInstanceCommand);

            var pGraphicsQueue = VkQueue.Buffer.allocate(localArena);
            deviceCommands.vkGetDeviceQueue(device, graphicsQueueFamilyIndex, 0, pGraphicsQueue);
            graphicsQueue = pGraphicsQueue.read();

            var pPresentationQueue = VkQueue.Buffer.allocate(localArena);
            deviceCommands.vkGetDeviceQueue(device, presentationQueueFamilyIndex, 0, pPresentationQueue);
            presentationQueue = pPresentationQueue.read();

            var pDeviceExtensionCount = IntBuffer.allocate(localArena);
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
            var surfaceCapabilities = VkSurfaceCapabilitiesKHR.allocate(localArena);
            var result = instanceCommands.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(
                    physicalDevice,
                    surface,
                    surfaceCapabilities
            );
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 表面能力失败：" + result);
                return false;
            }

            var pSurfaceFormatCount = IntBuffer.allocate(localArena);
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
            var surfaceFormats = VkSurfaceFormatKHR.allocate(localArena, surfaceFormatCount);
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

            swapExtent = VkExtent2D.allocate(arena);
            if (surfaceCapabilities.currentExtent().width() != 0xFFFFFFFF) {
                swapExtent.width(surfaceCapabilities.currentExtent().width());
                swapExtent.height(surfaceCapabilities.currentExtent().height());
            }
            else {
                IntBuffer wh = IntBuffer.allocate(localArena, 2);
                libGLFW.glfwGetWindowSize(glfwWindow, wh);

                swapExtent.width(wh.read(0));
                swapExtent.height(wh.read(1));

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

            var swapchainCreateInfo = VkSwapchainCreateInfoKHR.allocate(localArena);
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
                IntBuffer queueFamilyIndices = IntBuffer.allocate(localArena, 2);
                queueFamilyIndices.write(0, graphicsQueueFamilyIndex);
                queueFamilyIndices.write(1, presentationQueueFamilyIndex);
                swapchainCreateInfo.pQueueFamilyIndices(queueFamilyIndices);
            }
            else {
                swapchainCreateInfo.imageSharingMode(VkSharingMode.VK_SHARING_MODE_EXCLUSIVE);
            }

            swapchainCreateInfo.preTransform(surfaceCapabilities.currentTransform());
            swapchainCreateInfo.compositeAlpha(VkCompositeAlphaFlagsKHR.VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR);
            swapchainCreateInfo.presentMode(VkPresentModeKHR.VK_PRESENT_MODE_FIFO_KHR);
            swapchainCreateInfo.clipped(Constants.VK_TRUE);

            pSwapchain = VkSwapchainKHR.Buffer.allocate(arena);
            result = deviceCommands.vkCreateSwapchainKHR(device, swapchainCreateInfo, null, pSwapchain);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 交换链失败：" + result);
                return false;
            }
            swapchain = pSwapchain.read();

            var pSwapchainImageCount = IntBuffer.allocate(localArena);
            result = deviceCommands.vkGetSwapchainImagesKHR(device, swapchain, pSwapchainImageCount, null);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 交换链图像失败：" + result);
                return false;
            }

            int swapchainImageCount = pSwapchainImageCount.read();
            var pSwapchainImages = VkImage.Buffer.allocate(localArena, swapchainImageCount);
            result = deviceCommands.vkGetSwapchainImagesKHR(device, swapchain, pSwapchainImageCount, pSwapchainImages);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 交换链图像失败：" + result);
                return false;
            }
            swapchainImages = pSwapchainImages.readAll();

            return true;
        }
    }

    private boolean createImageViews() {
        pSwapchainImageViews = VkImageView.Buffer.allocate(arena, swapchainImages.length);
        swapchainImageViews = new VkImageView[swapchainImages.length];

        try (Arena localArena = Arena.ofConfined()) {
            var pImageView = VkImageView.Buffer.allocate(localArena);

            for (int i = 0; i < swapchainImages.length; i++) {
                var createInfo = VkImageViewCreateInfo.allocate(localArena);
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

                var result = deviceCommands.vkCreateImageView(device, createInfo, null, pImageView);
                if (result != VkResult.VK_SUCCESS) {
                    UICommons.showErrorMessage("创建 Vulkan 图像视图失败：" + result);
                    return false;
                }

                swapchainImageViews[i] = pImageView.read();
                pSwapchainImageViews.write(i, swapchainImageViews[i]);
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

            var shaderStageInfos = VkPipelineShaderStageCreateInfo.allocate(localArena, 2);
            shaderStageInfos[0].stage(VkShaderStageFlags.VK_SHADER_STAGE_VERTEX_BIT);
            shaderStageInfos[0].module(shaderModules[0]);
            shaderStageInfos[0].pName(ByteBuffer.allocateString(localArena, "main"));
            shaderStageInfos[1].stage(VkShaderStageFlags.VK_SHADER_STAGE_FRAGMENT_BIT);
            shaderStageInfos[1].module(shaderModules[1]);
            shaderStageInfos[1].pName(ByteBuffer.allocateString(localArena, "main"));

            @enumtype(VkDynamicState.class) IntBuffer dynamicStates = IntBuffer.allocate(localArena, 2);
            dynamicStates.write(0, VkDynamicState.VK_DYNAMIC_STATE_VIEWPORT);
            dynamicStates.write(1, VkDynamicState.VK_DYNAMIC_STATE_SCISSOR);
            var dynamicStateInfo = VkPipelineDynamicStateCreateInfo.allocate(localArena);
            dynamicStateInfo.dynamicStateCount(2);
            dynamicStateInfo.pDynamicStates(dynamicStates);

            var vertexInputInfo = VkPipelineVertexInputStateCreateInfo.allocate(localArena);
            var inputAssemblyInfo = VkPipelineInputAssemblyStateCreateInfo.allocate(localArena);
            inputAssemblyInfo.topology(VkPrimitiveTopology.VK_PRIMITIVE_TOPOLOGY_TRIANGLE_LIST);
            inputAssemblyInfo.primitiveRestartEnable(Constants.VK_FALSE);

            var viewport = VkViewport.allocate(localArena);
            viewport.x(0.0f);
            viewport.y(0.0f);
            viewport.width(swapExtent.width());
            viewport.height(swapExtent.height());
            viewport.minDepth(0.0f);
            viewport.maxDepth(1.0f);

            var scissor = VkRect2D.allocate(localArena);
            scissor.extent(swapExtent);

            var viewportStateInfo = VkPipelineViewportStateCreateInfo.allocate(localArena);
            viewportStateInfo.viewportCount(1);
            viewportStateInfo.pViewports(viewport);
            viewportStateInfo.scissorCount(1);
            viewportStateInfo.pScissors(scissor);

            var rasterizationInfo = VkPipelineRasterizationStateCreateInfo.allocate(localArena);
            rasterizationInfo.polygonMode(VkPolygonMode.VK_POLYGON_MODE_FILL);
            rasterizationInfo.lineWidth(1.0f);
            rasterizationInfo.cullMode(VkCullModeFlags.VK_CULL_MODE_BACK_BIT);
            rasterizationInfo.frontFace(VkFrontFace.VK_FRONT_FACE_CLOCKWISE);
            rasterizationInfo.depthBiasClamp(0.0f);
            rasterizationInfo.depthBiasSlopeFactor(0.0f);

            var multisampleInfo = VkPipelineMultisampleStateCreateInfo.allocate(localArena);
            multisampleInfo.rasterizationSamples(VkSampleCountFlags.VK_SAMPLE_COUNT_1_BIT);
            multisampleInfo.minSampleShading(1.0f);

            var pipelineColorBlendAttachmentState = VkPipelineColorBlendAttachmentState.allocate(localArena);
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

            var pipelineColorBlendStateInfo = VkPipelineColorBlendStateCreateInfo.allocate(localArena);
            pipelineColorBlendStateInfo.logicOp(VkLogicOp.VK_LOGIC_OP_COPY);
            pipelineColorBlendStateInfo.attachmentCount(1);
            pipelineColorBlendStateInfo.pAttachments(pipelineColorBlendAttachmentState);
            pipelineColorBlendStateInfo.blendConstants().write(0, 0.0f);
            pipelineColorBlendStateInfo.blendConstants().write(1, 0.0f);
            pipelineColorBlendStateInfo.blendConstants().write(2, 0.0f);
            pipelineColorBlendStateInfo.blendConstants().write(3, 0.0f);

            var pipelineLayoutCreateInfo = VkPipelineLayoutCreateInfo.allocate(localArena);
            var pPipelineLayout = VkPipelineLayout.Buffer.allocate(localArena, 1);
            if (deviceCommands.vkCreatePipelineLayout(device, pipelineLayoutCreateInfo, null, pPipelineLayout) != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 管线布局失败");
                return false;
            }
            pipelineLayout = pPipelineLayout.read();

            var colorAttachmentDescription = VkAttachmentDescription.allocate(localArena);
            colorAttachmentDescription.format(swapchainImageFormat);
            colorAttachmentDescription.samples(VkSampleCountFlags.VK_SAMPLE_COUNT_1_BIT);
            colorAttachmentDescription.loadOp(VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_CLEAR);
            colorAttachmentDescription.storeOp(VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_STORE);
            colorAttachmentDescription.stencilLoadOp(VkAttachmentLoadOp.VK_ATTACHMENT_LOAD_OP_DONT_CARE);
            colorAttachmentDescription.stencilStoreOp(VkAttachmentStoreOp.VK_ATTACHMENT_STORE_OP_DONT_CARE);
            colorAttachmentDescription.initialLayout(VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED);
            colorAttachmentDescription.finalLayout(VkImageLayout.VK_IMAGE_LAYOUT_PRESENT_SRC_KHR);

            var colorAttachmentReference = VkAttachmentReference.allocate(localArena);
            colorAttachmentReference.attachment(0);
            colorAttachmentReference.layout(VkImageLayout.VK_IMAGE_LAYOUT_COLOR_ATTACHMENT_OPTIMAL);

            var subpassDescription = VkSubpassDescription.allocate(localArena);
            subpassDescription.pipelineBindPoint(VkPipelineBindPoint.VK_PIPELINE_BIND_POINT_GRAPHICS);
            subpassDescription.colorAttachmentCount(1);
            subpassDescription.pColorAttachments(colorAttachmentReference);

            var subpassDependency = VkSubpassDependency.allocate(localArena);
            subpassDependency.srcSubpass(Constants.VK_SUBPASS_EXTERNAL);
            subpassDependency.dstSubpass(0);
            subpassDependency.srcStageMask(VkPipelineStageFlags.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);
            subpassDependency.srcAccessMask(0);
            subpassDependency.dstStageMask(VkPipelineStageFlags.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);
            subpassDependency.dstAccessMask(
                    VkAccessFlags.VK_ACCESS_COLOR_ATTACHMENT_READ_BIT |
                    VkAccessFlags.VK_ACCESS_COLOR_ATTACHMENT_WRITE_BIT
            );

            var renderPassCreateInfo = VkRenderPassCreateInfo.allocate(localArena);
            renderPassCreateInfo.attachmentCount(1);
            renderPassCreateInfo.pAttachments(colorAttachmentDescription);
            renderPassCreateInfo.subpassCount(1);
            renderPassCreateInfo.pSubpasses(subpassDescription);
            renderPassCreateInfo.dependencyCount(1);
            renderPassCreateInfo.pDependencies(subpassDependency);

            var pRenderPass = VkRenderPass.Buffer.allocate(localArena, 1);
            var result = deviceCommands.vkCreateRenderPass(device, renderPassCreateInfo, null, pRenderPass);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 渲染通道失败：" + result);
                return false;
            }
            renderPass = pRenderPass.read();

            var graphicsPipelineCreateInfo = VkGraphicsPipelineCreateInfo.allocate(localArena);
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

            var pGraphicsPipeline = VkPipeline.Buffer.allocate(localArena, 1);
            result = deviceCommands.vkCreateGraphicsPipelines(
                    device,
                    null,
                    1,
                    graphicsPipelineCreateInfo,
                    null,
                    pGraphicsPipeline
            );
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 图形管线失败：" + result);
                return false;
            }
            graphicsPipeline = pGraphicsPipeline.read();

            deviceCommands.vkDestroyShaderModule(device, shaderModules[0], null);
            deviceCommands.vkDestroyShaderModule(device, shaderModules[1], null);
            return true;
        }
    }

    private VkShaderModule[] createShaderModules(Arena localArena) {
        try {
            MemorySegment vertexShaderCode = ShaderUtil.readShaderCode("vert.spv", localArena);
            MemorySegment fragmentShaderCode = ShaderUtil.readShaderCode("frag.spv", localArena);

            var createInfos = VkShaderModuleCreateInfo.allocate(localArena, 2);
            createInfos[0].codeSize(vertexShaderCode.byteSize());
            createInfos[0].pCodeRaw(vertexShaderCode);
            createInfos[1].codeSize(fragmentShaderCode.byteSize());
            createInfos[1].pCodeRaw(fragmentShaderCode);

            var ret = new VkShaderModule[2];
            var pShaderModule = VkShaderModule.Buffer.allocate(arena);
            for (int i = 0; i < 2; i++) {
                var result = deviceCommands.vkCreateShaderModule(device, createInfos[i], null, pShaderModule);
                if (result != VkResult.VK_SUCCESS) {
                    UICommons.showErrorMessage("创建 Vulkan 着色器模块失败：" + result);
                    return null;
                }

                ret[i] = pShaderModule.read();
            }
            return ret;
        } catch (IOException e) {
            UICommons.showErrorMessage("读取着色器代码失败：" + e);
            return null;
        }
    }

    private boolean createFramebuffers() {
        swapchainFramebuffers = new VkFramebuffer[swapchainImageViews.length];
        try (Arena localArena = Arena.ofConfined()) {
            var pSwapchainFramebuffer = VkFramebuffer.Buffer.allocate(localArena);
            var framebufferCreateInfo = VkFramebufferCreateInfo.allocate(localArena);

            for (int i = 0; i < swapchainImageViews.length; i++) {
                framebufferCreateInfo.renderPass(renderPass);
                framebufferCreateInfo.attachmentCount(1);
                framebufferCreateInfo.pAttachments(pSwapchainImageViews.offset(i));
                framebufferCreateInfo.width(swapExtent.width());
                framebufferCreateInfo.height(swapExtent.height());
                framebufferCreateInfo.layers(1);

                var result = deviceCommands.vkCreateFramebuffer(device, framebufferCreateInfo, null, pSwapchainFramebuffer);
                if (result != VkResult.VK_SUCCESS) {
                    UICommons.showErrorMessage("创建 Vulkan 帧缓冲失败：" + result);
                    return false;
                }

                swapchainFramebuffers[i] = pSwapchainFramebuffer.read();
            }

            return true;
        }
    }

    private boolean createCommandPool() {
        try (Arena localArena = Arena.ofConfined()) {
            var poolCreateInfo = VkCommandPoolCreateInfo.allocate(localArena);
            poolCreateInfo.queueFamilyIndex(graphicsQueueFamilyIndex);
            poolCreateInfo.flags(VkCommandPoolCreateFlags.VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT);
            poolCreateInfo.queueFamilyIndex(graphicsQueueFamilyIndex);

            var pCommandPool = VkCommandPool.Buffer.allocate(localArena, 1);
            var result = deviceCommands.vkCreateCommandPool(device, poolCreateInfo, null, pCommandPool);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 命令池失败：" + result);
                return false;
            }
            commandPool = pCommandPool.read();
            return true;
        }
    }

    private boolean createCommandBuffer() {
        try (Arena localArena = Arena.ofConfined()) {
            var allocateInfo = VkCommandBufferAllocateInfo.allocate(localArena);
            allocateInfo.commandPool(commandPool);
            allocateInfo.level(VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_PRIMARY);
            allocateInfo.commandBufferCount(1);

            pCommandBuffer = VkCommandBuffer.Buffer.allocate(arena);
            var result = deviceCommands.vkAllocateCommandBuffers(device, allocateInfo, pCommandBuffer);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("分配 Vulkan 命令缓冲区失败：" + result);
                return false;
            }

            commandBuffer = pCommandBuffer.read();
            return true;
        }
    }

    private boolean createSyncObjects() {
        pImageAvailableSemaphores = VkSemaphore.Buffer.allocate(arena);
        pRenderFinishedSemaphores = VkSemaphore.Buffer.allocate(arena);
        pInFlightFences = VkFence.Buffer.allocate(arena);

        try (Arena localArena = Arena.ofConfined()) {
            var semaphoreCreateInfo = VkSemaphoreCreateInfo.allocate(localArena);
            var fenceCreateInfo = VkFenceCreateInfo.allocate(localArena);
            fenceCreateInfo.flags(VkFenceCreateFlags.VK_FENCE_CREATE_SIGNALED_BIT);

            if (deviceCommands.vkCreateSemaphore(device, semaphoreCreateInfo, null, pImageAvailableSemaphores) != VkResult.VK_SUCCESS ||
                deviceCommands.vkCreateSemaphore(device, semaphoreCreateInfo, null, pRenderFinishedSemaphores) != VkResult.VK_SUCCESS ||
                deviceCommands.vkCreateFence(device, fenceCreateInfo, null, pInFlightFences) != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("创建 Vulkan 同步对象失败");
                return false;
            }

            imageAvailableSemaphores = pImageAvailableSemaphores.read();
            renderFinishedSemaphores = pRenderFinishedSemaphores.read();
            return true;
        }
    }

    private boolean drawFrame() {
        deviceCommands.vkWaitForFences(device, 1, pInFlightFences, Constants.VK_TRUE, 0xFFFFFFFF_FFFFFFFFL);
        deviceCommands.vkResetFences(device, 1, pInFlightFences);
        try (Arena localArena = Arena.ofConfined()) {
            @unsigned var pImageIndex = IntBuffer.allocate(localArena);
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

            var submitInfo = VkSubmitInfo.allocate(localArena);
            submitInfo.waitSemaphoreCount(1);
            submitInfo.pWaitSemaphores(pImageAvailableSemaphores);
            var submitInfoWaitStages = IntBuffer.allocate(localArena);
            submitInfoWaitStages.write(VkPipelineStageFlags.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);
            submitInfo.pWaitDstStageMask(submitInfoWaitStages);
            submitInfo.commandBufferCount(1);
            submitInfo.pCommandBuffers(pCommandBuffer);
            submitInfo.signalSemaphoreCount(1);
            submitInfo.pSignalSemaphores(pRenderFinishedSemaphores);

            if (deviceCommands.vkQueueSubmit(graphicsQueue, 1, submitInfo, pInFlightFences.read()) != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("提交 Vulkan 命令缓冲区失败");
                return false;
            }

            var presentInfo = VkPresentInfoKHR.allocate(localArena);
            presentInfo.waitSemaphoreCount(1);
            presentInfo.pWaitSemaphores(pRenderFinishedSemaphores);
            presentInfo.swapchainCount(1);
            presentInfo.pSwapchains(pSwapchain);
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
            var beginInfo = VkCommandBufferBeginInfo.allocate(localArena);
            beginInfo.flags(VkCommandBufferUsageFlags.VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT);

            var renderPassBeginInfo = VkRenderPassBeginInfo.allocate(localArena);
            renderPassBeginInfo.renderPass(renderPass);
            renderPassBeginInfo.framebuffer(swapchainFramebuffers[imageIndex]);
            renderPassBeginInfo.renderArea().extent(swapExtent);

            var clearValue = VkClearValue.allocate(localArena);
            clearValue.color().float32().write(0, 0.0f);
            clearValue.color().float32().write(1, 0.0f);
            clearValue.color().float32().write(2, 0.0f);
            clearValue.color().float32().write(3, 0.0f);

            renderPassBeginInfo.clearValueCount(1);
            renderPassBeginInfo.pClearValues(clearValue);

            var viewport = VkViewport.allocate(localArena);
            viewport.x(0.0f);
            viewport.y(0.0f);
            viewport.width(swapExtent.width());
            viewport.height(swapExtent.height());
            viewport.minDepth(0.0f);
            viewport.maxDepth(1.0f);

            var scissor = VkRect2D.allocate(localArena);
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
            var nameSegment = ByteBuffer.allocateString(localArena, name);
            MemorySegment segment = staticCommands.vkGetInstanceProcAddr(instance, nameSegment);
            if (segment.address() == 0) {
                return null;
            }

            return Linker.nativeLinker().downcallHandle(segment, descriptor);
        }
    }

    private MethodHandle loadDeviceCommand(String name, FunctionDescriptor descriptor) {
        try (Arena localArena = Arena.ofConfined()) {
            var nameSegment = ByteBuffer.allocateString(localArena, name);
            MemorySegment segment = staticCommands.vkGetDeviceProcAddr(device, nameSegment);
            if (segment.address() == 0) {
                return null;
            }

            return Linker.nativeLinker().downcallHandle(segment, descriptor);
        }
    }

    private static /*VkBool32*/ int debugCallback(
            @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity,
            @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int ignoredMessageType,
            @pointer(target=VkDebugUtilsMessengerCallbackDataEXT.class) MemorySegment pCallbackData,
            @pointer(comment="void*") MemorySegment ignoredPUserData
    ) {
        pCallbackData = pCallbackData.reinterpret(VkDebugUtilsMessengerCallbackDataEXT.LAYOUT.byteSize());

        String severity = switch (messageSeverity) {
            case VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT -> "verbose";
            case VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT -> "info";
            case VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT -> "warn";
            case VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT -> "error";
            default -> "(unknown level)";
        };

        String message = new VkDebugUtilsMessengerCallbackDataEXT(pCallbackData).pMessage().readString();
        System.err.println("[" + severity + "] " + message);

        return Constants.VK_FALSE;
    }

    private final Arena arena = Arena.ofConfined();
    private final String validationLayerName = "VK_LAYER_KHRONOS_validation";
    private final ByteBuffer validationLayerNameByteArray = ByteBuffer.allocateString(arena, validationLayerName);
    private final String validationExtensionName = "VK_EXT_debug_utils";
    private final ByteBuffer validationExtensionNameByteArray = ByteBuffer.allocateString(arena, validationExtensionName);
    private final String swapchainExtensionName = "VK_KHR_swapchain";
    private final ByteBuffer swapchainExtensionNameByteArray = ByteBuffer.allocateString(arena, swapchainExtensionName);
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
    private VkSwapchainKHR.Buffer pSwapchain;
    private VkSwapchainKHR swapchain;
    private @enumtype(VkFormat.class) int swapchainImageFormat;
    private VkExtent2D swapExtent;
    private VkImage[] swapchainImages;
    private VkImageView.Buffer pSwapchainImageViews;
    private VkImageView[] swapchainImageViews;
    private VkPipelineLayout pipelineLayout;
    private VkRenderPass renderPass;
    private VkPipeline graphicsPipeline;
    private VkFramebuffer[] swapchainFramebuffers;
    private VkCommandPool commandPool;
    private VkCommandBuffer.Buffer pCommandBuffer;
    private VkCommandBuffer commandBuffer;
    private VkSemaphore.Buffer pImageAvailableSemaphores;
    private VkSemaphore imageAvailableSemaphores;
    private VkSemaphore.Buffer pRenderFinishedSemaphores;
    private VkSemaphore renderFinishedSemaphores;
    private VkFence.Buffer pInFlightFences;

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
