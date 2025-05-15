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
public record StdVideoAV1ColorConfig(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoAV1ColorConfigFlags.LAYOUT.withName("flags");
    public static final OfByte LAYOUT$BitDepth = ValueLayout.JAVA_BYTE.withName("BitDepth");
    public static final OfByte LAYOUT$subsampling_x = ValueLayout.JAVA_BYTE.withName("subsampling_x");
    public static final OfByte LAYOUT$subsampling_y = ValueLayout.JAVA_BYTE.withName("subsampling_y");
    public static final OfByte LAYOUT$reserved1 = ValueLayout.JAVA_BYTE.withName("reserved1");
    public static final OfInt LAYOUT$color_primaries = ValueLayout.JAVA_INT.withName("color_primaries");
    public static final OfInt LAYOUT$transfer_characteristics = ValueLayout.JAVA_INT.withName("transfer_characteristics");
    public static final OfInt LAYOUT$matrix_coefficients = ValueLayout.JAVA_INT.withName("matrix_coefficients");
    public static final OfInt LAYOUT$chroma_sample_position = ValueLayout.JAVA_INT.withName("chroma_sample_position");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$BitDepth, LAYOUT$subsampling_x, LAYOUT$subsampling_y, LAYOUT$reserved1, LAYOUT$color_primaries, LAYOUT$transfer_characteristics, LAYOUT$matrix_coefficients, LAYOUT$chroma_sample_position);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoAV1ColorConfig allocate(Arena arena) {
        return new StdVideoAV1ColorConfig(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1ColorConfig[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1ColorConfig[] ret = new StdVideoAV1ColorConfig[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1ColorConfig(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoAV1ColorConfig clone(Arena arena, StdVideoAV1ColorConfig src) {
        StdVideoAV1ColorConfig ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1ColorConfig[] clone(Arena arena, StdVideoAV1ColorConfig[] src) {
        StdVideoAV1ColorConfig[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$BitDepth = PathElement.groupElement("PATH$BitDepth");
    public static final PathElement PATH$subsampling_x = PathElement.groupElement("PATH$subsampling_x");
    public static final PathElement PATH$subsampling_y = PathElement.groupElement("PATH$subsampling_y");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$color_primaries = PathElement.groupElement("PATH$color_primaries");
    public static final PathElement PATH$transfer_characteristics = PathElement.groupElement("PATH$transfer_characteristics");
    public static final PathElement PATH$matrix_coefficients = PathElement.groupElement("PATH$matrix_coefficients");
    public static final PathElement PATH$chroma_sample_position = PathElement.groupElement("PATH$chroma_sample_position");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$BitDepth = LAYOUT$BitDepth.byteSize();
    public static final long SIZE$subsampling_x = LAYOUT$subsampling_x.byteSize();
    public static final long SIZE$subsampling_y = LAYOUT$subsampling_y.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$color_primaries = LAYOUT$color_primaries.byteSize();
    public static final long SIZE$transfer_characteristics = LAYOUT$transfer_characteristics.byteSize();
    public static final long SIZE$matrix_coefficients = LAYOUT$matrix_coefficients.byteSize();
    public static final long SIZE$chroma_sample_position = LAYOUT$chroma_sample_position.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$BitDepth = LAYOUT.byteOffset(PATH$BitDepth);
    public static final long OFFSET$subsampling_x = LAYOUT.byteOffset(PATH$subsampling_x);
    public static final long OFFSET$subsampling_y = LAYOUT.byteOffset(PATH$subsampling_y);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$color_primaries = LAYOUT.byteOffset(PATH$color_primaries);
    public static final long OFFSET$transfer_characteristics = LAYOUT.byteOffset(PATH$transfer_characteristics);
    public static final long OFFSET$matrix_coefficients = LAYOUT.byteOffset(PATH$matrix_coefficients);
    public static final long OFFSET$chroma_sample_position = LAYOUT.byteOffset(PATH$chroma_sample_position);

    public StdVideoAV1ColorConfigFlags flags() {
        return new StdVideoAV1ColorConfigFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoAV1ColorConfigFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte BitDepth() {
        return segment.get(LAYOUT$BitDepth, OFFSET$BitDepth);
    }

    public void BitDepth(@unsigned byte value) {
        segment.set(LAYOUT$BitDepth, OFFSET$BitDepth, value);
    }

    public @unsigned byte subsampling_x() {
        return segment.get(LAYOUT$subsampling_x, OFFSET$subsampling_x);
    }

    public void subsampling_x(@unsigned byte value) {
        segment.set(LAYOUT$subsampling_x, OFFSET$subsampling_x, value);
    }

    public @unsigned byte subsampling_y() {
        return segment.get(LAYOUT$subsampling_y, OFFSET$subsampling_y);
    }

    public void subsampling_y(@unsigned byte value) {
        segment.set(LAYOUT$subsampling_y, OFFSET$subsampling_y, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @enumtype(StdVideoAV1ColorPrimaries.class) int color_primaries() {
        return segment.get(LAYOUT$color_primaries, OFFSET$color_primaries);
    }

    public void color_primaries(@enumtype(StdVideoAV1ColorPrimaries.class) int value) {
        segment.set(LAYOUT$color_primaries, OFFSET$color_primaries, value);
    }

    public @enumtype(StdVideoAV1TransferCharacteristics.class) int transfer_characteristics() {
        return segment.get(LAYOUT$transfer_characteristics, OFFSET$transfer_characteristics);
    }

    public void transfer_characteristics(@enumtype(StdVideoAV1TransferCharacteristics.class) int value) {
        segment.set(LAYOUT$transfer_characteristics, OFFSET$transfer_characteristics, value);
    }

    public @enumtype(StdVideoAV1MatrixCoefficients.class) int matrix_coefficients() {
        return segment.get(LAYOUT$matrix_coefficients, OFFSET$matrix_coefficients);
    }

    public void matrix_coefficients(@enumtype(StdVideoAV1MatrixCoefficients.class) int value) {
        segment.set(LAYOUT$matrix_coefficients, OFFSET$matrix_coefficients, value);
    }

    public @enumtype(StdVideoAV1ChromaSamplePosition.class) int chroma_sample_position() {
        return segment.get(LAYOUT$chroma_sample_position, OFFSET$chroma_sample_position);
    }

    public void chroma_sample_position(@enumtype(StdVideoAV1ChromaSamplePosition.class) int value) {
        segment.set(LAYOUT$chroma_sample_position, OFFSET$chroma_sample_position, value);
    }

}
