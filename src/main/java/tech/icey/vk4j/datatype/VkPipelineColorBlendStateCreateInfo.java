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

public record VkPipelineColorBlendStateCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("logicOpEnable"),
        ValueLayout.JAVA_INT.withName("logicOp"),
        ValueLayout.JAVA_INT.withName("attachmentCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineColorBlendAttachmentState.LAYOUT).withName("pAttachments"),
        MemoryLayout.sequenceLayout(4, ValueLayout.JAVA_FLOAT).withName("blendConstants")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$logicOpEnable = PathElement.groupElement(3);
    public static final PathElement PATH$logicOp = PathElement.groupElement(4);
    public static final PathElement PATH$attachmentCount = PathElement.groupElement(5);
    public static final PathElement PATH$pAttachments = PathElement.groupElement(6);
    public static final PathElement PATH$blendConstants = PathElement.groupElement(7);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$logicOpEnable = (OfInt) LAYOUT.select(PATH$logicOpEnable);
    public static final OfInt LAYOUT$logicOp = (OfInt) LAYOUT.select(PATH$logicOp);
    public static final OfInt LAYOUT$attachmentCount = (OfInt) LAYOUT.select(PATH$attachmentCount);
    public static final AddressLayout LAYOUT$pAttachments = (AddressLayout) LAYOUT.select(PATH$pAttachments);
    public static final SequenceLayout LAYOUT$blendConstants = (SequenceLayout) LAYOUT.select(PATH$blendConstants);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$logicOpEnable = LAYOUT.byteOffset(PATH$logicOpEnable);
    public static final long OFFSET$logicOp = LAYOUT.byteOffset(PATH$logicOp);
    public static final long OFFSET$attachmentCount = LAYOUT.byteOffset(PATH$attachmentCount);
    public static final long OFFSET$pAttachments = LAYOUT.byteOffset(PATH$pAttachments);
    public static final long OFFSET$blendConstants = LAYOUT.byteOffset(PATH$blendConstants);

    public VkPipelineColorBlendStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineColorBlendStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineColorBlendStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int logicOpEnable() {
        return segment.get(LAYOUT$logicOpEnable, OFFSET$logicOpEnable);
    }

    public void logicOpEnable(@unsigned int value) {
        segment.set(LAYOUT$logicOpEnable, OFFSET$logicOpEnable, value);
    }

    public @enumtype(VkLogicOp.class) int logicOp() {
        return segment.get(LAYOUT$logicOp, OFFSET$logicOp);
    }

    public void logicOp(@enumtype(VkLogicOp.class) int value) {
        segment.set(LAYOUT$logicOp, OFFSET$logicOp, value);
    }

    public @unsigned int attachmentCount() {
        return segment.get(LAYOUT$attachmentCount, OFFSET$attachmentCount);
    }

    public void attachmentCount(@unsigned int value) {
        segment.set(LAYOUT$attachmentCount, OFFSET$attachmentCount, value);
    }

    public @pointer(comment="VkPipelineColorBlendAttachmentState*") MemorySegment pAttachmentsRaw() {
        return segment.get(LAYOUT$pAttachments, OFFSET$pAttachments);
    }

    public void pAttachmentsRaw(@pointer(comment="VkPipelineColorBlendAttachmentState*") MemorySegment value) {
        segment.set(LAYOUT$pAttachments, OFFSET$pAttachments, value);
    }
    
    public VkPipelineColorBlendAttachmentState pAttachments() {
        MemorySegment s = pAttachmentsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineColorBlendAttachmentState(s);
    }

    public void pAttachments(VkPipelineColorBlendAttachmentState value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAttachmentsRaw(s);
    }

    public MemorySegment blendConstantsRaw() {
        return segment.asSlice(OFFSET$blendConstants, LAYOUT$blendConstants.byteSize());
    }

    public FloatArray blendConstants() {
        return new FloatArray(blendConstantsRaw(), LAYOUT$blendConstants.elementCount());
    }

    public void blendConstants(FloatArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$blendConstants, LAYOUT$blendConstants.byteSize());
    }


    public static final class VkPipelineColorBlendStateCreateInfoFactory implements IDataTypeFactory<VkPipelineColorBlendStateCreateInfo> {
        @Override
        public Class<VkPipelineColorBlendStateCreateInfo> clazz() {
            return VkPipelineColorBlendStateCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineColorBlendStateCreateInfo.LAYOUT;
        }

        @Override
        public VkPipelineColorBlendStateCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineColorBlendStateCreateInfo createUninit(MemorySegment segment) {
            return new VkPipelineColorBlendStateCreateInfo(segment);
        }
    }

    public static final VkPipelineColorBlendStateCreateInfoFactory FACTORY = new VkPipelineColorBlendStateCreateInfoFactory();
}