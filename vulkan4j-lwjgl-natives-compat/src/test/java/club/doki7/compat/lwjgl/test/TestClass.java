package club.doki7.compat.lwjgl.test;

import org.junit.jupiter.api.Test;
import org.lwjgl.system.Library;

public class TestClass {
    @Test
    void test() {
        try (var libGLFW = Library.loadNative(Library.class, "org.lwjgl.glfw", "glfw", true)) {
            System.out.println(libGLFW);
        }
    }
}
