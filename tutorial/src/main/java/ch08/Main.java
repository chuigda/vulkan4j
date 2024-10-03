package ch08;

import tech.icey.glfw.GLFWConstants;
import tech.icey.glfw.handle.GLFWwindow;
import tech.icey.glfw.GLFW;
import tech.icey.glfw.GLFWLoader;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.Constants;
import tech.icey.vk4j.Version;
import tech.icey.vk4j.VulkanLoader;
import tech.icey.vk4j.bitmask.*;
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
import java.util.Objects;

class Application {
    public void run() {
        initWindow();
        initVulkan();
        mainLoop();
        cleanup();
    }

    private void initWindow() {
        GLFWLoader.loadGLFWLibrary();
        glfw = GLFWLoader.loadGLFW();
        if (glfw.glfwInit() != GLFWConstants.GLFW_TRUE) {
            throw new RuntimeException("Failed to initialize GLFW");
        }

        if (glfw.glfwVulkanSupported() != GLFWConstants.GLFW_TRUE) {
            throw new RuntimeException("Vulkan is not supported");
        }

        glfw.glfwWindowHint(GLFWConstants.GLFW_CLIENT_API, GLFWConstants.GLFW_NO_API);
        glfw.glfwWindowHint(GLFWConstants.GLFW_RESIZABLE, GLFWConstants.GLFW_FALSE);
        window = glfw.glfwCreateWindow(WIDTH, HEIGHT, WINDOW_TITLE, null, null);
    }

    private void initVulkan() {
        VulkanLoader.loadVulkanLibrary();
        staticCommands = VulkanLoader.loadStaticCommands();
        entryCommands = VulkanLoader.loadEntryCommands();

        createInstance();
        setupDebugMessenger();
        createSurface();
        pickPhysicalDevice();
        createLogicalDevice();
        createSwapchain();
        createImageViews();
        createGraphicsPipeline();
    }

    private void mainLoop() {
        while (glfw.glfwWindowShouldClose(window) == GLFWConstants.GLFW_FALSE) {
            glfw.glfwPollEvents();
        }
    }

    private void cleanup() {
        for (var imageView : swapChainImageViews) {
            deviceCommands.vkDestroyImageView(device, imageView, null);
        }
        deviceCommands.vkDestroySwapchainKHR(device, swapChain, null);
        deviceCommands.vkDestroyDevice(device, null);
        if (ENABLE_VALIDATION_LAYERS) {
            instanceCommands.vkDestroyDebugUtilsMessengerEXT(instance, debugMessenger, null);
        }
        instanceCommands.vkDestroySurfaceKHR(instance, surface, null);
        instanceCommands.vkDestroyInstance(instance, null);
        glfw.glfwDestroyWindow(window);
        glfw.glfwTerminate();
    }

