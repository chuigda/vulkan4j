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

/// Represents a pointer to a {@code StdVideoEncodeH264SliceHeader} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH264SliceHeader {
///     StdVideoEncodeH264SliceHeaderFlags flags; // @link substring="StdVideoEncodeH264SliceHeaderFlags" target="StdVideoEncodeH264SliceHeaderFlags" @link substring="flags" target="#flags"
///     uint32_t first_mb_in_slice; // @link substring="first_mb_in_slice" target="#first_mb_in_slice"
///     StdVideoH264SliceType slice_type; // @link substring="StdVideoH264SliceType" target="StdVideoH264SliceType" @link substring="slice_type" target="#slice_type"
///     int8_t slice_alpha_c0_offset_div2; // @link substring="slice_alpha_c0_offset_div2" target="#slice_alpha_c0_offset_div2"
///     int8_t slice_beta_offset_div2; // @link substring="slice_beta_offset_div2" target="#slice_beta_offset_div2"
///     int8_t slice_qp_delta; // @link substring="slice_qp_delta" target="#slice_qp_delta"
///     uint8_t reserved1;
///     StdVideoH264CabacInitIdc cabac_init_idc; // @link substring="StdVideoH264CabacInitIdc" target="StdVideoH264CabacInitIdc" @link substring="cabac_init_idc" target="#cabac_init_idc"
///     StdVideoH264DisableDeblockingFilterIdc disable_deblocking_filter_idc; // @link substring="StdVideoH264DisableDeblockingFilterIdc" target="StdVideoH264DisableDeblockingFilterIdc" @link substring="disable_deblocking_filter_idc" target="#disable_deblocking_filter_idc"
///     StdVideoEncodeH264WeightTable const* pWeightTable; // @link substring="StdVideoEncodeH264WeightTable" target="StdVideoEncodeH264WeightTable" @link substring="pWeightTable" target="#pWeightTable"
/// } StdVideoEncodeH264SliceHeader;
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
public record StdVideoEncodeH264SliceHeader(@NotNull MemorySegment segment) implements IStdVideoEncodeH264SliceHeader {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoEncodeH264SliceHeader}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoEncodeH264SliceHeader to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoEncodeH264SliceHeader.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoEncodeH264SliceHeader {
        public long size() {
            return segment.byteSize() / StdVideoEncodeH264SliceHeader.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoEncodeH264SliceHeader at(long index) {
            return new StdVideoEncodeH264SliceHeader(segment.asSlice(index * StdVideoEncodeH264SliceHeader.BYTES, StdVideoEncodeH264SliceHeader.BYTES));
        }
        public void write(long index, @NotNull StdVideoEncodeH264SliceHeader value) {
            MemorySegment s = segment.asSlice(index * StdVideoEncodeH264SliceHeader.BYTES, StdVideoEncodeH264SliceHeader.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoEncodeH264SliceHeader allocate(Arena arena) {
        return new StdVideoEncodeH264SliceHeader(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264SliceHeader.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264SliceHeader.Ptr ret = new StdVideoEncodeH264SliceHeader.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoEncodeH264SliceHeader clone(Arena arena, StdVideoEncodeH264SliceHeader src) {
        StdVideoEncodeH264SliceHeader ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull StdVideoEncodeH264SliceHeaderFlags flags() {
        return new StdVideoEncodeH264SliceHeaderFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoEncodeH264SliceHeaderFlags value) {
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

    public @Nullable StdVideoEncodeH264WeightTable pWeightTable() {
        MemorySegment s = pWeightTableRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeH264WeightTable.BYTES);
        StdVideoEncodeH264WeightTable[] ret = new StdVideoEncodeH264WeightTable[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeH264WeightTable(s.asSlice(i * StdVideoEncodeH264WeightTable.BYTES, StdVideoEncodeH264WeightTable.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoEncodeH264WeightTable.class) MemorySegment pWeightTableRaw() {
        return segment.get(LAYOUT$pWeightTable, OFFSET$pWeightTable);
    }

    public void pWeightTableRaw(@pointer(target=StdVideoEncodeH264WeightTable.class) MemorySegment value) {
        segment.set(LAYOUT$pWeightTable, OFFSET$pWeightTable, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeH264SliceHeaderFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("first_mb_in_slice"),
        ValueLayout.JAVA_INT.withName("slice_type"),
        ValueLayout.JAVA_BYTE.withName("slice_alpha_c0_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("slice_beta_offset_div2"),
        ValueLayout.JAVA_BYTE.withName("slice_qp_delta"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("cabac_init_idc"),
        ValueLayout.JAVA_INT.withName("disable_deblocking_filter_idc"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeH264WeightTable.LAYOUT).withName("pWeightTable")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$first_mb_in_slice = PathElement.groupElement("first_mb_in_slice");
    public static final PathElement PATH$slice_type = PathElement.groupElement("slice_type");
    public static final PathElement PATH$slice_alpha_c0_offset_div2 = PathElement.groupElement("slice_alpha_c0_offset_div2");
    public static final PathElement PATH$slice_beta_offset_div2 = PathElement.groupElement("slice_beta_offset_div2");
    public static final PathElement PATH$slice_qp_delta = PathElement.groupElement("slice_qp_delta");
    public static final PathElement PATH$cabac_init_idc = PathElement.groupElement("cabac_init_idc");
    public static final PathElement PATH$disable_deblocking_filter_idc = PathElement.groupElement("disable_deblocking_filter_idc");
    public static final PathElement PATH$pWeightTable = PathElement.groupElement("pWeightTable");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$first_mb_in_slice = (OfInt) LAYOUT.select(PATH$first_mb_in_slice);
    public static final OfInt LAYOUT$slice_type = (OfInt) LAYOUT.select(PATH$slice_type);
    public static final OfByte LAYOUT$slice_alpha_c0_offset_div2 = (OfByte) LAYOUT.select(PATH$slice_alpha_c0_offset_div2);
    public static final OfByte LAYOUT$slice_beta_offset_div2 = (OfByte) LAYOUT.select(PATH$slice_beta_offset_div2);
    public static final OfByte LAYOUT$slice_qp_delta = (OfByte) LAYOUT.select(PATH$slice_qp_delta);
    public static final OfInt LAYOUT$cabac_init_idc = (OfInt) LAYOUT.select(PATH$cabac_init_idc);
    public static final OfInt LAYOUT$disable_deblocking_filter_idc = (OfInt) LAYOUT.select(PATH$disable_deblocking_filter_idc);
    public static final AddressLayout LAYOUT$pWeightTable = (AddressLayout) LAYOUT.select(PATH$pWeightTable);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$first_mb_in_slice = LAYOUT$first_mb_in_slice.byteSize();
    public static final long SIZE$slice_type = LAYOUT$slice_type.byteSize();
    public static final long SIZE$slice_alpha_c0_offset_div2 = LAYOUT$slice_alpha_c0_offset_div2.byteSize();
    public static final long SIZE$slice_beta_offset_div2 = LAYOUT$slice_beta_offset_div2.byteSize();
    public static final long SIZE$slice_qp_delta = LAYOUT$slice_qp_delta.byteSize();
    public static final long SIZE$cabac_init_idc = LAYOUT$cabac_init_idc.byteSize();
    public static final long SIZE$disable_deblocking_filter_idc = LAYOUT$disable_deblocking_filter_idc.byteSize();
    public static final long SIZE$pWeightTable = LAYOUT$pWeightTable.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$first_mb_in_slice = LAYOUT.byteOffset(PATH$first_mb_in_slice);
    public static final long OFFSET$slice_type = LAYOUT.byteOffset(PATH$slice_type);
    public static final long OFFSET$slice_alpha_c0_offset_div2 = LAYOUT.byteOffset(PATH$slice_alpha_c0_offset_div2);
    public static final long OFFSET$slice_beta_offset_div2 = LAYOUT.byteOffset(PATH$slice_beta_offset_div2);
    public static final long OFFSET$slice_qp_delta = LAYOUT.byteOffset(PATH$slice_qp_delta);
    public static final long OFFSET$cabac_init_idc = LAYOUT.byteOffset(PATH$cabac_init_idc);
    public static final long OFFSET$disable_deblocking_filter_idc = LAYOUT.byteOffset(PATH$disable_deblocking_filter_idc);
    public static final long OFFSET$pWeightTable = LAYOUT.byteOffset(PATH$pWeightTable);
}
