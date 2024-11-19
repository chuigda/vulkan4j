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
/// typedef struct VkQueueFamilyGlobalPriorityPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t priorityCount;
///     VkQueueGlobalPriorityKHR priorities[VK_MAX_GLOBAL_PRIORITY_SIZE_KHR];
/// } VkQueueFamilyGlobalPriorityPropertiesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkQueueFamilyGlobalPriorityPropertiesKHR.html">VkQueueFamilyGlobalPriorityPropertiesKHR</a>
public record VkQueueFamilyGlobalPriorityPropertiesKHR(MemorySegment segment) implements IPointer {
    public VkQueueFamilyGlobalPriorityPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES_KHR);
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

    public @unsigned int priorityCount() {
        return segment.get(LAYOUT$priorityCount, OFFSET$priorityCount);
    }

    public void priorityCount(@unsigned int value) {
        segment.set(LAYOUT$priorityCount, OFFSET$priorityCount, value);
    }

    public MemorySegment prioritiesRaw() {
        return segment.asSlice(OFFSET$priorities, SIZE$priorities);
    }

    public IntBuffer priorities() {
        return new IntBuffer(prioritiesRaw());
    }

    public void priorities(IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$priorities, SIZE$priorities);
    }

    public static VkQueueFamilyGlobalPriorityPropertiesKHR allocate(Arena arena) {
        return new VkQueueFamilyGlobalPriorityPropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkQueueFamilyGlobalPriorityPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueueFamilyGlobalPriorityPropertiesKHR[] ret = new VkQueueFamilyGlobalPriorityPropertiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkQueueFamilyGlobalPriorityPropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkQueueFamilyGlobalPriorityPropertiesKHR clone(Arena arena, VkQueueFamilyGlobalPriorityPropertiesKHR src) {
        VkQueueFamilyGlobalPriorityPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkQueueFamilyGlobalPriorityPropertiesKHR[] clone(Arena arena, VkQueueFamilyGlobalPriorityPropertiesKHR[] src) {
        VkQueueFamilyGlobalPriorityPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("priorityCount"),
        MemoryLayout.sequenceLayout(VK_MAX_GLOBAL_PRIORITY_SIZE_KHR, ValueLayout.JAVA_INT).withName("priorities")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$priorityCount = PathElement.groupElement("priorityCount");
    public static final PathElement PATH$priorities = PathElement.groupElement("priorities");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$priorityCount = (OfInt) LAYOUT.select(PATH$priorityCount);
    public static final SequenceLayout LAYOUT$priorities = (SequenceLayout) LAYOUT.select(PATH$priorities);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$priorityCount = LAYOUT.byteOffset(PATH$priorityCount);
    public static final long OFFSET$priorities = LAYOUT.byteOffset(PATH$priorities);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$priorityCount = LAYOUT$priorityCount.byteSize();
    public static final long SIZE$priorities = LAYOUT$priorities.byteSize();
}
