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

/// Represents a pointer to a {@code StdVideoH265SequenceParameterSetVui} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265SequenceParameterSetVui {
///     StdVideoH265SpsVuiFlags flags;
///     StdVideoH265AspectRatioIdc aspect_ratio_idc;
///     uint16_t sar_width;
///     uint16_t sar_height;
///     uint8_t video_format;
///     uint8_t colour_primaries;
///     uint8_t transfer_characteristics;
///     uint8_t matrix_coeffs;
///     uint8_t chroma_sample_loc_type_top_field;
///     uint8_t chroma_sample_loc_type_bottom_field;
///     uint8_t reserved1;
///     uint8_t reserved2;
///     uint16_t def_disp_win_left_offset;
///     uint16_t def_disp_win_right_offset;
///     uint16_t def_disp_win_top_offset;
///     uint16_t def_disp_win_bottom_offset;
///     uint32_t vui_num_units_in_tick;
///     uint32_t vui_time_scale;
///     uint32_t vui_num_ticks_poc_diff_one_minus1;
///     uint16_t min_spatial_segmentation_idc;
///     uint16_t reserved3;
///     uint8_t max_bytes_per_pic_denom;
///     uint8_t max_bits_per_min_cu_denom;
///     uint8_t log2_max_mv_length_horizontal;
///     uint8_t log2_max_mv_length_vertical;
///     StdVideoH265HrdParameters const* pHrdParameters;
/// } StdVideoH265SequenceParameterSetVui;
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
public record StdVideoH265SequenceParameterSetVui(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265SequenceParameterSetVui allocate(Arena arena) {
        StdVideoH265SequenceParameterSetVui ret = new StdVideoH265SequenceParameterSetVui(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH265SequenceParameterSetVui[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265SequenceParameterSetVui[] ret = new StdVideoH265SequenceParameterSetVui[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265SequenceParameterSetVui(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265SequenceParameterSetVui clone(Arena arena, StdVideoH265SequenceParameterSetVui src) {
        StdVideoH265SequenceParameterSetVui ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265SequenceParameterSetVui[] clone(Arena arena, StdVideoH265SequenceParameterSetVui[] src) {
        StdVideoH265SequenceParameterSetVui[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoH265SpsVuiFlags flags() {
        return new StdVideoH265SpsVuiFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoH265SpsVuiFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @enumtype(StdVideoH265AspectRatioIdc.class) int aspect_ratio_idc() {
        return segment.get(LAYOUT$aspect_ratio_idc, OFFSET$aspect_ratio_idc);
    }

    public void aspect_ratio_idc(@enumtype(StdVideoH265AspectRatioIdc.class) int value) {
        segment.set(LAYOUT$aspect_ratio_idc, OFFSET$aspect_ratio_idc, value);
    }

    public @unsigned short sar_width() {
        return segment.get(LAYOUT$sar_width, OFFSET$sar_width);
    }

    public void sar_width(@unsigned short value) {
        segment.set(LAYOUT$sar_width, OFFSET$sar_width, value);
    }

    public @unsigned short sar_height() {
        return segment.get(LAYOUT$sar_height, OFFSET$sar_height);
    }

    public void sar_height(@unsigned short value) {
        segment.set(LAYOUT$sar_height, OFFSET$sar_height, value);
    }

    public @unsigned byte video_format() {
        return segment.get(LAYOUT$video_format, OFFSET$video_format);
    }

    public void video_format(@unsigned byte value) {
        segment.set(LAYOUT$video_format, OFFSET$video_format, value);
    }

    public @unsigned byte colour_primaries() {
        return segment.get(LAYOUT$colour_primaries, OFFSET$colour_primaries);
    }

    public void colour_primaries(@unsigned byte value) {
        segment.set(LAYOUT$colour_primaries, OFFSET$colour_primaries, value);
    }

    public @unsigned byte transfer_characteristics() {
        return segment.get(LAYOUT$transfer_characteristics, OFFSET$transfer_characteristics);
    }

    public void transfer_characteristics(@unsigned byte value) {
        segment.set(LAYOUT$transfer_characteristics, OFFSET$transfer_characteristics, value);
    }

    public @unsigned byte matrix_coeffs() {
        return segment.get(LAYOUT$matrix_coeffs, OFFSET$matrix_coeffs);
    }

    public void matrix_coeffs(@unsigned byte value) {
        segment.set(LAYOUT$matrix_coeffs, OFFSET$matrix_coeffs, value);
    }

    public @unsigned byte chroma_sample_loc_type_top_field() {
        return segment.get(LAYOUT$chroma_sample_loc_type_top_field, OFFSET$chroma_sample_loc_type_top_field);
    }

    public void chroma_sample_loc_type_top_field(@unsigned byte value) {
        segment.set(LAYOUT$chroma_sample_loc_type_top_field, OFFSET$chroma_sample_loc_type_top_field, value);
    }

    public @unsigned byte chroma_sample_loc_type_bottom_field() {
        return segment.get(LAYOUT$chroma_sample_loc_type_bottom_field, OFFSET$chroma_sample_loc_type_bottom_field);
    }

    public void chroma_sample_loc_type_bottom_field(@unsigned byte value) {
        segment.set(LAYOUT$chroma_sample_loc_type_bottom_field, OFFSET$chroma_sample_loc_type_bottom_field, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @unsigned byte reserved2() {
        return segment.get(LAYOUT$reserved2, OFFSET$reserved2);
    }

    public void reserved2(@unsigned byte value) {
        segment.set(LAYOUT$reserved2, OFFSET$reserved2, value);
    }

    public @unsigned short def_disp_win_left_offset() {
        return segment.get(LAYOUT$def_disp_win_left_offset, OFFSET$def_disp_win_left_offset);
    }

    public void def_disp_win_left_offset(@unsigned short value) {
        segment.set(LAYOUT$def_disp_win_left_offset, OFFSET$def_disp_win_left_offset, value);
    }

    public @unsigned short def_disp_win_right_offset() {
        return segment.get(LAYOUT$def_disp_win_right_offset, OFFSET$def_disp_win_right_offset);
    }

    public void def_disp_win_right_offset(@unsigned short value) {
        segment.set(LAYOUT$def_disp_win_right_offset, OFFSET$def_disp_win_right_offset, value);
    }

    public @unsigned short def_disp_win_top_offset() {
        return segment.get(LAYOUT$def_disp_win_top_offset, OFFSET$def_disp_win_top_offset);
    }

    public void def_disp_win_top_offset(@unsigned short value) {
        segment.set(LAYOUT$def_disp_win_top_offset, OFFSET$def_disp_win_top_offset, value);
    }

    public @unsigned short def_disp_win_bottom_offset() {
        return segment.get(LAYOUT$def_disp_win_bottom_offset, OFFSET$def_disp_win_bottom_offset);
    }

    public void def_disp_win_bottom_offset(@unsigned short value) {
        segment.set(LAYOUT$def_disp_win_bottom_offset, OFFSET$def_disp_win_bottom_offset, value);
    }

    public @unsigned int vui_num_units_in_tick() {
        return segment.get(LAYOUT$vui_num_units_in_tick, OFFSET$vui_num_units_in_tick);
    }

    public void vui_num_units_in_tick(@unsigned int value) {
        segment.set(LAYOUT$vui_num_units_in_tick, OFFSET$vui_num_units_in_tick, value);
    }

    public @unsigned int vui_time_scale() {
        return segment.get(LAYOUT$vui_time_scale, OFFSET$vui_time_scale);
    }

    public void vui_time_scale(@unsigned int value) {
        segment.set(LAYOUT$vui_time_scale, OFFSET$vui_time_scale, value);
    }

    public @unsigned int vui_num_ticks_poc_diff_one_minus1() {
        return segment.get(LAYOUT$vui_num_ticks_poc_diff_one_minus1, OFFSET$vui_num_ticks_poc_diff_one_minus1);
    }

    public void vui_num_ticks_poc_diff_one_minus1(@unsigned int value) {
        segment.set(LAYOUT$vui_num_ticks_poc_diff_one_minus1, OFFSET$vui_num_ticks_poc_diff_one_minus1, value);
    }

    public @unsigned short min_spatial_segmentation_idc() {
        return segment.get(LAYOUT$min_spatial_segmentation_idc, OFFSET$min_spatial_segmentation_idc);
    }

    public void min_spatial_segmentation_idc(@unsigned short value) {
        segment.set(LAYOUT$min_spatial_segmentation_idc, OFFSET$min_spatial_segmentation_idc, value);
    }

    public @unsigned short reserved3() {
        return segment.get(LAYOUT$reserved3, OFFSET$reserved3);
    }

    public void reserved3(@unsigned short value) {
        segment.set(LAYOUT$reserved3, OFFSET$reserved3, value);
    }

    public @unsigned byte max_bytes_per_pic_denom() {
        return segment.get(LAYOUT$max_bytes_per_pic_denom, OFFSET$max_bytes_per_pic_denom);
    }

    public void max_bytes_per_pic_denom(@unsigned byte value) {
        segment.set(LAYOUT$max_bytes_per_pic_denom, OFFSET$max_bytes_per_pic_denom, value);
    }

    public @unsigned byte max_bits_per_min_cu_denom() {
        return segment.get(LAYOUT$max_bits_per_min_cu_denom, OFFSET$max_bits_per_min_cu_denom);
    }

    public void max_bits_per_min_cu_denom(@unsigned byte value) {
        segment.set(LAYOUT$max_bits_per_min_cu_denom, OFFSET$max_bits_per_min_cu_denom, value);
    }

    public @unsigned byte log2_max_mv_length_horizontal() {
        return segment.get(LAYOUT$log2_max_mv_length_horizontal, OFFSET$log2_max_mv_length_horizontal);
    }

    public void log2_max_mv_length_horizontal(@unsigned byte value) {
        segment.set(LAYOUT$log2_max_mv_length_horizontal, OFFSET$log2_max_mv_length_horizontal, value);
    }

    public @unsigned byte log2_max_mv_length_vertical() {
        return segment.get(LAYOUT$log2_max_mv_length_vertical, OFFSET$log2_max_mv_length_vertical);
    }

    public void log2_max_mv_length_vertical(@unsigned byte value) {
        segment.set(LAYOUT$log2_max_mv_length_vertical, OFFSET$log2_max_mv_length_vertical, value);
    }

    public @pointer(comment="StdVideoH265HrdParameters*") MemorySegment pHrdParametersRaw() {
        return segment.get(LAYOUT$pHrdParameters, OFFSET$pHrdParameters);
    }

    public void pHrdParametersRaw(@pointer(comment="StdVideoH265HrdParameters*") MemorySegment value) {
        segment.set(LAYOUT$pHrdParameters, OFFSET$pHrdParameters, value);
    }

    public @Nullable StdVideoH265HrdParameters pHrdParameters() {
        MemorySegment s = pHrdParametersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH265HrdParameters(s);
    }

    public void pHrdParameters(@Nullable StdVideoH265HrdParameters value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pHrdParametersRaw(s);
    }

    @unsafe public @Nullable StdVideoH265HrdParameters[] pHrdParameters(int assumedCount) {
        MemorySegment s = pHrdParametersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265HrdParameters.SIZE);
        StdVideoH265HrdParameters[] ret = new StdVideoH265HrdParameters[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265HrdParameters(s.asSlice(i * StdVideoH265HrdParameters.SIZE, StdVideoH265HrdParameters.SIZE));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoH265SpsVuiFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("aspect_ratio_idc"),
        ValueLayout.JAVA_SHORT.withName("sar_width"),
        ValueLayout.JAVA_SHORT.withName("sar_height"),
        ValueLayout.JAVA_BYTE.withName("video_format"),
        ValueLayout.JAVA_BYTE.withName("colour_primaries"),
        ValueLayout.JAVA_BYTE.withName("transfer_characteristics"),
        ValueLayout.JAVA_BYTE.withName("matrix_coeffs"),
        ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_top_field"),
        ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_bottom_field"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_SHORT.withName("def_disp_win_left_offset"),
        ValueLayout.JAVA_SHORT.withName("def_disp_win_right_offset"),
        ValueLayout.JAVA_SHORT.withName("def_disp_win_top_offset"),
        ValueLayout.JAVA_SHORT.withName("def_disp_win_bottom_offset"),
        ValueLayout.JAVA_INT.withName("vui_num_units_in_tick"),
        ValueLayout.JAVA_INT.withName("vui_time_scale"),
        ValueLayout.JAVA_INT.withName("vui_num_ticks_poc_diff_one_minus1"),
        ValueLayout.JAVA_SHORT.withName("min_spatial_segmentation_idc"),
        ValueLayout.JAVA_SHORT.withName("reserved3"),
        ValueLayout.JAVA_BYTE.withName("max_bytes_per_pic_denom"),
        ValueLayout.JAVA_BYTE.withName("max_bits_per_min_cu_denom"),
        ValueLayout.JAVA_BYTE.withName("log2_max_mv_length_horizontal"),
        ValueLayout.JAVA_BYTE.withName("log2_max_mv_length_vertical"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265HrdParameters.LAYOUT).withName("pHrdParameters")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$aspect_ratio_idc = PathElement.groupElement("PATH$aspect_ratio_idc");
    public static final PathElement PATH$sar_width = PathElement.groupElement("PATH$sar_width");
    public static final PathElement PATH$sar_height = PathElement.groupElement("PATH$sar_height");
    public static final PathElement PATH$video_format = PathElement.groupElement("PATH$video_format");
    public static final PathElement PATH$colour_primaries = PathElement.groupElement("PATH$colour_primaries");
    public static final PathElement PATH$transfer_characteristics = PathElement.groupElement("PATH$transfer_characteristics");
    public static final PathElement PATH$matrix_coeffs = PathElement.groupElement("PATH$matrix_coeffs");
    public static final PathElement PATH$chroma_sample_loc_type_top_field = PathElement.groupElement("PATH$chroma_sample_loc_type_top_field");
    public static final PathElement PATH$chroma_sample_loc_type_bottom_field = PathElement.groupElement("PATH$chroma_sample_loc_type_bottom_field");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$reserved2 = PathElement.groupElement("PATH$reserved2");
    public static final PathElement PATH$def_disp_win_left_offset = PathElement.groupElement("PATH$def_disp_win_left_offset");
    public static final PathElement PATH$def_disp_win_right_offset = PathElement.groupElement("PATH$def_disp_win_right_offset");
    public static final PathElement PATH$def_disp_win_top_offset = PathElement.groupElement("PATH$def_disp_win_top_offset");
    public static final PathElement PATH$def_disp_win_bottom_offset = PathElement.groupElement("PATH$def_disp_win_bottom_offset");
    public static final PathElement PATH$vui_num_units_in_tick = PathElement.groupElement("PATH$vui_num_units_in_tick");
    public static final PathElement PATH$vui_time_scale = PathElement.groupElement("PATH$vui_time_scale");
    public static final PathElement PATH$vui_num_ticks_poc_diff_one_minus1 = PathElement.groupElement("PATH$vui_num_ticks_poc_diff_one_minus1");
    public static final PathElement PATH$min_spatial_segmentation_idc = PathElement.groupElement("PATH$min_spatial_segmentation_idc");
    public static final PathElement PATH$reserved3 = PathElement.groupElement("PATH$reserved3");
    public static final PathElement PATH$max_bytes_per_pic_denom = PathElement.groupElement("PATH$max_bytes_per_pic_denom");
    public static final PathElement PATH$max_bits_per_min_cu_denom = PathElement.groupElement("PATH$max_bits_per_min_cu_denom");
    public static final PathElement PATH$log2_max_mv_length_horizontal = PathElement.groupElement("PATH$log2_max_mv_length_horizontal");
    public static final PathElement PATH$log2_max_mv_length_vertical = PathElement.groupElement("PATH$log2_max_mv_length_vertical");
    public static final PathElement PATH$pHrdParameters = PathElement.groupElement("PATH$pHrdParameters");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$aspect_ratio_idc = (OfInt) LAYOUT.select(PATH$aspect_ratio_idc);
    public static final OfShort LAYOUT$sar_width = (OfShort) LAYOUT.select(PATH$sar_width);
    public static final OfShort LAYOUT$sar_height = (OfShort) LAYOUT.select(PATH$sar_height);
    public static final OfByte LAYOUT$video_format = (OfByte) LAYOUT.select(PATH$video_format);
    public static final OfByte LAYOUT$colour_primaries = (OfByte) LAYOUT.select(PATH$colour_primaries);
    public static final OfByte LAYOUT$transfer_characteristics = (OfByte) LAYOUT.select(PATH$transfer_characteristics);
    public static final OfByte LAYOUT$matrix_coeffs = (OfByte) LAYOUT.select(PATH$matrix_coeffs);
    public static final OfByte LAYOUT$chroma_sample_loc_type_top_field = (OfByte) LAYOUT.select(PATH$chroma_sample_loc_type_top_field);
    public static final OfByte LAYOUT$chroma_sample_loc_type_bottom_field = (OfByte) LAYOUT.select(PATH$chroma_sample_loc_type_bottom_field);
    public static final OfByte LAYOUT$reserved1 = (OfByte) LAYOUT.select(PATH$reserved1);
    public static final OfByte LAYOUT$reserved2 = (OfByte) LAYOUT.select(PATH$reserved2);
    public static final OfShort LAYOUT$def_disp_win_left_offset = (OfShort) LAYOUT.select(PATH$def_disp_win_left_offset);
    public static final OfShort LAYOUT$def_disp_win_right_offset = (OfShort) LAYOUT.select(PATH$def_disp_win_right_offset);
    public static final OfShort LAYOUT$def_disp_win_top_offset = (OfShort) LAYOUT.select(PATH$def_disp_win_top_offset);
    public static final OfShort LAYOUT$def_disp_win_bottom_offset = (OfShort) LAYOUT.select(PATH$def_disp_win_bottom_offset);
    public static final OfInt LAYOUT$vui_num_units_in_tick = (OfInt) LAYOUT.select(PATH$vui_num_units_in_tick);
    public static final OfInt LAYOUT$vui_time_scale = (OfInt) LAYOUT.select(PATH$vui_time_scale);
    public static final OfInt LAYOUT$vui_num_ticks_poc_diff_one_minus1 = (OfInt) LAYOUT.select(PATH$vui_num_ticks_poc_diff_one_minus1);
    public static final OfShort LAYOUT$min_spatial_segmentation_idc = (OfShort) LAYOUT.select(PATH$min_spatial_segmentation_idc);
    public static final OfShort LAYOUT$reserved3 = (OfShort) LAYOUT.select(PATH$reserved3);
    public static final OfByte LAYOUT$max_bytes_per_pic_denom = (OfByte) LAYOUT.select(PATH$max_bytes_per_pic_denom);
    public static final OfByte LAYOUT$max_bits_per_min_cu_denom = (OfByte) LAYOUT.select(PATH$max_bits_per_min_cu_denom);
    public static final OfByte LAYOUT$log2_max_mv_length_horizontal = (OfByte) LAYOUT.select(PATH$log2_max_mv_length_horizontal);
    public static final OfByte LAYOUT$log2_max_mv_length_vertical = (OfByte) LAYOUT.select(PATH$log2_max_mv_length_vertical);
    public static final AddressLayout LAYOUT$pHrdParameters = (AddressLayout) LAYOUT.select(PATH$pHrdParameters);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$aspect_ratio_idc = LAYOUT$aspect_ratio_idc.byteSize();
    public static final long SIZE$sar_width = LAYOUT$sar_width.byteSize();
    public static final long SIZE$sar_height = LAYOUT$sar_height.byteSize();
    public static final long SIZE$video_format = LAYOUT$video_format.byteSize();
    public static final long SIZE$colour_primaries = LAYOUT$colour_primaries.byteSize();
    public static final long SIZE$transfer_characteristics = LAYOUT$transfer_characteristics.byteSize();
    public static final long SIZE$matrix_coeffs = LAYOUT$matrix_coeffs.byteSize();
    public static final long SIZE$chroma_sample_loc_type_top_field = LAYOUT$chroma_sample_loc_type_top_field.byteSize();
    public static final long SIZE$chroma_sample_loc_type_bottom_field = LAYOUT$chroma_sample_loc_type_bottom_field.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$reserved2 = LAYOUT$reserved2.byteSize();
    public static final long SIZE$def_disp_win_left_offset = LAYOUT$def_disp_win_left_offset.byteSize();
    public static final long SIZE$def_disp_win_right_offset = LAYOUT$def_disp_win_right_offset.byteSize();
    public static final long SIZE$def_disp_win_top_offset = LAYOUT$def_disp_win_top_offset.byteSize();
    public static final long SIZE$def_disp_win_bottom_offset = LAYOUT$def_disp_win_bottom_offset.byteSize();
    public static final long SIZE$vui_num_units_in_tick = LAYOUT$vui_num_units_in_tick.byteSize();
    public static final long SIZE$vui_time_scale = LAYOUT$vui_time_scale.byteSize();
    public static final long SIZE$vui_num_ticks_poc_diff_one_minus1 = LAYOUT$vui_num_ticks_poc_diff_one_minus1.byteSize();
    public static final long SIZE$min_spatial_segmentation_idc = LAYOUT$min_spatial_segmentation_idc.byteSize();
    public static final long SIZE$reserved3 = LAYOUT$reserved3.byteSize();
    public static final long SIZE$max_bytes_per_pic_denom = LAYOUT$max_bytes_per_pic_denom.byteSize();
    public static final long SIZE$max_bits_per_min_cu_denom = LAYOUT$max_bits_per_min_cu_denom.byteSize();
    public static final long SIZE$log2_max_mv_length_horizontal = LAYOUT$log2_max_mv_length_horizontal.byteSize();
    public static final long SIZE$log2_max_mv_length_vertical = LAYOUT$log2_max_mv_length_vertical.byteSize();
    public static final long SIZE$pHrdParameters = LAYOUT$pHrdParameters.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$aspect_ratio_idc = LAYOUT.byteOffset(PATH$aspect_ratio_idc);
    public static final long OFFSET$sar_width = LAYOUT.byteOffset(PATH$sar_width);
    public static final long OFFSET$sar_height = LAYOUT.byteOffset(PATH$sar_height);
    public static final long OFFSET$video_format = LAYOUT.byteOffset(PATH$video_format);
    public static final long OFFSET$colour_primaries = LAYOUT.byteOffset(PATH$colour_primaries);
    public static final long OFFSET$transfer_characteristics = LAYOUT.byteOffset(PATH$transfer_characteristics);
    public static final long OFFSET$matrix_coeffs = LAYOUT.byteOffset(PATH$matrix_coeffs);
    public static final long OFFSET$chroma_sample_loc_type_top_field = LAYOUT.byteOffset(PATH$chroma_sample_loc_type_top_field);
    public static final long OFFSET$chroma_sample_loc_type_bottom_field = LAYOUT.byteOffset(PATH$chroma_sample_loc_type_bottom_field);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$reserved2 = LAYOUT.byteOffset(PATH$reserved2);
    public static final long OFFSET$def_disp_win_left_offset = LAYOUT.byteOffset(PATH$def_disp_win_left_offset);
    public static final long OFFSET$def_disp_win_right_offset = LAYOUT.byteOffset(PATH$def_disp_win_right_offset);
    public static final long OFFSET$def_disp_win_top_offset = LAYOUT.byteOffset(PATH$def_disp_win_top_offset);
    public static final long OFFSET$def_disp_win_bottom_offset = LAYOUT.byteOffset(PATH$def_disp_win_bottom_offset);
    public static final long OFFSET$vui_num_units_in_tick = LAYOUT.byteOffset(PATH$vui_num_units_in_tick);
    public static final long OFFSET$vui_time_scale = LAYOUT.byteOffset(PATH$vui_time_scale);
    public static final long OFFSET$vui_num_ticks_poc_diff_one_minus1 = LAYOUT.byteOffset(PATH$vui_num_ticks_poc_diff_one_minus1);
    public static final long OFFSET$min_spatial_segmentation_idc = LAYOUT.byteOffset(PATH$min_spatial_segmentation_idc);
    public static final long OFFSET$reserved3 = LAYOUT.byteOffset(PATH$reserved3);
    public static final long OFFSET$max_bytes_per_pic_denom = LAYOUT.byteOffset(PATH$max_bytes_per_pic_denom);
    public static final long OFFSET$max_bits_per_min_cu_denom = LAYOUT.byteOffset(PATH$max_bits_per_min_cu_denom);
    public static final long OFFSET$log2_max_mv_length_horizontal = LAYOUT.byteOffset(PATH$log2_max_mv_length_horizontal);
    public static final long OFFSET$log2_max_mv_length_vertical = LAYOUT.byteOffset(PATH$log2_max_mv_length_vertical);
    public static final long OFFSET$pHrdParameters = LAYOUT.byteOffset(PATH$pHrdParameters);
}
