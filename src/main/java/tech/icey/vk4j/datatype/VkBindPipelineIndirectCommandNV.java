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

public record VkBindPipelineIndirectCommandNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("pipelineAddress")
    );

    public static final PathElement PATH$pipelineAddress = PathElement.groupElement("pipelineAddress");

    public static final OfLong LAYOUT$pipelineAddress = (OfLong) LAYOUT.select(PATH$pipelineAddress);

    public static final long OFFSET$pipelineAddress = LAYOUT.byteOffset(PATH$pipelineAddress);

    public VkBindPipelineIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long pipelineAddress() {
        return segment.get(LAYOUT$pipelineAddress, OFFSET$pipelineAddress);
    }

    public void pipelineAddress(@unsigned long value) {
        segment.set(LAYOUT$pipelineAddress, OFFSET$pipelineAddress, value);
    }


    public static final class VkBindPipelineIndirectCommandNVFactory implements IDataTypeFactory<VkBindPipelineIndirectCommandNV> {
        @Override
        public Class<VkBindPipelineIndirectCommandNV> clazz() {
            return VkBindPipelineIndirectCommandNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBindPipelineIndirectCommandNV.LAYOUT;
        }

        @Override
        public VkBindPipelineIndirectCommandNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBindPipelineIndirectCommandNV createUninit(MemorySegment segment) {
            return new VkBindPipelineIndirectCommandNV(segment);
        }
    }

    public static final VkBindPipelineIndirectCommandNVFactory FACTORY = new VkBindPipelineIndirectCommandNVFactory();
}
