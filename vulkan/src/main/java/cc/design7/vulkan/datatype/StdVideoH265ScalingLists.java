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

public record StdVideoH265ScalingLists(@NotNull MemorySegment segment) implements IPointer {
    public static final OfByte LAYOUT$ScalingList4x4 = ValueLayout.JAVA_BYTE.withName("ScalingList4x4");
    public static final OfByte LAYOUT$ScalingList8x8 = ValueLayout.JAVA_BYTE.withName("ScalingList8x8");
    public static final OfByte LAYOUT$ScalingList16x16 = ValueLayout.JAVA_BYTE.withName("ScalingList16x16");
    public static final OfByte LAYOUT$ScalingList32x32 = ValueLayout.JAVA_BYTE.withName("ScalingList32x32");
    public static final OfByte LAYOUT$ScalingListDCCoef16x16 = ValueLayout.JAVA_BYTE.withName("ScalingListDCCoef16x16");
    public static final OfByte LAYOUT$ScalingListDCCoef32x32 = ValueLayout.JAVA_BYTE.withName("ScalingListDCCoef32x32");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$ScalingList4x4, LAYOUT$ScalingList8x8, LAYOUT$ScalingList16x16, LAYOUT$ScalingList32x32, LAYOUT$ScalingListDCCoef16x16, LAYOUT$ScalingListDCCoef32x32);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265ScalingLists allocate(Arena arena) {
        return new StdVideoH265ScalingLists(arena.allocate(LAYOUT));
    }

    public static StdVideoH265ScalingLists[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265ScalingLists[] ret = new StdVideoH265ScalingLists[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265ScalingLists(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265ScalingLists clone(Arena arena, StdVideoH265ScalingLists src) {
        StdVideoH265ScalingLists ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265ScalingLists[] clone(Arena arena, StdVideoH265ScalingLists[] src) {
        StdVideoH265ScalingLists[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$ScalingList4x4 = PathElement.groupElement("PATH$ScalingList4x4");
    public static final PathElement PATH$ScalingList8x8 = PathElement.groupElement("PATH$ScalingList8x8");
    public static final PathElement PATH$ScalingList16x16 = PathElement.groupElement("PATH$ScalingList16x16");
    public static final PathElement PATH$ScalingList32x32 = PathElement.groupElement("PATH$ScalingList32x32");
    public static final PathElement PATH$ScalingListDCCoef16x16 = PathElement.groupElement("PATH$ScalingListDCCoef16x16");
    public static final PathElement PATH$ScalingListDCCoef32x32 = PathElement.groupElement("PATH$ScalingListDCCoef32x32");

    public static final long SIZE$ScalingList4x4 = LAYOUT$ScalingList4x4.byteSize();
    public static final long SIZE$ScalingList8x8 = LAYOUT$ScalingList8x8.byteSize();
    public static final long SIZE$ScalingList16x16 = LAYOUT$ScalingList16x16.byteSize();
    public static final long SIZE$ScalingList32x32 = LAYOUT$ScalingList32x32.byteSize();
    public static final long SIZE$ScalingListDCCoef16x16 = LAYOUT$ScalingListDCCoef16x16.byteSize();
    public static final long SIZE$ScalingListDCCoef32x32 = LAYOUT$ScalingListDCCoef32x32.byteSize();

    public static final long OFFSET$ScalingList4x4 = LAYOUT.byteOffset(PATH$ScalingList4x4);
    public static final long OFFSET$ScalingList8x8 = LAYOUT.byteOffset(PATH$ScalingList8x8);
    public static final long OFFSET$ScalingList16x16 = LAYOUT.byteOffset(PATH$ScalingList16x16);
    public static final long OFFSET$ScalingList32x32 = LAYOUT.byteOffset(PATH$ScalingList32x32);
    public static final long OFFSET$ScalingListDCCoef16x16 = LAYOUT.byteOffset(PATH$ScalingListDCCoef16x16);
    public static final long OFFSET$ScalingListDCCoef32x32 = LAYOUT.byteOffset(PATH$ScalingListDCCoef32x32);

    public @unsigned byte ScalingList4x4() {
        return segment.get(LAYOUT$ScalingList4x4, OFFSET$ScalingList4x4);
    }

    public void ScalingList4x4(@unsigned byte value) {
        segment.set(LAYOUT$ScalingList4x4, OFFSET$ScalingList4x4, value);
    }

    public @unsigned byte ScalingList8x8() {
        return segment.get(LAYOUT$ScalingList8x8, OFFSET$ScalingList8x8);
    }

    public void ScalingList8x8(@unsigned byte value) {
        segment.set(LAYOUT$ScalingList8x8, OFFSET$ScalingList8x8, value);
    }

    public @unsigned byte ScalingList16x16() {
        return segment.get(LAYOUT$ScalingList16x16, OFFSET$ScalingList16x16);
    }

    public void ScalingList16x16(@unsigned byte value) {
        segment.set(LAYOUT$ScalingList16x16, OFFSET$ScalingList16x16, value);
    }

    public @unsigned byte ScalingList32x32() {
        return segment.get(LAYOUT$ScalingList32x32, OFFSET$ScalingList32x32);
    }

    public void ScalingList32x32(@unsigned byte value) {
        segment.set(LAYOUT$ScalingList32x32, OFFSET$ScalingList32x32, value);
    }

    public @unsigned byte ScalingListDCCoef16x16() {
        return segment.get(LAYOUT$ScalingListDCCoef16x16, OFFSET$ScalingListDCCoef16x16);
    }

    public void ScalingListDCCoef16x16(@unsigned byte value) {
        segment.set(LAYOUT$ScalingListDCCoef16x16, OFFSET$ScalingListDCCoef16x16, value);
    }

    public @unsigned byte ScalingListDCCoef32x32() {
        return segment.get(LAYOUT$ScalingListDCCoef32x32, OFFSET$ScalingListDCCoef32x32);
    }

    public void ScalingListDCCoef32x32(@unsigned byte value) {
        segment.set(LAYOUT$ScalingListDCCoef32x32, OFFSET$ScalingListDCCoef32x32, value);
    }

}
/// dummy, not implemented yet
