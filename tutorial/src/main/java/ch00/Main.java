package ch00;

import tech.icey.glfw.GLFWConstants;
import tech.icey.glfw.handle.GLFWwindow;
import tech.icey.glfw.GLFW;
import tech.icey.glfw.GLFWLoader;
import tech.icey.panama.buffer.ByteBuffer;

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
    }

    private void mainLoop() {
        while (glfw.glfwWindowShouldClose(window) == GLFWConstants.GLFW_FALSE) {
            glfw.glfwPollEvents();
        }
    }

    private void cleanup() {
        glfw.glfwDestroyWindow(window);
        glfw.glfwTerminate();
    }

    private GLFW glfw;
    private GLFWwindow window;

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
