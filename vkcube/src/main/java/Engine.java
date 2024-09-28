import tech.icey.glfwmini.LibGLFW;
import tech.icey.vk4j.Constants;
import tech.icey.vk4j.Loader;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.Version;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.annotation.pointer;
import tech.icey.vk4j.annotation.unsigned;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.ByteBuffer;
import tech.icey.vk4j.buffer.FloatBuffer;
import tech.icey.vk4j.buffer.IntBuffer;
import tech.icey.vk4j.buffer.PointerBuffer;
import tech.icey.vk4j.command.DeviceCommands;
import tech.icey.vk4j.command.EntryCommands;
import tech.icey.vk4j.command.InstanceCommands;
import tech.icey.vk4j.command.StaticCommands;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.util.ArrayList;
import java.util.Objects;

public final class Engine implements AutoCloseable {
    public Engine() {
        libGLFW = new LibGLFW(Loader::loadFunction);
        staticCommands = new StaticCommands(Loader::loadFunction);
        entryCommands = new EntryCommands(Loader::loadFunction);

        if (libGLFW.glfwInit() == LibGLFW.GLFW_FALSE) {
            throw new RuntimeException("GLFW 初始化失败");
        }

        initVulkanInstance();
        initPhysicalDevice();
        initWindow();
        detectQueueFamilies();
        initLogicalDevice();
        createSwapchain(windowExtent.width(), windowExtent.height());
        initCommands();
    }

    public void run() {
        while (!libGLFW.glfwWindowShouldClose(glfwWindow)) {
            libGLFW.glfwPollEvents();

            if (pauseRendering) {
                continue;
            }

            draw();
        }

        pauseRendering = true;
    }

