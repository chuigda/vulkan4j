package club.doki7.ffm.library;

import org.jetbrains.annotations.NotNull;

public final class JavaSystemLibraryLoader implements ILibraryLoader {
    @Override
    public @NotNull ISharedLibrary loadLibrary(@NotNull String libName) throws UnsatisfiedLinkError {
        try {
            System.loadLibrary(libName);
        } catch (Throwable e) {
            System.load(libName);
        }
        return JavaSystemLibrary.INSTANCE;
    }

    public static final JavaSystemLibraryLoader INSTANCE = new JavaSystemLibraryLoader();

    private JavaSystemLibraryLoader() {}
}
