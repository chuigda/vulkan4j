package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.vk4j.bitmask.VkSubmitFlags;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_SUBMIT_INFO_2;

/// {@snippet lang=c :
/// typedef struct VkSubmitInfo2 {
///     VkStructureType sType;
///     const void* pNext;
///     VkSubmitFlags flags;
///     uint32_t waitSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo* pWaitSemaphoreInfos;
///     uint32_t commandBufferInfoCount;
///     const VkCommandBufferSubmitInfo* pCommandBufferInfos;
///     uint32_t signalSemaphoreInfoCount;
///     const VkSemaphoreSubmitInfo* pSignalSemaphoreInfos;
/// } VkSubmitInfo2;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSubmitInfo2.html">VkSubmitInfo2</a>
public record VkSubmitInfo2(MemorySegment segment) implements IPointer {
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public @nullable VkSemaphoreSubmitInfo pWaitSemaphoreInfos() {
        MemorySegment s = pWaitSemaphoreInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphoreSubmitInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSemaphoreSubmitInfo[] pWaitSemaphoreInfos(int assumedCount) {
        MemorySegment s = pWaitSemaphoreInfosRaw().reinterpret(assumedCount * VkSemaphoreSubmitInfo.SIZE);
        VkSemaphoreSubmitInfo[] arr = new VkSemaphoreSubmitInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSemaphoreSubmitInfo(s.asSlice(i * VkSemaphoreSubmitInfo.SIZE, VkSemaphoreSubmitInfo.SIZE));
        }
        return arr;
    }

    public void pWaitSemaphoreInfos(@nullable VkSemaphoreSubmitInfo value) {
        pWaitSemaphoreInfosRaw(value == null ? MemorySegment.NULL : value.segment());
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

    public @nullable VkCommandBufferSubmitInfo pCommandBufferInfos() {
        MemorySegment s = pCommandBufferInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkCommandBufferSubmitInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkCommandBufferSubmitInfo[] pCommandBufferInfos(int assumedCount) {
        MemorySegment s = pCommandBufferInfosRaw().reinterpret(assumedCount * VkCommandBufferSubmitInfo.SIZE);
        VkCommandBufferSubmitInfo[] arr = new VkCommandBufferSubmitInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkCommandBufferSubmitInfo(s.asSlice(i * VkCommandBufferSubmitInfo.SIZE, VkCommandBufferSubmitInfo.SIZE));
        }
        return arr;
    }

    public void pCommandBufferInfos(@nullable VkCommandBufferSubmitInfo value) {
        pCommandBufferInfosRaw(value == null ? MemorySegment.NULL : value.segment());
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

    public @nullable VkSemaphoreSubmitInfo pSignalSemaphoreInfos() {
        MemorySegment s = pSignalSemaphoreInfosRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphoreSubmitInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSemaphoreSubmitInfo[] pSignalSemaphoreInfos(int assumedCount) {
        MemorySegment s = pSignalSemaphoreInfosRaw().reinterpret(assumedCount * VkSemaphoreSubmitInfo.SIZE);
        VkSemaphoreSubmitInfo[] arr = new VkSemaphoreSubmitInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSemaphoreSubmitInfo(s.asSlice(i * VkSemaphoreSubmitInfo.SIZE, VkSemaphoreSubmitInfo.SIZE));
        }
        return arr;
    }

    public void pSignalSemaphoreInfos(@nullable VkSemaphoreSubmitInfo value) {
        pSignalSemaphoreInfosRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkSubmitInfo2 allocate(Arena arena) {
        return new VkSubmitInfo2(arena.allocate(LAYOUT));
    }

    public static VkSubmitInfo2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubmitInfo2[] ret = new VkSubmitInfo2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSubmitInfo2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSubmitInfo2 clone(Arena arena, VkSubmitInfo2 src) {
        VkSubmitInfo2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSubmitInfo2[] clone(Arena arena, VkSubmitInfo2[] src) {
        VkSubmitInfo2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

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
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$waitSemaphoreInfoCount = PathElement.groupElement("waitSemaphoreInfoCount");
    public static final PathElement PATH$pWaitSemaphoreInfos = PathElement.groupElement("pWaitSemaphoreInfos");
    public static final PathElement PATH$commandBufferInfoCount = PathElement.groupElement("commandBufferInfoCount");
    public static final PathElement PATH$pCommandBufferInfos = PathElement.groupElement("pCommandBufferInfos");
    public static final PathElement PATH$signalSemaphoreInfoCount = PathElement.groupElement("signalSemaphoreInfoCount");
    public static final PathElement PATH$pSignalSemaphoreInfos = PathElement.groupElement("pSignalSemaphoreInfos");

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$waitSemaphoreInfoCount = LAYOUT$waitSemaphoreInfoCount.byteSize();
    public static final long SIZE$pWaitSemaphoreInfos = LAYOUT$pWaitSemaphoreInfos.byteSize();
    public static final long SIZE$commandBufferInfoCount = LAYOUT$commandBufferInfoCount.byteSize();
    public static final long SIZE$pCommandBufferInfos = LAYOUT$pCommandBufferInfos.byteSize();
    public static final long SIZE$signalSemaphoreInfoCount = LAYOUT$signalSemaphoreInfoCount.byteSize();
    public static final long SIZE$pSignalSemaphoreInfos = LAYOUT$pSignalSemaphoreInfos.byteSize();
}
