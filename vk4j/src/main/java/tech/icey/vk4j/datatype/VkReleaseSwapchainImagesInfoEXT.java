package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkReleaseSwapchainImagesInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("swapchain"),
        ValueLayout.JAVA_INT.withName("imageIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pImageIndices")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchain = PathElement.groupElement("swapchain");
    public static final PathElement PATH$imageIndexCount = PathElement.groupElement("imageIndexCount");
    public static final PathElement PATH$pImageIndices = PathElement.groupElement("pImageIndices");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$swapchain = (AddressLayout) LAYOUT.select(PATH$swapchain);
    public static final OfInt LAYOUT$imageIndexCount = (OfInt) LAYOUT.select(PATH$imageIndexCount);
    public static final AddressLayout LAYOUT$pImageIndices = (AddressLayout) LAYOUT.select(PATH$pImageIndices);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchain = LAYOUT.byteOffset(PATH$swapchain);
    public static final long OFFSET$imageIndexCount = LAYOUT.byteOffset(PATH$imageIndexCount);
    public static final long OFFSET$pImageIndices = LAYOUT.byteOffset(PATH$pImageIndices);

    public VkReleaseSwapchainImagesInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RELEASE_SWAPCHAIN_IMAGES_INFO_EXT);
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
        return new VkSwapchainKHR(segment.get(LAYOUT$swapchain, OFFSET$swapchain));
    }

    public void swapchain(VkSwapchainKHR value) {
        segment.set(LAYOUT$swapchain, OFFSET$swapchain, value.segment());
    }

    public @unsigned int imageIndexCount() {
        return segment.get(LAYOUT$imageIndexCount, OFFSET$imageIndexCount);
    }

    public void imageIndexCount(@unsigned int value) {
        segment.set(LAYOUT$imageIndexCount, OFFSET$imageIndexCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pImageIndicesRaw() {
        return segment.get(LAYOUT$pImageIndices, OFFSET$pImageIndices);
    }

    public void pImageIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pImageIndices, OFFSET$pImageIndices, value);
    }
    
    public @unsigned IntBuffer pImageIndices() {
        return new IntBuffer(pImageIndicesRaw());
    }

    public void pImageIndices(@unsigned IntBuffer value) {
        pImageIndicesRaw(value.segment());
    }

    public static VkReleaseSwapchainImagesInfoEXT allocate(Arena arena) {
        return new VkReleaseSwapchainImagesInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkReleaseSwapchainImagesInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkReleaseSwapchainImagesInfoEXT[] ret = new VkReleaseSwapchainImagesInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkReleaseSwapchainImagesInfoEXT(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
