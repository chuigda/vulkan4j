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

public record VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("extendedSparseAddressSpaceSize"),
        ValueLayout.JAVA_INT.withName("extendedSparseImageUsageFlags"),
        ValueLayout.JAVA_INT.withName("extendedSparseBufferUsageFlags")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$extendedSparseAddressSpaceSize = PathElement.groupElement("extendedSparseAddressSpaceSize");
    public static final PathElement PATH$extendedSparseImageUsageFlags = PathElement.groupElement("extendedSparseImageUsageFlags");
    public static final PathElement PATH$extendedSparseBufferUsageFlags = PathElement.groupElement("extendedSparseBufferUsageFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$extendedSparseAddressSpaceSize = (OfLong) LAYOUT.select(PATH$extendedSparseAddressSpaceSize);
    public static final OfInt LAYOUT$extendedSparseImageUsageFlags = (OfInt) LAYOUT.select(PATH$extendedSparseImageUsageFlags);
    public static final OfInt LAYOUT$extendedSparseBufferUsageFlags = (OfInt) LAYOUT.select(PATH$extendedSparseBufferUsageFlags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$extendedSparseAddressSpaceSize = LAYOUT.byteOffset(PATH$extendedSparseAddressSpaceSize);
    public static final long OFFSET$extendedSparseImageUsageFlags = LAYOUT.byteOffset(PATH$extendedSparseImageUsageFlags);
    public static final long OFFSET$extendedSparseBufferUsageFlags = LAYOUT.byteOffset(PATH$extendedSparseBufferUsageFlags);

    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV);
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

    public @unsigned long extendedSparseAddressSpaceSize() {
        return segment.get(LAYOUT$extendedSparseAddressSpaceSize, OFFSET$extendedSparseAddressSpaceSize);
    }

    public void extendedSparseAddressSpaceSize(@unsigned long value) {
        segment.set(LAYOUT$extendedSparseAddressSpaceSize, OFFSET$extendedSparseAddressSpaceSize, value);
    }

    public @enumtype(VkImageUsageFlags.class) int extendedSparseImageUsageFlags() {
        return segment.get(LAYOUT$extendedSparseImageUsageFlags, OFFSET$extendedSparseImageUsageFlags);
    }

    public void extendedSparseImageUsageFlags(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$extendedSparseImageUsageFlags, OFFSET$extendedSparseImageUsageFlags, value);
    }

    public @enumtype(VkBufferUsageFlags.class) int extendedSparseBufferUsageFlags() {
        return segment.get(LAYOUT$extendedSparseBufferUsageFlags, OFFSET$extendedSparseBufferUsageFlags);
    }

    public void extendedSparseBufferUsageFlags(@enumtype(VkBufferUsageFlags.class) int value) {
        segment.set(LAYOUT$extendedSparseBufferUsageFlags, OFFSET$extendedSparseBufferUsageFlags, value);
    }


    public static final class VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNVFactory implements IFactory<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV> {
        @Override
        public Class<VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV> clazz() {
            return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(segment);
        }
    }

    public static final VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNVFactory FACTORY = new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNVFactory();
}