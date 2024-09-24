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

public record VkSampleLocationEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y")
    );

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");

    public static final OfFloat LAYOUT$x = (OfFloat) LAYOUT.select(PATH$x);
    public static final OfFloat LAYOUT$y = (OfFloat) LAYOUT.select(PATH$y);

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);

    public VkSampleLocationEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public float x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public void x(float value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
    }

    public float y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public void y(float value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
    }


    public static final class VkSampleLocationEXTFactory implements IFactory<VkSampleLocationEXT> {
        @Override
        public Class<VkSampleLocationEXT> clazz() {
            return VkSampleLocationEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSampleLocationEXT.LAYOUT;
        }

        @Override
        public VkSampleLocationEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSampleLocationEXT createUninit(MemorySegment segment) {
            return new VkSampleLocationEXT(segment);
        }
    }

    public static final VkSampleLocationEXTFactory FACTORY = new VkSampleLocationEXTFactory();
}
