package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.enumtype.VkQueueGlobalPriorityKHR;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR;

/// {@snippet lang=c :
/// typedef struct VkDeviceQueueGlobalPriorityCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkQueueGlobalPriorityKHR globalPriority;
/// } VkDeviceQueueGlobalPriorityCreateInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceQueueGlobalPriorityCreateInfoKHR.html">VkDeviceQueueGlobalPriorityCreateInfoKHR</a>
public record VkDeviceQueueGlobalPriorityCreateInfoKHR(MemorySegment segment) implements IPointer {
    public VkDeviceQueueGlobalPriorityCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_QUEUE_GLOBAL_PRIORITY_CREATE_INFO_KHR);
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

    public @enumtype(VkQueueGlobalPriorityKHR.class) int globalPriority() {
        return segment.get(LAYOUT$globalPriority, OFFSET$globalPriority);
    }

    public void globalPriority(@enumtype(VkQueueGlobalPriorityKHR.class) int value) {
        segment.set(LAYOUT$globalPriority, OFFSET$globalPriority, value);
    }

    public static VkDeviceQueueGlobalPriorityCreateInfoKHR allocate(Arena arena) {
        return new VkDeviceQueueGlobalPriorityCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkDeviceQueueGlobalPriorityCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceQueueGlobalPriorityCreateInfoKHR[] ret = new VkDeviceQueueGlobalPriorityCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceQueueGlobalPriorityCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceQueueGlobalPriorityCreateInfoKHR clone(Arena arena, VkDeviceQueueGlobalPriorityCreateInfoKHR src) {
        VkDeviceQueueGlobalPriorityCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceQueueGlobalPriorityCreateInfoKHR[] clone(Arena arena, VkDeviceQueueGlobalPriorityCreateInfoKHR[] src) {
        VkDeviceQueueGlobalPriorityCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("globalPriority")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$globalPriority = PathElement.groupElement("globalPriority");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$globalPriority = (OfInt) LAYOUT.select(PATH$globalPriority);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$globalPriority = LAYOUT.byteOffset(PATH$globalPriority);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$globalPriority = LAYOUT$globalPriority.byteSize();
}
