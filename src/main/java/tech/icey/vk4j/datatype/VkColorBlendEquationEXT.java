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

public record VkColorBlendEquationEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("srcColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstColorBlendFactor"),
        ValueLayout.JAVA_INT.withName("colorBlendOp"),
        ValueLayout.JAVA_INT.withName("srcAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("dstAlphaBlendFactor"),
        ValueLayout.JAVA_INT.withName("alphaBlendOp")
    );

    public static final PathElement PATH$srcColorBlendFactor = PathElement.groupElement("srcColorBlendFactor");
    public static final PathElement PATH$dstColorBlendFactor = PathElement.groupElement("dstColorBlendFactor");
    public static final PathElement PATH$colorBlendOp = PathElement.groupElement("colorBlendOp");
    public static final PathElement PATH$srcAlphaBlendFactor = PathElement.groupElement("srcAlphaBlendFactor");
    public static final PathElement PATH$dstAlphaBlendFactor = PathElement.groupElement("dstAlphaBlendFactor");
    public static final PathElement PATH$alphaBlendOp = PathElement.groupElement("alphaBlendOp");

    public static final OfInt LAYOUT$srcColorBlendFactor = (OfInt) LAYOUT.select(PATH$srcColorBlendFactor);
    public static final OfInt LAYOUT$dstColorBlendFactor = (OfInt) LAYOUT.select(PATH$dstColorBlendFactor);
    public static final OfInt LAYOUT$colorBlendOp = (OfInt) LAYOUT.select(PATH$colorBlendOp);
    public static final OfInt LAYOUT$srcAlphaBlendFactor = (OfInt) LAYOUT.select(PATH$srcAlphaBlendFactor);
    public static final OfInt LAYOUT$dstAlphaBlendFactor = (OfInt) LAYOUT.select(PATH$dstAlphaBlendFactor);
    public static final OfInt LAYOUT$alphaBlendOp = (OfInt) LAYOUT.select(PATH$alphaBlendOp);

    public static final long OFFSET$srcColorBlendFactor = LAYOUT.byteOffset(PATH$srcColorBlendFactor);
    public static final long OFFSET$dstColorBlendFactor = LAYOUT.byteOffset(PATH$dstColorBlendFactor);
    public static final long OFFSET$colorBlendOp = LAYOUT.byteOffset(PATH$colorBlendOp);
    public static final long OFFSET$srcAlphaBlendFactor = LAYOUT.byteOffset(PATH$srcAlphaBlendFactor);
    public static final long OFFSET$dstAlphaBlendFactor = LAYOUT.byteOffset(PATH$dstAlphaBlendFactor);
    public static final long OFFSET$alphaBlendOp = LAYOUT.byteOffset(PATH$alphaBlendOp);

    public VkColorBlendEquationEXT(MemorySegment segment) {
        this.segment = segment;
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


    public static final class VkColorBlendEquationEXTFactory implements IDataTypeFactory<VkColorBlendEquationEXT> {
        @Override
        public Class<VkColorBlendEquationEXT> clazz() {
            return VkColorBlendEquationEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkColorBlendEquationEXT.LAYOUT;
        }

        @Override
        public VkColorBlendEquationEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkColorBlendEquationEXT createUninit(MemorySegment segment) {
            return new VkColorBlendEquationEXT(segment);
        }
    }

    public static final VkColorBlendEquationEXTFactory FACTORY = new VkColorBlendEquationEXTFactory();
}
