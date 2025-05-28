package tutorial.vulkan.part01.ch02;

import club.doki7.ffm.annotation.EnumType;
import club.doki7.ffm.annotation.NativeType;
import club.doki7.ffm.annotation.Pointer;
import club.doki7.ffm.annotation.Unsigned;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.IntPtr;
import club.doki7.ffm.ptr.PointerPtr;
import club.doki7.glfw.GLFW;
import club.doki7.glfw.GLFWConstants;
import club.doki7.glfw.GLFWLoader;
import club.doki7.glfw.handle.GLFWwindow;
import club.doki7.vulkan.Version;
import club.doki7.vulkan.VkConstants;
import club.doki7.vulkan.VkFunctionTypes;
import club.doki7.vulkan.bitmask.VkDebugUtilsMessageSeverityFlagsEXT;
import club.doki7.vulkan.bitmask.VkDebugUtilsMessageTypeFlagsEXT;
import club.doki7.vulkan.command.VkEntryCommands;
import club.doki7.vulkan.command.VkInstanceCommands;
import club.doki7.vulkan.command.VkStaticCommands;
import club.doki7.vulkan.command.VulkanLoader;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.VkResult;
import club.doki7.vulkan.handle.VkDebugUtilsMessengerEXT;
import club.doki7.vulkan.handle.VkInstance;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
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
        glfw.initHint(GLFWConstants.PLATFORM, GLFWConstants.PLATFORM_X11);
        if (glfw.init() != GLFWConstants.TRUE) {
            throw new RuntimeException("Failed to initialize GLFW");
        }

        if (glfw.vulkanSupported() != GLFWConstants.TRUE) {
            throw new RuntimeException("Vulkan is not supported");
        }

        glfw.windowHint(GLFWConstants.CLIENT_API, GLFWConstants.NO_API);
        glfw.windowHint(GLFWConstants.RESIZABLE, GLFWConstants.FALSE);
        window = glfw.createWindow(WIDTH, HEIGHT, WINDOW_TITLE, null, null);
    }

    private void initVulkan() {
        VulkanLoader.loadVulkanLibrary();
        staticCommands = VulkanLoader.loadStaticCommands();
        entryCommands = VulkanLoader.loadEntryCommands(staticCommands);

        createInstance();
        setupDebugMessenger();
    }

    private void mainLoop() {
        while (glfw.windowShouldClose(window) == GLFWConstants.FALSE) {
            glfw.pollEvents();
        }
    }

    private void cleanup() {
        if (ENABLE_VALIDATION_LAYERS) {
            instanceCommands.destroyDebugUtilsMessengerEXT(instance, debugMessenger, null);
        }
        instanceCommands.destroyInstance(instance, null);
        glfw.destroyWindow(window);
        glfw.terminate();
    }

    private void createInstance() {
        try (var arena = Arena.ofConfined()) {
            if (ENABLE_VALIDATION_LAYERS && !checkValidationLayerSupport()) {
                throw new RuntimeException("Validation layers requested, but not available");
            }

            var appInfo = VkApplicationInfo.allocate(arena);
            appInfo.pApplicationName(BytePtr.allocateString(arena, "Zdravstvuyte, Vulkan!"));
            appInfo.applicationVersion(new Version(0, 1, 0, 0).encode());
            appInfo.pEngineName(BytePtr.allocateString(arena, "Soloviev D-30"));
            appInfo.engineVersion(new Version(0, 1, 0, 0).encode());
            appInfo.apiVersion(Version.VK_API_VERSION_1_0.encode());

            var instanceCreateInfo = VkInstanceCreateInfo.allocate(arena);
            instanceCreateInfo.pApplicationInfo(appInfo);

            if (ENABLE_VALIDATION_LAYERS) {
                instanceCreateInfo.enabledLayerCount(1);
                PointerPtr ppEnabledLayerNames = PointerPtr.allocate(arena);
                ppEnabledLayerNames.write(BytePtr.allocateString(arena, VALIDATION_LAYER_NAME));
                instanceCreateInfo.ppEnabledLayerNames(ppEnabledLayerNames);

                var debugCreateInfo = VkDebugUtilsMessengerCreateInfoEXT.allocate(arena);
                populateDebugMessengerCreateInfo(debugCreateInfo);
                instanceCreateInfo.pNext(debugCreateInfo);
            }

            var extensions = getRequiredExtensions(arena);
            instanceCreateInfo.enabledExtensionCount((int) extensions.size());
            instanceCreateInfo.ppEnabledExtensionNames(extensions);

            var pInstance = VkInstance.Ptr.allocate(arena);
            var result = entryCommands.createInstance(instanceCreateInfo, null, pInstance);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create instance, vulkan error code: " + VkResult.explain(result));
            }
            instance = Objects.requireNonNull(pInstance.read());
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

            var pDebugMessenger = VkDebugUtilsMessengerEXT.Ptr.allocate(arena);
            var result = instanceCommands.createDebugUtilsMessengerEXT(
                    instance,
                    debugUtilsMessengerCreateInfo,
                    null,
                    pDebugMessenger
            );
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to set up debug messenger, vulkan error code: " + VkResult.explain(result));
            }
            debugMessenger = Objects.requireNonNull(pDebugMessenger.read());
        }
    }

    private boolean checkValidationLayerSupport() {
        try (var arena = Arena.ofConfined()) {
            var pLayerCount = IntPtr.allocate(arena);
            var result = entryCommands.enumerateInstanceLayerProperties(pLayerCount, null);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to enumerate instance layer properties, vulkan error code: " + VkResult.explain(result));
            }

            var layerCount = pLayerCount.read();
            var availableLayers = VkLayerProperties.allocate(arena, layerCount);
            result = entryCommands.enumerateInstanceLayerProperties(pLayerCount, availableLayers);
            if (result != VkResult.SUCCESS) {
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

    private PointerPtr getRequiredExtensions(Arena arena) {
        try (var localArena = Arena.ofConfined()) {
            var pGLFWExtensionCount = IntPtr.allocate(localArena);
            var glfwExtensions = glfw.getRequiredInstanceExtensions(pGLFWExtensionCount);
            if (glfwExtensions == null) {
                throw new RuntimeException("Failed to get GLFW required instance extensions");
            }

            var glfwExtensionCount = pGLFWExtensionCount.read();
            glfwExtensions = glfwExtensions.reinterpret(glfwExtensionCount);
            if (!ENABLE_VALIDATION_LAYERS) {
                return glfwExtensions;
            }
            else {
                var extensions = PointerPtr.allocate(arena, glfwExtensionCount + 1);
                for (int i = 0; i < glfwExtensionCount; i++) {
                    extensions.write(i, glfwExtensions.read(i));
                }

                extensions.write(glfwExtensionCount, BytePtr.allocateString(arena, VkConstants.EXT_DEBUG_UTILS_EXTENSION_NAME));
                return extensions;
            }
        }
    }

    private static @NativeType("VkBool32") @Unsigned int debugCallback(
            @EnumType(VkDebugUtilsMessageSeverityFlagsEXT.class) int ignoredMessageSeverity,
            @EnumType(VkDebugUtilsMessageTypeFlagsEXT.class) int ignoredMessageType,
            @Pointer(target=VkDebugUtilsMessengerCallbackDataEXT.class) MemorySegment pCallbackData,
            @Pointer(comment="void*") MemorySegment ignoredPUserData
    ) {
        var callbackData = new VkDebugUtilsMessengerCallbackDataEXT(pCallbackData.reinterpret(VkDebugUtilsMessengerCallbackDataEXT.BYTES));
        System.err.println("Validation layer: " + Objects.requireNonNull(callbackData.pMessage()).readString());
        return VkConstants.FALSE;
    }

    private static void populateDebugMessengerCreateInfo(VkDebugUtilsMessengerCreateInfoEXT debugUtilsMessengerCreateInfo) {
        debugUtilsMessengerCreateInfo.messageSeverity(
                VkDebugUtilsMessageSeverityFlagsEXT.VERBOSE
                | VkDebugUtilsMessageSeverityFlagsEXT.WARNING
                | VkDebugUtilsMessageSeverityFlagsEXT.ERROR
        );
        debugUtilsMessengerCreateInfo.messageType(
                VkDebugUtilsMessageTypeFlagsEXT.GENERAL
                | VkDebugUtilsMessageTypeFlagsEXT.VALIDATION
                | VkDebugUtilsMessageTypeFlagsEXT.PERFORMANCE
        );
        debugUtilsMessengerCreateInfo.pfnUserCallback(UPCALL_debugCallback);
    }

    private GLFW glfw;
    private GLFWwindow window;

    private VkStaticCommands staticCommands;
    private VkEntryCommands entryCommands;
    private VkInstance instance;
    private VkInstanceCommands instanceCommands;
    private VkDebugUtilsMessengerEXT debugMessenger;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final BytePtr WINDOW_TITLE = BytePtr.allocateString(Arena.global(), "Vulkan");
    private static final boolean ENABLE_VALIDATION_LAYERS = System.getProperty("validation") != null;
    private static final String VALIDATION_LAYER_NAME = "VK_LAYER_KHRONOS_validation";
    private static final MethodHandle HANDLE_debugCallback;
    static {
        try {
            HANDLE_debugCallback = MethodHandles
                    .lookup()
                    .findStatic(
                            Application.class,
                            "debugCallback",
                            VkFunctionTypes.PFN_vkDebugUtilsMessengerCallbackEXT.toMethodType());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    private static final MemorySegment UPCALL_debugCallback = Linker
            .nativeLinker()
            .upcallStub(
                    HANDLE_debugCallback,
                    VkFunctionTypes.PFN_vkDebugUtilsMessengerCallbackEXT,
                    Arena.global());
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
