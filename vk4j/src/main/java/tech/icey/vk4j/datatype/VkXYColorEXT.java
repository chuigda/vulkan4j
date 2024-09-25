package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfFloat;
import static java.lang.foreign.ValueLayout.PathElement;

public record VkXYColorEXT(MemorySegment segment) {
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

    public VkXYColorEXT(MemorySegment segment) {
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


    public static final class Factory implements IFactory<VkXYColorEXT> {
        @Override
        public Class<VkXYColorEXT> clazz() {
            return VkXYColorEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkXYColorEXT.LAYOUT;
        }

        @Override
        public VkXYColorEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkXYColorEXT createUninit(MemorySegment segment) {
            return new VkXYColorEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
