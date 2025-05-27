package tutorial.vulkan.ch01;

import club.doki7.glfw.GLFWConstants;
import club.doki7.glfw.handle.GLFWwindow;
import club.doki7.glfw.GLFW;
import club.doki7.glfw.GLFWLoader;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.IntPtr;
import club.doki7.vulkan.Version;
import club.doki7.vulkan.command.VulkanLoader;
import club.doki7.vulkan.command.VkEntryCommands;
import club.doki7.vulkan.command.VkInstanceCommands;
import club.doki7.vulkan.command.VkStaticCommands;
import club.doki7.vulkan.datatype.VkApplicationInfo;
import club.doki7.vulkan.datatype.VkExtensionProperties;
import club.doki7.vulkan.datatype.VkInstanceCreateInfo;
import club.doki7.vulkan.enumtype.VkResult;
import club.doki7.vulkan.handle.VkInstance;

import java.lang.foreign.Arena;
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
    }

    private void mainLoop() {
        while (glfw.windowShouldClose(window) == GLFWConstants.FALSE) {
            glfw.pollEvents();
        }
    }

    private void cleanup() {
        instanceCommands.destroyInstance(instance, null);
        glfw.destroyWindow(window);
        glfw.terminate();
    }

    private void createInstance() {
        try (var arena = Arena.ofConfined()) {
            var appInfo = VkApplicationInfo.allocate(arena);
            appInfo.pApplicationName(BytePtr.allocateString(arena, "Zdravstvuyte, Vulkan!"));
            appInfo.applicationVersion(new Version(0, 1, 0, 0).encode());
            appInfo.pEngineName(BytePtr.allocateString(arena, "Soloviev D-30"));
            appInfo.engineVersion(new Version(0, 1, 0, 0).encode());
            appInfo.apiVersion(Version.VK_API_VERSION_1_0.encode());

            var instanceCreateInfo = VkInstanceCreateInfo.allocate(arena);
            instanceCreateInfo.pApplicationInfo(appInfo);

            var pGLFWExtensionCount = IntPtr.allocate(arena);
            var glfwExtensions = glfw.getRequiredInstanceExtensions(pGLFWExtensionCount);
            if (glfwExtensions == null) {
                throw new RuntimeException("Failed to get GLFW required instance extensions");
            }

            var glfwExtensionCount = pGLFWExtensionCount.read();
            glfwExtensions = glfwExtensions.reinterpret(glfwExtensionCount);
            instanceCreateInfo.enabledExtensionCount(pGLFWExtensionCount.read());
            instanceCreateInfo.ppEnabledExtensionNames(glfwExtensions);

            var pInstance = VkInstance.Ptr.allocate(arena);
            var result = entryCommands.createInstance(instanceCreateInfo, null, pInstance);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to create instance, vulkan error code: " + VkResult.explain(result));
            }
            instance = Objects.requireNonNull(pInstance.read());
            instanceCommands = VulkanLoader.loadInstanceCommands(instance, staticCommands);

            IntPtr pExtensionCount = IntPtr.allocate(arena);
            result = entryCommands.enumerateInstanceExtensionProperties(null, pExtensionCount, null);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to enumerate instance extension properties, vulkan error code: " + VkResult.explain(result));
            }
            var extensionCount = pExtensionCount.read();
            var extensions = VkExtensionProperties.allocate(arena, extensionCount);
            result = entryCommands.enumerateInstanceExtensionProperties(null, pExtensionCount, extensions);
            if (result != VkResult.SUCCESS) {
                throw new RuntimeException("Failed to enumerate instance extension properties, vulkan error code: " + VkResult.explain(result));
            }

            for (int i = 0; i < extensionCount; i++) {
                var extension = extensions.at(i);
                System.out.printf("Extension %d: %s (version: %d)\n", i, extension.extensionName(), extension.specVersion());
            }
        }
    }

    private GLFW glfw;
    private GLFWwindow window;

    private VkStaticCommands staticCommands;
    private VkEntryCommands entryCommands;
    private VkInstance instance;
    private VkInstanceCommands instanceCommands;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final BytePtr WINDOW_TITLE = BytePtr.allocateString(Arena.global(), "Vulkan");
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
