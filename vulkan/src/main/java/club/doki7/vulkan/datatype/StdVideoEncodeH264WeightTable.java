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

/// Represents a pointer to a {@code StdVideoEncodeH264WeightTable} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH264WeightTable {
///     StdVideoEncodeH264WeightTableFlags flags; // @link substring="StdVideoEncodeH264WeightTableFlags" target="StdVideoEncodeH264WeightTableFlags" @link substring="flags" target="#flags"
///     uint8_t luma_log2_weight_denom; // @link substring="luma_log2_weight_denom" target="#luma_log2_weight_denom"
///     uint8_t chroma_log2_weight_denom; // @link substring="chroma_log2_weight_denom" target="#chroma_log2_weight_denom"
///     int8_t luma_weight_l0; // @link substring="luma_weight_l0" target="#luma_weight_l0"
///     int8_t luma_offset_l0; // @link substring="luma_offset_l0" target="#luma_offset_l0"
///     int8_t chroma_weight_l0; // @link substring="chroma_weight_l0" target="#chroma_weight_l0"
///     int8_t chroma_offset_l0; // @link substring="chroma_offset_l0" target="#chroma_offset_l0"
///     int8_t luma_weight_l1; // @link substring="luma_weight_l1" target="#luma_weight_l1"
///     int8_t luma_offset_l1; // @link substring="luma_offset_l1" target="#luma_offset_l1"
///     int8_t chroma_weight_l1; // @link substring="chroma_weight_l1" target="#chroma_weight_l1"
///     int8_t chroma_offset_l1; // @link substring="chroma_offset_l1" target="#chroma_offset_l1"
/// } StdVideoEncodeH264WeightTable;
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
public record StdVideoEncodeH264WeightTable(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH264WeightTable allocate(Arena arena) {
        return new StdVideoEncodeH264WeightTable(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH264WeightTable[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264WeightTable[] ret = new StdVideoEncodeH264WeightTable[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264WeightTable(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeH264WeightTable clone(Arena arena, StdVideoEncodeH264WeightTable src) {
        StdVideoEncodeH264WeightTable ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264WeightTable[] clone(Arena arena, StdVideoEncodeH264WeightTable[] src) {
        StdVideoEncodeH264WeightTable[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @NotNull StdVideoEncodeH264WeightTableFlags flags() {
        return new StdVideoEncodeH264WeightTableFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoEncodeH264WeightTableFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte luma_log2_weight_denom() {
        return segment.get(LAYOUT$luma_log2_weight_denom, OFFSET$luma_log2_weight_denom);
    }

    public void luma_log2_weight_denom(@unsigned byte value) {
        segment.set(LAYOUT$luma_log2_weight_denom, OFFSET$luma_log2_weight_denom, value);
    }

    public @unsigned byte chroma_log2_weight_denom() {
        return segment.get(LAYOUT$chroma_log2_weight_denom, OFFSET$chroma_log2_weight_denom);
    }

    public void chroma_log2_weight_denom(@unsigned byte value) {
        segment.set(LAYOUT$chroma_log2_weight_denom, OFFSET$chroma_log2_weight_denom, value);
    }

    public byte luma_weight_l0() {
        return segment.get(LAYOUT$luma_weight_l0, OFFSET$luma_weight_l0);
    }

    public void luma_weight_l0(byte value) {
        segment.set(LAYOUT$luma_weight_l0, OFFSET$luma_weight_l0, value);
    }

    public byte luma_offset_l0() {
        return segment.get(LAYOUT$luma_offset_l0, OFFSET$luma_offset_l0);
    }

    public void luma_offset_l0(byte value) {
        segment.set(LAYOUT$luma_offset_l0, OFFSET$luma_offset_l0, value);
    }

    public byte chroma_weight_l0() {
        return segment.get(LAYOUT$chroma_weight_l0, OFFSET$chroma_weight_l0);
    }

    public void chroma_weight_l0(byte value) {
        segment.set(LAYOUT$chroma_weight_l0, OFFSET$chroma_weight_l0, value);
    }

    public byte chroma_offset_l0() {
        return segment.get(LAYOUT$chroma_offset_l0, OFFSET$chroma_offset_l0);
    }

    public void chroma_offset_l0(byte value) {
        segment.set(LAYOUT$chroma_offset_l0, OFFSET$chroma_offset_l0, value);
    }

    public byte luma_weight_l1() {
        return segment.get(LAYOUT$luma_weight_l1, OFFSET$luma_weight_l1);
    }

    public void luma_weight_l1(byte value) {
        segment.set(LAYOUT$luma_weight_l1, OFFSET$luma_weight_l1, value);
    }

    public byte luma_offset_l1() {
        return segment.get(LAYOUT$luma_offset_l1, OFFSET$luma_offset_l1);
    }

    public void luma_offset_l1(byte value) {
        segment.set(LAYOUT$luma_offset_l1, OFFSET$luma_offset_l1, value);
    }

    public byte chroma_weight_l1() {
        return segment.get(LAYOUT$chroma_weight_l1, OFFSET$chroma_weight_l1);
    }

    public void chroma_weight_l1(byte value) {
        segment.set(LAYOUT$chroma_weight_l1, OFFSET$chroma_weight_l1, value);
    }

    public byte chroma_offset_l1() {
        return segment.get(LAYOUT$chroma_offset_l1, OFFSET$chroma_offset_l1);
    }

    public void chroma_offset_l1(byte value) {
        segment.set(LAYOUT$chroma_offset_l1, OFFSET$chroma_offset_l1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeH264WeightTableFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("luma_log2_weight_denom"),
        ValueLayout.JAVA_BYTE.withName("chroma_log2_weight_denom"),
        ValueLayout.JAVA_BYTE.withName("luma_weight_l0"),
        ValueLayout.JAVA_BYTE.withName("luma_offset_l0"),
        ValueLayout.JAVA_BYTE.withName("chroma_weight_l0"),
        ValueLayout.JAVA_BYTE.withName("chroma_offset_l0"),
        ValueLayout.JAVA_BYTE.withName("luma_weight_l1"),
        ValueLayout.JAVA_BYTE.withName("luma_offset_l1"),
        ValueLayout.JAVA_BYTE.withName("chroma_weight_l1"),
        ValueLayout.JAVA_BYTE.withName("chroma_offset_l1")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$luma_log2_weight_denom = PathElement.groupElement("luma_log2_weight_denom");
    public static final PathElement PATH$chroma_log2_weight_denom = PathElement.groupElement("chroma_log2_weight_denom");
    public static final PathElement PATH$luma_weight_l0 = PathElement.groupElement("luma_weight_l0");
    public static final PathElement PATH$luma_offset_l0 = PathElement.groupElement("luma_offset_l0");
    public static final PathElement PATH$chroma_weight_l0 = PathElement.groupElement("chroma_weight_l0");
    public static final PathElement PATH$chroma_offset_l0 = PathElement.groupElement("chroma_offset_l0");
    public static final PathElement PATH$luma_weight_l1 = PathElement.groupElement("luma_weight_l1");
    public static final PathElement PATH$luma_offset_l1 = PathElement.groupElement("luma_offset_l1");
    public static final PathElement PATH$chroma_weight_l1 = PathElement.groupElement("chroma_weight_l1");
    public static final PathElement PATH$chroma_offset_l1 = PathElement.groupElement("chroma_offset_l1");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$luma_log2_weight_denom = (OfByte) LAYOUT.select(PATH$luma_log2_weight_denom);
    public static final OfByte LAYOUT$chroma_log2_weight_denom = (OfByte) LAYOUT.select(PATH$chroma_log2_weight_denom);
    public static final OfByte LAYOUT$luma_weight_l0 = (OfByte) LAYOUT.select(PATH$luma_weight_l0);
    public static final OfByte LAYOUT$luma_offset_l0 = (OfByte) LAYOUT.select(PATH$luma_offset_l0);
    public static final OfByte LAYOUT$chroma_weight_l0 = (OfByte) LAYOUT.select(PATH$chroma_weight_l0);
    public static final OfByte LAYOUT$chroma_offset_l0 = (OfByte) LAYOUT.select(PATH$chroma_offset_l0);
    public static final OfByte LAYOUT$luma_weight_l1 = (OfByte) LAYOUT.select(PATH$luma_weight_l1);
    public static final OfByte LAYOUT$luma_offset_l1 = (OfByte) LAYOUT.select(PATH$luma_offset_l1);
    public static final OfByte LAYOUT$chroma_weight_l1 = (OfByte) LAYOUT.select(PATH$chroma_weight_l1);
    public static final OfByte LAYOUT$chroma_offset_l1 = (OfByte) LAYOUT.select(PATH$chroma_offset_l1);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$luma_log2_weight_denom = LAYOUT$luma_log2_weight_denom.byteSize();
    public static final long SIZE$chroma_log2_weight_denom = LAYOUT$chroma_log2_weight_denom.byteSize();
    public static final long SIZE$luma_weight_l0 = LAYOUT$luma_weight_l0.byteSize();
    public static final long SIZE$luma_offset_l0 = LAYOUT$luma_offset_l0.byteSize();
    public static final long SIZE$chroma_weight_l0 = LAYOUT$chroma_weight_l0.byteSize();
    public static final long SIZE$chroma_offset_l0 = LAYOUT$chroma_offset_l0.byteSize();
    public static final long SIZE$luma_weight_l1 = LAYOUT$luma_weight_l1.byteSize();
    public static final long SIZE$luma_offset_l1 = LAYOUT$luma_offset_l1.byteSize();
    public static final long SIZE$chroma_weight_l1 = LAYOUT$chroma_weight_l1.byteSize();
    public static final long SIZE$chroma_offset_l1 = LAYOUT$chroma_offset_l1.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$luma_log2_weight_denom = LAYOUT.byteOffset(PATH$luma_log2_weight_denom);
    public static final long OFFSET$chroma_log2_weight_denom = LAYOUT.byteOffset(PATH$chroma_log2_weight_denom);
    public static final long OFFSET$luma_weight_l0 = LAYOUT.byteOffset(PATH$luma_weight_l0);
    public static final long OFFSET$luma_offset_l0 = LAYOUT.byteOffset(PATH$luma_offset_l0);
    public static final long OFFSET$chroma_weight_l0 = LAYOUT.byteOffset(PATH$chroma_weight_l0);
    public static final long OFFSET$chroma_offset_l0 = LAYOUT.byteOffset(PATH$chroma_offset_l0);
    public static final long OFFSET$luma_weight_l1 = LAYOUT.byteOffset(PATH$luma_weight_l1);
    public static final long OFFSET$luma_offset_l1 = LAYOUT.byteOffset(PATH$luma_offset_l1);
    public static final long OFFSET$chroma_weight_l1 = LAYOUT.byteOffset(PATH$chroma_weight_l1);
    public static final long OFFSET$chroma_offset_l1 = LAYOUT.byteOffset(PATH$chroma_offset_l1);
}
