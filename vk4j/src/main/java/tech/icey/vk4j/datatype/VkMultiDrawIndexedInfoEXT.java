package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.unsigned;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;

public record VkMultiDrawIndexedInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("vertexOffset")
    );

    public static final PathElement PATH$firstIndex = PathElement.groupElement("firstIndex");
    public static final PathElement PATH$indexCount = PathElement.groupElement("indexCount");
    public static final PathElement PATH$vertexOffset = PathElement.groupElement("vertexOffset");

    public static final OfInt LAYOUT$firstIndex = (OfInt) LAYOUT.select(PATH$firstIndex);
    public static final OfInt LAYOUT$indexCount = (OfInt) LAYOUT.select(PATH$indexCount);
    public static final OfInt LAYOUT$vertexOffset = (OfInt) LAYOUT.select(PATH$vertexOffset);

    public static final long OFFSET$firstIndex = LAYOUT.byteOffset(PATH$firstIndex);
    public static final long OFFSET$indexCount = LAYOUT.byteOffset(PATH$indexCount);
    public static final long OFFSET$vertexOffset = LAYOUT.byteOffset(PATH$vertexOffset);

    public VkMultiDrawIndexedInfoEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int firstIndex() {
        return segment.get(LAYOUT$firstIndex, OFFSET$firstIndex);
    }

    public void firstIndex(@unsigned int value) {
        segment.set(LAYOUT$firstIndex, OFFSET$firstIndex, value);
    }

    public @unsigned int indexCount() {
        return segment.get(LAYOUT$indexCount, OFFSET$indexCount);
    }

    public void indexCount(@unsigned int value) {
        segment.set(LAYOUT$indexCount, OFFSET$indexCount, value);
    }

    public int vertexOffset() {
        return segment.get(LAYOUT$vertexOffset, OFFSET$vertexOffset);
    }

    public void vertexOffset(int value) {
        segment.set(LAYOUT$vertexOffset, OFFSET$vertexOffset, value);
    }


    public static final class Factory implements IFactory<VkMultiDrawIndexedInfoEXT> {
        @Override
        public Class<VkMultiDrawIndexedInfoEXT> clazz() {
            return VkMultiDrawIndexedInfoEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkMultiDrawIndexedInfoEXT.LAYOUT;
        }

        @Override
        public VkMultiDrawIndexedInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkMultiDrawIndexedInfoEXT createUninit(MemorySegment segment) {
            return new VkMultiDrawIndexedInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
