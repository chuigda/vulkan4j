package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPipelineExecutableStatisticValueKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("b32"),
        ValueLayout.JAVA_LONG.withName("i64"),
        ValueLayout.JAVA_LONG.withName("u64"),
        ValueLayout.JAVA_DOUBLE.withName("f64")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$b32 = PathElement.groupElement("b32");
    public static final PathElement PATH$i64 = PathElement.groupElement("i64");
    public static final PathElement PATH$u64 = PathElement.groupElement("u64");
    public static final PathElement PATH$f64 = PathElement.groupElement("f64");

    public static final OfInt LAYOUT$b32 = (OfInt) LAYOUT.select(PATH$b32);
    public static final OfLong LAYOUT$i64 = (OfLong) LAYOUT.select(PATH$i64);
    public static final OfLong LAYOUT$u64 = (OfLong) LAYOUT.select(PATH$u64);
    public static final OfDouble LAYOUT$f64 = (OfDouble) LAYOUT.select(PATH$f64);

    public static final long OFFSET$b32 = LAYOUT.byteOffset(PATH$b32);
    public static final long OFFSET$i64 = LAYOUT.byteOffset(PATH$i64);
    public static final long OFFSET$u64 = LAYOUT.byteOffset(PATH$u64);
    public static final long OFFSET$f64 = LAYOUT.byteOffset(PATH$f64);

    public static final long SIZE$b32 = LAYOUT$b32.byteSize();
    public static final long SIZE$i64 = LAYOUT$i64.byteSize();
    public static final long SIZE$u64 = LAYOUT$u64.byteSize();
    public static final long SIZE$f64 = LAYOUT$f64.byteSize();

    public VkPipelineExecutableStatisticValueKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int b32() {
        return segment.get(LAYOUT$b32, OFFSET$b32);
    }

    public void b32(@unsigned int value) {
        segment.set(LAYOUT$b32, OFFSET$b32, value);
    }

    public long i64() {
        return segment.get(LAYOUT$i64, OFFSET$i64);
    }

    public void i64(long value) {
        segment.set(LAYOUT$i64, OFFSET$i64, value);
    }

    public @unsigned long u64() {
        return segment.get(LAYOUT$u64, OFFSET$u64);
    }

    public void u64(@unsigned long value) {
        segment.set(LAYOUT$u64, OFFSET$u64, value);
    }

    public double f64() {
        return segment.get(LAYOUT$f64, OFFSET$f64);
    }

    public void f64(double value) {
        segment.set(LAYOUT$f64, OFFSET$f64, value);
    }

    public static VkPipelineExecutableStatisticValueKHR allocate(Arena arena) {
        return new VkPipelineExecutableStatisticValueKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineExecutableStatisticValueKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineExecutableStatisticValueKHR[] ret = new VkPipelineExecutableStatisticValueKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineExecutableStatisticValueKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
