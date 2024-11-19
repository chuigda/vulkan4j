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
/// typedef struct VkBindImageMemoryInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkImage image;
///     VkDeviceMemory memory;
///     VkDeviceSize memoryOffset;
/// } VkBindImageMemoryInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkBindImageMemoryInfo.html">VkBindImageMemoryInfo</a>
public record VkBindImageMemoryInfo(MemorySegment segment) implements IPointer {
    public VkBindImageMemoryInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_INFO);
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

    public @Nullable VkImage image() {
        MemorySegment s = segment.get(LAYOUT$image, OFFSET$image);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void image(@Nullable VkImage value) {
        segment.set(
            LAYOUT$image,
            OFFSET$image,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @Nullable VkDeviceMemory memory() {
        MemorySegment s = segment.get(LAYOUT$memory, OFFSET$memory);
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory(s);
    }

    public void memory(@Nullable VkDeviceMemory value) {
        segment.set(
            LAYOUT$memory,
            OFFSET$memory,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned long memoryOffset() {
        return segment.get(LAYOUT$memoryOffset, OFFSET$memoryOffset);
    }

    public void memoryOffset(@unsigned long value) {
        segment.set(LAYOUT$memoryOffset, OFFSET$memoryOffset, value);
    }

    public static VkBindImageMemoryInfo allocate(Arena arena) {
        return new VkBindImageMemoryInfo(arena.allocate(LAYOUT));
    }

    public static VkBindImageMemoryInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindImageMemoryInfo[] ret = new VkBindImageMemoryInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindImageMemoryInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindImageMemoryInfo clone(Arena arena, VkBindImageMemoryInfo src) {
        VkBindImageMemoryInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindImageMemoryInfo[] clone(Arena arena, VkBindImageMemoryInfo[] src) {
        VkBindImageMemoryInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.JAVA_LONG.withName("memoryOffset")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$image = PathElement.groupElement("image");
    public static final PathElement PATH$memory = PathElement.groupElement("memory");
    public static final PathElement PATH$memoryOffset = PathElement.groupElement("memoryOffset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final AddressLayout LAYOUT$memory = (AddressLayout) LAYOUT.select(PATH$memory);
    public static final OfLong LAYOUT$memoryOffset = (OfLong) LAYOUT.select(PATH$memoryOffset);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);
    public static final long OFFSET$memoryOffset = LAYOUT.byteOffset(PATH$memoryOffset);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$memory = LAYOUT$memory.byteSize();
    public static final long SIZE$memoryOffset = LAYOUT$memoryOffset.byteSize();
}
