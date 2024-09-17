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

public record VkMemoryPriorityAllocateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("priority")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$priority = PathElement.groupElement("priority");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfFloat LAYOUT$priority = (OfFloat) LAYOUT.select(PATH$priority);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$priority = LAYOUT.byteOffset(PATH$priority);

    public VkMemoryPriorityAllocateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT);
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

    public float priority() {
        return segment.get(LAYOUT$priority, OFFSET$priority);
    }

    public void priority(float value) {
        segment.set(LAYOUT$priority, OFFSET$priority, value);
    }


    public static final class VkMemoryPriorityAllocateInfoEXTFactory implements IFactory<VkMemoryPriorityAllocateInfoEXT> {
        @Override
        public Class<VkMemoryPriorityAllocateInfoEXT> clazz() {
            return VkMemoryPriorityAllocateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkMemoryPriorityAllocateInfoEXT.LAYOUT;
        }

        @Override
        public VkMemoryPriorityAllocateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkMemoryPriorityAllocateInfoEXT createUninit(MemorySegment segment) {
            return new VkMemoryPriorityAllocateInfoEXT(segment);
        }
    }

    public static final VkMemoryPriorityAllocateInfoEXTFactory FACTORY = new VkMemoryPriorityAllocateInfoEXTFactory();
}
