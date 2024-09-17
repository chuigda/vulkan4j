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

public record VkVertexInputAttributeDescription2EXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("location"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("offset")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$location = PathElement.groupElement("location");
    public static final PathElement PATH$binding = PathElement.groupElement("binding");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$location = (OfInt) LAYOUT.select(PATH$location);
    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$offset = (OfInt) LAYOUT.select(PATH$offset);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$location = LAYOUT.byteOffset(PATH$location);
    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);

    public VkVertexInputAttributeDescription2EXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_VERTEX_INPUT_ATTRIBUTE_DESCRIPTION_2_EXT);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
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


    public static final class VkVertexInputAttributeDescription2EXTFactory implements IFactory<VkVertexInputAttributeDescription2EXT> {
        @Override
        public Class<VkVertexInputAttributeDescription2EXT> clazz() {
            return VkVertexInputAttributeDescription2EXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkVertexInputAttributeDescription2EXT.LAYOUT;
        }

        @Override
        public VkVertexInputAttributeDescription2EXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkVertexInputAttributeDescription2EXT createUninit(MemorySegment segment) {
            return new VkVertexInputAttributeDescription2EXT(segment);
        }
    }

    public static final VkVertexInputAttributeDescription2EXTFactory FACTORY = new VkVertexInputAttributeDescription2EXTFactory();
}