    public void draw() {
        var currentFrameData = frameData[frameNumber % frameData.length];
        try (Arena localArena = Arena.ofConfined()) {
            VkFence.Buffer pFence = VkFence.Buffer.allocate(localArena);
            pFence.write(currentFrameData.renderFence);

            System.err.println("before vkWaitForFences");
            var result = deviceCommands.vkWaitForFences(device, 1, pFence, Constants.VK_TRUE, 1_000_000_000L);
            System.err.println("after vkWaitForFences");
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("等待渲染信号量失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            var pSwapchainImageIndex = IntBuffer.allocate(localArena);
            result = deviceCommands.vkAcquireNextImageKHR(
                    device,
                    swapchain,
                    NativeLayout.UINT64_MAX,
                    currentFrameData.swapchainSemaphore,
                    null,
                    pSwapchainImageIndex
            );
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("获取交换链图像失败，Vulkan 错误码: " + VkResult.explain(result));
            }
            var swapchainImageIndex = pSwapchainImageIndex.read();

            result = deviceCommands.vkResetCommandBuffer(currentFrameData.mainCommandBuffer, 0);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("重置命令缓冲失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            var commandBufferBeginInfo = VkCommandBufferBeginInfo.allocate(localArena);
            commandBufferBeginInfo.flags(VkCommandBufferUsageFlags.VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT);

            result = deviceCommands.vkBeginCommandBuffer(currentFrameData.mainCommandBuffer, commandBufferBeginInfo);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("开始记录命令缓冲失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            var imageBarrier = VkImageMemoryBarrier2.allocate(localArena);
            imageBarrier.srcStageMask(VkPipelineStageFlags.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);
            imageBarrier.srcAccessMask(VkAccessFlags2.VK_ACCESS_2_MEMORY_WRITE_BIT);
            imageBarrier.dstStageMask(VkPipelineStageFlags.VK_PIPELINE_STAGE_COLOR_ATTACHMENT_OUTPUT_BIT);
            imageBarrier.dstAccessMask(VkAccessFlags2.VK_ACCESS_2_MEMORY_READ_BIT | VkAccessFlags2.VK_ACCESS_2_MEMORY_WRITE_BIT);
            imageBarrier.oldLayout(VkImageLayout.VK_IMAGE_LAYOUT_UNDEFINED);
            imageBarrier.newLayout(VkImageLayout.VK_IMAGE_LAYOUT_GENERAL);

            var clearRange = VkImageSubresourceRange.allocate(localArena);
            clearRange.aspectMask(VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT);
            clearRange.baseMipLevel(0);
            clearRange.levelCount(Constants.VK_REMAINING_MIP_LEVELS);
            clearRange.baseArrayLayer(0);
            clearRange.layerCount(Constants.VK_REMAINING_ARRAY_LAYERS);

            imageBarrier.subresourceRange(clearRange);

            var clearColorValue = VkClearColorValue.allocate(localArena);
            var float32Value = clearColorValue.float32();
            var flash = Math.abs(Math.sin(frameNumber / 120.0f));
            float32Value.write(0, 0.0f);
            float32Value.write(1, 0.0f);
            float32Value.write(2, (float) flash);
            float32Value.write(3, 1.0f);

            result = deviceCommands.vkResetFences(device, 1, pFence);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("重置渲染信号量失败，Vulkan 错误码: " + VkResult.explain(result));
            }
        }
    }

    public int getFrameNumber() {
        return frameNumber;
    }

    public boolean shouldStopRendering() {
        return pauseRendering;
    }

    @Override
    public void close() {
        deviceCommands.vkDeviceWaitIdle(device);
        for (var data : frameData) {
            deviceCommands.vkDestroyCommandPool(device, data.commandPool, null);
            deviceCommands.vkDestroySemaphore(device, data.swapchainSemaphore, null);
            deviceCommands.vkDestroySemaphore(device, data.renderSemaphore, null);
            deviceCommands.vkDestroyFence(device, data.renderFence, null);
        }

        destroySwapchain();
        deviceCommands.vkDestroyDevice(device, null);
        instanceCommands.vkDestroySurfaceKHR(instance, surface, null);
        if (debugMessenger != null) {
            instanceCommands.vkDestroyDebugUtilsMessengerEXT(instance, debugMessenger, null);
        }
        instanceCommands.vkDestroyInstance(instance, null);

        libGLFW.glfwDestroyWindow(glfwWindow);
        engineArena.close();
    }

    private void initVulkanInstance() {
        boolean hasValidationLayerSupport = checkValidationLayerSupport();

        try (Arena localArena = Arena.ofConfined()) {
            var pExtensionCount = IntBuffer.allocate(localArena);
            var glfwRequiredExtensions = libGLFW.glfwGetRequiredInstanceExtensions(pExtensionCount);
            var extensionCount = pExtensionCount.read();

            var appInfo = VkApplicationInfo.allocate(localArena);
            appInfo.pApplicationName(ByteBuffer.allocateString(localArena, "VkCube4J"));
            appInfo.applicationVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            appInfo.pEngineName(ByteBuffer.allocateString(localArena, "Shenyang WS-15"));
            appInfo.engineVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            appInfo.apiVersion(Version.VK_API_VERSION_1_3);

            var instanceCreateInfo = VkInstanceCreateInfo.allocate(localArena);
            instanceCreateInfo.pApplicationInfo(appInfo);

            if (hasValidationLayerSupport) {
                PointerBuffer ppEnabledLayerNames = PointerBuffer.allocate(localArena);
                ppEnabledLayerNames.write(NameConstants.validationLayerNameByteArray.segment());

                PointerBuffer ppEnabledExtensionNames = PointerBuffer.allocate(localArena, extensionCount + 1);
                for (int i = 0; i < extensionCount; i++) {
                    ppEnabledExtensionNames.write(i, glfwRequiredExtensions.read(i));
                }
                ppEnabledExtensionNames.write(extensionCount, NameConstants.validationExtensionNameByteArray.segment());

                instanceCreateInfo.enabledLayerCount(1);
                instanceCreateInfo.ppEnabledLayerNames(ppEnabledLayerNames.segment());
                instanceCreateInfo.enabledExtensionCount(extensionCount + 1);
                instanceCreateInfo.ppEnabledExtensionNames(ppEnabledExtensionNames.segment());

                var debugMessengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(localArena);
                populateDebugMessengerCreateInfo(debugMessengerCreateInfo);
                instanceCreateInfo.pNext(debugMessengerCreateInfo.segment());
            }
            else {
                instanceCreateInfo.enabledExtensionCount(pExtensionCount.read());
                instanceCreateInfo.ppEnabledExtensionNames(glfwRequiredExtensions.segment());
            }

            var pInstance = VkInstance.Buffer.allocate(localArena);
            var result = entryCommands.vkCreateInstance(instanceCreateInfo, null, pInstance);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("创建 Vulkan 实例失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            instance = pInstance.read();
            instanceCommands = new InstanceCommands(this::loadInstanceCommand);

            if (hasValidationLayerSupport) {
                var debugMessengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(localArena);
                populateDebugMessengerCreateInfo(debugMessengerCreateInfo);
                var pDebugMessenger = VkDebugUtilsMessengerEXT.Buffer.allocate(localArena);
                result = instanceCommands.vkCreateDebugUtilsMessengerEXT(
                        instance,
                        debugMessengerCreateInfo,
                        null,
                        pDebugMessenger
                );
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("创建 Vulkan 调试信使失败，Vulkan 错误码: " + VkResult.explain(result));
                }
                debugMessenger = pDebugMessenger.read();
            }
            else {
                debugMessenger = null;
            }
        }
    }

    private boolean checkValidationLayerSupport() {
        try (Arena localArena = Arena.ofConfined()) {
            var pLayerCount = IntBuffer.allocate(localArena);
            var result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, null);
            if (result != VkResult.VK_SUCCESS) {
                System.err.println("枚举 Vulkan 实例层属性失败，Vulkan 错误码: " + VkResult.explain(result));
                return false;
            }

            var layerCount = pLayerCount.read();
            var layerProperties = VkLayerProperties.allocate(localArena, layerCount);
            result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, layerProperties[0]);
            if (result != VkResult.VK_SUCCESS) {
                System.err.println("枚举 Vulkan 实例层属性失败，Vulkan 错误码: " + VkResult.explain(result));
                return false;
            }

            for (var layerProperty : layerProperties) {
                if (layerProperty.layerName().readString().equals(NameConstants.validationLayerName)) {
                    return true;
                }
            }
        }

