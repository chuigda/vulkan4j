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

public record VkPipelineDynamicStateCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("dynamicStateCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDynamicStates")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$dynamicStateCount = PathElement.groupElement(3);
    public static final PathElement PATH$pDynamicStates = PathElement.groupElement(4);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$dynamicStateCount = (OfInt) LAYOUT.select(PATH$dynamicStateCount);
    public static final AddressLayout LAYOUT$pDynamicStates = (AddressLayout) LAYOUT.select(PATH$pDynamicStates);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$dynamicStateCount = LAYOUT.byteOffset(PATH$dynamicStateCount);
    public static final long OFFSET$pDynamicStates = LAYOUT.byteOffset(PATH$pDynamicStates);

    public VkPipelineDynamicStateCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_DYNAMIC_STATE_CREATE_INFO);
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

    public @enumtype(VkPipelineDynamicStateCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineDynamicStateCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int dynamicStateCount() {
        return segment.get(LAYOUT$dynamicStateCount, OFFSET$dynamicStateCount);
    }

    public void dynamicStateCount(@unsigned int value) {
        segment.set(LAYOUT$dynamicStateCount, OFFSET$dynamicStateCount, value);
    }

    public @pointer(target=VkDynamicState.class) MemorySegment pDynamicStatesRaw() {
        return segment.get(LAYOUT$pDynamicStates, OFFSET$pDynamicStates);
    }
    
    public void pDynamicStatesRaw(@pointer(target=VkDynamicState.class) MemorySegment value) {
        segment.set(LAYOUT$pDynamicStates, OFFSET$pDynamicStates, value);
    }
    
    public @nullable IntPtr pDynamicStates() {
        MemorySegment s = pDynamicStatesRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntPtr(s);
    }
    
    public void pDynamicStates(@nullable IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDynamicStatesRaw(s);
    }


    public static final class VkPipelineDynamicStateCreateInfoFactory implements IDataTypeFactory<VkPipelineDynamicStateCreateInfo> {
        @Override
        public Class<VkPipelineDynamicStateCreateInfo> clazz() {
            return VkPipelineDynamicStateCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineDynamicStateCreateInfo.LAYOUT;
        }

        @Override
        public VkPipelineDynamicStateCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineDynamicStateCreateInfo createUninit(MemorySegment segment) {
            return new VkPipelineDynamicStateCreateInfo(segment);
        }
    }

    public static final VkPipelineDynamicStateCreateInfoFactory FACTORY = new VkPipelineDynamicStateCreateInfoFactory();
}
