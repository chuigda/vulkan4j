package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCoarseSampleOrderCustomNV.html">VkCoarseSampleOrderCustomNV</a>
@ValueBasedCandidate
public record VkCoarseSampleOrderCustomNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$shadingRate = ValueLayout.JAVA_INT.withName("shadingRate");
    public static final OfInt LAYOUT$sampleCount = ValueLayout.JAVA_INT.withName("sampleCount");
    public static final OfInt LAYOUT$sampleLocationCount = ValueLayout.JAVA_INT.withName("sampleLocationCount");
    public static final AddressLayout LAYOUT$pSampleLocations = ValueLayout.ADDRESS.withTargetLayout(VkCoarseSampleLocationNV.LAYOUT).withName("pSampleLocations");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$shadingRate, LAYOUT$sampleCount, LAYOUT$sampleLocationCount, LAYOUT$pSampleLocations);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCoarseSampleOrderCustomNV allocate(Arena arena) {
        return new VkCoarseSampleOrderCustomNV(arena.allocate(LAYOUT));
    }

    public static VkCoarseSampleOrderCustomNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCoarseSampleOrderCustomNV[] ret = new VkCoarseSampleOrderCustomNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCoarseSampleOrderCustomNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCoarseSampleOrderCustomNV clone(Arena arena, VkCoarseSampleOrderCustomNV src) {
        VkCoarseSampleOrderCustomNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCoarseSampleOrderCustomNV[] clone(Arena arena, VkCoarseSampleOrderCustomNV[] src) {
        VkCoarseSampleOrderCustomNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$shadingRate = PathElement.groupElement("PATH$shadingRate");
    public static final PathElement PATH$sampleCount = PathElement.groupElement("PATH$sampleCount");
    public static final PathElement PATH$sampleLocationCount = PathElement.groupElement("PATH$sampleLocationCount");
    public static final PathElement PATH$pSampleLocations = PathElement.groupElement("PATH$pSampleLocations");

    public static final long SIZE$shadingRate = LAYOUT$shadingRate.byteSize();
    public static final long SIZE$sampleCount = LAYOUT$sampleCount.byteSize();
    public static final long SIZE$sampleLocationCount = LAYOUT$sampleLocationCount.byteSize();
    public static final long SIZE$pSampleLocations = LAYOUT$pSampleLocations.byteSize();

    public static final long OFFSET$shadingRate = LAYOUT.byteOffset(PATH$shadingRate);
    public static final long OFFSET$sampleCount = LAYOUT.byteOffset(PATH$sampleCount);
    public static final long OFFSET$sampleLocationCount = LAYOUT.byteOffset(PATH$sampleLocationCount);
    public static final long OFFSET$pSampleLocations = LAYOUT.byteOffset(PATH$pSampleLocations);

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

    public @Nullable VkCoarseSampleLocationNV pSampleLocations() {
        MemorySegment s = pSampleLocationsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkCoarseSampleLocationNV(s);
    }

    public void pSampleLocations(@Nullable VkCoarseSampleLocationNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSampleLocationsRaw(s);
    }

    @unsafe public @Nullable VkCoarseSampleLocationNV[] pSampleLocations(int assumedCount) {
        MemorySegment s = pSampleLocationsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkCoarseSampleLocationNV.SIZE);
        VkCoarseSampleLocationNV[] ret = new VkCoarseSampleLocationNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkCoarseSampleLocationNV(s.asSlice(i * VkCoarseSampleLocationNV.SIZE, VkCoarseSampleLocationNV.SIZE));
        }
        return ret;
    }

}
