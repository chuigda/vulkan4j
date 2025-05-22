package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoEncodeH264SliceHeaderFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH264SliceHeaderFlags {
///     uint32_t direct_spatial_mv_pred_flag : 1; // @link substring="direct_spatial_mv_pred_flag" target="#direct_spatial_mv_pred_flag"
///     uint32_t num_ref_idx_active_override_flag : 1; // @link substring="num_ref_idx_active_override_flag" target="#num_ref_idx_active_override_flag"
///     uint32_t reserved : 30;
/// } StdVideoEncodeH264SliceHeaderFlags;
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
public record StdVideoEncodeH264SliceHeaderFlags(@NotNull MemorySegment segment) implements IStdVideoEncodeH264SliceHeaderFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoEncodeH264SliceHeaderFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoEncodeH264SliceHeaderFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoEncodeH264SliceHeaderFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoEncodeH264SliceHeaderFlags {
        public long size() {
            return segment.byteSize() / StdVideoEncodeH264SliceHeaderFlags.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoEncodeH264SliceHeaderFlags at(long index) {
            return new StdVideoEncodeH264SliceHeaderFlags(segment.asSlice(index * StdVideoEncodeH264SliceHeaderFlags.BYTES, StdVideoEncodeH264SliceHeaderFlags.BYTES));
        }
        public void write(long index, @NotNull StdVideoEncodeH264SliceHeaderFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoEncodeH264SliceHeaderFlags.BYTES, StdVideoEncodeH264SliceHeaderFlags.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoEncodeH264SliceHeaderFlags allocate(Arena arena) {
        return new StdVideoEncodeH264SliceHeaderFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264SliceHeaderFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264SliceHeaderFlags.Ptr ret = new StdVideoEncodeH264SliceHeaderFlags.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoEncodeH264SliceHeaderFlags clone(Arena arena, StdVideoEncodeH264SliceHeaderFlags src) {
        StdVideoEncodeH264SliceHeaderFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean direct_spatial_mv_pred_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$direct_spatial_mv_pred_flag$reserved, LAYOUT$bitfield$direct_spatial_mv_pred_flag$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void direct_spatial_mv_pred_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$direct_spatial_mv_pred_flag$reserved, LAYOUT$bitfield$direct_spatial_mv_pred_flag$reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean num_ref_idx_active_override_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$direct_spatial_mv_pred_flag$reserved, LAYOUT$bitfield$direct_spatial_mv_pred_flag$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void num_ref_idx_active_override_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$direct_spatial_mv_pred_flag$reserved, LAYOUT$bitfield$direct_spatial_mv_pred_flag$reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$direct_spatial_mv_pred_flag$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$direct_spatial_mv_pred_flag$reserved = PathElement.groupElement("direct_spatial_mv_pred_flag$reserved");

    public static final OfInt LAYOUT$bitfield$direct_spatial_mv_pred_flag$reserved = (OfInt) LAYOUT.select(PATH$bitfield$direct_spatial_mv_pred_flag$reserved);


    public static final long OFFSET$bitfield$direct_spatial_mv_pred_flag$reserved = LAYOUT.byteOffset(PATH$bitfield$direct_spatial_mv_pred_flag$reserved);
}
