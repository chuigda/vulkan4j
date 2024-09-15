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

public record VkSampleLocationsInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationsPerPixel"),
        VkExtent2D.LAYOUT.withName("sampleLocationGridSize"),
        ValueLayout.JAVA_INT.withName("sampleLocationsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSampleLocationEXT.LAYOUT).withName("pSampleLocations")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$sampleLocationsPerPixel = PathElement.groupElement(2);
    public static final PathElement PATH$sampleLocationGridSize = PathElement.groupElement(3);
    public static final PathElement PATH$sampleLocationsCount = PathElement.groupElement(4);
    public static final PathElement PATH$pSampleLocations = PathElement.groupElement(5);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sampleLocationsPerPixel = (OfInt) LAYOUT.select(PATH$sampleLocationsPerPixel);
    public static final StructLayout LAYOUT$sampleLocationGridSize = (StructLayout) LAYOUT.select(PATH$sampleLocationGridSize);
    public static final OfInt LAYOUT$sampleLocationsCount = (OfInt) LAYOUT.select(PATH$sampleLocationsCount);
    public static final AddressLayout LAYOUT$pSampleLocations = (AddressLayout) LAYOUT.select(PATH$pSampleLocations);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sampleLocationsPerPixel = LAYOUT.byteOffset(PATH$sampleLocationsPerPixel);
    public static final long OFFSET$sampleLocationGridSize = LAYOUT.byteOffset(PATH$sampleLocationGridSize);
    public static final long OFFSET$sampleLocationsCount = LAYOUT.byteOffset(PATH$sampleLocationsCount);
    public static final long OFFSET$pSampleLocations = LAYOUT.byteOffset(PATH$pSampleLocations);

    public VkSampleLocationsInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLE_LOCATIONS_INFO_EXT);
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

    public @enumtype(VkSampleCountFlags.class) int sampleLocationsPerPixel() {
        return segment.get(LAYOUT$sampleLocationsPerPixel, OFFSET$sampleLocationsPerPixel);
    }

    public void sampleLocationsPerPixel(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$sampleLocationsPerPixel, OFFSET$sampleLocationsPerPixel, value);
    }

    public VkExtent2D sampleLocationGridSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$sampleLocationGridSize, LAYOUT$sampleLocationGridSize));
    }

    public void sampleLocationGridSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationGridSize, LAYOUT$sampleLocationGridSize.byteSize());
    }

    public @unsigned int sampleLocationsCount() {
        return segment.get(LAYOUT$sampleLocationsCount, OFFSET$sampleLocationsCount);
    }

    public void sampleLocationsCount(@unsigned int value) {
        segment.set(LAYOUT$sampleLocationsCount, OFFSET$sampleLocationsCount, value);
    }

    public @pointer(comment="VkSampleLocationEXT*") MemorySegment pSampleLocationsRaw() {
        return segment.get(LAYOUT$pSampleLocations, OFFSET$pSampleLocations);
    }

    public void pSampleLocationsRaw(@pointer(comment="VkSampleLocationEXT*") MemorySegment value) {
        segment.set(LAYOUT$pSampleLocations, OFFSET$pSampleLocations, value);
    }
    
    public VkSampleLocationEXT pSampleLocations() {
        MemorySegment s = pSampleLocationsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSampleLocationEXT(s);
    }

    public void pSampleLocations(VkSampleLocationEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSampleLocationsRaw(s);
    }


    public static final class VkSampleLocationsInfoEXTFactory implements IDataTypeFactory<VkSampleLocationsInfoEXT> {
        @Override
        public Class<VkSampleLocationsInfoEXT> clazz() {
            return VkSampleLocationsInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSampleLocationsInfoEXT.LAYOUT;
        }

        @Override
        public VkSampleLocationsInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSampleLocationsInfoEXT createUninit(MemorySegment segment) {
            return new VkSampleLocationsInfoEXT(segment);
        }
    }

    public static final VkSampleLocationsInfoEXTFactory FACTORY = new VkSampleLocationsInfoEXTFactory();
}
