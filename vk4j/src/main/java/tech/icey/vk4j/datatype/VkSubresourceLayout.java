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

public record VkSubresourceLayout(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("rowPitch"),
        ValueLayout.JAVA_LONG.withName("arrayPitch"),
        ValueLayout.JAVA_LONG.withName("depthPitch")
    );

    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$rowPitch = PathElement.groupElement("rowPitch");
    public static final PathElement PATH$arrayPitch = PathElement.groupElement("arrayPitch");
    public static final PathElement PATH$depthPitch = PathElement.groupElement("depthPitch");

    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfLong LAYOUT$rowPitch = (OfLong) LAYOUT.select(PATH$rowPitch);
    public static final OfLong LAYOUT$arrayPitch = (OfLong) LAYOUT.select(PATH$arrayPitch);
    public static final OfLong LAYOUT$depthPitch = (OfLong) LAYOUT.select(PATH$depthPitch);

    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$rowPitch = LAYOUT.byteOffset(PATH$rowPitch);
    public static final long OFFSET$arrayPitch = LAYOUT.byteOffset(PATH$arrayPitch);
    public static final long OFFSET$depthPitch = LAYOUT.byteOffset(PATH$depthPitch);

    public VkSubresourceLayout(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @unsigned long rowPitch() {
        return segment.get(LAYOUT$rowPitch, OFFSET$rowPitch);
    }

    public void rowPitch(@unsigned long value) {
        segment.set(LAYOUT$rowPitch, OFFSET$rowPitch, value);
    }

    public @unsigned long arrayPitch() {
        return segment.get(LAYOUT$arrayPitch, OFFSET$arrayPitch);
    }

    public void arrayPitch(@unsigned long value) {
        segment.set(LAYOUT$arrayPitch, OFFSET$arrayPitch, value);
    }

    public @unsigned long depthPitch() {
        return segment.get(LAYOUT$depthPitch, OFFSET$depthPitch);
    }

    public void depthPitch(@unsigned long value) {
        segment.set(LAYOUT$depthPitch, OFFSET$depthPitch, value);
    }


    public static final class Factory implements IFactory<VkSubresourceLayout> {
        @Override
        public Class<VkSubresourceLayout> clazz() {
            return VkSubresourceLayout.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSubresourceLayout.LAYOUT;
        }

        @Override
        public VkSubresourceLayout create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSubresourceLayout createUninit(MemorySegment segment) {
            return new VkSubresourceLayout(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
