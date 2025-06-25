package club.doki7.openal;

import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.library.WindowsLibraryLoader;

public final class ALLoader {
    /// Try loading the OpenAL library.
    ///
    /// This function is implemented in terms of
    /// {@link club.doki7.ffm.library.ILibraryLoader#loadLibrary(String) ILibraryLoader.loadLibrary(String)}.
    ///  On Windows it will try {@code "OpenAL32"}
    /// ({@code OpenAL32.dll}), and on other platforms it will try {@code "openal"} ({@code libopenal.so}).
    ///
    /// Instead of using this function, you may also implement your own GLFW library loading logic.
    ///
    /// @throws UnsatisfiedLinkError see {@link club.doki7.ffm.library.ILibraryLoader#loadLibrary(String) ILibraryLoader.loadLibrary(String)}
    public static ISharedLibrary loadOpenALLibrary() {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            return WindowsLibraryLoader.INSTANCE.loadLibrary("OpenAL32");
        } else {
            return ILibraryLoader.platformLoader().loadLibrary("openal");
        }
    }

    public static AL loadAL(ISharedLibrary libOpenAL) {
        return new AL(libOpenAL);
    }

    public static ALC loadALC(ISharedLibrary libOpenAL) {
        return new ALC(libOpenAL);
    }

    private ALLoader() {}
}
