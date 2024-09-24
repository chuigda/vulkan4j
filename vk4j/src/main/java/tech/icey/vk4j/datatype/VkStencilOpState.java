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

public record VkStencilOpState(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("failOp"),
        ValueLayout.JAVA_INT.withName("passOp"),
        ValueLayout.JAVA_INT.withName("depthFailOp"),
        ValueLayout.JAVA_INT.withName("compareOp"),
        ValueLayout.JAVA_INT.withName("compareMask"),
        ValueLayout.JAVA_INT.withName("writeMask"),
        ValueLayout.JAVA_INT.withName("reference")
    );

    public static final PathElement PATH$failOp = PathElement.groupElement("failOp");
    public static final PathElement PATH$passOp = PathElement.groupElement("passOp");
    public static final PathElement PATH$depthFailOp = PathElement.groupElement("depthFailOp");
    public static final PathElement PATH$compareOp = PathElement.groupElement("compareOp");
    public static final PathElement PATH$compareMask = PathElement.groupElement("compareMask");
    public static final PathElement PATH$writeMask = PathElement.groupElement("writeMask");
    public static final PathElement PATH$reference = PathElement.groupElement("reference");

    public static final OfInt LAYOUT$failOp = (OfInt) LAYOUT.select(PATH$failOp);
    public static final OfInt LAYOUT$passOp = (OfInt) LAYOUT.select(PATH$passOp);
    public static final OfInt LAYOUT$depthFailOp = (OfInt) LAYOUT.select(PATH$depthFailOp);
    public static final OfInt LAYOUT$compareOp = (OfInt) LAYOUT.select(PATH$compareOp);
    public static final OfInt LAYOUT$compareMask = (OfInt) LAYOUT.select(PATH$compareMask);
    public static final OfInt LAYOUT$writeMask = (OfInt) LAYOUT.select(PATH$writeMask);
    public static final OfInt LAYOUT$reference = (OfInt) LAYOUT.select(PATH$reference);

    public static final long OFFSET$failOp = LAYOUT.byteOffset(PATH$failOp);
    public static final long OFFSET$passOp = LAYOUT.byteOffset(PATH$passOp);
    public static final long OFFSET$depthFailOp = LAYOUT.byteOffset(PATH$depthFailOp);
    public static final long OFFSET$compareOp = LAYOUT.byteOffset(PATH$compareOp);
    public static final long OFFSET$compareMask = LAYOUT.byteOffset(PATH$compareMask);
    public static final long OFFSET$writeMask = LAYOUT.byteOffset(PATH$writeMask);
    public static final long OFFSET$reference = LAYOUT.byteOffset(PATH$reference);

    public VkStencilOpState(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkStencilOp.class) int failOp() {
        return segment.get(LAYOUT$failOp, OFFSET$failOp);
    }

    public void failOp(@enumtype(VkStencilOp.class) int value) {
        segment.set(LAYOUT$failOp, OFFSET$failOp, value);
    }

    public @enumtype(VkStencilOp.class) int passOp() {
        return segment.get(LAYOUT$passOp, OFFSET$passOp);
    }

    public void passOp(@enumtype(VkStencilOp.class) int value) {
        segment.set(LAYOUT$passOp, OFFSET$passOp, value);
    }

    public @enumtype(VkStencilOp.class) int depthFailOp() {
        return segment.get(LAYOUT$depthFailOp, OFFSET$depthFailOp);
    }

    public void depthFailOp(@enumtype(VkStencilOp.class) int value) {
        segment.set(LAYOUT$depthFailOp, OFFSET$depthFailOp, value);
    }

    public @enumtype(VkCompareOp.class) int compareOp() {
        return segment.get(LAYOUT$compareOp, OFFSET$compareOp);
    }

    public void compareOp(@enumtype(VkCompareOp.class) int value) {
        segment.set(LAYOUT$compareOp, OFFSET$compareOp, value);
    }

    public @unsigned int compareMask() {
        return segment.get(LAYOUT$compareMask, OFFSET$compareMask);
    }

    public void compareMask(@unsigned int value) {
        segment.set(LAYOUT$compareMask, OFFSET$compareMask, value);
    }

    public @unsigned int writeMask() {
        return segment.get(LAYOUT$writeMask, OFFSET$writeMask);
    }

    public void writeMask(@unsigned int value) {
        segment.set(LAYOUT$writeMask, OFFSET$writeMask, value);
    }

    public @unsigned int reference() {
        return segment.get(LAYOUT$reference, OFFSET$reference);
    }

    public void reference(@unsigned int value) {
        segment.set(LAYOUT$reference, OFFSET$reference, value);
    }


    public static final class VkStencilOpStateFactory implements IFactory<VkStencilOpState> {
        @Override
        public Class<VkStencilOpState> clazz() {
            return VkStencilOpState.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkStencilOpState.LAYOUT;
        }

        @Override
        public VkStencilOpState create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkStencilOpState createUninit(MemorySegment segment) {
            return new VkStencilOpState(segment);
        }
    }

    public static final VkStencilOpStateFactory FACTORY = new VkStencilOpStateFactory();
}
