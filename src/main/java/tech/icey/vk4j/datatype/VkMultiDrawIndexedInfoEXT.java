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


    public static final class VkMultiDrawIndexedInfoEXTFactory implements IFactory<VkMultiDrawIndexedInfoEXT> {
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

    public static final VkMultiDrawIndexedInfoEXTFactory FACTORY = new VkMultiDrawIndexedInfoEXTFactory();
}
