package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkBindImageMemorySwapchainInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageIndex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchain = PathElement.groupElement("swapchain");
    public static final PathElement PATH$imageIndex = PathElement.groupElement("imageIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$swapchain = (AddressLayout) LAYOUT.select(PATH$swapchain);
    public static final OfInt LAYOUT$imageIndex = (OfInt) LAYOUT.select(PATH$imageIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchain = LAYOUT.byteOffset(PATH$swapchain);
    public static final long OFFSET$imageIndex = LAYOUT.byteOffset(PATH$imageIndex);

    public VkBindImageMemorySwapchainInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_SWAPCHAIN_INFO_KHR);
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

    public @unsigned int imageIndex() {
        return segment.get(LAYOUT$imageIndex, OFFSET$imageIndex);
    }

    public void imageIndex(@unsigned int value) {
        segment.set(LAYOUT$imageIndex, OFFSET$imageIndex, value);
    }


    public static final class Factory implements IFactory<VkBindImageMemorySwapchainInfoKHR> {
        @Override
        public Class<VkBindImageMemorySwapchainInfoKHR> clazz() {
            return VkBindImageMemorySwapchainInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBindImageMemorySwapchainInfoKHR.LAYOUT;
        }

        @Override
        public VkBindImageMemorySwapchainInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkBindImageMemorySwapchainInfoKHR createUninit(MemorySegment segment) {
            return new VkBindImageMemorySwapchainInfoKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
