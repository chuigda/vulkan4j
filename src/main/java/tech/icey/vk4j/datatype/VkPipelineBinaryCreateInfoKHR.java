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

public record VkPipelineBinaryCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryKeysAndDataKHR.LAYOUT).withName("pKeysAndDataInfo"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineCreateInfoKHR.LAYOUT).withName("pPipelineCreateInfo")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pKeysAndDataInfo = PathElement.groupElement(2);
    public static final PathElement PATH$pipeline = PathElement.groupElement(3);
    public static final PathElement PATH$pPipelineCreateInfo = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pKeysAndDataInfo = (AddressLayout) LAYOUT.select(PATH$pKeysAndDataInfo);
    public static final AddressLayout LAYOUT$pipeline = (AddressLayout) LAYOUT.select(PATH$pipeline);
    public static final AddressLayout LAYOUT$pPipelineCreateInfo = (AddressLayout) LAYOUT.select(PATH$pPipelineCreateInfo);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pKeysAndDataInfo = LAYOUT.byteOffset(PATH$pKeysAndDataInfo);
    public static final long OFFSET$pipeline = LAYOUT.byteOffset(PATH$pipeline);
    public static final long OFFSET$pPipelineCreateInfo = LAYOUT.byteOffset(PATH$pPipelineCreateInfo);

    public VkPipelineBinaryCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_BINARY_CREATE_INFO_KHR);
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

    public @pointer(comment="VkPipelineBinaryKeysAndDataKHR*") MemorySegment pKeysAndDataInfoRaw() {
        return segment.get(LAYOUT$pKeysAndDataInfo, OFFSET$pKeysAndDataInfo);
    }

    public void pKeysAndDataInfoRaw(@pointer(comment="VkPipelineBinaryKeysAndDataKHR*") MemorySegment value) {
        segment.set(LAYOUT$pKeysAndDataInfo, OFFSET$pKeysAndDataInfo, value);
    }
    
    public @nullable VkPipelineBinaryKeysAndDataKHR pKeysAndDataInfo() {
        MemorySegment s = pKeysAndDataInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineBinaryKeysAndDataKHR(s);
    }

    public void pKeysAndDataInfo(@nullable VkPipelineBinaryKeysAndDataKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pKeysAndDataInfoRaw(s);
    }

    public VkPipeline pipeline() {
        return new VkPipeline(segment.asSlice(OFFSET$pipeline, LAYOUT$pipeline));
    }

    public void pipeline(VkPipeline value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pipeline, LAYOUT$pipeline.byteSize());
    }

    public @pointer(comment="VkPipelineCreateInfoKHR*") MemorySegment pPipelineCreateInfoRaw() {
        return segment.get(LAYOUT$pPipelineCreateInfo, OFFSET$pPipelineCreateInfo);
    }

    public void pPipelineCreateInfoRaw(@pointer(comment="VkPipelineCreateInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineCreateInfo, OFFSET$pPipelineCreateInfo, value);
    }
    
    public @nullable VkPipelineCreateInfoKHR pPipelineCreateInfo() {
        MemorySegment s = pPipelineCreateInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineCreateInfoKHR(s);
    }

    public void pPipelineCreateInfo(@nullable VkPipelineCreateInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineCreateInfoRaw(s);
    }


    public static final class VkPipelineBinaryCreateInfoKHRFactory implements IDataTypeFactory<VkPipelineBinaryCreateInfoKHR> {
        @Override
        public Class<VkPipelineBinaryCreateInfoKHR> clazz() {
            return VkPipelineBinaryCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineBinaryCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkPipelineBinaryCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineBinaryCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkPipelineBinaryCreateInfoKHR(segment);
        }
    }

    public static final VkPipelineBinaryCreateInfoKHRFactory FACTORY = new VkPipelineBinaryCreateInfoKHRFactory();
}
