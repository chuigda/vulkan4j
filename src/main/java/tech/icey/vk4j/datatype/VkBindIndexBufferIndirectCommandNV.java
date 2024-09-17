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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkBindIndexBufferIndirectCommandNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("bufferAddress"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("indexType")
    );

    public static final PathElement PATH$bufferAddress = PathElement.groupElement("bufferAddress");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$indexType = PathElement.groupElement("indexType");

    public static final OfLong LAYOUT$bufferAddress = (OfLong) LAYOUT.select(PATH$bufferAddress);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$indexType = (OfInt) LAYOUT.select(PATH$indexType);

    public static final long OFFSET$bufferAddress = LAYOUT.byteOffset(PATH$bufferAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$indexType = LAYOUT.byteOffset(PATH$indexType);

    public VkBindIndexBufferIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long bufferAddress() {
        return segment.get(LAYOUT$bufferAddress, OFFSET$bufferAddress);
    }

    public void bufferAddress(@unsigned long value) {
        segment.set(LAYOUT$bufferAddress, OFFSET$bufferAddress, value);
    }

    public @unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @enumtype(VkIndexType.class) int indexType() {
        return segment.get(LAYOUT$indexType, OFFSET$indexType);
    }

    public void indexType(@enumtype(VkIndexType.class) int value) {
        segment.set(LAYOUT$indexType, OFFSET$indexType, value);
    }


    public static final class VkBindIndexBufferIndirectCommandNVFactory implements IDataTypeFactory<VkBindIndexBufferIndirectCommandNV> {
        @Override
        public Class<VkBindIndexBufferIndirectCommandNV> clazz() {
            return VkBindIndexBufferIndirectCommandNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBindIndexBufferIndirectCommandNV.LAYOUT;
        }

        @Override
        public VkBindIndexBufferIndirectCommandNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBindIndexBufferIndirectCommandNV createUninit(MemorySegment segment) {
            return new VkBindIndexBufferIndirectCommandNV(segment);
        }
    }

    public static final VkBindIndexBufferIndirectCommandNVFactory FACTORY = new VkBindIndexBufferIndirectCommandNVFactory();
}
