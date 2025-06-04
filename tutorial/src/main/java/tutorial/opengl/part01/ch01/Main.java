package tutorial.opengl.part01.ch01;

import club.doki7.glfw.GLFW;
import club.doki7.glfw.GLFWLoader;

public class Main {
    public static void main(String[] args) {
        GLFWLoader.loadGLFWLibrary();
        GLFW glfw = GLFWLoader.loadGLFW();

        applicationStart(glfw);
    }

    private static void applicationStart(GLFW glfw) {
    }
}
