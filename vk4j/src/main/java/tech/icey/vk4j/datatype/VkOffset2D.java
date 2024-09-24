package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkOffset2D(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("x"),
        ValueLayout.JAVA_INT.withName("y")
    );

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");

    public static final OfInt LAYOUT$x = (OfInt) LAYOUT.select(PATH$x);
    public static final OfInt LAYOUT$y = (OfInt) LAYOUT.select(PATH$y);

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);

    public VkOffset2D(MemorySegment segment) {
        this.segment = segment;
    }

    public int x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public void x(int value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
    }

    public int y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public void y(int value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
    }


    public static final class Factory implements IFactory<VkOffset2D> {
        @Override
        public Class<VkOffset2D> clazz() {
            return VkOffset2D.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkOffset2D.LAYOUT;
        }

        @Override
        public VkOffset2D create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkOffset2D createUninit(MemorySegment segment) {
            return new VkOffset2D(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
