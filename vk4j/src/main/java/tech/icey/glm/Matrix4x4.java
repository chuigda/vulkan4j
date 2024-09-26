package tech.icey.glm;

import tech.icey.vk4j.buffer.FloatBuffer;

public record Matrix4x4(float m00, float m01, float m02, float m03,
                        float m10, float m11, float m12, float m13,
                        float m20, float m21, float m22, float m23,
                        float m30, float m31, float m32, float m33) {
    public Matrix4x4 dup() {
        return new Matrix4x4(m00, m01, m02, m03,
                             m10, m11, m12, m13,
                             m20, m21, m22, m23,
                             m30, m31, m32, m33);
    }

    public void writeToBuffer(FloatBuffer buffer) {
        buffer.write(0, m00);
        buffer.write(1, m01);
        buffer.write(2, m02);
        buffer.write(3, m03);

        buffer.write(4, m10);
        buffer.write(5, m11);
        buffer.write(6, m12);
        buffer.write(7, m13);

        buffer.write(8, m20);
        buffer.write(9, m21);
        buffer.write(10, m22);
        buffer.write(11, m23);

        buffer.write(12, m30);
        buffer.write(13, m31);
        buffer.write(14, m32);
        buffer.write(15, m33);
    }

    public static final Matrix4x4 IDENTITY = new Matrix4x4(
            1, 0, 0, 0,
            0, 1, 0, 0,
            0, 0, 1, 0,
            0, 0, 0, 1
    );

    public static final Matrix4x4 ZERO = new Matrix4x4(
            0, 0, 0, 0,
            0, 0, 0, 0,
            0, 0, 0, 0,
            0, 0, 0, 0
    );

    public static Matrix4x4 readFromBuffer(FloatBuffer buffer) {
        return new Matrix4x4(
                buffer.read(0),
                buffer.read(1),
                buffer.read(2),
                buffer.read(3),
                buffer.read(4),
                buffer.read(5),
                buffer.read(6),
                buffer.read(7),
                buffer.read(8),
                buffer.read(9),
                buffer.read(10),
                buffer.read(11),
                buffer.read(12),
                buffer.read(13),
                buffer.read(14),
                buffer.read(15)
        );
    }

    public static Matrix4x4 plus(Matrix4x4 a, Matrix4x4 b) {
        return new Matrix4x4(
                a.m00 + b.m00, a.m01 + b.m01, a.m02 + b.m02, a.m03 + b.m03,
                a.m10 + b.m10, a.m11 + b.m11, a.m12 + b.m12, a.m13 + b.m13,
                a.m20 + b.m20, a.m21 + b.m21, a.m22 + b.m22, a.m23 + b.m23,
                a.m30 + b.m30, a.m31 + b.m31, a.m32 + b.m32, a.m33 + b.m33
        );
    }

    public static Matrix4x4 minus(Matrix4x4 a, Matrix4x4 b) {
        return new Matrix4x4(
                a.m00 - b.m00, a.m01 - b.m01, a.m02 - b.m02, a.m03 - b.m03,
                a.m10 - b.m10, a.m11 - b.m11, a.m12 - b.m12, a.m13 - b.m13,
                a.m20 - b.m20, a.m21 - b.m21, a.m22 - b.m22, a.m23 - b.m23,
                a.m30 - b.m30, a.m31 - b.m31, a.m32 - b.m32, a.m33 - b.m33
        );
    }

    public static Matrix4x4 times(Matrix4x4 a, Matrix4x4 b) {
        return new Matrix4x4(
                a.m00 * b.m00, a.m01 * b.m01, a.m02 * b.m02, a.m03 * b.m03,
                a.m10 * b.m10, a.m11 * b.m11, a.m12 * b.m12, a.m13 * b.m13,
                a.m20 * b.m20, a.m21 * b.m21, a.m22 * b.m22, a.m23 * b.m23,
                a.m30 * b.m30, a.m31 * b.m31, a.m32 * b.m32, a.m33 * b.m33
        );
    }

    public static Matrix4x4 mtimes(Matrix4x4 lhs, Matrix4x4 rhs) {
        return new Matrix4x4(
                lhs.m00 * rhs.m00 + lhs.m01 * rhs.m10 + lhs.m02 * rhs.m20 + lhs.m03 * rhs.m30,
                lhs.m00 * rhs.m01 + lhs.m01 * rhs.m11 + lhs.m02 * rhs.m21 + lhs.m03 * rhs.m31,
                lhs.m00 * rhs.m02 + lhs.m01 * rhs.m12 + lhs.m02 * rhs.m22 + lhs.m03 * rhs.m32,
                lhs.m00 * rhs.m03 + lhs.m01 * rhs.m13 + lhs.m02 * rhs.m23 + lhs.m03 * rhs.m33,

                lhs.m10 * rhs.m00 + lhs.m11 * rhs.m10 + lhs.m12 * rhs.m20 + lhs.m13 * rhs.m30,
                lhs.m10 * rhs.m01 + lhs.m11 * rhs.m11 + lhs.m12 * rhs.m21 + lhs.m13 * rhs.m31,
                lhs.m10 * rhs.m02 + lhs.m11 * rhs.m12 + lhs.m12 * rhs.m22 + lhs.m13 * rhs.m32,
                lhs.m10 * rhs.m03 + lhs.m11 * rhs.m13 + lhs.m12 * rhs.m23 + lhs.m13 * rhs.m33,

                lhs.m20 * rhs.m00 + lhs.m21 * rhs.m10 + lhs.m22 * rhs.m20 + lhs.m23 * rhs.m30,
                lhs.m20 * rhs.m01 + lhs.m21 * rhs.m11 + lhs.m22 * rhs.m21 + lhs.m23 * rhs.m31,
                lhs.m20 * rhs.m02 + lhs.m21 * rhs.m12 + lhs.m22 * rhs.m22 + lhs.m23 * rhs.m32,
                lhs.m20 * rhs.m03 + lhs.m21 * rhs.m13 + lhs.m22 * rhs.m23 + lhs.m23 * rhs.m33,

                lhs.m30 * rhs.m00 + lhs.m31 * rhs.m10 + lhs.m32 * rhs.m20 + lhs.m33 * rhs.m30,
                lhs.m30 * rhs.m01 + lhs.m31 * rhs.m11 + lhs.m32 * rhs.m21 + lhs.m33 * rhs.m31,
                lhs.m30 * rhs.m02 + lhs.m31 * rhs.m12 + lhs.m32 * rhs.m22 + lhs.m33 * rhs.m32,
                lhs.m30 * rhs.m03 + lhs.m31 * rhs.m13 + lhs.m32 * rhs.m23 + lhs.m33 * rhs.m33
        );
    }

    public static Matrix4x4 dot(Matrix4x4 a, Matrix4x4 b) {
        return mtimes(a, b);
    }

    public static Matrix4x4 perspective(float fovy, float aspect, float zNear, float zFar) {
        float f = 1.0f / (float)Math.tan(fovy / 2.0f);
        return new Matrix4x4(
                f / aspect, 0, 0, 0,
                0, f, 0, 0,
                0, 0, (zFar + zNear) / (zNear - zFar), -1,
                0, 0, 2 * zFar * zNear / (zNear - zFar), 0
        );
    }

    public static Matrix4x4 rotateX(float angle) {
        float c = (float)Math.cos(angle);
        float s = (float)Math.sin(angle);
        return new Matrix4x4(
                1, 0, 0, 0,
                0, c, -s, 0,
                0, s, c, 0,
                0, 0, 0, 1
        );
    }

    public static Matrix4x4 rotateY(float angle) {
        float c = (float)Math.cos(angle);
        float s = (float)Math.sin(angle);
        return new Matrix4x4(
                c, 0, s, 0,
                0, 1, 0, 0,
                -s, 0, c, 0,
                0, 0, 0, 1
        );
    }

    public static Matrix4x4 rotateZ(float angle) {
        float c = (float)Math.cos(angle);
        float s = (float)Math.sin(angle);
        return new Matrix4x4(
                c, -s, 0, 0,
                s, c, 0, 0,
                0, 0, 1, 0,
                0, 0, 0, 1
        );
    }

    public static Matrix4x4 translate(float x, float y, float z) {
        return new Matrix4x4(
                1, 0, 0, x,
                0, 1, 0, y,
                0, 0, 1, z,
                0, 0, 0, 1
        );
    }

    public static Matrix4x4 scale(float x, float y, float z) {
        return new Matrix4x4(
                x, 0, 0, 0,
                0, y, 0, 0,
                0, 0, z, 0,
                0, 0, 0, 1
        );
    }
}
