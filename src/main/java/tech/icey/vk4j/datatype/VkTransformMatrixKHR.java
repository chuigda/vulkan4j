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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

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


    public static final class VkTransformMatrixKHRFactory implements IDataTypeFactory<VkTransformMatrixKHR> {
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

    public static final VkTransformMatrixKHRFactory FACTORY = new VkTransformMatrixKHRFactory();
}
