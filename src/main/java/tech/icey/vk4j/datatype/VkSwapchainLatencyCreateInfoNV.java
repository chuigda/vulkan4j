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

public record VkSwapchainLatencyCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("latencyModeEnable")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$latencyModeEnable = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$latencyModeEnable = (OfInt) LAYOUT.select(PATH$latencyModeEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$latencyModeEnable = LAYOUT.byteOffset(PATH$latencyModeEnable);

    public VkSwapchainLatencyCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_LATENCY_CREATE_INFO_NV);
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

    public @unsigned int latencyModeEnable() {
        return segment.get(LAYOUT$latencyModeEnable, OFFSET$latencyModeEnable);
    }

    public void latencyModeEnable(@unsigned int value) {
        segment.set(LAYOUT$latencyModeEnable, OFFSET$latencyModeEnable, value);
    }


    public static final class VkSwapchainLatencyCreateInfoNVFactory implements IDataTypeFactory<VkSwapchainLatencyCreateInfoNV> {
        @Override
        public Class<VkSwapchainLatencyCreateInfoNV> clazz() {
            return VkSwapchainLatencyCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSwapchainLatencyCreateInfoNV.LAYOUT;
        }

        @Override
        public VkSwapchainLatencyCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSwapchainLatencyCreateInfoNV createUninit(MemorySegment segment) {
            return new VkSwapchainLatencyCreateInfoNV(segment);
        }
    }

    public static final VkSwapchainLatencyCreateInfoNVFactory FACTORY = new VkSwapchainLatencyCreateInfoNVFactory();
}