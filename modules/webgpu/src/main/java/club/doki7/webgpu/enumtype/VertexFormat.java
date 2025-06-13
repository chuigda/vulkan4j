package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class VertexFormat {
    public static final int VERTEX_FORMAT_UINT8 = 0x1;
    public static final int VERTEX_FORMAT_UINT8X2 = 0x2;
    public static final int VERTEX_FORMAT_UINT8X4 = 0x3;
    public static final int VERTEX_FORMAT_SINT8 = 0x4;
    public static final int VERTEX_FORMAT_SINT8X2 = 0x5;
    public static final int VERTEX_FORMAT_SINT8X4 = 0x6;
    public static final int VERTEX_FORMAT_UNORM8 = 0x7;
    public static final int VERTEX_FORMAT_UNORM8X2 = 0x8;
    public static final int VERTEX_FORMAT_UNORM8X4 = 0x9;
    public static final int VERTEX_FORMAT_SNORM8 = 0xa;
    public static final int VERTEX_FORMAT_SNORM8X2 = 0xb;
    public static final int VERTEX_FORMAT_SNORM8X4 = 0xc;
    public static final int VERTEX_FORMAT_UINT16 = 0xd;
    public static final int VERTEX_FORMAT_UINT16X2 = 0xe;
    public static final int VERTEX_FORMAT_UINT16X4 = 0xf;
    public static final int VERTEX_FORMAT_SINT16 = 0x10;
    public static final int VERTEX_FORMAT_SINT16X2 = 0x11;
    public static final int VERTEX_FORMAT_SINT16X4 = 0x12;
    public static final int VERTEX_FORMAT_UNORM16 = 0x13;
    public static final int VERTEX_FORMAT_UNORM16X2 = 0x14;
    public static final int VERTEX_FORMAT_UNORM16X4 = 0x15;
    public static final int VERTEX_FORMAT_SNORM16 = 0x16;
    public static final int VERTEX_FORMAT_SNORM16X2 = 0x17;
    public static final int VERTEX_FORMAT_SNORM16X4 = 0x18;
    public static final int VERTEX_FORMAT_FLOAT16 = 0x19;
    public static final int VERTEX_FORMAT_FLOAT16X2 = 0x1a;
    public static final int VERTEX_FORMAT_FLOAT16X4 = 0x1b;
    public static final int VERTEX_FORMAT_FLOAT32 = 0x1c;
    public static final int VERTEX_FORMAT_FLOAT32X2 = 0x1d;
    public static final int VERTEX_FORMAT_FLOAT32X3 = 0x1e;
    public static final int VERTEX_FORMAT_FLOAT32X4 = 0x1f;
    public static final int VERTEX_FORMAT_UINT32 = 0x20;
    public static final int VERTEX_FORMAT_UINT32X2 = 0x21;
    public static final int VERTEX_FORMAT_UINT32X3 = 0x22;
    public static final int VERTEX_FORMAT_UINT32X4 = 0x23;
    public static final int VERTEX_FORMAT_SINT32 = 0x24;
    public static final int VERTEX_FORMAT_SINT32X2 = 0x25;
    public static final int VERTEX_FORMAT_SINT32X3 = 0x26;
    public static final int VERTEX_FORMAT_SINT32X4 = 0x27;
    public static final int VERTEX_FORMAT_UNORM10__10__10__2 = 0x28;
    public static final int VERTEX_FORMAT_UNORM8X4_B_G_R_A = 0x29;
    public static final int VERTEX_FORMAT_FORCE32 = 0x7fffffff;

    public static String explain(@EnumType(VertexFormat.class) int value) {
        return switch (value) {
            case VertexFormat.VERTEX_FORMAT_FLOAT16 -> "VERTEX_FORMAT_FLOAT16";
            case VertexFormat.VERTEX_FORMAT_FLOAT16X2 -> "VERTEX_FORMAT_FLOAT16X2";
            case VertexFormat.VERTEX_FORMAT_FLOAT16X4 -> "VERTEX_FORMAT_FLOAT16X4";
            case VertexFormat.VERTEX_FORMAT_FLOAT32 -> "VERTEX_FORMAT_FLOAT32";
            case VertexFormat.VERTEX_FORMAT_FLOAT32X2 -> "VERTEX_FORMAT_FLOAT32X2";
            case VertexFormat.VERTEX_FORMAT_FLOAT32X3 -> "VERTEX_FORMAT_FLOAT32X3";
            case VertexFormat.VERTEX_FORMAT_FLOAT32X4 -> "VERTEX_FORMAT_FLOAT32X4";
            case VertexFormat.VERTEX_FORMAT_FORCE32 -> "VERTEX_FORMAT_FORCE32";
            case VertexFormat.VERTEX_FORMAT_SINT16 -> "VERTEX_FORMAT_SINT16";
            case VertexFormat.VERTEX_FORMAT_SINT16X2 -> "VERTEX_FORMAT_SINT16X2";
            case VertexFormat.VERTEX_FORMAT_SINT16X4 -> "VERTEX_FORMAT_SINT16X4";
            case VertexFormat.VERTEX_FORMAT_SINT32 -> "VERTEX_FORMAT_SINT32";
            case VertexFormat.VERTEX_FORMAT_SINT32X2 -> "VERTEX_FORMAT_SINT32X2";
            case VertexFormat.VERTEX_FORMAT_SINT32X3 -> "VERTEX_FORMAT_SINT32X3";
            case VertexFormat.VERTEX_FORMAT_SINT32X4 -> "VERTEX_FORMAT_SINT32X4";
            case VertexFormat.VERTEX_FORMAT_SINT8 -> "VERTEX_FORMAT_SINT8";
            case VertexFormat.VERTEX_FORMAT_SINT8X2 -> "VERTEX_FORMAT_SINT8X2";
            case VertexFormat.VERTEX_FORMAT_SINT8X4 -> "VERTEX_FORMAT_SINT8X4";
            case VertexFormat.VERTEX_FORMAT_SNORM16 -> "VERTEX_FORMAT_SNORM16";
            case VertexFormat.VERTEX_FORMAT_SNORM16X2 -> "VERTEX_FORMAT_SNORM16X2";
            case VertexFormat.VERTEX_FORMAT_SNORM16X4 -> "VERTEX_FORMAT_SNORM16X4";
            case VertexFormat.VERTEX_FORMAT_SNORM8 -> "VERTEX_FORMAT_SNORM8";
            case VertexFormat.VERTEX_FORMAT_SNORM8X2 -> "VERTEX_FORMAT_SNORM8X2";
            case VertexFormat.VERTEX_FORMAT_SNORM8X4 -> "VERTEX_FORMAT_SNORM8X4";
            case VertexFormat.VERTEX_FORMAT_UINT16 -> "VERTEX_FORMAT_UINT16";
            case VertexFormat.VERTEX_FORMAT_UINT16X2 -> "VERTEX_FORMAT_UINT16X2";
            case VertexFormat.VERTEX_FORMAT_UINT16X4 -> "VERTEX_FORMAT_UINT16X4";
            case VertexFormat.VERTEX_FORMAT_UINT32 -> "VERTEX_FORMAT_UINT32";
            case VertexFormat.VERTEX_FORMAT_UINT32X2 -> "VERTEX_FORMAT_UINT32X2";
            case VertexFormat.VERTEX_FORMAT_UINT32X3 -> "VERTEX_FORMAT_UINT32X3";
            case VertexFormat.VERTEX_FORMAT_UINT32X4 -> "VERTEX_FORMAT_UINT32X4";
            case VertexFormat.VERTEX_FORMAT_UINT8 -> "VERTEX_FORMAT_UINT8";
            case VertexFormat.VERTEX_FORMAT_UINT8X2 -> "VERTEX_FORMAT_UINT8X2";
            case VertexFormat.VERTEX_FORMAT_UINT8X4 -> "VERTEX_FORMAT_UINT8X4";
            case VertexFormat.VERTEX_FORMAT_UNORM10__10__10__2 -> "VERTEX_FORMAT_UNORM10__10__10__2";
            case VertexFormat.VERTEX_FORMAT_UNORM16 -> "VERTEX_FORMAT_UNORM16";
            case VertexFormat.VERTEX_FORMAT_UNORM16X2 -> "VERTEX_FORMAT_UNORM16X2";
            case VertexFormat.VERTEX_FORMAT_UNORM16X4 -> "VERTEX_FORMAT_UNORM16X4";
            case VertexFormat.VERTEX_FORMAT_UNORM8 -> "VERTEX_FORMAT_UNORM8";
            case VertexFormat.VERTEX_FORMAT_UNORM8X2 -> "VERTEX_FORMAT_UNORM8X2";
            case VertexFormat.VERTEX_FORMAT_UNORM8X4 -> "VERTEX_FORMAT_UNORM8X4";
            case VertexFormat.VERTEX_FORMAT_UNORM8X4_B_G_R_A -> "VERTEX_FORMAT_UNORM8X4_B_G_R_A";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private VertexFormat() {}
}
