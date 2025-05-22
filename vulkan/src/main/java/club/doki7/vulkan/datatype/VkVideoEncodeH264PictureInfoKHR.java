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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264PictureInfoKHR.html"><code>VkVideoEncodeH264PictureInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH264PictureInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t naluSliceEntryCount; // @link substring="naluSliceEntryCount" target="#naluSliceEntryCount"
///     VkVideoEncodeH264NaluSliceInfoKHR const* pNaluSliceEntries; // @link substring="VkVideoEncodeH264NaluSliceInfoKHR" target="VkVideoEncodeH264NaluSliceInfoKHR" @link substring="pNaluSliceEntries" target="#pNaluSliceEntries"
///     StdVideoEncodeH264PictureInfo const* pStdPictureInfo; // @link substring="StdVideoEncodeH264PictureInfo" target="StdVideoEncodeH264PictureInfo" @link substring="pStdPictureInfo" target="#pStdPictureInfo"
///     VkBool32 generatePrefixNalu; // @link substring="generatePrefixNalu" target="#generatePrefixNalu"
/// } VkVideoEncodeH264PictureInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_PICTURE_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeH264PictureInfoKHR#allocate(Arena)}, {@link VkVideoEncodeH264PictureInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeH264PictureInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264PictureInfoKHR.html"><code>VkVideoEncodeH264PictureInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH264PictureInfoKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeH264PictureInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264PictureInfoKHR.html"><code>VkVideoEncodeH264PictureInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeH264PictureInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeH264PictureInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeH264PictureInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeH264PictureInfoKHR {
        public long size() {
            return segment.byteSize() / VkVideoEncodeH264PictureInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeH264PictureInfoKHR at(long index) {
            return new VkVideoEncodeH264PictureInfoKHR(segment.asSlice(index * VkVideoEncodeH264PictureInfoKHR.BYTES, VkVideoEncodeH264PictureInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoEncodeH264PictureInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeH264PictureInfoKHR.BYTES, VkVideoEncodeH264PictureInfoKHR.BYTES);
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
            return new Ptr(segment.asSlice(index * VkVideoEncodeH264PictureInfoKHR.BYTES, VkVideoEncodeH264PictureInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoEncodeH264PictureInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoEncodeH264PictureInfoKHR.BYTES,
                (end - start) * VkVideoEncodeH264PictureInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoEncodeH264PictureInfoKHR.BYTES));
        }

        public VkVideoEncodeH264PictureInfoKHR[] toArray() {
            VkVideoEncodeH264PictureInfoKHR[] ret = new VkVideoEncodeH264PictureInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkVideoEncodeH264PictureInfoKHR allocate(Arena arena) {
        VkVideoEncodeH264PictureInfoKHR ret = new VkVideoEncodeH264PictureInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H264_PICTURE_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH264PictureInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264PictureInfoKHR.Ptr ret = new VkVideoEncodeH264PictureInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_ENCODE_H264_PICTURE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH264PictureInfoKHR clone(Arena arena, VkVideoEncodeH264PictureInfoKHR src) {
        VkVideoEncodeH264PictureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H264_PICTURE_INFO_KHR);
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

    public @unsigned int naluSliceEntryCount() {
        return segment.get(LAYOUT$naluSliceEntryCount, OFFSET$naluSliceEntryCount);
    }

    public void naluSliceEntryCount(@unsigned int value) {
        segment.set(LAYOUT$naluSliceEntryCount, OFFSET$naluSliceEntryCount, value);
    }

    public @Nullable VkVideoEncodeH264NaluSliceInfoKHR pNaluSliceEntries() {
        MemorySegment s = pNaluSliceEntriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkVideoEncodeH264NaluSliceInfoKHR(s);
    }

    public void pNaluSliceEntries(@Nullable IVkVideoEncodeH264NaluSliceInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNaluSliceEntriesRaw(s);
    }

    @unsafe public @Nullable VkVideoEncodeH264NaluSliceInfoKHR.Ptr pNaluSliceEntries(int assumedCount) {
        MemorySegment s = pNaluSliceEntriesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoEncodeH264NaluSliceInfoKHR.BYTES);
        return new VkVideoEncodeH264NaluSliceInfoKHR.Ptr(s);
    }

    public @pointer(target=VkVideoEncodeH264NaluSliceInfoKHR.class) MemorySegment pNaluSliceEntriesRaw() {
        return segment.get(LAYOUT$pNaluSliceEntries, OFFSET$pNaluSliceEntries);
    }

    public void pNaluSliceEntriesRaw(@pointer(target=VkVideoEncodeH264NaluSliceInfoKHR.class) MemorySegment value) {
        segment.set(LAYOUT$pNaluSliceEntries, OFFSET$pNaluSliceEntries, value);
    }

    public @Nullable StdVideoEncodeH264PictureInfo pStdPictureInfo() {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeH264PictureInfo(s);
    }

    public void pStdPictureInfo(@Nullable IStdVideoEncodeH264PictureInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPictureInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH264PictureInfo.Ptr pStdPictureInfo(int assumedCount) {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264PictureInfo.BYTES);
        return new StdVideoEncodeH264PictureInfo.Ptr(s);
    }

    public @pointer(target=StdVideoEncodeH264PictureInfo.class) MemorySegment pStdPictureInfoRaw() {
        return segment.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);
    }

    public void pStdPictureInfoRaw(@pointer(target=StdVideoEncodeH264PictureInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);
    }

    public @unsigned int generatePrefixNalu() {
        return segment.get(LAYOUT$generatePrefixNalu, OFFSET$generatePrefixNalu);
    }

    public void generatePrefixNalu(@unsigned int value) {
        segment.set(LAYOUT$generatePrefixNalu, OFFSET$generatePrefixNalu, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("naluSliceEntryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVideoEncodeH264NaluSliceInfoKHR.LAYOUT).withName("pNaluSliceEntries"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264PictureInfo.LAYOUT).withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("generatePrefixNalu")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$naluSliceEntryCount = PathElement.groupElement("naluSliceEntryCount");
    public static final PathElement PATH$pNaluSliceEntries = PathElement.groupElement("pNaluSliceEntries");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("pStdPictureInfo");
    public static final PathElement PATH$generatePrefixNalu = PathElement.groupElement("generatePrefixNalu");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$naluSliceEntryCount = (OfInt) LAYOUT.select(PATH$naluSliceEntryCount);
    public static final AddressLayout LAYOUT$pNaluSliceEntries = (AddressLayout) LAYOUT.select(PATH$pNaluSliceEntries);
    public static final AddressLayout LAYOUT$pStdPictureInfo = (AddressLayout) LAYOUT.select(PATH$pStdPictureInfo);
    public static final OfInt LAYOUT$generatePrefixNalu = (OfInt) LAYOUT.select(PATH$generatePrefixNalu);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$naluSliceEntryCount = LAYOUT$naluSliceEntryCount.byteSize();
    public static final long SIZE$pNaluSliceEntries = LAYOUT$pNaluSliceEntries.byteSize();
    public static final long SIZE$pStdPictureInfo = LAYOUT$pStdPictureInfo.byteSize();
    public static final long SIZE$generatePrefixNalu = LAYOUT$generatePrefixNalu.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$naluSliceEntryCount = LAYOUT.byteOffset(PATH$naluSliceEntryCount);
    public static final long OFFSET$pNaluSliceEntries = LAYOUT.byteOffset(PATH$pNaluSliceEntries);
    public static final long OFFSET$pStdPictureInfo = LAYOUT.byteOffset(PATH$pStdPictureInfo);
    public static final long OFFSET$generatePrefixNalu = LAYOUT.byteOffset(PATH$generatePrefixNalu);
}
