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

public record VkDedicatedAllocationBufferCreateInfoNV(MemorySegment segment) {
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

    public VkDedicatedAllocationBufferCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEDICATED_ALLOCATION_BUFFER_CREATE_INFO_NV);
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


    public static final class VkDedicatedAllocationBufferCreateInfoNVFactory implements IFactory<VkDedicatedAllocationBufferCreateInfoNV> {
        @Override
        public Class<VkDedicatedAllocationBufferCreateInfoNV> clazz() {
            return VkDedicatedAllocationBufferCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDedicatedAllocationBufferCreateInfoNV.LAYOUT;
        }

        @Override
        public VkDedicatedAllocationBufferCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDedicatedAllocationBufferCreateInfoNV createUninit(MemorySegment segment) {
            return new VkDedicatedAllocationBufferCreateInfoNV(segment);
        }
    }

    public static final VkDedicatedAllocationBufferCreateInfoNVFactory FACTORY = new VkDedicatedAllocationBufferCreateInfoNVFactory();
}
