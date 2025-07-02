package club.doki7.ffm.test.ptr;

import club.doki7.ffm.ptr.FloatPtr;
import org.junit.jupiter.api.Test;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;

import static org.junit.jupiter.api.Assertions.*;

public class TestFloatPtr {

    @Test
    void testReadWriteSingleValue() {
        try (Arena arena = Arena.ofConfined()) {
            FloatPtr ptr = FloatPtr.allocate(arena);
            ptr.write(3.14f);
            assertEquals(3.14f, ptr.read(), "单个值读写失败：读出的值不等于写入的值");
        }
    }

    @Test
    void testReadWriteByIndex() {
        try (Arena arena = Arena.ofConfined()) {
            FloatPtr ptr = FloatPtr.allocate(arena, 3);
            ptr.write(0, 1.1f);
            ptr.write(1, 2.2f);
            ptr.write(2, 3.3f);
            assertEquals(1.1f, ptr.read(0), "索引0读写失败");
            assertEquals(2.2f, ptr.read(1), "索引1读写失败");
            assertEquals(3.3f, ptr.read(2), "索引2读写失败");
        }
    }

    @Test
    void testCheckedWithNullSegment() {
        assertNull(FloatPtr.checked(MemorySegment.NULL), "传入 MemorySegment.NULL 时应返回null");
    }

    @Test
    void testCheckedWithNonNativeSegmentThrows() {
        ByteBuffer buffer = ByteBuffer.allocate(4);
        MemorySegment segment = MemorySegment.ofBuffer(buffer);

        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class, () ->
                FloatPtr.checked(segment), "应抛出非法参数异常：非native段");
        assertTrue(ex.getMessage().contains("native"), "异常信息应包含'native'");
    }

    @Test
    void testSizeCalculation() {
        try (Arena arena = Arena.ofConfined()) {
            FloatPtr ptr = FloatPtr.allocate(arena, 10);
            assertEquals(10, ptr.size(), "size() 返回值与预期不符");
        }
    }

    @Test
    void testOffset() {
        try (Arena arena = Arena.ofConfined()) {
            FloatPtr ptr = FloatPtr.allocate(arena, 5);
            ptr.write(3, 42.0f);
            FloatPtr offsetPtr = ptr.offset(3);
            assertEquals(42.0f, offsetPtr.read(), "偏移读取的值与原始写入值不一致");
        }
    }

    @Test
    void testSliceRange() {
        try (Arena arena = Arena.ofConfined()) {
            FloatPtr ptr = FloatPtr.allocate(arena, 5);
            ptr.write(1, 11.1f);
            ptr.write(2, 22.2f);

            FloatPtr sliced = ptr.slice(1, 3);
            assertEquals(11.1f, sliced.read(0), "切片[1,3)中索引0的值不正确");
            assertEquals(22.2f, sliced.read(1), "切片[1,3)中索引1的值不正确");
            assertEquals(2, sliced.size(), "切片大小应为2");
        }
    }

    @Test
    void testReinterpretKeepsData() {
        try (Arena arena = Arena.ofConfined()) {
            FloatPtr ptr = FloatPtr.allocate(arena, 1);
            ptr.write(99.99f);
            FloatPtr reinterpreted = ptr.reinterpret(1);
            assertEquals(99.99f, reinterpreted.read(), "reinterpret 后的数据应保持不变");
        }
    }

    @Test
    void testAllocateFromArray() {
        try (Arena arena = Arena.ofConfined()) {
            float[] arr = {1.5f, 2.5f, 3.5f};
            FloatPtr ptr = FloatPtr.allocate(arena, arr);
            assertEquals(3, ptr.size(), "数组分配后的大小应等于数组长度");
            assertEquals(1.5f, ptr.read(0), "数组索引0值错误");
            assertEquals(2.5f, ptr.read(1), "数组索引1值错误");
            assertEquals(3.5f, ptr.read(2), "数组索引2值错误");
        }
    }

    @Test
    void testAllocateFromFloatBuffer() {
        FloatBuffer buffer = FloatBuffer.wrap(new float[]{10.1f, 20.2f, 30.3f});

        try (Arena arena = Arena.ofConfined()) {
            FloatPtr ptr = FloatPtr.allocate(arena, buffer);
            assertEquals(10.1f, ptr.read(0), "FloatBuffer 索引0值错误");
            assertEquals(20.2f, ptr.read(1), "FloatBuffer 索引1值错误");
            assertEquals(30.3f, ptr.read(2), "FloatBuffer 索引2值错误");
        }
    }

    @Test
    void testCheckedFloatBufferThrowsIfNotDirect() {
        FloatBuffer buffer = FloatBuffer.allocate(3);
        assertThrows(IllegalArgumentException.class, () -> FloatPtr.checked(buffer));
    }
}
