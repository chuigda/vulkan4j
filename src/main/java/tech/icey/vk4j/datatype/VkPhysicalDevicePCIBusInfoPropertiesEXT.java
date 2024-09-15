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

public record VkPhysicalDevicePCIBusInfoPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pciDomain"),
        ValueLayout.JAVA_INT.withName("pciBus"),
        ValueLayout.JAVA_INT.withName("pciDevice"),
        ValueLayout.JAVA_INT.withName("pciFunction")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pciDomain = PathElement.groupElement(2);
    public static final PathElement PATH$pciBus = PathElement.groupElement(3);
    public static final PathElement PATH$pciDevice = PathElement.groupElement(4);
    public static final PathElement PATH$pciFunction = PathElement.groupElement(5);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pciDomain = (OfInt) LAYOUT.select(PATH$pciDomain);
    public static final OfInt LAYOUT$pciBus = (OfInt) LAYOUT.select(PATH$pciBus);
    public static final OfInt LAYOUT$pciDevice = (OfInt) LAYOUT.select(PATH$pciDevice);
    public static final OfInt LAYOUT$pciFunction = (OfInt) LAYOUT.select(PATH$pciFunction);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pciDomain = LAYOUT.byteOffset(PATH$pciDomain);
    public static final long OFFSET$pciBus = LAYOUT.byteOffset(PATH$pciBus);
    public static final long OFFSET$pciDevice = LAYOUT.byteOffset(PATH$pciDevice);
    public static final long OFFSET$pciFunction = LAYOUT.byteOffset(PATH$pciFunction);

    public VkPhysicalDevicePCIBusInfoPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PCI_BUS_INFO_PROPERTIES_EXT);
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

    public @unsigned int pciDomain() {
        return segment.get(LAYOUT$pciDomain, OFFSET$pciDomain);
    }

    public void pciDomain(@unsigned int value) {
        segment.set(LAYOUT$pciDomain, OFFSET$pciDomain, value);
    }

    public @unsigned int pciBus() {
        return segment.get(LAYOUT$pciBus, OFFSET$pciBus);
    }

    public void pciBus(@unsigned int value) {
        segment.set(LAYOUT$pciBus, OFFSET$pciBus, value);
    }

    public @unsigned int pciDevice() {
        return segment.get(LAYOUT$pciDevice, OFFSET$pciDevice);
    }

    public void pciDevice(@unsigned int value) {
        segment.set(LAYOUT$pciDevice, OFFSET$pciDevice, value);
    }

    public @unsigned int pciFunction() {
        return segment.get(LAYOUT$pciFunction, OFFSET$pciFunction);
    }

    public void pciFunction(@unsigned int value) {
        segment.set(LAYOUT$pciFunction, OFFSET$pciFunction, value);
    }


    public static final class VkPhysicalDevicePCIBusInfoPropertiesEXTFactory implements IDataTypeFactory<VkPhysicalDevicePCIBusInfoPropertiesEXT> {
        @Override
        public Class<VkPhysicalDevicePCIBusInfoPropertiesEXT> clazz() {
            return VkPhysicalDevicePCIBusInfoPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDevicePCIBusInfoPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDevicePCIBusInfoPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDevicePCIBusInfoPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDevicePCIBusInfoPropertiesEXTFactory FACTORY = new VkPhysicalDevicePCIBusInfoPropertiesEXTFactory();
}
