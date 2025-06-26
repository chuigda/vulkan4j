package club.doki7.ffm.test.library;

import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public final class TestLoadFailure {
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testWindows() {
        try (ISharedLibrary _ = ILibraryLoader.platformLoader().loadLibrary("notexist")) {
            throw new AssertionError("The library should not exist");
        } catch (UnsatisfiedLinkError e) {
            Assertions.assertTrue(e.getMessage().contains("LoadLibraryW error: 126"));
        }
    }
}
