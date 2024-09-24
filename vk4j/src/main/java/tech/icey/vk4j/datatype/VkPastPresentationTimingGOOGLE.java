package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkPastPresentationTimingGOOGLE(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("desiredPresentTime"),
        ValueLayout.JAVA_LONG.withName("actualPresentTime"),
        ValueLayout.JAVA_LONG.withName("earliestPresentTime"),
        ValueLayout.JAVA_LONG.withName("presentMargin")
    );

    public static final PathElement PATH$presentID = PathElement.groupElement("presentID");
    public static final PathElement PATH$desiredPresentTime = PathElement.groupElement("desiredPresentTime");
    public static final PathElement PATH$actualPresentTime = PathElement.groupElement("actualPresentTime");
    public static final PathElement PATH$earliestPresentTime = PathElement.groupElement("earliestPresentTime");
    public static final PathElement PATH$presentMargin = PathElement.groupElement("presentMargin");

    public static final OfInt LAYOUT$presentID = (OfInt) LAYOUT.select(PATH$presentID);
    public static final OfLong LAYOUT$desiredPresentTime = (OfLong) LAYOUT.select(PATH$desiredPresentTime);
    public static final OfLong LAYOUT$actualPresentTime = (OfLong) LAYOUT.select(PATH$actualPresentTime);
    public static final OfLong LAYOUT$earliestPresentTime = (OfLong) LAYOUT.select(PATH$earliestPresentTime);
    public static final OfLong LAYOUT$presentMargin = (OfLong) LAYOUT.select(PATH$presentMargin);

    public static final long OFFSET$presentID = LAYOUT.byteOffset(PATH$presentID);
    public static final long OFFSET$desiredPresentTime = LAYOUT.byteOffset(PATH$desiredPresentTime);
    public static final long OFFSET$actualPresentTime = LAYOUT.byteOffset(PATH$actualPresentTime);
    public static final long OFFSET$earliestPresentTime = LAYOUT.byteOffset(PATH$earliestPresentTime);
    public static final long OFFSET$presentMargin = LAYOUT.byteOffset(PATH$presentMargin);

    public VkPastPresentationTimingGOOGLE(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int presentID() {
        return segment.get(LAYOUT$presentID, OFFSET$presentID);
    }

    public void presentID(@unsigned int value) {
        segment.set(LAYOUT$presentID, OFFSET$presentID, value);
    }

    public @unsigned long desiredPresentTime() {
        return segment.get(LAYOUT$desiredPresentTime, OFFSET$desiredPresentTime);
    }

    public void desiredPresentTime(@unsigned long value) {
        segment.set(LAYOUT$desiredPresentTime, OFFSET$desiredPresentTime, value);
    }

    public @unsigned long actualPresentTime() {
        return segment.get(LAYOUT$actualPresentTime, OFFSET$actualPresentTime);
    }

    public void actualPresentTime(@unsigned long value) {
        segment.set(LAYOUT$actualPresentTime, OFFSET$actualPresentTime, value);
    }

    public @unsigned long earliestPresentTime() {
        return segment.get(LAYOUT$earliestPresentTime, OFFSET$earliestPresentTime);
    }

    public void earliestPresentTime(@unsigned long value) {
        segment.set(LAYOUT$earliestPresentTime, OFFSET$earliestPresentTime, value);
    }

    public @unsigned long presentMargin() {
        return segment.get(LAYOUT$presentMargin, OFFSET$presentMargin);
    }

    public void presentMargin(@unsigned long value) {
        segment.set(LAYOUT$presentMargin, OFFSET$presentMargin, value);
    }


    public static final class Factory implements IFactory<VkPastPresentationTimingGOOGLE> {
        @Override
        public Class<VkPastPresentationTimingGOOGLE> clazz() {
            return VkPastPresentationTimingGOOGLE.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPastPresentationTimingGOOGLE.LAYOUT;
        }

        @Override
        public VkPastPresentationTimingGOOGLE create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPastPresentationTimingGOOGLE createUninit(MemorySegment segment) {
            return new VkPastPresentationTimingGOOGLE(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
