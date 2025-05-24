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

/// Represents a pointer to a {@code StdVideoEncodeH264RefListModEntry} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH264RefListModEntry {
///     StdVideoH264ModificationOfPicNumsIdc modification_of_pic_nums_idc; // @link substring="StdVideoH264ModificationOfPicNumsIdc" target="StdVideoH264ModificationOfPicNumsIdc" @link substring="modification_of_pic_nums_idc" target="#modification_of_pic_nums_idc"
///     uint16_t abs_diff_pic_num_minus1; // @link substring="abs_diff_pic_num_minus1" target="#abs_diff_pic_num_minus1"
///     uint16_t long_term_pic_num; // @link substring="long_term_pic_num" target="#long_term_pic_num"
/// } StdVideoEncodeH264RefListModEntry;
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
public record StdVideoEncodeH264RefListModEntry(@NotNull MemorySegment segment) implements IStdVideoEncodeH264RefListModEntry {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoEncodeH264RefListModEntry}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoEncodeH264RefListModEntry to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoEncodeH264RefListModEntry.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoEncodeH264RefListModEntry {
        public long size() {
            return segment.byteSize() / StdVideoEncodeH264RefListModEntry.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoEncodeH264RefListModEntry at(long index) {
            return new StdVideoEncodeH264RefListModEntry(segment.asSlice(index * StdVideoEncodeH264RefListModEntry.BYTES, StdVideoEncodeH264RefListModEntry.BYTES));
        }

        public void write(long index, @NotNull StdVideoEncodeH264RefListModEntry value) {
            MemorySegment s = segment.asSlice(index * StdVideoEncodeH264RefListModEntry.BYTES, StdVideoEncodeH264RefListModEntry.BYTES);
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
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * StdVideoEncodeH264RefListModEntry.BYTES, StdVideoEncodeH264RefListModEntry.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoEncodeH264RefListModEntry.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoEncodeH264RefListModEntry.BYTES,
                (end - start) * StdVideoEncodeH264RefListModEntry.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoEncodeH264RefListModEntry.BYTES));
        }

        public StdVideoEncodeH264RefListModEntry[] toArray() {
            StdVideoEncodeH264RefListModEntry[] ret = new StdVideoEncodeH264RefListModEntry[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static StdVideoEncodeH264RefListModEntry allocate(Arena arena) {
        return new StdVideoEncodeH264RefListModEntry(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264RefListModEntry.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoEncodeH264RefListModEntry.Ptr(segment);
    }

    public static StdVideoEncodeH264RefListModEntry clone(Arena arena, StdVideoEncodeH264RefListModEntry src) {
        StdVideoEncodeH264RefListModEntry ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(StdVideoH264ModificationOfPicNumsIdc.class) int modification_of_pic_nums_idc() {
        return segment.get(LAYOUT$modification_of_pic_nums_idc, OFFSET$modification_of_pic_nums_idc);
    }

    public void modification_of_pic_nums_idc(@EnumType(StdVideoH264ModificationOfPicNumsIdc.class) int value) {
        segment.set(LAYOUT$modification_of_pic_nums_idc, OFFSET$modification_of_pic_nums_idc, value);
    }

    public @unsigned short abs_diff_pic_num_minus1() {
        return segment.get(LAYOUT$abs_diff_pic_num_minus1, OFFSET$abs_diff_pic_num_minus1);
    }

    public void abs_diff_pic_num_minus1(@unsigned short value) {
        segment.set(LAYOUT$abs_diff_pic_num_minus1, OFFSET$abs_diff_pic_num_minus1, value);
    }

    public @unsigned short long_term_pic_num() {
        return segment.get(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num);
    }

    public void long_term_pic_num(@unsigned short value) {
        segment.set(LAYOUT$long_term_pic_num, OFFSET$long_term_pic_num, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("modification_of_pic_nums_idc"),
        ValueLayout.JAVA_SHORT.withName("abs_diff_pic_num_minus1"),
        ValueLayout.JAVA_SHORT.withName("long_term_pic_num")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$modification_of_pic_nums_idc = PathElement.groupElement("modification_of_pic_nums_idc");
    public static final PathElement PATH$abs_diff_pic_num_minus1 = PathElement.groupElement("abs_diff_pic_num_minus1");
    public static final PathElement PATH$long_term_pic_num = PathElement.groupElement("long_term_pic_num");

    public static final OfInt LAYOUT$modification_of_pic_nums_idc = (OfInt) LAYOUT.select(PATH$modification_of_pic_nums_idc);
    public static final OfShort LAYOUT$abs_diff_pic_num_minus1 = (OfShort) LAYOUT.select(PATH$abs_diff_pic_num_minus1);
    public static final OfShort LAYOUT$long_term_pic_num = (OfShort) LAYOUT.select(PATH$long_term_pic_num);

    public static final long SIZE$modification_of_pic_nums_idc = LAYOUT$modification_of_pic_nums_idc.byteSize();
    public static final long SIZE$abs_diff_pic_num_minus1 = LAYOUT$abs_diff_pic_num_minus1.byteSize();
    public static final long SIZE$long_term_pic_num = LAYOUT$long_term_pic_num.byteSize();

    public static final long OFFSET$modification_of_pic_nums_idc = LAYOUT.byteOffset(PATH$modification_of_pic_nums_idc);
    public static final long OFFSET$abs_diff_pic_num_minus1 = LAYOUT.byteOffset(PATH$abs_diff_pic_num_minus1);
    public static final long OFFSET$long_term_pic_num = LAYOUT.byteOffset(PATH$long_term_pic_num);
}
