import tech.icey.glfwmini.GLFWwindow;
import tech.icey.glfwmini.LibGLFW;

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
    }

    private void mainLoop() {
        while (!libGLFW.glfwWindowShouldClose(window)) {
            libGLFW.glfwPollEvents();
        }
    }

    private void cleanup() {
        libGLFW.glfwDestroyWindow(window);
        libGLFW.glfwTerminate();
    }

    private LibGLFW libGLFW;
    private GLFWwindow window;

    private static final int WIDTH = 800;
    private static final int HEIGHT = 600;
}

public class CH00_BaseCode {
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
