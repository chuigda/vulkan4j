package club.doki7.glfw;

import club.doki7.ffm.FunctionLoader;
import club.doki7.ffm.Loader;

public final class GLFWLoader {
    /// Try loading the GLFW library.
    ///
    /// This function is implemented in terms of {@link System#loadLibrary}. On Windows it will try {@code "glfw3"}
    /// ({@code glfw3.dll}), and on other platforms it will try {@code "glfw"} ({@code libglfw.so}).
    ///
    /// Instead of using this function, you may also implement your own GLFW library loading logic.
    ///
    /// @throws SecurityException see {@link System#loadLibrary}
    /// @throws UnsatisfiedLinkError see {@link System#loadLibrary}
    public static void loadGLFWLibrary() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            System.loadLibrary("glfw3");
        } else {
            System.loadLibrary("glfw");
        }
    }

    /// Load GLFW functions.
    ///
    /// This function is implemented in terms of {@link Loader#loadFunctionOrNull}. If any of the functions is not
    /// found, that "slot" will be filled with {@code null}. Calling a function not loaded will result in a
    /// {@link NullPointerException}, intuitively. For GLFW, in theory only platform-dependent functions (functions in
    /// {@code glfw3native.h}) may not be found.
    ///
    /// Instead of using this function, you may also implement your own command loading logic with {@link GLFW#GLFW}
    /// and your own {@link FunctionLoader}.
    ///
    /// @return loaded GLFW functions
    public static GLFW loadGLFW() {
        return new GLFW(Loader::loadFunctionOrNull);
    }
}
