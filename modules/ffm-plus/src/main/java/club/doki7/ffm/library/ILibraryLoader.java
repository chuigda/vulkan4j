package club.doki7.ffm.library;

public sealed interface ILibraryLoader permits
        WindowsLibraryLoader,
        DefaultLibraryLoader
{
    ISharedLibrary loadLibrary(String libName) throws UnsatisfiedLinkError;

    default ISharedLibrary loadLibraryFile(String fileName) throws UnsatisfiedLinkError {
        return loadLibrary(fileName);
    }

    static ISharedLibrary platformLibraryLoader() {
        // TODO
        return null;
    }
}
