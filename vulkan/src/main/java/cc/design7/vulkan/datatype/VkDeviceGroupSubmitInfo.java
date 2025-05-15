package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkDeviceGroupSubmitInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$waitSemaphoreCount = ValueLayout.JAVA_INT.withName("waitSemaphoreCount");
    public static final AddressLayout LAYOUT$pWaitSemaphoreDeviceIndices = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pWaitSemaphoreDeviceIndices");
    public static final OfInt LAYOUT$commandBufferCount = ValueLayout.JAVA_INT.withName("commandBufferCount");
    public static final AddressLayout LAYOUT$pCommandBufferDeviceMasks = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pCommandBufferDeviceMasks");
    public static final OfInt LAYOUT$signalSemaphoreCount = ValueLayout.JAVA_INT.withName("signalSemaphoreCount");
    public static final AddressLayout LAYOUT$pSignalSemaphoreDeviceIndices = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pSignalSemaphoreDeviceIndices");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$waitSemaphoreCount, LAYOUT$pWaitSemaphoreDeviceIndices, LAYOUT$commandBufferCount, LAYOUT$pCommandBufferDeviceMasks, LAYOUT$signalSemaphoreCount, LAYOUT$pSignalSemaphoreDeviceIndices);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceGroupSubmitInfo allocate(Arena arena) {
        return new VkDeviceGroupSubmitInfo(arena.allocate(LAYOUT));
    }

    public static VkDeviceGroupSubmitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupSubmitInfo[] ret = new VkDeviceGroupSubmitInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceGroupSubmitInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceGroupSubmitInfo clone(Arena arena, VkDeviceGroupSubmitInfo src) {
        VkDeviceGroupSubmitInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceGroupSubmitInfo[] clone(Arena arena, VkDeviceGroupSubmitInfo[] src) {
        VkDeviceGroupSubmitInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$waitSemaphoreCount = PathElement.groupElement("PATH$waitSemaphoreCount");
    public static final PathElement PATH$pWaitSemaphoreDeviceIndices = PathElement.groupElement("PATH$pWaitSemaphoreDeviceIndices");
    public static final PathElement PATH$commandBufferCount = PathElement.groupElement("PATH$commandBufferCount");
    public static final PathElement PATH$pCommandBufferDeviceMasks = PathElement.groupElement("PATH$pCommandBufferDeviceMasks");
    public static final PathElement PATH$signalSemaphoreCount = PathElement.groupElement("PATH$signalSemaphoreCount");
    public static final PathElement PATH$pSignalSemaphoreDeviceIndices = PathElement.groupElement("PATH$pSignalSemaphoreDeviceIndices");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$waitSemaphoreCount = LAYOUT$waitSemaphoreCount.byteSize();
    public static final long SIZE$pWaitSemaphoreDeviceIndices = LAYOUT$pWaitSemaphoreDeviceIndices.byteSize();
    public static final long SIZE$commandBufferCount = LAYOUT$commandBufferCount.byteSize();
    public static final long SIZE$pCommandBufferDeviceMasks = LAYOUT$pCommandBufferDeviceMasks.byteSize();
    public static final long SIZE$signalSemaphoreCount = LAYOUT$signalSemaphoreCount.byteSize();
    public static final long SIZE$pSignalSemaphoreDeviceIndices = LAYOUT$pSignalSemaphoreDeviceIndices.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreCount = LAYOUT.byteOffset(PATH$waitSemaphoreCount);
    public static final long OFFSET$pWaitSemaphoreDeviceIndices = LAYOUT.byteOffset(PATH$pWaitSemaphoreDeviceIndices);
    public static final long OFFSET$commandBufferCount = LAYOUT.byteOffset(PATH$commandBufferCount);
    public static final long OFFSET$pCommandBufferDeviceMasks = LAYOUT.byteOffset(PATH$pCommandBufferDeviceMasks);
    public static final long OFFSET$signalSemaphoreCount = LAYOUT.byteOffset(PATH$signalSemaphoreCount);
    public static final long OFFSET$pSignalSemaphoreDeviceIndices = LAYOUT.byteOffset(PATH$pSignalSemaphoreDeviceIndices);

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int waitSemaphoreCount() {
        return segment.get(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount);
    }

    public void waitSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount, value);
    }

    public @pointer(comment="int*") MemorySegment pWaitSemaphoreDeviceIndicesRaw() {
        return segment.get(LAYOUT$pWaitSemaphoreDeviceIndices, OFFSET$pWaitSemaphoreDeviceIndices);
    }

    public void pWaitSemaphoreDeviceIndicesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphoreDeviceIndices, OFFSET$pWaitSemaphoreDeviceIndices, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pWaitSemaphoreDeviceIndices() {
        MemorySegment s = pWaitSemaphoreDeviceIndicesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pWaitSemaphoreDeviceIndices(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitSemaphoreDeviceIndicesRaw(s);
    }

    public @unsigned int commandBufferCount() {
        return segment.get(LAYOUT$commandBufferCount, OFFSET$commandBufferCount);
    }

    public void commandBufferCount(@unsigned int value) {
        segment.set(LAYOUT$commandBufferCount, OFFSET$commandBufferCount, value);
    }

    public @pointer(comment="int*") MemorySegment pCommandBufferDeviceMasksRaw() {
        return segment.get(LAYOUT$pCommandBufferDeviceMasks, OFFSET$pCommandBufferDeviceMasks);
    }

    public void pCommandBufferDeviceMasksRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pCommandBufferDeviceMasks, OFFSET$pCommandBufferDeviceMasks, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pCommandBufferDeviceMasks() {
        MemorySegment s = pCommandBufferDeviceMasksRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pCommandBufferDeviceMasks(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCommandBufferDeviceMasksRaw(s);
    }

    public @unsigned int signalSemaphoreCount() {
        return segment.get(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount);
    }

    public void signalSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount, value);
    }

    public @pointer(comment="int*") MemorySegment pSignalSemaphoreDeviceIndicesRaw() {
        return segment.get(LAYOUT$pSignalSemaphoreDeviceIndices, OFFSET$pSignalSemaphoreDeviceIndices);
    }

    public void pSignalSemaphoreDeviceIndicesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphoreDeviceIndices, OFFSET$pSignalSemaphoreDeviceIndices, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pSignalSemaphoreDeviceIndices() {
        MemorySegment s = pSignalSemaphoreDeviceIndicesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pSignalSemaphoreDeviceIndices(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSignalSemaphoreDeviceIndicesRaw(s);
    }

}
/// dummy, not implemented yet
