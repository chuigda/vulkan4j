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

public record VkCoarseSampleLocationNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("pixelX"),
        ValueLayout.JAVA_INT.withName("pixelY"),
        ValueLayout.JAVA_INT.withName("sample")
    );

    public static final PathElement PATH$pixelX = PathElement.groupElement("pixelX");
    public static final PathElement PATH$pixelY = PathElement.groupElement("pixelY");
    public static final PathElement PATH$sample = PathElement.groupElement("sample");

    public static final OfInt LAYOUT$pixelX = (OfInt) LAYOUT.select(PATH$pixelX);
    public static final OfInt LAYOUT$pixelY = (OfInt) LAYOUT.select(PATH$pixelY);
    public static final OfInt LAYOUT$sample = (OfInt) LAYOUT.select(PATH$sample);

    public static final long OFFSET$pixelX = LAYOUT.byteOffset(PATH$pixelX);
    public static final long OFFSET$pixelY = LAYOUT.byteOffset(PATH$pixelY);
    public static final long OFFSET$sample = LAYOUT.byteOffset(PATH$sample);

    public VkCoarseSampleLocationNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int pixelX() {
        return segment.get(LAYOUT$pixelX, OFFSET$pixelX);
    }

    public void pixelX(@unsigned int value) {
        segment.set(LAYOUT$pixelX, OFFSET$pixelX, value);
    }

    public @unsigned int pixelY() {
        return segment.get(LAYOUT$pixelY, OFFSET$pixelY);
    }

    public void pixelY(@unsigned int value) {
        segment.set(LAYOUT$pixelY, OFFSET$pixelY, value);
    }

    public @unsigned int sample() {
        return segment.get(LAYOUT$sample, OFFSET$sample);
    }

    public void sample(@unsigned int value) {
        segment.set(LAYOUT$sample, OFFSET$sample, value);
    }


    public static final class Factory implements IFactory<VkCoarseSampleLocationNV> {
        @Override
        public Class<VkCoarseSampleLocationNV> clazz() {
            return VkCoarseSampleLocationNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCoarseSampleLocationNV.LAYOUT;
        }

        @Override
        public VkCoarseSampleLocationNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkCoarseSampleLocationNV createUninit(MemorySegment segment) {
            return new VkCoarseSampleLocationNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
