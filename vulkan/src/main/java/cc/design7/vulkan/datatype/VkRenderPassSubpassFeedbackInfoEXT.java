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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderPassSubpassFeedbackInfoEXT.html">VkRenderPassSubpassFeedbackInfoEXT</a>
@ValueBasedCandidate
public record VkRenderPassSubpassFeedbackInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$subpassMergeStatus = ValueLayout.JAVA_INT.withName("subpassMergeStatus");
    public static final OfByte LAYOUT$description = ValueLayout.JAVA_BYTE.withName("description");
    public static final OfInt LAYOUT$postMergeIndex = ValueLayout.JAVA_INT.withName("postMergeIndex");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$subpassMergeStatus, LAYOUT$description, LAYOUT$postMergeIndex);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRenderPassSubpassFeedbackInfoEXT allocate(Arena arena) {
        return new VkRenderPassSubpassFeedbackInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkRenderPassSubpassFeedbackInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassSubpassFeedbackInfoEXT[] ret = new VkRenderPassSubpassFeedbackInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderPassSubpassFeedbackInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderPassSubpassFeedbackInfoEXT clone(Arena arena, VkRenderPassSubpassFeedbackInfoEXT src) {
        VkRenderPassSubpassFeedbackInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderPassSubpassFeedbackInfoEXT[] clone(Arena arena, VkRenderPassSubpassFeedbackInfoEXT[] src) {
        VkRenderPassSubpassFeedbackInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$subpassMergeStatus = PathElement.groupElement("PATH$subpassMergeStatus");
    public static final PathElement PATH$description = PathElement.groupElement("PATH$description");
    public static final PathElement PATH$postMergeIndex = PathElement.groupElement("PATH$postMergeIndex");

    public static final long SIZE$subpassMergeStatus = LAYOUT$subpassMergeStatus.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$postMergeIndex = LAYOUT$postMergeIndex.byteSize();

    public static final long OFFSET$subpassMergeStatus = LAYOUT.byteOffset(PATH$subpassMergeStatus);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$postMergeIndex = LAYOUT.byteOffset(PATH$postMergeIndex);

    public @enumtype(VkSubpassMergeStatusEXT.class) int subpassMergeStatus() {
        return segment.get(LAYOUT$subpassMergeStatus, OFFSET$subpassMergeStatus);
    }

    public void subpassMergeStatus(@enumtype(VkSubpassMergeStatusEXT.class) int value) {
        segment.set(LAYOUT$subpassMergeStatus, OFFSET$subpassMergeStatus, value);
    }

    public byte description() {
        return segment.get(LAYOUT$description, OFFSET$description);
    }

    public void description(byte value) {
        segment.set(LAYOUT$description, OFFSET$description, value);
    }

    public @unsigned int postMergeIndex() {
        return segment.get(LAYOUT$postMergeIndex, OFFSET$postMergeIndex);
    }

    public void postMergeIndex(@unsigned int value) {
        segment.set(LAYOUT$postMergeIndex, OFFSET$postMergeIndex, value);
    }

}
