package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Pixel format.
///
/// SDL's pixel formats have the following naming convention:
///
/// - Names with a list of components and a single bit count, such as RGB24 and
///   ABGR32, define a platform-independent encoding into bytes in the order
///   specified. For example, in RGB24 data, each pixel is encoded in 3 bytes
///   (red, green, blue) in that order, and in ABGR32 data, each pixel is
///   encoded in 4 bytes alpha, blue, green, red) in that order. Use these
///   names if the property of a format that is important to you is the order
///   of the bytes in memory or on disk.
/// - Names with a bit count per component, such as ARGB8888 and XRGB1555, are
///   "packed" into an appropriately-sized integer in the platform's native
///   endianness. For example, ARGB8888 is a sequence of 32-bit integers; in
///   each integer, the most significant bits are alpha, and the least
///   significant bits are blue. On a little-endian CPU such as x86, the least
///   significant bits of each integer are arranged first in memory, but on a
///   big-endian CPU such as s390x, the most significant bits are arranged
///   first. Use these names if the property of a format that is important to
///   you is the meaning of each bit position within a native-endianness
///   integer.
/// - In indexed formats such as INDEX4LSB, each pixel is represented by
///   encoding an index into the palette into the indicated number of bits,
///   with multiple pixels packed into each byte if appropriate. In LSB
///   formats, the first (leftmost) pixel is stored in the least-significant
///   bits of the byte; in MSB formats, it's stored in the most-significant
///   bits. INDEX8 does not need LSB/MSB variants, because each pixel exactly
///   fills one byte.
///
/// The 32-bit byte-array encodings such as RGBA32 are aliases for the
/// appropriate 8888 encoding for the current platform. For example, RGBA32 is
/// an alias for ABGR8888 on little-endian CPUs like x86, or an alias for
/// RGBA8888 on big-endian CPUs.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_PixelFormat {
    public static final int SDL_PIXELFORMAT_UNKNOWN = 0x0;
    public static final int SDL_PIXELFORMAT_INDEX1LSB = 0x11100100;
    public static final int SDL_PIXELFORMAT_INDEX1MSB = 0x11200100;
    public static final int SDL_PIXELFORMAT_INDEX2LSB = 0x1c100200;
    public static final int SDL_PIXELFORMAT_INDEX2MSB = 0x1c200200;
    public static final int SDL_PIXELFORMAT_INDEX4LSB = 0x12100400;
    public static final int SDL_PIXELFORMAT_INDEX4MSB = 0x12200400;
    public static final int SDL_PIXELFORMAT_INDEX8 = 0x13000801;
    public static final int SDL_PIXELFORMAT_RGB332 = 0x14110801;
    public static final int SDL_PIXELFORMAT_XRGB4444 = 0x15120c02;
    public static final int SDL_PIXELFORMAT_XBGR4444 = 0x15520c02;
    public static final int SDL_PIXELFORMAT_XRGB1555 = 0x15130f02;
    public static final int SDL_PIXELFORMAT_XBGR1555 = 0x15530f02;
    public static final int SDL_PIXELFORMAT_ARGB4444 = 0x15321002;
    public static final int SDL_PIXELFORMAT_RGBA4444 = 0x15421002;
    public static final int SDL_PIXELFORMAT_ABGR4444 = 0x15721002;
    public static final int SDL_PIXELFORMAT_BGRA4444 = 0x15821002;
    public static final int SDL_PIXELFORMAT_ARGB1555 = 0x15331002;
    public static final int SDL_PIXELFORMAT_RGBA5551 = 0x15441002;
    public static final int SDL_PIXELFORMAT_ABGR1555 = 0x15731002;
    public static final int SDL_PIXELFORMAT_BGRA5551 = 0x15841002;
    public static final int SDL_PIXELFORMAT_RGB565 = 0x15151002;
    public static final int SDL_PIXELFORMAT_BGR565 = 0x15551002;
    public static final int SDL_PIXELFORMAT_RGB24 = 0x17101803;
    public static final int SDL_PIXELFORMAT_BGR24 = 0x17401803;
    public static final int SDL_PIXELFORMAT_XRGB8888 = 0x16161804;
    public static final int SDL_PIXELFORMAT_RGBX8888 = 0x16261804;
    public static final int SDL_PIXELFORMAT_XBGR8888 = 0x16561804;
    public static final int SDL_PIXELFORMAT_BGRX8888 = 0x16661804;
    public static final int SDL_PIXELFORMAT_ARGB8888 = 0x16362004;
    public static final int SDL_PIXELFORMAT_RGBA8888 = 0x16462004;
    public static final int SDL_PIXELFORMAT_ABGR8888 = 0x16762004;
    public static final int SDL_PIXELFORMAT_BGRA8888 = 0x16862004;
    public static final int SDL_PIXELFORMAT_XRGB2101010 = 0x16172004;
    public static final int SDL_PIXELFORMAT_XBGR2101010 = 0x16572004;
    public static final int SDL_PIXELFORMAT_ARGB2101010 = 0x16372004;
    public static final int SDL_PIXELFORMAT_ABGR2101010 = 0x16772004;
    public static final int SDL_PIXELFORMAT_RGB48 = 0x18103006;
    public static final int SDL_PIXELFORMAT_BGR48 = 0x18403006;
    public static final int SDL_PIXELFORMAT_RGBA64 = 0x18204008;
    public static final int SDL_PIXELFORMAT_ARGB64 = 0x18304008;
    public static final int SDL_PIXELFORMAT_BGRA64 = 0x18504008;
    public static final int SDL_PIXELFORMAT_ABGR64 = 0x18604008;
    public static final int SDL_PIXELFORMAT_RGB48_FLOAT = 0x1a103006;
    public static final int SDL_PIXELFORMAT_BGR48_FLOAT = 0x1a403006;
    public static final int SDL_PIXELFORMAT_RGBA64_FLOAT = 0x1a204008;
    public static final int SDL_PIXELFORMAT_ARGB64_FLOAT = 0x1a304008;
    public static final int SDL_PIXELFORMAT_BGRA64_FLOAT = 0x1a504008;
    public static final int SDL_PIXELFORMAT_ABGR64_FLOAT = 0x1a604008;
    public static final int SDL_PIXELFORMAT_RGB96_FLOAT = 0x1b10600c;
    public static final int SDL_PIXELFORMAT_BGR96_FLOAT = 0x1b40600c;
    public static final int SDL_PIXELFORMAT_RGBA128_FLOAT = 0x1b208010;
    public static final int SDL_PIXELFORMAT_ARGB128_FLOAT = 0x1b308010;
    public static final int SDL_PIXELFORMAT_BGRA128_FLOAT = 0x1b508010;
    public static final int SDL_PIXELFORMAT_ABGR128_FLOAT = 0x1b608010;
    public static final int SDL_PIXELFORMAT_YV12 = 0x32315659;
    public static final int SDL_PIXELFORMAT_IYUV = 0x56555949;
    public static final int SDL_PIXELFORMAT_YUY2 = 0x32595559;
    public static final int SDL_PIXELFORMAT_UYVY = 0x59565955;
    public static final int SDL_PIXELFORMAT_YVYU = 0x55595659;
    public static final int SDL_PIXELFORMAT_NV12 = 0x3231564e;
    public static final int SDL_PIXELFORMAT_NV21 = 0x3132564e;
    public static final int SDL_PIXELFORMAT_P010 = 0x30313050;
    public static final int SDL_PIXELFORMAT_EXTERNAL_OES = 0x2053454f;
    public static final int SDL_PIXELFORMAT_MJPG = 0x47504a4d;

    public static String explain(@EnumType(SDL_PixelFormat.class) int value) {
        return switch (value) {
            case SDL_PixelFormat.SDL_PIXELFORMAT_ABGR128_FLOAT -> "SDL_PIXELFORMAT_ABGR128_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ABGR1555 -> "SDL_PIXELFORMAT_ABGR1555";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ABGR2101010 -> "SDL_PIXELFORMAT_ABGR2101010";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ABGR4444 -> "SDL_PIXELFORMAT_ABGR4444";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ABGR64 -> "SDL_PIXELFORMAT_ABGR64";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ABGR64_FLOAT -> "SDL_PIXELFORMAT_ABGR64_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ABGR8888 -> "SDL_PIXELFORMAT_ABGR8888";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ARGB128_FLOAT -> "SDL_PIXELFORMAT_ARGB128_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ARGB1555 -> "SDL_PIXELFORMAT_ARGB1555";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ARGB2101010 -> "SDL_PIXELFORMAT_ARGB2101010";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ARGB4444 -> "SDL_PIXELFORMAT_ARGB4444";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ARGB64 -> "SDL_PIXELFORMAT_ARGB64";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ARGB64_FLOAT -> "SDL_PIXELFORMAT_ARGB64_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_ARGB8888 -> "SDL_PIXELFORMAT_ARGB8888";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGR24 -> "SDL_PIXELFORMAT_BGR24";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGR48 -> "SDL_PIXELFORMAT_BGR48";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGR48_FLOAT -> "SDL_PIXELFORMAT_BGR48_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGR565 -> "SDL_PIXELFORMAT_BGR565";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGR96_FLOAT -> "SDL_PIXELFORMAT_BGR96_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGRA128_FLOAT -> "SDL_PIXELFORMAT_BGRA128_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGRA4444 -> "SDL_PIXELFORMAT_BGRA4444";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGRA5551 -> "SDL_PIXELFORMAT_BGRA5551";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGRA64 -> "SDL_PIXELFORMAT_BGRA64";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGRA64_FLOAT -> "SDL_PIXELFORMAT_BGRA64_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGRA8888 -> "SDL_PIXELFORMAT_BGRA8888";
            case SDL_PixelFormat.SDL_PIXELFORMAT_BGRX8888 -> "SDL_PIXELFORMAT_BGRX8888";
            case SDL_PixelFormat.SDL_PIXELFORMAT_EXTERNAL_OES -> "SDL_PIXELFORMAT_EXTERNAL_OES";
            case SDL_PixelFormat.SDL_PIXELFORMAT_INDEX1LSB -> "SDL_PIXELFORMAT_INDEX1LSB";
            case SDL_PixelFormat.SDL_PIXELFORMAT_INDEX1MSB -> "SDL_PIXELFORMAT_INDEX1MSB";
            case SDL_PixelFormat.SDL_PIXELFORMAT_INDEX2LSB -> "SDL_PIXELFORMAT_INDEX2LSB";
            case SDL_PixelFormat.SDL_PIXELFORMAT_INDEX2MSB -> "SDL_PIXELFORMAT_INDEX2MSB";
            case SDL_PixelFormat.SDL_PIXELFORMAT_INDEX4LSB -> "SDL_PIXELFORMAT_INDEX4LSB";
            case SDL_PixelFormat.SDL_PIXELFORMAT_INDEX4MSB -> "SDL_PIXELFORMAT_INDEX4MSB";
            case SDL_PixelFormat.SDL_PIXELFORMAT_INDEX8 -> "SDL_PIXELFORMAT_INDEX8";
            case SDL_PixelFormat.SDL_PIXELFORMAT_IYUV -> "SDL_PIXELFORMAT_IYUV";
            case SDL_PixelFormat.SDL_PIXELFORMAT_MJPG -> "SDL_PIXELFORMAT_MJPG";
            case SDL_PixelFormat.SDL_PIXELFORMAT_NV12 -> "SDL_PIXELFORMAT_NV12";
            case SDL_PixelFormat.SDL_PIXELFORMAT_NV21 -> "SDL_PIXELFORMAT_NV21";
            case SDL_PixelFormat.SDL_PIXELFORMAT_P010 -> "SDL_PIXELFORMAT_P010";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGB24 -> "SDL_PIXELFORMAT_RGB24";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGB332 -> "SDL_PIXELFORMAT_RGB332";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGB48 -> "SDL_PIXELFORMAT_RGB48";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGB48_FLOAT -> "SDL_PIXELFORMAT_RGB48_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGB565 -> "SDL_PIXELFORMAT_RGB565";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGB96_FLOAT -> "SDL_PIXELFORMAT_RGB96_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGBA128_FLOAT -> "SDL_PIXELFORMAT_RGBA128_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGBA4444 -> "SDL_PIXELFORMAT_RGBA4444";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGBA5551 -> "SDL_PIXELFORMAT_RGBA5551";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGBA64 -> "SDL_PIXELFORMAT_RGBA64";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGBA64_FLOAT -> "SDL_PIXELFORMAT_RGBA64_FLOAT";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGBA8888 -> "SDL_PIXELFORMAT_RGBA8888";
            case SDL_PixelFormat.SDL_PIXELFORMAT_RGBX8888 -> "SDL_PIXELFORMAT_RGBX8888";
            case SDL_PixelFormat.SDL_PIXELFORMAT_UNKNOWN -> "SDL_PIXELFORMAT_UNKNOWN";
            case SDL_PixelFormat.SDL_PIXELFORMAT_UYVY -> "SDL_PIXELFORMAT_UYVY";
            case SDL_PixelFormat.SDL_PIXELFORMAT_XBGR1555 -> "SDL_PIXELFORMAT_XBGR1555";
            case SDL_PixelFormat.SDL_PIXELFORMAT_XBGR2101010 -> "SDL_PIXELFORMAT_XBGR2101010";
            case SDL_PixelFormat.SDL_PIXELFORMAT_XBGR4444 -> "SDL_PIXELFORMAT_XBGR4444";
            case SDL_PixelFormat.SDL_PIXELFORMAT_XBGR8888 -> "SDL_PIXELFORMAT_XBGR8888";
            case SDL_PixelFormat.SDL_PIXELFORMAT_XRGB1555 -> "SDL_PIXELFORMAT_XRGB1555";
            case SDL_PixelFormat.SDL_PIXELFORMAT_XRGB2101010 -> "SDL_PIXELFORMAT_XRGB2101010";
            case SDL_PixelFormat.SDL_PIXELFORMAT_XRGB4444 -> "SDL_PIXELFORMAT_XRGB4444";
            case SDL_PixelFormat.SDL_PIXELFORMAT_XRGB8888 -> "SDL_PIXELFORMAT_XRGB8888";
            case SDL_PixelFormat.SDL_PIXELFORMAT_YUY2 -> "SDL_PIXELFORMAT_YUY2";
            case SDL_PixelFormat.SDL_PIXELFORMAT_YV12 -> "SDL_PIXELFORMAT_YV12";
            case SDL_PixelFormat.SDL_PIXELFORMAT_YVYU -> "SDL_PIXELFORMAT_YVYU";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_PixelFormat() {}
}
