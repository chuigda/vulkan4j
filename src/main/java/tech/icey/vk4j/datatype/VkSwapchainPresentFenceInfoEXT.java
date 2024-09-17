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
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSwapchainPresentFenceInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pFences")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("swapchainCount");
    public static final PathElement PATH$pFences = PathElement.groupElement("pFences");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pFences = (AddressLayout) LAYOUT.select(PATH$pFences);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pFences = LAYOUT.byteOffset(PATH$pFences);

    public VkSwapchainPresentFenceInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_PRESENT_FENCE_INFO_EXT);
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

    public @unsigned int swapchainCount() {
        return segment.get(LAYOUT$swapchainCount, OFFSET$swapchainCount);
    }

    public void swapchainCount(@unsigned int value) {
        segment.set(LAYOUT$swapchainCount, OFFSET$swapchainCount, value);
    }

    public @pointer(comment="VkFence*") MemorySegment pFencesRaw() {
        return segment.get(LAYOUT$pFences, OFFSET$pFences);
    }

    public void pFencesRaw(@pointer(comment="VkFence*") MemorySegment value) {
        segment.set(LAYOUT$pFences, OFFSET$pFences, value);
    }
    
    public @nullable VkFence pFences() {
        MemorySegment s = pFencesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkFence(s);
    }

    public void pFences(@nullable VkFence value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFencesRaw(s);
    }


    public static final class VkSwapchainPresentFenceInfoEXTFactory implements IFactory<VkSwapchainPresentFenceInfoEXT> {
        @Override
        public Class<VkSwapchainPresentFenceInfoEXT> clazz() {
            return VkSwapchainPresentFenceInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSwapchainPresentFenceInfoEXT.LAYOUT;
        }

        @Override
        public VkSwapchainPresentFenceInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSwapchainPresentFenceInfoEXT createUninit(MemorySegment segment) {
            return new VkSwapchainPresentFenceInfoEXT(segment);
        }
    }

    public static final VkSwapchainPresentFenceInfoEXTFactory FACTORY = new VkSwapchainPresentFenceInfoEXTFactory();
}
