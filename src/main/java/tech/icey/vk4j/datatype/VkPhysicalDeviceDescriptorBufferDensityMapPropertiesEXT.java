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

public record VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        NativeLayout.C_SIZE_T.withName("combinedImageSamplerDensityMapDescriptorSize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$combinedImageSamplerDensityMapDescriptorSize = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$combinedImageSamplerDensityMapDescriptorSize = LAYOUT.byteOffset(PATH$combinedImageSamplerDensityMapDescriptorSize);

    public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_BUFFER_DENSITY_MAP_PROPERTIES_EXT);
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

    public @unsigned long combinedImageSamplerDensityMapDescriptorSize() {
            return NativeLayout.readCSizeT(segment, OFFSET$combinedImageSamplerDensityMapDescriptorSize);
        }
    
        public void combinedImageSamplerDensityMapDescriptorSize(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$combinedImageSamplerDensityMapDescriptorSize, value);
        }


    public static final class VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT> clazz() {
            return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXTFactory FACTORY = new VkPhysicalDeviceDescriptorBufferDensityMapPropertiesEXTFactory();
}
