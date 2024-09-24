package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkPerformanceValueINTEL(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        VkPerformanceValueDataINTEL.LAYOUT.withName("data")
    );

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$data = PathElement.groupElement("data");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final UnionLayout LAYOUT$data = (UnionLayout) LAYOUT.select(PATH$data);

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);

    public VkPerformanceValueINTEL(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkPerformanceValueTypeINTEL.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkPerformanceValueTypeINTEL.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public VkPerformanceValueDataINTEL data() {
        return new VkPerformanceValueDataINTEL(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(VkPerformanceValueDataINTEL value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, LAYOUT$data.byteSize());
    }


    public static final class Factory implements IFactory<VkPerformanceValueINTEL> {
        @Override
        public Class<VkPerformanceValueINTEL> clazz() {
            return VkPerformanceValueINTEL.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPerformanceValueINTEL.LAYOUT;
        }

        @Override
        public VkPerformanceValueINTEL create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPerformanceValueINTEL createUninit(MemorySegment segment) {
            return new VkPerformanceValueINTEL(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
