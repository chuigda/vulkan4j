package club.doki7.webgpu.enumtype;

import club.doki7.ffm.annotation.*;

public final class WGPUVertexFormat {
    public static final int UINT8 = 0x1;
    public static final int UINT8X2 = 0x2;
    public static final int UINT8X4 = 0x3;
    public static final int SINT8 = 0x4;
    public static final int SINT8X2 = 0x5;
    public static final int SINT8X4 = 0x6;
    public static final int UNORM8 = 0x7;
    public static final int UNORM8X2 = 0x8;
    public static final int UNORM8X4 = 0x9;
    public static final int SNORM8 = 0xa;
    public static final int SNORM8X2 = 0xb;
    public static final int SNORM8X4 = 0xc;
    public static final int UINT16 = 0xd;
    public static final int UINT16X2 = 0xe;
    public static final int UINT16X4 = 0xf;
    public static final int SINT16 = 0x10;
    public static final int SINT16X2 = 0x11;
    public static final int SINT16X4 = 0x12;
    public static final int UNORM16 = 0x13;
    public static final int UNORM16X2 = 0x14;
    public static final int UNORM16X4 = 0x15;
    public static final int SNORM16 = 0x16;
    public static final int SNORM16X2 = 0x17;
    public static final int SNORM16X4 = 0x18;
    public static final int FLOAT16 = 0x19;
    public static final int FLOAT16X2 = 0x1a;
    public static final int FLOAT16X4 = 0x1b;
    public static final int FLOAT32 = 0x1c;
    public static final int FLOAT32X2 = 0x1d;
    public static final int FLOAT32X3 = 0x1e;
    public static final int FLOAT32X4 = 0x1f;
    public static final int UINT32 = 0x20;
    public static final int UINT32X2 = 0x21;
    public static final int UINT32X3 = 0x22;
    public static final int UINT32X4 = 0x23;
    public static final int SINT32 = 0x24;
    public static final int SINT32X2 = 0x25;
    public static final int SINT32X3 = 0x26;
    public static final int SINT32X4 = 0x27;
    public static final int UNORM10__10__10__2 = 0x28;
    public static final int UNORM8X4_B_G_R_A = 0x29;

    public static String explain(@EnumType(WGPUVertexFormat.class) int value) {
        return switch (value) {
            case WGPUVertexFormat.FLOAT16 -> "FLOAT16";
            case WGPUVertexFormat.FLOAT16X2 -> "FLOAT16X2";
            case WGPUVertexFormat.FLOAT16X4 -> "FLOAT16X4";
            case WGPUVertexFormat.FLOAT32 -> "FLOAT32";
            case WGPUVertexFormat.FLOAT32X2 -> "FLOAT32X2";
            case WGPUVertexFormat.FLOAT32X3 -> "FLOAT32X3";
            case WGPUVertexFormat.FLOAT32X4 -> "FLOAT32X4";
            case WGPUVertexFormat.SINT16 -> "SINT16";
            case WGPUVertexFormat.SINT16X2 -> "SINT16X2";
            case WGPUVertexFormat.SINT16X4 -> "SINT16X4";
            case WGPUVertexFormat.SINT32 -> "SINT32";
            case WGPUVertexFormat.SINT32X2 -> "SINT32X2";
            case WGPUVertexFormat.SINT32X3 -> "SINT32X3";
            case WGPUVertexFormat.SINT32X4 -> "SINT32X4";
            case WGPUVertexFormat.SINT8 -> "SINT8";
            case WGPUVertexFormat.SINT8X2 -> "SINT8X2";
            case WGPUVertexFormat.SINT8X4 -> "SINT8X4";
            case WGPUVertexFormat.SNORM16 -> "SNORM16";
            case WGPUVertexFormat.SNORM16X2 -> "SNORM16X2";
            case WGPUVertexFormat.SNORM16X4 -> "SNORM16X4";
            case WGPUVertexFormat.SNORM8 -> "SNORM8";
            case WGPUVertexFormat.SNORM8X2 -> "SNORM8X2";
            case WGPUVertexFormat.SNORM8X4 -> "SNORM8X4";
            case WGPUVertexFormat.UINT16 -> "UINT16";
            case WGPUVertexFormat.UINT16X2 -> "UINT16X2";
            case WGPUVertexFormat.UINT16X4 -> "UINT16X4";
            case WGPUVertexFormat.UINT32 -> "UINT32";
            case WGPUVertexFormat.UINT32X2 -> "UINT32X2";
            case WGPUVertexFormat.UINT32X3 -> "UINT32X3";
            case WGPUVertexFormat.UINT32X4 -> "UINT32X4";
            case WGPUVertexFormat.UINT8 -> "UINT8";
            case WGPUVertexFormat.UINT8X2 -> "UINT8X2";
            case WGPUVertexFormat.UINT8X4 -> "UINT8X4";
            case WGPUVertexFormat.UNORM10__10__10__2 -> "UNORM10__10__10__2";
            case WGPUVertexFormat.UNORM16 -> "UNORM16";
            case WGPUVertexFormat.UNORM16X2 -> "UNORM16X2";
            case WGPUVertexFormat.UNORM16X4 -> "UNORM16X4";
            case WGPUVertexFormat.UNORM8 -> "UNORM8";
            case WGPUVertexFormat.UNORM8X2 -> "UNORM8X2";
            case WGPUVertexFormat.UNORM8X4 -> "UNORM8X4";
            case WGPUVertexFormat.UNORM8X4_B_G_R_A -> "UNORM8X4_B_G_R_A";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private WGPUVertexFormat() {}
}
