package example.manualTest;

import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.glfw.GLFW;
import club.doki7.glfw.GLFWLoader;
import club.doki7.glfw.handle.GLFWwindow;

import java.lang.foreign.Arena;
import java.util.Objects;

public interface GLFWXID {
    static void main(String[] args) {
        try (ISharedLibrary libGLFW = GLFWLoader.loadGLFWLibrary();
             Arena arena = Arena.ofConfined()) {
            GLFW glfw = GLFWLoader.loadGLFW(libGLFW);

            glfw.initHint(GLFW.PLATFORM, GLFW.PLATFORM_X11);
            if (glfw.init() != GLFW.TRUE) {
                throw new RuntimeException("Failed to initialize GLFW");
            }

            GLFWwindow window = Objects.requireNonNull(glfw.createWindow(
                    640,
                    480,
                    BytePtr.allocateString(arena, "Hello, world!"),
                    null,
                    null
            ));
            long x11Window = glfw.getX11Window(window);

            System.out.println("X11 Window ID: " + x11Window);

            glfw.destroyWindow(window);
            glfw.terminate();
        }
    }
}
