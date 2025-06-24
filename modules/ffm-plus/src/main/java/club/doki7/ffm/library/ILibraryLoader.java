package club.doki7.ffm.library;

import org.jetbrains.annotations.NotNull;

public sealed interface ILibraryLoader permits
        WindowsLibraryLoader,
        UnixLibraryLoader,
        JavaSystemLibraryLoader
{
    @NotNull ISharedLibrary loadLibrary(@NotNull String libName) throws UnsatisfiedLinkError;

    static ILibraryLoader platformLoader() {
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("windows")) {
            return WindowsLibraryLoader.INSTANCE;
        } else {
            return UnixLibraryLoader.INSTANCE;
        }
    }
}
