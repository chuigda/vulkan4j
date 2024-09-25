package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkAccelerationStructureBuildRangeInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("primitiveCount"),
        ValueLayout.JAVA_INT.withName("primitiveOffset"),
        ValueLayout.JAVA_INT.withName("firstVertex"),
        ValueLayout.JAVA_INT.withName("transformOffset")
    );

    public static final PathElement PATH$primitiveCount = PathElement.groupElement("primitiveCount");
    public static final PathElement PATH$primitiveOffset = PathElement.groupElement("primitiveOffset");
    public static final PathElement PATH$firstVertex = PathElement.groupElement("firstVertex");
    public static final PathElement PATH$transformOffset = PathElement.groupElement("transformOffset");

    public static final OfInt LAYOUT$primitiveCount = (OfInt) LAYOUT.select(PATH$primitiveCount);
    public static final OfInt LAYOUT$primitiveOffset = (OfInt) LAYOUT.select(PATH$primitiveOffset);
    public static final OfInt LAYOUT$firstVertex = (OfInt) LAYOUT.select(PATH$firstVertex);
    public static final OfInt LAYOUT$transformOffset = (OfInt) LAYOUT.select(PATH$transformOffset);

    public static final long OFFSET$primitiveCount = LAYOUT.byteOffset(PATH$primitiveCount);
    public static final long OFFSET$primitiveOffset = LAYOUT.byteOffset(PATH$primitiveOffset);
    public static final long OFFSET$firstVertex = LAYOUT.byteOffset(PATH$firstVertex);
    public static final long OFFSET$transformOffset = LAYOUT.byteOffset(PATH$transformOffset);

    public VkAccelerationStructureBuildRangeInfoKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int primitiveCount() {
        return segment.get(LAYOUT$primitiveCount, OFFSET$primitiveCount);
    }

    public void primitiveCount(@unsigned int value) {
        segment.set(LAYOUT$primitiveCount, OFFSET$primitiveCount, value);
    }

    public @unsigned int primitiveOffset() {
        return segment.get(LAYOUT$primitiveOffset, OFFSET$primitiveOffset);
    }

    public void primitiveOffset(@unsigned int value) {
        segment.set(LAYOUT$primitiveOffset, OFFSET$primitiveOffset, value);
    }

    public @unsigned int firstVertex() {
        return segment.get(LAYOUT$firstVertex, OFFSET$firstVertex);
    }

    public void firstVertex(@unsigned int value) {
        segment.set(LAYOUT$firstVertex, OFFSET$firstVertex, value);
    }

    public @unsigned int transformOffset() {
        return segment.get(LAYOUT$transformOffset, OFFSET$transformOffset);
    }

    public void transformOffset(@unsigned int value) {
        segment.set(LAYOUT$transformOffset, OFFSET$transformOffset, value);
    }


    public static final class Factory implements IFactory<VkAccelerationStructureBuildRangeInfoKHR> {
        @Override
        public Class<VkAccelerationStructureBuildRangeInfoKHR> clazz() {
            return VkAccelerationStructureBuildRangeInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAccelerationStructureBuildRangeInfoKHR.LAYOUT;
        }

        @Override
        public VkAccelerationStructureBuildRangeInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAccelerationStructureBuildRangeInfoKHR createUninit(MemorySegment segment) {
            return new VkAccelerationStructureBuildRangeInfoKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
