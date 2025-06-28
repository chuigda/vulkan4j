package club.doki7.ffm.test.library;

import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.library.WindowsLibraryLoader;
import club.doki7.ffm.ptr.WCharPtr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.condition.EnabledOnOs;
import org.junit.jupiter.api.condition.OS;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

public class TestLoadUnicode {
    private static final String userDir;
    private static final String libPath;

    static {
        userDir = System.getProperty("user.dir");
        String path = userDir;
        if (userDir.contains("vulkan4j")) {
            int index = userDir.lastIndexOf("vulkan4j");
            path = userDir.substring(0, index + "vulkan4j".length());
        }

        if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
            path += "/misc/test_binary/lib我能吞下玻璃而不伤身体.so";
        } else {
            path += "\\misc\\test_binary\\我能吞下玻璃而不伤身体.dll";
        }

        libPath = path;
    }

    @Test
    void testLoadUnicode() {
        try (ISharedLibrary lib = ILibraryLoader.platformLoader().loadLibrary(libPath)) {
            MemorySegment pfn = lib.load("check");
            Assertions.assertNotEquals(MemorySegment.NULL, pfn);
        }
    }

    @Test
    @EnabledOnOs(OS.WINDOWS)
    void testUseUnicode() throws Throwable {
        try (ISharedLibrary lib = WindowsLibraryLoader.INSTANCE.loadLibrary(libPath);
             Arena arena = Arena.ofConfined()) {
            WCharPtr wcs = WCharPtr.allocateWString(arena, "我能吞下玻璃而不伤身体");
            Assertions.assertEquals("我能吞下玻璃而不伤身体", wcs.readWStringSafe());
            WCharPtr sliced = wcs.slice(wcs.size() - 1);
            Assertions.assertEquals("我能吞下玻璃而不伤身体", sliced.readWStringSafe());

            MemorySegment pfn = lib.load("check");
            FunctionDescriptor fd = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT));
            MethodHandle h = Objects.requireNonNull(RawFunctionLoader.link(pfn, fd));
            h.invokeExact(WCharPtr.allocateWString(arena, "我能吞下玻璃而不伤身体").segment());

            MemorySegment pfn2 = lib.load("get_wcs");
            FunctionDescriptor fd2 = FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT));
            MethodHandle h2 = Objects.requireNonNull(RawFunctionLoader.link(pfn2, fd2));
            MemorySegment s = (MemorySegment) h2.invokeExact();
            Assertions.assertNotEquals(MemorySegment.NULL, s);

            WCharPtr gotWCS = Objects.requireNonNull(WCharPtr.checked(s));
            Assertions.assertEquals("我能吞下玻璃而不伤身体", gotWCS.readWString());
        }
    }

    // manual test, only run on windows
    public static void main(String[] args) {
        try (ISharedLibrary lib = WindowsLibraryLoader.INSTANCE.loadLibrary(libPath);
             Arena arena = Arena.ofConfined()) {
            MemorySegment segment = lib.load("use_in_msgbox");
            FunctionDescriptor fd = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT));

            MethodHandle h = Objects.requireNonNull(RawFunctionLoader.link(segment, fd));
            h.invokeExact(WCharPtr.allocateWString(arena, "我能吞下玻璃而不伤身体").segment());
        } catch (UnsatisfiedLinkError e) {
            System.err.println("Error loading library: " + e.getMessage());
        } catch (Throwable e) {
            throw new RuntimeException(e);
        }
    }
}
