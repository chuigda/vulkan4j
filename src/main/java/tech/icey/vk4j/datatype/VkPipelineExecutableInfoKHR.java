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

public record VkPipelineExecutableInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.JAVA_INT.withName("executableIndex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipeline = PathElement.groupElement("pipeline");
    public static final PathElement PATH$executableIndex = PathElement.groupElement("executableIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pipeline = (AddressLayout) LAYOUT.select(PATH$pipeline);
    public static final OfInt LAYOUT$executableIndex = (OfInt) LAYOUT.select(PATH$executableIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipeline = LAYOUT.byteOffset(PATH$pipeline);
    public static final long OFFSET$executableIndex = LAYOUT.byteOffset(PATH$executableIndex);

    public VkPipelineExecutableInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public VkPipeline pipeline() {
        return new VkPipeline(segment.asSlice(OFFSET$pipeline, LAYOUT$pipeline));
    }

    public void pipeline(VkPipeline value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pipeline, LAYOUT$pipeline.byteSize());
    }

    public @unsigned int executableIndex() {
        return segment.get(LAYOUT$executableIndex, OFFSET$executableIndex);
    }

    public void executableIndex(@unsigned int value) {
        segment.set(LAYOUT$executableIndex, OFFSET$executableIndex, value);
    }


    public static final class VkPipelineExecutableInfoKHRFactory implements IFactory<VkPipelineExecutableInfoKHR> {
        @Override
        public Class<VkPipelineExecutableInfoKHR> clazz() {
            return VkPipelineExecutableInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineExecutableInfoKHR.LAYOUT;
        }

        @Override
        public VkPipelineExecutableInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineExecutableInfoKHR createUninit(MemorySegment segment) {
            return new VkPipelineExecutableInfoKHR(segment);
        }
    }

    public static final VkPipelineExecutableInfoKHRFactory FACTORY = new VkPipelineExecutableInfoKHRFactory();
}
