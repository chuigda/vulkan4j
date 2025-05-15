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

public record VkPresentRegionKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$rectangleCount = ValueLayout.JAVA_INT.withName("rectangleCount");
    public static final AddressLayout LAYOUT$pRectangles = ValueLayout.ADDRESS.withTargetLayout(VkRectLayerKHR.LAYOUT).withName("pRectangles");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$rectangleCount, LAYOUT$pRectangles);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPresentRegionKHR allocate(Arena arena) {
        return new VkPresentRegionKHR(arena.allocate(LAYOUT));
    }

    public static VkPresentRegionKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentRegionKHR[] ret = new VkPresentRegionKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPresentRegionKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPresentRegionKHR clone(Arena arena, VkPresentRegionKHR src) {
        VkPresentRegionKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPresentRegionKHR[] clone(Arena arena, VkPresentRegionKHR[] src) {
        VkPresentRegionKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$rectangleCount = PathElement.groupElement("PATH$rectangleCount");
    public static final PathElement PATH$pRectangles = PathElement.groupElement("PATH$pRectangles");

    public static final long SIZE$rectangleCount = LAYOUT$rectangleCount.byteSize();
    public static final long SIZE$pRectangles = LAYOUT$pRectangles.byteSize();

    public static final long OFFSET$rectangleCount = LAYOUT.byteOffset(PATH$rectangleCount);
    public static final long OFFSET$pRectangles = LAYOUT.byteOffset(PATH$pRectangles);

    public @unsigned int rectangleCount() {
        return segment.get(LAYOUT$rectangleCount, OFFSET$rectangleCount);
    }

    public void rectangleCount(@unsigned int value) {
        segment.set(LAYOUT$rectangleCount, OFFSET$rectangleCount, value);
    }

    public @pointer(comment="VkRectLayerKHR*") MemorySegment pRectanglesRaw() {
        return segment.get(LAYOUT$pRectangles, OFFSET$pRectangles);
    }

    public void pRectanglesRaw(@pointer(comment="VkRectLayerKHR*") MemorySegment value) {
        segment.set(LAYOUT$pRectangles, OFFSET$pRectangles, value);
    }

    public @Nullable VkRectLayerKHR pRectangles() {
        MemorySegment s = pRectanglesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRectLayerKHR(s);
    }

    public void pRectangles(@Nullable VkRectLayerKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRectanglesRaw(s);
    }

    @unsafe public @Nullable VkRectLayerKHR[] pRectangles(int assumedCount) {
        MemorySegment s = pRectanglesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkRectLayerKHR.SIZE);
        VkRectLayerKHR[] ret = new VkRectLayerKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkRectLayerKHR(s.asSlice(i * VkRectLayerKHR.SIZE, VkRectLayerKHR.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
