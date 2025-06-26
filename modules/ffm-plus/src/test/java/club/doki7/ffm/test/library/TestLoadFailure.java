package club.doki7.ffm.test.library;

import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.library.WindowsLibraryLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public final class TestLoadFailure {
    @Test
    void testWindows() {
        if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
            return;
        }

        try (ISharedLibrary _ = WindowsLibraryLoader.INSTANCE.loadLibrary("notexist")) {
            throw new AssertionError("The library should not exist");
        } catch (UnsatisfiedLinkError e) {
            Assertions.assertTrue(e.getMessage().contains("LoadLibraryW error: 126"));
        }
    }
}
