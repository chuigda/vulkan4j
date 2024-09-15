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

public record VkSubmitInfo2(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreSubmitInfo.LAYOUT).withName("pWaitSemaphoreInfos"),
        ValueLayout.JAVA_INT.withName("commandBufferInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkCommandBufferSubmitInfo.LAYOUT).withName("pCommandBufferInfos"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreInfoCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSemaphoreSubmitInfo.LAYOUT).withName("pSignalSemaphoreInfos")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$waitSemaphoreInfoCount = PathElement.groupElement(3);
    public static final PathElement PATH$pWaitSemaphoreInfos = PathElement.groupElement(4);
    public static final PathElement PATH$commandBufferInfoCount = PathElement.groupElement(5);
    public static final PathElement PATH$pCommandBufferInfos = PathElement.groupElement(6);
    public static final PathElement PATH$signalSemaphoreInfoCount = PathElement.groupElement(7);
    public static final PathElement PATH$pSignalSemaphoreInfos = PathElement.groupElement(8);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$waitSemaphoreInfoCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreInfoCount);
    public static final AddressLayout LAYOUT$pWaitSemaphoreInfos = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphoreInfos);
    public static final OfInt LAYOUT$commandBufferInfoCount = (OfInt) LAYOUT.select(PATH$commandBufferInfoCount);
    public static final AddressLayout LAYOUT$pCommandBufferInfos = (AddressLayout) LAYOUT.select(PATH$pCommandBufferInfos);
    public static final OfInt LAYOUT$signalSemaphoreInfoCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreInfoCount);
    public static final AddressLayout LAYOUT$pSignalSemaphoreInfos = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphoreInfos);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$waitSemaphoreInfoCount = LAYOUT.byteOffset(PATH$waitSemaphoreInfoCount);
    public static final long OFFSET$pWaitSemaphoreInfos = LAYOUT.byteOffset(PATH$pWaitSemaphoreInfos);
    public static final long OFFSET$commandBufferInfoCount = LAYOUT.byteOffset(PATH$commandBufferInfoCount);
    public static final long OFFSET$pCommandBufferInfos = LAYOUT.byteOffset(PATH$pCommandBufferInfos);
    public static final long OFFSET$signalSemaphoreInfoCount = LAYOUT.byteOffset(PATH$signalSemaphoreInfoCount);
    public static final long OFFSET$pSignalSemaphoreInfos = LAYOUT.byteOffset(PATH$pSignalSemaphoreInfos);

    public VkSubmitInfo2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SUBMIT_INFO_2);
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

    public @enumtype(VkSubmitFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSubmitFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int waitSemaphoreInfoCount() {
        return segment.get(LAYOUT$waitSemaphoreInfoCount, OFFSET$waitSemaphoreInfoCount);
    }

    public void waitSemaphoreInfoCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreInfoCount, OFFSET$waitSemaphoreInfoCount, value);
    }

    public @pointer(comment="VkSemaphoreSubmitInfo*") MemorySegment pWaitSemaphoreInfosRaw() {
        return segment.get(LAYOUT$pWaitSemaphoreInfos, OFFSET$pWaitSemaphoreInfos);
    }

    public void pWaitSemaphoreInfosRaw(@pointer(comment="VkSemaphoreSubmitInfo*") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphoreInfos, OFFSET$pWaitSemaphoreInfos, value);
    }
    
    public VkSemaphoreSubmitInfo pWaitSemaphoreInfos() {
        MemorySegment s = pWaitSemaphoreInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphoreSubmitInfo(s);
    }

    public void pWaitSemaphoreInfos(VkSemaphoreSubmitInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitSemaphoreInfosRaw(s);
    }

    public @unsigned int commandBufferInfoCount() {
        return segment.get(LAYOUT$commandBufferInfoCount, OFFSET$commandBufferInfoCount);
    }

    public void commandBufferInfoCount(@unsigned int value) {
        segment.set(LAYOUT$commandBufferInfoCount, OFFSET$commandBufferInfoCount, value);
    }

    public @pointer(comment="VkCommandBufferSubmitInfo*") MemorySegment pCommandBufferInfosRaw() {
        return segment.get(LAYOUT$pCommandBufferInfos, OFFSET$pCommandBufferInfos);
    }

    public void pCommandBufferInfosRaw(@pointer(comment="VkCommandBufferSubmitInfo*") MemorySegment value) {
        segment.set(LAYOUT$pCommandBufferInfos, OFFSET$pCommandBufferInfos, value);
    }
    
    public VkCommandBufferSubmitInfo pCommandBufferInfos() {
        MemorySegment s = pCommandBufferInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkCommandBufferSubmitInfo(s);
    }

    public void pCommandBufferInfos(VkCommandBufferSubmitInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCommandBufferInfosRaw(s);
    }

    public @unsigned int signalSemaphoreInfoCount() {
        return segment.get(LAYOUT$signalSemaphoreInfoCount, OFFSET$signalSemaphoreInfoCount);
    }

    public void signalSemaphoreInfoCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreInfoCount, OFFSET$signalSemaphoreInfoCount, value);
    }

    public @pointer(comment="VkSemaphoreSubmitInfo*") MemorySegment pSignalSemaphoreInfosRaw() {
        return segment.get(LAYOUT$pSignalSemaphoreInfos, OFFSET$pSignalSemaphoreInfos);
    }

    public void pSignalSemaphoreInfosRaw(@pointer(comment="VkSemaphoreSubmitInfo*") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphoreInfos, OFFSET$pSignalSemaphoreInfos, value);
    }
    
    public VkSemaphoreSubmitInfo pSignalSemaphoreInfos() {
        MemorySegment s = pSignalSemaphoreInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphoreSubmitInfo(s);
    }

    public void pSignalSemaphoreInfos(VkSemaphoreSubmitInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSignalSemaphoreInfosRaw(s);
    }


    public static final class VkSubmitInfo2Factory implements IDataTypeFactory<VkSubmitInfo2> {
        @Override
        public Class<VkSubmitInfo2> clazz() {
            return VkSubmitInfo2.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSubmitInfo2.LAYOUT;
        }

        @Override
        public VkSubmitInfo2 create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSubmitInfo2 createUninit(MemorySegment segment) {
            return new VkSubmitInfo2(segment);
        }
    }

    public static final VkSubmitInfo2Factory FACTORY = new VkSubmitInfo2Factory();
}
