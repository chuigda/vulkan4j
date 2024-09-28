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

public record VkBindSparseInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pWaitSemaphores"),
        ValueLayout.JAVA_INT.withName("bufferBindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseBufferMemoryBindInfo.LAYOUT).withName("pBufferBinds"),
        ValueLayout.JAVA_INT.withName("imageOpaqueBindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseImageOpaqueMemoryBindInfo.LAYOUT).withName("pImageOpaqueBinds"),
        ValueLayout.JAVA_INT.withName("imageBindCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSparseImageMemoryBindInfo.LAYOUT).withName("pImageBinds"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSignalSemaphores")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$waitSemaphoreCount = PathElement.groupElement("waitSemaphoreCount");
    public static final PathElement PATH$pWaitSemaphores = PathElement.groupElement("pWaitSemaphores");
    public static final PathElement PATH$bufferBindCount = PathElement.groupElement("bufferBindCount");
    public static final PathElement PATH$pBufferBinds = PathElement.groupElement("pBufferBinds");
    public static final PathElement PATH$imageOpaqueBindCount = PathElement.groupElement("imageOpaqueBindCount");
    public static final PathElement PATH$pImageOpaqueBinds = PathElement.groupElement("pImageOpaqueBinds");
    public static final PathElement PATH$imageBindCount = PathElement.groupElement("imageBindCount");
    public static final PathElement PATH$pImageBinds = PathElement.groupElement("pImageBinds");
    public static final PathElement PATH$signalSemaphoreCount = PathElement.groupElement("signalSemaphoreCount");
    public static final PathElement PATH$pSignalSemaphores = PathElement.groupElement("pSignalSemaphores");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreCount);
    public static final AddressLayout LAYOUT$pWaitSemaphores = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphores);
    public static final OfInt LAYOUT$bufferBindCount = (OfInt) LAYOUT.select(PATH$bufferBindCount);
    public static final AddressLayout LAYOUT$pBufferBinds = (AddressLayout) LAYOUT.select(PATH$pBufferBinds);
    public static final OfInt LAYOUT$imageOpaqueBindCount = (OfInt) LAYOUT.select(PATH$imageOpaqueBindCount);
    public static final AddressLayout LAYOUT$pImageOpaqueBinds = (AddressLayout) LAYOUT.select(PATH$pImageOpaqueBinds);
    public static final OfInt LAYOUT$imageBindCount = (OfInt) LAYOUT.select(PATH$imageBindCount);
    public static final AddressLayout LAYOUT$pImageBinds = (AddressLayout) LAYOUT.select(PATH$pImageBinds);
    public static final OfInt LAYOUT$signalSemaphoreCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreCount);
    public static final AddressLayout LAYOUT$pSignalSemaphores = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphores);

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

    public VkBindSparseInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_SPARSE_INFO);
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

    public @unsigned int waitSemaphoreCount() {
        return segment.get(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount);
    }

    public void waitSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount, value);
    }

    public @pointer(comment="VkSemaphore") MemorySegment pWaitSemaphoresRaw() {
        return segment.get(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores);
    }

    public void pWaitSemaphoresRaw(@pointer(comment="VkSemaphore") MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores, value);
    }

    /// Note: the returned {@link VkSemaphore.Buffer} does not have correct
    /// {@link VkSemaphore.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkSemaphore.Buffer#reinterpret} to set the size before actually
    /// {@link VkSemaphore.Buffer#read}ing or {@link VkSemaphore.Buffer#write}ing
    /// the buffer.
    public @nullable VkSemaphore.Buffer pWaitSemaphores() {
        MemorySegment s = pWaitSemaphoresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore.Buffer(s);
    }

    public void pWaitSemaphores(@nullable VkSemaphore.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitSemaphoresRaw(s);
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
    
    public @nullable VkSparseBufferMemoryBindInfo pBufferBinds() {
        MemorySegment s = pBufferBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseBufferMemoryBindInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSparseBufferMemoryBindInfo[] pBufferBinds(int assumedCount) {
        MemorySegment s = pBufferBindsRaw().reinterpret(assumedCount * VkSparseBufferMemoryBindInfo.SIZE);
        VkSparseBufferMemoryBindInfo[] arr = new VkSparseBufferMemoryBindInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSparseBufferMemoryBindInfo(s.asSlice(i * VkSparseBufferMemoryBindInfo.SIZE, VkSparseBufferMemoryBindInfo.SIZE));
        }
        return arr;
    }

    public void pBufferBinds(@nullable VkSparseBufferMemoryBindInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferBindsRaw(s);
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
    
    public @nullable VkSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds() {
        MemorySegment s = pImageOpaqueBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseImageOpaqueMemoryBindInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSparseImageOpaqueMemoryBindInfo[] pImageOpaqueBinds(int assumedCount) {
        MemorySegment s = pImageOpaqueBindsRaw().reinterpret(assumedCount * VkSparseImageOpaqueMemoryBindInfo.SIZE);
        VkSparseImageOpaqueMemoryBindInfo[] arr = new VkSparseImageOpaqueMemoryBindInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSparseImageOpaqueMemoryBindInfo(s.asSlice(i * VkSparseImageOpaqueMemoryBindInfo.SIZE, VkSparseImageOpaqueMemoryBindInfo.SIZE));
        }
        return arr;
    }

    public void pImageOpaqueBinds(@nullable VkSparseImageOpaqueMemoryBindInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageOpaqueBindsRaw(s);
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
    
    public @nullable VkSparseImageMemoryBindInfo pImageBinds() {
        MemorySegment s = pImageBindsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSparseImageMemoryBindInfo(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSparseImageMemoryBindInfo[] pImageBinds(int assumedCount) {
        MemorySegment s = pImageBindsRaw().reinterpret(assumedCount * VkSparseImageMemoryBindInfo.SIZE);
        VkSparseImageMemoryBindInfo[] arr = new VkSparseImageMemoryBindInfo[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSparseImageMemoryBindInfo(s.asSlice(i * VkSparseImageMemoryBindInfo.SIZE, VkSparseImageMemoryBindInfo.SIZE));
        }
        return arr;
    }

    public void pImageBinds(@nullable VkSparseImageMemoryBindInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageBindsRaw(s);
    }

    public @unsigned int signalSemaphoreCount() {
        return segment.get(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount);
    }

    public void signalSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount, value);
    }

    public @pointer(comment="VkSemaphore") MemorySegment pSignalSemaphoresRaw() {
        return segment.get(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores);
    }

    public void pSignalSemaphoresRaw(@pointer(comment="VkSemaphore") MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores, value);
    }

    /// Note: the returned {@link VkSemaphore.Buffer} does not have correct
    /// {@link VkSemaphore.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkSemaphore.Buffer#reinterpret} to set the size before actually
    /// {@link VkSemaphore.Buffer#read}ing or {@link VkSemaphore.Buffer#write}ing
    /// the buffer.
    public @nullable VkSemaphore.Buffer pSignalSemaphores() {
        MemorySegment s = pSignalSemaphoresRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore.Buffer(s);
    }

    public void pSignalSemaphores(@nullable VkSemaphore.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSignalSemaphoresRaw(s);
    }

    public static VkBindSparseInfo allocate(Arena arena) {
        return new VkBindSparseInfo(arena.allocate(LAYOUT));
    }
    
    public static VkBindSparseInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindSparseInfo[] ret = new VkBindSparseInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindSparseInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
