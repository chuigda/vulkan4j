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

/// Represents a pointer to a {@code StdVideoEncodeH265LongTermRefPics} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH265LongTermRefPics {
///     uint8_t num_long_term_sps; // @link substring="num_long_term_sps" target="#num_long_term_sps"
///     uint8_t num_long_term_pics; // @link substring="num_long_term_pics" target="#num_long_term_pics"
///     uint8_t lt_idx_sps; // @link substring="lt_idx_sps" target="#lt_idx_sps"
///     uint8_t poc_lsb_lt; // @link substring="poc_lsb_lt" target="#poc_lsb_lt"
///     uint16_t used_by_curr_pic_lt_flag; // @link substring="used_by_curr_pic_lt_flag" target="#used_by_curr_pic_lt_flag"
///     uint8_t delta_poc_msb_present_flag; // @link substring="delta_poc_msb_present_flag" target="#delta_poc_msb_present_flag"
///     uint8_t delta_poc_msb_cycle_lt; // @link substring="delta_poc_msb_cycle_lt" target="#delta_poc_msb_cycle_lt"
/// } StdVideoEncodeH265LongTermRefPics;
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
public record StdVideoEncodeH265LongTermRefPics(@NotNull MemorySegment segment) implements IStdVideoEncodeH265LongTermRefPics {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoEncodeH265LongTermRefPics}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoEncodeH265LongTermRefPics to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoEncodeH265LongTermRefPics.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoEncodeH265LongTermRefPics {
        public long size() {
            return segment.byteSize() / StdVideoEncodeH265LongTermRefPics.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoEncodeH265LongTermRefPics at(long index) {
            return new StdVideoEncodeH265LongTermRefPics(segment.asSlice(index * StdVideoEncodeH265LongTermRefPics.BYTES, StdVideoEncodeH265LongTermRefPics.BYTES));
        }

        public void write(long index, @NotNull StdVideoEncodeH265LongTermRefPics value) {
            MemorySegment s = segment.asSlice(index * StdVideoEncodeH265LongTermRefPics.BYTES, StdVideoEncodeH265LongTermRefPics.BYTES);
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
            return new Ptr(segment.asSlice(index * StdVideoEncodeH265LongTermRefPics.BYTES, StdVideoEncodeH265LongTermRefPics.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoEncodeH265LongTermRefPics.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoEncodeH265LongTermRefPics.BYTES,
                (end - start) * StdVideoEncodeH265LongTermRefPics.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoEncodeH265LongTermRefPics.BYTES));
        }
    }

