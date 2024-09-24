package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkMultiDrawInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("vertexCount")
    );

    public static final PathElement PATH$firstVertex = PathElement.groupElement("firstVertex");
    public static final PathElement PATH$vertexCount = PathElement.groupElement("vertexCount");

    public static final OfInt LAYOUT$firstVertex = (OfInt) LAYOUT.select(PATH$firstVertex);
    public static final OfInt LAYOUT$vertexCount = (OfInt) LAYOUT.select(PATH$vertexCount);

    public static final long OFFSET$firstVertex = LAYOUT.byteOffset(PATH$firstVertex);
    public static final long OFFSET$vertexCount = LAYOUT.byteOffset(PATH$vertexCount);

    public VkMultiDrawInfoEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int firstVertex() {
        return segment.get(LAYOUT$firstVertex, OFFSET$firstVertex);
    }

    public void firstVertex(@unsigned int value) {
        segment.set(LAYOUT$firstVertex, OFFSET$firstVertex, value);
    }

    public @unsigned int vertexCount() {
        return segment.get(LAYOUT$vertexCount, OFFSET$vertexCount);
    }

    public void vertexCount(@unsigned int value) {
        segment.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);
    }


    public static final class Factory implements IFactory<VkMultiDrawInfoEXT> {
        @Override
        public Class<VkMultiDrawInfoEXT> clazz() {
            return VkMultiDrawInfoEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkMultiDrawInfoEXT.LAYOUT;
        }

        @Override
        public VkMultiDrawInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkMultiDrawInfoEXT createUninit(MemorySegment segment) {
            return new VkMultiDrawInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
