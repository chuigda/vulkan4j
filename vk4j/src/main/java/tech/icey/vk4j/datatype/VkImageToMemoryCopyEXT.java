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
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT;

/// {@snippet lang=c :
/// typedef struct VkImageToMemoryCopyEXT {
///     VkStructureType sType;
///     const void* pNext;
///     void* pHostPointer;
///     uint32_t memoryRowLength;
///     uint32_t memoryImageHeight;
///     VkImageSubresourceLayers imageSubresource;
///     VkOffset3D imageOffset;
///     VkExtent3D imageExtent;
/// } VkImageToMemoryCopyEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageToMemoryCopyEXT.html">VkImageToMemoryCopyEXT</a>
public record VkImageToMemoryCopyEXT(MemorySegment segment) implements IPointer {
    public VkImageToMemoryCopyEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_TO_MEMORY_COPY_EXT);
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

    public @pointer(comment="void*") MemorySegment pHostPointer() {
        return segment.get(LAYOUT$pHostPointer, OFFSET$pHostPointer);
    }

    public void pHostPointer(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pHostPointer, OFFSET$pHostPointer, value);
    }

    public void pHostPointer(@nullable IPointer pointer) {
        pHostPointer(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int memoryRowLength() {
        return segment.get(LAYOUT$memoryRowLength, OFFSET$memoryRowLength);
    }

    public void memoryRowLength(@unsigned int value) {
        segment.set(LAYOUT$memoryRowLength, OFFSET$memoryRowLength, value);
    }

    public @unsigned int memoryImageHeight() {
        return segment.get(LAYOUT$memoryImageHeight, OFFSET$memoryImageHeight);
    }

    public void memoryImageHeight(@unsigned int value) {
        segment.set(LAYOUT$memoryImageHeight, OFFSET$memoryImageHeight, value);
    }

    public VkImageSubresourceLayers imageSubresource() {
        return new VkImageSubresourceLayers(segment.asSlice(OFFSET$imageSubresource, LAYOUT$imageSubresource));
    }

    public void imageSubresource(VkImageSubresourceLayers value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageSubresource, SIZE$imageSubresource);
    }

    public VkOffset3D imageOffset() {
        return new VkOffset3D(segment.asSlice(OFFSET$imageOffset, LAYOUT$imageOffset));
    }

    public void imageOffset(VkOffset3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageOffset, SIZE$imageOffset);
    }

    public VkExtent3D imageExtent() {
        return new VkExtent3D(segment.asSlice(OFFSET$imageExtent, LAYOUT$imageExtent));
    }

    public void imageExtent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageExtent, SIZE$imageExtent);
    }

    public static VkImageToMemoryCopyEXT allocate(Arena arena) {
        return new VkImageToMemoryCopyEXT(arena.allocate(LAYOUT));
    }

    public static VkImageToMemoryCopyEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageToMemoryCopyEXT[] ret = new VkImageToMemoryCopyEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageToMemoryCopyEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageToMemoryCopyEXT clone(Arena arena, VkImageToMemoryCopyEXT src) {
        VkImageToMemoryCopyEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageToMemoryCopyEXT[] clone(Arena arena, VkImageToMemoryCopyEXT[] src) {
        VkImageToMemoryCopyEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pHostPointer"),
        ValueLayout.JAVA_INT.withName("memoryRowLength"),
        ValueLayout.JAVA_INT.withName("memoryImageHeight"),
        VkImageSubresourceLayers.LAYOUT.withName("imageSubresource"),
        VkOffset3D.LAYOUT.withName("imageOffset"),
        VkExtent3D.LAYOUT.withName("imageExtent")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pHostPointer = PathElement.groupElement("pHostPointer");
    public static final PathElement PATH$memoryRowLength = PathElement.groupElement("memoryRowLength");
    public static final PathElement PATH$memoryImageHeight = PathElement.groupElement("memoryImageHeight");
    public static final PathElement PATH$imageSubresource = PathElement.groupElement("imageSubresource");
    public static final PathElement PATH$imageOffset = PathElement.groupElement("imageOffset");
    public static final PathElement PATH$imageExtent = PathElement.groupElement("imageExtent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pHostPointer = (AddressLayout) LAYOUT.select(PATH$pHostPointer);
    public static final OfInt LAYOUT$memoryRowLength = (OfInt) LAYOUT.select(PATH$memoryRowLength);
    public static final OfInt LAYOUT$memoryImageHeight = (OfInt) LAYOUT.select(PATH$memoryImageHeight);
    public static final StructLayout LAYOUT$imageSubresource = (StructLayout) LAYOUT.select(PATH$imageSubresource);
    public static final StructLayout LAYOUT$imageOffset = (StructLayout) LAYOUT.select(PATH$imageOffset);
    public static final StructLayout LAYOUT$imageExtent = (StructLayout) LAYOUT.select(PATH$imageExtent);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pHostPointer = LAYOUT.byteOffset(PATH$pHostPointer);
    public static final long OFFSET$memoryRowLength = LAYOUT.byteOffset(PATH$memoryRowLength);
    public static final long OFFSET$memoryImageHeight = LAYOUT.byteOffset(PATH$memoryImageHeight);
    public static final long OFFSET$imageSubresource = LAYOUT.byteOffset(PATH$imageSubresource);
    public static final long OFFSET$imageOffset = LAYOUT.byteOffset(PATH$imageOffset);
    public static final long OFFSET$imageExtent = LAYOUT.byteOffset(PATH$imageExtent);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pHostPointer = LAYOUT$pHostPointer.byteSize();
    public static final long SIZE$memoryRowLength = LAYOUT$memoryRowLength.byteSize();
    public static final long SIZE$memoryImageHeight = LAYOUT$memoryImageHeight.byteSize();
    public static final long SIZE$imageSubresource = LAYOUT$imageSubresource.byteSize();
    public static final long SIZE$imageOffset = LAYOUT$imageOffset.byteSize();
    public static final long SIZE$imageExtent = LAYOUT$imageExtent.byteSize();
}
