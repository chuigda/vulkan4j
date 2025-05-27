package ch01;

import tech.icey.glfw.GLFWConstants;
import tech.icey.glfw.handle.GLFWwindow;
import tech.icey.glfw.GLFW;
import tech.icey.glfw.GLFWLoader;
import tech.icey.panama.buffer.ByteBuffer;
import tech.icey.panama.buffer.IntBuffer;
import tech.icey.vk4j.Version;
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
    }

    private void mainLoop() {
        while (glfw.glfwWindowShouldClose(window) == GLFWConstants.GLFW_FALSE) {
            glfw.glfwPollEvents();
        }
    }

    private void cleanup() {
        instanceCommands.vkDestroyInstance(instance, null);
        glfw.glfwDestroyWindow(window);
        glfw.glfwTerminate();
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
            var glfwExtensions = glfw.glfwGetRequiredInstanceExtensions(pGLFWExtensionCount);
            if (glfwExtensions == null) {
                throw new RuntimeException("Failed to get GLFW required instance extensions");
            }

            var glfwExtensionCount = pGLFWExtensionCount.read();
            glfwExtensions = glfwExtensions.reinterpret(glfwExtensionCount);
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

    private GLFW glfw;
    private GLFWwindow window;

    private StaticCommands staticCommands;
    private EntryCommands entryCommands;
    private VkInstance instance;
    private InstanceCommands instanceCommands;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
    private static final ByteBuffer WINDOW_TITLE = ByteBuffer.allocateString(Arena.global(), "Vulkan");
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
