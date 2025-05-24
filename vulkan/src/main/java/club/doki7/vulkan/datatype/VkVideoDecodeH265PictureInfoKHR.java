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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265PictureInfoKHR.html"><code>VkVideoDecodeH265PictureInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeH265PictureInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     StdVideoDecodeH265PictureInfo const* pStdPictureInfo; // @link substring="StdVideoDecodeH265PictureInfo" target="StdVideoDecodeH265PictureInfo" @link substring="pStdPictureInfo" target="#pStdPictureInfo"
///     uint32_t sliceSegmentCount; // @link substring="sliceSegmentCount" target="#sliceSegmentCount"
///     uint32_t const* pSliceSegmentOffsets; // @link substring="pSliceSegmentOffsets" target="#pSliceSegmentOffsets"
/// } VkVideoDecodeH265PictureInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_H265_PICTURE_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoDecodeH265PictureInfoKHR#allocate(Arena)}, {@link VkVideoDecodeH265PictureInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoDecodeH265PictureInfoKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
///
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265PictureInfoKHR.html"><code>VkVideoDecodeH265PictureInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeH265PictureInfoKHR(@NotNull MemorySegment segment) implements IVkVideoDecodeH265PictureInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH265PictureInfoKHR.html"><code>VkVideoDecodeH265PictureInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoDecodeH265PictureInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoDecodeH265PictureInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoDecodeH265PictureInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoDecodeH265PictureInfoKHR {
        public long size() {
            return segment.byteSize() / VkVideoDecodeH265PictureInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoDecodeH265PictureInfoKHR at(long index) {
            return new VkVideoDecodeH265PictureInfoKHR(segment.asSlice(index * VkVideoDecodeH265PictureInfoKHR.BYTES, VkVideoDecodeH265PictureInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoDecodeH265PictureInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoDecodeH265PictureInfoKHR.BYTES, VkVideoDecodeH265PictureInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkVideoDecodeH265PictureInfoKHR.BYTES, VkVideoDecodeH265PictureInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoDecodeH265PictureInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoDecodeH265PictureInfoKHR.BYTES,
                (end - start) * VkVideoDecodeH265PictureInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoDecodeH265PictureInfoKHR.BYTES));
        }

        public VkVideoDecodeH265PictureInfoKHR[] toArray() {
            VkVideoDecodeH265PictureInfoKHR[] ret = new VkVideoDecodeH265PictureInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkVideoDecodeH265PictureInfoKHR allocate(Arena arena) {
        VkVideoDecodeH265PictureInfoKHR ret = new VkVideoDecodeH265PictureInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_H265_PICTURE_INFO_KHR);
        return ret;
    }

    public static VkVideoDecodeH265PictureInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH265PictureInfoKHR.Ptr ret = new VkVideoDecodeH265PictureInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_DECODE_H265_PICTURE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeH265PictureInfoKHR clone(Arena arena, VkVideoDecodeH265PictureInfoKHR src) {
        VkVideoDecodeH265PictureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_H265_PICTURE_INFO_KHR);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public void pStdPictureInfo(@Nullable IStdVideoDecodeH265PictureInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPictureInfoRaw(s);
    }

    @Unsafe public @Nullable StdVideoDecodeH265PictureInfo.Ptr pStdPictureInfo(int assumedCount) {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoDecodeH265PictureInfo.BYTES);
        return new StdVideoDecodeH265PictureInfo.Ptr(s);
    }

    public @Nullable StdVideoDecodeH265PictureInfo pStdPictureInfo() {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoDecodeH265PictureInfo(s);
    }

    public @Pointer(target=StdVideoDecodeH265PictureInfo.class) MemorySegment pStdPictureInfoRaw() {
        return segment.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);
    }

    public void pStdPictureInfoRaw(@Pointer(target=StdVideoDecodeH265PictureInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);
    }

    public @Unsigned int sliceSegmentCount() {
        return segment.get(LAYOUT$sliceSegmentCount, OFFSET$sliceSegmentCount);
    }

    public void sliceSegmentCount(@Unsigned int value) {
        segment.set(LAYOUT$sliceSegmentCount, OFFSET$sliceSegmentCount, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Unsigned IntPtr pSliceSegmentOffsets() {
        MemorySegment s = pSliceSegmentOffsetsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pSliceSegmentOffsets(@Nullable @Unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSliceSegmentOffsetsRaw(s);
    }

    public @Pointer(comment="uint32_t*") MemorySegment pSliceSegmentOffsetsRaw() {
        return segment.get(LAYOUT$pSliceSegmentOffsets, OFFSET$pSliceSegmentOffsets);
    }

    public void pSliceSegmentOffsetsRaw(@Pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pSliceSegmentOffsets, OFFSET$pSliceSegmentOffsets, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoDecodeH265PictureInfo.LAYOUT).withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("sliceSegmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pSliceSegmentOffsets")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("pStdPictureInfo");
    public static final PathElement PATH$sliceSegmentCount = PathElement.groupElement("sliceSegmentCount");
    public static final PathElement PATH$pSliceSegmentOffsets = PathElement.groupElement("pSliceSegmentOffsets");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pStdPictureInfo = (AddressLayout) LAYOUT.select(PATH$pStdPictureInfo);
    public static final OfInt LAYOUT$sliceSegmentCount = (OfInt) LAYOUT.select(PATH$sliceSegmentCount);
    public static final AddressLayout LAYOUT$pSliceSegmentOffsets = (AddressLayout) LAYOUT.select(PATH$pSliceSegmentOffsets);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdPictureInfo = LAYOUT$pStdPictureInfo.byteSize();
    public static final long SIZE$sliceSegmentCount = LAYOUT$sliceSegmentCount.byteSize();
    public static final long SIZE$pSliceSegmentOffsets = LAYOUT$pSliceSegmentOffsets.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdPictureInfo = LAYOUT.byteOffset(PATH$pStdPictureInfo);
    public static final long OFFSET$sliceSegmentCount = LAYOUT.byteOffset(PATH$sliceSegmentCount);
    public static final long OFFSET$pSliceSegmentOffsets = LAYOUT.byteOffset(PATH$pSliceSegmentOffsets);
}
