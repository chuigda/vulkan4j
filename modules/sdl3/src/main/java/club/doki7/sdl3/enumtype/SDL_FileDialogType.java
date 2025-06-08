package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// Various types of file dialogs.
///
/// This is used by SDL_ShowFileDialogWithProperties() to decide what kind of
/// dialog to present to the user.
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_ShowFileDialogWithProperties
///
public final class SDL_FileDialogType {
    public static final int OPENFILE = 0x0;
    public static final int SAVEFILE = 0x1;
    public static final int OPENFOLDER = 0x2;

    public static String explain(@EnumType(SDL_FileDialogType.class) int value) {
        return switch (value) {
            case SDL_FileDialogType.OPENFILE -> "SDL_FILEDIALOG_OPENFILE";
            case SDL_FileDialogType.OPENFOLDER -> "SDL_FILEDIALOG_OPENFOLDER";
            case SDL_FileDialogType.SAVEFILE -> "SDL_FILEDIALOG_SAVEFILE";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_FileDialogType() {}
}
