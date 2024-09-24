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

public record VkDrawIndexedIndirectCommand(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("indexCount"),
        ValueLayout.JAVA_INT.withName("instanceCount"),
        ValueLayout.JAVA_INT.withName("firstIndex"),
        ValueLayout.JAVA_INT.withName("vertexOffset"),
        ValueLayout.JAVA_INT.withName("firstInstance")
    );

    public static final PathElement PATH$indexCount = PathElement.groupElement("indexCount");
    public static final PathElement PATH$instanceCount = PathElement.groupElement("instanceCount");
    public static final PathElement PATH$firstIndex = PathElement.groupElement("firstIndex");
    public static final PathElement PATH$vertexOffset = PathElement.groupElement("vertexOffset");
    public static final PathElement PATH$firstInstance = PathElement.groupElement("firstInstance");

    public static final OfInt LAYOUT$indexCount = (OfInt) LAYOUT.select(PATH$indexCount);
    public static final OfInt LAYOUT$instanceCount = (OfInt) LAYOUT.select(PATH$instanceCount);
    public static final OfInt LAYOUT$firstIndex = (OfInt) LAYOUT.select(PATH$firstIndex);
    public static final OfInt LAYOUT$vertexOffset = (OfInt) LAYOUT.select(PATH$vertexOffset);
    public static final OfInt LAYOUT$firstInstance = (OfInt) LAYOUT.select(PATH$firstInstance);

    public static final long OFFSET$indexCount = LAYOUT.byteOffset(PATH$indexCount);
    public static final long OFFSET$instanceCount = LAYOUT.byteOffset(PATH$instanceCount);
    public static final long OFFSET$firstIndex = LAYOUT.byteOffset(PATH$firstIndex);
    public static final long OFFSET$vertexOffset = LAYOUT.byteOffset(PATH$vertexOffset);
    public static final long OFFSET$firstInstance = LAYOUT.byteOffset(PATH$firstInstance);

    public VkDrawIndexedIndirectCommand(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int indexCount() {
        return segment.get(LAYOUT$indexCount, OFFSET$indexCount);
    }

    public void indexCount(@unsigned int value) {
        segment.set(LAYOUT$indexCount, OFFSET$indexCount, value);
    }

    public @unsigned int instanceCount() {
        return segment.get(LAYOUT$instanceCount, OFFSET$instanceCount);
    }

    public void instanceCount(@unsigned int value) {
        segment.set(LAYOUT$instanceCount, OFFSET$instanceCount, value);
    }

    public @unsigned int firstIndex() {
        return segment.get(LAYOUT$firstIndex, OFFSET$firstIndex);
    }

    public void firstIndex(@unsigned int value) {
        segment.set(LAYOUT$firstIndex, OFFSET$firstIndex, value);
    }

    public int vertexOffset() {
        return segment.get(LAYOUT$vertexOffset, OFFSET$vertexOffset);
    }

    public void vertexOffset(int value) {
        segment.set(LAYOUT$vertexOffset, OFFSET$vertexOffset, value);
    }

    public @unsigned int firstInstance() {
        return segment.get(LAYOUT$firstInstance, OFFSET$firstInstance);
    }

    public void firstInstance(@unsigned int value) {
        segment.set(LAYOUT$firstInstance, OFFSET$firstInstance, value);
    }


    public static final class VkDrawIndexedIndirectCommandFactory implements IFactory<VkDrawIndexedIndirectCommand> {
        @Override
        public Class<VkDrawIndexedIndirectCommand> clazz() {
            return VkDrawIndexedIndirectCommand.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDrawIndexedIndirectCommand.LAYOUT;
        }

        @Override
        public VkDrawIndexedIndirectCommand create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDrawIndexedIndirectCommand createUninit(MemorySegment segment) {
            return new VkDrawIndexedIndirectCommand(segment);
        }
    }

    public static final VkDrawIndexedIndirectCommandFactory FACTORY = new VkDrawIndexedIndirectCommandFactory();
}
