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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkTimelineSemaphoreSubmitInfo.html">VkTimelineSemaphoreSubmitInfo</a>
public record VkTimelineSemaphoreSubmitInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreValueCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pWaitSemaphoreValues"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreValueCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pSignalSemaphoreValues")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$waitSemaphoreValueCount = PathElement.groupElement("waitSemaphoreValueCount");
    public static final PathElement PATH$pWaitSemaphoreValues = PathElement.groupElement("pWaitSemaphoreValues");
    public static final PathElement PATH$signalSemaphoreValueCount = PathElement.groupElement("signalSemaphoreValueCount");
    public static final PathElement PATH$pSignalSemaphoreValues = PathElement.groupElement("pSignalSemaphoreValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreValueCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreValueCount);
    public static final AddressLayout LAYOUT$pWaitSemaphoreValues = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphoreValues);
    public static final OfInt LAYOUT$signalSemaphoreValueCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreValueCount);
    public static final AddressLayout LAYOUT$pSignalSemaphoreValues = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphoreValues);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreValueCount = LAYOUT.byteOffset(PATH$waitSemaphoreValueCount);
    public static final long OFFSET$pWaitSemaphoreValues = LAYOUT.byteOffset(PATH$pWaitSemaphoreValues);
    public static final long OFFSET$signalSemaphoreValueCount = LAYOUT.byteOffset(PATH$signalSemaphoreValueCount);
    public static final long OFFSET$pSignalSemaphoreValues = LAYOUT.byteOffset(PATH$pSignalSemaphoreValues);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$waitSemaphoreValueCount = LAYOUT$waitSemaphoreValueCount.byteSize();
    public static final long SIZE$pWaitSemaphoreValues = LAYOUT$pWaitSemaphoreValues.byteSize();
    public static final long SIZE$signalSemaphoreValueCount = LAYOUT$signalSemaphoreValueCount.byteSize();
    public static final long SIZE$pSignalSemaphoreValues = LAYOUT$pSignalSemaphoreValues.byteSize();

    public VkTimelineSemaphoreSubmitInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_TIMELINE_SEMAPHORE_SUBMIT_INFO);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int waitSemaphoreValueCount() {
        return segment.get(LAYOUT$waitSemaphoreValueCount, OFFSET$waitSemaphoreValueCount);
    }

    public void waitSemaphoreValueCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreValueCount, OFFSET$waitSemaphoreValueCount, value);
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

    public @unsigned int signalSemaphoreValueCount() {
        return segment.get(LAYOUT$signalSemaphoreValueCount, OFFSET$signalSemaphoreValueCount);
    }

    public void signalSemaphoreValueCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreValueCount, OFFSET$signalSemaphoreValueCount, value);
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

    public static VkTimelineSemaphoreSubmitInfo allocate(Arena arena) {
        return new VkTimelineSemaphoreSubmitInfo(arena.allocate(LAYOUT));
    }
    
    public static VkTimelineSemaphoreSubmitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkTimelineSemaphoreSubmitInfo[] ret = new VkTimelineSemaphoreSubmitInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkTimelineSemaphoreSubmitInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
