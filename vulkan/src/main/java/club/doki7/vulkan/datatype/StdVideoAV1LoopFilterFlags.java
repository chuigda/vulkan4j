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

/// Represents a pointer to a {@code StdVideoAV1LoopFilterFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1LoopFilterFlags {
///     uint32_t loop_filter_delta_enabled : 1; // @link substring="loop_filter_delta_enabled" target="#loop_filter_delta_enabled"
///     uint32_t loop_filter_delta_update : 1; // @link substring="loop_filter_delta_update" target="#loop_filter_delta_update"
///     uint32_t reserved : 30;
/// } StdVideoAV1LoopFilterFlags;
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
public record StdVideoAV1LoopFilterFlags(@NotNull MemorySegment segment) implements IStdVideoAV1LoopFilterFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoAV1LoopFilterFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoAV1LoopFilterFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoAV1LoopFilterFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoAV1LoopFilterFlags {
        public long size() {
            return segment.byteSize() / StdVideoAV1LoopFilterFlags.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoAV1LoopFilterFlags at(long index) {
            return new StdVideoAV1LoopFilterFlags(segment.asSlice(index * StdVideoAV1LoopFilterFlags.BYTES, StdVideoAV1LoopFilterFlags.BYTES));
        }

        public void write(long index, @NotNull StdVideoAV1LoopFilterFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoAV1LoopFilterFlags.BYTES, StdVideoAV1LoopFilterFlags.BYTES);
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
            return new Ptr(segment.asSlice(index * StdVideoAV1LoopFilterFlags.BYTES, StdVideoAV1LoopFilterFlags.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoAV1LoopFilterFlags.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoAV1LoopFilterFlags.BYTES,
                (end - start) * StdVideoAV1LoopFilterFlags.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoAV1LoopFilterFlags.BYTES));
        }

        public StdVideoAV1LoopFilterFlags[] toArray() {
            StdVideoAV1LoopFilterFlags[] ret = new StdVideoAV1LoopFilterFlags[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static StdVideoAV1LoopFilterFlags allocate(Arena arena) {
        return new StdVideoAV1LoopFilterFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1LoopFilterFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoAV1LoopFilterFlags.Ptr(segment);
    }

    public static StdVideoAV1LoopFilterFlags clone(Arena arena, StdVideoAV1LoopFilterFlags src) {
        StdVideoAV1LoopFilterFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean loop_filter_delta_enabled() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$loop_filter_delta_enabled$reserved, LAYOUT$bitfield$loop_filter_delta_enabled$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void loop_filter_delta_enabled(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$loop_filter_delta_enabled$reserved, LAYOUT$bitfield$loop_filter_delta_enabled$reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean loop_filter_delta_update() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$loop_filter_delta_enabled$reserved, LAYOUT$bitfield$loop_filter_delta_enabled$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void loop_filter_delta_update(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$loop_filter_delta_enabled$reserved, LAYOUT$bitfield$loop_filter_delta_enabled$reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$loop_filter_delta_enabled$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$loop_filter_delta_enabled$reserved = PathElement.groupElement("loop_filter_delta_enabled$reserved");

    public static final OfInt LAYOUT$bitfield$loop_filter_delta_enabled$reserved = (OfInt) LAYOUT.select(PATH$bitfield$loop_filter_delta_enabled$reserved);


    public static final long OFFSET$bitfield$loop_filter_delta_enabled$reserved = LAYOUT.byteOffset(PATH$bitfield$loop_filter_delta_enabled$reserved);
}