        return false;
    }

    private void populateDebugMessengerCreateInfo(VkDebugUtilsMessengerCreateInfoEXT debugMessengerCreateInfo) {
        debugMessengerCreateInfo.messageSeverity(
                VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT |
                        VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_INFO_BIT_EXT |
                        VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT |
                        VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT
        );
        debugMessengerCreateInfo.messageType(
                VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |
                        VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT |
                        VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT
        );
        debugMessengerCreateInfo.pfnUserCallback(DebugCallback.pDebugCallback);
    }

    private void initPhysicalDevice() {
        try (Arena localArena = Arena.ofConfined()) {
            var pPhysicalDeviceCount = IntBuffer.allocate(localArena);
            var result = instanceCommands.vkEnumeratePhysicalDevices(instance, pPhysicalDeviceCount, null);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("枚举 Vulkan 物理设备失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            var physicalDeviceCount = pPhysicalDeviceCount.read();
            if (physicalDeviceCount == 0) {
                throw new RuntimeException("未找到任何支持 Vulkan 的物理设备");
            }

            var pPhysicalDevices = VkPhysicalDevice.Buffer.allocate(localArena, physicalDeviceCount);
            result = instanceCommands.vkEnumeratePhysicalDevices(instance, pPhysicalDeviceCount, pPhysicalDevices);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("枚举 Vulkan 物理设备失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            physicalDevice = pickPhysicalDevice(pPhysicalDevices.readAll());
        }
    }

    private VkPhysicalDevice pickPhysicalDevice(VkPhysicalDevice[] physicalDevices) {
        try (Arena localArena = Arena.ofConfined()) {
            var deviceInfoList = new ArrayList<DeviceInfoDialog.DeviceInfo>();
            var deviceList = new ArrayList<VkPhysicalDevice>();
            for (var physicalDevice : physicalDevices) {
                var properties = VkPhysicalDeviceProperties.allocate(localArena);
                instanceCommands.vkGetPhysicalDeviceProperties(physicalDevice, properties);
                if (properties.apiVersion() < Version.VK_API_VERSION_1_3) {
                    continue;
                }

                var features2 = VkPhysicalDeviceFeatures2.allocate(localArena);
                var featuresVk12 = VkPhysicalDeviceVulkan12Features.allocate(localArena);
                var featuresVk13 = VkPhysicalDeviceVulkan13Features.allocate(localArena);
                features2.pNext(featuresVk12.segment());
                featuresVk12.pNext(featuresVk13.segment());
                instanceCommands.vkGetPhysicalDeviceFeatures2(physicalDevice, features2);

                if (featuresVk12.bufferDeviceAddress() == Constants.VK_FALSE ||
                        featuresVk12.descriptorIndexing() == Constants.VK_FALSE ||
                        featuresVk13.dynamicRendering() == Constants.VK_FALSE ||
                        featuresVk13.synchronization2() == Constants.VK_FALSE) {
                    continue;
                }

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
                var vulkanVersion = Version.decode(properties.apiVersion());

                IntBuffer pNumDeviceExtensions = IntBuffer.allocate(localArena);
                int result = instanceCommands.vkEnumerateDeviceExtensionProperties(
                        physicalDevice,
                        null,
                        pNumDeviceExtensions,
                        null
                );
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("枚举 Vulkan 设备扩展失败，Vulkan 错误码: " + VkResult.explain(result));
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
                    throw new RuntimeException("枚举 Vulkan 设备扩展失败，Vulkan 错误码: " + VkResult.explain(result));
                }

                boolean hasSwapchainSupport = false;
                var extensionNames = new StringBuilder();
                for (int j = 0; j < numDeviceExtensions; j++) {
                    if (extensionProperties[j].extensionName().readString().equals(NameConstants.swapchainExtensionName)) {
                        hasSwapchainSupport = true;
                    }

                    extensionNames.append(extensionProperties[j].extensionNameRaw().getString(0));
                    if (j != numDeviceExtensions - 1) {
                        extensionNames.append(" ");
                    }
                }

                if (!hasSwapchainSupport) {
                    continue;
                }

                deviceInfoList.add(new DeviceInfoDialog.DeviceInfo(
                        deviceName,
                        "设备 ID: " + deviceId + "\n" +
                                "供应商 ID: " + vendorId + "\n" +
                                "设备类型: " + deviceType + "\n" +
                                "驱动版本: " + driverVersion + "\n" +
                                "支持的 Vulkan 版本: " + vulkanVersion + "\n" +
                                "设备扩展: " + extensionNames
                ));
                deviceList.add(physicalDevice);
            }

            var dialog = new DeviceInfoDialog(deviceInfoList);
            dialog.setVisible(true);

            if (dialog.selectedDeviceId == null) {
                // 有点丑但是凑合用吧...
                System.exit(0);
            }

            return deviceList.get(dialog.selectedDeviceId);
        }
    }

    private void initWindow() {
        libGLFW.glfwWindowHint(LibGLFW.GLFW_CLIENT_API, LibGLFW.GLFW_NO_API);
        libGLFW.glfwWindowHint(LibGLFW.GLFW_RESIZABLE, LibGLFW.GLFW_FALSE);
        windowExtent.width(1024);
        windowExtent.height(768);

        glfwWindow = libGLFW.glfwCreateWindow(
                windowExtent.width(),
                windowExtent.height(),
                "VkCube4J",
                MemorySegment.NULL,
                MemorySegment.NULL
        );

        FunctionDescriptor iconifyCallbackDesc = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS, ValueLayout.JAVA_INT);
        MethodHandle iconifyCallback;
        try {
            iconifyCallback = MethodHandles.lookup().findVirtual(
                    Engine.class,
                    "windowIconifyCallback",
                    iconifyCallbackDesc.toMethodType()
            ).bindTo(this);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        MemorySegment segment = Linker.nativeLinker().upcallStub(iconifyCallback, iconifyCallbackDesc, engineArena);
        libGLFW.glfwSetWindowIconifyCallback(glfwWindow, segment);

        try (Arena localArena = Arena.ofConfined()) {
            var pSurface = VkSurfaceKHR.Buffer.allocate(localArena);
            var result = libGLFW.glfwCreateWindowSurface(instance, glfwWindow, null, pSurface);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("创建 Vulkan 表面失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            surface = pSurface.read();
        }
    }

    private void detectQueueFamilies() {
        try (Arena localArena = Arena.ofConfined()) {
            var pQueueFamilyCount = IntBuffer.allocate(localArena);
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pQueueFamilyCount, null);
            var queueFamilyCount = pQueueFamilyCount.read();

            var queueFamilies = VkQueueFamilyProperties.allocate(localArena, queueFamilyCount);
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(physicalDevice, pQueueFamilyCount, queueFamilies[0]);

            var pSupportsPresent = IntBuffer.allocate(localArena);
            for (int i = 0; i < queueFamilyCount; i++) {
                if ((queueFamilies[i].queueFlags() & VkQueueFlags.VK_QUEUE_GRAPHICS_BIT) != 0) {
                    graphicsQueueFamilyIndex = i;
                }

                instanceCommands.vkGetPhysicalDeviceSurfaceSupportKHR(physicalDevice, i, surface, pSupportsPresent);
                if (pSupportsPresent.read() == Constants.VK_TRUE) {
                    presentQueueFamilyIndex = i;
                }

                if (graphicsQueueFamilyIndex != null && presentQueueFamilyIndex != null) {
                    break;
                }
            }
        }

        if (graphicsQueueFamilyIndex == null) {
            throw new RuntimeException("未找到支持图形队列的队列族");
        }

        if (presentQueueFamilyIndex == null) {
            throw new RuntimeException("未找到支持呈现队列的队列族");
        }
    }

    private void initLogicalDevice() {
        try (Arena localArena = Arena.ofConfined()) {
            var deviceFeatures = VkPhysicalDeviceFeatures.allocate(localArena);
            var deviceCreateInfo = VkDeviceCreateInfo.allocate(localArena);
            deviceCreateInfo.pEnabledFeatures(deviceFeatures);
            deviceCreateInfo.enabledExtensionCount(1);
            var ppEnabledExtensionNames = PointerBuffer.allocate(localArena);
            ppEnabledExtensionNames.write(NameConstants.swapchainExtensionNameByteArray.segment());
            deviceCreateInfo.ppEnabledExtensionNames(ppEnabledExtensionNames.segment());

            var pPriority = FloatBuffer.allocate(localArena);
            pPriority.write(0, 1.0f);
            if (!Objects.equals(graphicsQueueFamilyIndex, presentQueueFamilyIndex)) {
                var queueCreateInfos = VkDeviceQueueCreateInfo.allocate(localArena, 2);
                queueCreateInfos[0].queueCount(1);
                queueCreateInfos[0].queueFamilyIndex(graphicsQueueFamilyIndex);
                queueCreateInfos[0].pQueuePriorities(pPriority);
                queueCreateInfos[1].queueCount(1);
                queueCreateInfos[1].queueFamilyIndex(presentQueueFamilyIndex);
                queueCreateInfos[1].pQueuePriorities(pPriority);

                deviceCreateInfo.queueCreateInfoCount(2);
                deviceCreateInfo.pQueueCreateInfos(queueCreateInfos[0]);
            }
            else {
                var queueCreateInfo = VkDeviceQueueCreateInfo.allocate(localArena);
                queueCreateInfo.queueCount(1);
                queueCreateInfo.queueFamilyIndex(graphicsQueueFamilyIndex);
                queueCreateInfo.pQueuePriorities(pPriority);

                deviceCreateInfo.queueCreateInfoCount(1);
                deviceCreateInfo.pQueueCreateInfos(queueCreateInfo);
            }

            var pDevice = VkDevice.Buffer.allocate(localArena);
            var result = instanceCommands.vkCreateDevice(physicalDevice, deviceCreateInfo, null, pDevice);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("创建 Vulkan 逻辑设备失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            device = pDevice.read();
            deviceCommands = new DeviceCommands(this::loadDeviceCommand, this::loadInstanceCommand);

            var pGraphicsQueue = VkQueue.Buffer.allocate(localArena);
            deviceCommands.vkGetDeviceQueue(device, graphicsQueueFamilyIndex, 0, pGraphicsQueue);
            graphicsQueue = pGraphicsQueue.read();
        }
    }

    private void createSwapchain(@unsigned int width, @unsigned int height) {
        try (Arena localArena = Arena.ofConfined()) {
            var pCapabilities = VkSurfaceCapabilitiesKHR.allocate(localArena);
            instanceCommands.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(physicalDevice, surface, pCapabilities);

            IntBuffer pSurfaceFormatCount = IntBuffer.allocate(localArena);
            var result = instanceCommands.vkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, pSurfaceFormatCount, null);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("获取表面支持的格式失败，Vulkan 错误码: " + VkResult.explain(result));
            }
            var surfaceFormatCount = pSurfaceFormatCount.read();

            var pSurfaceFormats = VkSurfaceFormatKHR.allocate(localArena, surfaceFormatCount);
            result = instanceCommands.vkGetPhysicalDeviceSurfaceFormatsKHR(physicalDevice, surface, pSurfaceFormatCount, pSurfaceFormats[0]);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("获取表面支持的格式失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            boolean hasFoundIdealFormat = false;
            for (var surfaceFormat : pSurfaceFormats) {
                if (surfaceFormat.format() == VkFormat.VK_FORMAT_B8G8R8A8_SRGB &&
                        surfaceFormat.colorSpace() == VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR) {
                    swapchainImageFormat = surfaceFormat.format();
                    hasFoundIdealFormat = true;
                    break;
                }
            }

            if (!hasFoundIdealFormat) {
                swapchainImageFormat = pSurfaceFormats[0].format();
            }

            if (pCapabilities.currentExtent().width() != NativeLayout.UINT32_MAX) {
                swapchainExtent.width(pCapabilities.currentExtent().width());
                swapchainExtent.height(pCapabilities.currentExtent().height());
            }
            else {
                swapchainExtent.width(Math.max(
                        pCapabilities.minImageExtent().width(),
                        Math.min(pCapabilities.maxImageExtent().width(), width)
                ));
                swapchainExtent.height(Math.max(
                        pCapabilities.minImageExtent().height(),
                        Math.min(pCapabilities.maxImageExtent().height(), height)
                ));
            }

            var imageCount = pCapabilities.minImageCount() + 1;
            if (pCapabilities.maxImageCount() != 0 && imageCount > pCapabilities.maxImageCount()) {
                imageCount = pCapabilities.maxImageCount();
            }

            var swapchainCreateInfo = VkSwapchainCreateInfoKHR.allocate(localArena);
            swapchainCreateInfo.surface(surface);
            swapchainCreateInfo.minImageCount(imageCount);
            swapchainCreateInfo.imageFormat(swapchainImageFormat);
            swapchainCreateInfo.imageColorSpace(swapchainColorSpace);
            swapchainCreateInfo.imageExtent(swapchainExtent);
            swapchainCreateInfo.imageArrayLayers(1);
            swapchainCreateInfo.imageUsage(VkImageUsageFlags.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT);

            if (!Objects.equals(graphicsQueueFamilyIndex, presentQueueFamilyIndex)) {
                IntBuffer pQueueFamilyIndices = IntBuffer.allocate(localArena, 2);
                pQueueFamilyIndices.write(0, graphicsQueueFamilyIndex);
                pQueueFamilyIndices.write(1, presentQueueFamilyIndex);

                swapchainCreateInfo.imageSharingMode(VkSharingMode.VK_SHARING_MODE_CONCURRENT);
                swapchainCreateInfo.queueFamilyIndexCount(2);
                swapchainCreateInfo.pQueueFamilyIndices(pQueueFamilyIndices);
            }
            else {
                IntBuffer pQueueFamilyIndex = IntBuffer.allocate(localArena);
                pQueueFamilyIndex.write(graphicsQueueFamilyIndex);

                swapchainCreateInfo.imageSharingMode(VkSharingMode.VK_SHARING_MODE_EXCLUSIVE);
                swapchainCreateInfo.queueFamilyIndexCount(1);
                swapchainCreateInfo.pQueueFamilyIndices(pQueueFamilyIndex);
            }

            swapchainCreateInfo.preTransform(pCapabilities.currentTransform());
            swapchainCreateInfo.compositeAlpha(VkCompositeAlphaFlagsKHR.VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR);
            swapchainCreateInfo.presentMode(VkPresentModeKHR.VK_PRESENT_MODE_FIFO_KHR);
            swapchainCreateInfo.clipped(Constants.VK_TRUE);

            var pSwapchain = VkSwapchainKHR.Buffer.allocate(localArena);
            result = deviceCommands.vkCreateSwapchainKHR(device, swapchainCreateInfo, null, pSwapchain);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("创建交换链失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            swapchain = pSwapchain.read();
            var pSwapchainImageCount = IntBuffer.allocate(localArena);
            result = deviceCommands.vkGetSwapchainImagesKHR(device, swapchain, pSwapchainImageCount, null);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("获取交换链图像失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            var swapchainImageCount = pSwapchainImageCount.read();
            var pSwapchainImages = VkImage.Buffer.allocate(localArena, swapchainImageCount);
            result = deviceCommands.vkGetSwapchainImagesKHR(device, swapchain, pSwapchainImageCount, pSwapchainImages);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("获取交换链图像失败，Vulkan 错误码: " + VkResult.explain(result));
            }

            swapchainImages = pSwapchainImages.readAll();

            var pSwapchainImageViews = VkImageView.Buffer.allocate(localArena, swapchainImageCount);
            for (int i = 0; i < swapchainImageCount; i++) {
                var imageViewCreateInfo = VkImageViewCreateInfo.allocate(localArena);
                imageViewCreateInfo.image(swapchainImages[i]);
                imageViewCreateInfo.viewType(VkImageViewType.VK_IMAGE_VIEW_TYPE_2D);
                imageViewCreateInfo.format(swapchainImageFormat);
                var subresourceRange = imageViewCreateInfo.subresourceRange();
                subresourceRange.aspectMask(VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT);
                subresourceRange.baseMipLevel(0);
                subresourceRange.levelCount(1);
                subresourceRange.baseArrayLayer(0);
                subresourceRange.layerCount(1);

                result = deviceCommands.vkCreateImageView(device, imageViewCreateInfo, null, pSwapchainImageViews.offset(i));
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("创建交换链图像视图失败，Vulkan 错误码: " + VkResult.explain(result));
                }
            }
            swapchainImageViews = pSwapchainImageViews.readAll();
        }
    }

    private void destroySwapchain() {
        deviceCommands.vkDestroySwapchainKHR(device, swapchain, null);
        for (var imageView : swapchainImageViews) {
            deviceCommands.vkDestroyImageView(device, imageView, null);
        }
    }

    private void initCommands() {
        frameData = new FrameData[FRAME_OVERLAP];
        try (Arena localArena = Arena.ofConfined()) {
            var commandPoolCreateInfo = VkCommandPoolCreateInfo.allocate(localArena);
            commandPoolCreateInfo.queueFamilyIndex(graphicsQueueFamilyIndex);
            commandPoolCreateInfo.flags(VkCommandPoolCreateFlags.VK_COMMAND_POOL_CREATE_RESET_COMMAND_BUFFER_BIT);

            var pCommandPool = VkCommandPool.Buffer.allocate(localArena);
            var pCommandBuffer = VkCommandBuffer.Buffer.allocate(localArena);
            var commandBufferAllocateInfo = VkCommandBufferAllocateInfo.allocate(localArena);
            commandBufferAllocateInfo.level(VkCommandBufferLevel.VK_COMMAND_BUFFER_LEVEL_PRIMARY);
            commandBufferAllocateInfo.commandBufferCount(1);

            var semaphoreCreateInfo = VkSemaphoreCreateInfo.allocate(localArena);
            var fenceCreateInfo = VkFenceCreateInfo.allocate(localArena);
            fenceCreateInfo.flags(VkFenceCreateFlags.VK_FENCE_CREATE_SIGNALED_BIT);

            var pSemaphore = VkSemaphore.Buffer.allocate(localArena);
            var pFence = VkFence.Buffer.allocate(localArena);
            for (int i = 0; i < FRAME_OVERLAP; i++) {
                var result = deviceCommands.vkCreateCommandPool(device, commandPoolCreateInfo, null, pCommandPool);
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("创建命令池失败，Vulkan 错误码: " + VkResult.explain(result));
                }

                var commandPool = pCommandPool.read();

                commandBufferAllocateInfo.commandPool(commandPool);
                result = deviceCommands.vkAllocateCommandBuffers(device, commandBufferAllocateInfo, pCommandBuffer);
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("分配命令缓冲区失败，Vulkan 错误码: " + VkResult.explain(result));
                }
                var commandBuffer= pCommandBuffer.read();

                result = deviceCommands.vkCreateSemaphore(device, semaphoreCreateInfo, null, pSemaphore);
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("创建信号量失败，Vulkan 错误码: " + VkResult.explain(result));
                }
                var swapchainSemaphore = pSemaphore.read();

                result = deviceCommands.vkCreateSemaphore(device, semaphoreCreateInfo, null, pSemaphore);
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("创建信号量失败，Vulkan 错误码: " + VkResult.explain(result));
                }
                var renderSemaphore = pSemaphore.read();

                result = deviceCommands.vkCreateFence(device, fenceCreateInfo, null, pFence);
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("创建围栏失败，Vulkan 错误码: " + VkResult.explain(result));
                }
                var renderFence = pFence.read();

                frameData[i] = new FrameData(commandPool, commandBuffer, swapchainSemaphore, renderSemaphore, renderFence);
            }
        }
    }

    private void windowIconifyCallback(@pointer(comment = "GLFWwindow*") MemorySegment ignoredWindow, int iconified) {
        pauseRendering = iconified == LibGLFW.GLFW_TRUE;
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

    private final Arena engineArena = Arena.ofShared();
    private final LibGLFW libGLFW;
    private final StaticCommands staticCommands;
    private final EntryCommands entryCommands;

    private int frameNumber = 0;
    private boolean pauseRendering = false;
    private VkExtent2D windowExtent = VkExtent2D.allocate(engineArena);

    private VkInstance instance;
    private InstanceCommands instanceCommands;
    private VkDebugUtilsMessengerEXT debugMessenger;
    private VkPhysicalDevice physicalDevice;
    private Integer graphicsQueueFamilyIndex;
    private Integer presentQueueFamilyIndex;
    private @pointer(comment = "GLFWwindow*") MemorySegment glfwWindow;
    private VkSurfaceKHR surface;
    private VkDevice device;
    private DeviceCommands deviceCommands;
    private VkQueue graphicsQueue;
    private VkSwapchainKHR swapchain;
    private @enumtype(VkFormat.class) int swapchainImageFormat;
    private @enumtype(VkColorSpaceKHR.class) int swapchainColorSpace;
    private VkExtent2D swapchainExtent = VkExtent2D.allocate(engineArena);
    private VkImage[] swapchainImages;
    private VkImageView[] swapchainImageViews;

    private record FrameData(
            VkCommandPool commandPool,
            VkCommandBuffer mainCommandBuffer,
            VkSemaphore swapchainSemaphore,
            VkSemaphore renderSemaphore,
            VkFence renderFence
    ) {}
    private FrameData[] frameData;

    private static final int FRAME_OVERLAP = 2;
}
