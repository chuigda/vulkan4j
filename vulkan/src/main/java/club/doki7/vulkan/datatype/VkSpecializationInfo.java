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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSpecializationInfo.html"><code>VkSpecializationInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSpecializationInfo {
///     uint32_t mapEntryCount; // optional // @link substring="mapEntryCount" target="#mapEntryCount"
///     VkSpecializationMapEntry const* pMapEntries; // @link substring="VkSpecializationMapEntry" target="VkSpecializationMapEntry" @link substring="pMapEntries" target="#pMapEntries"
///     size_t dataSize; // optional // @link substring="dataSize" target="#dataSize"
///     void const* pData; // @link substring="pData" target="#pData"
/// } VkSpecializationInfo;
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSpecializationInfo.html"><code>VkSpecializationInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSpecializationInfo(@NotNull MemorySegment segment) implements IVkSpecializationInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSpecializationInfo.html"><code>VkSpecializationInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkSpecializationInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkSpecializationInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkSpecializationInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkSpecializationInfo {
        public long size() {
            return segment.byteSize() / VkSpecializationInfo.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkSpecializationInfo at(long index) {
            return new VkSpecializationInfo(segment.asSlice(index * VkSpecializationInfo.BYTES, VkSpecializationInfo.BYTES));
        }
        public void write(long index, @NotNull VkSpecializationInfo value) {
            MemorySegment s = segment.asSlice(index * VkSpecializationInfo.BYTES, VkSpecializationInfo.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkSpecializationInfo allocate(Arena arena) {
        return new VkSpecializationInfo(arena.allocate(LAYOUT));
    }

    public static VkSpecializationInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSpecializationInfo.Ptr ret = new VkSpecializationInfo.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkSpecializationInfo clone(Arena arena, VkSpecializationInfo src) {
        VkSpecializationInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int mapEntryCount() {
        return segment.get(LAYOUT$mapEntryCount, OFFSET$mapEntryCount);
    }

    public void mapEntryCount(@unsigned int value) {
        segment.set(LAYOUT$mapEntryCount, OFFSET$mapEntryCount, value);
    }

    public @Nullable VkSpecializationMapEntry pMapEntries() {
        MemorySegment s = pMapEntriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSpecializationMapEntry(s);
    }

    public void pMapEntries(@Nullable VkSpecializationMapEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMapEntriesRaw(s);
    }

    @unsafe public @Nullable VkSpecializationMapEntry[] pMapEntries(int assumedCount) {
        MemorySegment s = pMapEntriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSpecializationMapEntry.BYTES);
        VkSpecializationMapEntry[] ret = new VkSpecializationMapEntry[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSpecializationMapEntry(s.asSlice(i * VkSpecializationMapEntry.BYTES, VkSpecializationMapEntry.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkSpecializationMapEntry.class) MemorySegment pMapEntriesRaw() {
        return segment.get(LAYOUT$pMapEntries, OFFSET$pMapEntries);
    }

    public void pMapEntriesRaw(@pointer(target=VkSpecializationMapEntry.class) MemorySegment value) {
        segment.set(LAYOUT$pMapEntries, OFFSET$pMapEntries, value);
    }

    public @unsigned long dataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$dataSize);
    }

    public void dataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$dataSize, value);
    }

    public @pointer(comment="void*") MemorySegment pData() {
        return segment.get(LAYOUT$pData, OFFSET$pData);
    }

    public void pData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pData, OFFSET$pData, value);
    }

    public void pData(@Nullable IPointer pointer) {
        pData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("mapEntryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSpecializationMapEntry.LAYOUT).withName("pMapEntries"),
        NativeLayout.C_SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$mapEntryCount = PathElement.groupElement("mapEntryCount");
    public static final PathElement PATH$pMapEntries = PathElement.groupElement("pMapEntries");
    public static final PathElement PATH$dataSize = PathElement.groupElement("dataSize");
    public static final PathElement PATH$pData = PathElement.groupElement("pData");

    public static final OfInt LAYOUT$mapEntryCount = (OfInt) LAYOUT.select(PATH$mapEntryCount);
    public static final AddressLayout LAYOUT$pMapEntries = (AddressLayout) LAYOUT.select(PATH$pMapEntries);
    public static final AddressLayout LAYOUT$pData = (AddressLayout) LAYOUT.select(PATH$pData);

    public static final long SIZE$mapEntryCount = LAYOUT$mapEntryCount.byteSize();
    public static final long SIZE$pMapEntries = LAYOUT$pMapEntries.byteSize();
    public static final long SIZE$dataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pData = LAYOUT$pData.byteSize();

    public static final long OFFSET$mapEntryCount = LAYOUT.byteOffset(PATH$mapEntryCount);
    public static final long OFFSET$pMapEntries = LAYOUT.byteOffset(PATH$pMapEntries);
    public static final long OFFSET$dataSize = LAYOUT.byteOffset(PATH$dataSize);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);
}
