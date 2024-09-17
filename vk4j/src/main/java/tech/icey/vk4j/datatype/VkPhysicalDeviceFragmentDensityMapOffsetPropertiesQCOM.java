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

public record VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("fragmentDensityOffsetGranularity")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentDensityOffsetGranularity = PathElement.groupElement("fragmentDensityOffsetGranularity");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$fragmentDensityOffsetGranularity = (StructLayout) LAYOUT.select(PATH$fragmentDensityOffsetGranularity);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityOffsetGranularity = LAYOUT.byteOffset(PATH$fragmentDensityOffsetGranularity);

    public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_OFFSET_PROPERTIES_QCOM);
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

    public VkExtent2D fragmentDensityOffsetGranularity() {
        return new VkExtent2D(segment.asSlice(OFFSET$fragmentDensityOffsetGranularity, LAYOUT$fragmentDensityOffsetGranularity));
    }

    public void fragmentDensityOffsetGranularity(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fragmentDensityOffsetGranularity, LAYOUT$fragmentDensityOffsetGranularity.byteSize());
    }


    public static final class VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOMFactory implements IFactory<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM> {
        @Override
        public Class<VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM> clazz() {
            return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOM(segment);
        }
    }

    public static final VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOMFactory FACTORY = new VkPhysicalDeviceFragmentDensityMapOffsetPropertiesQCOMFactory();
}
