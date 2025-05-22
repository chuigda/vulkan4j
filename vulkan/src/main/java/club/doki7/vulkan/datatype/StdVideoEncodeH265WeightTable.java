package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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

/// Represents a pointer to a {@code StdVideoEncodeH265WeightTable} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH265WeightTable {
///     StdVideoEncodeH265WeightTableFlags flags; // @link substring="StdVideoEncodeH265WeightTableFlags" target="StdVideoEncodeH265WeightTableFlags" @link substring="flags" target="#flags"
///     uint8_t luma_log2_weight_denom; // @link substring="luma_log2_weight_denom" target="#luma_log2_weight_denom"
///     int8_t delta_chroma_log2_weight_denom; // @link substring="delta_chroma_log2_weight_denom" target="#delta_chroma_log2_weight_denom"
///     int8_t delta_luma_weight_l0; // @link substring="delta_luma_weight_l0" target="#delta_luma_weight_l0"
///     int8_t luma_offset_l0; // @link substring="luma_offset_l0" target="#luma_offset_l0"
///     int8_t delta_chroma_weight_l0; // @link substring="delta_chroma_weight_l0" target="#delta_chroma_weight_l0"
///     int8_t delta_chroma_offset_l0; // @link substring="delta_chroma_offset_l0" target="#delta_chroma_offset_l0"
///     int8_t delta_luma_weight_l1; // @link substring="delta_luma_weight_l1" target="#delta_luma_weight_l1"
///     int8_t luma_offset_l1; // @link substring="luma_offset_l1" target="#luma_offset_l1"
///     int8_t delta_chroma_weight_l1; // @link substring="delta_chroma_weight_l1" target="#delta_chroma_weight_l1"
///     int8_t delta_chroma_offset_l1; // @link substring="delta_chroma_offset_l1" target="#delta_chroma_offset_l1"
/// } StdVideoEncodeH265WeightTable;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoEncodeH265WeightTable(@NotNull MemorySegment segment) implements IStdVideoEncodeH265WeightTable {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoEncodeH265WeightTable}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoEncodeH265WeightTable to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoEncodeH265WeightTable.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoEncodeH265WeightTable {
        public long size() {
            return segment.byteSize() / StdVideoEncodeH265WeightTable.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoEncodeH265WeightTable at(long index) {
            return new StdVideoEncodeH265WeightTable(segment.asSlice(index * StdVideoEncodeH265WeightTable.BYTES, StdVideoEncodeH265WeightTable.BYTES));
        }
        public void write(long index, @NotNull StdVideoEncodeH265WeightTable value) {
            MemorySegment s = segment.asSlice(index * StdVideoEncodeH265WeightTable.BYTES, StdVideoEncodeH265WeightTable.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoEncodeH265WeightTable allocate(Arena arena) {
        return new StdVideoEncodeH265WeightTable(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH265WeightTable.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265WeightTable.Ptr ret = new StdVideoEncodeH265WeightTable.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoEncodeH265WeightTable clone(Arena arena, StdVideoEncodeH265WeightTable src) {
        StdVideoEncodeH265WeightTable ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull StdVideoEncodeH265WeightTableFlags flags() {
        return new StdVideoEncodeH265WeightTableFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoEncodeH265WeightTableFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte luma_log2_weight_denom() {
        return segment.get(LAYOUT$luma_log2_weight_denom, OFFSET$luma_log2_weight_denom);
    }

    public void luma_log2_weight_denom(@unsigned byte value) {
        segment.set(LAYOUT$luma_log2_weight_denom, OFFSET$luma_log2_weight_denom, value);
    }

    public byte delta_chroma_log2_weight_denom() {
        return segment.get(LAYOUT$delta_chroma_log2_weight_denom, OFFSET$delta_chroma_log2_weight_denom);
    }

    public void delta_chroma_log2_weight_denom(byte value) {
        segment.set(LAYOUT$delta_chroma_log2_weight_denom, OFFSET$delta_chroma_log2_weight_denom, value);
    }

    public byte delta_luma_weight_l0() {
        return segment.get(LAYOUT$delta_luma_weight_l0, OFFSET$delta_luma_weight_l0);
    }

    public void delta_luma_weight_l0(byte value) {
        segment.set(LAYOUT$delta_luma_weight_l0, OFFSET$delta_luma_weight_l0, value);
    }

    public byte luma_offset_l0() {
        return segment.get(LAYOUT$luma_offset_l0, OFFSET$luma_offset_l0);
    }

    public void luma_offset_l0(byte value) {
        segment.set(LAYOUT$luma_offset_l0, OFFSET$luma_offset_l0, value);
    }

    public byte delta_chroma_weight_l0() {
        return segment.get(LAYOUT$delta_chroma_weight_l0, OFFSET$delta_chroma_weight_l0);
    }

    public void delta_chroma_weight_l0(byte value) {
        segment.set(LAYOUT$delta_chroma_weight_l0, OFFSET$delta_chroma_weight_l0, value);
    }

    public byte delta_chroma_offset_l0() {
        return segment.get(LAYOUT$delta_chroma_offset_l0, OFFSET$delta_chroma_offset_l0);
    }

    public void delta_chroma_offset_l0(byte value) {
        segment.set(LAYOUT$delta_chroma_offset_l0, OFFSET$delta_chroma_offset_l0, value);
    }

    public byte delta_luma_weight_l1() {
        return segment.get(LAYOUT$delta_luma_weight_l1, OFFSET$delta_luma_weight_l1);
    }

    public void delta_luma_weight_l1(byte value) {
        segment.set(LAYOUT$delta_luma_weight_l1, OFFSET$delta_luma_weight_l1, value);
    }

    public byte luma_offset_l1() {
        return segment.get(LAYOUT$luma_offset_l1, OFFSET$luma_offset_l1);
    }

    public void luma_offset_l1(byte value) {
        segment.set(LAYOUT$luma_offset_l1, OFFSET$luma_offset_l1, value);
    }

    public byte delta_chroma_weight_l1() {
        return segment.get(LAYOUT$delta_chroma_weight_l1, OFFSET$delta_chroma_weight_l1);
    }

    public void delta_chroma_weight_l1(byte value) {
        segment.set(LAYOUT$delta_chroma_weight_l1, OFFSET$delta_chroma_weight_l1, value);
    }

    public byte delta_chroma_offset_l1() {
        return segment.get(LAYOUT$delta_chroma_offset_l1, OFFSET$delta_chroma_offset_l1);
    }

    public void delta_chroma_offset_l1(byte value) {
        segment.set(LAYOUT$delta_chroma_offset_l1, OFFSET$delta_chroma_offset_l1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeH265WeightTableFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("luma_log2_weight_denom"),
        ValueLayout.JAVA_BYTE.withName("delta_chroma_log2_weight_denom"),
        ValueLayout.JAVA_BYTE.withName("delta_luma_weight_l0"),
        ValueLayout.JAVA_BYTE.withName("luma_offset_l0"),
        ValueLayout.JAVA_BYTE.withName("delta_chroma_weight_l0"),
        ValueLayout.JAVA_BYTE.withName("delta_chroma_offset_l0"),
        ValueLayout.JAVA_BYTE.withName("delta_luma_weight_l1"),
        ValueLayout.JAVA_BYTE.withName("luma_offset_l1"),
        ValueLayout.JAVA_BYTE.withName("delta_chroma_weight_l1"),
        ValueLayout.JAVA_BYTE.withName("delta_chroma_offset_l1")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$luma_log2_weight_denom = PathElement.groupElement("luma_log2_weight_denom");
    public static final PathElement PATH$delta_chroma_log2_weight_denom = PathElement.groupElement("delta_chroma_log2_weight_denom");
    public static final PathElement PATH$delta_luma_weight_l0 = PathElement.groupElement("delta_luma_weight_l0");
    public static final PathElement PATH$luma_offset_l0 = PathElement.groupElement("luma_offset_l0");
    public static final PathElement PATH$delta_chroma_weight_l0 = PathElement.groupElement("delta_chroma_weight_l0");
    public static final PathElement PATH$delta_chroma_offset_l0 = PathElement.groupElement("delta_chroma_offset_l0");
    public static final PathElement PATH$delta_luma_weight_l1 = PathElement.groupElement("delta_luma_weight_l1");
    public static final PathElement PATH$luma_offset_l1 = PathElement.groupElement("luma_offset_l1");
    public static final PathElement PATH$delta_chroma_weight_l1 = PathElement.groupElement("delta_chroma_weight_l1");
    public static final PathElement PATH$delta_chroma_offset_l1 = PathElement.groupElement("delta_chroma_offset_l1");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$luma_log2_weight_denom = (OfByte) LAYOUT.select(PATH$luma_log2_weight_denom);
    public static final OfByte LAYOUT$delta_chroma_log2_weight_denom = (OfByte) LAYOUT.select(PATH$delta_chroma_log2_weight_denom);
    public static final OfByte LAYOUT$delta_luma_weight_l0 = (OfByte) LAYOUT.select(PATH$delta_luma_weight_l0);
    public static final OfByte LAYOUT$luma_offset_l0 = (OfByte) LAYOUT.select(PATH$luma_offset_l0);
    public static final OfByte LAYOUT$delta_chroma_weight_l0 = (OfByte) LAYOUT.select(PATH$delta_chroma_weight_l0);
    public static final OfByte LAYOUT$delta_chroma_offset_l0 = (OfByte) LAYOUT.select(PATH$delta_chroma_offset_l0);
    public static final OfByte LAYOUT$delta_luma_weight_l1 = (OfByte) LAYOUT.select(PATH$delta_luma_weight_l1);
    public static final OfByte LAYOUT$luma_offset_l1 = (OfByte) LAYOUT.select(PATH$luma_offset_l1);
    public static final OfByte LAYOUT$delta_chroma_weight_l1 = (OfByte) LAYOUT.select(PATH$delta_chroma_weight_l1);
    public static final OfByte LAYOUT$delta_chroma_offset_l1 = (OfByte) LAYOUT.select(PATH$delta_chroma_offset_l1);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$luma_log2_weight_denom = LAYOUT$luma_log2_weight_denom.byteSize();
    public static final long SIZE$delta_chroma_log2_weight_denom = LAYOUT$delta_chroma_log2_weight_denom.byteSize();
    public static final long SIZE$delta_luma_weight_l0 = LAYOUT$delta_luma_weight_l0.byteSize();
    public static final long SIZE$luma_offset_l0 = LAYOUT$luma_offset_l0.byteSize();
    public static final long SIZE$delta_chroma_weight_l0 = LAYOUT$delta_chroma_weight_l0.byteSize();
    public static final long SIZE$delta_chroma_offset_l0 = LAYOUT$delta_chroma_offset_l0.byteSize();
    public static final long SIZE$delta_luma_weight_l1 = LAYOUT$delta_luma_weight_l1.byteSize();
    public static final long SIZE$luma_offset_l1 = LAYOUT$luma_offset_l1.byteSize();
    public static final long SIZE$delta_chroma_weight_l1 = LAYOUT$delta_chroma_weight_l1.byteSize();
    public static final long SIZE$delta_chroma_offset_l1 = LAYOUT$delta_chroma_offset_l1.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$luma_log2_weight_denom = LAYOUT.byteOffset(PATH$luma_log2_weight_denom);
    public static final long OFFSET$delta_chroma_log2_weight_denom = LAYOUT.byteOffset(PATH$delta_chroma_log2_weight_denom);
    public static final long OFFSET$delta_luma_weight_l0 = LAYOUT.byteOffset(PATH$delta_luma_weight_l0);
    public static final long OFFSET$luma_offset_l0 = LAYOUT.byteOffset(PATH$luma_offset_l0);
    public static final long OFFSET$delta_chroma_weight_l0 = LAYOUT.byteOffset(PATH$delta_chroma_weight_l0);
    public static final long OFFSET$delta_chroma_offset_l0 = LAYOUT.byteOffset(PATH$delta_chroma_offset_l0);
    public static final long OFFSET$delta_luma_weight_l1 = LAYOUT.byteOffset(PATH$delta_luma_weight_l1);
    public static final long OFFSET$luma_offset_l1 = LAYOUT.byteOffset(PATH$luma_offset_l1);
    public static final long OFFSET$delta_chroma_weight_l1 = LAYOUT.byteOffset(PATH$delta_chroma_weight_l1);
    public static final long OFFSET$delta_chroma_offset_l1 = LAYOUT.byteOffset(PATH$delta_chroma_offset_l1);
}
