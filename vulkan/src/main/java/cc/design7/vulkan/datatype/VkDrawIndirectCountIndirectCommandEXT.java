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

public record VkDrawIndirectCountIndirectCommandEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$bufferAddress = ValueLayout.JAVA_LONG.withName("bufferAddress");
    public static final OfInt LAYOUT$stride = ValueLayout.JAVA_INT.withName("stride");
    public static final OfInt LAYOUT$commandCount = ValueLayout.JAVA_INT.withName("commandCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$bufferAddress, LAYOUT$stride, LAYOUT$commandCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDrawIndirectCountIndirectCommandEXT allocate(Arena arena) {
        return new VkDrawIndirectCountIndirectCommandEXT(arena.allocate(LAYOUT));
    }

    public static VkDrawIndirectCountIndirectCommandEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrawIndirectCountIndirectCommandEXT[] ret = new VkDrawIndirectCountIndirectCommandEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDrawIndirectCountIndirectCommandEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDrawIndirectCountIndirectCommandEXT clone(Arena arena, VkDrawIndirectCountIndirectCommandEXT src) {
        VkDrawIndirectCountIndirectCommandEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDrawIndirectCountIndirectCommandEXT[] clone(Arena arena, VkDrawIndirectCountIndirectCommandEXT[] src) {
        VkDrawIndirectCountIndirectCommandEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bufferAddress = PathElement.groupElement("PATH$bufferAddress");
    public static final PathElement PATH$stride = PathElement.groupElement("PATH$stride");
    public static final PathElement PATH$commandCount = PathElement.groupElement("PATH$commandCount");

    public static final long SIZE$bufferAddress = LAYOUT$bufferAddress.byteSize();
    public static final long SIZE$stride = LAYOUT$stride.byteSize();
    public static final long SIZE$commandCount = LAYOUT$commandCount.byteSize();

    public static final long OFFSET$bufferAddress = LAYOUT.byteOffset(PATH$bufferAddress);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$commandCount = LAYOUT.byteOffset(PATH$commandCount);

    public @unsigned long bufferAddress() {
        return segment.get(LAYOUT$bufferAddress, OFFSET$bufferAddress);
    }

    public void bufferAddress(@unsigned long value) {
        segment.set(LAYOUT$bufferAddress, OFFSET$bufferAddress, value);
    }

    public @unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public @unsigned int commandCount() {
        return segment.get(LAYOUT$commandCount, OFFSET$commandCount);
    }

    public void commandCount(@unsigned int value) {
        segment.set(LAYOUT$commandCount, OFFSET$commandCount, value);
    }

}
/// dummy, not implemented yet
