import tech.icey.vk4j.buffer.FloatBuffer;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

public final class MeshData {
    // Proudly stolen from https://github.com/KhronosGroup/Vulkan-Tools/blob/4c63e845962ff3b197855f3ae4907a47d0863f5a/cube/cube.c#L169
    public static final float[] VERTEX_BUFFER_DATA = {
            -1.0f,-1.0f,-1.0f,  // -X side
            -1.0f,-1.0f, 1.0f,
            -1.0f, 1.0f, 1.0f,
            -1.0f, 1.0f, 1.0f,
            -1.0f, 1.0f,-1.0f,
            -1.0f,-1.0f,-1.0f,

            -1.0f,-1.0f,-1.0f,  // -Z side
            1.0f, 1.0f,-1.0f,
            1.0f,-1.0f,-1.0f,
            -1.0f,-1.0f,-1.0f,
            -1.0f, 1.0f,-1.0f,
            1.0f, 1.0f,-1.0f,

            -1.0f,-1.0f,-1.0f,  // -Y side
            1.0f,-1.0f,-1.0f,
            1.0f,-1.0f, 1.0f,
            -1.0f,-1.0f,-1.0f,
            1.0f,-1.0f, 1.0f,
            -1.0f,-1.0f, 1.0f,

            -1.0f, 1.0f,-1.0f,  // +Y side
            -1.0f, 1.0f, 1.0f,
            1.0f, 1.0f, 1.0f,
            -1.0f, 1.0f,-1.0f,
            1.0f, 1.0f, 1.0f,
            1.0f, 1.0f,-1.0f,

            1.0f, 1.0f,-1.0f,  // +X side
            1.0f, 1.0f, 1.0f,
            1.0f,-1.0f, 1.0f,
            1.0f,-1.0f, 1.0f,
            1.0f,-1.0f,-1.0f,
            1.0f, 1.0f,-1.0f,

            -1.0f, 1.0f, 1.0f,  // +Z side
            -1.0f,-1.0f, 1.0f,
            1.0f, 1.0f, 1.0f,
            -1.0f,-1.0f, 1.0f,
            1.0f,-1.0f, 1.0f,
            1.0f, 1.0f, 1.0f,
    };

    // Proudly stolen from https://github.com/KhronosGroup/Vulkan-Tools/blob/4c63e845962ff3b197855f3ae4907a47d0863f5a/cube/cube.c#L213
    public static final float[] UV_BUFFER_DATA = {
            0.0f, 1.0f,  // -X side
            1.0f, 1.0f,
            1.0f, 0.0f,
            1.0f, 0.0f,
            0.0f, 0.0f,
            0.0f, 1.0f,

            1.0f, 1.0f,  // -Z side
            0.0f, 0.0f,
            0.0f, 1.0f,
            1.0f, 1.0f,
            1.0f, 0.0f,
            0.0f, 0.0f,

            1.0f, 0.0f,  // -Y side
            1.0f, 1.0f,
            0.0f, 1.0f,
            1.0f, 0.0f,
            0.0f, 1.0f,
            0.0f, 0.0f,

            1.0f, 0.0f,  // +Y side
            0.0f, 0.0f,
            0.0f, 1.0f,
            1.0f, 0.0f,
            0.0f, 1.0f,
            1.0f, 1.0f,

            1.0f, 0.0f,  // +X side
            0.0f, 0.0f,
            0.0f, 1.0f,
            0.0f, 1.0f,
            1.0f, 1.0f,
            1.0f, 0.0f,

            0.0f, 0.0f,  // +Z side
            0.0f, 1.0f,
            1.0f, 0.0f,
            0.0f, 1.0f,
            1.0f, 1.0f,
            1.0f, 0.0f,
    };

    public static FloatBuffer vertexBuffer(Arena arena) {
        var ret = FloatBuffer.allocate(arena, VERTEX_BUFFER_DATA.length);
        ret.segment().copyFrom(MemorySegment.ofArray(VERTEX_BUFFER_DATA));
        return ret;
    }

    public static FloatBuffer uvBuffer(Arena arena) {
        var ret = FloatBuffer.allocate(arena, UV_BUFFER_DATA.length);
        ret.segment().copyFrom(MemorySegment.ofArray(UV_BUFFER_DATA));
        return ret;
    }
}
