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

public record StdVideoEncodeH264SliceHeader(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoEncodeH264SliceHeaderFlags.LAYOUT.withName("flags");
    public static final OfInt LAYOUT$first_mb_in_slice = ValueLayout.JAVA_INT.withName("first_mb_in_slice");
    public static final OfInt LAYOUT$slice_type = ValueLayout.JAVA_INT.withName("slice_type");
    public static final OfByte LAYOUT$slice_alpha_c0_offset_div2 = ValueLayout.JAVA_BYTE.withName("slice_alpha_c0_offset_div2");
    public static final OfByte LAYOUT$slice_beta_offset_div2 = ValueLayout.JAVA_BYTE.withName("slice_beta_offset_div2");
    public static final OfByte LAYOUT$slice_qp_delta = ValueLayout.JAVA_BYTE.withName("slice_qp_delta");
    public static final OfByte LAYOUT$reserved1 = ValueLayout.JAVA_BYTE.withName("reserved1");
    public static final OfInt LAYOUT$cabac_init_idc = ValueLayout.JAVA_INT.withName("cabac_init_idc");
    public static final OfInt LAYOUT$disable_deblocking_filter_idc = ValueLayout.JAVA_INT.withName("disable_deblocking_filter_idc");
    public static final AddressLayout LAYOUT$pWeightTable = ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264WeightTable.LAYOUT).withName("pWeightTable");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$first_mb_in_slice, LAYOUT$slice_type, LAYOUT$slice_alpha_c0_offset_div2, LAYOUT$slice_beta_offset_div2, LAYOUT$slice_qp_delta, LAYOUT$reserved1, LAYOUT$cabac_init_idc, LAYOUT$disable_deblocking_filter_idc, LAYOUT$pWeightTable);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeH264SliceHeader allocate(Arena arena) {
        return new StdVideoEncodeH264SliceHeader(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264SliceHeader[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264SliceHeader[] ret = new StdVideoEncodeH264SliceHeader[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264SliceHeader(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeH264SliceHeader clone(Arena arena, StdVideoEncodeH264SliceHeader src) {
        StdVideoEncodeH264SliceHeader ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264SliceHeader[] clone(Arena arena, StdVideoEncodeH264SliceHeader[] src) {
        StdVideoEncodeH264SliceHeader[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$first_mb_in_slice = PathElement.groupElement("PATH$first_mb_in_slice");
    public static final PathElement PATH$slice_type = PathElement.groupElement("PATH$slice_type");
    public static final PathElement PATH$slice_alpha_c0_offset_div2 = PathElement.groupElement("PATH$slice_alpha_c0_offset_div2");
    public static final PathElement PATH$slice_beta_offset_div2 = PathElement.groupElement("PATH$slice_beta_offset_div2");
    public static final PathElement PATH$slice_qp_delta = PathElement.groupElement("PATH$slice_qp_delta");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$cabac_init_idc = PathElement.groupElement("PATH$cabac_init_idc");
    public static final PathElement PATH$disable_deblocking_filter_idc = PathElement.groupElement("PATH$disable_deblocking_filter_idc");
    public static final PathElement PATH$pWeightTable = PathElement.groupElement("PATH$pWeightTable");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$first_mb_in_slice = LAYOUT$first_mb_in_slice.byteSize();
    public static final long SIZE$slice_type = LAYOUT$slice_type.byteSize();
    public static final long SIZE$slice_alpha_c0_offset_div2 = LAYOUT$slice_alpha_c0_offset_div2.byteSize();
    public static final long SIZE$slice_beta_offset_div2 = LAYOUT$slice_beta_offset_div2.byteSize();
    public static final long SIZE$slice_qp_delta = LAYOUT$slice_qp_delta.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$cabac_init_idc = LAYOUT$cabac_init_idc.byteSize();
    public static final long SIZE$disable_deblocking_filter_idc = LAYOUT$disable_deblocking_filter_idc.byteSize();
    public static final long SIZE$pWeightTable = LAYOUT$pWeightTable.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$first_mb_in_slice = LAYOUT.byteOffset(PATH$first_mb_in_slice);
    public static final long OFFSET$slice_type = LAYOUT.byteOffset(PATH$slice_type);
    public static final long OFFSET$slice_alpha_c0_offset_div2 = LAYOUT.byteOffset(PATH$slice_alpha_c0_offset_div2);
    public static final long OFFSET$slice_beta_offset_div2 = LAYOUT.byteOffset(PATH$slice_beta_offset_div2);
    public static final long OFFSET$slice_qp_delta = LAYOUT.byteOffset(PATH$slice_qp_delta);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$cabac_init_idc = LAYOUT.byteOffset(PATH$cabac_init_idc);
    public static final long OFFSET$disable_deblocking_filter_idc = LAYOUT.byteOffset(PATH$disable_deblocking_filter_idc);
    public static final long OFFSET$pWeightTable = LAYOUT.byteOffset(PATH$pWeightTable);

    public StdVideoEncodeH264SliceHeaderFlags flags() {
        return new StdVideoEncodeH264SliceHeaderFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoEncodeH264SliceHeaderFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned int first_mb_in_slice() {
        return segment.get(LAYOUT$first_mb_in_slice, OFFSET$first_mb_in_slice);
    }

    public void first_mb_in_slice(@unsigned int value) {
        segment.set(LAYOUT$first_mb_in_slice, OFFSET$first_mb_in_slice, value);
    }

    public @enumtype(StdVideoH264SliceType.class) int slice_type() {
        return segment.get(LAYOUT$slice_type, OFFSET$slice_type);
    }

    public void slice_type(@enumtype(StdVideoH264SliceType.class) int value) {
        segment.set(LAYOUT$slice_type, OFFSET$slice_type, value);
    }

    public byte slice_alpha_c0_offset_div2() {
        return segment.get(LAYOUT$slice_alpha_c0_offset_div2, OFFSET$slice_alpha_c0_offset_div2);
    }

    public void slice_alpha_c0_offset_div2(byte value) {
        segment.set(LAYOUT$slice_alpha_c0_offset_div2, OFFSET$slice_alpha_c0_offset_div2, value);
    }

    public byte slice_beta_offset_div2() {
        return segment.get(LAYOUT$slice_beta_offset_div2, OFFSET$slice_beta_offset_div2);
    }

    public void slice_beta_offset_div2(byte value) {
        segment.set(LAYOUT$slice_beta_offset_div2, OFFSET$slice_beta_offset_div2, value);
    }

    public byte slice_qp_delta() {
        return segment.get(LAYOUT$slice_qp_delta, OFFSET$slice_qp_delta);
    }

    public void slice_qp_delta(byte value) {
        segment.set(LAYOUT$slice_qp_delta, OFFSET$slice_qp_delta, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @enumtype(StdVideoH264CabacInitIdc.class) int cabac_init_idc() {
        return segment.get(LAYOUT$cabac_init_idc, OFFSET$cabac_init_idc);
    }

    public void cabac_init_idc(@enumtype(StdVideoH264CabacInitIdc.class) int value) {
        segment.set(LAYOUT$cabac_init_idc, OFFSET$cabac_init_idc, value);
    }

    public @enumtype(StdVideoH264DisableDeblockingFilterIdc.class) int disable_deblocking_filter_idc() {
        return segment.get(LAYOUT$disable_deblocking_filter_idc, OFFSET$disable_deblocking_filter_idc);
    }

    public void disable_deblocking_filter_idc(@enumtype(StdVideoH264DisableDeblockingFilterIdc.class) int value) {
        segment.set(LAYOUT$disable_deblocking_filter_idc, OFFSET$disable_deblocking_filter_idc, value);
    }

    public @pointer(comment="StdVideoEncodeH264WeightTable*") MemorySegment pWeightTableRaw() {
        return segment.get(LAYOUT$pWeightTable, OFFSET$pWeightTable);
    }

    public void pWeightTableRaw(@pointer(comment="StdVideoEncodeH264WeightTable*") MemorySegment value) {
        segment.set(LAYOUT$pWeightTable, OFFSET$pWeightTable, value);
    }

    public @Nullable StdVideoEncodeH264WeightTable pWeightTable() {
        MemorySegment s = pWeightTableRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoEncodeH264WeightTable(s);
    }

    public void pWeightTable(@Nullable StdVideoEncodeH264WeightTable value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWeightTableRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeH264WeightTable[] pWeightTable(int assumedCount) {
        MemorySegment s = pWeightTableRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264WeightTable.SIZE);
        StdVideoEncodeH264WeightTable[] ret = new StdVideoEncodeH264WeightTable[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH264WeightTable(s.asSlice(i * StdVideoEncodeH264WeightTable.SIZE, StdVideoEncodeH264WeightTable.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
