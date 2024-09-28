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
/// typedef struct VkCoarseSampleOrderCustomNV {
///     VkShadingRatePaletteEntryNV shadingRate;
///     uint32_t sampleCount;
///     uint32_t sampleLocationCount;
///     const VkCoarseSampleLocationNV* pSampleLocations;
/// } VkCoarseSampleOrderCustomNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCoarseSampleOrderCustomNV.html">VkCoarseSampleOrderCustomNV</a>
public record VkCoarseSampleOrderCustomNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("shadingRate"),
        ValueLayout.JAVA_INT.withName("sampleCount"),
        ValueLayout.JAVA_INT.withName("sampleLocationCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkCoarseSampleLocationNV.LAYOUT).withName("pSampleLocations")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$shadingRate = PathElement.groupElement("shadingRate");
    public static final PathElement PATH$sampleCount = PathElement.groupElement("sampleCount");
    public static final PathElement PATH$sampleLocationCount = PathElement.groupElement("sampleLocationCount");
    public static final PathElement PATH$pSampleLocations = PathElement.groupElement("pSampleLocations");

    public static final OfInt LAYOUT$shadingRate = (OfInt) LAYOUT.select(PATH$shadingRate);
    public static final OfInt LAYOUT$sampleCount = (OfInt) LAYOUT.select(PATH$sampleCount);
    public static final OfInt LAYOUT$sampleLocationCount = (OfInt) LAYOUT.select(PATH$sampleLocationCount);
    public static final AddressLayout LAYOUT$pSampleLocations = (AddressLayout) LAYOUT.select(PATH$pSampleLocations);

    public static final long OFFSET$shadingRate = LAYOUT.byteOffset(PATH$shadingRate);
    public static final long OFFSET$sampleCount = LAYOUT.byteOffset(PATH$sampleCount);
    public static final long OFFSET$sampleLocationCount = LAYOUT.byteOffset(PATH$sampleLocationCount);
    public static final long OFFSET$pSampleLocations = LAYOUT.byteOffset(PATH$pSampleLocations);

    public static final long SIZE$shadingRate = LAYOUT$shadingRate.byteSize();
    public static final long SIZE$sampleCount = LAYOUT$sampleCount.byteSize();
    public static final long SIZE$sampleLocationCount = LAYOUT$sampleLocationCount.byteSize();
    public static final long SIZE$pSampleLocations = LAYOUT$pSampleLocations.byteSize();

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

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkCoarseSampleLocationNV[] pSampleLocations(int assumedCount) {
        MemorySegment s = pSampleLocationsRaw().reinterpret(assumedCount * VkCoarseSampleLocationNV.SIZE);
        VkCoarseSampleLocationNV[] arr = new VkCoarseSampleLocationNV[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkCoarseSampleLocationNV(s.asSlice(i * VkCoarseSampleLocationNV.SIZE, VkCoarseSampleLocationNV.SIZE));
        }
        return arr;
    }

    public void pSampleLocations(@nullable VkCoarseSampleLocationNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSampleLocationsRaw(s);
    }

    public static VkCoarseSampleOrderCustomNV allocate(Arena arena) {
        return new VkCoarseSampleOrderCustomNV(arena.allocate(LAYOUT));
    }
    
    public static VkCoarseSampleOrderCustomNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCoarseSampleOrderCustomNV[] ret = new VkCoarseSampleOrderCustomNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCoarseSampleOrderCustomNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
