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

public record VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$extendedSparseAddressSpaceSize = ValueLayout.JAVA_LONG.withName("extendedSparseAddressSpaceSize");
    public static final OfInt LAYOUT$extendedSparseImageUsageFlags = ValueLayout.JAVA_INT.withName("extendedSparseImageUsageFlags");
    public static final OfInt LAYOUT$extendedSparseBufferUsageFlags = ValueLayout.JAVA_INT.withName("extendedSparseBufferUsageFlags");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$extendedSparseAddressSpaceSize, LAYOUT$extendedSparseImageUsageFlags, LAYOUT$extendedSparseBufferUsageFlags);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV[] ret = new VkPhysicalDeviceExtendedSparseAddressSpacePropertiesNV[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$extendedSparseAddressSpaceSize = PathElement.groupElement("PATH$extendedSparseAddressSpaceSize");
    public static final PathElement PATH$extendedSparseImageUsageFlags = PathElement.groupElement("PATH$extendedSparseImageUsageFlags");
    public static final PathElement PATH$extendedSparseBufferUsageFlags = PathElement.groupElement("PATH$extendedSparseBufferUsageFlags");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$extendedSparseAddressSpaceSize = LAYOUT$extendedSparseAddressSpaceSize.byteSize();
    public static final long SIZE$extendedSparseImageUsageFlags = LAYOUT$extendedSparseImageUsageFlags.byteSize();
    public static final long SIZE$extendedSparseBufferUsageFlags = LAYOUT$extendedSparseBufferUsageFlags.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$extendedSparseAddressSpaceSize = LAYOUT.byteOffset(PATH$extendedSparseAddressSpaceSize);
    public static final long OFFSET$extendedSparseImageUsageFlags = LAYOUT.byteOffset(PATH$extendedSparseImageUsageFlags);
    public static final long OFFSET$extendedSparseBufferUsageFlags = LAYOUT.byteOffset(PATH$extendedSparseBufferUsageFlags);

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

}
/// dummy, not implemented yet
