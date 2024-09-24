package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPerformanceCounterResultKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("int32"),
        ValueLayout.JAVA_LONG.withName("int64"),
        ValueLayout.JAVA_INT.withName("uint32"),
        ValueLayout.JAVA_LONG.withName("uint64"),
        ValueLayout.JAVA_FLOAT.withName("float32"),
        ValueLayout.JAVA_DOUBLE.withName("float64")
    );

    public static final PathElement PATH$int32 = PathElement.groupElement("int32");
    public static final PathElement PATH$int64 = PathElement.groupElement("int64");
    public static final PathElement PATH$uint32 = PathElement.groupElement("uint32");
    public static final PathElement PATH$uint64 = PathElement.groupElement("uint64");
    public static final PathElement PATH$float32 = PathElement.groupElement("float32");
    public static final PathElement PATH$float64 = PathElement.groupElement("float64");

    public static final OfInt LAYOUT$int32 = (OfInt) LAYOUT.select(PATH$int32);
    public static final OfLong LAYOUT$int64 = (OfLong) LAYOUT.select(PATH$int64);
    public static final OfInt LAYOUT$uint32 = (OfInt) LAYOUT.select(PATH$uint32);
    public static final OfLong LAYOUT$uint64 = (OfLong) LAYOUT.select(PATH$uint64);
    public static final OfFloat LAYOUT$float32 = (OfFloat) LAYOUT.select(PATH$float32);
    public static final OfDouble LAYOUT$float64 = (OfDouble) LAYOUT.select(PATH$float64);

    public static final long OFFSET$int32 = LAYOUT.byteOffset(PATH$int32);
    public static final long OFFSET$int64 = LAYOUT.byteOffset(PATH$int64);
    public static final long OFFSET$uint32 = LAYOUT.byteOffset(PATH$uint32);
    public static final long OFFSET$uint64 = LAYOUT.byteOffset(PATH$uint64);
    public static final long OFFSET$float32 = LAYOUT.byteOffset(PATH$float32);
    public static final long OFFSET$float64 = LAYOUT.byteOffset(PATH$float64);

    public VkPerformanceCounterResultKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public int int32() {
        return segment.get(LAYOUT$int32, OFFSET$int32);
    }

    public void int32(int value) {
        segment.set(LAYOUT$int32, OFFSET$int32, value);
    }

    public long int64() {
        return segment.get(LAYOUT$int64, OFFSET$int64);
    }

    public void int64(long value) {
        segment.set(LAYOUT$int64, OFFSET$int64, value);
    }

    public @unsigned int uint32() {
        return segment.get(LAYOUT$uint32, OFFSET$uint32);
    }

    public void uint32(@unsigned int value) {
        segment.set(LAYOUT$uint32, OFFSET$uint32, value);
    }

    public @unsigned long uint64() {
        return segment.get(LAYOUT$uint64, OFFSET$uint64);
    }

    public void uint64(@unsigned long value) {
        segment.set(LAYOUT$uint64, OFFSET$uint64, value);
    }

    public float float32() {
        return segment.get(LAYOUT$float32, OFFSET$float32);
    }

    public void float32(float value) {
        segment.set(LAYOUT$float32, OFFSET$float32, value);
    }

    public double float64() {
        return segment.get(LAYOUT$float64, OFFSET$float64);
    }

    public void float64(double value) {
        segment.set(LAYOUT$float64, OFFSET$float64, value);
    }


    public static final class Factory implements IFactory<VkPerformanceCounterResultKHR> {
        @Override
        public Class<VkPerformanceCounterResultKHR> clazz() {
            return VkPerformanceCounterResultKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPerformanceCounterResultKHR.LAYOUT;
        }

        @Override
        public VkPerformanceCounterResultKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPerformanceCounterResultKHR createUninit(MemorySegment segment) {
            return new VkPerformanceCounterResultKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
