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
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoAV1FilmGrainFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1FilmGrainFlags {
///     uint32_t chroma_scaling_from_luma : 1; // @link substring="chroma_scaling_from_luma" target="#chroma_scaling_from_luma"
///     uint32_t overlap_flag : 1; // @link substring="overlap_flag" target="#overlap_flag"
///     uint32_t clip_to_restricted_range : 1; // @link substring="clip_to_restricted_range" target="#clip_to_restricted_range"
///     uint32_t update_grain : 1; // @link substring="update_grain" target="#update_grain"
///     uint32_t reserved : 28;
/// } StdVideoAV1FilmGrainFlags;
/// }
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
public record StdVideoAV1FilmGrainFlags(@NotNull MemorySegment segment) implements IStdVideoAV1FilmGrainFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoAV1FilmGrainFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoAV1FilmGrainFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoAV1FilmGrainFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoAV1FilmGrainFlags, Iterable<StdVideoAV1FilmGrainFlags> {
        public long size() {
            return segment.byteSize() / StdVideoAV1FilmGrainFlags.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoAV1FilmGrainFlags at(long index) {
            return new StdVideoAV1FilmGrainFlags(segment.asSlice(index * StdVideoAV1FilmGrainFlags.BYTES, StdVideoAV1FilmGrainFlags.BYTES));
        }

        public StdVideoAV1FilmGrainFlags.Ptr at(long index, @NotNull Consumer<@NotNull StdVideoAV1FilmGrainFlags> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull StdVideoAV1FilmGrainFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoAV1FilmGrainFlags.BYTES, StdVideoAV1FilmGrainFlags.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * StdVideoAV1FilmGrainFlags.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoAV1FilmGrainFlags.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoAV1FilmGrainFlags.BYTES,
                (end - start) * StdVideoAV1FilmGrainFlags.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoAV1FilmGrainFlags.BYTES));
        }

        public StdVideoAV1FilmGrainFlags[] toArray() {
            StdVideoAV1FilmGrainFlags[] ret = new StdVideoAV1FilmGrainFlags[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<StdVideoAV1FilmGrainFlags> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<StdVideoAV1FilmGrainFlags> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= StdVideoAV1FilmGrainFlags.BYTES;
            }

            @Override
            public StdVideoAV1FilmGrainFlags next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                StdVideoAV1FilmGrainFlags ret = new StdVideoAV1FilmGrainFlags(segment.asSlice(0, StdVideoAV1FilmGrainFlags.BYTES));
                segment = segment.asSlice(StdVideoAV1FilmGrainFlags.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static StdVideoAV1FilmGrainFlags allocate(Arena arena) {
        return new StdVideoAV1FilmGrainFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1FilmGrainFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoAV1FilmGrainFlags.Ptr(segment);
    }

    public static StdVideoAV1FilmGrainFlags clone(Arena arena, StdVideoAV1FilmGrainFlags src) {
        StdVideoAV1FilmGrainFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean chroma_scaling_from_luma() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public StdVideoAV1FilmGrainFlags chroma_scaling_from_luma(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        BitfieldUtil.writeBit(s, 0, value);
        return this;
    }

    public boolean overlap_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public StdVideoAV1FilmGrainFlags overlap_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        BitfieldUtil.writeBit(s, 1, value);
        return this;
    }

    public boolean clip_to_restricted_range() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        return BitfieldUtil.readBit(s, 2);
    }

    public StdVideoAV1FilmGrainFlags clip_to_restricted_range(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        BitfieldUtil.writeBit(s, 2, value);
        return this;
    }

    public boolean update_grain() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        return BitfieldUtil.readBit(s, 3);
    }

    public StdVideoAV1FilmGrainFlags update_grain(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$chroma_scaling_from_luma$reserved, LAYOUT$bitfield$chroma_scaling_from_luma$reserved);
        BitfieldUtil.writeBit(s, 3, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$chroma_scaling_from_luma$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$chroma_scaling_from_luma$reserved = PathElement.groupElement("chroma_scaling_from_luma$reserved");

    public static final OfInt LAYOUT$bitfield$chroma_scaling_from_luma$reserved = (OfInt) LAYOUT.select(PATH$bitfield$chroma_scaling_from_luma$reserved);


    public static final long OFFSET$bitfield$chroma_scaling_from_luma$reserved = LAYOUT.byteOffset(PATH$bitfield$chroma_scaling_from_luma$reserved);
}
