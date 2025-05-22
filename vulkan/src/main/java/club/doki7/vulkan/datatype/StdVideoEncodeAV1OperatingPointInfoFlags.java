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

/// Represents a pointer to a {@code StdVideoEncodeAV1OperatingPointInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeAV1OperatingPointInfoFlags {
///     uint32_t decoder_model_present_for_this_op : 1; // @link substring="decoder_model_present_for_this_op" target="#decoder_model_present_for_this_op"
///     uint32_t low_delay_mode_flag : 1; // @link substring="low_delay_mode_flag" target="#low_delay_mode_flag"
///     uint32_t initial_display_delay_present_for_this_op : 1; // @link substring="initial_display_delay_present_for_this_op" target="#initial_display_delay_present_for_this_op"
///     uint32_t reserved : 29;
/// } StdVideoEncodeAV1OperatingPointInfoFlags;
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
public record StdVideoEncodeAV1OperatingPointInfoFlags(@NotNull MemorySegment segment) implements IStdVideoEncodeAV1OperatingPointInfoFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoEncodeAV1OperatingPointInfoFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoEncodeAV1OperatingPointInfoFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoEncodeAV1OperatingPointInfoFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoEncodeAV1OperatingPointInfoFlags {
        public long size() {
            return segment.byteSize() / StdVideoEncodeAV1OperatingPointInfoFlags.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoEncodeAV1OperatingPointInfoFlags at(long index) {
            return new StdVideoEncodeAV1OperatingPointInfoFlags(segment.asSlice(index * StdVideoEncodeAV1OperatingPointInfoFlags.BYTES, StdVideoEncodeAV1OperatingPointInfoFlags.BYTES));
        }
        public void write(long index, @NotNull StdVideoEncodeAV1OperatingPointInfoFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoEncodeAV1OperatingPointInfoFlags.BYTES, StdVideoEncodeAV1OperatingPointInfoFlags.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoEncodeAV1OperatingPointInfoFlags allocate(Arena arena) {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1OperatingPointInfoFlags.Ptr ret = new StdVideoEncodeAV1OperatingPointInfoFlags.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags clone(Arena arena, StdVideoEncodeAV1OperatingPointInfoFlags src) {
        StdVideoEncodeAV1OperatingPointInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean decoder_model_present_for_this_op() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$decoder_model_present_for_this_op$reserved, LAYOUT$bitfield$decoder_model_present_for_this_op$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void decoder_model_present_for_this_op(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$decoder_model_present_for_this_op$reserved, LAYOUT$bitfield$decoder_model_present_for_this_op$reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean low_delay_mode_flag() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$decoder_model_present_for_this_op$reserved, LAYOUT$bitfield$decoder_model_present_for_this_op$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void low_delay_mode_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$decoder_model_present_for_this_op$reserved, LAYOUT$bitfield$decoder_model_present_for_this_op$reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean initial_display_delay_present_for_this_op() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$decoder_model_present_for_this_op$reserved, LAYOUT$bitfield$decoder_model_present_for_this_op$reserved);
        return BitfieldUtil.readBit(s, 2);
    }

    public void initial_display_delay_present_for_this_op(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$decoder_model_present_for_this_op$reserved, LAYOUT$bitfield$decoder_model_present_for_this_op$reserved);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$decoder_model_present_for_this_op$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$decoder_model_present_for_this_op$reserved = PathElement.groupElement("decoder_model_present_for_this_op$reserved");

    public static final OfInt LAYOUT$bitfield$decoder_model_present_for_this_op$reserved = (OfInt) LAYOUT.select(PATH$bitfield$decoder_model_present_for_this_op$reserved);


    public static final long OFFSET$bitfield$decoder_model_present_for_this_op$reserved = LAYOUT.byteOffset(PATH$bitfield$decoder_model_present_for_this_op$reserved);
}
