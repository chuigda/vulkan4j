package tutorial.opengl.part01.ch01;

import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.glfw.GLFW;
import club.doki7.glfw.GLFWLoader;

class Application {
    private GLFW glfw;

    public Application(GLFW glfw) {
        this.glfw = glfw;
    }

    public void run() {
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
