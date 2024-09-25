package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.enumtype;
import tech.icey.vk4j.enumtype.VkColorSpaceKHR;
import tech.icey.vk4j.enumtype.VkFormat;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;

public record VkSurfaceFormatKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("colorSpace")
    );

    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$colorSpace = PathElement.groupElement("colorSpace");

    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$colorSpace = (OfInt) LAYOUT.select(PATH$colorSpace);

    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$colorSpace = LAYOUT.byteOffset(PATH$colorSpace);

    public VkSurfaceFormatKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public @enumtype(VkColorSpaceKHR.class) int colorSpace() {
        return segment.get(LAYOUT$colorSpace, OFFSET$colorSpace);
    }

    public void colorSpace(@enumtype(VkColorSpaceKHR.class) int value) {
        segment.set(LAYOUT$colorSpace, OFFSET$colorSpace, value);
    }


    public static final class Factory implements IFactory<VkSurfaceFormatKHR> {
        @Override
        public Class<VkSurfaceFormatKHR> clazz() {
            return VkSurfaceFormatKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSurfaceFormatKHR.LAYOUT;
        }

        @Override
        public VkSurfaceFormatKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSurfaceFormatKHR createUninit(MemorySegment segment) {
            return new VkSurfaceFormatKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
