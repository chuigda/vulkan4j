package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IDataTypeFactory;
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

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$swapchain = PathElement.groupElement(2);
    public static final PathElement PATH$imageIndexCount = PathElement.groupElement(3);
    public static final PathElement PATH$pImageIndices = PathElement.groupElement(4);

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
        return new VkSwapchainKHR(segment.asSlice(OFFSET$swapchain, LAYOUT$swapchain));
    }

    public void swapchain(VkSwapchainKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$swapchain, LAYOUT$swapchain.byteSize());
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
    
    public @unsigned IntPtr pImageIndices() {
        return new IntPtr(pImageIndicesRaw());
    }

    public void pImageIndices(@unsigned IntPtr value) {
        pImageIndicesRaw(value.segment());
    }


    public static final class VkReleaseSwapchainImagesInfoEXTFactory implements IDataTypeFactory<VkReleaseSwapchainImagesInfoEXT> {
        @Override
        public Class<VkReleaseSwapchainImagesInfoEXT> clazz() {
            return VkReleaseSwapchainImagesInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkReleaseSwapchainImagesInfoEXT.LAYOUT;
        }

        @Override
        public VkReleaseSwapchainImagesInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkReleaseSwapchainImagesInfoEXT createUninit(MemorySegment segment) {
            return new VkReleaseSwapchainImagesInfoEXT(segment);
        }
    }

    public static final VkReleaseSwapchainImagesInfoEXTFactory FACTORY = new VkReleaseSwapchainImagesInfoEXTFactory();
}