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

public record VkCommandBufferSubmitInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("commandBuffer"),
        ValueLayout.JAVA_INT.withName("deviceMask")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$commandBuffer = PathElement.groupElement(2);
    public static final PathElement PATH$deviceMask = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$commandBuffer = (AddressLayout) LAYOUT.select(PATH$commandBuffer);
    public static final OfInt LAYOUT$deviceMask = (OfInt) LAYOUT.select(PATH$deviceMask);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$commandBuffer = LAYOUT.byteOffset(PATH$commandBuffer);
    public static final long OFFSET$deviceMask = LAYOUT.byteOffset(PATH$deviceMask);

    public VkCommandBufferSubmitInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_SUBMIT_INFO);
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

    public VkCommandBuffer commandBuffer() {
        return new VkCommandBuffer(segment.asSlice(OFFSET$commandBuffer, LAYOUT$commandBuffer));
    }

    public void commandBuffer(VkCommandBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$commandBuffer, LAYOUT$commandBuffer.byteSize());
    }

    public @unsigned int deviceMask() {
        return segment.get(LAYOUT$deviceMask, OFFSET$deviceMask);
    }

    public void deviceMask(@unsigned int value) {
        segment.set(LAYOUT$deviceMask, OFFSET$deviceMask, value);
    }


    public static final class VkCommandBufferSubmitInfoFactory implements IDataTypeFactory<VkCommandBufferSubmitInfo> {
        @Override
        public Class<VkCommandBufferSubmitInfo> clazz() {
            return VkCommandBufferSubmitInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCommandBufferSubmitInfo.LAYOUT;
        }

        @Override
        public VkCommandBufferSubmitInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkCommandBufferSubmitInfo createUninit(MemorySegment segment) {
            return new VkCommandBufferSubmitInfo(segment);
        }
    }

    public static final VkCommandBufferSubmitInfoFactory FACTORY = new VkCommandBufferSubmitInfoFactory();
}
