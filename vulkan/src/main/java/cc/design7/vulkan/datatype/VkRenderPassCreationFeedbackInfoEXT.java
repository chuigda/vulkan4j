package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkRenderPassCreationFeedbackInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$postMergeSubpassCount = ValueLayout.JAVA_INT.withName("postMergeSubpassCount");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$postMergeSubpassCount);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRenderPassCreationFeedbackInfoEXT allocate(Arena arena) {
        return new VkRenderPassCreationFeedbackInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkRenderPassCreationFeedbackInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassCreationFeedbackInfoEXT[] ret = new VkRenderPassCreationFeedbackInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassCreationFeedbackInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderPassCreationFeedbackInfoEXT clone(Arena arena, VkRenderPassCreationFeedbackInfoEXT src) {
        VkRenderPassCreationFeedbackInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassCreationFeedbackInfoEXT[] clone(Arena arena, VkRenderPassCreationFeedbackInfoEXT[] src) {
        VkRenderPassCreationFeedbackInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$postMergeSubpassCount = PathElement.groupElement("PATH$postMergeSubpassCount");

    public static final long SIZE$postMergeSubpassCount = LAYOUT$postMergeSubpassCount.byteSize();

    public static final long OFFSET$postMergeSubpassCount = LAYOUT.byteOffset(PATH$postMergeSubpassCount);

    public @unsigned int postMergeSubpassCount() {
        return segment.get(LAYOUT$postMergeSubpassCount, OFFSET$postMergeSubpassCount);
    }

    public void postMergeSubpassCount(@unsigned int value) {
        segment.set(LAYOUT$postMergeSubpassCount, OFFSET$postMergeSubpassCount, value);
    }

}
/// dummy, not implemented yet
