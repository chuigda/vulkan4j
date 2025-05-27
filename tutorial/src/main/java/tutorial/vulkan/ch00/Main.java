package tutorial.vulkan.ch00;

import club.doki7.glfw.GLFWConstants;
import club.doki7.glfw.handle.GLFWwindow;
import club.doki7.glfw.GLFW;
import club.doki7.glfw.GLFWLoader;
import club.doki7.ffm.ptr.BytePtr;

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
    }

    private void mainLoop() {
        while (glfw.windowShouldClose(window) == GLFWConstants.FALSE) {
            glfw.pollEvents();
        }
    }

    private void cleanup() {
        glfw.destroyWindow(window);
        glfw.terminate();
    }

    private GLFW glfw;
    private GLFWwindow window;

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
