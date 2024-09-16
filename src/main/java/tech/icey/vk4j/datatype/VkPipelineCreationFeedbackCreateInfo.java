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

public record VkPipelineCreationFeedbackCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreationFeedback.LAYOUT).withName("pPipelineCreationFeedback"),
        ValueLayout.JAVA_INT.withName("pipelineStageCreationFeedbackCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreationFeedback.LAYOUT).withName("pPipelineStageCreationFeedbacks")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pPipelineCreationFeedback = PathElement.groupElement(2);
    public static final PathElement PATH$pipelineStageCreationFeedbackCount = PathElement.groupElement(3);
    public static final PathElement PATH$pPipelineStageCreationFeedbacks = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pPipelineCreationFeedback = (AddressLayout) LAYOUT.select(PATH$pPipelineCreationFeedback);
    public static final OfInt LAYOUT$pipelineStageCreationFeedbackCount = (OfInt) LAYOUT.select(PATH$pipelineStageCreationFeedbackCount);
    public static final AddressLayout LAYOUT$pPipelineStageCreationFeedbacks = (AddressLayout) LAYOUT.select(PATH$pPipelineStageCreationFeedbacks);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pPipelineCreationFeedback = LAYOUT.byteOffset(PATH$pPipelineCreationFeedback);
    public static final long OFFSET$pipelineStageCreationFeedbackCount = LAYOUT.byteOffset(PATH$pipelineStageCreationFeedbackCount);
    public static final long OFFSET$pPipelineStageCreationFeedbacks = LAYOUT.byteOffset(PATH$pPipelineStageCreationFeedbacks);

    public VkPipelineCreationFeedbackCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_CREATION_FEEDBACK_CREATE_INFO);
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

    public @pointer(comment="VkPipelineCreationFeedback*") MemorySegment pPipelineCreationFeedbackRaw() {
        return segment.get(LAYOUT$pPipelineCreationFeedback, OFFSET$pPipelineCreationFeedback);
    }

    public void pPipelineCreationFeedbackRaw(@pointer(comment="VkPipelineCreationFeedback*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineCreationFeedback, OFFSET$pPipelineCreationFeedback, value);
    }
    
    public @nullable VkPipelineCreationFeedback pPipelineCreationFeedback() {
        MemorySegment s = pPipelineCreationFeedbackRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineCreationFeedback(s);
    }

    public void pPipelineCreationFeedback(@nullable VkPipelineCreationFeedback value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineCreationFeedbackRaw(s);
    }

    public @unsigned int pipelineStageCreationFeedbackCount() {
        return segment.get(LAYOUT$pipelineStageCreationFeedbackCount, OFFSET$pipelineStageCreationFeedbackCount);
    }

    public void pipelineStageCreationFeedbackCount(@unsigned int value) {
        segment.set(LAYOUT$pipelineStageCreationFeedbackCount, OFFSET$pipelineStageCreationFeedbackCount, value);
    }

    public @pointer(comment="VkPipelineCreationFeedback*") MemorySegment pPipelineStageCreationFeedbacksRaw() {
        return segment.get(LAYOUT$pPipelineStageCreationFeedbacks, OFFSET$pPipelineStageCreationFeedbacks);
    }

    public void pPipelineStageCreationFeedbacksRaw(@pointer(comment="VkPipelineCreationFeedback*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineStageCreationFeedbacks, OFFSET$pPipelineStageCreationFeedbacks, value);
    }
    
    public @nullable VkPipelineCreationFeedback pPipelineStageCreationFeedbacks() {
        MemorySegment s = pPipelineStageCreationFeedbacksRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineCreationFeedback(s);
    }

    public void pPipelineStageCreationFeedbacks(@nullable VkPipelineCreationFeedback value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineStageCreationFeedbacksRaw(s);
    }


    public static final class VkPipelineCreationFeedbackCreateInfoFactory implements IDataTypeFactory<VkPipelineCreationFeedbackCreateInfo> {
        @Override
        public Class<VkPipelineCreationFeedbackCreateInfo> clazz() {
            return VkPipelineCreationFeedbackCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineCreationFeedbackCreateInfo.LAYOUT;
        }

        @Override
        public VkPipelineCreationFeedbackCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineCreationFeedbackCreateInfo createUninit(MemorySegment segment) {
            return new VkPipelineCreationFeedbackCreateInfo(segment);
        }
    }

    public static final VkPipelineCreationFeedbackCreateInfoFactory FACTORY = new VkPipelineCreationFeedbackCreateInfoFactory();
}
