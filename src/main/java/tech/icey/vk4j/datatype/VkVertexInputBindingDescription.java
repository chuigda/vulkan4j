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

public record VkVertexInputBindingDescription(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("stride"),
        ValueLayout.JAVA_INT.withName("inputRate")
    );

    public static final PathElement PATH$binding = PathElement.groupElement(0);
    public static final PathElement PATH$stride = PathElement.groupElement(1);
    public static final PathElement PATH$inputRate = PathElement.groupElement(2);

    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$stride = (OfInt) LAYOUT.select(PATH$stride);
    public static final OfInt LAYOUT$inputRate = (OfInt) LAYOUT.select(PATH$inputRate);

    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);
    public static final long OFFSET$inputRate = LAYOUT.byteOffset(PATH$inputRate);

    public VkVertexInputBindingDescription(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public @unsigned int stride() {
        return segment.get(LAYOUT$stride, OFFSET$stride);
    }

    public void stride(@unsigned int value) {
        segment.set(LAYOUT$stride, OFFSET$stride, value);
    }

    public @enumtype(VkVertexInputRate.class) int inputRate() {
        return segment.get(LAYOUT$inputRate, OFFSET$inputRate);
    }

    public void inputRate(@enumtype(VkVertexInputRate.class) int value) {
        segment.set(LAYOUT$inputRate, OFFSET$inputRate, value);
    }


    public static final class VkVertexInputBindingDescriptionFactory implements IDataTypeFactory<VkVertexInputBindingDescription> {
        @Override
        public Class<VkVertexInputBindingDescription> clazz() {
            return VkVertexInputBindingDescription.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkVertexInputBindingDescription.LAYOUT;
        }

        @Override
        public VkVertexInputBindingDescription create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkVertexInputBindingDescription createUninit(MemorySegment segment) {
            return new VkVertexInputBindingDescription(segment);
        }
    }

    public static final VkVertexInputBindingDescriptionFactory FACTORY = new VkVertexInputBindingDescriptionFactory();
}
