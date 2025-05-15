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

public record VkQueueFamilyGlobalPriorityProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$priorityCount = ValueLayout.JAVA_INT.withName("priorityCount");
    public static final OfInt LAYOUT$priorities = ValueLayout.JAVA_INT.withName("priorities");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$priorityCount, LAYOUT$priorities);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkQueueFamilyGlobalPriorityProperties allocate(Arena arena) {
        return new VkQueueFamilyGlobalPriorityProperties(arena.allocate(LAYOUT));
    }

    public static VkQueueFamilyGlobalPriorityProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueueFamilyGlobalPriorityProperties[] ret = new VkQueueFamilyGlobalPriorityProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkQueueFamilyGlobalPriorityProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkQueueFamilyGlobalPriorityProperties clone(Arena arena, VkQueueFamilyGlobalPriorityProperties src) {
        VkQueueFamilyGlobalPriorityProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkQueueFamilyGlobalPriorityProperties[] clone(Arena arena, VkQueueFamilyGlobalPriorityProperties[] src) {
        VkQueueFamilyGlobalPriorityProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$priorityCount = PathElement.groupElement("PATH$priorityCount");
    public static final PathElement PATH$priorities = PathElement.groupElement("PATH$priorities");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$priorityCount = LAYOUT$priorityCount.byteSize();
    public static final long SIZE$priorities = LAYOUT$priorities.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$priorityCount = LAYOUT.byteOffset(PATH$priorityCount);
    public static final long OFFSET$priorities = LAYOUT.byteOffset(PATH$priorities);

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

    public @unsigned int priorityCount() {
        return segment.get(LAYOUT$priorityCount, OFFSET$priorityCount);
    }

    public void priorityCount(@unsigned int value) {
        segment.set(LAYOUT$priorityCount, OFFSET$priorityCount, value);
    }

    public @enumtype(VkQueueGlobalPriority.class) int priorities() {
        return segment.get(LAYOUT$priorities, OFFSET$priorities);
    }

    public void priorities(@enumtype(VkQueueGlobalPriority.class) int value) {
        segment.set(LAYOUT$priorities, OFFSET$priorities, value);
    }

}
/// dummy, not implemented yet
