package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDeviceGroupBindSparseInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("resourceDeviceIndex"),
        ValueLayout.JAVA_INT.withName("memoryDeviceIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$resourceDeviceIndex = PathElement.groupElement("resourceDeviceIndex");
    public static final PathElement PATH$memoryDeviceIndex = PathElement.groupElement("memoryDeviceIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$resourceDeviceIndex = (OfInt) LAYOUT.select(PATH$resourceDeviceIndex);
    public static final OfInt LAYOUT$memoryDeviceIndex = (OfInt) LAYOUT.select(PATH$memoryDeviceIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$resourceDeviceIndex = LAYOUT.byteOffset(PATH$resourceDeviceIndex);
    public static final long OFFSET$memoryDeviceIndex = LAYOUT.byteOffset(PATH$memoryDeviceIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$resourceDeviceIndex = LAYOUT$resourceDeviceIndex.byteSize();
    public static final long SIZE$memoryDeviceIndex = LAYOUT$memoryDeviceIndex.byteSize();

    public VkDeviceGroupBindSparseInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_GROUP_BIND_SPARSE_INFO);
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

    public @unsigned int resourceDeviceIndex() {
        return segment.get(LAYOUT$resourceDeviceIndex, OFFSET$resourceDeviceIndex);
    }

    public void resourceDeviceIndex(@unsigned int value) {
        segment.set(LAYOUT$resourceDeviceIndex, OFFSET$resourceDeviceIndex, value);
    }

    public @unsigned int memoryDeviceIndex() {
        return segment.get(LAYOUT$memoryDeviceIndex, OFFSET$memoryDeviceIndex);
    }

    public void memoryDeviceIndex(@unsigned int value) {
        segment.set(LAYOUT$memoryDeviceIndex, OFFSET$memoryDeviceIndex, value);
    }

    public static VkDeviceGroupBindSparseInfo allocate(Arena arena) {
        return new VkDeviceGroupBindSparseInfo(arena.allocate(LAYOUT));
    }
    
    public static VkDeviceGroupBindSparseInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupBindSparseInfo[] ret = new VkDeviceGroupBindSparseInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceGroupBindSparseInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
