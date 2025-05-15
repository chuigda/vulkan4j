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

/// Represents a pointer to a {@code StdVideoEncodeAV1OperatingPointInfo} structure in native memory.
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
public record StdVideoEncodeAV1OperatingPointInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeAV1OperatingPointInfo allocate(Arena arena) {
        return new StdVideoEncodeAV1OperatingPointInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1OperatingPointInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1OperatingPointInfo[] ret = new StdVideoEncodeAV1OperatingPointInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeAV1OperatingPointInfo(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeAV1OperatingPointInfo clone(Arena arena, StdVideoEncodeAV1OperatingPointInfo src) {
        StdVideoEncodeAV1OperatingPointInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeAV1OperatingPointInfo[] clone(Arena arena, StdVideoEncodeAV1OperatingPointInfo[] src) {
        StdVideoEncodeAV1OperatingPointInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeAV1OperatingPointInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_SHORT.withName("operating_point_idc"),
        ValueLayout.JAVA_BYTE.withName("seq_level_idx"),
        ValueLayout.JAVA_BYTE.withName("seq_tier"),
        ValueLayout.JAVA_INT.withName("decoder_buffer_delay"),
        ValueLayout.JAVA_INT.withName("encoder_buffer_delay"),
        ValueLayout.JAVA_BYTE.withName("initial_display_delay_minus_1")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$operating_point_idc = PathElement.groupElement("PATH$operating_point_idc");
    public static final PathElement PATH$seq_level_idx = PathElement.groupElement("PATH$seq_level_idx");
    public static final PathElement PATH$seq_tier = PathElement.groupElement("PATH$seq_tier");
    public static final PathElement PATH$decoder_buffer_delay = PathElement.groupElement("PATH$decoder_buffer_delay");
    public static final PathElement PATH$encoder_buffer_delay = PathElement.groupElement("PATH$encoder_buffer_delay");
    public static final PathElement PATH$initial_display_delay_minus_1 = PathElement.groupElement("PATH$initial_display_delay_minus_1");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfShort LAYOUT$operating_point_idc = (OfShort) LAYOUT.select(PATH$operating_point_idc);
    public static final OfByte LAYOUT$seq_level_idx = (OfByte) LAYOUT.select(PATH$seq_level_idx);
    public static final OfByte LAYOUT$seq_tier = (OfByte) LAYOUT.select(PATH$seq_tier);
    public static final OfInt LAYOUT$decoder_buffer_delay = (OfInt) LAYOUT.select(PATH$decoder_buffer_delay);
    public static final OfInt LAYOUT$encoder_buffer_delay = (OfInt) LAYOUT.select(PATH$encoder_buffer_delay);
    public static final OfByte LAYOUT$initial_display_delay_minus_1 = (OfByte) LAYOUT.select(PATH$initial_display_delay_minus_1);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$operating_point_idc = LAYOUT$operating_point_idc.byteSize();
    public static final long SIZE$seq_level_idx = LAYOUT$seq_level_idx.byteSize();
    public static final long SIZE$seq_tier = LAYOUT$seq_tier.byteSize();
    public static final long SIZE$decoder_buffer_delay = LAYOUT$decoder_buffer_delay.byteSize();
    public static final long SIZE$encoder_buffer_delay = LAYOUT$encoder_buffer_delay.byteSize();
    public static final long SIZE$initial_display_delay_minus_1 = LAYOUT$initial_display_delay_minus_1.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$operating_point_idc = LAYOUT.byteOffset(PATH$operating_point_idc);
    public static final long OFFSET$seq_level_idx = LAYOUT.byteOffset(PATH$seq_level_idx);
    public static final long OFFSET$seq_tier = LAYOUT.byteOffset(PATH$seq_tier);
    public static final long OFFSET$decoder_buffer_delay = LAYOUT.byteOffset(PATH$decoder_buffer_delay);
    public static final long OFFSET$encoder_buffer_delay = LAYOUT.byteOffset(PATH$encoder_buffer_delay);
    public static final long OFFSET$initial_display_delay_minus_1 = LAYOUT.byteOffset(PATH$initial_display_delay_minus_1);

    public StdVideoEncodeAV1OperatingPointInfoFlags flags() {
        return new StdVideoEncodeAV1OperatingPointInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoEncodeAV1OperatingPointInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned short operating_point_idc() {
        return segment.get(LAYOUT$operating_point_idc, OFFSET$operating_point_idc);
    }

    public void operating_point_idc(@unsigned short value) {
        segment.set(LAYOUT$operating_point_idc, OFFSET$operating_point_idc, value);
    }

    public @unsigned byte seq_level_idx() {
        return segment.get(LAYOUT$seq_level_idx, OFFSET$seq_level_idx);
    }

    public void seq_level_idx(@unsigned byte value) {
        segment.set(LAYOUT$seq_level_idx, OFFSET$seq_level_idx, value);
    }

    public @unsigned byte seq_tier() {
        return segment.get(LAYOUT$seq_tier, OFFSET$seq_tier);
    }

    public void seq_tier(@unsigned byte value) {
        segment.set(LAYOUT$seq_tier, OFFSET$seq_tier, value);
    }

    public @unsigned int decoder_buffer_delay() {
        return segment.get(LAYOUT$decoder_buffer_delay, OFFSET$decoder_buffer_delay);
    }

    public void decoder_buffer_delay(@unsigned int value) {
        segment.set(LAYOUT$decoder_buffer_delay, OFFSET$decoder_buffer_delay, value);
    }

    public @unsigned int encoder_buffer_delay() {
        return segment.get(LAYOUT$encoder_buffer_delay, OFFSET$encoder_buffer_delay);
    }

    public void encoder_buffer_delay(@unsigned int value) {
        segment.set(LAYOUT$encoder_buffer_delay, OFFSET$encoder_buffer_delay, value);
    }

    public @unsigned byte initial_display_delay_minus_1() {
        return segment.get(LAYOUT$initial_display_delay_minus_1, OFFSET$initial_display_delay_minus_1);
    }

    public void initial_display_delay_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$initial_display_delay_minus_1, OFFSET$initial_display_delay_minus_1, value);
    }

}
