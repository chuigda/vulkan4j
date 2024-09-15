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

public record VkDescriptorPoolSize(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("descriptorCount")
    );

    public static final PathElement PATH$type = PathElement.groupElement(0);
    public static final PathElement PATH$descriptorCount = PathElement.groupElement(1);

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$descriptorCount = (OfInt) LAYOUT.select(PATH$descriptorCount);

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);

    public VkDescriptorPoolSize(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkDescriptorType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public void type(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
    }

    public @unsigned int descriptorCount() {
        return segment.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);
    }

    public void descriptorCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);
    }


    public static final class VkDescriptorPoolSizeFactory implements IDataTypeFactory<VkDescriptorPoolSize> {
        @Override
        public Class<VkDescriptorPoolSize> clazz() {
            return VkDescriptorPoolSize.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDescriptorPoolSize.LAYOUT;
        }

        @Override
        public VkDescriptorPoolSize create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDescriptorPoolSize createUninit(MemorySegment segment) {
            return new VkDescriptorPoolSize(segment);
        }
    }

    public static final VkDescriptorPoolSizeFactory FACTORY = new VkDescriptorPoolSizeFactory();
}
