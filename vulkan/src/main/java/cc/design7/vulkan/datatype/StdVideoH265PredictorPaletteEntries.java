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
public record StdVideoH265PredictorPaletteEntries(@NotNull MemorySegment segment) implements IPointer {
    public static final OfShort LAYOUT$PredictorPaletteEntries = ValueLayout.JAVA_SHORT.withName("PredictorPaletteEntries");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$PredictorPaletteEntries);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265PredictorPaletteEntries allocate(Arena arena) {
        return new StdVideoH265PredictorPaletteEntries(arena.allocate(LAYOUT));
    }

    public static StdVideoH265PredictorPaletteEntries[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265PredictorPaletteEntries[] ret = new StdVideoH265PredictorPaletteEntries[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265PredictorPaletteEntries(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265PredictorPaletteEntries clone(Arena arena, StdVideoH265PredictorPaletteEntries src) {
        StdVideoH265PredictorPaletteEntries ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265PredictorPaletteEntries[] clone(Arena arena, StdVideoH265PredictorPaletteEntries[] src) {
        StdVideoH265PredictorPaletteEntries[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$PredictorPaletteEntries = PathElement.groupElement("PATH$PredictorPaletteEntries");

    public static final long SIZE$PredictorPaletteEntries = LAYOUT$PredictorPaletteEntries.byteSize();

    public static final long OFFSET$PredictorPaletteEntries = LAYOUT.byteOffset(PATH$PredictorPaletteEntries);

    public @unsigned short PredictorPaletteEntries() {
        return segment.get(LAYOUT$PredictorPaletteEntries, OFFSET$PredictorPaletteEntries);
    }

    public void PredictorPaletteEntries(@unsigned short value) {
        segment.set(LAYOUT$PredictorPaletteEntries, OFFSET$PredictorPaletteEntries, value);
    }

}
