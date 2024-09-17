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

public record VkPresentIdKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pPresentIds")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$swapchainCount = PathElement.groupElement("swapchainCount");
    public static final PathElement PATH$pPresentIds = PathElement.groupElement("pPresentIds");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pPresentIds = (AddressLayout) LAYOUT.select(PATH$pPresentIds);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pPresentIds = LAYOUT.byteOffset(PATH$pPresentIds);

    public VkPresentIdKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PRESENT_ID_KHR);
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

    public @pointer(comment="uint64_t*") MemorySegment pPresentIdsRaw() {
        return segment.get(LAYOUT$pPresentIds, OFFSET$pPresentIds);
    }

    public void pPresentIdsRaw(@pointer(comment="uint64_t*") MemorySegment value) {
        segment.set(LAYOUT$pPresentIds, OFFSET$pPresentIds, value);
    }
    
    public @unsigned LongPtr pPresentIds() {
        return new LongPtr(pPresentIdsRaw());
    }

    public void pPresentIds(@unsigned LongPtr value) {
        pPresentIdsRaw(value.segment());
    }


    public static final class VkPresentIdKHRFactory implements IFactory<VkPresentIdKHR> {
        @Override
        public Class<VkPresentIdKHR> clazz() {
            return VkPresentIdKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPresentIdKHR.LAYOUT;
        }

        @Override
        public VkPresentIdKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPresentIdKHR createUninit(MemorySegment segment) {
            return new VkPresentIdKHR(segment);
        }
    }

    public static final VkPresentIdKHRFactory FACTORY = new VkPresentIdKHRFactory();
}
