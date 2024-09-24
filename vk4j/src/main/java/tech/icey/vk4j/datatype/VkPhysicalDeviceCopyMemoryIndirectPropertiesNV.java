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

public record VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedQueues")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$supportedQueues = PathElement.groupElement("supportedQueues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$supportedQueues = (OfInt) LAYOUT.select(PATH$supportedQueues);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$supportedQueues = LAYOUT.byteOffset(PATH$supportedQueues);

    public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_COPY_MEMORY_INDIRECT_PROPERTIES_NV);
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

    public @enumtype(VkQueueFlags.class) int supportedQueues() {
        return segment.get(LAYOUT$supportedQueues, OFFSET$supportedQueues);
    }

    public void supportedQueues(@enumtype(VkQueueFlags.class) int value) {
        segment.set(LAYOUT$supportedQueues, OFFSET$supportedQueues, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceCopyMemoryIndirectPropertiesNV> {
        @Override
        public Class<VkPhysicalDeviceCopyMemoryIndirectPropertiesNV> clazz() {
            return VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceCopyMemoryIndirectPropertiesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceCopyMemoryIndirectPropertiesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceCopyMemoryIndirectPropertiesNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
