package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkDisplayPlanePropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("currentDisplay"),
        ValueLayout.JAVA_INT.withName("currentStackIndex")
    );

    public static final PathElement PATH$currentDisplay = PathElement.groupElement("currentDisplay");
    public static final PathElement PATH$currentStackIndex = PathElement.groupElement("currentStackIndex");

    public static final AddressLayout LAYOUT$currentDisplay = (AddressLayout) LAYOUT.select(PATH$currentDisplay);
    public static final OfInt LAYOUT$currentStackIndex = (OfInt) LAYOUT.select(PATH$currentStackIndex);

    public static final long OFFSET$currentDisplay = LAYOUT.byteOffset(PATH$currentDisplay);
    public static final long OFFSET$currentStackIndex = LAYOUT.byteOffset(PATH$currentStackIndex);

    public VkDisplayPlanePropertiesKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkDisplayKHR currentDisplay() {
        return new VkDisplayKHR(segment.asSlice(OFFSET$currentDisplay, LAYOUT$currentDisplay));
    }

    public void currentDisplay(VkDisplayKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$currentDisplay, LAYOUT$currentDisplay.byteSize());
    }

    public @unsigned int currentStackIndex() {
        return segment.get(LAYOUT$currentStackIndex, OFFSET$currentStackIndex);
    }

    public void currentStackIndex(@unsigned int value) {
        segment.set(LAYOUT$currentStackIndex, OFFSET$currentStackIndex, value);
    }


    public static final class Factory implements IFactory<VkDisplayPlanePropertiesKHR> {
        @Override
        public Class<VkDisplayPlanePropertiesKHR> clazz() {
            return VkDisplayPlanePropertiesKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDisplayPlanePropertiesKHR.LAYOUT;
        }

        @Override
        public VkDisplayPlanePropertiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDisplayPlanePropertiesKHR createUninit(MemorySegment segment) {
            return new VkDisplayPlanePropertiesKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
