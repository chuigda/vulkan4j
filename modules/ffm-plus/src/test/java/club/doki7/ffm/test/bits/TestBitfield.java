package club.doki7.ffm.test.bits;

import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.library.ILibraryLoader;
import club.doki7.ffm.library.ISharedLibrary;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.IntPtr;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public class TestBitfield {
    private static final ILibraryLoader libraryLoader = ILibraryLoader.platformLoader();
    private static final ISharedLibrary library;
    static {
        String userDir = System.getProperty("user.dir");
        String path = userDir;
        if (userDir.contains("vulkan4j")) {
            int index = userDir.lastIndexOf("vulkan4j");
            path = userDir.substring(0, index + "vulkan4j".length());
        }

        if (!System.getProperty("os.name").toLowerCase().contains("windows")) {
            path += "/misc/test_binary/libbitfield.so";
        } else {
            path += "\\misc\\test_binary\\bitfield.dll";
        }

        library = libraryLoader.loadLibrary(path);
    }

    private static final FunctionDescriptor fnType = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);

    @Test
    void test1() throws Throwable {
        MethodHandle check1 = RawFunctionLoader.link(library.load("checkBitfield1"), fnType);
        MethodHandle check2 = RawFunctionLoader.link(library.load("checkBitfield2"), fnType);
        MethodHandle check3 = RawFunctionLoader.link(library.load("checkBitfield3"), fnType);
        MethodHandle check4 = RawFunctionLoader.link(library.load("checkBitfield4"), fnType);

        Assertions.assertNotNull(check1);
        Assertions.assertNotNull(check2);
        Assertions.assertNotNull(check3);
        Assertions.assertNotNull(check4);

        try (Arena arena = Arena.ofConfined()) {
            BytePtr ptr = BytePtr.allocate(arena);
            MemorySegment s = ptr.segment();

            for (int i = 0; i < 8; i++) {
                BitfieldUtil.writeBit(s, i, i % 2 == 0);
            }
            check1.invokeExact(s);

            for (int i = 0; i < 8; i++) {
                BitfieldUtil.writeBit(s, i, i % 2 != 0);
            }
            check2.invokeExact(s);

            for (int i = 0; i < 4; i++) {
                BitfieldUtil.writeBit(s, i, true);
            }
            for (int i = 4; i < 8; i++) {
                BitfieldUtil.writeBit(s, i, false);
            }
            check3.invokeExact(s);

            for (int i = 0; i < 4; i++) {
                BitfieldUtil.writeBit(s, i, false);
            }
            for (int i = 4; i < 8; i++) {
                BitfieldUtil.writeBit(s, i, true);
            }
            check4.invokeExact(s);
        }
    }

    @Test
    void test2() throws Throwable {
        MethodHandle check5 = RawFunctionLoader.link(library.load("checkBitfield5"), fnType);
        Assertions.assertNotNull(check5);

        try (Arena arena = Arena.ofConfined()) {
            IntPtr ptr = IntPtr.allocate(arena);
            MemorySegment s = ptr.segment();

            BitfieldUtil.writeBits(s, 0, 24, 0x0D0007);
            BitfieldUtil.writeBits(s, 24, 32, 0x21);
            check5.invokeExact(s);
        }
    }
}
