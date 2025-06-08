package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Colorspace transfer characteristics.
///
/// These are as described by https://www.itu.int/rec/T-REC-H.273-201612-S/en
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_TransferCharacteristics {
    public static final int SDL_TRANSFER_CHARACTERISTICS_UNKNOWN = 0x0;
    public static final int SDL_TRANSFER_CHARACTERISTICS_BT709 = 0x1;
    public static final int SDL_TRANSFER_CHARACTERISTICS_UNSPECIFIED = 0x2;
    public static final int SDL_TRANSFER_CHARACTERISTICS_GAMMA22 = 0x4;
    public static final int SDL_TRANSFER_CHARACTERISTICS_GAMMA28 = 0x5;
    public static final int SDL_TRANSFER_CHARACTERISTICS_BT601 = 0x6;
    public static final int SDL_TRANSFER_CHARACTERISTICS_SMPTE240 = 0x7;
    public static final int SDL_TRANSFER_CHARACTERISTICS_LINEAR = 0x8;
    public static final int SDL_TRANSFER_CHARACTERISTICS_LOG100 = 0x9;
    public static final int SDL_TRANSFER_CHARACTERISTICS_LOG100_SQRT10 = 0xa;
    public static final int SDL_TRANSFER_CHARACTERISTICS_IEC61966 = 0xb;
    public static final int SDL_TRANSFER_CHARACTERISTICS_BT1361 = 0xc;
    public static final int SDL_TRANSFER_CHARACTERISTICS_SRGB = 0xd;
    public static final int SDL_TRANSFER_CHARACTERISTICS_BT2020_10BIT = 0xe;
    public static final int SDL_TRANSFER_CHARACTERISTICS_BT2020_12BIT = 0xf;
    public static final int SDL_TRANSFER_CHARACTERISTICS_PQ = 0x10;
    public static final int SDL_TRANSFER_CHARACTERISTICS_SMPTE428 = 0x11;
    public static final int SDL_TRANSFER_CHARACTERISTICS_HLG = 0x12;
    public static final int SDL_TRANSFER_CHARACTERISTICS_CUSTOM = 0x1f;

    public static String explain(@EnumType(SDL_TransferCharacteristics.class) int value) {
        return switch (value) {
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_BT1361 -> "SDL_TRANSFER_CHARACTERISTICS_BT1361";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_BT2020_10BIT -> "SDL_TRANSFER_CHARACTERISTICS_BT2020_10BIT";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_BT2020_12BIT -> "SDL_TRANSFER_CHARACTERISTICS_BT2020_12BIT";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_BT601 -> "SDL_TRANSFER_CHARACTERISTICS_BT601";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_BT709 -> "SDL_TRANSFER_CHARACTERISTICS_BT709";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_CUSTOM -> "SDL_TRANSFER_CHARACTERISTICS_CUSTOM";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_GAMMA22 -> "SDL_TRANSFER_CHARACTERISTICS_GAMMA22";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_GAMMA28 -> "SDL_TRANSFER_CHARACTERISTICS_GAMMA28";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_HLG -> "SDL_TRANSFER_CHARACTERISTICS_HLG";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_IEC61966 -> "SDL_TRANSFER_CHARACTERISTICS_IEC61966";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_LINEAR -> "SDL_TRANSFER_CHARACTERISTICS_LINEAR";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_LOG100 -> "SDL_TRANSFER_CHARACTERISTICS_LOG100";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_LOG100_SQRT10 -> "SDL_TRANSFER_CHARACTERISTICS_LOG100_SQRT10";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_PQ -> "SDL_TRANSFER_CHARACTERISTICS_PQ";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_SMPTE240 -> "SDL_TRANSFER_CHARACTERISTICS_SMPTE240";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_SMPTE428 -> "SDL_TRANSFER_CHARACTERISTICS_SMPTE428";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_SRGB -> "SDL_TRANSFER_CHARACTERISTICS_SRGB";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_UNKNOWN -> "SDL_TRANSFER_CHARACTERISTICS_UNKNOWN";
            case SDL_TransferCharacteristics.SDL_TRANSFER_CHARACTERISTICS_UNSPECIFIED -> "SDL_TRANSFER_CHARACTERISTICS_UNSPECIFIED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_TransferCharacteristics() {}
}
