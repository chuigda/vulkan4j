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

public record VkVertexInputAttributeDescription(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("location"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("offset")
    );

    public static final PathElement PATH$location = PathElement.groupElement(0);
    public static final PathElement PATH$binding = PathElement.groupElement(1);
    public static final PathElement PATH$format = PathElement.groupElement(2);
    public static final PathElement PATH$offset = PathElement.groupElement(3);

    public static final OfInt LAYOUT$location = (OfInt) LAYOUT.select(PATH$location);
    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$offset = (OfInt) LAYOUT.select(PATH$offset);

    public static final long OFFSET$location = LAYOUT.byteOffset(PATH$location);
    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);

    public VkVertexInputAttributeDescription(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int location() {
        return segment.get(LAYOUT$location, OFFSET$location);
    }

    public void location(@unsigned int value) {
        segment.set(LAYOUT$location, OFFSET$location, value);
    }

    public @unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public void binding(@unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public @unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }


    public static final class VkVertexInputAttributeDescriptionFactory implements IDataTypeFactory<VkVertexInputAttributeDescription> {
        @Override
        public Class<VkVertexInputAttributeDescription> clazz() {
            return VkVertexInputAttributeDescription.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkVertexInputAttributeDescription.LAYOUT;
        }

        @Override
        public VkVertexInputAttributeDescription create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkVertexInputAttributeDescription createUninit(MemorySegment segment) {
            return new VkVertexInputAttributeDescription(segment);
        }
    }

    public static final VkVertexInputAttributeDescriptionFactory FACTORY = new VkVertexInputAttributeDescriptionFactory();
}