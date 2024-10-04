package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.panama.buffer.LongBuffer;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR;

/// {@snippet lang=c :
/// typedef struct VkD3D12FenceSubmitInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreValuesCount;
///     const uint64_t* pWaitSemaphoreValues;
///     uint32_t signalSemaphoreValuesCount;
///     const uint64_t* pSignalSemaphoreValues;
/// } VkD3D12FenceSubmitInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkD3D12FenceSubmitInfoKHR.html">VkD3D12FenceSubmitInfoKHR</a>
public record VkD3D12FenceSubmitInfoKHR(MemorySegment segment) implements IPointer {
    public VkD3D12FenceSubmitInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_D3D12_FENCE_SUBMIT_INFO_KHR);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int waitSemaphoreValuesCount() {
        return segment.get(LAYOUT$waitSemaphoreValuesCount, OFFSET$waitSemaphoreValuesCount);
    }

    public void waitSemaphoreValuesCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreValuesCount, OFFSET$waitSemaphoreValuesCount, value);
    }

    public @pointer(comment="uint64_t*") MemorySegment pWaitSemaphoreValuesRaw() {
        return segment.get(LAYOUT$pWaitSemaphoreValues, OFFSET$pWaitSemaphoreValues);
    }

    public void pWaitSemaphoreValuesRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphoreValues, OFFSET$pWaitSemaphoreValues, value);
    }

    /// Note: the returned {@link LongBuffer} does not have correct
    /// {@link LongBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongBuffer#reinterpret} to set the size before actually
    /// {@link LongBuffer#read}ing or
    /// {@link LongBuffer#write}ing the buffer.
    public @nullable @unsigned LongBuffer pWaitSemaphoreValues() {
        MemorySegment s = pWaitSemaphoreValuesRaw();
        return s.address() == 0 ? null : new LongBuffer(s);
    }

    public void pWaitSemaphoreValues(@nullable @unsigned LongBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitSemaphoreValuesRaw(s);
    }

    public @unsigned int signalSemaphoreValuesCount() {
        return segment.get(LAYOUT$signalSemaphoreValuesCount, OFFSET$signalSemaphoreValuesCount);
    }

    public void signalSemaphoreValuesCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreValuesCount, OFFSET$signalSemaphoreValuesCount, value);
    }

    public @pointer(comment="uint64_t*") MemorySegment pSignalSemaphoreValuesRaw() {
        return segment.get(LAYOUT$pSignalSemaphoreValues, OFFSET$pSignalSemaphoreValues);
    }

    public void pSignalSemaphoreValuesRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphoreValues, OFFSET$pSignalSemaphoreValues, value);
    }

    /// Note: the returned {@link LongBuffer} does not have correct
    /// {@link LongBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongBuffer#reinterpret} to set the size before actually
    /// {@link LongBuffer#read}ing or
    /// {@link LongBuffer#write}ing the buffer.
    public @nullable @unsigned LongBuffer pSignalSemaphoreValues() {
        MemorySegment s = pSignalSemaphoreValuesRaw();
        return s.address() == 0 ? null : new LongBuffer(s);
    }

    public void pSignalSemaphoreValues(@nullable @unsigned LongBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSignalSemaphoreValuesRaw(s);
    }

    public static VkD3D12FenceSubmitInfoKHR allocate(Arena arena) {
        return new VkD3D12FenceSubmitInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkD3D12FenceSubmitInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkD3D12FenceSubmitInfoKHR[] ret = new VkD3D12FenceSubmitInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkD3D12FenceSubmitInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkD3D12FenceSubmitInfoKHR clone(Arena arena, VkD3D12FenceSubmitInfoKHR src) {
        VkD3D12FenceSubmitInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkD3D12FenceSubmitInfoKHR[] clone(Arena arena, VkD3D12FenceSubmitInfoKHR[] src) {
        VkD3D12FenceSubmitInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pWaitSemaphoreValues"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreValuesCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pSignalSemaphoreValues")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$waitSemaphoreValuesCount = PathElement.groupElement("waitSemaphoreValuesCount");
    public static final PathElement PATH$pWaitSemaphoreValues = PathElement.groupElement("pWaitSemaphoreValues");
    public static final PathElement PATH$signalSemaphoreValuesCount = PathElement.groupElement("signalSemaphoreValuesCount");
    public static final PathElement PATH$pSignalSemaphoreValues = PathElement.groupElement("pSignalSemaphoreValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreValuesCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreValuesCount);
    public static final AddressLayout LAYOUT$pWaitSemaphoreValues = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphoreValues);
    public static final OfInt LAYOUT$signalSemaphoreValuesCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreValuesCount);
    public static final AddressLayout LAYOUT$pSignalSemaphoreValues = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphoreValues);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreValuesCount = LAYOUT.byteOffset(PATH$waitSemaphoreValuesCount);
    public static final long OFFSET$pWaitSemaphoreValues = LAYOUT.byteOffset(PATH$pWaitSemaphoreValues);
    public static final long OFFSET$signalSemaphoreValuesCount = LAYOUT.byteOffset(PATH$signalSemaphoreValuesCount);
    public static final long OFFSET$pSignalSemaphoreValues = LAYOUT.byteOffset(PATH$pSignalSemaphoreValues);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$waitSemaphoreValuesCount = LAYOUT$waitSemaphoreValuesCount.byteSize();
    public static final long SIZE$pWaitSemaphoreValues = LAYOUT$pWaitSemaphoreValues.byteSize();
    public static final long SIZE$signalSemaphoreValuesCount = LAYOUT$signalSemaphoreValuesCount.byteSize();
    public static final long SIZE$pSignalSemaphoreValues = LAYOUT$pSignalSemaphoreValues.byteSize();
}
