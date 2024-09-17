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

public record VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedSparseAddressSpace")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$extendedSparseAddressSpace = PathElement.groupElement("extendedSparseAddressSpace");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$extendedSparseAddressSpace = (OfInt) LAYOUT.select(PATH$extendedSparseAddressSpace);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$extendedSparseAddressSpace = LAYOUT.byteOffset(PATH$extendedSparseAddressSpace);

    public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_FEATURES_NV);
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

    public @unsigned int extendedSparseAddressSpace() {
        return segment.get(LAYOUT$extendedSparseAddressSpace, OFFSET$extendedSparseAddressSpace);
    }

    public void extendedSparseAddressSpace(@unsigned int value) {
        segment.set(LAYOUT$extendedSparseAddressSpace, OFFSET$extendedSparseAddressSpace, value);
    }


    public static final class VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNVFactory implements IDataTypeFactory<VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV> clazz() {
            return VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNVFactory FACTORY = new VkPhysicalDeviceExtendedSparseAddressSpaceFeaturesNVFactory();
}
