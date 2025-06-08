package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// A set of blend modes used in drawing operations.
///
/// These predefined blend modes are supported everywhere.
///
/// Additional values may be obtained from SDL_ComposeCustomBlendMode.
///
/// Since: This datatype is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_ComposeCustomBlendMode`
///
public final class SDL_BlendMode {
    public static final int NONE = 0x0;
    public static final int BLEND = 0x1;
    public static final int BLEND_PREMULTIPLIED = 0x10;
    public static final int ADD = 0x2;
    public static final int ADD_PREMULTIPLIED = 0x20;
    public static final int MOD = 0x4;
    public static final int MUL = 0x8;
    public static final int INVALID = 0x7fffffff;

    public static String explain(@EnumType(SDL_BlendMode.class) int value) {
        return switch (value) {
            case SDL_BlendMode.ADD -> "SDL_BLENDMODE_ADD";
            case SDL_BlendMode.ADD_PREMULTIPLIED -> "SDL_BLENDMODE_ADD_PREMULTIPLIED";
            case SDL_BlendMode.BLEND -> "SDL_BLENDMODE_BLEND";
            case SDL_BlendMode.BLEND_PREMULTIPLIED -> "SDL_BLENDMODE_BLEND_PREMULTIPLIED";
            case SDL_BlendMode.INVALID -> "SDL_BLENDMODE_INVALID";
            case SDL_BlendMode.MOD -> "SDL_BLENDMODE_MOD";
            case SDL_BlendMode.MUL -> "SDL_BLENDMODE_MUL";
            case SDL_BlendMode.NONE -> "SDL_BLENDMODE_NONE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_BlendMode() {}
}
