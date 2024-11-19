package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkAcquireNextImageInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkSwapchainKHR swapchain;
///     uint64_t timeout;
///     VkSemaphore semaphore;
///     VkFence fence;
///     uint32_t deviceMask;
/// } VkAcquireNextImageInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAcquireNextImageInfoKHR.html">VkAcquireNextImageInfoKHR</a>
public record VkAcquireNextImageInfoKHR(MemorySegment segment) implements IPointer {
    public VkAcquireNextImageInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ACQUIRE_NEXT_IMAGE_INFO_KHR);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @Nullable VkSwapchainKHR swapchain() {
        MemorySegment s = segment.get(LAYOUT$swapchain, OFFSET$swapchain);
        if (s.address() == 0) {
            return null;
        }
        return new VkSwapchainKHR(s);
    }

    public void swapchain(@Nullable VkSwapchainKHR value) {
        segment.set(
            LAYOUT$swapchain,
            OFFSET$swapchain,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned long timeout() {
        return segment.get(LAYOUT$timeout, OFFSET$timeout);
    }

    public void timeout(@unsigned long value) {
        segment.set(LAYOUT$timeout, OFFSET$timeout, value);
    }

    public @Nullable VkSemaphore semaphore() {
        MemorySegment s = segment.get(LAYOUT$semaphore, OFFSET$semaphore);
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void semaphore(@Nullable VkSemaphore value) {
        segment.set(
            LAYOUT$semaphore,
            OFFSET$semaphore,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @Nullable VkFence fence() {
        MemorySegment s = segment.get(LAYOUT$fence, OFFSET$fence);
        if (s.address() == 0) {
            return null;
        }
        return new VkFence(s);
    }

    public void fence(@Nullable VkFence value) {
        segment.set(
            LAYOUT$fence,
            OFFSET$fence,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int deviceMask() {
        return segment.get(LAYOUT$deviceMask, OFFSET$deviceMask);
    }

    public void deviceMask(@unsigned int value) {
        segment.set(LAYOUT$deviceMask, OFFSET$deviceMask, value);
    }

    public static VkAcquireNextImageInfoKHR allocate(Arena arena) {
        return new VkAcquireNextImageInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkAcquireNextImageInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAcquireNextImageInfoKHR[] ret = new VkAcquireNextImageInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAcquireNextImageInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAcquireNextImageInfoKHR clone(Arena arena, VkAcquireNextImageInfoKHR src) {
        VkAcquireNextImageInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAcquireNextImageInfoKHR[] clone(Arena arena, VkAcquireNextImageInfoKHR[] src) {
        VkAcquireNextImageInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("swapchain"),
        ValueLayout.JAVA_LONG.withName("timeout"),
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.ADDRESS.withName("fence"),
        ValueLayout.JAVA_INT.withName("deviceMask")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchain = PathElement.groupElement("swapchain");
    public static final PathElement PATH$timeout = PathElement.groupElement("timeout");
    public static final PathElement PATH$semaphore = PathElement.groupElement("semaphore");
    public static final PathElement PATH$fence = PathElement.groupElement("fence");
    public static final PathElement PATH$deviceMask = PathElement.groupElement("deviceMask");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$swapchain = (AddressLayout) LAYOUT.select(PATH$swapchain);
    public static final OfLong LAYOUT$timeout = (OfLong) LAYOUT.select(PATH$timeout);
    public static final AddressLayout LAYOUT$semaphore = (AddressLayout) LAYOUT.select(PATH$semaphore);
    public static final AddressLayout LAYOUT$fence = (AddressLayout) LAYOUT.select(PATH$fence);
    public static final OfInt LAYOUT$deviceMask = (OfInt) LAYOUT.select(PATH$deviceMask);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchain = LAYOUT.byteOffset(PATH$swapchain);
    public static final long OFFSET$timeout = LAYOUT.byteOffset(PATH$timeout);
    public static final long OFFSET$semaphore = LAYOUT.byteOffset(PATH$semaphore);
    public static final long OFFSET$fence = LAYOUT.byteOffset(PATH$fence);
    public static final long OFFSET$deviceMask = LAYOUT.byteOffset(PATH$deviceMask);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchain = LAYOUT$swapchain.byteSize();
    public static final long SIZE$timeout = LAYOUT$timeout.byteSize();
    public static final long SIZE$semaphore = LAYOUT$semaphore.byteSize();
    public static final long SIZE$fence = LAYOUT$fence.byteSize();
    public static final long SIZE$deviceMask = LAYOUT$deviceMask.byteSize();
}
