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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceMemoryBudgetPropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, ValueLayout.JAVA_LONG).withName("heapBudget"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, ValueLayout.JAVA_LONG).withName("heapUsage")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$heapBudget = PathElement.groupElement(2);
    public static final PathElement PATH$heapUsage = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$heapBudget = (SequenceLayout) LAYOUT.select(PATH$heapBudget);
    public static final SequenceLayout LAYOUT$heapUsage = (SequenceLayout) LAYOUT.select(PATH$heapUsage);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$heapBudget = LAYOUT.byteOffset(PATH$heapBudget);
    public static final long OFFSET$heapUsage = LAYOUT.byteOffset(PATH$heapUsage);

    public VkPhysicalDeviceMemoryBudgetPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT);
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

    public MemorySegment heapBudgetRaw() {
        return segment.asSlice(OFFSET$heapBudget, LAYOUT$heapBudget.byteSize());
    }

    public @unsigned LongArray heapBudget() {
        return new LongArray(heapBudgetRaw(), LAYOUT$heapBudget.elementCount());
    }

    public void heapBudget(@unsigned LongArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$heapBudget, LAYOUT$heapBudget.byteSize());
    }

    public MemorySegment heapUsageRaw() {
        return segment.asSlice(OFFSET$heapUsage, LAYOUT$heapUsage.byteSize());
    }

    public @unsigned LongArray heapUsage() {
        return new LongArray(heapUsageRaw(), LAYOUT$heapUsage.elementCount());
    }

    public void heapUsage(@unsigned LongArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$heapUsage, LAYOUT$heapUsage.byteSize());
    }


    public static final class VkPhysicalDeviceMemoryBudgetPropertiesEXTFactory implements IDataTypeFactory<VkPhysicalDeviceMemoryBudgetPropertiesEXT> {
        @Override
        public Class<VkPhysicalDeviceMemoryBudgetPropertiesEXT> clazz() {
            return VkPhysicalDeviceMemoryBudgetPropertiesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMemoryBudgetPropertiesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMemoryBudgetPropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceMemoryBudgetPropertiesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceMemoryBudgetPropertiesEXTFactory FACTORY = new VkPhysicalDeviceMemoryBudgetPropertiesEXTFactory();
}