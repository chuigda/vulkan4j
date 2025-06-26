package club.doki7.ffm.test.library;

import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import org.junit.jupiter.api.Test;

public final class TestLoadFailure {
    @Test
    void testWindows() {
        try (ISharedLibrary library = ILibraryLoader.platformLoader().loadLibrary("notexist")) {
            throw new AssertionError("The library should not exist");
        } catch (UnsatisfiedLinkError e) {
            e.printStackTrace(System.err);
        }
    }
}
