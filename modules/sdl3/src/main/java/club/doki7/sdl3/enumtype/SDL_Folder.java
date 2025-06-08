package club.doki7.sdl3.enumtype;

import club.doki7.ffm.annotation.*;

/// The type of the OS-provided default folder for a specific purpose.
///
/// Note that the Trash folder isn't included here, because trashing files
/// usually involves extra OS-specific functionality to remember the file's
/// original location.
///
/// The folders supported per platform are:
///
/// |             | Windows | macOS/iOS | tvOS | Unix (XDG) | Haiku | Emscripten |
/// | ----------- | ------- | --------- | ---- | ---------- | ----- | ---------- |
/// | HOME        | X       | X         |      | X          | X     | X          |
/// | DESKTOP     | X       | X         |      | X          | X     |            |
/// | DOCUMENTS   | X       | X         |      | X          |       |            |
/// | DOWNLOADS   | Vista+  | X         |      | X          |       |            |
/// | MUSIC       | X       | X         |      | X          |       |            |
/// | PICTURES    | X       | X         |      | X          |       |            |
/// | PUBLICSHARE |         | X         |      | X          |       |            |
/// | SAVEDGAMES  | Vista+  |           |      |            |       |            |
/// | SCREENSHOTS | Vista+  |           |      |            |       |            |
/// | TEMPLATES   | X       | X         |      | X          |       |            |
/// | VIDEOS      | X       | X*        |      | X          |       |            |
///
/// Note that on macOS/iOS, the Videos folder is called "Movies".
///
/// \since This enum is available since SDL 3.2.0.
///
/// \sa SDL_GetUserFolder
///
public final class SDL_Folder {
    public static final int HOME = 0x0;
    public static final int DESKTOP = 0x1;
    public static final int DOCUMENTS = 0x2;
    public static final int DOWNLOADS = 0x3;
    public static final int MUSIC = 0x4;
    public static final int PICTURES = 0x5;
    public static final int PUBLICSHARE = 0x6;
    public static final int SAVEDGAMES = 0x7;
    public static final int SCREENSHOTS = 0x8;
    public static final int TEMPLATES = 0x9;
    public static final int VIDEOS = 0xa;
    public static final int COUNT = 0xb;

    public static String explain(@EnumType(SDL_Folder.class) int value) {
        return switch (value) {
            case SDL_Folder.COUNT -> "SDL_FOLDER_COUNT";
            case SDL_Folder.DESKTOP -> "SDL_FOLDER_DESKTOP";
            case SDL_Folder.DOCUMENTS -> "SDL_FOLDER_DOCUMENTS";
            case SDL_Folder.DOWNLOADS -> "SDL_FOLDER_DOWNLOADS";
            case SDL_Folder.HOME -> "SDL_FOLDER_HOME";
            case SDL_Folder.MUSIC -> "SDL_FOLDER_MUSIC";
            case SDL_Folder.PICTURES -> "SDL_FOLDER_PICTURES";
            case SDL_Folder.PUBLICSHARE -> "SDL_FOLDER_PUBLICSHARE";
            case SDL_Folder.SAVEDGAMES -> "SDL_FOLDER_SAVEDGAMES";
            case SDL_Folder.SCREENSHOTS -> "SDL_FOLDER_SCREENSHOTS";
            case SDL_Folder.TEMPLATES -> "SDL_FOLDER_TEMPLATES";
            case SDL_Folder.VIDEOS -> "SDL_FOLDER_VIDEOS";
            default -> "UNKNOWN(" + value + ")";
        };
    }

    /// Constructing this class is nonsense so the constructor is made private.
    private SDL_Folder() {}
}
