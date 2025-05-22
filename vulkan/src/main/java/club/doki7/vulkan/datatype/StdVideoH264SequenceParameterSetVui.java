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

/// Represents a pointer to a {@code StdVideoH264SequenceParameterSetVui} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH264SequenceParameterSetVui {
///     StdVideoH264SpsVuiFlags flags; // @link substring="StdVideoH264SpsVuiFlags" target="StdVideoH264SpsVuiFlags" @link substring="flags" target="#flags"
///     StdVideoH264AspectRatioIdc aspect_ratio_idc; // @link substring="StdVideoH264AspectRatioIdc" target="StdVideoH264AspectRatioIdc" @link substring="aspect_ratio_idc" target="#aspect_ratio_idc"
///     uint16_t sar_width; // @link substring="sar_width" target="#sar_width"
///     uint16_t sar_height; // @link substring="sar_height" target="#sar_height"
///     uint8_t video_format; // @link substring="video_format" target="#video_format"
///     uint8_t colour_primaries; // @link substring="colour_primaries" target="#colour_primaries"
///     uint8_t transfer_characteristics; // @link substring="transfer_characteristics" target="#transfer_characteristics"
///     uint8_t matrix_coefficients; // @link substring="matrix_coefficients" target="#matrix_coefficients"
///     uint32_t num_units_in_tick; // @link substring="num_units_in_tick" target="#num_units_in_tick"
///     uint32_t time_scale; // @link substring="time_scale" target="#time_scale"
///     uint8_t max_num_reorder_frames; // @link substring="max_num_reorder_frames" target="#max_num_reorder_frames"
///     uint8_t max_dec_frame_buffering; // @link substring="max_dec_frame_buffering" target="#max_dec_frame_buffering"
///     uint8_t chroma_sample_loc_type_top_field; // @link substring="chroma_sample_loc_type_top_field" target="#chroma_sample_loc_type_top_field"
///     uint8_t chroma_sample_loc_type_bottom_field; // @link substring="chroma_sample_loc_type_bottom_field" target="#chroma_sample_loc_type_bottom_field"
///     uint32_t reserved1;
///     StdVideoH264HrdParameters const* pHrdParameters; // @link substring="StdVideoH264HrdParameters" target="StdVideoH264HrdParameters" @link substring="pHrdParameters" target="#pHrdParameters"
/// } StdVideoH264SequenceParameterSetVui;
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
public record StdVideoH264SequenceParameterSetVui(@NotNull MemorySegment segment) implements IStdVideoH264SequenceParameterSetVui {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoH264SequenceParameterSetVui}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoH264SequenceParameterSetVui to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoH264SequenceParameterSetVui.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoH264SequenceParameterSetVui {
        public long size() {
            return segment.byteSize() / StdVideoH264SequenceParameterSetVui.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoH264SequenceParameterSetVui at(long index) {
            return new StdVideoH264SequenceParameterSetVui(segment.asSlice(index * StdVideoH264SequenceParameterSetVui.BYTES, StdVideoH264SequenceParameterSetVui.BYTES));
        }
        public void write(long index, @NotNull StdVideoH264SequenceParameterSetVui value) {
            MemorySegment s = segment.asSlice(index * StdVideoH264SequenceParameterSetVui.BYTES, StdVideoH264SequenceParameterSetVui.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoH264SequenceParameterSetVui allocate(Arena arena) {
        return new StdVideoH264SequenceParameterSetVui(arena.allocate(LAYOUT));
    }

    public static StdVideoH264SequenceParameterSetVui.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264SequenceParameterSetVui.Ptr ret = new StdVideoH264SequenceParameterSetVui.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoH264SequenceParameterSetVui clone(Arena arena, StdVideoH264SequenceParameterSetVui src) {
        StdVideoH264SequenceParameterSetVui ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull StdVideoH264SpsVuiFlags flags() {
        return new StdVideoH264SpsVuiFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoH264SpsVuiFlags value) {
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

    public @pointer(target=StdVideoH264HrdParameters.class) MemorySegment pHrdParametersRaw() {
        return segment.get(LAYOUT$pHrdParameters, OFFSET$pHrdParameters);
    }

    public void pHrdParametersRaw(@pointer(target=StdVideoH264HrdParameters.class) MemorySegment value) {
        segment.set(LAYOUT$pHrdParameters, OFFSET$pHrdParameters, value);
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

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$aspect_ratio_idc = PathElement.groupElement("aspect_ratio_idc");
    public static final PathElement PATH$sar_width = PathElement.groupElement("sar_width");
    public static final PathElement PATH$sar_height = PathElement.groupElement("sar_height");
    public static final PathElement PATH$video_format = PathElement.groupElement("video_format");
    public static final PathElement PATH$colour_primaries = PathElement.groupElement("colour_primaries");
    public static final PathElement PATH$transfer_characteristics = PathElement.groupElement("transfer_characteristics");
    public static final PathElement PATH$matrix_coefficients = PathElement.groupElement("matrix_coefficients");
    public static final PathElement PATH$num_units_in_tick = PathElement.groupElement("num_units_in_tick");
    public static final PathElement PATH$time_scale = PathElement.groupElement("time_scale");
    public static final PathElement PATH$max_num_reorder_frames = PathElement.groupElement("max_num_reorder_frames");
    public static final PathElement PATH$max_dec_frame_buffering = PathElement.groupElement("max_dec_frame_buffering");
    public static final PathElement PATH$chroma_sample_loc_type_top_field = PathElement.groupElement("chroma_sample_loc_type_top_field");
    public static final PathElement PATH$chroma_sample_loc_type_bottom_field = PathElement.groupElement("chroma_sample_loc_type_bottom_field");
    public static final PathElement PATH$pHrdParameters = PathElement.groupElement("pHrdParameters");

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
    public static final long OFFSET$pHrdParameters = LAYOUT.byteOffset(PATH$pHrdParameters);
}
