package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkClearRect(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkRect2D.LAYOUT.withName("rect"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("layerCount")
    );

    public static final PathElement PATH$rect = PathElement.groupElement("rect");
    public static final PathElement PATH$baseArrayLayer = PathElement.groupElement("baseArrayLayer");
    public static final PathElement PATH$layerCount = PathElement.groupElement("layerCount");

    public static final StructLayout LAYOUT$rect = (StructLayout) LAYOUT.select(PATH$rect);
    public static final OfInt LAYOUT$baseArrayLayer = (OfInt) LAYOUT.select(PATH$baseArrayLayer);
    public static final OfInt LAYOUT$layerCount = (OfInt) LAYOUT.select(PATH$layerCount);

    public static final long OFFSET$rect = LAYOUT.byteOffset(PATH$rect);
    public static final long OFFSET$baseArrayLayer = LAYOUT.byteOffset(PATH$baseArrayLayer);
    public static final long OFFSET$layerCount = LAYOUT.byteOffset(PATH$layerCount);

    public VkClearRect(MemorySegment segment) {
        this.segment = segment;
    }

    public VkRect2D rect() {
        return new VkRect2D(segment.asSlice(OFFSET$rect, LAYOUT$rect));
    }

    public void rect(VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$rect, LAYOUT$rect.byteSize());
    }

    public @unsigned int baseArrayLayer() {
        return segment.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);
    }

    public void baseArrayLayer(@unsigned int value) {
        segment.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);
    }

    public @unsigned int layerCount() {
        return segment.get(LAYOUT$layerCount, OFFSET$layerCount);
    }

    public void layerCount(@unsigned int value) {
        segment.set(LAYOUT$layerCount, OFFSET$layerCount, value);
    }


    public static final class Factory implements IFactory<VkClearRect> {
        @Override
        public Class<VkClearRect> clazz() {
            return VkClearRect.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkClearRect.LAYOUT;
        }

        @Override
        public VkClearRect create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkClearRect createUninit(MemorySegment segment) {
            return new VkClearRect(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
