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

public record VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subsampledLoads"),
        ValueLayout.JAVA_INT.withName("subsampledCoarseReconstructionEarlyAccess"),
        ValueLayout.JAVA_INT.withName("maxSubsampledArrayLayers"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetSubsampledSamplers")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$subsampledLoads = PathElement.groupElement("subsampledLoads");
    public static final PathElement PATH$subsampledCoarseReconstructionEarlyAccess = PathElement.groupElement("subsampledCoarseReconstructionEarlyAccess");
    public static final PathElement PATH$maxSubsampledArrayLayers = PathElement.groupElement("maxSubsampledArrayLayers");
    public static final PathElement PATH$maxDescriptorSetSubsampledSamplers = PathElement.groupElement("maxDescriptorSetSubsampledSamplers");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$subsampledLoads = (OfInt) LAYOUT.select(PATH$subsampledLoads);
    public static final OfInt LAYOUT$subsampledCoarseReconstructionEarlyAccess = (OfInt) LAYOUT.select(PATH$subsampledCoarseReconstructionEarlyAccess);
    public static final OfInt LAYOUT$maxSubsampledArrayLayers = (OfInt) LAYOUT.select(PATH$maxSubsampledArrayLayers);
    public static final OfInt LAYOUT$maxDescriptorSetSubsampledSamplers = (OfInt) LAYOUT.select(PATH$maxDescriptorSetSubsampledSamplers);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$subsampledLoads = LAYOUT.byteOffset(PATH$subsampledLoads);
    public static final long OFFSET$subsampledCoarseReconstructionEarlyAccess = LAYOUT.byteOffset(PATH$subsampledCoarseReconstructionEarlyAccess);
    public static final long OFFSET$maxSubsampledArrayLayers = LAYOUT.byteOffset(PATH$maxSubsampledArrayLayers);
    public static final long OFFSET$maxDescriptorSetSubsampledSamplers = LAYOUT.byteOffset(PATH$maxDescriptorSetSubsampledSamplers);

    public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_2_PROPERTIES_EXT);
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

    public @unsigned int subsampledLoads() {
        return segment.get(LAYOUT$subsampledLoads, OFFSET$subsampledLoads);
    }

    public void subsampledLoads(@unsigned int value) {
        segment.set(LAYOUT$subsampledLoads, OFFSET$subsampledLoads, value);
    }

    public @unsigned int subsampledCoarseReconstructionEarlyAccess() {
        return segment.get(LAYOUT$subsampledCoarseReconstructionEarlyAccess, OFFSET$subsampledCoarseReconstructionEarlyAccess);
    }

    public void subsampledCoarseReconstructionEarlyAccess(@unsigned int value) {
        segment.set(LAYOUT$subsampledCoarseReconstructionEarlyAccess, OFFSET$subsampledCoarseReconstructionEarlyAccess, value);
    }

    public @unsigned int maxSubsampledArrayLayers() {
        return segment.get(LAYOUT$maxSubsampledArrayLayers, OFFSET$maxSubsampledArrayLayers);
    }

    public void maxSubsampledArrayLayers(@unsigned int value) {
        segment.set(LAYOUT$maxSubsampledArrayLayers, OFFSET$maxSubsampledArrayLayers, value);
    }

    public @unsigned int maxDescriptorSetSubsampledSamplers() {
        return segment.get(LAYOUT$maxDescriptorSetSubsampledSamplers, OFFSET$maxDescriptorSetSubsampledSamplers);
    }

    public void maxDescriptorSetSubsampledSamplers(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetSubsampledSamplers, OFFSET$maxDescriptorSetSubsampledSamplers, value);
    }


    public static final class VkPhysicalDeviceFragmentDensityMap2PropertiesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceFragmentDensityMap2PropertiesEXT> clazz() {
            return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceFragmentDensityMap2PropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceFragmentDensityMap2PropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceFragmentDensityMap2PropertiesEXTFactory FACTORY = new VkPhysicalDeviceFragmentDensityMap2PropertiesEXTFactory();
}