    public static StdVideoEncodeH265LongTermRefPics allocate(Arena arena) {
        return new StdVideoEncodeH265LongTermRefPics(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH265LongTermRefPics.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoEncodeH265LongTermRefPics.Ptr(segment);
    }

    public static StdVideoEncodeH265LongTermRefPics clone(Arena arena, StdVideoEncodeH265LongTermRefPics src) {
        StdVideoEncodeH265LongTermRefPics ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned byte num_long_term_sps() {
        return segment.get(LAYOUT$num_long_term_sps, OFFSET$num_long_term_sps);
    }

    public void num_long_term_sps(@unsigned byte value) {
        segment.set(LAYOUT$num_long_term_sps, OFFSET$num_long_term_sps, value);
    }

    public @unsigned byte num_long_term_pics() {
        return segment.get(LAYOUT$num_long_term_pics, OFFSET$num_long_term_pics);
    }

    public void num_long_term_pics(@unsigned byte value) {
        segment.set(LAYOUT$num_long_term_pics, OFFSET$num_long_term_pics, value);
    }

    public @unsigned byte lt_idx_sps() {
        return segment.get(LAYOUT$lt_idx_sps, OFFSET$lt_idx_sps);
    }

    public void lt_idx_sps(@unsigned byte value) {
        segment.set(LAYOUT$lt_idx_sps, OFFSET$lt_idx_sps, value);
    }

    public @unsigned byte poc_lsb_lt() {
        return segment.get(LAYOUT$poc_lsb_lt, OFFSET$poc_lsb_lt);
    }

    public void poc_lsb_lt(@unsigned byte value) {
        segment.set(LAYOUT$poc_lsb_lt, OFFSET$poc_lsb_lt, value);
    }

    public @unsigned short used_by_curr_pic_lt_flag() {
        return segment.get(LAYOUT$used_by_curr_pic_lt_flag, OFFSET$used_by_curr_pic_lt_flag);
    }

    public void used_by_curr_pic_lt_flag(@unsigned short value) {
        segment.set(LAYOUT$used_by_curr_pic_lt_flag, OFFSET$used_by_curr_pic_lt_flag, value);
    }

    public @unsigned byte delta_poc_msb_present_flag() {
        return segment.get(LAYOUT$delta_poc_msb_present_flag, OFFSET$delta_poc_msb_present_flag);
    }

    public void delta_poc_msb_present_flag(@unsigned byte value) {
        segment.set(LAYOUT$delta_poc_msb_present_flag, OFFSET$delta_poc_msb_present_flag, value);
    }

    public @unsigned byte delta_poc_msb_cycle_lt() {
        return segment.get(LAYOUT$delta_poc_msb_cycle_lt, OFFSET$delta_poc_msb_cycle_lt);
    }

    public void delta_poc_msb_cycle_lt(@unsigned byte value) {
        segment.set(LAYOUT$delta_poc_msb_cycle_lt, OFFSET$delta_poc_msb_cycle_lt, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("num_long_term_sps"),
        ValueLayout.JAVA_BYTE.withName("num_long_term_pics"),
        ValueLayout.JAVA_BYTE.withName("lt_idx_sps"),
        ValueLayout.JAVA_BYTE.withName("poc_lsb_lt"),
        ValueLayout.JAVA_SHORT.withName("used_by_curr_pic_lt_flag"),
        ValueLayout.JAVA_BYTE.withName("delta_poc_msb_present_flag"),
        ValueLayout.JAVA_BYTE.withName("delta_poc_msb_cycle_lt")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$num_long_term_sps = PathElement.groupElement("num_long_term_sps");
    public static final PathElement PATH$num_long_term_pics = PathElement.groupElement("num_long_term_pics");
    public static final PathElement PATH$lt_idx_sps = PathElement.groupElement("lt_idx_sps");
    public static final PathElement PATH$poc_lsb_lt = PathElement.groupElement("poc_lsb_lt");
    public static final PathElement PATH$used_by_curr_pic_lt_flag = PathElement.groupElement("used_by_curr_pic_lt_flag");
    public static final PathElement PATH$delta_poc_msb_present_flag = PathElement.groupElement("delta_poc_msb_present_flag");
    public static final PathElement PATH$delta_poc_msb_cycle_lt = PathElement.groupElement("delta_poc_msb_cycle_lt");

    public static final OfByte LAYOUT$num_long_term_sps = (OfByte) LAYOUT.select(PATH$num_long_term_sps);
    public static final OfByte LAYOUT$num_long_term_pics = (OfByte) LAYOUT.select(PATH$num_long_term_pics);
    public static final OfByte LAYOUT$lt_idx_sps = (OfByte) LAYOUT.select(PATH$lt_idx_sps);
    public static final OfByte LAYOUT$poc_lsb_lt = (OfByte) LAYOUT.select(PATH$poc_lsb_lt);
    public static final OfShort LAYOUT$used_by_curr_pic_lt_flag = (OfShort) LAYOUT.select(PATH$used_by_curr_pic_lt_flag);
    public static final OfByte LAYOUT$delta_poc_msb_present_flag = (OfByte) LAYOUT.select(PATH$delta_poc_msb_present_flag);
    public static final OfByte LAYOUT$delta_poc_msb_cycle_lt = (OfByte) LAYOUT.select(PATH$delta_poc_msb_cycle_lt);

    public static final long SIZE$num_long_term_sps = LAYOUT$num_long_term_sps.byteSize();
    public static final long SIZE$num_long_term_pics = LAYOUT$num_long_term_pics.byteSize();
    public static final long SIZE$lt_idx_sps = LAYOUT$lt_idx_sps.byteSize();
    public static final long SIZE$poc_lsb_lt = LAYOUT$poc_lsb_lt.byteSize();
    public static final long SIZE$used_by_curr_pic_lt_flag = LAYOUT$used_by_curr_pic_lt_flag.byteSize();
    public static final long SIZE$delta_poc_msb_present_flag = LAYOUT$delta_poc_msb_present_flag.byteSize();
    public static final long SIZE$delta_poc_msb_cycle_lt = LAYOUT$delta_poc_msb_cycle_lt.byteSize();

    public static final long OFFSET$num_long_term_sps = LAYOUT.byteOffset(PATH$num_long_term_sps);
    public static final long OFFSET$num_long_term_pics = LAYOUT.byteOffset(PATH$num_long_term_pics);
    public static final long OFFSET$lt_idx_sps = LAYOUT.byteOffset(PATH$lt_idx_sps);
    public static final long OFFSET$poc_lsb_lt = LAYOUT.byteOffset(PATH$poc_lsb_lt);
    public static final long OFFSET$used_by_curr_pic_lt_flag = LAYOUT.byteOffset(PATH$used_by_curr_pic_lt_flag);
    public static final long OFFSET$delta_poc_msb_present_flag = LAYOUT.byteOffset(PATH$delta_poc_msb_present_flag);
    public static final long OFFSET$delta_poc_msb_cycle_lt = LAYOUT.byteOffset(PATH$delta_poc_msb_cycle_lt);
}
