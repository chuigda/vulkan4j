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

public record VkAccelerationStructureInstanceKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkTransformMatrixKHR.LAYOUT.withName("transform"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceCustomIndex_mask"),
        ValueLayout.JAVA_INT.withName("bitfield$instanceShaderBindingTableRecordOffset_flags"),
        ValueLayout.JAVA_LONG.withName("accelerationStructureReference")
    );

    public static final PathElement PATH$transform = PathElement.groupElement(0);
    public static final PathElement PATH$bitfield$instanceCustomIndex_mask = PathElement.groupElement(1);
    public static final PathElement PATH$bitfield$instanceShaderBindingTableRecordOffset_flags = PathElement.groupElement(2);
    public static final PathElement PATH$accelerationStructureReference = PathElement.groupElement(3);

    public static final StructLayout LAYOUT$transform = (StructLayout) LAYOUT.select(PATH$transform);
    public static final OfInt LAYOUT$bitfield$instanceCustomIndex_mask = (OfInt) LAYOUT.select(PATH$bitfield$instanceCustomIndex_mask);
    public static final OfInt LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags = (OfInt) LAYOUT.select(PATH$bitfield$instanceShaderBindingTableRecordOffset_flags);
    public static final OfLong LAYOUT$accelerationStructureReference = (OfLong) LAYOUT.select(PATH$accelerationStructureReference);

    public static final long OFFSET$transform = LAYOUT.byteOffset(PATH$transform);
    public static final long OFFSET$bitfield$instanceCustomIndex_mask = LAYOUT.byteOffset(PATH$bitfield$instanceCustomIndex_mask);
    public static final long OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags = LAYOUT.byteOffset(PATH$bitfield$instanceShaderBindingTableRecordOffset_flags);
    public static final long OFFSET$accelerationStructureReference = LAYOUT.byteOffset(PATH$accelerationStructureReference);

    public VkAccelerationStructureInstanceKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkTransformMatrixKHR transform() {
        return new VkTransformMatrixKHR(segment.asSlice(OFFSET$transform, LAYOUT$transform));
    }

    public void transform(VkTransformMatrixKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$transform, LAYOUT$transform.byteSize());
    }

    public int instanceCustomIndex() {
        return segment.get(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask) >> 8;
    }

    public void instanceCustomIndex(int value) {
        int original = segment.get(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask);
        int newValue = (value << 8) | (original & 0xFF);
        segment.set(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask, newValue);
    }

    public int mask() {
        return segment.get(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask) & 0xFF;
    }

    public void mask(int value) {
        int original = segment.get(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask);
        int newValue = (original & 0xFF00) | value;
        segment.set(LAYOUT$bitfield$instanceCustomIndex_mask, OFFSET$bitfield$instanceCustomIndex_mask, newValue);
    }

    public int instanceShaderBindingTableRecordOffset() {
        return segment.get(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags) >> 8;
    }

    public void instanceShaderBindingTableRecordOffset(int value) {
        int original = segment.get(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags);
        int newValue = (value << 8) | (original & 0xFF);
        segment.set(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags, newValue);
    }

    public int flags() {
        return segment.get(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags) & 0xFF;
    }

    public void flags(int value) {
        int original = segment.get(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags);
        int newValue = (original & 0xFF00) | value;
        segment.set(LAYOUT$bitfield$instanceShaderBindingTableRecordOffset_flags, OFFSET$bitfield$instanceShaderBindingTableRecordOffset_flags, newValue);
    }

    public @unsigned long accelerationStructureReference() {
        return segment.get(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference);
    }

    public void accelerationStructureReference(@unsigned long value) {
        segment.set(LAYOUT$accelerationStructureReference, OFFSET$accelerationStructureReference, value);
    }


    public static final class VkAccelerationStructureInstanceKHRFactory implements IDataTypeFactory<VkAccelerationStructureInstanceKHR> {
        @Override
        public Class<VkAccelerationStructureInstanceKHR> clazz() {
            return VkAccelerationStructureInstanceKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureInstanceKHR.LAYOUT;
        }

        @Override
        public VkAccelerationStructureInstanceKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAccelerationStructureInstanceKHR createUninit(MemorySegment segment) {
            return new VkAccelerationStructureInstanceKHR(segment);
        }
    }

    public static final VkAccelerationStructureInstanceKHRFactory FACTORY = new VkAccelerationStructureInstanceKHRFactory();
}
