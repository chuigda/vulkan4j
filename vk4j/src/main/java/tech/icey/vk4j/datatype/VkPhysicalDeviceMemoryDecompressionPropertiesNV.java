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

public record VkPhysicalDeviceMemoryDecompressionPropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("decompressionMethods"),
        ValueLayout.JAVA_LONG.withName("maxDecompressionIndirectCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$decompressionMethods = PathElement.groupElement("decompressionMethods");
    public static final PathElement PATH$maxDecompressionIndirectCount = PathElement.groupElement("maxDecompressionIndirectCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$decompressionMethods = (OfInt) LAYOUT.select(PATH$decompressionMethods);
    public static final OfLong LAYOUT$maxDecompressionIndirectCount = (OfLong) LAYOUT.select(PATH$maxDecompressionIndirectCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$decompressionMethods = LAYOUT.byteOffset(PATH$decompressionMethods);
    public static final long OFFSET$maxDecompressionIndirectCount = LAYOUT.byteOffset(PATH$maxDecompressionIndirectCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$decompressionMethods = LAYOUT$decompressionMethods.byteSize();
    public static final long SIZE$maxDecompressionIndirectCount = LAYOUT$maxDecompressionIndirectCount.byteSize();

    public VkPhysicalDeviceMemoryDecompressionPropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_DECOMPRESSION_PROPERTIES_NV);
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

    public @enumtype(VkMemoryDecompressionMethodFlagsNV.class) int decompressionMethods() {
        return segment.get(LAYOUT$decompressionMethods, OFFSET$decompressionMethods);
    }

    public void decompressionMethods(@enumtype(VkMemoryDecompressionMethodFlagsNV.class) int value) {
        segment.set(LAYOUT$decompressionMethods, OFFSET$decompressionMethods, value);
    }

    public @unsigned long maxDecompressionIndirectCount() {
        return segment.get(LAYOUT$maxDecompressionIndirectCount, OFFSET$maxDecompressionIndirectCount);
    }

    public void maxDecompressionIndirectCount(@unsigned long value) {
        segment.set(LAYOUT$maxDecompressionIndirectCount, OFFSET$maxDecompressionIndirectCount, value);
    }

    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceMemoryDecompressionPropertiesNV(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMemoryDecompressionPropertiesNV[] ret = new VkPhysicalDeviceMemoryDecompressionPropertiesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMemoryDecompressionPropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
