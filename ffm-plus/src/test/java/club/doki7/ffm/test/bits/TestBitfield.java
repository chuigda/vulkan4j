package club.doki7.ffm.test.bits;

import club.doki7.ffm.Loader;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.ffm.ptr.IntPtr;
import org.junit.jupiter.api.Test;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public class TestBitfield {
    static {
        String userDir = System.getProperty("user.dir");
        String path = userDir;
        if (userDir.contains("vulkan4j")) {
            path = userDir.substring(0, userDir.indexOf("vulkan4j") + "vulkan4j".length());
        }
        path += "/misc/test_binary/libbitfield.so";
        System.load(path);
    }

    private static final FunctionDescriptor fnType = FunctionDescriptor.ofVoid(ValueLayout.ADDRESS);

    @Test
    void test1() throws Throwable {
        MethodHandle check1 = Loader.loadFunction("checkBitfield1", fnType);
        MethodHandle check2 = Loader.loadFunction("checkBitfield2", fnType);
        MethodHandle check3 = Loader.loadFunction("checkBitfield3", fnType);
        MethodHandle check4 = Loader.loadFunction("checkBitfield4", fnType);

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
        MethodHandle check5 = Loader.loadFunction("checkBitfield5", fnType);

        try (Arena arena = Arena.ofConfined()) {
            IntPtr ptr = IntPtr.allocate(arena);
            MemorySegment s = ptr.segment();

            BitfieldUtil.writeBits(s, 0, 24, 0x0D0007);
            BitfieldUtil.writeBits(s, 24, 32, 0x21);
            check5.invokeExact(s);
        }
    }
}
