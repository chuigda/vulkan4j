package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceSampleLocationsPropertiesEXT.html"><code>VkPhysicalDeviceSampleLocationsPropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceSampleLocationsPropertiesEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkSampleCountFlags sampleLocationSampleCounts; // @link substring="VkSampleCountFlags" target="VkSampleCountFlags" @link substring="sampleLocationSampleCounts" target="#sampleLocationSampleCounts"
///     VkExtent2D maxSampleLocationGridSize; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="maxSampleLocationGridSize" target="#maxSampleLocationGridSize"
///     float sampleLocationCoordinateRange; // @link substring="sampleLocationCoordinateRange" target="#sampleLocationCoordinateRange"
///     uint32_t sampleLocationSubPixelBits; // @link substring="sampleLocationSubPixelBits" target="#sampleLocationSubPixelBits"
///     VkBool32 variableSampleLocations; // @link substring="variableSampleLocations" target="#variableSampleLocations"
/// } VkPhysicalDeviceSampleLocationsPropertiesEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT`
///
/// The {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPhysicalDeviceSampleLocationsPropertiesEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceSampleLocationsPropertiesEXT.html"><code>VkPhysicalDeviceSampleLocationsPropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceSampleLocationsPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceSampleLocationsPropertiesEXT allocate(Arena arena) {
        VkPhysicalDeviceSampleLocationsPropertiesEXT ret = new VkPhysicalDeviceSampleLocationsPropertiesEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT);
        return ret;
    }

    public static VkPhysicalDeviceSampleLocationsPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSampleLocationsPropertiesEXT[] ret = new VkPhysicalDeviceSampleLocationsPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceSampleLocationsPropertiesEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT);
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_SAMPLE_LOCATIONS_PROPERTIES_EXT);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkSampleCountFlags.class) int sampleLocationSampleCounts() {
        return segment.get(LAYOUT$sampleLocationSampleCounts, OFFSET$sampleLocationSampleCounts);
    }

    public void sampleLocationSampleCounts(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$sampleLocationSampleCounts, OFFSET$sampleLocationSampleCounts, value);
    }

    public @NotNull VkExtent2D maxSampleLocationGridSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxSampleLocationGridSize, LAYOUT$maxSampleLocationGridSize));
    }

    public void maxSampleLocationGridSize(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxSampleLocationGridSize, SIZE$maxSampleLocationGridSize);
    }

    public float sampleLocationCoordinateRange() {
        return segment.get(LAYOUT$sampleLocationCoordinateRange, OFFSET$sampleLocationCoordinateRange);
    }

    public void sampleLocationCoordinateRange(float value) {
        segment.set(LAYOUT$sampleLocationCoordinateRange, OFFSET$sampleLocationCoordinateRange, value);
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationSampleCounts"),
        VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize"),
        ValueLayout.JAVA_FLOAT.withName("sampleLocationCoordinateRange"),
        ValueLayout.JAVA_INT.withName("sampleLocationSubPixelBits"),
        ValueLayout.JAVA_INT.withName("variableSampleLocations")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$sampleLocationSampleCounts = PathElement.groupElement("PATH$sampleLocationSampleCounts");
    public static final PathElement PATH$maxSampleLocationGridSize = PathElement.groupElement("PATH$maxSampleLocationGridSize");
    public static final PathElement PATH$sampleLocationCoordinateRange = PathElement.groupElement("PATH$sampleLocationCoordinateRange");
    public static final PathElement PATH$sampleLocationSubPixelBits = PathElement.groupElement("PATH$sampleLocationSubPixelBits");
    public static final PathElement PATH$variableSampleLocations = PathElement.groupElement("PATH$variableSampleLocations");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sampleLocationSampleCounts = (OfInt) LAYOUT.select(PATH$sampleLocationSampleCounts);
    public static final StructLayout LAYOUT$maxSampleLocationGridSize = (StructLayout) LAYOUT.select(PATH$maxSampleLocationGridSize);
    public static final OfFloat LAYOUT$sampleLocationCoordinateRange = (OfFloat) LAYOUT.select(PATH$sampleLocationCoordinateRange);
    public static final OfInt LAYOUT$sampleLocationSubPixelBits = (OfInt) LAYOUT.select(PATH$sampleLocationSubPixelBits);
    public static final OfInt LAYOUT$variableSampleLocations = (OfInt) LAYOUT.select(PATH$variableSampleLocations);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sampleLocationSampleCounts = LAYOUT$sampleLocationSampleCounts.byteSize();
    public static final long SIZE$maxSampleLocationGridSize = LAYOUT$maxSampleLocationGridSize.byteSize();
    public static final long SIZE$sampleLocationCoordinateRange = LAYOUT$sampleLocationCoordinateRange.byteSize();
    public static final long SIZE$sampleLocationSubPixelBits = LAYOUT$sampleLocationSubPixelBits.byteSize();
    public static final long SIZE$variableSampleLocations = LAYOUT$variableSampleLocations.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sampleLocationSampleCounts = LAYOUT.byteOffset(PATH$sampleLocationSampleCounts);
    public static final long OFFSET$maxSampleLocationGridSize = LAYOUT.byteOffset(PATH$maxSampleLocationGridSize);
    public static final long OFFSET$sampleLocationCoordinateRange = LAYOUT.byteOffset(PATH$sampleLocationCoordinateRange);
    public static final long OFFSET$sampleLocationSubPixelBits = LAYOUT.byteOffset(PATH$sampleLocationSubPixelBits);
    public static final long OFFSET$variableSampleLocations = LAYOUT.byteOffset(PATH$variableSampleLocations);
}
