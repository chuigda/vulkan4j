package ch01;

import tech.icey.glfwmini.GLFWwindow;
import tech.icey.glfwmini.LibGLFW;
import tech.icey.vk4j.Version;
import tech.icey.panama.buffer.ByteBuffer;
import tech.icey.panama.buffer.IntBuffer;
import tech.icey.vk4j.VulkanLoader;
import tech.icey.vk4j.command.EntryCommands;
import tech.icey.vk4j.command.InstanceCommands;
import tech.icey.vk4j.command.StaticCommands;
import tech.icey.vk4j.datatype.VkApplicationInfo;
import tech.icey.vk4j.datatype.VkInstanceCreateInfo;
import tech.icey.vk4j.enumtype.VkResult;
import tech.icey.vk4j.handle.VkInstance;

import java.lang.foreign.Arena;

class Application {
    public void run() {
        initWindow();
        initVulkan();
        mainLoop();
        cleanup();
    }

    private void initWindow() {
        LibGLFW.loadGLFWLibrary();
        libGLFW = LibGLFW.loadGLFW();
        if (libGLFW.glfwInit() != LibGLFW.GLFW_TRUE) {
            throw new RuntimeException("Failed to initialize GLFW");
        }

        if (libGLFW.glfwVulkanSupported() != LibGLFW.GLFW_TRUE) {
            throw new RuntimeException("Vulkan is not supported");
        }

        libGLFW.glfwWindowHint(LibGLFW.GLFW_CLIENT_API, LibGLFW.GLFW_NO_API);
        libGLFW.glfwWindowHint(LibGLFW.GLFW_RESIZABLE, LibGLFW.GLFW_FALSE);
        window = libGLFW.glfwCreateWindow(WIDTH, HEIGHT, "Vulkan", null, null);
    }

    private void initVulkan() {
        VulkanLoader.loadVulkanLibrary();
        staticCommands = VulkanLoader.loadStaticCommands();
        entryCommands = VulkanLoader.loadEntryCommands();

        createInstance();
    }

    private void mainLoop() {
        while (!libGLFW.glfwWindowShouldClose(window)) {
            libGLFW.glfwPollEvents();
        }
    }

    private void cleanup() {
        instanceCommands.vkDestroyInstance(instance, null);
        libGLFW.glfwDestroyWindow(window);
        libGLFW.glfwTerminate();
    }

    private void createInstance() {
        try (var arena = Arena.ofConfined()) {
            var appInfo = VkApplicationInfo.allocate(arena);
            appInfo.pApplicationName(ByteBuffer.allocateString(arena, "Zdravstvuyte, Vulkan!"));
            appInfo.applicationVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            appInfo.pEngineName(ByteBuffer.allocateString(arena, "Soloviev D-30"));
            appInfo.engineVersion(Version.vkMakeAPIVersion(0, 1, 0, 0));
            appInfo.apiVersion(Version.VK_API_VERSION_1_0);

            var instanceCreateInfo = VkInstanceCreateInfo.allocate(arena);
            instanceCreateInfo.pApplicationInfo(appInfo);

            var pGLFWExtensionCount = IntBuffer.allocate(arena);
            var glfwExtensions = libGLFW.glfwGetRequiredInstanceExtensions(pGLFWExtensionCount);
            if (glfwExtensions == null) {
                throw new RuntimeException("Failed to get GLFW required instance extensions");
            }

            instanceCreateInfo.enabledExtensionCount(pGLFWExtensionCount.read());
            instanceCreateInfo.ppEnabledExtensionNames(glfwExtensions);

            var pInstance = VkInstance.Buffer.allocate(arena);
            var result = entryCommands.vkCreateInstance(instanceCreateInfo, null, pInstance);
            if (result != VkResult.VK_SUCCESS) {
                throw new RuntimeException("Failed to create instance, vulkan error code: " + VkResult.explain(result));
            }
            instance = pInstance.read();
            instanceCommands = VulkanLoader.loadInstanceCommands(instance, staticCommands);
        }
    }

    private LibGLFW libGLFW;
    private GLFWwindow window;

    private StaticCommands staticCommands;
    private EntryCommands entryCommands;
    private VkInstance instance;
    private InstanceCommands instanceCommands;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
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
