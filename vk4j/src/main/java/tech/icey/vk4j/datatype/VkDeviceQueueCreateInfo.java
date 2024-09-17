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

public record VkDeviceQueueCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndex"),
        ValueLayout.JAVA_INT.withName("queueCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("pQueuePriorities")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$queueFamilyIndex = PathElement.groupElement("queueFamilyIndex");
    public static final PathElement PATH$queueCount = PathElement.groupElement("queueCount");
    public static final PathElement PATH$pQueuePriorities = PathElement.groupElement("pQueuePriorities");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$queueFamilyIndex = (OfInt) LAYOUT.select(PATH$queueFamilyIndex);
    public static final OfInt LAYOUT$queueCount = (OfInt) LAYOUT.select(PATH$queueCount);
    public static final AddressLayout LAYOUT$pQueuePriorities = (AddressLayout) LAYOUT.select(PATH$pQueuePriorities);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$queueFamilyIndex = LAYOUT.byteOffset(PATH$queueFamilyIndex);
    public static final long OFFSET$queueCount = LAYOUT.byteOffset(PATH$queueCount);
    public static final long OFFSET$pQueuePriorities = LAYOUT.byteOffset(PATH$pQueuePriorities);

    public VkDeviceQueueCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_QUEUE_CREATE_INFO);
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

    public @enumtype(VkDeviceQueueCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDeviceQueueCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int queueFamilyIndex() {
        return segment.get(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex);
    }

    public void queueFamilyIndex(@unsigned int value) {
        segment.set(LAYOUT$queueFamilyIndex, OFFSET$queueFamilyIndex, value);
    }

    public @unsigned int queueCount() {
        return segment.get(LAYOUT$queueCount, OFFSET$queueCount);
    }

    public void queueCount(@unsigned int value) {
        segment.set(LAYOUT$queueCount, OFFSET$queueCount, value);
    }

    public @pointer(comment="float*") MemorySegment pQueuePrioritiesRaw() {
        return segment.get(LAYOUT$pQueuePriorities, OFFSET$pQueuePriorities);
    }

    public void pQueuePrioritiesRaw(@pointer(comment="float*") MemorySegment value) {
        segment.set(LAYOUT$pQueuePriorities, OFFSET$pQueuePriorities, value);
    }
    
    public FloatPtr pQueuePriorities() {
        return new FloatPtr(pQueuePrioritiesRaw());
    }

    public void pQueuePriorities(FloatPtr value) {
        pQueuePrioritiesRaw(value.segment());
    }


    public static final class VkDeviceQueueCreateInfoFactory implements IFactory<VkDeviceQueueCreateInfo> {
        @Override
        public Class<VkDeviceQueueCreateInfo> clazz() {
            return VkDeviceQueueCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceQueueCreateInfo.LAYOUT;
        }

        @Override
        public VkDeviceQueueCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceQueueCreateInfo createUninit(MemorySegment segment) {
            return new VkDeviceQueueCreateInfo(segment);
        }
    }

    public static final VkDeviceQueueCreateInfoFactory FACTORY = new VkDeviceQueueCreateInfoFactory();
}
