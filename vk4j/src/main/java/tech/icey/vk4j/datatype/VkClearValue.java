package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.UnionLayout;

import static java.lang.foreign.ValueLayout.PathElement;

public record VkClearValue(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.unionLayout(
        VkClearColorValue.LAYOUT.withName("color"),
        VkClearDepthStencilValue.LAYOUT.withName("depthStencil")
    );

    public static final PathElement PATH$color = PathElement.groupElement("color");
    public static final PathElement PATH$depthStencil = PathElement.groupElement("depthStencil");

    public static final UnionLayout LAYOUT$color = (UnionLayout) LAYOUT.select(PATH$color);
    public static final StructLayout LAYOUT$depthStencil = (StructLayout) LAYOUT.select(PATH$depthStencil);

    public static final long OFFSET$color = LAYOUT.byteOffset(PATH$color);
    public static final long OFFSET$depthStencil = LAYOUT.byteOffset(PATH$depthStencil);

    public VkClearValue(MemorySegment segment) {
        this.segment = segment;
    }

    public VkClearColorValue color() {
        return new VkClearColorValue(segment.asSlice(OFFSET$color, LAYOUT$color));
    }

    public void color(VkClearColorValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$color, LAYOUT$color.byteSize());
    }

    public VkClearDepthStencilValue depthStencil() {
        return new VkClearDepthStencilValue(segment.asSlice(OFFSET$depthStencil, LAYOUT$depthStencil));
    }

    public void depthStencil(VkClearDepthStencilValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$depthStencil, LAYOUT$depthStencil.byteSize());
    }


    public static final class Factory implements IFactory<VkClearValue> {
        @Override
        public Class<VkClearValue> clazz() {
            return VkClearValue.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkClearValue.LAYOUT;
        }

        @Override
        public VkClearValue create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkClearValue createUninit(MemorySegment segment) {
            return new VkClearValue(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
