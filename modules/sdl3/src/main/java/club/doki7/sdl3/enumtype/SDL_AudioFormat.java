package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Audio format.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_AUDIO_BITSIZE
/// \sa SDL_AUDIO_BYTESIZE
/// \sa SDL_AUDIO_ISINT
/// \sa SDL_AUDIO_ISFLOAT
/// \sa SDL_AUDIO_ISBIGENDIAN
/// \sa SDL_AUDIO_ISLITTLEENDIAN
/// \sa SDL_AUDIO_ISSIGNED
/// \sa SDL_AUDIO_ISUNSIGNED
///
public final class SDL_AudioFormat {
    public static final int UNKNOWN = 0x0;
    public static final int U8 = 0x8;
    public static final int S8 = 0x8008;
    public static final int S16LE = 0x8010;
    public static final int S16BE = 0x9010;
    public static final int S32LE = 0x8020;
    public static final int S32BE = 0x9020;
    public static final int F32LE = 0x8120;
    public static final int F32BE = 0x9120;

    public static String explain(@EnumType(SDL_AudioFormat.class) int value) {
        return switch (value) {
            case SDL_AudioFormat.F32BE -> "SDL_AUDIO_F32BE";
            case SDL_AudioFormat.F32LE -> "SDL_AUDIO_F32LE";
            case SDL_AudioFormat.S16BE -> "SDL_AUDIO_S16BE";
            case SDL_AudioFormat.S16LE -> "SDL_AUDIO_S16LE";
            case SDL_AudioFormat.S32BE -> "SDL_AUDIO_S32BE";
            case SDL_AudioFormat.S32LE -> "SDL_AUDIO_S32LE";
            case SDL_AudioFormat.S8 -> "SDL_AUDIO_S8";
            case SDL_AudioFormat.U8 -> "SDL_AUDIO_U8";
            case SDL_AudioFormat.UNKNOWN -> "SDL_AUDIO_UNKNOWN";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_AudioFormat() {}
}
