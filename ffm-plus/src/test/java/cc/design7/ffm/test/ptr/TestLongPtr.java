package cc.design7.ffm.test.ptr;

import cc.design7.ffm.ptr.LongPtr;
import org.junit.jupiter.api.Test;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.ByteBuffer;

import static org.junit.jupiter.api.Assertions.*;

public class TestLongPtr {

    @Test
    void testReadWriteSingleValue() {
        try (Arena arena = Arena.ofConfined()) {
            LongPtr ptr = LongPtr.allocate(arena);
            ptr.write(42L);
            assertEquals(42L, ptr.read(), "读取的值应为写入的42");
        }
    }

    @Test
    void testReadWriteByIndex() {
        try (Arena arena = Arena.ofConfined()) {
            LongPtr ptr = LongPtr.allocate(arena, 3);
            ptr.write(0, 10L);
            ptr.write(1, 20L);
            ptr.write(2, 30L);

            assertEquals(10L, ptr.read(0), "索引0读取值应为10");
            assertEquals(20L, ptr.read(1), "索引1读取值应为20");
            assertEquals(30L, ptr.read(2), "索引2读取值应为30");
        }
    }

    @Test
    void testCheckedWithNullSegment() {
        assertNull(LongPtr.checked((MemorySegment) null), "传入null时应返回null");
    }

    @Test
    void testCheckedWithNonNativeSegmentThrows() {
        ByteBuffer bb = ByteBuffer.allocate(8); // 非direct buffer
        MemorySegment segment = MemorySegment.ofBuffer(bb);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            LongPtr.checked(segment);
        }, "非原生段应抛出IllegalArgumentException");

        assertTrue(exception.getMessage().contains("native"), "异常信息应包含'native'");
    }

    @Test
    void testSizeCalculation() {
        try (Arena arena = Arena.ofConfined()) {
            LongPtr ptr = LongPtr.allocate(arena, 5);
            assertEquals(5, ptr.size(), "大小应为5");
        }
    }

    @Test
    void testOffset() {
        try (Arena arena = Arena.ofConfined()) {
            LongPtr ptr = LongPtr.allocate(arena, new long[]{1L, 2L, 3L});
            LongPtr offsetPtr = ptr.offset(1);
            assertEquals(2L, offsetPtr.read(), "偏移后读取的第一个值应为2");
        }
    }

    @Test
    void testSliceRange() {
        try (Arena arena = Arena.ofConfined()) {
            LongPtr ptr = LongPtr.allocate(arena, new long[]{1L, 2L, 3L, 4L});
            LongPtr slice = ptr.slice(1, 4);

            assertEquals(2L, slice.read(0), "切片索引0应为2");
            assertEquals(3L, slice.read(1), "切片索引1应为3");
            assertEquals(4L, slice.read(2), "切片索引2应为4");
            assertEquals(3, slice.size(), "切片大小应为3");
        }
    }

    @Test
    void testReinterpretKeepsData() {
        try (Arena arena = Arena.ofConfined()) {
            LongPtr ptr = LongPtr.allocate(arena, new long[]{42L, 99L});
            LongPtr reinterpreted = ptr.reinterpret(2);

            assertEquals(42L, reinterpreted.read(0), "重解释索引0应为42");
            assertEquals(99L, reinterpreted.read(1), "重解释索引1应为99");
        }
    }

    @Test
    void testAllocateFromArray() {
        try (Arena arena = Arena.ofConfined()) {
            long[] data = {11L, 22L, 33L};
            LongPtr ptr = LongPtr.allocate(arena, data);

            assertEquals(3, ptr.size(), "大小应为3");
            for (int i = 0; i < data.length; i++) {
                assertEquals(data[i], ptr.read(i), "数组索引" + i + "应为" + data[i]);
            }
        }
    }
}
