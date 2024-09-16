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

public record VkPipelineVertexInputDivisorStateCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("vertexBindingDivisorCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkVertexInputBindingDivisorDescriptionKHR.LAYOUT).withName("pVertexBindingDivisors")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$vertexBindingDivisorCount = PathElement.groupElement(2);
    public static final PathElement PATH$pVertexBindingDivisors = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$vertexBindingDivisorCount = (OfInt) LAYOUT.select(PATH$vertexBindingDivisorCount);
    public static final AddressLayout LAYOUT$pVertexBindingDivisors = (AddressLayout) LAYOUT.select(PATH$pVertexBindingDivisors);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vertexBindingDivisorCount = LAYOUT.byteOffset(PATH$vertexBindingDivisorCount);
    public static final long OFFSET$pVertexBindingDivisors = LAYOUT.byteOffset(PATH$pVertexBindingDivisors);

    public VkPipelineVertexInputDivisorStateCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VERTEX_INPUT_DIVISOR_STATE_CREATE_INFO_KHR);
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

    public @unsigned int vertexBindingDivisorCount() {
        return segment.get(LAYOUT$vertexBindingDivisorCount, OFFSET$vertexBindingDivisorCount);
    }

    public void vertexBindingDivisorCount(@unsigned int value) {
        segment.set(LAYOUT$vertexBindingDivisorCount, OFFSET$vertexBindingDivisorCount, value);
    }

    public @pointer(comment="VkVertexInputBindingDivisorDescriptionKHR*") MemorySegment pVertexBindingDivisorsRaw() {
        return segment.get(LAYOUT$pVertexBindingDivisors, OFFSET$pVertexBindingDivisors);
    }

    public void pVertexBindingDivisorsRaw(@pointer(comment="VkVertexInputBindingDivisorDescriptionKHR*") MemorySegment value) {
        segment.set(LAYOUT$pVertexBindingDivisors, OFFSET$pVertexBindingDivisors, value);
    }
    
    public @nullable VkVertexInputBindingDivisorDescriptionKHR pVertexBindingDivisors() {
        MemorySegment s = pVertexBindingDivisorsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVertexInputBindingDivisorDescriptionKHR(s);
    }

    public void pVertexBindingDivisors(@nullable VkVertexInputBindingDivisorDescriptionKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVertexBindingDivisorsRaw(s);
    }


    public static final class VkPipelineVertexInputDivisorStateCreateInfoKHRFactory implements IDataTypeFactory<VkPipelineVertexInputDivisorStateCreateInfoKHR> {
        @Override
        public Class<VkPipelineVertexInputDivisorStateCreateInfoKHR> clazz() {
            return VkPipelineVertexInputDivisorStateCreateInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineVertexInputDivisorStateCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineVertexInputDivisorStateCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkPipelineVertexInputDivisorStateCreateInfoKHR(segment);
        }
    }

    public static final VkPipelineVertexInputDivisorStateCreateInfoKHRFactory FACTORY = new VkPipelineVertexInputDivisorStateCreateInfoKHRFactory();
}
