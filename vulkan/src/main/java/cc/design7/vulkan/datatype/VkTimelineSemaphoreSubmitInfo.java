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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkTimelineSemaphoreSubmitInfo.html">VkTimelineSemaphoreSubmitInfo</a>
@ValueBasedCandidate
public record VkTimelineSemaphoreSubmitInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$waitSemaphoreValueCount = ValueLayout.JAVA_INT.withName("waitSemaphoreValueCount");
    public static final AddressLayout LAYOUT$pWaitSemaphoreValues = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pWaitSemaphoreValues");
    public static final OfInt LAYOUT$signalSemaphoreValueCount = ValueLayout.JAVA_INT.withName("signalSemaphoreValueCount");
    public static final AddressLayout LAYOUT$pSignalSemaphoreValues = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pSignalSemaphoreValues");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$waitSemaphoreValueCount, LAYOUT$pWaitSemaphoreValues, LAYOUT$signalSemaphoreValueCount, LAYOUT$pSignalSemaphoreValues);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkTimelineSemaphoreSubmitInfo allocate(Arena arena) {
        return new VkTimelineSemaphoreSubmitInfo(arena.allocate(LAYOUT));
    }

    public static VkTimelineSemaphoreSubmitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkTimelineSemaphoreSubmitInfo[] ret = new VkTimelineSemaphoreSubmitInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkTimelineSemaphoreSubmitInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkTimelineSemaphoreSubmitInfo clone(Arena arena, VkTimelineSemaphoreSubmitInfo src) {
        VkTimelineSemaphoreSubmitInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkTimelineSemaphoreSubmitInfo[] clone(Arena arena, VkTimelineSemaphoreSubmitInfo[] src) {
        VkTimelineSemaphoreSubmitInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$waitSemaphoreValueCount = PathElement.groupElement("PATH$waitSemaphoreValueCount");
    public static final PathElement PATH$pWaitSemaphoreValues = PathElement.groupElement("PATH$pWaitSemaphoreValues");
    public static final PathElement PATH$signalSemaphoreValueCount = PathElement.groupElement("PATH$signalSemaphoreValueCount");
    public static final PathElement PATH$pSignalSemaphoreValues = PathElement.groupElement("PATH$pSignalSemaphoreValues");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$waitSemaphoreValueCount = LAYOUT$waitSemaphoreValueCount.byteSize();
    public static final long SIZE$pWaitSemaphoreValues = LAYOUT$pWaitSemaphoreValues.byteSize();
    public static final long SIZE$signalSemaphoreValueCount = LAYOUT$signalSemaphoreValueCount.byteSize();
    public static final long SIZE$pSignalSemaphoreValues = LAYOUT$pSignalSemaphoreValues.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreValueCount = LAYOUT.byteOffset(PATH$waitSemaphoreValueCount);
    public static final long OFFSET$pWaitSemaphoreValues = LAYOUT.byteOffset(PATH$pWaitSemaphoreValues);
    public static final long OFFSET$signalSemaphoreValueCount = LAYOUT.byteOffset(PATH$signalSemaphoreValueCount);
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

    public @unsigned int waitSemaphoreValueCount() {
        return segment.get(LAYOUT$waitSemaphoreValueCount, OFFSET$waitSemaphoreValueCount);
    }

    public void waitSemaphoreValueCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreValueCount, OFFSET$waitSemaphoreValueCount, value);
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

    public @unsigned int signalSemaphoreValueCount() {
        return segment.get(LAYOUT$signalSemaphoreValueCount, OFFSET$signalSemaphoreValueCount);
    }

    public void signalSemaphoreValueCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreValueCount, OFFSET$signalSemaphoreValueCount, value);
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
