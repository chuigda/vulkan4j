package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkImageSwapchainCreateInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("swapchain")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchain = PathElement.groupElement("swapchain");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$swapchain = (AddressLayout) LAYOUT.select(PATH$swapchain);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchain = LAYOUT.byteOffset(PATH$swapchain);

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

    public VkSwapchainKHR swapchain() {
        return new VkSwapchainKHR(segment.asSlice(OFFSET$swapchain, LAYOUT$swapchain));
    }

    public void swapchain(VkSwapchainKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$swapchain, LAYOUT$swapchain.byteSize());
    }


    public static final class Factory implements IFactory<VkImageSwapchainCreateInfoKHR> {
        @Override
        public Class<VkImageSwapchainCreateInfoKHR> clazz() {
            return VkImageSwapchainCreateInfoKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkImageSwapchainCreateInfoKHR.LAYOUT;
        }

        @Override
        public VkImageSwapchainCreateInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImageSwapchainCreateInfoKHR createUninit(MemorySegment segment) {
            return new VkImageSwapchainCreateInfoKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
