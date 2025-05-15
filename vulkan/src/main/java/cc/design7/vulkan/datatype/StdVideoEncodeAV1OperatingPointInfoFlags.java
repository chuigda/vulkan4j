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

/// Represents a pointer to a {@code StdVideoEncodeAV1OperatingPointInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeAV1OperatingPointInfoFlags {
///     uint32_t decoder_model_present_for_this_op : 1;
///     uint32_t low_delay_mode_flag : 1;
///     uint32_t initial_display_delay_present_for_this_op : 1;
///     uint32_t reserved : 29;
/// } StdVideoEncodeAV1OperatingPointInfoFlags;
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
public record StdVideoEncodeAV1OperatingPointInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeAV1OperatingPointInfoFlags allocate(Arena arena) {
        StdVideoEncodeAV1OperatingPointInfoFlags ret = new StdVideoEncodeAV1OperatingPointInfoFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1OperatingPointInfoFlags[] ret = new StdVideoEncodeAV1OperatingPointInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeAV1OperatingPointInfoFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags clone(Arena arena, StdVideoEncodeAV1OperatingPointInfoFlags src) {
        StdVideoEncodeAV1OperatingPointInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeAV1OperatingPointInfoFlags[] clone(Arena arena, StdVideoEncodeAV1OperatingPointInfoFlags[] src) {
        StdVideoEncodeAV1OperatingPointInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean decoder_model_present_for_this_op() {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void decoder_model_present_for_this_op(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean low_delay_mode_flag() {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void low_delay_mode_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean initial_display_delay_present_for_this_op() {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        return BitfieldUtil.readBit(s, 2);
    }

    public void initial_display_delay_present_for_this_op(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$decoder_model_present_for_this_op_reserved, LAYOUT$decoder_model_present_for_this_op_reserved);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$decoder_model_present_for_this_op_reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$decoder_model_present_for_this_op_reserved = PathElement.groupElement("PATH$bitfield$decoder_model_present_for_this_op_reserved");

    public static final OfInt LAYOUT$decoder_model_present_for_this_op_reserved = (OfInt) LAYOUT.select(PATH$bitfield$decoder_model_present_for_this_op_reserved);


    public static final long OFFSET$decoder_model_present_for_this_op_reserved = LAYOUT.byteOffset(PATH$bitfield$decoder_model_present_for_this_op_reserved);
}
