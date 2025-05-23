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

/// Represents a pointer to a {@code StdVideoH265LongTermRefPicsSps} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265LongTermRefPicsSps {
///     uint32_t used_by_curr_pic_lt_sps_flag; // @link substring="used_by_curr_pic_lt_sps_flag" target="#used_by_curr_pic_lt_sps_flag"
///     uint32_t lt_ref_pic_poc_lsb_sps; // @link substring="lt_ref_pic_poc_lsb_sps" target="#lt_ref_pic_poc_lsb_sps"
/// } StdVideoH265LongTermRefPicsSps;
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
public record StdVideoH265LongTermRefPicsSps(@NotNull MemorySegment segment) implements IStdVideoH265LongTermRefPicsSps {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoH265LongTermRefPicsSps}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoH265LongTermRefPicsSps to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoH265LongTermRefPicsSps.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoH265LongTermRefPicsSps {
        public long size() {
            return segment.byteSize() / StdVideoH265LongTermRefPicsSps.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoH265LongTermRefPicsSps at(long index) {
            return new StdVideoH265LongTermRefPicsSps(segment.asSlice(index * StdVideoH265LongTermRefPicsSps.BYTES, StdVideoH265LongTermRefPicsSps.BYTES));
        }

        public void write(long index, @NotNull StdVideoH265LongTermRefPicsSps value) {
            MemorySegment s = segment.asSlice(index * StdVideoH265LongTermRefPicsSps.BYTES, StdVideoH265LongTermRefPicsSps.BYTES);
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
            return new Ptr(segment.asSlice(index * StdVideoH265LongTermRefPicsSps.BYTES, StdVideoH265LongTermRefPicsSps.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoH265LongTermRefPicsSps.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoH265LongTermRefPicsSps.BYTES,
                (end - start) * StdVideoH265LongTermRefPicsSps.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoH265LongTermRefPicsSps.BYTES));
        }

        public StdVideoH265LongTermRefPicsSps[] toArray() {
            StdVideoH265LongTermRefPicsSps[] ret = new StdVideoH265LongTermRefPicsSps[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static StdVideoH265LongTermRefPicsSps allocate(Arena arena) {
        return new StdVideoH265LongTermRefPicsSps(arena.allocate(LAYOUT));
    }

    public static StdVideoH265LongTermRefPicsSps.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoH265LongTermRefPicsSps.Ptr(segment);
    }

    public static StdVideoH265LongTermRefPicsSps clone(Arena arena, StdVideoH265LongTermRefPicsSps src) {
        StdVideoH265LongTermRefPicsSps ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int used_by_curr_pic_lt_sps_flag() {
        return segment.get(LAYOUT$used_by_curr_pic_lt_sps_flag, OFFSET$used_by_curr_pic_lt_sps_flag);
    }

    public void used_by_curr_pic_lt_sps_flag(@unsigned int value) {
        segment.set(LAYOUT$used_by_curr_pic_lt_sps_flag, OFFSET$used_by_curr_pic_lt_sps_flag, value);
    }

    public @unsigned int lt_ref_pic_poc_lsb_sps() {
        return segment.get(LAYOUT$lt_ref_pic_poc_lsb_sps, OFFSET$lt_ref_pic_poc_lsb_sps);
    }

    public void lt_ref_pic_poc_lsb_sps(@unsigned int value) {
        segment.set(LAYOUT$lt_ref_pic_poc_lsb_sps, OFFSET$lt_ref_pic_poc_lsb_sps, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("used_by_curr_pic_lt_sps_flag"),
        ValueLayout.JAVA_INT.withName("lt_ref_pic_poc_lsb_sps")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$used_by_curr_pic_lt_sps_flag = PathElement.groupElement("used_by_curr_pic_lt_sps_flag");
    public static final PathElement PATH$lt_ref_pic_poc_lsb_sps = PathElement.groupElement("lt_ref_pic_poc_lsb_sps");

    public static final OfInt LAYOUT$used_by_curr_pic_lt_sps_flag = (OfInt) LAYOUT.select(PATH$used_by_curr_pic_lt_sps_flag);
    public static final OfInt LAYOUT$lt_ref_pic_poc_lsb_sps = (OfInt) LAYOUT.select(PATH$lt_ref_pic_poc_lsb_sps);

    public static final long SIZE$used_by_curr_pic_lt_sps_flag = LAYOUT$used_by_curr_pic_lt_sps_flag.byteSize();
    public static final long SIZE$lt_ref_pic_poc_lsb_sps = LAYOUT$lt_ref_pic_poc_lsb_sps.byteSize();

    public static final long OFFSET$used_by_curr_pic_lt_sps_flag = LAYOUT.byteOffset(PATH$used_by_curr_pic_lt_sps_flag);
    public static final long OFFSET$lt_ref_pic_poc_lsb_sps = LAYOUT.byteOffset(PATH$lt_ref_pic_poc_lsb_sps);
}
