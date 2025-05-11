package cc.design7.ffm.test.ptr;

import cc.design7.ffm.ptr.BytePtr;
import org.junit.jupiter.api.Test;

import java.lang.foreign.Arena;
import java.nio.ByteBuffer;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestBytePtr {
    @Test
    void testBasicReadWrite() {
        try (Arena arena = Arena.ofConfined()) {
            BytePtr ptr = BytePtr.allocate(arena);
            assertEquals(1, ptr.size());

            ptr.write((byte) 42);
            assertEquals(42, ptr.read());

            ptr.write(0, (byte) 21);
            assertEquals(21, ptr.read(0));
        }
    }

    @Test
    void testAllocateWithSize() {
        try (Arena arena = Arena.ofConfined()) {
            BytePtr ptr = BytePtr.allocate(arena, 4);
            assertEquals(4, ptr.size());

            ptr.write(3, (byte) 99);
            assertEquals(99, ptr.read(3));
        }
    }

    @Test
    void testReinterpret() {
        try (Arena arena = Arena.ofConfined()) {
            BytePtr ptr = BytePtr.allocate(arena, 10);
            BytePtr reinterpreted = ptr.reinterpret(5);
            assertEquals(5, reinterpreted.size()); // unsafe 但逻辑正确性测试
        }
    }

    @Test
    void testSliceOffset() {
        try (Arena arena = Arena.ofConfined()) {
            BytePtr ptr = BytePtr.allocate(arena, 4);
            ptr.write(1, (byte) 66);
            BytePtr slice = ptr.offset(1);
            assertEquals(66, slice.read());
        }
    }

    @Test
    void testSliceRange() {
        try (Arena arena = Arena.ofConfined()) {
            BytePtr ptr = BytePtr.allocate(arena, 4);
            ptr.write(2, (byte) 77);
            BytePtr slice = ptr.slice(2, 3);
            assertEquals(1, slice.size());
            assertEquals(77, slice.read(0));
        }
    }

    @Test
    void testStringReadWrite() {
        try (Arena arena = Arena.ofConfined()) {
            String input = "hello";
            BytePtr strPtr = BytePtr.allocateString(arena, input);

            assertEquals(input, strPtr.readStringSafe());
            assertTrue(strPtr.readString().startsWith("hello")); // unsafe 测试
        }
    }

    @Test
    void testCheckedBufferInterop() {
        ByteBuffer buffer = ByteBuffer.allocateDirect(4);
        buffer.put(0, (byte) 123);

        BytePtr ptr = BytePtr.checked(buffer);
        assertEquals(123, ptr.read());
    }

    @Test
    void testAllocateFromBuffer() {
        try (Arena arena = Arena.ofConfined()) {
            ByteBuffer buffer = ByteBuffer.allocateDirect(3);
            buffer.put(0, (byte) 1);
            buffer.put(1, (byte) 2);
            buffer.put(2, (byte) 3);

            BytePtr ptr = BytePtr.allocate(arena, buffer);
            assertEquals(1, ptr.read(0));
            assertEquals(2, ptr.read(1));
            assertEquals(3, ptr.read(2));
        }
    }
}
