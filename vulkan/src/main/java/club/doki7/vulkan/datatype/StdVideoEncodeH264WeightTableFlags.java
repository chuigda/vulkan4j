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

/// Represents a pointer to a {@code StdVideoEncodeH264WeightTableFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH264WeightTableFlags {
///     uint32_t luma_weight_l0_flag; // @link substring="luma_weight_l0_flag" target="#luma_weight_l0_flag"
///     uint32_t chroma_weight_l0_flag; // @link substring="chroma_weight_l0_flag" target="#chroma_weight_l0_flag"
///     uint32_t luma_weight_l1_flag; // @link substring="luma_weight_l1_flag" target="#luma_weight_l1_flag"
///     uint32_t chroma_weight_l1_flag; // @link substring="chroma_weight_l1_flag" target="#chroma_weight_l1_flag"
/// } StdVideoEncodeH264WeightTableFlags;
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
public record StdVideoEncodeH264WeightTableFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH264WeightTableFlags allocate(Arena arena) {
        return new StdVideoEncodeH264WeightTableFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264WeightTableFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264WeightTableFlags[] ret = new StdVideoEncodeH264WeightTableFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264WeightTableFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeH264WeightTableFlags clone(Arena arena, StdVideoEncodeH264WeightTableFlags src) {
        StdVideoEncodeH264WeightTableFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264WeightTableFlags[] clone(Arena arena, StdVideoEncodeH264WeightTableFlags[] src) {
        StdVideoEncodeH264WeightTableFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @unsigned int luma_weight_l0_flag() {
        return segment.get(LAYOUT$luma_weight_l0_flag, OFFSET$luma_weight_l0_flag);
    }

    public void luma_weight_l0_flag(@unsigned int value) {
        segment.set(LAYOUT$luma_weight_l0_flag, OFFSET$luma_weight_l0_flag, value);
    }

    public @unsigned int chroma_weight_l0_flag() {
        return segment.get(LAYOUT$chroma_weight_l0_flag, OFFSET$chroma_weight_l0_flag);
    }

    public void chroma_weight_l0_flag(@unsigned int value) {
        segment.set(LAYOUT$chroma_weight_l0_flag, OFFSET$chroma_weight_l0_flag, value);
    }

    public @unsigned int luma_weight_l1_flag() {
        return segment.get(LAYOUT$luma_weight_l1_flag, OFFSET$luma_weight_l1_flag);
    }

    public void luma_weight_l1_flag(@unsigned int value) {
        segment.set(LAYOUT$luma_weight_l1_flag, OFFSET$luma_weight_l1_flag, value);
    }

    public @unsigned int chroma_weight_l1_flag() {
        return segment.get(LAYOUT$chroma_weight_l1_flag, OFFSET$chroma_weight_l1_flag);
    }

    public void chroma_weight_l1_flag(@unsigned int value) {
        segment.set(LAYOUT$chroma_weight_l1_flag, OFFSET$chroma_weight_l1_flag, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("luma_weight_l0_flag"),
        ValueLayout.JAVA_INT.withName("chroma_weight_l0_flag"),
        ValueLayout.JAVA_INT.withName("luma_weight_l1_flag"),
        ValueLayout.JAVA_INT.withName("chroma_weight_l1_flag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$luma_weight_l0_flag = PathElement.groupElement("luma_weight_l0_flag");
    public static final PathElement PATH$chroma_weight_l0_flag = PathElement.groupElement("chroma_weight_l0_flag");
    public static final PathElement PATH$luma_weight_l1_flag = PathElement.groupElement("luma_weight_l1_flag");
    public static final PathElement PATH$chroma_weight_l1_flag = PathElement.groupElement("chroma_weight_l1_flag");

    public static final OfInt LAYOUT$luma_weight_l0_flag = (OfInt) LAYOUT.select(PATH$luma_weight_l0_flag);
    public static final OfInt LAYOUT$chroma_weight_l0_flag = (OfInt) LAYOUT.select(PATH$chroma_weight_l0_flag);
    public static final OfInt LAYOUT$luma_weight_l1_flag = (OfInt) LAYOUT.select(PATH$luma_weight_l1_flag);
    public static final OfInt LAYOUT$chroma_weight_l1_flag = (OfInt) LAYOUT.select(PATH$chroma_weight_l1_flag);

    public static final long SIZE$luma_weight_l0_flag = LAYOUT$luma_weight_l0_flag.byteSize();
    public static final long SIZE$chroma_weight_l0_flag = LAYOUT$chroma_weight_l0_flag.byteSize();
    public static final long SIZE$luma_weight_l1_flag = LAYOUT$luma_weight_l1_flag.byteSize();
    public static final long SIZE$chroma_weight_l1_flag = LAYOUT$chroma_weight_l1_flag.byteSize();

    public static final long OFFSET$luma_weight_l0_flag = LAYOUT.byteOffset(PATH$luma_weight_l0_flag);
    public static final long OFFSET$chroma_weight_l0_flag = LAYOUT.byteOffset(PATH$chroma_weight_l0_flag);
    public static final long OFFSET$luma_weight_l1_flag = LAYOUT.byteOffset(PATH$luma_weight_l1_flag);
    public static final long OFFSET$chroma_weight_l1_flag = LAYOUT.byteOffset(PATH$chroma_weight_l1_flag);
}
