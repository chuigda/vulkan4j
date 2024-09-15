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

public record VkRenderPassSubpassFeedbackInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("subpassMergeStatus"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("postMergeIndex")
    );

    public static final PathElement PATH$subpassMergeStatus = PathElement.groupElement(0);
    public static final PathElement PATH$description = PathElement.groupElement(1);
    public static final PathElement PATH$postMergeIndex = PathElement.groupElement(2);

    public static final OfInt LAYOUT$subpassMergeStatus = (OfInt) LAYOUT.select(PATH$subpassMergeStatus);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final OfInt LAYOUT$postMergeIndex = (OfInt) LAYOUT.select(PATH$postMergeIndex);

    public static final long OFFSET$subpassMergeStatus = LAYOUT.byteOffset(PATH$subpassMergeStatus);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$postMergeIndex = LAYOUT.byteOffset(PATH$postMergeIndex);

    public VkRenderPassSubpassFeedbackInfoEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkSubpassMergeStatusEXT.class) int subpassMergeStatus() {
        return segment.get(LAYOUT$subpassMergeStatus, OFFSET$subpassMergeStatus);
    }

    public void subpassMergeStatus(@enumtype(VkSubpassMergeStatusEXT.class) int value) {
        segment.set(LAYOUT$subpassMergeStatus, OFFSET$subpassMergeStatus, value);
    }

    public MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, LAYOUT$description.byteSize());
    }
        
    public ByteArray description(int index) {
        return new ByteArray(descriptionRaw(), LAYOUT$description.elementCount());
    }
    
    public void description(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, LAYOUT$description.byteSize());
    }

    public @unsigned int postMergeIndex() {
        return segment.get(LAYOUT$postMergeIndex, OFFSET$postMergeIndex);
    }

    public void postMergeIndex(@unsigned int value) {
        segment.set(LAYOUT$postMergeIndex, OFFSET$postMergeIndex, value);
    }


    public static final class VkRenderPassSubpassFeedbackInfoEXTFactory implements IDataTypeFactory<VkRenderPassSubpassFeedbackInfoEXT> {
        @Override
        public Class<VkRenderPassSubpassFeedbackInfoEXT> clazz() {
            return VkRenderPassSubpassFeedbackInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderPassSubpassFeedbackInfoEXT.LAYOUT;
        }

        @Override
        public VkRenderPassSubpassFeedbackInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRenderPassSubpassFeedbackInfoEXT createUninit(MemorySegment segment) {
            return new VkRenderPassSubpassFeedbackInfoEXT(segment);
        }
    }

    public static final VkRenderPassSubpassFeedbackInfoEXTFactory FACTORY = new VkRenderPassSubpassFeedbackInfoEXTFactory();
}
