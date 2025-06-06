package club.doki7.ffm.test.ptr;

import club.doki7.ffm.ptr.PointerPtr;
import org.junit.jupiter.api.Test;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;

import static org.junit.jupiter.api.Assertions.*;

public class TestPointerPtr {

    @Test
    public void testReadWriteSingleValue() {
        try (Arena arena = Arena.ofConfined()) {
            PointerPtr ptr = PointerPtr.allocate(arena);

            MemorySegment value = arena.allocate(4);
            ptr.write(value);
            MemorySegment result = ptr.read();

            // 断言写入后读取的数据相同
            assertEquals(value, result, "读取的值应等于写入的值");
        }
    }

    @Test
    public void testReadWriteByIndex() {
        try (Arena arena = Arena.ofConfined()) {
            PointerPtr ptr = PointerPtr.allocate(arena, 4);

            MemorySegment value0 = arena.allocate(4);
            MemorySegment value1 = arena.allocate(4);

            ptr.write(0, value0);
            ptr.write(1, value1);

            assertEquals(value0, ptr.read(0), "索引0处读取的值应与写入的值一致");
            assertEquals(value1, ptr.read(1), "索引1处读取的值应与写入的值一致");
        }
    }

    @Test
    public void testCheckedWithNullSegment() {
        // 测试传入 null 应返回 null
        assertNull(PointerPtr.checked(null), "传入null段应返回null");

        // 测试传入 MemorySegment.NULL 应返回 null
        assertNull(PointerPtr.checked(MemorySegment.NULL), "传入MemorySegment.NULL应返回null");
    }

    @Test
    public void testCheckedWithNonNativeSegmentThrows() {
        MemorySegment nonNative = MemorySegment.ofArray(new byte[16]);

        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, () -> {
            PointerPtr.checked(nonNative);
        });

        assertTrue(exception.getMessage().contains("native"), "非原生段应抛出包含'native'的异常");
    }

    @Test
    public void testSizeCalculation() {
        try (Arena arena = Arena.ofConfined()) {
            PointerPtr ptr = PointerPtr.allocate(arena, 8);

            assertEquals(8, ptr.size(), "分配8个指针后，size应为8");
        }
    }

    @Test
    public void testOffset() {
        try (Arena arena = Arena.ofConfined()) {
            PointerPtr ptr = PointerPtr.allocate(arena, 2);
            MemorySegment value = arena.allocate(4);

            ptr.write(1, value);
            PointerPtr offsetPtr = ptr.offset(1);

            assertEquals(value, offsetPtr.read(), "偏移1后读取的值应为原来索引1处的值");
        }
    }

    @Test
    public void testSliceRange() {
        try (Arena arena = Arena.ofConfined()) {
            PointerPtr ptr = PointerPtr.allocate(arena, 4);

            // 输出分配的内存信息，确认分配是否正确
            System.out.println("Total size of ptr: " + ptr.size());

            MemorySegment value = arena.allocate(4);
            ptr.write(2, value);

            // 确认切片的范围和内存是否正确
            // TODO end 4 是漂移量还是索引
            PointerPtr slice = ptr.slice(2, 4);
            // PointerPtr slice = ptr.slice(2, 2);
            System.out.println("Slice size: " + slice.size()); // 输出切片大小

            assertEquals(2, slice.size(), "切片后大小应为2");
            assertEquals(value, slice.read(0), "切片后索引0应对应原索引2的值");
        }
    }


    @Test
    public void testReinterpretKeepsData() {
        try (Arena arena = Arena.ofConfined()) {
            PointerPtr ptr = PointerPtr.allocate(arena, 2);
            MemorySegment value = arena.allocate(4);
            ptr.write(1, value);

            PointerPtr reinterpreted = ptr.reinterpret(2);

            assertEquals(value, reinterpreted.read(1), "重解释后索引1处的值应保持不变");
        }
    }

    @Test
    public void testAllocateFromArray() {
        try (Arena arena = Arena.ofConfined()) {
            int size = 3;
            PointerPtr ptr = PointerPtr.allocate(arena, size);

            assertEquals(size, ptr.size(), "从数组方式分配后应具有正确的大小");
        }
    }
}
