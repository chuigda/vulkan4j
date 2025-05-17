package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindSparseInfo.html"><code>VkBindSparseInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkBindSparseInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t waitSemaphoreCount; // optional
///     VkSemaphore const* pWaitSemaphores;
///     uint32_t bufferBindCount; // optional
///     VkSparseBufferMemoryBindInfo const* pBufferBinds;
///     uint32_t imageOpaqueBindCount; // optional
///     VkSparseImageOpaqueMemoryBindInfo const* pImageOpaqueBinds;
///     uint32_t imageBindCount; // optional
///     VkSparseImageMemoryBindInfo const* pImageBinds;
///     uint32_t signalSemaphoreCount; // optional
///     VkSemaphore const* pSignalSemaphores;
/// } VkBindSparseInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_BIND_SPARSE_INFO`
///
/// The {@link VkBindSparseInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkBindSparseInfo#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkBindSparseInfo.html"><code>VkBindSparseInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkBindSparseInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkBindSparseInfo allocate(Arena arena) {
        VkBindSparseInfo ret = new VkBindSparseInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.BIND_SPARSE_INFO);
        return ret;
    }

    public static VkBindSparseInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindSparseInfo[] ret = new VkBindSparseInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkBindSparseInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.BIND_SPARSE_INFO);
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

    public void autoInit() {
        sType(VkStructureType.BIND_SPARSE_INFO);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int waitSemaphoreCount() {
        return segment.get(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount);
    }

    public void waitSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$waitSemaphoreCount, OFFSET$waitSemaphoreCount, value);
    }

    public @pointer(target=VkSemaphore.class) MemorySegment pWaitSemaphoresRaw() {
        return segment.get(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores);
    }

    public void pWaitSemaphoresRaw(@pointer(target=VkSemaphore.class) MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores, value);
    }

    /// Note: the returned {@link VkSemaphore.Ptr} does not have correct {@link VkSemaphore.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkSemaphore.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkSemaphore.Ptr pWaitSemaphores() {
        MemorySegment s = pWaitSemaphoresRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSemaphore.Ptr(s);
    }

    public void pWaitSemaphores(@Nullable VkSemaphore.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitSemaphoresRaw(s);
    }

    public @unsigned int bufferBindCount() {
        return segment.get(LAYOUT$bufferBindCount, OFFSET$bufferBindCount);
    }

    public void bufferBindCount(@unsigned int value) {
        segment.set(LAYOUT$bufferBindCount, OFFSET$bufferBindCount, value);
    }

    public @pointer(target=VkSparseBufferMemoryBindInfo.class) MemorySegment pBufferBindsRaw() {
        return segment.get(LAYOUT$pBufferBinds, OFFSET$pBufferBinds);
    }

    public void pBufferBindsRaw(@pointer(target=VkSparseBufferMemoryBindInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pBufferBinds, OFFSET$pBufferBinds, value);
    }

    public @Nullable VkSparseBufferMemoryBindInfo pBufferBinds() {
        MemorySegment s = pBufferBindsRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSparseBufferMemoryBindInfo.BYTES);
        VkSparseBufferMemoryBindInfo[] ret = new VkSparseBufferMemoryBindInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSparseBufferMemoryBindInfo(s.asSlice(i * VkSparseBufferMemoryBindInfo.BYTES, VkSparseBufferMemoryBindInfo.BYTES));
        }
        return ret;
    }

    public @unsigned int imageOpaqueBindCount() {
        return segment.get(LAYOUT$imageOpaqueBindCount, OFFSET$imageOpaqueBindCount);
    }

    public void imageOpaqueBindCount(@unsigned int value) {
        segment.set(LAYOUT$imageOpaqueBindCount, OFFSET$imageOpaqueBindCount, value);
    }

    public @pointer(target=VkSparseImageOpaqueMemoryBindInfo.class) MemorySegment pImageOpaqueBindsRaw() {
        return segment.get(LAYOUT$pImageOpaqueBinds, OFFSET$pImageOpaqueBinds);
    }

    public void pImageOpaqueBindsRaw(@pointer(target=VkSparseImageOpaqueMemoryBindInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pImageOpaqueBinds, OFFSET$pImageOpaqueBinds, value);
    }

    public @Nullable VkSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds() {
        MemorySegment s = pImageOpaqueBindsRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSparseImageOpaqueMemoryBindInfo.BYTES);
        VkSparseImageOpaqueMemoryBindInfo[] ret = new VkSparseImageOpaqueMemoryBindInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSparseImageOpaqueMemoryBindInfo(s.asSlice(i * VkSparseImageOpaqueMemoryBindInfo.BYTES, VkSparseImageOpaqueMemoryBindInfo.BYTES));
        }
        return ret;
    }

    public @unsigned int imageBindCount() {
        return segment.get(LAYOUT$imageBindCount, OFFSET$imageBindCount);
    }

    public void imageBindCount(@unsigned int value) {
        segment.set(LAYOUT$imageBindCount, OFFSET$imageBindCount, value);
    }

    public @pointer(target=VkSparseImageMemoryBindInfo.class) MemorySegment pImageBindsRaw() {
        return segment.get(LAYOUT$pImageBinds, OFFSET$pImageBinds);
    }

    public void pImageBindsRaw(@pointer(target=VkSparseImageMemoryBindInfo.class) MemorySegment value) {
        segment.set(LAYOUT$pImageBinds, OFFSET$pImageBinds, value);
    }

    public @Nullable VkSparseImageMemoryBindInfo pImageBinds() {
        MemorySegment s = pImageBindsRaw();
        if (s.equals(MemorySegment.NULL)) {
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSparseImageMemoryBindInfo.BYTES);
        VkSparseImageMemoryBindInfo[] ret = new VkSparseImageMemoryBindInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSparseImageMemoryBindInfo(s.asSlice(i * VkSparseImageMemoryBindInfo.BYTES, VkSparseImageMemoryBindInfo.BYTES));
        }
        return ret;
    }

    public @unsigned int signalSemaphoreCount() {
        return segment.get(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount);
    }

    public void signalSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount, value);
    }

    public @pointer(target=VkSemaphore.class) MemorySegment pSignalSemaphoresRaw() {
        return segment.get(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores);
    }

    public void pSignalSemaphoresRaw(@pointer(target=VkSemaphore.class) MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores, value);
    }

    /// Note: the returned {@link VkSemaphore.Ptr} does not have correct {@link VkSemaphore.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkSemaphore.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkSemaphore.Ptr pSignalSemaphores() {
        MemorySegment s = pSignalSemaphoresRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSemaphore.Ptr(s);
    }

    public void pSignalSemaphores(@Nullable VkSemaphore.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSignalSemaphoresRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long BYTES = LAYOUT.byteSize();

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
}
