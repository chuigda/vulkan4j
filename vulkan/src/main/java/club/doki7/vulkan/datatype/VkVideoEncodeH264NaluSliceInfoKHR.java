package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264NaluSliceInfoKHR.html"><code>VkVideoEncodeH264NaluSliceInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH264NaluSliceInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     int32_t constantQp; // @link substring="constantQp" target="#constantQp"
///     StdVideoEncodeH264SliceHeader const* pStdSliceHeader; // @link substring="StdVideoEncodeH264SliceHeader" target="StdVideoEncodeH264SliceHeader" @link substring="pStdSliceHeader" target="#pStdSliceHeader"
/// } VkVideoEncodeH264NaluSliceInfoKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR`
///
/// The {@code allocate} ({@link VkVideoEncodeH264NaluSliceInfoKHR#allocate(Arena)}, {@link VkVideoEncodeH264NaluSliceInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkVideoEncodeH264NaluSliceInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264NaluSliceInfoKHR.html"><code>VkVideoEncodeH264NaluSliceInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH264NaluSliceInfoKHR(@NotNull MemorySegment segment) implements IVkVideoEncodeH264NaluSliceInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264NaluSliceInfoKHR.html"><code>VkVideoEncodeH264NaluSliceInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkVideoEncodeH264NaluSliceInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkVideoEncodeH264NaluSliceInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkVideoEncodeH264NaluSliceInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkVideoEncodeH264NaluSliceInfoKHR, Iterable<VkVideoEncodeH264NaluSliceInfoKHR> {
        public long size() {
            return segment.byteSize() / VkVideoEncodeH264NaluSliceInfoKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkVideoEncodeH264NaluSliceInfoKHR at(long index) {
            return new VkVideoEncodeH264NaluSliceInfoKHR(segment.asSlice(index * VkVideoEncodeH264NaluSliceInfoKHR.BYTES, VkVideoEncodeH264NaluSliceInfoKHR.BYTES));
        }

        public void write(long index, @NotNull VkVideoEncodeH264NaluSliceInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkVideoEncodeH264NaluSliceInfoKHR.BYTES, VkVideoEncodeH264NaluSliceInfoKHR.BYTES);
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
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * VkVideoEncodeH264NaluSliceInfoKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkVideoEncodeH264NaluSliceInfoKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkVideoEncodeH264NaluSliceInfoKHR.BYTES,
                (end - start) * VkVideoEncodeH264NaluSliceInfoKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkVideoEncodeH264NaluSliceInfoKHR.BYTES));
        }

        public VkVideoEncodeH264NaluSliceInfoKHR[] toArray() {
            VkVideoEncodeH264NaluSliceInfoKHR[] ret = new VkVideoEncodeH264NaluSliceInfoKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        public static final class Iter implements Iterator<VkVideoEncodeH264NaluSliceInfoKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VkVideoEncodeH264NaluSliceInfoKHR.BYTES;
            }

            @Override
            public VkVideoEncodeH264NaluSliceInfoKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VkVideoEncodeH264NaluSliceInfoKHR ret = new VkVideoEncodeH264NaluSliceInfoKHR(segment.asSlice(0, VkVideoEncodeH264NaluSliceInfoKHR.BYTES));
                segment = segment.asSlice(VkVideoEncodeH264NaluSliceInfoKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR allocate(Arena arena) {
        VkVideoEncodeH264NaluSliceInfoKHR ret = new VkVideoEncodeH264NaluSliceInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR);
        return ret;
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264NaluSliceInfoKHR.Ptr ret = new VkVideoEncodeH264NaluSliceInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH264NaluSliceInfoKHR clone(Arena arena, VkVideoEncodeH264NaluSliceInfoKHR src) {
        VkVideoEncodeH264NaluSliceInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H264_NALU_SLICE_INFO_KHR);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public VkVideoEncodeH264NaluSliceInfoKHR sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkVideoEncodeH264NaluSliceInfoKHR pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public int constantQp() {
        return segment.get(LAYOUT$constantQp, OFFSET$constantQp);
    }

    public VkVideoEncodeH264NaluSliceInfoKHR constantQp(int value) {
        segment.set(LAYOUT$constantQp, OFFSET$constantQp, value);
        return this;
    }

    public VkVideoEncodeH264NaluSliceInfoKHR pStdSliceHeader(@Nullable IStdVideoEncodeH264SliceHeader value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdSliceHeaderRaw(s);
        return this;
    }

    @Unsafe public @Nullable StdVideoEncodeH264SliceHeader.Ptr pStdSliceHeader(int assumedCount) {
        MemorySegment s = pStdSliceHeaderRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264SliceHeader.BYTES);
        return new StdVideoEncodeH264SliceHeader.Ptr(s);
    }

    public @Nullable StdVideoEncodeH264SliceHeader pStdSliceHeader() {
        MemorySegment s = pStdSliceHeaderRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeH264SliceHeader(s);
    }

    public @Pointer(target=StdVideoEncodeH264SliceHeader.class) MemorySegment pStdSliceHeaderRaw() {
        return segment.get(LAYOUT$pStdSliceHeader, OFFSET$pStdSliceHeader);
    }

    public void pStdSliceHeaderRaw(@Pointer(target=StdVideoEncodeH264SliceHeader.class) MemorySegment value) {
        segment.set(LAYOUT$pStdSliceHeader, OFFSET$pStdSliceHeader, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("constantQp"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264SliceHeader.LAYOUT).withName("pStdSliceHeader")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$constantQp = PathElement.groupElement("constantQp");
    public static final PathElement PATH$pStdSliceHeader = PathElement.groupElement("pStdSliceHeader");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$constantQp = (OfInt) LAYOUT.select(PATH$constantQp);
    public static final AddressLayout LAYOUT$pStdSliceHeader = (AddressLayout) LAYOUT.select(PATH$pStdSliceHeader);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$constantQp = LAYOUT$constantQp.byteSize();
    public static final long SIZE$pStdSliceHeader = LAYOUT$pStdSliceHeader.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$constantQp = LAYOUT.byteOffset(PATH$constantQp);
    public static final long OFFSET$pStdSliceHeader = LAYOUT.byteOffset(PATH$pStdSliceHeader);
}
