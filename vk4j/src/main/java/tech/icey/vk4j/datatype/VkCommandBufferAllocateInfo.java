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

public record VkCommandBufferAllocateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("commandPool"),
        ValueLayout.JAVA_INT.withName("level"),
        ValueLayout.JAVA_INT.withName("commandBufferCount")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$commandPool = PathElement.groupElement("commandPool");
    public static final PathElement PATH$level = PathElement.groupElement("level");
    public static final PathElement PATH$commandBufferCount = PathElement.groupElement("commandBufferCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$commandPool = (AddressLayout) LAYOUT.select(PATH$commandPool);
    public static final OfInt LAYOUT$level = (OfInt) LAYOUT.select(PATH$level);
    public static final OfInt LAYOUT$commandBufferCount = (OfInt) LAYOUT.select(PATH$commandBufferCount);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$commandPool = LAYOUT.byteOffset(PATH$commandPool);
    public static final long OFFSET$level = LAYOUT.byteOffset(PATH$level);
    public static final long OFFSET$commandBufferCount = LAYOUT.byteOffset(PATH$commandBufferCount);

    public VkCommandBufferAllocateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_ALLOCATE_INFO);
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

    public VkCommandPool commandPool() {
        return new VkCommandPool(segment.asSlice(OFFSET$commandPool, LAYOUT$commandPool));
    }

    public void commandPool(VkCommandPool value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$commandPool, LAYOUT$commandPool.byteSize());
    }

    public @enumtype(VkCommandBufferLevel.class) int level() {
        return segment.get(LAYOUT$level, OFFSET$level);
    }

    public void level(@enumtype(VkCommandBufferLevel.class) int value) {
        segment.set(LAYOUT$level, OFFSET$level, value);
    }

    public @unsigned int commandBufferCount() {
        return segment.get(LAYOUT$commandBufferCount, OFFSET$commandBufferCount);
    }

    public void commandBufferCount(@unsigned int value) {
        segment.set(LAYOUT$commandBufferCount, OFFSET$commandBufferCount, value);
    }


    public static final class VkCommandBufferAllocateInfoFactory implements IFactory<VkCommandBufferAllocateInfo> {
        @Override
        public Class<VkCommandBufferAllocateInfo> clazz() {
            return VkCommandBufferAllocateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCommandBufferAllocateInfo.LAYOUT;
        }

        @Override
        public VkCommandBufferAllocateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkCommandBufferAllocateInfo createUninit(MemorySegment segment) {
            return new VkCommandBufferAllocateInfo(segment);
        }
    }

    public static final VkCommandBufferAllocateInfoFactory FACTORY = new VkCommandBufferAllocateInfoFactory();
}
