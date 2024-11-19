package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkCommandBufferAllocateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkCommandPool commandPool;
///     VkCommandBufferLevel level;
///     uint32_t commandBufferCount;
/// } VkCommandBufferAllocateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCommandBufferAllocateInfo.html">VkCommandBufferAllocateInfo</a>
public record VkCommandBufferAllocateInfo(MemorySegment segment) implements IPointer {
    public VkCommandBufferAllocateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO);
    }

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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @Nullable VkCommandPool commandPool() {
        MemorySegment s = segment.get(LAYOUT$commandPool, OFFSET$commandPool);
        if (s.address() == 0) {
            return null;
        }
        return new VkCommandPool(s);
    }

    public void commandPool(@Nullable VkCommandPool value) {
        segment.set(
            LAYOUT$commandPool,
            OFFSET$commandPool,
            value != null ? value.segment() : MemorySegment.NULL
        );
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

    public static VkCommandBufferAllocateInfo allocate(Arena arena) {
        return new VkCommandBufferAllocateInfo(arena.allocate(LAYOUT));
    }

    public static VkCommandBufferAllocateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferAllocateInfo[] ret = new VkCommandBufferAllocateInfo[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("commandPool"),
        ValueLayout.JAVA_INT.withName("level"),
        ValueLayout.JAVA_INT.withName("commandBufferCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$commandPool = PathElement.groupElement("commandPool");
    public static final PathElement PATH$level = PathElement.groupElement("level");
    public static final PathElement PATH$commandBufferCount = PathElement.groupElement("commandBufferCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$commandPool = (AddressLayout) LAYOUT.select(PATH$commandPool);
    public static final OfInt LAYOUT$level = (OfInt) LAYOUT.select(PATH$level);
    public static final OfInt LAYOUT$commandBufferCount = (OfInt) LAYOUT.select(PATH$commandBufferCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$commandPool = LAYOUT.byteOffset(PATH$commandPool);
    public static final long OFFSET$level = LAYOUT.byteOffset(PATH$level);
    public static final long OFFSET$commandBufferCount = LAYOUT.byteOffset(PATH$commandBufferCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$commandPool = LAYOUT$commandPool.byteSize();
    public static final long SIZE$level = LAYOUT$level.byteSize();
    public static final long SIZE$commandBufferCount = LAYOUT$commandBufferCount.byteSize();
}
