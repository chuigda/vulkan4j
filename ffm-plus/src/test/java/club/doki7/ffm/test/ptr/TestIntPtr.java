package club.doki7.ffm.test.ptr;

import club.doki7.ffm.ptr.IntPtr;
import org.junit.jupiter.api.Test;
import org.lwjgl.system.MemoryStack;

import java.lang.foreign.Arena;
import java.nio.IntBuffer;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestIntPtr {
    @Test
    void test() {
        try (Arena arena = Arena.ofConfined()) {
            IntPtr pInt = IntPtr.allocate(arena);
            assertEquals(1, pInt.size());

            pInt.write(42);
            assertEquals(42, pInt.read());
            assertEquals(42, pInt.read(0));

            IntPtr pIntArray = IntPtr.allocate(arena, 2);
            assertEquals(2, pIntArray.size());

            pIntArray.write(0, 1314_521);
            pIntArray.write(1, 0x0721_0d00);

            assertEquals(1314_521, pIntArray.read(0));
            assertEquals(0x0721_0d00, pIntArray.read(1));
        }
    }

    @Test
    void testSlice() {
        try (Arena arena = Arena.ofConfined()) {
            int[] data = {1, 2, 3, 4, 5, 6, 7, 8};
            IntPtr pInt = IntPtr.allocate(arena, data);
            assertEquals(data.length, pInt.size());

            for (int i = 0; i < data.length; i++) {
                assertEquals(data[i], pInt.read(i));
            }

            IntPtr p1 = pInt.offset(4);
            assertEquals(4, p1.size());
            for (int i = 0; i < 4; i++) {
                assertEquals(data[i + 4], p1.read(i));
            }

            IntPtr p2 = pInt.slice(4);
            assertEquals(4, p2.size());
            for (int i = 0; i < 4; i++) {
                assertEquals(data[i], p2.read(i));
            }

            IntPtr p3 = pInt.slice(2, 6);
            assertEquals(4, p3.size());
            for (int i = 0; i < 4; i++) {
                assertEquals(data[i + 2], p3.read(i));
            }
        }
    }

    @Test
    void testInteract() {
        try (MemoryStack stack = MemoryStack.stackPush()) {
            IntBuffer intBuffer = stack.mallocInt(1);
            IntPtr pInt = IntPtr.checked(intBuffer);
            assertEquals(1, pInt.size());

            pInt.write(42);
            assertEquals(42, pInt.read());
            assertEquals(42, pInt.read(0));
            assertEquals(42, intBuffer.get());

            IntBuffer intArrayBuffer = stack.mallocInt(2);
            IntPtr pIntArray = IntPtr.checked(intArrayBuffer);
            assertEquals(2, pIntArray.size());

            pIntArray.write(0, 1314_521);
            pIntArray.write(1, 0x0721_0d00);

            assertEquals(1314_521, pIntArray.read(0));
            assertEquals(0x0721_0d00, pIntArray.read(1));
            assertEquals(1314_521, intArrayBuffer.get());
            assertEquals(0x0721_0d00, intArrayBuffer.get(1));
        }
    }

    @Test
    void testInteract2() {
        IntBuffer intBuffer = IntBuffer.allocate(1);
        intBuffer.put(42);
        intBuffer.rewind();

        try (Arena arena = Arena.ofConfined()) {
            IntPtr pInt = IntPtr.allocate(arena, intBuffer);
            assertEquals(1, pInt.size());
            assertEquals(42, pInt.read());

            pInt.write(507);
            assertEquals(507, pInt.read());
            assertEquals(42, intBuffer.get());
        }
    }
}
