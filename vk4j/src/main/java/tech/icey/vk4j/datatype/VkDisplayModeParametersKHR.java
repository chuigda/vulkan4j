package tech.icey.vk4j.datatype;

import tech.icey.vk4j.IFactory;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.unsigned;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.StructLayout;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;

public record VkDisplayModeParametersKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkExtent2D.LAYOUT.withName("visibleRegion"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );

    public static final PathElement PATH$visibleRegion = PathElement.groupElement("visibleRegion");
    public static final PathElement PATH$refreshRate = PathElement.groupElement("refreshRate");

    public static final StructLayout LAYOUT$visibleRegion = (StructLayout) LAYOUT.select(PATH$visibleRegion);
    public static final OfInt LAYOUT$refreshRate = (OfInt) LAYOUT.select(PATH$refreshRate);

    public static final long OFFSET$visibleRegion = LAYOUT.byteOffset(PATH$visibleRegion);
    public static final long OFFSET$refreshRate = LAYOUT.byteOffset(PATH$refreshRate);

    public VkDisplayModeParametersKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkExtent2D visibleRegion() {
        return new VkExtent2D(segment.asSlice(OFFSET$visibleRegion, LAYOUT$visibleRegion));
    }

    public void visibleRegion(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$visibleRegion, LAYOUT$visibleRegion.byteSize());
    }

    public @unsigned int refreshRate() {
        return segment.get(LAYOUT$refreshRate, OFFSET$refreshRate);
    }

    public void refreshRate(@unsigned int value) {
        segment.set(LAYOUT$refreshRate, OFFSET$refreshRate, value);
    }


    public static final class Factory implements IFactory<VkDisplayModeParametersKHR> {
        @Override
        public Class<VkDisplayModeParametersKHR> clazz() {
            return VkDisplayModeParametersKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDisplayModeParametersKHR.LAYOUT;
        }

        @Override
        public VkDisplayModeParametersKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDisplayModeParametersKHR createUninit(MemorySegment segment) {
            return new VkDisplayModeParametersKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
