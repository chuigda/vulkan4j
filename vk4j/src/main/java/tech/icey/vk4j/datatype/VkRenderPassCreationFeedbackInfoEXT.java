package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkRenderPassCreationFeedbackInfoEXT {
///     uint32_t postMergeSubpassCount;
/// } VkRenderPassCreationFeedbackInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRenderPassCreationFeedbackInfoEXT.html">VkRenderPassCreationFeedbackInfoEXT</a>
public record VkRenderPassCreationFeedbackInfoEXT(MemorySegment segment) implements IPointer {
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
            ret[i] = new VkRenderPassCreationFeedbackInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("postMergeSubpassCount")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$postMergeSubpassCount = PathElement.groupElement("postMergeSubpassCount");

    public static final OfInt LAYOUT$postMergeSubpassCount = (OfInt) LAYOUT.select(PATH$postMergeSubpassCount);

    public static final long OFFSET$postMergeSubpassCount = LAYOUT.byteOffset(PATH$postMergeSubpassCount);

    public static final long SIZE$postMergeSubpassCount = LAYOUT$postMergeSubpassCount.byteSize();
}
