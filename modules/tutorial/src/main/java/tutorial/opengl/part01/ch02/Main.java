package tutorial.opengl.part01.ch02;

import club.doki7.ffm.annotation.Pointer;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.glfw.GLFW;
import club.doki7.glfw.GLFWFunctionTypes;
import club.doki7.glfw.GLFWLoader;
import club.doki7.glfw.handle.GLFWwindow;
import club.doki7.opengl.GL;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;

class Application {
    private final GLFW glfw;
    private GL gl;

    public Application(GLFW glfw) {
        this.glfw = glfw;
    }

    public void run() {
        if (glfw.init() != GLFW.TRUE) {
            throw new RuntimeException("Failed to initialize GLFW");
        }

        glfw.windowHint(GLFW.CONTEXT_VERSION_MAJOR, 3);
        glfw.windowHint(GLFW.CONTEXT_VERSION_MINOR, 3);
        glfw.windowHint(GLFW.OPENGL_PROFILE, GLFW.OPENGL_CORE_PROFILE);

        GLFWwindow window = glfw.createWindow(
                800,
                600,
                BytePtr.allocateString(Arena.global(), "LearnOpenGL"),
                null,
                null
        );
        if (window == null) {
            throw new RuntimeException("Failed to create GLFW window");
        }
        glfw.makeContextCurrent(window);

        gl = new GL(name -> {
            try (Arena arena1 = Arena.ofConfined()) {
                return glfw.getProcAddress(BytePtr.allocateString(arena1, name));
            }
        });
        gl.viewport(0, 0, 800, 600);

        glfw.setFramebufferSizeCallback(window, (_, w, h) -> gl.viewport(0, 0, w, h));

        while (glfw.windowShouldClose(window) == GLFW.FALSE) {
            processInput(window);

            gl.clearColor(0.2f, 0.3f, 0.3f, 1.0f);
            gl.clear(GL.COLOR_BUFFER_BIT);

            glfw.swapBuffers(window);
            glfw.pollEvents();
        }

        glfw.terminate();
    }

    private void processInput(GLFWwindow window) {
        if (glfw.getKey(window, GLFW.KEY_ESCAPE) == GLFW.PRESS) {
            glfw.setWindowShouldClose(window, GLFW.TRUE);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        try (ISharedLibrary libGLFW = GLFWLoader.loadGLFWLibrary()) {
            GLFW glfw = GLFWLoader.loadGLFW(libGLFW);

            Application application = new Application(glfw);
            application.run();
        }
    }
}
