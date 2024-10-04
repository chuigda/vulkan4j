package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkPhysicalDeviceMemoryDecompressionPropertiesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkMemoryDecompressionMethodFlagsNV decompressionMethods;
///     uint64_t maxDecompressionIndirectCount;
/// } VkPhysicalDeviceMemoryDecompressionPropertiesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMemoryDecompressionPropertiesNV.html">VkPhysicalDeviceMemoryDecompressionPropertiesNV</a>
public record VkPhysicalDeviceMemoryDecompressionPropertiesNV(MemorySegment segment) implements IPointer {
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkMemoryDecompressionMethodFlagsNV.class) long decompressionMethods() {
        return segment.get(LAYOUT$decompressionMethods, OFFSET$decompressionMethods);
    }

    public void decompressionMethods(@enumtype(VkMemoryDecompressionMethodFlagsNV.class) long value) {
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

    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV clone(Arena arena, VkPhysicalDeviceMemoryDecompressionPropertiesNV src) {
        VkPhysicalDeviceMemoryDecompressionPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMemoryDecompressionPropertiesNV[] clone(Arena arena, VkPhysicalDeviceMemoryDecompressionPropertiesNV[] src) {
        VkPhysicalDeviceMemoryDecompressionPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("decompressionMethods"),
        ValueLayout.JAVA_LONG.withName("maxDecompressionIndirectCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$decompressionMethods = PathElement.groupElement("decompressionMethods");
    public static final PathElement PATH$maxDecompressionIndirectCount = PathElement.groupElement("maxDecompressionIndirectCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$decompressionMethods = (OfLong) LAYOUT.select(PATH$decompressionMethods);
    public static final OfLong LAYOUT$maxDecompressionIndirectCount = (OfLong) LAYOUT.select(PATH$maxDecompressionIndirectCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$decompressionMethods = LAYOUT.byteOffset(PATH$decompressionMethods);
    public static final long OFFSET$maxDecompressionIndirectCount = LAYOUT.byteOffset(PATH$maxDecompressionIndirectCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$decompressionMethods = LAYOUT$decompressionMethods.byteSize();
    public static final long SIZE$maxDecompressionIndirectCount = LAYOUT$maxDecompressionIndirectCount.byteSize();
}
