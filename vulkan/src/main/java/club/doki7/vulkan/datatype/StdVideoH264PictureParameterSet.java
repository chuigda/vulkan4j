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

/// Represents a pointer to a {@code StdVideoH264PictureParameterSet} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH264PictureParameterSet {
///     StdVideoH264PpsFlags flags;
///     uint8_t seq_parameter_set_id;
///     uint8_t pic_parameter_set_id;
///     uint8_t num_ref_idx_l0_default_active_minus1;
///     uint8_t num_ref_idx_l1_default_active_minus1;
///     StdVideoH264WeightedBipredIdc weighted_bipred_idc;
///     int8_t pic_init_qp_minus26;
///     int8_t pic_init_qs_minus26;
///     int8_t chroma_qp_index_offset;
///     int8_t second_chroma_qp_index_offset;
///     StdVideoH264ScalingLists const* pScalingLists;
/// } StdVideoH264PictureParameterSet;
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
public record StdVideoH264PictureParameterSet(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH264PictureParameterSet allocate(Arena arena) {
        StdVideoH264PictureParameterSet ret = new StdVideoH264PictureParameterSet(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH264PictureParameterSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264PictureParameterSet[] ret = new StdVideoH264PictureParameterSet[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH264PictureParameterSet(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH264PictureParameterSet clone(Arena arena, StdVideoH264PictureParameterSet src) {
        StdVideoH264PictureParameterSet ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH264PictureParameterSet[] clone(Arena arena, StdVideoH264PictureParameterSet[] src) {
        StdVideoH264PictureParameterSet[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoH264PpsFlags flags() {
        return new StdVideoH264PpsFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoH264PpsFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte seq_parameter_set_id() {
        return segment.get(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id);
    }

    public void seq_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$seq_parameter_set_id, OFFSET$seq_parameter_set_id, value);
    }

    public @unsigned byte pic_parameter_set_id() {
        return segment.get(LAYOUT$pic_parameter_set_id, OFFSET$pic_parameter_set_id);
    }

    public void pic_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$pic_parameter_set_id, OFFSET$pic_parameter_set_id, value);
    }

    public @unsigned byte num_ref_idx_l0_default_active_minus1() {
        return segment.get(LAYOUT$num_ref_idx_l0_default_active_minus1, OFFSET$num_ref_idx_l0_default_active_minus1);
    }

    public void num_ref_idx_l0_default_active_minus1(@unsigned byte value) {
        segment.set(LAYOUT$num_ref_idx_l0_default_active_minus1, OFFSET$num_ref_idx_l0_default_active_minus1, value);
    }

    public @unsigned byte num_ref_idx_l1_default_active_minus1() {
        return segment.get(LAYOUT$num_ref_idx_l1_default_active_minus1, OFFSET$num_ref_idx_l1_default_active_minus1);
    }

    public void num_ref_idx_l1_default_active_minus1(@unsigned byte value) {
        segment.set(LAYOUT$num_ref_idx_l1_default_active_minus1, OFFSET$num_ref_idx_l1_default_active_minus1, value);
    }

    public @enumtype(StdVideoH264WeightedBipredIdc.class) int weighted_bipred_idc() {
        return segment.get(LAYOUT$weighted_bipred_idc, OFFSET$weighted_bipred_idc);
    }

    public void weighted_bipred_idc(@enumtype(StdVideoH264WeightedBipredIdc.class) int value) {
        segment.set(LAYOUT$weighted_bipred_idc, OFFSET$weighted_bipred_idc, value);
    }

    public byte pic_init_qp_minus26() {
        return segment.get(LAYOUT$pic_init_qp_minus26, OFFSET$pic_init_qp_minus26);
    }

    public void pic_init_qp_minus26(byte value) {
        segment.set(LAYOUT$pic_init_qp_minus26, OFFSET$pic_init_qp_minus26, value);
    }

    public byte pic_init_qs_minus26() {
        return segment.get(LAYOUT$pic_init_qs_minus26, OFFSET$pic_init_qs_minus26);
    }

    public void pic_init_qs_minus26(byte value) {
        segment.set(LAYOUT$pic_init_qs_minus26, OFFSET$pic_init_qs_minus26, value);
    }

    public byte chroma_qp_index_offset() {
        return segment.get(LAYOUT$chroma_qp_index_offset, OFFSET$chroma_qp_index_offset);
    }

    public void chroma_qp_index_offset(byte value) {
        segment.set(LAYOUT$chroma_qp_index_offset, OFFSET$chroma_qp_index_offset, value);
    }

    public byte second_chroma_qp_index_offset() {
        return segment.get(LAYOUT$second_chroma_qp_index_offset, OFFSET$second_chroma_qp_index_offset);
    }

    public void second_chroma_qp_index_offset(byte value) {
        segment.set(LAYOUT$second_chroma_qp_index_offset, OFFSET$second_chroma_qp_index_offset, value);
    }

    public @pointer(target=StdVideoH264ScalingLists.class) MemorySegment pScalingListsRaw() {
        return segment.get(LAYOUT$pScalingLists, OFFSET$pScalingLists);
    }

    public void pScalingListsRaw(@pointer(target=StdVideoH264ScalingLists.class) MemorySegment value) {
        segment.set(LAYOUT$pScalingLists, OFFSET$pScalingLists, value);
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoH264PpsFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("seq_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("pic_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_default_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_default_active_minus1"),
        ValueLayout.JAVA_INT.withName("weighted_bipred_idc"),
        ValueLayout.JAVA_BYTE.withName("pic_init_qp_minus26"),
        ValueLayout.JAVA_BYTE.withName("pic_init_qs_minus26"),
        ValueLayout.JAVA_BYTE.withName("chroma_qp_index_offset"),
        ValueLayout.JAVA_BYTE.withName("second_chroma_qp_index_offset"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH264ScalingLists.LAYOUT).withName("pScalingLists")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$seq_parameter_set_id = PathElement.groupElement("PATH$seq_parameter_set_id");
    public static final PathElement PATH$pic_parameter_set_id = PathElement.groupElement("PATH$pic_parameter_set_id");
    public static final PathElement PATH$num_ref_idx_l0_default_active_minus1 = PathElement.groupElement("PATH$num_ref_idx_l0_default_active_minus1");
    public static final PathElement PATH$num_ref_idx_l1_default_active_minus1 = PathElement.groupElement("PATH$num_ref_idx_l1_default_active_minus1");
    public static final PathElement PATH$weighted_bipred_idc = PathElement.groupElement("PATH$weighted_bipred_idc");
    public static final PathElement PATH$pic_init_qp_minus26 = PathElement.groupElement("PATH$pic_init_qp_minus26");
    public static final PathElement PATH$pic_init_qs_minus26 = PathElement.groupElement("PATH$pic_init_qs_minus26");
    public static final PathElement PATH$chroma_qp_index_offset = PathElement.groupElement("PATH$chroma_qp_index_offset");
    public static final PathElement PATH$second_chroma_qp_index_offset = PathElement.groupElement("PATH$second_chroma_qp_index_offset");
    public static final PathElement PATH$pScalingLists = PathElement.groupElement("PATH$pScalingLists");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$seq_parameter_set_id = (OfByte) LAYOUT.select(PATH$seq_parameter_set_id);
    public static final OfByte LAYOUT$pic_parameter_set_id = (OfByte) LAYOUT.select(PATH$pic_parameter_set_id);
    public static final OfByte LAYOUT$num_ref_idx_l0_default_active_minus1 = (OfByte) LAYOUT.select(PATH$num_ref_idx_l0_default_active_minus1);
    public static final OfByte LAYOUT$num_ref_idx_l1_default_active_minus1 = (OfByte) LAYOUT.select(PATH$num_ref_idx_l1_default_active_minus1);
    public static final OfInt LAYOUT$weighted_bipred_idc = (OfInt) LAYOUT.select(PATH$weighted_bipred_idc);
    public static final OfByte LAYOUT$pic_init_qp_minus26 = (OfByte) LAYOUT.select(PATH$pic_init_qp_minus26);
    public static final OfByte LAYOUT$pic_init_qs_minus26 = (OfByte) LAYOUT.select(PATH$pic_init_qs_minus26);
    public static final OfByte LAYOUT$chroma_qp_index_offset = (OfByte) LAYOUT.select(PATH$chroma_qp_index_offset);
    public static final OfByte LAYOUT$second_chroma_qp_index_offset = (OfByte) LAYOUT.select(PATH$second_chroma_qp_index_offset);
    public static final AddressLayout LAYOUT$pScalingLists = (AddressLayout) LAYOUT.select(PATH$pScalingLists);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$seq_parameter_set_id = LAYOUT$seq_parameter_set_id.byteSize();
    public static final long SIZE$pic_parameter_set_id = LAYOUT$pic_parameter_set_id.byteSize();
    public static final long SIZE$num_ref_idx_l0_default_active_minus1 = LAYOUT$num_ref_idx_l0_default_active_minus1.byteSize();
    public static final long SIZE$num_ref_idx_l1_default_active_minus1 = LAYOUT$num_ref_idx_l1_default_active_minus1.byteSize();
    public static final long SIZE$weighted_bipred_idc = LAYOUT$weighted_bipred_idc.byteSize();
    public static final long SIZE$pic_init_qp_minus26 = LAYOUT$pic_init_qp_minus26.byteSize();
    public static final long SIZE$pic_init_qs_minus26 = LAYOUT$pic_init_qs_minus26.byteSize();
    public static final long SIZE$chroma_qp_index_offset = LAYOUT$chroma_qp_index_offset.byteSize();
    public static final long SIZE$second_chroma_qp_index_offset = LAYOUT$second_chroma_qp_index_offset.byteSize();
    public static final long SIZE$pScalingLists = LAYOUT$pScalingLists.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$seq_parameter_set_id = LAYOUT.byteOffset(PATH$seq_parameter_set_id);
    public static final long OFFSET$pic_parameter_set_id = LAYOUT.byteOffset(PATH$pic_parameter_set_id);
    public static final long OFFSET$num_ref_idx_l0_default_active_minus1 = LAYOUT.byteOffset(PATH$num_ref_idx_l0_default_active_minus1);
    public static final long OFFSET$num_ref_idx_l1_default_active_minus1 = LAYOUT.byteOffset(PATH$num_ref_idx_l1_default_active_minus1);
    public static final long OFFSET$weighted_bipred_idc = LAYOUT.byteOffset(PATH$weighted_bipred_idc);
    public static final long OFFSET$pic_init_qp_minus26 = LAYOUT.byteOffset(PATH$pic_init_qp_minus26);
    public static final long OFFSET$pic_init_qs_minus26 = LAYOUT.byteOffset(PATH$pic_init_qs_minus26);
    public static final long OFFSET$chroma_qp_index_offset = LAYOUT.byteOffset(PATH$chroma_qp_index_offset);
    public static final long OFFSET$second_chroma_qp_index_offset = LAYOUT.byteOffset(PATH$second_chroma_qp_index_offset);
    public static final long OFFSET$pScalingLists = LAYOUT.byteOffset(PATH$pScalingLists);
}
