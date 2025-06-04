package tutorial.opengl.part01.ch02;

import club.doki7.ffm.ptr.BytePtr;
import club.doki7.glfw.GLFW;
import club.doki7.glfw.GLFWConstants;
import club.doki7.glfw.GLFWLoader;
import club.doki7.glfw.handle.GLFWwindow;
import club.doki7.opengl.GL;
import club.doki7.opengl.GLConstants;

import java.lang.foreign.Arena;

public class Main {
    public static void main(String[] args) {
        GLFWLoader.loadGLFWLibrary();
        GLFW glfw = GLFWLoader.loadGLFW();

        applicationStart(glfw);
    }

    private static void applicationStart(GLFW glfw) {
        if (glfw.init() != GLFWConstants.TRUE) {
            throw new RuntimeException("Failed to initialize GLFW");
        }

        glfw.windowHint(GLFWConstants.CONTEXT_VERSION_MAJOR, 3);
        glfw.windowHint(GLFWConstants.CONTEXT_VERSION_MINOR, 3);
        glfw.windowHint(GLFWConstants.OPENGL_PROFILE, GLFWConstants.OPENGL_CORE_PROFILE);

        try (Arena arena = Arena.ofConfined()) {
            GLFWwindow window = glfw.createWindow(
                    800,
                    600,
                    BytePtr.allocateString(arena, "LearnOpenGL"),
                    null,
                    null
            );
            if (window == null) {
                throw new RuntimeException("Failed to create GLFW window");
            }
            glfw.makeContextCurrent(window);

            GL gl = new GL(name -> {
                try (Arena arena1 = Arena.ofConfined()) {
                    return glfw.getProcAddress(BytePtr.allocateString(arena1, name));
                }
            });
            System.out.println(gl.getString(GLConstants.EXTENSIONS).readString());
        }
    }
}
