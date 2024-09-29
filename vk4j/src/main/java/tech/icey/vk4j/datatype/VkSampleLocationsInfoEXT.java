package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkSampleLocationsInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkSampleCountFlagBits sampleLocationsPerPixel;
///     VkExtent2D sampleLocationGridSize;
///     uint32_t sampleLocationsCount;
///     const VkSampleLocationEXT* pSampleLocations;
/// } VkSampleLocationsInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSampleLocationsInfoEXT.html">VkSampleLocationsInfoEXT</a>
public record VkSampleLocationsInfoEXT(MemorySegment segment) implements IPointer {
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationGridSize, SIZE$sampleLocationGridSize);
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

    public @nullable VkSampleLocationEXT pSampleLocations() {
        MemorySegment s = pSampleLocationsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSampleLocationEXT(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSampleLocationEXT[] pSampleLocations(int assumedCount) {
        MemorySegment s = pSampleLocationsRaw().reinterpret(assumedCount * VkSampleLocationEXT.SIZE);
        VkSampleLocationEXT[] arr = new VkSampleLocationEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSampleLocationEXT(s.asSlice(i * VkSampleLocationEXT.SIZE, VkSampleLocationEXT.SIZE));
        }
        return arr;
    }

    public void pSampleLocations(@nullable VkSampleLocationEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSampleLocationsRaw(s);
    }

    public static VkSampleLocationsInfoEXT allocate(Arena arena) {
        return new VkSampleLocationsInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkSampleLocationsInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSampleLocationsInfoEXT[] ret = new VkSampleLocationsInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSampleLocationsInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSampleLocationsInfoEXT clone(Arena arena, VkSampleLocationsInfoEXT src) {
        VkSampleLocationsInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSampleLocationsInfoEXT[] clone(Arena arena, VkSampleLocationsInfoEXT[] src) {
        VkSampleLocationsInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sampleLocationsPerPixel"),
        VkExtent2D.LAYOUT.withName("sampleLocationGridSize"),
        ValueLayout.JAVA_INT.withName("sampleLocationsCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSampleLocationEXT.LAYOUT).withName("pSampleLocations")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sampleLocationsPerPixel = PathElement.groupElement("sampleLocationsPerPixel");
    public static final PathElement PATH$sampleLocationGridSize = PathElement.groupElement("sampleLocationGridSize");
    public static final PathElement PATH$sampleLocationsCount = PathElement.groupElement("sampleLocationsCount");
    public static final PathElement PATH$pSampleLocations = PathElement.groupElement("pSampleLocations");

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sampleLocationsPerPixel = LAYOUT$sampleLocationsPerPixel.byteSize();
    public static final long SIZE$sampleLocationGridSize = LAYOUT$sampleLocationGridSize.byteSize();
    public static final long SIZE$sampleLocationsCount = LAYOUT$sampleLocationsCount.byteSize();
    public static final long SIZE$pSampleLocations = LAYOUT$pSampleLocations.byteSize();
}
