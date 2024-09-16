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

public record VkPhysicalDeviceSampleLocationsPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationSampleCounts"),
        VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_FLOAT).withName("sampleLocationCoordinateRange"),
        ValueLayout.JAVA_INT.withName("sampleLocationSubPixelBits"),
        ValueLayout.JAVA_INT.withName("variableSampleLocations")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$sampleLocationSampleCounts = PathElement.groupElement(2);
    public static final PathElement PATH$maxSampleLocationGridSize = PathElement.groupElement(3);
    public static final PathElement PATH$sampleLocationCoordinateRange = PathElement.groupElement(4);
    public static final PathElement PATH$sampleLocationSubPixelBits = PathElement.groupElement(5);
    public static final PathElement PATH$variableSampleLocations = PathElement.groupElement(6);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sampleLocationSampleCounts = (OfInt) LAYOUT.select(PATH$sampleLocationSampleCounts);
    public static final StructLayout LAYOUT$maxSampleLocationGridSize = (StructLayout) LAYOUT.select(PATH$maxSampleLocationGridSize);
    public static final SequenceLayout LAYOUT$sampleLocationCoordinateRange = (SequenceLayout) LAYOUT.select(PATH$sampleLocationCoordinateRange);
    public static final OfInt LAYOUT$sampleLocationSubPixelBits = (OfInt) LAYOUT.select(PATH$sampleLocationSubPixelBits);
    public static final OfInt LAYOUT$variableSampleLocations = (OfInt) LAYOUT.select(PATH$variableSampleLocations);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sampleLocationSampleCounts = LAYOUT.byteOffset(PATH$sampleLocationSampleCounts);
    public static final long OFFSET$maxSampleLocationGridSize = LAYOUT.byteOffset(PATH$maxSampleLocationGridSize);
    public static final long OFFSET$sampleLocationCoordinateRange = LAYOUT.byteOffset(PATH$sampleLocationCoordinateRange);
    public static final long OFFSET$sampleLocationSubPixelBits = LAYOUT.byteOffset(PATH$sampleLocationSubPixelBits);
    public static final long OFFSET$variableSampleLocations = LAYOUT.byteOffset(PATH$variableSampleLocations);

    public VkPhysicalDeviceSampleLocationsPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT);
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

    public @enumtype(VkSampleCountFlags.class) int sampleLocationSampleCounts() {
        return segment.get(LAYOUT$sampleLocationSampleCounts, OFFSET$sampleLocationSampleCounts);
    }

    public void sampleLocationSampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$sampleLocationSampleCounts, OFFSET$sampleLocationSampleCounts, value);
    }

    public VkExtent2D maxSampleLocationGridSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxSampleLocationGridSize, LAYOUT$maxSampleLocationGridSize));
    }

    public void maxSampleLocationGridSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxSampleLocationGridSize, LAYOUT$maxSampleLocationGridSize.byteSize());
    }

    public MemorySegment sampleLocationCoordinateRangeRaw() {
        return segment.asSlice(OFFSET$sampleLocationCoordinateRange, LAYOUT$sampleLocationCoordinateRange.byteSize());
    }

    public FloatArray sampleLocationCoordinateRange() {
        return new FloatArray(sampleLocationCoordinateRangeRaw(), LAYOUT$sampleLocationCoordinateRange.elementCount());
    }

    public void sampleLocationCoordinateRange(FloatArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationCoordinateRange, LAYOUT$sampleLocationCoordinateRange.byteSize());
    }

    public @unsigned int sampleLocationSubPixelBits() {
        return segment.get(LAYOUT$sampleLocationSubPixelBits, OFFSET$sampleLocationSubPixelBits);
    }

    public void sampleLocationSubPixelBits(@unsigned int value) {
        segment.set(LAYOUT$sampleLocationSubPixelBits, OFFSET$sampleLocationSubPixelBits, value);
    }

    public @unsigned int variableSampleLocations() {
        return segment.get(LAYOUT$variableSampleLocations, OFFSET$variableSampleLocations);
    }

    public void variableSampleLocations(@unsigned int value) {
        segment.set(LAYOUT$variableSampleLocations, OFFSET$variableSampleLocations, value);
    }


    public static final class VkPhysicalDeviceSampleLocationsPropertiesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceSampleLocationsPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceSampleLocationsPropertiesEXT> clazz() {
            return VkPhysicalDeviceSampleLocationsPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceSampleLocationsPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceSampleLocationsPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceSampleLocationsPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceSampleLocationsPropertiesEXTFactory FACTORY = new VkPhysicalDeviceSampleLocationsPropertiesEXTFactory();
}
