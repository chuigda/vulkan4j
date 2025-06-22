package club.doki7.ffm.library;

import org.jetbrains.annotations.NotNull;

public enum JavaSystemLibraryLoader implements ILibraryLoader {
    INSTANCE;

    @Override
    public @NotNull ISharedLibrary loadLibrary(@NotNull String libName) throws UnsatisfiedLinkError {
        try {
            System.loadLibrary(libName);
        } catch (Throwable e) {
            System.load(libName);
        }
        return JavaSystemLibrary.INSTANCE;
    }
}
