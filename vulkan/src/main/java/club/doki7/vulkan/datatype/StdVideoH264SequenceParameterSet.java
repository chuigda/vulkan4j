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

/// Represents a pointer to a {@code StdVideoH264SequenceParameterSet} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH264SequenceParameterSet {
///     StdVideoH264SpsFlags flags; // @link substring="StdVideoH264SpsFlags" target="StdVideoH264SpsFlags" @link substring="flags" target="#flags"
///     StdVideoH264ProfileIdc profile_idc; // @link substring="StdVideoH264ProfileIdc" target="StdVideoH264ProfileIdc" @link substring="profile_idc" target="#profile_idc"
///     StdVideoH264LevelIdc level_idc; // @link substring="StdVideoH264LevelIdc" target="StdVideoH264LevelIdc" @link substring="level_idc" target="#level_idc"
///     StdVideoH264ChromaFormatIdc chroma_format_idc; // @link substring="StdVideoH264ChromaFormatIdc" target="StdVideoH264ChromaFormatIdc" @link substring="chroma_format_idc" target="#chroma_format_idc"
///     uint8_t seq_parameter_set_id; // @link substring="seq_parameter_set_id" target="#seq_parameter_set_id"
///     uint8_t bit_depth_luma_minus8; // @link substring="bit_depth_luma_minus8" target="#bit_depth_luma_minus8"
///     uint8_t bit_depth_chroma_minus8; // @link substring="bit_depth_chroma_minus8" target="#bit_depth_chroma_minus8"
///     uint8_t log2_max_frame_num_minus4; // @link substring="log2_max_frame_num_minus4" target="#log2_max_frame_num_minus4"
///     StdVideoH264PocType pic_order_cnt_type; // @link substring="StdVideoH264PocType" target="StdVideoH264PocType" @link substring="pic_order_cnt_type" target="#pic_order_cnt_type"
///     int32_t offset_for_non_ref_pic; // @link substring="offset_for_non_ref_pic" target="#offset_for_non_ref_pic"
///     int32_t offset_for_top_to_bottom_field; // @link substring="offset_for_top_to_bottom_field" target="#offset_for_top_to_bottom_field"
///     uint8_t log2_max_pic_order_cnt_lsb_minus4; // @link substring="log2_max_pic_order_cnt_lsb_minus4" target="#log2_max_pic_order_cnt_lsb_minus4"
///     uint8_t num_ref_frames_in_pic_order_cnt_cycle; // @link substring="num_ref_frames_in_pic_order_cnt_cycle" target="#num_ref_frames_in_pic_order_cnt_cycle"
///     uint8_t max_num_ref_frames; // @link substring="max_num_ref_frames" target="#max_num_ref_frames"
///     uint8_t reserved1;
///     uint32_t pic_width_in_mbs_minus1; // @link substring="pic_width_in_mbs_minus1" target="#pic_width_in_mbs_minus1"
///     uint32_t pic_height_in_map_units_minus1; // @link substring="pic_height_in_map_units_minus1" target="#pic_height_in_map_units_minus1"
///     uint32_t frame_crop_left_offset; // @link substring="frame_crop_left_offset" target="#frame_crop_left_offset"
///     uint32_t frame_crop_right_offset; // @link substring="frame_crop_right_offset" target="#frame_crop_right_offset"
///     uint32_t frame_crop_top_offset; // @link substring="frame_crop_top_offset" target="#frame_crop_top_offset"
///     uint32_t frame_crop_bottom_offset; // @link substring="frame_crop_bottom_offset" target="#frame_crop_bottom_offset"
///     uint32_t reserved2;
///     int32_t const* pOffsetForRefFrame; // @link substring="pOffsetForRefFrame" target="#pOffsetForRefFrame"
///     StdVideoH264ScalingLists const* pScalingLists; // @link substring="StdVideoH264ScalingLists" target="StdVideoH264ScalingLists" @link substring="pScalingLists" target="#pScalingLists"
///     StdVideoH264SequenceParameterSetVui const* pSequenceParameterSetVui; // @link substring="StdVideoH264SequenceParameterSetVui" target="StdVideoH264SequenceParameterSetVui" @link substring="pSequenceParameterSetVui" target="#pSequenceParameterSetVui"
/// } StdVideoH264SequenceParameterSet;
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
public record StdVideoH264SequenceParameterSet(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH264SequenceParameterSet allocate(Arena arena) {
        StdVideoH264SequenceParameterSet ret = new StdVideoH264SequenceParameterSet(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH264SequenceParameterSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264SequenceParameterSet[] ret = new StdVideoH264SequenceParameterSet[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH264SequenceParameterSet(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH264SequenceParameterSet clone(Arena arena, StdVideoH264SequenceParameterSet src) {
        StdVideoH264SequenceParameterSet ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH264SequenceParameterSet[] clone(Arena arena, StdVideoH264SequenceParameterSet[] src) {
        StdVideoH264SequenceParameterSet[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @NotNull StdVideoH264SpsFlags flags() {
        return new StdVideoH264SpsFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoH264SpsFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @enumtype(StdVideoH264ProfileIdc.class) int profile_idc() {
        return segment.get(LAYOUT$profile_idc, OFFSET$profile_idc);
    }

    public void profile_idc(@enumtype(StdVideoH264ProfileIdc.class) int value) {
        segment.set(LAYOUT$profile_idc, OFFSET$profile_idc, value);
    }

    public @enumtype(StdVideoH264LevelIdc.class) int level_idc() {
        return segment.get(LAYOUT$level_idc, OFFSET$level_idc);
    }

    public void level_idc(@enumtype(StdVideoH264LevelIdc.class) int value) {
        segment.set(LAYOUT$level_idc, OFFSET$level_idc, value);
    }

    public @enumtype(StdVideoH264ChromaFormatIdc.class) int chroma_format_idc() {
        return segment.get(LAYOUT$chroma_format_idc, OFFSET$chroma_format_idc);
    }

    public void chroma_format_idc(@enumtype(StdVideoH264ChromaFormatIdc.class) int value) {
        segment.set(LAYOUT$chroma_format_idc, OFFSET$chroma_format_idc, value);
    }

    public @unsigned byte seq_parameter_set_id() {
        return segment.get(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id);
    }

    public void seq_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id, value);
    }

    public @unsigned byte bit_depth_luma_minus8() {
        return segment.get(LAYOUT$bit_depth_luma_minus8, OFFSET$bit_depth_luma_minus8);
    }

    public void bit_depth_luma_minus8(@unsigned byte value) {
        segment.set(LAYOUT$bit_depth_luma_minus8, OFFSET$bit_depth_luma_minus8, value);
    }

    public @unsigned byte bit_depth_chroma_minus8() {
        return segment.get(LAYOUT$bit_depth_chroma_minus8, OFFSET$bit_depth_chroma_minus8);
    }

    public void bit_depth_chroma_minus8(@unsigned byte value) {
        segment.set(LAYOUT$bit_depth_chroma_minus8, OFFSET$bit_depth_chroma_minus8, value);
    }

    public @unsigned byte log2_max_frame_num_minus4() {
        return segment.get(LAYOUT$log2_max_frame_num_minus4, OFFSET$log2_max_frame_num_minus4);
    }

    public void log2_max_frame_num_minus4(@unsigned byte value) {
        segment.set(LAYOUT$log2_max_frame_num_minus4, OFFSET$log2_max_frame_num_minus4, value);
    }

    public @enumtype(StdVideoH264PocType.class) int pic_order_cnt_type() {
        return segment.get(LAYOUT$pic_order_cnt_type, OFFSET$pic_order_cnt_type);
    }

    public void pic_order_cnt_type(@enumtype(StdVideoH264PocType.class) int value) {
        segment.set(LAYOUT$pic_order_cnt_type, OFFSET$pic_order_cnt_type, value);
    }

    public int offset_for_non_ref_pic() {
        return segment.get(LAYOUT$offset_for_non_ref_pic, OFFSET$offset_for_non_ref_pic);
    }

    public void offset_for_non_ref_pic(int value) {
        segment.set(LAYOUT$offset_for_non_ref_pic, OFFSET$offset_for_non_ref_pic, value);
    }

    public int offset_for_top_to_bottom_field() {
        return segment.get(LAYOUT$offset_for_top_to_bottom_field, OFFSET$offset_for_top_to_bottom_field);
    }

    public void offset_for_top_to_bottom_field(int value) {
        segment.set(LAYOUT$offset_for_top_to_bottom_field, OFFSET$offset_for_top_to_bottom_field, value);
    }

    public @unsigned byte log2_max_pic_order_cnt_lsb_minus4() {
        return segment.get(LAYOUT$log2_max_pic_order_cnt_lsb_minus4, OFFSET$log2_max_pic_order_cnt_lsb_minus4);
    }

    public void log2_max_pic_order_cnt_lsb_minus4(@unsigned byte value) {
        segment.set(LAYOUT$log2_max_pic_order_cnt_lsb_minus4, OFFSET$log2_max_pic_order_cnt_lsb_minus4, value);
    }

    public @unsigned byte num_ref_frames_in_pic_order_cnt_cycle() {
        return segment.get(LAYOUT$num_ref_frames_in_pic_order_cnt_cycle, OFFSET$num_ref_frames_in_pic_order_cnt_cycle);
    }

    public void num_ref_frames_in_pic_order_cnt_cycle(@unsigned byte value) {
        segment.set(LAYOUT$num_ref_frames_in_pic_order_cnt_cycle, OFFSET$num_ref_frames_in_pic_order_cnt_cycle, value);
    }

    public @unsigned byte max_num_ref_frames() {
        return segment.get(LAYOUT$max_num_ref_frames, OFFSET$max_num_ref_frames);
    }

    public void max_num_ref_frames(@unsigned byte value) {
        segment.set(LAYOUT$max_num_ref_frames, OFFSET$max_num_ref_frames, value);
    }


    public @unsigned int pic_width_in_mbs_minus1() {
        return segment.get(LAYOUT$pic_width_in_mbs_minus1, OFFSET$pic_width_in_mbs_minus1);
    }

    public void pic_width_in_mbs_minus1(@unsigned int value) {
        segment.set(LAYOUT$pic_width_in_mbs_minus1, OFFSET$pic_width_in_mbs_minus1, value);
    }

    public @unsigned int pic_height_in_map_units_minus1() {
        return segment.get(LAYOUT$pic_height_in_map_units_minus1, OFFSET$pic_height_in_map_units_minus1);
    }

    public void pic_height_in_map_units_minus1(@unsigned int value) {
        segment.set(LAYOUT$pic_height_in_map_units_minus1, OFFSET$pic_height_in_map_units_minus1, value);
    }

    public @unsigned int frame_crop_left_offset() {
        return segment.get(LAYOUT$frame_crop_left_offset, OFFSET$frame_crop_left_offset);
    }

    public void frame_crop_left_offset(@unsigned int value) {
        segment.set(LAYOUT$frame_crop_left_offset, OFFSET$frame_crop_left_offset, value);
    }

    public @unsigned int frame_crop_right_offset() {
        return segment.get(LAYOUT$frame_crop_right_offset, OFFSET$frame_crop_right_offset);
    }

    public void frame_crop_right_offset(@unsigned int value) {
        segment.set(LAYOUT$frame_crop_right_offset, OFFSET$frame_crop_right_offset, value);
    }

    public @unsigned int frame_crop_top_offset() {
        return segment.get(LAYOUT$frame_crop_top_offset, OFFSET$frame_crop_top_offset);
    }

    public void frame_crop_top_offset(@unsigned int value) {
        segment.set(LAYOUT$frame_crop_top_offset, OFFSET$frame_crop_top_offset, value);
    }

    public @unsigned int frame_crop_bottom_offset() {
        return segment.get(LAYOUT$frame_crop_bottom_offset, OFFSET$frame_crop_bottom_offset);
    }

    public void frame_crop_bottom_offset(@unsigned int value) {
        segment.set(LAYOUT$frame_crop_bottom_offset, OFFSET$frame_crop_bottom_offset, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable IntPtr pOffsetForRefFrame() {
        MemorySegment s = pOffsetForRefFrameRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pOffsetForRefFrame(@Nullable IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pOffsetForRefFrameRaw(s);
    }

    public @pointer(comment="int*") MemorySegment pOffsetForRefFrameRaw() {
        return segment.get(LAYOUT$pOffsetForRefFrame, OFFSET$pOffsetForRefFrame);
    }

    public void pOffsetForRefFrameRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pOffsetForRefFrame, OFFSET$pOffsetForRefFrame, value);
    }

    public @Nullable StdVideoH264ScalingLists pScalingLists() {
        MemorySegment s = pScalingListsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH264ScalingLists(s);
    }

    public void pScalingLists(@Nullable StdVideoH264ScalingLists value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pScalingListsRaw(s);
    }

    @unsafe public @Nullable StdVideoH264ScalingLists[] pScalingLists(int assumedCount) {
        MemorySegment s = pScalingListsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH264ScalingLists.BYTES);
        StdVideoH264ScalingLists[] ret = new StdVideoH264ScalingLists[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH264ScalingLists(s.asSlice(i * StdVideoH264ScalingLists.BYTES, StdVideoH264ScalingLists.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH264ScalingLists.class) MemorySegment pScalingListsRaw() {
        return segment.get(LAYOUT$pScalingLists, OFFSET$pScalingLists);
    }

    public void pScalingListsRaw(@pointer(target=StdVideoH264ScalingLists.class) MemorySegment value) {
        segment.set(LAYOUT$pScalingLists, OFFSET$pScalingLists, value);
    }

    public @Nullable StdVideoH264SequenceParameterSetVui pSequenceParameterSetVui() {
        MemorySegment s = pSequenceParameterSetVuiRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH264SequenceParameterSetVui(s);
    }

    public void pSequenceParameterSetVui(@Nullable StdVideoH264SequenceParameterSetVui value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSequenceParameterSetVuiRaw(s);
    }

    @unsafe public @Nullable StdVideoH264SequenceParameterSetVui[] pSequenceParameterSetVui(int assumedCount) {
        MemorySegment s = pSequenceParameterSetVuiRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH264SequenceParameterSetVui.BYTES);
        StdVideoH264SequenceParameterSetVui[] ret = new StdVideoH264SequenceParameterSetVui[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH264SequenceParameterSetVui(s.asSlice(i * StdVideoH264SequenceParameterSetVui.BYTES, StdVideoH264SequenceParameterSetVui.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH264SequenceParameterSetVui.class) MemorySegment pSequenceParameterSetVuiRaw() {
        return segment.get(LAYOUT$pSequenceParameterSetVui, OFFSET$pSequenceParameterSetVui);
    }

    public void pSequenceParameterSetVuiRaw(@pointer(target=StdVideoH264SequenceParameterSetVui.class) MemorySegment value) {
        segment.set(LAYOUT$pSequenceParameterSetVui, OFFSET$pSequenceParameterSetVui, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoH264SpsFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("profile_idc"),
        ValueLayout.JAVA_INT.withName("level_idc"),
        ValueLayout.JAVA_INT.withName("chroma_format_idc"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("bit_depth_luma_minus8"),
        ValueLayout.JAVA_BYTE.withName("bit_depth_chroma_minus8"),
        ValueLayout.JAVA_BYTE.withName("log2_max_frame_num_minus4"),
        ValueLayout.JAVA_INT.withName("pic_order_cnt_type"),
        ValueLayout.JAVA_INT.withName("offset_for_non_ref_pic"),
        ValueLayout.JAVA_INT.withName("offset_for_top_to_bottom_field"),
        ValueLayout.JAVA_BYTE.withName("log2_max_pic_order_cnt_lsb_minus4"),
        ValueLayout.JAVA_BYTE.withName("num_ref_frames_in_pic_order_cnt_cycle"),
        ValueLayout.JAVA_BYTE.withName("max_num_ref_frames"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("pic_width_in_mbs_minus1"),
        ValueLayout.JAVA_INT.withName("pic_height_in_map_units_minus1"),
        ValueLayout.JAVA_INT.withName("frame_crop_left_offset"),
        ValueLayout.JAVA_INT.withName("frame_crop_right_offset"),
        ValueLayout.JAVA_INT.withName("frame_crop_top_offset"),
        ValueLayout.JAVA_INT.withName("frame_crop_bottom_offset"),
        ValueLayout.JAVA_INT.withName("reserved2"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pOffsetForRefFrame"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264ScalingLists.LAYOUT).withName("pScalingLists"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264SequenceParameterSetVui.LAYOUT).withName("pSequenceParameterSetVui")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$profile_idc = PathElement.groupElement("PATH$profile_idc");
    public static final PathElement PATH$level_idc = PathElement.groupElement("PATH$level_idc");
    public static final PathElement PATH$chroma_format_idc = PathElement.groupElement("PATH$chroma_format_idc");
    public static final PathElement PATH$seq_parameter_set_id = PathElement.groupElement("PATH$seq_parameter_set_id");
    public static final PathElement PATH$bit_depth_luma_minus8 = PathElement.groupElement("PATH$bit_depth_luma_minus8");
    public static final PathElement PATH$bit_depth_chroma_minus8 = PathElement.groupElement("PATH$bit_depth_chroma_minus8");
    public static final PathElement PATH$log2_max_frame_num_minus4 = PathElement.groupElement("PATH$log2_max_frame_num_minus4");
    public static final PathElement PATH$pic_order_cnt_type = PathElement.groupElement("PATH$pic_order_cnt_type");
    public static final PathElement PATH$offset_for_non_ref_pic = PathElement.groupElement("PATH$offset_for_non_ref_pic");
    public static final PathElement PATH$offset_for_top_to_bottom_field = PathElement.groupElement("PATH$offset_for_top_to_bottom_field");
    public static final PathElement PATH$log2_max_pic_order_cnt_lsb_minus4 = PathElement.groupElement("PATH$log2_max_pic_order_cnt_lsb_minus4");
    public static final PathElement PATH$num_ref_frames_in_pic_order_cnt_cycle = PathElement.groupElement("PATH$num_ref_frames_in_pic_order_cnt_cycle");
    public static final PathElement PATH$max_num_ref_frames = PathElement.groupElement("PATH$max_num_ref_frames");
    public static final PathElement PATH$pic_width_in_mbs_minus1 = PathElement.groupElement("PATH$pic_width_in_mbs_minus1");
    public static final PathElement PATH$pic_height_in_map_units_minus1 = PathElement.groupElement("PATH$pic_height_in_map_units_minus1");
    public static final PathElement PATH$frame_crop_left_offset = PathElement.groupElement("PATH$frame_crop_left_offset");
    public static final PathElement PATH$frame_crop_right_offset = PathElement.groupElement("PATH$frame_crop_right_offset");
    public static final PathElement PATH$frame_crop_top_offset = PathElement.groupElement("PATH$frame_crop_top_offset");
    public static final PathElement PATH$frame_crop_bottom_offset = PathElement.groupElement("PATH$frame_crop_bottom_offset");
    public static final PathElement PATH$pOffsetForRefFrame = PathElement.groupElement("PATH$pOffsetForRefFrame");
    public static final PathElement PATH$pScalingLists = PathElement.groupElement("PATH$pScalingLists");
    public static final PathElement PATH$pSequenceParameterSetVui = PathElement.groupElement("PATH$pSequenceParameterSetVui");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$profile_idc = (OfInt) LAYOUT.select(PATH$profile_idc);
    public static final OfInt LAYOUT$level_idc = (OfInt) LAYOUT.select(PATH$level_idc);
    public static final OfInt LAYOUT$chroma_format_idc = (OfInt) LAYOUT.select(PATH$chroma_format_idc);
    public static final OfByte LAYOUT$seq_parameter_set_id = (OfByte) LAYOUT.select(PATH$seq_parameter_set_id);
    public static final OfByte LAYOUT$bit_depth_luma_minus8 = (OfByte) LAYOUT.select(PATH$bit_depth_luma_minus8);
    public static final OfByte LAYOUT$bit_depth_chroma_minus8 = (OfByte) LAYOUT.select(PATH$bit_depth_chroma_minus8);
    public static final OfByte LAYOUT$log2_max_frame_num_minus4 = (OfByte) LAYOUT.select(PATH$log2_max_frame_num_minus4);
    public static final OfInt LAYOUT$pic_order_cnt_type = (OfInt) LAYOUT.select(PATH$pic_order_cnt_type);
    public static final OfInt LAYOUT$offset_for_non_ref_pic = (OfInt) LAYOUT.select(PATH$offset_for_non_ref_pic);
    public static final OfInt LAYOUT$offset_for_top_to_bottom_field = (OfInt) LAYOUT.select(PATH$offset_for_top_to_bottom_field);
    public static final OfByte LAYOUT$log2_max_pic_order_cnt_lsb_minus4 = (OfByte) LAYOUT.select(PATH$log2_max_pic_order_cnt_lsb_minus4);
    public static final OfByte LAYOUT$num_ref_frames_in_pic_order_cnt_cycle = (OfByte) LAYOUT.select(PATH$num_ref_frames_in_pic_order_cnt_cycle);
    public static final OfByte LAYOUT$max_num_ref_frames = (OfByte) LAYOUT.select(PATH$max_num_ref_frames);
    public static final OfInt LAYOUT$pic_width_in_mbs_minus1 = (OfInt) LAYOUT.select(PATH$pic_width_in_mbs_minus1);
    public static final OfInt LAYOUT$pic_height_in_map_units_minus1 = (OfInt) LAYOUT.select(PATH$pic_height_in_map_units_minus1);
    public static final OfInt LAYOUT$frame_crop_left_offset = (OfInt) LAYOUT.select(PATH$frame_crop_left_offset);
    public static final OfInt LAYOUT$frame_crop_right_offset = (OfInt) LAYOUT.select(PATH$frame_crop_right_offset);
    public static final OfInt LAYOUT$frame_crop_top_offset = (OfInt) LAYOUT.select(PATH$frame_crop_top_offset);
    public static final OfInt LAYOUT$frame_crop_bottom_offset = (OfInt) LAYOUT.select(PATH$frame_crop_bottom_offset);
    public static final AddressLayout LAYOUT$pOffsetForRefFrame = (AddressLayout) LAYOUT.select(PATH$pOffsetForRefFrame);
    public static final AddressLayout LAYOUT$pScalingLists = (AddressLayout) LAYOUT.select(PATH$pScalingLists);
    public static final AddressLayout LAYOUT$pSequenceParameterSetVui = (AddressLayout) LAYOUT.select(PATH$pSequenceParameterSetVui);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$profile_idc = LAYOUT$profile_idc.byteSize();
    public static final long SIZE$level_idc = LAYOUT$level_idc.byteSize();
    public static final long SIZE$chroma_format_idc = LAYOUT$chroma_format_idc.byteSize();
    public static final long SIZE$seq_parameter_set_id = LAYOUT$seq_parameter_set_id.byteSize();
    public static final long SIZE$bit_depth_luma_minus8 = LAYOUT$bit_depth_luma_minus8.byteSize();
    public static final long SIZE$bit_depth_chroma_minus8 = LAYOUT$bit_depth_chroma_minus8.byteSize();
    public static final long SIZE$log2_max_frame_num_minus4 = LAYOUT$log2_max_frame_num_minus4.byteSize();
    public static final long SIZE$pic_order_cnt_type = LAYOUT$pic_order_cnt_type.byteSize();
    public static final long SIZE$offset_for_non_ref_pic = LAYOUT$offset_for_non_ref_pic.byteSize();
    public static final long SIZE$offset_for_top_to_bottom_field = LAYOUT$offset_for_top_to_bottom_field.byteSize();
    public static final long SIZE$log2_max_pic_order_cnt_lsb_minus4 = LAYOUT$log2_max_pic_order_cnt_lsb_minus4.byteSize();
    public static final long SIZE$num_ref_frames_in_pic_order_cnt_cycle = LAYOUT$num_ref_frames_in_pic_order_cnt_cycle.byteSize();
    public static final long SIZE$max_num_ref_frames = LAYOUT$max_num_ref_frames.byteSize();
    public static final long SIZE$pic_width_in_mbs_minus1 = LAYOUT$pic_width_in_mbs_minus1.byteSize();
    public static final long SIZE$pic_height_in_map_units_minus1 = LAYOUT$pic_height_in_map_units_minus1.byteSize();
    public static final long SIZE$frame_crop_left_offset = LAYOUT$frame_crop_left_offset.byteSize();
    public static final long SIZE$frame_crop_right_offset = LAYOUT$frame_crop_right_offset.byteSize();
    public static final long SIZE$frame_crop_top_offset = LAYOUT$frame_crop_top_offset.byteSize();
    public static final long SIZE$frame_crop_bottom_offset = LAYOUT$frame_crop_bottom_offset.byteSize();
    public static final long SIZE$pOffsetForRefFrame = LAYOUT$pOffsetForRefFrame.byteSize();
    public static final long SIZE$pScalingLists = LAYOUT$pScalingLists.byteSize();
    public static final long SIZE$pSequenceParameterSetVui = LAYOUT$pSequenceParameterSetVui.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$profile_idc = LAYOUT.byteOffset(PATH$profile_idc);
    public static final long OFFSET$level_idc = LAYOUT.byteOffset(PATH$level_idc);
    public static final long OFFSET$chroma_format_idc = LAYOUT.byteOffset(PATH$chroma_format_idc);
    public static final long OFFSET$seq_parameter_set_id = LAYOUT.byteOffset(PATH$seq_parameter_set_id);
    public static final long OFFSET$bit_depth_luma_minus8 = LAYOUT.byteOffset(PATH$bit_depth_luma_minus8);
    public static final long OFFSET$bit_depth_chroma_minus8 = LAYOUT.byteOffset(PATH$bit_depth_chroma_minus8);
    public static final long OFFSET$log2_max_frame_num_minus4 = LAYOUT.byteOffset(PATH$log2_max_frame_num_minus4);
    public static final long OFFSET$pic_order_cnt_type = LAYOUT.byteOffset(PATH$pic_order_cnt_type);
    public static final long OFFSET$offset_for_non_ref_pic = LAYOUT.byteOffset(PATH$offset_for_non_ref_pic);
    public static final long OFFSET$offset_for_top_to_bottom_field = LAYOUT.byteOffset(PATH$offset_for_top_to_bottom_field);
    public static final long OFFSET$log2_max_pic_order_cnt_lsb_minus4 = LAYOUT.byteOffset(PATH$log2_max_pic_order_cnt_lsb_minus4);
    public static final long OFFSET$num_ref_frames_in_pic_order_cnt_cycle = LAYOUT.byteOffset(PATH$num_ref_frames_in_pic_order_cnt_cycle);
    public static final long OFFSET$max_num_ref_frames = LAYOUT.byteOffset(PATH$max_num_ref_frames);
    public static final long OFFSET$pic_width_in_mbs_minus1 = LAYOUT.byteOffset(PATH$pic_width_in_mbs_minus1);
    public static final long OFFSET$pic_height_in_map_units_minus1 = LAYOUT.byteOffset(PATH$pic_height_in_map_units_minus1);
    public static final long OFFSET$frame_crop_left_offset = LAYOUT.byteOffset(PATH$frame_crop_left_offset);
    public static final long OFFSET$frame_crop_right_offset = LAYOUT.byteOffset(PATH$frame_crop_right_offset);
    public static final long OFFSET$frame_crop_top_offset = LAYOUT.byteOffset(PATH$frame_crop_top_offset);
    public static final long OFFSET$frame_crop_bottom_offset = LAYOUT.byteOffset(PATH$frame_crop_bottom_offset);
    public static final long OFFSET$pOffsetForRefFrame = LAYOUT.byteOffset(PATH$pOffsetForRefFrame);
    public static final long OFFSET$pScalingLists = LAYOUT.byteOffset(PATH$pScalingLists);
    public static final long OFFSET$pSequenceParameterSetVui = LAYOUT.byteOffset(PATH$pSequenceParameterSetVui);
}
