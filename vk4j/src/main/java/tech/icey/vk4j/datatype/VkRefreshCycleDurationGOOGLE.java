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

public record VkRefreshCycleDurationGOOGLE(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("refreshDuration")
    );

    public static final PathElement PATH$refreshDuration = PathElement.groupElement("refreshDuration");

    public static final OfLong LAYOUT$refreshDuration = (OfLong) LAYOUT.select(PATH$refreshDuration);

    public static final long OFFSET$refreshDuration = LAYOUT.byteOffset(PATH$refreshDuration);

    public VkRefreshCycleDurationGOOGLE(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long refreshDuration() {
        return segment.get(LAYOUT$refreshDuration, OFFSET$refreshDuration);
    }

    public void refreshDuration(@unsigned long value) {
        segment.set(LAYOUT$refreshDuration, OFFSET$refreshDuration, value);
    }


    public static final class Factory implements IFactory<VkRefreshCycleDurationGOOGLE> {
        @Override
        public Class<VkRefreshCycleDurationGOOGLE> clazz() {
            return VkRefreshCycleDurationGOOGLE.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRefreshCycleDurationGOOGLE.LAYOUT;
        }

        @Override
        public VkRefreshCycleDurationGOOGLE create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkRefreshCycleDurationGOOGLE createUninit(MemorySegment segment) {
            return new VkRefreshCycleDurationGOOGLE(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
