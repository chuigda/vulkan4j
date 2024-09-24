package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkColorBlendAdvancedEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("advancedBlendOp"),
        ValueLayout.JAVA_INT.withName("srcPremultiplied"),
        ValueLayout.JAVA_INT.withName("dstPremultiplied"),
        ValueLayout.JAVA_INT.withName("blendOverlap"),
        ValueLayout.JAVA_INT.withName("clampResults")
    );

    public static final PathElement PATH$advancedBlendOp = PathElement.groupElement("advancedBlendOp");
    public static final PathElement PATH$srcPremultiplied = PathElement.groupElement("srcPremultiplied");
    public static final PathElement PATH$dstPremultiplied = PathElement.groupElement("dstPremultiplied");
    public static final PathElement PATH$blendOverlap = PathElement.groupElement("blendOverlap");
    public static final PathElement PATH$clampResults = PathElement.groupElement("clampResults");

    public static final OfInt LAYOUT$advancedBlendOp = (OfInt) LAYOUT.select(PATH$advancedBlendOp);
    public static final OfInt LAYOUT$srcPremultiplied = (OfInt) LAYOUT.select(PATH$srcPremultiplied);
    public static final OfInt LAYOUT$dstPremultiplied = (OfInt) LAYOUT.select(PATH$dstPremultiplied);
    public static final OfInt LAYOUT$blendOverlap = (OfInt) LAYOUT.select(PATH$blendOverlap);
    public static final OfInt LAYOUT$clampResults = (OfInt) LAYOUT.select(PATH$clampResults);

    public static final long OFFSET$advancedBlendOp = LAYOUT.byteOffset(PATH$advancedBlendOp);
    public static final long OFFSET$srcPremultiplied = LAYOUT.byteOffset(PATH$srcPremultiplied);
    public static final long OFFSET$dstPremultiplied = LAYOUT.byteOffset(PATH$dstPremultiplied);
    public static final long OFFSET$blendOverlap = LAYOUT.byteOffset(PATH$blendOverlap);
    public static final long OFFSET$clampResults = LAYOUT.byteOffset(PATH$clampResults);

    public VkColorBlendAdvancedEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkBlendOp.class) int advancedBlendOp() {
        return segment.get(LAYOUT$advancedBlendOp, OFFSET$advancedBlendOp);
    }

    public void advancedBlendOp(@enumtype(VkBlendOp.class) int value) {
        segment.set(LAYOUT$advancedBlendOp, OFFSET$advancedBlendOp, value);
    }

    public @unsigned int srcPremultiplied() {
        return segment.get(LAYOUT$srcPremultiplied, OFFSET$srcPremultiplied);
    }

    public void srcPremultiplied(@unsigned int value) {
        segment.set(LAYOUT$srcPremultiplied, OFFSET$srcPremultiplied, value);
    }

    public @unsigned int dstPremultiplied() {
        return segment.get(LAYOUT$dstPremultiplied, OFFSET$dstPremultiplied);
    }

    public void dstPremultiplied(@unsigned int value) {
        segment.set(LAYOUT$dstPremultiplied, OFFSET$dstPremultiplied, value);
    }

    public @enumtype(VkBlendOverlapEXT.class) int blendOverlap() {
        return segment.get(LAYOUT$blendOverlap, OFFSET$blendOverlap);
    }

    public void blendOverlap(@enumtype(VkBlendOverlapEXT.class) int value) {
        segment.set(LAYOUT$blendOverlap, OFFSET$blendOverlap, value);
    }

    public @unsigned int clampResults() {
        return segment.get(LAYOUT$clampResults, OFFSET$clampResults);
    }

    public void clampResults(@unsigned int value) {
        segment.set(LAYOUT$clampResults, OFFSET$clampResults, value);
    }


    public static final class Factory implements IFactory<VkColorBlendAdvancedEXT> {
        @Override
        public Class<VkColorBlendAdvancedEXT> clazz() {
            return VkColorBlendAdvancedEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkColorBlendAdvancedEXT.LAYOUT;
        }

        @Override
        public VkColorBlendAdvancedEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkColorBlendAdvancedEXT createUninit(MemorySegment segment) {
            return new VkColorBlendAdvancedEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
