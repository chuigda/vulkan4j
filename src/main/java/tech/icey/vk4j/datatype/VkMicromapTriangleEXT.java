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

public record VkMicromapTriangleEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("dataOffset"),
        ValueLayout.JAVA_SHORT.withName("subdivisionLevel"),
        ValueLayout.JAVA_SHORT.withName("format")
    );

    public static final PathElement PATH$dataOffset = PathElement.groupElement(0);
    public static final PathElement PATH$subdivisionLevel = PathElement.groupElement(1);
    public static final PathElement PATH$format = PathElement.groupElement(2);

    public static final OfInt LAYOUT$dataOffset = (OfInt) LAYOUT.select(PATH$dataOffset);
    public static final OfShort LAYOUT$subdivisionLevel = (OfShort) LAYOUT.select(PATH$subdivisionLevel);
    public static final OfShort LAYOUT$format = (OfShort) LAYOUT.select(PATH$format);

    public static final long OFFSET$dataOffset = LAYOUT.byteOffset(PATH$dataOffset);
    public static final long OFFSET$subdivisionLevel = LAYOUT.byteOffset(PATH$subdivisionLevel);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);

    public VkMicromapTriangleEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int dataOffset() {
        return segment.get(LAYOUT$dataOffset, OFFSET$dataOffset);
    }

    public void dataOffset(@unsigned int value) {
        segment.set(LAYOUT$dataOffset, OFFSET$dataOffset, value);
    }

    public @unsigned short subdivisionLevel() {
        return segment.get(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel);
    }

    public void subdivisionLevel(@unsigned short value) {
        segment.set(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel, value);
    }

    public @unsigned short format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@unsigned short value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }


    public static final class VkMicromapTriangleEXTFactory implements IDataTypeFactory<VkMicromapTriangleEXT> {
        @Override
        public Class<VkMicromapTriangleEXT> clazz() {
            return VkMicromapTriangleEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkMicromapTriangleEXT.LAYOUT;
        }

        @Override
        public VkMicromapTriangleEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkMicromapTriangleEXT createUninit(MemorySegment segment) {
            return new VkMicromapTriangleEXT(segment);
        }
    }

    public static final VkMicromapTriangleEXTFactory FACTORY = new VkMicromapTriangleEXTFactory();
}