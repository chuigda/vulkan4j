package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoDecodeH264ReferenceInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoDecodeH264ReferenceInfoFlags {
///     uint32_t top_field_flag : 1; // @link substring="top_field_flag" target="#top_field_flag"
///     uint32_t bottom_field_flag : 1; // @link substring="bottom_field_flag" target="#bottom_field_flag"
///     uint32_t used_for_long_term_reference : 1; // @link substring="used_for_long_term_reference" target="#used_for_long_term_reference"
///     uint32_t is_non_existing : 1; // @link substring="is_non_existing" target="#is_non_existing"
/// } StdVideoDecodeH264ReferenceInfoFlags;
/// }
///
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
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoDecodeH264ReferenceInfoFlags(@NotNull MemorySegment segment) implements IStdVideoDecodeH264ReferenceInfoFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoDecodeH264ReferenceInfoFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoDecodeH264ReferenceInfoFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoDecodeH264ReferenceInfoFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoDecodeH264ReferenceInfoFlags {
        public long size() {
            return segment.byteSize() / StdVideoDecodeH264ReferenceInfoFlags.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoDecodeH264ReferenceInfoFlags at(long index) {
            return new StdVideoDecodeH264ReferenceInfoFlags(segment.asSlice(index * StdVideoDecodeH264ReferenceInfoFlags.BYTES, StdVideoDecodeH264ReferenceInfoFlags.BYTES));
        }

        public void write(long index, @NotNull StdVideoDecodeH264ReferenceInfoFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoDecodeH264ReferenceInfoFlags.BYTES, StdVideoDecodeH264ReferenceInfoFlags.BYTES);
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
            return new Ptr(segment.asSlice(index * StdVideoDecodeH264ReferenceInfoFlags.BYTES, StdVideoDecodeH264ReferenceInfoFlags.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoDecodeH264ReferenceInfoFlags.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoDecodeH264ReferenceInfoFlags.BYTES,
                (end - start) * StdVideoDecodeH264ReferenceInfoFlags.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoDecodeH264ReferenceInfoFlags.BYTES));
        }

        public StdVideoDecodeH264ReferenceInfoFlags[] toArray() {
            StdVideoDecodeH264ReferenceInfoFlags[] ret = new StdVideoDecodeH264ReferenceInfoFlags[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static StdVideoDecodeH264ReferenceInfoFlags allocate(Arena arena) {
        return new StdVideoDecodeH264ReferenceInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeH264ReferenceInfoFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoDecodeH264ReferenceInfoFlags.Ptr(segment);
    }

    public static StdVideoDecodeH264ReferenceInfoFlags clone(Arena arena, StdVideoDecodeH264ReferenceInfoFlags src) {
        StdVideoDecodeH264ReferenceInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean top_field_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag$is_non_existing, LAYOUT$bitfield$top_field_flag$is_non_existing);
        return BitfieldUtil.readBit(s, 0);
    }

    public void top_field_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag$is_non_existing, LAYOUT$bitfield$top_field_flag$is_non_existing);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean bottom_field_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag$is_non_existing, LAYOUT$bitfield$top_field_flag$is_non_existing);
        return BitfieldUtil.readBit(s, 1);
    }

    public void bottom_field_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag$is_non_existing, LAYOUT$bitfield$top_field_flag$is_non_existing);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean used_for_long_term_reference() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag$is_non_existing, LAYOUT$bitfield$top_field_flag$is_non_existing);
        return BitfieldUtil.readBit(s, 2);
    }

    public void used_for_long_term_reference(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag$is_non_existing, LAYOUT$bitfield$top_field_flag$is_non_existing);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean is_non_existing() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag$is_non_existing, LAYOUT$bitfield$top_field_flag$is_non_existing);
        return BitfieldUtil.readBit(s, 3);
    }

    public void is_non_existing(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$top_field_flag$is_non_existing, LAYOUT$bitfield$top_field_flag$is_non_existing);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$top_field_flag$is_non_existing")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$top_field_flag$is_non_existing = PathElement.groupElement("top_field_flag$is_non_existing");

    public static final OfInt LAYOUT$bitfield$top_field_flag$is_non_existing = (OfInt) LAYOUT.select(PATH$bitfield$top_field_flag$is_non_existing);


    public static final long OFFSET$bitfield$top_field_flag$is_non_existing = LAYOUT.byteOffset(PATH$bitfield$top_field_flag$is_non_existing);
}
