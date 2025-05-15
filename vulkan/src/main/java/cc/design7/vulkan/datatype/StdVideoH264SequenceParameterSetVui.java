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

/// Represents a pointer to a {@code StdVideoH264SequenceParameterSetVui} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH264SequenceParameterSetVui {
///     StdVideoH264SpsVuiFlags flags;
///     StdVideoH264AspectRatioIdc aspect_ratio_idc;
///     uint16_t sar_width;
///     uint16_t sar_height;
///     uint8_t video_format;
///     uint8_t colour_primaries;
///     uint8_t transfer_characteristics;
///     uint8_t matrix_coefficients;
///     uint32_t num_units_in_tick;
///     uint32_t time_scale;
///     uint8_t max_num_reorder_frames;
///     uint8_t max_dec_frame_buffering;
///     uint8_t chroma_sample_loc_type_top_field;
///     uint8_t chroma_sample_loc_type_bottom_field;
///     uint32_t reserved1;
///     StdVideoH264HrdParameters const* pHrdParameters;
/// } StdVideoH264SequenceParameterSetVui;
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
public record StdVideoH264SequenceParameterSetVui(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH264SequenceParameterSetVui allocate(Arena arena) {
        StdVideoH264SequenceParameterSetVui ret = new StdVideoH264SequenceParameterSetVui(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH264SequenceParameterSetVui[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264SequenceParameterSetVui[] ret = new StdVideoH264SequenceParameterSetVui[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH264SequenceParameterSetVui(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH264SequenceParameterSetVui clone(Arena arena, StdVideoH264SequenceParameterSetVui src) {
        StdVideoH264SequenceParameterSetVui ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH264SequenceParameterSetVui[] clone(Arena arena, StdVideoH264SequenceParameterSetVui[] src) {
        StdVideoH264SequenceParameterSetVui[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoH264SpsVuiFlags flags() {
        return new StdVideoH264SpsVuiFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoH264SpsVuiFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @enumtype(StdVideoH264AspectRatioIdc.class) int aspect_ratio_idc() {
        return segment.get(LAYOUT$aspect_ratio_idc, OFFSET$aspect_ratio_idc);
    }

    public void aspect_ratio_idc(@enumtype(StdVideoH264AspectRatioIdc.class) int value) {
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

    public @unsigned byte matrix_coefficients() {
        return segment.get(LAYOUT$matrix_coefficients, OFFSET$matrix_coefficients);
    }

    public void matrix_coefficients(@unsigned byte value) {
        segment.set(LAYOUT$matrix_coefficients, OFFSET$matrix_coefficients, value);
    }

    public @unsigned int num_units_in_tick() {
        return segment.get(LAYOUT$num_units_in_tick, OFFSET$num_units_in_tick);
    }

    public void num_units_in_tick(@unsigned int value) {
        segment.set(LAYOUT$num_units_in_tick, OFFSET$num_units_in_tick, value);
    }

    public @unsigned int time_scale() {
        return segment.get(LAYOUT$time_scale, OFFSET$time_scale);
    }

    public void time_scale(@unsigned int value) {
        segment.set(LAYOUT$time_scale, OFFSET$time_scale, value);
    }

    public @unsigned byte max_num_reorder_frames() {
        return segment.get(LAYOUT$max_num_reorder_frames, OFFSET$max_num_reorder_frames);
    }

    public void max_num_reorder_frames(@unsigned byte value) {
        segment.set(LAYOUT$max_num_reorder_frames, OFFSET$max_num_reorder_frames, value);
    }

    public @unsigned byte max_dec_frame_buffering() {
        return segment.get(LAYOUT$max_dec_frame_buffering, OFFSET$max_dec_frame_buffering);
    }

    public void max_dec_frame_buffering(@unsigned byte value) {
        segment.set(LAYOUT$max_dec_frame_buffering, OFFSET$max_dec_frame_buffering, value);
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

    public @unsigned int reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned int value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @pointer(comment="StdVideoH264HrdParameters*") MemorySegment pHrdParametersRaw() {
        return segment.get(LAYOUT$pHrdParameters, OFFSET$pHrdParameters);
    }

    public void pHrdParametersRaw(@pointer(comment="StdVideoH264HrdParameters*") MemorySegment value) {
        segment.set(LAYOUT$pHrdParameters, OFFSET$pHrdParameters, value);
    }

    public @Nullable StdVideoH264HrdParameters pHrdParameters() {
        MemorySegment s = pHrdParametersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH264HrdParameters(s);
    }

    public void pHrdParameters(@Nullable StdVideoH264HrdParameters value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pHrdParametersRaw(s);
    }

    @unsafe public @Nullable StdVideoH264HrdParameters[] pHrdParameters(int assumedCount) {
        MemorySegment s = pHrdParametersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH264HrdParameters.BYTES);
        StdVideoH264HrdParameters[] ret = new StdVideoH264HrdParameters[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH264HrdParameters(s.asSlice(i * StdVideoH264HrdParameters.BYTES, StdVideoH264HrdParameters.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoH264SpsVuiFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("aspect_ratio_idc"),
        ValueLayout.JAVA_SHORT.withName("sar_width"),
        ValueLayout.JAVA_SHORT.withName("sar_height"),
        ValueLayout.JAVA_BYTE.withName("video_format"),
        ValueLayout.JAVA_BYTE.withName("colour_primaries"),
        ValueLayout.JAVA_BYTE.withName("transfer_characteristics"),
        ValueLayout.JAVA_BYTE.withName("matrix_coefficients"),
        ValueLayout.JAVA_INT.withName("num_units_in_tick"),
        ValueLayout.JAVA_INT.withName("time_scale"),
        ValueLayout.JAVA_BYTE.withName("max_num_reorder_frames"),
        ValueLayout.JAVA_BYTE.withName("max_dec_frame_buffering"),
        ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_top_field"),
        ValueLayout.JAVA_BYTE.withName("chroma_sample_loc_type_bottom_field"),
        ValueLayout.JAVA_INT.withName("reserved1"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264HrdParameters.LAYOUT).withName("pHrdParameters")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$aspect_ratio_idc = PathElement.groupElement("PATH$aspect_ratio_idc");
    public static final PathElement PATH$sar_width = PathElement.groupElement("PATH$sar_width");
    public static final PathElement PATH$sar_height = PathElement.groupElement("PATH$sar_height");
    public static final PathElement PATH$video_format = PathElement.groupElement("PATH$video_format");
    public static final PathElement PATH$colour_primaries = PathElement.groupElement("PATH$colour_primaries");
    public static final PathElement PATH$transfer_characteristics = PathElement.groupElement("PATH$transfer_characteristics");
    public static final PathElement PATH$matrix_coefficients = PathElement.groupElement("PATH$matrix_coefficients");
    public static final PathElement PATH$num_units_in_tick = PathElement.groupElement("PATH$num_units_in_tick");
    public static final PathElement PATH$time_scale = PathElement.groupElement("PATH$time_scale");
    public static final PathElement PATH$max_num_reorder_frames = PathElement.groupElement("PATH$max_num_reorder_frames");
    public static final PathElement PATH$max_dec_frame_buffering = PathElement.groupElement("PATH$max_dec_frame_buffering");
    public static final PathElement PATH$chroma_sample_loc_type_top_field = PathElement.groupElement("PATH$chroma_sample_loc_type_top_field");
    public static final PathElement PATH$chroma_sample_loc_type_bottom_field = PathElement.groupElement("PATH$chroma_sample_loc_type_bottom_field");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$pHrdParameters = PathElement.groupElement("PATH$pHrdParameters");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$aspect_ratio_idc = (OfInt) LAYOUT.select(PATH$aspect_ratio_idc);
    public static final OfShort LAYOUT$sar_width = (OfShort) LAYOUT.select(PATH$sar_width);
    public static final OfShort LAYOUT$sar_height = (OfShort) LAYOUT.select(PATH$sar_height);
    public static final OfByte LAYOUT$video_format = (OfByte) LAYOUT.select(PATH$video_format);
    public static final OfByte LAYOUT$colour_primaries = (OfByte) LAYOUT.select(PATH$colour_primaries);
    public static final OfByte LAYOUT$transfer_characteristics = (OfByte) LAYOUT.select(PATH$transfer_characteristics);
    public static final OfByte LAYOUT$matrix_coefficients = (OfByte) LAYOUT.select(PATH$matrix_coefficients);
    public static final OfInt LAYOUT$num_units_in_tick = (OfInt) LAYOUT.select(PATH$num_units_in_tick);
    public static final OfInt LAYOUT$time_scale = (OfInt) LAYOUT.select(PATH$time_scale);
    public static final OfByte LAYOUT$max_num_reorder_frames = (OfByte) LAYOUT.select(PATH$max_num_reorder_frames);
    public static final OfByte LAYOUT$max_dec_frame_buffering = (OfByte) LAYOUT.select(PATH$max_dec_frame_buffering);
    public static final OfByte LAYOUT$chroma_sample_loc_type_top_field = (OfByte) LAYOUT.select(PATH$chroma_sample_loc_type_top_field);
    public static final OfByte LAYOUT$chroma_sample_loc_type_bottom_field = (OfByte) LAYOUT.select(PATH$chroma_sample_loc_type_bottom_field);
    public static final OfInt LAYOUT$reserved1 = (OfInt) LAYOUT.select(PATH$reserved1);
    public static final AddressLayout LAYOUT$pHrdParameters = (AddressLayout) LAYOUT.select(PATH$pHrdParameters);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$aspect_ratio_idc = LAYOUT$aspect_ratio_idc.byteSize();
    public static final long SIZE$sar_width = LAYOUT$sar_width.byteSize();
    public static final long SIZE$sar_height = LAYOUT$sar_height.byteSize();
    public static final long SIZE$video_format = LAYOUT$video_format.byteSize();
    public static final long SIZE$colour_primaries = LAYOUT$colour_primaries.byteSize();
    public static final long SIZE$transfer_characteristics = LAYOUT$transfer_characteristics.byteSize();
    public static final long SIZE$matrix_coefficients = LAYOUT$matrix_coefficients.byteSize();
    public static final long SIZE$num_units_in_tick = LAYOUT$num_units_in_tick.byteSize();
    public static final long SIZE$time_scale = LAYOUT$time_scale.byteSize();
    public static final long SIZE$max_num_reorder_frames = LAYOUT$max_num_reorder_frames.byteSize();
    public static final long SIZE$max_dec_frame_buffering = LAYOUT$max_dec_frame_buffering.byteSize();
    public static final long SIZE$chroma_sample_loc_type_top_field = LAYOUT$chroma_sample_loc_type_top_field.byteSize();
    public static final long SIZE$chroma_sample_loc_type_bottom_field = LAYOUT$chroma_sample_loc_type_bottom_field.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$pHrdParameters = LAYOUT$pHrdParameters.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$aspect_ratio_idc = LAYOUT.byteOffset(PATH$aspect_ratio_idc);
    public static final long OFFSET$sar_width = LAYOUT.byteOffset(PATH$sar_width);
    public static final long OFFSET$sar_height = LAYOUT.byteOffset(PATH$sar_height);
    public static final long OFFSET$video_format = LAYOUT.byteOffset(PATH$video_format);
    public static final long OFFSET$colour_primaries = LAYOUT.byteOffset(PATH$colour_primaries);
    public static final long OFFSET$transfer_characteristics = LAYOUT.byteOffset(PATH$transfer_characteristics);
    public static final long OFFSET$matrix_coefficients = LAYOUT.byteOffset(PATH$matrix_coefficients);
    public static final long OFFSET$num_units_in_tick = LAYOUT.byteOffset(PATH$num_units_in_tick);
    public static final long OFFSET$time_scale = LAYOUT.byteOffset(PATH$time_scale);
    public static final long OFFSET$max_num_reorder_frames = LAYOUT.byteOffset(PATH$max_num_reorder_frames);
    public static final long OFFSET$max_dec_frame_buffering = LAYOUT.byteOffset(PATH$max_dec_frame_buffering);
    public static final long OFFSET$chroma_sample_loc_type_top_field = LAYOUT.byteOffset(PATH$chroma_sample_loc_type_top_field);
    public static final long OFFSET$chroma_sample_loc_type_bottom_field = LAYOUT.byteOffset(PATH$chroma_sample_loc_type_bottom_field);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$pHrdParameters = LAYOUT.byteOffset(PATH$pHrdParameters);
}
