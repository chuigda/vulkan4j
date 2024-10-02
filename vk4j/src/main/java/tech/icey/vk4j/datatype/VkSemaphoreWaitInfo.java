package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.panama.buffer.LongBuffer;
import tech.icey.vk4j.bitmask.VkSemaphoreWaitFlags;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.handle.VkSemaphore;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO;

/// {@snippet lang=c :
/// typedef struct VkSemaphoreWaitInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkSemaphoreWaitFlags flags;
///     uint32_t semaphoreCount;
///     const VkSemaphore* pSemaphores;
///     const uint64_t* pValues;
/// } VkSemaphoreWaitInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSemaphoreWaitInfo.html">VkSemaphoreWaitInfo</a>
public record VkSemaphoreWaitInfo(MemorySegment segment) implements IPointer {
    public VkSemaphoreWaitInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SEMAPHORE_WAIT_INFO);
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

    public @pointer(comment="VkSemaphore") MemorySegment pSemaphoresRaw() {
        return segment.get(LAYOUT$pSemaphores, OFFSET$pSemaphores);
    }

    public void pSemaphoresRaw(@pointer(comment="VkSemaphore") MemorySegment value) {
        segment.set(LAYOUT$pSemaphores, OFFSET$pSemaphores, value);
    }

    /// Note: the returned {@link VkSemaphore.Buffer} does not have correct
    /// {@link VkSemaphore.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkSemaphore.Buffer#reinterpret} to set the size before actually
    /// {@link VkSemaphore.Buffer#read}ing or {@link VkSemaphore.Buffer#write}ing
    /// the buffer.
    public @nullable VkSemaphore.Buffer pSemaphores() {
        MemorySegment s = pSemaphoresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore.Buffer(s);
    }

    public void pSemaphores(@nullable VkSemaphore.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSemaphoresRaw(s);
    }

    public @pointer(comment="uint64_t*") MemorySegment pValuesRaw() {
        return segment.get(LAYOUT$pValues, OFFSET$pValues);
    }

    public void pValuesRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pValues, OFFSET$pValues, value);
    }

    /// Note: the returned {@link LongBuffer} does not have correct
    /// {@link LongBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongBuffer#reinterpret} to set the size before actually
    /// {@link LongBuffer#read}ing or
    /// {@link LongBuffer#write}ing the buffer.
    public @nullable @unsigned LongBuffer pValues() {
        MemorySegment s = pValuesRaw();
        return s.address() == 0 ? null : new LongBuffer(s);
    }

    public void pValues(@nullable @unsigned LongBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pValuesRaw(s);
    }

    public static VkSemaphoreWaitInfo allocate(Arena arena) {
        return new VkSemaphoreWaitInfo(arena.allocate(LAYOUT));
    }

    public static VkSemaphoreWaitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSemaphoreWaitInfo[] ret = new VkSemaphoreWaitInfo[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("semaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSemaphores"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pValues")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$semaphoreCount = PathElement.groupElement("semaphoreCount");
    public static final PathElement PATH$pSemaphores = PathElement.groupElement("pSemaphores");
    public static final PathElement PATH$pValues = PathElement.groupElement("pValues");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$semaphoreCount = (OfInt) LAYOUT.select(PATH$semaphoreCount);
    public static final AddressLayout LAYOUT$pSemaphores = (AddressLayout) LAYOUT.select(PATH$pSemaphores);
    public static final AddressLayout LAYOUT$pValues = (AddressLayout) LAYOUT.select(PATH$pValues);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$semaphoreCount = LAYOUT.byteOffset(PATH$semaphoreCount);
    public static final long OFFSET$pSemaphores = LAYOUT.byteOffset(PATH$pSemaphores);
    public static final long OFFSET$pValues = LAYOUT.byteOffset(PATH$pValues);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$semaphoreCount = LAYOUT$semaphoreCount.byteSize();
    public static final long SIZE$pSemaphores = LAYOUT$pSemaphores.byteSize();
    public static final long SIZE$pValues = LAYOUT$pValues.byteSize();
}
