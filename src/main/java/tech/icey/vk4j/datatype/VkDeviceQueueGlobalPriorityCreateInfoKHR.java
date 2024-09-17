package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
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

public record VkDeviceQueueGlobalPriorityCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("globalPriority")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$globalPriority = PathElement.groupElement("globalPriority");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$globalPriority = (OfInt) LAYOUT.select(PATH$globalPriority);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$globalPriority = LAYOUT.byteOffset(PATH$globalPriority);

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

    public @enumtype(VkQueueGlobalPriorityKHR.class) int globalPriority() {
        return segment.get(LAYOUT$globalPriority, OFFSET$globalPriority);
    }

    public void globalPriority(@enumtype(VkQueueGlobalPriorityKHR.class) int value) {
        segment.set(LAYOUT$globalPriority, OFFSET$globalPriority, value);
    }


    public static final class VkDeviceQueueGlobalPriorityCreateInfoKHRFactory implements IFactory<VkDeviceQueueGlobalPriorityCreateInfoKHR> {
        @Override
        public Class<VkDeviceQueueGlobalPriorityCreateInfoKHR> clazz() {
            return VkDeviceQueueGlobalPriorityCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceQueueGlobalPriorityCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkDeviceQueueGlobalPriorityCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceQueueGlobalPriorityCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkDeviceQueueGlobalPriorityCreateInfoKHR(segment);
        }
    }

    public static final VkDeviceQueueGlobalPriorityCreateInfoKHRFactory FACTORY = new VkDeviceQueueGlobalPriorityCreateInfoKHRFactory();
}
