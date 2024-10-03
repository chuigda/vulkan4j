package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.bitmask.VkBufferUsageFlags;
import tech.icey.vk4j.bitmask.VkImageUsageFlags;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize extendedSparseAddressSpaceSize;
///     VkImageUsageFlags extendedSparseImageUsageFlags;
///     VkBufferUsageFlags extendedSparseBufferUsageFlags;
/// } VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV.html">VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV</a>
public record VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_SPARSE_ADDRESS_SPACE_PROPERTIES_NV);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned long extendedSparseAddressSpaceSize() {
        return segment.get(LAYOUT$extendedSparseAddressSpaceSize, OFFSET$extendedSparseAddressSpaceSize);
    }

    public void extendedSparseAddressSpaceSize(@unsigned long value) {
        segment.set(LAYOUT$extendedSparseAddressSpaceSize, OFFSET$extendedSparseAddressSpaceSize, value);
    }

    public @enumtype(VkImageUsageFlags.class) int extendedSparseImageUsageFlags() {
        return segment.get(LAYOUT$extendedSparseImageUsageFlags, OFFSET$extendedSparseImageUsageFlags);
    }

    public void extendedSparseImageUsageFlags(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$extendedSparseImageUsageFlags, OFFSET$extendedSparseImageUsageFlags, value);
    }

    public @enumtype(VkBufferUsageFlags.class) int extendedSparseBufferUsageFlags() {
        return segment.get(LAYOUT$extendedSparseBufferUsageFlags, OFFSET$extendedSparseBufferUsageFlags);
    }

    public void extendedSparseBufferUsageFlags(@enumtype(VkBufferUsageFlags.class) int value) {
        segment.set(LAYOUT$extendedSparseBufferUsageFlags, OFFSET$extendedSparseBufferUsageFlags, value);
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV[] ret = new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV clone(Arena arena, VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV src) {
        VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV[] clone(Arena arena, VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV[] src) {
        VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("extendedSparseAddressSpaceSize"),
        ValueLayout.JAVA_INT.withName("extendedSparseImageUsageFlags"),
        ValueLayout.JAVA_INT.withName("extendedSparseBufferUsageFlags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$extendedSparseAddressSpaceSize = PathElement.groupElement("extendedSparseAddressSpaceSize");
    public static final PathElement PATH$extendedSparseImageUsageFlags = PathElement.groupElement("extendedSparseImageUsageFlags");
    public static final PathElement PATH$extendedSparseBufferUsageFlags = PathElement.groupElement("extendedSparseBufferUsageFlags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$extendedSparseAddressSpaceSize = (OfLong) LAYOUT.select(PATH$extendedSparseAddressSpaceSize);
    public static final OfInt LAYOUT$extendedSparseImageUsageFlags = (OfInt) LAYOUT.select(PATH$extendedSparseImageUsageFlags);
    public static final OfInt LAYOUT$extendedSparseBufferUsageFlags = (OfInt) LAYOUT.select(PATH$extendedSparseBufferUsageFlags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$extendedSparseAddressSpaceSize = LAYOUT.byteOffset(PATH$extendedSparseAddressSpaceSize);
    public static final long OFFSET$extendedSparseImageUsageFlags = LAYOUT.byteOffset(PATH$extendedSparseImageUsageFlags);
    public static final long OFFSET$extendedSparseBufferUsageFlags = LAYOUT.byteOffset(PATH$extendedSparseBufferUsageFlags);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$extendedSparseAddressSpaceSize = LAYOUT$extendedSparseAddressSpaceSize.byteSize();
    public static final long SIZE$extendedSparseImageUsageFlags = LAYOUT$extendedSparseImageUsageFlags.byteSize();
    public static final long SIZE$extendedSparseBufferUsageFlags = LAYOUT$extendedSparseBufferUsageFlags.byteSize();
}
