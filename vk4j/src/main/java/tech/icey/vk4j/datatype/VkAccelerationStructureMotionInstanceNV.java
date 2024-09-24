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

public record VkAccelerationStructureMotionInstanceNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("flags"),
        VkAccelerationStructureMotionInstanceDataNV.LAYOUT.withName("data")
    );

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$data = PathElement.groupElement("data");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final UnionLayout LAYOUT$data = (UnionLayout) LAYOUT.select(PATH$data);

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);

    public VkAccelerationStructureMotionInstanceNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkAccelerationStructureMotionInstanceTypeNV.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkAccelerationStructureMotionInstanceTypeNV.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @enumtype(VkAccelerationStructureMotionInstanceFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkAccelerationStructureMotionInstanceFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public VkAccelerationStructureMotionInstanceDataNV data() {
        return new VkAccelerationStructureMotionInstanceDataNV(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public void data(VkAccelerationStructureMotionInstanceDataNV value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, LAYOUT$data.byteSize());
    }


    public static final class Factory implements IFactory<VkAccelerationStructureMotionInstanceNV> {
        @Override
        public Class<VkAccelerationStructureMotionInstanceNV> clazz() {
            return VkAccelerationStructureMotionInstanceNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureMotionInstanceNV.LAYOUT;
        }

        @Override
        public VkAccelerationStructureMotionInstanceNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAccelerationStructureMotionInstanceNV createUninit(MemorySegment segment) {
            return new VkAccelerationStructureMotionInstanceNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
