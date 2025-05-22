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

/// Represents a pointer to a {@code StdVideoDecodeH264PictureInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoDecodeH264PictureInfoFlags {
///     uint32_t field_pic_flag : 1; // @link substring="field_pic_flag" target="#field_pic_flag"
///     uint32_t is_intra : 1; // @link substring="is_intra" target="#is_intra"
///     uint32_t IdrPicFlag : 1; // @link substring="IdrPicFlag" target="#IdrPicFlag"
///     uint32_t bottom_field_flag : 1; // @link substring="bottom_field_flag" target="#bottom_field_flag"
///     uint32_t is_reference : 1; // @link substring="is_reference" target="#is_reference"
///     uint32_t complementary_field_pair : 1; // @link substring="complementary_field_pair" target="#complementary_field_pair"
/// } StdVideoDecodeH264PictureInfoFlags;
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
public record StdVideoDecodeH264PictureInfoFlags(@NotNull MemorySegment segment) implements IStdVideoDecodeH264PictureInfoFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoDecodeH264PictureInfoFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoDecodeH264PictureInfoFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoDecodeH264PictureInfoFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoDecodeH264PictureInfoFlags {
        public long size() {
            return segment.byteSize() / StdVideoDecodeH264PictureInfoFlags.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoDecodeH264PictureInfoFlags at(long index) {
            return new StdVideoDecodeH264PictureInfoFlags(segment.asSlice(index * StdVideoDecodeH264PictureInfoFlags.BYTES, StdVideoDecodeH264PictureInfoFlags.BYTES));
        }

        public void write(long index, @NotNull StdVideoDecodeH264PictureInfoFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoDecodeH264PictureInfoFlags.BYTES, StdVideoDecodeH264PictureInfoFlags.BYTES);
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
            return new Ptr(segment.asSlice(index * StdVideoDecodeH264PictureInfoFlags.BYTES, StdVideoDecodeH264PictureInfoFlags.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoDecodeH264PictureInfoFlags.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoDecodeH264PictureInfoFlags.BYTES,
                (end - start) * StdVideoDecodeH264PictureInfoFlags.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoDecodeH264PictureInfoFlags.BYTES));
        }
    }

    public static StdVideoDecodeH264PictureInfoFlags allocate(Arena arena) {
        return new StdVideoDecodeH264PictureInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoDecodeH264PictureInfoFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new StdVideoDecodeH264PictureInfoFlags.Ptr(segment);
    }

    public static StdVideoDecodeH264PictureInfoFlags clone(Arena arena, StdVideoDecodeH264PictureInfoFlags src) {
        StdVideoDecodeH264PictureInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean field_pic_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 0);
    }

    public void field_pic_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean is_intra() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 1);
    }

    public void is_intra(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean IdrPicFlag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 2);
    }

    public void IdrPicFlag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean bottom_field_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 3);
    }

    public void bottom_field_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean is_reference() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 4);
    }

    public void is_reference(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean complementary_field_pair() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        return BitfieldUtil.readBit(s, 5);
    }

    public void complementary_field_pair(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$field_pic_flag$complementary_field_pair, LAYOUT$bitfield$field_pic_flag$complementary_field_pair);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$field_pic_flag$complementary_field_pair")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$field_pic_flag$complementary_field_pair = PathElement.groupElement("field_pic_flag$complementary_field_pair");

    public static final OfInt LAYOUT$bitfield$field_pic_flag$complementary_field_pair = (OfInt) LAYOUT.select(PATH$bitfield$field_pic_flag$complementary_field_pair);


    public static final long OFFSET$bitfield$field_pic_flag$complementary_field_pair = LAYOUT.byteOffset(PATH$bitfield$field_pic_flag$complementary_field_pair);
}
