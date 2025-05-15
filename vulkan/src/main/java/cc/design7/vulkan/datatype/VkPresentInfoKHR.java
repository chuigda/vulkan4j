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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentInfoKHR.html"><code>VkPresentInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPresentInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint32_t waitSemaphoreCount; // optional
///     VkSemaphore const* pWaitSemaphores;
///     uint32_t swapchainCount;
///     VkSwapchainKHR const* pSwapchains;
///     uint32_t const* pImageIndices;
///     VkResult* pResults; // optional
/// } VkPresentInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PRESENT_INFO_KHR`
///
/// The {@link VkPresentInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPresentInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPresentInfoKHR.html"><code>VkPresentInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPresentInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPresentInfoKHR allocate(Arena arena) {
        VkPresentInfoKHR ret = new VkPresentInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PRESENT_INFO_KHR);
        return ret;
    }

    public static VkPresentInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentInfoKHR[] ret = new VkPresentInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPresentInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PRESENT_INFO_KHR);
        }
        return ret;
    }

    public static VkPresentInfoKHR clone(Arena arena, VkPresentInfoKHR src) {
        VkPresentInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPresentInfoKHR[] clone(Arena arena, VkPresentInfoKHR[] src) {
        VkPresentInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PRESENT_INFO_KHR);
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
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSemaphore.Buffer(s);
    }


    public @unsigned int swapchainCount() {
        return segment.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);
    }

    public void swapchainCount(@unsigned int value) {
        segment.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);
    }

    public @pointer(comment="VkSwapchainKHR*") MemorySegment pSwapchainsRaw() {
        return segment.get(LAYOUT$pSwapchains, OFFSET$pSwapchains);
    }

    public void pSwapchainsRaw(@pointer(comment="VkSwapchainKHR*") MemorySegment value) {
        segment.set(LAYOUT$pSwapchains, OFFSET$pSwapchains, value);
    }

    /// Note: the returned {@link VkSwapchainKHR.Buffer} does not have correct {@link VkSwapchainKHR.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkSwapchainKHR.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkSwapchainKHR.Buffer pSwapchains() {
        MemorySegment s = pSwapchainsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSwapchainKHR.Buffer(s);
    }


    public @pointer(comment="int*") MemorySegment pImageIndicesRaw() {
        return segment.get(LAYOUT$pImageIndices, OFFSET$pImageIndices);
    }

    public void pImageIndicesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pImageIndices, OFFSET$pImageIndices, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pImageIndices() {
        MemorySegment s = pImageIndicesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pImageIndices(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageIndicesRaw(s);
    }

    public @pointer(target=VkResult.class) MemorySegment pResultsRaw() {
        return segment.get(LAYOUT$pResults, OFFSET$pResults);
    }

    public void pResultsRaw(@pointer(target=VkResult.class) MemorySegment value) {
        segment.set(LAYOUT$pResults, OFFSET$pResults, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @enumtype(VkResult.class) IntPtr pResults() {
        MemorySegment s = pResultsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pResults(@Nullable @enumtype(VkResult.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pResultsRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pWaitSemaphores"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSwapchains"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pImageIndices"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pResults")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$waitSemaphoreCount = PathElement.groupElement("PATH$waitSemaphoreCount");
    public static final PathElement PATH$pWaitSemaphores = PathElement.groupElement("PATH$pWaitSemaphores");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("PATH$swapchainCount");
    public static final PathElement PATH$pSwapchains = PathElement.groupElement("PATH$pSwapchains");
    public static final PathElement PATH$pImageIndices = PathElement.groupElement("PATH$pImageIndices");
    public static final PathElement PATH$pResults = PathElement.groupElement("PATH$pResults");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreCount);
    public static final AddressLayout LAYOUT$pWaitSemaphores = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphores);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pSwapchains = (AddressLayout) LAYOUT.select(PATH$pSwapchains);
    public static final AddressLayout LAYOUT$pImageIndices = (AddressLayout) LAYOUT.select(PATH$pImageIndices);
    public static final AddressLayout LAYOUT$pResults = (AddressLayout) LAYOUT.select(PATH$pResults);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$waitSemaphoreCount = LAYOUT$waitSemaphoreCount.byteSize();
    public static final long SIZE$pWaitSemaphores = LAYOUT$pWaitSemaphores.byteSize();
    public static final long SIZE$swapchainCount = LAYOUT$swapchainCount.byteSize();
    public static final long SIZE$pSwapchains = LAYOUT$pSwapchains.byteSize();
    public static final long SIZE$pImageIndices = LAYOUT$pImageIndices.byteSize();
    public static final long SIZE$pResults = LAYOUT$pResults.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreCount = LAYOUT.byteOffset(PATH$waitSemaphoreCount);
    public static final long OFFSET$pWaitSemaphores = LAYOUT.byteOffset(PATH$pWaitSemaphores);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pSwapchains = LAYOUT.byteOffset(PATH$pSwapchains);
    public static final long OFFSET$pImageIndices = LAYOUT.byteOffset(PATH$pImageIndices);
    public static final long OFFSET$pResults = LAYOUT.byteOffset(PATH$pResults);
}
