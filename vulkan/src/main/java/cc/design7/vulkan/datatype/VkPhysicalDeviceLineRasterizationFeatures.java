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

public record VkPhysicalDeviceLineRasterizationFeatures(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$rectangularLines = ValueLayout.JAVA_INT.withName("rectangularLines");
    public static final OfInt LAYOUT$bresenhamLines = ValueLayout.JAVA_INT.withName("bresenhamLines");
    public static final OfInt LAYOUT$smoothLines = ValueLayout.JAVA_INT.withName("smoothLines");
    public static final OfInt LAYOUT$stippledRectangularLines = ValueLayout.JAVA_INT.withName("stippledRectangularLines");
    public static final OfInt LAYOUT$stippledBresenhamLines = ValueLayout.JAVA_INT.withName("stippledBresenhamLines");
    public static final OfInt LAYOUT$stippledSmoothLines = ValueLayout.JAVA_INT.withName("stippledSmoothLines");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$rectangularLines, LAYOUT$bresenhamLines, LAYOUT$smoothLines, LAYOUT$stippledRectangularLines, LAYOUT$stippledBresenhamLines, LAYOUT$stippledSmoothLines);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceLineRasterizationFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceLineRasterizationFeatures(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceLineRasterizationFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceLineRasterizationFeatures[] ret = new VkPhysicalDeviceLineRasterizationFeatures[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceLineRasterizationFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceLineRasterizationFeatures clone(Arena arena, VkPhysicalDeviceLineRasterizationFeatures src) {
        VkPhysicalDeviceLineRasterizationFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceLineRasterizationFeatures[] clone(Arena arena, VkPhysicalDeviceLineRasterizationFeatures[] src) {
        VkPhysicalDeviceLineRasterizationFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$rectangularLines = PathElement.groupElement("PATH$rectangularLines");
    public static final PathElement PATH$bresenhamLines = PathElement.groupElement("PATH$bresenhamLines");
    public static final PathElement PATH$smoothLines = PathElement.groupElement("PATH$smoothLines");
    public static final PathElement PATH$stippledRectangularLines = PathElement.groupElement("PATH$stippledRectangularLines");
    public static final PathElement PATH$stippledBresenhamLines = PathElement.groupElement("PATH$stippledBresenhamLines");
    public static final PathElement PATH$stippledSmoothLines = PathElement.groupElement("PATH$stippledSmoothLines");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$rectangularLines = LAYOUT$rectangularLines.byteSize();
    public static final long SIZE$bresenhamLines = LAYOUT$bresenhamLines.byteSize();
    public static final long SIZE$smoothLines = LAYOUT$smoothLines.byteSize();
    public static final long SIZE$stippledRectangularLines = LAYOUT$stippledRectangularLines.byteSize();
    public static final long SIZE$stippledBresenhamLines = LAYOUT$stippledBresenhamLines.byteSize();
    public static final long SIZE$stippledSmoothLines = LAYOUT$stippledSmoothLines.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$rectangularLines = LAYOUT.byteOffset(PATH$rectangularLines);
    public static final long OFFSET$bresenhamLines = LAYOUT.byteOffset(PATH$bresenhamLines);
    public static final long OFFSET$smoothLines = LAYOUT.byteOffset(PATH$smoothLines);
    public static final long OFFSET$stippledRectangularLines = LAYOUT.byteOffset(PATH$stippledRectangularLines);
    public static final long OFFSET$stippledBresenhamLines = LAYOUT.byteOffset(PATH$stippledBresenhamLines);
    public static final long OFFSET$stippledSmoothLines = LAYOUT.byteOffset(PATH$stippledSmoothLines);

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int rectangularLines() {
        return segment.get(LAYOUT$rectangularLines, OFFSET$rectangularLines);
    }

    public void rectangularLines(@unsigned int value) {
        segment.set(LAYOUT$rectangularLines, OFFSET$rectangularLines, value);
    }

    public @unsigned int bresenhamLines() {
        return segment.get(LAYOUT$bresenhamLines, OFFSET$bresenhamLines);
    }

    public void bresenhamLines(@unsigned int value) {
        segment.set(LAYOUT$bresenhamLines, OFFSET$bresenhamLines, value);
    }

    public @unsigned int smoothLines() {
        return segment.get(LAYOUT$smoothLines, OFFSET$smoothLines);
    }

    public void smoothLines(@unsigned int value) {
        segment.set(LAYOUT$smoothLines, OFFSET$smoothLines, value);
    }

    public @unsigned int stippledRectangularLines() {
        return segment.get(LAYOUT$stippledRectangularLines, OFFSET$stippledRectangularLines);
    }

    public void stippledRectangularLines(@unsigned int value) {
        segment.set(LAYOUT$stippledRectangularLines, OFFSET$stippledRectangularLines, value);
    }

    public @unsigned int stippledBresenhamLines() {
        return segment.get(LAYOUT$stippledBresenhamLines, OFFSET$stippledBresenhamLines);
    }

    public void stippledBresenhamLines(@unsigned int value) {
        segment.set(LAYOUT$stippledBresenhamLines, OFFSET$stippledBresenhamLines, value);
    }

    public @unsigned int stippledSmoothLines() {
        return segment.get(LAYOUT$stippledSmoothLines, OFFSET$stippledSmoothLines);
    }

    public void stippledSmoothLines(@unsigned int value) {
        segment.set(LAYOUT$stippledSmoothLines, OFFSET$stippledSmoothLines, value);
    }

}
/// dummy, not implemented yet
