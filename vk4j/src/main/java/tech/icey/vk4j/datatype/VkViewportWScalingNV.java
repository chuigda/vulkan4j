package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkViewportWScalingNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("xcoeff"),
        ValueLayout.JAVA_FLOAT.withName("ycoeff")
    );

    public static final PathElement PATH$xcoeff = PathElement.groupElement("xcoeff");
    public static final PathElement PATH$ycoeff = PathElement.groupElement("ycoeff");

    public static final OfFloat LAYOUT$xcoeff = (OfFloat) LAYOUT.select(PATH$xcoeff);
    public static final OfFloat LAYOUT$ycoeff = (OfFloat) LAYOUT.select(PATH$ycoeff);

    public static final long OFFSET$xcoeff = LAYOUT.byteOffset(PATH$xcoeff);
    public static final long OFFSET$ycoeff = LAYOUT.byteOffset(PATH$ycoeff);

    public VkViewportWScalingNV(MemorySegment segment) {
        this.segment = segment;
    }

    public float xcoeff() {
        return segment.get(LAYOUT$xcoeff, OFFSET$xcoeff);
    }

    public void xcoeff(float value) {
        segment.set(LAYOUT$xcoeff, OFFSET$xcoeff, value);
    }

    public float ycoeff() {
        return segment.get(LAYOUT$ycoeff, OFFSET$ycoeff);
    }

    public void ycoeff(float value) {
        segment.set(LAYOUT$ycoeff, OFFSET$ycoeff, value);
    }


    public static final class Factory implements IFactory<VkViewportWScalingNV> {
        @Override
        public Class<VkViewportWScalingNV> clazz() {
            return VkViewportWScalingNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkViewportWScalingNV.LAYOUT;
        }

        @Override
        public VkViewportWScalingNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkViewportWScalingNV createUninit(MemorySegment segment) {
            return new VkViewportWScalingNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
