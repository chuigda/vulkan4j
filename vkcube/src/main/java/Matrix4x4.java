import tech.icey.vk4j.buffer.FloatBuffer;

import java.lang.foreign.Arena;

public final class Matrix4x4 {
    public float m00, m01, m02, m03;
    public float m10, m11, m12, m13;
    public float m20, m21, m22, m23;
    public float m30, m31, m32, m33;

    public FloatBuffer toBuffer(Arena arena) {
        var ret = FloatBuffer.allocate(arena, 16);
        ret.write(0, m00);
        ret.write(1, m01);
        ret.write(2, m02);
        ret.write(3, m03);

        ret.write(4, m10);
        ret.write(5, m11);
        ret.write(6, m12);
        ret.write(7, m13);

        ret.write(8, m20);
        ret.write(9, m21);
        ret.write(10, m22);
        ret.write(11, m23);

        ret.write(12, m30);
        ret.write(13, m31);
        ret.write(14, m32);
        ret.write(15, m33);

        return ret;
    }
}
