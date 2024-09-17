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

public record VkExtent3D(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("depth")
    );

    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$depth = PathElement.groupElement("depth");

    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final OfInt LAYOUT$depth = (OfInt) LAYOUT.select(PATH$depth);

    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$depth = LAYOUT.byteOffset(PATH$depth);

    public VkExtent3D(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public void width(@unsigned int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
    }

    public @unsigned int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public void height(@unsigned int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
    }

    public @unsigned int depth() {
        return segment.get(LAYOUT$depth, OFFSET$depth);
    }

    public void depth(@unsigned int value) {
        segment.set(LAYOUT$depth, OFFSET$depth, value);
    }


    public static final class VkExtent3DFactory implements IFactory<VkExtent3D> {
        @Override
        public Class<VkExtent3D> clazz() {
            return VkExtent3D.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkExtent3D.LAYOUT;
        }

        @Override
        public VkExtent3D create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkExtent3D createUninit(MemorySegment segment) {
            return new VkExtent3D(segment);
        }
    }

    public static final VkExtent3DFactory FACTORY = new VkExtent3DFactory();
}
