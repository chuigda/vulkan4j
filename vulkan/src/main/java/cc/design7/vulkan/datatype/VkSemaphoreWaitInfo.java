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

public record VkSemaphoreWaitInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$semaphoreCount = ValueLayout.JAVA_INT.withName("semaphoreCount");
    public static final AddressLayout LAYOUT$pSemaphores = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSemaphores");
    public static final AddressLayout LAYOUT$pValues = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pValues");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$semaphoreCount, LAYOUT$pSemaphores, LAYOUT$pValues);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSemaphoreWaitInfo allocate(Arena arena) {
        return new VkSemaphoreWaitInfo(arena.allocate(LAYOUT));
    }

    public static VkSemaphoreWaitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSemaphoreWaitInfo[] ret = new VkSemaphoreWaitInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSemaphoreWaitInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSemaphoreWaitInfo clone(Arena arena, VkSemaphoreWaitInfo src) {
        VkSemaphoreWaitInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSemaphoreWaitInfo[] clone(Arena arena, VkSemaphoreWaitInfo[] src) {
        VkSemaphoreWaitInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$semaphoreCount = PathElement.groupElement("PATH$semaphoreCount");
    public static final PathElement PATH$pSemaphores = PathElement.groupElement("PATH$pSemaphores");
    public static final PathElement PATH$pValues = PathElement.groupElement("PATH$pValues");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$semaphoreCount = LAYOUT$semaphoreCount.byteSize();
    public static final long SIZE$pSemaphores = LAYOUT$pSemaphores.byteSize();
    public static final long SIZE$pValues = LAYOUT$pValues.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$semaphoreCount = LAYOUT.byteOffset(PATH$semaphoreCount);
    public static final long OFFSET$pSemaphores = LAYOUT.byteOffset(PATH$pSemaphores);
    public static final long OFFSET$pValues = LAYOUT.byteOffset(PATH$pValues);

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

    public @enumtype(VkSemaphoreWaitFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSemaphoreWaitFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int semaphoreCount() {
        return segment.get(LAYOUT$semaphoreCount, OFFSET$semaphoreCount);
    }

    public void semaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$semaphoreCount, OFFSET$semaphoreCount, value);
    }

    public @pointer(comment="VkSemaphore*") MemorySegment pSemaphoresRaw() {
        return segment.get(LAYOUT$pSemaphores, OFFSET$pSemaphores);
    }

    public void pSemaphoresRaw(@pointer(comment="VkSemaphore*") MemorySegment value) {
        segment.set(LAYOUT$pSemaphores, OFFSET$pSemaphores, value);
    }

    /// Note: the returned {@link VkSemaphore.Buffer} does not have correct {@link VkSemaphore.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkSemaphore.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkSemaphore.Buffer pSemaphores() {
        MemorySegment s = pSemaphoresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore.Buffer(s);
    }


    public @pointer(comment="long*") MemorySegment pValuesRaw() {
        return segment.get(LAYOUT$pValues, OFFSET$pValues);
    }

    public void pValuesRaw(@pointer(comment="long*") MemorySegment value) {
        segment.set(LAYOUT$pValues, OFFSET$pValues, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned LongPtr pValues() {
        MemorySegment s = pValuesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new LongPtr(s);
    }

    public void pValues(@Nullable @unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pValuesRaw(s);
    }

}
/// dummy, not implemented yet
