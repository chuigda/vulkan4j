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

public record VkPipelineColorBlendAttachmentState(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("blendEnable"),
        ValueLayout.JAVA_INT.withName("srcColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("colorBlendOp"),
        ValueLayout.JAVA_INT.withName("srcAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("alphaBlendOp"),
        ValueLayout.JAVA_INT.withName("colorWriteMask")
    );

    public static final PathElement PATH$blendEnable = PathElement.groupElement(0);
    public static final PathElement PATH$srcColorBlendFactor = PathElement.groupElement(1);
    public static final PathElement PATH$dstColorBlendFactor = PathElement.groupElement(2);
    public static final PathElement PATH$colorBlendOp = PathElement.groupElement(3);
    public static final PathElement PATH$srcAlphaBlendFactor = PathElement.groupElement(4);
    public static final PathElement PATH$dstAlphaBlendFactor = PathElement.groupElement(5);
    public static final PathElement PATH$alphaBlendOp = PathElement.groupElement(6);
    public static final PathElement PATH$colorWriteMask = PathElement.groupElement(7);

    public static final OfInt LAYOUT$blendEnable = (OfInt) LAYOUT.select(PATH$blendEnable);
    public static final OfInt LAYOUT$srcColorBlendFactor = (OfInt) LAYOUT.select(PATH$srcColorBlendFactor);
    public static final OfInt LAYOUT$dstColorBlendFactor = (OfInt) LAYOUT.select(PATH$dstColorBlendFactor);
    public static final OfInt LAYOUT$colorBlendOp = (OfInt) LAYOUT.select(PATH$colorBlendOp);
    public static final OfInt LAYOUT$srcAlphaBlendFactor = (OfInt) LAYOUT.select(PATH$srcAlphaBlendFactor);
    public static final OfInt LAYOUT$dstAlphaBlendFactor = (OfInt) LAYOUT.select(PATH$dstAlphaBlendFactor);
    public static final OfInt LAYOUT$alphaBlendOp = (OfInt) LAYOUT.select(PATH$alphaBlendOp);
    public static final OfInt LAYOUT$colorWriteMask = (OfInt) LAYOUT.select(PATH$colorWriteMask);

    public static final long OFFSET$blendEnable = LAYOUT.byteOffset(PATH$blendEnable);
    public static final long OFFSET$srcColorBlendFactor = LAYOUT.byteOffset(PATH$srcColorBlendFactor);
    public static final long OFFSET$dstColorBlendFactor = LAYOUT.byteOffset(PATH$dstColorBlendFactor);
    public static final long OFFSET$colorBlendOp = LAYOUT.byteOffset(PATH$colorBlendOp);
    public static final long OFFSET$srcAlphaBlendFactor = LAYOUT.byteOffset(PATH$srcAlphaBlendFactor);
    public static final long OFFSET$dstAlphaBlendFactor = LAYOUT.byteOffset(PATH$dstAlphaBlendFactor);
    public static final long OFFSET$alphaBlendOp = LAYOUT.byteOffset(PATH$alphaBlendOp);
    public static final long OFFSET$colorWriteMask = LAYOUT.byteOffset(PATH$colorWriteMask);

    public VkPipelineColorBlendAttachmentState(MemorySegment segment) {
        this.segment = segment;
    }

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


    public static final class VkPipelineColorBlendAttachmentStateFactory implements IDataTypeFactory<VkPipelineColorBlendAttachmentState> {
        @Override
        public Class<VkPipelineColorBlendAttachmentState> clazz() {
            return VkPipelineColorBlendAttachmentState.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineColorBlendAttachmentState.LAYOUT;
        }

        @Override
        public VkPipelineColorBlendAttachmentState create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineColorBlendAttachmentState createUninit(MemorySegment segment) {
            return new VkPipelineColorBlendAttachmentState(segment);
        }
    }

    public static final VkPipelineColorBlendAttachmentStateFactory FACTORY = new VkPipelineColorBlendAttachmentStateFactory();
}