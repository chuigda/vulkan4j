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

public record VkPipelineColorBlendAttachmentState(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$blendEnable = ValueLayout.JAVA_INT.withName("blendEnable");
    public static final OfInt LAYOUT$srcColorBlendFactor = ValueLayout.JAVA_INT.withName("srcColorBlendFactor");
    public static final OfInt LAYOUT$dstColorBlendFactor = ValueLayout.JAVA_INT.withName("dstColorBlendFactor");
    public static final OfInt LAYOUT$colorBlendOp = ValueLayout.JAVA_INT.withName("colorBlendOp");
    public static final OfInt LAYOUT$srcAlphaBlendFactor = ValueLayout.JAVA_INT.withName("srcAlphaBlendFactor");
    public static final OfInt LAYOUT$dstAlphaBlendFactor = ValueLayout.JAVA_INT.withName("dstAlphaBlendFactor");
    public static final OfInt LAYOUT$alphaBlendOp = ValueLayout.JAVA_INT.withName("alphaBlendOp");
    public static final OfInt LAYOUT$colorWriteMask = ValueLayout.JAVA_INT.withName("colorWriteMask");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$blendEnable, LAYOUT$srcColorBlendFactor, LAYOUT$dstColorBlendFactor, LAYOUT$colorBlendOp, LAYOUT$srcAlphaBlendFactor, LAYOUT$dstAlphaBlendFactor, LAYOUT$alphaBlendOp, LAYOUT$colorWriteMask);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineColorBlendAttachmentState allocate(Arena arena) {
        return new VkPipelineColorBlendAttachmentState(arena.allocate(LAYOUT));
    }

    public static VkPipelineColorBlendAttachmentState[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineColorBlendAttachmentState[] ret = new VkPipelineColorBlendAttachmentState[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineColorBlendAttachmentState(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineColorBlendAttachmentState clone(Arena arena, VkPipelineColorBlendAttachmentState src) {
        VkPipelineColorBlendAttachmentState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineColorBlendAttachmentState[] clone(Arena arena, VkPipelineColorBlendAttachmentState[] src) {
        VkPipelineColorBlendAttachmentState[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$blendEnable = PathElement.groupElement("PATH$blendEnable");
    public static final PathElement PATH$srcColorBlendFactor = PathElement.groupElement("PATH$srcColorBlendFactor");
    public static final PathElement PATH$dstColorBlendFactor = PathElement.groupElement("PATH$dstColorBlendFactor");
    public static final PathElement PATH$colorBlendOp = PathElement.groupElement("PATH$colorBlendOp");
    public static final PathElement PATH$srcAlphaBlendFactor = PathElement.groupElement("PATH$srcAlphaBlendFactor");
    public static final PathElement PATH$dstAlphaBlendFactor = PathElement.groupElement("PATH$dstAlphaBlendFactor");
    public static final PathElement PATH$alphaBlendOp = PathElement.groupElement("PATH$alphaBlendOp");
    public static final PathElement PATH$colorWriteMask = PathElement.groupElement("PATH$colorWriteMask");

    public static final long SIZE$blendEnable = LAYOUT$blendEnable.byteSize();
    public static final long SIZE$srcColorBlendFactor = LAYOUT$srcColorBlendFactor.byteSize();
    public static final long SIZE$dstColorBlendFactor = LAYOUT$dstColorBlendFactor.byteSize();
    public static final long SIZE$colorBlendOp = LAYOUT$colorBlendOp.byteSize();
    public static final long SIZE$srcAlphaBlendFactor = LAYOUT$srcAlphaBlendFactor.byteSize();
    public static final long SIZE$dstAlphaBlendFactor = LAYOUT$dstAlphaBlendFactor.byteSize();
    public static final long SIZE$alphaBlendOp = LAYOUT$alphaBlendOp.byteSize();
    public static final long SIZE$colorWriteMask = LAYOUT$colorWriteMask.byteSize();

    public static final long OFFSET$blendEnable = LAYOUT.byteOffset(PATH$blendEnable);
    public static final long OFFSET$srcColorBlendFactor = LAYOUT.byteOffset(PATH$srcColorBlendFactor);
    public static final long OFFSET$dstColorBlendFactor = LAYOUT.byteOffset(PATH$dstColorBlendFactor);
    public static final long OFFSET$colorBlendOp = LAYOUT.byteOffset(PATH$colorBlendOp);
    public static final long OFFSET$srcAlphaBlendFactor = LAYOUT.byteOffset(PATH$srcAlphaBlendFactor);
    public static final long OFFSET$dstAlphaBlendFactor = LAYOUT.byteOffset(PATH$dstAlphaBlendFactor);
    public static final long OFFSET$alphaBlendOp = LAYOUT.byteOffset(PATH$alphaBlendOp);
    public static final long OFFSET$colorWriteMask = LAYOUT.byteOffset(PATH$colorWriteMask);

    public @unsigned int blendEnable() {
        return segment.get(LAYOUT$blendEnable, OFFSET$blendEnable);
    }

    public void blendEnable(@unsigned int value) {
        segment.set(LAYOUT$blendEnable, OFFSET$blendEnable, value);
    }

    public @enumtype(VkBlendFactor.class) int srcColorBlendFactor() {
        return segment.get(LAYOUT$srcColorBlendFactor, OFFSET$srcColorBlendFactor);
    }

    public void srcColorBlendFactor(@enumtype(VkBlendFactor.class) int value) {
        segment.set(LAYOUT$srcColorBlendFactor, OFFSET$srcColorBlendFactor, value);
    }

    public @enumtype(VkBlendFactor.class) int dstColorBlendFactor() {
        return segment.get(LAYOUT$dstColorBlendFactor, OFFSET$dstColorBlendFactor);
    }

    public void dstColorBlendFactor(@enumtype(VkBlendFactor.class) int value) {
        segment.set(LAYOUT$dstColorBlendFactor, OFFSET$dstColorBlendFactor, value);
    }

    public @enumtype(VkBlendOp.class) int colorBlendOp() {
        return segment.get(LAYOUT$colorBlendOp, OFFSET$colorBlendOp);
    }

    public void colorBlendOp(@enumtype(VkBlendOp.class) int value) {
        segment.set(LAYOUT$colorBlendOp, OFFSET$colorBlendOp, value);
    }

    public @enumtype(VkBlendFactor.class) int srcAlphaBlendFactor() {
        return segment.get(LAYOUT$srcAlphaBlendFactor, OFFSET$srcAlphaBlendFactor);
    }

    public void srcAlphaBlendFactor(@enumtype(VkBlendFactor.class) int value) {
        segment.set(LAYOUT$srcAlphaBlendFactor, OFFSET$srcAlphaBlendFactor, value);
    }

    public @enumtype(VkBlendFactor.class) int dstAlphaBlendFactor() {
        return segment.get(LAYOUT$dstAlphaBlendFactor, OFFSET$dstAlphaBlendFactor);
    }

    public void dstAlphaBlendFactor(@enumtype(VkBlendFactor.class) int value) {
        segment.set(LAYOUT$dstAlphaBlendFactor, OFFSET$dstAlphaBlendFactor, value);
    }

    public @enumtype(VkBlendOp.class) int alphaBlendOp() {
        return segment.get(LAYOUT$alphaBlendOp, OFFSET$alphaBlendOp);
    }

    public void alphaBlendOp(@enumtype(VkBlendOp.class) int value) {
        segment.set(LAYOUT$alphaBlendOp, OFFSET$alphaBlendOp, value);
    }

    public @enumtype(VkColorComponentFlags.class) int colorWriteMask() {
        return segment.get(LAYOUT$colorWriteMask, OFFSET$colorWriteMask);
    }

    public void colorWriteMask(@enumtype(VkColorComponentFlags.class) int value) {
        segment.set(LAYOUT$colorWriteMask, OFFSET$colorWriteMask, value);
    }

}
/// dummy, not implemented yet
