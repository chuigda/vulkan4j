package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoEncodeH265SliceSegmentHeader} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH265SliceSegmentHeader {
///     StdVideoEncodeH265SliceSegmentHeaderFlags flags;
///     StdVideoH265SliceType slice_type;
///     uint32_t slice_segment_address;
///     uint8_t collocated_ref_idx;
///     uint8_t MaxNumMergeCand;
///     int8_t slice_cb_qp_offset;
///     int8_t slice_cr_qp_offset;
///     int8_t slice_beta_offset_div2;
///     int8_t slice_tc_offset_div2;
///     int8_t slice_act_y_qp_offset;
///     int8_t slice_act_cb_qp_offset;
///     int8_t slice_act_cr_qp_offset;
///     int8_t slice_qp_delta;
///     uint16_t reserved1;
///     StdVideoEncodeH265WeightTable const* pWeightTable;
/// } StdVideoEncodeH265SliceSegmentHeader;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoEncodeH265SliceSegmentHeader(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH265SliceSegmentHeader allocate(Arena arena) {
        StdVideoEncodeH265SliceSegmentHeader ret = new StdVideoEncodeH265SliceSegmentHeader(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoEncodeH265SliceSegmentHeader[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265SliceSegmentHeader[] ret = new StdVideoEncodeH265SliceSegmentHeader[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH265SliceSegmentHeader(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeH265SliceSegmentHeader clone(Arena arena, StdVideoEncodeH265SliceSegmentHeader src) {
        StdVideoEncodeH265SliceSegmentHeader ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH265SliceSegmentHeader[] clone(Arena arena, StdVideoEncodeH265SliceSegmentHeader[] src) {
        StdVideoEncodeH265SliceSegmentHeader[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoEncodeH265SliceSegmentHeaderFlags flags() {
        return new StdVideoEncodeH265SliceSegmentHeaderFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoEncodeH265SliceSegmentHeaderFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @enumtype(StdVideoH265SliceType.class) int slice_type() {
        return segment.get(LAYOUT$slice_type, OFFSET$slice_type);
    }

    public void slice_type(@enumtype(StdVideoH265SliceType.class) int value) {
        segment.set(LAYOUT$slice_type, OFFSET$slice_type, value);
    }

    public @unsigned int slice_segment_address() {
        return segment.get(LAYOUT$slice_segment_address, OFFSET$slice_segment_address);
    }

    public void slice_segment_address(@unsigned int value) {
        segment.set(LAYOUT$slice_segment_address, OFFSET$slice_segment_address, value);
    }

    public @unsigned byte collocated_ref_idx() {
        return segment.get(LAYOUT$collocated_ref_idx, OFFSET$collocated_ref_idx);
    }

    public void collocated_ref_idx(@unsigned byte value) {
        segment.set(LAYOUT$collocated_ref_idx, OFFSET$collocated_ref_idx, value);
    }

    public @unsigned byte MaxNumMergeCand() {
        return segment.get(LAYOUT$MaxNumMergeCand, OFFSET$MaxNumMergeCand);
    }

    public void MaxNumMergeCand(@unsigned byte value) {
        segment.set(LAYOUT$MaxNumMergeCand, OFFSET$MaxNumMergeCand, value);
    }

    public byte slice_cb_qp_offset() {
        return segment.get(LAYOUT$slice_cb_qp_offset, OFFSET$slice_cb_qp_offset);
    }

    public void slice_cb_qp_offset(byte value) {
        segment.set(LAYOUT$slice_cb_qp_offset, OFFSET$slice_cb_qp_offset, value);
    }

    public byte slice_cr_qp_offset() {
        return segment.get(LAYOUT$slice_cr_qp_offset, OFFSET$slice_cr_qp_offset);
    }

    public void slice_cr_qp_offset(byte value) {
        segment.set(LAYOUT$slice_cr_qp_offset, OFFSET$slice_cr_qp_offset, value);
    }

    public byte slice_beta_offset_div2() {
        return segment.get(LAYOUT$slice_beta_offset_div2, OFFSET$slice_beta_offset_div2);
    }

    public void slice_beta_offset_div2(byte value) {
        segment.set(LAYOUT$slice_beta_offset_div2, OFFSET$slice_beta_offset_div2, value);
    }

    public byte slice_tc_offset_div2() {
        return segment.get(LAYOUT$slice_tc_offset_div2, OFFSET$slice_tc_offset_div2);
    }

    public void slice_tc_offset_div2(byte value) {
        segment.set(LAYOUT$slice_tc_offset_div2, OFFSET$slice_tc_offset_div2, value);
    }

    public byte slice_act_y_qp_offset() {
        return segment.get(LAYOUT$slice_act_y_qp_offset, OFFSET$slice_act_y_qp_offset);
    }

    public void slice_act_y_qp_offset(byte value) {
        segment.set(LAYOUT$slice_act_y_qp_offset, OFFSET$slice_act_y_qp_offset, value);
    }

    public byte slice_act_cb_qp_offset() {
        return segment.get(LAYOUT$slice_act_cb_qp_offset, OFFSET$slice_act_cb_qp_offset);
    }

    public void slice_act_cb_qp_offset(byte value) {
        segment.set(LAYOUT$slice_act_cb_qp_offset, OFFSET$slice_act_cb_qp_offset, value);
    }

    public byte slice_act_cr_qp_offset() {
        return segment.get(LAYOUT$slice_act_cr_qp_offset, OFFSET$slice_act_cr_qp_offset);
    }

    public void slice_act_cr_qp_offset(byte value) {
        segment.set(LAYOUT$slice_act_cr_qp_offset, OFFSET$slice_act_cr_qp_offset, value);
    }

    public byte slice_qp_delta() {
        return segment.get(LAYOUT$slice_qp_delta, OFFSET$slice_qp_delta);
    }

    public void slice_qp_delta(byte value) {
        segment.set(LAYOUT$slice_qp_delta, OFFSET$slice_qp_delta, value);
    }

    public @unsigned short reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned short value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @pointer(comment="StdVideoEncodeH265WeightTable*") MemorySegment pWeightTableRaw() {
        return segment.get(LAYOUT$pWeightTable, OFFSET$pWeightTable);
    }

    public void pWeightTableRaw(@pointer(comment="StdVideoEncodeH265WeightTable*") MemorySegment value) {
        segment.set(LAYOUT$pWeightTable, OFFSET$pWeightTable, value);
    }

    public @Nullable StdVideoEncodeH265WeightTable pWeightTable() {
        MemorySegment s = pWeightTableRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoEncodeH265WeightTable(s);
    }

    public void pWeightTable(@Nullable StdVideoEncodeH265WeightTable value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWeightTableRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH265WeightTable[] pWeightTable(int assumedCount) {
        MemorySegment s = pWeightTableRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH265WeightTable.SIZE);
        StdVideoEncodeH265WeightTable[] ret = new StdVideoEncodeH265WeightTable[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH265WeightTable(s.asSlice(i * StdVideoEncodeH265WeightTable.SIZE, StdVideoEncodeH265WeightTable.SIZE));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeH265SliceSegmentHeaderFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("slice_type"),
        ValueLayout.JAVA_INT.withName("slice_segment_address"),
        ValueLayout.JAVA_BYTE.withName("collocated_ref_idx"),
        ValueLayout.JAVA_BYTE.withName("MaxNumMergeCand"),
        ValueLayout.JAVA_BYTE.withName("slice_cb_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("slice_cr_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("slice_beta_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("slice_tc_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("slice_act_y_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("slice_act_cb_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("slice_act_cr_qp_offset"),
        ValueLayout.JAVA_BYTE.withName("slice_qp_delta"),
        ValueLayout.JAVA_SHORT.withName("reserved1"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH265WeightTable.LAYOUT).withName("pWeightTable")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$slice_type = PathElement.groupElement("PATH$slice_type");
    public static final PathElement PATH$slice_segment_address = PathElement.groupElement("PATH$slice_segment_address");
    public static final PathElement PATH$collocated_ref_idx = PathElement.groupElement("PATH$collocated_ref_idx");
    public static final PathElement PATH$MaxNumMergeCand = PathElement.groupElement("PATH$MaxNumMergeCand");
    public static final PathElement PATH$slice_cb_qp_offset = PathElement.groupElement("PATH$slice_cb_qp_offset");
    public static final PathElement PATH$slice_cr_qp_offset = PathElement.groupElement("PATH$slice_cr_qp_offset");
    public static final PathElement PATH$slice_beta_offset_div2 = PathElement.groupElement("PATH$slice_beta_offset_div2");
    public static final PathElement PATH$slice_tc_offset_div2 = PathElement.groupElement("PATH$slice_tc_offset_div2");
    public static final PathElement PATH$slice_act_y_qp_offset = PathElement.groupElement("PATH$slice_act_y_qp_offset");
    public static final PathElement PATH$slice_act_cb_qp_offset = PathElement.groupElement("PATH$slice_act_cb_qp_offset");
    public static final PathElement PATH$slice_act_cr_qp_offset = PathElement.groupElement("PATH$slice_act_cr_qp_offset");
    public static final PathElement PATH$slice_qp_delta = PathElement.groupElement("PATH$slice_qp_delta");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$pWeightTable = PathElement.groupElement("PATH$pWeightTable");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$slice_type = (OfInt) LAYOUT.select(PATH$slice_type);
    public static final OfInt LAYOUT$slice_segment_address = (OfInt) LAYOUT.select(PATH$slice_segment_address);
    public static final OfByte LAYOUT$collocated_ref_idx = (OfByte) LAYOUT.select(PATH$collocated_ref_idx);
    public static final OfByte LAYOUT$MaxNumMergeCand = (OfByte) LAYOUT.select(PATH$MaxNumMergeCand);
    public static final OfByte LAYOUT$slice_cb_qp_offset = (OfByte) LAYOUT.select(PATH$slice_cb_qp_offset);
    public static final OfByte LAYOUT$slice_cr_qp_offset = (OfByte) LAYOUT.select(PATH$slice_cr_qp_offset);
    public static final OfByte LAYOUT$slice_beta_offset_div2 = (OfByte) LAYOUT.select(PATH$slice_beta_offset_div2);
    public static final OfByte LAYOUT$slice_tc_offset_div2 = (OfByte) LAYOUT.select(PATH$slice_tc_offset_div2);
    public static final OfByte LAYOUT$slice_act_y_qp_offset = (OfByte) LAYOUT.select(PATH$slice_act_y_qp_offset);
    public static final OfByte LAYOUT$slice_act_cb_qp_offset = (OfByte) LAYOUT.select(PATH$slice_act_cb_qp_offset);
    public static final OfByte LAYOUT$slice_act_cr_qp_offset = (OfByte) LAYOUT.select(PATH$slice_act_cr_qp_offset);
    public static final OfByte LAYOUT$slice_qp_delta = (OfByte) LAYOUT.select(PATH$slice_qp_delta);
    public static final OfShort LAYOUT$reserved1 = (OfShort) LAYOUT.select(PATH$reserved1);
    public static final AddressLayout LAYOUT$pWeightTable = (AddressLayout) LAYOUT.select(PATH$pWeightTable);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$slice_type = LAYOUT$slice_type.byteSize();
    public static final long SIZE$slice_segment_address = LAYOUT$slice_segment_address.byteSize();
    public static final long SIZE$collocated_ref_idx = LAYOUT$collocated_ref_idx.byteSize();
    public static final long SIZE$MaxNumMergeCand = LAYOUT$MaxNumMergeCand.byteSize();
    public static final long SIZE$slice_cb_qp_offset = LAYOUT$slice_cb_qp_offset.byteSize();
    public static final long SIZE$slice_cr_qp_offset = LAYOUT$slice_cr_qp_offset.byteSize();
    public static final long SIZE$slice_beta_offset_div2 = LAYOUT$slice_beta_offset_div2.byteSize();
    public static final long SIZE$slice_tc_offset_div2 = LAYOUT$slice_tc_offset_div2.byteSize();
    public static final long SIZE$slice_act_y_qp_offset = LAYOUT$slice_act_y_qp_offset.byteSize();
    public static final long SIZE$slice_act_cb_qp_offset = LAYOUT$slice_act_cb_qp_offset.byteSize();
    public static final long SIZE$slice_act_cr_qp_offset = LAYOUT$slice_act_cr_qp_offset.byteSize();
    public static final long SIZE$slice_qp_delta = LAYOUT$slice_qp_delta.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$pWeightTable = LAYOUT$pWeightTable.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$slice_type = LAYOUT.byteOffset(PATH$slice_type);
    public static final long OFFSET$slice_segment_address = LAYOUT.byteOffset(PATH$slice_segment_address);
    public static final long OFFSET$collocated_ref_idx = LAYOUT.byteOffset(PATH$collocated_ref_idx);
    public static final long OFFSET$MaxNumMergeCand = LAYOUT.byteOffset(PATH$MaxNumMergeCand);
    public static final long OFFSET$slice_cb_qp_offset = LAYOUT.byteOffset(PATH$slice_cb_qp_offset);
    public static final long OFFSET$slice_cr_qp_offset = LAYOUT.byteOffset(PATH$slice_cr_qp_offset);
    public static final long OFFSET$slice_beta_offset_div2 = LAYOUT.byteOffset(PATH$slice_beta_offset_div2);
    public static final long OFFSET$slice_tc_offset_div2 = LAYOUT.byteOffset(PATH$slice_tc_offset_div2);
    public static final long OFFSET$slice_act_y_qp_offset = LAYOUT.byteOffset(PATH$slice_act_y_qp_offset);
    public static final long OFFSET$slice_act_cb_qp_offset = LAYOUT.byteOffset(PATH$slice_act_cb_qp_offset);
    public static final long OFFSET$slice_act_cr_qp_offset = LAYOUT.byteOffset(PATH$slice_act_cr_qp_offset);
    public static final long OFFSET$slice_qp_delta = LAYOUT.byteOffset(PATH$slice_qp_delta);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$pWeightTable = LAYOUT.byteOffset(PATH$pWeightTable);
}