    private void createInstance() {
        if (ENABLE_VALIDATION_LAYERS && !checkValidationLayerSupport()) {
            throw new RuntimeException("Validation layers requested, but not available!");
        }

        try (var arena = Arena.ofConfined()) {
            var appInfo = VkApplicationInfo.allocate(arena);
            appInfo.pApplicationName(ByteBuffer.allocateString(arena, "Zdravstvuyte, Vulkan!"));
            appInfo.applicationVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            appInfo.pEngineName(ByteBuffer.allocateString(arena, "Soloviev D-30"));
            appInfo.engineVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            appInfo.apiVersion(Version.VK_API_VERSION_1_0);

            var instanceCreateInfo = VkInstanceCreateInfo.allocate(arena);
            instanceCreateInfo.pApplicationInfo(appInfo);

            var extensions = getRequiredExtensions(arena);
            instanceCreateInfo.enabledExtensionCount((int) extensions.size());
            instanceCreateInfo.ppEnabledExtensionNames(extensions);

            if (ENABLE_VALIDATION_LAYERS) {
                instanceCreateInfo.enabledLayerCount(1);
                PointerBuffer ppEnabledLayerNames = PointerBuffer.allocate(arena);
                ppEnabledLayerNames.write(ByteBuffer.allocateString(arena, VALIDATION_LAYER_NAME));
                instanceCreateInfo.ppEnabledLayerNames(ppEnabledLayerNames);

                var debugCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
                populateDebugMessengerCreateInfo(debugCreateInfo);
                instanceCreateInfo.pNext(debugCreateInfo);
            }

            var pInstance = VkInstance.Buffer.allocate(arena);
            var result = entryCommands.vkCreateInstance(instanceCreateInfo, null, pInstance);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to create instance, vulkan error code: " + VkResult.explain(result));
            }
            instance = pInstance.read();
            instanceCommands = VulkanLoader.loadInstanceCommands(instance, staticCommands);
        }
    }

    private void setupDebugMessenger() {
        if (!ENABLE_VALIDATION_LAYERS) {
            return;
        }

        try (var arena = Arena.ofConfined()) {
            var debugUtilsMessengerCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
            populateDebugMessengerCreateInfo(debugUtilsMessengerCreateInfo);

            var pDebugMessenger = VkDebugUtilsMessengerEXT.Buffer.allocate(arena);
            var result = instanceCommands.vkCreateDebugUtilsMessengerEXT(
                    instance,
                    debugUtilsMessengerCreateInfo,
                    null,
                    pDebugMessenger
            );
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to set up debug messenger, vulkan error code: " + VkResult.explain(result));
            }
            debugMessenger = pDebugMessenger.read();
        }
    }

    private void createSurface() {
        try (var arena = Arena.ofConfined()) {
            var pSurface = VkSurfaceKHR.Buffer.allocate(arena);
            var result = glfw.glfwCreateWindowSurface(instance, window, null, pSurface);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to create window surface, vulkan error code: " + VkResult.explain(result));
            }
            surface = pSurface.read();
        }
    }

    private void pickPhysicalDevice() {
        try (var arena = Arena.ofConfined()) {
            var pDeviceCount = IntBuffer.allocate(arena);
            var result = instanceCommands.vkEnumeratePhysicalDevices(instance, pDeviceCount, null);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to enumerate physical devices, vulkan error code: " + VkResult.explain(result));
            }

            var deviceCount = pDeviceCount.read();
            if (deviceCount == 0) {
                throw new RuntimeException("Failed to find GPUs with Vulkan support");
            }

            var pDevices = VkPhysicalDevice.Buffer.allocate(arena, deviceCount);
            result = instanceCommands.vkEnumeratePhysicalDevices(instance, pDeviceCount, pDevices);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to enumerate physical devices, vulkan error code: " + VkResult.explain(result));
            }
            var devices = pDevices.readAll();

            for (var device : devices) {
                if (isDeviceSuitable(device)) {
                    physicalDevice = device;
                    break;
                }
            }

            if (physicalDevice == null) {
                throw new RuntimeException("Failed to find a suitable GPU");
            }
        }
    }

    private void createLogicalDevice() {
        var indices = findQueueFamilies(physicalDevice);
        assert indices != null;

        try (var arena = Arena.ofConfined()) {
            var deviceFeatures = VkPhysicalDeviceFeatures.allocate(arena);

            var deviceCreateInfo = VkDeviceCreateInfo.allocate(arena);
            var pQueuePriorities = FloatBuffer.allocate(arena);
            pQueuePriorities.write(1.0f);
            if (indices.graphicsFamily == indices.presentFamily) {
                var queueCreateInfo = VkDeviceQueueCreateInfo.allocate(arena);
                queueCreateInfo.queueCount(1);
                queueCreateInfo.queueFamilyIndex(indices.graphicsFamily());
                queueCreateInfo.pQueuePriorities(pQueuePriorities);
                deviceCreateInfo.queueCreateInfoCount(1);
                deviceCreateInfo.pQueueCreateInfos(queueCreateInfo);
            }
            else {
                var queueCreateInfos = VkDeviceQueueCreateInfo.allocate(arena, 2);
                queueCreateInfos[0].queueCount(1);
                queueCreateInfos[0].queueFamilyIndex(indices.graphicsFamily());
                queueCreateInfos[0].pQueuePriorities(pQueuePriorities);
                queueCreateInfos[1].queueCount(1);
                queueCreateInfos[1].queueFamilyIndex(indices.presentFamily());
                queueCreateInfos[1].pQueuePriorities(pQueuePriorities);
                deviceCreateInfo.queueCreateInfoCount(2);
                deviceCreateInfo.pQueueCreateInfos(queueCreateInfos[0]);
            }
            deviceCreateInfo.pEnabledFeatures(deviceFeatures);
            deviceCreateInfo.enabledExtensionCount(1);
            var ppDeviceExtensions = PointerBuffer.allocate(arena);
            ppDeviceExtensions.write(ByteBuffer.allocateString(arena, Constants.VK_KHR_SWAPCHAIN_EXTENSION_NAME));
            deviceCreateInfo.ppEnabledExtensionNames(ppDeviceExtensions);

            if (ENABLE_VALIDATION_LAYERS) {
                deviceCreateInfo.enabledLayerCount(1);
                PointerBuffer ppEnabledLayerNames = PointerBuffer.allocate(arena);
                ppEnabledLayerNames.write(ByteBuffer.allocateString(arena, VALIDATION_LAYER_NAME));
                deviceCreateInfo.ppEnabledLayerNames(ppEnabledLayerNames);
            }

            var pDevice = VkDevice.Buffer.allocate(arena);
            var result = instanceCommands.vkCreateDevice(physicalDevice, deviceCreateInfo, null, pDevice);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to create logical device, vulkan error code: " + VkResult.explain(result));
            }
            device = pDevice.read();
            deviceCommands = VulkanLoader.loadDeviceCommands(instance, device, staticCommands);

            var pQueue = VkQueue.Buffer.allocate(arena);
            deviceCommands.vkGetDeviceQueue(device, indices.graphicsFamily(), 0, pQueue);
            graphicsQueue = pQueue.read();

            deviceCommands.vkGetDeviceQueue(device, indices.presentFamily(), 0, pQueue);
            presentQueue = pQueue.read();
        }
    }

    private void createSwapchain() {
        try (var arena = Arena.ofConfined()) {
            var swapChainSupport = querySwapChainSupport(physicalDevice, arena);

            var surfaceFormat = chooseSwapSurfaceFormat(swapChainSupport.formats());
            var presentMode = chooseSwapPresentMode(swapChainSupport.presentModes());
            var extent = chooseSwapExtent(swapChainSupport.capabilities(), arena);

            var imageCount = swapChainSupport.capabilities.minImageCount() + 1;
            if (swapChainSupport.capabilities.maxImageCount() > 0
                    && imageCount > swapChainSupport.capabilities.maxImageCount()) {
                imageCount = swapChainSupport.capabilities.maxImageCount();
            }

            var createInfo = VkSwapchainCreateInfoKHR.allocate(arena);
            createInfo.surface(surface);
            createInfo.minImageCount(imageCount);
            createInfo.imageFormat(surfaceFormat.format());
            createInfo.imageColorSpace(surfaceFormat.colorSpace());
            createInfo.imageExtent(extent);
            createInfo.imageArrayLayers(1);
            createInfo.imageUsage(VkImageUsageFlags.VK_IMAGE_USAGE_COLOR_ATTACHMENT_BIT);

            var indices = findQueueFamilies(physicalDevice);
            assert indices != null;
            if (indices.graphicsFamily != indices.presentFamily) {
                createInfo.imageSharingMode(VkSharingMode.VK_SHARING_MODE_CONCURRENT);
                createInfo.queueFamilyIndexCount(2);
                var pQueueFamilyIndices = IntBuffer.allocate(arena);
                pQueueFamilyIndices.write(indices.graphicsFamily(), indices.presentFamily());
                createInfo.pQueueFamilyIndices(pQueueFamilyIndices);
            }
            else {
                createInfo.imageSharingMode(VkSharingMode.VK_SHARING_MODE_EXCLUSIVE);
            }

            createInfo.preTransform(swapChainSupport.capabilities.currentTransform());
            createInfo.compositeAlpha(VkCompositeAlphaFlagsKHR.VK_COMPOSITE_ALPHA_OPAQUE_BIT_KHR);
            createInfo.presentMode(presentMode);
            createInfo.clipped(Constants.VK_TRUE);
            createInfo.oldSwapchain(null);

            var pSwapChain = VkSwapchainKHR.Buffer.allocate(arena);
            var result = deviceCommands.vkCreateSwapchainKHR(device, createInfo, null, pSwapChain);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to create swap chain, vulkan error code: " + VkResult.explain(result));
            }
            swapChain = pSwapChain.read();

            var pImageCount = IntBuffer.allocate(arena);
            result = deviceCommands.vkGetSwapchainImagesKHR(device, swapChain, pImageCount, null);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to get swap chain images, vulkan error code: " + VkResult.explain(result));
            }

            imageCount = pImageCount.read();
            var pSwapChainImages = VkImage.Buffer.allocate(arena, imageCount);
            result = deviceCommands.vkGetSwapchainImagesKHR(device, swapChain, pImageCount, pSwapChainImages);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to get swap chain images, vulkan error code: " + VkResult.explain(result));
            }

            swapChainImages = pSwapChainImages.readAll();

            swapChainImageFormat = surfaceFormat.format();
            swapChainExtent = VkExtent2D.clone(applicationArena, extent);
        }
    }

    private void createImageViews() {
        swapChainImageViews = new VkImageView[swapChainImages.length];

        try (var arena = Arena.ofConfined()) {
            var createInfo = VkImageViewCreateInfo.allocate(arena);
            var pImageView = VkImageView.Buffer.allocate(arena);

            for (int i = 0; i < swapChainImages.length; i++) {
                createInfo.image(swapChainImages[i]);
                createInfo.viewType(VkImageViewType.VK_IMAGE_VIEW_TYPE_2D);
                createInfo.format(swapChainImageFormat);

                var components = createInfo.components();
                components.r(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
                components.g(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
                components.b(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);
                components.a(VkComponentSwizzle.VK_COMPONENT_SWIZZLE_IDENTITY);

                var subresourceRange = createInfo.subresourceRange();
                subresourceRange.aspectMask(VkImageAspectFlags.VK_IMAGE_ASPECT_COLOR_BIT);
                subresourceRange.baseMipLevel(0);
                subresourceRange.levelCount(1);
                subresourceRange.baseArrayLayer(0);
                subresourceRange.layerCount(1);

                var result = deviceCommands.vkCreateImageView(device, createInfo, null, pImageView);
                if (result != VkResult.VK_SUCCESS) {
                    throw new RuntimeException("Failed to create image views, vulkan error code: " + VkResult.explain(result));
                }
                swapChainImageViews[i] = pImageView.read();
            }
        }
    }

    private void createGraphicsPipeline() {
    }

    private boolean checkValidationLayerSupport() {
        try (var arena = Arena.ofConfined()) {
            var pLayerCount = IntBuffer.allocate(arena);
            var result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, null);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to enumerate instance layer properties, vulkan error code: " + VkResult.explain(result));
            }

            var layerCount = pLayerCount.read();
            var availableLayers = VkLayerProperties.allocate(arena, layerCount);
            result = entryCommands.vkEnumerateInstanceLayerProperties(pLayerCount, availableLayers[0]);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to enumerate instance layer properties, vulkan error code: " + VkResult.explain(result));
            }

            for (var layer : availableLayers) {
                if (VALIDATION_LAYER_NAME.equals(layer.layerName().readString())) {
                    return true;
                }
            }

            return false;
        }
    }

    private PointerBuffer getRequiredExtensions(Arena arena) {
        try (var localArena = Arena.ofConfined()) {
            var pGLFWExtensionCount = IntBuffer.allocate(localArena);
            var glfwExtensions = glfw.glfwGetRequiredInstanceExtensions(pGLFWExtensionCount);
            if (glfwExtensions == null) {
                throw new RuntimeException("Failed to get GLFW required instance extensions");
            }

            var glfwExtensionCount = pGLFWExtensionCount.read();
            glfwExtensions = glfwExtensions.reinterpret(glfwExtensionCount);
            if (!ENABLE_VALIDATION_LAYERS) {
                return glfwExtensions;
            }
            else {
                var extensions = PointerBuffer.allocate(arena, glfwExtensionCount + 1);
                for (int i = 0; i < glfwExtensionCount; i++) {
                    extensions.write(i, glfwExtensions.read(i));
                }

                extensions.write(glfwExtensionCount, ByteBuffer.allocateString(arena, Constants.VK_EXT_DEBUG_UTILS_EXTENSION_NAME));
                return extensions;
            }
        }
    }

    private void populateDebugMessengerCreateInfo(VkDebugUtilsMessengerCreateInfoEXT debugUtilsMessengerCreateInfo) {
        debugUtilsMessengerCreateInfo.messageSeverity(
                VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_VERBOSE_BIT_EXT |
                        VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_WARNING_BIT_EXT |
                        VkDebugUtilsMessageSeverityFlagsEXT.VK_DEBUG_UTILS_MESSAGE_SEVERITY_ERROR_BIT_EXT
        );
        debugUtilsMessengerCreateInfo.messageType(
                VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_GENERAL_BIT_EXT |
                        VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_VALIDATION_BIT_EXT |
                        VkDebugUtilsMessageTypeFlagsEXT.VK_DEBUG_UTILS_MESSAGE_TYPE_PERFORMANCE_BIT_EXT
        );
        debugUtilsMessengerCreateInfo.pfnUserCallback(UPCALL_debugCallback);
    }

    private boolean isDeviceSuitable(VkPhysicalDevice device) {
        var indices = findQueueFamilies(device);
        var extensionsSupported = checkDeviceExtensionSupport(device);
        if ((indices == null) || !extensionsSupported) {
            return false;
        }

        try (var arena = Arena.ofConfined()) {
            var swapChainSupport = querySwapChainSupport(device, arena);
            return swapChainSupport.formats().length != 0 && swapChainSupport.presentModes().size() != 0;
        }
    }

    private record QueueFamilyIndices(int graphicsFamily, int presentFamily) {}

    private QueueFamilyIndices findQueueFamilies(VkPhysicalDevice device) {
        try (var arena = Arena.ofConfined()) {
            var pQueueFamilyCount = IntBuffer.allocate(arena);
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(device, pQueueFamilyCount, null);

            var queueFamilyCount = pQueueFamilyCount.read();
            var queueFamilies = VkQueueFamilyProperties.allocate(arena, queueFamilyCount);
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(device, pQueueFamilyCount, queueFamilies[0]);

            Integer graphicsFamily = null;
            Integer presentFamily = null;
            var pSurfaceSupport = IntBuffer.allocate(arena);
            for (int i = 0; i < queueFamilyCount; i++) {
                if (queueFamilies[i].queueCount() > 0 && (queueFamilies[i].queueFlags() & VkQueueFlags.VK_QUEUE_GRAPHICS_BIT) != 0) {
                    graphicsFamily = i;
                }

                instanceCommands.vkGetPhysicalDeviceSurfaceSupportKHR(device, i, surface, pSurfaceSupport);
                if (pSurfaceSupport.read() == Constants.VK_TRUE) {
                    presentFamily = i;
                }

                if (graphicsFamily != null && presentFamily != null) {
                    break;
                }
            }

            if (graphicsFamily != null && presentFamily != null) {
                return new QueueFamilyIndices(graphicsFamily, presentFamily);
            }
            else {
                return null;
            }
        }
    }

    private boolean checkDeviceExtensionSupport(VkPhysicalDevice device) {
        try (var arena = Arena.ofConfined()) {
            var pExtensionCount = IntBuffer.allocate(arena);
            var result = instanceCommands.vkEnumerateDeviceExtensionProperties(device, null, pExtensionCount, null);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to enumerate device extension properties, vulkan error code: " + VkResult.explain(result));
            }

            var extensionCount = pExtensionCount.read();
            var availableExtensions = VkExtensionProperties.allocate(arena, extensionCount);
            result = instanceCommands.vkEnumerateDeviceExtensionProperties(device, null, pExtensionCount, availableExtensions[0]);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to enumerate device extension properties, vulkan error code: " + VkResult.explain(result));
            }

            for (var extension : availableExtensions) {
                if (Constants.VK_KHR_SWAPCHAIN_EXTENSION_NAME.equals(extension.extensionName().readString())) {
                    return true;
                }
            }

            return false;
        }
    }

    private record SwapchainSupportDetails(
            VkSurfaceCapabilitiesKHR capabilities,
            VkSurfaceFormatKHR[] formats,
            @enumtype(VkPresentModeKHR.class) IntBuffer presentModes
    ) {}

    private SwapchainSupportDetails querySwapChainSupport(VkPhysicalDevice device, Arena arena) {
        var surfaceCapabilities = VkSurfaceCapabilitiesKHR.allocate(arena);
        var result = instanceCommands.vkGetPhysicalDeviceSurfaceCapabilitiesKHR(device, surface, surfaceCapabilities);
        if (result != VkResult.VK_SUCCESS) {
            throw new RuntimeException("Failed to get physical device surface capabilities, vulkan error code: " + VkResult.explain(result));
        }

        try (var localArena = Arena.ofConfined()) {
            var pFormatCount = IntBuffer.allocate(localArena);
            result = instanceCommands.vkGetPhysicalDeviceSurfaceFormatsKHR(device, surface, pFormatCount, null);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to get physical device surface formats, vulkan error code: " + VkResult.explain(result));
            }

            var formatCount = pFormatCount.read();
            var formats = VkSurfaceFormatKHR.allocate(arena, formatCount);
            result = instanceCommands.vkGetPhysicalDeviceSurfaceFormatsKHR(device, surface, pFormatCount, formats[0]);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to get physical device surface formats, vulkan error code: " + VkResult.explain(result));
            }

            var pPresentModeCount = IntBuffer.allocate(localArena);
            result = instanceCommands.vkGetPhysicalDeviceSurfacePresentModesKHR(device, surface, pPresentModeCount, null);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to get physical device surface present modes, vulkan error code: " + VkResult.explain(result));
            }

            var presentModeCount = pPresentModeCount.read();
            var presentModes = IntBuffer.allocate(arena, presentModeCount);
            result = instanceCommands.vkGetPhysicalDeviceSurfacePresentModesKHR(device, surface, pPresentModeCount, presentModes);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to get physical device surface present modes, vulkan error code: " + VkResult.explain(result));
            }

            return new SwapchainSupportDetails(surfaceCapabilities, formats, presentModes);
        }
    }

    private VkSurfaceFormatKHR chooseSwapSurfaceFormat(VkSurfaceFormatKHR[] formats) {
        for (var format : formats) {
            if (format.format() == VkFormat.VK_FORMAT_B8G8R8A8_SRGB &&
                    format.colorSpace() == VkColorSpaceKHR.VK_COLOR_SPACE_SRGB_NONLINEAR_KHR) {
                return format;
            }
        }

        return formats[0];
    }

    private @enumtype(VkPresentModeKHR.class) int chooseSwapPresentMode(
            @enumtype(VkPresentModeKHR.class) IntBuffer presentModes
    ) {
        for (int i = 0; i < presentModes.size(); i++) {
            if (presentModes.read(i) == VkPresentModeKHR.VK_PRESENT_MODE_MAILBOX_KHR) {
                return VkPresentModeKHR.VK_PRESENT_MODE_MAILBOX_KHR;
            }
        }

        return VkPresentModeKHR.VK_PRESENT_MODE_FIFO_KHR;
    }

    private VkExtent2D chooseSwapExtent(VkSurfaceCapabilitiesKHR capabilities, Arena arena) {
        if (capabilities.currentExtent().width() != NativeLayout.UINT32_MAX) {
            return capabilities.currentExtent();
        }
        else {
            try (var localArena = Arena.ofConfined()) {
                var pWidth = IntBuffer.allocate(localArena);
                var pHeight = IntBuffer.allocate(localArena);
                glfw.glfwGetFramebufferSize(window, pWidth, pHeight);
                var width = pWidth.read();
                var height = pHeight.read();

                var actualExtent = VkExtent2D.allocate(arena);
                actualExtent.width(Math.clamp(width, capabilities.minImageExtent().width(), capabilities.maxImageExtent().width()));
                actualExtent.height(Math.clamp(height, capabilities.minImageExtent().height(), capabilities.maxImageExtent().height()));
                return actualExtent;
            }
        }
    }

    private Arena applicationArena = Arena.ofShared();

    private GLFW glfw;
    private GLFWwindow window;

    private StaticCommands staticCommands;
    private EntryCommands entryCommands;
    private VkInstance instance;
    private InstanceCommands instanceCommands;
    private VkDebugUtilsMessengerEXT debugMessenger;
    private VkSurfaceKHR surface;
    private VkPhysicalDevice physicalDevice;
    private VkDevice device;
    private DeviceCommands deviceCommands;
    private VkQueue graphicsQueue;
    private VkQueue presentQueue;
    private VkSwapchainKHR swapChain;
    private VkImage[] swapChainImages;
    private @enumtype(VkFormat.class) int swapChainImageFormat;
    private VkExtent2D swapChainExtent;
    private VkImageView[] swapChainImageViews;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final ByteBuffer WINDOW_TITLE = ByteBuffer.allocateString(Arena.global(), "Vulkan");
    private static final boolean ENABLE_VALIDATION_LAYERS = System.getProperty("validation") != null;
    private static String VALIDATION_LAYER_NAME = "VK_LAYER_KHRONOS_validation";

    private static /* VkBool32 */ int debugCallback(
            @enumtype(VkDebugUtilsMessageSeverityFlagsEXT.class) int messageSeverity,
            @enumtype(VkDebugUtilsMessageTypeFlagsEXT.class) int messageType,
            @pointer(comment="const VkDebugUtilsMessengerCallbackDataEXT*") MemorySegment pCallbackData,
            @pointer(comment="void*") MemorySegment pUserData
    ) {
        var callbackData = new VkDebugUtilsMessengerCallbackDataEXT(pCallbackData.reinterpret(VkDebugUtilsMessengerCallbackDataEXT.SIZE));
        System.err.println("Validation layer: " + Objects.requireNonNull(callbackData.pMessage()).readString());
        return Constants.VK_FALSE;
    }
    private static final FunctionDescriptor DESCRIPTOR_debugCallback = FunctionDescriptor.of(
            ValueLayout.JAVA_INT, // return value VkBool32
            ValueLayout.JAVA_INT, // int messageSeverity
            ValueLayout.JAVA_INT, // int messageType
            ValueLayout.ADDRESS, // const VkDebugUtilsMessengerCallbackDataEXT* pCallbackData
            ValueLayout.ADDRESS  // void* pUserData
    );

    private static final MethodHandle HANDLE_debugCallback;
    static {
        try {
            HANDLE_debugCallback = MethodHandles
                    .lookup()
                    .findStatic(Application.class, "debugCallback", DESCRIPTOR_debugCallback.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static final MemorySegment UPCALL_debugCallback = Linker
            .nativeLinker()
            .upcallStub(HANDLE_debugCallback, DESCRIPTOR_debugCallback, Arena.global());
}

public class Main {
    public static void main(String[] args) {
        try {
            var app = new Application();
            app.run();
        }
        catch (Throwable e) {
            e.printStackTrace(System.err);
        }
    }
}
