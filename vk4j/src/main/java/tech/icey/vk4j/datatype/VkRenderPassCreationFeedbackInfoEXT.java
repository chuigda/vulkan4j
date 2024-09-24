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

public record VkRenderPassCreationFeedbackInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("postMergeSubpassCount")
    );

    public static final PathElement PATH$postMergeSubpassCount = PathElement.groupElement("postMergeSubpassCount");

    public static final OfInt LAYOUT$postMergeSubpassCount = (OfInt) LAYOUT.select(PATH$postMergeSubpassCount);

    public static final long OFFSET$postMergeSubpassCount = LAYOUT.byteOffset(PATH$postMergeSubpassCount);

    public VkRenderPassCreationFeedbackInfoEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int postMergeSubpassCount() {
        return segment.get(LAYOUT$postMergeSubpassCount, OFFSET$postMergeSubpassCount);
    }

    public void postMergeSubpassCount(@unsigned int value) {
        segment.set(LAYOUT$postMergeSubpassCount, OFFSET$postMergeSubpassCount, value);
    }


    public static final class Factory implements IFactory<VkRenderPassCreationFeedbackInfoEXT> {
        @Override
        public Class<VkRenderPassCreationFeedbackInfoEXT> clazz() {
            return VkRenderPassCreationFeedbackInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderPassCreationFeedbackInfoEXT.LAYOUT;
        }

        @Override
        public VkRenderPassCreationFeedbackInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkRenderPassCreationFeedbackInfoEXT createUninit(MemorySegment segment) {
            return new VkRenderPassCreationFeedbackInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
