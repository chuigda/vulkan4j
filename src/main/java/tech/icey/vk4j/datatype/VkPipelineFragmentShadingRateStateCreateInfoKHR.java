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

public record VkPipelineFragmentShadingRateStateCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("fragmentSize"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT).withName("combinerOps")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$fragmentSize = PathElement.groupElement(2);
    public static final PathElement PATH$combinerOps = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$fragmentSize = (StructLayout) LAYOUT.select(PATH$fragmentSize);
    public static final SequenceLayout LAYOUT$combinerOps = (SequenceLayout) LAYOUT.select(PATH$combinerOps);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentSize = LAYOUT.byteOffset(PATH$fragmentSize);
    public static final long OFFSET$combinerOps = LAYOUT.byteOffset(PATH$combinerOps);

    public VkPipelineFragmentShadingRateStateCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR);
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

    public VkExtent2D fragmentSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$fragmentSize, LAYOUT$fragmentSize));
    }

    public void fragmentSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fragmentSize, LAYOUT$fragmentSize.byteSize());
    }

    public MemorySegment combinerOpsRaw() {
        return segment.asSlice(OFFSET$combinerOps, LAYOUT$combinerOps.byteSize());
    }

    public IntArray combinerOps() {
        return new IntArray(combinerOpsRaw(), LAYOUT$combinerOps.elementCount());
    }

    public void combinerOps(IntArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$combinerOps, LAYOUT$combinerOps.byteSize());
    }


    public static final class VkPipelineFragmentShadingRateStateCreateInfoKHRFactory implements IDataTypeFactory<VkPipelineFragmentShadingRateStateCreateInfoKHR> {
        @Override
        public Class<VkPipelineFragmentShadingRateStateCreateInfoKHR> clazz() {
            return VkPipelineFragmentShadingRateStateCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineFragmentShadingRateStateCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkPipelineFragmentShadingRateStateCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineFragmentShadingRateStateCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment);
        }
    }

    public static final VkPipelineFragmentShadingRateStateCreateInfoKHRFactory FACTORY = new VkPipelineFragmentShadingRateStateCreateInfoKHRFactory();
}