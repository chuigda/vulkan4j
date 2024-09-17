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

public record VkPhysicalDeviceSynchronization2Features(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("synchronization2")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$synchronization2 = PathElement.groupElement("synchronization2");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$synchronization2 = (OfInt) LAYOUT.select(PATH$synchronization2);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$synchronization2 = LAYOUT.byteOffset(PATH$synchronization2);

    public VkPhysicalDeviceSynchronization2Features(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SYNCHRONIZATION_2_FEATURES);
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

    public @unsigned int synchronization2() {
        return segment.get(LAYOUT$synchronization2, OFFSET$synchronization2);
    }

    public void synchronization2(@unsigned int value) {
        segment.set(LAYOUT$synchronization2, OFFSET$synchronization2, value);
    }


    public static final class VkPhysicalDeviceSynchronization2FeaturesFactory implements IFactory<VkPhysicalDeviceSynchronization2Features> {
        @Override
        public Class<VkPhysicalDeviceSynchronization2Features> clazz() {
            return VkPhysicalDeviceSynchronization2Features.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceSynchronization2Features.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceSynchronization2Features create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceSynchronization2Features createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceSynchronization2Features(segment);
        }
    }

    public static final VkPhysicalDeviceSynchronization2FeaturesFactory FACTORY = new VkPhysicalDeviceSynchronization2FeaturesFactory();
}
