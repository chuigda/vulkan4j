package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkAccelerationStructureMotionInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInstances"),
        ValueLayout.JAVA_INT.withName("flags")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxInstances = PathElement.groupElement("maxInstances");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxInstances = (OfInt) LAYOUT.select(PATH$maxInstances);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxInstances = LAYOUT.byteOffset(PATH$maxInstances);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public VkAccelerationStructureMotionInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACCELERATION_STRUCTURE_MOTION_INFO_NV);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public @unsigned int maxInstances() {
        return segment.get(LAYOUT$maxInstances, OFFSET$maxInstances);
    }

    public void maxInstances(@unsigned int value) {
        segment.set(LAYOUT$maxInstances, OFFSET$maxInstances, value);
    }

    public @enumtype(VkAccelerationStructureMotionInfoFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkAccelerationStructureMotionInfoFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }


    public static final class Factory implements IFactory<VkAccelerationStructureMotionInfoNV> {
        @Override
        public Class<VkAccelerationStructureMotionInfoNV> clazz() {
            return VkAccelerationStructureMotionInfoNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureMotionInfoNV.LAYOUT;
        }

        @Override
        public VkAccelerationStructureMotionInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAccelerationStructureMotionInfoNV createUninit(MemorySegment segment) {
            return new VkAccelerationStructureMotionInfoNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
