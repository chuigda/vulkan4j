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

public record VkBindSparseInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$waitSemaphoreCount = ValueLayout.JAVA_INT.withName("waitSemaphoreCount");
    public static final AddressLayout LAYOUT$pWaitSemaphores = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pWaitSemaphores");
    public static final OfInt LAYOUT$bufferBindCount = ValueLayout.JAVA_INT.withName("bufferBindCount");
    public static final AddressLayout LAYOUT$pBufferBinds = ValueLayout.ADDRESS.withTargetLayout(VkSparseBufferMemoryBindInfo.LAYOUT).withName("pBufferBinds");
    public static final OfInt LAYOUT$imageOpaqueBindCount = ValueLayout.JAVA_INT.withName("imageOpaqueBindCount");
    public static final AddressLayout LAYOUT$pImageOpaqueBinds = ValueLayout.ADDRESS.withTargetLayout(VkSparseImageOpaqueMemoryBindInfo.LAYOUT).withName("pImageOpaqueBinds");
    public static final OfInt LAYOUT$imageBindCount = ValueLayout.JAVA_INT.withName("imageBindCount");
    public static final AddressLayout LAYOUT$pImageBinds = ValueLayout.ADDRESS.withTargetLayout(VkSparseImageMemoryBindInfo.LAYOUT).withName("pImageBinds");
    public static final OfInt LAYOUT$signalSemaphoreCount = ValueLayout.JAVA_INT.withName("signalSemaphoreCount");
    public static final AddressLayout LAYOUT$pSignalSemaphores = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSignalSemaphores");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$waitSemaphoreCount, LAYOUT$pWaitSemaphores, LAYOUT$bufferBindCount, LAYOUT$pBufferBinds, LAYOUT$imageOpaqueBindCount, LAYOUT$pImageOpaqueBinds, LAYOUT$imageBindCount, LAYOUT$pImageBinds, LAYOUT$signalSemaphoreCount, LAYOUT$pSignalSemaphores);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkBindSparseInfo allocate(Arena arena) {
        return new VkBindSparseInfo(arena.allocate(LAYOUT));
    }

    public static VkBindSparseInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindSparseInfo[] ret = new VkBindSparseInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindSparseInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBindSparseInfo clone(Arena arena, VkBindSparseInfo src) {
        VkBindSparseInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBindSparseInfo[] clone(Arena arena, VkBindSparseInfo[] src) {
        VkBindSparseInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$waitSemaphoreCount = PathElement.groupElement("PATH$waitSemaphoreCount");
    public static final PathElement PATH$pWaitSemaphores = PathElement.groupElement("PATH$pWaitSemaphores");
    public static final PathElement PATH$bufferBindCount = PathElement.groupElement("PATH$bufferBindCount");
    public static final PathElement PATH$pBufferBinds = PathElement.groupElement("PATH$pBufferBinds");
    public static final PathElement PATH$imageOpaqueBindCount = PathElement.groupElement("PATH$imageOpaqueBindCount");
    public static final PathElement PATH$pImageOpaqueBinds = PathElement.groupElement("PATH$pImageOpaqueBinds");
    public static final PathElement PATH$imageBindCount = PathElement.groupElement("PATH$imageBindCount");
    public static final PathElement PATH$pImageBinds = PathElement.groupElement("PATH$pImageBinds");
    public static final PathElement PATH$signalSemaphoreCount = PathElement.groupElement("PATH$signalSemaphoreCount");
    public static final PathElement PATH$pSignalSemaphores = PathElement.groupElement("PATH$pSignalSemaphores");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$waitSemaphoreCount = LAYOUT$waitSemaphoreCount.byteSize();
    public static final long SIZE$pWaitSemaphores = LAYOUT$pWaitSemaphores.byteSize();
    public static final long SIZE$bufferBindCount = LAYOUT$bufferBindCount.byteSize();
    public static final long SIZE$pBufferBinds = LAYOUT$pBufferBinds.byteSize();
    public static final long SIZE$imageOpaqueBindCount = LAYOUT$imageOpaqueBindCount.byteSize();
    public static final long SIZE$pImageOpaqueBinds = LAYOUT$pImageOpaqueBinds.byteSize();
    public static final long SIZE$imageBindCount = LAYOUT$imageBindCount.byteSize();
    public static final long SIZE$pImageBinds = LAYOUT$pImageBinds.byteSize();
    public static final long SIZE$signalSemaphoreCount = LAYOUT$signalSemaphoreCount.byteSize();
    public static final long SIZE$pSignalSemaphores = LAYOUT$pSignalSemaphores.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreCount = LAYOUT.byteOffset(PATH$waitSemaphoreCount);
    public static final long OFFSET$pWaitSemaphores = LAYOUT.byteOffset(PATH$pWaitSemaphores);
    public static final long OFFSET$bufferBindCount = LAYOUT.byteOffset(PATH$bufferBindCount);
    public static final long OFFSET$pBufferBinds = LAYOUT.byteOffset(PATH$pBufferBinds);
    public static final long OFFSET$imageOpaqueBindCount = LAYOUT.byteOffset(PATH$imageOpaqueBindCount);
    public static final long OFFSET$pImageOpaqueBinds = LAYOUT.byteOffset(PATH$pImageOpaqueBinds);
    public static final long OFFSET$imageBindCount = LAYOUT.byteOffset(PATH$imageBindCount);
    public static final long OFFSET$pImageBinds = LAYOUT.byteOffset(PATH$pImageBinds);
    public static final long OFFSET$signalSemaphoreCount = LAYOUT.byteOffset(PATH$signalSemaphoreCount);
    public static final long OFFSET$pSignalSemaphores = LAYOUT.byteOffset(PATH$pSignalSemaphores);

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

    public @pointer(comment="VkSemaphore*") MemorySegment pWaitSemaphoresRaw() {
        return segment.get(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores);
    }

    public void pWaitSemaphoresRaw(@pointer(comment="VkSemaphore*") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores, value);
    }

    /// Note: the returned {@link VkSemaphore.Buffer} does not have correct {@link VkSemaphore.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkSemaphore.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkSemaphore.Buffer pWaitSemaphores() {
        MemorySegment s = pWaitSemaphoresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore.Buffer(s);
    }


    public @unsigned int bufferBindCount() {
        return segment.get(LAYOUT$bufferBindCount, OFFSET$bufferBindCount);
    }

    public void bufferBindCount(@unsigned int value) {
        segment.set(LAYOUT$bufferBindCount, OFFSET$bufferBindCount, value);
    }

    public @pointer(comment="VkSparseBufferMemoryBindInfo*") MemorySegment pBufferBindsRaw() {
        return segment.get(LAYOUT$pBufferBinds, OFFSET$pBufferBinds);
    }

    public void pBufferBindsRaw(@pointer(comment="VkSparseBufferMemoryBindInfo*") MemorySegment value) {
        segment.set(LAYOUT$pBufferBinds, OFFSET$pBufferBinds, value);
    }

    public @Nullable VkSparseBufferMemoryBindInfo pBufferBinds() {
        MemorySegment s = pBufferBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseBufferMemoryBindInfo(s);
    }

    public void pBufferBinds(@Nullable VkSparseBufferMemoryBindInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferBindsRaw(s);
    }

    @unsafe public @Nullable VkSparseBufferMemoryBindInfo[] pBufferBinds(int assumedCount) {
        MemorySegment s = pBufferBindsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSparseBufferMemoryBindInfo.SIZE);
        VkSparseBufferMemoryBindInfo[] ret = new VkSparseBufferMemoryBindInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSparseBufferMemoryBindInfo(s.asSlice(i * VkSparseBufferMemoryBindInfo.SIZE, VkSparseBufferMemoryBindInfo.SIZE));
        }
        return ret;
    }

    public @unsigned int imageOpaqueBindCount() {
        return segment.get(LAYOUT$imageOpaqueBindCount, OFFSET$imageOpaqueBindCount);
    }

    public void imageOpaqueBindCount(@unsigned int value) {
        segment.set(LAYOUT$imageOpaqueBindCount, OFFSET$imageOpaqueBindCount, value);
    }

    public @pointer(comment="VkSparseImageOpaqueMemoryBindInfo*") MemorySegment pImageOpaqueBindsRaw() {
        return segment.get(LAYOUT$pImageOpaqueBinds, OFFSET$pImageOpaqueBinds);
    }

    public void pImageOpaqueBindsRaw(@pointer(comment="VkSparseImageOpaqueMemoryBindInfo*") MemorySegment value) {
        segment.set(LAYOUT$pImageOpaqueBinds, OFFSET$pImageOpaqueBinds, value);
    }

    public @Nullable VkSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds() {
        MemorySegment s = pImageOpaqueBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseImageOpaqueMemoryBindInfo(s);
    }

    public void pImageOpaqueBinds(@Nullable VkSparseImageOpaqueMemoryBindInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageOpaqueBindsRaw(s);
    }

    @unsafe public @Nullable VkSparseImageOpaqueMemoryBindInfo[] pImageOpaqueBinds(int assumedCount) {
        MemorySegment s = pImageOpaqueBindsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSparseImageOpaqueMemoryBindInfo.SIZE);
        VkSparseImageOpaqueMemoryBindInfo[] ret = new VkSparseImageOpaqueMemoryBindInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSparseImageOpaqueMemoryBindInfo(s.asSlice(i * VkSparseImageOpaqueMemoryBindInfo.SIZE, VkSparseImageOpaqueMemoryBindInfo.SIZE));
        }
        return ret;
    }

    public @unsigned int imageBindCount() {
        return segment.get(LAYOUT$imageBindCount, OFFSET$imageBindCount);
    }

    public void imageBindCount(@unsigned int value) {
        segment.set(LAYOUT$imageBindCount, OFFSET$imageBindCount, value);
    }

    public @pointer(comment="VkSparseImageMemoryBindInfo*") MemorySegment pImageBindsRaw() {
        return segment.get(LAYOUT$pImageBinds, OFFSET$pImageBinds);
    }

    public void pImageBindsRaw(@pointer(comment="VkSparseImageMemoryBindInfo*") MemorySegment value) {
        segment.set(LAYOUT$pImageBinds, OFFSET$pImageBinds, value);
    }

    public @Nullable VkSparseImageMemoryBindInfo pImageBinds() {
        MemorySegment s = pImageBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseImageMemoryBindInfo(s);
    }

    public void pImageBinds(@Nullable VkSparseImageMemoryBindInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageBindsRaw(s);
    }

    @unsafe public @Nullable VkSparseImageMemoryBindInfo[] pImageBinds(int assumedCount) {
        MemorySegment s = pImageBindsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSparseImageMemoryBindInfo.SIZE);
        VkSparseImageMemoryBindInfo[] ret = new VkSparseImageMemoryBindInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSparseImageMemoryBindInfo(s.asSlice(i * VkSparseImageMemoryBindInfo.SIZE, VkSparseImageMemoryBindInfo.SIZE));
        }
        return ret;
    }

    public @unsigned int signalSemaphoreCount() {
        return segment.get(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount);
    }

    public void signalSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount, value);
    }

    public @pointer(comment="VkSemaphore*") MemorySegment pSignalSemaphoresRaw() {
        return segment.get(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores);
    }

    public void pSignalSemaphoresRaw(@pointer(comment="VkSemaphore*") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores, value);
    }

    /// Note: the returned {@link VkSemaphore.Buffer} does not have correct {@link VkSemaphore.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkSemaphore.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkSemaphore.Buffer pSignalSemaphores() {
        MemorySegment s = pSignalSemaphoresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore.Buffer(s);
    }


}
/// dummy, not implemented yet
