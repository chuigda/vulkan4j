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

/// {@snippet lang=c :
/// typedef struct VkPresentInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t waitSemaphoreCount;
///     const VkSemaphore* pWaitSemaphores;
///     uint32_t swapchainCount;
///     const VkSwapchainKHR* pSwapchains;
///     const uint32_t* pImageIndices;
///     VkResult* pResults;
/// } VkPresentInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPresentInfoKHR.html">VkPresentInfoKHR</a>
public record VkPresentInfoKHR(MemorySegment segment) implements IPointer {
    public VkPresentInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PRESENT_INFO_KHR);
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

    public @unsigned int swapchainCount() {
        return segment.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);
    }

    public void swapchainCount(@unsigned int value) {
        segment.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);
    }

    public @pointer(comment="VkSwapchainKHR") MemorySegment pSwapchainsRaw() {
        return segment.get(LAYOUT$pSwapchains, OFFSET$pSwapchains);
    }

    public void pSwapchainsRaw(@pointer(comment="VkSwapchainKHR") MemorySegment value) {
        segment.set(LAYOUT$pSwapchains, OFFSET$pSwapchains, value);
    }

    /// Note: the returned {@link VkSwapchainKHR.Buffer} does not have correct
    /// {@link VkSwapchainKHR.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkSwapchainKHR.Buffer#reinterpret} to set the size before actually
    /// {@link VkSwapchainKHR.Buffer#read}ing or {@link VkSwapchainKHR.Buffer#write}ing
    /// the buffer.
    public @nullable VkSwapchainKHR.Buffer pSwapchains() {
        MemorySegment s = pSwapchainsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSwapchainKHR.Buffer(s);
    }

    public void pSwapchains(@nullable VkSwapchainKHR.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSwapchainsRaw(s);
    }

    public @pointer(comment="uint32_t*") MemorySegment pImageIndicesRaw() {
        return segment.get(LAYOUT$pImageIndices, OFFSET$pImageIndices);
    }

    public void pImageIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pImageIndices, OFFSET$pImageIndices, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or
    /// {@link IntBuffer#write}ing the buffer.
    public @nullable @unsigned IntBuffer pImageIndices() {
        MemorySegment s = pImageIndicesRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pImageIndices(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageIndicesRaw(s);
    }

    public @pointer(target=VkResult.class) MemorySegment pResultsRaw() {
        return segment.get(LAYOUT$pResults, OFFSET$pResults);
    }

    public void pResultsRaw(@pointer(target=VkResult.class) MemorySegment value) {
        segment.set(LAYOUT$pResults, OFFSET$pResults, value);
    }

    /// Note: the returned {@link IntBuffer} does not have correct
    /// {@link IntBuffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntBuffer#reinterpret} to set the size before actually
    /// {@link IntBuffer#read}ing or {@link IntBuffer#write}ing
    /// the buffer.
    public @nullable @enumtype(VkResult.class) IntBuffer pResults() {
        MemorySegment s = pResultsRaw();
        if (s.address() == 0) {
            return null;
        }
        
        return new IntBuffer(s);
    }

    public void pResults(@nullable @enumtype(VkResult.class) IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pResultsRaw(s);
    }

    public static VkPresentInfoKHR allocate(Arena arena) {
        return new VkPresentInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPresentInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPresentInfoKHR[] ret = new VkPresentInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPresentInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("waitSemaphoreCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pWaitSemaphores"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pSwapchains"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pImageIndices"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pResults")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$waitSemaphoreCount = PathElement.groupElement("waitSemaphoreCount");
    public static final PathElement PATH$pWaitSemaphores = PathElement.groupElement("pWaitSemaphores");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("swapchainCount");
    public static final PathElement PATH$pSwapchains = PathElement.groupElement("pSwapchains");
    public static final PathElement PATH$pImageIndices = PathElement.groupElement("pImageIndices");
    public static final PathElement PATH$pResults = PathElement.groupElement("pResults");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$waitSemaphoreCount = (OfInt) LAYOUT.select(PATH$waitSemaphoreCount);
    public static final AddressLayout LAYOUT$pWaitSemaphores = (AddressLayout) LAYOUT.select(PATH$pWaitSemaphores);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pSwapchains = (AddressLayout) LAYOUT.select(PATH$pSwapchains);
    public static final AddressLayout LAYOUT$pImageIndices = (AddressLayout) LAYOUT.select(PATH$pImageIndices);
    public static final AddressLayout LAYOUT$pResults = (AddressLayout) LAYOUT.select(PATH$pResults);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$waitSemaphoreCount = LAYOUT.byteOffset(PATH$waitSemaphoreCount);
    public static final long OFFSET$pWaitSemaphores = LAYOUT.byteOffset(PATH$pWaitSemaphores);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pSwapchains = LAYOUT.byteOffset(PATH$pSwapchains);
    public static final long OFFSET$pImageIndices = LAYOUT.byteOffset(PATH$pImageIndices);
    public static final long OFFSET$pResults = LAYOUT.byteOffset(PATH$pResults);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$waitSemaphoreCount = LAYOUT$waitSemaphoreCount.byteSize();
    public static final long SIZE$pWaitSemaphores = LAYOUT$pWaitSemaphores.byteSize();
    public static final long SIZE$swapchainCount = LAYOUT$swapchainCount.byteSize();
    public static final long SIZE$pSwapchains = LAYOUT$pSwapchains.byteSize();
    public static final long SIZE$pImageIndices = LAYOUT$pImageIndices.byteSize();
    public static final long SIZE$pResults = LAYOUT$pResults.byteSize();
}
