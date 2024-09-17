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

public record VkExtent2D(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height")
    );

    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");

    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);

    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);

    public VkExtent2D(MemorySegment segment) {
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


    public static final class VkExtent2DFactory implements IDataTypeFactory<VkExtent2D> {
        @Override
        public Class<VkExtent2D> clazz() {
            return VkExtent2D.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkExtent2D.LAYOUT;
        }

        @Override
        public VkExtent2D create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkExtent2D createUninit(MemorySegment segment) {
            return new VkExtent2D(segment);
        }
    }

    public static final VkExtent2DFactory FACTORY = new VkExtent2DFactory();
}
