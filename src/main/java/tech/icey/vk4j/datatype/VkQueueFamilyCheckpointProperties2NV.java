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

public record VkQueueFamilyCheckpointProperties2NV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("checkpointExecutionStageMask")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$checkpointExecutionStageMask = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$checkpointExecutionStageMask = (OfInt) LAYOUT.select(PATH$checkpointExecutionStageMask);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$checkpointExecutionStageMask = LAYOUT.byteOffset(PATH$checkpointExecutionStageMask);

    public VkQueueFamilyCheckpointProperties2NV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_QUEUE_FAMILY_CHECKPOINT_PROPERTIES_2_NV);
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

    public @enumtype(VkPipelineStageFlags2.class) int checkpointExecutionStageMask() {
        return segment.get(LAYOUT$checkpointExecutionStageMask, OFFSET$checkpointExecutionStageMask);
    }

    public void checkpointExecutionStageMask(@enumtype(VkPipelineStageFlags2.class) int value) {
        segment.set(LAYOUT$checkpointExecutionStageMask, OFFSET$checkpointExecutionStageMask, value);
    }


    public static final class VkQueueFamilyCheckpointProperties2NVFactory implements IDataTypeFactory<VkQueueFamilyCheckpointProperties2NV> {
        @Override
        public Class<VkQueueFamilyCheckpointProperties2NV> clazz() {
            return VkQueueFamilyCheckpointProperties2NV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkQueueFamilyCheckpointProperties2NV.LAYOUT;
        }

        @Override
        public VkQueueFamilyCheckpointProperties2NV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkQueueFamilyCheckpointProperties2NV createUninit(MemorySegment segment) {
            return new VkQueueFamilyCheckpointProperties2NV(segment);
        }
    }

    public static final VkQueueFamilyCheckpointProperties2NVFactory FACTORY = new VkQueueFamilyCheckpointProperties2NVFactory();
}
