package ch04;

import tech.icey.glfw.GLFWConstants;
import tech.icey.glfw.handle.GLFWwindow;
import tech.icey.glfw.GLFW;
import tech.icey.glfw.GLFWLoader;
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
        pickPhysicalDevice();
        createLogicalDevice();
    }

    private void mainLoop() {
        while (glfw.glfwWindowShouldClose(window) == GLFWConstants.GLFW_FALSE) {
            glfw.glfwPollEvents();
        }
    }

    private void cleanup() {
        deviceCommands.vkDestroyDevice(device, null);
        if (ENABLE_VALIDATION_LAYERS) {
            instanceCommands.vkDestroyDebugUtilsMessengerEXT(instance, debugMessenger, null);
        }
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
            var queueCreateInfo = VkDeviceQueueCreateInfo.allocate(arena);
            queueCreateInfo.queueCount(1);
            queueCreateInfo.queueFamilyIndex(indices.graphicsFamily());

            var pQueuePriorities = FloatBuffer.allocate(arena);
            pQueuePriorities.write(1.0f);
            queueCreateInfo.pQueuePriorities(pQueuePriorities);

            var deviceFeatures = VkPhysicalDeviceFeatures.allocate(arena);

            var deviceCreateInfo = VkDeviceCreateInfo.allocate(arena);
            deviceCreateInfo.queueCreateInfoCount(1);
            deviceCreateInfo.pQueueCreateInfos(queueCreateInfo);
            deviceCreateInfo.pEnabledFeatures(deviceFeatures);

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
        }
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
        return findQueueFamilies(device) != null;
    }

    private record QueueFamilyIndices(int graphicsFamily) {}

    private QueueFamilyIndices findQueueFamilies(VkPhysicalDevice device) {
        try (var arena = Arena.ofConfined()) {
            var pQueueFamilyCount = IntBuffer.allocate(arena);
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(device, pQueueFamilyCount, null);

            var queueFamilyCount = pQueueFamilyCount.read();
            var queueFamilies = VkQueueFamilyProperties.allocate(arena, queueFamilyCount);
            instanceCommands.vkGetPhysicalDeviceQueueFamilyProperties(device, pQueueFamilyCount, queueFamilies[0]);

            Integer graphicsFamily = null;
            for (int i = 0; i < queueFamilyCount; i++) {
                if (queueFamilies[i].queueCount() > 0 && (queueFamilies[i].queueFlags() & VkQueueFlags.VK_QUEUE_GRAPHICS_BIT) != 0) {
                    graphicsFamily = i;
                    break;
                }
            }

            if (graphicsFamily != null) {
                return new QueueFamilyIndices(graphicsFamily);
            }
            else {
                return null;
            }
        }
    }

    private GLFW glfw;
    private GLFWwindow window;

    private StaticCommands staticCommands;
    private EntryCommands entryCommands;
    private VkInstance instance;
    private InstanceCommands instanceCommands;
    private VkDebugUtilsMessengerEXT debugMessenger;
    private VkPhysicalDevice physicalDevice;
    private VkDevice device;
    private DeviceCommands deviceCommands;
    private VkQueue graphicsQueue;

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
