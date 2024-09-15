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

public record VkPipelineCreationFeedback(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("duration")
    );

    public static final PathElement PATH$flags = PathElement.groupElement(0);
    public static final PathElement PATH$duration = PathElement.groupElement(1);

    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfLong LAYOUT$duration = (OfLong) LAYOUT.select(PATH$duration);

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$duration = LAYOUT.byteOffset(PATH$duration);

    public VkPipelineCreationFeedback(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkPipelineCreationFeedbackFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCreationFeedbackFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long duration() {
        return segment.get(LAYOUT$duration, OFFSET$duration);
    }

    public void duration(@unsigned long value) {
        segment.set(LAYOUT$duration, OFFSET$duration, value);
    }


    public static final class VkPipelineCreationFeedbackFactory implements IDataTypeFactory<VkPipelineCreationFeedback> {
        @Override
        public Class<VkPipelineCreationFeedback> clazz() {
            return VkPipelineCreationFeedback.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineCreationFeedback.LAYOUT;
        }

        @Override
        public VkPipelineCreationFeedback create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineCreationFeedback createUninit(MemorySegment segment) {
            return new VkPipelineCreationFeedback(segment);
        }
    }

    public static final VkPipelineCreationFeedbackFactory FACTORY = new VkPipelineCreationFeedbackFactory();
}
