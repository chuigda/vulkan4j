package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceSampleLocationsPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkSampleCountFlags sampleLocationSampleCounts;
///     VkExtent2D maxSampleLocationGridSize;
///     float sampleLocationCoordinateRange[2];
///     uint32_t sampleLocationSubPixelBits;
///     VkBool32 variableSampleLocations;
/// } VkPhysicalDeviceSampleLocationsPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceSampleLocationsPropertiesEXT.html">VkPhysicalDeviceSampleLocationsPropertiesEXT</a>
public record VkPhysicalDeviceSampleLocationsPropertiesEXT(MemorySegment segment) implements IPointer {
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxSampleLocationGridSize, SIZE$maxSampleLocationGridSize);
    }

    public MemorySegment sampleLocationCoordinateRangeRaw() {
        return segment.asSlice(OFFSET$sampleLocationCoordinateRange, SIZE$sampleLocationCoordinateRange);
    }

    public FloatBuffer sampleLocationCoordinateRange() {
        return new FloatBuffer(sampleLocationCoordinateRangeRaw());
    }

    public void sampleLocationCoordinateRange(FloatBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationCoordinateRange, SIZE$sampleLocationCoordinateRange);
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

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceSampleLocationsPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSampleLocationsPropertiesEXT[] ret = new VkPhysicalDeviceSampleLocationsPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT clone(Arena arena, VkPhysicalDeviceSampleLocationsPropertiesEXT src) {
        VkPhysicalDeviceSampleLocationsPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceSampleLocationsPropertiesEXT[] src) {
        VkPhysicalDeviceSampleLocationsPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationSampleCounts"),
        VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_FLOAT).withName("sampleLocationCoordinateRange"),
        ValueLayout.JAVA_INT.withName("sampleLocationSubPixelBits"),
        ValueLayout.JAVA_INT.withName("variableSampleLocations")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sampleLocationSampleCounts = PathElement.groupElement("sampleLocationSampleCounts");
    public static final PathElement PATH$maxSampleLocationGridSize = PathElement.groupElement("maxSampleLocationGridSize");
    public static final PathElement PATH$sampleLocationCoordinateRange = PathElement.groupElement("sampleLocationCoordinateRange");
    public static final PathElement PATH$sampleLocationSubPixelBits = PathElement.groupElement("sampleLocationSubPixelBits");
    public static final PathElement PATH$variableSampleLocations = PathElement.groupElement("variableSampleLocations");

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sampleLocationSampleCounts = LAYOUT$sampleLocationSampleCounts.byteSize();
    public static final long SIZE$maxSampleLocationGridSize = LAYOUT$maxSampleLocationGridSize.byteSize();
    public static final long SIZE$sampleLocationCoordinateRange = LAYOUT$sampleLocationCoordinateRange.byteSize();
    public static final long SIZE$sampleLocationSubPixelBits = LAYOUT$sampleLocationSubPixelBits.byteSize();
    public static final long SIZE$variableSampleLocations = LAYOUT$variableSampleLocations.byteSize();
}
