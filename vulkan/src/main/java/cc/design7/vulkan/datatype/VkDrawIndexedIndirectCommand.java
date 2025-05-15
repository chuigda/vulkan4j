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

public record VkDrawIndexedIndirectCommand(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$indexCount = ValueLayout.JAVA_INT.withName("indexCount");
    public static final OfInt LAYOUT$instanceCount = ValueLayout.JAVA_INT.withName("instanceCount");
    public static final OfInt LAYOUT$firstIndex = ValueLayout.JAVA_INT.withName("firstIndex");
    public static final OfInt LAYOUT$vertexOffset = ValueLayout.JAVA_INT.withName("vertexOffset");
    public static final OfInt LAYOUT$firstInstance = ValueLayout.JAVA_INT.withName("firstInstance");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$indexCount, LAYOUT$instanceCount, LAYOUT$firstIndex, LAYOUT$vertexOffset, LAYOUT$firstInstance);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDrawIndexedIndirectCommand allocate(Arena arena) {
        return new VkDrawIndexedIndirectCommand(arena.allocate(LAYOUT));
    }

    public static VkDrawIndexedIndirectCommand[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDrawIndexedIndirectCommand[] ret = new VkDrawIndexedIndirectCommand[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDrawIndexedIndirectCommand(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDrawIndexedIndirectCommand clone(Arena arena, VkDrawIndexedIndirectCommand src) {
        VkDrawIndexedIndirectCommand ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDrawIndexedIndirectCommand[] clone(Arena arena, VkDrawIndexedIndirectCommand[] src) {
        VkDrawIndexedIndirectCommand[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$indexCount = PathElement.groupElement("PATH$indexCount");
    public static final PathElement PATH$instanceCount = PathElement.groupElement("PATH$instanceCount");
    public static final PathElement PATH$firstIndex = PathElement.groupElement("PATH$firstIndex");
    public static final PathElement PATH$vertexOffset = PathElement.groupElement("PATH$vertexOffset");
    public static final PathElement PATH$firstInstance = PathElement.groupElement("PATH$firstInstance");

    public static final long SIZE$indexCount = LAYOUT$indexCount.byteSize();
    public static final long SIZE$instanceCount = LAYOUT$instanceCount.byteSize();
    public static final long SIZE$firstIndex = LAYOUT$firstIndex.byteSize();
    public static final long SIZE$vertexOffset = LAYOUT$vertexOffset.byteSize();
    public static final long SIZE$firstInstance = LAYOUT$firstInstance.byteSize();

    public static final long OFFSET$indexCount = LAYOUT.byteOffset(PATH$indexCount);
    public static final long OFFSET$instanceCount = LAYOUT.byteOffset(PATH$instanceCount);
    public static final long OFFSET$firstIndex = LAYOUT.byteOffset(PATH$firstIndex);
    public static final long OFFSET$vertexOffset = LAYOUT.byteOffset(PATH$vertexOffset);
    public static final long OFFSET$firstInstance = LAYOUT.byteOffset(PATH$firstInstance);

    public @unsigned int indexCount() {
        return segment.get(LAYOUT$indexCount, OFFSET$indexCount);
    }

    public void indexCount(@unsigned int value) {
        segment.set(LAYOUT$indexCount, OFFSET$indexCount, value);
    }

    public @unsigned int instanceCount() {
        return segment.get(LAYOUT$instanceCount, OFFSET$instanceCount);
    }

    public void instanceCount(@unsigned int value) {
        segment.set(LAYOUT$instanceCount, OFFSET$instanceCount, value);
    }

    public @unsigned int firstIndex() {
        return segment.get(LAYOUT$firstIndex, OFFSET$firstIndex);
    }

    public void firstIndex(@unsigned int value) {
        segment.set(LAYOUT$firstIndex, OFFSET$firstIndex, value);
    }

    public int vertexOffset() {
        return segment.get(LAYOUT$vertexOffset, OFFSET$vertexOffset);
    }

    public void vertexOffset(int value) {
        segment.set(LAYOUT$vertexOffset, OFFSET$vertexOffset, value);
    }

    public @unsigned int firstInstance() {
        return segment.get(LAYOUT$firstInstance, OFFSET$firstInstance);
    }

    public void firstInstance(@unsigned int value) {
        segment.set(LAYOUT$firstInstance, OFFSET$firstInstance, value);
    }

}
/// dummy, not implemented yet
