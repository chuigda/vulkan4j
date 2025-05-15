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

public record VkAabbPositionsKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfFloat LAYOUT$minX = ValueLayout.JAVA_FLOAT.withName("minX");
    public static final OfFloat LAYOUT$minY = ValueLayout.JAVA_FLOAT.withName("minY");
    public static final OfFloat LAYOUT$minZ = ValueLayout.JAVA_FLOAT.withName("minZ");
    public static final OfFloat LAYOUT$maxX = ValueLayout.JAVA_FLOAT.withName("maxX");
    public static final OfFloat LAYOUT$maxY = ValueLayout.JAVA_FLOAT.withName("maxY");
    public static final OfFloat LAYOUT$maxZ = ValueLayout.JAVA_FLOAT.withName("maxZ");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$minX, LAYOUT$minY, LAYOUT$minZ, LAYOUT$maxX, LAYOUT$maxY, LAYOUT$maxZ);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAabbPositionsKHR allocate(Arena arena) {
        return new VkAabbPositionsKHR(arena.allocate(LAYOUT));
    }

    public static VkAabbPositionsKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAabbPositionsKHR[] ret = new VkAabbPositionsKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAabbPositionsKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAabbPositionsKHR clone(Arena arena, VkAabbPositionsKHR src) {
        VkAabbPositionsKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAabbPositionsKHR[] clone(Arena arena, VkAabbPositionsKHR[] src) {
        VkAabbPositionsKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$minX = PathElement.groupElement("PATH$minX");
    public static final PathElement PATH$minY = PathElement.groupElement("PATH$minY");
    public static final PathElement PATH$minZ = PathElement.groupElement("PATH$minZ");
    public static final PathElement PATH$maxX = PathElement.groupElement("PATH$maxX");
    public static final PathElement PATH$maxY = PathElement.groupElement("PATH$maxY");
    public static final PathElement PATH$maxZ = PathElement.groupElement("PATH$maxZ");

    public static final long SIZE$minX = LAYOUT$minX.byteSize();
    public static final long SIZE$minY = LAYOUT$minY.byteSize();
    public static final long SIZE$minZ = LAYOUT$minZ.byteSize();
    public static final long SIZE$maxX = LAYOUT$maxX.byteSize();
    public static final long SIZE$maxY = LAYOUT$maxY.byteSize();
    public static final long SIZE$maxZ = LAYOUT$maxZ.byteSize();

    public static final long OFFSET$minX = LAYOUT.byteOffset(PATH$minX);
    public static final long OFFSET$minY = LAYOUT.byteOffset(PATH$minY);
    public static final long OFFSET$minZ = LAYOUT.byteOffset(PATH$minZ);
    public static final long OFFSET$maxX = LAYOUT.byteOffset(PATH$maxX);
    public static final long OFFSET$maxY = LAYOUT.byteOffset(PATH$maxY);
    public static final long OFFSET$maxZ = LAYOUT.byteOffset(PATH$maxZ);

    public float minX() {
        return segment.get(LAYOUT$minX, OFFSET$minX);
    }

    public void minX(float value) {
        segment.set(LAYOUT$minX, OFFSET$minX, value);
    }

    public float minY() {
        return segment.get(LAYOUT$minY, OFFSET$minY);
    }

    public void minY(float value) {
        segment.set(LAYOUT$minY, OFFSET$minY, value);
    }

    public float minZ() {
        return segment.get(LAYOUT$minZ, OFFSET$minZ);
    }

    public void minZ(float value) {
        segment.set(LAYOUT$minZ, OFFSET$minZ, value);
    }

    public float maxX() {
        return segment.get(LAYOUT$maxX, OFFSET$maxX);
    }

    public void maxX(float value) {
        segment.set(LAYOUT$maxX, OFFSET$maxX, value);
    }

    public float maxY() {
        return segment.get(LAYOUT$maxY, OFFSET$maxY);
    }

    public void maxY(float value) {
        segment.set(LAYOUT$maxY, OFFSET$maxY, value);
    }

    public float maxZ() {
        return segment.get(LAYOUT$maxZ, OFFSET$maxZ);
    }

    public void maxZ(float value) {
        segment.set(LAYOUT$maxZ, OFFSET$maxZ, value);
    }

}
/// dummy, not implemented yet
