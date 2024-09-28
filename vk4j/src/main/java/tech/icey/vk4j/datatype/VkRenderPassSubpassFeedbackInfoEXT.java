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
/// typedef struct VkRenderPassSubpassFeedbackInfoEXT {
///     VkSubpassMergeStatusEXT subpassMergeStatus;
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     uint32_t postMergeIndex;
/// } VkRenderPassSubpassFeedbackInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRenderPassSubpassFeedbackInfoEXT.html">VkRenderPassSubpassFeedbackInfoEXT</a>
public record VkRenderPassSubpassFeedbackInfoEXT(MemorySegment segment) implements IPointer {
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
        return segment.asSlice(OFFSET$description, SIZE$description);
    }

    public ByteBuffer description() {
        return new ByteBuffer(descriptionRaw());
    }

    public void description(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, SIZE$description);
    }

    public @unsigned int postMergeIndex() {
        return segment.get(LAYOUT$postMergeIndex, OFFSET$postMergeIndex);
    }

    public void postMergeIndex(@unsigned int value) {
        segment.set(LAYOUT$postMergeIndex, OFFSET$postMergeIndex, value);
    }

    public static VkRenderPassSubpassFeedbackInfoEXT allocate(Arena arena) {
        return new VkRenderPassSubpassFeedbackInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkRenderPassSubpassFeedbackInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassSubpassFeedbackInfoEXT[] ret = new VkRenderPassSubpassFeedbackInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderPassSubpassFeedbackInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("subpassMergeStatus"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("postMergeIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$subpassMergeStatus = PathElement.groupElement("subpassMergeStatus");
    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$postMergeIndex = PathElement.groupElement("postMergeIndex");

    public static final OfInt LAYOUT$subpassMergeStatus = (OfInt) LAYOUT.select(PATH$subpassMergeStatus);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final OfInt LAYOUT$postMergeIndex = (OfInt) LAYOUT.select(PATH$postMergeIndex);

    public static final long OFFSET$subpassMergeStatus = LAYOUT.byteOffset(PATH$subpassMergeStatus);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$postMergeIndex = LAYOUT.byteOffset(PATH$postMergeIndex);

    public static final long SIZE$subpassMergeStatus = LAYOUT$subpassMergeStatus.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$postMergeIndex = LAYOUT$postMergeIndex.byteSize();

}
