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

public record VkSubmitInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pWaitSemaphores"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pWaitDstStageMask"),
        ValueLayout.JAVA_INT.withName("commandBufferCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pCommandBuffers"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSignalSemaphores")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$waitSemaphoreCount = PathElement.groupElement(2);
    public static final PathElement PATH$pWaitSemaphores = PathElement.groupElement(3);
    public static final PathElement PATH$pWaitDstStageMask = PathElement.groupElement(4);
    public static final PathElement PATH$commandBufferCount = PathElement.groupElement(5);
    public static final PathElement PATH$pCommandBuffers = PathElement.groupElement(6);
    public static final PathElement PATH$signalSemaphoreCount = PathElement.groupElement(7);
    public static final PathElement PATH$pSignalSemaphores = PathElement.groupElement(8);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreCount);
    public static final AddressLayout LAYOUT$pWaitSemaphores = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphores);
    public static final AddressLayout LAYOUT$pWaitDstStageMask = (AddressLayout) LAYOUT.select(PATH$pWaitDstStageMask);
    public static final OfInt LAYOUT$commandBufferCount = (OfInt) LAYOUT.select(PATH$commandBufferCount);
    public static final AddressLayout LAYOUT$pCommandBuffers = (AddressLayout) LAYOUT.select(PATH$pCommandBuffers);
    public static final OfInt LAYOUT$signalSemaphoreCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreCount);
    public static final AddressLayout LAYOUT$pSignalSemaphores = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphores);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreCount = LAYOUT.byteOffset(PATH$waitSemaphoreCount);
    public static final long OFFSET$pWaitSemaphores = LAYOUT.byteOffset(PATH$pWaitSemaphores);
    public static final long OFFSET$pWaitDstStageMask = LAYOUT.byteOffset(PATH$pWaitDstStageMask);
    public static final long OFFSET$commandBufferCount = LAYOUT.byteOffset(PATH$commandBufferCount);
    public static final long OFFSET$pCommandBuffers = LAYOUT.byteOffset(PATH$pCommandBuffers);
    public static final long OFFSET$signalSemaphoreCount = LAYOUT.byteOffset(PATH$signalSemaphoreCount);
    public static final long OFFSET$pSignalSemaphores = LAYOUT.byteOffset(PATH$pSignalSemaphores);

    public VkSubmitInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SUBMIT_INFO);
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

    public @unsigned int waitSemaphoreCount() {
        return segment.get(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount);
    }

    public void waitSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount, value);
    }

    public @pointer(comment="VkSemaphore*") MemorySegment pWaitSemaphoresRaw() {
        return segment.get(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores);
    }

    public void pWaitSemaphoresRaw(@pointer(comment="VkSemaphore*") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores, value);
    }
    
    public @nullable VkSemaphore pWaitSemaphores() {
        MemorySegment s = pWaitSemaphoresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void pWaitSemaphores(@nullable VkSemaphore value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitSemaphoresRaw(s);
    }

    public @pointer(target=VkPipelineStageFlags.class) MemorySegment pWaitDstStageMaskRaw() {
        return segment.get(LAYOUT$pWaitDstStageMask, OFFSET$pWaitDstStageMask);
    }
    
    public void pWaitDstStageMaskRaw(@pointer(target=VkPipelineStageFlags.class) MemorySegment value) {
        segment.set(LAYOUT$pWaitDstStageMask, OFFSET$pWaitDstStageMask, value);
    }
    
    public @nullable IntPtr pWaitDstStageMask() {
        MemorySegment s = pWaitDstStageMaskRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntPtr(s);
    }
    
    public void pWaitDstStageMask(@nullable IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitDstStageMaskRaw(s);
    }

    public @unsigned int commandBufferCount() {
        return segment.get(LAYOUT$commandBufferCount, OFFSET$commandBufferCount);
    }

    public void commandBufferCount(@unsigned int value) {
        segment.set(LAYOUT$commandBufferCount, OFFSET$commandBufferCount, value);
    }

    public @pointer(comment="VkCommandBuffer*") MemorySegment pCommandBuffersRaw() {
        return segment.get(LAYOUT$pCommandBuffers, OFFSET$pCommandBuffers);
    }

    public void pCommandBuffersRaw(@pointer(comment="VkCommandBuffer*") MemorySegment value) {
        segment.set(LAYOUT$pCommandBuffers, OFFSET$pCommandBuffers, value);
    }
    
    public @nullable VkCommandBuffer pCommandBuffers() {
        MemorySegment s = pCommandBuffersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkCommandBuffer(s);
    }

    public void pCommandBuffers(@nullable VkCommandBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCommandBuffersRaw(s);
    }

    public @unsigned int signalSemaphoreCount() {
        return segment.get(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount);
    }

    public void signalSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount, value);
    }

    public @pointer(comment="VkSemaphore*") MemorySegment pSignalSemaphoresRaw() {
        return segment.get(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores);
    }

    public void pSignalSemaphoresRaw(@pointer(comment="VkSemaphore*") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores, value);
    }
    
    public @nullable VkSemaphore pSignalSemaphores() {
        MemorySegment s = pSignalSemaphoresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void pSignalSemaphores(@nullable VkSemaphore value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSignalSemaphoresRaw(s);
    }


    public static final class VkSubmitInfoFactory implements IDataTypeFactory<VkSubmitInfo> {
        @Override
        public Class<VkSubmitInfo> clazz() {
            return VkSubmitInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSubmitInfo.LAYOUT;
        }

        @Override
        public VkSubmitInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSubmitInfo createUninit(MemorySegment segment) {
            return new VkSubmitInfo(segment);
        }
    }

    public static final VkSubmitInfoFactory FACTORY = new VkSubmitInfoFactory();
}
