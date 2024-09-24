package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkDrawIndirectCommand(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("vertexCount"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("firstInstance")
    );

    public static final PathElement PATH$vertexCount = PathElement.groupElement("vertexCount");
    public static final PathElement PATH$instanceCount = PathElement.groupElement("instanceCount");
    public static final PathElement PATH$firstVertex = PathElement.groupElement("firstVertex");
    public static final PathElement PATH$firstInstance = PathElement.groupElement("firstInstance");

    public static final OfInt LAYOUT$vertexCount = (OfInt) LAYOUT.select(PATH$vertexCount);
    public static final OfInt LAYOUT$instanceCount = (OfInt) LAYOUT.select(PATH$instanceCount);
    public static final OfInt LAYOUT$firstVertex = (OfInt) LAYOUT.select(PATH$firstVertex);
    public static final OfInt LAYOUT$firstInstance = (OfInt) LAYOUT.select(PATH$firstInstance);

    public static final long OFFSET$vertexCount = LAYOUT.byteOffset(PATH$vertexCount);
    public static final long OFFSET$instanceCount = LAYOUT.byteOffset(PATH$instanceCount);
    public static final long OFFSET$firstVertex = LAYOUT.byteOffset(PATH$firstVertex);
    public static final long OFFSET$firstInstance = LAYOUT.byteOffset(PATH$firstInstance);

    public VkDrawIndirectCommand(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int vertexCount() {
        return segment.get(LAYOUT$vertexCount, OFFSET$vertexCount);
    }

    public void vertexCount(@unsigned int value) {
        segment.set(LAYOUT$vertexCount, OFFSET$vertexCount, value);
    }

    public @unsigned int instanceCount() {
        return segment.get(LAYOUT$instanceCount, OFFSET$instanceCount);
    }

    public void instanceCount(@unsigned int value) {
        segment.set(LAYOUT$instanceCount, OFFSET$instanceCount, value);
    }

    public @unsigned int firstVertex() {
        return segment.get(LAYOUT$firstVertex, OFFSET$firstVertex);
    }

    public void firstVertex(@unsigned int value) {
        segment.set(LAYOUT$firstVertex, OFFSET$firstVertex, value);
    }

    public @unsigned int firstInstance() {
        return segment.get(LAYOUT$firstInstance, OFFSET$firstInstance);
    }

    public void firstInstance(@unsigned int value) {
        segment.set(LAYOUT$firstInstance, OFFSET$firstInstance, value);
    }


    public static final class Factory implements IFactory<VkDrawIndirectCommand> {
        @Override
        public Class<VkDrawIndirectCommand> clazz() {
            return VkDrawIndirectCommand.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDrawIndirectCommand.LAYOUT;
        }

        @Override
        public VkDrawIndirectCommand create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDrawIndirectCommand createUninit(MemorySegment segment) {
            return new VkDrawIndirectCommand(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
