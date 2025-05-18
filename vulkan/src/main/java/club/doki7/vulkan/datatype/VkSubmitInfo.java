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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubmitInfo.html"><code>VkSubmitInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSubmitInfo {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t waitSemaphoreCount; // optional // @link substring="waitSemaphoreCount" target="#waitSemaphoreCount"
///     VkSemaphore const* pWaitSemaphores; // @link substring="VkSemaphore" target="VkSemaphore" @link substring="pWaitSemaphores" target="#pWaitSemaphores"
///     VkPipelineStageFlags const* pWaitDstStageMask; // @link substring="VkPipelineStageFlags" target="VkPipelineStageFlags" @link substring="pWaitDstStageMask" target="#pWaitDstStageMask"
///     uint32_t commandBufferCount; // optional // @link substring="commandBufferCount" target="#commandBufferCount"
///     VkCommandBuffer const* pCommandBuffers; // @link substring="VkCommandBuffer" target="VkCommandBuffer" @link substring="pCommandBuffers" target="#pCommandBuffers"
///     uint32_t signalSemaphoreCount; // optional // @link substring="signalSemaphoreCount" target="#signalSemaphoreCount"
///     VkSemaphore const* pSignalSemaphores; // @link substring="VkSemaphore" target="VkSemaphore" @link substring="pSignalSemaphores" target="#pSignalSemaphores"
/// } VkSubmitInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SUBMIT_INFO`
///
/// The {@code allocate} ({@link VkSubmitInfo#allocate(Arena)}, {@link VkSubmitInfo#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkSubmitInfo#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSubmitInfo.html"><code>VkSubmitInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSubmitInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkSubmitInfo allocate(Arena arena) {
        VkSubmitInfo ret = new VkSubmitInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SUBMIT_INFO);
        return ret;
    }

    public static VkSubmitInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubmitInfo[] ret = new VkSubmitInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSubmitInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SUBMIT_INFO);
        }
        return ret;
    }

    public static VkSubmitInfo clone(Arena arena, VkSubmitInfo src) {
        VkSubmitInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSubmitInfo[] clone(Arena arena, VkSubmitInfo[] src) {
        VkSubmitInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SUBMIT_INFO);
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

    public @pointer(target=VkSemaphore.class) MemorySegment pWaitSemaphoresRaw() {
        return segment.get(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores);
    }

    public void pWaitSemaphoresRaw(@pointer(target=VkSemaphore.class) MemorySegment value) {
        segment.set(LAYOUT$pWaitSemaphores, OFFSET$pWaitSemaphores, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkPipelineStageFlags.class) IntPtr pWaitDstStageMask() {
        MemorySegment s = pWaitDstStageMaskRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pWaitDstStageMask(@Nullable @enumtype(VkPipelineStageFlags.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWaitDstStageMaskRaw(s);
    }

    public @pointer(target=VkPipelineStageFlags.class) MemorySegment pWaitDstStageMaskRaw() {
        return segment.get(LAYOUT$pWaitDstStageMask, OFFSET$pWaitDstStageMask);
    }

    public void pWaitDstStageMaskRaw(@pointer(target=VkPipelineStageFlags.class) MemorySegment value) {
        segment.set(LAYOUT$pWaitDstStageMask, OFFSET$pWaitDstStageMask, value);
    }

    public @unsigned int commandBufferCount() {
        return segment.get(LAYOUT$commandBufferCount, OFFSET$commandBufferCount);
    }

    public void commandBufferCount(@unsigned int value) {
        segment.set(LAYOUT$commandBufferCount, OFFSET$commandBufferCount, value);
    }

    /// Note: the returned {@link VkCommandBuffer.Ptr} does not have correct {@link VkCommandBuffer.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkCommandBuffer.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkCommandBuffer.Ptr pCommandBuffers() {
        MemorySegment s = pCommandBuffersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkCommandBuffer.Ptr(s);
    }

    public void pCommandBuffers(@Nullable VkCommandBuffer.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCommandBuffersRaw(s);
    }

    public @pointer(target=VkCommandBuffer.class) MemorySegment pCommandBuffersRaw() {
        return segment.get(LAYOUT$pCommandBuffers, OFFSET$pCommandBuffers);
    }

    public void pCommandBuffersRaw(@pointer(target=VkCommandBuffer.class) MemorySegment value) {
        segment.set(LAYOUT$pCommandBuffers, OFFSET$pCommandBuffers, value);
    }

    public @unsigned int signalSemaphoreCount() {
        return segment.get(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount);
    }

    public void signalSemaphoreCount(@unsigned int value) {
        segment.set(LAYOUT$signalSemaphoreCount, OFFSET$signalSemaphoreCount, value);
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

    public @pointer(target=VkSemaphore.class) MemorySegment pSignalSemaphoresRaw() {
        return segment.get(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores);
    }

    public void pSignalSemaphoresRaw(@pointer(target=VkSemaphore.class) MemorySegment value) {
        segment.set(LAYOUT$pSignalSemaphores, OFFSET$pSignalSemaphores, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pWaitSemaphores"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pWaitDstStageMask"),
        ValueLayout.JAVA_INT.withName("commandBufferCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pCommandBuffers"),
        ValueLayout.JAVA_INT.withName("signalSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSignalSemaphores")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$waitSemaphoreCount = PathElement.groupElement("PATH$waitSemaphoreCount");
    public static final PathElement PATH$pWaitSemaphores = PathElement.groupElement("PATH$pWaitSemaphores");
    public static final PathElement PATH$pWaitDstStageMask = PathElement.groupElement("PATH$pWaitDstStageMask");
    public static final PathElement PATH$commandBufferCount = PathElement.groupElement("PATH$commandBufferCount");
    public static final PathElement PATH$pCommandBuffers = PathElement.groupElement("PATH$pCommandBuffers");
    public static final PathElement PATH$signalSemaphoreCount = PathElement.groupElement("PATH$signalSemaphoreCount");
    public static final PathElement PATH$pSignalSemaphores = PathElement.groupElement("PATH$pSignalSemaphores");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreCount);
    public static final AddressLayout LAYOUT$pWaitSemaphores = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphores);
    public static final AddressLayout LAYOUT$pWaitDstStageMask = (AddressLayout) LAYOUT.select(PATH$pWaitDstStageMask);
    public static final OfInt LAYOUT$commandBufferCount = (OfInt) LAYOUT.select(PATH$commandBufferCount);
    public static final AddressLayout LAYOUT$pCommandBuffers = (AddressLayout) LAYOUT.select(PATH$pCommandBuffers);
    public static final OfInt LAYOUT$signalSemaphoreCount = (OfInt) LAYOUT.select(PATH$signalSemaphoreCount);
    public static final AddressLayout LAYOUT$pSignalSemaphores = (AddressLayout) LAYOUT.select(PATH$pSignalSemaphores);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$waitSemaphoreCount = LAYOUT$waitSemaphoreCount.byteSize();
    public static final long SIZE$pWaitSemaphores = LAYOUT$pWaitSemaphores.byteSize();
    public static final long SIZE$pWaitDstStageMask = LAYOUT$pWaitDstStageMask.byteSize();
    public static final long SIZE$commandBufferCount = LAYOUT$commandBufferCount.byteSize();
    public static final long SIZE$pCommandBuffers = LAYOUT$pCommandBuffers.byteSize();
    public static final long SIZE$signalSemaphoreCount = LAYOUT$signalSemaphoreCount.byteSize();
    public static final long SIZE$pSignalSemaphores = LAYOUT$pSignalSemaphores.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreCount = LAYOUT.byteOffset(PATH$waitSemaphoreCount);
    public static final long OFFSET$pWaitSemaphores = LAYOUT.byteOffset(PATH$pWaitSemaphores);
    public static final long OFFSET$pWaitDstStageMask = LAYOUT.byteOffset(PATH$pWaitDstStageMask);
    public static final long OFFSET$commandBufferCount = LAYOUT.byteOffset(PATH$commandBufferCount);
    public static final long OFFSET$pCommandBuffers = LAYOUT.byteOffset(PATH$pCommandBuffers);
    public static final long OFFSET$signalSemaphoreCount = LAYOUT.byteOffset(PATH$signalSemaphoreCount);
    public static final long OFFSET$pSignalSemaphores = LAYOUT.byteOffset(PATH$pSignalSemaphores);
}
