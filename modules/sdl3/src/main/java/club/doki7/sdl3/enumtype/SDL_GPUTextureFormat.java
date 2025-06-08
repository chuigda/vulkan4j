package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Specifies the pixel format of a texture.
///
/// Texture format support varies depending on driver, hardware, and usage
/// flags. In general, you should use SDL_GPUTextureSupportsFormat to query if
/// a format is supported before using it. However, there are a few guaranteed
/// formats.
///
/// FIXME: Check universal support for 32-bit component formats FIXME: Check
/// universal support for SIMULTANEOUS_READ_WRITE
///
/// For SAMPLER usage, the following formats are universally supported:
///
/// - R8G8B8A8_UNORM
/// - B8G8R8A8_UNORM
/// - R8_UNORM
/// - R8_SNORM
/// - R8G8_UNORM
/// - R8G8_SNORM
/// - R8G8B8A8_SNORM
/// - R16_FLOAT
/// - R16G16_FLOAT
/// - R16G16B16A16_FLOAT
/// - R32_FLOAT
/// - R32G32_FLOAT
/// - R32G32B32A32_FLOAT
/// - R11G11B10_UFLOAT
/// - R8G8B8A8_UNORM_SRGB
/// - B8G8R8A8_UNORM_SRGB
/// - D16_UNORM
///
/// For COLOR_TARGET usage, the following formats are universally supported:
///
/// - R8G8B8A8_UNORM
/// - B8G8R8A8_UNORM
/// - R8_UNORM
/// - R16_FLOAT
/// - R16G16_FLOAT
/// - R16G16B16A16_FLOAT
/// - R32_FLOAT
/// - R32G32_FLOAT
/// - R32G32B32A32_FLOAT
/// - R8_UINT
/// - R8G8_UINT
/// - R8G8B8A8_UINT
/// - R16_UINT
/// - R16G16_UINT
/// - R16G16B16A16_UINT
/// - R8_INT
/// - R8G8_INT
/// - R8G8B8A8_INT
/// - R16_INT
/// - R16G16_INT
/// - R16G16B16A16_INT
/// - R8G8B8A8_UNORM_SRGB
/// - B8G8R8A8_UNORM_SRGB
///
/// For STORAGE usages, the following formats are universally supported:
///
/// - R8G8B8A8_UNORM
/// - R8G8B8A8_SNORM
/// - R16G16B16A16_FLOAT
/// - R32_FLOAT
/// - R32G32_FLOAT
/// - R32G32B32A32_FLOAT
/// - R8G8B8A8_UINT
/// - R16G16B16A16_UINT
/// - R8G8B8A8_INT
/// - R16G16B16A16_INT
///
/// For DEPTH_STENCIL_TARGET usage, the following formats are universally
/// supported:
///
/// - D16_UNORM
/// - Either (but not necessarily both!) D24_UNORM or D32_FLOAT
/// - Either (but not necessarily both!) D24_UNORM_S8_UINT or D32_FLOAT_S8_UINT
///
/// Unless D16_UNORM is sufficient for your purposes, always check which of
/// D24/D32 is supported before creating a depth-stencil texture!
///
/// Since: This enum is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_CreateGPUTexture`
/// - `SDL_GPUTextureSupportsFormat`
///
public final class SDL_GPUTextureFormat {
    public static final int INVALID = 0x0;
    public static final int A8_UNORM = 0x1;
    public static final int R8_UNORM = 0x2;
    public static final int R8G8_UNORM = 0x3;
    public static final int R8G8B8A8_UNORM = 0x4;
    public static final int R16_UNORM = 0x5;
    public static final int R16G16_UNORM = 0x6;
    public static final int R16G16B16A16_UNORM = 0x7;
    public static final int R10G10B10A2_UNORM = 0x8;
    public static final int B5G6R5_UNORM = 0x9;
    public static final int B5G5R5A1_UNORM = 0xa;
    public static final int B4G4R4A4_UNORM = 0xb;
    public static final int B8G8R8A8_UNORM = 0xc;
    public static final int BC1_RGBA_UNORM = 0xd;
    public static final int BC2_RGBA_UNORM = 0xe;
    public static final int BC3_RGBA_UNORM = 0xf;
    public static final int BC4_R_UNORM = 0x10;
    public static final int BC5_RG_UNORM = 0x11;
    public static final int BC7_RGBA_UNORM = 0x12;
    public static final int BC6H_RGB_FLOAT = 0x13;
    public static final int BC6H_RGB_UFLOAT = 0x14;
    public static final int R8_SNORM = 0x15;
    public static final int R8G8_SNORM = 0x16;
    public static final int R8G8B8A8_SNORM = 0x17;
    public static final int R16_SNORM = 0x18;
    public static final int R16G16_SNORM = 0x19;
    public static final int R16G16B16A16_SNORM = 0x1a;
    public static final int R16_FLOAT = 0x1b;
    public static final int R16G16_FLOAT = 0x1c;
    public static final int R16G16B16A16_FLOAT = 0x1d;
    public static final int R32_FLOAT = 0x1e;
    public static final int R32G32_FLOAT = 0x1f;
    public static final int R32G32B32A32_FLOAT = 0x20;
    public static final int R11G11B10_UFLOAT = 0x21;
    public static final int R8_UINT = 0x22;
    public static final int R8G8_UINT = 0x23;
    public static final int R8G8B8A8_UINT = 0x24;
    public static final int R16_UINT = 0x25;
    public static final int R16G16_UINT = 0x26;
    public static final int R16G16B16A16_UINT = 0x27;
    public static final int R32_UINT = 0x28;
    public static final int R32G32_UINT = 0x29;
    public static final int R32G32B32A32_UINT = 0x2a;
    public static final int R8_INT = 0x2b;
    public static final int R8G8_INT = 0x2c;
    public static final int R8G8B8A8_INT = 0x2d;
    public static final int R16_INT = 0x2e;
    public static final int R16G16_INT = 0x2f;
    public static final int R16G16B16A16_INT = 0x30;
    public static final int R32_INT = 0x31;
    public static final int R32G32_INT = 0x32;
    public static final int R32G32B32A32_INT = 0x33;
    public static final int R8G8B8A8_UNORM_SRGB = 0x34;
    public static final int B8G8R8A8_UNORM_SRGB = 0x35;
    public static final int BC1_RGBA_UNORM_SRGB = 0x36;
    public static final int BC2_RGBA_UNORM_SRGB = 0x37;
    public static final int BC3_RGBA_UNORM_SRGB = 0x38;
    public static final int BC7_RGBA_UNORM_SRGB = 0x39;
    public static final int D16_UNORM = 0x3a;
    public static final int D24_UNORM = 0x3b;
    public static final int D32_FLOAT = 0x3c;
    public static final int D24_UNORM_S8_UINT = 0x3d;
    public static final int D32_FLOAT_S8_UINT = 0x3e;
    public static final int ASTC_4x4_UNORM = 0x3f;
    public static final int ASTC_5x4_UNORM = 0x40;
    public static final int ASTC_5x5_UNORM = 0x41;
    public static final int ASTC_6x5_UNORM = 0x42;
    public static final int ASTC_6x6_UNORM = 0x43;
    public static final int ASTC_8x5_UNORM = 0x44;
    public static final int ASTC_8x6_UNORM = 0x45;
    public static final int ASTC_8x8_UNORM = 0x46;
    public static final int ASTC_10x5_UNORM = 0x47;
    public static final int ASTC_10x6_UNORM = 0x48;
    public static final int ASTC_10x8_UNORM = 0x49;
    public static final int ASTC_10x10_UNORM = 0x4a;
    public static final int ASTC_12x10_UNORM = 0x4b;
    public static final int ASTC_12x12_UNORM = 0x4c;
    public static final int ASTC_4x4_UNORM_SRGB = 0x4d;
    public static final int ASTC_5x4_UNORM_SRGB = 0x4e;
    public static final int ASTC_5x5_UNORM_SRGB = 0x4f;
    public static final int ASTC_6x5_UNORM_SRGB = 0x50;
    public static final int ASTC_6x6_UNORM_SRGB = 0x51;
    public static final int ASTC_8x5_UNORM_SRGB = 0x52;
    public static final int ASTC_8x6_UNORM_SRGB = 0x53;
    public static final int ASTC_8x8_UNORM_SRGB = 0x54;
    public static final int ASTC_10x5_UNORM_SRGB = 0x55;
    public static final int ASTC_10x6_UNORM_SRGB = 0x56;
    public static final int ASTC_10x8_UNORM_SRGB = 0x57;
    public static final int ASTC_10x10_UNORM_SRGB = 0x58;
    public static final int ASTC_12x10_UNORM_SRGB = 0x59;
    public static final int ASTC_12x12_UNORM_SRGB = 0x5a;
    public static final int ASTC_4x4_FLOAT = 0x5b;
    public static final int ASTC_5x4_FLOAT = 0x5c;
    public static final int ASTC_5x5_FLOAT = 0x5d;
    public static final int ASTC_6x5_FLOAT = 0x5e;
    public static final int ASTC_6x6_FLOAT = 0x5f;
    public static final int ASTC_8x5_FLOAT = 0x60;
    public static final int ASTC_8x6_FLOAT = 0x61;
    public static final int ASTC_8x8_FLOAT = 0x62;
    public static final int ASTC_10x5_FLOAT = 0x63;
    public static final int ASTC_10x6_FLOAT = 0x64;
    public static final int ASTC_10x8_FLOAT = 0x65;
    public static final int ASTC_10x10_FLOAT = 0x66;
    public static final int ASTC_12x10_FLOAT = 0x67;
    public static final int ASTC_12x12_FLOAT = 0x68;

