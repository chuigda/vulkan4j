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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAcquireNextImageInfoKHR.html">VkAcquireNextImageInfoKHR</a>
@ValueBasedCandidate
public record VkAcquireNextImageInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$swapchain = ValueLayout.ADDRESS.withName("swapchain");
    public static final OfLong LAYOUT$timeout = ValueLayout.JAVA_LONG.withName("timeout");
    public static final AddressLayout LAYOUT$semaphore = ValueLayout.ADDRESS.withName("semaphore");
    public static final AddressLayout LAYOUT$fence = ValueLayout.ADDRESS.withName("fence");
    public static final OfInt LAYOUT$deviceMask = ValueLayout.JAVA_INT.withName("deviceMask");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$swapchain, LAYOUT$timeout, LAYOUT$semaphore, LAYOUT$fence, LAYOUT$deviceMask);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAcquireNextImageInfoKHR allocate(Arena arena) {
        return new VkAcquireNextImageInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkAcquireNextImageInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAcquireNextImageInfoKHR[] ret = new VkAcquireNextImageInfoKHR[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$swapchain = PathElement.groupElement("PATH$swapchain");
    public static final PathElement PATH$timeout = PathElement.groupElement("PATH$timeout");
    public static final PathElement PATH$semaphore = PathElement.groupElement("PATH$semaphore");
    public static final PathElement PATH$fence = PathElement.groupElement("PATH$fence");
    public static final PathElement PATH$deviceMask = PathElement.groupElement("PATH$deviceMask");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchain = LAYOUT$swapchain.byteSize();
    public static final long SIZE$timeout = LAYOUT$timeout.byteSize();
    public static final long SIZE$semaphore = LAYOUT$semaphore.byteSize();
    public static final long SIZE$fence = LAYOUT$fence.byteSize();
    public static final long SIZE$deviceMask = LAYOUT$deviceMask.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchain = LAYOUT.byteOffset(PATH$swapchain);
    public static final long OFFSET$timeout = LAYOUT.byteOffset(PATH$timeout);
    public static final long OFFSET$semaphore = LAYOUT.byteOffset(PATH$semaphore);
    public static final long OFFSET$fence = LAYOUT.byteOffset(PATH$fence);
    public static final long OFFSET$deviceMask = LAYOUT.byteOffset(PATH$deviceMask);

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

    public @Nullable VkSwapchainKHR swapchain() {
        MemorySegment s = segment.asSlice(OFFSET$swapchain, SIZE$swapchain);
        if (s.address() == 0) {
            return null;
        }
        return new VkSwapchainKHR(s);
    }

    public void swapchain() {
        segment.set(LAYOUT$swapchain, OFFSET$swapchain, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long timeout() {
        return segment.get(LAYOUT$timeout, OFFSET$timeout);
    }

    public void timeout(@unsigned long value) {
        segment.set(LAYOUT$timeout, OFFSET$timeout, value);
    }

    public @Nullable VkSemaphore semaphore() {
        MemorySegment s = segment.asSlice(OFFSET$semaphore, SIZE$semaphore);
        if (s.address() == 0) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void semaphore() {
        segment.set(LAYOUT$semaphore, OFFSET$semaphore, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkFence fence() {
        MemorySegment s = segment.asSlice(OFFSET$fence, SIZE$fence);
        if (s.address() == 0) {
            return null;
        }
        return new VkFence(s);
    }

    public void fence() {
        segment.set(LAYOUT$fence, OFFSET$fence, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int deviceMask() {
        return segment.get(LAYOUT$deviceMask, OFFSET$deviceMask);
    }

    public void deviceMask(@unsigned int value) {
        segment.set(LAYOUT$deviceMask, OFFSET$deviceMask, value);
    }

}
