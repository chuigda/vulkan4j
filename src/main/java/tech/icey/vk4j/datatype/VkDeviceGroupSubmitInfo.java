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

public record VkDeviceGroupSubmitInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pWaitSemaphoreDeviceIndices"),
        ValueLayout.JAVA_INT.withName("commandBufferCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCommandBufferDeviceMasks"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pSignalSemaphoreDeviceIndices")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$waitSemaphoreCount = PathElement.groupElement(2);
    public static final PathElement PATH$pWaitSemaphoreDeviceIndices = PathElement.groupElement(3);
    public static final PathElement PATH$commandBufferCount = PathElement.groupElement(4);
    public static final PathElement PATH$pCommandBufferDeviceMasks = PathElement.groupElement(5);
    public static final PathElement PATH$signalSemaphoreCount = PathElement.groupElement(6);
    public static final PathElement PATH$pSignalSemaphoreDeviceIndices = PathElement.groupElement(7);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreCount);
    public static final AddressLayout LAYOUT$pWaitSemaphoreDeviceIndices = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphoreDeviceIndices);
    public static final OfInt LAYOUT$commandBufferCount = (OfInt) LAYOUT.select(PATH$commandBufferCount);
    public static final AddressLayout LAYOUT$pCommandBufferDeviceMasks = (AddressLayout) LAYOUT.select(PATH$pCommandBufferDeviceMasks);
    public static final OfInt LAYOUT$signalSemaphoreCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreCount);
    public static final AddressLayout LAYOUT$pSignalSemaphoreDeviceIndices = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphoreDeviceIndices);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreCount = LAYOUT.byteOffset(PATH$waitSemaphoreCount);
    public static final long OFFSET$pWaitSemaphoreDeviceIndices = LAYOUT.byteOffset(PATH$pWaitSemaphoreDeviceIndices);
    public static final long OFFSET$commandBufferCount = LAYOUT.byteOffset(PATH$commandBufferCount);
    public static final long OFFSET$pCommandBufferDeviceMasks = LAYOUT.byteOffset(PATH$pCommandBufferDeviceMasks);
    public static final long OFFSET$signalSemaphoreCount = LAYOUT.byteOffset(PATH$signalSemaphoreCount);
    public static final long OFFSET$pSignalSemaphoreDeviceIndices = LAYOUT.byteOffset(PATH$pSignalSemaphoreDeviceIndices);

    public VkDeviceGroupSubmitInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_GROUP_SUBMIT_INFO);
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

    public @pointer(comment="uint32_t*") MemorySegment pWaitSemaphoreDeviceIndicesRaw() {
        return segment.get(LAYOUT$pWaitSemaphoreDeviceIndices, OFFSET$pWaitSemaphoreDeviceIndices);
    }

    public void pWaitSemaphoreDeviceIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphoreDeviceIndices, OFFSET$pWaitSemaphoreDeviceIndices, value);
    }
    
    public @unsigned IntPtr pWaitSemaphoreDeviceIndices() {
        return new IntPtr(pWaitSemaphoreDeviceIndicesRaw());
    }

    public void pWaitSemaphoreDeviceIndices(@unsigned IntPtr value) {
        pWaitSemaphoreDeviceIndicesRaw(value.segment());
    }

    public @unsigned int commandBufferCount() {
        return segment.get(LAYOUT$commandBufferCount, OFFSET$commandBufferCount);
    }

    public void commandBufferCount(@unsigned int value) {
        segment.set(LAYOUT$commandBufferCount, OFFSET$commandBufferCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pCommandBufferDeviceMasksRaw() {
        return segment.get(LAYOUT$pCommandBufferDeviceMasks, OFFSET$pCommandBufferDeviceMasks);
    }

    public void pCommandBufferDeviceMasksRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pCommandBufferDeviceMasks, OFFSET$pCommandBufferDeviceMasks, value);
    }
    
    public @unsigned IntPtr pCommandBufferDeviceMasks() {
        return new IntPtr(pCommandBufferDeviceMasksRaw());
    }

    public void pCommandBufferDeviceMasks(@unsigned IntPtr value) {
        pCommandBufferDeviceMasksRaw(value.segment());
    }

    public @unsigned int signalSemaphoreCount() {
        return segment.get(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount);
    }

    public void signalSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pSignalSemaphoreDeviceIndicesRaw() {
        return segment.get(LAYOUT$pSignalSemaphoreDeviceIndices, OFFSET$pSignalSemaphoreDeviceIndices);
    }

    public void pSignalSemaphoreDeviceIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphoreDeviceIndices, OFFSET$pSignalSemaphoreDeviceIndices, value);
    }
    
    public @unsigned IntPtr pSignalSemaphoreDeviceIndices() {
        return new IntPtr(pSignalSemaphoreDeviceIndicesRaw());
    }

    public void pSignalSemaphoreDeviceIndices(@unsigned IntPtr value) {
        pSignalSemaphoreDeviceIndicesRaw(value.segment());
    }


    public static final class VkDeviceGroupSubmitInfoFactory implements IDataTypeFactory<VkDeviceGroupSubmitInfo> {
        @Override
        public Class<VkDeviceGroupSubmitInfo> clazz() {
            return VkDeviceGroupSubmitInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceGroupSubmitInfo.LAYOUT;
        }

        @Override
        public VkDeviceGroupSubmitInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDeviceGroupSubmitInfo createUninit(MemorySegment segment) {
            return new VkDeviceGroupSubmitInfo(segment);
        }
    }

    public static final VkDeviceGroupSubmitInfoFactory FACTORY = new VkDeviceGroupSubmitInfoFactory();
}