    public static String explain(@EnumType(SDL_GPUTextureFormat.class) int value) {
        return switch (value) {
            case SDL_GPUTextureFormat.A8_UNORM -> "SDL_GPU_TEXTUREFORMAT_A8_UNORM";
            case SDL_GPUTextureFormat.ASTC_10x10_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x10_FLOAT";
            case SDL_GPUTextureFormat.ASTC_10x10_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM";
            case SDL_GPUTextureFormat.ASTC_10x10_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x10_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_10x5_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x5_FLOAT";
            case SDL_GPUTextureFormat.ASTC_10x5_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM";
            case SDL_GPUTextureFormat.ASTC_10x5_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x5_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_10x6_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x6_FLOAT";
            case SDL_GPUTextureFormat.ASTC_10x6_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM";
            case SDL_GPUTextureFormat.ASTC_10x6_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x6_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_10x8_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x8_FLOAT";
            case SDL_GPUTextureFormat.ASTC_10x8_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM";
            case SDL_GPUTextureFormat.ASTC_10x8_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_10x8_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_12x10_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_12x10_FLOAT";
            case SDL_GPUTextureFormat.ASTC_12x10_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM";
            case SDL_GPUTextureFormat.ASTC_12x10_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_12x10_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_12x12_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_12x12_FLOAT";
            case SDL_GPUTextureFormat.ASTC_12x12_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM";
            case SDL_GPUTextureFormat.ASTC_12x12_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_12x12_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_4x4_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_4x4_FLOAT";
            case SDL_GPUTextureFormat.ASTC_4x4_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM";
            case SDL_GPUTextureFormat.ASTC_4x4_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_4x4_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_5x4_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_5x4_FLOAT";
            case SDL_GPUTextureFormat.ASTC_5x4_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM";
            case SDL_GPUTextureFormat.ASTC_5x4_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_5x4_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_5x5_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_5x5_FLOAT";
            case SDL_GPUTextureFormat.ASTC_5x5_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM";
            case SDL_GPUTextureFormat.ASTC_5x5_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_5x5_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_6x5_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_6x5_FLOAT";
            case SDL_GPUTextureFormat.ASTC_6x5_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM";
            case SDL_GPUTextureFormat.ASTC_6x5_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_6x5_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_6x6_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_6x6_FLOAT";
            case SDL_GPUTextureFormat.ASTC_6x6_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM";
            case SDL_GPUTextureFormat.ASTC_6x6_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_6x6_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_8x5_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_8x5_FLOAT";
            case SDL_GPUTextureFormat.ASTC_8x5_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM";
            case SDL_GPUTextureFormat.ASTC_8x5_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_8x5_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_8x6_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_8x6_FLOAT";
            case SDL_GPUTextureFormat.ASTC_8x6_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM";
            case SDL_GPUTextureFormat.ASTC_8x6_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_8x6_UNORM_SRGB";
            case SDL_GPUTextureFormat.ASTC_8x8_FLOAT -> "SDL_GPU_TEXTUREFORMAT_ASTC_8x8_FLOAT";
            case SDL_GPUTextureFormat.ASTC_8x8_UNORM -> "SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM";
            case SDL_GPUTextureFormat.ASTC_8x8_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_ASTC_8x8_UNORM_SRGB";
            case SDL_GPUTextureFormat.B4G4R4A4_UNORM -> "SDL_GPU_TEXTUREFORMAT_B4G4R4A4_UNORM";
            case SDL_GPUTextureFormat.B5G5R5A1_UNORM -> "SDL_GPU_TEXTUREFORMAT_B5G5R5A1_UNORM";
            case SDL_GPUTextureFormat.B5G6R5_UNORM -> "SDL_GPU_TEXTUREFORMAT_B5G6R5_UNORM";
            case SDL_GPUTextureFormat.B8G8R8A8_UNORM -> "SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM";
            case SDL_GPUTextureFormat.B8G8R8A8_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_B8G8R8A8_UNORM_SRGB";
            case SDL_GPUTextureFormat.BC1_RGBA_UNORM -> "SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM";
            case SDL_GPUTextureFormat.BC1_RGBA_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_BC1_RGBA_UNORM_SRGB";
            case SDL_GPUTextureFormat.BC2_RGBA_UNORM -> "SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM";
            case SDL_GPUTextureFormat.BC2_RGBA_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_BC2_RGBA_UNORM_SRGB";
            case SDL_GPUTextureFormat.BC3_RGBA_UNORM -> "SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM";
            case SDL_GPUTextureFormat.BC3_RGBA_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_BC3_RGBA_UNORM_SRGB";
            case SDL_GPUTextureFormat.BC4_R_UNORM -> "SDL_GPU_TEXTUREFORMAT_BC4_R_UNORM";
            case SDL_GPUTextureFormat.BC5_RG_UNORM -> "SDL_GPU_TEXTUREFORMAT_BC5_RG_UNORM";
            case SDL_GPUTextureFormat.BC6H_RGB_FLOAT -> "SDL_GPU_TEXTUREFORMAT_BC6H_RGB_FLOAT";
            case SDL_GPUTextureFormat.BC6H_RGB_UFLOAT -> "SDL_GPU_TEXTUREFORMAT_BC6H_RGB_UFLOAT";
            case SDL_GPUTextureFormat.BC7_RGBA_UNORM -> "SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM";
            case SDL_GPUTextureFormat.BC7_RGBA_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_BC7_RGBA_UNORM_SRGB";
            case SDL_GPUTextureFormat.D16_UNORM -> "SDL_GPU_TEXTUREFORMAT_D16_UNORM";
            case SDL_GPUTextureFormat.D24_UNORM -> "SDL_GPU_TEXTUREFORMAT_D24_UNORM";
            case SDL_GPUTextureFormat.D24_UNORM_S8_UINT -> "SDL_GPU_TEXTUREFORMAT_D24_UNORM_S8_UINT";
            case SDL_GPUTextureFormat.D32_FLOAT -> "SDL_GPU_TEXTUREFORMAT_D32_FLOAT";
            case SDL_GPUTextureFormat.D32_FLOAT_S8_UINT -> "SDL_GPU_TEXTUREFORMAT_D32_FLOAT_S8_UINT";
            case SDL_GPUTextureFormat.INVALID -> "SDL_GPU_TEXTUREFORMAT_INVALID";
            case SDL_GPUTextureFormat.R10G10B10A2_UNORM -> "SDL_GPU_TEXTUREFORMAT_R10G10B10A2_UNORM";
            case SDL_GPUTextureFormat.R11G11B10_UFLOAT -> "SDL_GPU_TEXTUREFORMAT_R11G11B10_UFLOAT";
            case SDL_GPUTextureFormat.R16G16B16A16_FLOAT -> "SDL_GPU_TEXTUREFORMAT_R16G16B16A16_FLOAT";
            case SDL_GPUTextureFormat.R16G16B16A16_INT -> "SDL_GPU_TEXTUREFORMAT_R16G16B16A16_INT";
            case SDL_GPUTextureFormat.R16G16B16A16_SNORM -> "SDL_GPU_TEXTUREFORMAT_R16G16B16A16_SNORM";
            case SDL_GPUTextureFormat.R16G16B16A16_UINT -> "SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UINT";
            case SDL_GPUTextureFormat.R16G16B16A16_UNORM -> "SDL_GPU_TEXTUREFORMAT_R16G16B16A16_UNORM";
            case SDL_GPUTextureFormat.R16G16_FLOAT -> "SDL_GPU_TEXTUREFORMAT_R16G16_FLOAT";
            case SDL_GPUTextureFormat.R16G16_INT -> "SDL_GPU_TEXTUREFORMAT_R16G16_INT";
            case SDL_GPUTextureFormat.R16G16_SNORM -> "SDL_GPU_TEXTUREFORMAT_R16G16_SNORM";
            case SDL_GPUTextureFormat.R16G16_UINT -> "SDL_GPU_TEXTUREFORMAT_R16G16_UINT";
            case SDL_GPUTextureFormat.R16G16_UNORM -> "SDL_GPU_TEXTUREFORMAT_R16G16_UNORM";
            case SDL_GPUTextureFormat.R16_FLOAT -> "SDL_GPU_TEXTUREFORMAT_R16_FLOAT";
            case SDL_GPUTextureFormat.R16_INT -> "SDL_GPU_TEXTUREFORMAT_R16_INT";
            case SDL_GPUTextureFormat.R16_SNORM -> "SDL_GPU_TEXTUREFORMAT_R16_SNORM";
            case SDL_GPUTextureFormat.R16_UINT -> "SDL_GPU_TEXTUREFORMAT_R16_UINT";
            case SDL_GPUTextureFormat.R16_UNORM -> "SDL_GPU_TEXTUREFORMAT_R16_UNORM";
            case SDL_GPUTextureFormat.R32G32B32A32_FLOAT -> "SDL_GPU_TEXTUREFORMAT_R32G32B32A32_FLOAT";
            case SDL_GPUTextureFormat.R32G32B32A32_INT -> "SDL_GPU_TEXTUREFORMAT_R32G32B32A32_INT";
            case SDL_GPUTextureFormat.R32G32B32A32_UINT -> "SDL_GPU_TEXTUREFORMAT_R32G32B32A32_UINT";
            case SDL_GPUTextureFormat.R32G32_FLOAT -> "SDL_GPU_TEXTUREFORMAT_R32G32_FLOAT";
            case SDL_GPUTextureFormat.R32G32_INT -> "SDL_GPU_TEXTUREFORMAT_R32G32_INT";
            case SDL_GPUTextureFormat.R32G32_UINT -> "SDL_GPU_TEXTUREFORMAT_R32G32_UINT";
            case SDL_GPUTextureFormat.R32_FLOAT -> "SDL_GPU_TEXTUREFORMAT_R32_FLOAT";
            case SDL_GPUTextureFormat.R32_INT -> "SDL_GPU_TEXTUREFORMAT_R32_INT";
            case SDL_GPUTextureFormat.R32_UINT -> "SDL_GPU_TEXTUREFORMAT_R32_UINT";
            case SDL_GPUTextureFormat.R8G8B8A8_INT -> "SDL_GPU_TEXTUREFORMAT_R8G8B8A8_INT";
            case SDL_GPUTextureFormat.R8G8B8A8_SNORM -> "SDL_GPU_TEXTUREFORMAT_R8G8B8A8_SNORM";
            case SDL_GPUTextureFormat.R8G8B8A8_UINT -> "SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UINT";
            case SDL_GPUTextureFormat.R8G8B8A8_UNORM -> "SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM";
            case SDL_GPUTextureFormat.R8G8B8A8_UNORM_SRGB -> "SDL_GPU_TEXTUREFORMAT_R8G8B8A8_UNORM_SRGB";
            case SDL_GPUTextureFormat.R8G8_INT -> "SDL_GPU_TEXTUREFORMAT_R8G8_INT";
            case SDL_GPUTextureFormat.R8G8_SNORM -> "SDL_GPU_TEXTUREFORMAT_R8G8_SNORM";
            case SDL_GPUTextureFormat.R8G8_UINT -> "SDL_GPU_TEXTUREFORMAT_R8G8_UINT";
            case SDL_GPUTextureFormat.R8G8_UNORM -> "SDL_GPU_TEXTUREFORMAT_R8G8_UNORM";
            case SDL_GPUTextureFormat.R8_INT -> "SDL_GPU_TEXTUREFORMAT_R8_INT";
            case SDL_GPUTextureFormat.R8_SNORM -> "SDL_GPU_TEXTUREFORMAT_R8_SNORM";
            case SDL_GPUTextureFormat.R8_UINT -> "SDL_GPU_TEXTUREFORMAT_R8_UINT";
            case SDL_GPUTextureFormat.R8_UNORM -> "SDL_GPU_TEXTUREFORMAT_R8_UNORM";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_GPUTextureFormat() {}
}
