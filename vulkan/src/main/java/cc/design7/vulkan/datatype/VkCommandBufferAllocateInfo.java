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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferAllocateInfo.html">VkCommandBufferAllocateInfo</a>
@ValueBasedCandidate
public record VkCommandBufferAllocateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$commandPool = ValueLayout.ADDRESS.withName("commandPool");
    public static final OfInt LAYOUT$level = ValueLayout.JAVA_INT.withName("level");
    public static final OfInt LAYOUT$commandBufferCount = ValueLayout.JAVA_INT.withName("commandBufferCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$commandPool, LAYOUT$level, LAYOUT$commandBufferCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCommandBufferAllocateInfo allocate(Arena arena) {
        return new VkCommandBufferAllocateInfo(arena.allocate(LAYOUT));
    }

    public static VkCommandBufferAllocateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferAllocateInfo[] ret = new VkCommandBufferAllocateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCommandBufferAllocateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCommandBufferAllocateInfo clone(Arena arena, VkCommandBufferAllocateInfo src) {
        VkCommandBufferAllocateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCommandBufferAllocateInfo[] clone(Arena arena, VkCommandBufferAllocateInfo[] src) {
        VkCommandBufferAllocateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$commandPool = PathElement.groupElement("PATH$commandPool");
    public static final PathElement PATH$level = PathElement.groupElement("PATH$level");
    public static final PathElement PATH$commandBufferCount = PathElement.groupElement("PATH$commandBufferCount");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$commandPool = LAYOUT$commandPool.byteSize();
    public static final long SIZE$level = LAYOUT$level.byteSize();
    public static final long SIZE$commandBufferCount = LAYOUT$commandBufferCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$commandPool = LAYOUT.byteOffset(PATH$commandPool);
    public static final long OFFSET$level = LAYOUT.byteOffset(PATH$level);
    public static final long OFFSET$commandBufferCount = LAYOUT.byteOffset(PATH$commandBufferCount);

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

    public @Nullable VkCommandPool commandPool() {
        MemorySegment s = segment.asSlice(OFFSET$commandPool, SIZE$commandPool);
        if (s.address() == 0) {
            return null;
        }
        return new VkCommandPool(s);
    }

    public void commandPool(@Nullable VkCommandPool value) {
        segment.set(LAYOUT$commandPool, OFFSET$commandPool, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkCommandBufferLevel.class) int level() {
        return segment.get(LAYOUT$level, OFFSET$level);
    }

    public void level(@enumtype(VkCommandBufferLevel.class) int value) {
        segment.set(LAYOUT$level, OFFSET$level, value);
    }

    public @unsigned int commandBufferCount() {
        return segment.get(LAYOUT$commandBufferCount, OFFSET$commandBufferCount);
    }

    public void commandBufferCount(@unsigned int value) {
        segment.set(LAYOUT$commandBufferCount, OFFSET$commandBufferCount, value);
    }

}
