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

/// Represents a pointer to a {@code StdVideoAV1QuantizationFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1QuantizationFlags {
///     uint32_t using_qmatrix : 1; // @link substring="using_qmatrix" target="#using_qmatrix"
///     uint32_t diff_uv_delta : 1; // @link substring="diff_uv_delta" target="#diff_uv_delta"
///     uint32_t reserved : 30;
/// } StdVideoAV1QuantizationFlags;
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
public record StdVideoAV1QuantizationFlags(@NotNull MemorySegment segment) implements IStdVideoAV1QuantizationFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoAV1QuantizationFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoAV1QuantizationFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoAV1QuantizationFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoAV1QuantizationFlags, Iterable<StdVideoAV1QuantizationFlags> {
        public long size() {
            return segment.byteSize() / StdVideoAV1QuantizationFlags.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoAV1QuantizationFlags at(long index) {
            return new StdVideoAV1QuantizationFlags(segment.asSlice(index * StdVideoAV1QuantizationFlags.BYTES, StdVideoAV1QuantizationFlags.BYTES));
        }

        public StdVideoAV1QuantizationFlags.Ptr at(long index, @NotNull Consumer<@NotNull StdVideoAV1QuantizationFlags> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull StdVideoAV1QuantizationFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoAV1QuantizationFlags.BYTES, StdVideoAV1QuantizationFlags.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * StdVideoAV1QuantizationFlags.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoAV1QuantizationFlags.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoAV1QuantizationFlags.BYTES,
                (end - start) * StdVideoAV1QuantizationFlags.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoAV1QuantizationFlags.BYTES));
        }

        public StdVideoAV1QuantizationFlags[] toArray() {
            StdVideoAV1QuantizationFlags[] ret = new StdVideoAV1QuantizationFlags[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<StdVideoAV1QuantizationFlags> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<StdVideoAV1QuantizationFlags> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= StdVideoAV1QuantizationFlags.BYTES;
            }

            @Override
            public StdVideoAV1QuantizationFlags next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                StdVideoAV1QuantizationFlags ret = new StdVideoAV1QuantizationFlags(segment.asSlice(0, StdVideoAV1QuantizationFlags.BYTES));
                segment = segment.asSlice(StdVideoAV1QuantizationFlags.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static StdVideoAV1QuantizationFlags allocate(Arena arena) {
        return new StdVideoAV1QuantizationFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1QuantizationFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoAV1QuantizationFlags.Ptr(segment);
    }

    public static StdVideoAV1QuantizationFlags clone(Arena arena, StdVideoAV1QuantizationFlags src) {
        StdVideoAV1QuantizationFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean using_qmatrix() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$using_qmatrix$reserved, LAYOUT$bitfield$using_qmatrix$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public StdVideoAV1QuantizationFlags using_qmatrix(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$using_qmatrix$reserved, LAYOUT$bitfield$using_qmatrix$reserved);
        BitfieldUtil.writeBit(s, 0, value);
        return this;
    }

    public boolean diff_uv_delta() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$using_qmatrix$reserved, LAYOUT$bitfield$using_qmatrix$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public StdVideoAV1QuantizationFlags diff_uv_delta(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$using_qmatrix$reserved, LAYOUT$bitfield$using_qmatrix$reserved);
        BitfieldUtil.writeBit(s, 1, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$using_qmatrix$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$using_qmatrix$reserved = PathElement.groupElement("using_qmatrix$reserved");

    public static final OfInt LAYOUT$bitfield$using_qmatrix$reserved = (OfInt) LAYOUT.select(PATH$bitfield$using_qmatrix$reserved);


    public static final long OFFSET$bitfield$using_qmatrix$reserved = LAYOUT.byteOffset(PATH$bitfield$using_qmatrix$reserved);
}
