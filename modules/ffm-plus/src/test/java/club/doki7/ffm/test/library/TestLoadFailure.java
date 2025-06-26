package club.doki7.ffm.test.library;

import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.library.UnixLibrary;
import club.doki7.ffm.library.UnixLibraryLoader;
import club.doki7.ffm.library.WindowsLibraryLoader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

public final class TestLoadFailure {
    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testWindows() {
        try (ISharedLibrary _ = WindowsLibraryLoader.INSTANCE.loadLibrary("notexist")) {
            throw new AssertionError("The library should not exist");
        } catch (UnsatisfiedLinkError e) {
            Assertions.assertTrue(e.getMessage().contains("LoadLibraryW error: 126"));
        }
    }

    @Test
    @EnabledOnOs(OS.LINUX)
    void testLinux() {
        try (ISharedLibrary _ = UnixLibraryLoader.INSTANCE.loadLibrary("nonexist")) {
            throw new AssertionError("The library should not exist");
        } catch (UnsatisfiedLinkError e) {
            String message = e.getMessage();
            System.err.println(message);
            Assertions.assertTrue(message.contains("dlopen error:"));
        }
    }
}
