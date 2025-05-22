package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265PictureInfoKHR.html"><code>VkVideoEncodeH265PictureInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265PictureInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t naluSliceSegmentEntryCount; // @link substring="naluSliceSegmentEntryCount" target="#naluSliceSegmentEntryCount"
///     VkVideoEncodeH265NaluSliceSegmentInfoKHR const* pNaluSliceSegmentEntries; // @link substring="VkVideoEncodeH265NaluSliceSegmentInfoKHR" target="VkVideoEncodeH265NaluSliceSegmentInfoKHR" @link substring="pNaluSliceSegmentEntries" target="#pNaluSliceSegmentEntries"
///     StdVideoEncodeH265PictureInfo const* pStdPictureInfo; // @link substring="StdVideoEncodeH265PictureInfo" target="StdVideoEncodeH265PictureInfo" @link substring="pStdPictureInfo" target="#pStdPictureInfo"
/// } VkVideoEncodeH265PictureInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_PICTURE_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeH265PictureInfoKHR#allocate(Arena)}, {@link VkVideoEncodeH265PictureInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeH265PictureInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265PictureInfoKHR.html"><code>VkVideoEncodeH265PictureInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265PictureInfoKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeH265PictureInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265PictureInfoKHR.html"><code>VkVideoEncodeH265PictureInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeH265PictureInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeH265PictureInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeH265PictureInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeH265PictureInfoKHR {
        public long size() {
            return segment.byteSize() / VkVideoEncodeH265PictureInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeH265PictureInfoKHR at(long index) {
            return new VkVideoEncodeH265PictureInfoKHR(segment.asSlice(index * VkVideoEncodeH265PictureInfoKHR.BYTES, VkVideoEncodeH265PictureInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoEncodeH265PictureInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeH265PictureInfoKHR.BYTES, VkVideoEncodeH265PictureInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkVideoEncodeH265PictureInfoKHR.BYTES, VkVideoEncodeH265PictureInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoEncodeH265PictureInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoEncodeH265PictureInfoKHR.BYTES,
                (end - start) * VkVideoEncodeH265PictureInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoEncodeH265PictureInfoKHR.BYTES));
        }
    }

    public static VkVideoEncodeH265PictureInfoKHR allocate(Arena arena) {
        VkVideoEncodeH265PictureInfoKHR ret = new VkVideoEncodeH265PictureInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_PICTURE_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH265PictureInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265PictureInfoKHR.Ptr ret = new VkVideoEncodeH265PictureInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_ENCODE_H265_PICTURE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265PictureInfoKHR clone(Arena arena, VkVideoEncodeH265PictureInfoKHR src) {
        VkVideoEncodeH265PictureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_PICTURE_INFO_KHR);
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

    public @unsigned int naluSliceSegmentEntryCount() {
        return segment.get(LAYOUT$naluSliceSegmentEntryCount, OFFSET$naluSliceSegmentEntryCount);
    }

    public void naluSliceSegmentEntryCount(@unsigned int value) {
        segment.set(LAYOUT$naluSliceSegmentEntryCount, OFFSET$naluSliceSegmentEntryCount, value);
    }

    public @Nullable VkVideoEncodeH265NaluSliceSegmentInfoKHR pNaluSliceSegmentEntries() {
        MemorySegment s = pNaluSliceSegmentEntriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(s);
    }

    public void pNaluSliceSegmentEntries(@Nullable IVkVideoEncodeH265NaluSliceSegmentInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNaluSliceSegmentEntriesRaw(s);
    }

    @unsafe public @Nullable VkVideoEncodeH265NaluSliceSegmentInfoKHR.Ptr pNaluSliceSegmentEntries(int assumedCount) {
        MemorySegment s = pNaluSliceSegmentEntriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoEncodeH265NaluSliceSegmentInfoKHR.BYTES);
        return new VkVideoEncodeH265NaluSliceSegmentInfoKHR.Ptr(s);
    }

    public @pointer(target=VkVideoEncodeH265NaluSliceSegmentInfoKHR.class) MemorySegment pNaluSliceSegmentEntriesRaw() {
        return segment.get(LAYOUT$pNaluSliceSegmentEntries, OFFSET$pNaluSliceSegmentEntries);
    }

    public void pNaluSliceSegmentEntriesRaw(@pointer(target=VkVideoEncodeH265NaluSliceSegmentInfoKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pNaluSliceSegmentEntries, OFFSET$pNaluSliceSegmentEntries, value);
    }

    public @Nullable StdVideoEncodeH265PictureInfo pStdPictureInfo() {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeH265PictureInfo(s);
    }

    public void pStdPictureInfo(@Nullable IStdVideoEncodeH265PictureInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPictureInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH265PictureInfo.Ptr pStdPictureInfo(int assumedCount) {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH265PictureInfo.BYTES);
        return new StdVideoEncodeH265PictureInfo.Ptr(s);
    }

    public @pointer(target=StdVideoEncodeH265PictureInfo.class) MemorySegment pStdPictureInfoRaw() {
        return segment.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);
    }

    public void pStdPictureInfoRaw(@pointer(target=StdVideoEncodeH265PictureInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("naluSliceSegmentEntryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVideoEncodeH265NaluSliceSegmentInfoKHR.LAYOUT).withName("pNaluSliceSegmentEntries"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH265PictureInfo.LAYOUT).withName("pStdPictureInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$naluSliceSegmentEntryCount = PathElement.groupElement("naluSliceSegmentEntryCount");
    public static final PathElement PATH$pNaluSliceSegmentEntries = PathElement.groupElement("pNaluSliceSegmentEntries");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("pStdPictureInfo");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$naluSliceSegmentEntryCount = (OfInt) LAYOUT.select(PATH$naluSliceSegmentEntryCount);
    public static final AddressLayout LAYOUT$pNaluSliceSegmentEntries = (AddressLayout) LAYOUT.select(PATH$pNaluSliceSegmentEntries);
    public static final AddressLayout LAYOUT$pStdPictureInfo = (AddressLayout) LAYOUT.select(PATH$pStdPictureInfo);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$naluSliceSegmentEntryCount = LAYOUT$naluSliceSegmentEntryCount.byteSize();
    public static final long SIZE$pNaluSliceSegmentEntries = LAYOUT$pNaluSliceSegmentEntries.byteSize();
    public static final long SIZE$pStdPictureInfo = LAYOUT$pStdPictureInfo.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$naluSliceSegmentEntryCount = LAYOUT.byteOffset(PATH$naluSliceSegmentEntryCount);
    public static final long OFFSET$pNaluSliceSegmentEntries = LAYOUT.byteOffset(PATH$pNaluSliceSegmentEntries);
    public static final long OFFSET$pStdPictureInfo = LAYOUT.byteOffset(PATH$pStdPictureInfo);
}
