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

public record VkPipelineViewportExclusiveScissorStateCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exclusiveScissorCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pExclusiveScissors")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$exclusiveScissorCount = PathElement.groupElement(2);
    public static final PathElement PATH$pExclusiveScissors = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$exclusiveScissorCount = (OfInt) LAYOUT.select(PATH$exclusiveScissorCount);
    public static final AddressLayout LAYOUT$pExclusiveScissors = (AddressLayout) LAYOUT.select(PATH$pExclusiveScissors);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$exclusiveScissorCount = LAYOUT.byteOffset(PATH$exclusiveScissorCount);
    public static final long OFFSET$pExclusiveScissors = LAYOUT.byteOffset(PATH$pExclusiveScissors);

    public VkPipelineViewportExclusiveScissorStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_EXCLUSIVE_SCISSOR_STATE_CREATE_INFO_NV);
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

    public @unsigned int exclusiveScissorCount() {
        return segment.get(LAYOUT$exclusiveScissorCount, OFFSET$exclusiveScissorCount);
    }

    public void exclusiveScissorCount(@unsigned int value) {
        segment.set(LAYOUT$exclusiveScissorCount, OFFSET$exclusiveScissorCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pExclusiveScissorsRaw() {
        return segment.get(LAYOUT$pExclusiveScissors, OFFSET$pExclusiveScissors);
    }

    public void pExclusiveScissorsRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pExclusiveScissors, OFFSET$pExclusiveScissors, value);
    }
    
    public VkRect2D pExclusiveScissors() {
        MemorySegment s = pExclusiveScissorsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pExclusiveScissors(VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pExclusiveScissorsRaw(s);
    }


    public static final class VkPipelineViewportExclusiveScissorStateCreateInfoNVFactory implements IDataTypeFactory<VkPipelineViewportExclusiveScissorStateCreateInfoNV> {
        @Override
        public Class<VkPipelineViewportExclusiveScissorStateCreateInfoNV> clazz() {
            return VkPipelineViewportExclusiveScissorStateCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineViewportExclusiveScissorStateCreateInfoNV.LAYOUT;
        }

        @Override
        public VkPipelineViewportExclusiveScissorStateCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineViewportExclusiveScissorStateCreateInfoNV createUninit(MemorySegment segment) {
            return new VkPipelineViewportExclusiveScissorStateCreateInfoNV(segment);
        }
    }

    public static final VkPipelineViewportExclusiveScissorStateCreateInfoNVFactory FACTORY = new VkPipelineViewportExclusiveScissorStateCreateInfoNVFactory();
}