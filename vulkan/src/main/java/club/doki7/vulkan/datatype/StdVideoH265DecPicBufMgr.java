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

/// Represents a pointer to a {@code StdVideoH265DecPicBufMgr} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265DecPicBufMgr {
///     uint32_t max_latency_increase_plus1; // @link substring="max_latency_increase_plus1" target="#max_latency_increase_plus1"
///     uint8_t max_dec_pic_buffering_minus1; // @link substring="max_dec_pic_buffering_minus1" target="#max_dec_pic_buffering_minus1"
///     uint8_t max_num_reorder_pics; // @link substring="max_num_reorder_pics" target="#max_num_reorder_pics"
/// } StdVideoH265DecPicBufMgr;
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
public record StdVideoH265DecPicBufMgr(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265DecPicBufMgr allocate(Arena arena) {
        StdVideoH265DecPicBufMgr ret = new StdVideoH265DecPicBufMgr(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH265DecPicBufMgr[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265DecPicBufMgr[] ret = new StdVideoH265DecPicBufMgr[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265DecPicBufMgr(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265DecPicBufMgr clone(Arena arena, StdVideoH265DecPicBufMgr src) {
        StdVideoH265DecPicBufMgr ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265DecPicBufMgr[] clone(Arena arena, StdVideoH265DecPicBufMgr[] src) {
        StdVideoH265DecPicBufMgr[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int max_latency_increase_plus1() {
        return segment.get(LAYOUT$max_latency_increase_plus1, OFFSET$max_latency_increase_plus1);
    }

    public void max_latency_increase_plus1(@unsigned int value) {
        segment.set(LAYOUT$max_latency_increase_plus1, OFFSET$max_latency_increase_plus1, value);
    }

    public @unsigned byte max_dec_pic_buffering_minus1() {
        return segment.get(LAYOUT$max_dec_pic_buffering_minus1, OFFSET$max_dec_pic_buffering_minus1);
    }

    public void max_dec_pic_buffering_minus1(@unsigned byte value) {
        segment.set(LAYOUT$max_dec_pic_buffering_minus1, OFFSET$max_dec_pic_buffering_minus1, value);
    }

    public @unsigned byte max_num_reorder_pics() {
        return segment.get(LAYOUT$max_num_reorder_pics, OFFSET$max_num_reorder_pics);
    }

    public void max_num_reorder_pics(@unsigned byte value) {
        segment.set(LAYOUT$max_num_reorder_pics, OFFSET$max_num_reorder_pics, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("max_latency_increase_plus1"),
        ValueLayout.JAVA_BYTE.withName("max_dec_pic_buffering_minus1"),
        ValueLayout.JAVA_BYTE.withName("max_num_reorder_pics")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$max_latency_increase_plus1 = PathElement.groupElement("PATH$max_latency_increase_plus1");
    public static final PathElement PATH$max_dec_pic_buffering_minus1 = PathElement.groupElement("PATH$max_dec_pic_buffering_minus1");
    public static final PathElement PATH$max_num_reorder_pics = PathElement.groupElement("PATH$max_num_reorder_pics");

    public static final OfInt LAYOUT$max_latency_increase_plus1 = (OfInt) LAYOUT.select(PATH$max_latency_increase_plus1);
    public static final OfByte LAYOUT$max_dec_pic_buffering_minus1 = (OfByte) LAYOUT.select(PATH$max_dec_pic_buffering_minus1);
    public static final OfByte LAYOUT$max_num_reorder_pics = (OfByte) LAYOUT.select(PATH$max_num_reorder_pics);

    public static final long SIZE$max_latency_increase_plus1 = LAYOUT$max_latency_increase_plus1.byteSize();
    public static final long SIZE$max_dec_pic_buffering_minus1 = LAYOUT$max_dec_pic_buffering_minus1.byteSize();
    public static final long SIZE$max_num_reorder_pics = LAYOUT$max_num_reorder_pics.byteSize();

    public static final long OFFSET$max_latency_increase_plus1 = LAYOUT.byteOffset(PATH$max_latency_increase_plus1);
    public static final long OFFSET$max_dec_pic_buffering_minus1 = LAYOUT.byteOffset(PATH$max_dec_pic_buffering_minus1);
    public static final long OFFSET$max_num_reorder_pics = LAYOUT.byteOffset(PATH$max_num_reorder_pics);
}
