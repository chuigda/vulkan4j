package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Window flash operation.
///
/// \since This enum is available since SDL 3.2.0.
///
public final class SDL_FlashOperation {
    public static final int CANCEL = 0x0;
    public static final int BRIEFLY = 0x1;
    public static final int UNTIL_FOCUSED = 0x2;

    public static String explain(@EnumType(SDL_FlashOperation.class) int value) {
        return switch (value) {
            case SDL_FlashOperation.BRIEFLY -> "SDL_FLASH_BRIEFLY";
            case SDL_FlashOperation.CANCEL -> "SDL_FLASH_CANCEL";
            case SDL_FlashOperation.UNTIL_FOCUSED -> "SDL_FLASH_UNTIL_FOCUSED";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_FlashOperation() {}
}
