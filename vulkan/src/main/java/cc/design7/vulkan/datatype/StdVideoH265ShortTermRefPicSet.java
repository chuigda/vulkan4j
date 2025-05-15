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

/// Represents a pointer to a {@code StdVideoH265ShortTermRefPicSet} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265ShortTermRefPicSet {
///     StdVideoH265ShortTermRefPicSetFlags flags;
///     uint32_t delta_idx_minus1;
///     uint16_t use_delta_flag;
///     uint16_t abs_delta_rps_minus1;
///     uint16_t used_by_curr_pic_flag;
///     uint16_t used_by_curr_pic_s0_flag;
///     uint16_t used_by_curr_pic_s1_flag;
///     uint16_t reserved1;
///     uint8_t reserved2;
///     uint8_t reserved3;
///     uint8_t num_negative_pics;
///     uint8_t num_positive_pics;
///     uint16_t delta_poc_s0_minus1;
///     uint16_t delta_poc_s1_minus1;
/// } StdVideoH265ShortTermRefPicSet;
/// }
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoH265ShortTermRefPicSet(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265ShortTermRefPicSet allocate(Arena arena) {
        StdVideoH265ShortTermRefPicSet ret = new StdVideoH265ShortTermRefPicSet(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH265ShortTermRefPicSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265ShortTermRefPicSet[] ret = new StdVideoH265ShortTermRefPicSet[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265ShortTermRefPicSet(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265ShortTermRefPicSet clone(Arena arena, StdVideoH265ShortTermRefPicSet src) {
        StdVideoH265ShortTermRefPicSet ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265ShortTermRefPicSet[] clone(Arena arena, StdVideoH265ShortTermRefPicSet[] src) {
        StdVideoH265ShortTermRefPicSet[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoH265ShortTermRefPicSetFlags flags() {
        return new StdVideoH265ShortTermRefPicSetFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoH265ShortTermRefPicSetFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned int delta_idx_minus1() {
        return segment.get(LAYOUT$delta_idx_minus1, OFFSET$delta_idx_minus1);
    }

    public void delta_idx_minus1(@unsigned int value) {
        segment.set(LAYOUT$delta_idx_minus1, OFFSET$delta_idx_minus1, value);
    }

    public @unsigned short use_delta_flag() {
        return segment.get(LAYOUT$use_delta_flag, OFFSET$use_delta_flag);
    }

    public void use_delta_flag(@unsigned short value) {
        segment.set(LAYOUT$use_delta_flag, OFFSET$use_delta_flag, value);
    }

    public @unsigned short abs_delta_rps_minus1() {
        return segment.get(LAYOUT$abs_delta_rps_minus1, OFFSET$abs_delta_rps_minus1);
    }

    public void abs_delta_rps_minus1(@unsigned short value) {
        segment.set(LAYOUT$abs_delta_rps_minus1, OFFSET$abs_delta_rps_minus1, value);
    }

    public @unsigned short used_by_curr_pic_flag() {
        return segment.get(LAYOUT$used_by_curr_pic_flag, OFFSET$used_by_curr_pic_flag);
    }

    public void used_by_curr_pic_flag(@unsigned short value) {
        segment.set(LAYOUT$used_by_curr_pic_flag, OFFSET$used_by_curr_pic_flag, value);
    }

    public @unsigned short used_by_curr_pic_s0_flag() {
        return segment.get(LAYOUT$used_by_curr_pic_s0_flag, OFFSET$used_by_curr_pic_s0_flag);
    }

    public void used_by_curr_pic_s0_flag(@unsigned short value) {
        segment.set(LAYOUT$used_by_curr_pic_s0_flag, OFFSET$used_by_curr_pic_s0_flag, value);
    }

    public @unsigned short used_by_curr_pic_s1_flag() {
        return segment.get(LAYOUT$used_by_curr_pic_s1_flag, OFFSET$used_by_curr_pic_s1_flag);
    }

    public void used_by_curr_pic_s1_flag(@unsigned short value) {
        segment.set(LAYOUT$used_by_curr_pic_s1_flag, OFFSET$used_by_curr_pic_s1_flag, value);
    }

    public @unsigned short reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned short value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @unsigned byte reserved2() {
        return segment.get(LAYOUT$reserved2, OFFSET$reserved2);
    }

    public void reserved2(@unsigned byte value) {
        segment.set(LAYOUT$reserved2, OFFSET$reserved2, value);
    }

    public @unsigned byte reserved3() {
        return segment.get(LAYOUT$reserved3, OFFSET$reserved3);
    }

    public void reserved3(@unsigned byte value) {
        segment.set(LAYOUT$reserved3, OFFSET$reserved3, value);
    }

    public @unsigned byte num_negative_pics() {
        return segment.get(LAYOUT$num_negative_pics, OFFSET$num_negative_pics);
    }

    public void num_negative_pics(@unsigned byte value) {
        segment.set(LAYOUT$num_negative_pics, OFFSET$num_negative_pics, value);
    }

    public @unsigned byte num_positive_pics() {
        return segment.get(LAYOUT$num_positive_pics, OFFSET$num_positive_pics);
    }

    public void num_positive_pics(@unsigned byte value) {
        segment.set(LAYOUT$num_positive_pics, OFFSET$num_positive_pics, value);
    }

    public @unsigned short delta_poc_s0_minus1() {
        return segment.get(LAYOUT$delta_poc_s0_minus1, OFFSET$delta_poc_s0_minus1);
    }

    public void delta_poc_s0_minus1(@unsigned short value) {
        segment.set(LAYOUT$delta_poc_s0_minus1, OFFSET$delta_poc_s0_minus1, value);
    }

    public @unsigned short delta_poc_s1_minus1() {
        return segment.get(LAYOUT$delta_poc_s1_minus1, OFFSET$delta_poc_s1_minus1);
    }

    public void delta_poc_s1_minus1(@unsigned short value) {
        segment.set(LAYOUT$delta_poc_s1_minus1, OFFSET$delta_poc_s1_minus1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoH265ShortTermRefPicSetFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("delta_idx_minus1"),
        ValueLayout.JAVA_SHORT.withName("use_delta_flag"),
        ValueLayout.JAVA_SHORT.withName("abs_delta_rps_minus1"),
        ValueLayout.JAVA_SHORT.withName("used_by_curr_pic_flag"),
        ValueLayout.JAVA_SHORT.withName("used_by_curr_pic_s0_flag"),
        ValueLayout.JAVA_SHORT.withName("used_by_curr_pic_s1_flag"),
        ValueLayout.JAVA_SHORT.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_BYTE.withName("reserved3"),
        ValueLayout.JAVA_BYTE.withName("num_negative_pics"),
        ValueLayout.JAVA_BYTE.withName("num_positive_pics"),
        ValueLayout.JAVA_SHORT.withName("delta_poc_s0_minus1"),
        ValueLayout.JAVA_SHORT.withName("delta_poc_s1_minus1")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$delta_idx_minus1 = PathElement.groupElement("PATH$delta_idx_minus1");
    public static final PathElement PATH$use_delta_flag = PathElement.groupElement("PATH$use_delta_flag");
    public static final PathElement PATH$abs_delta_rps_minus1 = PathElement.groupElement("PATH$abs_delta_rps_minus1");
    public static final PathElement PATH$used_by_curr_pic_flag = PathElement.groupElement("PATH$used_by_curr_pic_flag");
    public static final PathElement PATH$used_by_curr_pic_s0_flag = PathElement.groupElement("PATH$used_by_curr_pic_s0_flag");
    public static final PathElement PATH$used_by_curr_pic_s1_flag = PathElement.groupElement("PATH$used_by_curr_pic_s1_flag");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$reserved2 = PathElement.groupElement("PATH$reserved2");
    public static final PathElement PATH$reserved3 = PathElement.groupElement("PATH$reserved3");
    public static final PathElement PATH$num_negative_pics = PathElement.groupElement("PATH$num_negative_pics");
    public static final PathElement PATH$num_positive_pics = PathElement.groupElement("PATH$num_positive_pics");
    public static final PathElement PATH$delta_poc_s0_minus1 = PathElement.groupElement("PATH$delta_poc_s0_minus1");
    public static final PathElement PATH$delta_poc_s1_minus1 = PathElement.groupElement("PATH$delta_poc_s1_minus1");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$delta_idx_minus1 = (OfInt) LAYOUT.select(PATH$delta_idx_minus1);
    public static final OfShort LAYOUT$use_delta_flag = (OfShort) LAYOUT.select(PATH$use_delta_flag);
    public static final OfShort LAYOUT$abs_delta_rps_minus1 = (OfShort) LAYOUT.select(PATH$abs_delta_rps_minus1);
    public static final OfShort LAYOUT$used_by_curr_pic_flag = (OfShort) LAYOUT.select(PATH$used_by_curr_pic_flag);
    public static final OfShort LAYOUT$used_by_curr_pic_s0_flag = (OfShort) LAYOUT.select(PATH$used_by_curr_pic_s0_flag);
    public static final OfShort LAYOUT$used_by_curr_pic_s1_flag = (OfShort) LAYOUT.select(PATH$used_by_curr_pic_s1_flag);
    public static final OfShort LAYOUT$reserved1 = (OfShort) LAYOUT.select(PATH$reserved1);
    public static final OfByte LAYOUT$reserved2 = (OfByte) LAYOUT.select(PATH$reserved2);
    public static final OfByte LAYOUT$reserved3 = (OfByte) LAYOUT.select(PATH$reserved3);
    public static final OfByte LAYOUT$num_negative_pics = (OfByte) LAYOUT.select(PATH$num_negative_pics);
    public static final OfByte LAYOUT$num_positive_pics = (OfByte) LAYOUT.select(PATH$num_positive_pics);
    public static final OfShort LAYOUT$delta_poc_s0_minus1 = (OfShort) LAYOUT.select(PATH$delta_poc_s0_minus1);
    public static final OfShort LAYOUT$delta_poc_s1_minus1 = (OfShort) LAYOUT.select(PATH$delta_poc_s1_minus1);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$delta_idx_minus1 = LAYOUT$delta_idx_minus1.byteSize();
    public static final long SIZE$use_delta_flag = LAYOUT$use_delta_flag.byteSize();
    public static final long SIZE$abs_delta_rps_minus1 = LAYOUT$abs_delta_rps_minus1.byteSize();
    public static final long SIZE$used_by_curr_pic_flag = LAYOUT$used_by_curr_pic_flag.byteSize();
    public static final long SIZE$used_by_curr_pic_s0_flag = LAYOUT$used_by_curr_pic_s0_flag.byteSize();
    public static final long SIZE$used_by_curr_pic_s1_flag = LAYOUT$used_by_curr_pic_s1_flag.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$reserved2 = LAYOUT$reserved2.byteSize();
    public static final long SIZE$reserved3 = LAYOUT$reserved3.byteSize();
    public static final long SIZE$num_negative_pics = LAYOUT$num_negative_pics.byteSize();
    public static final long SIZE$num_positive_pics = LAYOUT$num_positive_pics.byteSize();
    public static final long SIZE$delta_poc_s0_minus1 = LAYOUT$delta_poc_s0_minus1.byteSize();
    public static final long SIZE$delta_poc_s1_minus1 = LAYOUT$delta_poc_s1_minus1.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$delta_idx_minus1 = LAYOUT.byteOffset(PATH$delta_idx_minus1);
    public static final long OFFSET$use_delta_flag = LAYOUT.byteOffset(PATH$use_delta_flag);
    public static final long OFFSET$abs_delta_rps_minus1 = LAYOUT.byteOffset(PATH$abs_delta_rps_minus1);
    public static final long OFFSET$used_by_curr_pic_flag = LAYOUT.byteOffset(PATH$used_by_curr_pic_flag);
    public static final long OFFSET$used_by_curr_pic_s0_flag = LAYOUT.byteOffset(PATH$used_by_curr_pic_s0_flag);
    public static final long OFFSET$used_by_curr_pic_s1_flag = LAYOUT.byteOffset(PATH$used_by_curr_pic_s1_flag);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$reserved2 = LAYOUT.byteOffset(PATH$reserved2);
    public static final long OFFSET$reserved3 = LAYOUT.byteOffset(PATH$reserved3);
    public static final long OFFSET$num_negative_pics = LAYOUT.byteOffset(PATH$num_negative_pics);
    public static final long OFFSET$num_positive_pics = LAYOUT.byteOffset(PATH$num_positive_pics);
    public static final long OFFSET$delta_poc_s0_minus1 = LAYOUT.byteOffset(PATH$delta_poc_s0_minus1);
    public static final long OFFSET$delta_poc_s1_minus1 = LAYOUT.byteOffset(PATH$delta_poc_s1_minus1);
}
