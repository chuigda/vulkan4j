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

public record VkMicromapUsageEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("count"),
        ValueLayout.JAVA_INT.withName("subdivisionLevel"),
        ValueLayout.JAVA_INT.withName("format")
    );

    public static final PathElement PATH$count = PathElement.groupElement(0);
    public static final PathElement PATH$subdivisionLevel = PathElement.groupElement(1);
    public static final PathElement PATH$format = PathElement.groupElement(2);

    public static final OfInt LAYOUT$count = (OfInt) LAYOUT.select(PATH$count);
    public static final OfInt LAYOUT$subdivisionLevel = (OfInt) LAYOUT.select(PATH$subdivisionLevel);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);

    public static final long OFFSET$count = LAYOUT.byteOffset(PATH$count);
    public static final long OFFSET$subdivisionLevel = LAYOUT.byteOffset(PATH$subdivisionLevel);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);

    public VkMicromapUsageEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int count() {
        return segment.get(LAYOUT$count, OFFSET$count);
    }

    public void count(@unsigned int value) {
        segment.set(LAYOUT$count, OFFSET$count, value);
    }

    public @unsigned int subdivisionLevel() {
        return segment.get(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel);
    }

    public void subdivisionLevel(@unsigned int value) {
        segment.set(LAYOUT$subdivisionLevel, OFFSET$subdivisionLevel, value);
    }

    public @unsigned int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@unsigned int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }


    public static final class VkMicromapUsageEXTFactory implements IDataTypeFactory<VkMicromapUsageEXT> {
        @Override
        public Class<VkMicromapUsageEXT> clazz() {
            return VkMicromapUsageEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkMicromapUsageEXT.LAYOUT;
        }

        @Override
        public VkMicromapUsageEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkMicromapUsageEXT createUninit(MemorySegment segment) {
            return new VkMicromapUsageEXT(segment);
        }
    }

    public static final VkMicromapUsageEXTFactory FACTORY = new VkMicromapUsageEXTFactory();
}
