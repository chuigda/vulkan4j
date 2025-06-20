package club.doki7.ffm.library;

public final class DefaultLibraryLoader implements ILibraryLoader {
    @Override
    public ISharedLibrary loadLibrary(String libName) throws UnsatisfiedLinkError {
        System.loadLibrary(libName);
        return new DefaultLibrary();
    }

    @Override
    public ISharedLibrary loadLibraryFile(String fileName) throws UnsatisfiedLinkError {
        System.load(fileName);
        return new DefaultLibrary();
    }
}
