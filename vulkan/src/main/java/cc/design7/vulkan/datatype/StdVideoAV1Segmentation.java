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

public record StdVideoAV1Segmentation(@NotNull MemorySegment segment) implements IPointer {
    public static final OfByte LAYOUT$FeatureEnabled = ValueLayout.JAVA_BYTE.withName("FeatureEnabled");
    public static final OfShort LAYOUT$FeatureData = ValueLayout.JAVA_SHORT.withName("FeatureData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$FeatureEnabled, LAYOUT$FeatureData);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoAV1Segmentation allocate(Arena arena) {
        return new StdVideoAV1Segmentation(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1Segmentation[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1Segmentation[] ret = new StdVideoAV1Segmentation[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1Segmentation(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoAV1Segmentation clone(Arena arena, StdVideoAV1Segmentation src) {
        StdVideoAV1Segmentation ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1Segmentation[] clone(Arena arena, StdVideoAV1Segmentation[] src) {
        StdVideoAV1Segmentation[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$FeatureEnabled = PathElement.groupElement("PATH$FeatureEnabled");
    public static final PathElement PATH$FeatureData = PathElement.groupElement("PATH$FeatureData");

    public static final long SIZE$FeatureEnabled = LAYOUT$FeatureEnabled.byteSize();
    public static final long SIZE$FeatureData = LAYOUT$FeatureData.byteSize();

    public static final long OFFSET$FeatureEnabled = LAYOUT.byteOffset(PATH$FeatureEnabled);
    public static final long OFFSET$FeatureData = LAYOUT.byteOffset(PATH$FeatureData);

    public @unsigned byte FeatureEnabled() {
        return segment.get(LAYOUT$FeatureEnabled, OFFSET$FeatureEnabled);
    }

    public void FeatureEnabled(@unsigned byte value) {
        segment.set(LAYOUT$FeatureEnabled, OFFSET$FeatureEnabled, value);
    }

    public short FeatureData() {
        return segment.get(LAYOUT$FeatureData, OFFSET$FeatureData);
    }

    public void FeatureData(short value) {
        segment.set(LAYOUT$FeatureData, OFFSET$FeatureData, value);
    }

}
/// dummy, not implemented yet
