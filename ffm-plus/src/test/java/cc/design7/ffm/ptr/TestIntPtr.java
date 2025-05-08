package cc.design7.ffm.ptr;

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
}
