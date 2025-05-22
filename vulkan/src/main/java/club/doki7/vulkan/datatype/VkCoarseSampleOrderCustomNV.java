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
///     VkShadingRatePaletteEntryNV shadingRate; // @link substring="VkShadingRatePaletteEntryNV" target="VkShadingRatePaletteEntryNV" @link substring="shadingRate" target="#shadingRate"
///     uint32_t sampleCount; // @link substring="sampleCount" target="#sampleCount"
///     uint32_t sampleLocationCount; // @link substring="sampleLocationCount" target="#sampleLocationCount"
///     VkCoarseSampleLocationNV const* pSampleLocations; // @link substring="VkCoarseSampleLocationNV" target="VkCoarseSampleLocationNV" @link substring="pSampleLocations" target="#pSampleLocations"
/// } VkCoarseSampleOrderCustomNV;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCoarseSampleOrderCustomNV.html"><code>VkCoarseSampleOrderCustomNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkCoarseSampleOrderCustomNV(@NotNull MemorySegment segment) implements IVkCoarseSampleOrderCustomNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCoarseSampleOrderCustomNV.html"><code>VkCoarseSampleOrderCustomNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkCoarseSampleOrderCustomNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkCoarseSampleOrderCustomNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkCoarseSampleOrderCustomNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkCoarseSampleOrderCustomNV {
        public long size() {
            return segment.byteSize() / VkCoarseSampleOrderCustomNV.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkCoarseSampleOrderCustomNV at(long index) {
            return new VkCoarseSampleOrderCustomNV(segment.asSlice(index * VkCoarseSampleOrderCustomNV.BYTES, VkCoarseSampleOrderCustomNV.BYTES));
        }
        public void write(long index, @NotNull VkCoarseSampleOrderCustomNV value) {
            MemorySegment s = segment.asSlice(index * VkCoarseSampleOrderCustomNV.BYTES, VkCoarseSampleOrderCustomNV.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkCoarseSampleOrderCustomNV allocate(Arena arena) {
        return new VkCoarseSampleOrderCustomNV(arena.allocate(LAYOUT));
    }

    public static VkCoarseSampleOrderCustomNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCoarseSampleOrderCustomNV.Ptr ret = new VkCoarseSampleOrderCustomNV.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkCoarseSampleOrderCustomNV clone(Arena arena, VkCoarseSampleOrderCustomNV src) {
        VkCoarseSampleOrderCustomNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
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

    public @pointer(target=VkCoarseSampleLocationNV.class) MemorySegment pSampleLocationsRaw() {
        return segment.get(LAYOUT$pSampleLocations, OFFSET$pSampleLocations);
    }

    public void pSampleLocationsRaw(@pointer(target=VkCoarseSampleLocationNV.class) MemorySegment value) {
        segment.set(LAYOUT$pSampleLocations, OFFSET$pSampleLocations, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("shadingRate"),
        ValueLayout.JAVA_INT.withName("sampleCount"),
        ValueLayout.JAVA_INT.withName("sampleLocationCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkCoarseSampleLocationNV.LAYOUT).withName("pSampleLocations")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$shadingRate = PathElement.groupElement("shadingRate");
    public static final PathElement PATH$sampleCount = PathElement.groupElement("sampleCount");
    public static final PathElement PATH$sampleLocationCount = PathElement.groupElement("sampleLocationCount");
    public static final PathElement PATH$pSampleLocations = PathElement.groupElement("pSampleLocations");

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
