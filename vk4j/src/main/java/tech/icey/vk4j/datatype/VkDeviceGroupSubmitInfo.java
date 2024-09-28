package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDeviceGroupSubmitInfo(MemorySegment segment) implements IPointer {
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
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$waitSemaphoreCount = PathElement.groupElement("waitSemaphoreCount");
    public static final PathElement PATH$pWaitSemaphoreDeviceIndices = PathElement.groupElement("pWaitSemaphoreDeviceIndices");
    public static final PathElement PATH$commandBufferCount = PathElement.groupElement("commandBufferCount");
    public static final PathElement PATH$pCommandBufferDeviceMasks = PathElement.groupElement("pCommandBufferDeviceMasks");
    public static final PathElement PATH$signalSemaphoreCount = PathElement.groupElement("signalSemaphoreCount");
    public static final PathElement PATH$pSignalSemaphoreDeviceIndices = PathElement.groupElement("pSignalSemaphoreDeviceIndices");

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$waitSemaphoreCount = LAYOUT$waitSemaphoreCount.byteSize();
    public static final long SIZE$pWaitSemaphoreDeviceIndices = LAYOUT$pWaitSemaphoreDeviceIndices.byteSize();
    public static final long SIZE$commandBufferCount = LAYOUT$commandBufferCount.byteSize();
    public static final long SIZE$pCommandBufferDeviceMasks = LAYOUT$pCommandBufferDeviceMasks.byteSize();
    public static final long SIZE$signalSemaphoreCount = LAYOUT$signalSemaphoreCount.byteSize();
    public static final long SIZE$pSignalSemaphoreDeviceIndices = LAYOUT$pSignalSemaphoreDeviceIndices.byteSize();

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

    public @nullable @unsigned IntBuffer pWaitSemaphoreDeviceIndices() {
        MemorySegment s = pWaitSemaphoreDeviceIndicesRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pWaitSemaphoreDeviceIndices(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitSemaphoreDeviceIndicesRaw(s);
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

    public @nullable @unsigned IntBuffer pCommandBufferDeviceMasks() {
        MemorySegment s = pCommandBufferDeviceMasksRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pCommandBufferDeviceMasks(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCommandBufferDeviceMasksRaw(s);
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

    public @nullable @unsigned IntBuffer pSignalSemaphoreDeviceIndices() {
        MemorySegment s = pSignalSemaphoreDeviceIndicesRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pSignalSemaphoreDeviceIndices(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSignalSemaphoreDeviceIndicesRaw(s);
    }

    public static VkDeviceGroupSubmitInfo allocate(Arena arena) {
        return new VkDeviceGroupSubmitInfo(arena.allocate(LAYOUT));
    }
    
    public static VkDeviceGroupSubmitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupSubmitInfo[] ret = new VkDeviceGroupSubmitInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceGroupSubmitInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
