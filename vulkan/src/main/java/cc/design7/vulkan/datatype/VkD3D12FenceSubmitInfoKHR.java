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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkD3D12FenceSubmitInfoKHR.html">VkD3D12FenceSubmitInfoKHR</a>
@ValueBasedCandidate
public record VkD3D12FenceSubmitInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$waitSemaphoreValuesCount = ValueLayout.JAVA_INT.withName("waitSemaphoreValuesCount");
    public static final AddressLayout LAYOUT$pWaitSemaphoreValues = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pWaitSemaphoreValues");
    public static final OfInt LAYOUT$signalSemaphoreValuesCount = ValueLayout.JAVA_INT.withName("signalSemaphoreValuesCount");
    public static final AddressLayout LAYOUT$pSignalSemaphoreValues = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pSignalSemaphoreValues");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$waitSemaphoreValuesCount, LAYOUT$pWaitSemaphoreValues, LAYOUT$signalSemaphoreValuesCount, LAYOUT$pSignalSemaphoreValues);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkD3D12FenceSubmitInfoKHR allocate(Arena arena) {
        return new VkD3D12FenceSubmitInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkD3D12FenceSubmitInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkD3D12FenceSubmitInfoKHR[] ret = new VkD3D12FenceSubmitInfoKHR[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$waitSemaphoreValuesCount = PathElement.groupElement("PATH$waitSemaphoreValuesCount");
    public static final PathElement PATH$pWaitSemaphoreValues = PathElement.groupElement("PATH$pWaitSemaphoreValues");
    public static final PathElement PATH$signalSemaphoreValuesCount = PathElement.groupElement("PATH$signalSemaphoreValuesCount");
    public static final PathElement PATH$pSignalSemaphoreValues = PathElement.groupElement("PATH$pSignalSemaphoreValues");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$waitSemaphoreValuesCount = LAYOUT$waitSemaphoreValuesCount.byteSize();
    public static final long SIZE$pWaitSemaphoreValues = LAYOUT$pWaitSemaphoreValues.byteSize();
    public static final long SIZE$signalSemaphoreValuesCount = LAYOUT$signalSemaphoreValuesCount.byteSize();
    public static final long SIZE$pSignalSemaphoreValues = LAYOUT$pSignalSemaphoreValues.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreValuesCount = LAYOUT.byteOffset(PATH$waitSemaphoreValuesCount);
    public static final long OFFSET$pWaitSemaphoreValues = LAYOUT.byteOffset(PATH$pWaitSemaphoreValues);
    public static final long OFFSET$signalSemaphoreValuesCount = LAYOUT.byteOffset(PATH$signalSemaphoreValuesCount);
    public static final long OFFSET$pSignalSemaphoreValues = LAYOUT.byteOffset(PATH$pSignalSemaphoreValues);

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

    public @unsigned int waitSemaphoreValuesCount() {
        return segment.get(LAYOUT$waitSemaphoreValuesCount, OFFSET$waitSemaphoreValuesCount);
    }

    public void waitSemaphoreValuesCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreValuesCount, OFFSET$waitSemaphoreValuesCount, value);
    }

    public @pointer(comment="long*") MemorySegment pWaitSemaphoreValuesRaw() {
        return segment.get(LAYOUT$pWaitSemaphoreValues, OFFSET$pWaitSemaphoreValues);
    }

    public void pWaitSemaphoreValuesRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphoreValues, OFFSET$pWaitSemaphoreValues, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pWaitSemaphoreValues() {
        MemorySegment s = pWaitSemaphoreValuesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pWaitSemaphoreValues(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitSemaphoreValuesRaw(s);
    }

    public @unsigned int signalSemaphoreValuesCount() {
        return segment.get(LAYOUT$signalSemaphoreValuesCount, OFFSET$signalSemaphoreValuesCount);
    }

    public void signalSemaphoreValuesCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreValuesCount, OFFSET$signalSemaphoreValuesCount, value);
    }

    public @pointer(comment="long*") MemorySegment pSignalSemaphoreValuesRaw() {
        return segment.get(LAYOUT$pSignalSemaphoreValues, OFFSET$pSignalSemaphoreValues);
    }

    public void pSignalSemaphoreValuesRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphoreValues, OFFSET$pSignalSemaphoreValues, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pSignalSemaphoreValues() {
        MemorySegment s = pSignalSemaphoreValuesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pSignalSemaphoreValues(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSignalSemaphoreValuesRaw(s);
    }

}
