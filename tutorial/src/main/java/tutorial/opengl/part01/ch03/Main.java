package tutorial.opengl.part01.ch03;

import club.doki7.ffm.annotation.Pointer;
import club.doki7.ffm.annotation.Unsigned;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.FloatPtr;
import club.doki7.ffm.ptr.IntPtr;
import club.doki7.ffm.ptr.PointerPtr;
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
            MethodHandle mh = MethodHandles
                    .lookup()
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

        @Unsigned int vao;
        @Unsigned int vbo;
        @Unsigned int shaderProgram;
        try(Arena arena = Arena.ofConfined()) {
            IntPtr pVAO = IntPtr.allocate(arena);
            gl.genVertexArrays(1, pVAO);
            vao = pVAO.read();

            IntPtr pVBO = IntPtr.allocate(arena);
            gl.genBuffers(1, pVBO);
            vbo = pVBO.read();

            gl.bindVertexArray(vao);
            gl.bindBuffer(GLConstants.ARRAY_BUFFER, vbo);
            FloatPtr pVertices = FloatPtr.allocate(arena, VERTICES);
            gl.bufferData(
                    GLConstants.ARRAY_BUFFER,
                    pVertices.segment().byteSize(),
                    pVertices.segment(),
                    GLConstants.STATIC_DRAW
            );
            gl.vertexAttribPointer(
                    0,
                    3,
                    GLConstants.FLOAT,
                    (byte) GLFWConstants.FALSE,
                    3 * Float.BYTES,
                    MemorySegment.NULL
            );
            gl.enableVertexAttribArray(0);

            IntPtr pSuccess = IntPtr.allocate(arena);
            BytePtr pInfoLog = BytePtr.allocate(arena, 512);
            @Unsigned int vertexShader = gl.createShader(GLConstants.VERTEX_SHADER);
            var pVertexShaderSource = PointerPtr.allocateV(arena, BytePtr.allocateString(arena, VERTEX_SHADER_SOURCE));
            gl.shaderSource(vertexShader, 1, pVertexShaderSource, null);
            gl.compileShader(vertexShader);
            gl.getShaderiv(vertexShader, GLConstants.COMPILE_STATUS, pSuccess);
            if (pSuccess.read() == GLFWConstants.FALSE) {
                gl.getShaderInfoLog(vertexShader, 512, null, pInfoLog);
                throw new RuntimeException("Failed to compile vertex shader: " + pInfoLog.readString());
            }

            @Unsigned int fragmentShader = gl.createShader(GLConstants.FRAGMENT_SHADER);
            var pFragmentShaderSource = PointerPtr.allocateV(arena, BytePtr.allocateString(arena, FRAGMENT_SHADER_SOURCE));
            gl.shaderSource(fragmentShader, 1, pFragmentShaderSource, null);
            gl.compileShader(fragmentShader);
            gl.getShaderiv(fragmentShader, GLConstants.COMPILE_STATUS, pSuccess);
            if (pSuccess.read() == GLFWConstants.FALSE) {
                gl.getShaderInfoLog(fragmentShader, 512, null, pInfoLog);
                throw new RuntimeException("Failed to compile fragment shader: " + pInfoLog.readString());
            }

            shaderProgram = gl.createProgram();
            gl.attachShader(shaderProgram, vertexShader);
            gl.attachShader(shaderProgram, fragmentShader);
            gl.linkProgram(shaderProgram);
            gl.getProgramiv(shaderProgram, GLConstants.LINK_STATUS, pSuccess);
            if (pSuccess.read() == GLFWConstants.FALSE) {
                gl.getProgramInfoLog(shaderProgram, 512, null, pInfoLog);
                throw new RuntimeException("Failed to link shader program: " + pInfoLog.readString());
            }

            gl.deleteShader(vertexShader);
            gl.deleteShader(fragmentShader);
        }

        while (glfw.windowShouldClose(window) == GLFWConstants.FALSE) {
            processInput(window);

            gl.clearColor(0.2f, 0.3f, 0.3f, 1.0f);
            gl.clear(GLConstants.COLOR_BUFFER_BIT);

            gl.useProgram(shaderProgram);
            gl.bindVertexArray(vao);
            gl.drawArrays(GLConstants.TRIANGLES, 0, 3);

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

    private static final float[] VERTICES = {
            -0.5f, -0.5f, 0.0f,
            0.5f, -0.5f, 0.0f,
            0.0f,  0.5f, 0.0f
    };

    private static final String VERTEX_SHADER_SOURCE =
            """
            #version 330 core
            layout (location = 0) in vec3 aPos;
        
            void main() {
                gl_Position = vec4(aPos, 1.0f);
            }
            """;

    private static final String FRAGMENT_SHADER_SOURCE =
            """
            #version 330 core
            out vec4 FragColor;
            
            void main() {
                FragColor = vec4(1.0f, 0.5f, 0.2f, 1.0f);
            }
            """;
}

public class Main {
    public static void main(String[] args) {
        GLFWLoader.loadGLFWLibrary();
        GLFW glfw = GLFWLoader.loadGLFW();

        Application application = new Application(glfw);
        application.run();
    }
}
