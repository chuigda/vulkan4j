package cc.design7.ffm.test.ptr;

import cc.design7.ffm.ptr.DoublePtr;
import org.junit.jupiter.api.Test;
import org.lwjgl.system.MemoryStack;

import java.lang.foreign.Arena;
import java.nio.DoubleBuffer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TestDoublePtr {
    @Test
    void testReadWriteSingleValue() {
        try (Arena arena = Arena.ofConfined()) {
            DoublePtr ptr = DoublePtr.allocate(arena);
            ptr.write(3.14);
            assertEquals(3.14, ptr.read(), "读取的值应与写入的值相同");
        }
    }

    @Test
    void testReadWriteByIndex() {
        try (Arena arena = Arena.ofConfined()) {
            DoublePtr ptr = DoublePtr.allocate(arena, 3);
            ptr.write(0, 1.23);
            ptr.write(1, 4.56);
            assertEquals(1.23, ptr.read(0));
            assertEquals(4.56, ptr.read(1));
        }
    }

    @Test
    void testCheckedWithNonNativeSegmentThrows() {
        DoubleBuffer buffer = DoubleBuffer.allocate(4);
        assertThrows(IllegalArgumentException.class, () -> DoublePtr.checked(buffer));
    }

    @Test
    void testSizeCalculation() {
        try (Arena arena = Arena.ofConfined()) {
            DoublePtr ptr = DoublePtr.allocate(arena, 5);
            assertEquals(5, ptr.size());
        }
    }

    @Test
    void testOffset() {
        try (Arena arena = Arena.ofConfined()) {
            DoublePtr ptr = DoublePtr.allocate(arena, 5);
            ptr.write(2, 7.89);
            DoublePtr offsetPtr = ptr.offset(2);
            assertEquals(7.89, offsetPtr.read(0));
        }
    }

    @Test
    void testSliceRange() {
        try (Arena arena = Arena.ofConfined()) {
            DoublePtr ptr = DoublePtr.allocate(arena, 5);
            ptr.write(0, 1.11);
            ptr.write(1, 2.22);
            ptr.write(2, 3.33);

            DoublePtr slice = ptr.slice(1, 3);
            assertEquals(2.22, slice.read(0));
            assertEquals(3.33, slice.read(1));
        }
    }

    @Test
    void testReinterpretKeepsData() {
        try (Arena arena = Arena.ofConfined()) {
            DoublePtr ptr = DoublePtr.allocate(arena, 5);
            ptr.write(0, 3.14);
            DoublePtr reinterpretedPtr = ptr.reinterpret(10);
            assertEquals(3.14, reinterpretedPtr.read(0));
        }
    }

    @Test
    void testAllocateFromArray() {
        try (Arena arena = Arena.ofConfined()) {
            double[] array = {1.23, 4.56, 7.89};
            DoublePtr ptr = DoublePtr.allocate(arena, array);
            assertEquals(1.23, ptr.read(0));
            assertEquals(4.56, ptr.read(1));
            assertEquals(7.89, ptr.read(2));
        }
    }

    @Test
    void testInteract() {
        double[] data = { 1.0f, 2.0f, 3.0f, 4.0f };

        try (MemoryStack stack = MemoryStack.stackPush()) {
            DoubleBuffer buffer = stack.mallocDouble(4);
            buffer.put(data);
            buffer.rewind();

            DoublePtr ptr = DoublePtr.checked(buffer);
            assertEquals(data.length, ptr.size());
            for (int i = 0; i < data.length; i++) {
                assertEquals(data[i], ptr.read(i));
            }
        }
    }
}
