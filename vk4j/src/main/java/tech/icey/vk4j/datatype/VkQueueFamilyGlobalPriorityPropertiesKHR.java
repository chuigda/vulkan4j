package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkQueueFamilyGlobalPriorityPropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("priorityCount"),
        MemoryLayout.sequenceLayout(VK_MAX_GLOBAL_PRIORITY_SIZE_KHR, ValueLayout.JAVA_INT).withName("priorities")
    );

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

    public @unsigned int priorityCount() {
        return segment.get(LAYOUT$priorityCount, OFFSET$priorityCount);
    }

    public void priorityCount(@unsigned int value) {
        segment.set(LAYOUT$priorityCount, OFFSET$priorityCount, value);
    }

    public MemorySegment prioritiesRaw() {
        return segment.asSlice(OFFSET$priorities, LAYOUT$priorities.byteSize());
    }

    public IntArray priorities() {
        return new IntArray(prioritiesRaw(), LAYOUT$priorities.elementCount());
    }

    public void priorities(IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$priorities, LAYOUT$priorities.byteSize());
    }


    public static final class Factory implements IFactory<VkQueueFamilyGlobalPriorityPropertiesKHR> {
        @Override
        public Class<VkQueueFamilyGlobalPriorityPropertiesKHR> clazz() {
            return VkQueueFamilyGlobalPriorityPropertiesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkQueueFamilyGlobalPriorityPropertiesKHR.LAYOUT;
        }

        @Override
        public VkQueueFamilyGlobalPriorityPropertiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkQueueFamilyGlobalPriorityPropertiesKHR createUninit(MemorySegment segment) {
            return new VkQueueFamilyGlobalPriorityPropertiesKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
