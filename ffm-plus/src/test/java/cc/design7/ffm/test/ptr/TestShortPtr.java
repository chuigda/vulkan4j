package cc.design7.ffm.test.ptr;

import cc.design7.ffm.ptr.ShortPtr;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.nio.ShortBuffer;
import java.lang.foreign.Arena;

class TestShortPtr {

    @Test
    void testReadWriteSingleValue() {
        try (Arena arena = Arena.ofConfined()) {
            ShortPtr ptr = ShortPtr.allocate(arena);
            ptr.write((short) 42);
            assertEquals(42, ptr.read(), "读取和写入单个值时应一致");
        }
    }

    @Test
    void testReadWriteByIndex() {
        try (Arena arena = Arena.ofConfined()) {
            ShortPtr ptr = ShortPtr.allocate(arena, 5);
            ptr.write(2, (short) 99);
            assertEquals(99, ptr.read(2), "通过索引读取和写入的值应一致");
        }
    }

    @Test
    void testCheckedWithNonNativeSegmentThrows() {
        ShortBuffer buffer = ShortBuffer.allocate(10);
        assertThrows(IllegalArgumentException.class, () -> ShortPtr.checked(buffer));
    }

    @Test
    void testSizeCalculation() {
        try (Arena arena = Arena.ofConfined()) {
            ShortPtr ptr = ShortPtr.allocate(arena, 10);
            assertEquals(10, ptr.size(), "分配时的大小计算应正确");
        }
    }

    @Test
    void testOffset() {
        try (Arena arena = Arena.ofConfined()) {
            ShortPtr ptr = ShortPtr.allocate(arena, 10);
            ShortPtr offsetPtr = ptr.offset(2);

            assertEquals(8, offsetPtr.size());
        }
    }

    @Test
    void testSliceRange() {
        try (Arena arena = Arena.ofConfined()) {
            // 为 10 个 short 值分配内存
            ShortPtr ptr = ShortPtr.allocate(arena, 10);

            // 创建从索引 2 到 5 的切片
            ShortPtr slicePtr = ptr.slice(2, 5);

            // 验证切片后的段大小为 (5 - 2) * Short.BYTES，即 6 字节
            long expectedSize = (5 - 2) * Short.BYTES; // 6 字节
            // TODO 是否有问题?
            assertEquals(expectedSize, slicePtr.segment().byteSize(), "切片操作后的段大小应正确");
        }
    }


    @Test
    void testReinterpretKeepsData() {
        try (Arena arena = Arena.ofConfined()) {
            ShortPtr ptr = ShortPtr.allocate(arena, 5);
            ptr.write(2, (short) 55);
            ShortPtr reinterpretedPtr = ptr.reinterpret(10);
            assertEquals(55, reinterpretedPtr.read(2), "重新解释操作后数据应保持不变");
        }
    }

    @Test
    void testAllocateFromArray() {
        try (Arena arena = Arena.ofConfined()) {
            short[] array = {10, 20, 30};
            ShortPtr ptr = ShortPtr.allocate(arena, array);
            assertEquals(10, ptr.read(), "通过数组分配时第一个值应正确");
            assertEquals(20, ptr.read(1), "通过数组分配时第二个值应正确");
        }
    }
}
