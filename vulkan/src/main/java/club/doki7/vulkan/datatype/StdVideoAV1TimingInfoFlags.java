package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

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

/// Represents a pointer to a {@code StdVideoAV1TimingInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1TimingInfoFlags {
///     uint32_t equal_picture_interval : 1; // @link substring="equal_picture_interval" target="#equal_picture_interval"
///     uint32_t reserved : 31;
/// } StdVideoAV1TimingInfoFlags;
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
public record StdVideoAV1TimingInfoFlags(@NotNull MemorySegment segment) implements IStdVideoAV1TimingInfoFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoAV1TimingInfoFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoAV1TimingInfoFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoAV1TimingInfoFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoAV1TimingInfoFlags, Iterable<StdVideoAV1TimingInfoFlags> {
        public long size() {
            return segment.byteSize() / StdVideoAV1TimingInfoFlags.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoAV1TimingInfoFlags at(long index) {
            return new StdVideoAV1TimingInfoFlags(segment.asSlice(index * StdVideoAV1TimingInfoFlags.BYTES, StdVideoAV1TimingInfoFlags.BYTES));
        }

        public void write(long index, @NotNull StdVideoAV1TimingInfoFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoAV1TimingInfoFlags.BYTES, StdVideoAV1TimingInfoFlags.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * StdVideoAV1TimingInfoFlags.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoAV1TimingInfoFlags.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoAV1TimingInfoFlags.BYTES,
                (end - start) * StdVideoAV1TimingInfoFlags.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoAV1TimingInfoFlags.BYTES));
        }

        public StdVideoAV1TimingInfoFlags[] toArray() {
            StdVideoAV1TimingInfoFlags[] ret = new StdVideoAV1TimingInfoFlags[(int) size()];
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
        public static final class Iter implements Iterator<StdVideoAV1TimingInfoFlags> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= StdVideoAV1TimingInfoFlags.BYTES;
            }

            @Override
            public StdVideoAV1TimingInfoFlags next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                StdVideoAV1TimingInfoFlags ret = new StdVideoAV1TimingInfoFlags(segment.asSlice(0, StdVideoAV1TimingInfoFlags.BYTES));
                segment = segment.asSlice(StdVideoAV1TimingInfoFlags.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static StdVideoAV1TimingInfoFlags allocate(Arena arena) {
        return new StdVideoAV1TimingInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1TimingInfoFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoAV1TimingInfoFlags.Ptr(segment);
    }

    public static StdVideoAV1TimingInfoFlags clone(Arena arena, StdVideoAV1TimingInfoFlags src) {
        StdVideoAV1TimingInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean equal_picture_interval() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$equal_picture_interval$reserved, LAYOUT$bitfield$equal_picture_interval$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public StdVideoAV1TimingInfoFlags equal_picture_interval(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$equal_picture_interval$reserved, LAYOUT$bitfield$equal_picture_interval$reserved);
        BitfieldUtil.writeBit(s, 0, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$equal_picture_interval$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$equal_picture_interval$reserved = PathElement.groupElement("equal_picture_interval$reserved");

    public static final OfInt LAYOUT$bitfield$equal_picture_interval$reserved = (OfInt) LAYOUT.select(PATH$bitfield$equal_picture_interval$reserved);


    public static final long OFFSET$bitfield$equal_picture_interval$reserved = LAYOUT.byteOffset(PATH$bitfield$equal_picture_interval$reserved);
}
