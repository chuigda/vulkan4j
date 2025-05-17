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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCoarseSampleOrderCustomNV.html"><code>VkCoarseSampleOrderCustomNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkCoarseSampleOrderCustomNV {
///     VkShadingRatePaletteEntryNV shadingRate;
///     uint32_t sampleCount;
///     uint32_t sampleLocationCount;
///     VkCoarseSampleLocationNV const* pSampleLocations;
/// } VkCoarseSampleOrderCustomNV;
/// }
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCoarseSampleOrderCustomNV.html"><code>VkCoarseSampleOrderCustomNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCoarseSampleOrderCustomNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkCoarseSampleOrderCustomNV allocate(Arena arena) {
        VkCoarseSampleOrderCustomNV ret = new VkCoarseSampleOrderCustomNV(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkCoarseSampleOrderCustomNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCoarseSampleOrderCustomNV[] ret = new VkCoarseSampleOrderCustomNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCoarseSampleOrderCustomNV(segment.asSlice(i * BYTES, BYTES));
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

    public @pointer(target=VkCoarseSampleLocationNV.class) MemorySegment pSampleLocationsRaw() {
        return segment.get(LAYOUT$pSampleLocations, OFFSET$pSampleLocations);
    }

    public void pSampleLocationsRaw(@pointer(target=VkCoarseSampleLocationNV.class) MemorySegment value) {
        segment.set(LAYOUT$pSampleLocations, OFFSET$pSampleLocations, value);
    }

    public @Nullable VkCoarseSampleLocationNV pSampleLocations() {
        MemorySegment s = pSampleLocationsRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkCoarseSampleLocationNV.BYTES);
        VkCoarseSampleLocationNV[] ret = new VkCoarseSampleLocationNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkCoarseSampleLocationNV(s.asSlice(i * VkCoarseSampleLocationNV.BYTES, VkCoarseSampleLocationNV.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("shadingRate"),
        ValueLayout.JAVA_INT.withName("sampleCount"),
        ValueLayout.JAVA_INT.withName("sampleLocationCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkCoarseSampleLocationNV.LAYOUT).withName("pSampleLocations")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$shadingRate = PathElement.groupElement("PATH$shadingRate");
    public static final PathElement PATH$sampleCount = PathElement.groupElement("PATH$sampleCount");
    public static final PathElement PATH$sampleLocationCount = PathElement.groupElement("PATH$sampleLocationCount");
    public static final PathElement PATH$pSampleLocations = PathElement.groupElement("PATH$pSampleLocations");

    public static final OfInt LAYOUT$shadingRate = (OfInt) LAYOUT.select(PATH$shadingRate);
    public static final OfInt LAYOUT$sampleCount = (OfInt) LAYOUT.select(PATH$sampleCount);
    public static final OfInt LAYOUT$sampleLocationCount = (OfInt) LAYOUT.select(PATH$sampleLocationCount);
    public static final AddressLayout LAYOUT$pSampleLocations = (AddressLayout) LAYOUT.select(PATH$pSampleLocations);

    public static final long SIZE$shadingRate = LAYOUT$shadingRate.byteSize();
    public static final long SIZE$sampleCount = LAYOUT$sampleCount.byteSize();
    public static final long SIZE$sampleLocationCount = LAYOUT$sampleLocationCount.byteSize();
    public static final long SIZE$pSampleLocations = LAYOUT$pSampleLocations.byteSize();

    public static final long OFFSET$shadingRate = LAYOUT.byteOffset(PATH$shadingRate);
    public static final long OFFSET$sampleCount = LAYOUT.byteOffset(PATH$sampleCount);
    public static final long OFFSET$sampleLocationCount = LAYOUT.byteOffset(PATH$sampleLocationCount);
    public static final long OFFSET$pSampleLocations = LAYOUT.byteOffset(PATH$pSampleLocations);
}
