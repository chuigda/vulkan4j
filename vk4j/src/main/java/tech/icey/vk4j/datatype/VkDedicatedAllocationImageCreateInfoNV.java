package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDedicatedAllocationImageCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dedicatedAllocation")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$dedicatedAllocation = PathElement.groupElement("dedicatedAllocation");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$dedicatedAllocation = (OfInt) LAYOUT.select(PATH$dedicatedAllocation);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dedicatedAllocation = LAYOUT.byteOffset(PATH$dedicatedAllocation);

    public VkDedicatedAllocationImageCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_IMAGE_CREATE_INFO_NV);
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

    public @unsigned int dedicatedAllocation() {
        return segment.get(LAYOUT$dedicatedAllocation, OFFSET$dedicatedAllocation);
    }

    public void dedicatedAllocation(@unsigned int value) {
        segment.set(LAYOUT$dedicatedAllocation, OFFSET$dedicatedAllocation, value);
    }


    public static final class Factory implements IFactory<VkDedicatedAllocationImageCreateInfoNV> {
        @Override
        public Class<VkDedicatedAllocationImageCreateInfoNV> clazz() {
            return VkDedicatedAllocationImageCreateInfoNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDedicatedAllocationImageCreateInfoNV.LAYOUT;
        }

        @Override
        public VkDedicatedAllocationImageCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDedicatedAllocationImageCreateInfoNV createUninit(MemorySegment segment) {
            return new VkDedicatedAllocationImageCreateInfoNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
