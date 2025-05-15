package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.bits.BitfieldUtil;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoAV1SequenceHeaderFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1SequenceHeaderFlags {
///     uint32_t still_picture : 1;
///     uint32_t reduced_still_picture_header : 1;
///     uint32_t use_128x128_superblock : 1;
///     uint32_t enable_filter_intra : 1;
///     uint32_t enable_intra_edge_filter : 1;
///     uint32_t enable_interintra_compound : 1;
///     uint32_t enable_masked_compound : 1;
///     uint32_t enable_warped_motion : 1;
///     uint32_t enable_dual_filter : 1;
///     uint32_t enable_order_hint : 1;
///     uint32_t enable_jnt_comp : 1;
///     uint32_t enable_ref_frame_mvs : 1;
///     uint32_t frame_id_numbers_present_flag : 1;
///     uint32_t enable_superres : 1;
///     uint32_t enable_cdef : 1;
///     uint32_t enable_restoration : 1;
///     uint32_t film_grain_params_present : 1;
///     uint32_t timing_info_present_flag : 1;
///     uint32_t initial_display_delay_present_flag : 1;
///     uint32_t reserved : 13;
/// } StdVideoAV1SequenceHeaderFlags;
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
public record StdVideoAV1SequenceHeaderFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1SequenceHeaderFlags allocate(Arena arena) {
        StdVideoAV1SequenceHeaderFlags ret = new StdVideoAV1SequenceHeaderFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoAV1SequenceHeaderFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1SequenceHeaderFlags[] ret = new StdVideoAV1SequenceHeaderFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1SequenceHeaderFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1SequenceHeaderFlags clone(Arena arena, StdVideoAV1SequenceHeaderFlags src) {
        StdVideoAV1SequenceHeaderFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1SequenceHeaderFlags[] clone(Arena arena, StdVideoAV1SequenceHeaderFlags[] src) {
        StdVideoAV1SequenceHeaderFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean still_picture() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void still_picture(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean reduced_still_picture_header() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void reduced_still_picture_header(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean use_128x128_superblock() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 2);
    }

    public void use_128x128_superblock(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean enable_filter_intra() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 3);
    }

    public void enable_filter_intra(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public boolean enable_intra_edge_filter() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 4);
    }

    public void enable_intra_edge_filter(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 4, value);
    }

    public boolean enable_interintra_compound() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 5);
    }

    public void enable_interintra_compound(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 5, value);
    }

    public boolean enable_masked_compound() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 6);
    }

    public void enable_masked_compound(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 6, value);
    }

    public boolean enable_warped_motion() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 7);
    }

    public void enable_warped_motion(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 7, value);
    }

    public boolean enable_dual_filter() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 8);
    }

    public void enable_dual_filter(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 8, value);
    }

    public boolean enable_order_hint() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 9);
    }

    public void enable_order_hint(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 9, value);
    }

    public boolean enable_jnt_comp() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 10);
    }

    public void enable_jnt_comp(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 10, value);
    }

    public boolean enable_ref_frame_mvs() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 11);
    }

    public void enable_ref_frame_mvs(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 11, value);
    }

    public boolean frame_id_numbers_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 12);
    }

    public void frame_id_numbers_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 12, value);
    }

    public boolean enable_superres() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 13);
    }

    public void enable_superres(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 13, value);
    }

    public boolean enable_cdef() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 14);
    }

    public void enable_cdef(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 14, value);
    }

    public boolean enable_restoration() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 15);
    }

    public void enable_restoration(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 15, value);
    }

    public boolean film_grain_params_present() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 16);
    }

    public void film_grain_params_present(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 16, value);
    }

    public boolean timing_info_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 17);
    }

    public void timing_info_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 17, value);
    }

    public boolean initial_display_delay_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        return BitfieldUtil.readBit(s, 18);
    }

    public void initial_display_delay_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$still_picture_reserved, LAYOUT$still_picture_reserved);
        BitfieldUtil.writeBit(s, 18, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$still_picture_reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$still_picture_reserved = PathElement.groupElement("PATH$bitfield$still_picture_reserved");

    public static final OfInt LAYOUT$still_picture_reserved = (OfInt) LAYOUT.select(PATH$bitfield$still_picture_reserved);


    public static final long OFFSET$still_picture_reserved = LAYOUT.byteOffset(PATH$bitfield$still_picture_reserved);
}
