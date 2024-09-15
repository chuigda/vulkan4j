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

public record VkPresentTimeGOOGLE(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("presentID"),
        ValueLayout.JAVA_LONG.withName("desiredPresentTime")
    );

    public static final PathElement PATH$presentID = PathElement.groupElement(0);
    public static final PathElement PATH$desiredPresentTime = PathElement.groupElement(1);

    public static final OfInt LAYOUT$presentID = (OfInt) LAYOUT.select(PATH$presentID);
    public static final OfLong LAYOUT$desiredPresentTime = (OfLong) LAYOUT.select(PATH$desiredPresentTime);

    public static final long OFFSET$presentID = LAYOUT.byteOffset(PATH$presentID);
    public static final long OFFSET$desiredPresentTime = LAYOUT.byteOffset(PATH$desiredPresentTime);

    public VkPresentTimeGOOGLE(MemorySegment segment) {
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


    public static final class VkPresentTimeGOOGLEFactory implements IDataTypeFactory<VkPresentTimeGOOGLE> {
        @Override
        public Class<VkPresentTimeGOOGLE> clazz() {
            return VkPresentTimeGOOGLE.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPresentTimeGOOGLE.LAYOUT;
        }

        @Override
        public VkPresentTimeGOOGLE create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPresentTimeGOOGLE createUninit(MemorySegment segment) {
            return new VkPresentTimeGOOGLE(segment);
        }
    }

    public static final VkPresentTimeGOOGLEFactory FACTORY = new VkPresentTimeGOOGLEFactory();
}
