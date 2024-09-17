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

public record VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSetHostMapping")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorSetHostMapping = PathElement.groupElement("descriptorSetHostMapping");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$descriptorSetHostMapping = (OfInt) LAYOUT.select(PATH$descriptorSetHostMapping);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorSetHostMapping = LAYOUT.byteOffset(PATH$descriptorSetHostMapping);

    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE);
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

    public @unsigned int descriptorSetHostMapping() {
        return segment.get(LAYOUT$descriptorSetHostMapping, OFFSET$descriptorSetHostMapping);
    }

    public void descriptorSetHostMapping(@unsigned int value) {
        segment.set(LAYOUT$descriptorSetHostMapping, OFFSET$descriptorSetHostMapping, value);
    }


    public static final class VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVEFactory implements IFactory<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> {
        @Override
        public Class<VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE> clazz() {
            return VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(segment);
        }
    }

    public static final VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVEFactory FACTORY = new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVEFactory();
}
