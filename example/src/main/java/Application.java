import tech.icey.glfwmini.LibGLFW;
import tech.icey.vk4j.Constants;
import tech.icey.vk4j.Create;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.Version;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.array.ByteArray;
import tech.icey.vk4j.array.IntArray;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.command.DeviceCommands;
import tech.icey.vk4j.command.EntryCommands;
import tech.icey.vk4j.command.InstanceCommands;
import tech.icey.vk4j.command.StaticCommands;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.FloatPtr;
import tech.icey.vk4j.ptr.IntPtr;

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

        return true;
    }

    public void mainLoop() {

    }

    public void cleanup() {
        if (debugMessenger != null) {
            instanceCommands.vkDestroyDebugUtilsMessengerEXT(instance, debugMessenger, null);
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

            VkExtent2D swapExtent;
            if (surfaceCapabilities.currentExtent().width() != 0xFFFFFFFF) {
                swapExtent = surfaceCapabilities.currentExtent();
            }
            else {
                IntArray wh = IntArray.allocate(localArena, 2);
                libGLFW.glfwGetWindowSize(glfwWindow, wh);

                swapExtent = Create.create(VkExtent2D.FACTORY, localArena);
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
            var swapchainImages = Create.createArray(VkImage.FACTORY, localArena, swapchainImageCount).first;
            result = deviceCommands.vkGetSwapchainImagesKHR(device, swapchain, pSwapchainImageCount, swapchainImages[0]);
            if (result != VkResult.VK_SUCCESS) {
                UICommons.showErrorMessage("获取 Vulkan 交换链图像失败：" + result);
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
    private VkImage[] swapchainImages;

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
