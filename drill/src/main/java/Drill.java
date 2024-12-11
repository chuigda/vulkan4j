import tech.icey.gles2.GLES2;
import tech.icey.gles2.GLES2Constants;
import tech.icey.glfw.GLFWConstants;
import tech.icey.glfw.GLFWLoader;
import tech.icey.panama.buffer.ByteBuffer;
import tech.icey.panama.buffer.FloatBuffer;
import tech.icey.panama.buffer.IntBuffer;
import tech.icey.panama.buffer.PointerBuffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public final class Drill {
    public static void main(String[] args) {
        GLFWLoader.loadGLFWLibrary();
        var glfw = GLFWLoader.loadGLFW();
        if (glfw.glfwInit() != GLFWConstants.GLFW_TRUE) {
            throw new RuntimeException("unable to initialize GLFW");
        }

        try (var arena = Arena.ofConfined()) {
            glfw.glfwWindowHint(GLFWConstants.GLFW_CLIENT_API, GLFWConstants.GLFW_OPENGL_ES_API);
            glfw.glfwWindowHint(GLFWConstants.GLFW_CONTEXT_VERSION_MAJOR, 2);
            glfw.glfwWindowHint(GLFWConstants.GLFW_CONTEXT_VERSION_MINOR, 0);
            glfw.glfwWindowHint(GLFWConstants.GLFW_OPENGL_PROFILE, GLFWConstants.GLFW_OPENGL_ANY_PROFILE);
            var width = 640;
            var height = 480;
            var window = glfw.glfwCreateWindow(width, height, ByteBuffer.allocateString(arena, "Zdravstvuyte, GLES2!"), null, null);
            if (window == null) {
                throw new RuntimeException("unable to create window");
            }
            glfw.glfwMakeContextCurrent(window);

            var gles2 = new GLES2(name -> {
                try (var localArena = Arena.ofConfined()) {
                    return glfw.glfwGetProcAddress(ByteBuffer.allocateString(localArena, name));
                }
            });
            var version = gles2.glGetString(GLES2Constants.GL_VERSION);
            var vendor = gles2.glGetString(GLES2Constants.GL_VENDOR);
            var extensions = gles2.glGetString(GLES2Constants.GL_EXTENSIONS);
            assert version != null;
            assert vendor != null;
            assert extensions != null;
            System.out.println("OpenGL ES version: " + version.readString());
            System.out.println("OpenGL ES vendor: " + vendor.readString());
            System.out.println("OpenGL ES extensions: " + extensions.readString());

            // colored triangle
            var vertices = new float[] {
                    // position   color
                    0.0f, 0.5f,   1.0f, 0.0f, 0.0f,
                    0.5f, -0.5f,  0.0f, 1.0f, 0.0f,
                    -0.5f, -0.5f, 0.0f, 0.0f, 1.0f
            };
            var pVBO = IntBuffer.allocate(arena, 1);
            gles2.glGenBuffers(1, pVBO);
            var vbo = pVBO.read();
            gles2.glBindBuffer(GLES2Constants.GL_ARRAY_BUFFER, vbo);
            var pVertices = FloatBuffer.allocate(arena, vertices);
            gles2.glBufferData(
                    GLES2Constants.GL_ARRAY_BUFFER,
                    pVertices.segment().byteSize(),
                    pVertices.segment(),
                    GLES2Constants.GL_STATIC_DRAW
            );

            var vertexShaderBuffer = ByteBuffer.allocateString(arena, """
                attribute vec2 position;
                attribute vec3 color;
                varying vec3 vColor;
                void main() {
                    gl_Position = vec4(position, 0.0, 1.0);
                    vColor = color;
                }
            """);
            var fragmentShaderBuffer = ByteBuffer.allocateString(arena, """
                precision mediump float;
                varying vec3 vColor;
                void main() {
                    gl_FragColor = vec4(vColor, 1.0);
                }
            """);
            var pVertexShaderBuffer = PointerBuffer.allocate(arena, 1);
            pVertexShaderBuffer.write(vertexShaderBuffer);
            var pFragmentShaderBuffer = PointerBuffer.allocate(arena, 1);
            pFragmentShaderBuffer.write(fragmentShaderBuffer);

            var vertexShader = gles2.glCreateShader(GLES2Constants.GL_VERTEX_SHADER);
            var fragmentShader = gles2.glCreateShader(GLES2Constants.GL_FRAGMENT_SHADER);
            gles2.glShaderSource(vertexShader, 1, pVertexShaderBuffer, null);
            gles2.glCompileShader(vertexShader);
            gles2.glShaderSource(fragmentShader, 1, pFragmentShaderBuffer, null);
            gles2.glCompileShader(fragmentShader);
            var shaderProgram = gles2.glCreateProgram();
            gles2.glAttachShader(shaderProgram, vertexShader);
            gles2.glAttachShader(shaderProgram, fragmentShader);
            gles2.glLinkProgram(shaderProgram);

            var pWidth = IntBuffer.allocate(arena, 1);
            var pHeight = IntBuffer.allocate(arena, 1);

            while (glfw.glfwWindowShouldClose(window) == GLFWConstants.GLFW_FALSE) {
                glfw.glfwGetFramebufferSize(window, pWidth, pHeight);
                if (pWidth.read() != width || pHeight.read() != height) {
                    width = pWidth.read();
                    height = pHeight.read();
                    gles2.glViewport(0, 0, width, height);
                }

                gles2.glClearColor(0.2f, 0.3f, 0.3f, 1.0f);
                gles2.glClear(GLES2Constants.GL_COLOR_BUFFER_BIT);

                gles2.glUseProgram(shaderProgram);

                gles2.glEnableVertexAttribArray(0);
                gles2.glEnableVertexAttribArray(1);
                gles2.glVertexAttribPointer(
                        0,
                        2,
                        GLES2Constants.GL_FLOAT,
                        (byte) GLES2Constants.GL_FALSE,
                        5 * Float.BYTES,
                        MemorySegment.NULL
                );
                gles2.glVertexAttribPointer(
                        1,
                        3,
                        GLES2Constants.GL_FLOAT,
                        (byte) GLES2Constants.GL_FALSE,
                        5 * Float.BYTES,
                        MemorySegment.ofAddress(2 * Float.BYTES)
                );

                gles2.glBindBuffer(GLES2Constants.GL_ARRAY_BUFFER, vbo);
                gles2.glDrawArrays(GLES2Constants.GL_TRIANGLES, 0, 3);

                glfw.glfwSwapBuffers(window);
                glfw.glfwPollEvents();
            }

            glfw.glfwDestroyWindow(window);
            glfw.glfwTerminate();
        }
    }
}
