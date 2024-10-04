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
/// typedef struct VkPhysicalDevicePerformanceQueryPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 allowCommandBufferQueryCopies;
/// } VkPhysicalDevicePerformanceQueryPropertiesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDevicePerformanceQueryPropertiesKHR.html">VkPhysicalDevicePerformanceQueryPropertiesKHR</a>
public record VkPhysicalDevicePerformanceQueryPropertiesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDevicePerformanceQueryPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PERFORMANCE_QUERY_PROPERTIES_KHR);
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

    public @unsigned int allowCommandBufferQueryCopies() {
        return segment.get(LAYOUT$allowCommandBufferQueryCopies, OFFSET$allowCommandBufferQueryCopies);
    }

    public void allowCommandBufferQueryCopies(@unsigned int value) {
        segment.set(LAYOUT$allowCommandBufferQueryCopies, OFFSET$allowCommandBufferQueryCopies, value);
    }

    public static VkPhysicalDevicePerformanceQueryPropertiesKHR allocate(Arena arena) {
        return new VkPhysicalDevicePerformanceQueryPropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDevicePerformanceQueryPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePerformanceQueryPropertiesKHR[] ret = new VkPhysicalDevicePerformanceQueryPropertiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePerformanceQueryPropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDevicePerformanceQueryPropertiesKHR clone(Arena arena, VkPhysicalDevicePerformanceQueryPropertiesKHR src) {
        VkPhysicalDevicePerformanceQueryPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePerformanceQueryPropertiesKHR[] clone(Arena arena, VkPhysicalDevicePerformanceQueryPropertiesKHR[] src) {
        VkPhysicalDevicePerformanceQueryPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("allowCommandBufferQueryCopies")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$allowCommandBufferQueryCopies = PathElement.groupElement("allowCommandBufferQueryCopies");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$allowCommandBufferQueryCopies = (OfInt) LAYOUT.select(PATH$allowCommandBufferQueryCopies);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$allowCommandBufferQueryCopies = LAYOUT.byteOffset(PATH$allowCommandBufferQueryCopies);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$allowCommandBufferQueryCopies = LAYOUT$allowCommandBufferQueryCopies.byteSize();
}
