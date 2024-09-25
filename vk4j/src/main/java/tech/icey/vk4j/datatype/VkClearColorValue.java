package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.unsigned;
import tech.icey.vk4j.array.FloatArray;
import tech.icey.vk4j.array.IntArray;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.PathElement;

public record VkClearColorValue(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("float32"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("int32"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_INT).withName("uint32")
    );

    public static final PathElement PATH$float32 = PathElement.groupElement("float32");
    public static final PathElement PATH$int32 = PathElement.groupElement("int32");
    public static final PathElement PATH$uint32 = PathElement.groupElement("uint32");

    public static final SequenceLayout LAYOUT$float32 = (SequenceLayout) LAYOUT.select(PATH$float32);
    public static final SequenceLayout LAYOUT$int32 = (SequenceLayout) LAYOUT.select(PATH$int32);
    public static final SequenceLayout LAYOUT$uint32 = (SequenceLayout) LAYOUT.select(PATH$uint32);

    public static final long OFFSET$float32 = LAYOUT.byteOffset(PATH$float32);
    public static final long OFFSET$int32 = LAYOUT.byteOffset(PATH$int32);
    public static final long OFFSET$uint32 = LAYOUT.byteOffset(PATH$uint32);

    public VkClearColorValue(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment float32Raw() {
        return segment.asSlice(OFFSET$float32, LAYOUT$float32.byteSize());
    }

    public FloatArray float32() {
        return new FloatArray(float32Raw(), LAYOUT$float32.elementCount());
    }

    public void float32(FloatArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$float32, LAYOUT$float32.byteSize());
    }

    public MemorySegment int32Raw() {
        return segment.asSlice(OFFSET$int32, LAYOUT$int32.byteSize());
    }

    public IntArray int32() {
        return new IntArray(int32Raw(), LAYOUT$int32.elementCount());
    }

    public void int32(IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$int32, LAYOUT$int32.byteSize());
    }

    public MemorySegment uint32Raw() {
        return segment.asSlice(OFFSET$uint32, LAYOUT$uint32.byteSize());
    }

    public @unsigned IntArray uint32() {
        return new IntArray(uint32Raw(), LAYOUT$uint32.elementCount());
    }

    public void uint32(@unsigned IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$uint32, LAYOUT$uint32.byteSize());
    }


    public static final class Factory implements IFactory<VkClearColorValue> {
        @Override
        public Class<VkClearColorValue> clazz() {
            return VkClearColorValue.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkClearColorValue.LAYOUT;
        }

        @Override
        public VkClearColorValue create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkClearColorValue createUninit(MemorySegment segment) {
            return new VkClearColorValue(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
