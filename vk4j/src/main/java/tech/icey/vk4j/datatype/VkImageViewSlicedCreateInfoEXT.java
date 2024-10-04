package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT;

/// {@snippet lang=c :
/// typedef struct VkImageViewSlicedCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t sliceOffset;
///     uint32_t sliceCount;
/// } VkImageViewSlicedCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageViewSlicedCreateInfoEXT.html">VkImageViewSlicedCreateInfoEXT</a>
public record VkImageViewSlicedCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkImageViewSlicedCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_SLICED_CREATE_INFO_EXT);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int sliceOffset() {
        return segment.get(LAYOUT$sliceOffset, OFFSET$sliceOffset);
    }

    public void sliceOffset(@unsigned int value) {
        segment.set(LAYOUT$sliceOffset, OFFSET$sliceOffset, value);
    }

    public @unsigned int sliceCount() {
        return segment.get(LAYOUT$sliceCount, OFFSET$sliceCount);
    }

    public void sliceCount(@unsigned int value) {
        segment.set(LAYOUT$sliceCount, OFFSET$sliceCount, value);
    }

    public static VkImageViewSlicedCreateInfoEXT allocate(Arena arena) {
        return new VkImageViewSlicedCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkImageViewSlicedCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageViewSlicedCreateInfoEXT[] ret = new VkImageViewSlicedCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageViewSlicedCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageViewSlicedCreateInfoEXT clone(Arena arena, VkImageViewSlicedCreateInfoEXT src) {
        VkImageViewSlicedCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageViewSlicedCreateInfoEXT[] clone(Arena arena, VkImageViewSlicedCreateInfoEXT[] src) {
        VkImageViewSlicedCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sliceOffset"),
        ValueLayout.JAVA_INT.withName("sliceCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sliceOffset = PathElement.groupElement("sliceOffset");
    public static final PathElement PATH$sliceCount = PathElement.groupElement("sliceCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sliceOffset = (OfInt) LAYOUT.select(PATH$sliceOffset);
    public static final OfInt LAYOUT$sliceCount = (OfInt) LAYOUT.select(PATH$sliceCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sliceOffset = LAYOUT.byteOffset(PATH$sliceOffset);
    public static final long OFFSET$sliceCount = LAYOUT.byteOffset(PATH$sliceCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$sliceOffset = LAYOUT$sliceOffset.byteSize();
    public static final long SIZE$sliceCount = LAYOUT$sliceCount.byteSize();
}
