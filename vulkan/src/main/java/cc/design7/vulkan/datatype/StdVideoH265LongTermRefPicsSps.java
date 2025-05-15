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

/// Represents a pointer to a {@code StdVideoH265LongTermRefPicsSps} structure in native memory.
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
public record StdVideoH265LongTermRefPicsSps(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265LongTermRefPicsSps allocate(Arena arena) {
        return new StdVideoH265LongTermRefPicsSps(arena.allocate(LAYOUT));
    }

    public static StdVideoH265LongTermRefPicsSps[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265LongTermRefPicsSps[] ret = new StdVideoH265LongTermRefPicsSps[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265LongTermRefPicsSps(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265LongTermRefPicsSps clone(Arena arena, StdVideoH265LongTermRefPicsSps src) {
        StdVideoH265LongTermRefPicsSps ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265LongTermRefPicsSps[] clone(Arena arena, StdVideoH265LongTermRefPicsSps[] src) {
        StdVideoH265LongTermRefPicsSps[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("used_by_curr_pic_lt_sps_flag"),
        ValueLayout.JAVA_INT.withName("lt_ref_pic_poc_lsb_sps")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$used_by_curr_pic_lt_sps_flag = PathElement.groupElement("PATH$used_by_curr_pic_lt_sps_flag");
    public static final PathElement PATH$lt_ref_pic_poc_lsb_sps = PathElement.groupElement("PATH$lt_ref_pic_poc_lsb_sps");

    public static final OfInt LAYOUT$used_by_curr_pic_lt_sps_flag = (OfInt) LAYOUT.select(PATH$used_by_curr_pic_lt_sps_flag);
    public static final OfInt LAYOUT$lt_ref_pic_poc_lsb_sps = (OfInt) LAYOUT.select(PATH$lt_ref_pic_poc_lsb_sps);

    public static final long SIZE$used_by_curr_pic_lt_sps_flag = LAYOUT$used_by_curr_pic_lt_sps_flag.byteSize();
    public static final long SIZE$lt_ref_pic_poc_lsb_sps = LAYOUT$lt_ref_pic_poc_lsb_sps.byteSize();

    public static final long OFFSET$used_by_curr_pic_lt_sps_flag = LAYOUT.byteOffset(PATH$used_by_curr_pic_lt_sps_flag);
    public static final long OFFSET$lt_ref_pic_poc_lsb_sps = LAYOUT.byteOffset(PATH$lt_ref_pic_poc_lsb_sps);

    public @unsigned int used_by_curr_pic_lt_sps_flag() {
        return segment.get(LAYOUT$used_by_curr_pic_lt_sps_flag, OFFSET$used_by_curr_pic_lt_sps_flag);
    }

    public void used_by_curr_pic_lt_sps_flag(@unsigned int value) {
        segment.set(LAYOUT$used_by_curr_pic_lt_sps_flag, OFFSET$used_by_curr_pic_lt_sps_flag, value);
    }

    public @unsigned int lt_ref_pic_poc_lsb_sps() {
        return segment.get(LAYOUT$lt_ref_pic_poc_lsb_sps, OFFSET$lt_ref_pic_poc_lsb_sps);
    }

    public void lt_ref_pic_poc_lsb_sps(@unsigned int value) {
        segment.set(LAYOUT$lt_ref_pic_poc_lsb_sps, OFFSET$lt_ref_pic_poc_lsb_sps, value);
    }

}
