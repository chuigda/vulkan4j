package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
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

    public static VkRenderPassCreationFeedbackInfoEXT allocate(Arena arena) {
        return new VkRenderPassCreationFeedbackInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkRenderPassCreationFeedbackInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassCreationFeedbackInfoEXT[] ret = new VkRenderPassCreationFeedbackInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderPassCreationFeedbackInfoEXT(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
