package tutorial.opengl.part01.ch02;

import club.doki7.ffm.annotation.Pointer;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.glfw.GLFW;
import club.doki7.glfw.GLFWConstants;
import club.doki7.glfw.GLFWFunctionTypes;
import club.doki7.glfw.GLFWLoader;
import club.doki7.glfw.handle.GLFWwindow;
import club.doki7.opengl.GL;
import club.doki7.opengl.GLConstants;

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
        if (glfw.init() != GLFWConstants.TRUE) {
            throw new RuntimeException("Failed to initialize GLFW");
        }

        glfw.windowHint(GLFWConstants.CONTEXT_VERSION_MAJOR, 3);
        glfw.windowHint(GLFWConstants.CONTEXT_VERSION_MINOR, 3);
        glfw.windowHint(GLFWConstants.OPENGL_PROFILE, GLFWConstants.OPENGL_CORE_PROFILE);

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

        try {
            MethodHandle mh = MethodHandles.lookup()
                    .findVirtual(
                            Application.class,
                            "framebufferResizeCallback",
                            GLFWFunctionTypes.GLFWframebuffersizefun.toMethodType()
                    );
            mh = mh.bindTo(this);
            MemorySegment callback = Linker
                    .nativeLinker()
                    .upcallStub(mh, GLFWFunctionTypes.GLFWframebuffersizefun, Arena.global());
            glfw.setFramebufferSizeCallback(window, callback);
        } catch(Exception e) {
            throw new RuntimeException("Failed to find framebufferResizeCallback method handle",e);
        }

        while (glfw.windowShouldClose(window) == GLFWConstants.FALSE) {
            processInput(window);

            gl.clearColor(0.2f, 0.3f, 0.3f, 1.0f);
            gl.clear(GLConstants.COLOR_BUFFER_BIT);

            glfw.swapBuffers(window);
            glfw.pollEvents();
        }

        glfw.terminate();
    }

    private void framebufferResizeCallback(
            @Pointer(target=GLFWwindow.class) MemorySegment window,
            int width,
            int height
    ) {
        gl.viewport(0, 0, width, height);
    }

    private void processInput(GLFWwindow window) {
        if (glfw.getKey(window, GLFWConstants.KEY_ESCAPE) == GLFWConstants.PRESS) {
            glfw.setWindowShouldClose(window, GLFWConstants.TRUE);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        GLFWLoader.loadGLFWLibrary();
        GLFW glfw = GLFWLoader.loadGLFW();

        Application application = new Application(glfw);
        application.run();
    }
}
