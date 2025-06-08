package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The predefined log categories
///
/// By default the application and gpu categories are enabled at the INFO
/// level, the assert category is enabled at the WARN level, test is enabled at
/// the VERBOSE level and all other categories are enabled at the ERROR level.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_LogCategory {
    public static final int APPLICATION = 0x0;
    public static final int ERROR = 0x1;
    public static final int ASSERT = 0x2;
    public static final int SYSTEM = 0x3;
    public static final int AUDIO = 0x4;
    public static final int VIDEO = 0x5;
    public static final int RENDER = 0x6;
    public static final int INPUT = 0x7;
    public static final int TEST = 0x8;
    public static final int GPU = 0x9;
    public static final int RESERVED2 = 0xa;
    public static final int RESERVED3 = 0xb;
    public static final int RESERVED4 = 0xc;
    public static final int RESERVED5 = 0xd;
    public static final int RESERVED6 = 0xe;
    public static final int RESERVED7 = 0xf;
    public static final int RESERVED8 = 0x10;
    public static final int RESERVED9 = 0x11;
    public static final int RESERVED10 = 0x12;
    public static final int CUSTOM = 0x13;

    public static String explain(@EnumType(SDL_LogCategory.class) int value) {
        return switch (value) {
            case SDL_LogCategory.APPLICATION -> "SDL_LOG_CATEGORY_APPLICATION";
            case SDL_LogCategory.ASSERT -> "SDL_LOG_CATEGORY_ASSERT";
            case SDL_LogCategory.AUDIO -> "SDL_LOG_CATEGORY_AUDIO";
            case SDL_LogCategory.CUSTOM -> "SDL_LOG_CATEGORY_CUSTOM";
            case SDL_LogCategory.ERROR -> "SDL_LOG_CATEGORY_ERROR";
            case SDL_LogCategory.GPU -> "SDL_LOG_CATEGORY_GPU";
            case SDL_LogCategory.INPUT -> "SDL_LOG_CATEGORY_INPUT";
            case SDL_LogCategory.RENDER -> "SDL_LOG_CATEGORY_RENDER";
            case SDL_LogCategory.RESERVED10 -> "SDL_LOG_CATEGORY_RESERVED10";
            case SDL_LogCategory.RESERVED2 -> "SDL_LOG_CATEGORY_RESERVED2";
            case SDL_LogCategory.RESERVED3 -> "SDL_LOG_CATEGORY_RESERVED3";
            case SDL_LogCategory.RESERVED4 -> "SDL_LOG_CATEGORY_RESERVED4";
            case SDL_LogCategory.RESERVED5 -> "SDL_LOG_CATEGORY_RESERVED5";
            case SDL_LogCategory.RESERVED6 -> "SDL_LOG_CATEGORY_RESERVED6";
            case SDL_LogCategory.RESERVED7 -> "SDL_LOG_CATEGORY_RESERVED7";
            case SDL_LogCategory.RESERVED8 -> "SDL_LOG_CATEGORY_RESERVED8";
            case SDL_LogCategory.RESERVED9 -> "SDL_LOG_CATEGORY_RESERVED9";
            case SDL_LogCategory.SYSTEM -> "SDL_LOG_CATEGORY_SYSTEM";
            case SDL_LogCategory.TEST -> "SDL_LOG_CATEGORY_TEST";
            case SDL_LogCategory.VIDEO -> "SDL_LOG_CATEGORY_VIDEO";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_LogCategory() {}
}
