package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.array.FloatArray;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SequenceLayout;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.PathElement;

public record VkTransformMatrixKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(3 * 4, ValueLayout.JAVA_FLOAT).withName("matrix")
    );

    public static final PathElement PATH$matrix = PathElement.groupElement("matrix");

    public static final SequenceLayout LAYOUT$matrix = (SequenceLayout) LAYOUT.select(PATH$matrix);

    public static final long OFFSET$matrix = LAYOUT.byteOffset(PATH$matrix);

    public VkTransformMatrixKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment matrixRaw() {
        return segment.asSlice(OFFSET$matrix, LAYOUT$matrix.byteSize());
    }

    public FloatArray matrix() {
        return new FloatArray(matrixRaw(), LAYOUT$matrix.elementCount());
    }

    public void matrix(FloatArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$matrix, LAYOUT$matrix.byteSize());
    }


    public static final class Factory implements IFactory<VkTransformMatrixKHR> {
        @Override
        public Class<VkTransformMatrixKHR> clazz() {
            return VkTransformMatrixKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkTransformMatrixKHR.LAYOUT;
        }

        @Override
        public VkTransformMatrixKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkTransformMatrixKHR createUninit(MemorySegment segment) {
            return new VkTransformMatrixKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
