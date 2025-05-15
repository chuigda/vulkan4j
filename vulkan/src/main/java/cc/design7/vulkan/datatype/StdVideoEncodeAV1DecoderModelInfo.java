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

@ValueBasedCandidate
public record StdVideoEncodeAV1DecoderModelInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfByte LAYOUT$buffer_delay_length_minus_1 = ValueLayout.JAVA_BYTE.withName("buffer_delay_length_minus_1");
    public static final OfByte LAYOUT$buffer_removal_time_length_minus_1 = ValueLayout.JAVA_BYTE.withName("buffer_removal_time_length_minus_1");
    public static final OfByte LAYOUT$frame_presentation_time_length_minus_1 = ValueLayout.JAVA_BYTE.withName("frame_presentation_time_length_minus_1");
    public static final OfByte LAYOUT$reserved1 = ValueLayout.JAVA_BYTE.withName("reserved1");
    public static final OfInt LAYOUT$num_units_in_decoding_tick = ValueLayout.JAVA_INT.withName("num_units_in_decoding_tick");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$buffer_delay_length_minus_1, LAYOUT$buffer_removal_time_length_minus_1, LAYOUT$frame_presentation_time_length_minus_1, LAYOUT$reserved1, LAYOUT$num_units_in_decoding_tick);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoEncodeAV1DecoderModelInfo allocate(Arena arena) {
        return new StdVideoEncodeAV1DecoderModelInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1DecoderModelInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1DecoderModelInfo[] ret = new StdVideoEncodeAV1DecoderModelInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeAV1DecoderModelInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeAV1DecoderModelInfo clone(Arena arena, StdVideoEncodeAV1DecoderModelInfo src) {
        StdVideoEncodeAV1DecoderModelInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeAV1DecoderModelInfo[] clone(Arena arena, StdVideoEncodeAV1DecoderModelInfo[] src) {
        StdVideoEncodeAV1DecoderModelInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$buffer_delay_length_minus_1 = PathElement.groupElement("PATH$buffer_delay_length_minus_1");
    public static final PathElement PATH$buffer_removal_time_length_minus_1 = PathElement.groupElement("PATH$buffer_removal_time_length_minus_1");
    public static final PathElement PATH$frame_presentation_time_length_minus_1 = PathElement.groupElement("PATH$frame_presentation_time_length_minus_1");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$num_units_in_decoding_tick = PathElement.groupElement("PATH$num_units_in_decoding_tick");

    public static final long SIZE$buffer_delay_length_minus_1 = LAYOUT$buffer_delay_length_minus_1.byteSize();
    public static final long SIZE$buffer_removal_time_length_minus_1 = LAYOUT$buffer_removal_time_length_minus_1.byteSize();
    public static final long SIZE$frame_presentation_time_length_minus_1 = LAYOUT$frame_presentation_time_length_minus_1.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$num_units_in_decoding_tick = LAYOUT$num_units_in_decoding_tick.byteSize();

    public static final long OFFSET$buffer_delay_length_minus_1 = LAYOUT.byteOffset(PATH$buffer_delay_length_minus_1);
    public static final long OFFSET$buffer_removal_time_length_minus_1 = LAYOUT.byteOffset(PATH$buffer_removal_time_length_minus_1);
    public static final long OFFSET$frame_presentation_time_length_minus_1 = LAYOUT.byteOffset(PATH$frame_presentation_time_length_minus_1);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$num_units_in_decoding_tick = LAYOUT.byteOffset(PATH$num_units_in_decoding_tick);

    public @unsigned byte buffer_delay_length_minus_1() {
        return segment.get(LAYOUT$buffer_delay_length_minus_1, OFFSET$buffer_delay_length_minus_1);
    }

    public void buffer_delay_length_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$buffer_delay_length_minus_1, OFFSET$buffer_delay_length_minus_1, value);
    }

    public @unsigned byte buffer_removal_time_length_minus_1() {
        return segment.get(LAYOUT$buffer_removal_time_length_minus_1, OFFSET$buffer_removal_time_length_minus_1);
    }

    public void buffer_removal_time_length_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$buffer_removal_time_length_minus_1, OFFSET$buffer_removal_time_length_minus_1, value);
    }

    public @unsigned byte frame_presentation_time_length_minus_1() {
        return segment.get(LAYOUT$frame_presentation_time_length_minus_1, OFFSET$frame_presentation_time_length_minus_1);
    }

    public void frame_presentation_time_length_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$frame_presentation_time_length_minus_1, OFFSET$frame_presentation_time_length_minus_1, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @unsigned int num_units_in_decoding_tick() {
        return segment.get(LAYOUT$num_units_in_decoding_tick, OFFSET$num_units_in_decoding_tick);
    }

    public void num_units_in_decoding_tick(@unsigned int value) {
        segment.set(LAYOUT$num_units_in_decoding_tick, OFFSET$num_units_in_decoding_tick, value);
    }

}
