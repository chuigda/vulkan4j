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

public record VkImageSwapchainCreateInfoKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("swapchain")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchain = PathElement.groupElement("swapchain");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$swapchain = (AddressLayout) LAYOUT.select(PATH$swapchain);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchain = LAYOUT.byteOffset(PATH$swapchain);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchain = LAYOUT$swapchain.byteSize();

    public VkImageSwapchainCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_SWAPCHAIN_CREATE_INFO_KHR);
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

    public VkSwapchainKHR swapchain() {
        return new VkSwapchainKHR(segment.get(LAYOUT$swapchain, OFFSET$swapchain));
    }

    public void swapchain(VkSwapchainKHR value) {
        segment.set(LAYOUT$swapchain, OFFSET$swapchain, value.segment());
    }

    public static VkImageSwapchainCreateInfoKHR allocate(Arena arena) {
        return new VkImageSwapchainCreateInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkImageSwapchainCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageSwapchainCreateInfoKHR[] ret = new VkImageSwapchainCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageSwapchainCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
