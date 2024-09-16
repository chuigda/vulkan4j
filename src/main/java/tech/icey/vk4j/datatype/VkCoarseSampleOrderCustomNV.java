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

public record VkCoarseSampleOrderCustomNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("shadingRate"),
        ValueLayout.JAVA_INT.withName("sampleCount"),
        ValueLayout.JAVA_INT.withName("sampleLocationCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkCoarseSampleLocationNV.LAYOUT).withName("pSampleLocations")
    );

    public static final PathElement PATH$shadingRate = PathElement.groupElement(0);
    public static final PathElement PATH$sampleCount = PathElement.groupElement(1);
    public static final PathElement PATH$sampleLocationCount = PathElement.groupElement(2);
    public static final PathElement PATH$pSampleLocations = PathElement.groupElement(3);

    public static final OfInt LAYOUT$shadingRate = (OfInt) LAYOUT.select(PATH$shadingRate);
    public static final OfInt LAYOUT$sampleCount = (OfInt) LAYOUT.select(PATH$sampleCount);
    public static final OfInt LAYOUT$sampleLocationCount = (OfInt) LAYOUT.select(PATH$sampleLocationCount);
    public static final AddressLayout LAYOUT$pSampleLocations = (AddressLayout) LAYOUT.select(PATH$pSampleLocations);

    public static final long OFFSET$shadingRate = LAYOUT.byteOffset(PATH$shadingRate);
    public static final long OFFSET$sampleCount = LAYOUT.byteOffset(PATH$sampleCount);
    public static final long OFFSET$sampleLocationCount = LAYOUT.byteOffset(PATH$sampleLocationCount);
    public static final long OFFSET$pSampleLocations = LAYOUT.byteOffset(PATH$pSampleLocations);

    public VkCoarseSampleOrderCustomNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkShadingRatePaletteEntryNV.class) int shadingRate() {
        return segment.get(LAYOUT$shadingRate, OFFSET$shadingRate);
    }

    public void shadingRate(@enumtype(VkShadingRatePaletteEntryNV.class) int value) {
        segment.set(LAYOUT$shadingRate, OFFSET$shadingRate, value);
    }

    public @unsigned int sampleCount() {
        return segment.get(LAYOUT$sampleCount, OFFSET$sampleCount);
    }

    public void sampleCount(@unsigned int value) {
        segment.set(LAYOUT$sampleCount, OFFSET$sampleCount, value);
    }

    public @unsigned int sampleLocationCount() {
        return segment.get(LAYOUT$sampleLocationCount, OFFSET$sampleLocationCount);
    }

    public void sampleLocationCount(@unsigned int value) {
        segment.set(LAYOUT$sampleLocationCount, OFFSET$sampleLocationCount, value);
    }

    public @pointer(comment="VkCoarseSampleLocationNV*") MemorySegment pSampleLocationsRaw() {
        return segment.get(LAYOUT$pSampleLocations, OFFSET$pSampleLocations);
    }

    public void pSampleLocationsRaw(@pointer(comment="VkCoarseSampleLocationNV*") MemorySegment value) {
        segment.set(LAYOUT$pSampleLocations, OFFSET$pSampleLocations, value);
    }
    
    public @nullable VkCoarseSampleLocationNV pSampleLocations() {
        MemorySegment s = pSampleLocationsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkCoarseSampleLocationNV(s);
    }

    public void pSampleLocations(@nullable VkCoarseSampleLocationNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSampleLocationsRaw(s);
    }


    public static final class VkCoarseSampleOrderCustomNVFactory implements IDataTypeFactory<VkCoarseSampleOrderCustomNV> {
        @Override
        public Class<VkCoarseSampleOrderCustomNV> clazz() {
            return VkCoarseSampleOrderCustomNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCoarseSampleOrderCustomNV.LAYOUT;
        }

        @Override
        public VkCoarseSampleOrderCustomNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkCoarseSampleOrderCustomNV createUninit(MemorySegment segment) {
            return new VkCoarseSampleOrderCustomNV(segment);
        }
    }

    public static final VkCoarseSampleOrderCustomNVFactory FACTORY = new VkCoarseSampleOrderCustomNVFactory();
}
