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

public record VkPresentRegionsKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("swapchainCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPresentRegionKHR.LAYOUT).withName("pRegions")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$swapchainCount = PathElement.groupElement(2);
    public static final PathElement PATH$pRegions = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$swapchainCount = (OfInt) LAYOUT.select(PATH$swapchainCount);
    public static final AddressLayout LAYOUT$pRegions = (AddressLayout) LAYOUT.select(PATH$pRegions);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainCount = LAYOUT.byteOffset(PATH$swapchainCount);
    public static final long OFFSET$pRegions = LAYOUT.byteOffset(PATH$pRegions);

    public VkPresentRegionsKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PRESENT_REGIONS_KHR);
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

    public @pointer(comment="VkPresentRegionKHR*") MemorySegment pRegionsRaw() {
        return segment.get(LAYOUT$pRegions, OFFSET$pRegions);
    }

    public void pRegionsRaw(@pointer(comment="VkPresentRegionKHR*") MemorySegment value) {
        segment.set(LAYOUT$pRegions, OFFSET$pRegions, value);
    }
    
    public VkPresentRegionKHR pRegions() {
        MemorySegment s = pRegionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPresentRegionKHR(s);
    }

    public void pRegions(VkPresentRegionKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRegionsRaw(s);
    }


    public static final class VkPresentRegionsKHRFactory implements IDataTypeFactory<VkPresentRegionsKHR> {
        @Override
        public Class<VkPresentRegionsKHR> clazz() {
            return VkPresentRegionsKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPresentRegionsKHR.LAYOUT;
        }

        @Override
        public VkPresentRegionsKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPresentRegionsKHR createUninit(MemorySegment segment) {
            return new VkPresentRegionsKHR(segment);
        }
    }

    public static final VkPresentRegionsKHRFactory FACTORY = new VkPresentRegionsKHRFactory();
}