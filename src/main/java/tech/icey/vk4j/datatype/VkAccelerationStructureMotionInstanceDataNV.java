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

public record VkAccelerationStructureMotionInstanceDataNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        VkAccelerationStructureInstanceKHR.LAYOUT.withName("staticInstance"),
        VkAccelerationStructureMatrixMotionInstanceNV.LAYOUT.withName("matrixMotionInstance"),
        VkAccelerationStructureSRTMotionInstanceNV.LAYOUT.withName("srtMotionInstance")
    );

    public static final PathElement PATH$staticInstance = PathElement.groupElement("staticInstance");
    public static final PathElement PATH$matrixMotionInstance = PathElement.groupElement("matrixMotionInstance");
    public static final PathElement PATH$srtMotionInstance = PathElement.groupElement("srtMotionInstance");

    public static final StructLayout LAYOUT$staticInstance = (StructLayout) LAYOUT.select(PATH$staticInstance);
    public static final StructLayout LAYOUT$matrixMotionInstance = (StructLayout) LAYOUT.select(PATH$matrixMotionInstance);
    public static final StructLayout LAYOUT$srtMotionInstance = (StructLayout) LAYOUT.select(PATH$srtMotionInstance);

    public static final long OFFSET$staticInstance = LAYOUT.byteOffset(PATH$staticInstance);
    public static final long OFFSET$matrixMotionInstance = LAYOUT.byteOffset(PATH$matrixMotionInstance);
    public static final long OFFSET$srtMotionInstance = LAYOUT.byteOffset(PATH$srtMotionInstance);

    public VkAccelerationStructureMotionInstanceDataNV(MemorySegment segment) {
        this.segment = segment;
    }

    public VkAccelerationStructureInstanceKHR staticInstance() {
        return new VkAccelerationStructureInstanceKHR(segment.asSlice(OFFSET$staticInstance, LAYOUT$staticInstance));
    }

    public void staticInstance(VkAccelerationStructureInstanceKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$staticInstance, LAYOUT$staticInstance.byteSize());
    }

    public VkAccelerationStructureMatrixMotionInstanceNV matrixMotionInstance() {
        return new VkAccelerationStructureMatrixMotionInstanceNV(segment.asSlice(OFFSET$matrixMotionInstance, LAYOUT$matrixMotionInstance));
    }

    public void matrixMotionInstance(VkAccelerationStructureMatrixMotionInstanceNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$matrixMotionInstance, LAYOUT$matrixMotionInstance.byteSize());
    }

    public VkAccelerationStructureSRTMotionInstanceNV srtMotionInstance() {
        return new VkAccelerationStructureSRTMotionInstanceNV(segment.asSlice(OFFSET$srtMotionInstance, LAYOUT$srtMotionInstance));
    }

    public void srtMotionInstance(VkAccelerationStructureSRTMotionInstanceNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srtMotionInstance, LAYOUT$srtMotionInstance.byteSize());
    }


    public static final class VkAccelerationStructureMotionInstanceDataNVFactory implements IFactory<VkAccelerationStructureMotionInstanceDataNV> {
        @Override
        public Class<VkAccelerationStructureMotionInstanceDataNV> clazz() {
            return VkAccelerationStructureMotionInstanceDataNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureMotionInstanceDataNV.LAYOUT;
        }

        @Override
        public VkAccelerationStructureMotionInstanceDataNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAccelerationStructureMotionInstanceDataNV createUninit(MemorySegment segment) {
            return new VkAccelerationStructureMotionInstanceDataNV(segment);
        }
    }

    public static final VkAccelerationStructureMotionInstanceDataNVFactory FACTORY = new VkAccelerationStructureMotionInstanceDataNVFactory();
}
