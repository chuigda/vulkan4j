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

public record VkClearDepthStencilValue(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("depth"),
        ValueLayout.JAVA_INT.withName("stencil")
    );

    public static final PathElement PATH$depth = PathElement.groupElement("depth");
    public static final PathElement PATH$stencil = PathElement.groupElement("stencil");

    public static final OfFloat LAYOUT$depth = (OfFloat) LAYOUT.select(PATH$depth);
    public static final OfInt LAYOUT$stencil = (OfInt) LAYOUT.select(PATH$stencil);

    public static final long OFFSET$depth = LAYOUT.byteOffset(PATH$depth);
    public static final long OFFSET$stencil = LAYOUT.byteOffset(PATH$stencil);

    public VkClearDepthStencilValue(MemorySegment segment) {
        this.segment = segment;
    }

    public float depth() {
        return segment.get(LAYOUT$depth, OFFSET$depth);
    }

    public void depth(float value) {
        segment.set(LAYOUT$depth, OFFSET$depth, value);
    }

    public @unsigned int stencil() {
        return segment.get(LAYOUT$stencil, OFFSET$stencil);
    }

    public void stencil(@unsigned int value) {
        segment.set(LAYOUT$stencil, OFFSET$stencil, value);
    }


    public static final class Factory implements IFactory<VkClearDepthStencilValue> {
        @Override
        public Class<VkClearDepthStencilValue> clazz() {
            return VkClearDepthStencilValue.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkClearDepthStencilValue.LAYOUT;
        }

        @Override
        public VkClearDepthStencilValue create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkClearDepthStencilValue createUninit(MemorySegment segment) {
            return new VkClearDepthStencilValue(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
